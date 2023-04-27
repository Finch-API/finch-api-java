package org.finch.api.services.async.ats

import java.util.concurrent.CompletableFuture
import org.finch.api.core.ClientOptions
import org.finch.api.core.RequestOptions
import org.finch.api.core.http.HttpMethod
import org.finch.api.core.http.HttpRequest
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.models.AtsStageListPageAsync
import org.finch.api.models.AtsStageListParams
import org.finch.api.models.Stage
import org.finch.api.services.errorHandler
import org.finch.api.services.jsonHandler
import org.finch.api.services.withErrorHandler

class StageServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : StageServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<List<Stage>> =
        jsonHandler<List<Stage>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Get all job stages for an organization. Depending on the system, some jobs may have stages
     * specific to that job. Other job stages may apply broadly to all jobs in the system. Use the
     * `job_id` to determine whether a job applies specifically to a job.
     */
    override fun list(
        params: AtsStageListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AtsStageListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ats", "stages")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let { AtsStageListPageAsync.Response.Builder().items(it).build() }
                .let { AtsStageListPageAsync.of(this, params, it) }
        }
    }
}

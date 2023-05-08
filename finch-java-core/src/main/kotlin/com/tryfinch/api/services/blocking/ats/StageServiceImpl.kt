package com.tryfinch.api.services.blocking.ats

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.AtStageListPage
import com.tryfinch.api.models.AtStageListParams
import com.tryfinch.api.models.Stage
import com.tryfinch.api.services.errorHandler
import com.tryfinch.api.services.jsonHandler
import com.tryfinch.api.services.withErrorHandler

class StageServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : StageService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<List<Stage>> =
        jsonHandler<List<Stage>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Get all job stages for an organization. Depending on the system, some jobs may have stages
     * specific to that job. Other job stages may apply broadly to all jobs in the system. Use the
     * `job_id` to determine whether a job applies specifically to a job.
     */
    override fun list(params: AtStageListParams, requestOptions: RequestOptions): AtStageListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ats", "stages")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let { AtStageListPage.Response.Builder().items(it).build() }
                .let { AtStageListPage.of(this, params, it) }
        }
    }
}

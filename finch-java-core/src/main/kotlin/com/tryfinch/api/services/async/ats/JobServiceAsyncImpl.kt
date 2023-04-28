package com.tryfinch.api.services.async.ats

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.AtsJobListPageAsync
import com.tryfinch.api.models.AtsJobListParams
import com.tryfinch.api.models.AtsJobRetrieveParams
import com.tryfinch.api.models.Job
import com.tryfinch.api.services.errorHandler
import com.tryfinch.api.services.jsonHandler
import com.tryfinch.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class JobServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : JobServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Job> =
        jsonHandler<Job>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Gets a job from an organization. */
    override fun retrieve(
        params: AtsJobRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Job> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ats", "jobs", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<AtsJobListPageAsync.Response> =
        jsonHandler<AtsJobListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Gets all of an organization's jobs. */
    override fun list(
        params: AtsJobListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AtsJobListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ats", "jobs")
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
                        validate()
                    }
                }
                .let { AtsJobListPageAsync.of(this, params, it) }
        }
    }
}

package com.tryfinch.api.services.async.ats

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.Application
import com.tryfinch.api.models.AtApplicationListPageAsync
import com.tryfinch.api.models.AtApplicationListParams
import com.tryfinch.api.models.AtApplicationRetrieveParams
import com.tryfinch.api.services.errorHandler
import com.tryfinch.api.services.jsonHandler
import com.tryfinch.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class ApplicationServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ApplicationServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Application> =
        jsonHandler<Application>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Gets an application from an organization. */
    override fun retrieve(
        params: AtApplicationRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Application> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ats", "applications", params.getPathParam(0))
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

    private val listHandler: Handler<AtApplicationListPageAsync.Response> =
        jsonHandler<AtApplicationListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Gets all of an organization's applications. */
    override fun list(
        params: AtApplicationListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AtApplicationListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ats", "applications")
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
                .let { AtApplicationListPageAsync.of(this, params, it) }
        }
    }
}

package org.finch.api.services.async.ats

import java.util.concurrent.CompletableFuture
import org.finch.api.core.ClientOptions
import org.finch.api.core.RequestOptions
import org.finch.api.core.http.HttpMethod
import org.finch.api.core.http.HttpRequest
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.models.Application
import org.finch.api.models.AtsApplicationListPageAsync
import org.finch.api.models.AtsApplicationListParams
import org.finch.api.models.AtsApplicationRetrieveParams
import org.finch.api.services.errorHandler
import org.finch.api.services.jsonHandler
import org.finch.api.services.withErrorHandler

class ApplicationServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ApplicationServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Application> =
        jsonHandler<Application>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Gets an application from an organization. */
    override fun retrieve(
        params: AtsApplicationRetrieveParams,
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

    private val listHandler: Handler<AtsApplicationListPageAsync.Response> =
        jsonHandler<AtsApplicationListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Gets all of an organization's applications. */
    override fun list(
        params: AtsApplicationListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AtsApplicationListPageAsync> {
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
                .let { AtsApplicationListPageAsync.of(this, params, it) }
        }
    }
}

package org.finch.api.services.async

import java.util.concurrent.CompletableFuture
import org.finch.api.core.ClientOptions
import org.finch.api.core.RequestOptions
import org.finch.api.core.http.HttpMethod
import org.finch.api.core.http.HttpRequest
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.models.AccountDisconnectParams
import org.finch.api.models.AccountIntrospectParams
import org.finch.api.models.DisconnectResponse
import org.finch.api.models.Introspection
import org.finch.api.services.errorHandler
import org.finch.api.services.json
import org.finch.api.services.jsonHandler
import org.finch.api.services.withErrorHandler

class AccountServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : AccountServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val disconnectHandler: Handler<DisconnectResponse> =
        jsonHandler<DisconnectResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Disconnect an employer from your application and invalidate all `access_token`s associated
     * with the employer. We require applications to implement the Disconnect endpoint for billing
     * and security purposes.
     */
    override fun disconnect(
        params: AccountDisconnectParams,
        requestOptions: RequestOptions
    ): CompletableFuture<DisconnectResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("disconnect")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { disconnectHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val introspectHandler: Handler<Introspection> =
        jsonHandler<Introspection>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Read account information associated with an `access_token` */
    override fun introspect(
        params: AccountIntrospectParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Introspection> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("introspect")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { introspectHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.AccountDisconnectParams
import com.tryfinch.api.models.AccountIntrospectParams
import com.tryfinch.api.models.DisconnectResponse
import com.tryfinch.api.models.Introspection
import com.tryfinch.api.services.errorHandler
import com.tryfinch.api.services.json
import com.tryfinch.api.services.jsonHandler
import com.tryfinch.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

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
                .use { disconnectHandler.handle(it) }
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
                .use { introspectHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}

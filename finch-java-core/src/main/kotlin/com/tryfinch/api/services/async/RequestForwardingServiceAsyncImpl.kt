// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.json
import com.tryfinch.api.core.prepareAsync
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.RequestForwardingForwardParams
import com.tryfinch.api.models.RequestForwardingForwardResponse
import java.util.concurrent.CompletableFuture

class RequestForwardingServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : RequestForwardingServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val forwardHandler: Handler<RequestForwardingForwardResponse> =
        jsonHandler<RequestForwardingForwardResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * The Forward API allows you to make direct requests to an employment system. If Finch’s
     * unified API doesn’t have a data model that cleanly fits your needs, then Forward allows you
     * to push or pull data models directly against an integration’s API.
     */
    override fun forward(
        params: RequestForwardingForwardParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RequestForwardingForwardResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("forward")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { forwardHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}

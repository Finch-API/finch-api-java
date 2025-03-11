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
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.core.http.json
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepareAsync
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.RequestForwardingForwardParams
import com.tryfinch.api.models.RequestForwardingForwardResponse
import java.util.concurrent.CompletableFuture

class RequestForwardingServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : RequestForwardingServiceAsync {

    private val withRawResponse: RequestForwardingServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): RequestForwardingServiceAsync.WithRawResponse = withRawResponse

    override fun forward(params: RequestForwardingForwardParams, requestOptions: RequestOptions): CompletableFuture<RequestForwardingForwardResponse> =
        // post /forward
        withRawResponse().forward(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : RequestForwardingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

        private val forwardHandler: Handler<RequestForwardingForwardResponse> = jsonHandler<RequestForwardingForwardResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun forward(params: RequestForwardingForwardParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<RequestForwardingForwardResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("forward")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> response.parseable {
              response.use {
                  forwardHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }
    }
}

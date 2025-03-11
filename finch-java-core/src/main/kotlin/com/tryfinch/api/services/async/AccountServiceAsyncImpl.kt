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
import com.tryfinch.api.models.AccountDisconnectParams
import com.tryfinch.api.models.AccountIntrospectParams
import com.tryfinch.api.models.DisconnectResponse
import com.tryfinch.api.models.Introspection
import java.util.concurrent.CompletableFuture

class AccountServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : AccountServiceAsync {

    private val withRawResponse: AccountServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): AccountServiceAsync.WithRawResponse = withRawResponse

    override fun disconnect(params: AccountDisconnectParams, requestOptions: RequestOptions): CompletableFuture<DisconnectResponse> =
        // post /disconnect
        withRawResponse().disconnect(params, requestOptions).thenApply { it.parse() }

    override fun introspect(params: AccountIntrospectParams, requestOptions: RequestOptions): CompletableFuture<Introspection> =
        // get /introspect
        withRawResponse().introspect(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : AccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

        private val disconnectHandler: Handler<DisconnectResponse> = jsonHandler<DisconnectResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun disconnect(params: AccountDisconnectParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<DisconnectResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("disconnect")
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> response.parseable {
              response.use {
                  disconnectHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val introspectHandler: Handler<Introspection> = jsonHandler<Introspection>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun introspect(params: AccountIntrospectParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<Introspection>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("introspect")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> response.parseable {
              response.use {
                  introspectHandler.handle(it)
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

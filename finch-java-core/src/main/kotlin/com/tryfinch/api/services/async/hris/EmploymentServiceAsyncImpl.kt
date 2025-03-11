// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

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
import com.tryfinch.api.models.HrisEmploymentRetrieveManyPage
import com.tryfinch.api.models.HrisEmploymentRetrieveManyPageAsync
import com.tryfinch.api.models.HrisEmploymentRetrieveManyParams
import java.util.concurrent.CompletableFuture

class EmploymentServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : EmploymentServiceAsync {

    private val withRawResponse: EmploymentServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): EmploymentServiceAsync.WithRawResponse = withRawResponse

    override fun retrieveMany(params: HrisEmploymentRetrieveManyParams, requestOptions: RequestOptions): CompletableFuture<HrisEmploymentRetrieveManyPageAsync> =
        // post /employer/employment
        withRawResponse().retrieveMany(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : EmploymentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveManyHandler: Handler<HrisEmploymentRetrieveManyPageAsync.Response> = jsonHandler<HrisEmploymentRetrieveManyPageAsync.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieveMany(params: HrisEmploymentRetrieveManyParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<HrisEmploymentRetrieveManyPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("employer", "employment")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> response.parseable {
              response.use {
                  retrieveManyHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
              .let {
                  HrisEmploymentRetrieveManyPageAsync.of(EmploymentServiceAsyncImpl(clientOptions), params, it)
              }
          } }
        }
    }
}

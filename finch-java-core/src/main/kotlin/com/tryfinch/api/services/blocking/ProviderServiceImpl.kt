// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepare
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.Provider
import com.tryfinch.api.models.ProviderListPage
import com.tryfinch.api.models.ProviderListParams

class ProviderServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : ProviderService {

    private val withRawResponse: ProviderService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): ProviderService.WithRawResponse = withRawResponse

    override fun list(params: ProviderListParams, requestOptions: RequestOptions): ProviderListPage =
        // get /providers
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : ProviderService.WithRawResponse {

        private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<List<Provider>> = jsonHandler<List<Provider>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(params: ProviderListParams, requestOptions: RequestOptions): HttpResponseFor<ProviderListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("providers")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
              .let {
                  ProviderListPage.of(ProviderServiceImpl(clientOptions), params, ProviderListPage.Response.builder()
                      .items(it)
                      .build())
              }
          }
        }
    }
}

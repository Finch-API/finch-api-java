// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

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
import com.tryfinch.api.models.HrisPaymentListPage
import com.tryfinch.api.models.HrisPaymentListParams
import com.tryfinch.api.models.Payment

class PaymentServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : PaymentService {

    private val withRawResponse: PaymentService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): PaymentService.WithRawResponse = withRawResponse

    override fun list(params: HrisPaymentListParams, requestOptions: RequestOptions): HrisPaymentListPage =
        // get /employer/payment
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : PaymentService.WithRawResponse {

        private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<List<Payment>> = jsonHandler<List<Payment>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(params: HrisPaymentListParams, requestOptions: RequestOptions): HttpResponseFor<HrisPaymentListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("employer", "payment")
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
                  HrisPaymentListPage.of(PaymentServiceImpl(clientOptions), params, HrisPaymentListPage.Response.builder()
                      .items(it)
                      .build())
              }
          }
        }
    }
}

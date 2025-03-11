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
import com.tryfinch.api.core.http.json
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepare
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.HrisEmploymentRetrieveManyPage
import com.tryfinch.api.models.HrisEmploymentRetrieveManyParams

class EmploymentServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : EmploymentService {

    private val withRawResponse: EmploymentService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): EmploymentService.WithRawResponse = withRawResponse

    override fun retrieveMany(params: HrisEmploymentRetrieveManyParams, requestOptions: RequestOptions): HrisEmploymentRetrieveManyPage =
        // post /employer/employment
        withRawResponse().retrieveMany(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : EmploymentService.WithRawResponse {

        private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveManyHandler: Handler<HrisEmploymentRetrieveManyPage.Response> = jsonHandler<HrisEmploymentRetrieveManyPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieveMany(params: HrisEmploymentRetrieveManyParams, requestOptions: RequestOptions): HttpResponseFor<HrisEmploymentRetrieveManyPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("employer", "employment")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  retrieveManyHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
              .let {
                  HrisEmploymentRetrieveManyPage.of(EmploymentServiceImpl(clientOptions), params, it)
              }
          }
        }
    }
}

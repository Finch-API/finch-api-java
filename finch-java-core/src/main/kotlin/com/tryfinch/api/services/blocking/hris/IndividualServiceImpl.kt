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
import com.tryfinch.api.models.HrisIndividualRetrieveManyPage
import com.tryfinch.api.models.HrisIndividualRetrieveManyParams

class IndividualServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IndividualService {

    private val withRawResponse: IndividualService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IndividualService.WithRawResponse = withRawResponse

    override fun retrieveMany(
        params: HrisIndividualRetrieveManyParams,
        requestOptions: RequestOptions,
    ): HrisIndividualRetrieveManyPage =
        // post /employer/individual
        withRawResponse().retrieveMany(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IndividualService.WithRawResponse {

        private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveManyHandler: Handler<HrisIndividualRetrieveManyPage.Response> =
            jsonHandler<HrisIndividualRetrieveManyPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieveMany(
            params: HrisIndividualRetrieveManyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HrisIndividualRetrieveManyPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("employer", "individual")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveManyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        HrisIndividualRetrieveManyPage.of(
                            IndividualServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorBodyHandler
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.core.http.json
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepare
import com.tryfinch.api.models.HrisPayStatementRetrieveManyPage
import com.tryfinch.api.models.HrisPayStatementRetrieveManyPageResponse
import com.tryfinch.api.models.HrisPayStatementRetrieveManyParams
import java.util.function.Consumer

class PayStatementServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PayStatementService {

    private val withRawResponse: PayStatementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PayStatementService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PayStatementService =
        PayStatementServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveMany(
        params: HrisPayStatementRetrieveManyParams,
        requestOptions: RequestOptions,
    ): HrisPayStatementRetrieveManyPage =
        // post /employer/pay-statement
        withRawResponse().retrieveMany(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PayStatementService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PayStatementService.WithRawResponse =
            PayStatementServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveManyHandler: Handler<HrisPayStatementRetrieveManyPageResponse> =
            jsonHandler<HrisPayStatementRetrieveManyPageResponse>(clientOptions.jsonMapper)

        override fun retrieveMany(
            params: HrisPayStatementRetrieveManyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HrisPayStatementRetrieveManyPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("employer", "pay-statement")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveManyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        HrisPayStatementRetrieveManyPage.builder()
                            .service(PayStatementServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}

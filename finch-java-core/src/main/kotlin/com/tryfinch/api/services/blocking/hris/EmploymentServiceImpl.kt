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
import com.tryfinch.api.models.HrisEmploymentRetrieveManyPage
import com.tryfinch.api.models.HrisEmploymentRetrieveManyPageResponse
import com.tryfinch.api.models.HrisEmploymentRetrieveManyParams
import java.util.function.Consumer

class EmploymentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EmploymentService {

    private val withRawResponse: EmploymentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EmploymentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmploymentService =
        EmploymentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveMany(
        params: HrisEmploymentRetrieveManyParams,
        requestOptions: RequestOptions,
    ): HrisEmploymentRetrieveManyPage =
        // post /employer/employment
        withRawResponse().retrieveMany(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmploymentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmploymentService.WithRawResponse =
            EmploymentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveManyHandler: Handler<HrisEmploymentRetrieveManyPageResponse> =
            jsonHandler<HrisEmploymentRetrieveManyPageResponse>(clientOptions.jsonMapper)

        override fun retrieveMany(
            params: HrisEmploymentRetrieveManyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HrisEmploymentRetrieveManyPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("employer", "employment")
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
                        HrisEmploymentRetrieveManyPage.builder()
                            .service(EmploymentServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}

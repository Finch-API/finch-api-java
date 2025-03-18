// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

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
import com.tryfinch.api.models.IndividualUpdateResponse
import com.tryfinch.api.models.SandboxIndividualUpdateParams

class IndividualServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IndividualService {

    private val withRawResponse: IndividualService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IndividualService.WithRawResponse = withRawResponse

    override fun update(
        params: SandboxIndividualUpdateParams,
        requestOptions: RequestOptions,
    ): IndividualUpdateResponse =
        // put /sandbox/individual/{individual_id}
        withRawResponse().update(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IndividualService.WithRawResponse {

        private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

        private val updateHandler: Handler<IndividualUpdateResponse> =
            jsonHandler<IndividualUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: SandboxIndividualUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndividualUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("sandbox", "individual", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}

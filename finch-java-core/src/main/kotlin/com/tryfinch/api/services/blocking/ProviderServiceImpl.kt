// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

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
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepare
import com.tryfinch.api.models.Provider
import com.tryfinch.api.models.ProviderListPage
import com.tryfinch.api.models.ProviderListParams
import java.util.function.Consumer

class ProviderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProviderService {

    private val withRawResponse: ProviderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProviderService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProviderService =
        ProviderServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: ProviderListParams,
        requestOptions: RequestOptions,
    ): ProviderListPage =
        // get /providers
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProviderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProviderService.WithRawResponse =
            ProviderServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<Provider>> =
            jsonHandler<List<Provider>>(clientOptions.jsonMapper)

        override fun list(
            params: ProviderListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProviderListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("providers")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        ProviderListPage.builder()
                            .service(ProviderServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }
    }
}

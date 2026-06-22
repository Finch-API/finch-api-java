// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.SecurityOptions
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
import com.tryfinch.api.models.HrisPayStatementItemListPage
import com.tryfinch.api.models.HrisPayStatementItemListPageResponse
import com.tryfinch.api.models.HrisPayStatementItemListParams
import com.tryfinch.api.services.blocking.hris.payStatementItem.RuleService
import com.tryfinch.api.services.blocking.hris.payStatementItem.RuleServiceImpl
import java.util.function.Consumer

class PayStatementItemServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PayStatementItemService {

    private val withRawResponse: PayStatementItemService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val rules: RuleService by lazy { RuleServiceImpl(clientOptions) }

    override fun withRawResponse(): PayStatementItemService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PayStatementItemService =
        PayStatementItemServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun rules(): RuleService = rules

    override fun list(
        params: HrisPayStatementItemListParams,
        requestOptions: RequestOptions,
    ): HrisPayStatementItemListPage =
        // get /employer/pay-statement-item
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PayStatementItemService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val rules: RuleService.WithRawResponse by lazy {
            RuleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PayStatementItemService.WithRawResponse =
            PayStatementItemServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun rules(): RuleService.WithRawResponse = rules

        private val listHandler: Handler<HrisPayStatementItemListPageResponse> =
            jsonHandler<HrisPayStatementItemListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: HrisPayStatementItemListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HrisPayStatementItemListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("employer", "pay-statement-item")
                    .build()
                    .prepare(
                        clientOptions,
                        params,
                        SecurityOptions.builder().bearerAuth(true).build(),
                    )
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        HrisPayStatementItemListPage.builder()
                            .service(PayStatementItemServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}

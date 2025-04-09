// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris.company

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.JsonValue
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
import com.tryfinch.api.models.HrisCompanyPayStatementItemListPage
import com.tryfinch.api.models.HrisCompanyPayStatementItemListPageResponse
import com.tryfinch.api.models.HrisCompanyPayStatementItemListParams
import com.tryfinch.api.services.blocking.hris.company.payStatementItem.RuleService
import com.tryfinch.api.services.blocking.hris.company.payStatementItem.RuleServiceImpl

class PayStatementItemServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PayStatementItemService {

    private val withRawResponse: PayStatementItemService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val rules: RuleService by lazy { RuleServiceImpl(clientOptions) }

    override fun withRawResponse(): PayStatementItemService.WithRawResponse = withRawResponse

    override fun rules(): RuleService = rules

    override fun list(
        params: HrisCompanyPayStatementItemListParams,
        requestOptions: RequestOptions,
    ): HrisCompanyPayStatementItemListPage =
        // get /employer/pay-statement-item
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PayStatementItemService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val rules: RuleService.WithRawResponse by lazy {
            RuleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun rules(): RuleService.WithRawResponse = rules

        private val listHandler: Handler<HrisCompanyPayStatementItemListPageResponse> =
            jsonHandler<HrisCompanyPayStatementItemListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: HrisCompanyPayStatementItemListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HrisCompanyPayStatementItemListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("employer", "pay-statement-item")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        HrisCompanyPayStatementItemListPage.builder()
                            .service(PayStatementItemServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}

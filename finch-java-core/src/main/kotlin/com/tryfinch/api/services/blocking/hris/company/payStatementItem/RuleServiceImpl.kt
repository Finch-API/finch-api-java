// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris.company.payStatementItem

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
import com.tryfinch.api.core.http.json
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepare
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleCreateParams
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleDeleteParams
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleListPage
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleListPageResponse
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleListParams
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleUpdateParams
import com.tryfinch.api.models.RuleCreateResponse
import com.tryfinch.api.models.RuleDeleteResponse
import com.tryfinch.api.models.RuleUpdateResponse

class RuleServiceImpl internal constructor(private val clientOptions: ClientOptions) : RuleService {

    private val withRawResponse: RuleService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RuleService.WithRawResponse = withRawResponse

    override fun create(
        params: HrisCompanyPayStatementItemRuleCreateParams,
        requestOptions: RequestOptions,
    ): RuleCreateResponse =
        // post /employer/pay-statement-item/rule
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: HrisCompanyPayStatementItemRuleUpdateParams,
        requestOptions: RequestOptions,
    ): RuleUpdateResponse =
        // put /employer/pay-statement-item/rule/{rule_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: HrisCompanyPayStatementItemRuleListParams,
        requestOptions: RequestOptions,
    ): HrisCompanyPayStatementItemRuleListPage =
        // get /employer/pay-statement-item/rule
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: HrisCompanyPayStatementItemRuleDeleteParams,
        requestOptions: RequestOptions,
    ): RuleDeleteResponse =
        // delete /employer/pay-statement-item/rule/{rule_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RuleService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<RuleCreateResponse> =
            jsonHandler<RuleCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: HrisCompanyPayStatementItemRuleCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("employer", "pay-statement-item", "rule")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<RuleUpdateResponse> =
            jsonHandler<RuleUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: HrisCompanyPayStatementItemRuleUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("employer", "pay-statement-item", "rule", params._pathParam(0))
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

        private val listHandler: Handler<HrisCompanyPayStatementItemRuleListPageResponse> =
            jsonHandler<HrisCompanyPayStatementItemRuleListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: HrisCompanyPayStatementItemRuleListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HrisCompanyPayStatementItemRuleListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("employer", "pay-statement-item", "rule")
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
                        HrisCompanyPayStatementItemRuleListPage.builder()
                            .service(RuleServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<RuleDeleteResponse> =
            jsonHandler<RuleDeleteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: HrisCompanyPayStatementItemRuleDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("employer", "pay-statement-item", "rule", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}

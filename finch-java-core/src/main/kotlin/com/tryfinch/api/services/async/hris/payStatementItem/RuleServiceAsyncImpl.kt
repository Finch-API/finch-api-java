// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris.payStatementItem

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.SecurityOptions
import com.tryfinch.api.core.checkRequired
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
import com.tryfinch.api.core.prepareAsync
import com.tryfinch.api.models.HrisPayStatementItemRuleCreateParams
import com.tryfinch.api.models.HrisPayStatementItemRuleDeleteParams
import com.tryfinch.api.models.HrisPayStatementItemRuleListPageAsync
import com.tryfinch.api.models.HrisPayStatementItemRuleListPageResponse
import com.tryfinch.api.models.HrisPayStatementItemRuleListParams
import com.tryfinch.api.models.HrisPayStatementItemRuleUpdateParams
import com.tryfinch.api.models.RuleCreateResponse
import com.tryfinch.api.models.RuleDeleteResponse
import com.tryfinch.api.models.RuleUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RuleServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RuleServiceAsync {

    private val withRawResponse: RuleServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RuleServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleServiceAsync =
        RuleServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: HrisPayStatementItemRuleCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleCreateResponse> =
        // post /employer/pay-statement-item/rule
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: HrisPayStatementItemRuleUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleUpdateResponse> =
        // put /employer/pay-statement-item/rule/{rule_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: HrisPayStatementItemRuleListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HrisPayStatementItemRuleListPageAsync> =
        // get /employer/pay-statement-item/rule
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: HrisPayStatementItemRuleDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleDeleteResponse> =
        // delete /employer/pay-statement-item/rule/{rule_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RuleServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RuleServiceAsync.WithRawResponse =
            RuleServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<RuleCreateResponse> =
            jsonHandler<RuleCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: HrisPayStatementItemRuleCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("employer", "pay-statement-item", "rule")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(
                        clientOptions,
                        params,
                        SecurityOptions.builder().bearerAuth(true).build(),
                    )
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<RuleUpdateResponse> =
            jsonHandler<RuleUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: HrisPayStatementItemRuleUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ruleId", params.ruleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("employer", "pay-statement-item", "rule", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(
                        clientOptions,
                        params,
                        SecurityOptions.builder().bearerAuth(true).build(),
                    )
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val listHandler: Handler<HrisPayStatementItemRuleListPageResponse> =
            jsonHandler<HrisPayStatementItemRuleListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: HrisPayStatementItemRuleListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HrisPayStatementItemRuleListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("employer", "pay-statement-item", "rule")
                    .build()
                    .prepareAsync(
                        clientOptions,
                        params,
                        SecurityOptions.builder().bearerAuth(true).build(),
                    )
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                HrisPayStatementItemRuleListPageAsync.builder()
                                    .service(RuleServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<RuleDeleteResponse> =
            jsonHandler<RuleDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: HrisPayStatementItemRuleDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ruleId", params.ruleId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("employer", "pay-statement-item", "rule", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(
                        clientOptions,
                        params,
                        SecurityOptions.builder().bearerAuth(true).build(),
                    )
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}

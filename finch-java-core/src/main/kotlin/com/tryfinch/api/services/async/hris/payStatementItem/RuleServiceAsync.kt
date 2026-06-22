// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris.payStatementItem

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisPayStatementItemRuleCreateParams
import com.tryfinch.api.models.HrisPayStatementItemRuleDeleteParams
import com.tryfinch.api.models.HrisPayStatementItemRuleListPageAsync
import com.tryfinch.api.models.HrisPayStatementItemRuleListParams
import com.tryfinch.api.models.HrisPayStatementItemRuleUpdateParams
import com.tryfinch.api.models.RuleCreateResponse
import com.tryfinch.api.models.RuleDeleteResponse
import com.tryfinch.api.models.RuleUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RuleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleServiceAsync

    /**
     * Custom rules can be created to associate specific attributes to pay statement items depending
     * on the use case. For example, pay statement items that meet certain conditions can be labeled
     * as a pre-tax 401k. This metadata can be retrieved where pay statement item information is
     * available.
     */
    fun create(): CompletableFuture<RuleCreateResponse> =
        create(HrisPayStatementItemRuleCreateParams.none())

    /** @see create */
    fun create(
        params: HrisPayStatementItemRuleCreateParams = HrisPayStatementItemRuleCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleCreateResponse>

    /** @see create */
    fun create(
        params: HrisPayStatementItemRuleCreateParams = HrisPayStatementItemRuleCreateParams.none()
    ): CompletableFuture<RuleCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<RuleCreateResponse> =
        create(HrisPayStatementItemRuleCreateParams.none(), requestOptions)

    /** Update a rule for a pay statement item. */
    fun update(ruleId: String): CompletableFuture<RuleUpdateResponse> =
        update(ruleId, HrisPayStatementItemRuleUpdateParams.none())

    /** @see update */
    fun update(
        ruleId: String,
        params: HrisPayStatementItemRuleUpdateParams = HrisPayStatementItemRuleUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleUpdateResponse> =
        update(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see update */
    fun update(
        ruleId: String,
        params: HrisPayStatementItemRuleUpdateParams = HrisPayStatementItemRuleUpdateParams.none(),
    ): CompletableFuture<RuleUpdateResponse> = update(ruleId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: HrisPayStatementItemRuleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleUpdateResponse>

    /** @see update */
    fun update(
        params: HrisPayStatementItemRuleUpdateParams
    ): CompletableFuture<RuleUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        ruleId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleUpdateResponse> =
        update(ruleId, HrisPayStatementItemRuleUpdateParams.none(), requestOptions)

    /** List all rules of a connection account. */
    fun list(): CompletableFuture<HrisPayStatementItemRuleListPageAsync> =
        list(HrisPayStatementItemRuleListParams.none())

    /** @see list */
    fun list(
        params: HrisPayStatementItemRuleListParams = HrisPayStatementItemRuleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisPayStatementItemRuleListPageAsync>

    /** @see list */
    fun list(
        params: HrisPayStatementItemRuleListParams = HrisPayStatementItemRuleListParams.none()
    ): CompletableFuture<HrisPayStatementItemRuleListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<HrisPayStatementItemRuleListPageAsync> =
        list(HrisPayStatementItemRuleListParams.none(), requestOptions)

    /** Delete a rule for a pay statement item. */
    fun delete(ruleId: String): CompletableFuture<RuleDeleteResponse> =
        delete(ruleId, HrisPayStatementItemRuleDeleteParams.none())

    /** @see delete */
    fun delete(
        ruleId: String,
        params: HrisPayStatementItemRuleDeleteParams = HrisPayStatementItemRuleDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleDeleteResponse> =
        delete(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see delete */
    fun delete(
        ruleId: String,
        params: HrisPayStatementItemRuleDeleteParams = HrisPayStatementItemRuleDeleteParams.none(),
    ): CompletableFuture<RuleDeleteResponse> = delete(ruleId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: HrisPayStatementItemRuleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleDeleteResponse>

    /** @see delete */
    fun delete(
        params: HrisPayStatementItemRuleDeleteParams
    ): CompletableFuture<RuleDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        ruleId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleDeleteResponse> =
        delete(ruleId, HrisPayStatementItemRuleDeleteParams.none(), requestOptions)

    /** A view of [RuleServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /employer/pay-statement-item/rule`, but is
         * otherwise the same as [RuleServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<RuleCreateResponse>> =
            create(HrisPayStatementItemRuleCreateParams.none())

        /** @see create */
        fun create(
            params: HrisPayStatementItemRuleCreateParams =
                HrisPayStatementItemRuleCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleCreateResponse>>

        /** @see create */
        fun create(
            params: HrisPayStatementItemRuleCreateParams =
                HrisPayStatementItemRuleCreateParams.none()
        ): CompletableFuture<HttpResponseFor<RuleCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RuleCreateResponse>> =
            create(HrisPayStatementItemRuleCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /employer/pay-statement-item/rule/{rule_id}`, but is
         * otherwise the same as [RuleServiceAsync.update].
         */
        fun update(ruleId: String): CompletableFuture<HttpResponseFor<RuleUpdateResponse>> =
            update(ruleId, HrisPayStatementItemRuleUpdateParams.none())

        /** @see update */
        fun update(
            ruleId: String,
            params: HrisPayStatementItemRuleUpdateParams =
                HrisPayStatementItemRuleUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleUpdateResponse>> =
            update(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see update */
        fun update(
            ruleId: String,
            params: HrisPayStatementItemRuleUpdateParams =
                HrisPayStatementItemRuleUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<RuleUpdateResponse>> =
            update(ruleId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: HrisPayStatementItemRuleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleUpdateResponse>>

        /** @see update */
        fun update(
            params: HrisPayStatementItemRuleUpdateParams
        ): CompletableFuture<HttpResponseFor<RuleUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            ruleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleUpdateResponse>> =
            update(ruleId, HrisPayStatementItemRuleUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/pay-statement-item/rule`, but is otherwise
         * the same as [RuleServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<HrisPayStatementItemRuleListPageAsync>> =
            list(HrisPayStatementItemRuleListParams.none())

        /** @see list */
        fun list(
            params: HrisPayStatementItemRuleListParams = HrisPayStatementItemRuleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HrisPayStatementItemRuleListPageAsync>>

        /** @see list */
        fun list(
            params: HrisPayStatementItemRuleListParams = HrisPayStatementItemRuleListParams.none()
        ): CompletableFuture<HttpResponseFor<HrisPayStatementItemRuleListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<HrisPayStatementItemRuleListPageAsync>> =
            list(HrisPayStatementItemRuleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /employer/pay-statement-item/rule/{rule_id}`, but
         * is otherwise the same as [RuleServiceAsync.delete].
         */
        fun delete(ruleId: String): CompletableFuture<HttpResponseFor<RuleDeleteResponse>> =
            delete(ruleId, HrisPayStatementItemRuleDeleteParams.none())

        /** @see delete */
        fun delete(
            ruleId: String,
            params: HrisPayStatementItemRuleDeleteParams =
                HrisPayStatementItemRuleDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleDeleteResponse>> =
            delete(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see delete */
        fun delete(
            ruleId: String,
            params: HrisPayStatementItemRuleDeleteParams =
                HrisPayStatementItemRuleDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<RuleDeleteResponse>> =
            delete(ruleId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: HrisPayStatementItemRuleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleDeleteResponse>>

        /** @see delete */
        fun delete(
            params: HrisPayStatementItemRuleDeleteParams
        ): CompletableFuture<HttpResponseFor<RuleDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            ruleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleDeleteResponse>> =
            delete(ruleId, HrisPayStatementItemRuleDeleteParams.none(), requestOptions)
    }
}

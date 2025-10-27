// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris.company.payStatementItem

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleCreateParams
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleDeleteParams
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleListPageAsync
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleListParams
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleUpdateParams
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
     * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
     * support will be added soon Custom rules can be created to associate specific attributes to
     * pay statement items depending on the use case. For example, pay statement items that meet
     * certain conditions can be labeled as a pre-tax 401k. This metadata can be retrieved where pay
     * statement item information is available.
     */
    fun create(): CompletableFuture<RuleCreateResponse> =
        create(HrisCompanyPayStatementItemRuleCreateParams.none())

    /** @see create */
    fun create(
        params: HrisCompanyPayStatementItemRuleCreateParams =
            HrisCompanyPayStatementItemRuleCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleCreateResponse>

    /** @see create */
    fun create(
        params: HrisCompanyPayStatementItemRuleCreateParams =
            HrisCompanyPayStatementItemRuleCreateParams.none()
    ): CompletableFuture<RuleCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<RuleCreateResponse> =
        create(HrisCompanyPayStatementItemRuleCreateParams.none(), requestOptions)

    /**
     * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
     * support will be added soon Update a rule for a pay statement item.
     */
    fun update(ruleId: String): CompletableFuture<RuleUpdateResponse> =
        update(ruleId, HrisCompanyPayStatementItemRuleUpdateParams.none())

    /** @see update */
    fun update(
        ruleId: String,
        params: HrisCompanyPayStatementItemRuleUpdateParams =
            HrisCompanyPayStatementItemRuleUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleUpdateResponse> =
        update(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see update */
    fun update(
        ruleId: String,
        params: HrisCompanyPayStatementItemRuleUpdateParams =
            HrisCompanyPayStatementItemRuleUpdateParams.none(),
    ): CompletableFuture<RuleUpdateResponse> = update(ruleId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: HrisCompanyPayStatementItemRuleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleUpdateResponse>

    /** @see update */
    fun update(
        params: HrisCompanyPayStatementItemRuleUpdateParams
    ): CompletableFuture<RuleUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        ruleId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleUpdateResponse> =
        update(ruleId, HrisCompanyPayStatementItemRuleUpdateParams.none(), requestOptions)

    /**
     * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
     * support will be added soon List all rules of a connection account.
     */
    fun list(): CompletableFuture<HrisCompanyPayStatementItemRuleListPageAsync> =
        list(HrisCompanyPayStatementItemRuleListParams.none())

    /** @see list */
    fun list(
        params: HrisCompanyPayStatementItemRuleListParams =
            HrisCompanyPayStatementItemRuleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisCompanyPayStatementItemRuleListPageAsync>

    /** @see list */
    fun list(
        params: HrisCompanyPayStatementItemRuleListParams =
            HrisCompanyPayStatementItemRuleListParams.none()
    ): CompletableFuture<HrisCompanyPayStatementItemRuleListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<HrisCompanyPayStatementItemRuleListPageAsync> =
        list(HrisCompanyPayStatementItemRuleListParams.none(), requestOptions)

    /**
     * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
     * support will be added soon Delete a rule for a pay statement item.
     */
    fun delete(ruleId: String): CompletableFuture<RuleDeleteResponse> =
        delete(ruleId, HrisCompanyPayStatementItemRuleDeleteParams.none())

    /** @see delete */
    fun delete(
        ruleId: String,
        params: HrisCompanyPayStatementItemRuleDeleteParams =
            HrisCompanyPayStatementItemRuleDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleDeleteResponse> =
        delete(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see delete */
    fun delete(
        ruleId: String,
        params: HrisCompanyPayStatementItemRuleDeleteParams =
            HrisCompanyPayStatementItemRuleDeleteParams.none(),
    ): CompletableFuture<RuleDeleteResponse> = delete(ruleId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: HrisCompanyPayStatementItemRuleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleDeleteResponse>

    /** @see delete */
    fun delete(
        params: HrisCompanyPayStatementItemRuleDeleteParams
    ): CompletableFuture<RuleDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        ruleId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleDeleteResponse> =
        delete(ruleId, HrisCompanyPayStatementItemRuleDeleteParams.none(), requestOptions)

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
            create(HrisCompanyPayStatementItemRuleCreateParams.none())

        /** @see create */
        fun create(
            params: HrisCompanyPayStatementItemRuleCreateParams =
                HrisCompanyPayStatementItemRuleCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleCreateResponse>>

        /** @see create */
        fun create(
            params: HrisCompanyPayStatementItemRuleCreateParams =
                HrisCompanyPayStatementItemRuleCreateParams.none()
        ): CompletableFuture<HttpResponseFor<RuleCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RuleCreateResponse>> =
            create(HrisCompanyPayStatementItemRuleCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /employer/pay-statement-item/rule/{rule_id}`, but is
         * otherwise the same as [RuleServiceAsync.update].
         */
        fun update(ruleId: String): CompletableFuture<HttpResponseFor<RuleUpdateResponse>> =
            update(ruleId, HrisCompanyPayStatementItemRuleUpdateParams.none())

        /** @see update */
        fun update(
            ruleId: String,
            params: HrisCompanyPayStatementItemRuleUpdateParams =
                HrisCompanyPayStatementItemRuleUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleUpdateResponse>> =
            update(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see update */
        fun update(
            ruleId: String,
            params: HrisCompanyPayStatementItemRuleUpdateParams =
                HrisCompanyPayStatementItemRuleUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<RuleUpdateResponse>> =
            update(ruleId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: HrisCompanyPayStatementItemRuleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleUpdateResponse>>

        /** @see update */
        fun update(
            params: HrisCompanyPayStatementItemRuleUpdateParams
        ): CompletableFuture<HttpResponseFor<RuleUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            ruleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleUpdateResponse>> =
            update(ruleId, HrisCompanyPayStatementItemRuleUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/pay-statement-item/rule`, but is otherwise
         * the same as [RuleServiceAsync.list].
         */
        fun list():
            CompletableFuture<HttpResponseFor<HrisCompanyPayStatementItemRuleListPageAsync>> =
            list(HrisCompanyPayStatementItemRuleListParams.none())

        /** @see list */
        fun list(
            params: HrisCompanyPayStatementItemRuleListParams =
                HrisCompanyPayStatementItemRuleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HrisCompanyPayStatementItemRuleListPageAsync>>

        /** @see list */
        fun list(
            params: HrisCompanyPayStatementItemRuleListParams =
                HrisCompanyPayStatementItemRuleListParams.none()
        ): CompletableFuture<HttpResponseFor<HrisCompanyPayStatementItemRuleListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<HrisCompanyPayStatementItemRuleListPageAsync>> =
            list(HrisCompanyPayStatementItemRuleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /employer/pay-statement-item/rule/{rule_id}`, but
         * is otherwise the same as [RuleServiceAsync.delete].
         */
        fun delete(ruleId: String): CompletableFuture<HttpResponseFor<RuleDeleteResponse>> =
            delete(ruleId, HrisCompanyPayStatementItemRuleDeleteParams.none())

        /** @see delete */
        fun delete(
            ruleId: String,
            params: HrisCompanyPayStatementItemRuleDeleteParams =
                HrisCompanyPayStatementItemRuleDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleDeleteResponse>> =
            delete(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see delete */
        fun delete(
            ruleId: String,
            params: HrisCompanyPayStatementItemRuleDeleteParams =
                HrisCompanyPayStatementItemRuleDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<RuleDeleteResponse>> =
            delete(ruleId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: HrisCompanyPayStatementItemRuleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleDeleteResponse>>

        /** @see delete */
        fun delete(
            params: HrisCompanyPayStatementItemRuleDeleteParams
        ): CompletableFuture<HttpResponseFor<RuleDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            ruleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleDeleteResponse>> =
            delete(ruleId, HrisCompanyPayStatementItemRuleDeleteParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris.payStatementItem

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisPayStatementItemRuleCreateParams
import com.tryfinch.api.models.HrisPayStatementItemRuleDeleteParams
import com.tryfinch.api.models.HrisPayStatementItemRuleListPage
import com.tryfinch.api.models.HrisPayStatementItemRuleListParams
import com.tryfinch.api.models.HrisPayStatementItemRuleUpdateParams
import com.tryfinch.api.models.RuleCreateResponse
import com.tryfinch.api.models.RuleDeleteResponse
import com.tryfinch.api.models.RuleUpdateResponse
import java.util.function.Consumer

interface RuleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleService

    /**
     * Custom rules can be created to associate specific attributes to pay statement items depending
     * on the use case. For example, pay statement items that meet certain conditions can be labeled
     * as a pre-tax 401k. This metadata can be retrieved where pay statement item information is
     * available.
     */
    fun create(): RuleCreateResponse = create(HrisPayStatementItemRuleCreateParams.none())

    /** @see create */
    fun create(
        params: HrisPayStatementItemRuleCreateParams = HrisPayStatementItemRuleCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleCreateResponse

    /** @see create */
    fun create(
        params: HrisPayStatementItemRuleCreateParams = HrisPayStatementItemRuleCreateParams.none()
    ): RuleCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): RuleCreateResponse =
        create(HrisPayStatementItemRuleCreateParams.none(), requestOptions)

    /** Update a rule for a pay statement item. */
    fun update(ruleId: String): RuleUpdateResponse =
        update(ruleId, HrisPayStatementItemRuleUpdateParams.none())

    /** @see update */
    fun update(
        ruleId: String,
        params: HrisPayStatementItemRuleUpdateParams = HrisPayStatementItemRuleUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleUpdateResponse = update(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see update */
    fun update(
        ruleId: String,
        params: HrisPayStatementItemRuleUpdateParams = HrisPayStatementItemRuleUpdateParams.none(),
    ): RuleUpdateResponse = update(ruleId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: HrisPayStatementItemRuleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleUpdateResponse

    /** @see update */
    fun update(params: HrisPayStatementItemRuleUpdateParams): RuleUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(ruleId: String, requestOptions: RequestOptions): RuleUpdateResponse =
        update(ruleId, HrisPayStatementItemRuleUpdateParams.none(), requestOptions)

    /** List all rules of a connection account. */
    fun list(): HrisPayStatementItemRuleListPage = list(HrisPayStatementItemRuleListParams.none())

    /** @see list */
    fun list(
        params: HrisPayStatementItemRuleListParams = HrisPayStatementItemRuleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisPayStatementItemRuleListPage

    /** @see list */
    fun list(
        params: HrisPayStatementItemRuleListParams = HrisPayStatementItemRuleListParams.none()
    ): HrisPayStatementItemRuleListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): HrisPayStatementItemRuleListPage =
        list(HrisPayStatementItemRuleListParams.none(), requestOptions)

    /** Delete a rule for a pay statement item. */
    fun delete(ruleId: String): RuleDeleteResponse =
        delete(ruleId, HrisPayStatementItemRuleDeleteParams.none())

    /** @see delete */
    fun delete(
        ruleId: String,
        params: HrisPayStatementItemRuleDeleteParams = HrisPayStatementItemRuleDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleDeleteResponse = delete(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see delete */
    fun delete(
        ruleId: String,
        params: HrisPayStatementItemRuleDeleteParams = HrisPayStatementItemRuleDeleteParams.none(),
    ): RuleDeleteResponse = delete(ruleId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: HrisPayStatementItemRuleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleDeleteResponse

    /** @see delete */
    fun delete(params: HrisPayStatementItemRuleDeleteParams): RuleDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(ruleId: String, requestOptions: RequestOptions): RuleDeleteResponse =
        delete(ruleId, HrisPayStatementItemRuleDeleteParams.none(), requestOptions)

    /** A view of [RuleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /employer/pay-statement-item/rule`, but is
         * otherwise the same as [RuleService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<RuleCreateResponse> =
            create(HrisPayStatementItemRuleCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: HrisPayStatementItemRuleCreateParams =
                HrisPayStatementItemRuleCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: HrisPayStatementItemRuleCreateParams =
                HrisPayStatementItemRuleCreateParams.none()
        ): HttpResponseFor<RuleCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<RuleCreateResponse> =
            create(HrisPayStatementItemRuleCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /employer/pay-statement-item/rule/{rule_id}`, but is
         * otherwise the same as [RuleService.update].
         */
        @MustBeClosed
        fun update(ruleId: String): HttpResponseFor<RuleUpdateResponse> =
            update(ruleId, HrisPayStatementItemRuleUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            ruleId: String,
            params: HrisPayStatementItemRuleUpdateParams =
                HrisPayStatementItemRuleUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleUpdateResponse> =
            update(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            ruleId: String,
            params: HrisPayStatementItemRuleUpdateParams =
                HrisPayStatementItemRuleUpdateParams.none(),
        ): HttpResponseFor<RuleUpdateResponse> = update(ruleId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: HrisPayStatementItemRuleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: HrisPayStatementItemRuleUpdateParams
        ): HttpResponseFor<RuleUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            ruleId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleUpdateResponse> =
            update(ruleId, HrisPayStatementItemRuleUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/pay-statement-item/rule`, but is otherwise
         * the same as [RuleService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<HrisPayStatementItemRuleListPage> =
            list(HrisPayStatementItemRuleListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: HrisPayStatementItemRuleListParams = HrisPayStatementItemRuleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisPayStatementItemRuleListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: HrisPayStatementItemRuleListParams = HrisPayStatementItemRuleListParams.none()
        ): HttpResponseFor<HrisPayStatementItemRuleListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<HrisPayStatementItemRuleListPage> =
            list(HrisPayStatementItemRuleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /employer/pay-statement-item/rule/{rule_id}`, but
         * is otherwise the same as [RuleService.delete].
         */
        @MustBeClosed
        fun delete(ruleId: String): HttpResponseFor<RuleDeleteResponse> =
            delete(ruleId, HrisPayStatementItemRuleDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            ruleId: String,
            params: HrisPayStatementItemRuleDeleteParams =
                HrisPayStatementItemRuleDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleDeleteResponse> =
            delete(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            ruleId: String,
            params: HrisPayStatementItemRuleDeleteParams =
                HrisPayStatementItemRuleDeleteParams.none(),
        ): HttpResponseFor<RuleDeleteResponse> = delete(ruleId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: HrisPayStatementItemRuleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: HrisPayStatementItemRuleDeleteParams
        ): HttpResponseFor<RuleDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            ruleId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleDeleteResponse> =
            delete(ruleId, HrisPayStatementItemRuleDeleteParams.none(), requestOptions)
    }
}

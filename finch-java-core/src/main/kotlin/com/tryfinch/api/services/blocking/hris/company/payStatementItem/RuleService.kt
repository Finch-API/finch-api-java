// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris.company.payStatementItem

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleCreateParams
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleDeleteParams
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleListPage
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleListParams
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleUpdateParams
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
     * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
     * support will be added soon Custom rules can be created to associate specific attributes to
     * pay statement items depending on the use case. For example, pay statement items that meet
     * certain conditions can be labeled as a pre-tax 401k. This metadata can be retrieved where pay
     * statement item information is available.
     */
    fun create(params: HrisCompanyPayStatementItemRuleCreateParams): RuleCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: HrisCompanyPayStatementItemRuleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleCreateResponse

    /**
     * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
     * support will be added soon Update a rule for a pay statement item.
     */
    fun update(
        ruleId: String,
        params: HrisCompanyPayStatementItemRuleUpdateParams,
    ): RuleUpdateResponse = update(ruleId, params, RequestOptions.none())

    /** @see update */
    fun update(
        ruleId: String,
        params: HrisCompanyPayStatementItemRuleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleUpdateResponse = update(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see update */
    fun update(params: HrisCompanyPayStatementItemRuleUpdateParams): RuleUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: HrisCompanyPayStatementItemRuleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleUpdateResponse

    /**
     * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
     * support will be added soon List all rules of a connection account.
     */
    fun list(
        params: HrisCompanyPayStatementItemRuleListParams
    ): HrisCompanyPayStatementItemRuleListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: HrisCompanyPayStatementItemRuleListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisCompanyPayStatementItemRuleListPage

    /**
     * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
     * support will be added soon Delete a rule for a pay statement item.
     */
    fun delete(
        ruleId: String,
        params: HrisCompanyPayStatementItemRuleDeleteParams,
    ): RuleDeleteResponse = delete(ruleId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        ruleId: String,
        params: HrisCompanyPayStatementItemRuleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleDeleteResponse = delete(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see delete */
    fun delete(params: HrisCompanyPayStatementItemRuleDeleteParams): RuleDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: HrisCompanyPayStatementItemRuleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleDeleteResponse

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
        fun create(
            params: HrisCompanyPayStatementItemRuleCreateParams
        ): HttpResponseFor<RuleCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: HrisCompanyPayStatementItemRuleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleCreateResponse>

        /**
         * Returns a raw HTTP response for `put /employer/pay-statement-item/rule/{rule_id}`, but is
         * otherwise the same as [RuleService.update].
         */
        @MustBeClosed
        fun update(
            ruleId: String,
            params: HrisCompanyPayStatementItemRuleUpdateParams,
        ): HttpResponseFor<RuleUpdateResponse> = update(ruleId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            ruleId: String,
            params: HrisCompanyPayStatementItemRuleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleUpdateResponse> =
            update(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: HrisCompanyPayStatementItemRuleUpdateParams
        ): HttpResponseFor<RuleUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: HrisCompanyPayStatementItemRuleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /employer/pay-statement-item/rule`, but is otherwise
         * the same as [RuleService.list].
         */
        @MustBeClosed
        fun list(
            params: HrisCompanyPayStatementItemRuleListParams
        ): HttpResponseFor<HrisCompanyPayStatementItemRuleListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: HrisCompanyPayStatementItemRuleListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisCompanyPayStatementItemRuleListPage>

        /**
         * Returns a raw HTTP response for `delete /employer/pay-statement-item/rule/{rule_id}`, but
         * is otherwise the same as [RuleService.delete].
         */
        @MustBeClosed
        fun delete(
            ruleId: String,
            params: HrisCompanyPayStatementItemRuleDeleteParams,
        ): HttpResponseFor<RuleDeleteResponse> = delete(ruleId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            ruleId: String,
            params: HrisCompanyPayStatementItemRuleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleDeleteResponse> =
            delete(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: HrisCompanyPayStatementItemRuleDeleteParams
        ): HttpResponseFor<RuleDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: HrisCompanyPayStatementItemRuleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleDeleteResponse>
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris.company.payStatementItem

import com.google.errorprone.annotations.MustBeClosed
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

interface RuleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
     * support will be added soon Custom rules can be created to associate specific attributes to
     * pay statement items depending on the use case. For example, pay statement items that meet
     * certain conditions can be labeled as a pre-tax 401k. This metadata can be retrieved where pay
     * statement item information is available.
     */
    fun create(): RuleCreateResponse = create(HrisCompanyPayStatementItemRuleCreateParams.none())

    /** @see [create] */
    fun create(
        params: HrisCompanyPayStatementItemRuleCreateParams =
            HrisCompanyPayStatementItemRuleCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleCreateResponse

    /** @see [create] */
    fun create(
        params: HrisCompanyPayStatementItemRuleCreateParams =
            HrisCompanyPayStatementItemRuleCreateParams.none()
    ): RuleCreateResponse = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): RuleCreateResponse =
        create(HrisCompanyPayStatementItemRuleCreateParams.none(), requestOptions)

    /**
     * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
     * support will be added soon Update a rule for a pay statement item.
     */
    fun update(params: HrisCompanyPayStatementItemRuleUpdateParams): RuleUpdateResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: HrisCompanyPayStatementItemRuleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleUpdateResponse

    /**
     * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
     * support will be added soon List all rules of a connection account.
     */
    fun list(): HrisCompanyPayStatementItemRuleListPage =
        list(HrisCompanyPayStatementItemRuleListParams.none())

    /** @see [list] */
    fun list(
        params: HrisCompanyPayStatementItemRuleListParams =
            HrisCompanyPayStatementItemRuleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisCompanyPayStatementItemRuleListPage

    /** @see [list] */
    fun list(
        params: HrisCompanyPayStatementItemRuleListParams =
            HrisCompanyPayStatementItemRuleListParams.none()
    ): HrisCompanyPayStatementItemRuleListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): HrisCompanyPayStatementItemRuleListPage =
        list(HrisCompanyPayStatementItemRuleListParams.none(), requestOptions)

    /**
     * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
     * support will be added soon Delete a rule for a pay statement item.
     */
    fun delete(params: HrisCompanyPayStatementItemRuleDeleteParams): RuleDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: HrisCompanyPayStatementItemRuleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleDeleteResponse

    /** A view of [RuleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /employer/pay-statement-item/rule`, but is
         * otherwise the same as [RuleService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<RuleCreateResponse> =
            create(HrisCompanyPayStatementItemRuleCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: HrisCompanyPayStatementItemRuleCreateParams =
                HrisCompanyPayStatementItemRuleCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleCreateResponse>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: HrisCompanyPayStatementItemRuleCreateParams =
                HrisCompanyPayStatementItemRuleCreateParams.none()
        ): HttpResponseFor<RuleCreateResponse> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<RuleCreateResponse> =
            create(HrisCompanyPayStatementItemRuleCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /employer/pay-statement-item/rule/{rule_id}`, but is
         * otherwise the same as [RuleService.update].
         */
        @MustBeClosed
        fun update(
            params: HrisCompanyPayStatementItemRuleUpdateParams
        ): HttpResponseFor<RuleUpdateResponse> = update(params, RequestOptions.none())

        /** @see [update] */
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
        fun list(): HttpResponseFor<HrisCompanyPayStatementItemRuleListPage> =
            list(HrisCompanyPayStatementItemRuleListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: HrisCompanyPayStatementItemRuleListParams =
                HrisCompanyPayStatementItemRuleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisCompanyPayStatementItemRuleListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: HrisCompanyPayStatementItemRuleListParams =
                HrisCompanyPayStatementItemRuleListParams.none()
        ): HttpResponseFor<HrisCompanyPayStatementItemRuleListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<HrisCompanyPayStatementItemRuleListPage> =
            list(HrisCompanyPayStatementItemRuleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /employer/pay-statement-item/rule/{rule_id}`, but
         * is otherwise the same as [RuleService.delete].
         */
        @MustBeClosed
        fun delete(
            params: HrisCompanyPayStatementItemRuleDeleteParams
        ): HttpResponseFor<RuleDeleteResponse> = delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: HrisCompanyPayStatementItemRuleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleDeleteResponse>
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris.company

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisCompanyPayStatementItemListPage
import com.tryfinch.api.models.HrisCompanyPayStatementItemListParams
import com.tryfinch.api.services.blocking.hris.company.payStatementItem.RuleService
import java.util.function.Consumer

interface PayStatementItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PayStatementItemService

    fun rules(): RuleService

    /**
     * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
     * support will be added soon Retrieve a list of detailed pay statement items for the access
     * token's connection account.
     */
    fun list(): HrisCompanyPayStatementItemListPage =
        list(HrisCompanyPayStatementItemListParams.none())

    /** @see list */
    fun list(
        params: HrisCompanyPayStatementItemListParams =
            HrisCompanyPayStatementItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisCompanyPayStatementItemListPage

    /** @see list */
    fun list(
        params: HrisCompanyPayStatementItemListParams = HrisCompanyPayStatementItemListParams.none()
    ): HrisCompanyPayStatementItemListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): HrisCompanyPayStatementItemListPage =
        list(HrisCompanyPayStatementItemListParams.none(), requestOptions)

    /**
     * A view of [PayStatementItemService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PayStatementItemService.WithRawResponse

        fun rules(): RuleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /employer/pay-statement-item`, but is otherwise the
         * same as [PayStatementItemService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<HrisCompanyPayStatementItemListPage> =
            list(HrisCompanyPayStatementItemListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: HrisCompanyPayStatementItemListParams =
                HrisCompanyPayStatementItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisCompanyPayStatementItemListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: HrisCompanyPayStatementItemListParams =
                HrisCompanyPayStatementItemListParams.none()
        ): HttpResponseFor<HrisCompanyPayStatementItemListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<HrisCompanyPayStatementItemListPage> =
            list(HrisCompanyPayStatementItemListParams.none(), requestOptions)
    }
}

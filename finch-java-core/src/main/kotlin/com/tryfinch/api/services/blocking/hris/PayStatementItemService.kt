// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisPayStatementItemListPage
import com.tryfinch.api.models.HrisPayStatementItemListParams
import com.tryfinch.api.services.blocking.hris.payStatementItem.RuleService
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
     * Retrieve a list of detailed pay statement items for the access token's connection account.
     */
    fun list(): HrisPayStatementItemListPage = list(HrisPayStatementItemListParams.none())

    /** @see list */
    fun list(
        params: HrisPayStatementItemListParams = HrisPayStatementItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisPayStatementItemListPage

    /** @see list */
    fun list(
        params: HrisPayStatementItemListParams = HrisPayStatementItemListParams.none()
    ): HrisPayStatementItemListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): HrisPayStatementItemListPage =
        list(HrisPayStatementItemListParams.none(), requestOptions)

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
        fun list(): HttpResponseFor<HrisPayStatementItemListPage> =
            list(HrisPayStatementItemListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: HrisPayStatementItemListParams = HrisPayStatementItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisPayStatementItemListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: HrisPayStatementItemListParams = HrisPayStatementItemListParams.none()
        ): HttpResponseFor<HrisPayStatementItemListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<HrisPayStatementItemListPage> =
            list(HrisPayStatementItemListParams.none(), requestOptions)
    }
}

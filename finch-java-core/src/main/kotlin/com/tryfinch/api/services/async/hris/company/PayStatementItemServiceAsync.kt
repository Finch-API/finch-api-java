// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris.company

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisCompanyPayStatementItemListPageAsync
import com.tryfinch.api.models.HrisCompanyPayStatementItemListParams
import com.tryfinch.api.services.async.hris.company.payStatementItem.RuleServiceAsync
import java.util.concurrent.CompletableFuture

interface PayStatementItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun rules(): RuleServiceAsync

    /**
     * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
     * support will be added soon Retrieve a list of detailed pay statement items for the access
     * token's connection account.
     */
    fun list(): CompletableFuture<HrisCompanyPayStatementItemListPageAsync> =
        list(HrisCompanyPayStatementItemListParams.none())

    /** @see [list] */
    fun list(
        params: HrisCompanyPayStatementItemListParams =
            HrisCompanyPayStatementItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisCompanyPayStatementItemListPageAsync>

    /** @see [list] */
    fun list(
        params: HrisCompanyPayStatementItemListParams = HrisCompanyPayStatementItemListParams.none()
    ): CompletableFuture<HrisCompanyPayStatementItemListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<HrisCompanyPayStatementItemListPageAsync> =
        list(HrisCompanyPayStatementItemListParams.none(), requestOptions)

    /**
     * A view of [PayStatementItemServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun rules(): RuleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /employer/pay-statement-item`, but is otherwise the
         * same as [PayStatementItemServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<HrisCompanyPayStatementItemListPageAsync>> =
            list(HrisCompanyPayStatementItemListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: HrisCompanyPayStatementItemListParams =
                HrisCompanyPayStatementItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HrisCompanyPayStatementItemListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: HrisCompanyPayStatementItemListParams =
                HrisCompanyPayStatementItemListParams.none()
        ): CompletableFuture<HttpResponseFor<HrisCompanyPayStatementItemListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<HrisCompanyPayStatementItemListPageAsync>> =
            list(HrisCompanyPayStatementItemListParams.none(), requestOptions)
    }
}

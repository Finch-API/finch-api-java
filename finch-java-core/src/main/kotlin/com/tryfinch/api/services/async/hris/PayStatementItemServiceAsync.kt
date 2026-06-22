// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisPayStatementItemListPageAsync
import com.tryfinch.api.models.HrisPayStatementItemListParams
import com.tryfinch.api.services.async.hris.payStatementItem.RuleServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PayStatementItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PayStatementItemServiceAsync

    fun rules(): RuleServiceAsync

    /**
     * Retrieve a list of detailed pay statement items for the access token's connection account.
     */
    fun list(): CompletableFuture<HrisPayStatementItemListPageAsync> =
        list(HrisPayStatementItemListParams.none())

    /** @see list */
    fun list(
        params: HrisPayStatementItemListParams = HrisPayStatementItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisPayStatementItemListPageAsync>

    /** @see list */
    fun list(
        params: HrisPayStatementItemListParams = HrisPayStatementItemListParams.none()
    ): CompletableFuture<HrisPayStatementItemListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<HrisPayStatementItemListPageAsync> =
        list(HrisPayStatementItemListParams.none(), requestOptions)

    /**
     * A view of [PayStatementItemServiceAsync] that provides access to raw HTTP responses for each
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
        ): PayStatementItemServiceAsync.WithRawResponse

        fun rules(): RuleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /employer/pay-statement-item`, but is otherwise the
         * same as [PayStatementItemServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<HrisPayStatementItemListPageAsync>> =
            list(HrisPayStatementItemListParams.none())

        /** @see list */
        fun list(
            params: HrisPayStatementItemListParams = HrisPayStatementItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HrisPayStatementItemListPageAsync>>

        /** @see list */
        fun list(
            params: HrisPayStatementItemListParams = HrisPayStatementItemListParams.none()
        ): CompletableFuture<HttpResponseFor<HrisPayStatementItemListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<HrisPayStatementItemListPageAsync>> =
            list(HrisPayStatementItemListParams.none(), requestOptions)
    }
}

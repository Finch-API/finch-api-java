// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisPaymentListPageAsync
import com.tryfinch.api.models.HrisPaymentListParams
import java.util.concurrent.CompletableFuture

interface PaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Read payroll and contractor related payments by the company. */
    fun list(params: HrisPaymentListParams): CompletableFuture<HrisPaymentListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: HrisPaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisPaymentListPageAsync>

    /**
     * A view of [PaymentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /employer/payment`, but is otherwise the same as
         * [PaymentServiceAsync.list].
         */
        fun list(
            params: HrisPaymentListParams
        ): CompletableFuture<HttpResponseFor<HrisPaymentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: HrisPaymentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HrisPaymentListPageAsync>>
    }
}

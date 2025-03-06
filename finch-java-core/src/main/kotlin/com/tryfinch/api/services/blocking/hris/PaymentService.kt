// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisPaymentListPage
import com.tryfinch.api.models.HrisPaymentListParams

interface PaymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Read payroll and contractor related payments by the company. */
    @JvmOverloads
    fun list(
        params: HrisPaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisPaymentListPage

    /** A view of [PaymentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /employer/payment`, but is otherwise the same as
         * [PaymentService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: HrisPaymentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisPaymentListPage>
    }
}

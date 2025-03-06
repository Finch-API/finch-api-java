// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.payroll

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.PayGroupRetrieveResponse
import com.tryfinch.api.models.PayrollPayGroupListPage
import com.tryfinch.api.models.PayrollPayGroupListParams
import com.tryfinch.api.models.PayrollPayGroupRetrieveParams

interface PayGroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Read information from a single pay group */
    @JvmOverloads
    fun retrieve(
        params: PayrollPayGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayGroupRetrieveResponse

    /** Read company pay groups and frequencies */
    @JvmOverloads
    fun list(
        params: PayrollPayGroupListParams = PayrollPayGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayrollPayGroupListPage

    /** Read company pay groups and frequencies */
    fun list(requestOptions: RequestOptions): PayrollPayGroupListPage =
        list(PayrollPayGroupListParams.none(), requestOptions)

    /** A view of [PayGroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /employer/pay-groups/{pay_group_id}`, but is
         * otherwise the same as [PayGroupService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: PayrollPayGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PayGroupRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /employer/pay-groups`, but is otherwise the same as
         * [PayGroupService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: PayrollPayGroupListParams = PayrollPayGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PayrollPayGroupListPage>

        /**
         * Returns a raw HTTP response for `get /employer/pay-groups`, but is otherwise the same as
         * [PayGroupService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PayrollPayGroupListPage> =
            list(PayrollPayGroupListParams.none(), requestOptions)
    }
}

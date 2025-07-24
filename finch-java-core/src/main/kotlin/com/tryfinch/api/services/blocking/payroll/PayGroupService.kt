// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.payroll

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.PayGroupRetrieveResponse
import com.tryfinch.api.models.PayrollPayGroupListPage
import com.tryfinch.api.models.PayrollPayGroupListParams
import com.tryfinch.api.models.PayrollPayGroupRetrieveParams
import java.util.function.Consumer

interface PayGroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PayGroupService

    /** Read information from a single pay group */
    fun retrieve(payGroupId: String): PayGroupRetrieveResponse =
        retrieve(payGroupId, PayrollPayGroupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        payGroupId: String,
        params: PayrollPayGroupRetrieveParams = PayrollPayGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayGroupRetrieveResponse =
        retrieve(params.toBuilder().payGroupId(payGroupId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        payGroupId: String,
        params: PayrollPayGroupRetrieveParams = PayrollPayGroupRetrieveParams.none(),
    ): PayGroupRetrieveResponse = retrieve(payGroupId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PayrollPayGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayGroupRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: PayrollPayGroupRetrieveParams): PayGroupRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(payGroupId: String, requestOptions: RequestOptions): PayGroupRetrieveResponse =
        retrieve(payGroupId, PayrollPayGroupRetrieveParams.none(), requestOptions)

    /** Read company pay groups and frequencies */
    fun list(): PayrollPayGroupListPage = list(PayrollPayGroupListParams.none())

    /** @see list */
    fun list(
        params: PayrollPayGroupListParams = PayrollPayGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayrollPayGroupListPage

    /** @see list */
    fun list(
        params: PayrollPayGroupListParams = PayrollPayGroupListParams.none()
    ): PayrollPayGroupListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PayrollPayGroupListPage =
        list(PayrollPayGroupListParams.none(), requestOptions)

    /** A view of [PayGroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PayGroupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /employer/pay-groups/{pay_group_id}`, but is
         * otherwise the same as [PayGroupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(payGroupId: String): HttpResponseFor<PayGroupRetrieveResponse> =
            retrieve(payGroupId, PayrollPayGroupRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            payGroupId: String,
            params: PayrollPayGroupRetrieveParams = PayrollPayGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PayGroupRetrieveResponse> =
            retrieve(params.toBuilder().payGroupId(payGroupId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            payGroupId: String,
            params: PayrollPayGroupRetrieveParams = PayrollPayGroupRetrieveParams.none(),
        ): HttpResponseFor<PayGroupRetrieveResponse> =
            retrieve(payGroupId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PayrollPayGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PayGroupRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PayrollPayGroupRetrieveParams
        ): HttpResponseFor<PayGroupRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            payGroupId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PayGroupRetrieveResponse> =
            retrieve(payGroupId, PayrollPayGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/pay-groups`, but is otherwise the same as
         * [PayGroupService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PayrollPayGroupListPage> =
            list(PayrollPayGroupListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PayrollPayGroupListParams = PayrollPayGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PayrollPayGroupListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PayrollPayGroupListParams = PayrollPayGroupListParams.none()
        ): HttpResponseFor<PayrollPayGroupListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PayrollPayGroupListPage> =
            list(PayrollPayGroupListParams.none(), requestOptions)
    }
}

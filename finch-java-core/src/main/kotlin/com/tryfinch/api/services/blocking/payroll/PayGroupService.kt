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
    fun retrieve(
        payGroupId: String,
        params: PayrollPayGroupRetrieveParams,
    ): PayGroupRetrieveResponse = retrieve(payGroupId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        payGroupId: String,
        params: PayrollPayGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayGroupRetrieveResponse =
        retrieve(params.toBuilder().payGroupId(payGroupId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: PayrollPayGroupRetrieveParams): PayGroupRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PayrollPayGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayGroupRetrieveResponse

    /** Read company pay groups and frequencies */
    fun list(params: PayrollPayGroupListParams): PayrollPayGroupListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PayrollPayGroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayrollPayGroupListPage

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
        fun retrieve(
            payGroupId: String,
            params: PayrollPayGroupRetrieveParams,
        ): HttpResponseFor<PayGroupRetrieveResponse> =
            retrieve(payGroupId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            payGroupId: String,
            params: PayrollPayGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PayGroupRetrieveResponse> =
            retrieve(params.toBuilder().payGroupId(payGroupId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PayrollPayGroupRetrieveParams
        ): HttpResponseFor<PayGroupRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PayrollPayGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PayGroupRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /employer/pay-groups`, but is otherwise the same as
         * [PayGroupService.list].
         */
        @MustBeClosed
        fun list(params: PayrollPayGroupListParams): HttpResponseFor<PayrollPayGroupListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PayrollPayGroupListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PayrollPayGroupListPage>
    }
}

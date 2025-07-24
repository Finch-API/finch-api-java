// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.payroll

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.PayGroupRetrieveResponse
import com.tryfinch.api.models.PayrollPayGroupListPageAsync
import com.tryfinch.api.models.PayrollPayGroupListParams
import com.tryfinch.api.models.PayrollPayGroupRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PayGroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PayGroupServiceAsync

    /** Read information from a single pay group */
    fun retrieve(payGroupId: String): CompletableFuture<PayGroupRetrieveResponse> =
        retrieve(payGroupId, PayrollPayGroupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        payGroupId: String,
        params: PayrollPayGroupRetrieveParams = PayrollPayGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PayGroupRetrieveResponse> =
        retrieve(params.toBuilder().payGroupId(payGroupId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        payGroupId: String,
        params: PayrollPayGroupRetrieveParams = PayrollPayGroupRetrieveParams.none(),
    ): CompletableFuture<PayGroupRetrieveResponse> =
        retrieve(payGroupId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PayrollPayGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PayGroupRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: PayrollPayGroupRetrieveParams
    ): CompletableFuture<PayGroupRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        payGroupId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PayGroupRetrieveResponse> =
        retrieve(payGroupId, PayrollPayGroupRetrieveParams.none(), requestOptions)

    /** Read company pay groups and frequencies */
    fun list(): CompletableFuture<PayrollPayGroupListPageAsync> =
        list(PayrollPayGroupListParams.none())

    /** @see list */
    fun list(
        params: PayrollPayGroupListParams = PayrollPayGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PayrollPayGroupListPageAsync>

    /** @see list */
    fun list(
        params: PayrollPayGroupListParams = PayrollPayGroupListParams.none()
    ): CompletableFuture<PayrollPayGroupListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PayrollPayGroupListPageAsync> =
        list(PayrollPayGroupListParams.none(), requestOptions)

    /**
     * A view of [PayGroupServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PayGroupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /employer/pay-groups/{pay_group_id}`, but is
         * otherwise the same as [PayGroupServiceAsync.retrieve].
         */
        fun retrieve(
            payGroupId: String
        ): CompletableFuture<HttpResponseFor<PayGroupRetrieveResponse>> =
            retrieve(payGroupId, PayrollPayGroupRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            payGroupId: String,
            params: PayrollPayGroupRetrieveParams = PayrollPayGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PayGroupRetrieveResponse>> =
            retrieve(params.toBuilder().payGroupId(payGroupId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            payGroupId: String,
            params: PayrollPayGroupRetrieveParams = PayrollPayGroupRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PayGroupRetrieveResponse>> =
            retrieve(payGroupId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PayrollPayGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PayGroupRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: PayrollPayGroupRetrieveParams
        ): CompletableFuture<HttpResponseFor<PayGroupRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            payGroupId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PayGroupRetrieveResponse>> =
            retrieve(payGroupId, PayrollPayGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/pay-groups`, but is otherwise the same as
         * [PayGroupServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PayrollPayGroupListPageAsync>> =
            list(PayrollPayGroupListParams.none())

        /** @see list */
        fun list(
            params: PayrollPayGroupListParams = PayrollPayGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PayrollPayGroupListPageAsync>>

        /** @see list */
        fun list(
            params: PayrollPayGroupListParams = PayrollPayGroupListParams.none()
        ): CompletableFuture<HttpResponseFor<PayrollPayGroupListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PayrollPayGroupListPageAsync>> =
            list(PayrollPayGroupListParams.none(), requestOptions)
    }
}

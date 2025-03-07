// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.PaymentCreateResponse
import com.tryfinch.api.models.SandboxPaymentCreateParams
import java.util.concurrent.CompletableFuture

interface PaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Add a new sandbox payment */
    fun create(): CompletableFuture<PaymentCreateResponse> =
        create(SandboxPaymentCreateParams.none())

    /** @see [create] */
    fun create(
        params: SandboxPaymentCreateParams = SandboxPaymentCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentCreateResponse>

    /** @see [create] */
    fun create(
        params: SandboxPaymentCreateParams = SandboxPaymentCreateParams.none()
    ): CompletableFuture<PaymentCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<PaymentCreateResponse> =
        create(SandboxPaymentCreateParams.none(), requestOptions)

    /**
     * A view of [PaymentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /sandbox/payment`, but is otherwise the same as
         * [PaymentServiceAsync.create].
         */
        @MustBeClosed
        fun create(): CompletableFuture<HttpResponseFor<PaymentCreateResponse>> =
            create(SandboxPaymentCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: SandboxPaymentCreateParams = SandboxPaymentCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentCreateResponse>>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: SandboxPaymentCreateParams = SandboxPaymentCreateParams.none()
        ): CompletableFuture<HttpResponseFor<PaymentCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PaymentCreateResponse>> =
            create(SandboxPaymentCreateParams.none(), requestOptions)
    }
}

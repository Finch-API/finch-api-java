// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.PaymentCreateResponse
import com.tryfinch.api.models.SandboxPaymentCreateParams
import java.util.function.Consumer

interface PaymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentService

    /** Add a new sandbox payment */
    fun create(): PaymentCreateResponse = create(SandboxPaymentCreateParams.none())

    /** @see [create] */
    fun create(
        params: SandboxPaymentCreateParams = SandboxPaymentCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentCreateResponse

    /** @see [create] */
    fun create(
        params: SandboxPaymentCreateParams = SandboxPaymentCreateParams.none()
    ): PaymentCreateResponse = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): PaymentCreateResponse =
        create(SandboxPaymentCreateParams.none(), requestOptions)

    /** A view of [PaymentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sandbox/payment`, but is otherwise the same as
         * [PaymentService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<PaymentCreateResponse> =
            create(SandboxPaymentCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: SandboxPaymentCreateParams = SandboxPaymentCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentCreateResponse>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: SandboxPaymentCreateParams = SandboxPaymentCreateParams.none()
        ): HttpResponseFor<PaymentCreateResponse> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<PaymentCreateResponse> =
            create(SandboxPaymentCreateParams.none(), requestOptions)
    }
}

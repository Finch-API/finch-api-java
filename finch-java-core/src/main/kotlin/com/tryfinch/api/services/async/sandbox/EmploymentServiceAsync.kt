// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.EmploymentUpdateResponse
import com.tryfinch.api.models.SandboxEmploymentUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EmploymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmploymentServiceAsync

    /** Update sandbox employment */
    fun update(individualId: String): CompletableFuture<EmploymentUpdateResponse> =
        update(individualId, SandboxEmploymentUpdateParams.none())

    /** @see [update] */
    fun update(
        individualId: String,
        params: SandboxEmploymentUpdateParams = SandboxEmploymentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmploymentUpdateResponse> =
        update(params.toBuilder().individualId(individualId).build(), requestOptions)

    /** @see [update] */
    fun update(
        individualId: String,
        params: SandboxEmploymentUpdateParams = SandboxEmploymentUpdateParams.none(),
    ): CompletableFuture<EmploymentUpdateResponse> =
        update(individualId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: SandboxEmploymentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmploymentUpdateResponse>

    /** @see [update] */
    fun update(params: SandboxEmploymentUpdateParams): CompletableFuture<EmploymentUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        individualId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmploymentUpdateResponse> =
        update(individualId, SandboxEmploymentUpdateParams.none(), requestOptions)

    /**
     * A view of [EmploymentServiceAsync] that provides access to raw HTTP responses for each
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
        ): EmploymentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /sandbox/employment/{individual_id}`, but is
         * otherwise the same as [EmploymentServiceAsync.update].
         */
        fun update(
            individualId: String
        ): CompletableFuture<HttpResponseFor<EmploymentUpdateResponse>> =
            update(individualId, SandboxEmploymentUpdateParams.none())

        /** @see [update] */
        fun update(
            individualId: String,
            params: SandboxEmploymentUpdateParams = SandboxEmploymentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmploymentUpdateResponse>> =
            update(params.toBuilder().individualId(individualId).build(), requestOptions)

        /** @see [update] */
        fun update(
            individualId: String,
            params: SandboxEmploymentUpdateParams = SandboxEmploymentUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<EmploymentUpdateResponse>> =
            update(individualId, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: SandboxEmploymentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmploymentUpdateResponse>>

        /** @see [update] */
        fun update(
            params: SandboxEmploymentUpdateParams
        ): CompletableFuture<HttpResponseFor<EmploymentUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            individualId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmploymentUpdateResponse>> =
            update(individualId, SandboxEmploymentUpdateParams.none(), requestOptions)
    }
}

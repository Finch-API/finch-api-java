// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.IndividualUpdateResponse
import com.tryfinch.api.models.SandboxIndividualUpdateParams
import java.util.concurrent.CompletableFuture

interface IndividualServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Update sandbox individual */
    fun update(individualId: String): CompletableFuture<IndividualUpdateResponse> =
        update(individualId, SandboxIndividualUpdateParams.none())

    /** @see [update] */
    fun update(
        individualId: String,
        params: SandboxIndividualUpdateParams = SandboxIndividualUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndividualUpdateResponse> =
        update(params.toBuilder().individualId(individualId).build(), requestOptions)

    /** @see [update] */
    fun update(
        individualId: String,
        params: SandboxIndividualUpdateParams = SandboxIndividualUpdateParams.none(),
    ): CompletableFuture<IndividualUpdateResponse> =
        update(individualId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: SandboxIndividualUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndividualUpdateResponse>

    /** @see [update] */
    fun update(params: SandboxIndividualUpdateParams): CompletableFuture<IndividualUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        individualId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IndividualUpdateResponse> =
        update(individualId, SandboxIndividualUpdateParams.none(), requestOptions)

    /**
     * A view of [IndividualServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `put /sandbox/individual/{individual_id}`, but is
         * otherwise the same as [IndividualServiceAsync.update].
         */
        fun update(
            individualId: String
        ): CompletableFuture<HttpResponseFor<IndividualUpdateResponse>> =
            update(individualId, SandboxIndividualUpdateParams.none())

        /** @see [update] */
        fun update(
            individualId: String,
            params: SandboxIndividualUpdateParams = SandboxIndividualUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndividualUpdateResponse>> =
            update(params.toBuilder().individualId(individualId).build(), requestOptions)

        /** @see [update] */
        fun update(
            individualId: String,
            params: SandboxIndividualUpdateParams = SandboxIndividualUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<IndividualUpdateResponse>> =
            update(individualId, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: SandboxIndividualUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndividualUpdateResponse>>

        /** @see [update] */
        fun update(
            params: SandboxIndividualUpdateParams
        ): CompletableFuture<HttpResponseFor<IndividualUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            individualId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IndividualUpdateResponse>> =
            update(individualId, SandboxIndividualUpdateParams.none(), requestOptions)
    }
}

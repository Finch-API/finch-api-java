// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.IndividualUpdateResponse
import com.tryfinch.api.models.SandboxIndividualUpdateParams
import java.util.function.Consumer

interface IndividualService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IndividualService

    /** Update sandbox individual */
    fun update(individualId: String): IndividualUpdateResponse =
        update(individualId, SandboxIndividualUpdateParams.none())

    /** @see update */
    fun update(
        individualId: String,
        params: SandboxIndividualUpdateParams = SandboxIndividualUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndividualUpdateResponse =
        update(params.toBuilder().individualId(individualId).build(), requestOptions)

    /** @see update */
    fun update(
        individualId: String,
        params: SandboxIndividualUpdateParams = SandboxIndividualUpdateParams.none(),
    ): IndividualUpdateResponse = update(individualId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SandboxIndividualUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndividualUpdateResponse

    /** @see update */
    fun update(params: SandboxIndividualUpdateParams): IndividualUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(individualId: String, requestOptions: RequestOptions): IndividualUpdateResponse =
        update(individualId, SandboxIndividualUpdateParams.none(), requestOptions)

    /** A view of [IndividualService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IndividualService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /sandbox/individual/{individual_id}`, but is
         * otherwise the same as [IndividualService.update].
         */
        @MustBeClosed
        fun update(individualId: String): HttpResponseFor<IndividualUpdateResponse> =
            update(individualId, SandboxIndividualUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            individualId: String,
            params: SandboxIndividualUpdateParams = SandboxIndividualUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndividualUpdateResponse> =
            update(params.toBuilder().individualId(individualId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            individualId: String,
            params: SandboxIndividualUpdateParams = SandboxIndividualUpdateParams.none(),
        ): HttpResponseFor<IndividualUpdateResponse> =
            update(individualId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SandboxIndividualUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndividualUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: SandboxIndividualUpdateParams
        ): HttpResponseFor<IndividualUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            individualId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndividualUpdateResponse> =
            update(individualId, SandboxIndividualUpdateParams.none(), requestOptions)
    }
}

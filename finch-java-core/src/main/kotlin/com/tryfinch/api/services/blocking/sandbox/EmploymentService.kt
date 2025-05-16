// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.EmploymentUpdateResponse
import com.tryfinch.api.models.SandboxEmploymentUpdateParams

interface EmploymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Update sandbox employment */
    fun update(individualId: String): EmploymentUpdateResponse =
        update(individualId, SandboxEmploymentUpdateParams.none())

    /** @see [update] */
    fun update(
        individualId: String,
        params: SandboxEmploymentUpdateParams = SandboxEmploymentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmploymentUpdateResponse =
        update(params.toBuilder().individualId(individualId).build(), requestOptions)

    /** @see [update] */
    fun update(
        individualId: String,
        params: SandboxEmploymentUpdateParams = SandboxEmploymentUpdateParams.none(),
    ): EmploymentUpdateResponse = update(individualId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: SandboxEmploymentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmploymentUpdateResponse

    /** @see [update] */
    fun update(params: SandboxEmploymentUpdateParams): EmploymentUpdateResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(individualId: String, requestOptions: RequestOptions): EmploymentUpdateResponse =
        update(individualId, SandboxEmploymentUpdateParams.none(), requestOptions)

    /** A view of [EmploymentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `put /sandbox/employment/{individual_id}`, but is
         * otherwise the same as [EmploymentService.update].
         */
        @MustBeClosed
        fun update(individualId: String): HttpResponseFor<EmploymentUpdateResponse> =
            update(individualId, SandboxEmploymentUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            individualId: String,
            params: SandboxEmploymentUpdateParams = SandboxEmploymentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmploymentUpdateResponse> =
            update(params.toBuilder().individualId(individualId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            individualId: String,
            params: SandboxEmploymentUpdateParams = SandboxEmploymentUpdateParams.none(),
        ): HttpResponseFor<EmploymentUpdateResponse> =
            update(individualId, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: SandboxEmploymentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmploymentUpdateResponse>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: SandboxEmploymentUpdateParams
        ): HttpResponseFor<EmploymentUpdateResponse> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            individualId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmploymentUpdateResponse> =
            update(individualId, SandboxEmploymentUpdateParams.none(), requestOptions)
    }
}

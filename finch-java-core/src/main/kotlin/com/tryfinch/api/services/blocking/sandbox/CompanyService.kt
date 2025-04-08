// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.CompanyUpdateResponse
import com.tryfinch.api.models.SandboxCompanyUpdateParams

interface CompanyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Update a sandbox company's data */
    fun update(params: SandboxCompanyUpdateParams): CompanyUpdateResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: SandboxCompanyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyUpdateResponse

    /** A view of [CompanyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `put /sandbox/company`, but is otherwise the same as
         * [CompanyService.update].
         */
        @MustBeClosed
        fun update(params: SandboxCompanyUpdateParams): HttpResponseFor<CompanyUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: SandboxCompanyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyUpdateResponse>
    }
}

// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.Company
import com.tryfinch.api.models.HrisCompanyRetrieveParams

interface CompanyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Read basic company data */
    @JvmOverloads
    fun retrieve(
        params: HrisCompanyRetrieveParams = HrisCompanyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Company

    /** Read basic company data */
    fun retrieve(requestOptions: RequestOptions): Company =
        retrieve(HrisCompanyRetrieveParams.none(), requestOptions)

    /** A view of [CompanyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /employer/company`, but is otherwise the same as
         * [CompanyService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: HrisCompanyRetrieveParams = HrisCompanyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Company>

        /**
         * Returns a raw HTTP response for `get /employer/company`, but is otherwise the same as
         * [CompanyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<Company> =
            retrieve(HrisCompanyRetrieveParams.none(), requestOptions)
    }
}

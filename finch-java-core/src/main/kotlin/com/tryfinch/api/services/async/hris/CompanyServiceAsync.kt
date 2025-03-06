// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.Company
import com.tryfinch.api.models.HrisCompanyRetrieveParams
import java.util.concurrent.CompletableFuture

interface CompanyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Read basic company data */
    @JvmOverloads
    fun retrieve(
        params: HrisCompanyRetrieveParams = HrisCompanyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Company>

    /** Read basic company data */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<Company> =
        retrieve(HrisCompanyRetrieveParams.none(), requestOptions)

    /**
     * A view of [CompanyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /employer/company`, but is otherwise the same as
         * [CompanyServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: HrisCompanyRetrieveParams = HrisCompanyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Company>>

        /**
         * Returns a raw HTTP response for `get /employer/company`, but is otherwise the same as
         * [CompanyServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<Company>> =
            retrieve(HrisCompanyRetrieveParams.none(), requestOptions)
    }
}

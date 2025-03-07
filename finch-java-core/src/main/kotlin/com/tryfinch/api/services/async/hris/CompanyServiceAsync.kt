// File generated from our OpenAPI spec by Stainless.

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
    fun retrieve(): CompletableFuture<Company> = retrieve(HrisCompanyRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        params: HrisCompanyRetrieveParams = HrisCompanyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Company>

    /** @see [retrieve] */
    fun retrieve(
        params: HrisCompanyRetrieveParams = HrisCompanyRetrieveParams.none()
    ): CompletableFuture<Company> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
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
        @MustBeClosed
        fun retrieve(): CompletableFuture<HttpResponseFor<Company>> =
            retrieve(HrisCompanyRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: HrisCompanyRetrieveParams = HrisCompanyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Company>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: HrisCompanyRetrieveParams = HrisCompanyRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<Company>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<Company>> =
            retrieve(HrisCompanyRetrieveParams.none(), requestOptions)
    }
}

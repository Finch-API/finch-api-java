// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.Company
import com.tryfinch.api.models.HrisCompanyRetrieveParams
import com.tryfinch.api.services.blocking.hris.company.PayStatementItemService
import java.util.function.Consumer

interface CompanyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CompanyService

    fun payStatementItem(): PayStatementItemService

    /** Read basic company data */
    fun retrieve(): Company = retrieve(HrisCompanyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: HrisCompanyRetrieveParams = HrisCompanyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Company

    /** @see retrieve */
    fun retrieve(params: HrisCompanyRetrieveParams = HrisCompanyRetrieveParams.none()): Company =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): Company =
        retrieve(HrisCompanyRetrieveParams.none(), requestOptions)

    /** A view of [CompanyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CompanyService.WithRawResponse

        fun payStatementItem(): PayStatementItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /employer/company`, but is otherwise the same as
         * [CompanyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<Company> = retrieve(HrisCompanyRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: HrisCompanyRetrieveParams = HrisCompanyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Company>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: HrisCompanyRetrieveParams = HrisCompanyRetrieveParams.none()
        ): HttpResponseFor<Company> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<Company> =
            retrieve(HrisCompanyRetrieveParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.CompanyUpdateResponse
import com.tryfinch.api.models.SandboxCompanyUpdateParams
import java.util.concurrent.CompletableFuture

interface CompanyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Update a sandbox company's data */
    fun update(params: SandboxCompanyUpdateParams): CompletableFuture<CompanyUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: SandboxCompanyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompanyUpdateResponse>

    /**
     * A view of [CompanyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `put /sandbox/company`, but is otherwise the same as
         * [CompanyServiceAsync.update].
         */
        fun update(
            params: SandboxCompanyUpdateParams
        ): CompletableFuture<HttpResponseFor<CompanyUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: SandboxCompanyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompanyUpdateResponse>>
    }
}

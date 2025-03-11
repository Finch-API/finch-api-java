// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisEmploymentRetrieveManyPageAsync
import com.tryfinch.api.models.HrisEmploymentRetrieveManyParams
import java.util.concurrent.CompletableFuture

interface EmploymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Read individual employment and income data */
    fun retrieveMany(
        params: HrisEmploymentRetrieveManyParams
    ): CompletableFuture<HrisEmploymentRetrieveManyPageAsync> =
        retrieveMany(params, RequestOptions.none())

    /** @see [retrieveMany] */
    fun retrieveMany(
        params: HrisEmploymentRetrieveManyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisEmploymentRetrieveManyPageAsync>

    /**
     * A view of [EmploymentServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /employer/employment`, but is otherwise the same as
         * [EmploymentServiceAsync.retrieveMany].
         */
        @MustBeClosed
        fun retrieveMany(
            params: HrisEmploymentRetrieveManyParams
        ): CompletableFuture<HttpResponseFor<HrisEmploymentRetrieveManyPageAsync>> =
            retrieveMany(params, RequestOptions.none())

        /** @see [retrieveMany] */
        @MustBeClosed
        fun retrieveMany(
            params: HrisEmploymentRetrieveManyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HrisEmploymentRetrieveManyPageAsync>>
    }
}

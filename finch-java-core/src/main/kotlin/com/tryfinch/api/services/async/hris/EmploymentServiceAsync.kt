// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun retrieveMany(
            params: HrisEmploymentRetrieveManyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HrisEmploymentRetrieveManyPageAsync>>
    }
}

// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisIndividualRetrieveManyPageAsync
import com.tryfinch.api.models.HrisIndividualRetrieveManyParams
import java.util.concurrent.CompletableFuture

interface IndividualServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Read individual data, excluding income and employment data */
    @JvmOverloads
    fun retrieveMany(
        params: HrisIndividualRetrieveManyParams = HrisIndividualRetrieveManyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisIndividualRetrieveManyPageAsync>

    /** Read individual data, excluding income and employment data */
    fun retrieveMany(
        requestOptions: RequestOptions
    ): CompletableFuture<HrisIndividualRetrieveManyPageAsync> =
        retrieveMany(HrisIndividualRetrieveManyParams.none(), requestOptions)

    /**
     * A view of [IndividualServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /employer/individual`, but is otherwise the same as
         * [IndividualServiceAsync.retrieveMany].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieveMany(
            params: HrisIndividualRetrieveManyParams = HrisIndividualRetrieveManyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HrisIndividualRetrieveManyPageAsync>>

        /**
         * Returns a raw HTTP response for `post /employer/individual`, but is otherwise the same as
         * [IndividualServiceAsync.retrieveMany].
         */
        @MustBeClosed
        fun retrieveMany(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<HrisIndividualRetrieveManyPageAsync>> =
            retrieveMany(HrisIndividualRetrieveManyParams.none(), requestOptions)
    }
}

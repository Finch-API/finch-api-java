// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisIndividualRetrieveManyPageAsync
import com.tryfinch.api.models.HrisIndividualRetrieveManyParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface IndividualServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IndividualServiceAsync

    /** Read individual data, excluding income and employment data */
    fun retrieveMany(): CompletableFuture<HrisIndividualRetrieveManyPageAsync> =
        retrieveMany(HrisIndividualRetrieveManyParams.none())

    /** @see [retrieveMany] */
    fun retrieveMany(
        params: HrisIndividualRetrieveManyParams = HrisIndividualRetrieveManyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisIndividualRetrieveManyPageAsync>

    /** @see [retrieveMany] */
    fun retrieveMany(
        params: HrisIndividualRetrieveManyParams = HrisIndividualRetrieveManyParams.none()
    ): CompletableFuture<HrisIndividualRetrieveManyPageAsync> =
        retrieveMany(params, RequestOptions.none())

    /** @see [retrieveMany] */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IndividualServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /employer/individual`, but is otherwise the same as
         * [IndividualServiceAsync.retrieveMany].
         */
        fun retrieveMany():
            CompletableFuture<HttpResponseFor<HrisIndividualRetrieveManyPageAsync>> =
            retrieveMany(HrisIndividualRetrieveManyParams.none())

        /** @see [retrieveMany] */
        fun retrieveMany(
            params: HrisIndividualRetrieveManyParams = HrisIndividualRetrieveManyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HrisIndividualRetrieveManyPageAsync>>

        /** @see [retrieveMany] */
        fun retrieveMany(
            params: HrisIndividualRetrieveManyParams = HrisIndividualRetrieveManyParams.none()
        ): CompletableFuture<HttpResponseFor<HrisIndividualRetrieveManyPageAsync>> =
            retrieveMany(params, RequestOptions.none())

        /** @see [retrieveMany] */
        fun retrieveMany(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<HrisIndividualRetrieveManyPageAsync>> =
            retrieveMany(HrisIndividualRetrieveManyParams.none(), requestOptions)
    }
}

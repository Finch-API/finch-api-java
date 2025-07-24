// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisPayStatementRetrieveManyPageAsync
import com.tryfinch.api.models.HrisPayStatementRetrieveManyParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PayStatementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PayStatementServiceAsync

    /**
     * Read detailed pay statements for each individual.
     *
     * Deduction and contribution types are supported by the payroll systems that supports Benefits.
     */
    fun retrieveMany(
        params: HrisPayStatementRetrieveManyParams
    ): CompletableFuture<HrisPayStatementRetrieveManyPageAsync> =
        retrieveMany(params, RequestOptions.none())

    /** @see retrieveMany */
    fun retrieveMany(
        params: HrisPayStatementRetrieveManyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HrisPayStatementRetrieveManyPageAsync>

    /**
     * A view of [PayStatementServiceAsync] that provides access to raw HTTP responses for each
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
        ): PayStatementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /employer/pay-statement`, but is otherwise the same
         * as [PayStatementServiceAsync.retrieveMany].
         */
        fun retrieveMany(
            params: HrisPayStatementRetrieveManyParams
        ): CompletableFuture<HttpResponseFor<HrisPayStatementRetrieveManyPageAsync>> =
            retrieveMany(params, RequestOptions.none())

        /** @see retrieveMany */
        fun retrieveMany(
            params: HrisPayStatementRetrieveManyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HrisPayStatementRetrieveManyPageAsync>>
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.ProviderListPageAsync
import com.tryfinch.api.models.ProviderListParams
import java.util.concurrent.CompletableFuture

interface ProviderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Return details on all available payroll and HR systems. */
    fun list(): CompletableFuture<ProviderListPageAsync> = list(ProviderListParams.none())

    /** @see [list] */
    fun list(
        params: ProviderListParams = ProviderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProviderListPageAsync>

    /** @see [list] */
    fun list(
        params: ProviderListParams = ProviderListParams.none()
    ): CompletableFuture<ProviderListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProviderListPageAsync> =
        list(ProviderListParams.none(), requestOptions)

    /**
     * A view of [ProviderServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /providers`, but is otherwise the same as
         * [ProviderServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ProviderListPageAsync>> =
            list(ProviderListParams.none())

        /** @see [list] */
        fun list(
            params: ProviderListParams = ProviderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProviderListPageAsync>>

        /** @see [list] */
        fun list(
            params: ProviderListParams = ProviderListParams.none()
        ): CompletableFuture<HttpResponseFor<ProviderListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProviderListPageAsync>> =
            list(ProviderListParams.none(), requestOptions)
    }
}

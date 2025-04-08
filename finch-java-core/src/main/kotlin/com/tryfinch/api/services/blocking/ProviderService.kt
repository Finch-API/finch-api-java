// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.ProviderListPage
import com.tryfinch.api.models.ProviderListParams

interface ProviderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Return details on all available payroll and HR systems. */
    fun list(): ProviderListPage = list(ProviderListParams.none())

    /** @see [list] */
    fun list(
        params: ProviderListParams = ProviderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProviderListPage

    /** @see [list] */
    fun list(params: ProviderListParams = ProviderListParams.none()): ProviderListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ProviderListPage =
        list(ProviderListParams.none(), requestOptions)

    /** A view of [ProviderService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /providers`, but is otherwise the same as
         * [ProviderService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ProviderListPage> = list(ProviderListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProviderListParams = ProviderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProviderListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProviderListParams = ProviderListParams.none()
        ): HttpResponseFor<ProviderListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProviderListPage> =
            list(ProviderListParams.none(), requestOptions)
    }
}

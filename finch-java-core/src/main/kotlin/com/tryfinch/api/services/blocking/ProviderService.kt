// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
    fun list(
        params: ProviderListParams = ProviderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProviderListPage

    /** Return details on all available payroll and HR systems. */
    fun list(requestOptions: RequestOptions): ProviderListPage =
        list(ProviderListParams.none(), requestOptions)

    /** A view of [ProviderService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /providers`, but is otherwise the same as
         * [ProviderService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ProviderListParams = ProviderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProviderListPage>

        /**
         * Returns a raw HTTP response for `get /providers`, but is otherwise the same as
         * [ProviderService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProviderListPage> =
            list(ProviderListParams.none(), requestOptions)
    }
}

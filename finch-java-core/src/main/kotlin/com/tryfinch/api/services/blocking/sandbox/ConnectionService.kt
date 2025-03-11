// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.ConnectionCreateResponse
import com.tryfinch.api.models.SandboxConnectionCreateParams
import com.tryfinch.api.services.blocking.sandbox.connections.AccountService

interface ConnectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    fun accounts(): AccountService

    /** Create a new connection (new company/provider pair) with a new account */
    fun create(params: SandboxConnectionCreateParams): ConnectionCreateResponse =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: SandboxConnectionCreateParams, requestOptions: RequestOptions = RequestOptions.none()): ConnectionCreateResponse

    /**
     * A view of [ConnectionService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        fun accounts(): AccountService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sandbox/connections`, but is otherwise
         * the same as [ConnectionService.create].
         */
        @MustBeClosed
        fun create(params: SandboxConnectionCreateParams): HttpResponseFor<ConnectionCreateResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: SandboxConnectionCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ConnectionCreateResponse>
    }
}

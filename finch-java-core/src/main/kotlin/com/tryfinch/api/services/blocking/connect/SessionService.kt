// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.connect

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.ConnectSessionNewParams
import com.tryfinch.api.models.ConnectSessionReauthenticateParams
import com.tryfinch.api.models.SessionNewResponse
import com.tryfinch.api.models.SessionReauthenticateResponse

interface SessionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new connect session for an employer */
    @JvmOverloads
    fun new_(
        params: ConnectSessionNewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionNewResponse

    /** Create a new Connect session for reauthenticating an existing connection */
    @JvmOverloads
    fun reauthenticate(
        params: ConnectSessionReauthenticateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionReauthenticateResponse

    /** A view of [SessionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /connect/sessions`, but is otherwise the same as
         * [SessionService.new_].
         */
        @JvmOverloads
        @MustBeClosed
        fun new_(
            params: ConnectSessionNewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionNewResponse>

        /**
         * Returns a raw HTTP response for `post /connect/sessions/reauthenticate`, but is otherwise
         * the same as [SessionService.reauthenticate].
         */
        @JvmOverloads
        @MustBeClosed
        fun reauthenticate(
            params: ConnectSessionReauthenticateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionReauthenticateResponse>
    }
}

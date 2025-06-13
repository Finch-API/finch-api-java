// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.connect

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.ConnectSessionNewParams
import com.tryfinch.api.models.ConnectSessionReauthenticateParams
import com.tryfinch.api.models.SessionNewResponse
import com.tryfinch.api.models.SessionReauthenticateResponse
import java.util.function.Consumer

interface SessionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionService

    /** Create a new connect session for an employer */
    fun new_(params: ConnectSessionNewParams): SessionNewResponse =
        new_(params, RequestOptions.none())

    /** @see [new_] */
    fun new_(
        params: ConnectSessionNewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionNewResponse

    /** Create a new Connect session for reauthenticating an existing connection */
    fun reauthenticate(params: ConnectSessionReauthenticateParams): SessionReauthenticateResponse =
        reauthenticate(params, RequestOptions.none())

    /** @see [reauthenticate] */
    fun reauthenticate(
        params: ConnectSessionReauthenticateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionReauthenticateResponse

    /** A view of [SessionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /connect/sessions`, but is otherwise the same as
         * [SessionService.new_].
         */
        @MustBeClosed
        fun new_(params: ConnectSessionNewParams): HttpResponseFor<SessionNewResponse> =
            new_(params, RequestOptions.none())

        /** @see [new_] */
        @MustBeClosed
        fun new_(
            params: ConnectSessionNewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionNewResponse>

        /**
         * Returns a raw HTTP response for `post /connect/sessions/reauthenticate`, but is otherwise
         * the same as [SessionService.reauthenticate].
         */
        @MustBeClosed
        fun reauthenticate(
            params: ConnectSessionReauthenticateParams
        ): HttpResponseFor<SessionReauthenticateResponse> =
            reauthenticate(params, RequestOptions.none())

        /** @see [reauthenticate] */
        @MustBeClosed
        fun reauthenticate(
            params: ConnectSessionReauthenticateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionReauthenticateResponse>
    }
}

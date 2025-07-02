// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.connect

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.ConnectSessionNewParams
import com.tryfinch.api.models.ConnectSessionReauthenticateParams
import com.tryfinch.api.models.SessionNewResponse
import com.tryfinch.api.models.SessionReauthenticateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SessionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionServiceAsync

    /** Create a new connect session for an employer */
    fun new_(params: ConnectSessionNewParams): CompletableFuture<SessionNewResponse> =
        new_(params, RequestOptions.none())

    /** @see [new_] */
    fun new_(
        params: ConnectSessionNewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionNewResponse>

    /** Create a new Connect session for reauthenticating an existing connection */
    fun reauthenticate(
        params: ConnectSessionReauthenticateParams
    ): CompletableFuture<SessionReauthenticateResponse> =
        reauthenticate(params, RequestOptions.none())

    /** @see [reauthenticate] */
    fun reauthenticate(
        params: ConnectSessionReauthenticateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionReauthenticateResponse>

    /**
     * A view of [SessionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SessionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /connect/sessions`, but is otherwise the same as
         * [SessionServiceAsync.new_].
         */
        fun new_(
            params: ConnectSessionNewParams
        ): CompletableFuture<HttpResponseFor<SessionNewResponse>> =
            new_(params, RequestOptions.none())

        /** @see [new_] */
        fun new_(
            params: ConnectSessionNewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionNewResponse>>

        /**
         * Returns a raw HTTP response for `post /connect/sessions/reauthenticate`, but is otherwise
         * the same as [SessionServiceAsync.reauthenticate].
         */
        fun reauthenticate(
            params: ConnectSessionReauthenticateParams
        ): CompletableFuture<HttpResponseFor<SessionReauthenticateResponse>> =
            reauthenticate(params, RequestOptions.none())

        /** @see [reauthenticate] */
        fun reauthenticate(
            params: ConnectSessionReauthenticateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionReauthenticateResponse>>
    }
}

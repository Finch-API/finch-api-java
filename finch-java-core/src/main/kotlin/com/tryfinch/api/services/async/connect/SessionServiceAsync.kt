// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.connect

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.ConnectSessionConnectParams
import com.tryfinch.api.models.ConnectSessionReauthenticateParams
import com.tryfinch.api.models.SessionConnectResponse
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
    fun connect(params: ConnectSessionConnectParams): CompletableFuture<SessionConnectResponse> =
        connect(params, RequestOptions.none())

    /** @see connect */
    fun connect(
        params: ConnectSessionConnectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionConnectResponse>

    /** Create a new Connect session for reauthenticating an existing connection */
    fun reauthenticate(
        params: ConnectSessionReauthenticateParams
    ): CompletableFuture<SessionReauthenticateResponse> =
        reauthenticate(params, RequestOptions.none())

    /** @see reauthenticate */
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
         * [SessionServiceAsync.connect].
         */
        fun connect(
            params: ConnectSessionConnectParams
        ): CompletableFuture<HttpResponseFor<SessionConnectResponse>> =
            connect(params, RequestOptions.none())

        /** @see connect */
        fun connect(
            params: ConnectSessionConnectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionConnectResponse>>

        /**
         * Returns a raw HTTP response for `post /connect/sessions/reauthenticate`, but is otherwise
         * the same as [SessionServiceAsync.reauthenticate].
         */
        fun reauthenticate(
            params: ConnectSessionReauthenticateParams
        ): CompletableFuture<HttpResponseFor<SessionReauthenticateResponse>> =
            reauthenticate(params, RequestOptions.none())

        /** @see reauthenticate */
        fun reauthenticate(
            params: ConnectSessionReauthenticateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionReauthenticateResponse>>
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.AccountDisconnectEntityParams
import com.tryfinch.api.models.AccountDisconnectParams
import com.tryfinch.api.models.AccountIntrospectParams
import com.tryfinch.api.models.DisconnectEntityResponse
import com.tryfinch.api.models.DisconnectResponse
import com.tryfinch.api.models.Introspection
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountServiceAsync

    /** Disconnect one or more `access_token`s from your application. */
    fun disconnect(): CompletableFuture<DisconnectResponse> =
        disconnect(AccountDisconnectParams.none())

    /** @see disconnect */
    fun disconnect(
        params: AccountDisconnectParams = AccountDisconnectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisconnectResponse>

    /** @see disconnect */
    fun disconnect(
        params: AccountDisconnectParams = AccountDisconnectParams.none()
    ): CompletableFuture<DisconnectResponse> = disconnect(params, RequestOptions.none())

    /** @see disconnect */
    fun disconnect(requestOptions: RequestOptions): CompletableFuture<DisconnectResponse> =
        disconnect(AccountDisconnectParams.none(), requestOptions)

    /**
     * Disconnect entity(s) from a connection without affecting other entities associated with the
     * same connection.
     */
    fun disconnectEntity(
        params: AccountDisconnectEntityParams
    ): CompletableFuture<DisconnectEntityResponse> = disconnectEntity(params, RequestOptions.none())

    /** @see disconnectEntity */
    fun disconnectEntity(
        params: AccountDisconnectEntityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisconnectEntityResponse>

    /** Read account information associated with an `access_token` */
    fun introspect(): CompletableFuture<Introspection> = introspect(AccountIntrospectParams.none())

    /** @see introspect */
    fun introspect(
        params: AccountIntrospectParams = AccountIntrospectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Introspection>

    /** @see introspect */
    fun introspect(
        params: AccountIntrospectParams = AccountIntrospectParams.none()
    ): CompletableFuture<Introspection> = introspect(params, RequestOptions.none())

    /** @see introspect */
    fun introspect(requestOptions: RequestOptions): CompletableFuture<Introspection> =
        introspect(AccountIntrospectParams.none(), requestOptions)

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /disconnect`, but is otherwise the same as
         * [AccountServiceAsync.disconnect].
         */
        fun disconnect(): CompletableFuture<HttpResponseFor<DisconnectResponse>> =
            disconnect(AccountDisconnectParams.none())

        /** @see disconnect */
        fun disconnect(
            params: AccountDisconnectParams = AccountDisconnectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisconnectResponse>>

        /** @see disconnect */
        fun disconnect(
            params: AccountDisconnectParams = AccountDisconnectParams.none()
        ): CompletableFuture<HttpResponseFor<DisconnectResponse>> =
            disconnect(params, RequestOptions.none())

        /** @see disconnect */
        fun disconnect(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DisconnectResponse>> =
            disconnect(AccountDisconnectParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /disconnect-entity`, but is otherwise the same as
         * [AccountServiceAsync.disconnectEntity].
         */
        fun disconnectEntity(
            params: AccountDisconnectEntityParams
        ): CompletableFuture<HttpResponseFor<DisconnectEntityResponse>> =
            disconnectEntity(params, RequestOptions.none())

        /** @see disconnectEntity */
        fun disconnectEntity(
            params: AccountDisconnectEntityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisconnectEntityResponse>>

        /**
         * Returns a raw HTTP response for `get /introspect`, but is otherwise the same as
         * [AccountServiceAsync.introspect].
         */
        fun introspect(): CompletableFuture<HttpResponseFor<Introspection>> =
            introspect(AccountIntrospectParams.none())

        /** @see introspect */
        fun introspect(
            params: AccountIntrospectParams = AccountIntrospectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Introspection>>

        /** @see introspect */
        fun introspect(
            params: AccountIntrospectParams = AccountIntrospectParams.none()
        ): CompletableFuture<HttpResponseFor<Introspection>> =
            introspect(params, RequestOptions.none())

        /** @see introspect */
        fun introspect(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<Introspection>> =
            introspect(AccountIntrospectParams.none(), requestOptions)
    }
}

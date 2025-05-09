// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.AccountDisconnectParams
import com.tryfinch.api.models.AccountIntrospectParams
import com.tryfinch.api.models.DisconnectResponse
import com.tryfinch.api.models.Introspection
import java.util.concurrent.CompletableFuture

interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Disconnect one or more `access_token`s from your application. */
    fun disconnect(): CompletableFuture<DisconnectResponse> =
        disconnect(AccountDisconnectParams.none())

    /** @see [disconnect] */
    fun disconnect(
        params: AccountDisconnectParams = AccountDisconnectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisconnectResponse>

    /** @see [disconnect] */
    fun disconnect(
        params: AccountDisconnectParams = AccountDisconnectParams.none()
    ): CompletableFuture<DisconnectResponse> = disconnect(params, RequestOptions.none())

    /** @see [disconnect] */
    fun disconnect(requestOptions: RequestOptions): CompletableFuture<DisconnectResponse> =
        disconnect(AccountDisconnectParams.none(), requestOptions)

    /** Read account information associated with an `access_token` */
    fun introspect(): CompletableFuture<Introspection> = introspect(AccountIntrospectParams.none())

    /** @see [introspect] */
    fun introspect(
        params: AccountIntrospectParams = AccountIntrospectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Introspection>

    /** @see [introspect] */
    fun introspect(
        params: AccountIntrospectParams = AccountIntrospectParams.none()
    ): CompletableFuture<Introspection> = introspect(params, RequestOptions.none())

    /** @see [introspect] */
    fun introspect(requestOptions: RequestOptions): CompletableFuture<Introspection> =
        introspect(AccountIntrospectParams.none(), requestOptions)

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /disconnect`, but is otherwise the same as
         * [AccountServiceAsync.disconnect].
         */
        @MustBeClosed
        fun disconnect(): CompletableFuture<HttpResponseFor<DisconnectResponse>> =
            disconnect(AccountDisconnectParams.none())

        /** @see [disconnect] */
        @MustBeClosed
        fun disconnect(
            params: AccountDisconnectParams = AccountDisconnectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisconnectResponse>>

        /** @see [disconnect] */
        @MustBeClosed
        fun disconnect(
            params: AccountDisconnectParams = AccountDisconnectParams.none()
        ): CompletableFuture<HttpResponseFor<DisconnectResponse>> =
            disconnect(params, RequestOptions.none())

        /** @see [disconnect] */
        @MustBeClosed
        fun disconnect(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DisconnectResponse>> =
            disconnect(AccountDisconnectParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /introspect`, but is otherwise the same as
         * [AccountServiceAsync.introspect].
         */
        @MustBeClosed
        fun introspect(): CompletableFuture<HttpResponseFor<Introspection>> =
            introspect(AccountIntrospectParams.none())

        /** @see [introspect] */
        @MustBeClosed
        fun introspect(
            params: AccountIntrospectParams = AccountIntrospectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Introspection>>

        /** @see [introspect] */
        @MustBeClosed
        fun introspect(
            params: AccountIntrospectParams = AccountIntrospectParams.none()
        ): CompletableFuture<HttpResponseFor<Introspection>> =
            introspect(params, RequestOptions.none())

        /** @see [introspect] */
        @MustBeClosed
        fun introspect(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<Introspection>> =
            introspect(AccountIntrospectParams.none(), requestOptions)
    }
}

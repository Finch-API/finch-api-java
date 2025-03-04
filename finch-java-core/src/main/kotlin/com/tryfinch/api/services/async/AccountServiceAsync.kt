// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
    fun disconnect(
        params: AccountDisconnectParams = AccountDisconnectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisconnectResponse>

    /** Disconnect one or more `access_token`s from your application. */
    fun disconnect(requestOptions: RequestOptions): CompletableFuture<DisconnectResponse> =
        disconnect(AccountDisconnectParams.none(), requestOptions)

    /** Read account information associated with an `access_token` */
    @JvmOverloads
    fun introspect(
        params: AccountIntrospectParams = AccountIntrospectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Introspection>

    /** Read account information associated with an `access_token` */
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
        @JvmOverloads
        @MustBeClosed
        fun disconnect(
            params: AccountDisconnectParams = AccountDisconnectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisconnectResponse>>

        /**
         * Returns a raw HTTP response for `post /disconnect`, but is otherwise the same as
         * [AccountServiceAsync.disconnect].
         */
        @MustBeClosed
        fun disconnect(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DisconnectResponse>> =
            disconnect(AccountDisconnectParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /introspect`, but is otherwise the same as
         * [AccountServiceAsync.introspect].
         */
        @JvmOverloads
        @MustBeClosed
        fun introspect(
            params: AccountIntrospectParams = AccountIntrospectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Introspection>>

        /**
         * Returns a raw HTTP response for `get /introspect`, but is otherwise the same as
         * [AccountServiceAsync.introspect].
         */
        @MustBeClosed
        fun introspect(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<Introspection>> =
            introspect(AccountIntrospectParams.none(), requestOptions)
    }
}

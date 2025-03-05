// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.AccountDisconnectParams
import com.tryfinch.api.models.AccountIntrospectParams
import com.tryfinch.api.models.DisconnectResponse
import com.tryfinch.api.models.Introspection

interface AccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Disconnect one or more `access_token`s from your application. */
    @JvmOverloads
    fun disconnect(
        params: AccountDisconnectParams = AccountDisconnectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisconnectResponse

    /** Disconnect one or more `access_token`s from your application. */
    fun disconnect(requestOptions: RequestOptions): DisconnectResponse =
        disconnect(AccountDisconnectParams.none(), requestOptions)

    /** Read account information associated with an `access_token` */
    @JvmOverloads
    fun introspect(
        params: AccountIntrospectParams = AccountIntrospectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Introspection

    /** Read account information associated with an `access_token` */
    fun introspect(requestOptions: RequestOptions): Introspection =
        introspect(AccountIntrospectParams.none(), requestOptions)

    /** A view of [AccountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /disconnect`, but is otherwise the same as
         * [AccountService.disconnect].
         */
        @JvmOverloads
        @MustBeClosed
        fun disconnect(
            params: AccountDisconnectParams = AccountDisconnectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisconnectResponse>

        /**
         * Returns a raw HTTP response for `post /disconnect`, but is otherwise the same as
         * [AccountService.disconnect].
         */
        @MustBeClosed
        fun disconnect(requestOptions: RequestOptions): HttpResponseFor<DisconnectResponse> =
            disconnect(AccountDisconnectParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /introspect`, but is otherwise the same as
         * [AccountService.introspect].
         */
        @JvmOverloads
        @MustBeClosed
        fun introspect(
            params: AccountIntrospectParams = AccountIntrospectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Introspection>

        /**
         * Returns a raw HTTP response for `get /introspect`, but is otherwise the same as
         * [AccountService.introspect].
         */
        @MustBeClosed
        fun introspect(requestOptions: RequestOptions): HttpResponseFor<Introspection> =
            introspect(AccountIntrospectParams.none(), requestOptions)
    }
}

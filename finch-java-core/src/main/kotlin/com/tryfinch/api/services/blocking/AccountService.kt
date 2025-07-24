// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.AccountDisconnectParams
import com.tryfinch.api.models.AccountIntrospectParams
import com.tryfinch.api.models.DisconnectResponse
import com.tryfinch.api.models.Introspection
import java.util.function.Consumer

interface AccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService

    /** Disconnect one or more `access_token`s from your application. */
    fun disconnect(): DisconnectResponse = disconnect(AccountDisconnectParams.none())

    /** @see disconnect */
    fun disconnect(
        params: AccountDisconnectParams = AccountDisconnectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisconnectResponse

    /** @see disconnect */
    fun disconnect(
        params: AccountDisconnectParams = AccountDisconnectParams.none()
    ): DisconnectResponse = disconnect(params, RequestOptions.none())

    /** @see disconnect */
    fun disconnect(requestOptions: RequestOptions): DisconnectResponse =
        disconnect(AccountDisconnectParams.none(), requestOptions)

    /** Read account information associated with an `access_token` */
    fun introspect(): Introspection = introspect(AccountIntrospectParams.none())

    /** @see introspect */
    fun introspect(
        params: AccountIntrospectParams = AccountIntrospectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Introspection

    /** @see introspect */
    fun introspect(
        params: AccountIntrospectParams = AccountIntrospectParams.none()
    ): Introspection = introspect(params, RequestOptions.none())

    /** @see introspect */
    fun introspect(requestOptions: RequestOptions): Introspection =
        introspect(AccountIntrospectParams.none(), requestOptions)

    /** A view of [AccountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /disconnect`, but is otherwise the same as
         * [AccountService.disconnect].
         */
        @MustBeClosed
        fun disconnect(): HttpResponseFor<DisconnectResponse> =
            disconnect(AccountDisconnectParams.none())

        /** @see disconnect */
        @MustBeClosed
        fun disconnect(
            params: AccountDisconnectParams = AccountDisconnectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisconnectResponse>

        /** @see disconnect */
        @MustBeClosed
        fun disconnect(
            params: AccountDisconnectParams = AccountDisconnectParams.none()
        ): HttpResponseFor<DisconnectResponse> = disconnect(params, RequestOptions.none())

        /** @see disconnect */
        @MustBeClosed
        fun disconnect(requestOptions: RequestOptions): HttpResponseFor<DisconnectResponse> =
            disconnect(AccountDisconnectParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /introspect`, but is otherwise the same as
         * [AccountService.introspect].
         */
        @MustBeClosed
        fun introspect(): HttpResponseFor<Introspection> =
            introspect(AccountIntrospectParams.none())

        /** @see introspect */
        @MustBeClosed
        fun introspect(
            params: AccountIntrospectParams = AccountIntrospectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Introspection>

        /** @see introspect */
        @MustBeClosed
        fun introspect(
            params: AccountIntrospectParams = AccountIntrospectParams.none()
        ): HttpResponseFor<Introspection> = introspect(params, RequestOptions.none())

        /** @see introspect */
        @MustBeClosed
        fun introspect(requestOptions: RequestOptions): HttpResponseFor<Introspection> =
            introspect(AccountIntrospectParams.none(), requestOptions)
    }
}

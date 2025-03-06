// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.sandbox.connections

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.AccountCreateResponse
import com.tryfinch.api.models.AccountUpdateResponse
import com.tryfinch.api.models.SandboxConnectionAccountCreateParams
import com.tryfinch.api.models.SandboxConnectionAccountUpdateParams
import java.util.concurrent.CompletableFuture

interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new account for an existing connection (company/provider pair) */
    @JvmOverloads
    fun create(
        params: SandboxConnectionAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountCreateResponse>

    /**
     * Update an existing sandbox account. Change the connection status to understand how the Finch
     * API responds.
     */
    @JvmOverloads
    fun update(
        params: SandboxConnectionAccountUpdateParams = SandboxConnectionAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountUpdateResponse>

    /**
     * Update an existing sandbox account. Change the connection status to understand how the Finch
     * API responds.
     */
    fun update(requestOptions: RequestOptions): CompletableFuture<AccountUpdateResponse> =
        update(SandboxConnectionAccountUpdateParams.none(), requestOptions)

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /sandbox/connections/accounts`, but is otherwise
         * the same as [AccountServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: SandboxConnectionAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountCreateResponse>>

        /**
         * Returns a raw HTTP response for `put /sandbox/connections/accounts`, but is otherwise the
         * same as [AccountServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: SandboxConnectionAccountUpdateParams =
                SandboxConnectionAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountUpdateResponse>>

        /**
         * Returns a raw HTTP response for `put /sandbox/connections/accounts`, but is otherwise the
         * same as [AccountServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountUpdateResponse>> =
            update(SandboxConnectionAccountUpdateParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox.connections

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.AccountCreateResponse
import com.tryfinch.api.models.AccountUpdateResponse
import com.tryfinch.api.models.SandboxConnectionAccountCreateParams
import com.tryfinch.api.models.SandboxConnectionAccountUpdateParams
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

    /** Create a new account for an existing connection (company/provider pair) */
    fun create(params: SandboxConnectionAccountCreateParams): AccountCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: SandboxConnectionAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountCreateResponse

    /**
     * Update an existing sandbox account. Change the connection status to understand how the Finch
     * API responds.
     */
    fun update(): AccountUpdateResponse = update(SandboxConnectionAccountUpdateParams.none())

    /** @see [update] */
    fun update(
        params: SandboxConnectionAccountUpdateParams = SandboxConnectionAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountUpdateResponse

    /** @see [update] */
    fun update(
        params: SandboxConnectionAccountUpdateParams = SandboxConnectionAccountUpdateParams.none()
    ): AccountUpdateResponse = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(requestOptions: RequestOptions): AccountUpdateResponse =
        update(SandboxConnectionAccountUpdateParams.none(), requestOptions)

    /** A view of [AccountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sandbox/connections/accounts`, but is otherwise
         * the same as [AccountService.create].
         */
        @MustBeClosed
        fun create(
            params: SandboxConnectionAccountCreateParams
        ): HttpResponseFor<AccountCreateResponse> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: SandboxConnectionAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountCreateResponse>

        /**
         * Returns a raw HTTP response for `put /sandbox/connections/accounts`, but is otherwise the
         * same as [AccountService.update].
         */
        @MustBeClosed
        fun update(): HttpResponseFor<AccountUpdateResponse> =
            update(SandboxConnectionAccountUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: SandboxConnectionAccountUpdateParams =
                SandboxConnectionAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountUpdateResponse>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: SandboxConnectionAccountUpdateParams =
                SandboxConnectionAccountUpdateParams.none()
        ): HttpResponseFor<AccountUpdateResponse> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(requestOptions: RequestOptions): HttpResponseFor<AccountUpdateResponse> =
            update(SandboxConnectionAccountUpdateParams.none(), requestOptions)
    }
}

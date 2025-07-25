// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.DirectoryCreateResponse
import com.tryfinch.api.models.SandboxDirectoryCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DirectoryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirectoryServiceAsync

    /** Add new individuals to a sandbox company */
    fun create(): CompletableFuture<List<DirectoryCreateResponse>> =
        create(SandboxDirectoryCreateParams.none())

    /** @see create */
    fun create(
        params: SandboxDirectoryCreateParams = SandboxDirectoryCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DirectoryCreateResponse>>

    /** @see create */
    fun create(
        params: SandboxDirectoryCreateParams = SandboxDirectoryCreateParams.none()
    ): CompletableFuture<List<DirectoryCreateResponse>> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<List<DirectoryCreateResponse>> =
        create(SandboxDirectoryCreateParams.none(), requestOptions)

    /**
     * A view of [DirectoryServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DirectoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sandbox/directory`, but is otherwise the same as
         * [DirectoryServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<List<DirectoryCreateResponse>>> =
            create(SandboxDirectoryCreateParams.none())

        /** @see create */
        fun create(
            params: SandboxDirectoryCreateParams = SandboxDirectoryCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DirectoryCreateResponse>>>

        /** @see create */
        fun create(
            params: SandboxDirectoryCreateParams = SandboxDirectoryCreateParams.none()
        ): CompletableFuture<HttpResponseFor<List<DirectoryCreateResponse>>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<DirectoryCreateResponse>>> =
            create(SandboxDirectoryCreateParams.none(), requestOptions)
    }
}

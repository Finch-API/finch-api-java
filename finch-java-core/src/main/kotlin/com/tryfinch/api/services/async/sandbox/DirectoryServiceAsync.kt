// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.DirectoryCreateResponse
import com.tryfinch.api.models.SandboxDirectoryCreateParams
import java.util.concurrent.CompletableFuture

interface DirectoryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Add new individuals to a sandbox company */
    fun create(): CompletableFuture<List<DirectoryCreateResponse>> =
        create(SandboxDirectoryCreateParams.none())

    /** @see [create] */
    fun create(
        params: SandboxDirectoryCreateParams = SandboxDirectoryCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DirectoryCreateResponse>>

    /** @see [create] */
    fun create(
        params: SandboxDirectoryCreateParams = SandboxDirectoryCreateParams.none()
    ): CompletableFuture<List<DirectoryCreateResponse>> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<List<DirectoryCreateResponse>> =
        create(SandboxDirectoryCreateParams.none(), requestOptions)

    /**
     * A view of [DirectoryServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /sandbox/directory`, but is otherwise the same as
         * [DirectoryServiceAsync.create].
         */
        @MustBeClosed
        fun create(): CompletableFuture<HttpResponseFor<List<DirectoryCreateResponse>>> =
            create(SandboxDirectoryCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: SandboxDirectoryCreateParams = SandboxDirectoryCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DirectoryCreateResponse>>>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: SandboxDirectoryCreateParams = SandboxDirectoryCreateParams.none()
        ): CompletableFuture<HttpResponseFor<List<DirectoryCreateResponse>>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<DirectoryCreateResponse>>> =
            create(SandboxDirectoryCreateParams.none(), requestOptions)
    }
}

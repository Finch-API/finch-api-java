// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.sandbox

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.SandboxDirectoryCreateParams

interface DirectoryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Add new individuals to a sandbox company */
    @JvmOverloads
    fun create(
        params: SandboxDirectoryCreateParams = SandboxDirectoryCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<JsonValue>

    /** Add new individuals to a sandbox company */
    fun create(requestOptions: RequestOptions): List<JsonValue> =
        create(SandboxDirectoryCreateParams.none(), requestOptions)

    /** A view of [DirectoryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /sandbox/directory`, but is otherwise the same as
         * [DirectoryService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: SandboxDirectoryCreateParams = SandboxDirectoryCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<JsonValue>>

        /**
         * Returns a raw HTTP response for `post /sandbox/directory`, but is otherwise the same as
         * [DirectoryService.create].
         */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<List<JsonValue>> =
            create(SandboxDirectoryCreateParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.sandbox

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.JobCreateResponse
import com.tryfinch.api.models.SandboxJobCreateParams
import com.tryfinch.api.services.async.sandbox.jobs.ConfigurationServiceAsync
import java.util.concurrent.CompletableFuture

interface JobServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun configuration(): ConfigurationServiceAsync

    /** Enqueue a new sandbox job */
    @JvmOverloads
    fun create(
        params: SandboxJobCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JobCreateResponse>

    /** A view of [JobServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun configuration(): ConfigurationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sandbox/jobs`, but is otherwise the same as
         * [JobServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: SandboxJobCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JobCreateResponse>>
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.JobCreateResponse
import com.tryfinch.api.models.SandboxJobCreateParams
import com.tryfinch.api.services.async.sandbox.jobs.ConfigurationServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface JobServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobServiceAsync

    fun configuration(): ConfigurationServiceAsync

    /** Enqueue a new sandbox job */
    fun create(params: SandboxJobCreateParams): CompletableFuture<JobCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SandboxJobCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JobCreateResponse>

    /** A view of [JobServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobServiceAsync.WithRawResponse

        fun configuration(): ConfigurationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sandbox/jobs`, but is otherwise the same as
         * [JobServiceAsync.create].
         */
        fun create(
            params: SandboxJobCreateParams
        ): CompletableFuture<HttpResponseFor<JobCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SandboxJobCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JobCreateResponse>>
    }
}

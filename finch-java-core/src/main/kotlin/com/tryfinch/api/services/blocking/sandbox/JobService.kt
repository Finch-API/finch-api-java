// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.sandbox

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.JobCreateResponse
import com.tryfinch.api.models.SandboxJobCreateParams
import com.tryfinch.api.services.blocking.sandbox.jobs.ConfigurationService

interface JobService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun configuration(): ConfigurationService

    /** Enqueue a new sandbox job */
    @JvmOverloads
    fun create(
        params: SandboxJobCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobCreateResponse

    /** A view of [JobService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun configuration(): ConfigurationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sandbox/jobs`, but is otherwise the same as
         * [JobService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: SandboxJobCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobCreateResponse>
    }
}

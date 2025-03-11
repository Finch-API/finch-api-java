// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.jobs

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.JobManualRetrieveParams
import com.tryfinch.api.models.ManualAsyncJob
import java.util.concurrent.CompletableFuture

interface ManualServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get a manual job by `job_id`. Manual jobs are completed by a human and include
     * Assisted Benefits jobs.
     */
    fun retrieve(params: JobManualRetrieveParams): CompletableFuture<ManualAsyncJob> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: JobManualRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ManualAsyncJob>

    /**
     * A view of [ManualServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /jobs/manual/{job_id}`, but is otherwise
         * the same as [ManualServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: JobManualRetrieveParams): CompletableFuture<HttpResponseFor<ManualAsyncJob>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: JobManualRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ManualAsyncJob>>
    }
}

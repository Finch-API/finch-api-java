// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.jobs

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.JobManualRetrieveParams
import com.tryfinch.api.models.ManualAsyncJob
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ManualServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManualServiceAsync

    /**
     * Get a manual job by `job_id`. Manual jobs are completed by a human and include Assisted
     * Benefits jobs.
     */
    fun retrieve(jobId: String): CompletableFuture<ManualAsyncJob> =
        retrieve(jobId, JobManualRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        jobId: String,
        params: JobManualRetrieveParams = JobManualRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManualAsyncJob> =
        retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        jobId: String,
        params: JobManualRetrieveParams = JobManualRetrieveParams.none(),
    ): CompletableFuture<ManualAsyncJob> = retrieve(jobId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: JobManualRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManualAsyncJob>

    /** @see retrieve */
    fun retrieve(params: JobManualRetrieveParams): CompletableFuture<ManualAsyncJob> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(jobId: String, requestOptions: RequestOptions): CompletableFuture<ManualAsyncJob> =
        retrieve(jobId, JobManualRetrieveParams.none(), requestOptions)

    /**
     * A view of [ManualServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ManualServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /jobs/manual/{job_id}`, but is otherwise the same as
         * [ManualServiceAsync.retrieve].
         */
        fun retrieve(jobId: String): CompletableFuture<HttpResponseFor<ManualAsyncJob>> =
            retrieve(jobId, JobManualRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            jobId: String,
            params: JobManualRetrieveParams = JobManualRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManualAsyncJob>> =
            retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            jobId: String,
            params: JobManualRetrieveParams = JobManualRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ManualAsyncJob>> =
            retrieve(jobId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: JobManualRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManualAsyncJob>>

        /** @see retrieve */
        fun retrieve(
            params: JobManualRetrieveParams
        ): CompletableFuture<HttpResponseFor<ManualAsyncJob>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            jobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ManualAsyncJob>> =
            retrieve(jobId, JobManualRetrieveParams.none(), requestOptions)
    }
}

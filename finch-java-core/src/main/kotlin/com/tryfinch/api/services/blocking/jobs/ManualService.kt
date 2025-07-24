// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.jobs

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.JobManualRetrieveParams
import com.tryfinch.api.models.ManualAsyncJob
import java.util.function.Consumer

interface ManualService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManualService

    /**
     * Get a manual job by `job_id`. Manual jobs are completed by a human and include Assisted
     * Benefits jobs.
     */
    fun retrieve(jobId: String): ManualAsyncJob = retrieve(jobId, JobManualRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        jobId: String,
        params: JobManualRetrieveParams = JobManualRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManualAsyncJob = retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        jobId: String,
        params: JobManualRetrieveParams = JobManualRetrieveParams.none(),
    ): ManualAsyncJob = retrieve(jobId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: JobManualRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManualAsyncJob

    /** @see retrieve */
    fun retrieve(params: JobManualRetrieveParams): ManualAsyncJob =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(jobId: String, requestOptions: RequestOptions): ManualAsyncJob =
        retrieve(jobId, JobManualRetrieveParams.none(), requestOptions)

    /** A view of [ManualService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManualService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /jobs/manual/{job_id}`, but is otherwise the same as
         * [ManualService.retrieve].
         */
        @MustBeClosed
        fun retrieve(jobId: String): HttpResponseFor<ManualAsyncJob> =
            retrieve(jobId, JobManualRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            jobId: String,
            params: JobManualRetrieveParams = JobManualRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManualAsyncJob> =
            retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            jobId: String,
            params: JobManualRetrieveParams = JobManualRetrieveParams.none(),
        ): HttpResponseFor<ManualAsyncJob> = retrieve(jobId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: JobManualRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManualAsyncJob>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: JobManualRetrieveParams): HttpResponseFor<ManualAsyncJob> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            jobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManualAsyncJob> =
            retrieve(jobId, JobManualRetrieveParams.none(), requestOptions)
    }
}

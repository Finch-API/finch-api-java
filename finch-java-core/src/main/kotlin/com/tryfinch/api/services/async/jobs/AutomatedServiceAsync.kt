// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.jobs

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.AutomatedAsyncJob
import com.tryfinch.api.models.AutomatedCreateResponse
import com.tryfinch.api.models.AutomatedListResponse
import com.tryfinch.api.models.JobAutomatedCreateParams
import com.tryfinch.api.models.JobAutomatedListParams
import com.tryfinch.api.models.JobAutomatedRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AutomatedServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutomatedServiceAsync

    /**
     * Enqueue an automated job.
     *
     * `data_sync_all`: Enqueue a job to re-sync all data for a connection. `data_sync_all` has a
     * concurrency limit of 1 job at a time per connection. This means that if this endpoint is
     * called while a job is already in progress for this connection, Finch will return the `job_id`
     * of the job that is currently in progress. Finch allows a fixed window rate limit of 1 forced
     * refresh per hour per connection.
     *
     * `w4_form_employee_sync`: Enqueues a job for sync W-4 data for a particular individual,
     * identified by `individual_id`. This feature is currently in beta.
     *
     * This endpoint is available for _Scale_ tier customers as an add-on. To request access to this
     * endpoint, please contact your Finch account manager.
     */
    fun create(): CompletableFuture<AutomatedCreateResponse> =
        create(JobAutomatedCreateParams.none())

    /** @see [create] */
    fun create(
        params: JobAutomatedCreateParams = JobAutomatedCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutomatedCreateResponse>

    /** @see [create] */
    fun create(
        params: JobAutomatedCreateParams = JobAutomatedCreateParams.none()
    ): CompletableFuture<AutomatedCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<AutomatedCreateResponse> =
        create(JobAutomatedCreateParams.none(), requestOptions)

    /** Get an automated job by `job_id`. */
    fun retrieve(jobId: String): CompletableFuture<AutomatedAsyncJob> =
        retrieve(jobId, JobAutomatedRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        jobId: String,
        params: JobAutomatedRetrieveParams = JobAutomatedRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutomatedAsyncJob> =
        retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        jobId: String,
        params: JobAutomatedRetrieveParams = JobAutomatedRetrieveParams.none(),
    ): CompletableFuture<AutomatedAsyncJob> = retrieve(jobId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: JobAutomatedRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutomatedAsyncJob>

    /** @see [retrieve] */
    fun retrieve(params: JobAutomatedRetrieveParams): CompletableFuture<AutomatedAsyncJob> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        jobId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AutomatedAsyncJob> =
        retrieve(jobId, JobAutomatedRetrieveParams.none(), requestOptions)

    /**
     * Get all automated jobs. Automated jobs are completed by a machine. By default, jobs are
     * sorted in descending order by submission time. For scheduled jobs such as data syncs, only
     * the next scheduled job is shown.
     */
    fun list(): CompletableFuture<AutomatedListResponse> = list(JobAutomatedListParams.none())

    /** @see [list] */
    fun list(
        params: JobAutomatedListParams = JobAutomatedListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutomatedListResponse>

    /** @see [list] */
    fun list(
        params: JobAutomatedListParams = JobAutomatedListParams.none()
    ): CompletableFuture<AutomatedListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<AutomatedListResponse> =
        list(JobAutomatedListParams.none(), requestOptions)

    /**
     * A view of [AutomatedServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutomatedServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /jobs/automated`, but is otherwise the same as
         * [AutomatedServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<AutomatedCreateResponse>> =
            create(JobAutomatedCreateParams.none())

        /** @see [create] */
        fun create(
            params: JobAutomatedCreateParams = JobAutomatedCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutomatedCreateResponse>>

        /** @see [create] */
        fun create(
            params: JobAutomatedCreateParams = JobAutomatedCreateParams.none()
        ): CompletableFuture<HttpResponseFor<AutomatedCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AutomatedCreateResponse>> =
            create(JobAutomatedCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /jobs/automated/{job_id}`, but is otherwise the same
         * as [AutomatedServiceAsync.retrieve].
         */
        fun retrieve(jobId: String): CompletableFuture<HttpResponseFor<AutomatedAsyncJob>> =
            retrieve(jobId, JobAutomatedRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            jobId: String,
            params: JobAutomatedRetrieveParams = JobAutomatedRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutomatedAsyncJob>> =
            retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            jobId: String,
            params: JobAutomatedRetrieveParams = JobAutomatedRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AutomatedAsyncJob>> =
            retrieve(jobId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: JobAutomatedRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutomatedAsyncJob>>

        /** @see [retrieve] */
        fun retrieve(
            params: JobAutomatedRetrieveParams
        ): CompletableFuture<HttpResponseFor<AutomatedAsyncJob>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            jobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AutomatedAsyncJob>> =
            retrieve(jobId, JobAutomatedRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /jobs/automated`, but is otherwise the same as
         * [AutomatedServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AutomatedListResponse>> =
            list(JobAutomatedListParams.none())

        /** @see [list] */
        fun list(
            params: JobAutomatedListParams = JobAutomatedListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutomatedListResponse>>

        /** @see [list] */
        fun list(
            params: JobAutomatedListParams = JobAutomatedListParams.none()
        ): CompletableFuture<HttpResponseFor<AutomatedListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AutomatedListResponse>> =
            list(JobAutomatedListParams.none(), requestOptions)
    }
}

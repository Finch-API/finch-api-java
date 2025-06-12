// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.jobs

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.AutomatedAsyncJob
import com.tryfinch.api.models.AutomatedCreateResponse
import com.tryfinch.api.models.AutomatedListResponse
import com.tryfinch.api.models.JobAutomatedCreateParams
import com.tryfinch.api.models.JobAutomatedListParams
import com.tryfinch.api.models.JobAutomatedRetrieveParams
import java.util.function.Consumer

interface AutomatedService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutomatedService

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
    fun create(): AutomatedCreateResponse = create(JobAutomatedCreateParams.none())

    /** @see [create] */
    fun create(
        params: JobAutomatedCreateParams = JobAutomatedCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutomatedCreateResponse

    /** @see [create] */
    fun create(
        params: JobAutomatedCreateParams = JobAutomatedCreateParams.none()
    ): AutomatedCreateResponse = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): AutomatedCreateResponse =
        create(JobAutomatedCreateParams.none(), requestOptions)

    /** Get an automated job by `job_id`. */
    fun retrieve(jobId: String): AutomatedAsyncJob =
        retrieve(jobId, JobAutomatedRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        jobId: String,
        params: JobAutomatedRetrieveParams = JobAutomatedRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutomatedAsyncJob = retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        jobId: String,
        params: JobAutomatedRetrieveParams = JobAutomatedRetrieveParams.none(),
    ): AutomatedAsyncJob = retrieve(jobId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: JobAutomatedRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutomatedAsyncJob

    /** @see [retrieve] */
    fun retrieve(params: JobAutomatedRetrieveParams): AutomatedAsyncJob =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(jobId: String, requestOptions: RequestOptions): AutomatedAsyncJob =
        retrieve(jobId, JobAutomatedRetrieveParams.none(), requestOptions)

    /**
     * Get all automated jobs. Automated jobs are completed by a machine. By default, jobs are
     * sorted in descending order by submission time. For scheduled jobs such as data syncs, only
     * the next scheduled job is shown.
     */
    fun list(): AutomatedListResponse = list(JobAutomatedListParams.none())

    /** @see [list] */
    fun list(
        params: JobAutomatedListParams = JobAutomatedListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutomatedListResponse

    /** @see [list] */
    fun list(
        params: JobAutomatedListParams = JobAutomatedListParams.none()
    ): AutomatedListResponse = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): AutomatedListResponse =
        list(JobAutomatedListParams.none(), requestOptions)

    /** A view of [AutomatedService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutomatedService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /jobs/automated`, but is otherwise the same as
         * [AutomatedService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<AutomatedCreateResponse> =
            create(JobAutomatedCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: JobAutomatedCreateParams = JobAutomatedCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutomatedCreateResponse>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: JobAutomatedCreateParams = JobAutomatedCreateParams.none()
        ): HttpResponseFor<AutomatedCreateResponse> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<AutomatedCreateResponse> =
            create(JobAutomatedCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /jobs/automated/{job_id}`, but is otherwise the same
         * as [AutomatedService.retrieve].
         */
        @MustBeClosed
        fun retrieve(jobId: String): HttpResponseFor<AutomatedAsyncJob> =
            retrieve(jobId, JobAutomatedRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            jobId: String,
            params: JobAutomatedRetrieveParams = JobAutomatedRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutomatedAsyncJob> =
            retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            jobId: String,
            params: JobAutomatedRetrieveParams = JobAutomatedRetrieveParams.none(),
        ): HttpResponseFor<AutomatedAsyncJob> = retrieve(jobId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: JobAutomatedRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutomatedAsyncJob>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: JobAutomatedRetrieveParams): HttpResponseFor<AutomatedAsyncJob> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            jobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AutomatedAsyncJob> =
            retrieve(jobId, JobAutomatedRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /jobs/automated`, but is otherwise the same as
         * [AutomatedService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AutomatedListResponse> = list(JobAutomatedListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: JobAutomatedListParams = JobAutomatedListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutomatedListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: JobAutomatedListParams = JobAutomatedListParams.none()
        ): HttpResponseFor<AutomatedListResponse> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AutomatedListResponse> =
            list(JobAutomatedListParams.none(), requestOptions)
    }
}

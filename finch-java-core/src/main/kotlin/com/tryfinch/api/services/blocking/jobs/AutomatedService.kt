// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking.jobs

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.AutomatedAsyncJob
import com.tryfinch.api.models.AutomatedCreateResponse
import com.tryfinch.api.models.JobAutomatedCreateParams
import com.tryfinch.api.models.JobAutomatedListPage
import com.tryfinch.api.models.JobAutomatedListParams
import com.tryfinch.api.models.JobAutomatedRetrieveParams

interface AutomatedService {

    /**
     * Enqueue an automated job. Currently, only the `data_sync_all` job type is supported, which
     * will enqueue a job to re-sync all data for a connection. `data_sync_all` has a concurrency
     * limit of 1 job at a time per connection. This means that if this endpoint is called while a
     * job is already in progress for this connection, Finch will return the `job_id` of the job
     * that is currently in progress. Finch allows a fixed window rate limit of 1 forced refresh per
     * hour per connection.
     *
     * This endpoint is available for _Scale_ tier customers as an add-on. To request access to this
     * endpoint, please contact your Finch account manager.
     */
    @JvmOverloads
    fun create(
        params: JobAutomatedCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AutomatedCreateResponse

    /** Get an automated job by `job_id`. */
    @JvmOverloads
    fun retrieve(
        params: JobAutomatedRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AutomatedAsyncJob

    /**
     * Get all automated jobs. Automated jobs are completed by a machine. By default, jobs are
     * sorted in descending order by submission time. For scheduled jobs such as data syncs, only
     * the next scheduled job is shown.
     */
    @JvmOverloads
    fun list(
        params: JobAutomatedListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): JobAutomatedListPage
}

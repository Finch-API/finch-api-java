// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.jobs

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.json
import com.tryfinch.api.core.prepare
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.AutomatedAsyncJob
import com.tryfinch.api.models.AutomatedCreateResponse
import com.tryfinch.api.models.JobAutomatedCreateParams
import com.tryfinch.api.models.JobAutomatedListPage
import com.tryfinch.api.models.JobAutomatedListParams
import com.tryfinch.api.models.JobAutomatedRetrieveParams

class AutomatedServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : AutomatedService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AutomatedCreateResponse> =
        jsonHandler<AutomatedCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

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
    override fun create(
        params: JobAutomatedCreateParams,
        requestOptions: RequestOptions
    ): AutomatedCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("jobs", "automated")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<AutomatedAsyncJob> =
        jsonHandler<AutomatedAsyncJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get an automated job by `job_id`. */
    override fun retrieve(
        params: JobAutomatedRetrieveParams,
        requestOptions: RequestOptions
    ): AutomatedAsyncJob {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("jobs", "automated", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<JobAutomatedListPage.Response> =
        jsonHandler<JobAutomatedListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Get all automated jobs. Automated jobs are completed by a machine. By default, jobs are
     * sorted in descending order by submission time. For scheduled jobs such as data syncs, only
     * the next scheduled job is shown.
     */
    override fun list(
        params: JobAutomatedListParams,
        requestOptions: RequestOptions
    ): JobAutomatedListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("jobs", "automated")
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { JobAutomatedListPage.of(this, params, it) }
        }
    }
}

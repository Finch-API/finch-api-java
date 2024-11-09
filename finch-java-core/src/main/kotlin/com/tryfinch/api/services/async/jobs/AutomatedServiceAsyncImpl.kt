// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.jobs

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.json
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.AutomatedAsyncJob
import com.tryfinch.api.models.AutomatedCreateResponse
import com.tryfinch.api.models.JobAutomatedCreateParams
import com.tryfinch.api.models.JobAutomatedListPageAsync
import com.tryfinch.api.models.JobAutomatedListParams
import com.tryfinch.api.models.JobAutomatedRetrieveParams
import java.util.concurrent.CompletableFuture

class AutomatedServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : AutomatedServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AutomatedCreateResponse> =
        jsonHandler<AutomatedCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

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
    override fun create(
        params: JobAutomatedCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AutomatedCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("jobs", "automated")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
    ): CompletableFuture<AutomatedAsyncJob> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("jobs", "automated", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<JobAutomatedListPageAsync.Response> =
        jsonHandler<JobAutomatedListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Get all automated jobs. Automated jobs are completed by a machine. By default, jobs are
     * sorted in descending order by submission time. For scheduled jobs such as data syncs, only
     * the next scheduled job is shown.
     */
    override fun list(
        params: JobAutomatedListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<JobAutomatedListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("jobs", "automated")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { JobAutomatedListPageAsync.of(this, params, it) }
        }
    }
}

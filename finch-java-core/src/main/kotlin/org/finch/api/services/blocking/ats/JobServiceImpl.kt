package org.finch.api.services.blocking.ats

import org.finch.api.core.ClientOptions
import org.finch.api.core.RequestOptions
import org.finch.api.core.http.HttpMethod
import org.finch.api.core.http.HttpRequest
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.models.AtsJobListPage
import org.finch.api.models.AtsJobListParams
import org.finch.api.models.AtsJobRetrieveParams
import org.finch.api.models.Job
import org.finch.api.services.errorHandler
import org.finch.api.services.jsonHandler
import org.finch.api.services.withErrorHandler

class JobServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : JobService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Job> =
        jsonHandler<Job>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Gets a job from an organization. */
    override fun retrieve(params: AtsJobRetrieveParams, requestOptions: RequestOptions): Job {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ats", "jobs", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<AtsJobListPage.Response> =
        jsonHandler<AtsJobListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Gets all of an organization's jobs. */
    override fun list(params: AtsJobListParams, requestOptions: RequestOptions): AtsJobListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ats", "jobs")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { AtsJobListPage.of(this, params, it) }
        }
    }
}

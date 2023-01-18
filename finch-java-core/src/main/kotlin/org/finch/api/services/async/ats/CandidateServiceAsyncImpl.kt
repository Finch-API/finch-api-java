package org.finch.api.services.async.ats

import java.util.concurrent.CompletableFuture
import org.finch.api.core.ClientOptions
import org.finch.api.core.RequestOptions
import org.finch.api.core.http.HttpMethod
import org.finch.api.core.http.HttpRequest
import org.finch.api.core.http.HttpResponse.Handler
import org.finch.api.errors.FinchError
import org.finch.api.models.AtsCandidateListPageAsync
import org.finch.api.models.AtsCandidateListParams
import org.finch.api.models.AtsCandidateRetrieveParams
import org.finch.api.models.Candidate
import org.finch.api.services.errorHandler
import org.finch.api.services.jsonHandler
import org.finch.api.services.withErrorHandler

class CandidateServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CandidateServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Candidate> =
        jsonHandler<Candidate>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Gets a candidate from an organization. A candidate represents an individual associated with
     * one or more applications.
     */
    override fun retrieve(
        params: AtsCandidateRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Candidate> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ats", "candidates", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<AtsCandidateListPageAsync.Response> =
        jsonHandler<AtsCandidateListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Gets all of an organization's candidates. A candidate represents an individual associated
     * with one or more applications.
     */
    override fun list(
        params: AtsCandidateListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AtsCandidateListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ats", "candidates")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { AtsCandidateListPageAsync.of(this, params, it) }
        }
    }
}

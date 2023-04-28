package com.tryfinch.api.services.async.ats

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.AtsCandidateListPageAsync
import com.tryfinch.api.models.AtsCandidateListParams
import com.tryfinch.api.models.AtsCandidateRetrieveParams
import com.tryfinch.api.models.Candidate
import com.tryfinch.api.services.errorHandler
import com.tryfinch.api.services.jsonHandler
import com.tryfinch.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

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

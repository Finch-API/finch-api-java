// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.DocumentListResponse
import com.tryfinch.api.models.DocumentRetreiveResponse
import com.tryfinch.api.models.HrisDocumentListParams
import com.tryfinch.api.models.HrisDocumentRetreiveParams
import java.util.concurrent.CompletableFuture

class DocumentServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : DocumentServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<DocumentListResponse> =
        jsonHandler<DocumentListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * **Beta:** This endpoint is in beta and may change. Retrieve a list of company-wide documents.
     */
    override fun list(
        params: HrisDocumentListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<DocumentListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "documents")
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
        }
    }

    private val retreiveHandler: Handler<DocumentRetreiveResponse> =
        jsonHandler<DocumentRetreiveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * **Beta:** This endpoint is in beta and may change. Retrieve details of a specific document by
     * its ID.
     */
    override fun retreive(
        params: HrisDocumentRetreiveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<DocumentRetreiveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "documents", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retreiveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
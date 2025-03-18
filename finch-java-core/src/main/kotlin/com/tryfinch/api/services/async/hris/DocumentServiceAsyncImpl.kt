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
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepareAsync
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.DocumentListResponse
import com.tryfinch.api.models.DocumentRetreiveResponse
import com.tryfinch.api.models.HrisDocumentListParams
import com.tryfinch.api.models.HrisDocumentRetreiveParams
import java.util.concurrent.CompletableFuture

class DocumentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DocumentServiceAsync {

    private val withRawResponse: DocumentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DocumentServiceAsync.WithRawResponse = withRawResponse

    override fun list(
        params: HrisDocumentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentListResponse> =
        // get /employer/documents
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun retreive(
        params: HrisDocumentRetreiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentRetreiveResponse> =
        // get /employer/documents/{document_id}
        withRawResponse().retreive(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DocumentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<DocumentListResponse> =
            jsonHandler<DocumentListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: HrisDocumentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("employer", "documents")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retreiveHandler: Handler<DocumentRetreiveResponse> =
            jsonHandler<DocumentRetreiveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retreive(
            params: HrisDocumentRetreiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentRetreiveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("employer", "documents", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retreiveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}

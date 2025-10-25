// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.DocumentListResponse
import com.tryfinch.api.models.DocumentRetreiveResponse
import com.tryfinch.api.models.HrisDocumentListParams
import com.tryfinch.api.models.HrisDocumentRetreiveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentServiceAsync

    /**
     * **Beta:** This endpoint is in beta and may change. Retrieve a list of company-wide documents.
     */
    fun list(params: HrisDocumentListParams): CompletableFuture<DocumentListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: HrisDocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentListResponse>

    /**
     * **Beta:** This endpoint is in beta and may change. Retrieve details of a specific document by
     * its ID.
     */
    fun retreive(
        documentId: String,
        params: HrisDocumentRetreiveParams,
    ): CompletableFuture<DocumentRetreiveResponse> =
        retreive(documentId, params, RequestOptions.none())

    /** @see retreive */
    fun retreive(
        documentId: String,
        params: HrisDocumentRetreiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentRetreiveResponse> =
        retreive(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see retreive */
    fun retreive(params: HrisDocumentRetreiveParams): CompletableFuture<DocumentRetreiveResponse> =
        retreive(params, RequestOptions.none())

    /** @see retreive */
    fun retreive(
        params: HrisDocumentRetreiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentRetreiveResponse>

    /**
     * A view of [DocumentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /employer/documents`, but is otherwise the same as
         * [DocumentServiceAsync.list].
         */
        fun list(
            params: HrisDocumentListParams
        ): CompletableFuture<HttpResponseFor<DocumentListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: HrisDocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentListResponse>>

        /**
         * Returns a raw HTTP response for `get /employer/documents/{document_id}`, but is otherwise
         * the same as [DocumentServiceAsync.retreive].
         */
        fun retreive(
            documentId: String,
            params: HrisDocumentRetreiveParams,
        ): CompletableFuture<HttpResponseFor<DocumentRetreiveResponse>> =
            retreive(documentId, params, RequestOptions.none())

        /** @see retreive */
        fun retreive(
            documentId: String,
            params: HrisDocumentRetreiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentRetreiveResponse>> =
            retreive(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see retreive */
        fun retreive(
            params: HrisDocumentRetreiveParams
        ): CompletableFuture<HttpResponseFor<DocumentRetreiveResponse>> =
            retreive(params, RequestOptions.none())

        /** @see retreive */
        fun retreive(
            params: HrisDocumentRetreiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentRetreiveResponse>>
    }
}

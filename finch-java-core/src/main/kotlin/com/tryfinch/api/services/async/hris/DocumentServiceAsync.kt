// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.DocumentListResponse
import com.tryfinch.api.models.DocumentRetreiveResponse
import com.tryfinch.api.models.HrisDocumentListParams
import com.tryfinch.api.models.HrisDocumentRetreiveParams
import java.util.concurrent.CompletableFuture

interface DocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * **Beta:** This endpoint is in beta and may change. Retrieve a list of company-wide documents.
     */
    fun list(): CompletableFuture<DocumentListResponse> = list(HrisDocumentListParams.none())

    /** @see [list] */
    fun list(
        params: HrisDocumentListParams = HrisDocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentListResponse>

    /** @see [list] */
    fun list(
        params: HrisDocumentListParams = HrisDocumentListParams.none()
    ): CompletableFuture<DocumentListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<DocumentListResponse> =
        list(HrisDocumentListParams.none(), requestOptions)

    /**
     * **Beta:** This endpoint is in beta and may change. Retrieve details of a specific document by
     * its ID.
     */
    fun retreive(documentId: String): CompletableFuture<DocumentRetreiveResponse> =
        retreive(documentId, HrisDocumentRetreiveParams.none())

    /** @see [retreive] */
    fun retreive(
        documentId: String,
        params: HrisDocumentRetreiveParams = HrisDocumentRetreiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentRetreiveResponse> =
        retreive(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see [retreive] */
    fun retreive(
        documentId: String,
        params: HrisDocumentRetreiveParams = HrisDocumentRetreiveParams.none(),
    ): CompletableFuture<DocumentRetreiveResponse> =
        retreive(documentId, params, RequestOptions.none())

    /** @see [retreive] */
    fun retreive(
        params: HrisDocumentRetreiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentRetreiveResponse>

    /** @see [retreive] */
    fun retreive(params: HrisDocumentRetreiveParams): CompletableFuture<DocumentRetreiveResponse> =
        retreive(params, RequestOptions.none())

    /** @see [retreive] */
    fun retreive(
        documentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentRetreiveResponse> =
        retreive(documentId, HrisDocumentRetreiveParams.none(), requestOptions)

    /**
     * A view of [DocumentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /employer/documents`, but is otherwise the same as
         * [DocumentServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<DocumentListResponse>> =
            list(HrisDocumentListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: HrisDocumentListParams = HrisDocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: HrisDocumentListParams = HrisDocumentListParams.none()
        ): CompletableFuture<HttpResponseFor<DocumentListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DocumentListResponse>> =
            list(HrisDocumentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/documents/{document_id}`, but is otherwise
         * the same as [DocumentServiceAsync.retreive].
         */
        @MustBeClosed
        fun retreive(
            documentId: String
        ): CompletableFuture<HttpResponseFor<DocumentRetreiveResponse>> =
            retreive(documentId, HrisDocumentRetreiveParams.none())

        /** @see [retreive] */
        @MustBeClosed
        fun retreive(
            documentId: String,
            params: HrisDocumentRetreiveParams = HrisDocumentRetreiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentRetreiveResponse>> =
            retreive(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see [retreive] */
        @MustBeClosed
        fun retreive(
            documentId: String,
            params: HrisDocumentRetreiveParams = HrisDocumentRetreiveParams.none(),
        ): CompletableFuture<HttpResponseFor<DocumentRetreiveResponse>> =
            retreive(documentId, params, RequestOptions.none())

        /** @see [retreive] */
        @MustBeClosed
        fun retreive(
            params: HrisDocumentRetreiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentRetreiveResponse>>

        /** @see [retreive] */
        @MustBeClosed
        fun retreive(
            params: HrisDocumentRetreiveParams
        ): CompletableFuture<HttpResponseFor<DocumentRetreiveResponse>> =
            retreive(params, RequestOptions.none())

        /** @see [retreive] */
        @MustBeClosed
        fun retreive(
            documentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentRetreiveResponse>> =
            retreive(documentId, HrisDocumentRetreiveParams.none(), requestOptions)
    }
}

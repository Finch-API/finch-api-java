// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.DocumentListResponse
import com.tryfinch.api.models.DocumentRetreiveResponse
import com.tryfinch.api.models.HrisDocumentListParams
import com.tryfinch.api.models.HrisDocumentRetreiveParams
import java.util.function.Consumer

interface DocumentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentService

    /**
     * **Beta:** This endpoint is in beta and may change. Retrieve a list of company-wide documents.
     */
    fun list(): DocumentListResponse = list(HrisDocumentListParams.none())

    /** @see [list] */
    fun list(
        params: HrisDocumentListParams = HrisDocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentListResponse

    /** @see [list] */
    fun list(params: HrisDocumentListParams = HrisDocumentListParams.none()): DocumentListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): DocumentListResponse =
        list(HrisDocumentListParams.none(), requestOptions)

    /**
     * **Beta:** This endpoint is in beta and may change. Retrieve details of a specific document by
     * its ID.
     */
    fun retreive(documentId: String): DocumentRetreiveResponse =
        retreive(documentId, HrisDocumentRetreiveParams.none())

    /** @see [retreive] */
    fun retreive(
        documentId: String,
        params: HrisDocumentRetreiveParams = HrisDocumentRetreiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentRetreiveResponse =
        retreive(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see [retreive] */
    fun retreive(
        documentId: String,
        params: HrisDocumentRetreiveParams = HrisDocumentRetreiveParams.none(),
    ): DocumentRetreiveResponse = retreive(documentId, params, RequestOptions.none())

    /** @see [retreive] */
    fun retreive(
        params: HrisDocumentRetreiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentRetreiveResponse

    /** @see [retreive] */
    fun retreive(params: HrisDocumentRetreiveParams): DocumentRetreiveResponse =
        retreive(params, RequestOptions.none())

    /** @see [retreive] */
    fun retreive(documentId: String, requestOptions: RequestOptions): DocumentRetreiveResponse =
        retreive(documentId, HrisDocumentRetreiveParams.none(), requestOptions)

    /** A view of [DocumentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /employer/documents`, but is otherwise the same as
         * [DocumentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DocumentListResponse> = list(HrisDocumentListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: HrisDocumentListParams = HrisDocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: HrisDocumentListParams = HrisDocumentListParams.none()
        ): HttpResponseFor<DocumentListResponse> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DocumentListResponse> =
            list(HrisDocumentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/documents/{document_id}`, but is otherwise
         * the same as [DocumentService.retreive].
         */
        @MustBeClosed
        fun retreive(documentId: String): HttpResponseFor<DocumentRetreiveResponse> =
            retreive(documentId, HrisDocumentRetreiveParams.none())

        /** @see [retreive] */
        @MustBeClosed
        fun retreive(
            documentId: String,
            params: HrisDocumentRetreiveParams = HrisDocumentRetreiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentRetreiveResponse> =
            retreive(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see [retreive] */
        @MustBeClosed
        fun retreive(
            documentId: String,
            params: HrisDocumentRetreiveParams = HrisDocumentRetreiveParams.none(),
        ): HttpResponseFor<DocumentRetreiveResponse> =
            retreive(documentId, params, RequestOptions.none())

        /** @see [retreive] */
        @MustBeClosed
        fun retreive(
            params: HrisDocumentRetreiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentRetreiveResponse>

        /** @see [retreive] */
        @MustBeClosed
        fun retreive(
            params: HrisDocumentRetreiveParams
        ): HttpResponseFor<DocumentRetreiveResponse> = retreive(params, RequestOptions.none())

        /** @see [retreive] */
        @MustBeClosed
        fun retreive(
            documentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentRetreiveResponse> =
            retreive(documentId, HrisDocumentRetreiveParams.none(), requestOptions)
    }
}

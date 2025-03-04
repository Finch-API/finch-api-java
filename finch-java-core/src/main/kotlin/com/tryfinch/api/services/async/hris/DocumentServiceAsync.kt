// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.DocumentListResponse
import com.tryfinch.api.models.DocumentRetreiveResponse
import com.tryfinch.api.models.HrisDocumentListParams
import com.tryfinch.api.models.HrisDocumentRetreiveParams
import java.util.concurrent.CompletableFuture

interface DocumentServiceAsync {

    /**
     * **Beta:** This endpoint is in beta and may change. Retrieve a list of company-wide documents.
     */
    @JvmOverloads
    fun list(
        params: HrisDocumentListParams = HrisDocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentListResponse>

    /**
     * **Beta:** This endpoint is in beta and may change. Retrieve a list of company-wide documents.
     */
    fun list(requestOptions: RequestOptions): CompletableFuture<DocumentListResponse> =
        list(HrisDocumentListParams.none(), requestOptions)

    /**
     * **Beta:** This endpoint is in beta and may change. Retrieve details of a specific document by
     * its ID.
     */
    @JvmOverloads
    fun retreive(
        params: HrisDocumentRetreiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentRetreiveResponse>
}

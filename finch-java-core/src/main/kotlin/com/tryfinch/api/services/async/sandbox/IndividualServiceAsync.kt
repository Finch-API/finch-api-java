// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.IndividualUpdateResponse
import com.tryfinch.api.models.SandboxIndividualUpdateParams
import java.util.concurrent.CompletableFuture

interface IndividualServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Update sandbox individual */
    fun update(params: SandboxIndividualUpdateParams): CompletableFuture<IndividualUpdateResponse> =
        update(
          params, RequestOptions.none()
        )

    /** @see [update] */
    fun update(params: SandboxIndividualUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<IndividualUpdateResponse>

    /**
     * A view of [IndividualServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `put /sandbox/individual/{individual_id}`, but
         * is otherwise the same as [IndividualServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: SandboxIndividualUpdateParams): CompletableFuture<HttpResponseFor<IndividualUpdateResponse>> =
            update(
              params, RequestOptions.none()
            )

        /** @see [update] */
        @MustBeClosed
        fun update(params: SandboxIndividualUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<IndividualUpdateResponse>>
    }
}

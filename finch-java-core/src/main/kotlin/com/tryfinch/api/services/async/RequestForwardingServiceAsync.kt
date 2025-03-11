// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.RequestForwardingForwardParams
import com.tryfinch.api.models.RequestForwardingForwardResponse
import java.util.concurrent.CompletableFuture

interface RequestForwardingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * The Forward API allows you to make direct requests to an employment system. If Finch’s
     * unified API doesn’t have a data model that cleanly fits your needs, then Forward allows you
     * to push or pull data models directly against an integration’s API.
     */
    fun forward(
        params: RequestForwardingForwardParams
    ): CompletableFuture<RequestForwardingForwardResponse> = forward(params, RequestOptions.none())

    /** @see [forward] */
    fun forward(
        params: RequestForwardingForwardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RequestForwardingForwardResponse>

    /**
     * A view of [RequestForwardingServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /forward`, but is otherwise the same as
         * [RequestForwardingServiceAsync.forward].
         */
        @MustBeClosed
        fun forward(
            params: RequestForwardingForwardParams
        ): CompletableFuture<HttpResponseFor<RequestForwardingForwardResponse>> =
            forward(params, RequestOptions.none())

        /** @see [forward] */
        @MustBeClosed
        fun forward(
            params: RequestForwardingForwardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RequestForwardingForwardResponse>>
    }
}

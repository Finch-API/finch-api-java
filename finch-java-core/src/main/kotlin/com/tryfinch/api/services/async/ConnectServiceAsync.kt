// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.services.async.connect.SessionServiceAsync

interface ConnectServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    fun sessions(): SessionServiceAsync

    /**
     * A view of [ConnectServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        fun sessions(): SessionServiceAsync.WithRawResponse
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.services.blocking.connect.SessionService

interface ConnectService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    fun sessions(): SessionService

    /**
     * A view of [ConnectService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun sessions(): SessionService.WithRawResponse
    }
}

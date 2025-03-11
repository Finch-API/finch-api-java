// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

interface WebhookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * A view of [WebhookService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse
}

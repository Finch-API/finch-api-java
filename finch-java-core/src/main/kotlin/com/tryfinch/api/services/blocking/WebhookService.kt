// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.models.WebhookEvent
import java.util.function.Consumer

interface WebhookService {

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService

    fun unwrap(payload: String, headers: Headers, secret: String?): WebhookEvent

    fun verifySignature(payload: String, headers: Headers, secret: String?)
}

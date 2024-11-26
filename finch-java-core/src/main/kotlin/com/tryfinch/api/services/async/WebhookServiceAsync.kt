// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.models.WebhookEvent

interface WebhookServiceAsync {

    fun unwrap(payload: String, headers: Headers, secret: String?): WebhookEvent

    fun verifySignature(payload: String, headers: Headers, secret: String?)
}

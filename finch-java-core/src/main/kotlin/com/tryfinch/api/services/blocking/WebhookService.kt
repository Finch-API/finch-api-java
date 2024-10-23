// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.google.common.collect.ListMultimap
import com.tryfinch.api.models.WebhookEvent

interface WebhookService {

    fun unwrap(
        payload: String,
        headers: ListMultimap<String, String>,
        secret: String?
    ): WebhookEvent

    fun verifySignature(payload: String, headers: ListMultimap<String, String>, secret: String?)
}

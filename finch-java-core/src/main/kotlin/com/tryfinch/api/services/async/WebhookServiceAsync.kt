// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async

import com.google.common.collect.ListMultimap
import com.tryfinch.api.models.WebhookEvent

interface WebhookServiceAsync {

    fun unwrap(
        payload: String,
        headers: ListMultimap<String, String>,
        secret: String?
    ): WebhookEvent

    fun verifySignature(payload: String, headers: ListMultimap<String, String>, secret: String?)
}

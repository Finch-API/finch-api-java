@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.blocking

import com.google.common.collect.ListMultimap
import com.tryfinch.api.core.JsonValue

interface WebhookService {

    fun unwrap(payload: String, headers: ListMultimap<String, String>, secret: String?): JsonValue

    fun verifySignature(payload: String, headers: ListMultimap<String, String>, secret: String?)
}
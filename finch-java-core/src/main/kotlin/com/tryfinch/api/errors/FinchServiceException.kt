// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.errors

import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.http.Headers

abstract class FinchServiceException
protected constructor(message: String, cause: Throwable? = null) : FinchException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}

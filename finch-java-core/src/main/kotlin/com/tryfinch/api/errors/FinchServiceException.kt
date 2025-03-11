package com.tryfinch.api.errors

import com.tryfinch.api.core.http.Headers

abstract class FinchServiceException
@JvmOverloads
constructor(
        private val statusCode: Int,
        private val headers: Headers,
        private val body: String,
        private val error: FinchError,
        message: String = "$statusCode: $error",
        cause: Throwable? = null
) : FinchException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): Headers = headers

    fun body(): String = body

    fun error(): FinchError = error
}

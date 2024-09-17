package com.tryfinch.api.errors

import com.google.common.collect.ListMultimap

abstract class FinchServiceException
@JvmOverloads
constructor(
    private val statusCode: Int,
    private val headers: ListMultimap<String, String>,
    private val body: String,
    private val error: FinchError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : FinchException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): ListMultimap<String, String> = headers

    fun body(): String = body

    fun error(): FinchError = error
}

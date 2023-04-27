package org.finch.api.errors

import com.google.common.collect.ListMultimap

class RateLimitException
constructor(
    headers: ListMultimap<String, String>,
    private val error: FinchError,
) : FinchServiceException(headers, "${error}") {
    override fun statusCode(): Int = 429
    fun error(): FinchError = error
}

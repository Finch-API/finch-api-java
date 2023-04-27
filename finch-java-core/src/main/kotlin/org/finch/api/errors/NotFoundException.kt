package org.finch.api.errors

import com.google.common.collect.ListMultimap

class NotFoundException
constructor(
    headers: ListMultimap<String, String>,
    private val error: FinchError,
) : FinchServiceException(headers, "${error}") {
    override fun statusCode(): Int = 404
    fun error(): FinchError = error
}

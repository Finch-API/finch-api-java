package com.tryfinch.api.errors

import com.google.common.collect.ListMultimap

class BadRequestException
constructor(
    headers: ListMultimap<String, String>,
    private val error: FinchError,
) : FinchServiceException(headers, "${error}") {
    override fun statusCode(): Int = 400
    fun error(): FinchError = error
}

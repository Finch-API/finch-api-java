package com.tryfinch.api.errors

import com.google.common.collect.ListMultimap

class UnprocessableEntityException
constructor(
    headers: ListMultimap<String, String>,
    private val error: FinchError,
) : FinchServiceException(headers, "${error}") {
    override fun statusCode(): Int = 422

    fun error(): FinchError = error
}

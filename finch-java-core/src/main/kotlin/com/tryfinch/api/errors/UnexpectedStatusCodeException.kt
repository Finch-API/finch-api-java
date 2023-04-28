package com.tryfinch.api.errors

import com.google.common.collect.ListMultimap

class UnexpectedStatusCodeException
constructor(
    private val statusCode: Int,
    headers: ListMultimap<String, String>,
    private val body: String
) : FinchServiceException(headers, "Unexpected status code: ${statusCode}") {
    override fun statusCode(): Int = statusCode
    fun body() = body
}

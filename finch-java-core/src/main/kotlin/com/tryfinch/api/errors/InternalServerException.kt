package com.tryfinch.api.errors

import com.google.common.collect.ListMultimap

class InternalServerException(
    statusCode: Int,
    headers: ListMultimap<String, String>,
    body: String,
    error: FinchError,
) : FinchServiceException(statusCode, headers, body, error)

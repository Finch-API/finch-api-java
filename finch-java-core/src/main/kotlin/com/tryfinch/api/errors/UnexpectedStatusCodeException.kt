package com.tryfinch.api.errors

import com.google.common.collect.ListMultimap

class UnexpectedStatusCodeException(
    statusCode: Int,
    headers: ListMultimap<String, String>,
    body: String,
    error: FinchError,
) : FinchServiceException(statusCode, headers, body, error)

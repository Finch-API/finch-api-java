package com.tryfinch.api.errors

import com.google.common.collect.ListMultimap

class UnauthorizedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: FinchError,
) : FinchServiceException(401, headers, body, error)

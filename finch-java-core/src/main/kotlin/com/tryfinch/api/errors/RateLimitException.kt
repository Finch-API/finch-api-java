package com.tryfinch.api.errors

import com.google.common.collect.ListMultimap

class RateLimitException(
    headers: ListMultimap<String, String>,
    body: String,
    error: FinchError,
) : FinchServiceException(429, headers, body, error)

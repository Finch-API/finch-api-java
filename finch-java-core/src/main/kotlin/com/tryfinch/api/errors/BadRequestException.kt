package com.tryfinch.api.errors

import com.google.common.collect.ListMultimap

class BadRequestException(
    headers: ListMultimap<String, String>,
    body: String,
    error: FinchError,
) : FinchServiceException(400, headers, body, error)

package com.tryfinch.api.errors

import com.google.common.collect.ListMultimap

class UnprocessableEntityException(
    headers: ListMultimap<String, String>,
    body: String,
    error: FinchError,
) : FinchServiceException(422, headers, body, error)

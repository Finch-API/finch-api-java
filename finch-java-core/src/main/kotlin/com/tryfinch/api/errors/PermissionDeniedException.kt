package com.tryfinch.api.errors

import com.google.common.collect.ListMultimap

class PermissionDeniedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: FinchError,
) : FinchServiceException(403, headers, body, error)

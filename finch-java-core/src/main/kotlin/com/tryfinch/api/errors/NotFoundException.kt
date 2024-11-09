package com.tryfinch.api.errors

import com.tryfinch.api.core.http.Headers

class NotFoundException(
    headers: Headers,
    body: String,
    error: FinchError,
) : FinchServiceException(404, headers, body, error)

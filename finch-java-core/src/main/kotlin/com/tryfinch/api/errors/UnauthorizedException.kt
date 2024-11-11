package com.tryfinch.api.errors

import com.tryfinch.api.core.http.Headers

class UnauthorizedException(
    headers: Headers,
    body: String,
    error: FinchError,
) : FinchServiceException(401, headers, body, error)

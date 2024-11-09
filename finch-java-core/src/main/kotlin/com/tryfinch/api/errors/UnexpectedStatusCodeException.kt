package com.tryfinch.api.errors

import com.tryfinch.api.core.http.Headers

class UnexpectedStatusCodeException(
    statusCode: Int,
    headers: Headers,
    body: String,
    error: FinchError,
) : FinchServiceException(statusCode, headers, body, error)

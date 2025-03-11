package com.tryfinch.api.errors

import com.tryfinch.api.core.http.Headers

class RateLimitException(headers: Headers, body: String, error: FinchError) :
    FinchServiceException(429, headers, body, error)

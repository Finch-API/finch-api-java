package com.tryfinch.api.errors

import com.tryfinch.api.core.http.Headers

class BadRequestException(headers: Headers, body: String, error: FinchError) :
    FinchServiceException(400, headers, body, error)

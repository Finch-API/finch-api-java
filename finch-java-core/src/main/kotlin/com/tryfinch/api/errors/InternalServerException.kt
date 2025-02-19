package com.tryfinch.api.errors

import com.tryfinch.api.core.http.Headers

class InternalServerException(statusCode: Int, headers: Headers, body: String, error: FinchError) :
    FinchServiceException(statusCode, headers, body, error)

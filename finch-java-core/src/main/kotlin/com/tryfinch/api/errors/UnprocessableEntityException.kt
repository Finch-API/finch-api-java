package com.tryfinch.api.errors

import com.tryfinch.api.core.http.Headers

class UnprocessableEntityException(
        headers: Headers,
        body: String,
        error: FinchError,
) : FinchServiceException(422, headers, body, error)

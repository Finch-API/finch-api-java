package com.tryfinch.api.errors

import com.tryfinch.api.core.http.Headers

class PermissionDeniedException(headers: Headers, body: String, error: FinchError) :
    FinchServiceException(403, headers, body, error)

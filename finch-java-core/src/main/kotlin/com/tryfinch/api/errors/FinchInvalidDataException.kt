package com.tryfinch.api.errors

class FinchInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : FinchException(message, cause)

package org.finch.api.errors

class FinchIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : FinchException(message, cause)

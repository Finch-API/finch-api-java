// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.errors.FinchInvalidDataException

class IntrospectResponseConnectionStatus
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntrospectResponseConnectionStatus && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val PENDING = IntrospectResponseConnectionStatus(JsonField.of("pending"))

        @JvmField val PROCESSING = IntrospectResponseConnectionStatus(JsonField.of("processing"))

        @JvmField val CONNECTED = IntrospectResponseConnectionStatus(JsonField.of("connected"))

        @JvmField
        val ERROR_NO_ACCOUNT_SETUP =
            IntrospectResponseConnectionStatus(JsonField.of("error_no_account_setup"))

        @JvmField
        val ERROR_PERMISSIONS =
            IntrospectResponseConnectionStatus(JsonField.of("error_permissions"))

        @JvmField val REAUTH = IntrospectResponseConnectionStatus(JsonField.of("reauth"))

        @JvmStatic fun of(value: String) = IntrospectResponseConnectionStatus(JsonField.of(value))
    }

    enum class Known {
        PENDING,
        PROCESSING,
        CONNECTED,
        ERROR_NO_ACCOUNT_SETUP,
        ERROR_PERMISSIONS,
        REAUTH,
    }

    enum class Value {
        PENDING,
        PROCESSING,
        CONNECTED,
        ERROR_NO_ACCOUNT_SETUP,
        ERROR_PERMISSIONS,
        REAUTH,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            PENDING -> Value.PENDING
            PROCESSING -> Value.PROCESSING
            CONNECTED -> Value.CONNECTED
            ERROR_NO_ACCOUNT_SETUP -> Value.ERROR_NO_ACCOUNT_SETUP
            ERROR_PERMISSIONS -> Value.ERROR_PERMISSIONS
            REAUTH -> Value.REAUTH
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            PENDING -> Known.PENDING
            PROCESSING -> Known.PROCESSING
            CONNECTED -> Known.CONNECTED
            ERROR_NO_ACCOUNT_SETUP -> Known.ERROR_NO_ACCOUNT_SETUP
            ERROR_PERMISSIONS -> Known.ERROR_PERMISSIONS
            REAUTH -> Known.REAUTH
            else ->
                throw FinchInvalidDataException(
                    "Unknown IntrospectResponseConnectionStatus: $value"
                )
        }

    fun asString(): String = _value().asStringOrThrow()
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.errors.FinchInvalidDataException

class ConnectionStatusType
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConnectionStatusType && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val PENDING = ConnectionStatusType(JsonField.of("pending"))

        @JvmField val PROCESSING = ConnectionStatusType(JsonField.of("processing"))

        @JvmField val CONNECTED = ConnectionStatusType(JsonField.of("connected"))

        @JvmField
        val ERROR_NO_ACCOUNT_SETUP = ConnectionStatusType(JsonField.of("error_no_account_setup"))

        @JvmField val ERROR_PERMISSIONS = ConnectionStatusType(JsonField.of("error_permissions"))

        @JvmField val REAUTH = ConnectionStatusType(JsonField.of("reauth"))

        @JvmStatic fun of(value: String) = ConnectionStatusType(JsonField.of(value))
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
            else -> throw FinchInvalidDataException("Unknown ConnectionStatusType: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}

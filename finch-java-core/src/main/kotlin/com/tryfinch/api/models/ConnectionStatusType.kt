// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.errors.FinchInvalidDataException

class ConnectionStatusType
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val PENDING = of("pending")

        @JvmField val PROCESSING = of("processing")

        @JvmField val CONNECTED = of("connected")

        @JvmField val ERROR_NO_ACCOUNT_SETUP = of("error_no_account_setup")

        @JvmField val ERROR_PERMISSIONS = of("error_permissions")

        @JvmField val REAUTH = of("reauth")

        @JvmStatic fun of(value: String) = ConnectionStatusType(JsonField.of(value))
    }

    /** An enum containing [ConnectionStatusType]'s known values. */
    enum class Known {
        PENDING,
        PROCESSING,
        CONNECTED,
        ERROR_NO_ACCOUNT_SETUP,
        ERROR_PERMISSIONS,
        REAUTH,
    }

    /**
     * An enum containing [ConnectionStatusType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [ConnectionStatusType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        PENDING,
        PROCESSING,
        CONNECTED,
        ERROR_NO_ACCOUNT_SETUP,
        ERROR_PERMISSIONS,
        REAUTH,
        /**
         * An enum member indicating that [ConnectionStatusType] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
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

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws FinchInvalidDataException if this class instance's value is a not a known member.
     */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConnectionStatusType && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}

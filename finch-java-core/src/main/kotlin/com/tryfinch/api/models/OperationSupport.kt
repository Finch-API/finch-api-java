// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.errors.FinchInvalidDataException

/**
 * - `supported`: This operation is supported by both the provider and Finch
 * - `not_supported_by_finch`: This operation is not supported by Finch but
 *   supported by the provider
 * - `not_supported_by_provider`: This operation is not supported by the provider,
 *   so Finch cannot support
 * - `client_access_only`: This behavior is supported by the provider, but only
 *   available to the client and not to Finch
 */
class OperationSupport @JsonCreator private constructor(
    private val value: JsonField<String>,

) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that
     * doesn't match any known member, and you want to know that value. For example, if
     * the SDK is on an older version than the API, then the API may respond with new
     * members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue
    fun _value(): JsonField<String> = value

    companion object {

        @JvmField val SUPPORTED = of("supported")

        @JvmField val NOT_SUPPORTED_BY_FINCH = of("not_supported_by_finch")

        @JvmField val NOT_SUPPORTED_BY_PROVIDER = of("not_supported_by_provider")

        @JvmField val CLIENT_ACCESS_ONLY = of("client_access_only")

        @JvmStatic fun of(value: String) = OperationSupport(JsonField.of(value))
    }

    /** An enum containing [OperationSupport]'s known values. */
    enum class Known {
        SUPPORTED,
        NOT_SUPPORTED_BY_FINCH,
        NOT_SUPPORTED_BY_PROVIDER,
        CLIENT_ACCESS_ONLY,
    }

    /**
     * An enum containing [OperationSupport]'s known values, as well as an [_UNKNOWN]
     * member.
     *
     * An instance of [OperationSupport] can contain an unknown value in a couple of
     * cases:
     *
     * - It was deserialized from data that doesn't match any known member. For
     *   example, if the SDK is on an older version than the API, then the API may
     *   respond with new members that the SDK is unaware of.
     *
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        SUPPORTED,
        NOT_SUPPORTED_BY_FINCH,
        NOT_SUPPORTED_BY_PROVIDER,
        CLIENT_ACCESS_ONLY,
        /**
         * An enum member indicating that [OperationSupport] was instantiated with an
         * unknown value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or
     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if
     * you want to throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            SUPPORTED -> Value.SUPPORTED
            NOT_SUPPORTED_BY_FINCH -> Value.NOT_SUPPORTED_BY_FINCH
            NOT_SUPPORTED_BY_PROVIDER -> Value.NOT_SUPPORTED_BY_PROVIDER
            CLIENT_ACCESS_ONLY -> Value.CLIENT_ACCESS_ONLY
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and
     * don't want to throw for the unknown case.
     *
     * @throws FinchInvalidDataException if this class instance's value is a not a
     * known member.
     */
    fun known(): Known =
        when (this) {
            SUPPORTED -> Known.SUPPORTED
            NOT_SUPPORTED_BY_FINCH -> Known.NOT_SUPPORTED_BY_FINCH
            NOT_SUPPORTED_BY_PROVIDER -> Known.NOT_SUPPORTED_BY_PROVIDER
            CLIENT_ACCESS_ONLY -> Known.CLIENT_ACCESS_ONLY
            else -> throw FinchInvalidDataException("Unknown OperationSupport: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for
     * debugging and generally doesn't throw.
     *
     * @throws FinchInvalidDataException if this class instance's value does not have
     * the expected primitive type.
     */
    fun asString(): String = _value().asString().orElseThrow { FinchInvalidDataException("Value is not a String") }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is OperationSupport && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}

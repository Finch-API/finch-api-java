// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.errors.FinchInvalidDataException

class BenefitFrequency @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val ONE_TIME = of("one_time")

        @JvmField val EVERY_PAYCHECK = of("every_paycheck")

        @JvmField val MONTHLY = of("monthly")

        @JvmStatic fun of(value: String) = BenefitFrequency(JsonField.of(value))
    }

    /** An enum containing [BenefitFrequency]'s known values. */
    enum class Known {
        ONE_TIME,
        EVERY_PAYCHECK,
        MONTHLY,
    }

    /**
     * An enum containing [BenefitFrequency]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [BenefitFrequency] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        ONE_TIME,
        EVERY_PAYCHECK,
        MONTHLY,
        /**
         * An enum member indicating that [BenefitFrequency] was instantiated with an unknown value.
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
            ONE_TIME -> Value.ONE_TIME
            EVERY_PAYCHECK -> Value.EVERY_PAYCHECK
            MONTHLY -> Value.MONTHLY
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
            ONE_TIME -> Known.ONE_TIME
            EVERY_PAYCHECK -> Known.EVERY_PAYCHECK
            MONTHLY -> Known.MONTHLY
            else -> throw FinchInvalidDataException("Unknown BenefitFrequency: $value")
        }

    fun asString(): String = _value().asStringOrThrow()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BenefitFrequency && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}

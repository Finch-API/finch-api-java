// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.errors.FinchInvalidDataException

class BenefitFrequency
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val ONE_TIME = of("one_time")

        @JvmField val EVERY_PAYCHECK = of("every_paycheck")

        @JvmField val MONTHLY = of("monthly")

        @JvmStatic fun of(value: String) = BenefitFrequency(JsonField.of(value))
    }

    enum class Known {
        ONE_TIME,
        EVERY_PAYCHECK,
        MONTHLY,
    }

    enum class Value {
        ONE_TIME,
        EVERY_PAYCHECK,
        MONTHLY,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            ONE_TIME -> Value.ONE_TIME
            EVERY_PAYCHECK -> Value.EVERY_PAYCHECK
            MONTHLY -> Value.MONTHLY
            else -> Value._UNKNOWN
        }

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

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.errors.FinchInvalidDataException

class BenefitFrequency
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BenefitFrequency && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val ONE_TIME = BenefitFrequency(JsonField.of("one_time"))

        @JvmField val EVERY_PAYCHECK = BenefitFrequency(JsonField.of("every_paycheck"))

        @JvmStatic fun of(value: String) = BenefitFrequency(JsonField.of(value))
    }

    enum class Known {
        ONE_TIME,
        EVERY_PAYCHECK,
    }

    enum class Value {
        ONE_TIME,
        EVERY_PAYCHECK,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            ONE_TIME -> Value.ONE_TIME
            EVERY_PAYCHECK -> Value.EVERY_PAYCHECK
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            ONE_TIME -> Known.ONE_TIME
            EVERY_PAYCHECK -> Known.EVERY_PAYCHECK
            else -> throw FinchInvalidDataException("Unknown BenefitFrequency: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}

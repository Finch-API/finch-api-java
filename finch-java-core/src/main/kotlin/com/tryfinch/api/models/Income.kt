// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * The employee's income as reported by the provider. This may not always be annualized income, but
 * may be in units of bi-weekly, semi-monthly, daily, etc, depending on what information the
 * provider returns.
 */
@NoAutoDetect
class Income
@JsonCreator
private constructor(
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("effective_date")
    @ExcludeMissing
    private val effectiveDate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("unit") @ExcludeMissing private val unit: JsonField<Unit> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The income amount in cents. */
    fun amount(): Optional<Long> = Optional.ofNullable(amount.getNullable("amount"))

    /** The currency code. */
    fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

    /** The date the income amount went into effect. */
    fun effectiveDate(): Optional<String> =
        Optional.ofNullable(effectiveDate.getNullable("effective_date"))

    /**
     * The income unit of payment. Options: `yearly`, `quarterly`, `monthly`, `semi_monthly`,
     * `bi_weekly`, `weekly`, `daily`, `hourly`, and `fixed`.
     */
    fun unit(): Optional<Unit> = Optional.ofNullable(unit.getNullable("unit"))

    /** The income amount in cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** The currency code. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** The date the income amount went into effect. */
    @JsonProperty("effective_date") @ExcludeMissing fun _effectiveDate() = effectiveDate

    /**
     * The income unit of payment. Options: `yearly`, `quarterly`, `monthly`, `semi_monthly`,
     * `bi_weekly`, `weekly`, `daily`, `hourly`, and `fixed`.
     */
    @JsonProperty("unit") @ExcludeMissing fun _unit() = unit

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Income = apply {
        if (!validated) {
            amount()
            currency()
            effectiveDate()
            unit()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var amount: JsonField<Long> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var effectiveDate: JsonField<String> = JsonMissing.of()
        private var unit: JsonField<Unit> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(income: Income) = apply {
            amount = income.amount
            currency = income.currency
            effectiveDate = income.effectiveDate
            unit = income.unit
            additionalProperties = income.additionalProperties.toMutableMap()
        }

        /** The income amount in cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The income amount in cents. */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The currency code. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** The currency code. */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** The date the income amount went into effect. */
        fun effectiveDate(effectiveDate: String) = effectiveDate(JsonField.of(effectiveDate))

        /** The date the income amount went into effect. */
        fun effectiveDate(effectiveDate: JsonField<String>) = apply {
            this.effectiveDate = effectiveDate
        }

        /**
         * The income unit of payment. Options: `yearly`, `quarterly`, `monthly`, `semi_monthly`,
         * `bi_weekly`, `weekly`, `daily`, `hourly`, and `fixed`.
         */
        fun unit(unit: Unit) = unit(JsonField.of(unit))

        /**
         * The income unit of payment. Options: `yearly`, `quarterly`, `monthly`, `semi_monthly`,
         * `bi_weekly`, `weekly`, `daily`, `hourly`, and `fixed`.
         */
        fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): Income =
            Income(
                amount,
                currency,
                effectiveDate,
                unit,
                additionalProperties.toImmutable(),
            )
    }

    class Unit
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val YEARLY = of("yearly")

            @JvmField val QUARTERLY = of("quarterly")

            @JvmField val MONTHLY = of("monthly")

            @JvmField val SEMI_MONTHLY = of("semi_monthly")

            @JvmField val BI_WEEKLY = of("bi_weekly")

            @JvmField val WEEKLY = of("weekly")

            @JvmField val DAILY = of("daily")

            @JvmField val HOURLY = of("hourly")

            @JvmField val FIXED = of("fixed")

            @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
        }

        enum class Known {
            YEARLY,
            QUARTERLY,
            MONTHLY,
            SEMI_MONTHLY,
            BI_WEEKLY,
            WEEKLY,
            DAILY,
            HOURLY,
            FIXED,
        }

        enum class Value {
            YEARLY,
            QUARTERLY,
            MONTHLY,
            SEMI_MONTHLY,
            BI_WEEKLY,
            WEEKLY,
            DAILY,
            HOURLY,
            FIXED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                YEARLY -> Value.YEARLY
                QUARTERLY -> Value.QUARTERLY
                MONTHLY -> Value.MONTHLY
                SEMI_MONTHLY -> Value.SEMI_MONTHLY
                BI_WEEKLY -> Value.BI_WEEKLY
                WEEKLY -> Value.WEEKLY
                DAILY -> Value.DAILY
                HOURLY -> Value.HOURLY
                FIXED -> Value.FIXED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                YEARLY -> Known.YEARLY
                QUARTERLY -> Known.QUARTERLY
                MONTHLY -> Known.MONTHLY
                SEMI_MONTHLY -> Known.SEMI_MONTHLY
                BI_WEEKLY -> Known.BI_WEEKLY
                WEEKLY -> Known.WEEKLY
                DAILY -> Known.DAILY
                HOURLY -> Known.HOURLY
                FIXED -> Known.FIXED
                else -> throw FinchInvalidDataException("Unknown Unit: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Unit && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Income && amount == other.amount && currency == other.currency && effectiveDate == other.effectiveDate && unit == other.unit && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amount, currency, effectiveDate, unit, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Income{amount=$amount, currency=$currency, effectiveDate=$effectiveDate, unit=$unit, additionalProperties=$additionalProperties}"
}

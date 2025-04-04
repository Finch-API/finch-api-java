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
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * The employee's income as reported by the provider. This may not always be annualized income, but
 * may be in units of bi-weekly, semi-monthly, daily, etc, depending on what information the
 * provider returns.
 */
class Income
private constructor(
    private val amount: JsonField<Long>,
    private val currency: JsonField<String>,
    private val effectiveDate: JsonField<String>,
    private val unit: JsonField<Unit>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_date")
        @ExcludeMissing
        effectiveDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
    ) : this(amount, currency, effectiveDate, unit, mutableMapOf())

    /**
     * The income amount in cents.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Optional<Long> = amount.getOptional("amount")

    /**
     * The currency code.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currency(): Optional<String> = currency.getOptional("currency")

    /**
     * The date the income amount went into effect.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun effectiveDate(): Optional<String> = effectiveDate.getOptional("effective_date")

    /**
     * The income unit of payment. Options: `yearly`, `quarterly`, `monthly`, `semi_monthly`,
     * `bi_weekly`, `weekly`, `daily`, `hourly`, and `fixed`.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unit(): Optional<Unit> = unit.getOptional("unit")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [effectiveDate].
     *
     * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effective_date")
    @ExcludeMissing
    fun _effectiveDate(): JsonField<String> = effectiveDate

    /**
     * Returns the raw JSON value of [unit].
     *
     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [Income]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Income]. */
    class Builder internal constructor() {

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
        fun amount(amount: Long?) = amount(JsonField.ofNullable(amount))

        /**
         * Alias for [Builder.amount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun amount(amount: Long) = amount(amount as Long?)

        /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
        fun amount(amount: Optional<Long>) = amount(amount.getOrNull())

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The currency code. */
        fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

        /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
        fun currency(currency: Optional<String>) = currency(currency.getOrNull())

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** The date the income amount went into effect. */
        fun effectiveDate(effectiveDate: String?) =
            effectiveDate(JsonField.ofNullable(effectiveDate))

        /** Alias for calling [Builder.effectiveDate] with `effectiveDate.orElse(null)`. */
        fun effectiveDate(effectiveDate: Optional<String>) =
            effectiveDate(effectiveDate.getOrNull())

        /**
         * Sets [Builder.effectiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun effectiveDate(effectiveDate: JsonField<String>) = apply {
            this.effectiveDate = effectiveDate
        }

        /**
         * The income unit of payment. Options: `yearly`, `quarterly`, `monthly`, `semi_monthly`,
         * `bi_weekly`, `weekly`, `daily`, `hourly`, and `fixed`.
         */
        fun unit(unit: Unit?) = unit(JsonField.ofNullable(unit))

        /** Alias for calling [Builder.unit] with `unit.orElse(null)`. */
        fun unit(unit: Optional<Unit>) = unit(unit.getOrNull())

        /**
         * Sets [Builder.unit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unit] with a well-typed [Unit] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [Income].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Income =
            Income(amount, currency, effectiveDate, unit, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): Income = apply {
        if (validated) {
            return@apply
        }

        amount()
        currency()
        effectiveDate()
        unit().ifPresent { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: FinchInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (amount.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (effectiveDate.asKnown().isPresent) 1 else 0) +
            (unit.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The income unit of payment. Options: `yearly`, `quarterly`, `monthly`, `semi_monthly`,
     * `bi_weekly`, `weekly`, `daily`, `hourly`, and `fixed`.
     */
    class Unit @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
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

        /** An enum containing [Unit]'s known values. */
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

        /**
         * An enum containing [Unit]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Unit] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
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
            /** An enum member indicating that [Unit] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
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

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws FinchInvalidDataException if this class instance's value is a not a known member.
         */
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

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws FinchInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { FinchInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Unit = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: FinchInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

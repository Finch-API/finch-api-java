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
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class Payment
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("company_debit")
    @ExcludeMissing
    private val companyDebit: JsonField<Money> = JsonMissing.of(),
    @JsonProperty("debit_date")
    @ExcludeMissing
    private val debitDate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("employee_taxes")
    @ExcludeMissing
    private val employeeTaxes: JsonField<Money> = JsonMissing.of(),
    @JsonProperty("employer_taxes")
    @ExcludeMissing
    private val employerTaxes: JsonField<Money> = JsonMissing.of(),
    @JsonProperty("gross_pay")
    @ExcludeMissing
    private val grossPay: JsonField<Money> = JsonMissing.of(),
    @JsonProperty("individual_ids")
    @ExcludeMissing
    private val individualIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("net_pay")
    @ExcludeMissing
    private val netPay: JsonField<Money> = JsonMissing.of(),
    @JsonProperty("pay_date")
    @ExcludeMissing
    private val payDate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("pay_frequencies")
    @ExcludeMissing
    private val payFrequencies: JsonField<List<PayFrequency>> = JsonMissing.of(),
    @JsonProperty("pay_group_ids")
    @ExcludeMissing
    private val payGroupIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("pay_period")
    @ExcludeMissing
    private val payPeriod: JsonField<PayPeriod> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The unique id for the payment.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyDebit(): Optional<Money> =
        Optional.ofNullable(companyDebit.getNullable("company_debit"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debitDate(): Optional<String> = Optional.ofNullable(debitDate.getNullable("debit_date"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun employeeTaxes(): Optional<Money> =
        Optional.ofNullable(employeeTaxes.getNullable("employee_taxes"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun employerTaxes(): Optional<Money> =
        Optional.ofNullable(employerTaxes.getNullable("employer_taxes"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun grossPay(): Optional<Money> = Optional.ofNullable(grossPay.getNullable("gross_pay"))

    /**
     * Array of every individual on this payment.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun individualIds(): Optional<List<String>> =
        Optional.ofNullable(individualIds.getNullable("individual_ids"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netPay(): Optional<Money> = Optional.ofNullable(netPay.getNullable("net_pay"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payDate(): Optional<String> = Optional.ofNullable(payDate.getNullable("pay_date"))

    /**
     * List of pay frequencies associated with this payment.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payFrequencies(): Optional<List<PayFrequency>> =
        Optional.ofNullable(payFrequencies.getNullable("pay_frequencies"))

    /**
     * Array of the Finch id (uuidv4) of every pay group associated with this payment.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payGroupIds(): Optional<List<String>> =
        Optional.ofNullable(payGroupIds.getNullable("pay_group_ids"))

    /**
     * The pay period object.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payPeriod(): Optional<PayPeriod> = Optional.ofNullable(payPeriod.getNullable("pay_period"))

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [companyDebit].
     *
     * Unlike [companyDebit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company_debit")
    @ExcludeMissing
    fun _companyDebit(): JsonField<Money> = companyDebit

    /**
     * Returns the raw JSON value of [debitDate].
     *
     * Unlike [debitDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("debit_date") @ExcludeMissing fun _debitDate(): JsonField<String> = debitDate

    /**
     * Returns the raw JSON value of [employeeTaxes].
     *
     * Unlike [employeeTaxes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("employee_taxes")
    @ExcludeMissing
    fun _employeeTaxes(): JsonField<Money> = employeeTaxes

    /**
     * Returns the raw JSON value of [employerTaxes].
     *
     * Unlike [employerTaxes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("employer_taxes")
    @ExcludeMissing
    fun _employerTaxes(): JsonField<Money> = employerTaxes

    /**
     * Returns the raw JSON value of [grossPay].
     *
     * Unlike [grossPay], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gross_pay") @ExcludeMissing fun _grossPay(): JsonField<Money> = grossPay

    /**
     * Returns the raw JSON value of [individualIds].
     *
     * Unlike [individualIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("individual_ids")
    @ExcludeMissing
    fun _individualIds(): JsonField<List<String>> = individualIds

    /**
     * Returns the raw JSON value of [netPay].
     *
     * Unlike [netPay], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("net_pay") @ExcludeMissing fun _netPay(): JsonField<Money> = netPay

    /**
     * Returns the raw JSON value of [payDate].
     *
     * Unlike [payDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pay_date") @ExcludeMissing fun _payDate(): JsonField<String> = payDate

    /**
     * Returns the raw JSON value of [payFrequencies].
     *
     * Unlike [payFrequencies], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pay_frequencies")
    @ExcludeMissing
    fun _payFrequencies(): JsonField<List<PayFrequency>> = payFrequencies

    /**
     * Returns the raw JSON value of [payGroupIds].
     *
     * Unlike [payGroupIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pay_group_ids")
    @ExcludeMissing
    fun _payGroupIds(): JsonField<List<String>> = payGroupIds

    /**
     * Returns the raw JSON value of [payPeriod].
     *
     * Unlike [payPeriod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pay_period") @ExcludeMissing fun _payPeriod(): JsonField<PayPeriod> = payPeriod

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Payment = apply {
        if (validated) {
            return@apply
        }

        id()
        companyDebit().ifPresent { it.validate() }
        debitDate()
        employeeTaxes().ifPresent { it.validate() }
        employerTaxes().ifPresent { it.validate() }
        grossPay().ifPresent { it.validate() }
        individualIds()
        netPay().ifPresent { it.validate() }
        payDate()
        payFrequencies()
        payGroupIds()
        payPeriod().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [Payment]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Payment]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var companyDebit: JsonField<Money> = JsonMissing.of()
        private var debitDate: JsonField<String> = JsonMissing.of()
        private var employeeTaxes: JsonField<Money> = JsonMissing.of()
        private var employerTaxes: JsonField<Money> = JsonMissing.of()
        private var grossPay: JsonField<Money> = JsonMissing.of()
        private var individualIds: JsonField<MutableList<String>>? = null
        private var netPay: JsonField<Money> = JsonMissing.of()
        private var payDate: JsonField<String> = JsonMissing.of()
        private var payFrequencies: JsonField<MutableList<PayFrequency>>? = null
        private var payGroupIds: JsonField<MutableList<String>>? = null
        private var payPeriod: JsonField<PayPeriod> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payment: Payment) = apply {
            id = payment.id
            companyDebit = payment.companyDebit
            debitDate = payment.debitDate
            employeeTaxes = payment.employeeTaxes
            employerTaxes = payment.employerTaxes
            grossPay = payment.grossPay
            individualIds = payment.individualIds.map { it.toMutableList() }
            netPay = payment.netPay
            payDate = payment.payDate
            payFrequencies = payment.payFrequencies.map { it.toMutableList() }
            payGroupIds = payment.payGroupIds.map { it.toMutableList() }
            payPeriod = payment.payPeriod
            additionalProperties = payment.additionalProperties.toMutableMap()
        }

        /** The unique id for the payment. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun companyDebit(companyDebit: Money?) = companyDebit(JsonField.ofNullable(companyDebit))

        /** Alias for calling [Builder.companyDebit] with `companyDebit.orElse(null)`. */
        fun companyDebit(companyDebit: Optional<Money>) = companyDebit(companyDebit.getOrNull())

        /**
         * Sets [Builder.companyDebit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyDebit] with a well-typed [Money] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyDebit(companyDebit: JsonField<Money>) = apply {
            this.companyDebit = companyDebit
        }

        fun debitDate(debitDate: String?) = debitDate(JsonField.ofNullable(debitDate))

        /** Alias for calling [Builder.debitDate] with `debitDate.orElse(null)`. */
        fun debitDate(debitDate: Optional<String>) = debitDate(debitDate.getOrNull())

        /**
         * Sets [Builder.debitDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debitDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun debitDate(debitDate: JsonField<String>) = apply { this.debitDate = debitDate }

        fun employeeTaxes(employeeTaxes: Money?) =
            employeeTaxes(JsonField.ofNullable(employeeTaxes))

        /** Alias for calling [Builder.employeeTaxes] with `employeeTaxes.orElse(null)`. */
        fun employeeTaxes(employeeTaxes: Optional<Money>) = employeeTaxes(employeeTaxes.getOrNull())

        /**
         * Sets [Builder.employeeTaxes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.employeeTaxes] with a well-typed [Money] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun employeeTaxes(employeeTaxes: JsonField<Money>) = apply {
            this.employeeTaxes = employeeTaxes
        }

        fun employerTaxes(employerTaxes: Money?) =
            employerTaxes(JsonField.ofNullable(employerTaxes))

        /** Alias for calling [Builder.employerTaxes] with `employerTaxes.orElse(null)`. */
        fun employerTaxes(employerTaxes: Optional<Money>) = employerTaxes(employerTaxes.getOrNull())

        /**
         * Sets [Builder.employerTaxes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.employerTaxes] with a well-typed [Money] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun employerTaxes(employerTaxes: JsonField<Money>) = apply {
            this.employerTaxes = employerTaxes
        }

        fun grossPay(grossPay: Money?) = grossPay(JsonField.ofNullable(grossPay))

        /** Alias for calling [Builder.grossPay] with `grossPay.orElse(null)`. */
        fun grossPay(grossPay: Optional<Money>) = grossPay(grossPay.getOrNull())

        /**
         * Sets [Builder.grossPay] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grossPay] with a well-typed [Money] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun grossPay(grossPay: JsonField<Money>) = apply { this.grossPay = grossPay }

        /** Array of every individual on this payment. */
        fun individualIds(individualIds: List<String>?) =
            individualIds(JsonField.ofNullable(individualIds))

        /** Alias for calling [Builder.individualIds] with `individualIds.orElse(null)`. */
        fun individualIds(individualIds: Optional<List<String>>) =
            individualIds(individualIds.getOrNull())

        /**
         * Sets [Builder.individualIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.individualIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun individualIds(individualIds: JsonField<List<String>>) = apply {
            this.individualIds = individualIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [individualIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIndividualId(individualId: String) = apply {
            individualIds =
                (individualIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("individualIds", it).add(individualId)
                }
        }

        fun netPay(netPay: Money?) = netPay(JsonField.ofNullable(netPay))

        /** Alias for calling [Builder.netPay] with `netPay.orElse(null)`. */
        fun netPay(netPay: Optional<Money>) = netPay(netPay.getOrNull())

        /**
         * Sets [Builder.netPay] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netPay] with a well-typed [Money] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun netPay(netPay: JsonField<Money>) = apply { this.netPay = netPay }

        fun payDate(payDate: String?) = payDate(JsonField.ofNullable(payDate))

        /** Alias for calling [Builder.payDate] with `payDate.orElse(null)`. */
        fun payDate(payDate: Optional<String>) = payDate(payDate.getOrNull())

        /**
         * Sets [Builder.payDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payDate] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun payDate(payDate: JsonField<String>) = apply { this.payDate = payDate }

        /** List of pay frequencies associated with this payment. */
        fun payFrequencies(payFrequencies: List<PayFrequency>?) =
            payFrequencies(JsonField.ofNullable(payFrequencies))

        /** Alias for calling [Builder.payFrequencies] with `payFrequencies.orElse(null)`. */
        fun payFrequencies(payFrequencies: Optional<List<PayFrequency>>) =
            payFrequencies(payFrequencies.getOrNull())

        /**
         * Sets [Builder.payFrequencies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payFrequencies] with a well-typed `List<PayFrequency>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun payFrequencies(payFrequencies: JsonField<List<PayFrequency>>) = apply {
            this.payFrequencies = payFrequencies.map { it.toMutableList() }
        }

        /**
         * Adds a single [PayFrequency] to [payFrequencies].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPayFrequency(payFrequency: PayFrequency) = apply {
            payFrequencies =
                (payFrequencies ?: JsonField.of(mutableListOf())).also {
                    checkKnown("payFrequencies", it).add(payFrequency)
                }
        }

        /** Array of the Finch id (uuidv4) of every pay group associated with this payment. */
        fun payGroupIds(payGroupIds: List<String>?) = payGroupIds(JsonField.ofNullable(payGroupIds))

        /** Alias for calling [Builder.payGroupIds] with `payGroupIds.orElse(null)`. */
        fun payGroupIds(payGroupIds: Optional<List<String>>) = payGroupIds(payGroupIds.getOrNull())

        /**
         * Sets [Builder.payGroupIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payGroupIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun payGroupIds(payGroupIds: JsonField<List<String>>) = apply {
            this.payGroupIds = payGroupIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [payGroupIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPayGroupId(payGroupId: String) = apply {
            payGroupIds =
                (payGroupIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("payGroupIds", it).add(payGroupId)
                }
        }

        /** The pay period object. */
        fun payPeriod(payPeriod: PayPeriod?) = payPeriod(JsonField.ofNullable(payPeriod))

        /** Alias for calling [Builder.payPeriod] with `payPeriod.orElse(null)`. */
        fun payPeriod(payPeriod: Optional<PayPeriod>) = payPeriod(payPeriod.getOrNull())

        /**
         * Sets [Builder.payPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payPeriod] with a well-typed [PayPeriod] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun payPeriod(payPeriod: JsonField<PayPeriod>) = apply { this.payPeriod = payPeriod }

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
         * Returns an immutable instance of [Payment].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Payment =
            Payment(
                id,
                companyDebit,
                debitDate,
                employeeTaxes,
                employerTaxes,
                grossPay,
                (individualIds ?: JsonMissing.of()).map { it.toImmutable() },
                netPay,
                payDate,
                (payFrequencies ?: JsonMissing.of()).map { it.toImmutable() },
                (payGroupIds ?: JsonMissing.of()).map { it.toImmutable() },
                payPeriod,
                additionalProperties.toImmutable(),
            )
    }

    class PayFrequency @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val ANNUALLY = of("annually")

            @JvmField val SEMI_ANNUALLY = of("semi_annually")

            @JvmField val QUARTERLY = of("quarterly")

            @JvmField val MONTHLY = of("monthly")

            @JvmField val SEMI_MONTHLY = of("semi_monthly")

            @JvmField val BI_WEEKLY = of("bi_weekly")

            @JvmField val WEEKLY = of("weekly")

            @JvmField val DAILY = of("daily")

            @JvmField val OTHER = of("other")

            @JvmStatic fun of(value: String) = PayFrequency(JsonField.of(value))
        }

        /** An enum containing [PayFrequency]'s known values. */
        enum class Known {
            ANNUALLY,
            SEMI_ANNUALLY,
            QUARTERLY,
            MONTHLY,
            SEMI_MONTHLY,
            BI_WEEKLY,
            WEEKLY,
            DAILY,
            OTHER,
        }

        /**
         * An enum containing [PayFrequency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PayFrequency] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ANNUALLY,
            SEMI_ANNUALLY,
            QUARTERLY,
            MONTHLY,
            SEMI_MONTHLY,
            BI_WEEKLY,
            WEEKLY,
            DAILY,
            OTHER,
            /**
             * An enum member indicating that [PayFrequency] was instantiated with an unknown value.
             */
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
                ANNUALLY -> Value.ANNUALLY
                SEMI_ANNUALLY -> Value.SEMI_ANNUALLY
                QUARTERLY -> Value.QUARTERLY
                MONTHLY -> Value.MONTHLY
                SEMI_MONTHLY -> Value.SEMI_MONTHLY
                BI_WEEKLY -> Value.BI_WEEKLY
                WEEKLY -> Value.WEEKLY
                DAILY -> Value.DAILY
                OTHER -> Value.OTHER
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
                ANNUALLY -> Known.ANNUALLY
                SEMI_ANNUALLY -> Known.SEMI_ANNUALLY
                QUARTERLY -> Known.QUARTERLY
                MONTHLY -> Known.MONTHLY
                SEMI_MONTHLY -> Known.SEMI_MONTHLY
                BI_WEEKLY -> Known.BI_WEEKLY
                WEEKLY -> Known.WEEKLY
                DAILY -> Known.DAILY
                OTHER -> Known.OTHER
                else -> throw FinchInvalidDataException("Unknown PayFrequency: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PayFrequency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The pay period object. */
    @NoAutoDetect
    class PayPeriod
    @JsonCreator
    private constructor(
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): Optional<String> = Optional.ofNullable(endDate.getNullable("end_date"))

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startDate(): Optional<String> = Optional.ofNullable(startDate.getNullable("start_date"))

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<String> = endDate

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date") @ExcludeMissing fun _startDate(): JsonField<String> = startDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PayPeriod = apply {
            if (validated) {
                return@apply
            }

            endDate()
            startDate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [PayPeriod]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PayPeriod]. */
        class Builder internal constructor() {

            private var endDate: JsonField<String> = JsonMissing.of()
            private var startDate: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(payPeriod: PayPeriod) = apply {
                endDate = payPeriod.endDate
                startDate = payPeriod.startDate
                additionalProperties = payPeriod.additionalProperties.toMutableMap()
            }

            fun endDate(endDate: String?) = endDate(JsonField.ofNullable(endDate))

            /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
            fun endDate(endDate: Optional<String>) = endDate(endDate.getOrNull())

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<String>) = apply { this.endDate = endDate }

            fun startDate(startDate: String?) = startDate(JsonField.ofNullable(startDate))

            /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
            fun startDate(startDate: Optional<String>) = startDate(startDate.getOrNull())

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<String>) = apply { this.startDate = startDate }

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
             * Returns an immutable instance of [PayPeriod].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PayPeriod =
                PayPeriod(endDate, startDate, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PayPeriod && endDate == other.endDate && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(endDate, startDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PayPeriod{endDate=$endDate, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Payment && id == other.id && companyDebit == other.companyDebit && debitDate == other.debitDate && employeeTaxes == other.employeeTaxes && employerTaxes == other.employerTaxes && grossPay == other.grossPay && individualIds == other.individualIds && netPay == other.netPay && payDate == other.payDate && payFrequencies == other.payFrequencies && payGroupIds == other.payGroupIds && payPeriod == other.payPeriod && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, companyDebit, debitDate, employeeTaxes, employerTaxes, grossPay, individualIds, netPay, payDate, payFrequencies, payGroupIds, payPeriod, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Payment{id=$id, companyDebit=$companyDebit, debitDate=$debitDate, employeeTaxes=$employeeTaxes, employerTaxes=$employerTaxes, grossPay=$grossPay, individualIds=$individualIds, netPay=$netPay, payDate=$payDate, payFrequencies=$payFrequencies, payGroupIds=$payGroupIds, payPeriod=$payPeriod, additionalProperties=$additionalProperties}"
}

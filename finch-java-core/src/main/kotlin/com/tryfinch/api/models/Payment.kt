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

@NoAutoDetect
class Payment
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("pay_period")
    @ExcludeMissing
    private val payPeriod: JsonField<PayPeriod> = JsonMissing.of(),
    @JsonProperty("pay_date")
    @ExcludeMissing
    private val payDate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("debit_date")
    @ExcludeMissing
    private val debitDate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("company_debit")
    @ExcludeMissing
    private val companyDebit: JsonField<Money> = JsonMissing.of(),
    @JsonProperty("gross_pay")
    @ExcludeMissing
    private val grossPay: JsonField<Money> = JsonMissing.of(),
    @JsonProperty("net_pay")
    @ExcludeMissing
    private val netPay: JsonField<Money> = JsonMissing.of(),
    @JsonProperty("employer_taxes")
    @ExcludeMissing
    private val employerTaxes: JsonField<Money> = JsonMissing.of(),
    @JsonProperty("employee_taxes")
    @ExcludeMissing
    private val employeeTaxes: JsonField<Money> = JsonMissing.of(),
    @JsonProperty("individual_ids")
    @ExcludeMissing
    private val individualIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("pay_group_ids")
    @ExcludeMissing
    private val payGroupIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("pay_frequencies")
    @ExcludeMissing
    private val payFrequencies: JsonField<List<PayFrequency>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The unique id for the payment. */
    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /** The pay period object. */
    fun payPeriod(): Optional<PayPeriod> = Optional.ofNullable(payPeriod.getNullable("pay_period"))

    fun payDate(): Optional<String> = Optional.ofNullable(payDate.getNullable("pay_date"))

    fun debitDate(): Optional<String> = Optional.ofNullable(debitDate.getNullable("debit_date"))

    fun companyDebit(): Optional<Money> =
        Optional.ofNullable(companyDebit.getNullable("company_debit"))

    fun grossPay(): Optional<Money> = Optional.ofNullable(grossPay.getNullable("gross_pay"))

    fun netPay(): Optional<Money> = Optional.ofNullable(netPay.getNullable("net_pay"))

    fun employerTaxes(): Optional<Money> =
        Optional.ofNullable(employerTaxes.getNullable("employer_taxes"))

    fun employeeTaxes(): Optional<Money> =
        Optional.ofNullable(employeeTaxes.getNullable("employee_taxes"))

    /** Array of every individual on this payment. */
    fun individualIds(): Optional<List<String>> =
        Optional.ofNullable(individualIds.getNullable("individual_ids"))

    /** Array of the Finch id (uuidv4) of every pay group associated with this payment. */
    fun payGroupIds(): Optional<List<String>> =
        Optional.ofNullable(payGroupIds.getNullable("pay_group_ids"))

    /** List of pay frequencies associated with this payment. */
    fun payFrequencies(): Optional<List<PayFrequency>> =
        Optional.ofNullable(payFrequencies.getNullable("pay_frequencies"))

    /** The unique id for the payment. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The pay period object. */
    @JsonProperty("pay_period") @ExcludeMissing fun _payPeriod() = payPeriod

    @JsonProperty("pay_date") @ExcludeMissing fun _payDate() = payDate

    @JsonProperty("debit_date") @ExcludeMissing fun _debitDate() = debitDate

    @JsonProperty("company_debit") @ExcludeMissing fun _companyDebit() = companyDebit

    @JsonProperty("gross_pay") @ExcludeMissing fun _grossPay() = grossPay

    @JsonProperty("net_pay") @ExcludeMissing fun _netPay() = netPay

    @JsonProperty("employer_taxes") @ExcludeMissing fun _employerTaxes() = employerTaxes

    @JsonProperty("employee_taxes") @ExcludeMissing fun _employeeTaxes() = employeeTaxes

    /** Array of every individual on this payment. */
    @JsonProperty("individual_ids") @ExcludeMissing fun _individualIds() = individualIds

    /** Array of the Finch id (uuidv4) of every pay group associated with this payment. */
    @JsonProperty("pay_group_ids") @ExcludeMissing fun _payGroupIds() = payGroupIds

    /** List of pay frequencies associated with this payment. */
    @JsonProperty("pay_frequencies") @ExcludeMissing fun _payFrequencies() = payFrequencies

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Payment = apply {
        if (!validated) {
            id()
            payPeriod().map { it.validate() }
            payDate()
            debitDate()
            companyDebit().map { it.validate() }
            grossPay().map { it.validate() }
            netPay().map { it.validate() }
            employerTaxes().map { it.validate() }
            employeeTaxes().map { it.validate() }
            individualIds()
            payGroupIds()
            payFrequencies()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var payPeriod: JsonField<PayPeriod> = JsonMissing.of()
        private var payDate: JsonField<String> = JsonMissing.of()
        private var debitDate: JsonField<String> = JsonMissing.of()
        private var companyDebit: JsonField<Money> = JsonMissing.of()
        private var grossPay: JsonField<Money> = JsonMissing.of()
        private var netPay: JsonField<Money> = JsonMissing.of()
        private var employerTaxes: JsonField<Money> = JsonMissing.of()
        private var employeeTaxes: JsonField<Money> = JsonMissing.of()
        private var individualIds: JsonField<List<String>> = JsonMissing.of()
        private var payGroupIds: JsonField<List<String>> = JsonMissing.of()
        private var payFrequencies: JsonField<List<PayFrequency>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payment: Payment) = apply {
            id = payment.id
            payPeriod = payment.payPeriod
            payDate = payment.payDate
            debitDate = payment.debitDate
            companyDebit = payment.companyDebit
            grossPay = payment.grossPay
            netPay = payment.netPay
            employerTaxes = payment.employerTaxes
            employeeTaxes = payment.employeeTaxes
            individualIds = payment.individualIds
            payGroupIds = payment.payGroupIds
            payFrequencies = payment.payFrequencies
            additionalProperties = payment.additionalProperties.toMutableMap()
        }

        /** The unique id for the payment. */
        fun id(id: String) = id(JsonField.of(id))

        /** The unique id for the payment. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The pay period object. */
        fun payPeriod(payPeriod: PayPeriod) = payPeriod(JsonField.of(payPeriod))

        /** The pay period object. */
        fun payPeriod(payPeriod: JsonField<PayPeriod>) = apply { this.payPeriod = payPeriod }

        fun payDate(payDate: String) = payDate(JsonField.of(payDate))

        fun payDate(payDate: JsonField<String>) = apply { this.payDate = payDate }

        fun debitDate(debitDate: String) = debitDate(JsonField.of(debitDate))

        fun debitDate(debitDate: JsonField<String>) = apply { this.debitDate = debitDate }

        fun companyDebit(companyDebit: Money) = companyDebit(JsonField.of(companyDebit))

        fun companyDebit(companyDebit: JsonField<Money>) = apply {
            this.companyDebit = companyDebit
        }

        fun grossPay(grossPay: Money) = grossPay(JsonField.of(grossPay))

        fun grossPay(grossPay: JsonField<Money>) = apply { this.grossPay = grossPay }

        fun netPay(netPay: Money) = netPay(JsonField.of(netPay))

        fun netPay(netPay: JsonField<Money>) = apply { this.netPay = netPay }

        fun employerTaxes(employerTaxes: Money) = employerTaxes(JsonField.of(employerTaxes))

        fun employerTaxes(employerTaxes: JsonField<Money>) = apply {
            this.employerTaxes = employerTaxes
        }

        fun employeeTaxes(employeeTaxes: Money) = employeeTaxes(JsonField.of(employeeTaxes))

        fun employeeTaxes(employeeTaxes: JsonField<Money>) = apply {
            this.employeeTaxes = employeeTaxes
        }

        /** Array of every individual on this payment. */
        fun individualIds(individualIds: List<String>) = individualIds(JsonField.of(individualIds))

        /** Array of every individual on this payment. */
        fun individualIds(individualIds: JsonField<List<String>>) = apply {
            this.individualIds = individualIds
        }

        /** Array of the Finch id (uuidv4) of every pay group associated with this payment. */
        fun payGroupIds(payGroupIds: List<String>) = payGroupIds(JsonField.of(payGroupIds))

        /** Array of the Finch id (uuidv4) of every pay group associated with this payment. */
        fun payGroupIds(payGroupIds: JsonField<List<String>>) = apply {
            this.payGroupIds = payGroupIds
        }

        /** List of pay frequencies associated with this payment. */
        fun payFrequencies(payFrequencies: List<PayFrequency>) =
            payFrequencies(JsonField.of(payFrequencies))

        /** List of pay frequencies associated with this payment. */
        fun payFrequencies(payFrequencies: JsonField<List<PayFrequency>>) = apply {
            this.payFrequencies = payFrequencies
        }

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

        fun build(): Payment =
            Payment(
                id,
                payPeriod,
                payDate,
                debitDate,
                companyDebit,
                grossPay,
                netPay,
                employerTaxes,
                employeeTaxes,
                individualIds.map { it.toImmutable() },
                payGroupIds.map { it.toImmutable() },
                payFrequencies.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    class PayFrequency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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
            _UNKNOWN,
        }

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

        fun asString(): String = _value().asStringOrThrow()

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
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun startDate(): Optional<String> = Optional.ofNullable(startDate.getNullable("start_date"))

        fun endDate(): Optional<String> = Optional.ofNullable(endDate.getNullable("end_date"))

        @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

        @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PayPeriod = apply {
            if (!validated) {
                startDate()
                endDate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var startDate: JsonField<String> = JsonMissing.of()
            private var endDate: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(payPeriod: PayPeriod) = apply {
                startDate = payPeriod.startDate
                endDate = payPeriod.endDate
                additionalProperties = payPeriod.additionalProperties.toMutableMap()
            }

            fun startDate(startDate: String) = startDate(JsonField.of(startDate))

            fun startDate(startDate: JsonField<String>) = apply { this.startDate = startDate }

            fun endDate(endDate: String) = endDate(JsonField.of(endDate))

            fun endDate(endDate: JsonField<String>) = apply { this.endDate = endDate }

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

            fun build(): PayPeriod =
                PayPeriod(
                    startDate,
                    endDate,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PayPeriod && startDate == other.startDate && endDate == other.endDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(startDate, endDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PayPeriod{startDate=$startDate, endDate=$endDate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Payment && id == other.id && payPeriod == other.payPeriod && payDate == other.payDate && debitDate == other.debitDate && companyDebit == other.companyDebit && grossPay == other.grossPay && netPay == other.netPay && employerTaxes == other.employerTaxes && employeeTaxes == other.employeeTaxes && individualIds == other.individualIds && payGroupIds == other.payGroupIds && payFrequencies == other.payFrequencies && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, payPeriod, payDate, debitDate, companyDebit, grossPay, netPay, employerTaxes, employeeTaxes, individualIds, payGroupIds, payFrequencies, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Payment{id=$id, payPeriod=$payPeriod, payDate=$payDate, debitDate=$debitDate, companyDebit=$companyDebit, grossPay=$grossPay, netPay=$netPay, employerTaxes=$employerTaxes, employeeTaxes=$employeeTaxes, individualIds=$individualIds, payGroupIds=$payGroupIds, payFrequencies=$payFrequencies, additionalProperties=$additionalProperties}"
}

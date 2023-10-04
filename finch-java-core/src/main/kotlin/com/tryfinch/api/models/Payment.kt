// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = Payment.Builder::class)
@NoAutoDetect
class Payment
private constructor(
    private val id: JsonField<String>,
    private val payPeriod: JsonField<PayPeriod>,
    private val payDate: JsonField<String>,
    private val debitDate: JsonField<String>,
    private val companyDebit: JsonField<Money>,
    private val grossPay: JsonField<Money>,
    private val netPay: JsonField<Money>,
    private val employerTaxes: JsonField<Money>,
    private val employeeTaxes: JsonField<Money>,
    private val individualIds: JsonField<List<String>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

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

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Payment &&
            this.id == other.id &&
            this.payPeriod == other.payPeriod &&
            this.payDate == other.payDate &&
            this.debitDate == other.debitDate &&
            this.companyDebit == other.companyDebit &&
            this.grossPay == other.grossPay &&
            this.netPay == other.netPay &&
            this.employerTaxes == other.employerTaxes &&
            this.employeeTaxes == other.employeeTaxes &&
            this.individualIds == other.individualIds &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    payPeriod,
                    payDate,
                    debitDate,
                    companyDebit,
                    grossPay,
                    netPay,
                    employerTaxes,
                    employeeTaxes,
                    individualIds,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Payment{id=$id, payPeriod=$payPeriod, payDate=$payDate, debitDate=$debitDate, companyDebit=$companyDebit, grossPay=$grossPay, netPay=$netPay, employerTaxes=$employerTaxes, employeeTaxes=$employeeTaxes, individualIds=$individualIds, additionalProperties=$additionalProperties}"

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
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payment: Payment) = apply {
            this.id = payment.id
            this.payPeriod = payment.payPeriod
            this.payDate = payment.payDate
            this.debitDate = payment.debitDate
            this.companyDebit = payment.companyDebit
            this.grossPay = payment.grossPay
            this.netPay = payment.netPay
            this.employerTaxes = payment.employerTaxes
            this.employeeTaxes = payment.employeeTaxes
            this.individualIds = payment.individualIds
            additionalProperties(payment.additionalProperties)
        }

        /** The unique id for the payment. */
        fun id(id: String) = id(JsonField.of(id))

        /** The unique id for the payment. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The pay period object. */
        fun payPeriod(payPeriod: PayPeriod) = payPeriod(JsonField.of(payPeriod))

        /** The pay period object. */
        @JsonProperty("pay_period")
        @ExcludeMissing
        fun payPeriod(payPeriod: JsonField<PayPeriod>) = apply { this.payPeriod = payPeriod }

        fun payDate(payDate: String) = payDate(JsonField.of(payDate))

        @JsonProperty("pay_date")
        @ExcludeMissing
        fun payDate(payDate: JsonField<String>) = apply { this.payDate = payDate }

        fun debitDate(debitDate: String) = debitDate(JsonField.of(debitDate))

        @JsonProperty("debit_date")
        @ExcludeMissing
        fun debitDate(debitDate: JsonField<String>) = apply { this.debitDate = debitDate }

        fun companyDebit(companyDebit: Money) = companyDebit(JsonField.of(companyDebit))

        @JsonProperty("company_debit")
        @ExcludeMissing
        fun companyDebit(companyDebit: JsonField<Money>) = apply {
            this.companyDebit = companyDebit
        }

        fun grossPay(grossPay: Money) = grossPay(JsonField.of(grossPay))

        @JsonProperty("gross_pay")
        @ExcludeMissing
        fun grossPay(grossPay: JsonField<Money>) = apply { this.grossPay = grossPay }

        fun netPay(netPay: Money) = netPay(JsonField.of(netPay))

        @JsonProperty("net_pay")
        @ExcludeMissing
        fun netPay(netPay: JsonField<Money>) = apply { this.netPay = netPay }

        fun employerTaxes(employerTaxes: Money) = employerTaxes(JsonField.of(employerTaxes))

        @JsonProperty("employer_taxes")
        @ExcludeMissing
        fun employerTaxes(employerTaxes: JsonField<Money>) = apply {
            this.employerTaxes = employerTaxes
        }

        fun employeeTaxes(employeeTaxes: Money) = employeeTaxes(JsonField.of(employeeTaxes))

        @JsonProperty("employee_taxes")
        @ExcludeMissing
        fun employeeTaxes(employeeTaxes: JsonField<Money>) = apply {
            this.employeeTaxes = employeeTaxes
        }

        /** Array of every individual on this payment. */
        fun individualIds(individualIds: List<String>) = individualIds(JsonField.of(individualIds))

        /** Array of every individual on this payment. */
        @JsonProperty("individual_ids")
        @ExcludeMissing
        fun individualIds(individualIds: JsonField<List<String>>) = apply {
            this.individualIds = individualIds
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
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
                individualIds.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    /** The pay period object. */
    @JsonDeserialize(builder = PayPeriod.Builder::class)
    @NoAutoDetect
    class PayPeriod
    private constructor(
        private val startDate: JsonField<String>,
        private val endDate: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun startDate(): Optional<String> = Optional.ofNullable(startDate.getNullable("start_date"))

        fun endDate(): Optional<String> = Optional.ofNullable(endDate.getNullable("end_date"))

        @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

        @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): PayPeriod = apply {
            if (!validated) {
                startDate()
                endDate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PayPeriod &&
                this.startDate == other.startDate &&
                this.endDate == other.endDate &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        startDate,
                        endDate,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PayPeriod{startDate=$startDate, endDate=$endDate, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var startDate: JsonField<String> = JsonMissing.of()
            private var endDate: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(payPeriod: PayPeriod) = apply {
                this.startDate = payPeriod.startDate
                this.endDate = payPeriod.endDate
                additionalProperties(payPeriod.additionalProperties)
            }

            fun startDate(startDate: String) = startDate(JsonField.of(startDate))

            @JsonProperty("start_date")
            @ExcludeMissing
            fun startDate(startDate: JsonField<String>) = apply { this.startDate = startDate }

            fun endDate(endDate: String) = endDate(JsonField.of(endDate))

            @JsonProperty("end_date")
            @ExcludeMissing
            fun endDate(endDate: JsonField<String>) = apply { this.endDate = endDate }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): PayPeriod =
                PayPeriod(
                    startDate,
                    endDate,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}

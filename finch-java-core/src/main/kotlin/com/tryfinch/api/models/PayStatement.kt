// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = PayStatement.Builder::class)
@NoAutoDetect
class PayStatement
private constructor(
    private val individualId: JsonField<String>,
    private val type: JsonField<Type>,
    private val paymentMethod: JsonField<PaymentMethod>,
    private val totalHours: JsonField<Double>,
    private val grossPay: JsonField<Money>,
    private val netPay: JsonField<Money>,
    private val earnings: JsonField<List<Earning?>>,
    private val taxes: JsonField<List<Tax?>>,
    private val employeeDeductions: JsonField<List<EmployeeDeduction?>>,
    private val employerContributions: JsonField<List<EmployerContribution?>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** A stable Finch `id` (UUID v4) for an individual in the company */
    fun individualId(): Optional<String> =
        Optional.ofNullable(individualId.getNullable("individual_id"))

    /** The type of the payment associated with the pay statement. */
    fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

    /** The payment method. */
    fun paymentMethod(): Optional<PaymentMethod> =
        Optional.ofNullable(paymentMethod.getNullable("payment_method"))

    /** The number of hours worked for this pay period */
    fun totalHours(): Optional<Double> = Optional.ofNullable(totalHours.getNullable("total_hours"))

    fun grossPay(): Optional<Money> = Optional.ofNullable(grossPay.getNullable("gross_pay"))

    fun netPay(): Optional<Money> = Optional.ofNullable(netPay.getNullable("net_pay"))

    /** The array of earnings objects associated with this pay statement */
    fun earnings(): Optional<List<Earning?>> = Optional.ofNullable(earnings.getNullable("earnings"))

    /** The array of taxes objects associated with this pay statement. */
    fun taxes(): Optional<List<Tax?>> = Optional.ofNullable(taxes.getNullable("taxes"))

    /** The array of deductions objects associated with this pay statement. */
    fun employeeDeductions(): Optional<List<EmployeeDeduction?>> =
        Optional.ofNullable(employeeDeductions.getNullable("employee_deductions"))

    fun employerContributions(): Optional<List<EmployerContribution?>> =
        Optional.ofNullable(employerContributions.getNullable("employer_contributions"))

    /** A stable Finch `id` (UUID v4) for an individual in the company */
    @JsonProperty("individual_id") @ExcludeMissing fun _individualId() = individualId

    /** The type of the payment associated with the pay statement. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /** The payment method. */
    @JsonProperty("payment_method") @ExcludeMissing fun _paymentMethod() = paymentMethod

    /** The number of hours worked for this pay period */
    @JsonProperty("total_hours") @ExcludeMissing fun _totalHours() = totalHours

    @JsonProperty("gross_pay") @ExcludeMissing fun _grossPay() = grossPay

    @JsonProperty("net_pay") @ExcludeMissing fun _netPay() = netPay

    /** The array of earnings objects associated with this pay statement */
    @JsonProperty("earnings") @ExcludeMissing fun _earnings() = earnings

    /** The array of taxes objects associated with this pay statement. */
    @JsonProperty("taxes") @ExcludeMissing fun _taxes() = taxes

    /** The array of deductions objects associated with this pay statement. */
    @JsonProperty("employee_deductions")
    @ExcludeMissing
    fun _employeeDeductions() = employeeDeductions

    @JsonProperty("employer_contributions")
    @ExcludeMissing
    fun _employerContributions() = employerContributions

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PayStatement = apply {
        if (!validated) {
            individualId()
            type()
            paymentMethod()
            totalHours()
            grossPay().map { it.validate() }
            netPay().map { it.validate() }
            earnings().map { it.forEach { it?.validate() } }
            taxes().map { it.forEach { it?.validate() } }
            employeeDeductions().map { it.forEach { it?.validate() } }
            employerContributions().map { it.forEach { it?.validate() } }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var individualId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var paymentMethod: JsonField<PaymentMethod> = JsonMissing.of()
        private var totalHours: JsonField<Double> = JsonMissing.of()
        private var grossPay: JsonField<Money> = JsonMissing.of()
        private var netPay: JsonField<Money> = JsonMissing.of()
        private var earnings: JsonField<List<Earning?>> = JsonMissing.of()
        private var taxes: JsonField<List<Tax?>> = JsonMissing.of()
        private var employeeDeductions: JsonField<List<EmployeeDeduction?>> = JsonMissing.of()
        private var employerContributions: JsonField<List<EmployerContribution?>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payStatement: PayStatement) = apply {
            this.individualId = payStatement.individualId
            this.type = payStatement.type
            this.paymentMethod = payStatement.paymentMethod
            this.totalHours = payStatement.totalHours
            this.grossPay = payStatement.grossPay
            this.netPay = payStatement.netPay
            this.earnings = payStatement.earnings
            this.taxes = payStatement.taxes
            this.employeeDeductions = payStatement.employeeDeductions
            this.employerContributions = payStatement.employerContributions
            additionalProperties(payStatement.additionalProperties)
        }

        /** A stable Finch `id` (UUID v4) for an individual in the company */
        fun individualId(individualId: String) = individualId(JsonField.of(individualId))

        /** A stable Finch `id` (UUID v4) for an individual in the company */
        @JsonProperty("individual_id")
        @ExcludeMissing
        fun individualId(individualId: JsonField<String>) = apply {
            this.individualId = individualId
        }

        /** The type of the payment associated with the pay statement. */
        fun type(type: Type) = type(JsonField.of(type))

        /** The type of the payment associated with the pay statement. */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The payment method. */
        fun paymentMethod(paymentMethod: PaymentMethod) = paymentMethod(JsonField.of(paymentMethod))

        /** The payment method. */
        @JsonProperty("payment_method")
        @ExcludeMissing
        fun paymentMethod(paymentMethod: JsonField<PaymentMethod>) = apply {
            this.paymentMethod = paymentMethod
        }

        /** The number of hours worked for this pay period */
        fun totalHours(totalHours: Double) = totalHours(JsonField.of(totalHours))

        /** The number of hours worked for this pay period */
        @JsonProperty("total_hours")
        @ExcludeMissing
        fun totalHours(totalHours: JsonField<Double>) = apply { this.totalHours = totalHours }

        fun grossPay(grossPay: Money) = grossPay(JsonField.of(grossPay))

        @JsonProperty("gross_pay")
        @ExcludeMissing
        fun grossPay(grossPay: JsonField<Money>) = apply { this.grossPay = grossPay }

        fun netPay(netPay: Money) = netPay(JsonField.of(netPay))

        @JsonProperty("net_pay")
        @ExcludeMissing
        fun netPay(netPay: JsonField<Money>) = apply { this.netPay = netPay }

        /** The array of earnings objects associated with this pay statement */
        fun earnings(earnings: List<Earning?>) = earnings(JsonField.of(earnings))

        /** The array of earnings objects associated with this pay statement */
        @JsonProperty("earnings")
        @ExcludeMissing
        fun earnings(earnings: JsonField<List<Earning?>>) = apply { this.earnings = earnings }

        /** The array of taxes objects associated with this pay statement. */
        fun taxes(taxes: List<Tax?>) = taxes(JsonField.of(taxes))

        /** The array of taxes objects associated with this pay statement. */
        @JsonProperty("taxes")
        @ExcludeMissing
        fun taxes(taxes: JsonField<List<Tax?>>) = apply { this.taxes = taxes }

        /** The array of deductions objects associated with this pay statement. */
        fun employeeDeductions(employeeDeductions: List<EmployeeDeduction?>) =
            employeeDeductions(JsonField.of(employeeDeductions))

        /** The array of deductions objects associated with this pay statement. */
        @JsonProperty("employee_deductions")
        @ExcludeMissing
        fun employeeDeductions(employeeDeductions: JsonField<List<EmployeeDeduction?>>) = apply {
            this.employeeDeductions = employeeDeductions
        }

        fun employerContributions(employerContributions: List<EmployerContribution?>) =
            employerContributions(JsonField.of(employerContributions))

        @JsonProperty("employer_contributions")
        @ExcludeMissing
        fun employerContributions(employerContributions: JsonField<List<EmployerContribution?>>) =
            apply {
                this.employerContributions = employerContributions
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

        fun build(): PayStatement =
            PayStatement(
                individualId,
                type,
                paymentMethod,
                totalHours,
                grossPay,
                netPay,
                earnings.map { it.toImmutable() },
                taxes.map { it.toImmutable() },
                employeeDeductions.map { it.toImmutable() },
                employerContributions.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Earning.Builder::class)
    @NoAutoDetect
    class Earning
    private constructor(
        private val type: JsonField<Type>,
        private val name: JsonField<String>,
        private val amount: JsonField<Long>,
        private val currency: JsonField<String>,
        private val hours: JsonField<Double>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The type of earning. */
        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        /** The exact name of the deduction from the pay statement. */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** The earnings amount in cents. */
        fun amount(): Optional<Long> = Optional.ofNullable(amount.getNullable("amount"))

        /** The earnings currency code. */
        fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

        /**
         * The number of hours associated with this earning. (For salaried employees, this could be
         * hours per pay period, `0` or `null`, depending on the provider).
         */
        fun hours(): Optional<Double> = Optional.ofNullable(hours.getNullable("hours"))

        /** The type of earning. */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        /** The exact name of the deduction from the pay statement. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** The earnings amount in cents. */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** The earnings currency code. */
        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        /**
         * The number of hours associated with this earning. (For salaried employees, this could be
         * hours per pay period, `0` or `null`, depending on the provider).
         */
        @JsonProperty("hours") @ExcludeMissing fun _hours() = hours

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Earning = apply {
            if (!validated) {
                type()
                name()
                amount()
                currency()
                hours()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: JsonField<Type> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var hours: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(earning: Earning) = apply {
                this.type = earning.type
                this.name = earning.name
                this.amount = earning.amount
                this.currency = earning.currency
                this.hours = earning.hours
                additionalProperties(earning.additionalProperties)
            }

            /** The type of earning. */
            fun type(type: Type) = type(JsonField.of(type))

            /** The type of earning. */
            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The exact name of the deduction from the pay statement. */
            fun name(name: String) = name(JsonField.of(name))

            /** The exact name of the deduction from the pay statement. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The earnings amount in cents. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The earnings amount in cents. */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The earnings currency code. */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /** The earnings currency code. */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /**
             * The number of hours associated with this earning. (For salaried employees, this could
             * be hours per pay period, `0` or `null`, depending on the provider).
             */
            fun hours(hours: Double) = hours(JsonField.of(hours))

            /**
             * The number of hours associated with this earning. (For salaried employees, this could
             * be hours per pay period, `0` or `null`, depending on the provider).
             */
            @JsonProperty("hours")
            @ExcludeMissing
            fun hours(hours: JsonField<Double>) = apply { this.hours = hours }

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

            fun build(): Earning =
                Earning(
                    type,
                    name,
                    amount,
                    currency,
                    hours,
                    additionalProperties.toImmutable(),
                )
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val SALARY = of("salary")

                @JvmField val WAGE = of("wage")

                @JvmField val REIMBURSEMENT = of("reimbursement")

                @JvmField val OVERTIME = of("overtime")

                @JvmField val SEVERANCE = of("severance")

                @JvmField val DOUBLE_OVERTIME = of("double_overtime")

                @JvmField val PTO = of("pto")

                @JvmField val SICK = of("sick")

                @JvmField val BONUS = of("bonus")

                @JvmField val COMMISSION = of("commission")

                @JvmField val TIPS = of("tips")

                @JvmField val _1099 = of("1099")

                @JvmField val OTHER = of("other")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                SALARY,
                WAGE,
                REIMBURSEMENT,
                OVERTIME,
                SEVERANCE,
                DOUBLE_OVERTIME,
                PTO,
                SICK,
                BONUS,
                COMMISSION,
                TIPS,
                _1099,
                OTHER,
            }

            enum class Value {
                SALARY,
                WAGE,
                REIMBURSEMENT,
                OVERTIME,
                SEVERANCE,
                DOUBLE_OVERTIME,
                PTO,
                SICK,
                BONUS,
                COMMISSION,
                TIPS,
                _1099,
                OTHER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    SALARY -> Value.SALARY
                    WAGE -> Value.WAGE
                    REIMBURSEMENT -> Value.REIMBURSEMENT
                    OVERTIME -> Value.OVERTIME
                    SEVERANCE -> Value.SEVERANCE
                    DOUBLE_OVERTIME -> Value.DOUBLE_OVERTIME
                    PTO -> Value.PTO
                    SICK -> Value.SICK
                    BONUS -> Value.BONUS
                    COMMISSION -> Value.COMMISSION
                    TIPS -> Value.TIPS
                    _1099 -> Value._1099
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    SALARY -> Known.SALARY
                    WAGE -> Known.WAGE
                    REIMBURSEMENT -> Known.REIMBURSEMENT
                    OVERTIME -> Known.OVERTIME
                    SEVERANCE -> Known.SEVERANCE
                    DOUBLE_OVERTIME -> Known.DOUBLE_OVERTIME
                    PTO -> Known.PTO
                    SICK -> Known.SICK
                    BONUS -> Known.BONUS
                    COMMISSION -> Known.COMMISSION
                    TIPS -> Known.TIPS
                    _1099 -> Known._1099
                    OTHER -> Known.OTHER
                    else -> throw FinchInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Earning && type == other.type && name == other.name && amount == other.amount && currency == other.currency && hours == other.hours && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, name, amount, currency, hours, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Earning{type=$type, name=$name, amount=$amount, currency=$currency, hours=$hours, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = EmployeeDeduction.Builder::class)
    @NoAutoDetect
    class EmployeeDeduction
    private constructor(
        private val name: JsonField<String>,
        private val amount: JsonField<Long>,
        private val currency: JsonField<String>,
        private val preTax: JsonField<Boolean>,
        private val type: JsonField<BenefitType>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The deduction name from the pay statement. */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** The deduction amount in cents. */
        fun amount(): Optional<Long> = Optional.ofNullable(amount.getNullable("amount"))

        /** The deduction currency. */
        fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

        /** Boolean indicating if the deduction is pre-tax. */
        fun preTax(): Optional<Boolean> = Optional.ofNullable(preTax.getNullable("pre_tax"))

        /** Type of benefit. */
        fun type(): Optional<BenefitType> = Optional.ofNullable(type.getNullable("type"))

        /** The deduction name from the pay statement. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** The deduction amount in cents. */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** The deduction currency. */
        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        /** Boolean indicating if the deduction is pre-tax. */
        @JsonProperty("pre_tax") @ExcludeMissing fun _preTax() = preTax

        /** Type of benefit. */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): EmployeeDeduction = apply {
            if (!validated) {
                name()
                amount()
                currency()
                preTax()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var preTax: JsonField<Boolean> = JsonMissing.of()
            private var type: JsonField<BenefitType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(employeeDeduction: EmployeeDeduction) = apply {
                this.name = employeeDeduction.name
                this.amount = employeeDeduction.amount
                this.currency = employeeDeduction.currency
                this.preTax = employeeDeduction.preTax
                this.type = employeeDeduction.type
                additionalProperties(employeeDeduction.additionalProperties)
            }

            /** The deduction name from the pay statement. */
            fun name(name: String) = name(JsonField.of(name))

            /** The deduction name from the pay statement. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The deduction amount in cents. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The deduction amount in cents. */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The deduction currency. */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /** The deduction currency. */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** Boolean indicating if the deduction is pre-tax. */
            fun preTax(preTax: Boolean) = preTax(JsonField.of(preTax))

            /** Boolean indicating if the deduction is pre-tax. */
            @JsonProperty("pre_tax")
            @ExcludeMissing
            fun preTax(preTax: JsonField<Boolean>) = apply { this.preTax = preTax }

            /** Type of benefit. */
            fun type(type: BenefitType) = type(JsonField.of(type))

            /** Type of benefit. */
            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<BenefitType>) = apply { this.type = type }

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

            fun build(): EmployeeDeduction =
                EmployeeDeduction(
                    name,
                    amount,
                    currency,
                    preTax,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EmployeeDeduction && name == other.name && amount == other.amount && currency == other.currency && preTax == other.preTax && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, amount, currency, preTax, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EmployeeDeduction{name=$name, amount=$amount, currency=$currency, preTax=$preTax, type=$type, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = EmployerContribution.Builder::class)
    @NoAutoDetect
    class EmployerContribution
    private constructor(
        private val name: JsonField<String>,
        private val amount: JsonField<Long>,
        private val currency: JsonField<String>,
        private val type: JsonField<BenefitType>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The contribution name from the pay statement. */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** The contribution amount in cents. */
        fun amount(): Optional<Long> = Optional.ofNullable(amount.getNullable("amount"))

        /** The contribution currency. */
        fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

        /** Type of benefit. */
        fun type(): Optional<BenefitType> = Optional.ofNullable(type.getNullable("type"))

        /** The contribution name from the pay statement. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** The contribution amount in cents. */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** The contribution currency. */
        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        /** Type of benefit. */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): EmployerContribution = apply {
            if (!validated) {
                name()
                amount()
                currency()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var type: JsonField<BenefitType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(employerContribution: EmployerContribution) = apply {
                this.name = employerContribution.name
                this.amount = employerContribution.amount
                this.currency = employerContribution.currency
                this.type = employerContribution.type
                additionalProperties(employerContribution.additionalProperties)
            }

            /** The contribution name from the pay statement. */
            fun name(name: String) = name(JsonField.of(name))

            /** The contribution name from the pay statement. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The contribution amount in cents. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The contribution amount in cents. */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The contribution currency. */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /** The contribution currency. */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** Type of benefit. */
            fun type(type: BenefitType) = type(JsonField.of(type))

            /** Type of benefit. */
            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<BenefitType>) = apply { this.type = type }

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

            fun build(): EmployerContribution =
                EmployerContribution(
                    name,
                    amount,
                    currency,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EmployerContribution && name == other.name && amount == other.amount && currency == other.currency && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, amount, currency, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EmployerContribution{name=$name, amount=$amount, currency=$currency, type=$type, additionalProperties=$additionalProperties}"
    }

    class PaymentMethod
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CHECK = of("check")

            @JvmField val DIRECT_DEPOSIT = of("direct_deposit")

            @JvmStatic fun of(value: String) = PaymentMethod(JsonField.of(value))
        }

        enum class Known {
            CHECK,
            DIRECT_DEPOSIT,
        }

        enum class Value {
            CHECK,
            DIRECT_DEPOSIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CHECK -> Value.CHECK
                DIRECT_DEPOSIT -> Value.DIRECT_DEPOSIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CHECK -> Known.CHECK
                DIRECT_DEPOSIT -> Known.DIRECT_DEPOSIT
                else -> throw FinchInvalidDataException("Unknown PaymentMethod: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = Tax.Builder::class)
    @NoAutoDetect
    class Tax
    private constructor(
        private val type: JsonField<Type>,
        private val name: JsonField<String>,
        private val employer: JsonField<Boolean>,
        private val amount: JsonField<Long>,
        private val currency: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The type of taxes. */
        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        /** The exact name of tax from the pay statement. */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** `true` if the amount is paid by the employers. */
        fun employer(): Optional<Boolean> = Optional.ofNullable(employer.getNullable("employer"))

        /** The tax amount in cents. */
        fun amount(): Optional<Long> = Optional.ofNullable(amount.getNullable("amount"))

        /** The currency code. */
        fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

        /** The type of taxes. */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        /** The exact name of tax from the pay statement. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** `true` if the amount is paid by the employers. */
        @JsonProperty("employer") @ExcludeMissing fun _employer() = employer

        /** The tax amount in cents. */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** The currency code. */
        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Tax = apply {
            if (!validated) {
                type()
                name()
                employer()
                amount()
                currency()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: JsonField<Type> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var employer: JsonField<Boolean> = JsonMissing.of()
            private var amount: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(tax: Tax) = apply {
                this.type = tax.type
                this.name = tax.name
                this.employer = tax.employer
                this.amount = tax.amount
                this.currency = tax.currency
                additionalProperties(tax.additionalProperties)
            }

            /** The type of taxes. */
            fun type(type: Type) = type(JsonField.of(type))

            /** The type of taxes. */
            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The exact name of tax from the pay statement. */
            fun name(name: String) = name(JsonField.of(name))

            /** The exact name of tax from the pay statement. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** `true` if the amount is paid by the employers. */
            fun employer(employer: Boolean) = employer(JsonField.of(employer))

            /** `true` if the amount is paid by the employers. */
            @JsonProperty("employer")
            @ExcludeMissing
            fun employer(employer: JsonField<Boolean>) = apply { this.employer = employer }

            /** The tax amount in cents. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The tax amount in cents. */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The currency code. */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /** The currency code. */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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

            fun build(): Tax =
                Tax(
                    type,
                    name,
                    employer,
                    amount,
                    currency,
                    additionalProperties.toImmutable(),
                )
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val STATE = of("state")

                @JvmField val FEDERAL = of("federal")

                @JvmField val LOCAL = of("local")

                @JvmField val FICA = of("fica")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                STATE,
                FEDERAL,
                LOCAL,
                FICA,
            }

            enum class Value {
                STATE,
                FEDERAL,
                LOCAL,
                FICA,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    STATE -> Value.STATE
                    FEDERAL -> Value.FEDERAL
                    LOCAL -> Value.LOCAL
                    FICA -> Value.FICA
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    STATE -> Known.STATE
                    FEDERAL -> Known.FEDERAL
                    LOCAL -> Known.LOCAL
                    FICA -> Known.FICA
                    else -> throw FinchInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Tax && type == other.type && name == other.name && employer == other.employer && amount == other.amount && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, name, employer, amount, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tax{type=$type, name=$name, employer=$employer, amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val REGULAR_PAYROLL = of("regular_payroll")

            @JvmField val OFF_CYCLE_PAYROLL = of("off_cycle_payroll")

            @JvmField val ONE_TIME_PAYMENT = of("one_time_payment")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            REGULAR_PAYROLL,
            OFF_CYCLE_PAYROLL,
            ONE_TIME_PAYMENT,
        }

        enum class Value {
            REGULAR_PAYROLL,
            OFF_CYCLE_PAYROLL,
            ONE_TIME_PAYMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                REGULAR_PAYROLL -> Value.REGULAR_PAYROLL
                OFF_CYCLE_PAYROLL -> Value.OFF_CYCLE_PAYROLL
                ONE_TIME_PAYMENT -> Value.ONE_TIME_PAYMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                REGULAR_PAYROLL -> Known.REGULAR_PAYROLL
                OFF_CYCLE_PAYROLL -> Known.OFF_CYCLE_PAYROLL
                ONE_TIME_PAYMENT -> Known.ONE_TIME_PAYMENT
                else -> throw FinchInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PayStatement && individualId == other.individualId && type == other.type && paymentMethod == other.paymentMethod && totalHours == other.totalHours && grossPay == other.grossPay && netPay == other.netPay && earnings == other.earnings && taxes == other.taxes && employeeDeductions == other.employeeDeductions && employerContributions == other.employerContributions && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(individualId, type, paymentMethod, totalHours, grossPay, netPay, earnings, taxes, employeeDeductions, employerContributions, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PayStatement{individualId=$individualId, type=$type, paymentMethod=$paymentMethod, totalHours=$totalHours, grossPay=$grossPay, netPay=$netPay, earnings=$earnings, taxes=$taxes, employeeDeductions=$employeeDeductions, employerContributions=$employerContributions, additionalProperties=$additionalProperties}"
}

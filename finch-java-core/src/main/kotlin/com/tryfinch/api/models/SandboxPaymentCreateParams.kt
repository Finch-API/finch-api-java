// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

class SandboxPaymentCreateParams
constructor(
    private val body: SandboxPaymentCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun endDate(): Optional<String> = body.endDate()

    fun payStatements(): Optional<List<PayStatement>> = body.payStatements()

    fun startDate(): Optional<String> = body.startDate()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): SandboxPaymentCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    /**
     * Fields to configure the payment. Takes all fields from the `/payment` endpoint. All fields
     * are optional.
     */
    @NoAutoDetect
    class SandboxPaymentCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("end_date") private val endDate: String?,
        @JsonProperty("pay_statements") private val payStatements: List<PayStatement>?,
        @JsonProperty("start_date") private val startDate: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("end_date") fun endDate(): Optional<String> = Optional.ofNullable(endDate)

        @JsonProperty("pay_statements")
        fun payStatements(): Optional<List<PayStatement>> = Optional.ofNullable(payStatements)

        @JsonProperty("start_date")
        fun startDate(): Optional<String> = Optional.ofNullable(startDate)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var endDate: String? = null
            private var payStatements: MutableList<PayStatement>? = null
            private var startDate: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sandboxPaymentCreateBody: SandboxPaymentCreateBody) = apply {
                endDate = sandboxPaymentCreateBody.endDate
                payStatements = sandboxPaymentCreateBody.payStatements?.toMutableList()
                startDate = sandboxPaymentCreateBody.startDate
                additionalProperties = sandboxPaymentCreateBody.additionalProperties.toMutableMap()
            }

            fun endDate(endDate: String) = apply { this.endDate = endDate }

            fun payStatements(payStatements: List<PayStatement>) = apply {
                this.payStatements = payStatements.toMutableList()
            }

            fun addPayStatement(payStatement: PayStatement) = apply {
                payStatements = (payStatements ?: mutableListOf()).apply { add(payStatement) }
            }

            fun startDate(startDate: String) = apply { this.startDate = startDate }

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

            fun build(): SandboxPaymentCreateBody =
                SandboxPaymentCreateBody(
                    endDate,
                    payStatements?.toImmutable(),
                    startDate,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SandboxPaymentCreateBody && endDate == other.endDate && payStatements == other.payStatements && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(endDate, payStatements, startDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SandboxPaymentCreateBody{endDate=$endDate, payStatements=$payStatements, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: SandboxPaymentCreateBody.Builder = SandboxPaymentCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sandboxPaymentCreateParams: SandboxPaymentCreateParams) = apply {
            body = sandboxPaymentCreateParams.body.toBuilder()
            additionalHeaders = sandboxPaymentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = sandboxPaymentCreateParams.additionalQueryParams.toBuilder()
        }

        fun endDate(endDate: String) = apply { body.endDate(endDate) }

        fun payStatements(payStatements: List<PayStatement>) = apply {
            body.payStatements(payStatements)
        }

        fun addPayStatement(payStatement: PayStatement) = apply {
            body.addPayStatement(payStatement)
        }

        fun startDate(startDate: String) = apply { body.startDate(startDate) }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun build(): SandboxPaymentCreateParams =
            SandboxPaymentCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class PayStatement
    @JsonCreator
    private constructor(
        @JsonProperty("individual_id") private val individualId: String?,
        @JsonProperty("type") private val type: Type?,
        @JsonProperty("payment_method") private val paymentMethod: PaymentMethod?,
        @JsonProperty("total_hours") private val totalHours: Double?,
        @JsonProperty("gross_pay") private val grossPay: Money?,
        @JsonProperty("net_pay") private val netPay: Money?,
        @JsonProperty("earnings") private val earnings: List<Earning?>?,
        @JsonProperty("taxes") private val taxes: List<Tax?>?,
        @JsonProperty("employee_deductions")
        private val employeeDeductions: List<EmployeeDeduction?>?,
        @JsonProperty("employer_contributions")
        private val employerContributions: List<EmployerContribution?>?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A stable Finch `id` (UUID v4) for an individual in the company */
        @JsonProperty("individual_id")
        fun individualId(): Optional<String> = Optional.ofNullable(individualId)

        /** The type of the payment associated with the pay statement. */
        @JsonProperty("type") fun type(): Optional<Type> = Optional.ofNullable(type)

        /** The payment method. */
        @JsonProperty("payment_method")
        fun paymentMethod(): Optional<PaymentMethod> = Optional.ofNullable(paymentMethod)

        /** The number of hours worked for this pay period */
        @JsonProperty("total_hours")
        fun totalHours(): Optional<Double> = Optional.ofNullable(totalHours)

        @JsonProperty("gross_pay") fun grossPay(): Optional<Money> = Optional.ofNullable(grossPay)

        @JsonProperty("net_pay") fun netPay(): Optional<Money> = Optional.ofNullable(netPay)

        /** The array of earnings objects associated with this pay statement */
        @JsonProperty("earnings")
        fun earnings(): Optional<List<Earning?>> = Optional.ofNullable(earnings)

        /** The array of taxes objects associated with this pay statement. */
        @JsonProperty("taxes") fun taxes(): Optional<List<Tax?>> = Optional.ofNullable(taxes)

        /** The array of deductions objects associated with this pay statement. */
        @JsonProperty("employee_deductions")
        fun employeeDeductions(): Optional<List<EmployeeDeduction?>> =
            Optional.ofNullable(employeeDeductions)

        @JsonProperty("employer_contributions")
        fun employerContributions(): Optional<List<EmployerContribution?>> =
            Optional.ofNullable(employerContributions)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var individualId: String? = null
            private var type: Type? = null
            private var paymentMethod: PaymentMethod? = null
            private var totalHours: Double? = null
            private var grossPay: Money? = null
            private var netPay: Money? = null
            private var earnings: MutableList<Earning?>? = null
            private var taxes: MutableList<Tax?>? = null
            private var employeeDeductions: MutableList<EmployeeDeduction?>? = null
            private var employerContributions: MutableList<EmployerContribution?>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(payStatement: PayStatement) = apply {
                individualId = payStatement.individualId
                type = payStatement.type
                paymentMethod = payStatement.paymentMethod
                totalHours = payStatement.totalHours
                grossPay = payStatement.grossPay
                netPay = payStatement.netPay
                earnings = payStatement.earnings?.toMutableList()
                taxes = payStatement.taxes?.toMutableList()
                employeeDeductions = payStatement.employeeDeductions?.toMutableList()
                employerContributions = payStatement.employerContributions?.toMutableList()
                additionalProperties = payStatement.additionalProperties.toMutableMap()
            }

            /** A stable Finch `id` (UUID v4) for an individual in the company */
            fun individualId(individualId: String) = apply { this.individualId = individualId }

            /** The type of the payment associated with the pay statement. */
            fun type(type: Type) = apply { this.type = type }

            /** The payment method. */
            fun paymentMethod(paymentMethod: PaymentMethod) = apply {
                this.paymentMethod = paymentMethod
            }

            /** The number of hours worked for this pay period */
            fun totalHours(totalHours: Double) = apply { this.totalHours = totalHours }

            fun grossPay(grossPay: Money) = apply { this.grossPay = grossPay }

            fun netPay(netPay: Money) = apply { this.netPay = netPay }

            /** The array of earnings objects associated with this pay statement */
            fun earnings(earnings: List<Earning?>) = apply {
                this.earnings = earnings.toMutableList()
            }

            /** The array of earnings objects associated with this pay statement */
            fun addEarning(earning: Earning) = apply {
                earnings = (earnings ?: mutableListOf()).apply { add(earning) }
            }

            /** The array of taxes objects associated with this pay statement. */
            fun taxes(taxes: List<Tax?>) = apply { this.taxes = taxes.toMutableList() }

            /** The array of taxes objects associated with this pay statement. */
            fun addTax(tax: Tax) = apply { taxes = (taxes ?: mutableListOf()).apply { add(tax) } }

            /** The array of deductions objects associated with this pay statement. */
            fun employeeDeductions(employeeDeductions: List<EmployeeDeduction?>) = apply {
                this.employeeDeductions = employeeDeductions.toMutableList()
            }

            /** The array of deductions objects associated with this pay statement. */
            fun addEmployeeDeduction(employeeDeduction: EmployeeDeduction) = apply {
                employeeDeductions =
                    (employeeDeductions ?: mutableListOf()).apply { add(employeeDeduction) }
            }

            fun employerContributions(employerContributions: List<EmployerContribution?>) = apply {
                this.employerContributions = employerContributions.toMutableList()
            }

            fun addEmployerContribution(employerContribution: EmployerContribution) = apply {
                employerContributions =
                    (employerContributions ?: mutableListOf()).apply { add(employerContribution) }
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

            fun build(): PayStatement =
                PayStatement(
                    individualId,
                    type,
                    paymentMethod,
                    totalHours,
                    grossPay,
                    netPay,
                    earnings?.toImmutable(),
                    taxes?.toImmutable(),
                    employeeDeductions?.toImmutable(),
                    employerContributions?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Earning
        @JsonCreator
        private constructor(
            @JsonProperty("type") private val type: Type?,
            @JsonProperty("name") private val name: String?,
            @JsonProperty("amount") private val amount: Long?,
            @JsonProperty("currency") private val currency: String?,
            @JsonProperty("hours") private val hours: Double?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The type of earning. */
            @JsonProperty("type") fun type(): Optional<Type> = Optional.ofNullable(type)

            /** The exact name of the deduction from the pay statement. */
            @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

            /** The earnings amount in cents. */
            @JsonProperty("amount") fun amount(): Optional<Long> = Optional.ofNullable(amount)

            /** The earnings currency code. */
            @JsonProperty("currency")
            fun currency(): Optional<String> = Optional.ofNullable(currency)

            /**
             * The number of hours associated with this earning. (For salaried employees, this could
             * be hours per pay period, `0` or `null`, depending on the provider).
             */
            @JsonProperty("hours") fun hours(): Optional<Double> = Optional.ofNullable(hours)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: Type? = null
                private var name: String? = null
                private var amount: Long? = null
                private var currency: String? = null
                private var hours: Double? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(earning: Earning) = apply {
                    type = earning.type
                    name = earning.name
                    amount = earning.amount
                    currency = earning.currency
                    hours = earning.hours
                    additionalProperties = earning.additionalProperties.toMutableMap()
                }

                /** The type of earning. */
                fun type(type: Type) = apply { this.type = type }

                /** The exact name of the deduction from the pay statement. */
                fun name(name: String) = apply { this.name = name }

                /** The earnings amount in cents. */
                fun amount(amount: Long) = apply { this.amount = amount }

                /** The earnings currency code. */
                fun currency(currency: String) = apply { this.currency = currency }

                /**
                 * The number of hours associated with this earning. (For salaried employees, this
                 * could be hours per pay period, `0` or `null`, depending on the provider).
                 */
                fun hours(hours: Double) = apply { this.hours = hours }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
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

        @NoAutoDetect
        class EmployeeDeduction
        @JsonCreator
        private constructor(
            @JsonProperty("name") private val name: String?,
            @JsonProperty("amount") private val amount: Long?,
            @JsonProperty("currency") private val currency: String?,
            @JsonProperty("pre_tax") private val preTax: Boolean?,
            @JsonProperty("type") private val type: BenefitType?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The deduction name from the pay statement. */
            @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

            /** The deduction amount in cents. */
            @JsonProperty("amount") fun amount(): Optional<Long> = Optional.ofNullable(amount)

            /** The deduction currency. */
            @JsonProperty("currency")
            fun currency(): Optional<String> = Optional.ofNullable(currency)

            /** Boolean indicating if the deduction is pre-tax. */
            @JsonProperty("pre_tax") fun preTax(): Optional<Boolean> = Optional.ofNullable(preTax)

            /** Type of benefit. */
            @JsonProperty("type") fun type(): Optional<BenefitType> = Optional.ofNullable(type)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: String? = null
                private var amount: Long? = null
                private var currency: String? = null
                private var preTax: Boolean? = null
                private var type: BenefitType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(employeeDeduction: EmployeeDeduction) = apply {
                    name = employeeDeduction.name
                    amount = employeeDeduction.amount
                    currency = employeeDeduction.currency
                    preTax = employeeDeduction.preTax
                    type = employeeDeduction.type
                    additionalProperties = employeeDeduction.additionalProperties.toMutableMap()
                }

                /** The deduction name from the pay statement. */
                fun name(name: String) = apply { this.name = name }

                /** The deduction amount in cents. */
                fun amount(amount: Long) = apply { this.amount = amount }

                /** The deduction currency. */
                fun currency(currency: String) = apply { this.currency = currency }

                /** Boolean indicating if the deduction is pre-tax. */
                fun preTax(preTax: Boolean) = apply { this.preTax = preTax }

                /** Type of benefit. */
                fun type(type: BenefitType) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
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

        @NoAutoDetect
        class EmployerContribution
        @JsonCreator
        private constructor(
            @JsonProperty("name") private val name: String?,
            @JsonProperty("amount") private val amount: Long?,
            @JsonProperty("currency") private val currency: String?,
            @JsonProperty("type") private val type: BenefitType?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The contribution name from the pay statement. */
            @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

            /** The contribution amount in cents. */
            @JsonProperty("amount") fun amount(): Optional<Long> = Optional.ofNullable(amount)

            /** The contribution currency. */
            @JsonProperty("currency")
            fun currency(): Optional<String> = Optional.ofNullable(currency)

            /** Type of benefit. */
            @JsonProperty("type") fun type(): Optional<BenefitType> = Optional.ofNullable(type)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: String? = null
                private var amount: Long? = null
                private var currency: String? = null
                private var type: BenefitType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(employerContribution: EmployerContribution) = apply {
                    name = employerContribution.name
                    amount = employerContribution.amount
                    currency = employerContribution.currency
                    type = employerContribution.type
                    additionalProperties = employerContribution.additionalProperties.toMutableMap()
                }

                /** The contribution name from the pay statement. */
                fun name(name: String) = apply { this.name = name }

                /** The contribution amount in cents. */
                fun amount(amount: Long) = apply { this.amount = amount }

                /** The contribution currency. */
                fun currency(currency: String) = apply { this.currency = currency }

                /** Type of benefit. */
                fun type(type: BenefitType) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PaymentMethod && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class Tax
        @JsonCreator
        private constructor(
            @JsonProperty("type") private val type: Type?,
            @JsonProperty("name") private val name: String?,
            @JsonProperty("employer") private val employer: Boolean?,
            @JsonProperty("amount") private val amount: Long?,
            @JsonProperty("currency") private val currency: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The type of taxes. */
            @JsonProperty("type") fun type(): Optional<Type> = Optional.ofNullable(type)

            /** The exact name of tax from the pay statement. */
            @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

            /** `true` if the amount is paid by the employers. */
            @JsonProperty("employer")
            fun employer(): Optional<Boolean> = Optional.ofNullable(employer)

            /** The tax amount in cents. */
            @JsonProperty("amount") fun amount(): Optional<Long> = Optional.ofNullable(amount)

            /** The currency code. */
            @JsonProperty("currency")
            fun currency(): Optional<String> = Optional.ofNullable(currency)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: Type? = null
                private var name: String? = null
                private var employer: Boolean? = null
                private var amount: Long? = null
                private var currency: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tax: Tax) = apply {
                    type = tax.type
                    name = tax.name
                    employer = tax.employer
                    amount = tax.amount
                    currency = tax.currency
                    additionalProperties = tax.additionalProperties.toMutableMap()
                }

                /** The type of taxes. */
                fun type(type: Type) = apply { this.type = type }

                /** The exact name of tax from the pay statement. */
                fun name(name: String) = apply { this.name = name }

                /** `true` if the amount is paid by the employers. */
                fun employer(employer: Boolean) = apply { this.employer = employer }

                /** The tax amount in cents. */
                fun amount(amount: Long) = apply { this.amount = amount }

                /** The currency code. */
                fun currency(currency: String) = apply { this.currency = currency }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SandboxPaymentCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SandboxPaymentCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

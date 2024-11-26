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
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import com.tryfinch.api.models.*
import java.util.Objects
import java.util.Optional

class SandboxPaymentCreateParams
constructor(
    private val endDate: String?,
    private val payStatements: List<PayStatement>?,
    private val startDate: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun endDate(): Optional<String> = Optional.ofNullable(endDate)

    fun payStatements(): Optional<List<PayStatement>> = Optional.ofNullable(payStatements)

    fun startDate(): Optional<String> = Optional.ofNullable(startDate)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): SandboxPaymentCreateBody {
        return SandboxPaymentCreateBody(
            endDate,
            payStatements,
            startDate,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    /**
     * Fields to configure the payment. Takes all fields from the `/payment` endpoint. All fields
     * are optional.
     */
    @JsonDeserialize(builder = SandboxPaymentCreateBody.Builder::class)
    @NoAutoDetect
    class SandboxPaymentCreateBody
    internal constructor(
        private val endDate: String?,
        private val payStatements: List<PayStatement>?,
        private val startDate: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("end_date") fun endDate(): String? = endDate

        @JsonProperty("pay_statements") fun payStatements(): List<PayStatement>? = payStatements

        @JsonProperty("start_date") fun startDate(): String? = startDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var endDate: String? = null
            private var payStatements: List<PayStatement>? = null
            private var startDate: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sandboxPaymentCreateBody: SandboxPaymentCreateBody) = apply {
                this.endDate = sandboxPaymentCreateBody.endDate
                this.payStatements = sandboxPaymentCreateBody.payStatements
                this.startDate = sandboxPaymentCreateBody.startDate
                additionalProperties(sandboxPaymentCreateBody.additionalProperties)
            }

            @JsonProperty("end_date")
            fun endDate(endDate: String) = apply { this.endDate = endDate }

            @JsonProperty("pay_statements")
            fun payStatements(payStatements: List<PayStatement>) = apply {
                this.payStatements = payStatements
            }

            @JsonProperty("start_date")
            fun startDate(startDate: String) = apply { this.startDate = startDate }

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

        private var endDate: String? = null
        private var payStatements: MutableList<PayStatement> = mutableListOf()
        private var startDate: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sandboxPaymentCreateParams: SandboxPaymentCreateParams) = apply {
            endDate = sandboxPaymentCreateParams.endDate
            payStatements =
                sandboxPaymentCreateParams.payStatements?.toMutableList() ?: mutableListOf()
            startDate = sandboxPaymentCreateParams.startDate
            additionalHeaders = sandboxPaymentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = sandboxPaymentCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                sandboxPaymentCreateParams.additionalBodyProperties.toMutableMap()
        }

        fun endDate(endDate: String) = apply { this.endDate = endDate }

        fun payStatements(payStatements: List<PayStatement>) = apply {
            this.payStatements.clear()
            this.payStatements.addAll(payStatements)
        }

        fun addPayStatement(payStatement: PayStatement) = apply {
            this.payStatements.add(payStatement)
        }

        fun startDate(startDate: String) = apply { this.startDate = startDate }

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
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): SandboxPaymentCreateParams =
            SandboxPaymentCreateParams(
                endDate,
                payStatements.toImmutable().ifEmpty { null },
                startDate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = PayStatement.Builder::class)
    @NoAutoDetect
    class PayStatement
    private constructor(
        private val individualId: String?,
        private val type: Type?,
        private val paymentMethod: PaymentMethod?,
        private val totalHours: Double?,
        private val grossPay: Money?,
        private val netPay: Money?,
        private val earnings: List<Earning?>?,
        private val taxes: List<Tax?>?,
        private val employeeDeductions: List<EmployeeDeduction?>?,
        private val employerContributions: List<EmployerContribution?>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** A stable Finch `id` (UUID v4) for an individual in the company */
        @JsonProperty("individual_id") fun individualId(): String? = individualId

        /** The type of the payment associated with the pay statement. */
        @JsonProperty("type") fun type(): Type? = type

        /** The payment method. */
        @JsonProperty("payment_method") fun paymentMethod(): PaymentMethod? = paymentMethod

        /** The number of hours worked for this pay period */
        @JsonProperty("total_hours") fun totalHours(): Double? = totalHours

        @JsonProperty("gross_pay") fun grossPay(): Money? = grossPay

        @JsonProperty("net_pay") fun netPay(): Money? = netPay

        /** The array of earnings objects associated with this pay statement */
        @JsonProperty("earnings") fun earnings(): List<Earning?>? = earnings

        /** The array of taxes objects associated with this pay statement. */
        @JsonProperty("taxes") fun taxes(): List<Tax?>? = taxes

        /** The array of deductions objects associated with this pay statement. */
        @JsonProperty("employee_deductions")
        fun employeeDeductions(): List<EmployeeDeduction?>? = employeeDeductions

        @JsonProperty("employer_contributions")
        fun employerContributions(): List<EmployerContribution?>? = employerContributions

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
            private var earnings: List<Earning?>? = null
            private var taxes: List<Tax?>? = null
            private var employeeDeductions: List<EmployeeDeduction?>? = null
            private var employerContributions: List<EmployerContribution?>? = null
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
            @JsonProperty("individual_id")
            fun individualId(individualId: String) = apply { this.individualId = individualId }

            /** The type of the payment associated with the pay statement. */
            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            /** The payment method. */
            @JsonProperty("payment_method")
            fun paymentMethod(paymentMethod: PaymentMethod) = apply {
                this.paymentMethod = paymentMethod
            }

            /** The number of hours worked for this pay period */
            @JsonProperty("total_hours")
            fun totalHours(totalHours: Double) = apply { this.totalHours = totalHours }

            @JsonProperty("gross_pay")
            fun grossPay(grossPay: Money) = apply { this.grossPay = grossPay }

            @JsonProperty("net_pay") fun netPay(netPay: Money) = apply { this.netPay = netPay }

            /** The array of earnings objects associated with this pay statement */
            @JsonProperty("earnings")
            fun earnings(earnings: List<Earning?>) = apply { this.earnings = earnings }

            /** The array of taxes objects associated with this pay statement. */
            @JsonProperty("taxes") fun taxes(taxes: List<Tax?>) = apply { this.taxes = taxes }

            /** The array of deductions objects associated with this pay statement. */
            @JsonProperty("employee_deductions")
            fun employeeDeductions(employeeDeductions: List<EmployeeDeduction?>) = apply {
                this.employeeDeductions = employeeDeductions
            }

            @JsonProperty("employer_contributions")
            fun employerContributions(employerContributions: List<EmployerContribution?>) = apply {
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
                    earnings?.toImmutable(),
                    taxes?.toImmutable(),
                    employeeDeductions?.toImmutable(),
                    employerContributions?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = Earning.Builder::class)
        @NoAutoDetect
        class Earning
        private constructor(
            private val type: Type?,
            private val name: String?,
            private val amount: Long?,
            private val currency: String?,
            private val hours: Double?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The type of earning. */
            @JsonProperty("type") fun type(): Type? = type

            /** The exact name of the deduction from the pay statement. */
            @JsonProperty("name") fun name(): String? = name

            /** The earnings amount in cents. */
            @JsonProperty("amount") fun amount(): Long? = amount

            /** The earnings currency code. */
            @JsonProperty("currency") fun currency(): String? = currency

            /**
             * The number of hours associated with this earning. (For salaried employees, this could
             * be hours per pay period, `0` or `null`, depending on the provider).
             */
            @JsonProperty("hours") fun hours(): Double? = hours

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
                    this.type = earning.type
                    this.name = earning.name
                    this.amount = earning.amount
                    this.currency = earning.currency
                    this.hours = earning.hours
                    additionalProperties(earning.additionalProperties)
                }

                /** The type of earning. */
                @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

                /** The exact name of the deduction from the pay statement. */
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                /** The earnings amount in cents. */
                @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

                /** The earnings currency code. */
                @JsonProperty("currency")
                fun currency(currency: String) = apply { this.currency = currency }

                /**
                 * The number of hours associated with this earning. (For salaried employees, this
                 * could be hours per pay period, `0` or `null`, depending on the provider).
                 */
                @JsonProperty("hours") fun hours(hours: Double) = apply { this.hours = hours }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
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

                    @JvmField val SALARY = Type(JsonField.of("salary"))

                    @JvmField val WAGE = Type(JsonField.of("wage"))

                    @JvmField val REIMBURSEMENT = Type(JsonField.of("reimbursement"))

                    @JvmField val OVERTIME = Type(JsonField.of("overtime"))

                    @JvmField val SEVERANCE = Type(JsonField.of("severance"))

                    @JvmField val DOUBLE_OVERTIME = Type(JsonField.of("double_overtime"))

                    @JvmField val PTO = Type(JsonField.of("pto"))

                    @JvmField val SICK = Type(JsonField.of("sick"))

                    @JvmField val BONUS = Type(JsonField.of("bonus"))

                    @JvmField val COMMISSION = Type(JsonField.of("commission"))

                    @JvmField val TIPS = Type(JsonField.of("tips"))

                    @JvmField val _1099 = Type(JsonField.of("1099"))

                    @JvmField val OTHER = Type(JsonField.of("other"))

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
            private val name: String?,
            private val amount: Long?,
            private val currency: String?,
            private val preTax: Boolean?,
            private val type: BenefitType?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The deduction name from the pay statement. */
            @JsonProperty("name") fun name(): String? = name

            /** The deduction amount in cents. */
            @JsonProperty("amount") fun amount(): Long? = amount

            /** The deduction currency. */
            @JsonProperty("currency") fun currency(): String? = currency

            /** Boolean indicating if the deduction is pre-tax. */
            @JsonProperty("pre_tax") fun preTax(): Boolean? = preTax

            /** Type of benefit. */
            @JsonProperty("type") fun type(): BenefitType? = type

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
                    this.name = employeeDeduction.name
                    this.amount = employeeDeduction.amount
                    this.currency = employeeDeduction.currency
                    this.preTax = employeeDeduction.preTax
                    this.type = employeeDeduction.type
                    additionalProperties(employeeDeduction.additionalProperties)
                }

                /** The deduction name from the pay statement. */
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                /** The deduction amount in cents. */
                @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

                /** The deduction currency. */
                @JsonProperty("currency")
                fun currency(currency: String) = apply { this.currency = currency }

                /** Boolean indicating if the deduction is pre-tax. */
                @JsonProperty("pre_tax")
                fun preTax(preTax: Boolean) = apply { this.preTax = preTax }

                /** Type of benefit. */
                @JsonProperty("type") fun type(type: BenefitType) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
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
            private val name: String?,
            private val amount: Long?,
            private val currency: String?,
            private val type: BenefitType?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The contribution name from the pay statement. */
            @JsonProperty("name") fun name(): String? = name

            /** The contribution amount in cents. */
            @JsonProperty("amount") fun amount(): Long? = amount

            /** The contribution currency. */
            @JsonProperty("currency") fun currency(): String? = currency

            /** Type of benefit. */
            @JsonProperty("type") fun type(): BenefitType? = type

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
                    this.name = employerContribution.name
                    this.amount = employerContribution.amount
                    this.currency = employerContribution.currency
                    this.type = employerContribution.type
                    additionalProperties(employerContribution.additionalProperties)
                }

                /** The contribution name from the pay statement. */
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                /** The contribution amount in cents. */
                @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

                /** The contribution currency. */
                @JsonProperty("currency")
                fun currency(currency: String) = apply { this.currency = currency }

                /** Type of benefit. */
                @JsonProperty("type") fun type(type: BenefitType) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
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

                @JvmField val CHECK = PaymentMethod(JsonField.of("check"))

                @JvmField val DIRECT_DEPOSIT = PaymentMethod(JsonField.of("direct_deposit"))

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
            private val type: Type?,
            private val name: String?,
            private val employer: Boolean?,
            private val amount: Long?,
            private val currency: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The type of taxes. */
            @JsonProperty("type") fun type(): Type? = type

            /** The exact name of tax from the pay statement. */
            @JsonProperty("name") fun name(): String? = name

            /** `true` if the amount is paid by the employers. */
            @JsonProperty("employer") fun employer(): Boolean? = employer

            /** The tax amount in cents. */
            @JsonProperty("amount") fun amount(): Long? = amount

            /** The currency code. */
            @JsonProperty("currency") fun currency(): String? = currency

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
                    this.type = tax.type
                    this.name = tax.name
                    this.employer = tax.employer
                    this.amount = tax.amount
                    this.currency = tax.currency
                    additionalProperties(tax.additionalProperties)
                }

                /** The type of taxes. */
                @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

                /** The exact name of tax from the pay statement. */
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                /** `true` if the amount is paid by the employers. */
                @JsonProperty("employer")
                fun employer(employer: Boolean) = apply { this.employer = employer }

                /** The tax amount in cents. */
                @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

                /** The currency code. */
                @JsonProperty("currency")
                fun currency(currency: String) = apply { this.currency = currency }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
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

                    @JvmField val STATE = Type(JsonField.of("state"))

                    @JvmField val FEDERAL = Type(JsonField.of("federal"))

                    @JvmField val LOCAL = Type(JsonField.of("local"))

                    @JvmField val FICA = Type(JsonField.of("fica"))

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

                @JvmField val REGULAR_PAYROLL = Type(JsonField.of("regular_payroll"))

                @JvmField val OFF_CYCLE_PAYROLL = Type(JsonField.of("off_cycle_payroll"))

                @JvmField val ONE_TIME_PAYMENT = Type(JsonField.of("one_time_payment"))

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SandboxPaymentCreateParams && endDate == other.endDate && payStatements == other.payStatements && startDate == other.startDate && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(endDate, payStatements, startDate, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "SandboxPaymentCreateParams{endDate=$endDate, payStatements=$payStatements, startDate=$startDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}

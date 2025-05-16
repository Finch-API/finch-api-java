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
import com.tryfinch.api.core.Params
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Add a new sandbox payment */
class SandboxPaymentCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDate(): Optional<String> = body.endDate()

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payStatements(): Optional<List<PayStatement>> = body.payStatements()

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDate(): Optional<String> = body.startDate()

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endDate(): JsonField<String> = body._endDate()

    /**
     * Returns the raw JSON value of [payStatements].
     *
     * Unlike [payStatements], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _payStatements(): JsonField<List<PayStatement>> = body._payStatements()

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startDate(): JsonField<String> = body._startDate()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SandboxPaymentCreateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [SandboxPaymentCreateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SandboxPaymentCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sandboxPaymentCreateParams: SandboxPaymentCreateParams) = apply {
            body = sandboxPaymentCreateParams.body.toBuilder()
            additionalHeaders = sandboxPaymentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = sandboxPaymentCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [endDate]
         * - [payStatements]
         * - [startDate]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun endDate(endDate: String) = apply { body.endDate(endDate) }

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endDate(endDate: JsonField<String>) = apply { body.endDate(endDate) }

        fun payStatements(payStatements: List<PayStatement>) = apply {
            body.payStatements(payStatements)
        }

        /**
         * Sets [Builder.payStatements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payStatements] with a well-typed `List<PayStatement>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun payStatements(payStatements: JsonField<List<PayStatement>>) = apply {
            body.payStatements(payStatements)
        }

        /**
         * Adds a single [PayStatement] to [payStatements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPayStatement(payStatement: PayStatement) = apply {
            body.addPayStatement(payStatement)
        }

        fun startDate(startDate: String) = apply { body.startDate(startDate) }

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startDate(startDate: JsonField<String>) = apply { body.startDate(startDate) }

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

        /**
         * Returns an immutable instance of [SandboxPaymentCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SandboxPaymentCreateParams =
            SandboxPaymentCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Fields to configure the payment. Takes all fields from the `/payment` endpoint. All fields
     * are optional.
     */
    class Body
    private constructor(
        private val endDate: JsonField<String>,
        private val payStatements: JsonField<List<PayStatement>>,
        private val startDate: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_date") @ExcludeMissing endDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pay_statements")
            @ExcludeMissing
            payStatements: JsonField<List<PayStatement>> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<String> = JsonMissing.of(),
        ) : this(endDate, payStatements, startDate, mutableMapOf())

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): Optional<String> = endDate.getOptional("end_date")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun payStatements(): Optional<List<PayStatement>> =
            payStatements.getOptional("pay_statements")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startDate(): Optional<String> = startDate.getOptional("start_date")

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<String> = endDate

        /**
         * Returns the raw JSON value of [payStatements].
         *
         * Unlike [payStatements], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pay_statements")
        @ExcludeMissing
        fun _payStatements(): JsonField<List<PayStatement>> = payStatements

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date") @ExcludeMissing fun _startDate(): JsonField<String> = startDate

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var endDate: JsonField<String> = JsonMissing.of()
            private var payStatements: JsonField<MutableList<PayStatement>>? = null
            private var startDate: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                endDate = body.endDate
                payStatements = body.payStatements.map { it.toMutableList() }
                startDate = body.startDate
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun endDate(endDate: String) = endDate(JsonField.of(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<String>) = apply { this.endDate = endDate }

            fun payStatements(payStatements: List<PayStatement>) =
                payStatements(JsonField.of(payStatements))

            /**
             * Sets [Builder.payStatements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payStatements] with a well-typed
             * `List<PayStatement>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun payStatements(payStatements: JsonField<List<PayStatement>>) = apply {
                this.payStatements = payStatements.map { it.toMutableList() }
            }

            /**
             * Adds a single [PayStatement] to [payStatements].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPayStatement(payStatement: PayStatement) = apply {
                payStatements =
                    (payStatements ?: JsonField.of(mutableListOf())).also {
                        checkKnown("payStatements", it).add(payStatement)
                    }
            }

            fun startDate(startDate: String) = startDate(JsonField.of(startDate))

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    endDate,
                    (payStatements ?: JsonMissing.of()).map { it.toImmutable() },
                    startDate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            endDate()
            payStatements().ifPresent { it.forEach { it.validate() } }
            startDate()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (endDate.asKnown().isPresent) 1 else 0) +
                (payStatements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (startDate.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && endDate == other.endDate && payStatements == other.payStatements && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(endDate, payStatements, startDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{endDate=$endDate, payStatements=$payStatements, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    class PayStatement
    private constructor(
        private val earnings: JsonField<List<Earning?>>,
        private val employeeDeductions: JsonField<List<EmployeeDeduction?>>,
        private val employerContributions: JsonField<List<EmployerContribution?>>,
        private val grossPay: JsonField<Money>,
        private val individualId: JsonField<String>,
        private val netPay: JsonField<Money>,
        private val paymentMethod: JsonField<PaymentMethod>,
        private val taxes: JsonField<List<Tax?>>,
        private val totalHours: JsonField<Double>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("earnings")
            @ExcludeMissing
            earnings: JsonField<List<Earning?>> = JsonMissing.of(),
            @JsonProperty("employee_deductions")
            @ExcludeMissing
            employeeDeductions: JsonField<List<EmployeeDeduction?>> = JsonMissing.of(),
            @JsonProperty("employer_contributions")
            @ExcludeMissing
            employerContributions: JsonField<List<EmployerContribution?>> = JsonMissing.of(),
            @JsonProperty("gross_pay")
            @ExcludeMissing
            grossPay: JsonField<Money> = JsonMissing.of(),
            @JsonProperty("individual_id")
            @ExcludeMissing
            individualId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("net_pay") @ExcludeMissing netPay: JsonField<Money> = JsonMissing.of(),
            @JsonProperty("payment_method")
            @ExcludeMissing
            paymentMethod: JsonField<PaymentMethod> = JsonMissing.of(),
            @JsonProperty("taxes") @ExcludeMissing taxes: JsonField<List<Tax?>> = JsonMissing.of(),
            @JsonProperty("total_hours")
            @ExcludeMissing
            totalHours: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(
            earnings,
            employeeDeductions,
            employerContributions,
            grossPay,
            individualId,
            netPay,
            paymentMethod,
            taxes,
            totalHours,
            type,
            mutableMapOf(),
        )

        /**
         * The array of earnings objects associated with this pay statement
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun earnings(): Optional<List<Earning?>> = earnings.getOptional("earnings")

        /**
         * The array of deductions objects associated with this pay statement.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun employeeDeductions(): Optional<List<EmployeeDeduction?>> =
            employeeDeductions.getOptional("employee_deductions")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun employerContributions(): Optional<List<EmployerContribution?>> =
            employerContributions.getOptional("employer_contributions")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun grossPay(): Optional<Money> = grossPay.getOptional("gross_pay")

        /**
         * A stable Finch `id` (UUID v4) for an individual in the company
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun individualId(): Optional<String> = individualId.getOptional("individual_id")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun netPay(): Optional<Money> = netPay.getOptional("net_pay")

        /**
         * The payment method.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentMethod(): Optional<PaymentMethod> = paymentMethod.getOptional("payment_method")

        /**
         * The array of taxes objects associated with this pay statement.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun taxes(): Optional<List<Tax?>> = taxes.getOptional("taxes")

        /**
         * The number of hours worked for this pay period
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalHours(): Optional<Double> = totalHours.getOptional("total_hours")

        /**
         * The type of the payment associated with the pay statement.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [earnings].
         *
         * Unlike [earnings], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("earnings")
        @ExcludeMissing
        fun _earnings(): JsonField<List<Earning?>> = earnings

        /**
         * Returns the raw JSON value of [employeeDeductions].
         *
         * Unlike [employeeDeductions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("employee_deductions")
        @ExcludeMissing
        fun _employeeDeductions(): JsonField<List<EmployeeDeduction?>> = employeeDeductions

        /**
         * Returns the raw JSON value of [employerContributions].
         *
         * Unlike [employerContributions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("employer_contributions")
        @ExcludeMissing
        fun _employerContributions(): JsonField<List<EmployerContribution?>> = employerContributions

        /**
         * Returns the raw JSON value of [grossPay].
         *
         * Unlike [grossPay], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gross_pay") @ExcludeMissing fun _grossPay(): JsonField<Money> = grossPay

        /**
         * Returns the raw JSON value of [individualId].
         *
         * Unlike [individualId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("individual_id")
        @ExcludeMissing
        fun _individualId(): JsonField<String> = individualId

        /**
         * Returns the raw JSON value of [netPay].
         *
         * Unlike [netPay], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("net_pay") @ExcludeMissing fun _netPay(): JsonField<Money> = netPay

        /**
         * Returns the raw JSON value of [paymentMethod].
         *
         * Unlike [paymentMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_method")
        @ExcludeMissing
        fun _paymentMethod(): JsonField<PaymentMethod> = paymentMethod

        /**
         * Returns the raw JSON value of [taxes].
         *
         * Unlike [taxes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("taxes") @ExcludeMissing fun _taxes(): JsonField<List<Tax?>> = taxes

        /**
         * Returns the raw JSON value of [totalHours].
         *
         * Unlike [totalHours], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_hours")
        @ExcludeMissing
        fun _totalHours(): JsonField<Double> = totalHours

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [PayStatement]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PayStatement]. */
        class Builder internal constructor() {

            private var earnings: JsonField<MutableList<Earning?>>? = null
            private var employeeDeductions: JsonField<MutableList<EmployeeDeduction?>>? = null
            private var employerContributions: JsonField<MutableList<EmployerContribution?>>? = null
            private var grossPay: JsonField<Money> = JsonMissing.of()
            private var individualId: JsonField<String> = JsonMissing.of()
            private var netPay: JsonField<Money> = JsonMissing.of()
            private var paymentMethod: JsonField<PaymentMethod> = JsonMissing.of()
            private var taxes: JsonField<MutableList<Tax?>>? = null
            private var totalHours: JsonField<Double> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(payStatement: PayStatement) = apply {
                earnings = payStatement.earnings.map { it.toMutableList() }
                employeeDeductions = payStatement.employeeDeductions.map { it.toMutableList() }
                employerContributions =
                    payStatement.employerContributions.map { it.toMutableList() }
                grossPay = payStatement.grossPay
                individualId = payStatement.individualId
                netPay = payStatement.netPay
                paymentMethod = payStatement.paymentMethod
                taxes = payStatement.taxes.map { it.toMutableList() }
                totalHours = payStatement.totalHours
                type = payStatement.type
                additionalProperties = payStatement.additionalProperties.toMutableMap()
            }

            /** The array of earnings objects associated with this pay statement */
            fun earnings(earnings: List<Earning?>?) = earnings(JsonField.ofNullable(earnings))

            /** Alias for calling [Builder.earnings] with `earnings.orElse(null)`. */
            fun earnings(earnings: Optional<List<Earning?>>) = earnings(earnings.getOrNull())

            /**
             * Sets [Builder.earnings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.earnings] with a well-typed `List<Earning?>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun earnings(earnings: JsonField<List<Earning?>>) = apply {
                this.earnings = earnings.map { it.toMutableList() }
            }

            /**
             * Adds a single [Earning] to [earnings].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEarning(earning: Earning) = apply {
                earnings =
                    (earnings ?: JsonField.of(mutableListOf())).also {
                        checkKnown("earnings", it).add(earning)
                    }
            }

            /** The array of deductions objects associated with this pay statement. */
            fun employeeDeductions(employeeDeductions: List<EmployeeDeduction?>?) =
                employeeDeductions(JsonField.ofNullable(employeeDeductions))

            /**
             * Alias for calling [Builder.employeeDeductions] with
             * `employeeDeductions.orElse(null)`.
             */
            fun employeeDeductions(employeeDeductions: Optional<List<EmployeeDeduction?>>) =
                employeeDeductions(employeeDeductions.getOrNull())

            /**
             * Sets [Builder.employeeDeductions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.employeeDeductions] with a well-typed
             * `List<EmployeeDeduction?>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun employeeDeductions(employeeDeductions: JsonField<List<EmployeeDeduction?>>) =
                apply {
                    this.employeeDeductions = employeeDeductions.map { it.toMutableList() }
                }

            /**
             * Adds a single [EmployeeDeduction] to [employeeDeductions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEmployeeDeduction(employeeDeduction: EmployeeDeduction) = apply {
                employeeDeductions =
                    (employeeDeductions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("employeeDeductions", it).add(employeeDeduction)
                    }
            }

            fun employerContributions(employerContributions: List<EmployerContribution?>?) =
                employerContributions(JsonField.ofNullable(employerContributions))

            /**
             * Alias for calling [Builder.employerContributions] with
             * `employerContributions.orElse(null)`.
             */
            fun employerContributions(
                employerContributions: Optional<List<EmployerContribution?>>
            ) = employerContributions(employerContributions.getOrNull())

            /**
             * Sets [Builder.employerContributions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.employerContributions] with a well-typed
             * `List<EmployerContribution?>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun employerContributions(
                employerContributions: JsonField<List<EmployerContribution?>>
            ) = apply {
                this.employerContributions = employerContributions.map { it.toMutableList() }
            }

            /**
             * Adds a single [EmployerContribution] to [employerContributions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEmployerContribution(employerContribution: EmployerContribution) = apply {
                employerContributions =
                    (employerContributions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("employerContributions", it).add(employerContribution)
                    }
            }

            fun grossPay(grossPay: Money?) = grossPay(JsonField.ofNullable(grossPay))

            /** Alias for calling [Builder.grossPay] with `grossPay.orElse(null)`. */
            fun grossPay(grossPay: Optional<Money>) = grossPay(grossPay.getOrNull())

            /**
             * Sets [Builder.grossPay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.grossPay] with a well-typed [Money] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun grossPay(grossPay: JsonField<Money>) = apply { this.grossPay = grossPay }

            /** A stable Finch `id` (UUID v4) for an individual in the company */
            fun individualId(individualId: String) = individualId(JsonField.of(individualId))

            /**
             * Sets [Builder.individualId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.individualId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun individualId(individualId: JsonField<String>) = apply {
                this.individualId = individualId
            }

            fun netPay(netPay: Money?) = netPay(JsonField.ofNullable(netPay))

            /** Alias for calling [Builder.netPay] with `netPay.orElse(null)`. */
            fun netPay(netPay: Optional<Money>) = netPay(netPay.getOrNull())

            /**
             * Sets [Builder.netPay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netPay] with a well-typed [Money] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun netPay(netPay: JsonField<Money>) = apply { this.netPay = netPay }

            /** The payment method. */
            fun paymentMethod(paymentMethod: PaymentMethod?) =
                paymentMethod(JsonField.ofNullable(paymentMethod))

            /** Alias for calling [Builder.paymentMethod] with `paymentMethod.orElse(null)`. */
            fun paymentMethod(paymentMethod: Optional<PaymentMethod>) =
                paymentMethod(paymentMethod.getOrNull())

            /**
             * Sets [Builder.paymentMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentMethod] with a well-typed [PaymentMethod]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun paymentMethod(paymentMethod: JsonField<PaymentMethod>) = apply {
                this.paymentMethod = paymentMethod
            }

            /** The array of taxes objects associated with this pay statement. */
            fun taxes(taxes: List<Tax?>?) = taxes(JsonField.ofNullable(taxes))

            /** Alias for calling [Builder.taxes] with `taxes.orElse(null)`. */
            fun taxes(taxes: Optional<List<Tax?>>) = taxes(taxes.getOrNull())

            /**
             * Sets [Builder.taxes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxes] with a well-typed `List<Tax?>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxes(taxes: JsonField<List<Tax?>>) = apply {
                this.taxes = taxes.map { it.toMutableList() }
            }

            /**
             * Adds a single [Tax] to [taxes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTax(tax: Tax) = apply {
                taxes =
                    (taxes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("taxes", it).add(tax)
                    }
            }

            /** The number of hours worked for this pay period */
            fun totalHours(totalHours: Double?) = totalHours(JsonField.ofNullable(totalHours))

            /**
             * Alias for [Builder.totalHours].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun totalHours(totalHours: Double) = totalHours(totalHours as Double?)

            /** Alias for calling [Builder.totalHours] with `totalHours.orElse(null)`. */
            fun totalHours(totalHours: Optional<Double>) = totalHours(totalHours.getOrNull())

            /**
             * Sets [Builder.totalHours] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalHours] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalHours(totalHours: JsonField<Double>) = apply { this.totalHours = totalHours }

            /** The type of the payment associated with the pay statement. */
            fun type(type: Type?) = type(JsonField.ofNullable(type))

            /** Alias for calling [Builder.type] with `type.orElse(null)`. */
            fun type(type: Optional<Type>) = type(type.getOrNull())

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [PayStatement].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PayStatement =
                PayStatement(
                    (earnings ?: JsonMissing.of()).map { it.toImmutable() },
                    (employeeDeductions ?: JsonMissing.of()).map { it.toImmutable() },
                    (employerContributions ?: JsonMissing.of()).map { it.toImmutable() },
                    grossPay,
                    individualId,
                    netPay,
                    paymentMethod,
                    (taxes ?: JsonMissing.of()).map { it.toImmutable() },
                    totalHours,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PayStatement = apply {
            if (validated) {
                return@apply
            }

            earnings().ifPresent { it.forEach { it?.validate() } }
            employeeDeductions().ifPresent { it.forEach { it?.validate() } }
            employerContributions().ifPresent { it.forEach { it?.validate() } }
            grossPay().ifPresent { it.validate() }
            individualId()
            netPay().ifPresent { it.validate() }
            paymentMethod().ifPresent { it.validate() }
            taxes().ifPresent { it.forEach { it?.validate() } }
            totalHours()
            type().ifPresent { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (earnings.asKnown().getOrNull()?.sumOf { (it?.validity() ?: 0).toInt() } ?: 0) +
                (employeeDeductions.asKnown().getOrNull()?.sumOf { (it?.validity() ?: 0).toInt() }
                    ?: 0) +
                (employerContributions.asKnown().getOrNull()?.sumOf {
                    (it?.validity() ?: 0).toInt()
                } ?: 0) +
                (grossPay.asKnown().getOrNull()?.validity() ?: 0) +
                (if (individualId.asKnown().isPresent) 1 else 0) +
                (netPay.asKnown().getOrNull()?.validity() ?: 0) +
                (paymentMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (taxes.asKnown().getOrNull()?.sumOf { (it?.validity() ?: 0).toInt() } ?: 0) +
                (if (totalHours.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Earning
        private constructor(
            private val amount: JsonField<Long>,
            private val attributes: JsonField<Attributes>,
            private val currency: JsonField<String>,
            private val hours: JsonField<Double>,
            private val name: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("attributes")
                @ExcludeMissing
                attributes: JsonField<Attributes> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("hours") @ExcludeMissing hours: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(amount, attributes, currency, hours, name, type, mutableMapOf())

            /**
             * The earnings amount in cents.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amount(): Optional<Long> = amount.getOptional("amount")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun attributes(): Optional<Attributes> = attributes.getOptional("attributes")

            /**
             * The earnings currency code.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currency(): Optional<String> = currency.getOptional("currency")

            /**
             * The number of hours associated with this earning. (For salaried employees, this could
             * be hours per pay period, `0` or `null`, depending on the provider).
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hours(): Optional<Double> = hours.getOptional("hours")

            /**
             * The exact name of the deduction from the pay statement.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * The type of earning.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [attributes].
             *
             * Unlike [attributes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("attributes")
            @ExcludeMissing
            fun _attributes(): JsonField<Attributes> = attributes

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [hours].
             *
             * Unlike [hours], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("hours") @ExcludeMissing fun _hours(): JsonField<Double> = hours

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

                /** Returns a mutable builder for constructing an instance of [Earning]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Earning]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var attributes: JsonField<Attributes> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var hours: JsonField<Double> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(earning: Earning) = apply {
                    amount = earning.amount
                    attributes = earning.attributes
                    currency = earning.currency
                    hours = earning.hours
                    name = earning.name
                    type = earning.type
                    additionalProperties = earning.additionalProperties.toMutableMap()
                }

                /** The earnings amount in cents. */
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
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                fun attributes(attributes: Attributes?) =
                    attributes(JsonField.ofNullable(attributes))

                /** Alias for calling [Builder.attributes] with `attributes.orElse(null)`. */
                fun attributes(attributes: Optional<Attributes>) =
                    attributes(attributes.getOrNull())

                /**
                 * Sets [Builder.attributes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.attributes] with a well-typed [Attributes] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun attributes(attributes: JsonField<Attributes>) = apply {
                    this.attributes = attributes
                }

                /** The earnings currency code. */
                fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

                /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
                fun currency(currency: Optional<String>) = currency(currency.getOrNull())

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /**
                 * The number of hours associated with this earning. (For salaried employees, this
                 * could be hours per pay period, `0` or `null`, depending on the provider).
                 */
                fun hours(hours: Double?) = hours(JsonField.ofNullable(hours))

                /**
                 * Alias for [Builder.hours].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun hours(hours: Double) = hours(hours as Double?)

                /** Alias for calling [Builder.hours] with `hours.orElse(null)`. */
                fun hours(hours: Optional<Double>) = hours(hours.getOrNull())

                /**
                 * Sets [Builder.hours] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hours] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun hours(hours: JsonField<Double>) = apply { this.hours = hours }

                /** The exact name of the deduction from the pay statement. */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The type of earning. */
                fun type(type: Type?) = type(JsonField.ofNullable(type))

                /** Alias for calling [Builder.type] with `type.orElse(null)`. */
                fun type(type: Optional<Type>) = type(type.getOrNull())

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                /**
                 * Returns an immutable instance of [Earning].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Earning =
                    Earning(
                        amount,
                        attributes,
                        currency,
                        hours,
                        name,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Earning = apply {
                if (validated) {
                    return@apply
                }

                amount()
                attributes().ifPresent { it.validate() }
                currency()
                hours()
                name()
                type().ifPresent { it.validate() }
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (attributes.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (currency.asKnown().isPresent) 1 else 0) +
                    (if (hours.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Attributes
            private constructor(
                private val metadata: JsonField<Metadata>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of()
                ) : this(metadata, mutableMapOf())

                /**
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

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

                    /** Returns a mutable builder for constructing an instance of [Attributes]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Attributes]. */
                class Builder internal constructor() {

                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(attributes: Attributes) = apply {
                        metadata = attributes.metadata
                        additionalProperties = attributes.additionalProperties.toMutableMap()
                    }

                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

                    /**
                     * Returns an immutable instance of [Attributes].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Attributes =
                        Attributes(metadata, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Attributes = apply {
                    if (validated) {
                        return@apply
                    }

                    metadata().ifPresent { it.validate() }
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
                @JvmSynthetic
                internal fun validity(): Int = (metadata.asKnown().getOrNull()?.validity() ?: 0)

                class Metadata
                private constructor(
                    private val metadata: JsonField<InnerMetadata>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("metadata")
                        @ExcludeMissing
                        metadata: JsonField<InnerMetadata> = JsonMissing.of()
                    ) : this(metadata, mutableMapOf())

                    /**
                     * The metadata to be attached to the entity by existing rules. It is a
                     * key-value pairs where the values can be of any type (string, number, boolean,
                     * object, array, etc.).
                     *
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun metadata(): Optional<InnerMetadata> = metadata.getOptional("metadata")

                    /**
                     * Returns the raw JSON value of [metadata].
                     *
                     * Unlike [metadata], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    fun _metadata(): JsonField<InnerMetadata> = metadata

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

                        /** Returns a mutable builder for constructing an instance of [Metadata]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Metadata]. */
                    class Builder internal constructor() {

                        private var metadata: JsonField<InnerMetadata> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(metadata: Metadata) = apply {
                            this.metadata = metadata.metadata
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        /**
                         * The metadata to be attached to the entity by existing rules. It is a
                         * key-value pairs where the values can be of any type (string, number,
                         * boolean, object, array, etc.).
                         */
                        fun metadata(metadata: InnerMetadata) = metadata(JsonField.of(metadata))

                        /**
                         * Sets [Builder.metadata] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.metadata] with a well-typed
                         * [InnerMetadata] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun metadata(metadata: JsonField<InnerMetadata>) = apply {
                            this.metadata = metadata
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Metadata].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Metadata =
                            Metadata(metadata, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): Metadata = apply {
                        if (validated) {
                            return@apply
                        }

                        metadata().ifPresent { it.validate() }
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
                    @JvmSynthetic
                    internal fun validity(): Int = (metadata.asKnown().getOrNull()?.validity() ?: 0)

                    /**
                     * The metadata to be attached to the entity by existing rules. It is a
                     * key-value pairs where the values can be of any type (string, number, boolean,
                     * object, array, etc.).
                     */
                    class InnerMetadata
                    @JsonCreator
                    private constructor(
                        @com.fasterxml.jackson.annotation.JsonValue
                        private val additionalProperties: Map<String, JsonValue>
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [InnerMetadata].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [InnerMetadata]. */
                        class Builder internal constructor() {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(innerMetadata: InnerMetadata) = apply {
                                additionalProperties =
                                    innerMetadata.additionalProperties.toMutableMap()
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [InnerMetadata].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): InnerMetadata =
                                InnerMetadata(additionalProperties.toImmutable())
                        }

                        private var validated: Boolean = false

                        fun validate(): InnerMetadata = apply {
                            if (validated) {
                                return@apply
                            }

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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            additionalProperties.count { (_, value) ->
                                !value.isNull() && !value.isMissing()
                            }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is InnerMetadata && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "InnerMetadata{additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Metadata && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(metadata, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Metadata{metadata=$metadata, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Attributes && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(metadata, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Attributes{metadata=$metadata, additionalProperties=$additionalProperties}"
            }

            /** The type of earning. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
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

                /** An enum containing [Type]'s known values. */
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

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
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
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
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

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws FinchInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
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

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws FinchInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        FinchInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Earning && amount == other.amount && attributes == other.attributes && currency == other.currency && hours == other.hours && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, attributes, currency, hours, name, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Earning{amount=$amount, attributes=$attributes, currency=$currency, hours=$hours, name=$name, type=$type, additionalProperties=$additionalProperties}"
        }

        class EmployeeDeduction
        private constructor(
            private val amount: JsonField<Long>,
            private val attributes: JsonField<Attributes>,
            private val currency: JsonField<String>,
            private val name: JsonField<String>,
            private val preTax: JsonField<Boolean>,
            private val type: JsonField<BenefitType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("attributes")
                @ExcludeMissing
                attributes: JsonField<Attributes> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pre_tax")
                @ExcludeMissing
                preTax: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<BenefitType> = JsonMissing.of(),
            ) : this(amount, attributes, currency, name, preTax, type, mutableMapOf())

            /**
             * The deduction amount in cents.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amount(): Optional<Long> = amount.getOptional("amount")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun attributes(): Optional<Attributes> = attributes.getOptional("attributes")

            /**
             * The deduction currency.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currency(): Optional<String> = currency.getOptional("currency")

            /**
             * The deduction name from the pay statement.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Boolean indicating if the deduction is pre-tax.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun preTax(): Optional<Boolean> = preTax.getOptional("pre_tax")

            /**
             * Type of benefit.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<BenefitType> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [attributes].
             *
             * Unlike [attributes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("attributes")
            @ExcludeMissing
            fun _attributes(): JsonField<Attributes> = attributes

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [preTax].
             *
             * Unlike [preTax], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pre_tax") @ExcludeMissing fun _preTax(): JsonField<Boolean> = preTax

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<BenefitType> = type

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

                /**
                 * Returns a mutable builder for constructing an instance of [EmployeeDeduction].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [EmployeeDeduction]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var attributes: JsonField<Attributes> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var preTax: JsonField<Boolean> = JsonMissing.of()
                private var type: JsonField<BenefitType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(employeeDeduction: EmployeeDeduction) = apply {
                    amount = employeeDeduction.amount
                    attributes = employeeDeduction.attributes
                    currency = employeeDeduction.currency
                    name = employeeDeduction.name
                    preTax = employeeDeduction.preTax
                    type = employeeDeduction.type
                    additionalProperties = employeeDeduction.additionalProperties.toMutableMap()
                }

                /** The deduction amount in cents. */
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
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                fun attributes(attributes: Attributes?) =
                    attributes(JsonField.ofNullable(attributes))

                /** Alias for calling [Builder.attributes] with `attributes.orElse(null)`. */
                fun attributes(attributes: Optional<Attributes>) =
                    attributes(attributes.getOrNull())

                /**
                 * Sets [Builder.attributes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.attributes] with a well-typed [Attributes] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun attributes(attributes: JsonField<Attributes>) = apply {
                    this.attributes = attributes
                }

                /** The deduction currency. */
                fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

                /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
                fun currency(currency: Optional<String>) = currency(currency.getOrNull())

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The deduction name from the pay statement. */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** Boolean indicating if the deduction is pre-tax. */
                fun preTax(preTax: Boolean?) = preTax(JsonField.ofNullable(preTax))

                /**
                 * Alias for [Builder.preTax].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun preTax(preTax: Boolean) = preTax(preTax as Boolean?)

                /** Alias for calling [Builder.preTax] with `preTax.orElse(null)`. */
                fun preTax(preTax: Optional<Boolean>) = preTax(preTax.getOrNull())

                /**
                 * Sets [Builder.preTax] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.preTax] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun preTax(preTax: JsonField<Boolean>) = apply { this.preTax = preTax }

                /** Type of benefit. */
                fun type(type: BenefitType?) = type(JsonField.ofNullable(type))

                /** Alias for calling [Builder.type] with `type.orElse(null)`. */
                fun type(type: Optional<BenefitType>) = type(type.getOrNull())

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [BenefitType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun type(type: JsonField<BenefitType>) = apply { this.type = type }

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

                /**
                 * Returns an immutable instance of [EmployeeDeduction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): EmployeeDeduction =
                    EmployeeDeduction(
                        amount,
                        attributes,
                        currency,
                        name,
                        preTax,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): EmployeeDeduction = apply {
                if (validated) {
                    return@apply
                }

                amount()
                attributes().ifPresent { it.validate() }
                currency()
                name()
                preTax()
                type().ifPresent { it.validate() }
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (attributes.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (currency.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (preTax.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Attributes
            private constructor(
                private val metadata: JsonField<Metadata>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of()
                ) : this(metadata, mutableMapOf())

                /**
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

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

                    /** Returns a mutable builder for constructing an instance of [Attributes]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Attributes]. */
                class Builder internal constructor() {

                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(attributes: Attributes) = apply {
                        metadata = attributes.metadata
                        additionalProperties = attributes.additionalProperties.toMutableMap()
                    }

                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

                    /**
                     * Returns an immutable instance of [Attributes].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Attributes =
                        Attributes(metadata, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Attributes = apply {
                    if (validated) {
                        return@apply
                    }

                    metadata().ifPresent { it.validate() }
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
                @JvmSynthetic
                internal fun validity(): Int = (metadata.asKnown().getOrNull()?.validity() ?: 0)

                class Metadata
                private constructor(
                    private val metadata: JsonField<InnerMetadata>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("metadata")
                        @ExcludeMissing
                        metadata: JsonField<InnerMetadata> = JsonMissing.of()
                    ) : this(metadata, mutableMapOf())

                    /**
                     * The metadata to be attached to the entity by existing rules. It is a
                     * key-value pairs where the values can be of any type (string, number, boolean,
                     * object, array, etc.).
                     *
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun metadata(): Optional<InnerMetadata> = metadata.getOptional("metadata")

                    /**
                     * Returns the raw JSON value of [metadata].
                     *
                     * Unlike [metadata], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    fun _metadata(): JsonField<InnerMetadata> = metadata

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

                        /** Returns a mutable builder for constructing an instance of [Metadata]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Metadata]. */
                    class Builder internal constructor() {

                        private var metadata: JsonField<InnerMetadata> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(metadata: Metadata) = apply {
                            this.metadata = metadata.metadata
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        /**
                         * The metadata to be attached to the entity by existing rules. It is a
                         * key-value pairs where the values can be of any type (string, number,
                         * boolean, object, array, etc.).
                         */
                        fun metadata(metadata: InnerMetadata) = metadata(JsonField.of(metadata))

                        /**
                         * Sets [Builder.metadata] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.metadata] with a well-typed
                         * [InnerMetadata] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun metadata(metadata: JsonField<InnerMetadata>) = apply {
                            this.metadata = metadata
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Metadata].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Metadata =
                            Metadata(metadata, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): Metadata = apply {
                        if (validated) {
                            return@apply
                        }

                        metadata().ifPresent { it.validate() }
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
                    @JvmSynthetic
                    internal fun validity(): Int = (metadata.asKnown().getOrNull()?.validity() ?: 0)

                    /**
                     * The metadata to be attached to the entity by existing rules. It is a
                     * key-value pairs where the values can be of any type (string, number, boolean,
                     * object, array, etc.).
                     */
                    class InnerMetadata
                    @JsonCreator
                    private constructor(
                        @com.fasterxml.jackson.annotation.JsonValue
                        private val additionalProperties: Map<String, JsonValue>
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [InnerMetadata].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [InnerMetadata]. */
                        class Builder internal constructor() {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(innerMetadata: InnerMetadata) = apply {
                                additionalProperties =
                                    innerMetadata.additionalProperties.toMutableMap()
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [InnerMetadata].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): InnerMetadata =
                                InnerMetadata(additionalProperties.toImmutable())
                        }

                        private var validated: Boolean = false

                        fun validate(): InnerMetadata = apply {
                            if (validated) {
                                return@apply
                            }

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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            additionalProperties.count { (_, value) ->
                                !value.isNull() && !value.isMissing()
                            }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is InnerMetadata && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "InnerMetadata{additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Metadata && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(metadata, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Metadata{metadata=$metadata, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Attributes && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(metadata, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Attributes{metadata=$metadata, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EmployeeDeduction && amount == other.amount && attributes == other.attributes && currency == other.currency && name == other.name && preTax == other.preTax && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, attributes, currency, name, preTax, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EmployeeDeduction{amount=$amount, attributes=$attributes, currency=$currency, name=$name, preTax=$preTax, type=$type, additionalProperties=$additionalProperties}"
        }

        class EmployerContribution
        private constructor(
            private val amount: JsonField<Long>,
            private val attributes: JsonField<Attributes>,
            private val currency: JsonField<String>,
            private val name: JsonField<String>,
            private val type: JsonField<BenefitType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("attributes")
                @ExcludeMissing
                attributes: JsonField<Attributes> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                type: JsonField<BenefitType> = JsonMissing.of(),
            ) : this(amount, attributes, currency, name, type, mutableMapOf())

            /**
             * The contribution amount in cents.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amount(): Optional<Long> = amount.getOptional("amount")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun attributes(): Optional<Attributes> = attributes.getOptional("attributes")

            /**
             * The contribution currency.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currency(): Optional<String> = currency.getOptional("currency")

            /**
             * The contribution name from the pay statement.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Type of benefit.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<BenefitType> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [attributes].
             *
             * Unlike [attributes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("attributes")
            @ExcludeMissing
            fun _attributes(): JsonField<Attributes> = attributes

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<BenefitType> = type

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

                /**
                 * Returns a mutable builder for constructing an instance of [EmployerContribution].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [EmployerContribution]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var attributes: JsonField<Attributes> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var type: JsonField<BenefitType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(employerContribution: EmployerContribution) = apply {
                    amount = employerContribution.amount
                    attributes = employerContribution.attributes
                    currency = employerContribution.currency
                    name = employerContribution.name
                    type = employerContribution.type
                    additionalProperties = employerContribution.additionalProperties.toMutableMap()
                }

                /** The contribution amount in cents. */
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
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                fun attributes(attributes: Attributes?) =
                    attributes(JsonField.ofNullable(attributes))

                /** Alias for calling [Builder.attributes] with `attributes.orElse(null)`. */
                fun attributes(attributes: Optional<Attributes>) =
                    attributes(attributes.getOrNull())

                /**
                 * Sets [Builder.attributes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.attributes] with a well-typed [Attributes] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun attributes(attributes: JsonField<Attributes>) = apply {
                    this.attributes = attributes
                }

                /** The contribution currency. */
                fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

                /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
                fun currency(currency: Optional<String>) = currency(currency.getOrNull())

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The contribution name from the pay statement. */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** Type of benefit. */
                fun type(type: BenefitType?) = type(JsonField.ofNullable(type))

                /** Alias for calling [Builder.type] with `type.orElse(null)`. */
                fun type(type: Optional<BenefitType>) = type(type.getOrNull())

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [BenefitType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun type(type: JsonField<BenefitType>) = apply { this.type = type }

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

                /**
                 * Returns an immutable instance of [EmployerContribution].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): EmployerContribution =
                    EmployerContribution(
                        amount,
                        attributes,
                        currency,
                        name,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): EmployerContribution = apply {
                if (validated) {
                    return@apply
                }

                amount()
                attributes().ifPresent { it.validate() }
                currency()
                name()
                type().ifPresent { it.validate() }
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (attributes.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (currency.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Attributes
            private constructor(
                private val metadata: JsonField<Metadata>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of()
                ) : this(metadata, mutableMapOf())

                /**
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

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

                    /** Returns a mutable builder for constructing an instance of [Attributes]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Attributes]. */
                class Builder internal constructor() {

                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(attributes: Attributes) = apply {
                        metadata = attributes.metadata
                        additionalProperties = attributes.additionalProperties.toMutableMap()
                    }

                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

                    /**
                     * Returns an immutable instance of [Attributes].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Attributes =
                        Attributes(metadata, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Attributes = apply {
                    if (validated) {
                        return@apply
                    }

                    metadata().ifPresent { it.validate() }
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
                @JvmSynthetic
                internal fun validity(): Int = (metadata.asKnown().getOrNull()?.validity() ?: 0)

                class Metadata
                private constructor(
                    private val metadata: JsonField<InnerMetadata>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("metadata")
                        @ExcludeMissing
                        metadata: JsonField<InnerMetadata> = JsonMissing.of()
                    ) : this(metadata, mutableMapOf())

                    /**
                     * The metadata to be attached to the entity by existing rules. It is a
                     * key-value pairs where the values can be of any type (string, number, boolean,
                     * object, array, etc.).
                     *
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun metadata(): Optional<InnerMetadata> = metadata.getOptional("metadata")

                    /**
                     * Returns the raw JSON value of [metadata].
                     *
                     * Unlike [metadata], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    fun _metadata(): JsonField<InnerMetadata> = metadata

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

                        /** Returns a mutable builder for constructing an instance of [Metadata]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Metadata]. */
                    class Builder internal constructor() {

                        private var metadata: JsonField<InnerMetadata> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(metadata: Metadata) = apply {
                            this.metadata = metadata.metadata
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        /**
                         * The metadata to be attached to the entity by existing rules. It is a
                         * key-value pairs where the values can be of any type (string, number,
                         * boolean, object, array, etc.).
                         */
                        fun metadata(metadata: InnerMetadata) = metadata(JsonField.of(metadata))

                        /**
                         * Sets [Builder.metadata] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.metadata] with a well-typed
                         * [InnerMetadata] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun metadata(metadata: JsonField<InnerMetadata>) = apply {
                            this.metadata = metadata
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Metadata].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Metadata =
                            Metadata(metadata, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): Metadata = apply {
                        if (validated) {
                            return@apply
                        }

                        metadata().ifPresent { it.validate() }
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
                    @JvmSynthetic
                    internal fun validity(): Int = (metadata.asKnown().getOrNull()?.validity() ?: 0)

                    /**
                     * The metadata to be attached to the entity by existing rules. It is a
                     * key-value pairs where the values can be of any type (string, number, boolean,
                     * object, array, etc.).
                     */
                    class InnerMetadata
                    @JsonCreator
                    private constructor(
                        @com.fasterxml.jackson.annotation.JsonValue
                        private val additionalProperties: Map<String, JsonValue>
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [InnerMetadata].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [InnerMetadata]. */
                        class Builder internal constructor() {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(innerMetadata: InnerMetadata) = apply {
                                additionalProperties =
                                    innerMetadata.additionalProperties.toMutableMap()
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [InnerMetadata].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): InnerMetadata =
                                InnerMetadata(additionalProperties.toImmutable())
                        }

                        private var validated: Boolean = false

                        fun validate(): InnerMetadata = apply {
                            if (validated) {
                                return@apply
                            }

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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            additionalProperties.count { (_, value) ->
                                !value.isNull() && !value.isMissing()
                            }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is InnerMetadata && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "InnerMetadata{additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Metadata && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(metadata, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Metadata{metadata=$metadata, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Attributes && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(metadata, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Attributes{metadata=$metadata, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EmployerContribution && amount == other.amount && attributes == other.attributes && currency == other.currency && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, attributes, currency, name, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EmployerContribution{amount=$amount, attributes=$attributes, currency=$currency, name=$name, type=$type, additionalProperties=$additionalProperties}"
        }

        /** The payment method. */
        class PaymentMethod @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CHECK = of("check")

                @JvmField val DIRECT_DEPOSIT = of("direct_deposit")

                @JvmField val OTHER = of("other")

                @JvmStatic fun of(value: String) = PaymentMethod(JsonField.of(value))
            }

            /** An enum containing [PaymentMethod]'s known values. */
            enum class Known {
                CHECK,
                DIRECT_DEPOSIT,
                OTHER,
            }

            /**
             * An enum containing [PaymentMethod]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaymentMethod] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CHECK,
                DIRECT_DEPOSIT,
                OTHER,
                /**
                 * An enum member indicating that [PaymentMethod] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CHECK -> Value.CHECK
                    DIRECT_DEPOSIT -> Value.DIRECT_DEPOSIT
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws FinchInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    CHECK -> Known.CHECK
                    DIRECT_DEPOSIT -> Known.DIRECT_DEPOSIT
                    OTHER -> Known.OTHER
                    else -> throw FinchInvalidDataException("Unknown PaymentMethod: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws FinchInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    FinchInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): PaymentMethod = apply {
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

                return /* spotless:off */ other is PaymentMethod && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Tax
        private constructor(
            private val amount: JsonField<Long>,
            private val attributes: JsonField<Attributes>,
            private val currency: JsonField<String>,
            private val employer: JsonField<Boolean>,
            private val name: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("attributes")
                @ExcludeMissing
                attributes: JsonField<Attributes> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("employer")
                @ExcludeMissing
                employer: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(amount, attributes, currency, employer, name, type, mutableMapOf())

            /**
             * The tax amount in cents.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amount(): Optional<Long> = amount.getOptional("amount")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun attributes(): Optional<Attributes> = attributes.getOptional("attributes")

            /**
             * The currency code.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun currency(): Optional<String> = currency.getOptional("currency")

            /**
             * `true` if the amount is paid by the employers.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun employer(): Optional<Boolean> = employer.getOptional("employer")

            /**
             * The exact name of tax from the pay statement.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * The type of taxes.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [attributes].
             *
             * Unlike [attributes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("attributes")
            @ExcludeMissing
            fun _attributes(): JsonField<Attributes> = attributes

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [employer].
             *
             * Unlike [employer], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("employer") @ExcludeMissing fun _employer(): JsonField<Boolean> = employer

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

                /** Returns a mutable builder for constructing an instance of [Tax]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Tax]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var attributes: JsonField<Attributes> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var employer: JsonField<Boolean> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tax: Tax) = apply {
                    amount = tax.amount
                    attributes = tax.attributes
                    currency = tax.currency
                    employer = tax.employer
                    name = tax.name
                    type = tax.type
                    additionalProperties = tax.additionalProperties.toMutableMap()
                }

                /** The tax amount in cents. */
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
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                fun attributes(attributes: Attributes?) =
                    attributes(JsonField.ofNullable(attributes))

                /** Alias for calling [Builder.attributes] with `attributes.orElse(null)`. */
                fun attributes(attributes: Optional<Attributes>) =
                    attributes(attributes.getOrNull())

                /**
                 * Sets [Builder.attributes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.attributes] with a well-typed [Attributes] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun attributes(attributes: JsonField<Attributes>) = apply {
                    this.attributes = attributes
                }

                /** The currency code. */
                fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

                /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
                fun currency(currency: Optional<String>) = currency(currency.getOrNull())

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** `true` if the amount is paid by the employers. */
                fun employer(employer: Boolean?) = employer(JsonField.ofNullable(employer))

                /**
                 * Alias for [Builder.employer].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun employer(employer: Boolean) = employer(employer as Boolean?)

                /** Alias for calling [Builder.employer] with `employer.orElse(null)`. */
                fun employer(employer: Optional<Boolean>) = employer(employer.getOrNull())

                /**
                 * Sets [Builder.employer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.employer] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun employer(employer: JsonField<Boolean>) = apply { this.employer = employer }

                /** The exact name of tax from the pay statement. */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The type of taxes. */
                fun type(type: Type?) = type(JsonField.ofNullable(type))

                /** Alias for calling [Builder.type] with `type.orElse(null)`. */
                fun type(type: Optional<Type>) = type(type.getOrNull())

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                /**
                 * Returns an immutable instance of [Tax].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Tax =
                    Tax(
                        amount,
                        attributes,
                        currency,
                        employer,
                        name,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Tax = apply {
                if (validated) {
                    return@apply
                }

                amount()
                attributes().ifPresent { it.validate() }
                currency()
                employer()
                name()
                type().ifPresent { it.validate() }
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (attributes.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (currency.asKnown().isPresent) 1 else 0) +
                    (if (employer.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Attributes
            private constructor(
                private val metadata: JsonField<Metadata>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of()
                ) : this(metadata, mutableMapOf())

                /**
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

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

                    /** Returns a mutable builder for constructing an instance of [Attributes]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Attributes]. */
                class Builder internal constructor() {

                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(attributes: Attributes) = apply {
                        metadata = attributes.metadata
                        additionalProperties = attributes.additionalProperties.toMutableMap()
                    }

                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

                    /**
                     * Returns an immutable instance of [Attributes].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Attributes =
                        Attributes(metadata, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Attributes = apply {
                    if (validated) {
                        return@apply
                    }

                    metadata().ifPresent { it.validate() }
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
                @JvmSynthetic
                internal fun validity(): Int = (metadata.asKnown().getOrNull()?.validity() ?: 0)

                class Metadata
                private constructor(
                    private val metadata: JsonField<InnerMetadata>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("metadata")
                        @ExcludeMissing
                        metadata: JsonField<InnerMetadata> = JsonMissing.of()
                    ) : this(metadata, mutableMapOf())

                    /**
                     * The metadata to be attached to the entity by existing rules. It is a
                     * key-value pairs where the values can be of any type (string, number, boolean,
                     * object, array, etc.).
                     *
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun metadata(): Optional<InnerMetadata> = metadata.getOptional("metadata")

                    /**
                     * Returns the raw JSON value of [metadata].
                     *
                     * Unlike [metadata], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    fun _metadata(): JsonField<InnerMetadata> = metadata

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

                        /** Returns a mutable builder for constructing an instance of [Metadata]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Metadata]. */
                    class Builder internal constructor() {

                        private var metadata: JsonField<InnerMetadata> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(metadata: Metadata) = apply {
                            this.metadata = metadata.metadata
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        /**
                         * The metadata to be attached to the entity by existing rules. It is a
                         * key-value pairs where the values can be of any type (string, number,
                         * boolean, object, array, etc.).
                         */
                        fun metadata(metadata: InnerMetadata) = metadata(JsonField.of(metadata))

                        /**
                         * Sets [Builder.metadata] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.metadata] with a well-typed
                         * [InnerMetadata] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun metadata(metadata: JsonField<InnerMetadata>) = apply {
                            this.metadata = metadata
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Metadata].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Metadata =
                            Metadata(metadata, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): Metadata = apply {
                        if (validated) {
                            return@apply
                        }

                        metadata().ifPresent { it.validate() }
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
                    @JvmSynthetic
                    internal fun validity(): Int = (metadata.asKnown().getOrNull()?.validity() ?: 0)

                    /**
                     * The metadata to be attached to the entity by existing rules. It is a
                     * key-value pairs where the values can be of any type (string, number, boolean,
                     * object, array, etc.).
                     */
                    class InnerMetadata
                    @JsonCreator
                    private constructor(
                        @com.fasterxml.jackson.annotation.JsonValue
                        private val additionalProperties: Map<String, JsonValue>
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [InnerMetadata].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [InnerMetadata]. */
                        class Builder internal constructor() {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(innerMetadata: InnerMetadata) = apply {
                                additionalProperties =
                                    innerMetadata.additionalProperties.toMutableMap()
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [InnerMetadata].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): InnerMetadata =
                                InnerMetadata(additionalProperties.toImmutable())
                        }

                        private var validated: Boolean = false

                        fun validate(): InnerMetadata = apply {
                            if (validated) {
                                return@apply
                            }

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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            additionalProperties.count { (_, value) ->
                                !value.isNull() && !value.isMissing()
                            }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is InnerMetadata && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "InnerMetadata{additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Metadata && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(metadata, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Metadata{metadata=$metadata, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Attributes && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(metadata, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Attributes{metadata=$metadata, additionalProperties=$additionalProperties}"
            }

            /** The type of taxes. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val STATE = of("state")

                    @JvmField val FEDERAL = of("federal")

                    @JvmField val LOCAL = of("local")

                    @JvmField val FICA = of("fica")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    STATE,
                    FEDERAL,
                    LOCAL,
                    FICA,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    STATE,
                    FEDERAL,
                    LOCAL,
                    FICA,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        STATE -> Value.STATE
                        FEDERAL -> Value.FEDERAL
                        LOCAL -> Value.LOCAL
                        FICA -> Value.FICA
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws FinchInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        STATE -> Known.STATE
                        FEDERAL -> Known.FEDERAL
                        LOCAL -> Known.LOCAL
                        FICA -> Known.FICA
                        else -> throw FinchInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws FinchInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        FinchInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Tax && amount == other.amount && attributes == other.attributes && currency == other.currency && employer == other.employer && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, attributes, currency, employer, name, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tax{amount=$amount, attributes=$attributes, currency=$currency, employer=$employer, name=$name, type=$type, additionalProperties=$additionalProperties}"
        }

        /** The type of the payment associated with the pay statement. */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val REGULAR_PAYROLL = of("regular_payroll")

                @JvmField val OFF_CYCLE_PAYROLL = of("off_cycle_payroll")

                @JvmField val ONE_TIME_PAYMENT = of("one_time_payment")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                REGULAR_PAYROLL,
                OFF_CYCLE_PAYROLL,
                ONE_TIME_PAYMENT,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REGULAR_PAYROLL,
                OFF_CYCLE_PAYROLL,
                ONE_TIME_PAYMENT,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    REGULAR_PAYROLL -> Value.REGULAR_PAYROLL
                    OFF_CYCLE_PAYROLL -> Value.OFF_CYCLE_PAYROLL
                    ONE_TIME_PAYMENT -> Value.ONE_TIME_PAYMENT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws FinchInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    REGULAR_PAYROLL -> Known.REGULAR_PAYROLL
                    OFF_CYCLE_PAYROLL -> Known.OFF_CYCLE_PAYROLL
                    ONE_TIME_PAYMENT -> Known.ONE_TIME_PAYMENT
                    else -> throw FinchInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws FinchInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    FinchInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PayStatement && earnings == other.earnings && employeeDeductions == other.employeeDeductions && employerContributions == other.employerContributions && grossPay == other.grossPay && individualId == other.individualId && netPay == other.netPay && paymentMethod == other.paymentMethod && taxes == other.taxes && totalHours == other.totalHours && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(earnings, employeeDeductions, employerContributions, grossPay, individualId, netPay, paymentMethod, taxes, totalHours, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PayStatement{earnings=$earnings, employeeDeductions=$employeeDeductions, employerContributions=$employerContributions, grossPay=$grossPay, individualId=$individualId, netPay=$netPay, paymentMethod=$paymentMethod, taxes=$taxes, totalHours=$totalHours, type=$type, additionalProperties=$additionalProperties}"
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

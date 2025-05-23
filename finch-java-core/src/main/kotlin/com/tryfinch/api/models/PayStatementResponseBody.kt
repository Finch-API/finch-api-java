// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.BaseDeserializer
import com.tryfinch.api.core.BaseSerializer
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.allMaxBy
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.getOrThrow
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = PayStatementResponseBody.Deserializer::class)
@JsonSerialize(using = PayStatementResponseBody.Serializer::class)
class PayStatementResponseBody
private constructor(
    private val unionMember0: UnionMember0? = null,
    private val batchError: BatchError? = null,
    private val unionMember2: UnionMember2? = null,
    private val _json: JsonValue? = null,
) {

    fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

    fun batchError(): Optional<BatchError> = Optional.ofNullable(batchError)

    fun unionMember2(): Optional<UnionMember2> = Optional.ofNullable(unionMember2)

    fun isUnionMember0(): Boolean = unionMember0 != null

    fun isBatchError(): Boolean = batchError != null

    fun isUnionMember2(): Boolean = unionMember2 != null

    fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

    fun asBatchError(): BatchError = batchError.getOrThrow("batchError")

    fun asUnionMember2(): UnionMember2 = unionMember2.getOrThrow("unionMember2")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
            batchError != null -> visitor.visitBatchError(batchError)
            unionMember2 != null -> visitor.visitUnionMember2(unionMember2)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): PayStatementResponseBody = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitUnionMember0(unionMember0: UnionMember0) {
                    unionMember0.validate()
                }

                override fun visitBatchError(batchError: BatchError) {
                    batchError.validate()
                }

                override fun visitUnionMember2(unionMember2: UnionMember2) {
                    unionMember2.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitUnionMember0(unionMember0: UnionMember0) = unionMember0.validity()

                override fun visitBatchError(batchError: BatchError) = batchError.validity()

                override fun visitUnionMember2(unionMember2: UnionMember2) = unionMember2.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PayStatementResponseBody && unionMember0 == other.unionMember0 && batchError == other.batchError && unionMember2 == other.unionMember2 /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(unionMember0, batchError, unionMember2) /* spotless:on */

    override fun toString(): String =
        when {
            unionMember0 != null -> "PayStatementResponseBody{unionMember0=$unionMember0}"
            batchError != null -> "PayStatementResponseBody{batchError=$batchError}"
            unionMember2 != null -> "PayStatementResponseBody{unionMember2=$unionMember2}"
            _json != null -> "PayStatementResponseBody{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid PayStatementResponseBody")
        }

    companion object {

        @JvmStatic
        fun ofUnionMember0(unionMember0: UnionMember0) =
            PayStatementResponseBody(unionMember0 = unionMember0)

        @JvmStatic
        fun ofBatchError(batchError: BatchError) = PayStatementResponseBody(batchError = batchError)

        @JvmStatic
        fun ofUnionMember2(unionMember2: UnionMember2) =
            PayStatementResponseBody(unionMember2 = unionMember2)
    }

    /**
     * An interface that defines how to map each variant of [PayStatementResponseBody] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitUnionMember0(unionMember0: UnionMember0): T

        fun visitBatchError(batchError: BatchError): T

        fun visitUnionMember2(unionMember2: UnionMember2): T

        /**
         * Maps an unknown variant of [PayStatementResponseBody] to a value of type [T].
         *
         * An instance of [PayStatementResponseBody] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws FinchInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw FinchInvalidDataException("Unknown PayStatementResponseBody: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<PayStatementResponseBody>(PayStatementResponseBody::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): PayStatementResponseBody {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                            PayStatementResponseBody(unionMember0 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<BatchError>())?.let {
                            PayStatementResponseBody(batchError = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember2>())?.let {
                            PayStatementResponseBody(unionMember2 = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> PayStatementResponseBody(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<PayStatementResponseBody>(PayStatementResponseBody::class) {

        override fun serialize(
            value: PayStatementResponseBody,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                value.batchError != null -> generator.writeObject(value.batchError)
                value.unionMember2 != null -> generator.writeObject(value.unionMember2)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid PayStatementResponseBody")
            }
        }
    }

    class UnionMember0
    private constructor(
        private val paging: JsonField<Paging>,
        private val payStatements: JsonField<List<PayStatement>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("paging") @ExcludeMissing paging: JsonField<Paging> = JsonMissing.of(),
            @JsonProperty("pay_statements")
            @ExcludeMissing
            payStatements: JsonField<List<PayStatement>> = JsonMissing.of(),
        ) : this(paging, payStatements, mutableMapOf())

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paging(): Paging = paging.getRequired("paging")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun payStatements(): List<PayStatement> = payStatements.getRequired("pay_statements")

        /**
         * Returns the raw JSON value of [paging].
         *
         * Unlike [paging], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("paging") @ExcludeMissing fun _paging(): JsonField<Paging> = paging

        /**
         * Returns the raw JSON value of [payStatements].
         *
         * Unlike [payStatements], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pay_statements")
        @ExcludeMissing
        fun _payStatements(): JsonField<List<PayStatement>> = payStatements

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
             * Returns a mutable builder for constructing an instance of [UnionMember0].
             *
             * The following fields are required:
             * ```java
             * .paging()
             * .payStatements()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember0]. */
        class Builder internal constructor() {

            private var paging: JsonField<Paging>? = null
            private var payStatements: JsonField<MutableList<PayStatement>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember0: UnionMember0) = apply {
                paging = unionMember0.paging
                payStatements = unionMember0.payStatements.map { it.toMutableList() }
                additionalProperties = unionMember0.additionalProperties.toMutableMap()
            }

            fun paging(paging: Paging) = paging(JsonField.of(paging))

            /**
             * Sets [Builder.paging] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paging] with a well-typed [Paging] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

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
             * Returns an immutable instance of [UnionMember0].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .paging()
             * .payStatements()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UnionMember0 =
                UnionMember0(
                    checkRequired("paging", paging),
                    checkRequired("payStatements", payStatements).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UnionMember0 = apply {
            if (validated) {
                return@apply
            }

            paging().validate()
            payStatements().forEach { it.validate() }
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
            (paging.asKnown().getOrNull()?.validity() ?: 0) +
                (payStatements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Paging
        private constructor(
            private val offset: JsonField<Long>,
            private val count: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
            ) : this(offset, count, mutableMapOf())

            /**
             * The current start index of the returned list of elements
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun offset(): Long = offset.getRequired("offset")

            /**
             * The total number of elements for the entire query (not just the given page)
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun count(): Optional<Long> = count.getOptional("count")

            /**
             * Returns the raw JSON value of [offset].
             *
             * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

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
                 * Returns a mutable builder for constructing an instance of [Paging].
                 *
                 * The following fields are required:
                 * ```java
                 * .offset()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Paging]. */
            class Builder internal constructor() {

                private var offset: JsonField<Long>? = null
                private var count: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(paging: Paging) = apply {
                    offset = paging.offset
                    count = paging.count
                    additionalProperties = paging.additionalProperties.toMutableMap()
                }

                /** The current start index of the returned list of elements */
                fun offset(offset: Long) = offset(JsonField.of(offset))

                /**
                 * Sets [Builder.offset] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.offset] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

                /** The total number of elements for the entire query (not just the given page) */
                fun count(count: Long) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Long>) = apply { this.count = count }

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
                 * Returns an immutable instance of [Paging].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .offset()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Paging =
                    Paging(
                        checkRequired("offset", offset),
                        count,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Paging = apply {
                if (validated) {
                    return@apply
                }

                offset()
                count()
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
                (if (offset.asKnown().isPresent) 1 else 0) +
                    (if (count.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Paging && offset == other.offset && count == other.count && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(offset, count, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Paging{offset=$offset, count=$count, additionalProperties=$additionalProperties}"
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
                @JsonProperty("net_pay")
                @ExcludeMissing
                netPay: JsonField<Money> = JsonMissing.of(),
                @JsonProperty("payment_method")
                @ExcludeMissing
                paymentMethod: JsonField<PaymentMethod> = JsonMissing.of(),
                @JsonProperty("taxes")
                @ExcludeMissing
                taxes: JsonField<List<Tax?>> = JsonMissing.of(),
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
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun earnings(): Optional<List<Earning?>> = earnings.getOptional("earnings")

            /**
             * The array of deductions objects associated with this pay statement.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun employeeDeductions(): Optional<List<EmployeeDeduction?>> =
                employeeDeductions.getOptional("employee_deductions")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun employerContributions(): Optional<List<EmployerContribution?>> =
                employerContributions.getOptional("employer_contributions")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun grossPay(): Optional<Money> = grossPay.getOptional("gross_pay")

            /**
             * A stable Finch `id` (UUID v4) for an individual in the company
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun individualId(): String = individualId.getRequired("individual_id")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun netPay(): Optional<Money> = netPay.getOptional("net_pay")

            /**
             * The payment method.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun paymentMethod(): Optional<PaymentMethod> =
                paymentMethod.getOptional("payment_method")

            /**
             * The array of taxes objects associated with this pay statement.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun taxes(): Optional<List<Tax?>> = taxes.getOptional("taxes")

            /**
             * The number of hours worked for this pay period
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun totalHours(): Optional<Double> = totalHours.getOptional("total_hours")

            /**
             * The type of the payment associated with the pay statement.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [earnings].
             *
             * Unlike [earnings], this method doesn't throw if the JSON field has an unexpected
             * type.
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
            fun _employerContributions(): JsonField<List<EmployerContribution?>> =
                employerContributions

            /**
             * Returns the raw JSON value of [grossPay].
             *
             * Unlike [grossPay], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [totalHours], this method doesn't throw if the JSON field has an unexpected
             * type.
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

                /**
                 * Returns a mutable builder for constructing an instance of [PayStatement].
                 *
                 * The following fields are required:
                 * ```java
                 * .earnings()
                 * .employeeDeductions()
                 * .employerContributions()
                 * .grossPay()
                 * .individualId()
                 * .netPay()
                 * .paymentMethod()
                 * .taxes()
                 * .totalHours()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PayStatement]. */
            class Builder internal constructor() {

                private var earnings: JsonField<MutableList<Earning?>>? = null
                private var employeeDeductions: JsonField<MutableList<EmployeeDeduction?>>? = null
                private var employerContributions: JsonField<MutableList<EmployerContribution?>>? =
                    null
                private var grossPay: JsonField<Money>? = null
                private var individualId: JsonField<String>? = null
                private var netPay: JsonField<Money>? = null
                private var paymentMethod: JsonField<PaymentMethod>? = null
                private var taxes: JsonField<MutableList<Tax?>>? = null
                private var totalHours: JsonField<Double>? = null
                private var type: JsonField<Type>? = null
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
                 * You should usually call [Builder.earnings] with a well-typed `List<Earning?>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * `List<EmployeeDeduction?>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
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
                 * `List<EmployerContribution?>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
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
                 * You should usually call [Builder.grossPay] with a well-typed [Money] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun grossPay(grossPay: JsonField<Money>) = apply { this.grossPay = grossPay }

                /** A stable Finch `id` (UUID v4) for an individual in the company */
                fun individualId(individualId: String) = individualId(JsonField.of(individualId))

                /**
                 * Sets [Builder.individualId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.individualId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * You should usually call [Builder.taxes] with a well-typed `List<Tax?>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun totalHours(totalHours: JsonField<Double>) = apply {
                    this.totalHours = totalHours
                }

                /** The type of the payment associated with the pay statement. */
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
                 * Returns an immutable instance of [PayStatement].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .earnings()
                 * .employeeDeductions()
                 * .employerContributions()
                 * .grossPay()
                 * .individualId()
                 * .netPay()
                 * .paymentMethod()
                 * .taxes()
                 * .totalHours()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PayStatement =
                    PayStatement(
                        checkRequired("earnings", earnings).map { it.toImmutable() },
                        checkRequired("employeeDeductions", employeeDeductions).map {
                            it.toImmutable()
                        },
                        checkRequired("employerContributions", employerContributions).map {
                            it.toImmutable()
                        },
                        checkRequired("grossPay", grossPay),
                        checkRequired("individualId", individualId),
                        checkRequired("netPay", netPay),
                        checkRequired("paymentMethod", paymentMethod),
                        checkRequired("taxes", taxes).map { it.toImmutable() },
                        checkRequired("totalHours", totalHours),
                        checkRequired("type", type),
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
                    (employeeDeductions.asKnown().getOrNull()?.sumOf {
                        (it?.validity() ?: 0).toInt()
                    } ?: 0) +
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
                private val currency: JsonField<String>,
                private val hours: JsonField<Double>,
                private val name: JsonField<String>,
                private val type: JsonField<Type>,
                private val attributes: JsonField<Attributes>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("hours")
                    @ExcludeMissing
                    hours: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                    @JsonProperty("attributes")
                    @ExcludeMissing
                    attributes: JsonField<Attributes> = JsonMissing.of(),
                ) : this(amount, currency, hours, name, type, attributes, mutableMapOf())

                /**
                 * The earnings amount in cents.
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun amount(): Optional<Long> = amount.getOptional("amount")

                /**
                 * The earnings currency code.
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun currency(): Optional<String> = currency.getOptional("currency")

                /**
                 * The number of hours associated with this earning. (For salaried employees, this
                 * could be hours per pay period, `0` or `null`, depending on the provider).
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun hours(): Optional<Double> = hours.getOptional("hours")

                /**
                 * The exact name of the deduction from the pay statement.
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * The type of earning.
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun type(): Optional<Type> = type.getOptional("type")

                /**
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun attributes(): Optional<Attributes> = attributes.getOptional("attributes")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                /**
                 * Returns the raw JSON value of [hours].
                 *
                 * Unlike [hours], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("hours") @ExcludeMissing fun _hours(): JsonField<Double> = hours

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                /**
                 * Returns the raw JSON value of [attributes].
                 *
                 * Unlike [attributes], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("attributes")
                @ExcludeMissing
                fun _attributes(): JsonField<Attributes> = attributes

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
                     * Returns a mutable builder for constructing an instance of [Earning].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * .hours()
                     * .name()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Earning]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var currency: JsonField<String>? = null
                    private var hours: JsonField<Double>? = null
                    private var name: JsonField<String>? = null
                    private var type: JsonField<Type>? = null
                    private var attributes: JsonField<Attributes> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(earning: Earning) = apply {
                        amount = earning.amount
                        currency = earning.currency
                        hours = earning.hours
                        name = earning.name
                        type = earning.type
                        attributes = earning.attributes
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
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /** The earnings currency code. */
                    fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

                    /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
                    fun currency(currency: Optional<String>) = currency(currency.getOrNull())

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    /**
                     * The number of hours associated with this earning. (For salaried employees,
                     * this could be hours per pay period, `0` or `null`, depending on the
                     * provider).
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
                     * You should usually call [Builder.hours] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun hours(hours: JsonField<Double>) = apply { this.hours = hours }

                    /** The exact name of the deduction from the pay statement. */
                    fun name(name: String?) = name(JsonField.ofNullable(name))

                    /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                    fun name(name: Optional<String>) = name(name.getOrNull())

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /** The type of earning. */
                    fun type(type: Type?) = type(JsonField.ofNullable(type))

                    /** Alias for calling [Builder.type] with `type.orElse(null)`. */
                    fun type(type: Optional<Type>) = type(type.getOrNull())

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun attributes(attributes: Attributes?) =
                        attributes(JsonField.ofNullable(attributes))

                    /** Alias for calling [Builder.attributes] with `attributes.orElse(null)`. */
                    fun attributes(attributes: Optional<Attributes>) =
                        attributes(attributes.getOrNull())

                    /**
                     * Sets [Builder.attributes] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.attributes] with a well-typed [Attributes]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun attributes(attributes: JsonField<Attributes>) = apply {
                        this.attributes = attributes
                    }

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
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * .hours()
                     * .name()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Earning =
                        Earning(
                            checkRequired("amount", amount),
                            checkRequired("currency", currency),
                            checkRequired("hours", hours),
                            checkRequired("name", name),
                            checkRequired("type", type),
                            attributes,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Earning = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currency()
                    hours()
                    name()
                    type().ifPresent { it.validate() }
                    attributes().ifPresent { it.validate() }
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
                        (if (currency.asKnown().isPresent) 1 else 0) +
                        (if (hours.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                        (attributes.asKnown().getOrNull()?.validity() ?: 0)

                /** The type of earning. */
                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
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
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws FinchInvalidDataException if this class instance's value is a not a
                     *   known member.
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
                     * @throws FinchInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

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
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun metadata(): Metadata = metadata.getRequired("metadata")

                    /**
                     * Returns the raw JSON value of [metadata].
                     *
                     * Unlike [metadata], this method doesn't throw if the JSON field has an
                     * unexpected type.
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

                        /**
                         * Returns a mutable builder for constructing an instance of [Attributes].
                         *
                         * The following fields are required:
                         * ```java
                         * .metadata()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Attributes]. */
                    class Builder internal constructor() {

                        private var metadata: JsonField<Metadata>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(attributes: Attributes) = apply {
                            metadata = attributes.metadata
                            additionalProperties = attributes.additionalProperties.toMutableMap()
                        }

                        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                        /**
                         * Sets [Builder.metadata] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.metadata] with a well-typed [Metadata]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun metadata(metadata: JsonField<Metadata>) = apply {
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
                         * Returns an immutable instance of [Attributes].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .metadata()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Attributes =
                            Attributes(
                                checkRequired("metadata", metadata),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Attributes = apply {
                        if (validated) {
                            return@apply
                        }

                        metadata().validate()
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
                         * key-value pairs where the values can be of any type (string, number,
                         * boolean, object, array, etc.).
                         *
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun metadata(): InnerMetadata = metadata.getRequired("metadata")

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

                            /**
                             * Returns a mutable builder for constructing an instance of [Metadata].
                             *
                             * The following fields are required:
                             * ```java
                             * .metadata()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Metadata]. */
                        class Builder internal constructor() {

                            private var metadata: JsonField<InnerMetadata>? = null
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
                             * [InnerMetadata] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
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
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .metadata()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Metadata =
                                Metadata(
                                    checkRequired("metadata", metadata),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Metadata = apply {
                            if (validated) {
                                return@apply
                            }

                            metadata().validate()
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
                            (metadata.asKnown().getOrNull()?.validity() ?: 0)

                        /**
                         * The metadata to be attached to the entity by existing rules. It is a
                         * key-value pairs where the values can be of any type (string, number,
                         * boolean, object, array, etc.).
                         */
                        class InnerMetadata
                        @JsonCreator
                        private constructor(
                            @com.fasterxml.jackson.annotation.JsonValue
                            private val additionalProperties: Map<String, JsonValue>
                        ) {

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

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

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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

                    return /* spotless:off */ other is Earning && amount == other.amount && currency == other.currency && hours == other.hours && name == other.name && type == other.type && attributes == other.attributes && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, currency, hours, name, type, attributes, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Earning{amount=$amount, currency=$currency, hours=$hours, name=$name, type=$type, attributes=$attributes, additionalProperties=$additionalProperties}"
            }

            class EmployeeDeduction
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<String>,
                private val name: JsonField<String>,
                private val preTax: JsonField<Boolean>,
                private val type: JsonField<BenefitType>,
                private val attributes: JsonField<Attributes>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("pre_tax")
                    @ExcludeMissing
                    preTax: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("type")
                    @ExcludeMissing
                    type: JsonField<BenefitType> = JsonMissing.of(),
                    @JsonProperty("attributes")
                    @ExcludeMissing
                    attributes: JsonField<Attributes> = JsonMissing.of(),
                ) : this(amount, currency, name, preTax, type, attributes, mutableMapOf())

                /**
                 * The deduction amount in cents.
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun amount(): Optional<Long> = amount.getOptional("amount")

                /**
                 * The deduction currency.
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun currency(): Optional<String> = currency.getOptional("currency")

                /**
                 * The deduction name from the pay statement.
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * Boolean indicating if the deduction is pre-tax.
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun preTax(): Optional<Boolean> = preTax.getOptional("pre_tax")

                /**
                 * Type of benefit.
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun type(): Optional<BenefitType> = type.getOptional("type")

                /**
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun attributes(): Optional<Attributes> = attributes.getOptional("attributes")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [preTax].
                 *
                 * Unlike [preTax], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("pre_tax") @ExcludeMissing fun _preTax(): JsonField<Boolean> = preTax

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<BenefitType> = type

                /**
                 * Returns the raw JSON value of [attributes].
                 *
                 * Unlike [attributes], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("attributes")
                @ExcludeMissing
                fun _attributes(): JsonField<Attributes> = attributes

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
                     * Returns a mutable builder for constructing an instance of
                     * [EmployeeDeduction].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * .name()
                     * .preTax()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [EmployeeDeduction]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var currency: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var preTax: JsonField<Boolean>? = null
                    private var type: JsonField<BenefitType>? = null
                    private var attributes: JsonField<Attributes> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(employeeDeduction: EmployeeDeduction) = apply {
                        amount = employeeDeduction.amount
                        currency = employeeDeduction.currency
                        name = employeeDeduction.name
                        preTax = employeeDeduction.preTax
                        type = employeeDeduction.type
                        attributes = employeeDeduction.attributes
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
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /** The deduction currency. */
                    fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

                    /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
                    fun currency(currency: Optional<String>) = currency(currency.getOrNull())

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    /** The deduction name from the pay statement. */
                    fun name(name: String?) = name(JsonField.ofNullable(name))

                    /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                    fun name(name: Optional<String>) = name(name.getOrNull())

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<BenefitType>) = apply { this.type = type }

                    fun attributes(attributes: Attributes?) =
                        attributes(JsonField.ofNullable(attributes))

                    /** Alias for calling [Builder.attributes] with `attributes.orElse(null)`. */
                    fun attributes(attributes: Optional<Attributes>) =
                        attributes(attributes.getOrNull())

                    /**
                     * Sets [Builder.attributes] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.attributes] with a well-typed [Attributes]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun attributes(attributes: JsonField<Attributes>) = apply {
                        this.attributes = attributes
                    }

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
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * .name()
                     * .preTax()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): EmployeeDeduction =
                        EmployeeDeduction(
                            checkRequired("amount", amount),
                            checkRequired("currency", currency),
                            checkRequired("name", name),
                            checkRequired("preTax", preTax),
                            checkRequired("type", type),
                            attributes,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): EmployeeDeduction = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currency()
                    name()
                    preTax()
                    type().ifPresent { it.validate() }
                    attributes().ifPresent { it.validate() }
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
                        (if (currency.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (if (preTax.asKnown().isPresent) 1 else 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                        (attributes.asKnown().getOrNull()?.validity() ?: 0)

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
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun metadata(): Metadata = metadata.getRequired("metadata")

                    /**
                     * Returns the raw JSON value of [metadata].
                     *
                     * Unlike [metadata], this method doesn't throw if the JSON field has an
                     * unexpected type.
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

                        /**
                         * Returns a mutable builder for constructing an instance of [Attributes].
                         *
                         * The following fields are required:
                         * ```java
                         * .metadata()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Attributes]. */
                    class Builder internal constructor() {

                        private var metadata: JsonField<Metadata>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(attributes: Attributes) = apply {
                            metadata = attributes.metadata
                            additionalProperties = attributes.additionalProperties.toMutableMap()
                        }

                        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                        /**
                         * Sets [Builder.metadata] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.metadata] with a well-typed [Metadata]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun metadata(metadata: JsonField<Metadata>) = apply {
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
                         * Returns an immutable instance of [Attributes].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .metadata()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Attributes =
                            Attributes(
                                checkRequired("metadata", metadata),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Attributes = apply {
                        if (validated) {
                            return@apply
                        }

                        metadata().validate()
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
                         * key-value pairs where the values can be of any type (string, number,
                         * boolean, object, array, etc.).
                         *
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun metadata(): InnerMetadata = metadata.getRequired("metadata")

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

                            /**
                             * Returns a mutable builder for constructing an instance of [Metadata].
                             *
                             * The following fields are required:
                             * ```java
                             * .metadata()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Metadata]. */
                        class Builder internal constructor() {

                            private var metadata: JsonField<InnerMetadata>? = null
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
                             * [InnerMetadata] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
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
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .metadata()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Metadata =
                                Metadata(
                                    checkRequired("metadata", metadata),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Metadata = apply {
                            if (validated) {
                                return@apply
                            }

                            metadata().validate()
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
                            (metadata.asKnown().getOrNull()?.validity() ?: 0)

                        /**
                         * The metadata to be attached to the entity by existing rules. It is a
                         * key-value pairs where the values can be of any type (string, number,
                         * boolean, object, array, etc.).
                         */
                        class InnerMetadata
                        @JsonCreator
                        private constructor(
                            @com.fasterxml.jackson.annotation.JsonValue
                            private val additionalProperties: Map<String, JsonValue>
                        ) {

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

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

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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

                    return /* spotless:off */ other is EmployeeDeduction && amount == other.amount && currency == other.currency && name == other.name && preTax == other.preTax && type == other.type && attributes == other.attributes && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, currency, name, preTax, type, attributes, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "EmployeeDeduction{amount=$amount, currency=$currency, name=$name, preTax=$preTax, type=$type, attributes=$attributes, additionalProperties=$additionalProperties}"
            }

            class EmployerContribution
            private constructor(
                private val currency: JsonField<String>,
                private val name: JsonField<String>,
                private val type: JsonField<BenefitType>,
                private val amount: JsonField<Long>,
                private val attributes: JsonField<Attributes>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type")
                    @ExcludeMissing
                    type: JsonField<BenefitType> = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("attributes")
                    @ExcludeMissing
                    attributes: JsonField<Attributes> = JsonMissing.of(),
                ) : this(currency, name, type, amount, attributes, mutableMapOf())

                /**
                 * The contribution currency.
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun currency(): Optional<String> = currency.getOptional("currency")

                /**
                 * The contribution name from the pay statement.
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * Type of benefit.
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun type(): Optional<BenefitType> = type.getOptional("type")

                /**
                 * The contribution amount in cents.
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun amount(): Optional<Long> = amount.getOptional("amount")

                /**
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun attributes(): Optional<Attributes> = attributes.getOptional("attributes")

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<BenefitType> = type

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [attributes].
                 *
                 * Unlike [attributes], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("attributes")
                @ExcludeMissing
                fun _attributes(): JsonField<Attributes> = attributes

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
                     * Returns a mutable builder for constructing an instance of
                     * [EmployerContribution].
                     *
                     * The following fields are required:
                     * ```java
                     * .currency()
                     * .name()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [EmployerContribution]. */
                class Builder internal constructor() {

                    private var currency: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var type: JsonField<BenefitType>? = null
                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var attributes: JsonField<Attributes> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(employerContribution: EmployerContribution) = apply {
                        currency = employerContribution.currency
                        name = employerContribution.name
                        type = employerContribution.type
                        amount = employerContribution.amount
                        attributes = employerContribution.attributes
                        additionalProperties =
                            employerContribution.additionalProperties.toMutableMap()
                    }

                    /** The contribution currency. */
                    fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

                    /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
                    fun currency(currency: Optional<String>) = currency(currency.getOrNull())

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    /** The contribution name from the pay statement. */
                    fun name(name: String?) = name(JsonField.ofNullable(name))

                    /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                    fun name(name: Optional<String>) = name(name.getOrNull())

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<BenefitType>) = apply { this.type = type }

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
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * You should usually call [Builder.attributes] with a well-typed [Attributes]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun attributes(attributes: JsonField<Attributes>) = apply {
                        this.attributes = attributes
                    }

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
                     *
                     * The following fields are required:
                     * ```java
                     * .currency()
                     * .name()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): EmployerContribution =
                        EmployerContribution(
                            checkRequired("currency", currency),
                            checkRequired("name", name),
                            checkRequired("type", type),
                            amount,
                            attributes,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): EmployerContribution = apply {
                    if (validated) {
                        return@apply
                    }

                    currency()
                    name()
                    type().ifPresent { it.validate() }
                    amount()
                    attributes().ifPresent { it.validate() }
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
                    (if (currency.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (amount.asKnown().isPresent) 1 else 0) +
                        (attributes.asKnown().getOrNull()?.validity() ?: 0)

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
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun metadata(): Metadata = metadata.getRequired("metadata")

                    /**
                     * Returns the raw JSON value of [metadata].
                     *
                     * Unlike [metadata], this method doesn't throw if the JSON field has an
                     * unexpected type.
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

                        /**
                         * Returns a mutable builder for constructing an instance of [Attributes].
                         *
                         * The following fields are required:
                         * ```java
                         * .metadata()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Attributes]. */
                    class Builder internal constructor() {

                        private var metadata: JsonField<Metadata>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(attributes: Attributes) = apply {
                            metadata = attributes.metadata
                            additionalProperties = attributes.additionalProperties.toMutableMap()
                        }

                        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                        /**
                         * Sets [Builder.metadata] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.metadata] with a well-typed [Metadata]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun metadata(metadata: JsonField<Metadata>) = apply {
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
                         * Returns an immutable instance of [Attributes].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .metadata()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Attributes =
                            Attributes(
                                checkRequired("metadata", metadata),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Attributes = apply {
                        if (validated) {
                            return@apply
                        }

                        metadata().validate()
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
                         * key-value pairs where the values can be of any type (string, number,
                         * boolean, object, array, etc.).
                         *
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun metadata(): InnerMetadata = metadata.getRequired("metadata")

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

                            /**
                             * Returns a mutable builder for constructing an instance of [Metadata].
                             *
                             * The following fields are required:
                             * ```java
                             * .metadata()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Metadata]. */
                        class Builder internal constructor() {

                            private var metadata: JsonField<InnerMetadata>? = null
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
                             * [InnerMetadata] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
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
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .metadata()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Metadata =
                                Metadata(
                                    checkRequired("metadata", metadata),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Metadata = apply {
                            if (validated) {
                                return@apply
                            }

                            metadata().validate()
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
                            (metadata.asKnown().getOrNull()?.validity() ?: 0)

                        /**
                         * The metadata to be attached to the entity by existing rules. It is a
                         * key-value pairs where the values can be of any type (string, number,
                         * boolean, object, array, etc.).
                         */
                        class InnerMetadata
                        @JsonCreator
                        private constructor(
                            @com.fasterxml.jackson.annotation.JsonValue
                            private val additionalProperties: Map<String, JsonValue>
                        ) {

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

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

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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

                    return /* spotless:off */ other is EmployerContribution && currency == other.currency && name == other.name && type == other.type && amount == other.amount && attributes == other.attributes && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(currency, name, type, amount, attributes, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "EmployerContribution{currency=$currency, name=$name, type=$type, amount=$amount, attributes=$attributes, additionalProperties=$additionalProperties}"
            }

            /** The payment method. */
            class PaymentMethod
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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
                 * An enum containing [PaymentMethod]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [PaymentMethod] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CHECK,
                    DIRECT_DEPOSIT,
                    OTHER,
                    /**
                     * An enum member indicating that [PaymentMethod] was instantiated with an
                     * unknown value.
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
                 * @throws FinchInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                private val currency: JsonField<String>,
                private val employer: JsonField<Boolean>,
                private val name: JsonField<String>,
                private val type: JsonField<Type>,
                private val amount: JsonField<Long>,
                private val attributes: JsonField<Attributes>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("employer")
                    @ExcludeMissing
                    employer: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("attributes")
                    @ExcludeMissing
                    attributes: JsonField<Attributes> = JsonMissing.of(),
                ) : this(currency, employer, name, type, amount, attributes, mutableMapOf())

                /**
                 * The currency code.
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun currency(): Optional<String> = currency.getOptional("currency")

                /**
                 * `true` if the amount is paid by the employers.
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun employer(): Optional<Boolean> = employer.getOptional("employer")

                /**
                 * The exact name of tax from the pay statement.
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * The type of taxes.
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun type(): Optional<Type> = type.getOptional("type")

                /**
                 * The tax amount in cents.
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun amount(): Optional<Long> = amount.getOptional("amount")

                /**
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun attributes(): Optional<Attributes> = attributes.getOptional("attributes")

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                /**
                 * Returns the raw JSON value of [employer].
                 *
                 * Unlike [employer], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("employer")
                @ExcludeMissing
                fun _employer(): JsonField<Boolean> = employer

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [attributes].
                 *
                 * Unlike [attributes], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("attributes")
                @ExcludeMissing
                fun _attributes(): JsonField<Attributes> = attributes

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
                     * Returns a mutable builder for constructing an instance of [Tax].
                     *
                     * The following fields are required:
                     * ```java
                     * .currency()
                     * .employer()
                     * .name()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Tax]. */
                class Builder internal constructor() {

                    private var currency: JsonField<String>? = null
                    private var employer: JsonField<Boolean>? = null
                    private var name: JsonField<String>? = null
                    private var type: JsonField<Type>? = null
                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var attributes: JsonField<Attributes> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tax: Tax) = apply {
                        currency = tax.currency
                        employer = tax.employer
                        name = tax.name
                        type = tax.type
                        amount = tax.amount
                        attributes = tax.attributes
                        additionalProperties = tax.additionalProperties.toMutableMap()
                    }

                    /** The currency code. */
                    fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

                    /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
                    fun currency(currency: Optional<String>) = currency(currency.getOrNull())

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun employer(employer: JsonField<Boolean>) = apply { this.employer = employer }

                    /** The exact name of tax from the pay statement. */
                    fun name(name: String?) = name(JsonField.ofNullable(name))

                    /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                    fun name(name: Optional<String>) = name(name.getOrNull())

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /** The type of taxes. */
                    fun type(type: Type?) = type(JsonField.ofNullable(type))

                    /** Alias for calling [Builder.type] with `type.orElse(null)`. */
                    fun type(type: Optional<Type>) = type(type.getOrNull())

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

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
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * You should usually call [Builder.attributes] with a well-typed [Attributes]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun attributes(attributes: JsonField<Attributes>) = apply {
                        this.attributes = attributes
                    }

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
                     *
                     * The following fields are required:
                     * ```java
                     * .currency()
                     * .employer()
                     * .name()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Tax =
                        Tax(
                            checkRequired("currency", currency),
                            checkRequired("employer", employer),
                            checkRequired("name", name),
                            checkRequired("type", type),
                            amount,
                            attributes,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Tax = apply {
                    if (validated) {
                        return@apply
                    }

                    currency()
                    employer()
                    name()
                    type().ifPresent { it.validate() }
                    amount()
                    attributes().ifPresent { it.validate() }
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
                    (if (currency.asKnown().isPresent) 1 else 0) +
                        (if (employer.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (amount.asKnown().isPresent) 1 else 0) +
                        (attributes.asKnown().getOrNull()?.validity() ?: 0)

                /** The type of taxes. */
                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        STATE,
                        FEDERAL,
                        LOCAL,
                        FICA,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws FinchInvalidDataException if this class instance's value is a not a
                     *   known member.
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
                     * @throws FinchInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

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
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun metadata(): Metadata = metadata.getRequired("metadata")

                    /**
                     * Returns the raw JSON value of [metadata].
                     *
                     * Unlike [metadata], this method doesn't throw if the JSON field has an
                     * unexpected type.
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

                        /**
                         * Returns a mutable builder for constructing an instance of [Attributes].
                         *
                         * The following fields are required:
                         * ```java
                         * .metadata()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Attributes]. */
                    class Builder internal constructor() {

                        private var metadata: JsonField<Metadata>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(attributes: Attributes) = apply {
                            metadata = attributes.metadata
                            additionalProperties = attributes.additionalProperties.toMutableMap()
                        }

                        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                        /**
                         * Sets [Builder.metadata] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.metadata] with a well-typed [Metadata]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun metadata(metadata: JsonField<Metadata>) = apply {
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
                         * Returns an immutable instance of [Attributes].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .metadata()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Attributes =
                            Attributes(
                                checkRequired("metadata", metadata),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Attributes = apply {
                        if (validated) {
                            return@apply
                        }

                        metadata().validate()
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
                         * key-value pairs where the values can be of any type (string, number,
                         * boolean, object, array, etc.).
                         *
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun metadata(): InnerMetadata = metadata.getRequired("metadata")

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

                            /**
                             * Returns a mutable builder for constructing an instance of [Metadata].
                             *
                             * The following fields are required:
                             * ```java
                             * .metadata()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Metadata]. */
                        class Builder internal constructor() {

                            private var metadata: JsonField<InnerMetadata>? = null
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
                             * [InnerMetadata] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
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
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .metadata()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Metadata =
                                Metadata(
                                    checkRequired("metadata", metadata),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Metadata = apply {
                            if (validated) {
                                return@apply
                            }

                            metadata().validate()
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
                            (metadata.asKnown().getOrNull()?.validity() ?: 0)

                        /**
                         * The metadata to be attached to the entity by existing rules. It is a
                         * key-value pairs where the values can be of any type (string, number,
                         * boolean, object, array, etc.).
                         */
                        class InnerMetadata
                        @JsonCreator
                        private constructor(
                            @com.fasterxml.jackson.annotation.JsonValue
                            private val additionalProperties: Map<String, JsonValue>
                        ) {

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

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

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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

                    return /* spotless:off */ other is Tax && currency == other.currency && employer == other.employer && name == other.name && type == other.type && amount == other.amount && attributes == other.attributes && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(currency, employer, name, type, amount, attributes, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tax{currency=$currency, employer=$employer, name=$name, type=$type, amount=$amount, attributes=$attributes, additionalProperties=$additionalProperties}"
            }

            /** The type of the payment associated with the pay statement. */
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

                    @JvmField val OFF_CYCLE_PAYROLL = of("off_cycle_payroll")

                    @JvmField val ONE_TIME_PAYMENT = of("one_time_payment")

                    @JvmField val REGULAR_PAYROLL = of("regular_payroll")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    OFF_CYCLE_PAYROLL,
                    ONE_TIME_PAYMENT,
                    REGULAR_PAYROLL,
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
                    OFF_CYCLE_PAYROLL,
                    ONE_TIME_PAYMENT,
                    REGULAR_PAYROLL,
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
                        OFF_CYCLE_PAYROLL -> Value.OFF_CYCLE_PAYROLL
                        ONE_TIME_PAYMENT -> Value.ONE_TIME_PAYMENT
                        REGULAR_PAYROLL -> Value.REGULAR_PAYROLL
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
                        OFF_CYCLE_PAYROLL -> Known.OFF_CYCLE_PAYROLL
                        ONE_TIME_PAYMENT -> Known.ONE_TIME_PAYMENT
                        REGULAR_PAYROLL -> Known.REGULAR_PAYROLL
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

            return /* spotless:off */ other is UnionMember0 && paging == other.paging && payStatements == other.payStatements && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(paging, payStatements, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember0{paging=$paging, payStatements=$payStatements, additionalProperties=$additionalProperties}"
    }

    class BatchError
    private constructor(
        private val code: JsonField<Double>,
        private val message: JsonField<String>,
        private val name: JsonField<String>,
        private val finchCode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("finch_code")
            @ExcludeMissing
            finchCode: JsonField<String> = JsonMissing.of(),
        ) : this(code, message, name, finchCode, mutableMapOf())

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun code(): Double = code.getRequired("code")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun message(): String = message.getRequired("message")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun finchCode(): Optional<String> = finchCode.getOptional("finch_code")

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Double> = code

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [finchCode].
         *
         * Unlike [finchCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("finch_code") @ExcludeMissing fun _finchCode(): JsonField<String> = finchCode

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
             * Returns a mutable builder for constructing an instance of [BatchError].
             *
             * The following fields are required:
             * ```java
             * .code()
             * .message()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BatchError]. */
        class Builder internal constructor() {

            private var code: JsonField<Double>? = null
            private var message: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var finchCode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(batchError: BatchError) = apply {
                code = batchError.code
                message = batchError.message
                name = batchError.name
                finchCode = batchError.finchCode
                additionalProperties = batchError.additionalProperties.toMutableMap()
            }

            fun code(code: Double) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<Double>) = apply { this.code = code }

            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun finchCode(finchCode: String) = finchCode(JsonField.of(finchCode))

            /**
             * Sets [Builder.finchCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.finchCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun finchCode(finchCode: JsonField<String>) = apply { this.finchCode = finchCode }

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
             * Returns an immutable instance of [BatchError].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .code()
             * .message()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BatchError =
                BatchError(
                    checkRequired("code", code),
                    checkRequired("message", message),
                    checkRequired("name", name),
                    finchCode,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BatchError = apply {
            if (validated) {
                return@apply
            }

            code()
            message()
            name()
            finchCode()
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
            (if (code.asKnown().isPresent) 1 else 0) +
                (if (message.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (finchCode.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BatchError && code == other.code && message == other.message && name == other.name && finchCode == other.finchCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(code, message, name, finchCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BatchError{code=$code, message=$message, name=$name, finchCode=$finchCode, additionalProperties=$additionalProperties}"
    }

    class UnionMember2
    private constructor(
        private val code: JsonField<Code>,
        private val finchCode: JsonField<FinchCode>,
        private val message: JsonField<Message>,
        private val name: JsonField<Name>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<Code> = JsonMissing.of(),
            @JsonProperty("finch_code")
            @ExcludeMissing
            finchCode: JsonField<FinchCode> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<Message> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<Name> = JsonMissing.of(),
        ) : this(code, finchCode, message, name, mutableMapOf())

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun code(): Code = code.getRequired("code")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun finchCode(): FinchCode = finchCode.getRequired("finch_code")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun message(): Message = message.getRequired("message")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): Name = name.getRequired("name")

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Code> = code

        /**
         * Returns the raw JSON value of [finchCode].
         *
         * Unlike [finchCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("finch_code")
        @ExcludeMissing
        fun _finchCode(): JsonField<FinchCode> = finchCode

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<Message> = message

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<Name> = name

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
             * Returns a mutable builder for constructing an instance of [UnionMember2].
             *
             * The following fields are required:
             * ```java
             * .code()
             * .finchCode()
             * .message()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember2]. */
        class Builder internal constructor() {

            private var code: JsonField<Code>? = null
            private var finchCode: JsonField<FinchCode>? = null
            private var message: JsonField<Message>? = null
            private var name: JsonField<Name>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember2: UnionMember2) = apply {
                code = unionMember2.code
                finchCode = unionMember2.finchCode
                message = unionMember2.message
                name = unionMember2.name
                additionalProperties = unionMember2.additionalProperties.toMutableMap()
            }

            fun code(code: Code) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [Code] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<Code>) = apply { this.code = code }

            fun finchCode(finchCode: FinchCode) = finchCode(JsonField.of(finchCode))

            /**
             * Sets [Builder.finchCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.finchCode] with a well-typed [FinchCode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun finchCode(finchCode: JsonField<FinchCode>) = apply { this.finchCode = finchCode }

            fun message(message: Message) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [Message] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<Message>) = apply { this.message = message }

            fun name(name: Name) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [Name] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<Name>) = apply { this.name = name }

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
             * Returns an immutable instance of [UnionMember2].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .code()
             * .finchCode()
             * .message()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UnionMember2 =
                UnionMember2(
                    checkRequired("code", code),
                    checkRequired("finchCode", finchCode),
                    checkRequired("message", message),
                    checkRequired("name", name),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UnionMember2 = apply {
            if (validated) {
                return@apply
            }

            code().validate()
            finchCode().validate()
            message().validate()
            name().validate()
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
            (code.asKnown().getOrNull()?.validity() ?: 0) +
                (finchCode.asKnown().getOrNull()?.validity() ?: 0) +
                (message.asKnown().getOrNull()?.validity() ?: 0) +
                (name.asKnown().getOrNull()?.validity() ?: 0)

        class Code @JsonCreator private constructor(private val value: JsonField<Double>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Double> = value

            companion object {

                @JvmField val _202 = of(202.0)

                @JvmStatic fun of(value: Double) = Code(JsonField.of(value))
            }

            /** An enum containing [Code]'s known values. */
            enum class Known {
                _202
            }

            /**
             * An enum containing [Code]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Code] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                _202,
                /** An enum member indicating that [Code] was instantiated with an unknown value. */
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
                    _202 -> Value._202
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
                    _202 -> Known._202
                    else -> throw FinchInvalidDataException("Unknown Code: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * @throws FinchInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asDouble(): Double =
                _value().asNumber().getOrNull()?.toDouble()
                    ?: throw FinchInvalidDataException("Value is not a Double")

            private var validated: Boolean = false

            fun validate(): Code = apply {
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

                return /* spotless:off */ other is Code && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class FinchCode @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val DATA_SYNC_IN_PROGRESS = of("data_sync_in_progress")

                @JvmStatic fun of(value: String) = FinchCode(JsonField.of(value))
            }

            /** An enum containing [FinchCode]'s known values. */
            enum class Known {
                DATA_SYNC_IN_PROGRESS
            }

            /**
             * An enum containing [FinchCode]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [FinchCode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DATA_SYNC_IN_PROGRESS,
                /**
                 * An enum member indicating that [FinchCode] was instantiated with an unknown
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
                    DATA_SYNC_IN_PROGRESS -> Value.DATA_SYNC_IN_PROGRESS
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
                    DATA_SYNC_IN_PROGRESS -> Known.DATA_SYNC_IN_PROGRESS
                    else -> throw FinchInvalidDataException("Unknown FinchCode: $value")
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

            fun validate(): FinchCode = apply {
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

                return /* spotless:off */ other is FinchCode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Message @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField
                val THE_PAY_STATEMENTS_FOR_THIS_PAYMENT_ARE_BEING_FETCHED_PLEASE_CHECK_BACK_LATER =
                    of(
                        "The pay statements for this payment are being fetched. Please check back later."
                    )

                @JvmStatic fun of(value: String) = Message(JsonField.of(value))
            }

            /** An enum containing [Message]'s known values. */
            enum class Known {
                THE_PAY_STATEMENTS_FOR_THIS_PAYMENT_ARE_BEING_FETCHED_PLEASE_CHECK_BACK_LATER
            }

            /**
             * An enum containing [Message]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Message] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                THE_PAY_STATEMENTS_FOR_THIS_PAYMENT_ARE_BEING_FETCHED_PLEASE_CHECK_BACK_LATER,
                /**
                 * An enum member indicating that [Message] was instantiated with an unknown value.
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
                    THE_PAY_STATEMENTS_FOR_THIS_PAYMENT_ARE_BEING_FETCHED_PLEASE_CHECK_BACK_LATER ->
                        Value
                            .THE_PAY_STATEMENTS_FOR_THIS_PAYMENT_ARE_BEING_FETCHED_PLEASE_CHECK_BACK_LATER
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
                    THE_PAY_STATEMENTS_FOR_THIS_PAYMENT_ARE_BEING_FETCHED_PLEASE_CHECK_BACK_LATER ->
                        Known
                            .THE_PAY_STATEMENTS_FOR_THIS_PAYMENT_ARE_BEING_FETCHED_PLEASE_CHECK_BACK_LATER
                    else -> throw FinchInvalidDataException("Unknown Message: $value")
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

            fun validate(): Message = apply {
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

                return /* spotless:off */ other is Message && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Name @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val ACCEPTED = of("accepted")

                @JvmStatic fun of(value: String) = Name(JsonField.of(value))
            }

            /** An enum containing [Name]'s known values. */
            enum class Known {
                ACCEPTED
            }

            /**
             * An enum containing [Name]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Name] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACCEPTED,
                /** An enum member indicating that [Name] was instantiated with an unknown value. */
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
                    ACCEPTED -> Value.ACCEPTED
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
                    ACCEPTED -> Known.ACCEPTED
                    else -> throw FinchInvalidDataException("Unknown Name: $value")
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

            fun validate(): Name = apply {
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

                return /* spotless:off */ other is Name && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UnionMember2 && code == other.code && finchCode == other.finchCode && message == other.message && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(code, finchCode, message, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember2{code=$code, finchCode=$finchCode, message=$message, name=$name, additionalProperties=$additionalProperties}"
    }
}

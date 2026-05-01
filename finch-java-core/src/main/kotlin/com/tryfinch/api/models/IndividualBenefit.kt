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

class IndividualBenefit
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val body: JsonField<Body>,
    private val code: JsonField<Long>,
    private val individualId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("body") @ExcludeMissing body: JsonField<Body> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("individual_id")
        @ExcludeMissing
        individualId: JsonField<String> = JsonMissing.of(),
    ) : this(body, code, individualId, mutableMapOf())

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun body(): Body = body.getRequired("body")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): Long = code.getRequired("code")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun individualId(): String = individualId.getRequired("individual_id")

    /**
     * Returns the raw JSON value of [body].
     *
     * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<Body> = body

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Long> = code

    /**
     * Returns the raw JSON value of [individualId].
     *
     * Unlike [individualId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("individual_id")
    @ExcludeMissing
    fun _individualId(): JsonField<String> = individualId

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
         * Returns a mutable builder for constructing an instance of [IndividualBenefit].
         *
         * The following fields are required:
         * ```java
         * .body()
         * .code()
         * .individualId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IndividualBenefit]. */
    class Builder internal constructor() {

        private var body: JsonField<Body>? = null
        private var code: JsonField<Long>? = null
        private var individualId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(individualBenefit: IndividualBenefit) = apply {
            body = individualBenefit.body
            code = individualBenefit.code
            individualId = individualBenefit.individualId
            additionalProperties = individualBenefit.additionalProperties.toMutableMap()
        }

        fun body(body: Body) = body(JsonField.of(body))

        /**
         * Sets [Builder.body] to an arbitrary JSON value.
         *
         * You should usually call [Builder.body] with a well-typed [Body] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun body(body: JsonField<Body>) = apply { this.body = body }

        /** Alias for calling [body] with `Body.ofIndividualBenefit(individualBenefit)`. */
        fun body(individualBenefit: Body.InnerIndividualBenefit) =
            body(Body.ofIndividualBenefit(individualBenefit))

        /** Alias for calling [body] with `Body.ofBatchError(batchError)`. */
        fun body(batchError: Body.BatchError) = body(Body.ofBatchError(batchError))

        fun code(code: Long) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun individualId(individualId: String) = individualId(JsonField.of(individualId))

        /**
         * Sets [Builder.individualId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.individualId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun individualId(individualId: JsonField<String>) = apply {
            this.individualId = individualId
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
         * Returns an immutable instance of [IndividualBenefit].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .body()
         * .code()
         * .individualId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IndividualBenefit =
            IndividualBenefit(
                checkRequired("body", body),
                checkRequired("code", code),
                checkRequired("individualId", individualId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IndividualBenefit = apply {
        if (validated) {
            return@apply
        }

        body().validate()
        code()
        individualId()
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
        (body.asKnown().getOrNull()?.validity() ?: 0) +
            (if (code.asKnown().isPresent) 1 else 0) +
            (if (individualId.asKnown().isPresent) 1 else 0)

    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val individualBenefit: InnerIndividualBenefit? = null,
        private val batchError: BatchError? = null,
        private val _json: JsonValue? = null,
    ) {

        fun individualBenefit(): Optional<InnerIndividualBenefit> =
            Optional.ofNullable(individualBenefit)

        fun batchError(): Optional<BatchError> = Optional.ofNullable(batchError)

        fun isIndividualBenefit(): Boolean = individualBenefit != null

        fun isBatchError(): Boolean = batchError != null

        fun asIndividualBenefit(): InnerIndividualBenefit =
            individualBenefit.getOrThrow("individualBenefit")

        fun asBatchError(): BatchError = batchError.getOrThrow("batchError")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                individualBenefit != null -> visitor.visitIndividualBenefit(individualBenefit)
                batchError != null -> visitor.visitBatchError(batchError)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitIndividualBenefit(individualBenefit: InnerIndividualBenefit) {
                        individualBenefit.validate()
                    }

                    override fun visitBatchError(batchError: BatchError) {
                        batchError.validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitIndividualBenefit(individualBenefit: InnerIndividualBenefit) =
                        individualBenefit.validity()

                    override fun visitBatchError(batchError: BatchError) = batchError.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                individualBenefit == other.individualBenefit &&
                batchError == other.batchError
        }

        override fun hashCode(): Int = Objects.hash(individualBenefit, batchError)

        override fun toString(): String =
            when {
                individualBenefit != null -> "Body{individualBenefit=$individualBenefit}"
                batchError != null -> "Body{batchError=$batchError}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            @JvmStatic
            fun ofIndividualBenefit(individualBenefit: InnerIndividualBenefit) =
                Body(individualBenefit = individualBenefit)

            @JvmStatic fun ofBatchError(batchError: BatchError) = Body(batchError = batchError)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitIndividualBenefit(individualBenefit: InnerIndividualBenefit): T

            fun visitBatchError(batchError: BatchError): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws FinchInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw FinchInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<InnerIndividualBenefit>())?.let {
                                Body(individualBenefit = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<BatchError>())?.let {
                                Body(batchError = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Body(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.individualBenefit != null ->
                        generator.writeObject(value.individualBenefit)
                    value.batchError != null -> generator.writeObject(value.batchError)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        class InnerIndividualBenefit
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val annualMaximum: JsonField<Long>,
            private val catchUp: JsonField<Boolean>,
            private val companyContribution: JsonField<CompanyContribution>,
            private val employeeDeduction: JsonField<EmployeeDeduction>,
            private val hsaContributionLimit: JsonField<HsaContributionLimit>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("annual_maximum")
                @ExcludeMissing
                annualMaximum: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("catch_up")
                @ExcludeMissing
                catchUp: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("company_contribution")
                @ExcludeMissing
                companyContribution: JsonField<CompanyContribution> = JsonMissing.of(),
                @JsonProperty("employee_deduction")
                @ExcludeMissing
                employeeDeduction: JsonField<EmployeeDeduction> = JsonMissing.of(),
                @JsonProperty("hsa_contribution_limit")
                @ExcludeMissing
                hsaContributionLimit: JsonField<HsaContributionLimit> = JsonMissing.of(),
            ) : this(
                annualMaximum,
                catchUp,
                companyContribution,
                employeeDeduction,
                hsaContributionLimit,
                mutableMapOf(),
            )

            /**
             * If the benefit supports annual maximum, the amount in cents for this individual.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun annualMaximum(): Optional<Long> = annualMaximum.getOptional("annual_maximum")

            /**
             * If the benefit supports catch up (401k, 403b, etc.), whether catch up is enabled for
             * this individual.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun catchUp(): Optional<Boolean> = catchUp.getOptional("catch_up")

            /**
             * Company contribution configuration. Supports fixed amounts (in cents),
             * percentage-based contributions (in basis points where 100 = 1%), or tiered matching
             * structures.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun companyContribution(): Optional<CompanyContribution> =
                companyContribution.getOptional("company_contribution")

            /**
             * Employee deduction configuration. Supports both fixed amounts (in cents) and
             * percentage-based contributions (in basis points where 100 = 1%).
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun employeeDeduction(): Optional<EmployeeDeduction> =
                employeeDeduction.getOptional("employee_deduction")

            /**
             * Type for HSA contribution limit if the benefit is a HSA.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hsaContributionLimit(): Optional<HsaContributionLimit> =
                hsaContributionLimit.getOptional("hsa_contribution_limit")

            /**
             * Returns the raw JSON value of [annualMaximum].
             *
             * Unlike [annualMaximum], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("annual_maximum")
            @ExcludeMissing
            fun _annualMaximum(): JsonField<Long> = annualMaximum

            /**
             * Returns the raw JSON value of [catchUp].
             *
             * Unlike [catchUp], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("catch_up") @ExcludeMissing fun _catchUp(): JsonField<Boolean> = catchUp

            /**
             * Returns the raw JSON value of [companyContribution].
             *
             * Unlike [companyContribution], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("company_contribution")
            @ExcludeMissing
            fun _companyContribution(): JsonField<CompanyContribution> = companyContribution

            /**
             * Returns the raw JSON value of [employeeDeduction].
             *
             * Unlike [employeeDeduction], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("employee_deduction")
            @ExcludeMissing
            fun _employeeDeduction(): JsonField<EmployeeDeduction> = employeeDeduction

            /**
             * Returns the raw JSON value of [hsaContributionLimit].
             *
             * Unlike [hsaContributionLimit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("hsa_contribution_limit")
            @ExcludeMissing
            fun _hsaContributionLimit(): JsonField<HsaContributionLimit> = hsaContributionLimit

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
                 * [InnerIndividualBenefit].
                 *
                 * The following fields are required:
                 * ```java
                 * .annualMaximum()
                 * .catchUp()
                 * .companyContribution()
                 * .employeeDeduction()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InnerIndividualBenefit]. */
            class Builder internal constructor() {

                private var annualMaximum: JsonField<Long>? = null
                private var catchUp: JsonField<Boolean>? = null
                private var companyContribution: JsonField<CompanyContribution>? = null
                private var employeeDeduction: JsonField<EmployeeDeduction>? = null
                private var hsaContributionLimit: JsonField<HsaContributionLimit> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(innerIndividualBenefit: InnerIndividualBenefit) = apply {
                    annualMaximum = innerIndividualBenefit.annualMaximum
                    catchUp = innerIndividualBenefit.catchUp
                    companyContribution = innerIndividualBenefit.companyContribution
                    employeeDeduction = innerIndividualBenefit.employeeDeduction
                    hsaContributionLimit = innerIndividualBenefit.hsaContributionLimit
                    additionalProperties =
                        innerIndividualBenefit.additionalProperties.toMutableMap()
                }

                /**
                 * If the benefit supports annual maximum, the amount in cents for this individual.
                 */
                fun annualMaximum(annualMaximum: Long?) =
                    annualMaximum(JsonField.ofNullable(annualMaximum))

                /**
                 * Alias for [Builder.annualMaximum].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun annualMaximum(annualMaximum: Long) = annualMaximum(annualMaximum as Long?)

                /** Alias for calling [Builder.annualMaximum] with `annualMaximum.orElse(null)`. */
                fun annualMaximum(annualMaximum: Optional<Long>) =
                    annualMaximum(annualMaximum.getOrNull())

                /**
                 * Sets [Builder.annualMaximum] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.annualMaximum] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun annualMaximum(annualMaximum: JsonField<Long>) = apply {
                    this.annualMaximum = annualMaximum
                }

                /**
                 * If the benefit supports catch up (401k, 403b, etc.), whether catch up is enabled
                 * for this individual.
                 */
                fun catchUp(catchUp: Boolean?) = catchUp(JsonField.ofNullable(catchUp))

                /**
                 * Alias for [Builder.catchUp].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun catchUp(catchUp: Boolean) = catchUp(catchUp as Boolean?)

                /** Alias for calling [Builder.catchUp] with `catchUp.orElse(null)`. */
                fun catchUp(catchUp: Optional<Boolean>) = catchUp(catchUp.getOrNull())

                /**
                 * Sets [Builder.catchUp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.catchUp] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun catchUp(catchUp: JsonField<Boolean>) = apply { this.catchUp = catchUp }

                /**
                 * Company contribution configuration. Supports fixed amounts (in cents),
                 * percentage-based contributions (in basis points where 100 = 1%), or tiered
                 * matching structures.
                 */
                fun companyContribution(companyContribution: CompanyContribution?) =
                    companyContribution(JsonField.ofNullable(companyContribution))

                /**
                 * Alias for calling [Builder.companyContribution] with
                 * `companyContribution.orElse(null)`.
                 */
                fun companyContribution(companyContribution: Optional<CompanyContribution>) =
                    companyContribution(companyContribution.getOrNull())

                /**
                 * Sets [Builder.companyContribution] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.companyContribution] with a well-typed
                 * [CompanyContribution] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun companyContribution(companyContribution: JsonField<CompanyContribution>) =
                    apply {
                        this.companyContribution = companyContribution
                    }

                /**
                 * Alias for calling [companyContribution] with
                 * `CompanyContribution.ofFixed(fixed)`.
                 */
                fun companyContribution(fixed: CompanyContribution.CompanyContributionFixed) =
                    companyContribution(CompanyContribution.ofFixed(fixed))

                /**
                 * Alias for calling [companyContribution] with
                 * `CompanyContribution.ofPercent(percent)`.
                 */
                fun companyContribution(percent: CompanyContribution.CompanyContributionPercent) =
                    companyContribution(CompanyContribution.ofPercent(percent))

                /**
                 * Alias for calling [companyContribution] with
                 * `CompanyContribution.ofTiered(tiered)`.
                 */
                fun companyContribution(tiered: CompanyContribution.CompanyContributionTiered) =
                    companyContribution(CompanyContribution.ofTiered(tiered))

                /**
                 * Employee deduction configuration. Supports both fixed amounts (in cents) and
                 * percentage-based contributions (in basis points where 100 = 1%).
                 */
                fun employeeDeduction(employeeDeduction: EmployeeDeduction?) =
                    employeeDeduction(JsonField.ofNullable(employeeDeduction))

                /**
                 * Alias for calling [Builder.employeeDeduction] with
                 * `employeeDeduction.orElse(null)`.
                 */
                fun employeeDeduction(employeeDeduction: Optional<EmployeeDeduction>) =
                    employeeDeduction(employeeDeduction.getOrNull())

                /**
                 * Sets [Builder.employeeDeduction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.employeeDeduction] with a well-typed
                 * [EmployeeDeduction] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun employeeDeduction(employeeDeduction: JsonField<EmployeeDeduction>) = apply {
                    this.employeeDeduction = employeeDeduction
                }

                /**
                 * Alias for calling [employeeDeduction] with
                 * `EmployeeDeduction.ofContributionFixed(contributionFixed)`.
                 */
                fun employeeDeduction(
                    contributionFixed: EmployeeDeduction.EmployeeDeductionContributionFixed
                ) = employeeDeduction(EmployeeDeduction.ofContributionFixed(contributionFixed))

                /**
                 * Alias for calling [employeeDeduction] with
                 * `EmployeeDeduction.ofContributionPercent(contributionPercent)`.
                 */
                fun employeeDeduction(
                    contributionPercent: EmployeeDeduction.EmployeeDeductionContributionPercent
                ) = employeeDeduction(EmployeeDeduction.ofContributionPercent(contributionPercent))

                /** Type for HSA contribution limit if the benefit is a HSA. */
                fun hsaContributionLimit(hsaContributionLimit: HsaContributionLimit?) =
                    hsaContributionLimit(JsonField.ofNullable(hsaContributionLimit))

                /**
                 * Alias for calling [Builder.hsaContributionLimit] with
                 * `hsaContributionLimit.orElse(null)`.
                 */
                fun hsaContributionLimit(hsaContributionLimit: Optional<HsaContributionLimit>) =
                    hsaContributionLimit(hsaContributionLimit.getOrNull())

                /**
                 * Sets [Builder.hsaContributionLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hsaContributionLimit] with a well-typed
                 * [HsaContributionLimit] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun hsaContributionLimit(hsaContributionLimit: JsonField<HsaContributionLimit>) =
                    apply {
                        this.hsaContributionLimit = hsaContributionLimit
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
                 * Returns an immutable instance of [InnerIndividualBenefit].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .annualMaximum()
                 * .catchUp()
                 * .companyContribution()
                 * .employeeDeduction()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InnerIndividualBenefit =
                    InnerIndividualBenefit(
                        checkRequired("annualMaximum", annualMaximum),
                        checkRequired("catchUp", catchUp),
                        checkRequired("companyContribution", companyContribution),
                        checkRequired("employeeDeduction", employeeDeduction),
                        hsaContributionLimit,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): InnerIndividualBenefit = apply {
                if (validated) {
                    return@apply
                }

                annualMaximum()
                catchUp()
                companyContribution().ifPresent { it.validate() }
                employeeDeduction().ifPresent { it.validate() }
                hsaContributionLimit().ifPresent { it.validate() }
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
                (if (annualMaximum.asKnown().isPresent) 1 else 0) +
                    (if (catchUp.asKnown().isPresent) 1 else 0) +
                    (companyContribution.asKnown().getOrNull()?.validity() ?: 0) +
                    (employeeDeduction.asKnown().getOrNull()?.validity() ?: 0) +
                    (hsaContributionLimit.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * Company contribution configuration. Supports fixed amounts (in cents),
             * percentage-based contributions (in basis points where 100 = 1%), or tiered matching
             * structures.
             */
            @JsonDeserialize(using = CompanyContribution.Deserializer::class)
            @JsonSerialize(using = CompanyContribution.Serializer::class)
            class CompanyContribution
            private constructor(
                private val fixed: CompanyContributionFixed? = null,
                private val percent: CompanyContributionPercent? = null,
                private val tiered: CompanyContributionTiered? = null,
                private val _json: JsonValue? = null,
            ) {

                fun fixed(): Optional<CompanyContributionFixed> = Optional.ofNullable(fixed)

                fun percent(): Optional<CompanyContributionPercent> = Optional.ofNullable(percent)

                fun tiered(): Optional<CompanyContributionTiered> = Optional.ofNullable(tiered)

                fun isFixed(): Boolean = fixed != null

                fun isPercent(): Boolean = percent != null

                fun isTiered(): Boolean = tiered != null

                fun asFixed(): CompanyContributionFixed = fixed.getOrThrow("fixed")

                fun asPercent(): CompanyContributionPercent = percent.getOrThrow("percent")

                fun asTiered(): CompanyContributionTiered = tiered.getOrThrow("tiered")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        fixed != null -> visitor.visitFixed(fixed)
                        percent != null -> visitor.visitPercent(percent)
                        tiered != null -> visitor.visitTiered(tiered)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): CompanyContribution = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitFixed(fixed: CompanyContributionFixed) {
                                fixed.validate()
                            }

                            override fun visitPercent(percent: CompanyContributionPercent) {
                                percent.validate()
                            }

                            override fun visitTiered(tiered: CompanyContributionTiered) {
                                tiered.validate()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitFixed(fixed: CompanyContributionFixed) =
                                fixed.validity()

                            override fun visitPercent(percent: CompanyContributionPercent) =
                                percent.validity()

                            override fun visitTiered(tiered: CompanyContributionTiered) =
                                tiered.validity()

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CompanyContribution &&
                        fixed == other.fixed &&
                        percent == other.percent &&
                        tiered == other.tiered
                }

                override fun hashCode(): Int = Objects.hash(fixed, percent, tiered)

                override fun toString(): String =
                    when {
                        fixed != null -> "CompanyContribution{fixed=$fixed}"
                        percent != null -> "CompanyContribution{percent=$percent}"
                        tiered != null -> "CompanyContribution{tiered=$tiered}"
                        _json != null -> "CompanyContribution{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid CompanyContribution")
                    }

                companion object {

                    @JvmStatic
                    fun ofFixed(fixed: CompanyContributionFixed) =
                        CompanyContribution(fixed = fixed)

                    @JvmStatic
                    fun ofPercent(percent: CompanyContributionPercent) =
                        CompanyContribution(percent = percent)

                    @JvmStatic
                    fun ofTiered(tiered: CompanyContributionTiered) =
                        CompanyContribution(tiered = tiered)
                }

                /**
                 * An interface that defines how to map each variant of [CompanyContribution] to a
                 * value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitFixed(fixed: CompanyContributionFixed): T

                    fun visitPercent(percent: CompanyContributionPercent): T

                    fun visitTiered(tiered: CompanyContributionTiered): T

                    /**
                     * Maps an unknown variant of [CompanyContribution] to a value of type [T].
                     *
                     * An instance of [CompanyContribution] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws FinchInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw FinchInvalidDataException("Unknown CompanyContribution: $json")
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<CompanyContribution>(CompanyContribution::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): CompanyContribution {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<CompanyContributionFixed>())
                                        ?.let { CompanyContribution(fixed = it, _json = json) },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<CompanyContributionPercent>(),
                                        )
                                        ?.let { CompanyContribution(percent = it, _json = json) },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<CompanyContributionTiered>(),
                                        )
                                        ?.let { CompanyContribution(tiered = it, _json = json) },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> CompanyContribution(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<CompanyContribution>(CompanyContribution::class) {

                    override fun serialize(
                        value: CompanyContribution,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.fixed != null -> generator.writeObject(value.fixed)
                            value.percent != null -> generator.writeObject(value.percent)
                            value.tiered != null -> generator.writeObject(value.tiered)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid CompanyContribution")
                        }
                    }
                }

                class CompanyContributionFixed
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val amount: JsonField<Long>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("amount")
                        @ExcludeMissing
                        amount: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                    ) : this(amount, type, mutableMapOf())

                    /**
                     * Contribution amount in cents (for type=fixed) or basis points (for
                     * type=percent, where 100 = 1%). Not used for type=tiered.
                     *
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * Contribution type. Supported values: "fixed" (amount in cents), "percent"
                     * (amount in basis points), or "tiered" (multi-tier matching).
                     *
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * Returns the raw JSON value of [amount].
                     *
                     * Unlike [amount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                         * Returns a mutable builder for constructing an instance of
                         * [CompanyContributionFixed].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CompanyContributionFixed]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Long>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(companyContributionFixed: CompanyContributionFixed) =
                            apply {
                                amount = companyContributionFixed.amount
                                type = companyContributionFixed.type
                                additionalProperties =
                                    companyContributionFixed.additionalProperties.toMutableMap()
                            }

                        /**
                         * Contribution amount in cents (for type=fixed) or basis points (for
                         * type=percent, where 100 = 1%). Not used for type=tiered.
                         */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /**
                         * Contribution type. Supported values: "fixed" (amount in cents), "percent"
                         * (amount in basis points), or "tiered" (multi-tier matching).
                         */
                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

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
                         * Returns an immutable instance of [CompanyContributionFixed].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): CompanyContributionFixed =
                            CompanyContributionFixed(
                                checkRequired("amount", amount),
                                checkRequired("type", type),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): CompanyContributionFixed = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        type().validate()
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
                            (type.asKnown().getOrNull()?.validity() ?: 0)

                    /**
                     * Contribution type. Supported values: "fixed" (amount in cents), "percent"
                     * (amount in basis points), or "tiered" (multi-tier matching).
                     */
                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val FIXED = of("fixed")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            FIXED
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            FIXED,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                FIXED -> Value.FIXED
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws FinchInvalidDataException if this class instance's value is a not
                         *   a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                FIXED -> Known.FIXED
                                else -> throw FinchInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CompanyContributionFixed &&
                            amount == other.amount &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CompanyContributionFixed{amount=$amount, type=$type, additionalProperties=$additionalProperties}"
                }

                class CompanyContributionPercent
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val amount: JsonField<Long>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("amount")
                        @ExcludeMissing
                        amount: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                    ) : this(amount, type, mutableMapOf())

                    /**
                     * Contribution amount in cents (for type=fixed) or basis points (for
                     * type=percent, where 100 = 1%). Not used for type=tiered.
                     *
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * Contribution type. Supported values: "fixed" (amount in cents), "percent"
                     * (amount in basis points), or "tiered" (multi-tier matching).
                     *
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * Returns the raw JSON value of [amount].
                     *
                     * Unlike [amount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                         * Returns a mutable builder for constructing an instance of
                         * [CompanyContributionPercent].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CompanyContributionPercent]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Long>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(companyContributionPercent: CompanyContributionPercent) =
                            apply {
                                amount = companyContributionPercent.amount
                                type = companyContributionPercent.type
                                additionalProperties =
                                    companyContributionPercent.additionalProperties.toMutableMap()
                            }

                        /**
                         * Contribution amount in cents (for type=fixed) or basis points (for
                         * type=percent, where 100 = 1%). Not used for type=tiered.
                         */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /**
                         * Contribution type. Supported values: "fixed" (amount in cents), "percent"
                         * (amount in basis points), or "tiered" (multi-tier matching).
                         */
                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

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
                         * Returns an immutable instance of [CompanyContributionPercent].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): CompanyContributionPercent =
                            CompanyContributionPercent(
                                checkRequired("amount", amount),
                                checkRequired("type", type),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): CompanyContributionPercent = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        type().validate()
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
                            (type.asKnown().getOrNull()?.validity() ?: 0)

                    /**
                     * Contribution type. Supported values: "fixed" (amount in cents), "percent"
                     * (amount in basis points), or "tiered" (multi-tier matching).
                     */
                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PERCENT = of("percent")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            PERCENT
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PERCENT,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PERCENT -> Value.PERCENT
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws FinchInvalidDataException if this class instance's value is a not
                         *   a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PERCENT -> Known.PERCENT
                                else -> throw FinchInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CompanyContributionPercent &&
                            amount == other.amount &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CompanyContributionPercent{amount=$amount, type=$type, additionalProperties=$additionalProperties}"
                }

                class CompanyContributionTiered
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val tiers: JsonField<List<Tier>>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("tiers")
                        @ExcludeMissing
                        tiers: JsonField<List<Tier>> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                    ) : this(tiers, type, mutableMapOf())

                    /**
                     * Array of tier objects defining employer match tiers based on employee
                     * contribution thresholds. Required when type=tiered.
                     *
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun tiers(): List<Tier> = tiers.getRequired("tiers")

                    /**
                     * Contribution type. Supported values: "fixed" (amount in cents), "percent"
                     * (amount in basis points), or "tiered" (multi-tier matching).
                     *
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * Returns the raw JSON value of [tiers].
                     *
                     * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("tiers")
                    @ExcludeMissing
                    fun _tiers(): JsonField<List<Tier>> = tiers

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                         * Returns a mutable builder for constructing an instance of
                         * [CompanyContributionTiered].
                         *
                         * The following fields are required:
                         * ```java
                         * .tiers()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CompanyContributionTiered]. */
                    class Builder internal constructor() {

                        private var tiers: JsonField<MutableList<Tier>>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(companyContributionTiered: CompanyContributionTiered) =
                            apply {
                                tiers = companyContributionTiered.tiers.map { it.toMutableList() }
                                type = companyContributionTiered.type
                                additionalProperties =
                                    companyContributionTiered.additionalProperties.toMutableMap()
                            }

                        /**
                         * Array of tier objects defining employer match tiers based on employee
                         * contribution thresholds. Required when type=tiered.
                         */
                        fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                        /**
                         * Sets [Builder.tiers] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.tiers] with a well-typed `List<Tier>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun tiers(tiers: JsonField<List<Tier>>) = apply {
                            this.tiers = tiers.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Tier] to [tiers].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addTier(tier: Tier) = apply {
                            tiers =
                                (tiers ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("tiers", it).add(tier)
                                }
                        }

                        /**
                         * Contribution type. Supported values: "fixed" (amount in cents), "percent"
                         * (amount in basis points), or "tiered" (multi-tier matching).
                         */
                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

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
                         * Returns an immutable instance of [CompanyContributionTiered].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .tiers()
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): CompanyContributionTiered =
                            CompanyContributionTiered(
                                checkRequired("tiers", tiers).map { it.toImmutable() },
                                checkRequired("type", type),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): CompanyContributionTiered = apply {
                        if (validated) {
                            return@apply
                        }

                        tiers().forEach { it.validate() }
                        type().validate()
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
                        (tiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                            (type.asKnown().getOrNull()?.validity() ?: 0)

                    class Tier
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val match: JsonField<Long>,
                        private val threshold: JsonField<Long>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("match")
                            @ExcludeMissing
                            match: JsonField<Long> = JsonMissing.of(),
                            @JsonProperty("threshold")
                            @ExcludeMissing
                            threshold: JsonField<Long> = JsonMissing.of(),
                        ) : this(match, threshold, mutableMapOf())

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun match(): Long = match.getRequired("match")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun threshold(): Long = threshold.getRequired("threshold")

                        /**
                         * Returns the raw JSON value of [match].
                         *
                         * Unlike [match], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("match") @ExcludeMissing fun _match(): JsonField<Long> = match

                        /**
                         * Returns the raw JSON value of [threshold].
                         *
                         * Unlike [threshold], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("threshold")
                        @ExcludeMissing
                        fun _threshold(): JsonField<Long> = threshold

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
                             * Returns a mutable builder for constructing an instance of [Tier].
                             *
                             * The following fields are required:
                             * ```java
                             * .match()
                             * .threshold()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Tier]. */
                        class Builder internal constructor() {

                            private var match: JsonField<Long>? = null
                            private var threshold: JsonField<Long>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(tier: Tier) = apply {
                                match = tier.match
                                threshold = tier.threshold
                                additionalProperties = tier.additionalProperties.toMutableMap()
                            }

                            fun match(match: Long) = match(JsonField.of(match))

                            /**
                             * Sets [Builder.match] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.match] with a well-typed [Long]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun match(match: JsonField<Long>) = apply { this.match = match }

                            fun threshold(threshold: Long) = threshold(JsonField.of(threshold))

                            /**
                             * Sets [Builder.threshold] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.threshold] with a well-typed [Long]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun threshold(threshold: JsonField<Long>) = apply {
                                this.threshold = threshold
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
                             * Returns an immutable instance of [Tier].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .match()
                             * .threshold()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Tier =
                                Tier(
                                    checkRequired("match", match),
                                    checkRequired("threshold", threshold),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Tier = apply {
                            if (validated) {
                                return@apply
                            }

                            match()
                            threshold()
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
                            (if (match.asKnown().isPresent) 1 else 0) +
                                (if (threshold.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Tier &&
                                match == other.match &&
                                threshold == other.threshold &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(match, threshold, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Tier{match=$match, threshold=$threshold, additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Contribution type. Supported values: "fixed" (amount in cents), "percent"
                     * (amount in basis points), or "tiered" (multi-tier matching).
                     */
                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val TIERED = of("tiered")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            TIERED
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            TIERED,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                TIERED -> Value.TIERED
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws FinchInvalidDataException if this class instance's value is a not
                         *   a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                TIERED -> Known.TIERED
                                else -> throw FinchInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CompanyContributionTiered &&
                            tiers == other.tiers &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(tiers, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CompanyContributionTiered{tiers=$tiers, type=$type, additionalProperties=$additionalProperties}"
                }
            }

            /**
             * Employee deduction configuration. Supports both fixed amounts (in cents) and
             * percentage-based contributions (in basis points where 100 = 1%).
             */
            @JsonDeserialize(using = EmployeeDeduction.Deserializer::class)
            @JsonSerialize(using = EmployeeDeduction.Serializer::class)
            class EmployeeDeduction
            private constructor(
                private val contributionFixed: EmployeeDeductionContributionFixed? = null,
                private val contributionPercent: EmployeeDeductionContributionPercent? = null,
                private val _json: JsonValue? = null,
            ) {

                fun contributionFixed(): Optional<EmployeeDeductionContributionFixed> =
                    Optional.ofNullable(contributionFixed)

                fun contributionPercent(): Optional<EmployeeDeductionContributionPercent> =
                    Optional.ofNullable(contributionPercent)

                fun isContributionFixed(): Boolean = contributionFixed != null

                fun isContributionPercent(): Boolean = contributionPercent != null

                fun asContributionFixed(): EmployeeDeductionContributionFixed =
                    contributionFixed.getOrThrow("contributionFixed")

                fun asContributionPercent(): EmployeeDeductionContributionPercent =
                    contributionPercent.getOrThrow("contributionPercent")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        contributionFixed != null ->
                            visitor.visitContributionFixed(contributionFixed)
                        contributionPercent != null ->
                            visitor.visitContributionPercent(contributionPercent)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): EmployeeDeduction = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitContributionFixed(
                                contributionFixed: EmployeeDeductionContributionFixed
                            ) {
                                contributionFixed.validate()
                            }

                            override fun visitContributionPercent(
                                contributionPercent: EmployeeDeductionContributionPercent
                            ) {
                                contributionPercent.validate()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitContributionFixed(
                                contributionFixed: EmployeeDeductionContributionFixed
                            ) = contributionFixed.validity()

                            override fun visitContributionPercent(
                                contributionPercent: EmployeeDeductionContributionPercent
                            ) = contributionPercent.validity()

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is EmployeeDeduction &&
                        contributionFixed == other.contributionFixed &&
                        contributionPercent == other.contributionPercent
                }

                override fun hashCode(): Int = Objects.hash(contributionFixed, contributionPercent)

                override fun toString(): String =
                    when {
                        contributionFixed != null ->
                            "EmployeeDeduction{contributionFixed=$contributionFixed}"
                        contributionPercent != null ->
                            "EmployeeDeduction{contributionPercent=$contributionPercent}"
                        _json != null -> "EmployeeDeduction{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid EmployeeDeduction")
                    }

                companion object {

                    @JvmStatic
                    fun ofContributionFixed(contributionFixed: EmployeeDeductionContributionFixed) =
                        EmployeeDeduction(contributionFixed = contributionFixed)

                    @JvmStatic
                    fun ofContributionPercent(
                        contributionPercent: EmployeeDeductionContributionPercent
                    ) = EmployeeDeduction(contributionPercent = contributionPercent)
                }

                /**
                 * An interface that defines how to map each variant of [EmployeeDeduction] to a
                 * value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitContributionFixed(
                        contributionFixed: EmployeeDeductionContributionFixed
                    ): T

                    fun visitContributionPercent(
                        contributionPercent: EmployeeDeductionContributionPercent
                    ): T

                    /**
                     * Maps an unknown variant of [EmployeeDeduction] to a value of type [T].
                     *
                     * An instance of [EmployeeDeduction] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws FinchInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw FinchInvalidDataException("Unknown EmployeeDeduction: $json")
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<EmployeeDeduction>(EmployeeDeduction::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): EmployeeDeduction {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<EmployeeDeductionContributionFixed>(),
                                        )
                                        ?.let {
                                            EmployeeDeduction(contributionFixed = it, _json = json)
                                        },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<EmployeeDeductionContributionPercent>(),
                                        )
                                        ?.let {
                                            EmployeeDeduction(
                                                contributionPercent = it,
                                                _json = json,
                                            )
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> EmployeeDeduction(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<EmployeeDeduction>(EmployeeDeduction::class) {

                    override fun serialize(
                        value: EmployeeDeduction,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.contributionFixed != null ->
                                generator.writeObject(value.contributionFixed)
                            value.contributionPercent != null ->
                                generator.writeObject(value.contributionPercent)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid EmployeeDeduction")
                        }
                    }
                }

                class EmployeeDeductionContributionFixed
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val amount: JsonField<Long>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("amount")
                        @ExcludeMissing
                        amount: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                    ) : this(amount, type, mutableMapOf())

                    /**
                     * Contribution amount in cents (for type=fixed) or basis points (for
                     * type=percent, where 100 = 1%).
                     *
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * Contribution type. Supported values: "fixed" (amount in cents) or "percent"
                     * (amount in basis points).
                     *
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * Returns the raw JSON value of [amount].
                     *
                     * Unlike [amount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                         * Returns a mutable builder for constructing an instance of
                         * [EmployeeDeductionContributionFixed].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [EmployeeDeductionContributionFixed]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Long>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(
                            employeeDeductionContributionFixed: EmployeeDeductionContributionFixed
                        ) = apply {
                            amount = employeeDeductionContributionFixed.amount
                            type = employeeDeductionContributionFixed.type
                            additionalProperties =
                                employeeDeductionContributionFixed.additionalProperties
                                    .toMutableMap()
                        }

                        /**
                         * Contribution amount in cents (for type=fixed) or basis points (for
                         * type=percent, where 100 = 1%).
                         */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /**
                         * Contribution type. Supported values: "fixed" (amount in cents) or
                         * "percent" (amount in basis points).
                         */
                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

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
                         * Returns an immutable instance of [EmployeeDeductionContributionFixed].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): EmployeeDeductionContributionFixed =
                            EmployeeDeductionContributionFixed(
                                checkRequired("amount", amount),
                                checkRequired("type", type),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): EmployeeDeductionContributionFixed = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        type().validate()
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
                            (type.asKnown().getOrNull()?.validity() ?: 0)

                    /**
                     * Contribution type. Supported values: "fixed" (amount in cents) or "percent"
                     * (amount in basis points).
                     */
                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val FIXED = of("fixed")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            FIXED
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            FIXED,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                FIXED -> Value.FIXED
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws FinchInvalidDataException if this class instance's value is a not
                         *   a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                FIXED -> Known.FIXED
                                else -> throw FinchInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is EmployeeDeductionContributionFixed &&
                            amount == other.amount &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "EmployeeDeductionContributionFixed{amount=$amount, type=$type, additionalProperties=$additionalProperties}"
                }

                class EmployeeDeductionContributionPercent
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val amount: JsonField<Long>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("amount")
                        @ExcludeMissing
                        amount: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                    ) : this(amount, type, mutableMapOf())

                    /**
                     * Contribution amount in cents (for type=fixed) or basis points (for
                     * type=percent, where 100 = 1%).
                     *
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * Contribution type. Supported values: "fixed" (amount in cents) or "percent"
                     * (amount in basis points).
                     *
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * Returns the raw JSON value of [amount].
                     *
                     * Unlike [amount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                         * Returns a mutable builder for constructing an instance of
                         * [EmployeeDeductionContributionPercent].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [EmployeeDeductionContributionPercent]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Long>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(
                            employeeDeductionContributionPercent:
                                EmployeeDeductionContributionPercent
                        ) = apply {
                            amount = employeeDeductionContributionPercent.amount
                            type = employeeDeductionContributionPercent.type
                            additionalProperties =
                                employeeDeductionContributionPercent.additionalProperties
                                    .toMutableMap()
                        }

                        /**
                         * Contribution amount in cents (for type=fixed) or basis points (for
                         * type=percent, where 100 = 1%).
                         */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /**
                         * Contribution type. Supported values: "fixed" (amount in cents) or
                         * "percent" (amount in basis points).
                         */
                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

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
                         * Returns an immutable instance of [EmployeeDeductionContributionPercent].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): EmployeeDeductionContributionPercent =
                            EmployeeDeductionContributionPercent(
                                checkRequired("amount", amount),
                                checkRequired("type", type),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): EmployeeDeductionContributionPercent = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        type().validate()
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
                            (type.asKnown().getOrNull()?.validity() ?: 0)

                    /**
                     * Contribution type. Supported values: "fixed" (amount in cents) or "percent"
                     * (amount in basis points).
                     */
                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PERCENT = of("percent")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            PERCENT
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PERCENT,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PERCENT -> Value.PERCENT
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws FinchInvalidDataException if this class instance's value is a not
                         *   a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PERCENT -> Known.PERCENT
                                else -> throw FinchInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is EmployeeDeductionContributionPercent &&
                            amount == other.amount &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "EmployeeDeductionContributionPercent{amount=$amount, type=$type, additionalProperties=$additionalProperties}"
                }
            }

            /** Type for HSA contribution limit if the benefit is a HSA. */
            class HsaContributionLimit
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

                    @JvmField val INDIVIDUAL = of("individual")

                    @JvmField val FAMILY = of("family")

                    @JvmStatic fun of(value: String) = HsaContributionLimit(JsonField.of(value))
                }

                /** An enum containing [HsaContributionLimit]'s known values. */
                enum class Known {
                    INDIVIDUAL,
                    FAMILY,
                }

                /**
                 * An enum containing [HsaContributionLimit]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [HsaContributionLimit] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INDIVIDUAL,
                    FAMILY,
                    /**
                     * An enum member indicating that [HsaContributionLimit] was instantiated with
                     * an unknown value.
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
                        INDIVIDUAL -> Value.INDIVIDUAL
                        FAMILY -> Value.FAMILY
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
                        INDIVIDUAL -> Known.INDIVIDUAL
                        FAMILY -> Known.FAMILY
                        else ->
                            throw FinchInvalidDataException("Unknown HsaContributionLimit: $value")
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

                fun validate(): HsaContributionLimit = apply {
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

                    return other is HsaContributionLimit && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InnerIndividualBenefit &&
                    annualMaximum == other.annualMaximum &&
                    catchUp == other.catchUp &&
                    companyContribution == other.companyContribution &&
                    employeeDeduction == other.employeeDeduction &&
                    hsaContributionLimit == other.hsaContributionLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    annualMaximum,
                    catchUp,
                    companyContribution,
                    employeeDeduction,
                    hsaContributionLimit,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InnerIndividualBenefit{annualMaximum=$annualMaximum, catchUp=$catchUp, companyContribution=$companyContribution, employeeDeduction=$employeeDeduction, hsaContributionLimit=$hsaContributionLimit, additionalProperties=$additionalProperties}"
        }

        class BatchError
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("finch_code")
                @ExcludeMissing
                finchCode: JsonField<String> = JsonMissing.of(),
            ) : this(code, message, name, finchCode, mutableMapOf())

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun code(): Double = code.getRequired("code")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun message(): String = message.getRequired("message")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             * Unlike [finchCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("finch_code")
            @ExcludeMissing
            fun _finchCode(): JsonField<String> = finchCode

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
                 * You should usually call [Builder.code] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun code(code: JsonField<Double>) = apply { this.code = code }

                fun message(message: String) = message(JsonField.of(message))

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<String>) = apply { this.message = message }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun finchCode(finchCode: String) = finchCode(JsonField.of(finchCode))

                /**
                 * Sets [Builder.finchCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.finchCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun finchCode(finchCode: JsonField<String>) = apply { this.finchCode = finchCode }

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

                return other is BatchError &&
                    code == other.code &&
                    message == other.message &&
                    name == other.name &&
                    finchCode == other.finchCode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(code, message, name, finchCode, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BatchError{code=$code, message=$message, name=$name, finchCode=$finchCode, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IndividualBenefit &&
            body == other.body &&
            code == other.code &&
            individualId == other.individualId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(body, code, individualId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IndividualBenefit{body=$body, code=$code, individualId=$individualId, additionalProperties=$additionalProperties}"
}

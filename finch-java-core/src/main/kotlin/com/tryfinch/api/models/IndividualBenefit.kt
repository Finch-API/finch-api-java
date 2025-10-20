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

        /** Alias for calling [body] with `Body.ofUnionMember0(unionMember0)`. */
        fun body(unionMember0: Body.UnionMember0) = body(Body.ofUnionMember0(unionMember0))

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
        private val unionMember0: UnionMember0? = null,
        private val batchError: BatchError? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

        fun batchError(): Optional<BatchError> = Optional.ofNullable(batchError)

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isBatchError(): Boolean = batchError != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asBatchError(): BatchError = batchError.getOrThrow("batchError")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
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
                    override fun visitUnionMember0(unionMember0: UnionMember0) {
                        unionMember0.validate()
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
                    override fun visitUnionMember0(unionMember0: UnionMember0) =
                        unionMember0.validity()

                    override fun visitBatchError(batchError: BatchError) = batchError.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                unionMember0 == other.unionMember0 &&
                batchError == other.batchError
        }

        override fun hashCode(): Int = Objects.hash(unionMember0, batchError)

        override fun toString(): String =
            when {
                unionMember0 != null -> "Body{unionMember0=$unionMember0}"
                batchError != null -> "Body{batchError=$batchError}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            @JvmStatic
            fun ofUnionMember0(unionMember0: UnionMember0) = Body(unionMember0 = unionMember0)

            @JvmStatic fun ofBatchError(batchError: BatchError) = Body(batchError = batchError)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

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
                            tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                Body(unionMember0 = it, _json = json)
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
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.batchError != null -> generator.writeObject(value.batchError)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        class UnionMember0
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
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun companyContribution(): Optional<CompanyContribution> =
                companyContribution.getOptional("company_contribution")

            /**
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
                 * Returns a mutable builder for constructing an instance of [UnionMember0].
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

            /** A builder for [UnionMember0]. */
            class Builder internal constructor() {

                private var annualMaximum: JsonField<Long>? = null
                private var catchUp: JsonField<Boolean>? = null
                private var companyContribution: JsonField<CompanyContribution>? = null
                private var employeeDeduction: JsonField<EmployeeDeduction>? = null
                private var hsaContributionLimit: JsonField<HsaContributionLimit> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember0: UnionMember0) = apply {
                    annualMaximum = unionMember0.annualMaximum
                    catchUp = unionMember0.catchUp
                    companyContribution = unionMember0.companyContribution
                    employeeDeduction = unionMember0.employeeDeduction
                    hsaContributionLimit = unionMember0.hsaContributionLimit
                    additionalProperties = unionMember0.additionalProperties.toMutableMap()
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
                 * `CompanyContribution.ofInnerUnionMember0(innerUnionMember0)`.
                 */
                fun companyContribution(innerUnionMember0: CompanyContribution.InnerUnionMember0) =
                    companyContribution(CompanyContribution.ofInnerUnionMember0(innerUnionMember0))

                /**
                 * Alias for calling [companyContribution] with
                 * `CompanyContribution.ofUnionMember1(unionMember1)`.
                 */
                fun companyContribution(unionMember1: CompanyContribution.UnionMember1) =
                    companyContribution(CompanyContribution.ofUnionMember1(unionMember1))

                /**
                 * Alias for calling [companyContribution] with
                 * `CompanyContribution.ofUnionMember2(unionMember2)`.
                 */
                fun companyContribution(unionMember2: CompanyContribution.UnionMember2) =
                    companyContribution(CompanyContribution.ofUnionMember2(unionMember2))

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
                 * `EmployeeDeduction.ofInnerUnionMember0(innerUnionMember0)`.
                 */
                fun employeeDeduction(innerUnionMember0: EmployeeDeduction.InnerUnionMember0) =
                    employeeDeduction(EmployeeDeduction.ofInnerUnionMember0(innerUnionMember0))

                /**
                 * Alias for calling [employeeDeduction] with
                 * `EmployeeDeduction.ofUnionMember1(unionMember1)`.
                 */
                fun employeeDeduction(unionMember1: EmployeeDeduction.UnionMember1) =
                    employeeDeduction(EmployeeDeduction.ofUnionMember1(unionMember1))

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
                 * Returns an immutable instance of [UnionMember0].
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
                fun build(): UnionMember0 =
                    UnionMember0(
                        checkRequired("annualMaximum", annualMaximum),
                        checkRequired("catchUp", catchUp),
                        checkRequired("companyContribution", companyContribution),
                        checkRequired("employeeDeduction", employeeDeduction),
                        hsaContributionLimit,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UnionMember0 = apply {
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

            @JsonDeserialize(using = CompanyContribution.Deserializer::class)
            @JsonSerialize(using = CompanyContribution.Serializer::class)
            class CompanyContribution
            private constructor(
                private val innerUnionMember0: InnerUnionMember0? = null,
                private val unionMember1: UnionMember1? = null,
                private val unionMember2: UnionMember2? = null,
                private val _json: JsonValue? = null,
            ) {

                fun innerUnionMember0(): Optional<InnerUnionMember0> =
                    Optional.ofNullable(innerUnionMember0)

                fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

                fun unionMember2(): Optional<UnionMember2> = Optional.ofNullable(unionMember2)

                fun isInnerUnionMember0(): Boolean = innerUnionMember0 != null

                fun isUnionMember1(): Boolean = unionMember1 != null

                fun isUnionMember2(): Boolean = unionMember2 != null

                fun asInnerUnionMember0(): InnerUnionMember0 =
                    innerUnionMember0.getOrThrow("innerUnionMember0")

                fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

                fun asUnionMember2(): UnionMember2 = unionMember2.getOrThrow("unionMember2")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        innerUnionMember0 != null ->
                            visitor.visitInnerUnionMember0(innerUnionMember0)
                        unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                        unionMember2 != null -> visitor.visitUnionMember2(unionMember2)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): CompanyContribution = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInnerUnionMember0(
                                innerUnionMember0: InnerUnionMember0
                            ) {
                                innerUnionMember0.validate()
                            }

                            override fun visitUnionMember1(unionMember1: UnionMember1) {
                                unionMember1.validate()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitInnerUnionMember0(
                                innerUnionMember0: InnerUnionMember0
                            ) = innerUnionMember0.validity()

                            override fun visitUnionMember1(unionMember1: UnionMember1) =
                                unionMember1.validity()

                            override fun visitUnionMember2(unionMember2: UnionMember2) =
                                unionMember2.validity()

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CompanyContribution &&
                        innerUnionMember0 == other.innerUnionMember0 &&
                        unionMember1 == other.unionMember1 &&
                        unionMember2 == other.unionMember2
                }

                override fun hashCode(): Int =
                    Objects.hash(innerUnionMember0, unionMember1, unionMember2)

                override fun toString(): String =
                    when {
                        innerUnionMember0 != null ->
                            "CompanyContribution{innerUnionMember0=$innerUnionMember0}"
                        unionMember1 != null -> "CompanyContribution{unionMember1=$unionMember1}"
                        unionMember2 != null -> "CompanyContribution{unionMember2=$unionMember2}"
                        _json != null -> "CompanyContribution{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid CompanyContribution")
                    }

                companion object {

                    @JvmStatic
                    fun ofInnerUnionMember0(innerUnionMember0: InnerUnionMember0) =
                        CompanyContribution(innerUnionMember0 = innerUnionMember0)

                    @JvmStatic
                    fun ofUnionMember1(unionMember1: UnionMember1) =
                        CompanyContribution(unionMember1 = unionMember1)

                    @JvmStatic
                    fun ofUnionMember2(unionMember2: UnionMember2) =
                        CompanyContribution(unionMember2 = unionMember2)
                }

                /**
                 * An interface that defines how to map each variant of [CompanyContribution] to a
                 * value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInnerUnionMember0(innerUnionMember0: InnerUnionMember0): T

                    fun visitUnionMember1(unionMember1: UnionMember1): T

                    fun visitUnionMember2(unionMember2: UnionMember2): T

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
                                    tryDeserialize(node, jacksonTypeRef<InnerUnionMember0>())?.let {
                                        CompanyContribution(innerUnionMember0 = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                        CompanyContribution(unionMember1 = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<UnionMember2>())?.let {
                                        CompanyContribution(unionMember2 = it, _json = json)
                                    },
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
                            value.innerUnionMember0 != null ->
                                generator.writeObject(value.innerUnionMember0)
                            value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                            value.unionMember2 != null -> generator.writeObject(value.unionMember2)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid CompanyContribution")
                        }
                    }
                }

                class InnerUnionMember0
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
                     * Contribution amount in cents.
                     *
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * Fixed contribution type.
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
                         * [InnerUnionMember0].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [InnerUnionMember0]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Long>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(innerUnionMember0: InnerUnionMember0) = apply {
                            amount = innerUnionMember0.amount
                            type = innerUnionMember0.type
                            additionalProperties =
                                innerUnionMember0.additionalProperties.toMutableMap()
                        }

                        /** Contribution amount in cents. */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /** Fixed contribution type. */
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
                         * Returns an immutable instance of [InnerUnionMember0].
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
                        fun build(): InnerUnionMember0 =
                            InnerUnionMember0(
                                checkRequired("amount", amount),
                                checkRequired("type", type),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): InnerUnionMember0 = apply {
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

                    /** Fixed contribution type. */
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

                        return other is InnerUnionMember0 &&
                            amount == other.amount &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "InnerUnionMember0{amount=$amount, type=$type, additionalProperties=$additionalProperties}"
                }

                class UnionMember1
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
                     * Contribution amount in basis points (1/100th of a percent).
                     *
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * Percentage contribution type.
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
                         * Returns a mutable builder for constructing an instance of [UnionMember1].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [UnionMember1]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Long>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(unionMember1: UnionMember1) = apply {
                            amount = unionMember1.amount
                            type = unionMember1.type
                            additionalProperties = unionMember1.additionalProperties.toMutableMap()
                        }

                        /** Contribution amount in basis points (1/100th of a percent). */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /** Percentage contribution type. */
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
                         * Returns an immutable instance of [UnionMember1].
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
                        fun build(): UnionMember1 =
                            UnionMember1(
                                checkRequired("amount", amount),
                                checkRequired("type", type),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): UnionMember1 = apply {
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

                    /** Percentage contribution type. */
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

                        return other is UnionMember1 &&
                            amount == other.amount &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "UnionMember1{amount=$amount, type=$type, additionalProperties=$additionalProperties}"
                }

                class UnionMember2
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
                     * contribution thresholds.
                     *
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun tiers(): List<Tier> = tiers.getRequired("tiers")

                    /**
                     * Tiered contribution type (only valid for company_contribution).
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
                         * Returns a mutable builder for constructing an instance of [UnionMember2].
                         *
                         * The following fields are required:
                         * ```java
                         * .tiers()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [UnionMember2]. */
                    class Builder internal constructor() {

                        private var tiers: JsonField<MutableList<Tier>>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(unionMember2: UnionMember2) = apply {
                            tiers = unionMember2.tiers.map { it.toMutableList() }
                            type = unionMember2.type
                            additionalProperties = unionMember2.additionalProperties.toMutableMap()
                        }

                        /**
                         * Array of tier objects defining employer match tiers based on employee
                         * contribution thresholds.
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

                        /** Tiered contribution type (only valid for company_contribution). */
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
                         * Returns an immutable instance of [UnionMember2].
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
                        fun build(): UnionMember2 =
                            UnionMember2(
                                checkRequired("tiers", tiers).map { it.toImmutable() },
                                checkRequired("type", type),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): UnionMember2 = apply {
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

                    /** Tiered contribution type (only valid for company_contribution). */
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

                        return other is UnionMember2 &&
                            tiers == other.tiers &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(tiers, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "UnionMember2{tiers=$tiers, type=$type, additionalProperties=$additionalProperties}"
                }
            }

            @JsonDeserialize(using = EmployeeDeduction.Deserializer::class)
            @JsonSerialize(using = EmployeeDeduction.Serializer::class)
            class EmployeeDeduction
            private constructor(
                private val innerUnionMember0: InnerUnionMember0? = null,
                private val unionMember1: UnionMember1? = null,
                private val _json: JsonValue? = null,
            ) {

                fun innerUnionMember0(): Optional<InnerUnionMember0> =
                    Optional.ofNullable(innerUnionMember0)

                fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

                fun isInnerUnionMember0(): Boolean = innerUnionMember0 != null

                fun isUnionMember1(): Boolean = unionMember1 != null

                fun asInnerUnionMember0(): InnerUnionMember0 =
                    innerUnionMember0.getOrThrow("innerUnionMember0")

                fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        innerUnionMember0 != null ->
                            visitor.visitInnerUnionMember0(innerUnionMember0)
                        unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): EmployeeDeduction = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitInnerUnionMember0(
                                innerUnionMember0: InnerUnionMember0
                            ) {
                                innerUnionMember0.validate()
                            }

                            override fun visitUnionMember1(unionMember1: UnionMember1) {
                                unionMember1.validate()
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
                            override fun visitInnerUnionMember0(
                                innerUnionMember0: InnerUnionMember0
                            ) = innerUnionMember0.validity()

                            override fun visitUnionMember1(unionMember1: UnionMember1) =
                                unionMember1.validity()

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is EmployeeDeduction &&
                        innerUnionMember0 == other.innerUnionMember0 &&
                        unionMember1 == other.unionMember1
                }

                override fun hashCode(): Int = Objects.hash(innerUnionMember0, unionMember1)

                override fun toString(): String =
                    when {
                        innerUnionMember0 != null ->
                            "EmployeeDeduction{innerUnionMember0=$innerUnionMember0}"
                        unionMember1 != null -> "EmployeeDeduction{unionMember1=$unionMember1}"
                        _json != null -> "EmployeeDeduction{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid EmployeeDeduction")
                    }

                companion object {

                    @JvmStatic
                    fun ofInnerUnionMember0(innerUnionMember0: InnerUnionMember0) =
                        EmployeeDeduction(innerUnionMember0 = innerUnionMember0)

                    @JvmStatic
                    fun ofUnionMember1(unionMember1: UnionMember1) =
                        EmployeeDeduction(unionMember1 = unionMember1)
                }

                /**
                 * An interface that defines how to map each variant of [EmployeeDeduction] to a
                 * value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitInnerUnionMember0(innerUnionMember0: InnerUnionMember0): T

                    fun visitUnionMember1(unionMember1: UnionMember1): T

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
                                    tryDeserialize(node, jacksonTypeRef<InnerUnionMember0>())?.let {
                                        EmployeeDeduction(innerUnionMember0 = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                        EmployeeDeduction(unionMember1 = it, _json = json)
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
                            value.innerUnionMember0 != null ->
                                generator.writeObject(value.innerUnionMember0)
                            value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid EmployeeDeduction")
                        }
                    }
                }

                class InnerUnionMember0
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
                     * Contribution amount in cents.
                     *
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * Fixed contribution type.
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
                         * [InnerUnionMember0].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [InnerUnionMember0]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Long>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(innerUnionMember0: InnerUnionMember0) = apply {
                            amount = innerUnionMember0.amount
                            type = innerUnionMember0.type
                            additionalProperties =
                                innerUnionMember0.additionalProperties.toMutableMap()
                        }

                        /** Contribution amount in cents. */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /** Fixed contribution type. */
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
                         * Returns an immutable instance of [InnerUnionMember0].
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
                        fun build(): InnerUnionMember0 =
                            InnerUnionMember0(
                                checkRequired("amount", amount),
                                checkRequired("type", type),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): InnerUnionMember0 = apply {
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

                    /** Fixed contribution type. */
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

                        return other is InnerUnionMember0 &&
                            amount == other.amount &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "InnerUnionMember0{amount=$amount, type=$type, additionalProperties=$additionalProperties}"
                }

                class UnionMember1
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
                     * Contribution amount in basis points (1/100th of a percent).
                     *
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * Percentage contribution type.
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
                         * Returns a mutable builder for constructing an instance of [UnionMember1].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [UnionMember1]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Long>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(unionMember1: UnionMember1) = apply {
                            amount = unionMember1.amount
                            type = unionMember1.type
                            additionalProperties = unionMember1.additionalProperties.toMutableMap()
                        }

                        /** Contribution amount in basis points (1/100th of a percent). */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /** Percentage contribution type. */
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
                         * Returns an immutable instance of [UnionMember1].
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
                        fun build(): UnionMember1 =
                            UnionMember1(
                                checkRequired("amount", amount),
                                checkRequired("type", type),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): UnionMember1 = apply {
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

                    /** Percentage contribution type. */
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

                        return other is UnionMember1 &&
                            amount == other.amount &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "UnionMember1{amount=$amount, type=$type, additionalProperties=$additionalProperties}"
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

                return other is UnionMember0 &&
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
                "UnionMember0{annualMaximum=$annualMaximum, catchUp=$catchUp, companyContribution=$companyContribution, employeeDeduction=$employeeDeduction, hsaContributionLimit=$hsaContributionLimit, additionalProperties=$additionalProperties}"
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

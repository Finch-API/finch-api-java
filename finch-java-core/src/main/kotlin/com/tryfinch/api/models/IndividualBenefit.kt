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
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class IndividualBenefit
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
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun body(): Optional<Body> = Optional.ofNullable(body.getNullable("body"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<Long> = Optional.ofNullable(code.getNullable("code"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun individualId(): Optional<String> =
        Optional.ofNullable(individualId.getNullable("individual_id"))

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

        /** Returns a mutable builder for constructing an instance of [IndividualBenefit]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IndividualBenefit]. */
    class Builder internal constructor() {

        private var body: JsonField<Body> = JsonMissing.of()
        private var code: JsonField<Long> = JsonMissing.of()
        private var individualId: JsonField<String> = JsonMissing.of()
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
         */
        fun build(): IndividualBenefit =
            IndividualBenefit(body, code, individualId, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): IndividualBenefit = apply {
        if (validated) {
            return@apply
        }

        body().ifPresent { it.validate() }
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

    class Body
    private constructor(
        private val annualMaximum: JsonField<Long>,
        private val catchUp: JsonField<Boolean>,
        private val companyContribution: JsonField<BenefitContribution>,
        private val employeeDeduction: JsonField<BenefitContribution>,
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
            companyContribution: JsonField<BenefitContribution> = JsonMissing.of(),
            @JsonProperty("employee_deduction")
            @ExcludeMissing
            employeeDeduction: JsonField<BenefitContribution> = JsonMissing.of(),
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
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun annualMaximum(): Optional<Long> =
            Optional.ofNullable(annualMaximum.getNullable("annual_maximum"))

        /**
         * If the benefit supports catch up (401k, 403b, etc.), whether catch up is enabled for this
         * individual.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun catchUp(): Optional<Boolean> = Optional.ofNullable(catchUp.getNullable("catch_up"))

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun companyContribution(): Optional<BenefitContribution> =
            Optional.ofNullable(companyContribution.getNullable("company_contribution"))

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun employeeDeduction(): Optional<BenefitContribution> =
            Optional.ofNullable(employeeDeduction.getNullable("employee_deduction"))

        /**
         * Type for HSA contribution limit if the benefit is a HSA.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hsaContributionLimit(): Optional<HsaContributionLimit> =
            Optional.ofNullable(hsaContributionLimit.getNullable("hsa_contribution_limit"))

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
        fun _companyContribution(): JsonField<BenefitContribution> = companyContribution

        /**
         * Returns the raw JSON value of [employeeDeduction].
         *
         * Unlike [employeeDeduction], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("employee_deduction")
        @ExcludeMissing
        fun _employeeDeduction(): JsonField<BenefitContribution> = employeeDeduction

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var annualMaximum: JsonField<Long> = JsonMissing.of()
            private var catchUp: JsonField<Boolean> = JsonMissing.of()
            private var companyContribution: JsonField<BenefitContribution> = JsonMissing.of()
            private var employeeDeduction: JsonField<BenefitContribution> = JsonMissing.of()
            private var hsaContributionLimit: JsonField<HsaContributionLimit> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                annualMaximum = body.annualMaximum
                catchUp = body.catchUp
                companyContribution = body.companyContribution
                employeeDeduction = body.employeeDeduction
                hsaContributionLimit = body.hsaContributionLimit
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** If the benefit supports annual maximum, the amount in cents for this individual. */
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
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun annualMaximum(annualMaximum: JsonField<Long>) = apply {
                this.annualMaximum = annualMaximum
            }

            /**
             * If the benefit supports catch up (401k, 403b, etc.), whether catch up is enabled for
             * this individual.
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
             * You should usually call [Builder.catchUp] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun catchUp(catchUp: JsonField<Boolean>) = apply { this.catchUp = catchUp }

            fun companyContribution(companyContribution: BenefitContribution?) =
                companyContribution(JsonField.ofNullable(companyContribution))

            /**
             * Alias for calling [Builder.companyContribution] with
             * `companyContribution.orElse(null)`.
             */
            fun companyContribution(companyContribution: Optional<BenefitContribution>) =
                companyContribution(companyContribution.getOrNull())

            /**
             * Sets [Builder.companyContribution] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyContribution] with a well-typed
             * [BenefitContribution] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun companyContribution(companyContribution: JsonField<BenefitContribution>) = apply {
                this.companyContribution = companyContribution
            }

            fun employeeDeduction(employeeDeduction: BenefitContribution?) =
                employeeDeduction(JsonField.ofNullable(employeeDeduction))

            /**
             * Alias for calling [Builder.employeeDeduction] with `employeeDeduction.orElse(null)`.
             */
            fun employeeDeduction(employeeDeduction: Optional<BenefitContribution>) =
                employeeDeduction(employeeDeduction.getOrNull())

            /**
             * Sets [Builder.employeeDeduction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.employeeDeduction] with a well-typed
             * [BenefitContribution] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun employeeDeduction(employeeDeduction: JsonField<BenefitContribution>) = apply {
                this.employeeDeduction = employeeDeduction
            }

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
             * [HsaContributionLimit] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
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
                    annualMaximum,
                    catchUp,
                    companyContribution,
                    employeeDeduction,
                    hsaContributionLimit,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
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

        /** Type for HSA contribution limit if the benefit is a HSA. */
        class HsaContributionLimit
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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
             * An enum containing [HsaContributionLimit]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [HsaContributionLimit] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INDIVIDUAL,
                FAMILY,
                /**
                 * An enum member indicating that [HsaContributionLimit] was instantiated with an
                 * unknown value.
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
                    else -> throw FinchInvalidDataException("Unknown HsaContributionLimit: $value")
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

                return /* spotless:off */ other is HsaContributionLimit && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && annualMaximum == other.annualMaximum && catchUp == other.catchUp && companyContribution == other.companyContribution && employeeDeduction == other.employeeDeduction && hsaContributionLimit == other.hsaContributionLimit && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(annualMaximum, catchUp, companyContribution, employeeDeduction, hsaContributionLimit, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{annualMaximum=$annualMaximum, catchUp=$catchUp, companyContribution=$companyContribution, employeeDeduction=$employeeDeduction, hsaContributionLimit=$hsaContributionLimit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IndividualBenefit && body == other.body && code == other.code && individualId == other.individualId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(body, code, individualId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IndividualBenefit{body=$body, code=$code, individualId=$individualId, additionalProperties=$additionalProperties}"
}

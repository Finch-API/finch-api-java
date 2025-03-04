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
class IndividualBenefit
@JsonCreator
private constructor(
    @JsonProperty("body") @ExcludeMissing private val body: JsonField<Body> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("individual_id")
    @ExcludeMissing
    private val individualId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun body(): Optional<Body> = Optional.ofNullable(body.getNullable("body"))

    fun code(): Optional<Long> = Optional.ofNullable(code.getNullable("code"))

    fun individualId(): Optional<String> =
        Optional.ofNullable(individualId.getNullable("individual_id"))

    @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<Body> = body

    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Long> = code

    @JsonProperty("individual_id")
    @ExcludeMissing
    fun _individualId(): JsonField<String> = individualId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun body(body: JsonField<Body>) = apply { this.body = body }

        fun code(code: Long) = code(JsonField.of(code))

        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun individualId(individualId: String) = individualId(JsonField.of(individualId))

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

        fun build(): IndividualBenefit =
            IndividualBenefit(body, code, individualId, additionalProperties.toImmutable())
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("annual_maximum")
        @ExcludeMissing
        private val annualMaximum: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("catch_up")
        @ExcludeMissing
        private val catchUp: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("company_contribution")
        @ExcludeMissing
        private val companyContribution: JsonField<BenefitContribution> = JsonMissing.of(),
        @JsonProperty("employee_deduction")
        @ExcludeMissing
        private val employeeDeduction: JsonField<BenefitContribution> = JsonMissing.of(),
        @JsonProperty("hsa_contribution_limit")
        @ExcludeMissing
        private val hsaContributionLimit: JsonField<HsaContributionLimit> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** If the benefit supports annual maximum, the amount in cents for this individual. */
        fun annualMaximum(): Optional<Long> =
            Optional.ofNullable(annualMaximum.getNullable("annual_maximum"))

        /**
         * If the benefit supports catch up (401k, 403b, etc.), whether catch up is enabled for this
         * individual.
         */
        fun catchUp(): Optional<Boolean> = Optional.ofNullable(catchUp.getNullable("catch_up"))

        fun companyContribution(): Optional<BenefitContribution> =
            Optional.ofNullable(companyContribution.getNullable("company_contribution"))

        fun employeeDeduction(): Optional<BenefitContribution> =
            Optional.ofNullable(employeeDeduction.getNullable("employee_deduction"))

        /** Type for HSA contribution limit if the benefit is a HSA. */
        fun hsaContributionLimit(): Optional<HsaContributionLimit> =
            Optional.ofNullable(hsaContributionLimit.getNullable("hsa_contribution_limit"))

        /** If the benefit supports annual maximum, the amount in cents for this individual. */
        @JsonProperty("annual_maximum")
        @ExcludeMissing
        fun _annualMaximum(): JsonField<Long> = annualMaximum

        /**
         * If the benefit supports catch up (401k, 403b, etc.), whether catch up is enabled for this
         * individual.
         */
        @JsonProperty("catch_up") @ExcludeMissing fun _catchUp(): JsonField<Boolean> = catchUp

        @JsonProperty("company_contribution")
        @ExcludeMissing
        fun _companyContribution(): JsonField<BenefitContribution> = companyContribution

        @JsonProperty("employee_deduction")
        @ExcludeMissing
        fun _employeeDeduction(): JsonField<BenefitContribution> = employeeDeduction

        /** Type for HSA contribution limit if the benefit is a HSA. */
        @JsonProperty("hsa_contribution_limit")
        @ExcludeMissing
        fun _hsaContributionLimit(): JsonField<HsaContributionLimit> = hsaContributionLimit

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            annualMaximum()
            catchUp()
            companyContribution().ifPresent { it.validate() }
            employeeDeduction().ifPresent { it.validate() }
            hsaContributionLimit()
            validated = true
        }

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

            /** If the benefit supports annual maximum, the amount in cents for this individual. */
            fun annualMaximum(annualMaximum: Long) = annualMaximum(annualMaximum as Long?)

            /** If the benefit supports annual maximum, the amount in cents for this individual. */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun annualMaximum(annualMaximum: Optional<Long>) =
                annualMaximum(annualMaximum.orElse(null) as Long?)

            /** If the benefit supports annual maximum, the amount in cents for this individual. */
            fun annualMaximum(annualMaximum: JsonField<Long>) = apply {
                this.annualMaximum = annualMaximum
            }

            /**
             * If the benefit supports catch up (401k, 403b, etc.), whether catch up is enabled for
             * this individual.
             */
            fun catchUp(catchUp: Boolean?) = catchUp(JsonField.ofNullable(catchUp))

            /**
             * If the benefit supports catch up (401k, 403b, etc.), whether catch up is enabled for
             * this individual.
             */
            fun catchUp(catchUp: Boolean) = catchUp(catchUp as Boolean?)

            /**
             * If the benefit supports catch up (401k, 403b, etc.), whether catch up is enabled for
             * this individual.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun catchUp(catchUp: Optional<Boolean>) = catchUp(catchUp.orElse(null) as Boolean?)

            /**
             * If the benefit supports catch up (401k, 403b, etc.), whether catch up is enabled for
             * this individual.
             */
            fun catchUp(catchUp: JsonField<Boolean>) = apply { this.catchUp = catchUp }

            fun companyContribution(companyContribution: BenefitContribution?) =
                companyContribution(JsonField.ofNullable(companyContribution))

            fun companyContribution(companyContribution: Optional<BenefitContribution>) =
                companyContribution(companyContribution.orElse(null))

            fun companyContribution(companyContribution: JsonField<BenefitContribution>) = apply {
                this.companyContribution = companyContribution
            }

            fun employeeDeduction(employeeDeduction: BenefitContribution?) =
                employeeDeduction(JsonField.ofNullable(employeeDeduction))

            fun employeeDeduction(employeeDeduction: Optional<BenefitContribution>) =
                employeeDeduction(employeeDeduction.orElse(null))

            fun employeeDeduction(employeeDeduction: JsonField<BenefitContribution>) = apply {
                this.employeeDeduction = employeeDeduction
            }

            /** Type for HSA contribution limit if the benefit is a HSA. */
            fun hsaContributionLimit(hsaContributionLimit: HsaContributionLimit?) =
                hsaContributionLimit(JsonField.ofNullable(hsaContributionLimit))

            /** Type for HSA contribution limit if the benefit is a HSA. */
            fun hsaContributionLimit(hsaContributionLimit: Optional<HsaContributionLimit>) =
                hsaContributionLimit(hsaContributionLimit.orElse(null))

            /** Type for HSA contribution limit if the benefit is a HSA. */
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

            fun build(): Body =
                Body(
                    annualMaximum,
                    catchUp,
                    companyContribution,
                    employeeDeduction,
                    hsaContributionLimit,
                    additionalProperties.toImmutable(),
                )
        }

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

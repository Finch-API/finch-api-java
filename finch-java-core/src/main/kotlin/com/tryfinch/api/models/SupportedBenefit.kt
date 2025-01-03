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

@JsonDeserialize(builder = SupportedBenefit.Builder::class)
@NoAutoDetect
class SupportedBenefit
private constructor(
    private val type: JsonField<BenefitType>,
    private val description: JsonField<String>,
    private val frequencies: JsonField<List<BenefitFrequency?>>,
    private val employeeDeduction: JsonField<List<EmployeeDeduction?>>,
    private val companyContribution: JsonField<List<CompanyContribution?>>,
    private val annualMaximum: JsonField<Boolean>,
    private val catchUp: JsonField<Boolean>,
    private val hsaContributionLimit: JsonField<List<HsaContributionLimit?>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Type of benefit. */
    fun type(): Optional<BenefitType> = Optional.ofNullable(type.getNullable("type"))

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** The list of frequencies supported by the provider for this benefit */
    fun frequencies(): Optional<List<BenefitFrequency?>> =
        Optional.ofNullable(frequencies.getNullable("frequencies"))

    /** Supported deduction types. An empty array indicates deductions are not supported. */
    fun employeeDeduction(): Optional<List<EmployeeDeduction?>> =
        Optional.ofNullable(employeeDeduction.getNullable("employee_deduction"))

    /** Supported contribution types. An empty array indicates contributions are not supported. */
    fun companyContribution(): Optional<List<CompanyContribution?>> =
        Optional.ofNullable(companyContribution.getNullable("company_contribution"))

    /** Whether the provider supports an annual maximum for this benefit. */
    fun annualMaximum(): Optional<Boolean> =
        Optional.ofNullable(annualMaximum.getNullable("annual_maximum"))

    /**
     * Whether the provider supports catch up for this benefit. This field will only be true for
     * retirement benefits.
     */
    fun catchUp(): Optional<Boolean> = Optional.ofNullable(catchUp.getNullable("catch_up"))

    /**
     * Whether the provider supports HSA contribution limits. Empty if this feature is not supported
     * for the benefit. This array only has values for HSA benefits.
     */
    fun hsaContributionLimit(): Optional<List<HsaContributionLimit?>> =
        Optional.ofNullable(hsaContributionLimit.getNullable("hsa_contribution_limit"))

    /** Type of benefit. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** The list of frequencies supported by the provider for this benefit */
    @JsonProperty("frequencies") @ExcludeMissing fun _frequencies() = frequencies

    /** Supported deduction types. An empty array indicates deductions are not supported. */
    @JsonProperty("employee_deduction") @ExcludeMissing fun _employeeDeduction() = employeeDeduction

    /** Supported contribution types. An empty array indicates contributions are not supported. */
    @JsonProperty("company_contribution")
    @ExcludeMissing
    fun _companyContribution() = companyContribution

    /** Whether the provider supports an annual maximum for this benefit. */
    @JsonProperty("annual_maximum") @ExcludeMissing fun _annualMaximum() = annualMaximum

    /**
     * Whether the provider supports catch up for this benefit. This field will only be true for
     * retirement benefits.
     */
    @JsonProperty("catch_up") @ExcludeMissing fun _catchUp() = catchUp

    /**
     * Whether the provider supports HSA contribution limits. Empty if this feature is not supported
     * for the benefit. This array only has values for HSA benefits.
     */
    @JsonProperty("hsa_contribution_limit")
    @ExcludeMissing
    fun _hsaContributionLimit() = hsaContributionLimit

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SupportedBenefit = apply {
        if (!validated) {
            type()
            description()
            frequencies()
            employeeDeduction()
            companyContribution()
            annualMaximum()
            catchUp()
            hsaContributionLimit()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var type: JsonField<BenefitType> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var frequencies: JsonField<List<BenefitFrequency?>> = JsonMissing.of()
        private var employeeDeduction: JsonField<List<EmployeeDeduction?>> = JsonMissing.of()
        private var companyContribution: JsonField<List<CompanyContribution?>> = JsonMissing.of()
        private var annualMaximum: JsonField<Boolean> = JsonMissing.of()
        private var catchUp: JsonField<Boolean> = JsonMissing.of()
        private var hsaContributionLimit: JsonField<List<HsaContributionLimit?>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(supportedBenefit: SupportedBenefit) = apply {
            this.type = supportedBenefit.type
            this.description = supportedBenefit.description
            this.frequencies = supportedBenefit.frequencies
            this.employeeDeduction = supportedBenefit.employeeDeduction
            this.companyContribution = supportedBenefit.companyContribution
            this.annualMaximum = supportedBenefit.annualMaximum
            this.catchUp = supportedBenefit.catchUp
            this.hsaContributionLimit = supportedBenefit.hsaContributionLimit
            additionalProperties(supportedBenefit.additionalProperties)
        }

        /** Type of benefit. */
        fun type(type: BenefitType) = type(JsonField.of(type))

        /** Type of benefit. */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<BenefitType>) = apply { this.type = type }

        fun description(description: String) = description(JsonField.of(description))

        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The list of frequencies supported by the provider for this benefit */
        fun frequencies(frequencies: List<BenefitFrequency?>) =
            frequencies(JsonField.of(frequencies))

        /** The list of frequencies supported by the provider for this benefit */
        @JsonProperty("frequencies")
        @ExcludeMissing
        fun frequencies(frequencies: JsonField<List<BenefitFrequency?>>) = apply {
            this.frequencies = frequencies
        }

        /** Supported deduction types. An empty array indicates deductions are not supported. */
        fun employeeDeduction(employeeDeduction: List<EmployeeDeduction?>) =
            employeeDeduction(JsonField.of(employeeDeduction))

        /** Supported deduction types. An empty array indicates deductions are not supported. */
        @JsonProperty("employee_deduction")
        @ExcludeMissing
        fun employeeDeduction(employeeDeduction: JsonField<List<EmployeeDeduction?>>) = apply {
            this.employeeDeduction = employeeDeduction
        }

        /**
         * Supported contribution types. An empty array indicates contributions are not supported.
         */
        fun companyContribution(companyContribution: List<CompanyContribution?>) =
            companyContribution(JsonField.of(companyContribution))

        /**
         * Supported contribution types. An empty array indicates contributions are not supported.
         */
        @JsonProperty("company_contribution")
        @ExcludeMissing
        fun companyContribution(companyContribution: JsonField<List<CompanyContribution?>>) =
            apply {
                this.companyContribution = companyContribution
            }

        /** Whether the provider supports an annual maximum for this benefit. */
        fun annualMaximum(annualMaximum: Boolean) = annualMaximum(JsonField.of(annualMaximum))

        /** Whether the provider supports an annual maximum for this benefit. */
        @JsonProperty("annual_maximum")
        @ExcludeMissing
        fun annualMaximum(annualMaximum: JsonField<Boolean>) = apply {
            this.annualMaximum = annualMaximum
        }

        /**
         * Whether the provider supports catch up for this benefit. This field will only be true for
         * retirement benefits.
         */
        fun catchUp(catchUp: Boolean) = catchUp(JsonField.of(catchUp))

        /**
         * Whether the provider supports catch up for this benefit. This field will only be true for
         * retirement benefits.
         */
        @JsonProperty("catch_up")
        @ExcludeMissing
        fun catchUp(catchUp: JsonField<Boolean>) = apply { this.catchUp = catchUp }

        /**
         * Whether the provider supports HSA contribution limits. Empty if this feature is not
         * supported for the benefit. This array only has values for HSA benefits.
         */
        fun hsaContributionLimit(hsaContributionLimit: List<HsaContributionLimit?>) =
            hsaContributionLimit(JsonField.of(hsaContributionLimit))

        /**
         * Whether the provider supports HSA contribution limits. Empty if this feature is not
         * supported for the benefit. This array only has values for HSA benefits.
         */
        @JsonProperty("hsa_contribution_limit")
        @ExcludeMissing
        fun hsaContributionLimit(hsaContributionLimit: JsonField<List<HsaContributionLimit?>>) =
            apply {
                this.hsaContributionLimit = hsaContributionLimit
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

        fun build(): SupportedBenefit =
            SupportedBenefit(
                type,
                description,
                frequencies.map { it.toImmutable() },
                employeeDeduction.map { it.toImmutable() },
                companyContribution.map { it.toImmutable() },
                annualMaximum,
                catchUp,
                hsaContributionLimit.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    class CompanyContribution
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val FIXED = of("fixed")

            @JvmField val PERCENT = of("percent")

            @JvmStatic fun of(value: String) = CompanyContribution(JsonField.of(value))
        }

        enum class Known {
            FIXED,
            PERCENT,
        }

        enum class Value {
            FIXED,
            PERCENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FIXED -> Value.FIXED
                PERCENT -> Value.PERCENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                FIXED -> Known.FIXED
                PERCENT -> Known.PERCENT
                else -> throw FinchInvalidDataException("Unknown CompanyContribution: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CompanyContribution && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class EmployeeDeduction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val FIXED = of("fixed")

            @JvmField val PERCENT = of("percent")

            @JvmStatic fun of(value: String) = EmployeeDeduction(JsonField.of(value))
        }

        enum class Known {
            FIXED,
            PERCENT,
        }

        enum class Value {
            FIXED,
            PERCENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FIXED -> Value.FIXED
                PERCENT -> Value.PERCENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                FIXED -> Known.FIXED
                PERCENT -> Known.PERCENT
                else -> throw FinchInvalidDataException("Unknown EmployeeDeduction: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EmployeeDeduction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class HsaContributionLimit
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val INDIVIDUAL = of("individual")

            @JvmField val FAMILY = of("family")

            @JvmStatic fun of(value: String) = HsaContributionLimit(JsonField.of(value))
        }

        enum class Known {
            INDIVIDUAL,
            FAMILY,
        }

        enum class Value {
            INDIVIDUAL,
            FAMILY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INDIVIDUAL -> Value.INDIVIDUAL
                FAMILY -> Value.FAMILY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INDIVIDUAL -> Known.INDIVIDUAL
                FAMILY -> Known.FAMILY
                else -> throw FinchInvalidDataException("Unknown HsaContributionLimit: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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

        return /* spotless:off */ other is SupportedBenefit && type == other.type && description == other.description && frequencies == other.frequencies && employeeDeduction == other.employeeDeduction && companyContribution == other.companyContribution && annualMaximum == other.annualMaximum && catchUp == other.catchUp && hsaContributionLimit == other.hsaContributionLimit && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(type, description, frequencies, employeeDeduction, companyContribution, annualMaximum, catchUp, hsaContributionLimit, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SupportedBenefit{type=$type, description=$description, frequencies=$frequencies, employeeDeduction=$employeeDeduction, companyContribution=$companyContribution, annualMaximum=$annualMaximum, catchUp=$catchUp, hsaContributionLimit=$hsaContributionLimit, additionalProperties=$additionalProperties}"
}

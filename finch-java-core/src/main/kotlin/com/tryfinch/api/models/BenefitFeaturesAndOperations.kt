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
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class BenefitFeaturesAndOperations
@JsonCreator
private constructor(
    @JsonProperty("supported_features")
    @ExcludeMissing
    private val supportedFeatures: JsonField<BenefitFeature> = JsonMissing.of(),
    @JsonProperty("supported_operations")
    @ExcludeMissing
    private val supportedOperations: JsonField<SupportPerBenefitType> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun supportedFeatures(): Optional<BenefitFeature> =
        Optional.ofNullable(supportedFeatures.getNullable("supported_features"))

    fun supportedOperations(): Optional<SupportPerBenefitType> =
        Optional.ofNullable(supportedOperations.getNullable("supported_operations"))

    @JsonProperty("supported_features")
    @ExcludeMissing
    fun _supportedFeatures(): JsonField<BenefitFeature> = supportedFeatures

    @JsonProperty("supported_operations")
    @ExcludeMissing
    fun _supportedOperations(): JsonField<SupportPerBenefitType> = supportedOperations

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BenefitFeaturesAndOperations = apply {
        if (validated) {
            return@apply
        }

        supportedFeatures().ifPresent { it.validate() }
        supportedOperations().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BenefitFeaturesAndOperations].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BenefitFeaturesAndOperations]. */
    class Builder internal constructor() {

        private var supportedFeatures: JsonField<BenefitFeature> = JsonMissing.of()
        private var supportedOperations: JsonField<SupportPerBenefitType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(benefitFeaturesAndOperations: BenefitFeaturesAndOperations) = apply {
            supportedFeatures = benefitFeaturesAndOperations.supportedFeatures
            supportedOperations = benefitFeaturesAndOperations.supportedOperations
            additionalProperties = benefitFeaturesAndOperations.additionalProperties.toMutableMap()
        }

        fun supportedFeatures(supportedFeatures: BenefitFeature) =
            supportedFeatures(JsonField.of(supportedFeatures))

        fun supportedFeatures(supportedFeatures: JsonField<BenefitFeature>) = apply {
            this.supportedFeatures = supportedFeatures
        }

        fun supportedOperations(supportedOperations: SupportPerBenefitType) =
            supportedOperations(JsonField.of(supportedOperations))

        fun supportedOperations(supportedOperations: JsonField<SupportPerBenefitType>) = apply {
            this.supportedOperations = supportedOperations
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

        fun build(): BenefitFeaturesAndOperations =
            BenefitFeaturesAndOperations(
                supportedFeatures,
                supportedOperations,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class BenefitFeature
    @JsonCreator
    private constructor(
        @JsonProperty("annual_maximum")
        @ExcludeMissing
        private val annualMaximum: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("catch_up")
        @ExcludeMissing
        private val catchUp: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("company_contribution")
        @ExcludeMissing
        private val companyContribution: JsonField<List<CompanyContribution?>> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("employee_deduction")
        @ExcludeMissing
        private val employeeDeduction: JsonField<List<EmployeeDeduction?>> = JsonMissing.of(),
        @JsonProperty("frequencies")
        @ExcludeMissing
        private val frequencies: JsonField<List<BenefitFrequency?>> = JsonMissing.of(),
        @JsonProperty("hsa_contribution_limit")
        @ExcludeMissing
        private val hsaContributionLimit: JsonField<List<HsaContributionLimit?>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Whether the provider supports an annual maximum for this benefit. */
        fun annualMaximum(): Optional<Boolean> =
            Optional.ofNullable(annualMaximum.getNullable("annual_maximum"))

        /**
         * Whether the provider supports catch up for this benefit. This field will only be true for
         * retirement benefits.
         */
        fun catchUp(): Optional<Boolean> = Optional.ofNullable(catchUp.getNullable("catch_up"))

        /**
         * Supported contribution types. An empty array indicates contributions are not supported.
         */
        fun companyContribution(): Optional<List<CompanyContribution?>> =
            Optional.ofNullable(companyContribution.getNullable("company_contribution"))

        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** Supported deduction types. An empty array indicates deductions are not supported. */
        fun employeeDeduction(): Optional<List<EmployeeDeduction?>> =
            Optional.ofNullable(employeeDeduction.getNullable("employee_deduction"))

        /** The list of frequencies supported by the provider for this benefit */
        fun frequencies(): Optional<List<BenefitFrequency?>> =
            Optional.ofNullable(frequencies.getNullable("frequencies"))

        /**
         * Whether the provider supports HSA contribution limits. Empty if this feature is not
         * supported for the benefit. This array only has values for HSA benefits.
         */
        fun hsaContributionLimit(): Optional<List<HsaContributionLimit?>> =
            Optional.ofNullable(hsaContributionLimit.getNullable("hsa_contribution_limit"))

        /** Whether the provider supports an annual maximum for this benefit. */
        @JsonProperty("annual_maximum")
        @ExcludeMissing
        fun _annualMaximum(): JsonField<Boolean> = annualMaximum

        /**
         * Whether the provider supports catch up for this benefit. This field will only be true for
         * retirement benefits.
         */
        @JsonProperty("catch_up") @ExcludeMissing fun _catchUp(): JsonField<Boolean> = catchUp

        /**
         * Supported contribution types. An empty array indicates contributions are not supported.
         */
        @JsonProperty("company_contribution")
        @ExcludeMissing
        fun _companyContribution(): JsonField<List<CompanyContribution?>> = companyContribution

        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** Supported deduction types. An empty array indicates deductions are not supported. */
        @JsonProperty("employee_deduction")
        @ExcludeMissing
        fun _employeeDeduction(): JsonField<List<EmployeeDeduction?>> = employeeDeduction

        /** The list of frequencies supported by the provider for this benefit */
        @JsonProperty("frequencies")
        @ExcludeMissing
        fun _frequencies(): JsonField<List<BenefitFrequency?>> = frequencies

        /**
         * Whether the provider supports HSA contribution limits. Empty if this feature is not
         * supported for the benefit. This array only has values for HSA benefits.
         */
        @JsonProperty("hsa_contribution_limit")
        @ExcludeMissing
        fun _hsaContributionLimit(): JsonField<List<HsaContributionLimit?>> = hsaContributionLimit

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BenefitFeature = apply {
            if (validated) {
                return@apply
            }

            annualMaximum()
            catchUp()
            companyContribution()
            description()
            employeeDeduction()
            frequencies()
            hsaContributionLimit()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [BenefitFeature]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BenefitFeature]. */
        class Builder internal constructor() {

            private var annualMaximum: JsonField<Boolean> = JsonMissing.of()
            private var catchUp: JsonField<Boolean> = JsonMissing.of()
            private var companyContribution: JsonField<MutableList<CompanyContribution?>>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var employeeDeduction: JsonField<MutableList<EmployeeDeduction?>>? = null
            private var frequencies: JsonField<MutableList<BenefitFrequency?>>? = null
            private var hsaContributionLimit: JsonField<MutableList<HsaContributionLimit?>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(benefitFeature: BenefitFeature) = apply {
                annualMaximum = benefitFeature.annualMaximum
                catchUp = benefitFeature.catchUp
                companyContribution = benefitFeature.companyContribution.map { it.toMutableList() }
                description = benefitFeature.description
                employeeDeduction = benefitFeature.employeeDeduction.map { it.toMutableList() }
                frequencies = benefitFeature.frequencies.map { it.toMutableList() }
                hsaContributionLimit =
                    benefitFeature.hsaContributionLimit.map { it.toMutableList() }
                additionalProperties = benefitFeature.additionalProperties.toMutableMap()
            }

            /** Whether the provider supports an annual maximum for this benefit. */
            fun annualMaximum(annualMaximum: Boolean?) =
                annualMaximum(JsonField.ofNullable(annualMaximum))

            /** Whether the provider supports an annual maximum for this benefit. */
            fun annualMaximum(annualMaximum: Boolean) = annualMaximum(annualMaximum as Boolean?)

            /** Whether the provider supports an annual maximum for this benefit. */
            fun annualMaximum(annualMaximum: Optional<Boolean>) =
                annualMaximum(annualMaximum.getOrNull())

            /** Whether the provider supports an annual maximum for this benefit. */
            fun annualMaximum(annualMaximum: JsonField<Boolean>) = apply {
                this.annualMaximum = annualMaximum
            }

            /**
             * Whether the provider supports catch up for this benefit. This field will only be true
             * for retirement benefits.
             */
            fun catchUp(catchUp: Boolean?) = catchUp(JsonField.ofNullable(catchUp))

            /**
             * Whether the provider supports catch up for this benefit. This field will only be true
             * for retirement benefits.
             */
            fun catchUp(catchUp: Boolean) = catchUp(catchUp as Boolean?)

            /**
             * Whether the provider supports catch up for this benefit. This field will only be true
             * for retirement benefits.
             */
            fun catchUp(catchUp: Optional<Boolean>) = catchUp(catchUp.getOrNull())

            /**
             * Whether the provider supports catch up for this benefit. This field will only be true
             * for retirement benefits.
             */
            fun catchUp(catchUp: JsonField<Boolean>) = apply { this.catchUp = catchUp }

            /**
             * Supported contribution types. An empty array indicates contributions are not
             * supported.
             */
            fun companyContribution(companyContribution: List<CompanyContribution?>?) =
                companyContribution(JsonField.ofNullable(companyContribution))

            /**
             * Supported contribution types. An empty array indicates contributions are not
             * supported.
             */
            fun companyContribution(companyContribution: Optional<List<CompanyContribution?>>) =
                companyContribution(companyContribution.getOrNull())

            /**
             * Supported contribution types. An empty array indicates contributions are not
             * supported.
             */
            fun companyContribution(companyContribution: JsonField<List<CompanyContribution?>>) =
                apply {
                    this.companyContribution = companyContribution.map { it.toMutableList() }
                }

            /**
             * Supported contribution types. An empty array indicates contributions are not
             * supported.
             */
            fun addCompanyContribution(companyContribution: CompanyContribution) = apply {
                this.companyContribution =
                    (this.companyContribution ?: JsonField.of(mutableListOf())).also {
                        checkKnown("companyContribution", it).add(companyContribution)
                    }
            }

            fun description(description: String?) = description(JsonField.ofNullable(description))

            fun description(description: Optional<String>) = description(description.getOrNull())

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Supported deduction types. An empty array indicates deductions are not supported. */
            fun employeeDeduction(employeeDeduction: List<EmployeeDeduction?>?) =
                employeeDeduction(JsonField.ofNullable(employeeDeduction))

            /** Supported deduction types. An empty array indicates deductions are not supported. */
            fun employeeDeduction(employeeDeduction: Optional<List<EmployeeDeduction?>>) =
                employeeDeduction(employeeDeduction.getOrNull())

            /** Supported deduction types. An empty array indicates deductions are not supported. */
            fun employeeDeduction(employeeDeduction: JsonField<List<EmployeeDeduction?>>) = apply {
                this.employeeDeduction = employeeDeduction.map { it.toMutableList() }
            }

            /** Supported deduction types. An empty array indicates deductions are not supported. */
            fun addEmployeeDeduction(employeeDeduction: EmployeeDeduction) = apply {
                this.employeeDeduction =
                    (this.employeeDeduction ?: JsonField.of(mutableListOf())).also {
                        checkKnown("employeeDeduction", it).add(employeeDeduction)
                    }
            }

            /** The list of frequencies supported by the provider for this benefit */
            fun frequencies(frequencies: List<BenefitFrequency?>) =
                frequencies(JsonField.of(frequencies))

            /** The list of frequencies supported by the provider for this benefit */
            fun frequencies(frequencies: JsonField<List<BenefitFrequency?>>) = apply {
                this.frequencies = frequencies.map { it.toMutableList() }
            }

            /** The list of frequencies supported by the provider for this benefit */
            fun addFrequency(frequency: BenefitFrequency) = apply {
                frequencies =
                    (frequencies ?: JsonField.of(mutableListOf())).also {
                        checkKnown("frequencies", it).add(frequency)
                    }
            }

            /**
             * Whether the provider supports HSA contribution limits. Empty if this feature is not
             * supported for the benefit. This array only has values for HSA benefits.
             */
            fun hsaContributionLimit(hsaContributionLimit: List<HsaContributionLimit?>?) =
                hsaContributionLimit(JsonField.ofNullable(hsaContributionLimit))

            /**
             * Whether the provider supports HSA contribution limits. Empty if this feature is not
             * supported for the benefit. This array only has values for HSA benefits.
             */
            fun hsaContributionLimit(hsaContributionLimit: Optional<List<HsaContributionLimit?>>) =
                hsaContributionLimit(hsaContributionLimit.getOrNull())

            /**
             * Whether the provider supports HSA contribution limits. Empty if this feature is not
             * supported for the benefit. This array only has values for HSA benefits.
             */
            fun hsaContributionLimit(hsaContributionLimit: JsonField<List<HsaContributionLimit?>>) =
                apply {
                    this.hsaContributionLimit = hsaContributionLimit.map { it.toMutableList() }
                }

            /**
             * Whether the provider supports HSA contribution limits. Empty if this feature is not
             * supported for the benefit. This array only has values for HSA benefits.
             */
            fun addHsaContributionLimit(hsaContributionLimit: HsaContributionLimit) = apply {
                this.hsaContributionLimit =
                    (this.hsaContributionLimit ?: JsonField.of(mutableListOf())).also {
                        checkKnown("hsaContributionLimit", it).add(hsaContributionLimit)
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

            fun build(): BenefitFeature =
                BenefitFeature(
                    annualMaximum,
                    catchUp,
                    (companyContribution ?: JsonMissing.of()).map { it.toImmutable() },
                    description,
                    (employeeDeduction ?: JsonMissing.of()).map { it.toImmutable() },
                    (frequencies ?: JsonMissing.of()).map { it.toImmutable() },
                    (hsaContributionLimit ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        class CompanyContribution
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

                @JvmField val FIXED = of("fixed")

                @JvmField val PERCENT = of("percent")

                @JvmStatic fun of(value: String) = CompanyContribution(JsonField.of(value))
            }

            /** An enum containing [CompanyContribution]'s known values. */
            enum class Known {
                FIXED,
                PERCENT,
            }

            /**
             * An enum containing [CompanyContribution]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [CompanyContribution] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FIXED,
                PERCENT,
                /**
                 * An enum member indicating that [CompanyContribution] was instantiated with an
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
                    FIXED -> Value.FIXED
                    PERCENT -> Value.PERCENT
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
                    FIXED -> Known.FIXED
                    PERCENT -> Known.PERCENT
                    else -> throw FinchInvalidDataException("Unknown CompanyContribution: $value")
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

                return /* spotless:off */ other is CompanyContribution && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class EmployeeDeduction
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

                @JvmField val FIXED = of("fixed")

                @JvmField val PERCENT = of("percent")

                @JvmStatic fun of(value: String) = EmployeeDeduction(JsonField.of(value))
            }

            /** An enum containing [EmployeeDeduction]'s known values. */
            enum class Known {
                FIXED,
                PERCENT,
            }

            /**
             * An enum containing [EmployeeDeduction]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [EmployeeDeduction] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FIXED,
                PERCENT,
                /**
                 * An enum member indicating that [EmployeeDeduction] was instantiated with an
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
                    FIXED -> Value.FIXED
                    PERCENT -> Value.PERCENT
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
                    FIXED -> Known.FIXED
                    PERCENT -> Known.PERCENT
                    else -> throw FinchInvalidDataException("Unknown EmployeeDeduction: $value")
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

                return /* spotless:off */ other is EmployeeDeduction && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

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

            return /* spotless:off */ other is BenefitFeature && annualMaximum == other.annualMaximum && catchUp == other.catchUp && companyContribution == other.companyContribution && description == other.description && employeeDeduction == other.employeeDeduction && frequencies == other.frequencies && hsaContributionLimit == other.hsaContributionLimit && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(annualMaximum, catchUp, companyContribution, description, employeeDeduction, frequencies, hsaContributionLimit, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BenefitFeature{annualMaximum=$annualMaximum, catchUp=$catchUp, companyContribution=$companyContribution, description=$description, employeeDeduction=$employeeDeduction, frequencies=$frequencies, hsaContributionLimit=$hsaContributionLimit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BenefitFeaturesAndOperations && supportedFeatures == other.supportedFeatures && supportedOperations == other.supportedOperations && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(supportedFeatures, supportedOperations, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BenefitFeaturesAndOperations{supportedFeatures=$supportedFeatures, supportedOperations=$supportedOperations, additionalProperties=$additionalProperties}"
}

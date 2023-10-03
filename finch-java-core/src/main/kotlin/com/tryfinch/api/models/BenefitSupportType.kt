package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = BenefitSupportType.Builder::class)
@NoAutoDetect
class BenefitSupportType
private constructor(
    private val supportedFeatures: JsonField<BenefitFeature>,
    private val supportedOperations: JsonField<SupportPerBenefitType>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun supportedFeatures(): Optional<BenefitFeature> =
        Optional.ofNullable(supportedFeatures.getNullable("supported_features"))

    fun supportedOperations(): Optional<SupportPerBenefitType> =
        Optional.ofNullable(supportedOperations.getNullable("supported_operations"))

    @JsonProperty("supported_features") @ExcludeMissing fun _supportedFeatures() = supportedFeatures

    @JsonProperty("supported_operations")
    @ExcludeMissing
    fun _supportedOperations() = supportedOperations

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): BenefitSupportType = apply {
        if (!validated) {
            supportedFeatures().map { it.validate() }
            supportedOperations().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BenefitSupportType &&
            this.supportedFeatures == other.supportedFeatures &&
            this.supportedOperations == other.supportedOperations &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    supportedFeatures,
                    supportedOperations,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "BenefitSupportType{supportedFeatures=$supportedFeatures, supportedOperations=$supportedOperations, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var supportedFeatures: JsonField<BenefitFeature> = JsonMissing.of()
        private var supportedOperations: JsonField<SupportPerBenefitType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(benefitSupportType: BenefitSupportType) = apply {
            this.supportedFeatures = benefitSupportType.supportedFeatures
            this.supportedOperations = benefitSupportType.supportedOperations
            additionalProperties(benefitSupportType.additionalProperties)
        }

        fun supportedFeatures(supportedFeatures: BenefitFeature) =
            supportedFeatures(JsonField.of(supportedFeatures))

        @JsonProperty("supported_features")
        @ExcludeMissing
        fun supportedFeatures(supportedFeatures: JsonField<BenefitFeature>) = apply {
            this.supportedFeatures = supportedFeatures
        }

        fun supportedOperations(supportedOperations: SupportPerBenefitType) =
            supportedOperations(JsonField.of(supportedOperations))

        @JsonProperty("supported_operations")
        @ExcludeMissing
        fun supportedOperations(supportedOperations: JsonField<SupportPerBenefitType>) = apply {
            this.supportedOperations = supportedOperations
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

        fun build(): BenefitSupportType =
            BenefitSupportType(
                supportedFeatures,
                supportedOperations,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = BenefitFeature.Builder::class)
    @NoAutoDetect
    class BenefitFeature
    private constructor(
        private val description: JsonField<String>,
        private val frequencies: JsonField<List<BenefitFrequency>>,
        private val employeeDeduction: JsonField<List<EmployeeDeduction>>,
        private val companyContribution: JsonField<List<CompanyContribution>>,
        private val annualMaximum: JsonField<Boolean>,
        private val catchUp: JsonField<Boolean>,
        private val hsaContributionLimit: JsonField<List<HsaContributionLimit>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** The list of frequencies supported by the provider for this benefit */
        fun frequencies(): Optional<List<BenefitFrequency>> =
            Optional.ofNullable(frequencies.getNullable("frequencies"))

        /** Supported deduction types. An empty array indicates deductions are not supported. */
        fun employeeDeduction(): Optional<List<EmployeeDeduction>> =
            Optional.ofNullable(employeeDeduction.getNullable("employee_deduction"))

        /**
         * Supported contribution types. An empty array indicates contributions are not supported.
         */
        fun companyContribution(): Optional<List<CompanyContribution>> =
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
         * Whether the provider supports HSA contribution limits. Empty if this feature is not
         * supported for the benefit. This array only has values for HSA benefits.
         */
        fun hsaContributionLimit(): Optional<List<HsaContributionLimit>> =
            Optional.ofNullable(hsaContributionLimit.getNullable("hsa_contribution_limit"))

        @JsonProperty("description") @ExcludeMissing fun _description() = description

        /** The list of frequencies supported by the provider for this benefit */
        @JsonProperty("frequencies") @ExcludeMissing fun _frequencies() = frequencies

        /** Supported deduction types. An empty array indicates deductions are not supported. */
        @JsonProperty("employee_deduction")
        @ExcludeMissing
        fun _employeeDeduction() = employeeDeduction

        /**
         * Supported contribution types. An empty array indicates contributions are not supported.
         */
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
         * Whether the provider supports HSA contribution limits. Empty if this feature is not
         * supported for the benefit. This array only has values for HSA benefits.
         */
        @JsonProperty("hsa_contribution_limit")
        @ExcludeMissing
        fun _hsaContributionLimit() = hsaContributionLimit

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): BenefitFeature = apply {
            if (!validated) {
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BenefitFeature &&
                this.description == other.description &&
                this.frequencies == other.frequencies &&
                this.employeeDeduction == other.employeeDeduction &&
                this.companyContribution == other.companyContribution &&
                this.annualMaximum == other.annualMaximum &&
                this.catchUp == other.catchUp &&
                this.hsaContributionLimit == other.hsaContributionLimit &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        description,
                        frequencies,
                        employeeDeduction,
                        companyContribution,
                        annualMaximum,
                        catchUp,
                        hsaContributionLimit,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "BenefitFeature{description=$description, frequencies=$frequencies, employeeDeduction=$employeeDeduction, companyContribution=$companyContribution, annualMaximum=$annualMaximum, catchUp=$catchUp, hsaContributionLimit=$hsaContributionLimit, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var description: JsonField<String> = JsonMissing.of()
            private var frequencies: JsonField<List<BenefitFrequency>> = JsonMissing.of()
            private var employeeDeduction: JsonField<List<EmployeeDeduction>> = JsonMissing.of()
            private var companyContribution: JsonField<List<CompanyContribution>> = JsonMissing.of()
            private var annualMaximum: JsonField<Boolean> = JsonMissing.of()
            private var catchUp: JsonField<Boolean> = JsonMissing.of()
            private var hsaContributionLimit: JsonField<List<HsaContributionLimit>> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(benefitFeature: BenefitFeature) = apply {
                this.description = benefitFeature.description
                this.frequencies = benefitFeature.frequencies
                this.employeeDeduction = benefitFeature.employeeDeduction
                this.companyContribution = benefitFeature.companyContribution
                this.annualMaximum = benefitFeature.annualMaximum
                this.catchUp = benefitFeature.catchUp
                this.hsaContributionLimit = benefitFeature.hsaContributionLimit
                additionalProperties(benefitFeature.additionalProperties)
            }

            fun description(description: String) = description(JsonField.of(description))

            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The list of frequencies supported by the provider for this benefit */
            fun frequencies(frequencies: List<BenefitFrequency>) =
                frequencies(JsonField.of(frequencies))

            /** The list of frequencies supported by the provider for this benefit */
            @JsonProperty("frequencies")
            @ExcludeMissing
            fun frequencies(frequencies: JsonField<List<BenefitFrequency>>) = apply {
                this.frequencies = frequencies
            }

            /** Supported deduction types. An empty array indicates deductions are not supported. */
            fun employeeDeduction(employeeDeduction: List<EmployeeDeduction>) =
                employeeDeduction(JsonField.of(employeeDeduction))

            /** Supported deduction types. An empty array indicates deductions are not supported. */
            @JsonProperty("employee_deduction")
            @ExcludeMissing
            fun employeeDeduction(employeeDeduction: JsonField<List<EmployeeDeduction>>) = apply {
                this.employeeDeduction = employeeDeduction
            }

            /**
             * Supported contribution types. An empty array indicates contributions are not
             * supported.
             */
            fun companyContribution(companyContribution: List<CompanyContribution>) =
                companyContribution(JsonField.of(companyContribution))

            /**
             * Supported contribution types. An empty array indicates contributions are not
             * supported.
             */
            @JsonProperty("company_contribution")
            @ExcludeMissing
            fun companyContribution(companyContribution: JsonField<List<CompanyContribution>>) =
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
             * Whether the provider supports catch up for this benefit. This field will only be true
             * for retirement benefits.
             */
            fun catchUp(catchUp: Boolean) = catchUp(JsonField.of(catchUp))

            /**
             * Whether the provider supports catch up for this benefit. This field will only be true
             * for retirement benefits.
             */
            @JsonProperty("catch_up")
            @ExcludeMissing
            fun catchUp(catchUp: JsonField<Boolean>) = apply { this.catchUp = catchUp }

            /**
             * Whether the provider supports HSA contribution limits. Empty if this feature is not
             * supported for the benefit. This array only has values for HSA benefits.
             */
            fun hsaContributionLimit(hsaContributionLimit: List<HsaContributionLimit>) =
                hsaContributionLimit(JsonField.of(hsaContributionLimit))

            /**
             * Whether the provider supports HSA contribution limits. Empty if this feature is not
             * supported for the benefit. This array only has values for HSA benefits.
             */
            @JsonProperty("hsa_contribution_limit")
            @ExcludeMissing
            fun hsaContributionLimit(hsaContributionLimit: JsonField<List<HsaContributionLimit>>) =
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

            fun build(): BenefitFeature =
                BenefitFeature(
                    description,
                    frequencies.map { it.toUnmodifiable() },
                    employeeDeduction.map { it.toUnmodifiable() },
                    companyContribution.map { it.toUnmodifiable() },
                    annualMaximum,
                    catchUp,
                    hsaContributionLimit.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }

        class CompanyContribution
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CompanyContribution && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val FIXED = CompanyContribution(JsonField.of("fixed"))

                @JvmField val PERCENT = CompanyContribution(JsonField.of("percent"))

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
        }

        class EmployeeDeduction
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EmployeeDeduction && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val FIXED = EmployeeDeduction(JsonField.of("fixed"))

                @JvmField val PERCENT = EmployeeDeduction(JsonField.of("percent"))

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
        }

        class HsaContributionLimit
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is HsaContributionLimit && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val INDIVIDUAL = HsaContributionLimit(JsonField.of("individual"))

                @JvmField val FAMILY = HsaContributionLimit(JsonField.of("family"))

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
        }
    }

    @JsonDeserialize(builder = SupportPerBenefitType.Builder::class)
    @NoAutoDetect
    class SupportPerBenefitType
    private constructor(
        private val companyBenefits: JsonField<OperationSupportMatrix>,
        private val individualBenefits: JsonField<OperationSupportMatrix>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun companyBenefits(): Optional<OperationSupportMatrix> =
            Optional.ofNullable(companyBenefits.getNullable("company_benefits"))

        fun individualBenefits(): Optional<OperationSupportMatrix> =
            Optional.ofNullable(individualBenefits.getNullable("individual_benefits"))

        @JsonProperty("company_benefits") @ExcludeMissing fun _companyBenefits() = companyBenefits

        @JsonProperty("individual_benefits")
        @ExcludeMissing
        fun _individualBenefits() = individualBenefits

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): SupportPerBenefitType = apply {
            if (!validated) {
                companyBenefits().map { it.validate() }
                individualBenefits().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SupportPerBenefitType &&
                this.companyBenefits == other.companyBenefits &&
                this.individualBenefits == other.individualBenefits &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        companyBenefits,
                        individualBenefits,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SupportPerBenefitType{companyBenefits=$companyBenefits, individualBenefits=$individualBenefits, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var companyBenefits: JsonField<OperationSupportMatrix> = JsonMissing.of()
            private var individualBenefits: JsonField<OperationSupportMatrix> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(supportPerBenefitType: SupportPerBenefitType) = apply {
                this.companyBenefits = supportPerBenefitType.companyBenefits
                this.individualBenefits = supportPerBenefitType.individualBenefits
                additionalProperties(supportPerBenefitType.additionalProperties)
            }

            fun companyBenefits(companyBenefits: OperationSupportMatrix) =
                companyBenefits(JsonField.of(companyBenefits))

            @JsonProperty("company_benefits")
            @ExcludeMissing
            fun companyBenefits(companyBenefits: JsonField<OperationSupportMatrix>) = apply {
                this.companyBenefits = companyBenefits
            }

            fun individualBenefits(individualBenefits: OperationSupportMatrix) =
                individualBenefits(JsonField.of(individualBenefits))

            @JsonProperty("individual_benefits")
            @ExcludeMissing
            fun individualBenefits(individualBenefits: JsonField<OperationSupportMatrix>) = apply {
                this.individualBenefits = individualBenefits
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

            fun build(): SupportPerBenefitType =
                SupportPerBenefitType(
                    companyBenefits,
                    individualBenefits,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = OperationSupportMatrix.Builder::class)
        @NoAutoDetect
        class OperationSupportMatrix
        private constructor(
            private val create: JsonField<OperationSupport>,
            private val update: JsonField<OperationSupport>,
            private val delete: JsonField<OperationSupport>,
            private val read: JsonField<OperationSupport>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * - `supported`: This operation is supported by both the provider and Finch <br>
             * - `not_supported_by_finch`: This operation is not supported by Finch but supported by
             * the provider <br>
             * - `not_supported_by_provider`: This operation is not supported by the provider, so
             * Finch cannot support <br>
             * - `client_access_only`: This behavior is supported by the provider, but only
             * available to the client and not to Finch
             */
            fun create(): Optional<OperationSupport> =
                Optional.ofNullable(create.getNullable("create"))

            /**
             * - `supported`: This operation is supported by both the provider and Finch <br>
             * - `not_supported_by_finch`: This operation is not supported by Finch but supported by
             * the provider <br>
             * - `not_supported_by_provider`: This operation is not supported by the provider, so
             * Finch cannot support <br>
             * - `client_access_only`: This behavior is supported by the provider, but only
             * available to the client and not to Finch
             */
            fun update(): Optional<OperationSupport> =
                Optional.ofNullable(update.getNullable("update"))

            /**
             * - `supported`: This operation is supported by both the provider and Finch <br>
             * - `not_supported_by_finch`: This operation is not supported by Finch but supported by
             * the provider <br>
             * - `not_supported_by_provider`: This operation is not supported by the provider, so
             * Finch cannot support <br>
             * - `client_access_only`: This behavior is supported by the provider, but only
             * available to the client and not to Finch
             */
            fun delete(): Optional<OperationSupport> =
                Optional.ofNullable(delete.getNullable("delete"))

            /**
             * - `supported`: This operation is supported by both the provider and Finch <br>
             * - `not_supported_by_finch`: This operation is not supported by Finch but supported by
             * the provider <br>
             * - `not_supported_by_provider`: This operation is not supported by the provider, so
             * Finch cannot support <br>
             * - `client_access_only`: This behavior is supported by the provider, but only
             * available to the client and not to Finch
             */
            fun read(): Optional<OperationSupport> = Optional.ofNullable(read.getNullable("read"))

            /**
             * - `supported`: This operation is supported by both the provider and Finch <br>
             * - `not_supported_by_finch`: This operation is not supported by Finch but supported by
             * the provider <br>
             * - `not_supported_by_provider`: This operation is not supported by the provider, so
             * Finch cannot support <br>
             * - `client_access_only`: This behavior is supported by the provider, but only
             * available to the client and not to Finch
             */
            @JsonProperty("create") @ExcludeMissing fun _create() = create

            /**
             * - `supported`: This operation is supported by both the provider and Finch <br>
             * - `not_supported_by_finch`: This operation is not supported by Finch but supported by
             * the provider <br>
             * - `not_supported_by_provider`: This operation is not supported by the provider, so
             * Finch cannot support <br>
             * - `client_access_only`: This behavior is supported by the provider, but only
             * available to the client and not to Finch
             */
            @JsonProperty("update") @ExcludeMissing fun _update() = update

            /**
             * - `supported`: This operation is supported by both the provider and Finch <br>
             * - `not_supported_by_finch`: This operation is not supported by Finch but supported by
             * the provider <br>
             * - `not_supported_by_provider`: This operation is not supported by the provider, so
             * Finch cannot support <br>
             * - `client_access_only`: This behavior is supported by the provider, but only
             * available to the client and not to Finch
             */
            @JsonProperty("delete") @ExcludeMissing fun _delete() = delete

            /**
             * - `supported`: This operation is supported by both the provider and Finch <br>
             * - `not_supported_by_finch`: This operation is not supported by Finch but supported by
             * the provider <br>
             * - `not_supported_by_provider`: This operation is not supported by the provider, so
             * Finch cannot support <br>
             * - `client_access_only`: This behavior is supported by the provider, but only
             * available to the client and not to Finch
             */
            @JsonProperty("read") @ExcludeMissing fun _read() = read

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OperationSupportMatrix = apply {
                if (!validated) {
                    create()
                    update()
                    delete()
                    read()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OperationSupportMatrix &&
                    this.create == other.create &&
                    this.update == other.update &&
                    this.delete == other.delete &&
                    this.read == other.read &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            create,
                            update,
                            delete,
                            read,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "OperationSupportMatrix{create=$create, update=$update, delete=$delete, read=$read, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var create: JsonField<OperationSupport> = JsonMissing.of()
                private var update: JsonField<OperationSupport> = JsonMissing.of()
                private var delete: JsonField<OperationSupport> = JsonMissing.of()
                private var read: JsonField<OperationSupport> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(operationSupportMatrix: OperationSupportMatrix) = apply {
                    this.create = operationSupportMatrix.create
                    this.update = operationSupportMatrix.update
                    this.delete = operationSupportMatrix.delete
                    this.read = operationSupportMatrix.read
                    additionalProperties(operationSupportMatrix.additionalProperties)
                }

                /**
                 * - `supported`: This operation is supported by both the provider and Finch <br>
                 * - `not_supported_by_finch`: This operation is not supported by Finch but
                 * supported by the provider <br>
                 * - `not_supported_by_provider`: This operation is not supported by the provider,
                 * so Finch cannot support <br>
                 * - `client_access_only`: This behavior is supported by the provider, but only
                 * available to the client and not to Finch
                 */
                fun create(create: OperationSupport) = create(JsonField.of(create))

                /**
                 * - `supported`: This operation is supported by both the provider and Finch <br>
                 * - `not_supported_by_finch`: This operation is not supported by Finch but
                 * supported by the provider <br>
                 * - `not_supported_by_provider`: This operation is not supported by the provider,
                 * so Finch cannot support <br>
                 * - `client_access_only`: This behavior is supported by the provider, but only
                 * available to the client and not to Finch
                 */
                @JsonProperty("create")
                @ExcludeMissing
                fun create(create: JsonField<OperationSupport>) = apply { this.create = create }

                /**
                 * - `supported`: This operation is supported by both the provider and Finch <br>
                 * - `not_supported_by_finch`: This operation is not supported by Finch but
                 * supported by the provider <br>
                 * - `not_supported_by_provider`: This operation is not supported by the provider,
                 * so Finch cannot support <br>
                 * - `client_access_only`: This behavior is supported by the provider, but only
                 * available to the client and not to Finch
                 */
                fun update(update: OperationSupport) = update(JsonField.of(update))

                /**
                 * - `supported`: This operation is supported by both the provider and Finch <br>
                 * - `not_supported_by_finch`: This operation is not supported by Finch but
                 * supported by the provider <br>
                 * - `not_supported_by_provider`: This operation is not supported by the provider,
                 * so Finch cannot support <br>
                 * - `client_access_only`: This behavior is supported by the provider, but only
                 * available to the client and not to Finch
                 */
                @JsonProperty("update")
                @ExcludeMissing
                fun update(update: JsonField<OperationSupport>) = apply { this.update = update }

                /**
                 * - `supported`: This operation is supported by both the provider and Finch <br>
                 * - `not_supported_by_finch`: This operation is not supported by Finch but
                 * supported by the provider <br>
                 * - `not_supported_by_provider`: This operation is not supported by the provider,
                 * so Finch cannot support <br>
                 * - `client_access_only`: This behavior is supported by the provider, but only
                 * available to the client and not to Finch
                 */
                fun delete(delete: OperationSupport) = delete(JsonField.of(delete))

                /**
                 * - `supported`: This operation is supported by both the provider and Finch <br>
                 * - `not_supported_by_finch`: This operation is not supported by Finch but
                 * supported by the provider <br>
                 * - `not_supported_by_provider`: This operation is not supported by the provider,
                 * so Finch cannot support <br>
                 * - `client_access_only`: This behavior is supported by the provider, but only
                 * available to the client and not to Finch
                 */
                @JsonProperty("delete")
                @ExcludeMissing
                fun delete(delete: JsonField<OperationSupport>) = apply { this.delete = delete }

                /**
                 * - `supported`: This operation is supported by both the provider and Finch <br>
                 * - `not_supported_by_finch`: This operation is not supported by Finch but
                 * supported by the provider <br>
                 * - `not_supported_by_provider`: This operation is not supported by the provider,
                 * so Finch cannot support <br>
                 * - `client_access_only`: This behavior is supported by the provider, but only
                 * available to the client and not to Finch
                 */
                fun read(read: OperationSupport) = read(JsonField.of(read))

                /**
                 * - `supported`: This operation is supported by both the provider and Finch <br>
                 * - `not_supported_by_finch`: This operation is not supported by Finch but
                 * supported by the provider <br>
                 * - `not_supported_by_provider`: This operation is not supported by the provider,
                 * so Finch cannot support <br>
                 * - `client_access_only`: This behavior is supported by the provider, but only
                 * available to the client and not to Finch
                 */
                @JsonProperty("read")
                @ExcludeMissing
                fun read(read: JsonField<OperationSupport>) = apply { this.read = read }

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

                fun build(): OperationSupportMatrix =
                    OperationSupportMatrix(
                        create,
                        update,
                        delete,
                        read,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class OperationSupport
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is OperationSupport && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val SUPPORTED = OperationSupport(JsonField.of("supported"))

                    @JvmField
                    val NOT_SUPPORTED_BY_FINCH =
                        OperationSupport(JsonField.of("not_supported_by_finch"))

                    @JvmField
                    val NOT_SUPPORTED_BY_PROVIDER =
                        OperationSupport(JsonField.of("not_supported_by_provider"))

                    @JvmField
                    val CLIENT_ACCESS_ONLY = OperationSupport(JsonField.of("client_access_only"))

                    @JvmStatic fun of(value: String) = OperationSupport(JsonField.of(value))
                }

                enum class Known {
                    SUPPORTED,
                    NOT_SUPPORTED_BY_FINCH,
                    NOT_SUPPORTED_BY_PROVIDER,
                    CLIENT_ACCESS_ONLY,
                }

                enum class Value {
                    SUPPORTED,
                    NOT_SUPPORTED_BY_FINCH,
                    NOT_SUPPORTED_BY_PROVIDER,
                    CLIENT_ACCESS_ONLY,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        SUPPORTED -> Value.SUPPORTED
                        NOT_SUPPORTED_BY_FINCH -> Value.NOT_SUPPORTED_BY_FINCH
                        NOT_SUPPORTED_BY_PROVIDER -> Value.NOT_SUPPORTED_BY_PROVIDER
                        CLIENT_ACCESS_ONLY -> Value.CLIENT_ACCESS_ONLY
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        SUPPORTED -> Known.SUPPORTED
                        NOT_SUPPORTED_BY_FINCH -> Known.NOT_SUPPORTED_BY_FINCH
                        NOT_SUPPORTED_BY_PROVIDER -> Known.NOT_SUPPORTED_BY_PROVIDER
                        CLIENT_ACCESS_ONLY -> Known.CLIENT_ACCESS_ONLY
                        else -> throw FinchInvalidDataException("Unknown OperationSupport: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }
    }
}

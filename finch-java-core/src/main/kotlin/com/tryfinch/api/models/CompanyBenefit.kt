// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = CompanyBenefit.Builder::class)
@NoAutoDetect
class CompanyBenefit
private constructor(
    private val benefitId: JsonField<String>,
    private val type: JsonField<BenefitType>,
    private val description: JsonField<String>,
    private val frequency: JsonField<BenefitFrequency>,
    private val companyContribution: JsonField<BenfitContribution>,
    private val employeeDeduction: JsonField<BenfitContribution>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun benefitId(): String = benefitId.getRequired("benefit_id")

    /** Type of benefit. */
    fun type(): Optional<BenefitType> = Optional.ofNullable(type.getNullable("type"))

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    fun frequency(): Optional<BenefitFrequency> =
        Optional.ofNullable(frequency.getNullable("frequency"))

    fun companyContribution(): Optional<BenfitContribution> =
        Optional.ofNullable(companyContribution.getNullable("company_contribution"))

    fun employeeDeduction(): Optional<BenfitContribution> =
        Optional.ofNullable(employeeDeduction.getNullable("employee_deduction"))

    @JsonProperty("benefit_id") @ExcludeMissing fun _benefitId() = benefitId

    /** Type of benefit. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonProperty("description") @ExcludeMissing fun _description() = description

    @JsonProperty("frequency") @ExcludeMissing fun _frequency() = frequency

    @JsonProperty("company_contribution")
    @ExcludeMissing
    fun _companyContribution() = companyContribution

    @JsonProperty("employee_deduction") @ExcludeMissing fun _employeeDeduction() = employeeDeduction

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CompanyBenefit = apply {
        if (!validated) {
            benefitId()
            type()
            description()
            frequency()
            companyContribution().map { it.validate() }
            employeeDeduction().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CompanyBenefit &&
            this.benefitId == other.benefitId &&
            this.type == other.type &&
            this.description == other.description &&
            this.frequency == other.frequency &&
            this.companyContribution == other.companyContribution &&
            this.employeeDeduction == other.employeeDeduction &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    benefitId,
                    type,
                    description,
                    frequency,
                    companyContribution,
                    employeeDeduction,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CompanyBenefit{benefitId=$benefitId, type=$type, description=$description, frequency=$frequency, companyContribution=$companyContribution, employeeDeduction=$employeeDeduction, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var benefitId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<BenefitType> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var frequency: JsonField<BenefitFrequency> = JsonMissing.of()
        private var companyContribution: JsonField<BenfitContribution> = JsonMissing.of()
        private var employeeDeduction: JsonField<BenfitContribution> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(companyBenefit: CompanyBenefit) = apply {
            this.benefitId = companyBenefit.benefitId
            this.type = companyBenefit.type
            this.description = companyBenefit.description
            this.frequency = companyBenefit.frequency
            this.companyContribution = companyBenefit.companyContribution
            this.employeeDeduction = companyBenefit.employeeDeduction
            additionalProperties(companyBenefit.additionalProperties)
        }

        fun benefitId(benefitId: String) = benefitId(JsonField.of(benefitId))

        @JsonProperty("benefit_id")
        @ExcludeMissing
        fun benefitId(benefitId: JsonField<String>) = apply { this.benefitId = benefitId }

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

        fun frequency(frequency: BenefitFrequency) = frequency(JsonField.of(frequency))

        @JsonProperty("frequency")
        @ExcludeMissing
        fun frequency(frequency: JsonField<BenefitFrequency>) = apply { this.frequency = frequency }

        fun companyContribution(companyContribution: BenfitContribution) =
            companyContribution(JsonField.of(companyContribution))

        @JsonProperty("company_contribution")
        @ExcludeMissing
        fun companyContribution(companyContribution: JsonField<BenfitContribution>) = apply {
            this.companyContribution = companyContribution
        }

        fun employeeDeduction(employeeDeduction: BenfitContribution) =
            employeeDeduction(JsonField.of(employeeDeduction))

        @JsonProperty("employee_deduction")
        @ExcludeMissing
        fun employeeDeduction(employeeDeduction: JsonField<BenfitContribution>) = apply {
            this.employeeDeduction = employeeDeduction
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

        fun build(): CompanyBenefit =
            CompanyBenefit(
                benefitId,
                type,
                description,
                frequency,
                companyContribution,
                employeeDeduction,
                additionalProperties.toUnmodifiable(),
            )
    }
}

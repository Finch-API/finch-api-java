// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class CompanyBenefit
@JsonCreator
private constructor(
    @JsonProperty("benefit_id")
    @ExcludeMissing
    private val benefitId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("frequency")
    @ExcludeMissing
    private val frequency: JsonField<BenefitFrequency> = JsonMissing.of(),
    @JsonProperty("type")
    @ExcludeMissing
    private val type: JsonField<BenefitType> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun benefitId(): String = benefitId.getRequired("benefit_id")

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    fun frequency(): Optional<BenefitFrequency> =
        Optional.ofNullable(frequency.getNullable("frequency"))

    /** Type of benefit. */
    fun type(): Optional<BenefitType> = Optional.ofNullable(type.getNullable("type"))

    @JsonProperty("benefit_id") @ExcludeMissing fun _benefitId(): JsonField<String> = benefitId

    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    @JsonProperty("frequency")
    @ExcludeMissing
    fun _frequency(): JsonField<BenefitFrequency> = frequency

    /** Type of benefit. */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<BenefitType> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CompanyBenefit = apply {
        if (validated) {
            return@apply
        }

        benefitId()
        description()
        frequency()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CompanyBenefit].
         *
         * The following fields are required:
         * ```java
         * .benefitId()
         * .description()
         * .frequency()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CompanyBenefit]. */
    class Builder internal constructor() {

        private var benefitId: JsonField<String>? = null
        private var description: JsonField<String>? = null
        private var frequency: JsonField<BenefitFrequency>? = null
        private var type: JsonField<BenefitType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(companyBenefit: CompanyBenefit) = apply {
            benefitId = companyBenefit.benefitId
            description = companyBenefit.description
            frequency = companyBenefit.frequency
            type = companyBenefit.type
            additionalProperties = companyBenefit.additionalProperties.toMutableMap()
        }

        fun benefitId(benefitId: String) = benefitId(JsonField.of(benefitId))

        fun benefitId(benefitId: JsonField<String>) = apply { this.benefitId = benefitId }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        fun description(description: Optional<String>) = description(description.orElse(null))

        fun description(description: JsonField<String>) = apply { this.description = description }

        fun frequency(frequency: BenefitFrequency?) = frequency(JsonField.ofNullable(frequency))

        fun frequency(frequency: Optional<BenefitFrequency>) = frequency(frequency.orElse(null))

        fun frequency(frequency: JsonField<BenefitFrequency>) = apply { this.frequency = frequency }

        /** Type of benefit. */
        fun type(type: BenefitType?) = type(JsonField.ofNullable(type))

        /** Type of benefit. */
        fun type(type: Optional<BenefitType>) = type(type.orElse(null))

        /** Type of benefit. */
        fun type(type: JsonField<BenefitType>) = apply { this.type = type }

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

        fun build(): CompanyBenefit =
            CompanyBenefit(
                checkRequired("benefitId", benefitId),
                checkRequired("description", description),
                checkRequired("frequency", frequency),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CompanyBenefit && benefitId == other.benefitId && description == other.description && frequency == other.frequency && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(benefitId, description, frequency, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompanyBenefit{benefitId=$benefitId, description=$description, frequency=$frequency, type=$type, additionalProperties=$additionalProperties}"
}

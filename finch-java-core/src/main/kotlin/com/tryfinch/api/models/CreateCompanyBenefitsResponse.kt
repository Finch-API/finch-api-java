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

@JsonDeserialize(builder = CreateCompanyBenefitsResponse.Builder::class)
@NoAutoDetect
class CreateCompanyBenefitsResponse
private constructor(
    private val benefitId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun benefitId(): String = benefitId.getRequired("benefit_id")

    @JsonProperty("benefit_id") @ExcludeMissing fun _benefitId() = benefitId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CreateCompanyBenefitsResponse = apply {
        if (!validated) {
            benefitId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var benefitId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createCompanyBenefitsResponse: CreateCompanyBenefitsResponse) = apply {
            this.benefitId = createCompanyBenefitsResponse.benefitId
            additionalProperties(createCompanyBenefitsResponse.additionalProperties)
        }

        fun benefitId(benefitId: String) = benefitId(JsonField.of(benefitId))

        @JsonProperty("benefit_id")
        @ExcludeMissing
        fun benefitId(benefitId: JsonField<String>) = apply { this.benefitId = benefitId }

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

        fun build(): CreateCompanyBenefitsResponse =
            CreateCompanyBenefitsResponse(benefitId, additionalProperties.toUnmodifiable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreateCompanyBenefitsResponse && this.benefitId == other.benefitId && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(benefitId, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "CreateCompanyBenefitsResponse{benefitId=$benefitId, additionalProperties=$additionalProperties}"
}

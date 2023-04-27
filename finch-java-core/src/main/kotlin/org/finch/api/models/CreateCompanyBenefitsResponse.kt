package org.finch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import org.finch.api.core.ExcludeMissing
import org.finch.api.core.JsonField
import org.finch.api.core.JsonMissing
import org.finch.api.core.JsonValue
import org.finch.api.core.NoAutoDetect
import org.finch.api.core.toUnmodifiable

@JsonDeserialize(builder = CreateCompanyBenefitsResponse.Builder::class)
@NoAutoDetect
class CreateCompanyBenefitsResponse
private constructor(
    private val benefitId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun benefitId(): String = benefitId.getRequired("benefit_id")

    @JsonProperty("benefit_id") @ExcludeMissing fun _benefitId() = benefitId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            benefitId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateCompanyBenefitsResponse &&
            this.benefitId == other.benefitId &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(benefitId, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "CreateCompanyBenefitsResponse{benefitId=$benefitId, additionalProperties=$additionalProperties}"

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
}

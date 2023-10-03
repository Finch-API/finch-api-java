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

@JsonDeserialize(builder = RegisterCompanyBenefitsResponse.Builder::class)
@NoAutoDetect
class RegisterCompanyBenefitsResponse
private constructor(
    private val benefitId: JsonField<String>,
    private val jobId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun benefitId(): String = benefitId.getRequired("benefit_id")

    fun jobId(): String = jobId.getRequired("job_id")

    @JsonProperty("benefit_id") @ExcludeMissing fun _benefitId() = benefitId

    @JsonProperty("job_id") @ExcludeMissing fun _jobId() = jobId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): RegisterCompanyBenefitsResponse = apply {
        if (!validated) {
            benefitId()
            jobId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RegisterCompanyBenefitsResponse &&
            this.benefitId == other.benefitId &&
            this.jobId == other.jobId &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    benefitId,
                    jobId,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "RegisterCompanyBenefitsResponse{benefitId=$benefitId, jobId=$jobId, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var benefitId: JsonField<String> = JsonMissing.of()
        private var jobId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(registerCompanyBenefitsResponse: RegisterCompanyBenefitsResponse) =
            apply {
                this.benefitId = registerCompanyBenefitsResponse.benefitId
                this.jobId = registerCompanyBenefitsResponse.jobId
                additionalProperties(registerCompanyBenefitsResponse.additionalProperties)
            }

        fun benefitId(benefitId: String) = benefitId(JsonField.of(benefitId))

        @JsonProperty("benefit_id")
        @ExcludeMissing
        fun benefitId(benefitId: JsonField<String>) = apply { this.benefitId = benefitId }

        fun jobId(jobId: String) = jobId(JsonField.of(jobId))

        @JsonProperty("job_id")
        @ExcludeMissing
        fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

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

        fun build(): RegisterCompanyBenefitsResponse =
            RegisterCompanyBenefitsResponse(
                benefitId,
                jobId,
                additionalProperties.toUnmodifiable(),
            )
    }
}

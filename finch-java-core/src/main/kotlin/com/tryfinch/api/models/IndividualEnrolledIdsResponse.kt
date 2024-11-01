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
import com.tryfinch.api.core.toImmutable
import java.util.Objects

@JsonDeserialize(builder = IndividualEnrolledIdsResponse.Builder::class)
@NoAutoDetect
class IndividualEnrolledIdsResponse
private constructor(
    private val benefitId: JsonField<String>,
    private val individualIds: JsonField<List<String>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun benefitId(): String = benefitId.getRequired("benefit_id")

    fun individualIds(): List<String> = individualIds.getRequired("individual_ids")

    @JsonProperty("benefit_id") @ExcludeMissing fun _benefitId() = benefitId

    @JsonProperty("individual_ids") @ExcludeMissing fun _individualIds() = individualIds

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): IndividualEnrolledIdsResponse = apply {
        if (!validated) {
            benefitId()
            individualIds()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var benefitId: JsonField<String> = JsonMissing.of()
        private var individualIds: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(individualEnrolledIdsResponse: IndividualEnrolledIdsResponse) = apply {
            this.benefitId = individualEnrolledIdsResponse.benefitId
            this.individualIds = individualEnrolledIdsResponse.individualIds
            additionalProperties(individualEnrolledIdsResponse.additionalProperties)
        }

        fun benefitId(benefitId: String) = benefitId(JsonField.of(benefitId))

        @JsonProperty("benefit_id")
        @ExcludeMissing
        fun benefitId(benefitId: JsonField<String>) = apply { this.benefitId = benefitId }

        fun individualIds(individualIds: List<String>) = individualIds(JsonField.of(individualIds))

        @JsonProperty("individual_ids")
        @ExcludeMissing
        fun individualIds(individualIds: JsonField<List<String>>) = apply {
            this.individualIds = individualIds
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

        fun build(): IndividualEnrolledIdsResponse =
            IndividualEnrolledIdsResponse(
                benefitId,
                individualIds.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IndividualEnrolledIdsResponse && this.benefitId == other.benefitId && this.individualIds == other.individualIds && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(benefitId, individualIds, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "IndividualEnrolledIdsResponse{benefitId=$benefitId, individualIds=$individualIds, additionalProperties=$additionalProperties}"
}

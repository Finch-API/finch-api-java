package org.finch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional
import org.finch.api.core.ExcludeMissing
import org.finch.api.core.JsonField
import org.finch.api.core.JsonMissing
import org.finch.api.core.JsonValue
import org.finch.api.core.NoAutoDetect
import org.finch.api.core.toUnmodifiable

@JsonDeserialize(builder = EmploymentDataResponse.Builder::class)
@NoAutoDetect
class EmploymentDataResponse
private constructor(
    private val individualId: JsonField<String>,
    private val code: JsonField<Long>,
    private val body: JsonField<EmploymentData>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun individualId(): Optional<String> =
        Optional.ofNullable(individualId.getNullable("individual_id"))

    fun code(): Optional<Long> = Optional.ofNullable(code.getNullable("code"))

    fun body(): Optional<EmploymentData> = Optional.ofNullable(body.getNullable("body"))

    @JsonProperty("individual_id") @ExcludeMissing fun _individualId() = individualId

    @JsonProperty("code") @ExcludeMissing fun _code() = code

    @JsonProperty("body") @ExcludeMissing fun _body() = body

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            individualId()
            code()
            body().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmploymentDataResponse &&
            this.individualId == other.individualId &&
            this.code == other.code &&
            this.body == other.body &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    individualId,
                    code,
                    body,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "EmploymentDataResponse{individualId=$individualId, code=$code, body=$body, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var individualId: JsonField<String> = JsonMissing.of()
        private var code: JsonField<Long> = JsonMissing.of()
        private var body: JsonField<EmploymentData> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(employmentDataResponse: EmploymentDataResponse) = apply {
            this.individualId = employmentDataResponse.individualId
            this.code = employmentDataResponse.code
            this.body = employmentDataResponse.body
            additionalProperties(employmentDataResponse.additionalProperties)
        }

        fun individualId(individualId: String) = individualId(JsonField.of(individualId))

        @JsonProperty("individual_id")
        @ExcludeMissing
        fun individualId(individualId: JsonField<String>) = apply {
            this.individualId = individualId
        }

        fun code(code: Long) = code(JsonField.of(code))

        @JsonProperty("code")
        @ExcludeMissing
        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun body(body: EmploymentData) = body(JsonField.of(body))

        @JsonProperty("body")
        @ExcludeMissing
        fun body(body: JsonField<EmploymentData>) = apply { this.body = body }

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

        fun build(): EmploymentDataResponse =
            EmploymentDataResponse(
                individualId,
                code,
                body,
                additionalProperties.toUnmodifiable(),
            )
    }
}

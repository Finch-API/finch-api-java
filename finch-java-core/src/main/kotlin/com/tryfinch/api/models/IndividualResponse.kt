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
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class IndividualResponse
@JsonCreator
private constructor(
    @JsonProperty("individual_id")
    @ExcludeMissing
    private val individualId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("body")
    @ExcludeMissing
    private val body: JsonField<Individual> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun individualId(): Optional<String> =
        Optional.ofNullable(individualId.getNullable("individual_id"))

    fun code(): Optional<Long> = Optional.ofNullable(code.getNullable("code"))

    fun body(): Optional<Individual> = Optional.ofNullable(body.getNullable("body"))

    @JsonProperty("individual_id") @ExcludeMissing fun _individualId() = individualId

    @JsonProperty("code") @ExcludeMissing fun _code() = code

    @JsonProperty("body") @ExcludeMissing fun _body() = body

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): IndividualResponse = apply {
        if (!validated) {
            individualId()
            code()
            body().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var individualId: JsonField<String> = JsonMissing.of()
        private var code: JsonField<Long> = JsonMissing.of()
        private var body: JsonField<Individual> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(individualResponse: IndividualResponse) = apply {
            individualId = individualResponse.individualId
            code = individualResponse.code
            body = individualResponse.body
            additionalProperties = individualResponse.additionalProperties.toMutableMap()
        }

        fun individualId(individualId: String) = individualId(JsonField.of(individualId))

        fun individualId(individualId: JsonField<String>) = apply {
            this.individualId = individualId
        }

        fun code(code: Long) = code(JsonField.of(code))

        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun body(body: Individual) = body(JsonField.of(body))

        fun body(body: JsonField<Individual>) = apply { this.body = body }

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

        fun build(): IndividualResponse =
            IndividualResponse(
                individualId,
                code,
                body,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IndividualResponse && individualId == other.individualId && code == other.code && body == other.body && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(individualId, code, body, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IndividualResponse{individualId=$individualId, code=$code, body=$body, additionalProperties=$additionalProperties}"
}

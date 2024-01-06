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

@JsonDeserialize(builder = CreateAccessTokenResponse.Builder::class)
@NoAutoDetect
class CreateAccessTokenResponse
private constructor(
    private val accessToken: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun accessToken(): String = accessToken.getRequired("access_token")

    @JsonProperty("access_token") @ExcludeMissing fun _accessToken() = accessToken

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CreateAccessTokenResponse = apply {
        if (!validated) {
            accessToken()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateAccessTokenResponse &&
            this.accessToken == other.accessToken &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(accessToken, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "CreateAccessTokenResponse{accessToken=$accessToken, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accessToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createAccessTokenResponse: CreateAccessTokenResponse) = apply {
            this.accessToken = createAccessTokenResponse.accessToken
            additionalProperties(createAccessTokenResponse.additionalProperties)
        }

        fun accessToken(accessToken: String) = accessToken(JsonField.of(accessToken))

        @JsonProperty("access_token")
        @ExcludeMissing
        fun accessToken(accessToken: JsonField<String>) = apply { this.accessToken = accessToken }

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

        fun build(): CreateAccessTokenResponse =
            CreateAccessTokenResponse(accessToken, additionalProperties.toUnmodifiable())
    }
}

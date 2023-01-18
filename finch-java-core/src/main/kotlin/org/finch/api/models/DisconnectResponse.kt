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

@JsonDeserialize(builder = DisconnectResponse.Builder::class)
@NoAutoDetect
class DisconnectResponse
private constructor(
    private val status: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** If the request is successful, Finch will return “success” (HTTP 200 status). */
    fun status(): String = status.getRequired("status")

    /** If the request is successful, Finch will return “success” (HTTP 200 status). */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            status()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DisconnectResponse &&
            this.status == other.status &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(status, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "DisconnectResponse{status=$status, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(disconnectResponse: DisconnectResponse) = apply {
            this.status = disconnectResponse.status
            additionalProperties(disconnectResponse.additionalProperties)
        }

        /** If the request is successful, Finch will return “success” (HTTP 200 status). */
        fun status(status: String) = status(JsonField.of(status))

        /** If the request is successful, Finch will return “success” (HTTP 200 status). */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<String>) = apply { this.status = status }

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

        fun build(): DisconnectResponse =
            DisconnectResponse(status, additionalProperties.toUnmodifiable())
    }
}

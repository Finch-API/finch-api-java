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

@NoAutoDetect
class SessionReauthenticateResponse
@JsonCreator
private constructor(
    @JsonProperty("session_id")
    @ExcludeMissing
    private val sessionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("connect_url")
    @ExcludeMissing
    private val connectUrl: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The unique identifier for the created connect session */
    fun sessionId(): String = sessionId.getRequired("session_id")

    /** The Connect URL to redirect the user to for reauthentication */
    fun connectUrl(): String = connectUrl.getRequired("connect_url")

    /** The unique identifier for the created connect session */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId() = sessionId

    /** The Connect URL to redirect the user to for reauthentication */
    @JsonProperty("connect_url") @ExcludeMissing fun _connectUrl() = connectUrl

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SessionReauthenticateResponse = apply {
        if (!validated) {
            sessionId()
            connectUrl()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var sessionId: JsonField<String> = JsonMissing.of()
        private var connectUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sessionReauthenticateResponse: SessionReauthenticateResponse) = apply {
            sessionId = sessionReauthenticateResponse.sessionId
            connectUrl = sessionReauthenticateResponse.connectUrl
            additionalProperties = sessionReauthenticateResponse.additionalProperties.toMutableMap()
        }

        /** The unique identifier for the created connect session */
        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /** The unique identifier for the created connect session */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        /** The Connect URL to redirect the user to for reauthentication */
        fun connectUrl(connectUrl: String) = connectUrl(JsonField.of(connectUrl))

        /** The Connect URL to redirect the user to for reauthentication */
        fun connectUrl(connectUrl: JsonField<String>) = apply { this.connectUrl = connectUrl }

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

        fun build(): SessionReauthenticateResponse =
            SessionReauthenticateResponse(
                sessionId,
                connectUrl,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SessionReauthenticateResponse && sessionId == other.sessionId && connectUrl == other.connectUrl && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(sessionId, connectUrl, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SessionReauthenticateResponse{sessionId=$sessionId, connectUrl=$connectUrl, additionalProperties=$additionalProperties}"
}

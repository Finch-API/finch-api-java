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

@JsonDeserialize(builder = SessionReauthenticateResponse.Builder::class)
@NoAutoDetect
class SessionReauthenticateResponse
private constructor(
    private val sessionId: JsonField<String>,
    private val connectUrl: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

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
            this.sessionId = sessionReauthenticateResponse.sessionId
            this.connectUrl = sessionReauthenticateResponse.connectUrl
            additionalProperties(sessionReauthenticateResponse.additionalProperties)
        }

        /** The unique identifier for the created connect session */
        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /** The unique identifier for the created connect session */
        @JsonProperty("session_id")
        @ExcludeMissing
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        /** The Connect URL to redirect the user to for reauthentication */
        fun connectUrl(connectUrl: String) = connectUrl(JsonField.of(connectUrl))

        /** The Connect URL to redirect the user to for reauthentication */
        @JsonProperty("connect_url")
        @ExcludeMissing
        fun connectUrl(connectUrl: JsonField<String>) = apply { this.connectUrl = connectUrl }

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

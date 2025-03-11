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
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import java.util.Objects

@NoAutoDetect
class SessionNewResponse @JsonCreator private constructor(
    @JsonProperty("connect_url") @ExcludeMissing private val connectUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("session_id") @ExcludeMissing private val sessionId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

) {

    /** The Connect URL to redirect the user to for authentication */
    fun connectUrl(): String = connectUrl.getRequired("connect_url")

    /** The unique identifier for the created connect session */
    fun sessionId(): String = sessionId.getRequired("session_id")

    /** The Connect URL to redirect the user to for authentication */
    @JsonProperty("connect_url")
    @ExcludeMissing
    fun _connectUrl(): JsonField<String> = connectUrl

    /** The unique identifier for the created connect session */
    @JsonProperty("session_id")
    @ExcludeMissing
    fun _sessionId(): JsonField<String> = sessionId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SessionNewResponse =
        apply {
            if (validated) {
              return@apply
            }

            connectUrl()
            sessionId()
            validated = true
        }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SessionNewResponse].
         *
         * The following fields are required:
         *
         * ```java
         * .connectUrl()
         * .sessionId()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [SessionNewResponse]. */
    class Builder internal constructor() {

        private var connectUrl: JsonField<String>? = null
        private var sessionId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sessionNewResponse: SessionNewResponse) =
            apply {
                connectUrl = sessionNewResponse.connectUrl
                sessionId = sessionNewResponse.sessionId
                additionalProperties = sessionNewResponse.additionalProperties.toMutableMap()
            }

        /** The Connect URL to redirect the user to for authentication */
        fun connectUrl(connectUrl: String) = connectUrl(JsonField.of(connectUrl))

        /** The Connect URL to redirect the user to for authentication */
        fun connectUrl(connectUrl: JsonField<String>) =
            apply {
                this.connectUrl = connectUrl
            }

        /** The unique identifier for the created connect session */
        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /** The unique identifier for the created connect session */
        fun sessionId(sessionId: JsonField<String>) =
            apply {
                this.sessionId = sessionId
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply {
                additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.putAll(additionalProperties)
            }

        fun removeAdditionalProperty(key: String) =
            apply {
                additionalProperties.remove(key)
            }

        fun removeAllAdditionalProperties(keys: Set<String>) =
            apply {
                keys.forEach(::removeAdditionalProperty)
            }

        fun build(): SessionNewResponse =
            SessionNewResponse(
              checkRequired(
                "connectUrl", connectUrl
              ),
              checkRequired(
                "sessionId", sessionId
              ),
              additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is SessionNewResponse && connectUrl == other.connectUrl && sessionId == other.sessionId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(connectUrl, sessionId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "SessionNewResponse{connectUrl=$connectUrl, sessionId=$sessionId, additionalProperties=$additionalProperties}"
}

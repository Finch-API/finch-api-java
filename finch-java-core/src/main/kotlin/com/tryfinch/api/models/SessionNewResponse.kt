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
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects

class SessionNewResponse
private constructor(
    private val connectUrl: JsonField<String>,
    private val sessionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("connect_url")
        @ExcludeMissing
        connectUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
    ) : this(connectUrl, sessionId, mutableMapOf())

    /**
     * The Connect URL to redirect the user to for authentication
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun connectUrl(): String = connectUrl.getRequired("connect_url")

    /**
     * The unique identifier for the created connect session
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessionId(): String = sessionId.getRequired("session_id")

    /**
     * Returns the raw JSON value of [connectUrl].
     *
     * Unlike [connectUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connect_url") @ExcludeMissing fun _connectUrl(): JsonField<String> = connectUrl

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SessionNewResponse].
         *
         * The following fields are required:
         * ```java
         * .connectUrl()
         * .sessionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionNewResponse]. */
    class Builder internal constructor() {

        private var connectUrl: JsonField<String>? = null
        private var sessionId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sessionNewResponse: SessionNewResponse) = apply {
            connectUrl = sessionNewResponse.connectUrl
            sessionId = sessionNewResponse.sessionId
            additionalProperties = sessionNewResponse.additionalProperties.toMutableMap()
        }

        /** The Connect URL to redirect the user to for authentication */
        fun connectUrl(connectUrl: String) = connectUrl(JsonField.of(connectUrl))

        /**
         * Sets [Builder.connectUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectUrl(connectUrl: JsonField<String>) = apply { this.connectUrl = connectUrl }

        /** The unique identifier for the created connect session */
        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

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

        /**
         * Returns an immutable instance of [SessionNewResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .connectUrl()
         * .sessionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SessionNewResponse =
            SessionNewResponse(
                checkRequired("connectUrl", connectUrl),
                checkRequired("sessionId", sessionId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SessionNewResponse = apply {
        if (validated) {
            return@apply
        }

        connectUrl()
        sessionId()
        validated = true
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

    override fun toString() =
        "SessionNewResponse{connectUrl=$connectUrl, sessionId=$sessionId, additionalProperties=$additionalProperties}"
}

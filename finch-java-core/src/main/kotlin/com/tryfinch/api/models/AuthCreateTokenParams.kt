// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.models.*
import java.util.Objects

class AuthCreateTokenParams
constructor(
    private val clientId: String,
    private val clientSecret: String,
    private val code: String,
    private val redirectUri: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun clientId(): String = clientId

    fun clientSecret(): String = clientSecret

    fun code(): String = code

    fun redirectUri(): String = redirectUri

    @JvmSynthetic
    internal fun getBody(): AuthCreateTokenBody {
        return AuthCreateTokenBody(
            clientId,
            clientSecret,
            code,
            redirectUri,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = AuthCreateTokenBody.Builder::class)
    @NoAutoDetect
    class AuthCreateTokenBody
    internal constructor(
        private val clientId: String?,
        private val clientSecret: String?,
        private val code: String?,
        private val redirectUri: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("client_id") fun clientId(): String? = clientId

        @JsonProperty("client_secret") fun clientSecret(): String? = clientSecret

        @JsonProperty("code") fun code(): String? = code

        @JsonProperty("redirect_uri") fun redirectUri(): String? = redirectUri

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AuthCreateTokenBody &&
                this.clientId == other.clientId &&
                this.clientSecret == other.clientSecret &&
                this.code == other.code &&
                this.redirectUri == other.redirectUri &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        clientId,
                        clientSecret,
                        code,
                        redirectUri,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AuthCreateTokenBody{clientId=$clientId, clientSecret=$clientSecret, code=$code, redirectUri=$redirectUri, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var clientId: String? = null
            private var clientSecret: String? = null
            private var code: String? = null
            private var redirectUri: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authCreateTokenBody: AuthCreateTokenBody) = apply {
                this.clientId = authCreateTokenBody.clientId
                this.clientSecret = authCreateTokenBody.clientSecret
                this.code = authCreateTokenBody.code
                this.redirectUri = authCreateTokenBody.redirectUri
                additionalProperties(authCreateTokenBody.additionalProperties)
            }

            @JsonProperty("client_id")
            fun clientId(clientId: String) = apply { this.clientId = clientId }

            @JsonProperty("client_secret")
            fun clientSecret(clientSecret: String) = apply { this.clientSecret = clientSecret }

            @JsonProperty("code") fun code(code: String) = apply { this.code = code }

            @JsonProperty("redirect_uri")
            fun redirectUri(redirectUri: String) = apply { this.redirectUri = redirectUri }

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

            fun build(): AuthCreateTokenBody =
                AuthCreateTokenBody(
                    checkNotNull(clientId) { "`clientId` is required but was not set" },
                    checkNotNull(clientSecret) { "`clientSecret` is required but was not set" },
                    checkNotNull(code) { "`code` is required but was not set" },
                    checkNotNull(redirectUri) { "`redirectUri` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthCreateTokenParams &&
            this.clientId == other.clientId &&
            this.clientSecret == other.clientSecret &&
            this.code == other.code &&
            this.redirectUri == other.redirectUri &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            clientId,
            clientSecret,
            code,
            redirectUri,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AuthCreateTokenParams{clientId=$clientId, clientSecret=$clientSecret, code=$code, redirectUri=$redirectUri, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var clientId: String? = null
        private var clientSecret: String? = null
        private var code: String? = null
        private var redirectUri: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authCreateTokenParams: AuthCreateTokenParams) = apply {
            this.clientId = authCreateTokenParams.clientId
            this.clientSecret = authCreateTokenParams.clientSecret
            this.code = authCreateTokenParams.code
            this.redirectUri = authCreateTokenParams.redirectUri
            additionalQueryParams(authCreateTokenParams.additionalQueryParams)
            additionalHeaders(authCreateTokenParams.additionalHeaders)
            additionalBodyProperties(authCreateTokenParams.additionalBodyProperties)
        }

        fun clientId(clientId: String) = apply { this.clientId = clientId }

        fun clientSecret(clientSecret: String) = apply { this.clientSecret = clientSecret }

        fun code(code: String) = apply { this.code = code }

        fun redirectUri(redirectUri: String) = apply { this.redirectUri = redirectUri }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): AuthCreateTokenParams =
            AuthCreateTokenParams(
                checkNotNull(clientId) { "`clientId` is required but was not set" },
                checkNotNull(clientSecret) { "`clientSecret` is required but was not set" },
                checkNotNull(code) { "`code` is required but was not set" },
                checkNotNull(redirectUri) { "`redirectUri` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}

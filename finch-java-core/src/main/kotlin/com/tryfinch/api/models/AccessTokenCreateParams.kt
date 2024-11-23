// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.models.*
import java.util.Objects
import java.util.Optional

class AccessTokenCreateParams
constructor(
    private val code: String,
    private val clientId: String?,
    private val clientSecret: String?,
    private val redirectUri: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun code(): String = code

    fun clientId(): Optional<String> = Optional.ofNullable(clientId)

    fun clientSecret(): Optional<String> = Optional.ofNullable(clientSecret)

    fun redirectUri(): Optional<String> = Optional.ofNullable(redirectUri)

    @JvmSynthetic
    internal fun getBody(): AccessTokenCreateBody {
        return AccessTokenCreateBody(
            code,
            clientId,
            clientSecret,
            redirectUri,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = AccessTokenCreateBody.Builder::class)
    @NoAutoDetect
    class AccessTokenCreateBody
    internal constructor(
        private val code: String?,
        private val clientId: String?,
        private val clientSecret: String?,
        private val redirectUri: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("code") fun code(): String? = code

        @JsonProperty("client_id") fun clientId(): String? = clientId

        @JsonProperty("client_secret") fun clientSecret(): String? = clientSecret

        @JsonProperty("redirect_uri") fun redirectUri(): String? = redirectUri

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var code: String? = null
            private var clientId: String? = null
            private var clientSecret: String? = null
            private var redirectUri: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accessTokenCreateBody: AccessTokenCreateBody) = apply {
                this.code = accessTokenCreateBody.code
                this.clientId = accessTokenCreateBody.clientId
                this.clientSecret = accessTokenCreateBody.clientSecret
                this.redirectUri = accessTokenCreateBody.redirectUri
                additionalProperties(accessTokenCreateBody.additionalProperties)
            }

            @JsonProperty("code") fun code(code: String) = apply { this.code = code }

            @JsonProperty("client_id")
            fun clientId(clientId: String) = apply { this.clientId = clientId }

            @JsonProperty("client_secret")
            fun clientSecret(clientSecret: String) = apply { this.clientSecret = clientSecret }

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

            fun build(): AccessTokenCreateBody =
                AccessTokenCreateBody(
                    checkNotNull(code) { "`code` is required but was not set" },
                    clientId,
                    clientSecret,
                    redirectUri,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccessTokenCreateBody && code == other.code && clientId == other.clientId && clientSecret == other.clientSecret && redirectUri == other.redirectUri && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(code, clientId, clientSecret, redirectUri, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccessTokenCreateBody{code=$code, clientId=$clientId, clientSecret=$clientSecret, redirectUri=$redirectUri, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccessTokenCreateParams && code == other.code && clientId == other.clientId && clientSecret == other.clientSecret && redirectUri == other.redirectUri && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(code, clientId, clientSecret, redirectUri, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "AccessTokenCreateParams{code=$code, clientId=$clientId, clientSecret=$clientSecret, redirectUri=$redirectUri, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var code: String? = null
        private var clientId: String? = null
        private var clientSecret: String? = null
        private var redirectUri: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accessTokenCreateParams: AccessTokenCreateParams) = apply {
            this.code = accessTokenCreateParams.code
            this.clientId = accessTokenCreateParams.clientId
            this.clientSecret = accessTokenCreateParams.clientSecret
            this.redirectUri = accessTokenCreateParams.redirectUri
            additionalHeaders(accessTokenCreateParams.additionalHeaders)
            additionalQueryParams(accessTokenCreateParams.additionalQueryParams)
            additionalBodyProperties(accessTokenCreateParams.additionalBodyProperties)
        }

        fun code(code: String) = apply { this.code = code }

        fun clientId(clientId: String) = apply { this.clientId = clientId }

        fun clientSecret(clientSecret: String) = apply { this.clientSecret = clientSecret }

        fun redirectUri(redirectUri: String) = apply { this.redirectUri = redirectUri }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): AccessTokenCreateParams =
            AccessTokenCreateParams(
                checkNotNull(code) { "`code` is required but was not set" },
                clientId,
                clientSecret,
                redirectUri,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }
}

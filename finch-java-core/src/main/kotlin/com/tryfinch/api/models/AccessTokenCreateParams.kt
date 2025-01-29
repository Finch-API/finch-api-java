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
import com.tryfinch.api.core.Params
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/** Exchange the authorization code for an access token */
class AccessTokenCreateParams
private constructor(
    private val body: AccessTokenCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun code(): String = body.code()

    fun clientId(): Optional<String> = body.clientId()

    fun clientSecret(): Optional<String> = body.clientSecret()

    fun redirectUri(): Optional<String> = body.redirectUri()

    fun _code(): JsonField<String> = body._code()

    fun _clientId(): JsonField<String> = body._clientId()

    fun _clientSecret(): JsonField<String> = body._clientSecret()

    fun _redirectUri(): JsonField<String> = body._redirectUri()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): AccessTokenCreateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class AccessTokenCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("code")
        @ExcludeMissing
        private val code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_id")
        @ExcludeMissing
        private val clientId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_secret")
        @ExcludeMissing
        private val clientSecret: JsonField<String> = JsonMissing.of(),
        @JsonProperty("redirect_uri")
        @ExcludeMissing
        private val redirectUri: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun code(): String = code.getRequired("code")

        fun clientId(): Optional<String> = Optional.ofNullable(clientId.getNullable("client_id"))

        fun clientSecret(): Optional<String> =
            Optional.ofNullable(clientSecret.getNullable("client_secret"))

        fun redirectUri(): Optional<String> =
            Optional.ofNullable(redirectUri.getNullable("redirect_uri"))

        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        @JsonProperty("client_id") @ExcludeMissing fun _clientId(): JsonField<String> = clientId

        @JsonProperty("client_secret")
        @ExcludeMissing
        fun _clientSecret(): JsonField<String> = clientSecret

        @JsonProperty("redirect_uri")
        @ExcludeMissing
        fun _redirectUri(): JsonField<String> = redirectUri

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AccessTokenCreateBody = apply {
            if (validated) {
                return@apply
            }

            code()
            clientId()
            clientSecret()
            redirectUri()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AccessTokenCreateBody]. */
        class Builder internal constructor() {

            private var code: JsonField<String>? = null
            private var clientId: JsonField<String> = JsonMissing.of()
            private var clientSecret: JsonField<String> = JsonMissing.of()
            private var redirectUri: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accessTokenCreateBody: AccessTokenCreateBody) = apply {
                code = accessTokenCreateBody.code
                clientId = accessTokenCreateBody.clientId
                clientSecret = accessTokenCreateBody.clientSecret
                redirectUri = accessTokenCreateBody.redirectUri
                additionalProperties = accessTokenCreateBody.additionalProperties.toMutableMap()
            }

            fun code(code: String) = code(JsonField.of(code))

            fun code(code: JsonField<String>) = apply { this.code = code }

            fun clientId(clientId: String) = clientId(JsonField.of(clientId))

            fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

            fun clientSecret(clientSecret: String) = clientSecret(JsonField.of(clientSecret))

            fun clientSecret(clientSecret: JsonField<String>) = apply {
                this.clientSecret = clientSecret
            }

            fun redirectUri(redirectUri: String) = redirectUri(JsonField.of(redirectUri))

            fun redirectUri(redirectUri: JsonField<String>) = apply {
                this.redirectUri = redirectUri
            }

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

            fun build(): AccessTokenCreateBody =
                AccessTokenCreateBody(
                    checkRequired("code", code),
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

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccessTokenCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: AccessTokenCreateBody.Builder = AccessTokenCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accessTokenCreateParams: AccessTokenCreateParams) = apply {
            body = accessTokenCreateParams.body.toBuilder()
            additionalHeaders = accessTokenCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = accessTokenCreateParams.additionalQueryParams.toBuilder()
        }

        fun code(code: String) = apply { body.code(code) }

        fun code(code: JsonField<String>) = apply { body.code(code) }

        fun clientId(clientId: String) = apply { body.clientId(clientId) }

        fun clientId(clientId: JsonField<String>) = apply { body.clientId(clientId) }

        fun clientSecret(clientSecret: String) = apply { body.clientSecret(clientSecret) }

        fun clientSecret(clientSecret: JsonField<String>) = apply {
            body.clientSecret(clientSecret)
        }

        fun redirectUri(redirectUri: String) = apply { body.redirectUri(redirectUri) }

        fun redirectUri(redirectUri: JsonField<String>) = apply { body.redirectUri(redirectUri) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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

        fun build(): AccessTokenCreateParams =
            AccessTokenCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccessTokenCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccessTokenCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

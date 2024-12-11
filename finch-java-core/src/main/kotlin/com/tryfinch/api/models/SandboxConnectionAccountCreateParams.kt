// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import com.tryfinch.api.models.*
import java.util.Objects
import java.util.Optional

class SandboxConnectionAccountCreateParams
constructor(
    private val companyId: String,
    private val providerId: String,
    private val authenticationType: AuthenticationType?,
    private val products: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun companyId(): String = companyId

    fun providerId(): String = providerId

    fun authenticationType(): Optional<AuthenticationType> = Optional.ofNullable(authenticationType)

    fun products(): Optional<List<String>> = Optional.ofNullable(products)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): SandboxConnectionAccountCreateBody {
        return SandboxConnectionAccountCreateBody(
            companyId,
            providerId,
            authenticationType,
            products,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = SandboxConnectionAccountCreateBody.Builder::class)
    @NoAutoDetect
    class SandboxConnectionAccountCreateBody
    internal constructor(
        private val companyId: String?,
        private val providerId: String?,
        private val authenticationType: AuthenticationType?,
        private val products: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("company_id") fun companyId(): String? = companyId

        /** The provider associated with the `access_token` */
        @JsonProperty("provider_id") fun providerId(): String? = providerId

        @JsonProperty("authentication_type")
        fun authenticationType(): AuthenticationType? = authenticationType

        /**
         * Optional, defaults to Organization products (`company`, `directory`, `employment`,
         * `individual`)
         */
        @JsonProperty("products") fun products(): List<String>? = products

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var companyId: String? = null
            private var providerId: String? = null
            private var authenticationType: AuthenticationType? = null
            private var products: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                sandboxConnectionAccountCreateBody: SandboxConnectionAccountCreateBody
            ) = apply {
                this.companyId = sandboxConnectionAccountCreateBody.companyId
                this.providerId = sandboxConnectionAccountCreateBody.providerId
                this.authenticationType = sandboxConnectionAccountCreateBody.authenticationType
                this.products = sandboxConnectionAccountCreateBody.products
                additionalProperties(sandboxConnectionAccountCreateBody.additionalProperties)
            }

            @JsonProperty("company_id")
            fun companyId(companyId: String) = apply { this.companyId = companyId }

            /** The provider associated with the `access_token` */
            @JsonProperty("provider_id")
            fun providerId(providerId: String) = apply { this.providerId = providerId }

            @JsonProperty("authentication_type")
            fun authenticationType(authenticationType: AuthenticationType) = apply {
                this.authenticationType = authenticationType
            }

            /**
             * Optional, defaults to Organization products (`company`, `directory`, `employment`,
             * `individual`)
             */
            @JsonProperty("products")
            fun products(products: List<String>) = apply { this.products = products }

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

            fun build(): SandboxConnectionAccountCreateBody =
                SandboxConnectionAccountCreateBody(
                    checkNotNull(companyId) { "`companyId` is required but was not set" },
                    checkNotNull(providerId) { "`providerId` is required but was not set" },
                    authenticationType,
                    products?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SandboxConnectionAccountCreateBody && companyId == other.companyId && providerId == other.providerId && authenticationType == other.authenticationType && products == other.products && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(companyId, providerId, authenticationType, products, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SandboxConnectionAccountCreateBody{companyId=$companyId, providerId=$providerId, authenticationType=$authenticationType, products=$products, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var companyId: String? = null
        private var providerId: String? = null
        private var authenticationType: AuthenticationType? = null
        private var products: MutableList<String> = mutableListOf()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            sandboxConnectionAccountCreateParams: SandboxConnectionAccountCreateParams
        ) = apply {
            companyId = sandboxConnectionAccountCreateParams.companyId
            providerId = sandboxConnectionAccountCreateParams.providerId
            authenticationType = sandboxConnectionAccountCreateParams.authenticationType
            products =
                sandboxConnectionAccountCreateParams.products?.toMutableList() ?: mutableListOf()
            additionalHeaders = sandboxConnectionAccountCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                sandboxConnectionAccountCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                sandboxConnectionAccountCreateParams.additionalBodyProperties.toMutableMap()
        }

        fun companyId(companyId: String) = apply { this.companyId = companyId }

        /** The provider associated with the `access_token` */
        fun providerId(providerId: String) = apply { this.providerId = providerId }

        fun authenticationType(authenticationType: AuthenticationType) = apply {
            this.authenticationType = authenticationType
        }

        /**
         * Optional, defaults to Organization products (`company`, `directory`, `employment`,
         * `individual`)
         */
        fun products(products: List<String>) = apply {
            this.products.clear()
            this.products.addAll(products)
        }

        /**
         * Optional, defaults to Organization products (`company`, `directory`, `employment`,
         * `individual`)
         */
        fun addProduct(product: String) = apply { this.products.add(product) }

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

        fun build(): SandboxConnectionAccountCreateParams =
            SandboxConnectionAccountCreateParams(
                checkNotNull(companyId) { "`companyId` is required but was not set" },
                checkNotNull(providerId) { "`providerId` is required but was not set" },
                authenticationType,
                products.toImmutable().ifEmpty { null },
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class AuthenticationType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthenticationType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CREDENTIAL = of("credential")

            @JvmField val API_TOKEN = of("api_token")

            @JvmField val OAUTH = of("oauth")

            @JvmField val ASSISTED = of("assisted")

            @JvmStatic fun of(value: String) = AuthenticationType(JsonField.of(value))
        }

        enum class Known {
            CREDENTIAL,
            API_TOKEN,
            OAUTH,
            ASSISTED,
        }

        enum class Value {
            CREDENTIAL,
            API_TOKEN,
            OAUTH,
            ASSISTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREDENTIAL -> Value.CREDENTIAL
                API_TOKEN -> Value.API_TOKEN
                OAUTH -> Value.OAUTH
                ASSISTED -> Value.ASSISTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREDENTIAL -> Known.CREDENTIAL
                API_TOKEN -> Known.API_TOKEN
                OAUTH -> Known.OAUTH
                ASSISTED -> Known.ASSISTED
                else -> throw FinchInvalidDataException("Unknown AuthenticationType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SandboxConnectionAccountCreateParams && companyId == other.companyId && providerId == other.providerId && authenticationType == other.authenticationType && products == other.products && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(companyId, providerId, authenticationType, products, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "SandboxConnectionAccountCreateParams{companyId=$companyId, providerId=$providerId, authenticationType=$authenticationType, products=$products, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}

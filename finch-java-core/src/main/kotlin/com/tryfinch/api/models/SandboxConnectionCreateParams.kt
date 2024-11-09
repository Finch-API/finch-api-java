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

class SandboxConnectionCreateParams
constructor(
    private val providerId: String,
    private val authenticationType: AuthenticationType?,
    private val employeeSize: Long?,
    private val products: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun providerId(): String = providerId

    fun authenticationType(): Optional<AuthenticationType> = Optional.ofNullable(authenticationType)

    fun employeeSize(): Optional<Long> = Optional.ofNullable(employeeSize)

    fun products(): Optional<List<String>> = Optional.ofNullable(products)

    @JvmSynthetic
    internal fun getBody(): SandboxConnectionCreateBody {
        return SandboxConnectionCreateBody(
            providerId,
            authenticationType,
            employeeSize,
            products,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = SandboxConnectionCreateBody.Builder::class)
    @NoAutoDetect
    class SandboxConnectionCreateBody
    internal constructor(
        private val providerId: String?,
        private val authenticationType: AuthenticationType?,
        private val employeeSize: Long?,
        private val products: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The provider associated with the connection */
        @JsonProperty("provider_id") fun providerId(): String? = providerId

        @JsonProperty("authentication_type")
        fun authenticationType(): AuthenticationType? = authenticationType

        /**
         * Optional: the size of the employer to be created with this connection. Defaults to 20.
         * Note that if this is higher than 100, historical payroll data will not be generated, and
         * instead only one pay period will be created.
         */
        @JsonProperty("employee_size") fun employeeSize(): Long? = employeeSize

        @JsonProperty("products") fun products(): List<String>? = products

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var providerId: String? = null
            private var authenticationType: AuthenticationType? = null
            private var employeeSize: Long? = null
            private var products: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sandboxConnectionCreateBody: SandboxConnectionCreateBody) = apply {
                this.providerId = sandboxConnectionCreateBody.providerId
                this.authenticationType = sandboxConnectionCreateBody.authenticationType
                this.employeeSize = sandboxConnectionCreateBody.employeeSize
                this.products = sandboxConnectionCreateBody.products
                additionalProperties(sandboxConnectionCreateBody.additionalProperties)
            }

            /** The provider associated with the connection */
            @JsonProperty("provider_id")
            fun providerId(providerId: String) = apply { this.providerId = providerId }

            @JsonProperty("authentication_type")
            fun authenticationType(authenticationType: AuthenticationType) = apply {
                this.authenticationType = authenticationType
            }

            /**
             * Optional: the size of the employer to be created with this connection. Defaults
             * to 20. Note that if this is higher than 100, historical payroll data will not be
             * generated, and instead only one pay period will be created.
             */
            @JsonProperty("employee_size")
            fun employeeSize(employeeSize: Long) = apply { this.employeeSize = employeeSize }

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

            fun build(): SandboxConnectionCreateBody =
                SandboxConnectionCreateBody(
                    checkNotNull(providerId) { "`providerId` is required but was not set" },
                    authenticationType,
                    employeeSize,
                    products?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SandboxConnectionCreateBody && this.providerId == other.providerId && this.authenticationType == other.authenticationType && this.employeeSize == other.employeeSize && this.products == other.products && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(providerId, authenticationType, employeeSize, products, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "SandboxConnectionCreateBody{providerId=$providerId, authenticationType=$authenticationType, employeeSize=$employeeSize, products=$products, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SandboxConnectionCreateParams && this.providerId == other.providerId && this.authenticationType == other.authenticationType && this.employeeSize == other.employeeSize && this.products == other.products && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(providerId, authenticationType, employeeSize, products, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "SandboxConnectionCreateParams{providerId=$providerId, authenticationType=$authenticationType, employeeSize=$employeeSize, products=$products, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var providerId: String? = null
        private var authenticationType: AuthenticationType? = null
        private var employeeSize: Long? = null
        private var products: MutableList<String> = mutableListOf()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sandboxConnectionCreateParams: SandboxConnectionCreateParams) = apply {
            this.providerId = sandboxConnectionCreateParams.providerId
            this.authenticationType = sandboxConnectionCreateParams.authenticationType
            this.employeeSize = sandboxConnectionCreateParams.employeeSize
            this.products(sandboxConnectionCreateParams.products ?: listOf())
            additionalHeaders(sandboxConnectionCreateParams.additionalHeaders)
            additionalQueryParams(sandboxConnectionCreateParams.additionalQueryParams)
            additionalBodyProperties(sandboxConnectionCreateParams.additionalBodyProperties)
        }

        /** The provider associated with the connection */
        fun providerId(providerId: String) = apply { this.providerId = providerId }

        fun authenticationType(authenticationType: AuthenticationType) = apply {
            this.authenticationType = authenticationType
        }

        /**
         * Optional: the size of the employer to be created with this connection. Defaults to 20.
         * Note that if this is higher than 100, historical payroll data will not be generated, and
         * instead only one pay period will be created.
         */
        fun employeeSize(employeeSize: Long) = apply { this.employeeSize = employeeSize }

        fun products(products: List<String>) = apply {
            this.products.clear()
            this.products.addAll(products)
        }

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

        fun build(): SandboxConnectionCreateParams =
            SandboxConnectionCreateParams(
                checkNotNull(providerId) { "`providerId` is required but was not set" },
                authenticationType,
                employeeSize,
                if (products.size == 0) null else products.toImmutable(),
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

            return /* spotless:off */ other is AuthenticationType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CREDENTIAL = AuthenticationType(JsonField.of("credential"))

            @JvmField val API_TOKEN = AuthenticationType(JsonField.of("api_token"))

            @JvmField val OAUTH = AuthenticationType(JsonField.of("oauth"))

            @JvmField val ASSISTED = AuthenticationType(JsonField.of("assisted"))

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
}

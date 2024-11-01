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
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
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

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

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

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SandboxConnectionCreateParams && this.providerId == other.providerId && this.authenticationType == other.authenticationType && this.employeeSize == other.employeeSize && this.products == other.products && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(providerId, authenticationType, employeeSize, products, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "SandboxConnectionCreateParams{providerId=$providerId, authenticationType=$authenticationType, employeeSize=$employeeSize, products=$products, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sandboxConnectionCreateParams: SandboxConnectionCreateParams) = apply {
            this.providerId = sandboxConnectionCreateParams.providerId
            this.authenticationType = sandboxConnectionCreateParams.authenticationType
            this.employeeSize = sandboxConnectionCreateParams.employeeSize
            this.products(sandboxConnectionCreateParams.products ?: listOf())
            additionalQueryParams(sandboxConnectionCreateParams.additionalQueryParams)
            additionalHeaders(sandboxConnectionCreateParams.additionalHeaders)
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

        fun build(): SandboxConnectionCreateParams =
            SandboxConnectionCreateParams(
                checkNotNull(providerId) { "`providerId` is required but was not set" },
                authenticationType,
                employeeSize,
                if (products.size == 0) null else products.toImmutable(),
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
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

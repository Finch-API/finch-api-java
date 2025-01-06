// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

class SandboxConnectionCreateParams
constructor(
    private val body: SandboxConnectionCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The provider associated with the connection */
    fun providerId(): String = body.providerId()

    fun authenticationType(): Optional<AuthenticationType> = body.authenticationType()

    /**
     * Optional: the size of the employer to be created with this connection. Defaults to 20. Note
     * that if this is higher than 100, historical payroll data will not be generated, and instead
     * only one pay period will be created.
     */
    fun employeeSize(): Optional<Long> = body.employeeSize()

    fun products(): Optional<List<String>> = body.products()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): SandboxConnectionCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class SandboxConnectionCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("provider_id") private val providerId: String,
        @JsonProperty("authentication_type") private val authenticationType: AuthenticationType?,
        @JsonProperty("employee_size") private val employeeSize: Long?,
        @JsonProperty("products") private val products: List<String>?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The provider associated with the connection */
        @JsonProperty("provider_id") fun providerId(): String = providerId

        @JsonProperty("authentication_type")
        fun authenticationType(): Optional<AuthenticationType> =
            Optional.ofNullable(authenticationType)

        /**
         * Optional: the size of the employer to be created with this connection. Defaults to 20.
         * Note that if this is higher than 100, historical payroll data will not be generated, and
         * instead only one pay period will be created.
         */
        @JsonProperty("employee_size")
        fun employeeSize(): Optional<Long> = Optional.ofNullable(employeeSize)

        @JsonProperty("products")
        fun products(): Optional<List<String>> = Optional.ofNullable(products)

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
            private var products: MutableList<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sandboxConnectionCreateBody: SandboxConnectionCreateBody) = apply {
                providerId = sandboxConnectionCreateBody.providerId
                authenticationType = sandboxConnectionCreateBody.authenticationType
                employeeSize = sandboxConnectionCreateBody.employeeSize
                products = sandboxConnectionCreateBody.products?.toMutableList()
                additionalProperties =
                    sandboxConnectionCreateBody.additionalProperties.toMutableMap()
            }

            /** The provider associated with the connection */
            fun providerId(providerId: String) = apply { this.providerId = providerId }

            fun authenticationType(authenticationType: AuthenticationType?) = apply {
                this.authenticationType = authenticationType
            }

            fun authenticationType(authenticationType: Optional<AuthenticationType>) =
                authenticationType(authenticationType.orElse(null))

            /**
             * Optional: the size of the employer to be created with this connection. Defaults
             * to 20. Note that if this is higher than 100, historical payroll data will not be
             * generated, and instead only one pay period will be created.
             */
            fun employeeSize(employeeSize: Long?) = apply { this.employeeSize = employeeSize }

            /**
             * Optional: the size of the employer to be created with this connection. Defaults
             * to 20. Note that if this is higher than 100, historical payroll data will not be
             * generated, and instead only one pay period will be created.
             */
            fun employeeSize(employeeSize: Long) = employeeSize(employeeSize as Long?)

            /**
             * Optional: the size of the employer to be created with this connection. Defaults
             * to 20. Note that if this is higher than 100, historical payroll data will not be
             * generated, and instead only one pay period will be created.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun employeeSize(employeeSize: Optional<Long>) =
                employeeSize(employeeSize.orElse(null) as Long?)

            fun products(products: List<String>?) = apply {
                this.products = products?.toMutableList()
            }

            fun products(products: Optional<List<String>>) = products(products.orElse(null))

            fun addProduct(product: String) = apply {
                products = (products ?: mutableListOf()).apply { add(product) }
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

            return /* spotless:off */ other is SandboxConnectionCreateBody && providerId == other.providerId && authenticationType == other.authenticationType && employeeSize == other.employeeSize && products == other.products && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(providerId, authenticationType, employeeSize, products, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SandboxConnectionCreateBody{providerId=$providerId, authenticationType=$authenticationType, employeeSize=$employeeSize, products=$products, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: SandboxConnectionCreateBody.Builder =
            SandboxConnectionCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sandboxConnectionCreateParams: SandboxConnectionCreateParams) = apply {
            body = sandboxConnectionCreateParams.body.toBuilder()
            additionalHeaders = sandboxConnectionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = sandboxConnectionCreateParams.additionalQueryParams.toBuilder()
        }

        /** The provider associated with the connection */
        fun providerId(providerId: String) = apply { body.providerId(providerId) }

        fun authenticationType(authenticationType: AuthenticationType?) = apply {
            body.authenticationType(authenticationType)
        }

        fun authenticationType(authenticationType: Optional<AuthenticationType>) =
            authenticationType(authenticationType.orElse(null))

        /**
         * Optional: the size of the employer to be created with this connection. Defaults to 20.
         * Note that if this is higher than 100, historical payroll data will not be generated, and
         * instead only one pay period will be created.
         */
        fun employeeSize(employeeSize: Long?) = apply { body.employeeSize(employeeSize) }

        /**
         * Optional: the size of the employer to be created with this connection. Defaults to 20.
         * Note that if this is higher than 100, historical payroll data will not be generated, and
         * instead only one pay period will be created.
         */
        fun employeeSize(employeeSize: Long) = employeeSize(employeeSize as Long?)

        /**
         * Optional: the size of the employer to be created with this connection. Defaults to 20.
         * Note that if this is higher than 100, historical payroll data will not be generated, and
         * instead only one pay period will be created.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun employeeSize(employeeSize: Optional<Long>) =
            employeeSize(employeeSize.orElse(null) as Long?)

        fun products(products: List<String>?) = apply { body.products(products) }

        fun products(products: Optional<List<String>>) = products(products.orElse(null))

        fun addProduct(product: String) = apply { body.addProduct(product) }

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

        fun build(): SandboxConnectionCreateParams =
            SandboxConnectionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class AuthenticationType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthenticationType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SandboxConnectionCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SandboxConnectionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

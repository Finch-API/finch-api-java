// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.Enum
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
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

/** Create a new connection (new company/provider pair) with a new account */
class SandboxConnectionCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

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

    /** The provider associated with the connection */
    fun _providerId(): JsonField<String> = body._providerId()

    fun _authenticationType(): JsonField<AuthenticationType> = body._authenticationType()

    /**
     * Optional: the size of the employer to be created with this connection. Defaults to 20. Note
     * that if this is higher than 100, historical payroll data will not be generated, and instead
     * only one pay period will be created.
     */
    fun _employeeSize(): JsonField<Long> = body._employeeSize()

    fun _products(): JsonField<List<String>> = body._products()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("provider_id")
        @ExcludeMissing
        private val providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authentication_type")
        @ExcludeMissing
        private val authenticationType: JsonField<AuthenticationType> = JsonMissing.of(),
        @JsonProperty("employee_size")
        @ExcludeMissing
        private val employeeSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("products")
        @ExcludeMissing
        private val products: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The provider associated with the connection */
        fun providerId(): String = providerId.getRequired("provider_id")

        fun authenticationType(): Optional<AuthenticationType> =
            Optional.ofNullable(authenticationType.getNullable("authentication_type"))

        /**
         * Optional: the size of the employer to be created with this connection. Defaults to 20.
         * Note that if this is higher than 100, historical payroll data will not be generated, and
         * instead only one pay period will be created.
         */
        fun employeeSize(): Optional<Long> =
            Optional.ofNullable(employeeSize.getNullable("employee_size"))

        fun products(): Optional<List<String>> =
            Optional.ofNullable(products.getNullable("products"))

        /** The provider associated with the connection */
        @JsonProperty("provider_id")
        @ExcludeMissing
        fun _providerId(): JsonField<String> = providerId

        @JsonProperty("authentication_type")
        @ExcludeMissing
        fun _authenticationType(): JsonField<AuthenticationType> = authenticationType

        /**
         * Optional: the size of the employer to be created with this connection. Defaults to 20.
         * Note that if this is higher than 100, historical payroll data will not be generated, and
         * instead only one pay period will be created.
         */
        @JsonProperty("employee_size")
        @ExcludeMissing
        fun _employeeSize(): JsonField<Long> = employeeSize

        @JsonProperty("products")
        @ExcludeMissing
        fun _products(): JsonField<List<String>> = products

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            providerId()
            authenticationType()
            employeeSize()
            products()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var providerId: JsonField<String>? = null
            private var authenticationType: JsonField<AuthenticationType> = JsonMissing.of()
            private var employeeSize: JsonField<Long> = JsonMissing.of()
            private var products: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                providerId = body.providerId
                authenticationType = body.authenticationType
                employeeSize = body.employeeSize
                products = body.products.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The provider associated with the connection */
            fun providerId(providerId: String) = providerId(JsonField.of(providerId))

            /** The provider associated with the connection */
            fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

            fun authenticationType(authenticationType: AuthenticationType) =
                authenticationType(JsonField.of(authenticationType))

            fun authenticationType(authenticationType: JsonField<AuthenticationType>) = apply {
                this.authenticationType = authenticationType
            }

            /**
             * Optional: the size of the employer to be created with this connection. Defaults
             * to 20. Note that if this is higher than 100, historical payroll data will not be
             * generated, and instead only one pay period will be created.
             */
            fun employeeSize(employeeSize: Long) = employeeSize(JsonField.of(employeeSize))

            /**
             * Optional: the size of the employer to be created with this connection. Defaults
             * to 20. Note that if this is higher than 100, historical payroll data will not be
             * generated, and instead only one pay period will be created.
             */
            fun employeeSize(employeeSize: JsonField<Long>) = apply {
                this.employeeSize = employeeSize
            }

            fun products(products: List<String>) = products(JsonField.of(products))

            fun products(products: JsonField<List<String>>) = apply {
                this.products = products.map { it.toMutableList() }
            }

            fun addProduct(product: String) = apply {
                products =
                    (products ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(product)
                    }
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

            fun build(): Body =
                Body(
                    checkRequired("providerId", providerId),
                    authenticationType,
                    employeeSize,
                    (products ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && providerId == other.providerId && authenticationType == other.authenticationType && employeeSize == other.employeeSize && products == other.products && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(providerId, authenticationType, employeeSize, products, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{providerId=$providerId, authenticationType=$authenticationType, employeeSize=$employeeSize, products=$products, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SandboxConnectionCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
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

        /** The provider associated with the connection */
        fun providerId(providerId: JsonField<String>) = apply { body.providerId(providerId) }

        fun authenticationType(authenticationType: AuthenticationType) = apply {
            body.authenticationType(authenticationType)
        }

        fun authenticationType(authenticationType: JsonField<AuthenticationType>) = apply {
            body.authenticationType(authenticationType)
        }

        /**
         * Optional: the size of the employer to be created with this connection. Defaults to 20.
         * Note that if this is higher than 100, historical payroll data will not be generated, and
         * instead only one pay period will be created.
         */
        fun employeeSize(employeeSize: Long) = apply { body.employeeSize(employeeSize) }

        /**
         * Optional: the size of the employer to be created with this connection. Defaults to 20.
         * Note that if this is higher than 100, historical payroll data will not be generated, and
         * instead only one pay period will be created.
         */
        fun employeeSize(employeeSize: JsonField<Long>) = apply { body.employeeSize(employeeSize) }

        fun products(products: List<String>) = apply { body.products(products) }

        fun products(products: JsonField<List<String>>) = apply { body.products(products) }

        fun addProduct(product: String) = apply { body.addProduct(product) }

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

        fun build(): SandboxConnectionCreateParams =
            SandboxConnectionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class AuthenticationType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CREDENTIAL = of("credential")

            @JvmField val API_TOKEN = of("api_token")

            @JvmField val OAUTH = of("oauth")

            @JvmField val ASSISTED = of("assisted")

            @JvmStatic fun of(value: String) = AuthenticationType(JsonField.of(value))
        }

        /** An enum containing [AuthenticationType]'s known values. */
        enum class Known {
            CREDENTIAL,
            API_TOKEN,
            OAUTH,
            ASSISTED,
        }

        /**
         * An enum containing [AuthenticationType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AuthenticationType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDENTIAL,
            API_TOKEN,
            OAUTH,
            ASSISTED,
            /**
             * An enum member indicating that [AuthenticationType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CREDENTIAL -> Value.CREDENTIAL
                API_TOKEN -> Value.API_TOKEN
                OAUTH -> Value.OAUTH
                ASSISTED -> Value.ASSISTED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws FinchInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                CREDENTIAL -> Known.CREDENTIAL
                API_TOKEN -> Known.API_TOKEN
                OAUTH -> Known.OAUTH
                ASSISTED -> Known.ASSISTED
                else -> throw FinchInvalidDataException("Unknown AuthenticationType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws FinchInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { FinchInvalidDataException("Value is not a String") }

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

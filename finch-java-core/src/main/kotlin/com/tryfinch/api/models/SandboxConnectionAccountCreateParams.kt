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
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

/** Create a new account for an existing connection (company/provider pair) */
class SandboxConnectionAccountCreateParams private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    fun companyId(): String = body.companyId()

    /** The provider associated with the `access_token` */
    fun providerId(): String = body.providerId()

    fun authenticationType(): Optional<AuthenticationType> = body.authenticationType()

    /**
     * Optional, defaults to Organization products (`company`, `directory`,
     * `employment`, `individual`)
     */
    fun products(): Optional<List<String>> = body.products()

    fun _companyId(): JsonField<String> = body._companyId()

    /** The provider associated with the `access_token` */
    fun _providerId(): JsonField<String> = body._providerId()

    fun _authenticationType(): JsonField<AuthenticationType> = body._authenticationType()

    /**
     * Optional, defaults to Organization products (`company`, `directory`,
     * `employment`, `individual`)
     */
    fun _products(): JsonField<List<String>> = body._products()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic
    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body @JsonCreator private constructor(
        @JsonProperty("company_id") @ExcludeMissing private val companyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_id") @ExcludeMissing private val providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authentication_type") @ExcludeMissing private val authenticationType: JsonField<AuthenticationType> = JsonMissing.of(),
        @JsonProperty("products") @ExcludeMissing private val products: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        fun companyId(): String = companyId.getRequired("company_id")

        /** The provider associated with the `access_token` */
        fun providerId(): String = providerId.getRequired("provider_id")

        fun authenticationType(): Optional<AuthenticationType> = Optional.ofNullable(authenticationType.getNullable("authentication_type"))

        /**
         * Optional, defaults to Organization products (`company`, `directory`,
         * `employment`, `individual`)
         */
        fun products(): Optional<List<String>> = Optional.ofNullable(products.getNullable("products"))

        @JsonProperty("company_id")
        @ExcludeMissing
        fun _companyId(): JsonField<String> = companyId

        /** The provider associated with the `access_token` */
        @JsonProperty("provider_id")
        @ExcludeMissing
        fun _providerId(): JsonField<String> = providerId

        @JsonProperty("authentication_type")
        @ExcludeMissing
        fun _authenticationType(): JsonField<AuthenticationType> = authenticationType

        /**
         * Optional, defaults to Organization products (`company`, `directory`,
         * `employment`, `individual`)
         */
        @JsonProperty("products")
        @ExcludeMissing
        fun _products(): JsonField<List<String>> = products

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body =
            apply {
                if (validated) {
                  return@apply
                }

                companyId()
                providerId()
                authenticationType()
                products()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             *
             * ```java
             * .companyId()
             * .providerId()
             * ```
             */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var companyId: JsonField<String>? = null
            private var providerId: JsonField<String>? = null
            private var authenticationType: JsonField<AuthenticationType> = JsonMissing.of()
            private var products: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) =
                apply {
                    companyId = body.companyId
                    providerId = body.providerId
                    authenticationType = body.authenticationType
                    products = body.products.map { it.toMutableList() }
                    additionalProperties = body.additionalProperties.toMutableMap()
                }

            fun companyId(companyId: String) = companyId(JsonField.of(companyId))

            fun companyId(companyId: JsonField<String>) =
                apply {
                    this.companyId = companyId
                }

            /** The provider associated with the `access_token` */
            fun providerId(providerId: String) = providerId(JsonField.of(providerId))

            /** The provider associated with the `access_token` */
            fun providerId(providerId: JsonField<String>) =
                apply {
                    this.providerId = providerId
                }

            fun authenticationType(authenticationType: AuthenticationType) = authenticationType(JsonField.of(authenticationType))

            fun authenticationType(authenticationType: JsonField<AuthenticationType>) =
                apply {
                    this.authenticationType = authenticationType
                }

            /**
             * Optional, defaults to Organization products (`company`, `directory`,
             * `employment`, `individual`)
             */
            fun products(products: List<String>) = products(JsonField.of(products))

            /**
             * Optional, defaults to Organization products (`company`, `directory`,
             * `employment`, `individual`)
             */
            fun products(products: JsonField<List<String>>) =
                apply {
                    this.products = products.map { it.toMutableList() }
                }

            /**
             * Optional, defaults to Organization products (`company`, `directory`,
             * `employment`, `individual`)
             */
            fun addProduct(product: String) =
                apply {
                    products = (products ?: JsonField.of(mutableListOf())).also {
                        checkKnown("products", it).add(product)
                    }
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

            fun build(): Body =
                Body(
                  checkRequired(
                    "companyId", companyId
                  ),
                  checkRequired(
                    "providerId", providerId
                  ),
                  authenticationType,
                  (products ?: JsonMissing.of()).map { it.toImmutable() },
                  additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Body && companyId == other.companyId && providerId == other.providerId && authenticationType == other.authenticationType && products == other.products && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(companyId, providerId, authenticationType, products, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{companyId=$companyId, providerId=$providerId, authenticationType=$authenticationType, products=$products, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SandboxConnectionAccountCreateParams].
         *
         * The following fields are required:
         *
         * ```java
         * .companyId()
         * .providerId()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [SandboxConnectionAccountCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sandboxConnectionAccountCreateParams: SandboxConnectionAccountCreateParams) =
            apply {
                body = sandboxConnectionAccountCreateParams.body.toBuilder()
                additionalHeaders = sandboxConnectionAccountCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams = sandboxConnectionAccountCreateParams.additionalQueryParams.toBuilder()
            }

        fun companyId(companyId: String) =
            apply {
                body.companyId(companyId)
            }

        fun companyId(companyId: JsonField<String>) =
            apply {
                body.companyId(companyId)
            }

        /** The provider associated with the `access_token` */
        fun providerId(providerId: String) =
            apply {
                body.providerId(providerId)
            }

        /** The provider associated with the `access_token` */
        fun providerId(providerId: JsonField<String>) =
            apply {
                body.providerId(providerId)
            }

        fun authenticationType(authenticationType: AuthenticationType) =
            apply {
                body.authenticationType(authenticationType)
            }

        fun authenticationType(authenticationType: JsonField<AuthenticationType>) =
            apply {
                body.authenticationType(authenticationType)
            }

        /**
         * Optional, defaults to Organization products (`company`, `directory`,
         * `employment`, `individual`)
         */
        fun products(products: List<String>) =
            apply {
                body.products(products)
            }

        /**
         * Optional, defaults to Organization products (`company`, `directory`,
         * `employment`, `individual`)
         */
        fun products(products: JsonField<List<String>>) =
            apply {
                body.products(products)
            }

        /**
         * Optional, defaults to Organization products (`company`, `directory`,
         * `employment`, `individual`)
         */
        fun addProduct(product: String) =
            apply {
                body.addProduct(product)
            }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.additionalProperties(additionalBodyProperties)
            }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) =
            apply {
                body.putAdditionalProperty(
                  key, value
                )
            }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) =
            apply {
                body.removeAdditionalProperty(key)
            }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) =
            apply {
                body.removeAllAdditionalProperties(keys)
            }

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
                additionalQueryParams.removeAll(keys)
            }

        fun build(): SandboxConnectionAccountCreateParams =
            SandboxConnectionAccountCreateParams(
              body.build(),
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    class AuthenticationType @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that
         * doesn't match any known member, and you want to know that value. For example, if
         * the SDK is on an older version than the API, then the API may respond with new
         * members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

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
         * An enum containing [AuthenticationType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [AuthenticationType] can contain an unknown value in a couple of
         * cases:
         *
         * - It was deserialized from data that doesn't match any known member. For
         *   example, if the SDK is on an older version than the API, then the API may
         *   respond with new members that the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDENTIAL,
            API_TOKEN,
            OAUTH,
            ASSISTED,
            /**
             * An enum member indicating that [AuthenticationType] was instantiated with an
             * unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or
         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if
         * you want to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and
         * don't want to throw for the unknown case.
         *
         * @throws FinchInvalidDataException if this class instance's value is a not a
         * known member.
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
         * This differs from the [toString] method because that method is primarily for
         * debugging and generally doesn't throw.
         *
         * @throws FinchInvalidDataException if this class instance's value does not have
         * the expected primitive type.
         */
        fun asString(): String = _value().asString().orElseThrow { FinchInvalidDataException("Value is not a String") }

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

      return /* spotless:off */ other is SandboxConnectionAccountCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "SandboxConnectionAccountCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

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
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.errors.FinchInvalidDataException
import com.tryfinch.api.models.*
import java.util.Objects
import java.util.Optional

class ConnectSessionReauthenticateParams
constructor(
    private val connectionId: String,
    private val minutesToExpire: Long?,
    private val products: List<ConnectProducts>?,
    private val redirectUri: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun connectionId(): String = connectionId

    fun minutesToExpire(): Optional<Long> = Optional.ofNullable(minutesToExpire)

    fun products(): Optional<List<ConnectProducts>> = Optional.ofNullable(products)

    fun redirectUri(): Optional<String> = Optional.ofNullable(redirectUri)

    @JvmSynthetic
    internal fun getBody(): ConnectSessionReauthenticateBody {
        return ConnectSessionReauthenticateBody(
            connectionId,
            minutesToExpire,
            products,
            redirectUri,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ConnectSessionReauthenticateBody.Builder::class)
    @NoAutoDetect
    class ConnectSessionReauthenticateBody
    internal constructor(
        private val connectionId: String?,
        private val minutesToExpire: Long?,
        private val products: List<ConnectProducts>?,
        private val redirectUri: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The ID of the existing connection to reauthenticate */
        @JsonProperty("connection_id") fun connectionId(): String? = connectionId

        /** The number of minutes until the session expires (defaults to 10,080, which is 7 days) */
        @JsonProperty("minutes_to_expire") fun minutesToExpire(): Long? = minutesToExpire

        /** The products to request access to (optional for reauthentication) */
        @JsonProperty("products") fun products(): List<ConnectProducts>? = products

        /** The URI to redirect to after the Connect flow is completed */
        @JsonProperty("redirect_uri") fun redirectUri(): String? = redirectUri

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConnectSessionReauthenticateBody &&
                this.connectionId == other.connectionId &&
                this.minutesToExpire == other.minutesToExpire &&
                this.products == other.products &&
                this.redirectUri == other.redirectUri &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        connectionId,
                        minutesToExpire,
                        products,
                        redirectUri,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ConnectSessionReauthenticateBody{connectionId=$connectionId, minutesToExpire=$minutesToExpire, products=$products, redirectUri=$redirectUri, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var connectionId: String? = null
            private var minutesToExpire: Long? = null
            private var products: List<ConnectProducts>? = null
            private var redirectUri: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(connectSessionReauthenticateBody: ConnectSessionReauthenticateBody) =
                apply {
                    this.connectionId = connectSessionReauthenticateBody.connectionId
                    this.minutesToExpire = connectSessionReauthenticateBody.minutesToExpire
                    this.products = connectSessionReauthenticateBody.products
                    this.redirectUri = connectSessionReauthenticateBody.redirectUri
                    additionalProperties(connectSessionReauthenticateBody.additionalProperties)
                }

            /** The ID of the existing connection to reauthenticate */
            @JsonProperty("connection_id")
            fun connectionId(connectionId: String) = apply { this.connectionId = connectionId }

            /**
             * The number of minutes until the session expires (defaults to 10,080, which is 7 days)
             */
            @JsonProperty("minutes_to_expire")
            fun minutesToExpire(minutesToExpire: Long) = apply {
                this.minutesToExpire = minutesToExpire
            }

            /** The products to request access to (optional for reauthentication) */
            @JsonProperty("products")
            fun products(products: List<ConnectProducts>) = apply { this.products = products }

            /** The URI to redirect to after the Connect flow is completed */
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

            fun build(): ConnectSessionReauthenticateBody =
                ConnectSessionReauthenticateBody(
                    checkNotNull(connectionId) { "`connectionId` is required but was not set" },
                    minutesToExpire,
                    products?.toUnmodifiable(),
                    redirectUri,
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

        return other is ConnectSessionReauthenticateParams &&
            this.connectionId == other.connectionId &&
            this.minutesToExpire == other.minutesToExpire &&
            this.products == other.products &&
            this.redirectUri == other.redirectUri &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            connectionId,
            minutesToExpire,
            products,
            redirectUri,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "ConnectSessionReauthenticateParams{connectionId=$connectionId, minutesToExpire=$minutesToExpire, products=$products, redirectUri=$redirectUri, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var connectionId: String? = null
        private var minutesToExpire: Long? = null
        private var products: MutableList<ConnectProducts> = mutableListOf()
        private var redirectUri: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(connectSessionReauthenticateParams: ConnectSessionReauthenticateParams) =
            apply {
                this.connectionId = connectSessionReauthenticateParams.connectionId
                this.minutesToExpire = connectSessionReauthenticateParams.minutesToExpire
                this.products(connectSessionReauthenticateParams.products ?: listOf())
                this.redirectUri = connectSessionReauthenticateParams.redirectUri
                additionalQueryParams(connectSessionReauthenticateParams.additionalQueryParams)
                additionalHeaders(connectSessionReauthenticateParams.additionalHeaders)
                additionalBodyProperties(
                    connectSessionReauthenticateParams.additionalBodyProperties
                )
            }

        /** The ID of the existing connection to reauthenticate */
        fun connectionId(connectionId: String) = apply { this.connectionId = connectionId }

        /** The number of minutes until the session expires (defaults to 10,080, which is 7 days) */
        fun minutesToExpire(minutesToExpire: Long) = apply {
            this.minutesToExpire = minutesToExpire
        }

        /** The products to request access to (optional for reauthentication) */
        fun products(products: List<ConnectProducts>) = apply {
            this.products.clear()
            this.products.addAll(products)
        }

        /** The products to request access to (optional for reauthentication) */
        fun addProduct(product: ConnectProducts) = apply { this.products.add(product) }

        /** The URI to redirect to after the Connect flow is completed */
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

        fun build(): ConnectSessionReauthenticateParams =
            ConnectSessionReauthenticateParams(
                checkNotNull(connectionId) { "`connectionId` is required but was not set" },
                minutesToExpire,
                if (products.size == 0) null else products.toUnmodifiable(),
                redirectUri,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class ConnectProducts
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConnectProducts && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val COMPANY = ConnectProducts(JsonField.of("company"))

            @JvmField val DIRECTORY = ConnectProducts(JsonField.of("directory"))

            @JvmField val INDIVIDUAL = ConnectProducts(JsonField.of("individual"))

            @JvmField val EMPLOYMENT = ConnectProducts(JsonField.of("employment"))

            @JvmField val PAYMENT = ConnectProducts(JsonField.of("payment"))

            @JvmField val PAY_STATEMENT = ConnectProducts(JsonField.of("pay_statement"))

            @JvmField val BENEFITS = ConnectProducts(JsonField.of("benefits"))

            @JvmField val SSN = ConnectProducts(JsonField.of("ssn"))

            @JvmStatic fun of(value: String) = ConnectProducts(JsonField.of(value))
        }

        enum class Known {
            COMPANY,
            DIRECTORY,
            INDIVIDUAL,
            EMPLOYMENT,
            PAYMENT,
            PAY_STATEMENT,
            BENEFITS,
            SSN,
        }

        enum class Value {
            COMPANY,
            DIRECTORY,
            INDIVIDUAL,
            EMPLOYMENT,
            PAYMENT,
            PAY_STATEMENT,
            BENEFITS,
            SSN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COMPANY -> Value.COMPANY
                DIRECTORY -> Value.DIRECTORY
                INDIVIDUAL -> Value.INDIVIDUAL
                EMPLOYMENT -> Value.EMPLOYMENT
                PAYMENT -> Value.PAYMENT
                PAY_STATEMENT -> Value.PAY_STATEMENT
                BENEFITS -> Value.BENEFITS
                SSN -> Value.SSN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                COMPANY -> Known.COMPANY
                DIRECTORY -> Known.DIRECTORY
                INDIVIDUAL -> Known.INDIVIDUAL
                EMPLOYMENT -> Known.EMPLOYMENT
                PAYMENT -> Known.PAYMENT
                PAY_STATEMENT -> Known.PAY_STATEMENT
                BENEFITS -> Known.BENEFITS
                SSN -> Known.SSN
                else -> throw FinchInvalidDataException("Unknown ConnectProducts: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}

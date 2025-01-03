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
import java.util.Objects
import java.util.Optional

class ConnectSessionReauthenticateParams
constructor(
    private val connectionId: String,
    private val minutesToExpire: Long?,
    private val products: List<ConnectProducts>?,
    private val redirectUri: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun connectionId(): String = connectionId

    fun minutesToExpire(): Optional<Long> = Optional.ofNullable(minutesToExpire)

    fun products(): Optional<List<ConnectProducts>> = Optional.ofNullable(products)

    fun redirectUri(): Optional<String> = Optional.ofNullable(redirectUri)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

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

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

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

        /** The ID of the existing connection to reauthenticate */
        @JsonProperty("connection_id") fun connectionId(): String? = connectionId

        /**
         * The number of minutes until the session expires (defaults to 20,160, which is 14 days)
         */
        @JsonProperty("minutes_to_expire") fun minutesToExpire(): Long? = minutesToExpire

        /** The products to request access to (optional for reauthentication) */
        @JsonProperty("products") fun products(): List<ConnectProducts>? = products

        /** The URI to redirect to after the Connect flow is completed */
        @JsonProperty("redirect_uri") fun redirectUri(): String? = redirectUri

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

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
             * The number of minutes until the session expires (defaults to 20,160, which is 14
             * days)
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
                    products?.toImmutable(),
                    redirectUri,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ConnectSessionReauthenticateBody && connectionId == other.connectionId && minutesToExpire == other.minutesToExpire && products == other.products && redirectUri == other.redirectUri && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(connectionId, minutesToExpire, products, redirectUri, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConnectSessionReauthenticateBody{connectionId=$connectionId, minutesToExpire=$minutesToExpire, products=$products, redirectUri=$redirectUri, additionalProperties=$additionalProperties}"
    }

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
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(connectSessionReauthenticateParams: ConnectSessionReauthenticateParams) =
            apply {
                connectionId = connectSessionReauthenticateParams.connectionId
                minutesToExpire = connectSessionReauthenticateParams.minutesToExpire
                products =
                    connectSessionReauthenticateParams.products?.toMutableList() ?: mutableListOf()
                redirectUri = connectSessionReauthenticateParams.redirectUri
                additionalHeaders = connectSessionReauthenticateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    connectSessionReauthenticateParams.additionalQueryParams.toBuilder()
                additionalBodyProperties =
                    connectSessionReauthenticateParams.additionalBodyProperties.toMutableMap()
            }

        /** The ID of the existing connection to reauthenticate */
        fun connectionId(connectionId: String) = apply { this.connectionId = connectionId }

        /**
         * The number of minutes until the session expires (defaults to 20,160, which is 14 days)
         */
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

        fun build(): ConnectSessionReauthenticateParams =
            ConnectSessionReauthenticateParams(
                checkNotNull(connectionId) { "`connectionId` is required but was not set" },
                minutesToExpire,
                products.toImmutable().ifEmpty { null },
                redirectUri,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class ConnectProducts
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val COMPANY = of("company")

            @JvmField val DIRECTORY = of("directory")

            @JvmField val INDIVIDUAL = of("individual")

            @JvmField val EMPLOYMENT = of("employment")

            @JvmField val PAYMENT = of("payment")

            @JvmField val PAY_STATEMENT = of("pay_statement")

            @JvmField val BENEFITS = of("benefits")

            @JvmField val SSN = of("ssn")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ConnectProducts && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConnectSessionReauthenticateParams && connectionId == other.connectionId && minutesToExpire == other.minutesToExpire && products == other.products && redirectUri == other.redirectUri && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(connectionId, minutesToExpire, products, redirectUri, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ConnectSessionReauthenticateParams{connectionId=$connectionId, minutesToExpire=$minutesToExpire, products=$products, redirectUri=$redirectUri, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}

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
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

/** Create a new Connect session for reauthenticating an existing connection */
class ConnectSessionReauthenticateParams
constructor(
    private val body: ConnectSessionReauthenticateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The ID of the existing connection to reauthenticate */
    fun connectionId(): String = body.connectionId()

    /** The number of minutes until the session expires (defaults to 20,160, which is 14 days) */
    fun minutesToExpire(): Optional<Long> = body.minutesToExpire()

    /** The products to request access to (optional for reauthentication) */
    fun products(): Optional<List<ConnectProducts>> = body.products()

    /** The URI to redirect to after the Connect flow is completed */
    fun redirectUri(): Optional<String> = body.redirectUri()

    /** The ID of the existing connection to reauthenticate */
    fun _connectionId(): JsonField<String> = body._connectionId()

    /** The number of minutes until the session expires (defaults to 20,160, which is 14 days) */
    fun _minutesToExpire(): JsonField<Long> = body._minutesToExpire()

    /** The products to request access to (optional for reauthentication) */
    fun _products(): JsonField<List<ConnectProducts>> = body._products()

    /** The URI to redirect to after the Connect flow is completed */
    fun _redirectUri(): JsonField<String> = body._redirectUri()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): ConnectSessionReauthenticateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ConnectSessionReauthenticateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("connection_id")
        @ExcludeMissing
        private val connectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("minutes_to_expire")
        @ExcludeMissing
        private val minutesToExpire: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("products")
        @ExcludeMissing
        private val products: JsonField<List<ConnectProducts>> = JsonMissing.of(),
        @JsonProperty("redirect_uri")
        @ExcludeMissing
        private val redirectUri: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The ID of the existing connection to reauthenticate */
        fun connectionId(): String = connectionId.getRequired("connection_id")

        /**
         * The number of minutes until the session expires (defaults to 20,160, which is 14 days)
         */
        fun minutesToExpire(): Optional<Long> =
            Optional.ofNullable(minutesToExpire.getNullable("minutes_to_expire"))

        /** The products to request access to (optional for reauthentication) */
        fun products(): Optional<List<ConnectProducts>> =
            Optional.ofNullable(products.getNullable("products"))

        /** The URI to redirect to after the Connect flow is completed */
        fun redirectUri(): Optional<String> =
            Optional.ofNullable(redirectUri.getNullable("redirect_uri"))

        /** The ID of the existing connection to reauthenticate */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun _connectionId(): JsonField<String> = connectionId

        /**
         * The number of minutes until the session expires (defaults to 20,160, which is 14 days)
         */
        @JsonProperty("minutes_to_expire")
        @ExcludeMissing
        fun _minutesToExpire(): JsonField<Long> = minutesToExpire

        /** The products to request access to (optional for reauthentication) */
        @JsonProperty("products")
        @ExcludeMissing
        fun _products(): JsonField<List<ConnectProducts>> = products

        /** The URI to redirect to after the Connect flow is completed */
        @JsonProperty("redirect_uri")
        @ExcludeMissing
        fun _redirectUri(): JsonField<String> = redirectUri

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ConnectSessionReauthenticateBody = apply {
            if (validated) {
                return@apply
            }

            connectionId()
            minutesToExpire()
            products()
            redirectUri()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var connectionId: JsonField<String>? = null
            private var minutesToExpire: JsonField<Long> = JsonMissing.of()
            private var products: JsonField<MutableList<ConnectProducts>>? = null
            private var redirectUri: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(connectSessionReauthenticateBody: ConnectSessionReauthenticateBody) =
                apply {
                    connectionId = connectSessionReauthenticateBody.connectionId
                    minutesToExpire = connectSessionReauthenticateBody.minutesToExpire
                    products = connectSessionReauthenticateBody.products.map { it.toMutableList() }
                    redirectUri = connectSessionReauthenticateBody.redirectUri
                    additionalProperties =
                        connectSessionReauthenticateBody.additionalProperties.toMutableMap()
                }

            /** The ID of the existing connection to reauthenticate */
            fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

            /** The ID of the existing connection to reauthenticate */
            fun connectionId(connectionId: JsonField<String>) = apply {
                this.connectionId = connectionId
            }

            /**
             * The number of minutes until the session expires (defaults to 20,160, which is 14
             * days)
             */
            fun minutesToExpire(minutesToExpire: Long?) =
                minutesToExpire(JsonField.ofNullable(minutesToExpire))

            /**
             * The number of minutes until the session expires (defaults to 20,160, which is 14
             * days)
             */
            fun minutesToExpire(minutesToExpire: Long) = minutesToExpire(minutesToExpire as Long?)

            /**
             * The number of minutes until the session expires (defaults to 20,160, which is 14
             * days)
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun minutesToExpire(minutesToExpire: Optional<Long>) =
                minutesToExpire(minutesToExpire.orElse(null) as Long?)

            /**
             * The number of minutes until the session expires (defaults to 20,160, which is 14
             * days)
             */
            fun minutesToExpire(minutesToExpire: JsonField<Long>) = apply {
                this.minutesToExpire = minutesToExpire
            }

            /** The products to request access to (optional for reauthentication) */
            fun products(products: List<ConnectProducts>?) =
                products(JsonField.ofNullable(products))

            /** The products to request access to (optional for reauthentication) */
            fun products(products: Optional<List<ConnectProducts>>) =
                products(products.orElse(null))

            /** The products to request access to (optional for reauthentication) */
            fun products(products: JsonField<List<ConnectProducts>>) = apply {
                this.products = products.map { it.toMutableList() }
            }

            /** The products to request access to (optional for reauthentication) */
            fun addProduct(product: ConnectProducts) = apply {
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

            /** The URI to redirect to after the Connect flow is completed */
            fun redirectUri(redirectUri: String?) = redirectUri(JsonField.ofNullable(redirectUri))

            /** The URI to redirect to after the Connect flow is completed */
            fun redirectUri(redirectUri: Optional<String>) = redirectUri(redirectUri.orElse(null))

            /** The URI to redirect to after the Connect flow is completed */
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

            fun build(): ConnectSessionReauthenticateBody =
                ConnectSessionReauthenticateBody(
                    checkNotNull(connectionId) { "`connectionId` is required but was not set" },
                    minutesToExpire,
                    (products ?: JsonMissing.of()).map { it.toImmutable() },
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

        private var body: ConnectSessionReauthenticateBody.Builder =
            ConnectSessionReauthenticateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(connectSessionReauthenticateParams: ConnectSessionReauthenticateParams) =
            apply {
                body = connectSessionReauthenticateParams.body.toBuilder()
                additionalHeaders = connectSessionReauthenticateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    connectSessionReauthenticateParams.additionalQueryParams.toBuilder()
            }

        /** The ID of the existing connection to reauthenticate */
        fun connectionId(connectionId: String) = apply { body.connectionId(connectionId) }

        /** The ID of the existing connection to reauthenticate */
        fun connectionId(connectionId: JsonField<String>) = apply {
            body.connectionId(connectionId)
        }

        /**
         * The number of minutes until the session expires (defaults to 20,160, which is 14 days)
         */
        fun minutesToExpire(minutesToExpire: Long?) = apply {
            body.minutesToExpire(minutesToExpire)
        }

        /**
         * The number of minutes until the session expires (defaults to 20,160, which is 14 days)
         */
        fun minutesToExpire(minutesToExpire: Long) = minutesToExpire(minutesToExpire as Long?)

        /**
         * The number of minutes until the session expires (defaults to 20,160, which is 14 days)
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun minutesToExpire(minutesToExpire: Optional<Long>) =
            minutesToExpire(minutesToExpire.orElse(null) as Long?)

        /**
         * The number of minutes until the session expires (defaults to 20,160, which is 14 days)
         */
        fun minutesToExpire(minutesToExpire: JsonField<Long>) = apply {
            body.minutesToExpire(minutesToExpire)
        }

        /** The products to request access to (optional for reauthentication) */
        fun products(products: List<ConnectProducts>?) = apply { body.products(products) }

        /** The products to request access to (optional for reauthentication) */
        fun products(products: Optional<List<ConnectProducts>>) = products(products.orElse(null))

        /** The products to request access to (optional for reauthentication) */
        fun products(products: JsonField<List<ConnectProducts>>) = apply { body.products(products) }

        /** The products to request access to (optional for reauthentication) */
        fun addProduct(product: ConnectProducts) = apply { body.addProduct(product) }

        /** The URI to redirect to after the Connect flow is completed */
        fun redirectUri(redirectUri: String?) = apply { body.redirectUri(redirectUri) }

        /** The URI to redirect to after the Connect flow is completed */
        fun redirectUri(redirectUri: Optional<String>) = redirectUri(redirectUri.orElse(null))

        /** The URI to redirect to after the Connect flow is completed */
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

        fun build(): ConnectSessionReauthenticateParams =
            ConnectSessionReauthenticateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

        return /* spotless:off */ other is ConnectSessionReauthenticateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ConnectSessionReauthenticateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

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

class ConnectSessionNewParams
constructor(
    private val customerId: String,
    private val customerName: String,
    private val products: List<ConnectProducts>,
    private val customerEmail: String?,
    private val integration: Integration?,
    private val manual: Boolean?,
    private val minutesToExpire: Double?,
    private val redirectUri: String?,
    private val sandbox: Sandbox?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun customerId(): String = customerId

    fun customerName(): String = customerName

    fun products(): List<ConnectProducts> = products

    fun customerEmail(): Optional<String> = Optional.ofNullable(customerEmail)

    fun integration(): Optional<Integration> = Optional.ofNullable(integration)

    fun manual(): Optional<Boolean> = Optional.ofNullable(manual)

    fun minutesToExpire(): Optional<Double> = Optional.ofNullable(minutesToExpire)

    fun redirectUri(): Optional<String> = Optional.ofNullable(redirectUri)

    fun sandbox(): Optional<Sandbox> = Optional.ofNullable(sandbox)

    @JvmSynthetic
    internal fun getBody(): ConnectSessionNewBody {
        return ConnectSessionNewBody(
            customerId,
            customerName,
            products,
            customerEmail,
            integration,
            manual,
            minutesToExpire,
            redirectUri,
            sandbox,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = ConnectSessionNewBody.Builder::class)
    @NoAutoDetect
    class ConnectSessionNewBody
    internal constructor(
        private val customerId: String?,
        private val customerName: String?,
        private val products: List<ConnectProducts>?,
        private val customerEmail: String?,
        private val integration: Integration?,
        private val manual: Boolean?,
        private val minutesToExpire: Double?,
        private val redirectUri: String?,
        private val sandbox: Sandbox?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("customer_id") fun customerId(): String? = customerId

        @JsonProperty("customer_name") fun customerName(): String? = customerName

        @JsonProperty("products") fun products(): List<ConnectProducts>? = products

        @JsonProperty("customer_email") fun customerEmail(): String? = customerEmail

        @JsonProperty("integration") fun integration(): Integration? = integration

        @JsonProperty("manual") fun manual(): Boolean? = manual

        /**
         * The number of minutes until the session expires (defaults to 20,160, which is 14 days)
         */
        @JsonProperty("minutes_to_expire") fun minutesToExpire(): Double? = minutesToExpire

        @JsonProperty("redirect_uri") fun redirectUri(): String? = redirectUri

        @JsonProperty("sandbox") fun sandbox(): Sandbox? = sandbox

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var customerId: String? = null
            private var customerName: String? = null
            private var products: List<ConnectProducts>? = null
            private var customerEmail: String? = null
            private var integration: Integration? = null
            private var manual: Boolean? = null
            private var minutesToExpire: Double? = null
            private var redirectUri: String? = null
            private var sandbox: Sandbox? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(connectSessionNewBody: ConnectSessionNewBody) = apply {
                this.customerId = connectSessionNewBody.customerId
                this.customerName = connectSessionNewBody.customerName
                this.products = connectSessionNewBody.products
                this.customerEmail = connectSessionNewBody.customerEmail
                this.integration = connectSessionNewBody.integration
                this.manual = connectSessionNewBody.manual
                this.minutesToExpire = connectSessionNewBody.minutesToExpire
                this.redirectUri = connectSessionNewBody.redirectUri
                this.sandbox = connectSessionNewBody.sandbox
                additionalProperties(connectSessionNewBody.additionalProperties)
            }

            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            @JsonProperty("customer_name")
            fun customerName(customerName: String) = apply { this.customerName = customerName }

            @JsonProperty("products")
            fun products(products: List<ConnectProducts>) = apply { this.products = products }

            @JsonProperty("customer_email")
            fun customerEmail(customerEmail: String) = apply { this.customerEmail = customerEmail }

            @JsonProperty("integration")
            fun integration(integration: Integration) = apply { this.integration = integration }

            @JsonProperty("manual") fun manual(manual: Boolean) = apply { this.manual = manual }

            /**
             * The number of minutes until the session expires (defaults to 20,160, which is 14
             * days)
             */
            @JsonProperty("minutes_to_expire")
            fun minutesToExpire(minutesToExpire: Double) = apply {
                this.minutesToExpire = minutesToExpire
            }

            @JsonProperty("redirect_uri")
            fun redirectUri(redirectUri: String) = apply { this.redirectUri = redirectUri }

            @JsonProperty("sandbox")
            fun sandbox(sandbox: Sandbox) = apply { this.sandbox = sandbox }

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

            fun build(): ConnectSessionNewBody =
                ConnectSessionNewBody(
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    checkNotNull(customerName) { "`customerName` is required but was not set" },
                    checkNotNull(products) { "`products` is required but was not set" }
                        .toImmutable(),
                    customerEmail,
                    integration,
                    manual,
                    minutesToExpire,
                    redirectUri,
                    sandbox,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ConnectSessionNewBody && customerId == other.customerId && customerName == other.customerName && products == other.products && customerEmail == other.customerEmail && integration == other.integration && manual == other.manual && minutesToExpire == other.minutesToExpire && redirectUri == other.redirectUri && sandbox == other.sandbox && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customerId, customerName, products, customerEmail, integration, manual, minutesToExpire, redirectUri, sandbox, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConnectSessionNewBody{customerId=$customerId, customerName=$customerName, products=$products, customerEmail=$customerEmail, integration=$integration, manual=$manual, minutesToExpire=$minutesToExpire, redirectUri=$redirectUri, sandbox=$sandbox, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConnectSessionNewParams && customerId == other.customerId && customerName == other.customerName && products == other.products && customerEmail == other.customerEmail && integration == other.integration && manual == other.manual && minutesToExpire == other.minutesToExpire && redirectUri == other.redirectUri && sandbox == other.sandbox && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, customerName, products, customerEmail, integration, manual, minutesToExpire, redirectUri, sandbox, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ConnectSessionNewParams{customerId=$customerId, customerName=$customerName, products=$products, customerEmail=$customerEmail, integration=$integration, manual=$manual, minutesToExpire=$minutesToExpire, redirectUri=$redirectUri, sandbox=$sandbox, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var customerName: String? = null
        private var products: MutableList<ConnectProducts> = mutableListOf()
        private var customerEmail: String? = null
        private var integration: Integration? = null
        private var manual: Boolean? = null
        private var minutesToExpire: Double? = null
        private var redirectUri: String? = null
        private var sandbox: Sandbox? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(connectSessionNewParams: ConnectSessionNewParams) = apply {
            this.customerId = connectSessionNewParams.customerId
            this.customerName = connectSessionNewParams.customerName
            this.products(connectSessionNewParams.products)
            this.customerEmail = connectSessionNewParams.customerEmail
            this.integration = connectSessionNewParams.integration
            this.manual = connectSessionNewParams.manual
            this.minutesToExpire = connectSessionNewParams.minutesToExpire
            this.redirectUri = connectSessionNewParams.redirectUri
            this.sandbox = connectSessionNewParams.sandbox
            additionalHeaders(connectSessionNewParams.additionalHeaders)
            additionalQueryParams(connectSessionNewParams.additionalQueryParams)
            additionalBodyProperties(connectSessionNewParams.additionalBodyProperties)
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun customerName(customerName: String) = apply { this.customerName = customerName }

        fun products(products: List<ConnectProducts>) = apply {
            this.products.clear()
            this.products.addAll(products)
        }

        fun addProduct(product: ConnectProducts) = apply { this.products.add(product) }

        fun customerEmail(customerEmail: String) = apply { this.customerEmail = customerEmail }

        fun integration(integration: Integration) = apply { this.integration = integration }

        fun manual(manual: Boolean) = apply { this.manual = manual }

        /**
         * The number of minutes until the session expires (defaults to 20,160, which is 14 days)
         */
        fun minutesToExpire(minutesToExpire: Double) = apply {
            this.minutesToExpire = minutesToExpire
        }

        fun redirectUri(redirectUri: String) = apply { this.redirectUri = redirectUri }

        fun sandbox(sandbox: Sandbox) = apply { this.sandbox = sandbox }

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

        fun build(): ConnectSessionNewParams =
            ConnectSessionNewParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(customerName) { "`customerName` is required but was not set" },
                checkNotNull(products) { "`products` is required but was not set" }.toImmutable(),
                customerEmail,
                integration,
                manual,
                minutesToExpire,
                redirectUri,
                sandbox,
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ConnectProducts && value == other.value /* spotless:on */
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

    @JsonDeserialize(builder = Integration.Builder::class)
    @NoAutoDetect
    class Integration
    private constructor(
        private val provider: String?,
        private val authMethod: AuthMethod?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("provider") fun provider(): String? = provider

        @JsonProperty("auth_method") fun authMethod(): AuthMethod? = authMethod

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var provider: String? = null
            private var authMethod: AuthMethod? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(integration: Integration) = apply {
                this.provider = integration.provider
                this.authMethod = integration.authMethod
                additionalProperties(integration.additionalProperties)
            }

            @JsonProperty("provider")
            fun provider(provider: String) = apply { this.provider = provider }

            @JsonProperty("auth_method")
            fun authMethod(authMethod: AuthMethod) = apply { this.authMethod = authMethod }

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

            fun build(): Integration =
                Integration(
                    provider,
                    authMethod,
                    additionalProperties.toImmutable(),
                )
        }

        class AuthMethod
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AuthMethod && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ASSISTED = AuthMethod(JsonField.of("assisted"))

                @JvmField val CREDENTIAL = AuthMethod(JsonField.of("credential"))

                @JvmField val OAUTH = AuthMethod(JsonField.of("oauth"))

                @JvmField val API_TOKEN = AuthMethod(JsonField.of("api_token"))

                @JvmStatic fun of(value: String) = AuthMethod(JsonField.of(value))
            }

            enum class Known {
                ASSISTED,
                CREDENTIAL,
                OAUTH,
                API_TOKEN,
            }

            enum class Value {
                ASSISTED,
                CREDENTIAL,
                OAUTH,
                API_TOKEN,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ASSISTED -> Value.ASSISTED
                    CREDENTIAL -> Value.CREDENTIAL
                    OAUTH -> Value.OAUTH
                    API_TOKEN -> Value.API_TOKEN
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ASSISTED -> Known.ASSISTED
                    CREDENTIAL -> Known.CREDENTIAL
                    OAUTH -> Known.OAUTH
                    API_TOKEN -> Known.API_TOKEN
                    else -> throw FinchInvalidDataException("Unknown AuthMethod: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Integration && provider == other.provider && authMethod == other.authMethod && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(provider, authMethod, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Integration{provider=$provider, authMethod=$authMethod, additionalProperties=$additionalProperties}"
    }

    class Sandbox
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Sandbox && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val FINCH = Sandbox(JsonField.of("finch"))

            @JvmField val PROVIDER = Sandbox(JsonField.of("provider"))

            @JvmStatic fun of(value: String) = Sandbox(JsonField.of(value))
        }

        enum class Known {
            FINCH,
            PROVIDER,
        }

        enum class Value {
            FINCH,
            PROVIDER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FINCH -> Value.FINCH
                PROVIDER -> Value.PROVIDER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                FINCH -> Known.FINCH
                PROVIDER -> Known.PROVIDER
                else -> throw FinchInvalidDataException("Unknown Sandbox: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}

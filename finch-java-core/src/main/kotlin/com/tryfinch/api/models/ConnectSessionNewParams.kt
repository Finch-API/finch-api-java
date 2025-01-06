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

class ConnectSessionNewParams
constructor(
    private val body: ConnectSessionNewBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun customerId(): String = body.customerId()

    fun customerName(): String = body.customerName()

    fun products(): List<ConnectProducts> = body.products()

    fun customerEmail(): Optional<String> = body.customerEmail()

    fun integration(): Optional<Integration> = body.integration()

    fun manual(): Optional<Boolean> = body.manual()

    /** The number of minutes until the session expires (defaults to 20,160, which is 14 days) */
    fun minutesToExpire(): Optional<Double> = body.minutesToExpire()

    fun redirectUri(): Optional<String> = body.redirectUri()

    fun sandbox(): Optional<Sandbox> = body.sandbox()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): ConnectSessionNewBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ConnectSessionNewBody
    @JsonCreator
    internal constructor(
        @JsonProperty("customer_id") private val customerId: String,
        @JsonProperty("customer_name") private val customerName: String,
        @JsonProperty("products") private val products: List<ConnectProducts>,
        @JsonProperty("customer_email") private val customerEmail: String?,
        @JsonProperty("integration") private val integration: Integration?,
        @JsonProperty("manual") private val manual: Boolean?,
        @JsonProperty("minutes_to_expire") private val minutesToExpire: Double?,
        @JsonProperty("redirect_uri") private val redirectUri: String?,
        @JsonProperty("sandbox") private val sandbox: Sandbox?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("customer_id") fun customerId(): String = customerId

        @JsonProperty("customer_name") fun customerName(): String = customerName

        @JsonProperty("products") fun products(): List<ConnectProducts> = products

        @JsonProperty("customer_email")
        fun customerEmail(): Optional<String> = Optional.ofNullable(customerEmail)

        @JsonProperty("integration")
        fun integration(): Optional<Integration> = Optional.ofNullable(integration)

        @JsonProperty("manual") fun manual(): Optional<Boolean> = Optional.ofNullable(manual)

        /**
         * The number of minutes until the session expires (defaults to 20,160, which is 14 days)
         */
        @JsonProperty("minutes_to_expire")
        fun minutesToExpire(): Optional<Double> = Optional.ofNullable(minutesToExpire)

        @JsonProperty("redirect_uri")
        fun redirectUri(): Optional<String> = Optional.ofNullable(redirectUri)

        @JsonProperty("sandbox") fun sandbox(): Optional<Sandbox> = Optional.ofNullable(sandbox)

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
            private var products: MutableList<ConnectProducts>? = null
            private var customerEmail: String? = null
            private var integration: Integration? = null
            private var manual: Boolean? = null
            private var minutesToExpire: Double? = null
            private var redirectUri: String? = null
            private var sandbox: Sandbox? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(connectSessionNewBody: ConnectSessionNewBody) = apply {
                customerId = connectSessionNewBody.customerId
                customerName = connectSessionNewBody.customerName
                products = connectSessionNewBody.products.toMutableList()
                customerEmail = connectSessionNewBody.customerEmail
                integration = connectSessionNewBody.integration
                manual = connectSessionNewBody.manual
                minutesToExpire = connectSessionNewBody.minutesToExpire
                redirectUri = connectSessionNewBody.redirectUri
                sandbox = connectSessionNewBody.sandbox
                additionalProperties = connectSessionNewBody.additionalProperties.toMutableMap()
            }

            fun customerId(customerId: String) = apply { this.customerId = customerId }

            fun customerName(customerName: String) = apply { this.customerName = customerName }

            fun products(products: List<ConnectProducts>) = apply {
                this.products = products.toMutableList()
            }

            fun addProduct(product: ConnectProducts) = apply {
                products = (products ?: mutableListOf()).apply { add(product) }
            }

            fun customerEmail(customerEmail: String) = apply { this.customerEmail = customerEmail }

            fun integration(integration: Integration) = apply { this.integration = integration }

            fun manual(manual: Boolean) = apply { this.manual = manual }

            /**
             * The number of minutes until the session expires (defaults to 20,160, which is 14
             * days)
             */
            fun minutesToExpire(minutesToExpire: Double) = apply {
                this.minutesToExpire = minutesToExpire
            }

            fun redirectUri(redirectUri: String) = apply { this.redirectUri = redirectUri }

            fun sandbox(sandbox: Sandbox) = apply { this.sandbox = sandbox }

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

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: ConnectSessionNewBody.Builder = ConnectSessionNewBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(connectSessionNewParams: ConnectSessionNewParams) = apply {
            body = connectSessionNewParams.body.toBuilder()
            additionalHeaders = connectSessionNewParams.additionalHeaders.toBuilder()
            additionalQueryParams = connectSessionNewParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        fun customerName(customerName: String) = apply { body.customerName(customerName) }

        fun products(products: List<ConnectProducts>) = apply { body.products(products) }

        fun addProduct(product: ConnectProducts) = apply { body.addProduct(product) }

        fun customerEmail(customerEmail: String) = apply { body.customerEmail(customerEmail) }

        fun integration(integration: Integration) = apply { body.integration(integration) }

        fun manual(manual: Boolean) = apply { body.manual(manual) }

        /**
         * The number of minutes until the session expires (defaults to 20,160, which is 14 days)
         */
        fun minutesToExpire(minutesToExpire: Double) = apply {
            body.minutesToExpire(minutesToExpire)
        }

        fun redirectUri(redirectUri: String) = apply { body.redirectUri(redirectUri) }

        fun sandbox(sandbox: Sandbox) = apply { body.sandbox(sandbox) }

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

        fun build(): ConnectSessionNewParams =
            ConnectSessionNewParams(
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

    @NoAutoDetect
    class Integration
    @JsonCreator
    private constructor(
        @JsonProperty("auth_method") private val authMethod: AuthMethod?,
        @JsonProperty("provider") private val provider: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("auth_method")
        fun authMethod(): Optional<AuthMethod> = Optional.ofNullable(authMethod)

        @JsonProperty("provider") fun provider(): Optional<String> = Optional.ofNullable(provider)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var authMethod: AuthMethod? = null
            private var provider: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(integration: Integration) = apply {
                authMethod = integration.authMethod
                provider = integration.provider
                additionalProperties = integration.additionalProperties.toMutableMap()
            }

            fun authMethod(authMethod: AuthMethod) = apply { this.authMethod = authMethod }

            fun provider(provider: String) = apply { this.provider = provider }

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

            fun build(): Integration =
                Integration(
                    authMethod,
                    provider,
                    additionalProperties.toImmutable(),
                )
        }

        class AuthMethod
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ASSISTED = of("assisted")

                @JvmField val CREDENTIAL = of("credential")

                @JvmField val OAUTH = of("oauth")

                @JvmField val API_TOKEN = of("api_token")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AuthMethod && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Integration && authMethod == other.authMethod && provider == other.provider && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(authMethod, provider, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Integration{authMethod=$authMethod, provider=$provider, additionalProperties=$additionalProperties}"
    }

    class Sandbox
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val FINCH = of("finch")

            @JvmField val PROVIDER = of("provider")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Sandbox && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConnectSessionNewParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ConnectSessionNewParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

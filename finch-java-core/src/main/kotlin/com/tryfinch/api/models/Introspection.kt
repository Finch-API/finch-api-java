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
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = Introspection.Builder::class)
@NoAutoDetect
class Introspection
private constructor(
    private val connectionId: JsonField<String>,
    private val connectionStatus: JsonField<ConnectionStatus>,
    private val clientId: JsonField<String>,
    private val clientType: JsonField<ClientType>,
    private val connectionType: JsonField<ConnectionType>,
    private val companyId: JsonField<String>,
    private val accountId: JsonField<String>,
    private val customerId: JsonField<String>,
    private val customerName: JsonField<String>,
    private val customerEmail: JsonField<String>,
    private val authenticationMethods: JsonField<List<AuthenticationMethod>>,
    private val products: JsonField<List<String>>,
    private val username: JsonField<String>,
    private val providerId: JsonField<String>,
    private val payrollProviderId: JsonField<String>,
    private val manual: JsonField<Boolean>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The Finch UUID of the connection associated with the `access_token`. */
    fun connectionId(): String = connectionId.getRequired("connection_id")

    fun connectionStatus(): ConnectionStatus = connectionStatus.getRequired("connection_status")

    /** The client ID of the application associated with the `access_token`. */
    fun clientId(): String = clientId.getRequired("client_id")

    /** The type of application associated with a token. */
    fun clientType(): ClientType = clientType.getRequired("client_type")

    /**
     * The type of the connection associated with the token.
     * - `provider` - connection to an external provider
     * - `finch` - finch-generated data.
     */
    fun connectionType(): ConnectionType = connectionType.getRequired("connection_type")

    /**
     * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of this
     * company ID.
     */
    fun companyId(): String = companyId.getRequired("company_id")

    /**
     * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of this
     * account ID.
     */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The ID of your customer you provided to Finch when a connect session was created for this
     * connection.
     */
    fun customerId(): Optional<String> = Optional.ofNullable(customerId.getNullable("customer_id"))

    /**
     * The name of your customer you provided to Finch when a connect session was created for this
     * connection.
     */
    fun customerName(): Optional<String> =
        Optional.ofNullable(customerName.getNullable("customer_name"))

    /**
     * The email of your customer you provided to Finch when a connect session was created for this
     * connection.
     */
    fun customerEmail(): Optional<String> =
        Optional.ofNullable(customerEmail.getNullable("customer_email"))

    fun authenticationMethods(): List<AuthenticationMethod> =
        authenticationMethods.getRequired("authentication_methods")

    /** An array of the authorized products associated with the `access_token`. */
    fun products(): List<String> = products.getRequired("products")

    /** The account username used for login associated with the `access_token`. */
    fun username(): String = username.getRequired("username")

    /** The ID of the provider associated with the `access_token`. */
    fun providerId(): String = providerId.getRequired("provider_id")

    /**
     * [DEPRECATED] Use `provider_id` to identify the provider instead of this payroll provider ID.
     */
    fun payrollProviderId(): String = payrollProviderId.getRequired("payroll_provider_id")

    /**
     * Whether the connection associated with the `access_token` uses the Assisted Connect Flow.
     * (`true` if using Assisted Connect, `false` if connection is automated)
     */
    fun manual(): Boolean = manual.getRequired("manual")

    /** The Finch UUID of the connection associated with the `access_token`. */
    @JsonProperty("connection_id") @ExcludeMissing fun _connectionId() = connectionId

    @JsonProperty("connection_status") @ExcludeMissing fun _connectionStatus() = connectionStatus

    /** The client ID of the application associated with the `access_token`. */
    @JsonProperty("client_id") @ExcludeMissing fun _clientId() = clientId

    /** The type of application associated with a token. */
    @JsonProperty("client_type") @ExcludeMissing fun _clientType() = clientType

    /**
     * The type of the connection associated with the token.
     * - `provider` - connection to an external provider
     * - `finch` - finch-generated data.
     */
    @JsonProperty("connection_type") @ExcludeMissing fun _connectionType() = connectionType

    /**
     * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of this
     * company ID.
     */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId() = companyId

    /**
     * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of this
     * account ID.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /**
     * The ID of your customer you provided to Finch when a connect session was created for this
     * connection.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId() = customerId

    /**
     * The name of your customer you provided to Finch when a connect session was created for this
     * connection.
     */
    @JsonProperty("customer_name") @ExcludeMissing fun _customerName() = customerName

    /**
     * The email of your customer you provided to Finch when a connect session was created for this
     * connection.
     */
    @JsonProperty("customer_email") @ExcludeMissing fun _customerEmail() = customerEmail

    @JsonProperty("authentication_methods")
    @ExcludeMissing
    fun _authenticationMethods() = authenticationMethods

    /** An array of the authorized products associated with the `access_token`. */
    @JsonProperty("products") @ExcludeMissing fun _products() = products

    /** The account username used for login associated with the `access_token`. */
    @JsonProperty("username") @ExcludeMissing fun _username() = username

    /** The ID of the provider associated with the `access_token`. */
    @JsonProperty("provider_id") @ExcludeMissing fun _providerId() = providerId

    /**
     * [DEPRECATED] Use `provider_id` to identify the provider instead of this payroll provider ID.
     */
    @JsonProperty("payroll_provider_id")
    @ExcludeMissing
    fun _payrollProviderId() = payrollProviderId

    /**
     * Whether the connection associated with the `access_token` uses the Assisted Connect Flow.
     * (`true` if using Assisted Connect, `false` if connection is automated)
     */
    @JsonProperty("manual") @ExcludeMissing fun _manual() = manual

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Introspection = apply {
        if (!validated) {
            connectionId()
            connectionStatus().validate()
            clientId()
            clientType()
            connectionType()
            companyId()
            accountId()
            customerId()
            customerName()
            customerEmail()
            authenticationMethods().forEach { it.validate() }
            products()
            username()
            providerId()
            payrollProviderId()
            manual()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var connectionId: JsonField<String> = JsonMissing.of()
        private var connectionStatus: JsonField<ConnectionStatus> = JsonMissing.of()
        private var clientId: JsonField<String> = JsonMissing.of()
        private var clientType: JsonField<ClientType> = JsonMissing.of()
        private var connectionType: JsonField<ConnectionType> = JsonMissing.of()
        private var companyId: JsonField<String> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var customerId: JsonField<String> = JsonMissing.of()
        private var customerName: JsonField<String> = JsonMissing.of()
        private var customerEmail: JsonField<String> = JsonMissing.of()
        private var authenticationMethods: JsonField<List<AuthenticationMethod>> = JsonMissing.of()
        private var products: JsonField<List<String>> = JsonMissing.of()
        private var username: JsonField<String> = JsonMissing.of()
        private var providerId: JsonField<String> = JsonMissing.of()
        private var payrollProviderId: JsonField<String> = JsonMissing.of()
        private var manual: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(introspection: Introspection) = apply {
            this.connectionId = introspection.connectionId
            this.connectionStatus = introspection.connectionStatus
            this.clientId = introspection.clientId
            this.clientType = introspection.clientType
            this.connectionType = introspection.connectionType
            this.companyId = introspection.companyId
            this.accountId = introspection.accountId
            this.customerId = introspection.customerId
            this.customerName = introspection.customerName
            this.customerEmail = introspection.customerEmail
            this.authenticationMethods = introspection.authenticationMethods
            this.products = introspection.products
            this.username = introspection.username
            this.providerId = introspection.providerId
            this.payrollProviderId = introspection.payrollProviderId
            this.manual = introspection.manual
            additionalProperties(introspection.additionalProperties)
        }

        /** The Finch UUID of the connection associated with the `access_token`. */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /** The Finch UUID of the connection associated with the `access_token`. */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        fun connectionStatus(connectionStatus: ConnectionStatus) =
            connectionStatus(JsonField.of(connectionStatus))

        @JsonProperty("connection_status")
        @ExcludeMissing
        fun connectionStatus(connectionStatus: JsonField<ConnectionStatus>) = apply {
            this.connectionStatus = connectionStatus
        }

        /** The client ID of the application associated with the `access_token`. */
        fun clientId(clientId: String) = clientId(JsonField.of(clientId))

        /** The client ID of the application associated with the `access_token`. */
        @JsonProperty("client_id")
        @ExcludeMissing
        fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

        /** The type of application associated with a token. */
        fun clientType(clientType: ClientType) = clientType(JsonField.of(clientType))

        /** The type of application associated with a token. */
        @JsonProperty("client_type")
        @ExcludeMissing
        fun clientType(clientType: JsonField<ClientType>) = apply { this.clientType = clientType }

        /**
         * The type of the connection associated with the token.
         * - `provider` - connection to an external provider
         * - `finch` - finch-generated data.
         */
        fun connectionType(connectionType: ConnectionType) =
            connectionType(JsonField.of(connectionType))

        /**
         * The type of the connection associated with the token.
         * - `provider` - connection to an external provider
         * - `finch` - finch-generated data.
         */
        @JsonProperty("connection_type")
        @ExcludeMissing
        fun connectionType(connectionType: JsonField<ConnectionType>) = apply {
            this.connectionType = connectionType
        }

        /**
         * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of
         * this company ID.
         */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /**
         * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of
         * this company ID.
         */
        @JsonProperty("company_id")
        @ExcludeMissing
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /**
         * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of
         * this account ID.
         */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of
         * this account ID.
         */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * The ID of your customer you provided to Finch when a connect session was created for this
         * connection.
         */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * The ID of your customer you provided to Finch when a connect session was created for this
         * connection.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /**
         * The name of your customer you provided to Finch when a connect session was created for
         * this connection.
         */
        fun customerName(customerName: String) = customerName(JsonField.of(customerName))

        /**
         * The name of your customer you provided to Finch when a connect session was created for
         * this connection.
         */
        @JsonProperty("customer_name")
        @ExcludeMissing
        fun customerName(customerName: JsonField<String>) = apply {
            this.customerName = customerName
        }

        /**
         * The email of your customer you provided to Finch when a connect session was created for
         * this connection.
         */
        fun customerEmail(customerEmail: String) = customerEmail(JsonField.of(customerEmail))

        /**
         * The email of your customer you provided to Finch when a connect session was created for
         * this connection.
         */
        @JsonProperty("customer_email")
        @ExcludeMissing
        fun customerEmail(customerEmail: JsonField<String>) = apply {
            this.customerEmail = customerEmail
        }

        fun authenticationMethods(authenticationMethods: List<AuthenticationMethod>) =
            authenticationMethods(JsonField.of(authenticationMethods))

        @JsonProperty("authentication_methods")
        @ExcludeMissing
        fun authenticationMethods(authenticationMethods: JsonField<List<AuthenticationMethod>>) =
            apply {
                this.authenticationMethods = authenticationMethods
            }

        /** An array of the authorized products associated with the `access_token`. */
        fun products(products: List<String>) = products(JsonField.of(products))

        /** An array of the authorized products associated with the `access_token`. */
        @JsonProperty("products")
        @ExcludeMissing
        fun products(products: JsonField<List<String>>) = apply { this.products = products }

        /** The account username used for login associated with the `access_token`. */
        fun username(username: String) = username(JsonField.of(username))

        /** The account username used for login associated with the `access_token`. */
        @JsonProperty("username")
        @ExcludeMissing
        fun username(username: JsonField<String>) = apply { this.username = username }

        /** The ID of the provider associated with the `access_token`. */
        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        /** The ID of the provider associated with the `access_token`. */
        @JsonProperty("provider_id")
        @ExcludeMissing
        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        /**
         * [DEPRECATED] Use `provider_id` to identify the provider instead of this payroll provider
         * ID.
         */
        fun payrollProviderId(payrollProviderId: String) =
            payrollProviderId(JsonField.of(payrollProviderId))

        /**
         * [DEPRECATED] Use `provider_id` to identify the provider instead of this payroll provider
         * ID.
         */
        @JsonProperty("payroll_provider_id")
        @ExcludeMissing
        fun payrollProviderId(payrollProviderId: JsonField<String>) = apply {
            this.payrollProviderId = payrollProviderId
        }

        /**
         * Whether the connection associated with the `access_token` uses the Assisted Connect Flow.
         * (`true` if using Assisted Connect, `false` if connection is automated)
         */
        fun manual(manual: Boolean) = manual(JsonField.of(manual))

        /**
         * Whether the connection associated with the `access_token` uses the Assisted Connect Flow.
         * (`true` if using Assisted Connect, `false` if connection is automated)
         */
        @JsonProperty("manual")
        @ExcludeMissing
        fun manual(manual: JsonField<Boolean>) = apply { this.manual = manual }

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

        fun build(): Introspection =
            Introspection(
                connectionId,
                connectionStatus,
                clientId,
                clientType,
                connectionType,
                companyId,
                accountId,
                customerId,
                customerName,
                customerEmail,
                authenticationMethods.map { it.toImmutable() },
                products.map { it.toImmutable() },
                username,
                providerId,
                payrollProviderId,
                manual,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = AuthenticationMethod.Builder::class)
    @NoAutoDetect
    class AuthenticationMethod
    private constructor(
        private val type: JsonField<Type>,
        private val connectionStatus: JsonField<ConnectionStatus>,
        private val products: JsonField<List<String>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The type of authentication method. */
        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        fun connectionStatus(): Optional<ConnectionStatus> =
            Optional.ofNullable(connectionStatus.getNullable("connection_status"))

        /** An array of the authorized products associated with the `access_token`. */
        fun products(): Optional<List<String>> =
            Optional.ofNullable(products.getNullable("products"))

        /** The type of authentication method. */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonProperty("connection_status")
        @ExcludeMissing
        fun _connectionStatus() = connectionStatus

        /** An array of the authorized products associated with the `access_token`. */
        @JsonProperty("products") @ExcludeMissing fun _products() = products

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AuthenticationMethod = apply {
            if (!validated) {
                type()
                connectionStatus().map { it.validate() }
                products()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: JsonField<Type> = JsonMissing.of()
            private var connectionStatus: JsonField<ConnectionStatus> = JsonMissing.of()
            private var products: JsonField<List<String>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authenticationMethod: AuthenticationMethod) = apply {
                this.type = authenticationMethod.type
                this.connectionStatus = authenticationMethod.connectionStatus
                this.products = authenticationMethod.products
                additionalProperties(authenticationMethod.additionalProperties)
            }

            /** The type of authentication method. */
            fun type(type: Type) = type(JsonField.of(type))

            /** The type of authentication method. */
            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun connectionStatus(connectionStatus: ConnectionStatus) =
                connectionStatus(JsonField.of(connectionStatus))

            @JsonProperty("connection_status")
            @ExcludeMissing
            fun connectionStatus(connectionStatus: JsonField<ConnectionStatus>) = apply {
                this.connectionStatus = connectionStatus
            }

            /** An array of the authorized products associated with the `access_token`. */
            fun products(products: List<String>) = products(JsonField.of(products))

            /** An array of the authorized products associated with the `access_token`. */
            @JsonProperty("products")
            @ExcludeMissing
            fun products(products: JsonField<List<String>>) = apply { this.products = products }

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

            fun build(): AuthenticationMethod =
                AuthenticationMethod(
                    type,
                    connectionStatus,
                    products.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = ConnectionStatus.Builder::class)
        @NoAutoDetect
        class ConnectionStatus
        private constructor(
            private val status: JsonField<ConnectionStatusType>,
            private val message: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun status(): Optional<ConnectionStatusType> =
                Optional.ofNullable(status.getNullable("status"))

            fun message(): Optional<String> = Optional.ofNullable(message.getNullable("message"))

            @JsonProperty("status") @ExcludeMissing fun _status() = status

            @JsonProperty("message") @ExcludeMissing fun _message() = message

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ConnectionStatus = apply {
                if (!validated) {
                    status()
                    message()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var status: JsonField<ConnectionStatusType> = JsonMissing.of()
                private var message: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(connectionStatus: ConnectionStatus) = apply {
                    this.status = connectionStatus.status
                    this.message = connectionStatus.message
                    additionalProperties(connectionStatus.additionalProperties)
                }

                fun status(status: ConnectionStatusType) = status(JsonField.of(status))

                @JsonProperty("status")
                @ExcludeMissing
                fun status(status: JsonField<ConnectionStatusType>) = apply { this.status = status }

                fun message(message: String) = message(JsonField.of(message))

                @JsonProperty("message")
                @ExcludeMissing
                fun message(message: JsonField<String>) = apply { this.message = message }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ConnectionStatus =
                    ConnectionStatus(
                        status,
                        message,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ConnectionStatus && status == other.status && message == other.message && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(status, message, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ConnectionStatus{status=$status, message=$message, additionalProperties=$additionalProperties}"
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ASSISTED = of("assisted")

                @JvmField val CREDENTIAL = of("credential")

                @JvmField val API_TOKEN = of("api_token")

                @JvmField val API_CREDENTIAL = of("api_credential")

                @JvmField val OAUTH = of("oauth")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                ASSISTED,
                CREDENTIAL,
                API_TOKEN,
                API_CREDENTIAL,
                OAUTH,
            }

            enum class Value {
                ASSISTED,
                CREDENTIAL,
                API_TOKEN,
                API_CREDENTIAL,
                OAUTH,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ASSISTED -> Value.ASSISTED
                    CREDENTIAL -> Value.CREDENTIAL
                    API_TOKEN -> Value.API_TOKEN
                    API_CREDENTIAL -> Value.API_CREDENTIAL
                    OAUTH -> Value.OAUTH
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ASSISTED -> Known.ASSISTED
                    CREDENTIAL -> Known.CREDENTIAL
                    API_TOKEN -> Known.API_TOKEN
                    API_CREDENTIAL -> Known.API_CREDENTIAL
                    OAUTH -> Known.OAUTH
                    else -> throw FinchInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthenticationMethod && type == other.type && connectionStatus == other.connectionStatus && products == other.products && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, connectionStatus, products, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AuthenticationMethod{type=$type, connectionStatus=$connectionStatus, products=$products, additionalProperties=$additionalProperties}"
    }

    class ClientType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PRODUCTION = of("production")

            @JvmField val DEVELOPMENT = of("development")

            @JvmField val SANDBOX = of("sandbox")

            @JvmStatic fun of(value: String) = ClientType(JsonField.of(value))
        }

        enum class Known {
            PRODUCTION,
            DEVELOPMENT,
            SANDBOX,
        }

        enum class Value {
            PRODUCTION,
            DEVELOPMENT,
            SANDBOX,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PRODUCTION -> Value.PRODUCTION
                DEVELOPMENT -> Value.DEVELOPMENT
                SANDBOX -> Value.SANDBOX
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PRODUCTION -> Known.PRODUCTION
                DEVELOPMENT -> Known.DEVELOPMENT
                SANDBOX -> Known.SANDBOX
                else -> throw FinchInvalidDataException("Unknown ClientType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ClientType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(builder = ConnectionStatus.Builder::class)
    @NoAutoDetect
    class ConnectionStatus
    private constructor(
        private val status: JsonField<ConnectionStatusType>,
        private val message: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun status(): Optional<ConnectionStatusType> =
            Optional.ofNullable(status.getNullable("status"))

        fun message(): Optional<String> = Optional.ofNullable(message.getNullable("message"))

        @JsonProperty("status") @ExcludeMissing fun _status() = status

        @JsonProperty("message") @ExcludeMissing fun _message() = message

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ConnectionStatus = apply {
            if (!validated) {
                status()
                message()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var status: JsonField<ConnectionStatusType> = JsonMissing.of()
            private var message: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(connectionStatus: ConnectionStatus) = apply {
                this.status = connectionStatus.status
                this.message = connectionStatus.message
                additionalProperties(connectionStatus.additionalProperties)
            }

            fun status(status: ConnectionStatusType) = status(JsonField.of(status))

            @JsonProperty("status")
            @ExcludeMissing
            fun status(status: JsonField<ConnectionStatusType>) = apply { this.status = status }

            fun message(message: String) = message(JsonField.of(message))

            @JsonProperty("message")
            @ExcludeMissing
            fun message(message: JsonField<String>) = apply { this.message = message }

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

            fun build(): ConnectionStatus =
                ConnectionStatus(
                    status,
                    message,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ConnectionStatus && status == other.status && message == other.message && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(status, message, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConnectionStatus{status=$status, message=$message, additionalProperties=$additionalProperties}"
    }

    class ConnectionType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PROVIDER = of("provider")

            @JvmField val FINCH = of("finch")

            @JvmStatic fun of(value: String) = ConnectionType(JsonField.of(value))
        }

        enum class Known {
            PROVIDER,
            FINCH,
        }

        enum class Value {
            PROVIDER,
            FINCH,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PROVIDER -> Value.PROVIDER
                FINCH -> Value.FINCH
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PROVIDER -> Known.PROVIDER
                FINCH -> Known.FINCH
                else -> throw FinchInvalidDataException("Unknown ConnectionType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ConnectionType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Introspection && connectionId == other.connectionId && connectionStatus == other.connectionStatus && clientId == other.clientId && clientType == other.clientType && connectionType == other.connectionType && companyId == other.companyId && accountId == other.accountId && customerId == other.customerId && customerName == other.customerName && customerEmail == other.customerEmail && authenticationMethods == other.authenticationMethods && products == other.products && username == other.username && providerId == other.providerId && payrollProviderId == other.payrollProviderId && manual == other.manual && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(connectionId, connectionStatus, clientId, clientType, connectionType, companyId, accountId, customerId, customerName, customerEmail, authenticationMethods, products, username, providerId, payrollProviderId, manual, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Introspection{connectionId=$connectionId, connectionStatus=$connectionStatus, clientId=$clientId, clientType=$clientType, connectionType=$connectionType, companyId=$companyId, accountId=$accountId, customerId=$customerId, customerName=$customerName, customerEmail=$customerEmail, authenticationMethods=$authenticationMethods, products=$products, username=$username, providerId=$providerId, payrollProviderId=$payrollProviderId, manual=$manual, additionalProperties=$additionalProperties}"
}

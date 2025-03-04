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
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Introspection
@JsonCreator
private constructor(
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("authentication_methods")
    @ExcludeMissing
    private val authenticationMethods: JsonField<List<AuthenticationMethod>> = JsonMissing.of(),
    @JsonProperty("client_id")
    @ExcludeMissing
    private val clientId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("client_type")
    @ExcludeMissing
    private val clientType: JsonField<ClientType> = JsonMissing.of(),
    @JsonProperty("company_id")
    @ExcludeMissing
    private val companyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("connection_id")
    @ExcludeMissing
    private val connectionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("connection_status")
    @ExcludeMissing
    private val connectionStatus: JsonField<ConnectionStatus> = JsonMissing.of(),
    @JsonProperty("connection_type")
    @ExcludeMissing
    private val connectionType: JsonField<ConnectionType> = JsonMissing.of(),
    @JsonProperty("customer_email")
    @ExcludeMissing
    private val customerEmail: JsonField<String> = JsonMissing.of(),
    @JsonProperty("customer_id")
    @ExcludeMissing
    private val customerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("customer_name")
    @ExcludeMissing
    private val customerName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("manual")
    @ExcludeMissing
    private val manual: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("payroll_provider_id")
    @ExcludeMissing
    private val payrollProviderId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("products")
    @ExcludeMissing
    private val products: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("provider_id")
    @ExcludeMissing
    private val providerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("username")
    @ExcludeMissing
    private val username: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of this
     * account ID.
     */
    @Deprecated("deprecated") fun accountId(): String = accountId.getRequired("account_id")

    fun authenticationMethods(): List<AuthenticationMethod> =
        authenticationMethods.getRequired("authentication_methods")

    /** The client ID of the application associated with the `access_token`. */
    fun clientId(): String = clientId.getRequired("client_id")

    /** The type of application associated with a token. */
    fun clientType(): ClientType = clientType.getRequired("client_type")

    /**
     * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of this
     * company ID.
     */
    @Deprecated("deprecated") fun companyId(): String = companyId.getRequired("company_id")

    /** The Finch UUID of the connection associated with the `access_token`. */
    fun connectionId(): String = connectionId.getRequired("connection_id")

    fun connectionStatus(): ConnectionStatus = connectionStatus.getRequired("connection_status")

    /**
     * The type of the connection associated with the token.
     * - `provider` - connection to an external provider
     * - `finch` - finch-generated data.
     */
    fun connectionType(): ConnectionType = connectionType.getRequired("connection_type")

    /**
     * The email of your customer you provided to Finch when a connect session was created for this
     * connection.
     */
    fun customerEmail(): Optional<String> =
        Optional.ofNullable(customerEmail.getNullable("customer_email"))

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
     * Whether the connection associated with the `access_token` uses the Assisted Connect Flow.
     * (`true` if using Assisted Connect, `false` if connection is automated)
     */
    fun manual(): Boolean = manual.getRequired("manual")

    /**
     * [DEPRECATED] Use `provider_id` to identify the provider instead of this payroll provider ID.
     */
    @Deprecated("deprecated")
    fun payrollProviderId(): String = payrollProviderId.getRequired("payroll_provider_id")

    /** An array of the authorized products associated with the `access_token`. */
    fun products(): List<String> = products.getRequired("products")

    /** The ID of the provider associated with the `access_token`. */
    fun providerId(): String = providerId.getRequired("provider_id")

    /** The account username used for login associated with the `access_token`. */
    fun username(): String = username.getRequired("username")

    /**
     * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of this
     * account ID.
     */
    @Deprecated("deprecated")
    @JsonProperty("account_id")
    @ExcludeMissing
    fun _accountId(): JsonField<String> = accountId

    @JsonProperty("authentication_methods")
    @ExcludeMissing
    fun _authenticationMethods(): JsonField<List<AuthenticationMethod>> = authenticationMethods

    /** The client ID of the application associated with the `access_token`. */
    @JsonProperty("client_id") @ExcludeMissing fun _clientId(): JsonField<String> = clientId

    /** The type of application associated with a token. */
    @JsonProperty("client_type")
    @ExcludeMissing
    fun _clientType(): JsonField<ClientType> = clientType

    /**
     * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of this
     * company ID.
     */
    @Deprecated("deprecated")
    @JsonProperty("company_id")
    @ExcludeMissing
    fun _companyId(): JsonField<String> = companyId

    /** The Finch UUID of the connection associated with the `access_token`. */
    @JsonProperty("connection_id")
    @ExcludeMissing
    fun _connectionId(): JsonField<String> = connectionId

    @JsonProperty("connection_status")
    @ExcludeMissing
    fun _connectionStatus(): JsonField<ConnectionStatus> = connectionStatus

    /**
     * The type of the connection associated with the token.
     * - `provider` - connection to an external provider
     * - `finch` - finch-generated data.
     */
    @JsonProperty("connection_type")
    @ExcludeMissing
    fun _connectionType(): JsonField<ConnectionType> = connectionType

    /**
     * The email of your customer you provided to Finch when a connect session was created for this
     * connection.
     */
    @JsonProperty("customer_email")
    @ExcludeMissing
    fun _customerEmail(): JsonField<String> = customerEmail

    /**
     * The ID of your customer you provided to Finch when a connect session was created for this
     * connection.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * The name of your customer you provided to Finch when a connect session was created for this
     * connection.
     */
    @JsonProperty("customer_name")
    @ExcludeMissing
    fun _customerName(): JsonField<String> = customerName

    /**
     * Whether the connection associated with the `access_token` uses the Assisted Connect Flow.
     * (`true` if using Assisted Connect, `false` if connection is automated)
     */
    @JsonProperty("manual") @ExcludeMissing fun _manual(): JsonField<Boolean> = manual

    /**
     * [DEPRECATED] Use `provider_id` to identify the provider instead of this payroll provider ID.
     */
    @Deprecated("deprecated")
    @JsonProperty("payroll_provider_id")
    @ExcludeMissing
    fun _payrollProviderId(): JsonField<String> = payrollProviderId

    /** An array of the authorized products associated with the `access_token`. */
    @JsonProperty("products") @ExcludeMissing fun _products(): JsonField<List<String>> = products

    /** The ID of the provider associated with the `access_token`. */
    @JsonProperty("provider_id") @ExcludeMissing fun _providerId(): JsonField<String> = providerId

    /** The account username used for login associated with the `access_token`. */
    @JsonProperty("username") @ExcludeMissing fun _username(): JsonField<String> = username

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Introspection = apply {
        if (validated) {
            return@apply
        }

        accountId()
        authenticationMethods().forEach { it.validate() }
        clientId()
        clientType()
        companyId()
        connectionId()
        connectionStatus().validate()
        connectionType()
        customerEmail()
        customerId()
        customerName()
        manual()
        payrollProviderId()
        products()
        providerId()
        username()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Introspection].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .authenticationMethods()
         * .clientId()
         * .clientType()
         * .companyId()
         * .connectionId()
         * .connectionStatus()
         * .connectionType()
         * .customerEmail()
         * .customerId()
         * .customerName()
         * .manual()
         * .payrollProviderId()
         * .products()
         * .providerId()
         * .username()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Introspection]. */
    class Builder internal constructor() {

        private var accountId: JsonField<String>? = null
        private var authenticationMethods: JsonField<MutableList<AuthenticationMethod>>? = null
        private var clientId: JsonField<String>? = null
        private var clientType: JsonField<ClientType>? = null
        private var companyId: JsonField<String>? = null
        private var connectionId: JsonField<String>? = null
        private var connectionStatus: JsonField<ConnectionStatus>? = null
        private var connectionType: JsonField<ConnectionType>? = null
        private var customerEmail: JsonField<String>? = null
        private var customerId: JsonField<String>? = null
        private var customerName: JsonField<String>? = null
        private var manual: JsonField<Boolean>? = null
        private var payrollProviderId: JsonField<String>? = null
        private var products: JsonField<MutableList<String>>? = null
        private var providerId: JsonField<String>? = null
        private var username: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(introspection: Introspection) = apply {
            accountId = introspection.accountId
            authenticationMethods = introspection.authenticationMethods.map { it.toMutableList() }
            clientId = introspection.clientId
            clientType = introspection.clientType
            companyId = introspection.companyId
            connectionId = introspection.connectionId
            connectionStatus = introspection.connectionStatus
            connectionType = introspection.connectionType
            customerEmail = introspection.customerEmail
            customerId = introspection.customerId
            customerName = introspection.customerName
            manual = introspection.manual
            payrollProviderId = introspection.payrollProviderId
            products = introspection.products.map { it.toMutableList() }
            providerId = introspection.providerId
            username = introspection.username
            additionalProperties = introspection.additionalProperties.toMutableMap()
        }

        /**
         * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of
         * this account ID.
         */
        @Deprecated("deprecated")
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of
         * this account ID.
         */
        @Deprecated("deprecated")
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        fun authenticationMethods(authenticationMethods: List<AuthenticationMethod>) =
            authenticationMethods(JsonField.of(authenticationMethods))

        fun authenticationMethods(authenticationMethods: JsonField<List<AuthenticationMethod>>) =
            apply {
                this.authenticationMethods = authenticationMethods.map { it.toMutableList() }
            }

        fun addAuthenticationMethod(authenticationMethod: AuthenticationMethod) = apply {
            authenticationMethods =
                (authenticationMethods ?: JsonField.of(mutableListOf())).also {
                    checkKnown("authenticationMethods", it).add(authenticationMethod)
                }
        }

        /** The client ID of the application associated with the `access_token`. */
        fun clientId(clientId: String) = clientId(JsonField.of(clientId))

        /** The client ID of the application associated with the `access_token`. */
        fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

        /** The type of application associated with a token. */
        fun clientType(clientType: ClientType) = clientType(JsonField.of(clientType))

        /** The type of application associated with a token. */
        fun clientType(clientType: JsonField<ClientType>) = apply { this.clientType = clientType }

        /**
         * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of
         * this company ID.
         */
        @Deprecated("deprecated")
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /**
         * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of
         * this company ID.
         */
        @Deprecated("deprecated")
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /** The Finch UUID of the connection associated with the `access_token`. */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /** The Finch UUID of the connection associated with the `access_token`. */
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        fun connectionStatus(connectionStatus: ConnectionStatus) =
            connectionStatus(JsonField.of(connectionStatus))

        fun connectionStatus(connectionStatus: JsonField<ConnectionStatus>) = apply {
            this.connectionStatus = connectionStatus
        }

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
        fun connectionType(connectionType: JsonField<ConnectionType>) = apply {
            this.connectionType = connectionType
        }

        /**
         * The email of your customer you provided to Finch when a connect session was created for
         * this connection.
         */
        fun customerEmail(customerEmail: String?) =
            customerEmail(JsonField.ofNullable(customerEmail))

        /**
         * The email of your customer you provided to Finch when a connect session was created for
         * this connection.
         */
        fun customerEmail(customerEmail: Optional<String>) =
            customerEmail(customerEmail.orElse(null))

        /**
         * The email of your customer you provided to Finch when a connect session was created for
         * this connection.
         */
        fun customerEmail(customerEmail: JsonField<String>) = apply {
            this.customerEmail = customerEmail
        }

        /**
         * The ID of your customer you provided to Finch when a connect session was created for this
         * connection.
         */
        fun customerId(customerId: String?) = customerId(JsonField.ofNullable(customerId))

        /**
         * The ID of your customer you provided to Finch when a connect session was created for this
         * connection.
         */
        fun customerId(customerId: Optional<String>) = customerId(customerId.orElse(null))

        /**
         * The ID of your customer you provided to Finch when a connect session was created for this
         * connection.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /**
         * The name of your customer you provided to Finch when a connect session was created for
         * this connection.
         */
        fun customerName(customerName: String?) = customerName(JsonField.ofNullable(customerName))

        /**
         * The name of your customer you provided to Finch when a connect session was created for
         * this connection.
         */
        fun customerName(customerName: Optional<String>) = customerName(customerName.orElse(null))

        /**
         * The name of your customer you provided to Finch when a connect session was created for
         * this connection.
         */
        fun customerName(customerName: JsonField<String>) = apply {
            this.customerName = customerName
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
        fun manual(manual: JsonField<Boolean>) = apply { this.manual = manual }

        /**
         * [DEPRECATED] Use `provider_id` to identify the provider instead of this payroll provider
         * ID.
         */
        @Deprecated("deprecated")
        fun payrollProviderId(payrollProviderId: String) =
            payrollProviderId(JsonField.of(payrollProviderId))

        /**
         * [DEPRECATED] Use `provider_id` to identify the provider instead of this payroll provider
         * ID.
         */
        @Deprecated("deprecated")
        fun payrollProviderId(payrollProviderId: JsonField<String>) = apply {
            this.payrollProviderId = payrollProviderId
        }

        /** An array of the authorized products associated with the `access_token`. */
        fun products(products: List<String>) = products(JsonField.of(products))

        /** An array of the authorized products associated with the `access_token`. */
        fun products(products: JsonField<List<String>>) = apply {
            this.products = products.map { it.toMutableList() }
        }

        /** An array of the authorized products associated with the `access_token`. */
        fun addProduct(product: String) = apply {
            products =
                (products ?: JsonField.of(mutableListOf())).also {
                    checkKnown("products", it).add(product)
                }
        }

        /** The ID of the provider associated with the `access_token`. */
        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        /** The ID of the provider associated with the `access_token`. */
        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        /** The account username used for login associated with the `access_token`. */
        fun username(username: String) = username(JsonField.of(username))

        /** The account username used for login associated with the `access_token`. */
        fun username(username: JsonField<String>) = apply { this.username = username }

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

        fun build(): Introspection =
            Introspection(
                checkRequired("accountId", accountId),
                checkRequired("authenticationMethods", authenticationMethods).map {
                    it.toImmutable()
                },
                checkRequired("clientId", clientId),
                checkRequired("clientType", clientType),
                checkRequired("companyId", companyId),
                checkRequired("connectionId", connectionId),
                checkRequired("connectionStatus", connectionStatus),
                checkRequired("connectionType", connectionType),
                checkRequired("customerEmail", customerEmail),
                checkRequired("customerId", customerId),
                checkRequired("customerName", customerName),
                checkRequired("manual", manual),
                checkRequired("payrollProviderId", payrollProviderId),
                checkRequired("products", products).map { it.toImmutable() },
                checkRequired("providerId", providerId),
                checkRequired("username", username),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class AuthenticationMethod
    @JsonCreator
    private constructor(
        @JsonProperty("connection_status")
        @ExcludeMissing
        private val connectionStatus: JsonField<ConnectionStatus> = JsonMissing.of(),
        @JsonProperty("products")
        @ExcludeMissing
        private val products: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun connectionStatus(): Optional<ConnectionStatus> =
            Optional.ofNullable(connectionStatus.getNullable("connection_status"))

        /** An array of the authorized products associated with the `access_token`. */
        fun products(): Optional<List<String>> =
            Optional.ofNullable(products.getNullable("products"))

        /** The type of authentication method. */
        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        @JsonProperty("connection_status")
        @ExcludeMissing
        fun _connectionStatus(): JsonField<ConnectionStatus> = connectionStatus

        /** An array of the authorized products associated with the `access_token`. */
        @JsonProperty("products")
        @ExcludeMissing
        fun _products(): JsonField<List<String>> = products

        /** The type of authentication method. */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AuthenticationMethod = apply {
            if (validated) {
                return@apply
            }

            connectionStatus().ifPresent { it.validate() }
            products()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [AuthenticationMethod]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AuthenticationMethod]. */
        class Builder internal constructor() {

            private var connectionStatus: JsonField<ConnectionStatus> = JsonMissing.of()
            private var products: JsonField<MutableList<String>>? = null
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authenticationMethod: AuthenticationMethod) = apply {
                connectionStatus = authenticationMethod.connectionStatus
                products = authenticationMethod.products.map { it.toMutableList() }
                type = authenticationMethod.type
                additionalProperties = authenticationMethod.additionalProperties.toMutableMap()
            }

            fun connectionStatus(connectionStatus: ConnectionStatus) =
                connectionStatus(JsonField.of(connectionStatus))

            fun connectionStatus(connectionStatus: JsonField<ConnectionStatus>) = apply {
                this.connectionStatus = connectionStatus
            }

            /** An array of the authorized products associated with the `access_token`. */
            fun products(products: List<String>) = products(JsonField.of(products))

            /** An array of the authorized products associated with the `access_token`. */
            fun products(products: JsonField<List<String>>) = apply {
                this.products = products.map { it.toMutableList() }
            }

            /** An array of the authorized products associated with the `access_token`. */
            fun addProduct(product: String) = apply {
                products =
                    (products ?: JsonField.of(mutableListOf())).also {
                        checkKnown("products", it).add(product)
                    }
            }

            /** The type of authentication method. */
            fun type(type: Type) = type(JsonField.of(type))

            /** The type of authentication method. */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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

            fun build(): AuthenticationMethod =
                AuthenticationMethod(
                    connectionStatus,
                    (products ?: JsonMissing.of()).map { it.toImmutable() },
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class ConnectionStatus
        @JsonCreator
        private constructor(
            @JsonProperty("message")
            @ExcludeMissing
            private val message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            private val status: JsonField<ConnectionStatusType> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun message(): Optional<String> = Optional.ofNullable(message.getNullable("message"))

            fun status(): Optional<ConnectionStatusType> =
                Optional.ofNullable(status.getNullable("status"))

            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

            @JsonProperty("status")
            @ExcludeMissing
            fun _status(): JsonField<ConnectionStatusType> = status

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ConnectionStatus = apply {
                if (validated) {
                    return@apply
                }

                message()
                status()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [ConnectionStatus]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ConnectionStatus]. */
            class Builder internal constructor() {

                private var message: JsonField<String> = JsonMissing.of()
                private var status: JsonField<ConnectionStatusType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(connectionStatus: ConnectionStatus) = apply {
                    message = connectionStatus.message
                    status = connectionStatus.status
                    additionalProperties = connectionStatus.additionalProperties.toMutableMap()
                }

                fun message(message: String) = message(JsonField.of(message))

                fun message(message: JsonField<String>) = apply { this.message = message }

                fun status(status: ConnectionStatusType) = status(JsonField.of(status))

                fun status(status: JsonField<ConnectionStatusType>) = apply { this.status = status }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): ConnectionStatus =
                    ConnectionStatus(message, status, additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ConnectionStatus && message == other.message && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(message, status, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ConnectionStatus{message=$message, status=$status, additionalProperties=$additionalProperties}"
        }

        /** The type of authentication method. */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ASSISTED = of("assisted")

                @JvmField val CREDENTIAL = of("credential")

                @JvmField val API_TOKEN = of("api_token")

                @JvmField val API_CREDENTIAL = of("api_credential")

                @JvmField val OAUTH = of("oauth")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                ASSISTED,
                CREDENTIAL,
                API_TOKEN,
                API_CREDENTIAL,
                OAUTH,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ASSISTED,
                CREDENTIAL,
                API_TOKEN,
                API_CREDENTIAL,
                OAUTH,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ASSISTED -> Value.ASSISTED
                    CREDENTIAL -> Value.CREDENTIAL
                    API_TOKEN -> Value.API_TOKEN
                    API_CREDENTIAL -> Value.API_CREDENTIAL
                    OAUTH -> Value.OAUTH
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws FinchInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ASSISTED -> Known.ASSISTED
                    CREDENTIAL -> Known.CREDENTIAL
                    API_TOKEN -> Known.API_TOKEN
                    API_CREDENTIAL -> Known.API_CREDENTIAL
                    OAUTH -> Known.OAUTH
                    else -> throw FinchInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws FinchInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    FinchInvalidDataException("Value is not a String")
                }

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

            return /* spotless:off */ other is AuthenticationMethod && connectionStatus == other.connectionStatus && products == other.products && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(connectionStatus, products, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AuthenticationMethod{connectionStatus=$connectionStatus, products=$products, type=$type, additionalProperties=$additionalProperties}"
    }

    /** The type of application associated with a token. */
    class ClientType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PRODUCTION = of("production")

            @JvmField val DEVELOPMENT = of("development")

            @JvmField val SANDBOX = of("sandbox")

            @JvmStatic fun of(value: String) = ClientType(JsonField.of(value))
        }

        /** An enum containing [ClientType]'s known values. */
        enum class Known {
            PRODUCTION,
            DEVELOPMENT,
            SANDBOX,
        }

        /**
         * An enum containing [ClientType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ClientType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PRODUCTION,
            DEVELOPMENT,
            SANDBOX,
            /**
             * An enum member indicating that [ClientType] was instantiated with an unknown value.
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
                PRODUCTION -> Value.PRODUCTION
                DEVELOPMENT -> Value.DEVELOPMENT
                SANDBOX -> Value.SANDBOX
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
                PRODUCTION -> Known.PRODUCTION
                DEVELOPMENT -> Known.DEVELOPMENT
                SANDBOX -> Known.SANDBOX
                else -> throw FinchInvalidDataException("Unknown ClientType: $value")
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

            return /* spotless:off */ other is ClientType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class ConnectionStatus
    @JsonCreator
    private constructor(
        @JsonProperty("message")
        @ExcludeMissing
        private val message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<ConnectionStatusType> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun message(): Optional<String> = Optional.ofNullable(message.getNullable("message"))

        fun status(): Optional<ConnectionStatusType> =
            Optional.ofNullable(status.getNullable("status"))

        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        @JsonProperty("status")
        @ExcludeMissing
        fun _status(): JsonField<ConnectionStatusType> = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ConnectionStatus = apply {
            if (validated) {
                return@apply
            }

            message()
            status()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ConnectionStatus]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConnectionStatus]. */
        class Builder internal constructor() {

            private var message: JsonField<String> = JsonMissing.of()
            private var status: JsonField<ConnectionStatusType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(connectionStatus: ConnectionStatus) = apply {
                message = connectionStatus.message
                status = connectionStatus.status
                additionalProperties = connectionStatus.additionalProperties.toMutableMap()
            }

            fun message(message: String) = message(JsonField.of(message))

            fun message(message: JsonField<String>) = apply { this.message = message }

            fun status(status: ConnectionStatusType) = status(JsonField.of(status))

            fun status(status: JsonField<ConnectionStatusType>) = apply { this.status = status }

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

            fun build(): ConnectionStatus =
                ConnectionStatus(message, status, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ConnectionStatus && message == other.message && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(message, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConnectionStatus{message=$message, status=$status, additionalProperties=$additionalProperties}"
    }

    /**
     * The type of the connection associated with the token.
     * - `provider` - connection to an external provider
     * - `finch` - finch-generated data.
     */
    class ConnectionType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val PROVIDER = of("provider")

            @JvmField val FINCH = of("finch")

            @JvmStatic fun of(value: String) = ConnectionType(JsonField.of(value))
        }

        /** An enum containing [ConnectionType]'s known values. */
        enum class Known {
            PROVIDER,
            FINCH,
        }

        /**
         * An enum containing [ConnectionType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ConnectionType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PROVIDER,
            FINCH,
            /**
             * An enum member indicating that [ConnectionType] was instantiated with an unknown
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
                PROVIDER -> Value.PROVIDER
                FINCH -> Value.FINCH
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
                PROVIDER -> Known.PROVIDER
                FINCH -> Known.FINCH
                else -> throw FinchInvalidDataException("Unknown ConnectionType: $value")
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

            return /* spotless:off */ other is ConnectionType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Introspection && accountId == other.accountId && authenticationMethods == other.authenticationMethods && clientId == other.clientId && clientType == other.clientType && companyId == other.companyId && connectionId == other.connectionId && connectionStatus == other.connectionStatus && connectionType == other.connectionType && customerEmail == other.customerEmail && customerId == other.customerId && customerName == other.customerName && manual == other.manual && payrollProviderId == other.payrollProviderId && products == other.products && providerId == other.providerId && username == other.username && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountId, authenticationMethods, clientId, clientType, companyId, connectionId, connectionStatus, connectionType, customerEmail, customerId, customerName, manual, payrollProviderId, products, providerId, username, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Introspection{accountId=$accountId, authenticationMethods=$authenticationMethods, clientId=$clientId, clientType=$clientType, companyId=$companyId, connectionId=$connectionId, connectionStatus=$connectionStatus, connectionType=$connectionType, customerEmail=$customerEmail, customerId=$customerId, customerName=$customerName, manual=$manual, payrollProviderId=$payrollProviderId, products=$products, providerId=$providerId, username=$username, additionalProperties=$additionalProperties}"
}

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
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Introspection
private constructor(
    private val accountId: JsonField<String>,
    private val authenticationMethods: JsonField<List<AuthenticationMethod>>,
    private val clientId: JsonField<String>,
    private val clientType: JsonField<ClientType>,
    private val companyId: JsonField<String>,
    private val connectionId: JsonField<String>,
    private val connectionStatus: JsonField<ConnectionStatus>,
    private val connectionType: JsonField<ConnectionType>,
    private val customerEmail: JsonField<String>,
    private val customerId: JsonField<String>,
    private val customerName: JsonField<String>,
    private val manual: JsonField<Boolean>,
    private val payrollProviderId: JsonField<String>,
    private val products: JsonField<List<String>>,
    private val providerId: JsonField<String>,
    private val username: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authentication_methods")
        @ExcludeMissing
        authenticationMethods: JsonField<List<AuthenticationMethod>> = JsonMissing.of(),
        @JsonProperty("client_id") @ExcludeMissing clientId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_type")
        @ExcludeMissing
        clientType: JsonField<ClientType> = JsonMissing.of(),
        @JsonProperty("company_id") @ExcludeMissing companyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connection_id")
        @ExcludeMissing
        connectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connection_status")
        @ExcludeMissing
        connectionStatus: JsonField<ConnectionStatus> = JsonMissing.of(),
        @JsonProperty("connection_type")
        @ExcludeMissing
        connectionType: JsonField<ConnectionType> = JsonMissing.of(),
        @JsonProperty("customer_email")
        @ExcludeMissing
        customerEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_name")
        @ExcludeMissing
        customerName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("manual") @ExcludeMissing manual: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("payroll_provider_id")
        @ExcludeMissing
        payrollProviderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("products")
        @ExcludeMissing
        products: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("provider_id")
        @ExcludeMissing
        providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("username") @ExcludeMissing username: JsonField<String> = JsonMissing.of(),
    ) : this(
        accountId,
        authenticationMethods,
        clientId,
        clientType,
        companyId,
        connectionId,
        connectionStatus,
        connectionType,
        customerEmail,
        customerId,
        customerName,
        manual,
        payrollProviderId,
        products,
        providerId,
        username,
        mutableMapOf(),
    )

    /**
     * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of this
     * account ID.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun accountId(): String = accountId.getRequired("account_id")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authenticationMethods(): List<AuthenticationMethod> =
        authenticationMethods.getRequired("authentication_methods")

    /**
     * The client ID of the application associated with the `access_token`.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientId(): String = clientId.getRequired("client_id")

    /**
     * The type of application associated with a token.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientType(): ClientType = clientType.getRequired("client_type")

    /**
     * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of this
     * company ID.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun companyId(): String = companyId.getRequired("company_id")

    /**
     * The Finch UUID of the connection associated with the `access_token`.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun connectionId(): String = connectionId.getRequired("connection_id")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun connectionStatus(): ConnectionStatus = connectionStatus.getRequired("connection_status")

    /**
     * The type of the connection associated with the token.
     * - `provider` - connection to an external provider
     * - `finch` - finch-generated data.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun connectionType(): ConnectionType = connectionType.getRequired("connection_type")

    /**
     * The email of your customer you provided to Finch when a connect session was created for this
     * connection.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerEmail(): Optional<String> =
        Optional.ofNullable(customerEmail.getNullable("customer_email"))

    /**
     * The ID of your customer you provided to Finch when a connect session was created for this
     * connection.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerId(): Optional<String> = Optional.ofNullable(customerId.getNullable("customer_id"))

    /**
     * The name of your customer you provided to Finch when a connect session was created for this
     * connection.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerName(): Optional<String> =
        Optional.ofNullable(customerName.getNullable("customer_name"))

    /**
     * Whether the connection associated with the `access_token` uses the Assisted Connect Flow.
     * (`true` if using Assisted Connect, `false` if connection is automated)
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun manual(): Boolean = manual.getRequired("manual")

    /**
     * [DEPRECATED] Use `provider_id` to identify the provider instead of this payroll provider ID.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun payrollProviderId(): String = payrollProviderId.getRequired("payroll_provider_id")

    /**
     * An array of the authorized products associated with the `access_token`.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun products(): List<String> = products.getRequired("products")

    /**
     * The ID of the provider associated with the `access_token`.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun providerId(): String = providerId.getRequired("provider_id")

    /**
     * The account username used for login associated with the `access_token`.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun username(): String = username.getRequired("username")

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("account_id")
    @ExcludeMissing
    fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [authenticationMethods].
     *
     * Unlike [authenticationMethods], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("authentication_methods")
    @ExcludeMissing
    fun _authenticationMethods(): JsonField<List<AuthenticationMethod>> = authenticationMethods

    /**
     * Returns the raw JSON value of [clientId].
     *
     * Unlike [clientId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_id") @ExcludeMissing fun _clientId(): JsonField<String> = clientId

    /**
     * Returns the raw JSON value of [clientType].
     *
     * Unlike [clientType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_type")
    @ExcludeMissing
    fun _clientType(): JsonField<ClientType> = clientType

    /**
     * Returns the raw JSON value of [companyId].
     *
     * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("company_id")
    @ExcludeMissing
    fun _companyId(): JsonField<String> = companyId

    /**
     * Returns the raw JSON value of [connectionId].
     *
     * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection_id")
    @ExcludeMissing
    fun _connectionId(): JsonField<String> = connectionId

    /**
     * Returns the raw JSON value of [connectionStatus].
     *
     * Unlike [connectionStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("connection_status")
    @ExcludeMissing
    fun _connectionStatus(): JsonField<ConnectionStatus> = connectionStatus

    /**
     * Returns the raw JSON value of [connectionType].
     *
     * Unlike [connectionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection_type")
    @ExcludeMissing
    fun _connectionType(): JsonField<ConnectionType> = connectionType

    /**
     * Returns the raw JSON value of [customerEmail].
     *
     * Unlike [customerEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_email")
    @ExcludeMissing
    fun _customerEmail(): JsonField<String> = customerEmail

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [customerName].
     *
     * Unlike [customerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_name")
    @ExcludeMissing
    fun _customerName(): JsonField<String> = customerName

    /**
     * Returns the raw JSON value of [manual].
     *
     * Unlike [manual], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("manual") @ExcludeMissing fun _manual(): JsonField<Boolean> = manual

    /**
     * Returns the raw JSON value of [payrollProviderId].
     *
     * Unlike [payrollProviderId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    @JsonProperty("payroll_provider_id")
    @ExcludeMissing
    fun _payrollProviderId(): JsonField<String> = payrollProviderId

    /**
     * Returns the raw JSON value of [products].
     *
     * Unlike [products], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("products") @ExcludeMissing fun _products(): JsonField<List<String>> = products

    /**
     * Returns the raw JSON value of [providerId].
     *
     * Unlike [providerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider_id") @ExcludeMissing fun _providerId(): JsonField<String> = providerId

    /**
     * Returns the raw JSON value of [username].
     *
     * Unlike [username], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("username") @ExcludeMissing fun _username(): JsonField<String> = username

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

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
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        fun authenticationMethods(authenticationMethods: List<AuthenticationMethod>) =
            authenticationMethods(JsonField.of(authenticationMethods))

        /**
         * Sets [Builder.authenticationMethods] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authenticationMethods] with a well-typed
         * `List<AuthenticationMethod>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun authenticationMethods(authenticationMethods: JsonField<List<AuthenticationMethod>>) =
            apply {
                this.authenticationMethods = authenticationMethods.map { it.toMutableList() }
            }

        /**
         * Adds a single [AuthenticationMethod] to [authenticationMethods].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAuthenticationMethod(authenticationMethod: AuthenticationMethod) = apply {
            authenticationMethods =
                (authenticationMethods ?: JsonField.of(mutableListOf())).also {
                    checkKnown("authenticationMethods", it).add(authenticationMethod)
                }
        }

        /** The client ID of the application associated with the `access_token`. */
        fun clientId(clientId: String) = clientId(JsonField.of(clientId))

        /**
         * Sets [Builder.clientId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

        /** The type of application associated with a token. */
        fun clientType(clientType: ClientType) = clientType(JsonField.of(clientType))

        /**
         * Sets [Builder.clientType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientType] with a well-typed [ClientType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clientType(clientType: JsonField<ClientType>) = apply { this.clientType = clientType }

        /**
         * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of
         * this company ID.
         */
        @Deprecated("deprecated")
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /**
         * Sets [Builder.companyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /** The Finch UUID of the connection associated with the `access_token`. */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /**
         * Sets [Builder.connectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        fun connectionStatus(connectionStatus: ConnectionStatus) =
            connectionStatus(JsonField.of(connectionStatus))

        /**
         * Sets [Builder.connectionStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionStatus] with a well-typed [ConnectionStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
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
         * Sets [Builder.connectionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionType] with a well-typed [ConnectionType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        /** Alias for calling [Builder.customerEmail] with `customerEmail.orElse(null)`. */
        fun customerEmail(customerEmail: Optional<String>) =
            customerEmail(customerEmail.getOrNull())

        /**
         * Sets [Builder.customerEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerEmail(customerEmail: JsonField<String>) = apply {
            this.customerEmail = customerEmail
        }

        /**
         * The ID of your customer you provided to Finch when a connect session was created for this
         * connection.
         */
        fun customerId(customerId: String?) = customerId(JsonField.ofNullable(customerId))

        /** Alias for calling [Builder.customerId] with `customerId.orElse(null)`. */
        fun customerId(customerId: Optional<String>) = customerId(customerId.getOrNull())

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /**
         * The name of your customer you provided to Finch when a connect session was created for
         * this connection.
         */
        fun customerName(customerName: String?) = customerName(JsonField.ofNullable(customerName))

        /** Alias for calling [Builder.customerName] with `customerName.orElse(null)`. */
        fun customerName(customerName: Optional<String>) = customerName(customerName.getOrNull())

        /**
         * Sets [Builder.customerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Sets [Builder.manual] to an arbitrary JSON value.
         *
         * You should usually call [Builder.manual] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Sets [Builder.payrollProviderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payrollProviderId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun payrollProviderId(payrollProviderId: JsonField<String>) = apply {
            this.payrollProviderId = payrollProviderId
        }

        /** An array of the authorized products associated with the `access_token`. */
        fun products(products: List<String>) = products(JsonField.of(products))

        /**
         * Sets [Builder.products] to an arbitrary JSON value.
         *
         * You should usually call [Builder.products] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun products(products: JsonField<List<String>>) = apply {
            this.products = products.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [products].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProduct(product: String) = apply {
            products =
                (products ?: JsonField.of(mutableListOf())).also {
                    checkKnown("products", it).add(product)
                }
        }

        /** The ID of the provider associated with the `access_token`. */
        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        /**
         * Sets [Builder.providerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        /** The account username used for login associated with the `access_token`. */
        fun username(username: String) = username(JsonField.of(username))

        /**
         * Sets [Builder.username] to an arbitrary JSON value.
         *
         * You should usually call [Builder.username] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [Introspection].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
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
         *
         * @throws IllegalStateException if any required field is unset.
         */
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
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Introspection = apply {
        if (validated) {
            return@apply
        }

        accountId()
        authenticationMethods().forEach { it.validate() }
        clientId()
        clientType().validate()
        companyId()
        connectionId()
        connectionStatus().validate()
        connectionType().validate()
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

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: FinchInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (accountId.asKnown().isPresent) 1 else 0) +
            (authenticationMethods.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (clientId.asKnown().isPresent) 1 else 0) +
            (clientType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (companyId.asKnown().isPresent) 1 else 0) +
            (if (connectionId.asKnown().isPresent) 1 else 0) +
            (connectionStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (connectionType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (customerEmail.asKnown().isPresent) 1 else 0) +
            (if (customerId.asKnown().isPresent) 1 else 0) +
            (if (customerName.asKnown().isPresent) 1 else 0) +
            (if (manual.asKnown().isPresent) 1 else 0) +
            (if (payrollProviderId.asKnown().isPresent) 1 else 0) +
            (products.asKnown().getOrNull()?.size ?: 0) +
            (if (providerId.asKnown().isPresent) 1 else 0) +
            (if (username.asKnown().isPresent) 1 else 0)

    class AuthenticationMethod
    private constructor(
        private val connectionStatus: JsonField<ConnectionStatus>,
        private val products: JsonField<List<String>>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("connection_status")
            @ExcludeMissing
            connectionStatus: JsonField<ConnectionStatus> = JsonMissing.of(),
            @JsonProperty("products")
            @ExcludeMissing
            products: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(connectionStatus, products, type, mutableMapOf())

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectionStatus(): Optional<ConnectionStatus> =
            Optional.ofNullable(connectionStatus.getNullable("connection_status"))

        /**
         * An array of the authorized products associated with the `access_token`.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun products(): Optional<List<String>> =
            Optional.ofNullable(products.getNullable("products"))

        /**
         * The type of authentication method.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        /**
         * Returns the raw JSON value of [connectionStatus].
         *
         * Unlike [connectionStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connection_status")
        @ExcludeMissing
        fun _connectionStatus(): JsonField<ConnectionStatus> = connectionStatus

        /**
         * Returns the raw JSON value of [products].
         *
         * Unlike [products], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("products")
        @ExcludeMissing
        fun _products(): JsonField<List<String>> = products

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

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

            /**
             * Sets [Builder.connectionStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionStatus] with a well-typed
             * [ConnectionStatus] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun connectionStatus(connectionStatus: JsonField<ConnectionStatus>) = apply {
                this.connectionStatus = connectionStatus
            }

            /** An array of the authorized products associated with the `access_token`. */
            fun products(products: List<String>) = products(JsonField.of(products))

            /**
             * Sets [Builder.products] to an arbitrary JSON value.
             *
             * You should usually call [Builder.products] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun products(products: JsonField<List<String>>) = apply {
                this.products = products.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [products].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProduct(product: String) = apply {
                products =
                    (products ?: JsonField.of(mutableListOf())).also {
                        checkKnown("products", it).add(product)
                    }
            }

            /** The type of authentication method. */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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

            /**
             * Returns an immutable instance of [AuthenticationMethod].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AuthenticationMethod =
                AuthenticationMethod(
                    connectionStatus,
                    (products ?: JsonMissing.of()).map { it.toImmutable() },
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AuthenticationMethod = apply {
            if (validated) {
                return@apply
            }

            connectionStatus().ifPresent { it.validate() }
            products()
            type().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: FinchInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (connectionStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (products.asKnown().getOrNull()?.size ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class ConnectionStatus
        private constructor(
            private val message: JsonField<String>,
            private val status: JsonField<ConnectionStatusType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<ConnectionStatusType> = JsonMissing.of(),
            ) : this(message, status, mutableMapOf())

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun message(): Optional<String> = Optional.ofNullable(message.getNullable("message"))

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun status(): Optional<ConnectionStatusType> =
                Optional.ofNullable(status.getNullable("status"))

            /**
             * Returns the raw JSON value of [message].
             *
             * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status")
            @ExcludeMissing
            fun _status(): JsonField<ConnectionStatusType> = status

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

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

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<String>) = apply { this.message = message }

                fun status(status: ConnectionStatusType) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [ConnectionStatusType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [ConnectionStatus].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ConnectionStatus =
                    ConnectionStatus(message, status, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): ConnectionStatus = apply {
                if (validated) {
                    return@apply
                }

                message()
                status().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: FinchInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (message.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0)

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

            private var validated: Boolean = false

            fun validate(): Type = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: FinchInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

        private var validated: Boolean = false

        fun validate(): ClientType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: FinchInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ClientType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ConnectionStatus
    private constructor(
        private val lastSuccessfulSync: JsonField<OffsetDateTime>,
        private val message: JsonField<String>,
        private val status: JsonField<ConnectionStatusType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("last_successful_sync")
            @ExcludeMissing
            lastSuccessfulSync: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<ConnectionStatusType> = JsonMissing.of(),
        ) : this(lastSuccessfulSync, message, status, mutableMapOf())

        /**
         * The datetime when the connection was last successfully synced.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastSuccessfulSync(): Optional<OffsetDateTime> =
            Optional.ofNullable(lastSuccessfulSync.getNullable("last_successful_sync"))

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun message(): Optional<String> = Optional.ofNullable(message.getNullable("message"))

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<ConnectionStatusType> =
            Optional.ofNullable(status.getNullable("status"))

        /**
         * Returns the raw JSON value of [lastSuccessfulSync].
         *
         * Unlike [lastSuccessfulSync], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("last_successful_sync")
        @ExcludeMissing
        fun _lastSuccessfulSync(): JsonField<OffsetDateTime> = lastSuccessfulSync

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun _status(): JsonField<ConnectionStatusType> = status

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ConnectionStatus]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConnectionStatus]. */
        class Builder internal constructor() {

            private var lastSuccessfulSync: JsonField<OffsetDateTime> = JsonMissing.of()
            private var message: JsonField<String> = JsonMissing.of()
            private var status: JsonField<ConnectionStatusType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(connectionStatus: ConnectionStatus) = apply {
                lastSuccessfulSync = connectionStatus.lastSuccessfulSync
                message = connectionStatus.message
                status = connectionStatus.status
                additionalProperties = connectionStatus.additionalProperties.toMutableMap()
            }

            /** The datetime when the connection was last successfully synced. */
            fun lastSuccessfulSync(lastSuccessfulSync: OffsetDateTime) =
                lastSuccessfulSync(JsonField.of(lastSuccessfulSync))

            /**
             * Sets [Builder.lastSuccessfulSync] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastSuccessfulSync] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun lastSuccessfulSync(lastSuccessfulSync: JsonField<OffsetDateTime>) = apply {
                this.lastSuccessfulSync = lastSuccessfulSync
            }

            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

            fun status(status: ConnectionStatusType) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [ConnectionStatusType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
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

            /**
             * Returns an immutable instance of [ConnectionStatus].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ConnectionStatus =
                ConnectionStatus(
                    lastSuccessfulSync,
                    message,
                    status,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ConnectionStatus = apply {
            if (validated) {
                return@apply
            }

            lastSuccessfulSync()
            message()
            status().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: FinchInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (lastSuccessfulSync.asKnown().isPresent) 1 else 0) +
                (if (message.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ConnectionStatus && lastSuccessfulSync == other.lastSuccessfulSync && message == other.message && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(lastSuccessfulSync, message, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConnectionStatus{lastSuccessfulSync=$lastSuccessfulSync, message=$message, status=$status, additionalProperties=$additionalProperties}"
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

        private var validated: Boolean = false

        fun validate(): ConnectionType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: FinchInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

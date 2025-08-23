// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.BaseDeserializer
import com.tryfinch.api.core.BaseSerializer
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.allMaxBy
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.getOrThrow
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Introspection
private constructor(
    private val id: JsonField<String>,
    private val clientId: JsonField<String>,
    private val clientType: JsonField<ClientType>,
    private val connectionId: JsonField<String>,
    private val connectionStatus: JsonField<ConnectionStatusDetail>,
    private val connectionType: JsonField<ConnectionType>,
    private val products: JsonField<List<String>>,
    private val providerId: JsonField<String>,
    private val accountId: JsonField<String>,
    private val authenticationMethods: JsonField<List<AuthenticationMethodDetail>>,
    private val companyId: JsonField<String>,
    private val customerEmail: JsonField<String>,
    private val customerId: JsonField<String>,
    private val customerName: JsonField<String>,
    private val entityIds: JsonField<List<String>>,
    private val entityMode: JsonField<EntityMode>,
    private val manual: JsonField<Boolean>,
    private val payrollProviderId: JsonField<String>,
    private val username: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_id") @ExcludeMissing clientId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_type")
        @ExcludeMissing
        clientType: JsonField<ClientType> = JsonMissing.of(),
        @JsonProperty("connection_id")
        @ExcludeMissing
        connectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connection_status")
        @ExcludeMissing
        connectionStatus: JsonField<ConnectionStatusDetail> = JsonMissing.of(),
        @JsonProperty("connection_type")
        @ExcludeMissing
        connectionType: JsonField<ConnectionType> = JsonMissing.of(),
        @JsonProperty("products")
        @ExcludeMissing
        products: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("provider_id")
        @ExcludeMissing
        providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authentication_methods")
        @ExcludeMissing
        authenticationMethods: JsonField<List<AuthenticationMethodDetail>> = JsonMissing.of(),
        @JsonProperty("company_id") @ExcludeMissing companyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_email")
        @ExcludeMissing
        customerEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_name")
        @ExcludeMissing
        customerName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entity_ids")
        @ExcludeMissing
        entityIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("entity_mode")
        @ExcludeMissing
        entityMode: JsonField<EntityMode> = JsonMissing.of(),
        @JsonProperty("manual") @ExcludeMissing manual: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("payroll_provider_id")
        @ExcludeMissing
        payrollProviderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("username") @ExcludeMissing username: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        clientId,
        clientType,
        connectionId,
        connectionStatus,
        connectionType,
        products,
        providerId,
        accountId,
        authenticationMethods,
        companyId,
        customerEmail,
        customerId,
        customerName,
        entityIds,
        entityMode,
        manual,
        payrollProviderId,
        username,
        mutableMapOf(),
    )

    /**
     * The Finch UUID of the token being introspected
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The client ID of the application associated with the `access_token`
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
     * The Finch UUID of the connection associated with the `access_token`
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun connectionId(): String = connectionId.getRequired("connection_id")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun connectionStatus(): ConnectionStatusDetail =
        connectionStatus.getRequired("connection_status")

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
     * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of this
     * account ID
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun accountId(): Optional<String> = accountId.getOptional("account_id")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authenticationMethods(): Optional<List<AuthenticationMethodDetail>> =
        authenticationMethods.getOptional("authentication_methods")

    /**
     * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of this
     * company ID
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun companyId(): Optional<String> = companyId.getOptional("company_id")

    /**
     * The email of your customer you provided to Finch when a connect session was created for this
     * connection
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerEmail(): Optional<String> = customerEmail.getOptional("customer_email")

    /**
     * The ID of your customer you provided to Finch when a connect session was created for this
     * connection
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerId(): Optional<String> = customerId.getOptional("customer_id")

    /**
     * The name of your customer you provided to Finch when a connect session was created for this
     * connection
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerName(): Optional<String> = customerName.getOptional("customer_name")

    /**
     * Array of entity IDs associated with this connection.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entityIds(): Optional<List<String>> = entityIds.getOptional("entity_ids")

    /**
     * Indicates whether this connection manages a single entity or multiple entities.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entityMode(): Optional<EntityMode> = entityMode.getOptional("entity_mode")

    /**
     * Whether the connection associated with the `access_token` uses the Assisted Connect Flow.
     * (`true` if using Assisted Connect, `false` if connection is automated)
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun manual(): Optional<Boolean> = manual.getOptional("manual")

    /**
     * [DEPRECATED] Use `provider_id` to identify the provider instead of this payroll provider ID.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun payrollProviderId(): Optional<String> = payrollProviderId.getOptional("payroll_provider_id")

    /**
     * The account username used for login associated with the `access_token`.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun username(): Optional<String> = username.getOptional("username")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
    fun _connectionStatus(): JsonField<ConnectionStatusDetail> = connectionStatus

    /**
     * Returns the raw JSON value of [connectionType].
     *
     * Unlike [connectionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection_type")
    @ExcludeMissing
    fun _connectionType(): JsonField<ConnectionType> = connectionType

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
    fun _authenticationMethods(): JsonField<List<AuthenticationMethodDetail>> =
        authenticationMethods

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
     * Returns the raw JSON value of [entityIds].
     *
     * Unlike [entityIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entity_ids")
    @ExcludeMissing
    fun _entityIds(): JsonField<List<String>> = entityIds

    /**
     * Returns the raw JSON value of [entityMode].
     *
     * Unlike [entityMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entity_mode")
    @ExcludeMissing
    fun _entityMode(): JsonField<EntityMode> = entityMode

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
         * .id()
         * .clientId()
         * .clientType()
         * .connectionId()
         * .connectionStatus()
         * .connectionType()
         * .products()
         * .providerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Introspection]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var clientId: JsonField<String>? = null
        private var clientType: JsonField<ClientType>? = null
        private var connectionId: JsonField<String>? = null
        private var connectionStatus: JsonField<ConnectionStatusDetail>? = null
        private var connectionType: JsonField<ConnectionType>? = null
        private var products: JsonField<MutableList<String>>? = null
        private var providerId: JsonField<String>? = null
        private var accountId: JsonField<String> = JsonMissing.of()
        private var authenticationMethods: JsonField<MutableList<AuthenticationMethodDetail>>? =
            null
        private var companyId: JsonField<String> = JsonMissing.of()
        private var customerEmail: JsonField<String> = JsonMissing.of()
        private var customerId: JsonField<String> = JsonMissing.of()
        private var customerName: JsonField<String> = JsonMissing.of()
        private var entityIds: JsonField<MutableList<String>>? = null
        private var entityMode: JsonField<EntityMode> = JsonMissing.of()
        private var manual: JsonField<Boolean> = JsonMissing.of()
        private var payrollProviderId: JsonField<String> = JsonMissing.of()
        private var username: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(introspection: Introspection) = apply {
            id = introspection.id
            clientId = introspection.clientId
            clientType = introspection.clientType
            connectionId = introspection.connectionId
            connectionStatus = introspection.connectionStatus
            connectionType = introspection.connectionType
            products = introspection.products.map { it.toMutableList() }
            providerId = introspection.providerId
            accountId = introspection.accountId
            authenticationMethods = introspection.authenticationMethods.map { it.toMutableList() }
            companyId = introspection.companyId
            customerEmail = introspection.customerEmail
            customerId = introspection.customerId
            customerName = introspection.customerName
            entityIds = introspection.entityIds.map { it.toMutableList() }
            entityMode = introspection.entityMode
            manual = introspection.manual
            payrollProviderId = introspection.payrollProviderId
            username = introspection.username
            additionalProperties = introspection.additionalProperties.toMutableMap()
        }

        /** The Finch UUID of the token being introspected */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The client ID of the application associated with the `access_token` */
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

        /** The Finch UUID of the connection associated with the `access_token` */
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

        fun connectionStatus(connectionStatus: ConnectionStatusDetail) =
            connectionStatus(JsonField.of(connectionStatus))

        /**
         * Sets [Builder.connectionStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionStatus] with a well-typed
         * [ConnectionStatusDetail] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun connectionStatus(connectionStatus: JsonField<ConnectionStatusDetail>) = apply {
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

        /**
         * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of
         * this account ID
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

        fun authenticationMethods(authenticationMethods: List<AuthenticationMethodDetail>) =
            authenticationMethods(JsonField.of(authenticationMethods))

        /**
         * Sets [Builder.authenticationMethods] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authenticationMethods] with a well-typed
         * `List<AuthenticationMethodDetail>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun authenticationMethods(
            authenticationMethods: JsonField<List<AuthenticationMethodDetail>>
        ) = apply { this.authenticationMethods = authenticationMethods.map { it.toMutableList() } }

        /**
         * Adds a single [AuthenticationMethodDetail] to [authenticationMethods].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAuthenticationMethod(authenticationMethod: AuthenticationMethodDetail) = apply {
            authenticationMethods =
                (authenticationMethods ?: JsonField.of(mutableListOf())).also {
                    checkKnown("authenticationMethods", it).add(authenticationMethod)
                }
        }

        /**
         * [DEPRECATED] Use `connection_id` to associate tokens with a Finch connection instead of
         * this company ID
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

        /**
         * The email of your customer you provided to Finch when a connect session was created for
         * this connection
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
         * connection
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
         * this connection
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

        /** Array of entity IDs associated with this connection. */
        fun entityIds(entityIds: List<String>) = entityIds(JsonField.of(entityIds))

        /**
         * Sets [Builder.entityIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entityIds(entityIds: JsonField<List<String>>) = apply {
            this.entityIds = entityIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [entityIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEntityId(entityId: String) = apply {
            entityIds =
                (entityIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("entityIds", it).add(entityId)
                }
        }

        /** Indicates whether this connection manages a single entity or multiple entities. */
        fun entityMode(entityMode: EntityMode) = entityMode(JsonField.of(entityMode))

        /**
         * Sets [Builder.entityMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityMode] with a well-typed [EntityMode] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entityMode(entityMode: JsonField<EntityMode>) = apply { this.entityMode = entityMode }

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

        /** The account username used for login associated with the `access_token`. */
        fun username(username: String?) = username(JsonField.ofNullable(username))

        /** Alias for calling [Builder.username] with `username.orElse(null)`. */
        fun username(username: Optional<String>) = username(username.getOrNull())

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
         * .id()
         * .clientId()
         * .clientType()
         * .connectionId()
         * .connectionStatus()
         * .connectionType()
         * .products()
         * .providerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Introspection =
            Introspection(
                checkRequired("id", id),
                checkRequired("clientId", clientId),
                checkRequired("clientType", clientType),
                checkRequired("connectionId", connectionId),
                checkRequired("connectionStatus", connectionStatus),
                checkRequired("connectionType", connectionType),
                checkRequired("products", products).map { it.toImmutable() },
                checkRequired("providerId", providerId),
                accountId,
                (authenticationMethods ?: JsonMissing.of()).map { it.toImmutable() },
                companyId,
                customerEmail,
                customerId,
                customerName,
                (entityIds ?: JsonMissing.of()).map { it.toImmutable() },
                entityMode,
                manual,
                payrollProviderId,
                username,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Introspection = apply {
        if (validated) {
            return@apply
        }

        id()
        clientId()
        clientType().validate()
        connectionId()
        connectionStatus().validate()
        connectionType().validate()
        products()
        providerId()
        accountId()
        authenticationMethods().ifPresent { it.forEach { it.validate() } }
        companyId()
        customerEmail()
        customerId()
        customerName()
        entityIds()
        entityMode().ifPresent { it.validate() }
        manual()
        payrollProviderId()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (clientId.asKnown().isPresent) 1 else 0) +
            (clientType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (connectionId.asKnown().isPresent) 1 else 0) +
            (connectionStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (connectionType.asKnown().getOrNull()?.validity() ?: 0) +
            (products.asKnown().getOrNull()?.size ?: 0) +
            (if (providerId.asKnown().isPresent) 1 else 0) +
            (if (accountId.asKnown().isPresent) 1 else 0) +
            (authenticationMethods.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (companyId.asKnown().isPresent) 1 else 0) +
            (if (customerEmail.asKnown().isPresent) 1 else 0) +
            (if (customerId.asKnown().isPresent) 1 else 0) +
            (if (customerName.asKnown().isPresent) 1 else 0) +
            (entityIds.asKnown().getOrNull()?.size ?: 0) +
            (entityMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (manual.asKnown().isPresent) 1 else 0) +
            (if (payrollProviderId.asKnown().isPresent) 1 else 0) +
            (if (username.asKnown().isPresent) 1 else 0)

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

            @JvmField val DEVELOPMENT = of("development")

            @JvmField val PRODUCTION = of("production")

            @JvmField val SANDBOX = of("sandbox")

            @JvmStatic fun of(value: String) = ClientType(JsonField.of(value))
        }

        /** An enum containing [ClientType]'s known values. */
        enum class Known {
            DEVELOPMENT,
            PRODUCTION,
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
            DEVELOPMENT,
            PRODUCTION,
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
                DEVELOPMENT -> Value.DEVELOPMENT
                PRODUCTION -> Value.PRODUCTION
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
                DEVELOPMENT -> Known.DEVELOPMENT
                PRODUCTION -> Known.PRODUCTION
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

            return other is ClientType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ConnectionStatusDetail
    private constructor(
        private val status: JsonField<ConnectionStatusType>,
        private val lastSuccessfulSync: JsonField<LastSuccessfulSync>,
        private val message: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<ConnectionStatusType> = JsonMissing.of(),
            @JsonProperty("last_successful_sync")
            @ExcludeMissing
            lastSuccessfulSync: JsonField<LastSuccessfulSync> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        ) : this(status, lastSuccessfulSync, message, mutableMapOf())

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): ConnectionStatusType = status.getRequired("status")

        /**
         * The datetime when the connection was last successfully synced
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastSuccessfulSync(): Optional<LastSuccessfulSync> =
            lastSuccessfulSync.getOptional("last_successful_sync")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun message(): Optional<String> = message.getOptional("message")

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun _status(): JsonField<ConnectionStatusType> = status

        /**
         * Returns the raw JSON value of [lastSuccessfulSync].
         *
         * Unlike [lastSuccessfulSync], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("last_successful_sync")
        @ExcludeMissing
        fun _lastSuccessfulSync(): JsonField<LastSuccessfulSync> = lastSuccessfulSync

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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
             * Returns a mutable builder for constructing an instance of [ConnectionStatusDetail].
             *
             * The following fields are required:
             * ```java
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConnectionStatusDetail]. */
        class Builder internal constructor() {

            private var status: JsonField<ConnectionStatusType>? = null
            private var lastSuccessfulSync: JsonField<LastSuccessfulSync> = JsonMissing.of()
            private var message: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(connectionStatusDetail: ConnectionStatusDetail) = apply {
                status = connectionStatusDetail.status
                lastSuccessfulSync = connectionStatusDetail.lastSuccessfulSync
                message = connectionStatusDetail.message
                additionalProperties = connectionStatusDetail.additionalProperties.toMutableMap()
            }

            fun status(status: ConnectionStatusType) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [ConnectionStatusType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun status(status: JsonField<ConnectionStatusType>) = apply { this.status = status }

            /** The datetime when the connection was last successfully synced */
            fun lastSuccessfulSync(lastSuccessfulSync: LastSuccessfulSync?) =
                lastSuccessfulSync(JsonField.ofNullable(lastSuccessfulSync))

            /**
             * Alias for calling [Builder.lastSuccessfulSync] with
             * `lastSuccessfulSync.orElse(null)`.
             */
            fun lastSuccessfulSync(lastSuccessfulSync: Optional<LastSuccessfulSync>) =
                lastSuccessfulSync(lastSuccessfulSync.getOrNull())

            /**
             * Sets [Builder.lastSuccessfulSync] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastSuccessfulSync] with a well-typed
             * [LastSuccessfulSync] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun lastSuccessfulSync(lastSuccessfulSync: JsonField<LastSuccessfulSync>) = apply {
                this.lastSuccessfulSync = lastSuccessfulSync
            }

            /**
             * Alias for calling [lastSuccessfulSync] with
             * `LastSuccessfulSync.ofOffsetDateTime(offsetDateTime)`.
             */
            fun lastSuccessfulSync(offsetDateTime: OffsetDateTime) =
                lastSuccessfulSync(LastSuccessfulSync.ofOffsetDateTime(offsetDateTime))

            /**
             * Alias for calling [lastSuccessfulSync] with `LastSuccessfulSync.ofString(string)`.
             */
            fun lastSuccessfulSync(string: String) =
                lastSuccessfulSync(LastSuccessfulSync.ofString(string))

            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

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
             * Returns an immutable instance of [ConnectionStatusDetail].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ConnectionStatusDetail =
                ConnectionStatusDetail(
                    checkRequired("status", status),
                    lastSuccessfulSync,
                    message,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ConnectionStatusDetail = apply {
            if (validated) {
                return@apply
            }

            status().validate()
            lastSuccessfulSync().ifPresent { it.validate() }
            message()
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
            (status.asKnown().getOrNull()?.validity() ?: 0) +
                (lastSuccessfulSync.asKnown().getOrNull()?.validity() ?: 0) +
                (if (message.asKnown().isPresent) 1 else 0)

        /** The datetime when the connection was last successfully synced */
        @JsonDeserialize(using = LastSuccessfulSync.Deserializer::class)
        @JsonSerialize(using = LastSuccessfulSync.Serializer::class)
        class LastSuccessfulSync
        private constructor(
            private val offsetDateTime: OffsetDateTime? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun offsetDateTime(): Optional<OffsetDateTime> = Optional.ofNullable(offsetDateTime)

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isOffsetDateTime(): Boolean = offsetDateTime != null

            fun isString(): Boolean = string != null

            fun asOffsetDateTime(): OffsetDateTime = offsetDateTime.getOrThrow("offsetDateTime")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    offsetDateTime != null -> visitor.visitOffsetDateTime(offsetDateTime)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): LastSuccessfulSync = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) {}

                        override fun visitString(string: String) {}
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) = 1

                        override fun visitString(string: String) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LastSuccessfulSync &&
                    offsetDateTime == other.offsetDateTime &&
                    string == other.string
            }

            override fun hashCode(): Int = Objects.hash(offsetDateTime, string)

            override fun toString(): String =
                when {
                    offsetDateTime != null -> "LastSuccessfulSync{offsetDateTime=$offsetDateTime}"
                    string != null -> "LastSuccessfulSync{string=$string}"
                    _json != null -> "LastSuccessfulSync{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid LastSuccessfulSync")
                }

            companion object {

                @JvmStatic
                fun ofOffsetDateTime(offsetDateTime: OffsetDateTime) =
                    LastSuccessfulSync(offsetDateTime = offsetDateTime)

                @JvmStatic fun ofString(string: String) = LastSuccessfulSync(string = string)
            }

            /**
             * An interface that defines how to map each variant of [LastSuccessfulSync] to a value
             * of type [T].
             */
            interface Visitor<out T> {

                fun visitOffsetDateTime(offsetDateTime: OffsetDateTime): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [LastSuccessfulSync] to a value of type [T].
                 *
                 * An instance of [LastSuccessfulSync] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws FinchInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw FinchInvalidDataException("Unknown LastSuccessfulSync: $json")
                }
            }

            internal class Deserializer :
                BaseDeserializer<LastSuccessfulSync>(LastSuccessfulSync::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): LastSuccessfulSync {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                    LastSuccessfulSync(offsetDateTime = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    LastSuccessfulSync(string = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> LastSuccessfulSync(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer :
                BaseSerializer<LastSuccessfulSync>(LastSuccessfulSync::class) {

                override fun serialize(
                    value: LastSuccessfulSync,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.offsetDateTime != null -> generator.writeObject(value.offsetDateTime)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid LastSuccessfulSync")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConnectionStatusDetail &&
                status == other.status &&
                lastSuccessfulSync == other.lastSuccessfulSync &&
                message == other.message &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(status, lastSuccessfulSync, message, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConnectionStatusDetail{status=$status, lastSuccessfulSync=$lastSuccessfulSync, message=$message, additionalProperties=$additionalProperties}"
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

            @JvmField val FINCH = of("finch")

            @JvmField val PROVIDER = of("provider")

            @JvmStatic fun of(value: String) = ConnectionType(JsonField.of(value))
        }

        /** An enum containing [ConnectionType]'s known values. */
        enum class Known {
            FINCH,
            PROVIDER,
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
            FINCH,
            PROVIDER,
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
                FINCH -> Value.FINCH
                PROVIDER -> Value.PROVIDER
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
                FINCH -> Known.FINCH
                PROVIDER -> Known.PROVIDER
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

            return other is ConnectionType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class AuthenticationMethodDetail
    private constructor(
        private val type: JsonField<Type>,
        private val connectionStatus: JsonField<ConnectionStatusDetail>,
        private val products: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("connection_status")
            @ExcludeMissing
            connectionStatus: JsonField<ConnectionStatusDetail> = JsonMissing.of(),
            @JsonProperty("products")
            @ExcludeMissing
            products: JsonField<List<String>> = JsonMissing.of(),
        ) : this(type, connectionStatus, products, mutableMapOf())

        /**
         * The type of authentication method
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectionStatus(): Optional<ConnectionStatusDetail> =
            connectionStatus.getOptional("connection_status")

        /**
         * An array of the authorized products associated with the `access_token`
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun products(): Optional<List<String>> = products.getOptional("products")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [connectionStatus].
         *
         * Unlike [connectionStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connection_status")
        @ExcludeMissing
        fun _connectionStatus(): JsonField<ConnectionStatusDetail> = connectionStatus

        /**
         * Returns the raw JSON value of [products].
         *
         * Unlike [products], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("products")
        @ExcludeMissing
        fun _products(): JsonField<List<String>> = products

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
             * Returns a mutable builder for constructing an instance of
             * [AuthenticationMethodDetail].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AuthenticationMethodDetail]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var connectionStatus: JsonField<ConnectionStatusDetail> = JsonMissing.of()
            private var products: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authenticationMethodDetail: AuthenticationMethodDetail) = apply {
                type = authenticationMethodDetail.type
                connectionStatus = authenticationMethodDetail.connectionStatus
                products = authenticationMethodDetail.products.map { it.toMutableList() }
                additionalProperties =
                    authenticationMethodDetail.additionalProperties.toMutableMap()
            }

            /** The type of authentication method */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun connectionStatus(connectionStatus: ConnectionStatusDetail) =
                connectionStatus(JsonField.of(connectionStatus))

            /**
             * Sets [Builder.connectionStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionStatus] with a well-typed
             * [ConnectionStatusDetail] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun connectionStatus(connectionStatus: JsonField<ConnectionStatusDetail>) = apply {
                this.connectionStatus = connectionStatus
            }

            /** An array of the authorized products associated with the `access_token` */
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
             * Returns an immutable instance of [AuthenticationMethodDetail].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AuthenticationMethodDetail =
                AuthenticationMethodDetail(
                    checkRequired("type", type),
                    connectionStatus,
                    (products ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AuthenticationMethodDetail = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            connectionStatus().ifPresent { it.validate() }
            products()
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
            (type.asKnown().getOrNull()?.validity() ?: 0) +
                (connectionStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (products.asKnown().getOrNull()?.size ?: 0)

        /** The type of authentication method */
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ConnectionStatusDetail
        private constructor(
            private val status: JsonField<ConnectionStatusType>,
            private val lastSuccessfulSync: JsonField<LastSuccessfulSync>,
            private val message: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<ConnectionStatusType> = JsonMissing.of(),
                @JsonProperty("last_successful_sync")
                @ExcludeMissing
                lastSuccessfulSync: JsonField<LastSuccessfulSync> = JsonMissing.of(),
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of(),
            ) : this(status, lastSuccessfulSync, message, mutableMapOf())

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): ConnectionStatusType = status.getRequired("status")

            /**
             * The datetime when the connection was last successfully synced
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun lastSuccessfulSync(): Optional<LastSuccessfulSync> =
                lastSuccessfulSync.getOptional("last_successful_sync")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun message(): Optional<String> = message.getOptional("message")

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status")
            @ExcludeMissing
            fun _status(): JsonField<ConnectionStatusType> = status

            /**
             * Returns the raw JSON value of [lastSuccessfulSync].
             *
             * Unlike [lastSuccessfulSync], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("last_successful_sync")
            @ExcludeMissing
            fun _lastSuccessfulSync(): JsonField<LastSuccessfulSync> = lastSuccessfulSync

            /**
             * Returns the raw JSON value of [message].
             *
             * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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
                 * Returns a mutable builder for constructing an instance of
                 * [ConnectionStatusDetail].
                 *
                 * The following fields are required:
                 * ```java
                 * .status()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ConnectionStatusDetail]. */
            class Builder internal constructor() {

                private var status: JsonField<ConnectionStatusType>? = null
                private var lastSuccessfulSync: JsonField<LastSuccessfulSync> = JsonMissing.of()
                private var message: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(connectionStatusDetail: ConnectionStatusDetail) = apply {
                    status = connectionStatusDetail.status
                    lastSuccessfulSync = connectionStatusDetail.lastSuccessfulSync
                    message = connectionStatusDetail.message
                    additionalProperties =
                        connectionStatusDetail.additionalProperties.toMutableMap()
                }

                fun status(status: ConnectionStatusType) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [ConnectionStatusType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun status(status: JsonField<ConnectionStatusType>) = apply { this.status = status }

                /** The datetime when the connection was last successfully synced */
                fun lastSuccessfulSync(lastSuccessfulSync: LastSuccessfulSync?) =
                    lastSuccessfulSync(JsonField.ofNullable(lastSuccessfulSync))

                /**
                 * Alias for calling [Builder.lastSuccessfulSync] with
                 * `lastSuccessfulSync.orElse(null)`.
                 */
                fun lastSuccessfulSync(lastSuccessfulSync: Optional<LastSuccessfulSync>) =
                    lastSuccessfulSync(lastSuccessfulSync.getOrNull())

                /**
                 * Sets [Builder.lastSuccessfulSync] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastSuccessfulSync] with a well-typed
                 * [LastSuccessfulSync] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun lastSuccessfulSync(lastSuccessfulSync: JsonField<LastSuccessfulSync>) = apply {
                    this.lastSuccessfulSync = lastSuccessfulSync
                }

                /**
                 * Alias for calling [lastSuccessfulSync] with
                 * `LastSuccessfulSync.ofOffsetDateTime(offsetDateTime)`.
                 */
                fun lastSuccessfulSync(offsetDateTime: OffsetDateTime) =
                    lastSuccessfulSync(LastSuccessfulSync.ofOffsetDateTime(offsetDateTime))

                /**
                 * Alias for calling [lastSuccessfulSync] with
                 * `LastSuccessfulSync.ofString(string)`.
                 */
                fun lastSuccessfulSync(string: String) =
                    lastSuccessfulSync(LastSuccessfulSync.ofString(string))

                fun message(message: String) = message(JsonField.of(message))

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<String>) = apply { this.message = message }

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
                 * Returns an immutable instance of [ConnectionStatusDetail].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .status()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ConnectionStatusDetail =
                    ConnectionStatusDetail(
                        checkRequired("status", status),
                        lastSuccessfulSync,
                        message,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ConnectionStatusDetail = apply {
                if (validated) {
                    return@apply
                }

                status().validate()
                lastSuccessfulSync().ifPresent { it.validate() }
                message()
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
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (lastSuccessfulSync.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (message.asKnown().isPresent) 1 else 0)

            /** The datetime when the connection was last successfully synced */
            @JsonDeserialize(using = LastSuccessfulSync.Deserializer::class)
            @JsonSerialize(using = LastSuccessfulSync.Serializer::class)
            class LastSuccessfulSync
            private constructor(
                private val offsetDateTime: OffsetDateTime? = null,
                private val string: String? = null,
                private val _json: JsonValue? = null,
            ) {

                fun offsetDateTime(): Optional<OffsetDateTime> = Optional.ofNullable(offsetDateTime)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun isOffsetDateTime(): Boolean = offsetDateTime != null

                fun isString(): Boolean = string != null

                fun asOffsetDateTime(): OffsetDateTime = offsetDateTime.getOrThrow("offsetDateTime")

                fun asString(): String = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        offsetDateTime != null -> visitor.visitOffsetDateTime(offsetDateTime)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): LastSuccessfulSync = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) {}

                            override fun visitString(string: String) {}
                        }
                    )
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
                    accept(
                        object : Visitor<Int> {
                            override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) = 1

                            override fun visitString(string: String) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LastSuccessfulSync &&
                        offsetDateTime == other.offsetDateTime &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(offsetDateTime, string)

                override fun toString(): String =
                    when {
                        offsetDateTime != null ->
                            "LastSuccessfulSync{offsetDateTime=$offsetDateTime}"
                        string != null -> "LastSuccessfulSync{string=$string}"
                        _json != null -> "LastSuccessfulSync{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid LastSuccessfulSync")
                    }

                companion object {

                    @JvmStatic
                    fun ofOffsetDateTime(offsetDateTime: OffsetDateTime) =
                        LastSuccessfulSync(offsetDateTime = offsetDateTime)

                    @JvmStatic fun ofString(string: String) = LastSuccessfulSync(string = string)
                }

                /**
                 * An interface that defines how to map each variant of [LastSuccessfulSync] to a
                 * value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitOffsetDateTime(offsetDateTime: OffsetDateTime): T

                    fun visitString(string: String): T

                    /**
                     * Maps an unknown variant of [LastSuccessfulSync] to a value of type [T].
                     *
                     * An instance of [LastSuccessfulSync] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws FinchInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw FinchInvalidDataException("Unknown LastSuccessfulSync: $json")
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<LastSuccessfulSync>(LastSuccessfulSync::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): LastSuccessfulSync {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                        LastSuccessfulSync(offsetDateTime = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        LastSuccessfulSync(string = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // object).
                            0 -> LastSuccessfulSync(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<LastSuccessfulSync>(LastSuccessfulSync::class) {

                    override fun serialize(
                        value: LastSuccessfulSync,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.offsetDateTime != null ->
                                generator.writeObject(value.offsetDateTime)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid LastSuccessfulSync")
                        }
                    }
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ConnectionStatusDetail &&
                    status == other.status &&
                    lastSuccessfulSync == other.lastSuccessfulSync &&
                    message == other.message &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(status, lastSuccessfulSync, message, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ConnectionStatusDetail{status=$status, lastSuccessfulSync=$lastSuccessfulSync, message=$message, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AuthenticationMethodDetail &&
                type == other.type &&
                connectionStatus == other.connectionStatus &&
                products == other.products &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(type, connectionStatus, products, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AuthenticationMethodDetail{type=$type, connectionStatus=$connectionStatus, products=$products, additionalProperties=$additionalProperties}"
    }

    /** Indicates whether this connection manages a single entity or multiple entities. */
    class EntityMode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SINGLE = of("single")

            @JvmField val MULTI = of("multi")

            @JvmStatic fun of(value: String) = EntityMode(JsonField.of(value))
        }

        /** An enum containing [EntityMode]'s known values. */
        enum class Known {
            SINGLE,
            MULTI,
        }

        /**
         * An enum containing [EntityMode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EntityMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SINGLE,
            MULTI,
            /**
             * An enum member indicating that [EntityMode] was instantiated with an unknown value.
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
                SINGLE -> Value.SINGLE
                MULTI -> Value.MULTI
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
                SINGLE -> Known.SINGLE
                MULTI -> Known.MULTI
                else -> throw FinchInvalidDataException("Unknown EntityMode: $value")
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

        fun validate(): EntityMode = apply {
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

            return other is EntityMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Introspection &&
            id == other.id &&
            clientId == other.clientId &&
            clientType == other.clientType &&
            connectionId == other.connectionId &&
            connectionStatus == other.connectionStatus &&
            connectionType == other.connectionType &&
            products == other.products &&
            providerId == other.providerId &&
            accountId == other.accountId &&
            authenticationMethods == other.authenticationMethods &&
            companyId == other.companyId &&
            customerEmail == other.customerEmail &&
            customerId == other.customerId &&
            customerName == other.customerName &&
            entityIds == other.entityIds &&
            entityMode == other.entityMode &&
            manual == other.manual &&
            payrollProviderId == other.payrollProviderId &&
            username == other.username &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            clientId,
            clientType,
            connectionId,
            connectionStatus,
            connectionType,
            products,
            providerId,
            accountId,
            authenticationMethods,
            companyId,
            customerEmail,
            customerId,
            customerName,
            entityIds,
            entityMode,
            manual,
            payrollProviderId,
            username,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Introspection{id=$id, clientId=$clientId, clientType=$clientType, connectionId=$connectionId, connectionStatus=$connectionStatus, connectionType=$connectionType, products=$products, providerId=$providerId, accountId=$accountId, authenticationMethods=$authenticationMethods, companyId=$companyId, customerEmail=$customerEmail, customerId=$customerId, customerName=$customerName, entityIds=$entityIds, entityMode=$entityMode, manual=$manual, payrollProviderId=$payrollProviderId, username=$username, additionalProperties=$additionalProperties}"
}

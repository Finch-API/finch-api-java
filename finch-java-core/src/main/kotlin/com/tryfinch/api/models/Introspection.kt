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
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = Introspection.Builder::class)
@NoAutoDetect
class Introspection
private constructor(
    private val clientId: JsonField<String>,
    private val clientType: JsonField<ClientType>,
    private val connectionType: JsonField<ConnectionType>,
    private val companyId: JsonField<String>,
    private val accountId: JsonField<String>,
    private val authenticationMethods: JsonField<AuthenticationMethods>,
    private val products: JsonField<List<String>>,
    private val username: JsonField<String>,
    private val payrollProviderId: JsonField<String>,
    private val manual: JsonField<Boolean>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The client id of the application associated with the `access_token`. */
    fun clientId(): String = clientId.getRequired("client_id")

    /** The type of application associated with a token. */
    fun clientType(): ClientType = clientType.getRequired("client_type")

    /**
     * The type of the connection associated with the token.
     * - `provider` - connection to an external provider
     * - `finch` - finch-generated data.
     */
    fun connectionType(): ConnectionType = connectionType.getRequired("connection_type")

    /** The Finch uuid of the company associated with the `access_token`. */
    fun companyId(): String = companyId.getRequired("company_id")

    /** The Finch uuid of the account used to connect this company. */
    fun accountId(): String = accountId.getRequired("account_id")

    fun authenticationMethods(): AuthenticationMethods =
        authenticationMethods.getRequired("authentication_methods")

    /** An array of the authorized products associated with the `access_token`. */
    fun products(): List<String> = products.getRequired("products")

    /** The account username used for login associated with the `access_token`. */
    fun username(): String = username.getRequired("username")

    /** The payroll provider associated with the `access_token`. */
    fun payrollProviderId(): String = payrollProviderId.getRequired("payroll_provider_id")

    /**
     * Whether the connection associated with the `access_token` uses the Assisted Connect Flow.
     * (`true` if using Assisted Connect, `false` if connection is automated)
     */
    fun manual(): Boolean = manual.getRequired("manual")

    /** The client id of the application associated with the `access_token`. */
    @JsonProperty("client_id") @ExcludeMissing fun _clientId() = clientId

    /** The type of application associated with a token. */
    @JsonProperty("client_type") @ExcludeMissing fun _clientType() = clientType

    /**
     * The type of the connection associated with the token.
     * - `provider` - connection to an external provider
     * - `finch` - finch-generated data.
     */
    @JsonProperty("connection_type") @ExcludeMissing fun _connectionType() = connectionType

    /** The Finch uuid of the company associated with the `access_token`. */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId() = companyId

    /** The Finch uuid of the account used to connect this company. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    @JsonProperty("authentication_methods")
    @ExcludeMissing
    fun _authenticationMethods() = authenticationMethods

    /** An array of the authorized products associated with the `access_token`. */
    @JsonProperty("products") @ExcludeMissing fun _products() = products

    /** The account username used for login associated with the `access_token`. */
    @JsonProperty("username") @ExcludeMissing fun _username() = username

    /** The payroll provider associated with the `access_token`. */
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
            clientId()
            clientType()
            connectionType()
            companyId()
            accountId()
            authenticationMethods().validate()
            products()
            username()
            payrollProviderId()
            manual()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Introspection &&
            this.clientId == other.clientId &&
            this.clientType == other.clientType &&
            this.connectionType == other.connectionType &&
            this.companyId == other.companyId &&
            this.accountId == other.accountId &&
            this.authenticationMethods == other.authenticationMethods &&
            this.products == other.products &&
            this.username == other.username &&
            this.payrollProviderId == other.payrollProviderId &&
            this.manual == other.manual &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    clientId,
                    clientType,
                    connectionType,
                    companyId,
                    accountId,
                    authenticationMethods,
                    products,
                    username,
                    payrollProviderId,
                    manual,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Introspection{clientId=$clientId, clientType=$clientType, connectionType=$connectionType, companyId=$companyId, accountId=$accountId, authenticationMethods=$authenticationMethods, products=$products, username=$username, payrollProviderId=$payrollProviderId, manual=$manual, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var clientId: JsonField<String> = JsonMissing.of()
        private var clientType: JsonField<ClientType> = JsonMissing.of()
        private var connectionType: JsonField<ConnectionType> = JsonMissing.of()
        private var companyId: JsonField<String> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var authenticationMethods: JsonField<AuthenticationMethods> = JsonMissing.of()
        private var products: JsonField<List<String>> = JsonMissing.of()
        private var username: JsonField<String> = JsonMissing.of()
        private var payrollProviderId: JsonField<String> = JsonMissing.of()
        private var manual: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(introspection: Introspection) = apply {
            this.clientId = introspection.clientId
            this.clientType = introspection.clientType
            this.connectionType = introspection.connectionType
            this.companyId = introspection.companyId
            this.accountId = introspection.accountId
            this.authenticationMethods = introspection.authenticationMethods
            this.products = introspection.products
            this.username = introspection.username
            this.payrollProviderId = introspection.payrollProviderId
            this.manual = introspection.manual
            additionalProperties(introspection.additionalProperties)
        }

        /** The client id of the application associated with the `access_token`. */
        fun clientId(clientId: String) = clientId(JsonField.of(clientId))

        /** The client id of the application associated with the `access_token`. */
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

        /** The Finch uuid of the company associated with the `access_token`. */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /** The Finch uuid of the company associated with the `access_token`. */
        @JsonProperty("company_id")
        @ExcludeMissing
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /** The Finch uuid of the account used to connect this company. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Finch uuid of the account used to connect this company. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        fun authenticationMethods(authenticationMethods: AuthenticationMethods) =
            authenticationMethods(JsonField.of(authenticationMethods))

        @JsonProperty("authentication_methods")
        @ExcludeMissing
        fun authenticationMethods(authenticationMethods: JsonField<AuthenticationMethods>) = apply {
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

        /** The payroll provider associated with the `access_token`. */
        fun payrollProviderId(payrollProviderId: String) =
            payrollProviderId(JsonField.of(payrollProviderId))

        /** The payroll provider associated with the `access_token`. */
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
                clientId,
                clientType,
                connectionType,
                companyId,
                accountId,
                authenticationMethods,
                products.map { it.toUnmodifiable() },
                username,
                payrollProviderId,
                manual,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = AuthenticationMethods.Builder::class)
    @NoAutoDetect
    class AuthenticationMethods
    private constructor(
        private val type: JsonField<String>,
        private val connectionStatus: JsonField<ConnectionStatus>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun type(): Optional<String> = Optional.ofNullable(type.getNullable("type"))

        fun connectionStatus(): Optional<ConnectionStatus> =
            Optional.ofNullable(connectionStatus.getNullable("connection_status"))

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonProperty("connection_status")
        @ExcludeMissing
        fun _connectionStatus() = connectionStatus

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AuthenticationMethods = apply {
            if (!validated) {
                type()
                connectionStatus().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AuthenticationMethods &&
                this.type == other.type &&
                this.connectionStatus == other.connectionStatus &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        type,
                        connectionStatus,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AuthenticationMethods{type=$type, connectionStatus=$connectionStatus, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: JsonField<String> = JsonMissing.of()
            private var connectionStatus: JsonField<ConnectionStatus> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authenticationMethods: AuthenticationMethods) = apply {
                this.type = authenticationMethods.type
                this.connectionStatus = authenticationMethods.connectionStatus
                additionalProperties(authenticationMethods.additionalProperties)
            }

            fun type(type: String) = type(JsonField.of(type))

            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<String>) = apply { this.type = type }

            fun connectionStatus(connectionStatus: ConnectionStatus) =
                connectionStatus(JsonField.of(connectionStatus))

            @JsonProperty("connection_status")
            @ExcludeMissing
            fun connectionStatus(connectionStatus: JsonField<ConnectionStatus>) = apply {
                this.connectionStatus = connectionStatus
            }

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

            fun build(): AuthenticationMethods =
                AuthenticationMethods(
                    type,
                    connectionStatus,
                    additionalProperties.toUnmodifiable(),
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

            private var hashCode: Int = 0

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ConnectionStatus &&
                    this.status == other.status &&
                    this.message == other.message &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            status,
                            message,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "ConnectionStatus{status=$status, message=$message, additionalProperties=$additionalProperties}"

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
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }

    class ClientType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ClientType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PRODUCTION = ClientType(JsonField.of("production"))

            @JvmField val DEVELOPMENT = ClientType(JsonField.of("development"))

            @JvmField val SANDBOX = ClientType(JsonField.of("sandbox"))

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
    }

    class ConnectionType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConnectionType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PROVIDER = ConnectionType(JsonField.of("provider"))

            @JvmField val FINCH = ConnectionType(JsonField.of("finch"))

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
    }
}

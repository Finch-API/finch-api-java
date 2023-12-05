// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = Introspection.Builder::class)
@NoAutoDetect
class Introspection
private constructor(
    private val clientId: JsonField<String>,
    private val clientType: JsonField<ClientType>,
    private val connectionType: JsonField<ConnectionType>,
    private val companyId: JsonField<String>,
    private val accountId: JsonField<String>,
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
     * The type of the connection associated with the token.<br> `provider` - connection to an
     * external provider<br> `finch` - finch-generated data.
     */
    fun connectionType(): ConnectionType = connectionType.getRequired("connection_type")

    /** The Finch uuid of the company associated with the `access_token`. */
    fun companyId(): String = companyId.getRequired("company_id")

    /** The Finch uuid of the account used to connect this company. */
    fun accountId(): String = accountId.getRequired("account_id")

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
     * The type of the connection associated with the token.<br> `provider` - connection to an
     * external provider<br> `finch` - finch-generated data.
     */
    @JsonProperty("connection_type") @ExcludeMissing fun _connectionType() = connectionType

    /** The Finch uuid of the company associated with the `access_token`. */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId() = companyId

    /** The Finch uuid of the account used to connect this company. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

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
        "Introspection{clientId=$clientId, clientType=$clientType, connectionType=$connectionType, companyId=$companyId, accountId=$accountId, products=$products, username=$username, payrollProviderId=$payrollProviderId, manual=$manual, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var clientId: JsonField<String> = JsonMissing.of()
        private var clientType: JsonField<ClientType> = JsonMissing.of()
        private var connectionType: JsonField<ConnectionType> = JsonMissing.of()
        private var companyId: JsonField<String> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
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
         * The type of the connection associated with the token.<br> `provider` - connection to an
         * external provider<br> `finch` - finch-generated data.
         */
        fun connectionType(connectionType: ConnectionType) =
            connectionType(JsonField.of(connectionType))

        /**
         * The type of the connection associated with the token.<br> `provider` - connection to an
         * external provider<br> `finch` - finch-generated data.
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
                products.map { it.toUnmodifiable() },
                username,
                payrollProviderId,
                manual,
                additionalProperties.toUnmodifiable(),
            )
    }

    class ClientType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

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
    ) {

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

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

@JsonDeserialize(builder = CreateAccessTokenResponse.Builder::class)
@NoAutoDetect
class CreateAccessTokenResponse
private constructor(
    private val accessToken: JsonField<String>,
    private val tokenType: JsonField<String>,
    private val connectionId: JsonField<String>,
    private val customerId: JsonField<String>,
    private val accountId: JsonField<String>,
    private val clientType: JsonField<ClientType>,
    private val companyId: JsonField<String>,
    private val connectionType: JsonField<ConnectionType>,
    private val products: JsonField<List<String>>,
    private val providerId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The access token for the connection. */
    fun accessToken(): String = accessToken.getRequired("access_token")

    /** The RFC 8693 token type (Finch uses `bearer` tokens) */
    fun tokenType(): Optional<String> = Optional.ofNullable(tokenType.getNullable("token_type"))

    /** The Finch UUID of the connection associated with the `access_token`. */
    fun connectionId(): String = connectionId.getRequired("connection_id")

    /**
     * The ID of your customer you provided to Finch when a connect session was created for this
     * connection.
     */
    fun customerId(): Optional<String> = Optional.ofNullable(customerId.getNullable("customer_id"))

    /** [DEPRECATED] Use `connection_id` to identify the connection instead of this account ID. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The type of application associated with a token. */
    fun clientType(): ClientType = clientType.getRequired("client_type")

    /** [DEPRECATED] Use `connection_id` to identify the connection instead of this company ID. */
    fun companyId(): String = companyId.getRequired("company_id")

    /**
     * The type of the connection associated with the token.
     * - `provider` - connection to an external provider
     * - `finch` - finch-generated data.
     */
    fun connectionType(): ConnectionType = connectionType.getRequired("connection_type")

    /** An array of the authorized products associated with the `access_token`. */
    fun products(): List<String> = products.getRequired("products")

    /** The ID of the provider associated with the `access_token`. */
    fun providerId(): String = providerId.getRequired("provider_id")

    /** The access token for the connection. */
    @JsonProperty("access_token") @ExcludeMissing fun _accessToken() = accessToken

    /** The RFC 8693 token type (Finch uses `bearer` tokens) */
    @JsonProperty("token_type") @ExcludeMissing fun _tokenType() = tokenType

    /** The Finch UUID of the connection associated with the `access_token`. */
    @JsonProperty("connection_id") @ExcludeMissing fun _connectionId() = connectionId

    /**
     * The ID of your customer you provided to Finch when a connect session was created for this
     * connection.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId() = customerId

    /** [DEPRECATED] Use `connection_id` to identify the connection instead of this account ID. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The type of application associated with a token. */
    @JsonProperty("client_type") @ExcludeMissing fun _clientType() = clientType

    /** [DEPRECATED] Use `connection_id` to identify the connection instead of this company ID. */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId() = companyId

    /**
     * The type of the connection associated with the token.
     * - `provider` - connection to an external provider
     * - `finch` - finch-generated data.
     */
    @JsonProperty("connection_type") @ExcludeMissing fun _connectionType() = connectionType

    /** An array of the authorized products associated with the `access_token`. */
    @JsonProperty("products") @ExcludeMissing fun _products() = products

    /** The ID of the provider associated with the `access_token`. */
    @JsonProperty("provider_id") @ExcludeMissing fun _providerId() = providerId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CreateAccessTokenResponse = apply {
        if (!validated) {
            accessToken()
            tokenType()
            connectionId()
            customerId()
            accountId()
            clientType()
            companyId()
            connectionType()
            products()
            providerId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accessToken: JsonField<String> = JsonMissing.of()
        private var tokenType: JsonField<String> = JsonMissing.of()
        private var connectionId: JsonField<String> = JsonMissing.of()
        private var customerId: JsonField<String> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var clientType: JsonField<ClientType> = JsonMissing.of()
        private var companyId: JsonField<String> = JsonMissing.of()
        private var connectionType: JsonField<ConnectionType> = JsonMissing.of()
        private var products: JsonField<List<String>> = JsonMissing.of()
        private var providerId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createAccessTokenResponse: CreateAccessTokenResponse) = apply {
            this.accessToken = createAccessTokenResponse.accessToken
            this.tokenType = createAccessTokenResponse.tokenType
            this.connectionId = createAccessTokenResponse.connectionId
            this.customerId = createAccessTokenResponse.customerId
            this.accountId = createAccessTokenResponse.accountId
            this.clientType = createAccessTokenResponse.clientType
            this.companyId = createAccessTokenResponse.companyId
            this.connectionType = createAccessTokenResponse.connectionType
            this.products = createAccessTokenResponse.products
            this.providerId = createAccessTokenResponse.providerId
            additionalProperties(createAccessTokenResponse.additionalProperties)
        }

        /** The access token for the connection. */
        fun accessToken(accessToken: String) = accessToken(JsonField.of(accessToken))

        /** The access token for the connection. */
        @JsonProperty("access_token")
        @ExcludeMissing
        fun accessToken(accessToken: JsonField<String>) = apply { this.accessToken = accessToken }

        /** The RFC 8693 token type (Finch uses `bearer` tokens) */
        fun tokenType(tokenType: String) = tokenType(JsonField.of(tokenType))

        /** The RFC 8693 token type (Finch uses `bearer` tokens) */
        @JsonProperty("token_type")
        @ExcludeMissing
        fun tokenType(tokenType: JsonField<String>) = apply { this.tokenType = tokenType }

        /** The Finch UUID of the connection associated with the `access_token`. */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /** The Finch UUID of the connection associated with the `access_token`. */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

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
         * [DEPRECATED] Use `connection_id` to identify the connection instead of this account ID.
         */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * [DEPRECATED] Use `connection_id` to identify the connection instead of this account ID.
         */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The type of application associated with a token. */
        fun clientType(clientType: ClientType) = clientType(JsonField.of(clientType))

        /** The type of application associated with a token. */
        @JsonProperty("client_type")
        @ExcludeMissing
        fun clientType(clientType: JsonField<ClientType>) = apply { this.clientType = clientType }

        /**
         * [DEPRECATED] Use `connection_id` to identify the connection instead of this company ID.
         */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /**
         * [DEPRECATED] Use `connection_id` to identify the connection instead of this company ID.
         */
        @JsonProperty("company_id")
        @ExcludeMissing
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

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

        /** An array of the authorized products associated with the `access_token`. */
        fun products(products: List<String>) = products(JsonField.of(products))

        /** An array of the authorized products associated with the `access_token`. */
        @JsonProperty("products")
        @ExcludeMissing
        fun products(products: JsonField<List<String>>) = apply { this.products = products }

        /** The ID of the provider associated with the `access_token`. */
        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        /** The ID of the provider associated with the `access_token`. */
        @JsonProperty("provider_id")
        @ExcludeMissing
        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

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

        fun build(): CreateAccessTokenResponse =
            CreateAccessTokenResponse(
                accessToken,
                tokenType,
                connectionId,
                customerId,
                accountId,
                clientType,
                companyId,
                connectionType,
                products.map { it.toImmutable() },
                providerId,
                additionalProperties.toImmutable(),
            )
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

            return /* spotless:off */ other is ClientType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

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

            return /* spotless:off */ other is ConnectionType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

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
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreateAccessTokenResponse && accessToken == other.accessToken && tokenType == other.tokenType && connectionId == other.connectionId && customerId == other.customerId && accountId == other.accountId && clientType == other.clientType && companyId == other.companyId && connectionType == other.connectionType && products == other.products && providerId == other.providerId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accessToken, tokenType, connectionId, customerId, accountId, clientType, companyId, connectionType, products, providerId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreateAccessTokenResponse{accessToken=$accessToken, tokenType=$tokenType, connectionId=$connectionId, customerId=$customerId, accountId=$accountId, clientType=$clientType, companyId=$companyId, connectionType=$connectionType, products=$products, providerId=$providerId, additionalProperties=$additionalProperties}"
}

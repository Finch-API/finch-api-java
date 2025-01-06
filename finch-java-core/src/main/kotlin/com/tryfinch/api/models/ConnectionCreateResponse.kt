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
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ConnectionCreateResponse
@JsonCreator
private constructor(
    @JsonProperty("access_token")
    @ExcludeMissing
    private val accessToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("authentication_type")
    @ExcludeMissing
    private val authenticationType: JsonField<AuthenticationType> = JsonMissing.of(),
    @JsonProperty("company_id")
    @ExcludeMissing
    private val companyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("connection_id")
    @ExcludeMissing
    private val connectionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("products")
    @ExcludeMissing
    private val products: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("provider_id")
    @ExcludeMissing
    private val providerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("token_type")
    @ExcludeMissing
    private val tokenType: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun accessToken(): String = accessToken.getRequired("access_token")

    /** [DEPRECATED] Use `connection_id` to associate a connection with an access token */
    fun accountId(): String = accountId.getRequired("account_id")

    fun authenticationType(): AuthenticationType =
        authenticationType.getRequired("authentication_type")

    /** [DEPRECATED] Use `connection_id` to associate a connection with an access token */
    fun companyId(): String = companyId.getRequired("company_id")

    /** The ID of the new connection */
    fun connectionId(): String = connectionId.getRequired("connection_id")

    fun products(): List<String> = products.getRequired("products")

    /** The ID of the provider associated with the `access_token`. */
    fun providerId(): String = providerId.getRequired("provider_id")

    fun tokenType(): Optional<String> = Optional.ofNullable(tokenType.getNullable("token_type"))

    @JsonProperty("access_token") @ExcludeMissing fun _accessToken() = accessToken

    /** [DEPRECATED] Use `connection_id` to associate a connection with an access token */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    @JsonProperty("authentication_type")
    @ExcludeMissing
    fun _authenticationType() = authenticationType

    /** [DEPRECATED] Use `connection_id` to associate a connection with an access token */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId() = companyId

    /** The ID of the new connection */
    @JsonProperty("connection_id") @ExcludeMissing fun _connectionId() = connectionId

    @JsonProperty("products") @ExcludeMissing fun _products() = products

    /** The ID of the provider associated with the `access_token`. */
    @JsonProperty("provider_id") @ExcludeMissing fun _providerId() = providerId

    @JsonProperty("token_type") @ExcludeMissing fun _tokenType() = tokenType

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ConnectionCreateResponse = apply {
        if (!validated) {
            accessToken()
            accountId()
            authenticationType()
            companyId()
            connectionId()
            products()
            providerId()
            tokenType()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accessToken: JsonField<String> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var authenticationType: JsonField<AuthenticationType> = JsonMissing.of()
        private var companyId: JsonField<String> = JsonMissing.of()
        private var connectionId: JsonField<String> = JsonMissing.of()
        private var products: JsonField<List<String>> = JsonMissing.of()
        private var providerId: JsonField<String> = JsonMissing.of()
        private var tokenType: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(connectionCreateResponse: ConnectionCreateResponse) = apply {
            accessToken = connectionCreateResponse.accessToken
            accountId = connectionCreateResponse.accountId
            authenticationType = connectionCreateResponse.authenticationType
            companyId = connectionCreateResponse.companyId
            connectionId = connectionCreateResponse.connectionId
            products = connectionCreateResponse.products
            providerId = connectionCreateResponse.providerId
            tokenType = connectionCreateResponse.tokenType
            additionalProperties = connectionCreateResponse.additionalProperties.toMutableMap()
        }

        fun accessToken(accessToken: String) = accessToken(JsonField.of(accessToken))

        fun accessToken(accessToken: JsonField<String>) = apply { this.accessToken = accessToken }

        /** [DEPRECATED] Use `connection_id` to associate a connection with an access token */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** [DEPRECATED] Use `connection_id` to associate a connection with an access token */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        fun authenticationType(authenticationType: AuthenticationType) =
            authenticationType(JsonField.of(authenticationType))

        fun authenticationType(authenticationType: JsonField<AuthenticationType>) = apply {
            this.authenticationType = authenticationType
        }

        /** [DEPRECATED] Use `connection_id` to associate a connection with an access token */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /** [DEPRECATED] Use `connection_id` to associate a connection with an access token */
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /** The ID of the new connection */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /** The ID of the new connection */
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        fun products(products: List<String>) = products(JsonField.of(products))

        fun products(products: JsonField<List<String>>) = apply { this.products = products }

        /** The ID of the provider associated with the `access_token`. */
        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        /** The ID of the provider associated with the `access_token`. */
        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        fun tokenType(tokenType: String) = tokenType(JsonField.of(tokenType))

        fun tokenType(tokenType: JsonField<String>) = apply { this.tokenType = tokenType }

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

        fun build(): ConnectionCreateResponse =
            ConnectionCreateResponse(
                accessToken,
                accountId,
                authenticationType,
                companyId,
                connectionId,
                products.map { it.toImmutable() },
                providerId,
                tokenType,
                additionalProperties.toImmutable(),
            )
    }

    class AuthenticationType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CREDENTIAL = of("credential")

            @JvmField val API_TOKEN = of("api_token")

            @JvmField val OAUTH = of("oauth")

            @JvmField val ASSISTED = of("assisted")

            @JvmStatic fun of(value: String) = AuthenticationType(JsonField.of(value))
        }

        enum class Known {
            CREDENTIAL,
            API_TOKEN,
            OAUTH,
            ASSISTED,
        }

        enum class Value {
            CREDENTIAL,
            API_TOKEN,
            OAUTH,
            ASSISTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREDENTIAL -> Value.CREDENTIAL
                API_TOKEN -> Value.API_TOKEN
                OAUTH -> Value.OAUTH
                ASSISTED -> Value.ASSISTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREDENTIAL -> Known.CREDENTIAL
                API_TOKEN -> Known.API_TOKEN
                OAUTH -> Known.OAUTH
                ASSISTED -> Known.ASSISTED
                else -> throw FinchInvalidDataException("Unknown AuthenticationType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthenticationType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConnectionCreateResponse && accessToken == other.accessToken && accountId == other.accountId && authenticationType == other.authenticationType && companyId == other.companyId && connectionId == other.connectionId && products == other.products && providerId == other.providerId && tokenType == other.tokenType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accessToken, accountId, authenticationType, companyId, connectionId, products, providerId, tokenType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConnectionCreateResponse{accessToken=$accessToken, accountId=$accountId, authenticationType=$authenticationType, companyId=$companyId, connectionId=$connectionId, products=$products, providerId=$providerId, tokenType=$tokenType, additionalProperties=$additionalProperties}"
}

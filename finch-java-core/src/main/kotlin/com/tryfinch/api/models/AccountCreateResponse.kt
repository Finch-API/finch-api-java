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

@JsonDeserialize(builder = AccountCreateResponse.Builder::class)
@NoAutoDetect
class AccountCreateResponse
private constructor(
    private val companyId: JsonField<String>,
    private val providerId: JsonField<String>,
    private val accountId: JsonField<String>,
    private val authenticationType: JsonField<AuthenticationType>,
    private val products: JsonField<List<String>>,
    private val accessToken: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun companyId(): String = companyId.getRequired("company_id")

    fun providerId(): String = providerId.getRequired("provider_id")

    fun accountId(): String = accountId.getRequired("account_id")

    fun authenticationType(): AuthenticationType =
        authenticationType.getRequired("authentication_type")

    fun products(): List<String> = products.getRequired("products")

    fun accessToken(): String = accessToken.getRequired("access_token")

    @JsonProperty("company_id") @ExcludeMissing fun _companyId() = companyId

    @JsonProperty("provider_id") @ExcludeMissing fun _providerId() = providerId

    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    @JsonProperty("authentication_type")
    @ExcludeMissing
    fun _authenticationType() = authenticationType

    @JsonProperty("products") @ExcludeMissing fun _products() = products

    @JsonProperty("access_token") @ExcludeMissing fun _accessToken() = accessToken

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AccountCreateResponse = apply {
        if (!validated) {
            companyId()
            providerId()
            accountId()
            authenticationType()
            products()
            accessToken()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountCreateResponse &&
            this.companyId == other.companyId &&
            this.providerId == other.providerId &&
            this.accountId == other.accountId &&
            this.authenticationType == other.authenticationType &&
            this.products == other.products &&
            this.accessToken == other.accessToken &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    companyId,
                    providerId,
                    accountId,
                    authenticationType,
                    products,
                    accessToken,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "AccountCreateResponse{companyId=$companyId, providerId=$providerId, accountId=$accountId, authenticationType=$authenticationType, products=$products, accessToken=$accessToken, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var companyId: JsonField<String> = JsonMissing.of()
        private var providerId: JsonField<String> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var authenticationType: JsonField<AuthenticationType> = JsonMissing.of()
        private var products: JsonField<List<String>> = JsonMissing.of()
        private var accessToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountCreateResponse: AccountCreateResponse) = apply {
            this.companyId = accountCreateResponse.companyId
            this.providerId = accountCreateResponse.providerId
            this.accountId = accountCreateResponse.accountId
            this.authenticationType = accountCreateResponse.authenticationType
            this.products = accountCreateResponse.products
            this.accessToken = accountCreateResponse.accessToken
            additionalProperties(accountCreateResponse.additionalProperties)
        }

        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        @JsonProperty("company_id")
        @ExcludeMissing
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        @JsonProperty("provider_id")
        @ExcludeMissing
        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        fun authenticationType(authenticationType: AuthenticationType) =
            authenticationType(JsonField.of(authenticationType))

        @JsonProperty("authentication_type")
        @ExcludeMissing
        fun authenticationType(authenticationType: JsonField<AuthenticationType>) = apply {
            this.authenticationType = authenticationType
        }

        fun products(products: List<String>) = products(JsonField.of(products))

        @JsonProperty("products")
        @ExcludeMissing
        fun products(products: JsonField<List<String>>) = apply { this.products = products }

        fun accessToken(accessToken: String) = accessToken(JsonField.of(accessToken))

        @JsonProperty("access_token")
        @ExcludeMissing
        fun accessToken(accessToken: JsonField<String>) = apply { this.accessToken = accessToken }

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

        fun build(): AccountCreateResponse =
            AccountCreateResponse(
                companyId,
                providerId,
                accountId,
                authenticationType,
                products.map { it.toUnmodifiable() },
                accessToken,
                additionalProperties.toUnmodifiable(),
            )
    }

    class AuthenticationType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AuthenticationType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CREDENTIAL = AuthenticationType(JsonField.of("credential"))

            @JvmField val API_TOKEN = AuthenticationType(JsonField.of("api_token"))

            @JvmField val OAUTH = AuthenticationType(JsonField.of("oauth"))

            @JvmField val ASSISTED = AuthenticationType(JsonField.of("assisted"))

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
    }
}

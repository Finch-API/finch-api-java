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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AccountUpdateResponse
private constructor(
    private val accountId: JsonField<String>,
    private val authenticationType: JsonField<AuthenticationType>,
    private val companyId: JsonField<String>,
    private val products: JsonField<List<String>>,
    private val providerId: JsonField<String>,
    private val connectionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authentication_type")
        @ExcludeMissing
        authenticationType: JsonField<AuthenticationType> = JsonMissing.of(),
        @JsonProperty("company_id") @ExcludeMissing companyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("products")
        @ExcludeMissing
        products: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("provider_id")
        @ExcludeMissing
        providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connection_id")
        @ExcludeMissing
        connectionId: JsonField<String> = JsonMissing.of(),
    ) : this(
        accountId,
        authenticationType,
        companyId,
        products,
        providerId,
        connectionId,
        mutableMapOf(),
    )

    /**
     * [DEPRECATED] Use `connection_id` to associate a connection with an access token
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun accountId(): String = accountId.getRequired("account_id")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authenticationType(): AuthenticationType =
        authenticationType.getRequired("authentication_type")

    /**
     * [DEPRECATED] Use `connection_id` to associate a connection with an access token
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun companyId(): String = companyId.getRequired("company_id")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun products(): List<String> = products.getRequired("products")

    /**
     * The ID of the provider associated with the `access_token`
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun providerId(): String = providerId.getRequired("provider_id")

    /**
     * The ID of the new connection
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

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
     * Returns the raw JSON value of [authenticationType].
     *
     * Unlike [authenticationType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("authentication_type")
    @ExcludeMissing
    fun _authenticationType(): JsonField<AuthenticationType> = authenticationType

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
     * Returns the raw JSON value of [connectionId].
     *
     * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection_id")
    @ExcludeMissing
    fun _connectionId(): JsonField<String> = connectionId

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
         * Returns a mutable builder for constructing an instance of [AccountUpdateResponse].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .authenticationType()
         * .companyId()
         * .products()
         * .providerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountUpdateResponse]. */
    class Builder internal constructor() {

        private var accountId: JsonField<String>? = null
        private var authenticationType: JsonField<AuthenticationType>? = null
        private var companyId: JsonField<String>? = null
        private var products: JsonField<MutableList<String>>? = null
        private var providerId: JsonField<String>? = null
        private var connectionId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountUpdateResponse: AccountUpdateResponse) = apply {
            accountId = accountUpdateResponse.accountId
            authenticationType = accountUpdateResponse.authenticationType
            companyId = accountUpdateResponse.companyId
            products = accountUpdateResponse.products.map { it.toMutableList() }
            providerId = accountUpdateResponse.providerId
            connectionId = accountUpdateResponse.connectionId
            additionalProperties = accountUpdateResponse.additionalProperties.toMutableMap()
        }

        /** [DEPRECATED] Use `connection_id` to associate a connection with an access token */
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

        fun authenticationType(authenticationType: AuthenticationType) =
            authenticationType(JsonField.of(authenticationType))

        /**
         * Sets [Builder.authenticationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authenticationType] with a well-typed
         * [AuthenticationType] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun authenticationType(authenticationType: JsonField<AuthenticationType>) = apply {
            this.authenticationType = authenticationType
        }

        /** [DEPRECATED] Use `connection_id` to associate a connection with an access token */
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

        /** The ID of the provider associated with the `access_token` */
        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        /**
         * Sets [Builder.providerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        /** The ID of the new connection */
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
         * Returns an immutable instance of [AccountUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .authenticationType()
         * .companyId()
         * .products()
         * .providerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountUpdateResponse =
            AccountUpdateResponse(
                checkRequired("accountId", accountId),
                checkRequired("authenticationType", authenticationType),
                checkRequired("companyId", companyId),
                checkRequired("products", products).map { it.toImmutable() },
                checkRequired("providerId", providerId),
                connectionId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AccountUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        accountId()
        authenticationType().validate()
        companyId()
        products()
        providerId()
        connectionId()
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
            (authenticationType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (companyId.asKnown().isPresent) 1 else 0) +
            (products.asKnown().getOrNull()?.size ?: 0) +
            (if (providerId.asKnown().isPresent) 1 else 0) +
            (if (connectionId.asKnown().isPresent) 1 else 0)

    class AuthenticationType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CREDENTIAL = of("credential")

            @JvmField val API_TOKEN = of("api_token")

            @JvmField val OAUTH = of("oauth")

            @JvmField val ASSISTED = of("assisted")

            @JvmStatic fun of(value: String) = AuthenticationType(JsonField.of(value))
        }

        /** An enum containing [AuthenticationType]'s known values. */
        enum class Known {
            CREDENTIAL,
            API_TOKEN,
            OAUTH,
            ASSISTED,
        }

        /**
         * An enum containing [AuthenticationType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AuthenticationType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDENTIAL,
            API_TOKEN,
            OAUTH,
            ASSISTED,
            /**
             * An enum member indicating that [AuthenticationType] was instantiated with an unknown
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
                CREDENTIAL -> Value.CREDENTIAL
                API_TOKEN -> Value.API_TOKEN
                OAUTH -> Value.OAUTH
                ASSISTED -> Value.ASSISTED
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
                CREDENTIAL -> Known.CREDENTIAL
                API_TOKEN -> Known.API_TOKEN
                OAUTH -> Known.OAUTH
                ASSISTED -> Known.ASSISTED
                else -> throw FinchInvalidDataException("Unknown AuthenticationType: $value")
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

        fun validate(): AuthenticationType = apply {
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

            return /* spotless:off */ other is AuthenticationType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountUpdateResponse && accountId == other.accountId && authenticationType == other.authenticationType && companyId == other.companyId && products == other.products && providerId == other.providerId && connectionId == other.connectionId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountId, authenticationType, companyId, products, providerId, connectionId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountUpdateResponse{accountId=$accountId, authenticationType=$authenticationType, companyId=$companyId, products=$products, providerId=$providerId, connectionId=$connectionId, additionalProperties=$additionalProperties}"
}

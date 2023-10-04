// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
import java.util.Objects

@JsonDeserialize(builder = Introspection.Builder::class)
@NoAutoDetect
class Introspection
private constructor(
    private val clientId: JsonField<String>,
    private val companyId: JsonField<String>,
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

    /** The Finch uuid of the company associated with the `access_token`. */
    fun companyId(): String = companyId.getRequired("company_id")

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

    /** The Finch uuid of the company associated with the `access_token`. */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId() = companyId

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
            companyId()
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
            this.companyId == other.companyId &&
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
                    companyId,
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
        "Introspection{clientId=$clientId, companyId=$companyId, products=$products, username=$username, payrollProviderId=$payrollProviderId, manual=$manual, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var clientId: JsonField<String> = JsonMissing.of()
        private var companyId: JsonField<String> = JsonMissing.of()
        private var products: JsonField<List<String>> = JsonMissing.of()
        private var username: JsonField<String> = JsonMissing.of()
        private var payrollProviderId: JsonField<String> = JsonMissing.of()
        private var manual: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(introspection: Introspection) = apply {
            this.clientId = introspection.clientId
            this.companyId = introspection.companyId
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

        /** The Finch uuid of the company associated with the `access_token`. */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /** The Finch uuid of the company associated with the `access_token`. */
        @JsonProperty("company_id")
        @ExcludeMissing
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

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
                companyId,
                products.map { it.toUnmodifiable() },
                username,
                payrollProviderId,
                manual,
                additionalProperties.toUnmodifiable(),
            )
    }
}

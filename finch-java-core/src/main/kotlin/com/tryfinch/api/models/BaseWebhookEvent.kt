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

@JsonDeserialize(builder = BaseWebhookEvent.Builder::class)
@NoAutoDetect
class BaseWebhookEvent
private constructor(
    private val companyId: JsonField<String>,
    private val accountId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Unique Finch id of the company for which data has been updated. */
    fun companyId(): String = companyId.getRequired("company_id")

    /** Unique Finch id of the employer account that was used to make this connection. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** Unique Finch id of the company for which data has been updated. */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId() = companyId

    /** Unique Finch id of the employer account that was used to make this connection. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): BaseWebhookEvent = apply {
        if (!validated) {
            companyId()
            accountId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BaseWebhookEvent &&
            this.companyId == other.companyId &&
            this.accountId == other.accountId &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    companyId,
                    accountId,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "BaseWebhookEvent{companyId=$companyId, accountId=$accountId, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var companyId: JsonField<String> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(baseWebhookEvent: BaseWebhookEvent) = apply {
            this.companyId = baseWebhookEvent.companyId
            this.accountId = baseWebhookEvent.accountId
            additionalProperties(baseWebhookEvent.additionalProperties)
        }

        /** Unique Finch id of the company for which data has been updated. */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /** Unique Finch id of the company for which data has been updated. */
        @JsonProperty("company_id")
        @ExcludeMissing
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /** Unique Finch id of the employer account that was used to make this connection. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** Unique Finch id of the employer account that was used to make this connection. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

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

        fun build(): BaseWebhookEvent =
            BaseWebhookEvent(
                companyId,
                accountId,
                additionalProperties.toUnmodifiable(),
            )
    }
}

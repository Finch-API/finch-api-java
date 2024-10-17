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

@JsonDeserialize(builder = PaymentCreateResponse.Builder::class)
@NoAutoDetect
class PaymentCreateResponse
private constructor(
    private val paymentId: JsonField<String>,
    private val payDate: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The ID of the payment. */
    fun paymentId(): String = paymentId.getRequired("payment_id")

    /** The date of the payment. */
    fun payDate(): String = payDate.getRequired("pay_date")

    /** The ID of the payment. */
    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId() = paymentId

    /** The date of the payment. */
    @JsonProperty("pay_date") @ExcludeMissing fun _payDate() = payDate

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PaymentCreateResponse = apply {
        if (!validated) {
            paymentId()
            payDate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var paymentId: JsonField<String> = JsonMissing.of()
        private var payDate: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentCreateResponse: PaymentCreateResponse) = apply {
            this.paymentId = paymentCreateResponse.paymentId
            this.payDate = paymentCreateResponse.payDate
            additionalProperties(paymentCreateResponse.additionalProperties)
        }

        /** The ID of the payment. */
        fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

        /** The ID of the payment. */
        @JsonProperty("payment_id")
        @ExcludeMissing
        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

        /** The date of the payment. */
        fun payDate(payDate: String) = payDate(JsonField.of(payDate))

        /** The date of the payment. */
        @JsonProperty("pay_date")
        @ExcludeMissing
        fun payDate(payDate: JsonField<String>) = apply { this.payDate = payDate }

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

        fun build(): PaymentCreateResponse =
            PaymentCreateResponse(
                paymentId,
                payDate,
                additionalProperties.toUnmodifiable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentCreateResponse && this.paymentId == other.paymentId && this.payDate == other.payDate && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(paymentId, payDate, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "PaymentCreateResponse{paymentId=$paymentId, payDate=$payDate, additionalProperties=$additionalProperties}"
}

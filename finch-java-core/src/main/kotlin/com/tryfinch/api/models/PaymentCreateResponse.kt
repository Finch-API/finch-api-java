// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import java.util.Objects

@NoAutoDetect
class PaymentCreateResponse
@JsonCreator
private constructor(
    @JsonProperty("payment_id")
    @ExcludeMissing
    private val paymentId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("pay_date")
    @ExcludeMissing
    private val payDate: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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

    private var validated: Boolean = false

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
            paymentId = paymentCreateResponse.paymentId
            payDate = paymentCreateResponse.payDate
            additionalProperties = paymentCreateResponse.additionalProperties.toMutableMap()
        }

        /** The ID of the payment. */
        fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

        /** The ID of the payment. */
        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

        /** The date of the payment. */
        fun payDate(payDate: String) = payDate(JsonField.of(payDate))

        /** The date of the payment. */
        fun payDate(payDate: JsonField<String>) = apply { this.payDate = payDate }

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

        fun build(): PaymentCreateResponse =
            PaymentCreateResponse(
                paymentId,
                payDate,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentCreateResponse && paymentId == other.paymentId && payDate == other.payDate && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(paymentId, payDate, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentCreateResponse{paymentId=$paymentId, payDate=$payDate, additionalProperties=$additionalProperties}"
}

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
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects

@NoAutoDetect
class PaymentCreateResponse
@JsonCreator
private constructor(
    @JsonProperty("pay_date")
    @ExcludeMissing
    private val payDate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("payment_id")
    @ExcludeMissing
    private val paymentId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The date of the payment.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun payDate(): String = payDate.getRequired("pay_date")

    /**
     * The ID of the payment.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentId(): String = paymentId.getRequired("payment_id")

    /**
     * Returns the raw JSON value of [payDate].
     *
     * Unlike [payDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pay_date") @ExcludeMissing fun _payDate(): JsonField<String> = payDate

    /**
     * Returns the raw JSON value of [paymentId].
     *
     * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PaymentCreateResponse = apply {
        if (validated) {
            return@apply
        }

        payDate()
        paymentId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .payDate()
         * .paymentId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaymentCreateResponse]. */
    class Builder internal constructor() {

        private var payDate: JsonField<String>? = null
        private var paymentId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentCreateResponse: PaymentCreateResponse) = apply {
            payDate = paymentCreateResponse.payDate
            paymentId = paymentCreateResponse.paymentId
            additionalProperties = paymentCreateResponse.additionalProperties.toMutableMap()
        }

        /** The date of the payment. */
        fun payDate(payDate: String) = payDate(JsonField.of(payDate))

        /**
         * Sets [Builder.payDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payDate] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun payDate(payDate: JsonField<String>) = apply { this.payDate = payDate }

        /** The ID of the payment. */
        fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

        /**
         * Sets [Builder.paymentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

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
         * Returns an immutable instance of [PaymentCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .payDate()
         * .paymentId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentCreateResponse =
            PaymentCreateResponse(
                checkRequired("payDate", payDate),
                checkRequired("paymentId", paymentId),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentCreateResponse && payDate == other.payDate && paymentId == other.paymentId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(payDate, paymentId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentCreateResponse{payDate=$payDate, paymentId=$paymentId, additionalProperties=$additionalProperties}"
}

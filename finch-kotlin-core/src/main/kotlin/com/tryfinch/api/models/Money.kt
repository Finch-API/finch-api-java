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

@JsonDeserialize(builder = Money.Builder::class)
@NoAutoDetect
class Money
private constructor(
    private val amount: JsonField<Long>,
    private val currency: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Amount for money object (in cents) */
    fun amount(): Long? = amount.getNullable("amount")

    fun currency(): String? = currency.getNullable("currency")

    /** Amount for money object (in cents) */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            amount()
            currency()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Money &&
            this.amount == other.amount &&
            this.currency == other.currency &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    amount,
                    currency,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Money{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var amount: JsonField<Long> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(money: Money) = apply {
            this.amount = money.amount
            this.currency = money.currency
            additionalProperties(money.additionalProperties)
        }

        /** Amount for money object (in cents) */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** Amount for money object (in cents) */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        fun currency(currency: String) = currency(JsonField.of(currency))

        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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

        fun build(): Money =
            Money(
                amount,
                currency,
                additionalProperties.toUnmodifiable(),
            )
    }
}

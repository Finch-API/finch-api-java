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

@JsonDeserialize(builder = BenfitContribution.Builder::class)
@NoAutoDetect
class BenfitContribution
private constructor(
    private val type: JsonField<Type>,
    private val amount: JsonField<Long>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Contribution type. */
    fun type(): Type? = type.getNullable("type")

    /** Contribution amount in cents (if `fixed`) or basis points (if `percent`). */
    fun amount(): Long? = amount.getNullable("amount")

    /** Contribution type. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /** Contribution amount in cents (if `fixed`) or basis points (if `percent`). */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            type()
            amount()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BenfitContribution &&
            this.type == other.type &&
            this.amount == other.amount &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    type,
                    amount,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "BenfitContribution{type=$type, amount=$amount, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var type: JsonField<Type> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(benfitContribution: BenfitContribution) = apply {
            this.type = benfitContribution.type
            this.amount = benfitContribution.amount
            additionalProperties(benfitContribution.additionalProperties)
        }

        /** Contribution type. */
        fun type(type: Type) = type(JsonField.of(type))

        /** Contribution type. */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Contribution amount in cents (if `fixed`) or basis points (if `percent`). */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** Contribution amount in cents (if `fixed`) or basis points (if `percent`). */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

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

        fun build(): BenfitContribution =
            BenfitContribution(
                type,
                amount,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val FIXED = Type(JsonField.of("fixed"))

            val PERCENT = Type(JsonField.of("percent"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            FIXED,
            PERCENT,
        }

        enum class Value {
            FIXED,
            PERCENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FIXED -> Value.FIXED
                PERCENT -> Value.PERCENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                FIXED -> Known.FIXED
                PERCENT -> Known.PERCENT
                else -> throw FinchInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}

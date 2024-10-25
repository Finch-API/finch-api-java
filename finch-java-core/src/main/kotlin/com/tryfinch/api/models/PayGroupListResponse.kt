// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = PayGroupListResponse.Builder::class)
@NoAutoDetect
class PayGroupListResponse
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val payFrequencies: JsonField<List<PayFrequency>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Finch id (uuidv4) for the pay group */
    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /** Name of the pay group */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** List of pay frequencies associated with this pay group */
    fun payFrequencies(): Optional<List<PayFrequency>> =
        Optional.ofNullable(payFrequencies.getNullable("pay_frequencies"))

    /** Finch id (uuidv4) for the pay group */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** Name of the pay group */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** List of pay frequencies associated with this pay group */
    @JsonProperty("pay_frequencies") @ExcludeMissing fun _payFrequencies() = payFrequencies

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PayGroupListResponse = apply {
        if (!validated) {
            id()
            name()
            payFrequencies()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var payFrequencies: JsonField<List<PayFrequency>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payGroupListResponse: PayGroupListResponse) = apply {
            this.id = payGroupListResponse.id
            this.name = payGroupListResponse.name
            this.payFrequencies = payGroupListResponse.payFrequencies
            additionalProperties(payGroupListResponse.additionalProperties)
        }

        /** Finch id (uuidv4) for the pay group */
        fun id(id: String) = id(JsonField.of(id))

        /** Finch id (uuidv4) for the pay group */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the pay group */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the pay group */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** List of pay frequencies associated with this pay group */
        fun payFrequencies(payFrequencies: List<PayFrequency>) =
            payFrequencies(JsonField.of(payFrequencies))

        /** List of pay frequencies associated with this pay group */
        @JsonProperty("pay_frequencies")
        @ExcludeMissing
        fun payFrequencies(payFrequencies: JsonField<List<PayFrequency>>) = apply {
            this.payFrequencies = payFrequencies
        }

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

        fun build(): PayGroupListResponse =
            PayGroupListResponse(
                id,
                name,
                payFrequencies.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    class PayFrequency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PayFrequency && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ANNUALLY = PayFrequency(JsonField.of("annually"))

            @JvmField val SEMI_ANNUALLY = PayFrequency(JsonField.of("semi_annually"))

            @JvmField val QUARTERLY = PayFrequency(JsonField.of("quarterly"))

            @JvmField val MONTHLY = PayFrequency(JsonField.of("monthly"))

            @JvmField val SEMI_MONTHLY = PayFrequency(JsonField.of("semi_monthly"))

            @JvmField val BI_WEEKLY = PayFrequency(JsonField.of("bi_weekly"))

            @JvmField val WEEKLY = PayFrequency(JsonField.of("weekly"))

            @JvmField val DAILY = PayFrequency(JsonField.of("daily"))

            @JvmField val OTHER = PayFrequency(JsonField.of("other"))

            @JvmStatic fun of(value: String) = PayFrequency(JsonField.of(value))
        }

        enum class Known {
            ANNUALLY,
            SEMI_ANNUALLY,
            QUARTERLY,
            MONTHLY,
            SEMI_MONTHLY,
            BI_WEEKLY,
            WEEKLY,
            DAILY,
            OTHER,
        }

        enum class Value {
            ANNUALLY,
            SEMI_ANNUALLY,
            QUARTERLY,
            MONTHLY,
            SEMI_MONTHLY,
            BI_WEEKLY,
            WEEKLY,
            DAILY,
            OTHER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ANNUALLY -> Value.ANNUALLY
                SEMI_ANNUALLY -> Value.SEMI_ANNUALLY
                QUARTERLY -> Value.QUARTERLY
                MONTHLY -> Value.MONTHLY
                SEMI_MONTHLY -> Value.SEMI_MONTHLY
                BI_WEEKLY -> Value.BI_WEEKLY
                WEEKLY -> Value.WEEKLY
                DAILY -> Value.DAILY
                OTHER -> Value.OTHER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ANNUALLY -> Known.ANNUALLY
                SEMI_ANNUALLY -> Known.SEMI_ANNUALLY
                QUARTERLY -> Known.QUARTERLY
                MONTHLY -> Known.MONTHLY
                SEMI_MONTHLY -> Known.SEMI_MONTHLY
                BI_WEEKLY -> Known.BI_WEEKLY
                WEEKLY -> Known.WEEKLY
                DAILY -> Known.DAILY
                OTHER -> Known.OTHER
                else -> throw FinchInvalidDataException("Unknown PayFrequency: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PayGroupListResponse && this.id == other.id && this.name == other.name && this.payFrequencies == other.payFrequencies && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, name, payFrequencies, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "PayGroupListResponse{id=$id, name=$name, payFrequencies=$payFrequencies, additionalProperties=$additionalProperties}"
}

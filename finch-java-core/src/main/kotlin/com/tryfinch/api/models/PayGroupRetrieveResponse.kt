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
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects

@NoAutoDetect
class PayGroupRetrieveResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("pay_frequencies")
    @ExcludeMissing
    private val payFrequencies: JsonField<List<PayFrequency>> = JsonMissing.of(),
    @JsonProperty("individual_ids")
    @ExcludeMissing
    private val individualIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Finch id (uuidv4) for the pay group */
    fun id(): String = id.getRequired("id")

    /** Name of the pay group */
    fun name(): String = name.getRequired("name")

    /** List of pay frequencies associated with this pay group */
    fun payFrequencies(): List<PayFrequency> = payFrequencies.getRequired("pay_frequencies")

    fun individualIds(): List<String> = individualIds.getRequired("individual_ids")

    /** Finch id (uuidv4) for the pay group */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** Name of the pay group */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** List of pay frequencies associated with this pay group */
    @JsonProperty("pay_frequencies") @ExcludeMissing fun _payFrequencies() = payFrequencies

    @JsonProperty("individual_ids") @ExcludeMissing fun _individualIds() = individualIds

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PayGroupRetrieveResponse = apply {
        if (!validated) {
            id()
            name()
            payFrequencies()
            individualIds()
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
        private var individualIds: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payGroupRetrieveResponse: PayGroupRetrieveResponse) = apply {
            id = payGroupRetrieveResponse.id
            name = payGroupRetrieveResponse.name
            payFrequencies = payGroupRetrieveResponse.payFrequencies
            individualIds = payGroupRetrieveResponse.individualIds
            additionalProperties = payGroupRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Finch id (uuidv4) for the pay group */
        fun id(id: String) = id(JsonField.of(id))

        /** Finch id (uuidv4) for the pay group */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the pay group */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the pay group */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** List of pay frequencies associated with this pay group */
        fun payFrequencies(payFrequencies: List<PayFrequency>) =
            payFrequencies(JsonField.of(payFrequencies))

        /** List of pay frequencies associated with this pay group */
        fun payFrequencies(payFrequencies: JsonField<List<PayFrequency>>) = apply {
            this.payFrequencies = payFrequencies
        }

        fun individualIds(individualIds: List<String>) = individualIds(JsonField.of(individualIds))

        fun individualIds(individualIds: JsonField<List<String>>) = apply {
            this.individualIds = individualIds
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

        fun build(): PayGroupRetrieveResponse =
            PayGroupRetrieveResponse(
                id,
                name,
                payFrequencies.map { it.toImmutable() },
                individualIds.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    class PayFrequency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ANNUALLY = of("annually")

            @JvmField val SEMI_ANNUALLY = of("semi_annually")

            @JvmField val QUARTERLY = of("quarterly")

            @JvmField val MONTHLY = of("monthly")

            @JvmField val SEMI_MONTHLY = of("semi_monthly")

            @JvmField val BI_WEEKLY = of("bi_weekly")

            @JvmField val WEEKLY = of("weekly")

            @JvmField val DAILY = of("daily")

            @JvmField val OTHER = of("other")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PayFrequency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PayGroupRetrieveResponse && id == other.id && name == other.name && payFrequencies == other.payFrequencies && individualIds == other.individualIds && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, payFrequencies, individualIds, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PayGroupRetrieveResponse{id=$id, name=$name, payFrequencies=$payFrequencies, individualIds=$individualIds, additionalProperties=$additionalProperties}"
}

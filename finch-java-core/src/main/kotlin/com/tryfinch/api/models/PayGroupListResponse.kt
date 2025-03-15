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
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class PayGroupListResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("pay_frequencies")
    @ExcludeMissing
    private val payFrequencies: JsonField<List<PayFrequency>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * Finch id (uuidv4) for the pay group
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /**
     * Name of the pay group
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /**
     * List of pay frequencies associated with this pay group
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payFrequencies(): Optional<List<PayFrequency>> =
        Optional.ofNullable(payFrequencies.getNullable("pay_frequencies"))

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [payFrequencies].
     *
     * Unlike [payFrequencies], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pay_frequencies")
    @ExcludeMissing
    fun _payFrequencies(): JsonField<List<PayFrequency>> = payFrequencies

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PayGroupListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        payFrequencies()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [PayGroupListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PayGroupListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var payFrequencies: JsonField<MutableList<PayFrequency>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payGroupListResponse: PayGroupListResponse) = apply {
            id = payGroupListResponse.id
            name = payGroupListResponse.name
            payFrequencies = payGroupListResponse.payFrequencies.map { it.toMutableList() }
            additionalProperties = payGroupListResponse.additionalProperties.toMutableMap()
        }

        /** Finch id (uuidv4) for the pay group */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Name of the pay group */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** List of pay frequencies associated with this pay group */
        fun payFrequencies(payFrequencies: List<PayFrequency>) =
            payFrequencies(JsonField.of(payFrequencies))

        /**
         * Sets [Builder.payFrequencies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payFrequencies] with a well-typed `List<PayFrequency>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun payFrequencies(payFrequencies: JsonField<List<PayFrequency>>) = apply {
            this.payFrequencies = payFrequencies.map { it.toMutableList() }
        }

        /**
         * Adds a single [PayFrequency] to [payFrequencies].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPayFrequency(payFrequency: PayFrequency) = apply {
            payFrequencies =
                (payFrequencies ?: JsonField.of(mutableListOf())).also {
                    checkKnown("payFrequencies", it).add(payFrequency)
                }
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

        fun build(): PayGroupListResponse =
            PayGroupListResponse(
                id,
                name,
                (payFrequencies ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    class PayFrequency @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

        /** An enum containing [PayFrequency]'s known values. */
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

        /**
         * An enum containing [PayFrequency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PayFrequency] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
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
            /**
             * An enum member indicating that [PayFrequency] was instantiated with an unknown value.
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

        return /* spotless:off */ other is PayGroupListResponse && id == other.id && name == other.name && payFrequencies == other.payFrequencies && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, payFrequencies, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PayGroupListResponse{id=$id, name=$name, payFrequencies=$payFrequencies, additionalProperties=$additionalProperties}"
}

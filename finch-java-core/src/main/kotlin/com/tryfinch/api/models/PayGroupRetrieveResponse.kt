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
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PayGroupRetrieveResponse
private constructor(
    private val id: JsonField<String>,
    private val individualIds: JsonField<List<String>>,
    private val name: JsonField<String>,
    private val payFrequencies: JsonField<List<PayFrequency>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("individual_ids")
        @ExcludeMissing
        individualIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pay_frequencies")
        @ExcludeMissing
        payFrequencies: JsonField<List<PayFrequency>> = JsonMissing.of(),
    ) : this(id, individualIds, name, payFrequencies, mutableMapOf())

    /**
     * Finch id (uuidv4) for the pay group
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun individualIds(): List<String> = individualIds.getRequired("individual_ids")

    /**
     * Name of the pay group
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * List of pay frequencies associated with this pay group
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun payFrequencies(): List<PayFrequency> = payFrequencies.getRequired("pay_frequencies")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [individualIds].
     *
     * Unlike [individualIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("individual_ids")
    @ExcludeMissing
    fun _individualIds(): JsonField<List<String>> = individualIds

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

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PayGroupRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .individualIds()
         * .name()
         * .payFrequencies()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PayGroupRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var individualIds: JsonField<MutableList<String>>? = null
        private var name: JsonField<String>? = null
        private var payFrequencies: JsonField<MutableList<PayFrequency>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payGroupRetrieveResponse: PayGroupRetrieveResponse) = apply {
            id = payGroupRetrieveResponse.id
            individualIds = payGroupRetrieveResponse.individualIds.map { it.toMutableList() }
            name = payGroupRetrieveResponse.name
            payFrequencies = payGroupRetrieveResponse.payFrequencies.map { it.toMutableList() }
            additionalProperties = payGroupRetrieveResponse.additionalProperties.toMutableMap()
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

        fun individualIds(individualIds: List<String>) = individualIds(JsonField.of(individualIds))

        /**
         * Sets [Builder.individualIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.individualIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun individualIds(individualIds: JsonField<List<String>>) = apply {
            this.individualIds = individualIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [individualIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIndividualId(individualId: String) = apply {
            individualIds =
                (individualIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("individualIds", it).add(individualId)
                }
        }

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
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [PayGroupRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .individualIds()
         * .name()
         * .payFrequencies()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PayGroupRetrieveResponse =
            PayGroupRetrieveResponse(
                checkRequired("id", id),
                checkRequired("individualIds", individualIds).map { it.toImmutable() },
                checkRequired("name", name),
                checkRequired("payFrequencies", payFrequencies).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PayGroupRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        individualIds()
        name()
        payFrequencies().forEach { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: FinchInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (individualIds.asKnown().getOrNull()?.size ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (payFrequencies.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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

            @JvmField val BI_WEEKLY = of("bi_weekly")

            @JvmField val DAILY = of("daily")

            @JvmField val MONTHLY = of("monthly")

            @JvmField val OTHER = of("other")

            @JvmField val QUARTERLY = of("quarterly")

            @JvmField val SEMI_ANNUALLY = of("semi_annually")

            @JvmField val SEMI_MONTHLY = of("semi_monthly")

            @JvmField val WEEKLY = of("weekly")

            @JvmStatic fun of(value: String) = PayFrequency(JsonField.of(value))
        }

        /** An enum containing [PayFrequency]'s known values. */
        enum class Known {
            ANNUALLY,
            BI_WEEKLY,
            DAILY,
            MONTHLY,
            OTHER,
            QUARTERLY,
            SEMI_ANNUALLY,
            SEMI_MONTHLY,
            WEEKLY,
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
            BI_WEEKLY,
            DAILY,
            MONTHLY,
            OTHER,
            QUARTERLY,
            SEMI_ANNUALLY,
            SEMI_MONTHLY,
            WEEKLY,
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
                BI_WEEKLY -> Value.BI_WEEKLY
                DAILY -> Value.DAILY
                MONTHLY -> Value.MONTHLY
                OTHER -> Value.OTHER
                QUARTERLY -> Value.QUARTERLY
                SEMI_ANNUALLY -> Value.SEMI_ANNUALLY
                SEMI_MONTHLY -> Value.SEMI_MONTHLY
                WEEKLY -> Value.WEEKLY
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
                BI_WEEKLY -> Known.BI_WEEKLY
                DAILY -> Known.DAILY
                MONTHLY -> Known.MONTHLY
                OTHER -> Known.OTHER
                QUARTERLY -> Known.QUARTERLY
                SEMI_ANNUALLY -> Known.SEMI_ANNUALLY
                SEMI_MONTHLY -> Known.SEMI_MONTHLY
                WEEKLY -> Known.WEEKLY
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

        private var validated: Boolean = false

        fun validate(): PayFrequency = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: FinchInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PayFrequency && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PayGroupRetrieveResponse &&
            id == other.id &&
            individualIds == other.individualIds &&
            name == other.name &&
            payFrequencies == other.payFrequencies &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, individualIds, name, payFrequencies, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PayGroupRetrieveResponse{id=$id, individualIds=$individualIds, name=$name, payFrequencies=$payFrequencies, additionalProperties=$additionalProperties}"
}

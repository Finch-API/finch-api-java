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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CompanyBenefit
private constructor(
    private val benefitId: JsonField<String>,
    private val description: JsonField<String>,
    private val frequency: JsonField<BenefitFrequency>,
    private val type: JsonField<BenefitType>,
    private val companyContribution: JsonField<BenefitCompanyMatchContribution>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("benefit_id") @ExcludeMissing benefitId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("frequency")
        @ExcludeMissing
        frequency: JsonField<BenefitFrequency> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<BenefitType> = JsonMissing.of(),
        @JsonProperty("company_contribution")
        @ExcludeMissing
        companyContribution: JsonField<BenefitCompanyMatchContribution> = JsonMissing.of(),
    ) : this(benefitId, description, frequency, type, companyContribution, mutableMapOf())

    /**
     * The id of the benefit.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun benefitId(): String = benefitId.getRequired("benefit_id")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The frequency of the benefit deduction/contribution.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frequency(): Optional<BenefitFrequency> = frequency.getOptional("frequency")

    /**
     * Type of benefit.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<BenefitType> = type.getOptional("type")

    /**
     * The company match for this benefit.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyContribution(): Optional<BenefitCompanyMatchContribution> =
        companyContribution.getOptional("company_contribution")

    /**
     * Returns the raw JSON value of [benefitId].
     *
     * Unlike [benefitId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("benefit_id") @ExcludeMissing fun _benefitId(): JsonField<String> = benefitId

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [frequency].
     *
     * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frequency")
    @ExcludeMissing
    fun _frequency(): JsonField<BenefitFrequency> = frequency

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<BenefitType> = type

    /**
     * Returns the raw JSON value of [companyContribution].
     *
     * Unlike [companyContribution], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("company_contribution")
    @ExcludeMissing
    fun _companyContribution(): JsonField<BenefitCompanyMatchContribution> = companyContribution

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
         * Returns a mutable builder for constructing an instance of [CompanyBenefit].
         *
         * The following fields are required:
         * ```java
         * .benefitId()
         * .description()
         * .frequency()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CompanyBenefit]. */
    class Builder internal constructor() {

        private var benefitId: JsonField<String>? = null
        private var description: JsonField<String>? = null
        private var frequency: JsonField<BenefitFrequency>? = null
        private var type: JsonField<BenefitType>? = null
        private var companyContribution: JsonField<BenefitCompanyMatchContribution> =
            JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(companyBenefit: CompanyBenefit) = apply {
            benefitId = companyBenefit.benefitId
            description = companyBenefit.description
            frequency = companyBenefit.frequency
            type = companyBenefit.type
            companyContribution = companyBenefit.companyContribution
            additionalProperties = companyBenefit.additionalProperties.toMutableMap()
        }

        /** The id of the benefit. */
        fun benefitId(benefitId: String) = benefitId(JsonField.of(benefitId))

        /**
         * Sets [Builder.benefitId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.benefitId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun benefitId(benefitId: JsonField<String>) = apply { this.benefitId = benefitId }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The frequency of the benefit deduction/contribution. */
        fun frequency(frequency: BenefitFrequency?) = frequency(JsonField.ofNullable(frequency))

        /** Alias for calling [Builder.frequency] with `frequency.orElse(null)`. */
        fun frequency(frequency: Optional<BenefitFrequency>) = frequency(frequency.getOrNull())

        /**
         * Sets [Builder.frequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequency] with a well-typed [BenefitFrequency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frequency(frequency: JsonField<BenefitFrequency>) = apply { this.frequency = frequency }

        /** Type of benefit. */
        fun type(type: BenefitType?) = type(JsonField.ofNullable(type))

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<BenefitType>) = type(type.getOrNull())

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [BenefitType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonField<BenefitType>) = apply { this.type = type }

        /** The company match for this benefit. */
        fun companyContribution(companyContribution: BenefitCompanyMatchContribution?) =
            companyContribution(JsonField.ofNullable(companyContribution))

        /**
         * Alias for calling [Builder.companyContribution] with `companyContribution.orElse(null)`.
         */
        fun companyContribution(companyContribution: Optional<BenefitCompanyMatchContribution>) =
            companyContribution(companyContribution.getOrNull())

        /**
         * Sets [Builder.companyContribution] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyContribution] with a well-typed
         * [BenefitCompanyMatchContribution] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun companyContribution(companyContribution: JsonField<BenefitCompanyMatchContribution>) =
            apply {
                this.companyContribution = companyContribution
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

        /**
         * Returns an immutable instance of [CompanyBenefit].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .benefitId()
         * .description()
         * .frequency()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CompanyBenefit =
            CompanyBenefit(
                checkRequired("benefitId", benefitId),
                checkRequired("description", description),
                checkRequired("frequency", frequency),
                checkRequired("type", type),
                companyContribution,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CompanyBenefit = apply {
        if (validated) {
            return@apply
        }

        benefitId()
        description()
        frequency().ifPresent { it.validate() }
        type().ifPresent { it.validate() }
        companyContribution().ifPresent { it.validate() }
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
        (if (benefitId.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (frequency.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (companyContribution.asKnown().getOrNull()?.validity() ?: 0)

    /** The company match for this benefit. */
    class BenefitCompanyMatchContribution
    private constructor(
        private val tiers: JsonField<List<Tier>>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("tiers") @ExcludeMissing tiers: JsonField<List<Tier>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(tiers, type, mutableMapOf())

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tiers(): List<Tier> = tiers.getRequired("tiers")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [tiers].
         *
         * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of
             * [BenefitCompanyMatchContribution].
             *
             * The following fields are required:
             * ```java
             * .tiers()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BenefitCompanyMatchContribution]. */
        class Builder internal constructor() {

            private var tiers: JsonField<MutableList<Tier>>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(benefitCompanyMatchContribution: BenefitCompanyMatchContribution) =
                apply {
                    tiers = benefitCompanyMatchContribution.tiers.map { it.toMutableList() }
                    type = benefitCompanyMatchContribution.type
                    additionalProperties =
                        benefitCompanyMatchContribution.additionalProperties.toMutableMap()
                }

            fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

            /**
             * Sets [Builder.tiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tiers] with a well-typed `List<Tier>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tiers(tiers: JsonField<List<Tier>>) = apply {
                this.tiers = tiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [Tier] to [tiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTier(tier: Tier) = apply {
                tiers =
                    (tiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tiers", it).add(tier)
                    }
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [BenefitCompanyMatchContribution].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .tiers()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BenefitCompanyMatchContribution =
                BenefitCompanyMatchContribution(
                    checkRequired("tiers", tiers).map { it.toImmutable() },
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BenefitCompanyMatchContribution = apply {
            if (validated) {
                return@apply
            }

            tiers().forEach { it.validate() }
            type().validate()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (tiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Tier
        private constructor(
            private val match: JsonField<Long>,
            private val threshold: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("match") @ExcludeMissing match: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("threshold")
                @ExcludeMissing
                threshold: JsonField<Long> = JsonMissing.of(),
            ) : this(match, threshold, mutableMapOf())

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun match(): Long = match.getRequired("match")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun threshold(): Long = threshold.getRequired("threshold")

            /**
             * Returns the raw JSON value of [match].
             *
             * Unlike [match], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("match") @ExcludeMissing fun _match(): JsonField<Long> = match

            /**
             * Returns the raw JSON value of [threshold].
             *
             * Unlike [threshold], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("threshold") @ExcludeMissing fun _threshold(): JsonField<Long> = threshold

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
                 * Returns a mutable builder for constructing an instance of [Tier].
                 *
                 * The following fields are required:
                 * ```java
                 * .match()
                 * .threshold()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Tier]. */
            class Builder internal constructor() {

                private var match: JsonField<Long>? = null
                private var threshold: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tier: Tier) = apply {
                    match = tier.match
                    threshold = tier.threshold
                    additionalProperties = tier.additionalProperties.toMutableMap()
                }

                fun match(match: Long) = match(JsonField.of(match))

                /**
                 * Sets [Builder.match] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.match] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun match(match: JsonField<Long>) = apply { this.match = match }

                fun threshold(threshold: Long) = threshold(JsonField.of(threshold))

                /**
                 * Sets [Builder.threshold] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.threshold] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun threshold(threshold: JsonField<Long>) = apply { this.threshold = threshold }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Tier].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .match()
                 * .threshold()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Tier =
                    Tier(
                        checkRequired("match", match),
                        checkRequired("threshold", threshold),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Tier = apply {
                if (validated) {
                    return@apply
                }

                match()
                threshold()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (match.asKnown().isPresent) 1 else 0) +
                    (if (threshold.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Tier && match == other.match && threshold == other.threshold && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(match, threshold, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tier{match=$match, threshold=$threshold, additionalProperties=$additionalProperties}"
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val MATCH = of("match")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                MATCH
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MATCH,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    MATCH -> Value.MATCH
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws FinchInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    MATCH -> Known.MATCH
                    else -> throw FinchInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws FinchInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    FinchInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BenefitCompanyMatchContribution && tiers == other.tiers && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(tiers, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BenefitCompanyMatchContribution{tiers=$tiers, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CompanyBenefit && benefitId == other.benefitId && description == other.description && frequency == other.frequency && type == other.type && companyContribution == other.companyContribution && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(benefitId, description, frequency, type, companyContribution, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompanyBenefit{benefitId=$benefitId, description=$description, frequency=$frequency, type=$type, companyContribution=$companyContribution, additionalProperties=$additionalProperties}"
}

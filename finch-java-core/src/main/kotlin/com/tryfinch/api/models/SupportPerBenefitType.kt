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
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SupportPerBenefitType
private constructor(
    private val companyBenefits: JsonField<OperationSupportMatrix>,
    private val individualBenefits: JsonField<OperationSupportMatrix>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("company_benefits")
        @ExcludeMissing
        companyBenefits: JsonField<OperationSupportMatrix> = JsonMissing.of(),
        @JsonProperty("individual_benefits")
        @ExcludeMissing
        individualBenefits: JsonField<OperationSupportMatrix> = JsonMissing.of(),
    ) : this(companyBenefits, individualBenefits, mutableMapOf())

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyBenefits(): Optional<OperationSupportMatrix> =
        companyBenefits.getOptional("company_benefits")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun individualBenefits(): Optional<OperationSupportMatrix> =
        individualBenefits.getOptional("individual_benefits")

    /**
     * Returns the raw JSON value of [companyBenefits].
     *
     * Unlike [companyBenefits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company_benefits")
    @ExcludeMissing
    fun _companyBenefits(): JsonField<OperationSupportMatrix> = companyBenefits

    /**
     * Returns the raw JSON value of [individualBenefits].
     *
     * Unlike [individualBenefits], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("individual_benefits")
    @ExcludeMissing
    fun _individualBenefits(): JsonField<OperationSupportMatrix> = individualBenefits

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

        /** Returns a mutable builder for constructing an instance of [SupportPerBenefitType]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SupportPerBenefitType]. */
    class Builder internal constructor() {

        private var companyBenefits: JsonField<OperationSupportMatrix> = JsonMissing.of()
        private var individualBenefits: JsonField<OperationSupportMatrix> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(supportPerBenefitType: SupportPerBenefitType) = apply {
            companyBenefits = supportPerBenefitType.companyBenefits
            individualBenefits = supportPerBenefitType.individualBenefits
            additionalProperties = supportPerBenefitType.additionalProperties.toMutableMap()
        }

        fun companyBenefits(companyBenefits: OperationSupportMatrix) =
            companyBenefits(JsonField.of(companyBenefits))

        /**
         * Sets [Builder.companyBenefits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyBenefits] with a well-typed
         * [OperationSupportMatrix] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun companyBenefits(companyBenefits: JsonField<OperationSupportMatrix>) = apply {
            this.companyBenefits = companyBenefits
        }

        fun individualBenefits(individualBenefits: OperationSupportMatrix) =
            individualBenefits(JsonField.of(individualBenefits))

        /**
         * Sets [Builder.individualBenefits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.individualBenefits] with a well-typed
         * [OperationSupportMatrix] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun individualBenefits(individualBenefits: JsonField<OperationSupportMatrix>) = apply {
            this.individualBenefits = individualBenefits
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
         * Returns an immutable instance of [SupportPerBenefitType].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SupportPerBenefitType =
            SupportPerBenefitType(
                companyBenefits,
                individualBenefits,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SupportPerBenefitType = apply {
        if (validated) {
            return@apply
        }

        companyBenefits().ifPresent { it.validate() }
        individualBenefits().ifPresent { it.validate() }
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
        (companyBenefits.asKnown().getOrNull()?.validity() ?: 0) +
            (individualBenefits.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SupportPerBenefitType &&
            companyBenefits == other.companyBenefits &&
            individualBenefits == other.individualBenefits &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(companyBenefits, individualBenefits, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SupportPerBenefitType{companyBenefits=$companyBenefits, individualBenefits=$individualBenefits, additionalProperties=$additionalProperties}"
}

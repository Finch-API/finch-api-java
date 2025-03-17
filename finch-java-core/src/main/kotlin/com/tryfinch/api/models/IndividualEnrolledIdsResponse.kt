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
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects

@NoAutoDetect
class IndividualEnrolledIdsResponse
@JsonCreator
private constructor(
    @JsonProperty("benefit_id")
    @ExcludeMissing
    private val benefitId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("individual_ids")
    @ExcludeMissing
    private val individualIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun benefitId(): String = benefitId.getRequired("benefit_id")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun individualIds(): List<String> = individualIds.getRequired("individual_ids")

    /**
     * Returns the raw JSON value of [benefitId].
     *
     * Unlike [benefitId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("benefit_id") @ExcludeMissing fun _benefitId(): JsonField<String> = benefitId

    /**
     * Returns the raw JSON value of [individualIds].
     *
     * Unlike [individualIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("individual_ids")
    @ExcludeMissing
    fun _individualIds(): JsonField<List<String>> = individualIds

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): IndividualEnrolledIdsResponse = apply {
        if (validated) {
            return@apply
        }

        benefitId()
        individualIds()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [IndividualEnrolledIdsResponse].
         *
         * The following fields are required:
         * ```java
         * .benefitId()
         * .individualIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IndividualEnrolledIdsResponse]. */
    class Builder internal constructor() {

        private var benefitId: JsonField<String>? = null
        private var individualIds: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(individualEnrolledIdsResponse: IndividualEnrolledIdsResponse) = apply {
            benefitId = individualEnrolledIdsResponse.benefitId
            individualIds = individualEnrolledIdsResponse.individualIds.map { it.toMutableList() }
            additionalProperties = individualEnrolledIdsResponse.additionalProperties.toMutableMap()
        }

        fun benefitId(benefitId: String) = benefitId(JsonField.of(benefitId))

        /**
         * Sets [Builder.benefitId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.benefitId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun benefitId(benefitId: JsonField<String>) = apply { this.benefitId = benefitId }

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
         * Returns an immutable instance of [IndividualEnrolledIdsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .benefitId()
         * .individualIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IndividualEnrolledIdsResponse =
            IndividualEnrolledIdsResponse(
                checkRequired("benefitId", benefitId),
                checkRequired("individualIds", individualIds).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IndividualEnrolledIdsResponse && benefitId == other.benefitId && individualIds == other.individualIds && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(benefitId, individualIds, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IndividualEnrolledIdsResponse{benefitId=$benefitId, individualIds=$individualIds, additionalProperties=$additionalProperties}"
}

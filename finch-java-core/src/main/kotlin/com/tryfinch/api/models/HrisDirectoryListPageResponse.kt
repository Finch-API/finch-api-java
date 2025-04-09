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
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class HrisDirectoryListPageResponse
private constructor(
    private val individuals: JsonField<List<IndividualInDirectory>>,
    private val paging: JsonField<Paging>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("individuals")
        @ExcludeMissing
        individuals: JsonField<List<IndividualInDirectory>> = JsonMissing.of(),
        @JsonProperty("paging") @ExcludeMissing paging: JsonField<Paging> = JsonMissing.of(),
    ) : this(individuals, paging, mutableMapOf())

    /**
     * The array of employees.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun individuals(): List<IndividualInDirectory> = individuals.getRequired("individuals")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paging(): Paging = paging.getRequired("paging")

    /**
     * Returns the raw JSON value of [individuals].
     *
     * Unlike [individuals], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("individuals")
    @ExcludeMissing
    fun _individuals(): JsonField<List<IndividualInDirectory>> = individuals

    /**
     * Returns the raw JSON value of [paging].
     *
     * Unlike [paging], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("paging") @ExcludeMissing fun _paging(): JsonField<Paging> = paging

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
         * [HrisDirectoryListPageResponse].
         *
         * The following fields are required:
         * ```java
         * .individuals()
         * .paging()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HrisDirectoryListPageResponse]. */
    class Builder internal constructor() {

        private var individuals: JsonField<MutableList<IndividualInDirectory>>? = null
        private var paging: JsonField<Paging>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(hrisDirectoryListPageResponse: HrisDirectoryListPageResponse) = apply {
            individuals = hrisDirectoryListPageResponse.individuals.map { it.toMutableList() }
            paging = hrisDirectoryListPageResponse.paging
            additionalProperties = hrisDirectoryListPageResponse.additionalProperties.toMutableMap()
        }

        /** The array of employees. */
        fun individuals(individuals: List<IndividualInDirectory>) =
            individuals(JsonField.of(individuals))

        /**
         * Sets [Builder.individuals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.individuals] with a well-typed
         * `List<IndividualInDirectory>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun individuals(individuals: JsonField<List<IndividualInDirectory>>) = apply {
            this.individuals = individuals.map { it.toMutableList() }
        }

        /**
         * Adds a single [IndividualInDirectory] to [individuals].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIndividual(individual: IndividualInDirectory) = apply {
            individuals =
                (individuals ?: JsonField.of(mutableListOf())).also {
                    checkKnown("individuals", it).add(individual)
                }
        }

        fun paging(paging: Paging) = paging(JsonField.of(paging))

        /**
         * Sets [Builder.paging] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paging] with a well-typed [Paging] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

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
         * Returns an immutable instance of [HrisDirectoryListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .individuals()
         * .paging()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HrisDirectoryListPageResponse =
            HrisDirectoryListPageResponse(
                checkRequired("individuals", individuals).map { it.toImmutable() },
                checkRequired("paging", paging),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): HrisDirectoryListPageResponse = apply {
        if (validated) {
            return@apply
        }

        individuals().forEach { it.validate() }
        paging().validate()
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
        (individuals.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (paging.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisDirectoryListPageResponse && individuals == other.individuals && paging == other.paging && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(individuals, paging, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HrisDirectoryListPageResponse{individuals=$individuals, paging=$paging, additionalProperties=$additionalProperties}"
}

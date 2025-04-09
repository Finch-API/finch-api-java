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
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects

class IndividualUnenrollManyResponse
private constructor(
    private val jobId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("job_id") @ExcludeMissing jobId: JsonField<String> = JsonMissing.of()
    ) : this(jobId, mutableMapOf())

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun jobId(): String = jobId.getRequired("job_id")

    /**
     * Returns the raw JSON value of [jobId].
     *
     * Unlike [jobId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_id") @ExcludeMissing fun _jobId(): JsonField<String> = jobId

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
         * [IndividualUnenrollManyResponse].
         *
         * The following fields are required:
         * ```java
         * .jobId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IndividualUnenrollManyResponse]. */
    class Builder internal constructor() {

        private var jobId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(individualUnenrollManyResponse: IndividualUnenrollManyResponse) = apply {
            jobId = individualUnenrollManyResponse.jobId
            additionalProperties =
                individualUnenrollManyResponse.additionalProperties.toMutableMap()
        }

        fun jobId(jobId: String) = jobId(JsonField.of(jobId))

        /**
         * Sets [Builder.jobId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

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
         * Returns an immutable instance of [IndividualUnenrollManyResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .jobId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IndividualUnenrollManyResponse =
            IndividualUnenrollManyResponse(
                checkRequired("jobId", jobId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IndividualUnenrollManyResponse = apply {
        if (validated) {
            return@apply
        }

        jobId()
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
    @JvmSynthetic internal fun validity(): Int = (if (jobId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IndividualUnenrollManyResponse && jobId == other.jobId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(jobId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IndividualUnenrollManyResponse{jobId=$jobId, additionalProperties=$additionalProperties}"
}

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
import java.util.Optional

class AutomatedCreateResponse
private constructor(
    private val allowedRefreshes: JsonField<Long>,
    private val remainingRefreshes: JsonField<Long>,
    private val jobId: JsonField<String>,
    private val jobUrl: JsonField<String>,
    private val retryAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("allowed_refreshes")
        @ExcludeMissing
        allowedRefreshes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("remaining_refreshes")
        @ExcludeMissing
        remainingRefreshes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("job_id") @ExcludeMissing jobId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("job_url") @ExcludeMissing jobUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("retry_at") @ExcludeMissing retryAt: JsonField<String> = JsonMissing.of(),
    ) : this(allowedRefreshes, remainingRefreshes, jobId, jobUrl, retryAt, mutableMapOf())

    /**
     * The number of allowed refreshes per hour (per hour, fixed window)
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun allowedRefreshes(): Long = allowedRefreshes.getRequired("allowed_refreshes")

    /**
     * The number of remaining refreshes available (per hour, fixed window)
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun remainingRefreshes(): Long = remainingRefreshes.getRequired("remaining_refreshes")

    /**
     * The id of the job that has been created.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jobId(): Optional<String> = jobId.getOptional("job_id")

    /**
     * The url that can be used to retrieve the job status
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jobUrl(): Optional<String> = jobUrl.getOptional("job_url")

    /**
     * ISO 8601 timestamp indicating when to retry the request
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun retryAt(): Optional<String> = retryAt.getOptional("retry_at")

    /**
     * Returns the raw JSON value of [allowedRefreshes].
     *
     * Unlike [allowedRefreshes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("allowed_refreshes")
    @ExcludeMissing
    fun _allowedRefreshes(): JsonField<Long> = allowedRefreshes

    /**
     * Returns the raw JSON value of [remainingRefreshes].
     *
     * Unlike [remainingRefreshes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("remaining_refreshes")
    @ExcludeMissing
    fun _remainingRefreshes(): JsonField<Long> = remainingRefreshes

    /**
     * Returns the raw JSON value of [jobId].
     *
     * Unlike [jobId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_id") @ExcludeMissing fun _jobId(): JsonField<String> = jobId

    /**
     * Returns the raw JSON value of [jobUrl].
     *
     * Unlike [jobUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_url") @ExcludeMissing fun _jobUrl(): JsonField<String> = jobUrl

    /**
     * Returns the raw JSON value of [retryAt].
     *
     * Unlike [retryAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("retry_at") @ExcludeMissing fun _retryAt(): JsonField<String> = retryAt

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
         * Returns a mutable builder for constructing an instance of [AutomatedCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .allowedRefreshes()
         * .remainingRefreshes()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AutomatedCreateResponse]. */
    class Builder internal constructor() {

        private var allowedRefreshes: JsonField<Long>? = null
        private var remainingRefreshes: JsonField<Long>? = null
        private var jobId: JsonField<String> = JsonMissing.of()
        private var jobUrl: JsonField<String> = JsonMissing.of()
        private var retryAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(automatedCreateResponse: AutomatedCreateResponse) = apply {
            allowedRefreshes = automatedCreateResponse.allowedRefreshes
            remainingRefreshes = automatedCreateResponse.remainingRefreshes
            jobId = automatedCreateResponse.jobId
            jobUrl = automatedCreateResponse.jobUrl
            retryAt = automatedCreateResponse.retryAt
            additionalProperties = automatedCreateResponse.additionalProperties.toMutableMap()
        }

        /** The number of allowed refreshes per hour (per hour, fixed window) */
        fun allowedRefreshes(allowedRefreshes: Long) =
            allowedRefreshes(JsonField.of(allowedRefreshes))

        /**
         * Sets [Builder.allowedRefreshes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedRefreshes] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowedRefreshes(allowedRefreshes: JsonField<Long>) = apply {
            this.allowedRefreshes = allowedRefreshes
        }

        /** The number of remaining refreshes available (per hour, fixed window) */
        fun remainingRefreshes(remainingRefreshes: Long) =
            remainingRefreshes(JsonField.of(remainingRefreshes))

        /**
         * Sets [Builder.remainingRefreshes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remainingRefreshes] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun remainingRefreshes(remainingRefreshes: JsonField<Long>) = apply {
            this.remainingRefreshes = remainingRefreshes
        }

        /** The id of the job that has been created. */
        fun jobId(jobId: String) = jobId(JsonField.of(jobId))

        /**
         * Sets [Builder.jobId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

        /** The url that can be used to retrieve the job status */
        fun jobUrl(jobUrl: String) = jobUrl(JsonField.of(jobUrl))

        /**
         * Sets [Builder.jobUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jobUrl(jobUrl: JsonField<String>) = apply { this.jobUrl = jobUrl }

        /** ISO 8601 timestamp indicating when to retry the request */
        fun retryAt(retryAt: String) = retryAt(JsonField.of(retryAt))

        /**
         * Sets [Builder.retryAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retryAt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun retryAt(retryAt: JsonField<String>) = apply { this.retryAt = retryAt }

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
         * Returns an immutable instance of [AutomatedCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .allowedRefreshes()
         * .remainingRefreshes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AutomatedCreateResponse =
            AutomatedCreateResponse(
                checkRequired("allowedRefreshes", allowedRefreshes),
                checkRequired("remainingRefreshes", remainingRefreshes),
                jobId,
                jobUrl,
                retryAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AutomatedCreateResponse = apply {
        if (validated) {
            return@apply
        }

        allowedRefreshes()
        remainingRefreshes()
        jobId()
        jobUrl()
        retryAt()
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
        (if (allowedRefreshes.asKnown().isPresent) 1 else 0) +
            (if (remainingRefreshes.asKnown().isPresent) 1 else 0) +
            (if (jobId.asKnown().isPresent) 1 else 0) +
            (if (jobUrl.asKnown().isPresent) 1 else 0) +
            (if (retryAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AutomatedCreateResponse &&
            allowedRefreshes == other.allowedRefreshes &&
            remainingRefreshes == other.remainingRefreshes &&
            jobId == other.jobId &&
            jobUrl == other.jobUrl &&
            retryAt == other.retryAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            allowedRefreshes,
            remainingRefreshes,
            jobId,
            jobUrl,
            retryAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AutomatedCreateResponse{allowedRefreshes=$allowedRefreshes, remainingRefreshes=$remainingRefreshes, jobId=$jobId, jobUrl=$jobUrl, retryAt=$retryAt, additionalProperties=$additionalProperties}"
}

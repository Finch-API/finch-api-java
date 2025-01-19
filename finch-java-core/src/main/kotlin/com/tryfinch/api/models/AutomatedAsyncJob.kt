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
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class AutomatedAsyncJob
@JsonCreator
private constructor(
    @JsonProperty("completed_at")
    @ExcludeMissing
    private val completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("job_id") @ExcludeMissing private val jobId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("job_url")
    @ExcludeMissing
    private val jobUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("scheduled_at")
    @ExcludeMissing
    private val scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("started_at")
    @ExcludeMissing
    private val startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The datetime the job completed. */
    fun completedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(completedAt.getNullable("completed_at"))

    /**
     * The datetime when the job was created. for scheduled jobs, this will be the initial
     * connection time. For ad-hoc jobs, this will be the time the creation request was received.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The id of the job that has been created. */
    fun jobId(): String = jobId.getRequired("job_id")

    /** The url that can be used to retrieve the job status */
    fun jobUrl(): String = jobUrl.getRequired("job_url")

    /**
     * The datetime a job is scheduled to be run. For scheduled jobs, this datetime can be in the
     * future if the job has not yet been enqueued. For ad-hoc jobs, this field will be null.
     */
    fun scheduledAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(scheduledAt.getNullable("scheduled_at"))

    /** The datetime a job entered into the job queue. */
    fun startedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(startedAt.getNullable("started_at"))

    fun status(): Status = status.getRequired("status")

    /** Only `data_sync_all` currently supported */
    fun type(): Type = type.getRequired("type")

    /** The datetime the job completed. */
    @JsonProperty("completed_at")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

    /**
     * The datetime when the job was created. for scheduled jobs, this will be the initial
     * connection time. For ad-hoc jobs, this will be the time the creation request was received.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The id of the job that has been created. */
    @JsonProperty("job_id") @ExcludeMissing fun _jobId(): JsonField<String> = jobId

    /** The url that can be used to retrieve the job status */
    @JsonProperty("job_url") @ExcludeMissing fun _jobUrl(): JsonField<String> = jobUrl

    /**
     * The datetime a job is scheduled to be run. For scheduled jobs, this datetime can be in the
     * future if the job has not yet been enqueued. For ad-hoc jobs, this field will be null.
     */
    @JsonProperty("scheduled_at")
    @ExcludeMissing
    fun _scheduledAt(): JsonField<OffsetDateTime> = scheduledAt

    /** The datetime a job entered into the job queue. */
    @JsonProperty("started_at")
    @ExcludeMissing
    fun _startedAt(): JsonField<OffsetDateTime> = startedAt

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** Only `data_sync_all` currently supported */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AutomatedAsyncJob = apply {
        if (validated) {
            return@apply
        }

        completedAt()
        createdAt()
        jobId()
        jobUrl()
        scheduledAt()
        startedAt()
        status()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var completedAt: JsonField<OffsetDateTime>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var jobId: JsonField<String>? = null
        private var jobUrl: JsonField<String>? = null
        private var scheduledAt: JsonField<OffsetDateTime>? = null
        private var startedAt: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(automatedAsyncJob: AutomatedAsyncJob) = apply {
            completedAt = automatedAsyncJob.completedAt
            createdAt = automatedAsyncJob.createdAt
            jobId = automatedAsyncJob.jobId
            jobUrl = automatedAsyncJob.jobUrl
            scheduledAt = automatedAsyncJob.scheduledAt
            startedAt = automatedAsyncJob.startedAt
            status = automatedAsyncJob.status
            type = automatedAsyncJob.type
            additionalProperties = automatedAsyncJob.additionalProperties.toMutableMap()
        }

        /** The datetime the job completed. */
        fun completedAt(completedAt: OffsetDateTime?) =
            completedAt(JsonField.ofNullable(completedAt))

        /** The datetime the job completed. */
        fun completedAt(completedAt: Optional<OffsetDateTime>) =
            completedAt(completedAt.orElse(null))

        /** The datetime the job completed. */
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        /**
         * The datetime when the job was created. for scheduled jobs, this will be the initial
         * connection time. For ad-hoc jobs, this will be the time the creation request was
         * received.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The datetime when the job was created. for scheduled jobs, this will be the initial
         * connection time. For ad-hoc jobs, this will be the time the creation request was
         * received.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The id of the job that has been created. */
        fun jobId(jobId: String) = jobId(JsonField.of(jobId))

        /** The id of the job that has been created. */
        fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

        /** The url that can be used to retrieve the job status */
        fun jobUrl(jobUrl: String) = jobUrl(JsonField.of(jobUrl))

        /** The url that can be used to retrieve the job status */
        fun jobUrl(jobUrl: JsonField<String>) = apply { this.jobUrl = jobUrl }

        /**
         * The datetime a job is scheduled to be run. For scheduled jobs, this datetime can be in
         * the future if the job has not yet been enqueued. For ad-hoc jobs, this field will
         * be null.
         */
        fun scheduledAt(scheduledAt: OffsetDateTime?) =
            scheduledAt(JsonField.ofNullable(scheduledAt))

        /**
         * The datetime a job is scheduled to be run. For scheduled jobs, this datetime can be in
         * the future if the job has not yet been enqueued. For ad-hoc jobs, this field will
         * be null.
         */
        fun scheduledAt(scheduledAt: Optional<OffsetDateTime>) =
            scheduledAt(scheduledAt.orElse(null))

        /**
         * The datetime a job is scheduled to be run. For scheduled jobs, this datetime can be in
         * the future if the job has not yet been enqueued. For ad-hoc jobs, this field will
         * be null.
         */
        fun scheduledAt(scheduledAt: JsonField<OffsetDateTime>) = apply {
            this.scheduledAt = scheduledAt
        }

        /** The datetime a job entered into the job queue. */
        fun startedAt(startedAt: OffsetDateTime?) = startedAt(JsonField.ofNullable(startedAt))

        /** The datetime a job entered into the job queue. */
        fun startedAt(startedAt: Optional<OffsetDateTime>) = startedAt(startedAt.orElse(null))

        /** The datetime a job entered into the job queue. */
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        fun status(status: Status) = status(JsonField.of(status))

        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Only `data_sync_all` currently supported */
        fun type(type: Type) = type(JsonField.of(type))

        /** Only `data_sync_all` currently supported */
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

        fun build(): AutomatedAsyncJob =
            AutomatedAsyncJob(
                checkRequired("completedAt", completedAt),
                checkRequired("createdAt", createdAt),
                checkRequired("jobId", jobId),
                checkRequired("jobUrl", jobUrl),
                checkRequired("scheduledAt", scheduledAt),
                checkRequired("startedAt", startedAt),
                checkRequired("status", status),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PENDING = of("pending")

            @JvmField val IN_PROGRESS = of("in_progress")

            @JvmField val COMPLETE = of("complete")

            @JvmField val ERROR = of("error")

            @JvmField val REAUTH_ERROR = of("reauth_error")

            @JvmField val PERMISSIONS_ERROR = of("permissions_error")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            IN_PROGRESS,
            COMPLETE,
            ERROR,
            REAUTH_ERROR,
            PERMISSIONS_ERROR,
        }

        enum class Value {
            PENDING,
            IN_PROGRESS,
            COMPLETE,
            ERROR,
            REAUTH_ERROR,
            PERMISSIONS_ERROR,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                IN_PROGRESS -> Value.IN_PROGRESS
                COMPLETE -> Value.COMPLETE
                ERROR -> Value.ERROR
                REAUTH_ERROR -> Value.REAUTH_ERROR
                PERMISSIONS_ERROR -> Value.PERMISSIONS_ERROR
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                IN_PROGRESS -> Known.IN_PROGRESS
                COMPLETE -> Known.COMPLETE
                ERROR -> Known.ERROR
                REAUTH_ERROR -> Known.REAUTH_ERROR
                PERMISSIONS_ERROR -> Known.PERMISSIONS_ERROR
                else -> throw FinchInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Only `data_sync_all` currently supported */
    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DATA_SYNC_ALL = of("data_sync_all")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            DATA_SYNC_ALL,
        }

        enum class Value {
            DATA_SYNC_ALL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DATA_SYNC_ALL -> Value.DATA_SYNC_ALL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DATA_SYNC_ALL -> Known.DATA_SYNC_ALL
                else -> throw FinchInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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

        return /* spotless:off */ other is AutomatedAsyncJob && completedAt == other.completedAt && createdAt == other.createdAt && jobId == other.jobId && jobUrl == other.jobUrl && scheduledAt == other.scheduledAt && startedAt == other.startedAt && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(completedAt, createdAt, jobId, jobUrl, scheduledAt, startedAt, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AutomatedAsyncJob{completedAt=$completedAt, createdAt=$createdAt, jobId=$jobId, jobUrl=$jobUrl, scheduledAt=$scheduledAt, startedAt=$startedAt, status=$status, type=$type, additionalProperties=$additionalProperties}"
}

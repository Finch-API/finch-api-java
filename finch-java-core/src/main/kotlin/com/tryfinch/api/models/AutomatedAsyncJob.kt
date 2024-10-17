// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = AutomatedAsyncJob.Builder::class)
@NoAutoDetect
class AutomatedAsyncJob
private constructor(
    private val jobId: JsonField<String>,
    private val jobUrl: JsonField<String>,
    private val type: JsonField<Type>,
    private val status: JsonField<Status>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val scheduledAt: JsonField<OffsetDateTime>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val completedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The id of the job that has been created. */
    fun jobId(): String = jobId.getRequired("job_id")

    /** The url that can be used to retrieve the job status */
    fun jobUrl(): String = jobUrl.getRequired("job_url")

    /** Only `data_sync_all` currently supported */
    fun type(): Type = type.getRequired("type")

    fun status(): Status = status.getRequired("status")

    /**
     * The datetime when the job was created. for scheduled jobs, this will be the initial
     * connection time. For ad-hoc jobs, this will be the time the creation request was received.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The datetime a job is scheduled to be run. For scheduled jobs, this datetime can be in the
     * future if the job has not yet been enqueued. For ad-hoc jobs, this field will be null.
     */
    fun scheduledAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(scheduledAt.getNullable("scheduled_at"))

    /** The datetime a job entered into the job queue. */
    fun startedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(startedAt.getNullable("started_at"))

    /** The datetime the job completed. */
    fun completedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(completedAt.getNullable("completed_at"))

    /** The id of the job that has been created. */
    @JsonProperty("job_id") @ExcludeMissing fun _jobId() = jobId

    /** The url that can be used to retrieve the job status */
    @JsonProperty("job_url") @ExcludeMissing fun _jobUrl() = jobUrl

    /** Only `data_sync_all` currently supported */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * The datetime when the job was created. for scheduled jobs, this will be the initial
     * connection time. For ad-hoc jobs, this will be the time the creation request was received.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /**
     * The datetime a job is scheduled to be run. For scheduled jobs, this datetime can be in the
     * future if the job has not yet been enqueued. For ad-hoc jobs, this field will be null.
     */
    @JsonProperty("scheduled_at") @ExcludeMissing fun _scheduledAt() = scheduledAt

    /** The datetime a job entered into the job queue. */
    @JsonProperty("started_at") @ExcludeMissing fun _startedAt() = startedAt

    /** The datetime the job completed. */
    @JsonProperty("completed_at") @ExcludeMissing fun _completedAt() = completedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AutomatedAsyncJob = apply {
        if (!validated) {
            jobId()
            jobUrl()
            type()
            status()
            createdAt()
            scheduledAt()
            startedAt()
            completedAt()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var jobId: JsonField<String> = JsonMissing.of()
        private var jobUrl: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(automatedAsyncJob: AutomatedAsyncJob) = apply {
            this.jobId = automatedAsyncJob.jobId
            this.jobUrl = automatedAsyncJob.jobUrl
            this.type = automatedAsyncJob.type
            this.status = automatedAsyncJob.status
            this.createdAt = automatedAsyncJob.createdAt
            this.scheduledAt = automatedAsyncJob.scheduledAt
            this.startedAt = automatedAsyncJob.startedAt
            this.completedAt = automatedAsyncJob.completedAt
            additionalProperties(automatedAsyncJob.additionalProperties)
        }

        /** The id of the job that has been created. */
        fun jobId(jobId: String) = jobId(JsonField.of(jobId))

        /** The id of the job that has been created. */
        @JsonProperty("job_id")
        @ExcludeMissing
        fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

        /** The url that can be used to retrieve the job status */
        fun jobUrl(jobUrl: String) = jobUrl(JsonField.of(jobUrl))

        /** The url that can be used to retrieve the job status */
        @JsonProperty("job_url")
        @ExcludeMissing
        fun jobUrl(jobUrl: JsonField<String>) = apply { this.jobUrl = jobUrl }

        /** Only `data_sync_all` currently supported */
        fun type(type: Type) = type(JsonField.of(type))

        /** Only `data_sync_all` currently supported */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun status(status: Status) = status(JsonField.of(status))

        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The datetime a job is scheduled to be run. For scheduled jobs, this datetime can be in
         * the future if the job has not yet been enqueued. For ad-hoc jobs, this field will
         * be null.
         */
        fun scheduledAt(scheduledAt: OffsetDateTime) = scheduledAt(JsonField.of(scheduledAt))

        /**
         * The datetime a job is scheduled to be run. For scheduled jobs, this datetime can be in
         * the future if the job has not yet been enqueued. For ad-hoc jobs, this field will
         * be null.
         */
        @JsonProperty("scheduled_at")
        @ExcludeMissing
        fun scheduledAt(scheduledAt: JsonField<OffsetDateTime>) = apply {
            this.scheduledAt = scheduledAt
        }

        /** The datetime a job entered into the job queue. */
        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        /** The datetime a job entered into the job queue. */
        @JsonProperty("started_at")
        @ExcludeMissing
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        /** The datetime the job completed. */
        fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

        /** The datetime the job completed. */
        @JsonProperty("completed_at")
        @ExcludeMissing
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): AutomatedAsyncJob =
            AutomatedAsyncJob(
                jobId,
                jobUrl,
                type,
                status,
                createdAt,
                scheduledAt,
                startedAt,
                completedAt,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PENDING = Status(JsonField.of("pending"))

            @JvmField val IN_PROGRESS = Status(JsonField.of("in_progress"))

            @JvmField val COMPLETE = Status(JsonField.of("complete"))

            @JvmField val ERROR = Status(JsonField.of("error"))

            @JvmField val REAUTH_ERROR = Status(JsonField.of("reauth_error"))

            @JvmField val PERMISSIONS_ERROR = Status(JsonField.of("permissions_error"))

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
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val DATA_SYNC_ALL = Type(JsonField.of("data_sync_all"))

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
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AutomatedAsyncJob && this.jobId == other.jobId && this.jobUrl == other.jobUrl && this.type == other.type && this.status == other.status && this.createdAt == other.createdAt && this.scheduledAt == other.scheduledAt && this.startedAt == other.startedAt && this.completedAt == other.completedAt && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(jobId, jobUrl, type, status, createdAt, scheduledAt, startedAt, completedAt, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "AutomatedAsyncJob{jobId=$jobId, jobUrl=$jobUrl, type=$type, status=$status, createdAt=$createdAt, scheduledAt=$scheduledAt, startedAt=$startedAt, completedAt=$completedAt, additionalProperties=$additionalProperties}"
}

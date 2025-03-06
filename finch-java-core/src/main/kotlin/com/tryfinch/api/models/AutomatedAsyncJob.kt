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
    @JsonProperty("params")
    @ExcludeMissing
    private val params: JsonField<Params> = JsonMissing.of(),
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

    /** The input parameters for the job. */
    fun params(): Optional<Params> = Optional.ofNullable(params.getNullable("params"))

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

    /** The type of automated job */
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

    /** The input parameters for the job. */
    @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

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

    /** The type of automated job */
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
        params().ifPresent { it.validate() }
        scheduledAt()
        startedAt()
        status()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AutomatedAsyncJob].
         *
         * The following fields are required:
         * ```java
         * .completedAt()
         * .createdAt()
         * .jobId()
         * .jobUrl()
         * .params()
         * .scheduledAt()
         * .startedAt()
         * .status()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AutomatedAsyncJob]. */
    class Builder internal constructor() {

        private var completedAt: JsonField<OffsetDateTime>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var jobId: JsonField<String>? = null
        private var jobUrl: JsonField<String>? = null
        private var params: JsonField<Params>? = null
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
            params = automatedAsyncJob.params
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

        /** The input parameters for the job. */
        fun params(params: Params?) = params(JsonField.ofNullable(params))

        /** The input parameters for the job. */
        fun params(params: Optional<Params>) = params(params.orElse(null))

        /** The input parameters for the job. */
        fun params(params: JsonField<Params>) = apply { this.params = params }

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

        /** The type of automated job */
        fun type(type: Type) = type(JsonField.of(type))

        /** The type of automated job */
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
                checkRequired("params", params),
                checkRequired("scheduledAt", scheduledAt),
                checkRequired("startedAt", startedAt),
                checkRequired("status", status),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /** The input parameters for the job. */
    @NoAutoDetect
    class Params
    @JsonCreator
    private constructor(
        @JsonProperty("individual_id")
        @ExcludeMissing
        private val individualId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The ID of the individual that the job was completed for. */
        fun individualId(): Optional<String> =
            Optional.ofNullable(individualId.getNullable("individual_id"))

        /** The ID of the individual that the job was completed for. */
        @JsonProperty("individual_id")
        @ExcludeMissing
        fun _individualId(): JsonField<String> = individualId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Params = apply {
            if (validated) {
                return@apply
            }

            individualId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Params]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Params]. */
        class Builder internal constructor() {

            private var individualId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(params: Params) = apply {
                individualId = params.individualId
                additionalProperties = params.additionalProperties.toMutableMap()
            }

            /** The ID of the individual that the job was completed for. */
            fun individualId(individualId: String) = individualId(JsonField.of(individualId))

            /** The ID of the individual that the job was completed for. */
            fun individualId(individualId: JsonField<String>) = apply {
                this.individualId = individualId
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

            fun build(): Params = Params(individualId, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Params && individualId == other.individualId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(individualId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Params{individualId=$individualId, additionalProperties=$additionalProperties}"
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PENDING = of("pending")

            @JvmField val IN_PROGRESS = of("in_progress")

            @JvmField val COMPLETE = of("complete")

            @JvmField val ERROR = of("error")

            @JvmField val REAUTH_ERROR = of("reauth_error")

            @JvmField val PERMISSIONS_ERROR = of("permissions_error")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            IN_PROGRESS,
            COMPLETE,
            ERROR,
            REAUTH_ERROR,
            PERMISSIONS_ERROR,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            IN_PROGRESS,
            COMPLETE,
            ERROR,
            REAUTH_ERROR,
            PERMISSIONS_ERROR,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PENDING -> Value.PENDING
                IN_PROGRESS -> Value.IN_PROGRESS
                COMPLETE -> Value.COMPLETE
                ERROR -> Value.ERROR
                REAUTH_ERROR -> Value.REAUTH_ERROR
                PERMISSIONS_ERROR -> Value.PERMISSIONS_ERROR
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
                PENDING -> Known.PENDING
                IN_PROGRESS -> Known.IN_PROGRESS
                COMPLETE -> Known.COMPLETE
                ERROR -> Known.ERROR
                REAUTH_ERROR -> Known.REAUTH_ERROR
                PERMISSIONS_ERROR -> Known.PERMISSIONS_ERROR
                else -> throw FinchInvalidDataException("Unknown Status: $value")
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of automated job */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DATA_SYNC_ALL = of("data_sync_all")

            @JvmField val W4_FORM_EMPLOYEE_SYNC = of("w4_form_employee_sync")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            DATA_SYNC_ALL,
            W4_FORM_EMPLOYEE_SYNC,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DATA_SYNC_ALL,
            W4_FORM_EMPLOYEE_SYNC,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                DATA_SYNC_ALL -> Value.DATA_SYNC_ALL
                W4_FORM_EMPLOYEE_SYNC -> Value.W4_FORM_EMPLOYEE_SYNC
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
                DATA_SYNC_ALL -> Known.DATA_SYNC_ALL
                W4_FORM_EMPLOYEE_SYNC -> Known.W4_FORM_EMPLOYEE_SYNC
                else -> throw FinchInvalidDataException("Unknown Type: $value")
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AutomatedAsyncJob && completedAt == other.completedAt && createdAt == other.createdAt && jobId == other.jobId && jobUrl == other.jobUrl && params == other.params && scheduledAt == other.scheduledAt && startedAt == other.startedAt && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(completedAt, createdAt, jobId, jobUrl, params, scheduledAt, startedAt, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AutomatedAsyncJob{completedAt=$completedAt, createdAt=$createdAt, jobId=$jobId, jobUrl=$jobUrl, params=$params, scheduledAt=$scheduledAt, startedAt=$startedAt, status=$status, type=$type, additionalProperties=$additionalProperties}"
}

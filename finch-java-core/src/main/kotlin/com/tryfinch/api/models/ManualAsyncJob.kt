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
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ManualAsyncJob
@JsonCreator
private constructor(
    @JsonProperty("body")
    @ExcludeMissing
    private val body: JsonField<List<JsonValue>> = JsonMissing.of(),
    @JsonProperty("job_id") @ExcludeMissing private val jobId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Specific information about the job, such as individual statuses for batch jobs. */
    fun body(): Optional<List<JsonValue>> = Optional.ofNullable(body.getNullable("body"))

    fun jobId(): String = jobId.getRequired("job_id")

    fun status(): Status = status.getRequired("status")

    /** Specific information about the job, such as individual statuses for batch jobs. */
    @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<List<JsonValue>> = body

    @JsonProperty("job_id") @ExcludeMissing fun _jobId(): JsonField<String> = jobId

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ManualAsyncJob = apply {
        if (validated) {
            return@apply
        }

        body()
        jobId()
        status()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder internal constructor() {

        private var body: JsonField<MutableList<JsonValue>>? = null
        private var jobId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(manualAsyncJob: ManualAsyncJob) = apply {
            body = manualAsyncJob.body.map { it.toMutableList() }
            jobId = manualAsyncJob.jobId
            status = manualAsyncJob.status
            additionalProperties = manualAsyncJob.additionalProperties.toMutableMap()
        }

        /** Specific information about the job, such as individual statuses for batch jobs. */
        fun body(body: List<JsonValue>?) = body(JsonField.ofNullable(body))

        /** Specific information about the job, such as individual statuses for batch jobs. */
        fun body(body: Optional<List<JsonValue>>) = body(body.orElse(null))

        /** Specific information about the job, such as individual statuses for batch jobs. */
        fun body(body: JsonField<List<JsonValue>>) = apply {
            this.body = body.map { it.toMutableList() }
        }

        /** Specific information about the job, such as individual statuses for batch jobs. */
        fun addBody(body: JsonValue) = apply {
            this.body =
                (this.body ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(body)
                }
        }

        fun jobId(jobId: String) = jobId(JsonField.of(jobId))

        fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

        fun status(status: Status) = status(JsonField.of(status))

        fun status(status: JsonField<Status>) = apply { this.status = status }

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

        fun build(): ManualAsyncJob =
            ManualAsyncJob(
                checkRequired("body", body).map { it.toImmutable() },
                checkRequired("jobId", jobId),
                checkRequired("status", status),
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

            @JvmField val ERROR = of("error")

            @JvmField val COMPLETE = of("complete")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            IN_PROGRESS,
            ERROR,
            COMPLETE,
        }

        enum class Value {
            PENDING,
            IN_PROGRESS,
            ERROR,
            COMPLETE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                IN_PROGRESS -> Value.IN_PROGRESS
                ERROR -> Value.ERROR
                COMPLETE -> Value.COMPLETE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                IN_PROGRESS -> Known.IN_PROGRESS
                ERROR -> Known.ERROR
                COMPLETE -> Known.COMPLETE
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ManualAsyncJob && body == other.body && jobId == other.jobId && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(body, jobId, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ManualAsyncJob{body=$body, jobId=$jobId, status=$status, additionalProperties=$additionalProperties}"
}

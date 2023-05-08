package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = Offer.Builder::class)
@NoAutoDetect
class Offer
private constructor(
    private val id: JsonField<String>,
    private val applicationId: JsonField<String>,
    private val candidateId: JsonField<String>,
    private val jobId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): String = id.getRequired("id")

    fun applicationId(): String = applicationId.getRequired("application_id")

    fun candidateId(): String = candidateId.getRequired("candidate_id")

    fun jobId(): String = jobId.getRequired("job_id")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    fun status(): Status = status.getRequired("status")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("application_id") @ExcludeMissing fun _applicationId() = applicationId

    @JsonProperty("candidate_id") @ExcludeMissing fun _candidateId() = candidateId

    @JsonProperty("job_id") @ExcludeMissing fun _jobId() = jobId

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            id()
            applicationId()
            candidateId()
            jobId()
            createdAt()
            updatedAt()
            status()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Offer &&
            this.id == other.id &&
            this.applicationId == other.applicationId &&
            this.candidateId == other.candidateId &&
            this.jobId == other.jobId &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.status == other.status &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    applicationId,
                    candidateId,
                    jobId,
                    createdAt,
                    updatedAt,
                    status,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Offer{id=$id, applicationId=$applicationId, candidateId=$candidateId, jobId=$jobId, createdAt=$createdAt, updatedAt=$updatedAt, status=$status, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var applicationId: JsonField<String> = JsonMissing.of()
        private var candidateId: JsonField<String> = JsonMissing.of()
        private var jobId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(offer: Offer) = apply {
            this.id = offer.id
            this.applicationId = offer.applicationId
            this.candidateId = offer.candidateId
            this.jobId = offer.jobId
            this.createdAt = offer.createdAt
            this.updatedAt = offer.updatedAt
            this.status = offer.status
            additionalProperties(offer.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun applicationId(applicationId: String) = applicationId(JsonField.of(applicationId))

        @JsonProperty("application_id")
        @ExcludeMissing
        fun applicationId(applicationId: JsonField<String>) = apply {
            this.applicationId = applicationId
        }

        fun candidateId(candidateId: String) = candidateId(JsonField.of(candidateId))

        @JsonProperty("candidate_id")
        @ExcludeMissing
        fun candidateId(candidateId: JsonField<String>) = apply { this.candidateId = candidateId }

        fun jobId(jobId: String) = jobId(JsonField.of(jobId))

        @JsonProperty("job_id")
        @ExcludeMissing
        fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun status(status: Status) = status(JsonField.of(status))

        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

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

        fun build(): Offer =
            Offer(
                id,
                applicationId,
                candidateId,
                jobId,
                createdAt,
                updatedAt,
                status,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val SIGNED = Status(JsonField.of("signed"))

            val REJECTED = Status(JsonField.of("rejected"))

            val DRAFT = Status(JsonField.of("draft"))

            val APPROVAL_SENT = Status(JsonField.of("approval-sent"))

            val APPROVED = Status(JsonField.of("approved"))

            val SENT = Status(JsonField.of("sent"))

            val SENT_MANUALLY = Status(JsonField.of("sent-manually"))

            val OPENED = Status(JsonField.of("opened"))

            val ARCHIVED = Status(JsonField.of("archived"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            SIGNED,
            REJECTED,
            DRAFT,
            APPROVAL_SENT,
            APPROVED,
            SENT,
            SENT_MANUALLY,
            OPENED,
            ARCHIVED,
        }

        enum class Value {
            SIGNED,
            REJECTED,
            DRAFT,
            APPROVAL_SENT,
            APPROVED,
            SENT,
            SENT_MANUALLY,
            OPENED,
            ARCHIVED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                SIGNED -> Value.SIGNED
                REJECTED -> Value.REJECTED
                DRAFT -> Value.DRAFT
                APPROVAL_SENT -> Value.APPROVAL_SENT
                APPROVED -> Value.APPROVED
                SENT -> Value.SENT
                SENT_MANUALLY -> Value.SENT_MANUALLY
                OPENED -> Value.OPENED
                ARCHIVED -> Value.ARCHIVED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                SIGNED -> Known.SIGNED
                REJECTED -> Known.REJECTED
                DRAFT -> Known.DRAFT
                APPROVAL_SENT -> Known.APPROVAL_SENT
                APPROVED -> Known.APPROVED
                SENT -> Known.SENT
                SENT_MANUALLY -> Known.SENT_MANUALLY
                OPENED -> Known.OPENED
                ARCHIVED -> Known.ARCHIVED
                else -> throw FinchInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}

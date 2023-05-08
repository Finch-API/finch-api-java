package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = Application.Builder::class)
@NoAutoDetect
class Application
private constructor(
    private val id: JsonField<String>,
    private val candidateId: JsonField<String>,
    private val jobId: JsonField<String>,
    private val offerId: JsonField<String>,
    private val stage: JsonField<Stage>,
    private val rejectedAt: JsonField<OffsetDateTime>,
    private val rejectedReason: JsonField<RejectedReason>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): String = id.getRequired("id")

    fun candidateId(): String = candidateId.getRequired("candidate_id")

    fun jobId(): String = jobId.getRequired("job_id")

    fun offerId(): String? = offerId.getNullable("offer_id")

    fun stage(): Stage? = stage.getNullable("stage")

    fun rejectedAt(): OffsetDateTime? = rejectedAt.getNullable("rejected_at")

    fun rejectedReason(): RejectedReason? = rejectedReason.getNullable("rejected_reason")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("candidate_id") @ExcludeMissing fun _candidateId() = candidateId

    @JsonProperty("job_id") @ExcludeMissing fun _jobId() = jobId

    @JsonProperty("offer_id") @ExcludeMissing fun _offerId() = offerId

    @JsonProperty("stage") @ExcludeMissing fun _stage() = stage

    @JsonProperty("rejected_at") @ExcludeMissing fun _rejectedAt() = rejectedAt

    @JsonProperty("rejected_reason") @ExcludeMissing fun _rejectedReason() = rejectedReason

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            id()
            candidateId()
            jobId()
            offerId()
            stage()?.validate()
            rejectedAt()
            rejectedReason()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Application &&
            this.id == other.id &&
            this.candidateId == other.candidateId &&
            this.jobId == other.jobId &&
            this.offerId == other.offerId &&
            this.stage == other.stage &&
            this.rejectedAt == other.rejectedAt &&
            this.rejectedReason == other.rejectedReason &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    candidateId,
                    jobId,
                    offerId,
                    stage,
                    rejectedAt,
                    rejectedReason,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Application{id=$id, candidateId=$candidateId, jobId=$jobId, offerId=$offerId, stage=$stage, rejectedAt=$rejectedAt, rejectedReason=$rejectedReason, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var candidateId: JsonField<String> = JsonMissing.of()
        private var jobId: JsonField<String> = JsonMissing.of()
        private var offerId: JsonField<String> = JsonMissing.of()
        private var stage: JsonField<Stage> = JsonMissing.of()
        private var rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var rejectedReason: JsonField<RejectedReason> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(application: Application) = apply {
            this.id = application.id
            this.candidateId = application.candidateId
            this.jobId = application.jobId
            this.offerId = application.offerId
            this.stage = application.stage
            this.rejectedAt = application.rejectedAt
            this.rejectedReason = application.rejectedReason
            additionalProperties(application.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun candidateId(candidateId: String) = candidateId(JsonField.of(candidateId))

        @JsonProperty("candidate_id")
        @ExcludeMissing
        fun candidateId(candidateId: JsonField<String>) = apply { this.candidateId = candidateId }

        fun jobId(jobId: String) = jobId(JsonField.of(jobId))

        @JsonProperty("job_id")
        @ExcludeMissing
        fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

        fun offerId(offerId: String) = offerId(JsonField.of(offerId))

        @JsonProperty("offer_id")
        @ExcludeMissing
        fun offerId(offerId: JsonField<String>) = apply { this.offerId = offerId }

        fun stage(stage: Stage) = stage(JsonField.of(stage))

        @JsonProperty("stage")
        @ExcludeMissing
        fun stage(stage: JsonField<Stage>) = apply { this.stage = stage }

        fun rejectedAt(rejectedAt: OffsetDateTime) = rejectedAt(JsonField.of(rejectedAt))

        @JsonProperty("rejected_at")
        @ExcludeMissing
        fun rejectedAt(rejectedAt: JsonField<OffsetDateTime>) = apply {
            this.rejectedAt = rejectedAt
        }

        fun rejectedReason(rejectedReason: RejectedReason) =
            rejectedReason(JsonField.of(rejectedReason))

        @JsonProperty("rejected_reason")
        @ExcludeMissing
        fun rejectedReason(rejectedReason: JsonField<RejectedReason>) = apply {
            this.rejectedReason = rejectedReason
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

        fun build(): Application =
            Application(
                id,
                candidateId,
                jobId,
                offerId,
                stage,
                rejectedAt,
                rejectedReason,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = RejectedReason.Builder::class)
    @NoAutoDetect
    class RejectedReason
    private constructor(
        private val text: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun text(): String? = text.getNullable("text")

        @JsonProperty("text") @ExcludeMissing fun _text() = text

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
                text()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RejectedReason &&
                this.text == other.text &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(text, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "RejectedReason{text=$text, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var text: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(rejectedReason: RejectedReason) = apply {
                this.text = rejectedReason.text
                additionalProperties(rejectedReason.additionalProperties)
            }

            fun text(text: String) = text(JsonField.of(text))

            @JsonProperty("text")
            @ExcludeMissing
            fun text(text: JsonField<String>) = apply { this.text = text }

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

            fun build(): RejectedReason =
                RejectedReason(text, additionalProperties.toUnmodifiable())
        }
    }
}

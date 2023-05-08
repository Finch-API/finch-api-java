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
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = Stage.Builder::class)
@NoAutoDetect
class Stage
private constructor(
    private val id: JsonField<String>,
    private val jobId: JsonField<String>,
    private val name: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /**
     * The job id that this stage applies to, if applicable. Not all systems enumerate stages
     * specific to jobs.
     */
    fun jobId(): Optional<String> = Optional.ofNullable(jobId.getNullable("job_id"))

    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The job id that this stage applies to, if applicable. Not all systems enumerate stages
     * specific to jobs.
     */
    @JsonProperty("job_id") @ExcludeMissing fun _jobId() = jobId

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            id()
            jobId()
            name()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Stage &&
            this.id == other.id &&
            this.jobId == other.jobId &&
            this.name == other.name &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    jobId,
                    name,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Stage{id=$id, jobId=$jobId, name=$name, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var jobId: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(stage: Stage) = apply {
            this.id = stage.id
            this.jobId = stage.jobId
            this.name = stage.name
            additionalProperties(stage.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The job id that this stage applies to, if applicable. Not all systems enumerate stages
         * specific to jobs.
         */
        fun jobId(jobId: String) = jobId(JsonField.of(jobId))

        /**
         * The job id that this stage applies to, if applicable. Not all systems enumerate stages
         * specific to jobs.
         */
        @JsonProperty("job_id")
        @ExcludeMissing
        fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

        fun name(name: String) = name(JsonField.of(name))

        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        fun build(): Stage =
            Stage(
                id,
                jobId,
                name,
                additionalProperties.toUnmodifiable(),
            )
    }
}

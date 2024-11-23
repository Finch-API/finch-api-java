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
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = JobCompletionEvent.Builder::class)
@NoAutoDetect
class JobCompletionEvent
private constructor(
    private val connectionId: JsonField<String>,
    private val companyId: JsonField<String>,
    private val accountId: JsonField<String>,
    private val eventType: JsonField<EventType>,
    private val data: JsonField<Data>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Unique Finch ID of the connection associated with the webhook event. */
    fun connectionId(): Optional<String> =
        Optional.ofNullable(connectionId.getNullable("connection_id"))

    /**
     * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    fun companyId(): String = companyId.getRequired("company_id")

    /**
     * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    fun accountId(): String = accountId.getRequired("account_id")

    fun eventType(): Optional<EventType> = Optional.ofNullable(eventType.getNullable("event_type"))

    fun data(): Optional<Data> = Optional.ofNullable(data.getNullable("data"))

    fun toBaseWebhookEvent(): BaseWebhookEvent =
        BaseWebhookEvent.builder()
            .connectionId(connectionId)
            .companyId(companyId)
            .accountId(accountId)
            .build()

    /** Unique Finch ID of the connection associated with the webhook event. */
    @JsonProperty("connection_id") @ExcludeMissing fun _connectionId() = connectionId

    /**
     * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId() = companyId

    /**
     * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    @JsonProperty("event_type") @ExcludeMissing fun _eventType() = eventType

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): JobCompletionEvent = apply {
        if (!validated) {
            connectionId()
            companyId()
            accountId()
            eventType()
            data().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var connectionId: JsonField<String> = JsonMissing.of()
        private var companyId: JsonField<String> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var eventType: JsonField<EventType> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(jobCompletionEvent: JobCompletionEvent) = apply {
            this.connectionId = jobCompletionEvent.connectionId
            this.companyId = jobCompletionEvent.companyId
            this.accountId = jobCompletionEvent.accountId
            this.eventType = jobCompletionEvent.eventType
            this.data = jobCompletionEvent.data
            additionalProperties(jobCompletionEvent.additionalProperties)
        }

        /** Unique Finch ID of the connection associated with the webhook event. */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /** Unique Finch ID of the connection associated with the webhook event. */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        /**
         * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /**
         * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        @JsonProperty("company_id")
        @ExcludeMissing
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /**
         * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        @JsonProperty("event_type")
        @ExcludeMissing
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

        fun data(data: Data) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<Data>) = apply { this.data = data }

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

        fun build(): JobCompletionEvent =
            JobCompletionEvent(
                connectionId,
                companyId,
                accountId,
                eventType,
                data,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val jobId: JsonField<String>,
        private val jobUrl: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The id of the job which has completed. */
        fun jobId(): String = jobId.getRequired("job_id")

        /** The url to query the result of the job. */
        fun jobUrl(): String = jobUrl.getRequired("job_url")

        /** The id of the job which has completed. */
        @JsonProperty("job_id") @ExcludeMissing fun _jobId() = jobId

        /** The url to query the result of the job. */
        @JsonProperty("job_url") @ExcludeMissing fun _jobUrl() = jobUrl

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                jobId()
                jobUrl()
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
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                this.jobId = data.jobId
                this.jobUrl = data.jobUrl
                additionalProperties(data.additionalProperties)
            }

            /** The id of the job which has completed. */
            fun jobId(jobId: String) = jobId(JsonField.of(jobId))

            /** The id of the job which has completed. */
            @JsonProperty("job_id")
            @ExcludeMissing
            fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

            /** The url to query the result of the job. */
            fun jobUrl(jobUrl: String) = jobUrl(JsonField.of(jobUrl))

            /** The url to query the result of the job. */
            @JsonProperty("job_url")
            @ExcludeMissing
            fun jobUrl(jobUrl: JsonField<String>) = apply { this.jobUrl = jobUrl }

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

            fun build(): Data =
                Data(
                    jobId,
                    jobUrl,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && jobId == other.jobId && jobUrl == other.jobUrl && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(jobId, jobUrl, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{jobId=$jobId, jobUrl=$jobUrl, additionalProperties=$additionalProperties}"
    }

    class EventType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EventType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val JOB_BENEFIT_CREATE_COMPLETED =
                EventType(JsonField.of("job.benefit_create.completed"))

            @JvmField
            val JOB_BENEFIT_ENROLL_COMPLETED =
                EventType(JsonField.of("job.benefit_enroll.completed"))

            @JvmField
            val JOB_BENEFIT_REGISTER_COMPLETED =
                EventType(JsonField.of("job.benefit_register.completed"))

            @JvmField
            val JOB_BENEFIT_UNENROLL_COMPLETED =
                EventType(JsonField.of("job.benefit_unenroll.completed"))

            @JvmField
            val JOB_BENEFIT_UPDATE_COMPLETED =
                EventType(JsonField.of("job.benefit_update.completed"))

            @JvmField
            val JOB_DATA_SYNC_ALL_COMPLETED = EventType(JsonField.of("job.data_sync_all.completed"))

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        enum class Known {
            JOB_BENEFIT_CREATE_COMPLETED,
            JOB_BENEFIT_ENROLL_COMPLETED,
            JOB_BENEFIT_REGISTER_COMPLETED,
            JOB_BENEFIT_UNENROLL_COMPLETED,
            JOB_BENEFIT_UPDATE_COMPLETED,
            JOB_DATA_SYNC_ALL_COMPLETED,
        }

        enum class Value {
            JOB_BENEFIT_CREATE_COMPLETED,
            JOB_BENEFIT_ENROLL_COMPLETED,
            JOB_BENEFIT_REGISTER_COMPLETED,
            JOB_BENEFIT_UNENROLL_COMPLETED,
            JOB_BENEFIT_UPDATE_COMPLETED,
            JOB_DATA_SYNC_ALL_COMPLETED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                JOB_BENEFIT_CREATE_COMPLETED -> Value.JOB_BENEFIT_CREATE_COMPLETED
                JOB_BENEFIT_ENROLL_COMPLETED -> Value.JOB_BENEFIT_ENROLL_COMPLETED
                JOB_BENEFIT_REGISTER_COMPLETED -> Value.JOB_BENEFIT_REGISTER_COMPLETED
                JOB_BENEFIT_UNENROLL_COMPLETED -> Value.JOB_BENEFIT_UNENROLL_COMPLETED
                JOB_BENEFIT_UPDATE_COMPLETED -> Value.JOB_BENEFIT_UPDATE_COMPLETED
                JOB_DATA_SYNC_ALL_COMPLETED -> Value.JOB_DATA_SYNC_ALL_COMPLETED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                JOB_BENEFIT_CREATE_COMPLETED -> Known.JOB_BENEFIT_CREATE_COMPLETED
                JOB_BENEFIT_ENROLL_COMPLETED -> Known.JOB_BENEFIT_ENROLL_COMPLETED
                JOB_BENEFIT_REGISTER_COMPLETED -> Known.JOB_BENEFIT_REGISTER_COMPLETED
                JOB_BENEFIT_UNENROLL_COMPLETED -> Known.JOB_BENEFIT_UNENROLL_COMPLETED
                JOB_BENEFIT_UPDATE_COMPLETED -> Known.JOB_BENEFIT_UPDATE_COMPLETED
                JOB_DATA_SYNC_ALL_COMPLETED -> Known.JOB_DATA_SYNC_ALL_COMPLETED
                else -> throw FinchInvalidDataException("Unknown EventType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is JobCompletionEvent && connectionId == other.connectionId && companyId == other.companyId && accountId == other.accountId && eventType == other.eventType && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(connectionId, companyId, accountId, eventType, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JobCompletionEvent{connectionId=$connectionId, companyId=$companyId, accountId=$accountId, eventType=$eventType, data=$data, additionalProperties=$additionalProperties}"
}

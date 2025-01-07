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
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class JobCompletionEvent
@JsonCreator
private constructor(
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("company_id")
    @ExcludeMissing
    private val companyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("connection_id")
    @ExcludeMissing
    private val connectionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Data> = JsonMissing.of(),
    @JsonProperty("event_type")
    @ExcludeMissing
    private val eventType: JsonField<EventType> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    fun companyId(): String = companyId.getRequired("company_id")

    /** Unique Finch ID of the connection associated with the webhook event. */
    fun connectionId(): Optional<String> =
        Optional.ofNullable(connectionId.getNullable("connection_id"))

    fun data(): Optional<Data> = Optional.ofNullable(data.getNullable("data"))

    fun eventType(): Optional<EventType> = Optional.ofNullable(eventType.getNullable("event_type"))

    /**
     * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId(): JsonField<String> = companyId

    /** Unique Finch ID of the connection associated with the webhook event. */
    @JsonProperty("connection_id")
    @ExcludeMissing
    fun _connectionId(): JsonField<String> = connectionId

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun toBaseWebhookEvent(): BaseWebhookEvent =
        BaseWebhookEvent.builder()
            .accountId(accountId)
            .companyId(companyId)
            .connectionId(connectionId)
            .build()

    private var validated: Boolean = false

    fun validate(): JobCompletionEvent = apply {
        if (!validated) {
            accountId()
            companyId()
            connectionId()
            data().map { it.validate() }
            eventType()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String>? = null
        private var companyId: JsonField<String>? = null
        private var connectionId: JsonField<String> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var eventType: JsonField<EventType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(jobCompletionEvent: JobCompletionEvent) = apply {
            accountId = jobCompletionEvent.accountId
            companyId = jobCompletionEvent.companyId
            connectionId = jobCompletionEvent.connectionId
            data = jobCompletionEvent.data
            eventType = jobCompletionEvent.eventType
            additionalProperties = jobCompletionEvent.additionalProperties.toMutableMap()
        }

        /**
         * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /**
         * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /** Unique Finch ID of the connection associated with the webhook event. */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /** Unique Finch ID of the connection associated with the webhook event. */
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        fun data(data: Data) = data(JsonField.of(data))

        fun data(data: JsonField<Data>) = apply { this.data = data }

        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

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

        fun build(): JobCompletionEvent =
            JobCompletionEvent(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(companyId) { "`companyId` is required but was not set" },
                connectionId,
                data,
                eventType,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("job_id")
        @ExcludeMissing
        private val jobId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("job_url")
        @ExcludeMissing
        private val jobUrl: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The id of the job which has completed. */
        fun jobId(): String = jobId.getRequired("job_id")

        /** The url to query the result of the job. */
        fun jobUrl(): String = jobUrl.getRequired("job_url")

        /** The id of the job which has completed. */
        @JsonProperty("job_id") @ExcludeMissing fun _jobId(): JsonField<String> = jobId

        /** The url to query the result of the job. */
        @JsonProperty("job_url") @ExcludeMissing fun _jobUrl(): JsonField<String> = jobUrl

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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

            private var jobId: JsonField<String>? = null
            private var jobUrl: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                jobId = data.jobId
                jobUrl = data.jobUrl
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** The id of the job which has completed. */
            fun jobId(jobId: String) = jobId(JsonField.of(jobId))

            /** The id of the job which has completed. */
            fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

            /** The url to query the result of the job. */
            fun jobUrl(jobUrl: String) = jobUrl(JsonField.of(jobUrl))

            /** The url to query the result of the job. */
            fun jobUrl(jobUrl: JsonField<String>) = apply { this.jobUrl = jobUrl }

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

            fun build(): Data =
                Data(
                    checkNotNull(jobId) { "`jobId` is required but was not set" },
                    checkNotNull(jobUrl) { "`jobUrl` is required but was not set" },
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

        companion object {

            @JvmField val JOB_BENEFIT_CREATE_COMPLETED = of("job.benefit_create.completed")

            @JvmField val JOB_BENEFIT_ENROLL_COMPLETED = of("job.benefit_enroll.completed")

            @JvmField val JOB_BENEFIT_REGISTER_COMPLETED = of("job.benefit_register.completed")

            @JvmField val JOB_BENEFIT_UNENROLL_COMPLETED = of("job.benefit_unenroll.completed")

            @JvmField val JOB_BENEFIT_UPDATE_COMPLETED = of("job.benefit_update.completed")

            @JvmField val JOB_DATA_SYNC_ALL_COMPLETED = of("job.data_sync_all.completed")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EventType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is JobCompletionEvent && accountId == other.accountId && companyId == other.companyId && connectionId == other.connectionId && data == other.data && eventType == other.eventType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountId, companyId, connectionId, data, eventType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JobCompletionEvent{accountId=$accountId, companyId=$companyId, connectionId=$connectionId, data=$data, eventType=$eventType, additionalProperties=$additionalProperties}"
}

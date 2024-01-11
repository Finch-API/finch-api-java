// File generated from our OpenAPI spec by Stainless.

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
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = DirectoryEvent.Builder::class)
@NoAutoDetect
class DirectoryEvent
private constructor(
    private val companyId: JsonField<String>,
    private val accountId: JsonField<String>,
    private val eventType: JsonField<EventType>,
    private val data: JsonField<Data>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Unique Finch id of the company for which data has been updated. */
    fun companyId(): String = companyId.getRequired("company_id")

    /** Unique Finch id of the employer account that was used to make this connection. */
    fun accountId(): String = accountId.getRequired("account_id")

    fun eventType(): Optional<EventType> = Optional.ofNullable(eventType.getNullable("event_type"))

    fun data(): Optional<Data> = Optional.ofNullable(data.getNullable("data"))

    fun toBaseWebhookEvent(): BaseWebhookEvent =
        BaseWebhookEvent.builder().companyId(companyId).accountId(accountId).build()

    /** Unique Finch id of the company for which data has been updated. */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId() = companyId

    /** Unique Finch id of the employer account that was used to make this connection. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    @JsonProperty("event_type") @ExcludeMissing fun _eventType() = eventType

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): DirectoryEvent = apply {
        if (!validated) {
            companyId()
            accountId()
            eventType()
            data().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DirectoryEvent &&
            this.companyId == other.companyId &&
            this.accountId == other.accountId &&
            this.eventType == other.eventType &&
            this.data == other.data &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    companyId,
                    accountId,
                    eventType,
                    data,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "DirectoryEvent{companyId=$companyId, accountId=$accountId, eventType=$eventType, data=$data, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var companyId: JsonField<String> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var eventType: JsonField<EventType> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(directoryEvent: DirectoryEvent) = apply {
            this.companyId = directoryEvent.companyId
            this.accountId = directoryEvent.accountId
            this.eventType = directoryEvent.eventType
            this.data = directoryEvent.data
            additionalProperties(directoryEvent.additionalProperties)
        }

        /** Unique Finch id of the company for which data has been updated. */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /** Unique Finch id of the company for which data has been updated. */
        @JsonProperty("company_id")
        @ExcludeMissing
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /** Unique Finch id of the employer account that was used to make this connection. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** Unique Finch id of the employer account that was used to make this connection. */
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

        fun build(): DirectoryEvent =
            DirectoryEvent(
                companyId,
                accountId,
                eventType,
                data,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val individualId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The ID of the individual related to the event. */
        fun individualId(): Optional<String> =
            Optional.ofNullable(individualId.getNullable("individual_id"))

        /** The ID of the individual related to the event. */
        @JsonProperty("individual_id") @ExcludeMissing fun _individualId() = individualId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                individualId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                this.individualId == other.individualId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(individualId, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "Data{individualId=$individualId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var individualId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                this.individualId = data.individualId
                additionalProperties(data.additionalProperties)
            }

            /** The ID of the individual related to the event. */
            fun individualId(individualId: String) = individualId(JsonField.of(individualId))

            /** The ID of the individual related to the event. */
            @JsonProperty("individual_id")
            @ExcludeMissing
            fun individualId(individualId: JsonField<String>) = apply {
                this.individualId = individualId
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

            fun build(): Data = Data(individualId, additionalProperties.toUnmodifiable())
        }
    }

    class EventType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EventType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val DIRECTORY_CREATED = EventType(JsonField.of("directory.created"))

            @JvmField val DIRECTORY_UPDATED = EventType(JsonField.of("directory.updated"))

            @JvmField val DIRECTORY_DELETED = EventType(JsonField.of("directory.deleted"))

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        enum class Known {
            DIRECTORY_CREATED,
            DIRECTORY_UPDATED,
            DIRECTORY_DELETED,
        }

        enum class Value {
            DIRECTORY_CREATED,
            DIRECTORY_UPDATED,
            DIRECTORY_DELETED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DIRECTORY_CREATED -> Value.DIRECTORY_CREATED
                DIRECTORY_UPDATED -> Value.DIRECTORY_UPDATED
                DIRECTORY_DELETED -> Value.DIRECTORY_DELETED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DIRECTORY_CREATED -> Known.DIRECTORY_CREATED
                DIRECTORY_UPDATED -> Known.DIRECTORY_UPDATED
                DIRECTORY_DELETED -> Known.DIRECTORY_DELETED
                else -> throw FinchInvalidDataException("Unknown EventType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}

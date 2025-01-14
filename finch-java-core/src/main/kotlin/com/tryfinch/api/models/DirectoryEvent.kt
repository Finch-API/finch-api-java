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
class DirectoryEvent
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

    fun validate(): DirectoryEvent = apply {
        if (validated) {
            return@apply
        }

        accountId()
        companyId()
        connectionId()
        data().ifPresent { it.validate() }
        eventType()
        validated = true
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
        internal fun from(directoryEvent: DirectoryEvent) = apply {
            accountId = directoryEvent.accountId
            companyId = directoryEvent.companyId
            connectionId = directoryEvent.connectionId
            data = directoryEvent.data
            eventType = directoryEvent.eventType
            additionalProperties = directoryEvent.additionalProperties.toMutableMap()
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

        fun build(): DirectoryEvent =
            DirectoryEvent(
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
        @JsonProperty("individual_id")
        @ExcludeMissing
        private val individualId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The ID of the individual related to the event. */
        fun individualId(): Optional<String> =
            Optional.ofNullable(individualId.getNullable("individual_id"))

        /** The ID of the individual related to the event. */
        @JsonProperty("individual_id")
        @ExcludeMissing
        fun _individualId(): JsonField<String> = individualId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            individualId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var individualId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                individualId = data.individualId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** The ID of the individual related to the event. */
            fun individualId(individualId: String) = individualId(JsonField.of(individualId))

            /** The ID of the individual related to the event. */
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

            fun build(): Data = Data(individualId, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && individualId == other.individualId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(individualId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{individualId=$individualId, additionalProperties=$additionalProperties}"
    }

    class EventType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DIRECTORY_CREATED = of("directory.created")

            @JvmField val DIRECTORY_UPDATED = of("directory.updated")

            @JvmField val DIRECTORY_DELETED = of("directory.deleted")

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

        return /* spotless:off */ other is DirectoryEvent && accountId == other.accountId && companyId == other.companyId && connectionId == other.connectionId && data == other.data && eventType == other.eventType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountId, companyId, connectionId, data, eventType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DirectoryEvent{accountId=$accountId, companyId=$companyId, connectionId=$connectionId, data=$data, eventType=$eventType, additionalProperties=$additionalProperties}"
}

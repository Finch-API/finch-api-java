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
class PaymentEvent
@JsonCreator
private constructor(
    @JsonProperty("connection_id")
    @ExcludeMissing
    private val connectionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("company_id")
    @ExcludeMissing
    private val companyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("event_type")
    @ExcludeMissing
    private val eventType: JsonField<EventType> = JsonMissing.of(),
    @JsonProperty("data")
    @ExcludeMissing
    private val data: JsonField<PaymentIdentifiers> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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

    fun data(): Optional<PaymentIdentifiers> = Optional.ofNullable(data.getNullable("data"))

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

    fun toBaseWebhookEvent(): BaseWebhookEvent =
        BaseWebhookEvent.builder()
            .connectionId(connectionId)
            .companyId(companyId)
            .accountId(accountId)
            .build()

    private var validated: Boolean = false

    fun validate(): PaymentEvent = apply {
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
        private var data: JsonField<PaymentIdentifiers> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentEvent: PaymentEvent) = apply {
            connectionId = paymentEvent.connectionId
            companyId = paymentEvent.companyId
            accountId = paymentEvent.accountId
            eventType = paymentEvent.eventType
            data = paymentEvent.data
            additionalProperties = paymentEvent.additionalProperties.toMutableMap()
        }

        /** Unique Finch ID of the connection associated with the webhook event. */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /** Unique Finch ID of the connection associated with the webhook event. */
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
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

        fun data(data: PaymentIdentifiers) = data(JsonField.of(data))

        fun data(data: JsonField<PaymentIdentifiers>) = apply { this.data = data }

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

        fun build(): PaymentEvent =
            PaymentEvent(
                connectionId,
                companyId,
                accountId,
                eventType,
                data,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class PaymentIdentifiers
    @JsonCreator
    private constructor(
        @JsonProperty("payment_id")
        @ExcludeMissing
        private val paymentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pay_date")
        @ExcludeMissing
        private val payDate: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The ID of the payment. */
        fun paymentId(): String = paymentId.getRequired("payment_id")

        /** The date of the payment. */
        fun payDate(): String = payDate.getRequired("pay_date")

        /** The ID of the payment. */
        @JsonProperty("payment_id") @ExcludeMissing fun _paymentId() = paymentId

        /** The date of the payment. */
        @JsonProperty("pay_date") @ExcludeMissing fun _payDate() = payDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PaymentIdentifiers = apply {
            if (!validated) {
                paymentId()
                payDate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var paymentId: JsonField<String> = JsonMissing.of()
            private var payDate: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentIdentifiers: PaymentIdentifiers) = apply {
                paymentId = paymentIdentifiers.paymentId
                payDate = paymentIdentifiers.payDate
                additionalProperties = paymentIdentifiers.additionalProperties.toMutableMap()
            }

            /** The ID of the payment. */
            fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

            /** The ID of the payment. */
            fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

            /** The date of the payment. */
            fun payDate(payDate: String) = payDate(JsonField.of(payDate))

            /** The date of the payment. */
            fun payDate(payDate: JsonField<String>) = apply { this.payDate = payDate }

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

            fun build(): PaymentIdentifiers =
                PaymentIdentifiers(
                    paymentId,
                    payDate,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentIdentifiers && paymentId == other.paymentId && payDate == other.payDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(paymentId, payDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentIdentifiers{paymentId=$paymentId, payDate=$payDate, additionalProperties=$additionalProperties}"
    }

    class EventType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PAYMENT_CREATED = of("payment.created")

            @JvmField val PAYMENT_UPDATED = of("payment.updated")

            @JvmField val PAYMENT_DELETED = of("payment.deleted")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        enum class Known {
            PAYMENT_CREATED,
            PAYMENT_UPDATED,
            PAYMENT_DELETED,
        }

        enum class Value {
            PAYMENT_CREATED,
            PAYMENT_UPDATED,
            PAYMENT_DELETED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PAYMENT_CREATED -> Value.PAYMENT_CREATED
                PAYMENT_UPDATED -> Value.PAYMENT_UPDATED
                PAYMENT_DELETED -> Value.PAYMENT_DELETED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PAYMENT_CREATED -> Known.PAYMENT_CREATED
                PAYMENT_UPDATED -> Known.PAYMENT_UPDATED
                PAYMENT_DELETED -> Known.PAYMENT_DELETED
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

        return /* spotless:off */ other is PaymentEvent && connectionId == other.connectionId && companyId == other.companyId && accountId == other.accountId && eventType == other.eventType && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(connectionId, companyId, accountId, eventType, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentEvent{connectionId=$connectionId, companyId=$companyId, accountId=$accountId, eventType=$eventType, data=$data, additionalProperties=$additionalProperties}"
}

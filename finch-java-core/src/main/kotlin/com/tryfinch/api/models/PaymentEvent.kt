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
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = PaymentEvent.Builder::class)
@NoAutoDetect
class PaymentEvent
private constructor(
    private val companyId: JsonField<String>,
    private val accountId: JsonField<String>,
    private val eventType: JsonField<EventType>,
    private val data: JsonField<PaymentIdentifiers>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Unique Finch id of the company for which data has been updated. */
    fun companyId(): String = companyId.getRequired("company_id")

    /** Unique Finch id of the employer account that was used to make this connection. */
    fun accountId(): String = accountId.getRequired("account_id")

    fun eventType(): Optional<EventType> = Optional.ofNullable(eventType.getNullable("event_type"))

    fun data(): Optional<PaymentIdentifiers> = Optional.ofNullable(data.getNullable("data"))

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

    fun validate(): PaymentEvent = apply {
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

        return other is PaymentEvent &&
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
        "PaymentEvent{companyId=$companyId, accountId=$accountId, eventType=$eventType, data=$data, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var companyId: JsonField<String> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var eventType: JsonField<EventType> = JsonMissing.of()
        private var data: JsonField<PaymentIdentifiers> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentEvent: PaymentEvent) = apply {
            this.companyId = paymentEvent.companyId
            this.accountId = paymentEvent.accountId
            this.eventType = paymentEvent.eventType
            this.data = paymentEvent.data
            additionalProperties(paymentEvent.additionalProperties)
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

        fun data(data: PaymentIdentifiers) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<PaymentIdentifiers>) = apply { this.data = data }

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

        fun build(): PaymentEvent =
            PaymentEvent(
                companyId,
                accountId,
                eventType,
                data,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = PaymentIdentifiers.Builder::class)
    @NoAutoDetect
    class PaymentIdentifiers
    private constructor(
        private val paymentId: JsonField<String>,
        private val payDate: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

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

        fun validate(): PaymentIdentifiers = apply {
            if (!validated) {
                paymentId()
                payDate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentIdentifiers &&
                this.paymentId == other.paymentId &&
                this.payDate == other.payDate &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        paymentId,
                        payDate,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PaymentIdentifiers{paymentId=$paymentId, payDate=$payDate, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var paymentId: JsonField<String> = JsonMissing.of()
            private var payDate: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentIdentifiers: PaymentIdentifiers) = apply {
                this.paymentId = paymentIdentifiers.paymentId
                this.payDate = paymentIdentifiers.payDate
                additionalProperties(paymentIdentifiers.additionalProperties)
            }

            /** The ID of the payment. */
            fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

            /** The ID of the payment. */
            @JsonProperty("payment_id")
            @ExcludeMissing
            fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

            /** The date of the payment. */
            fun payDate(payDate: String) = payDate(JsonField.of(payDate))

            /** The date of the payment. */
            @JsonProperty("pay_date")
            @ExcludeMissing
            fun payDate(payDate: JsonField<String>) = apply { this.payDate = payDate }

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

            fun build(): PaymentIdentifiers =
                PaymentIdentifiers(
                    paymentId,
                    payDate,
                    additionalProperties.toUnmodifiable(),
                )
        }
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

            return other is EventType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PAYMENT_CREATED = EventType(JsonField.of("payment.created"))

            @JvmField val PAYMENT_UPDATED = EventType(JsonField.of("payment.updated"))

            @JvmField val PAYMENT_DELETED = EventType(JsonField.of("payment.deleted"))

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
    }
}

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
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PayStatementEvent
private constructor(
    private val accountId: JsonField<String>,
    private val companyId: JsonField<String>,
    private val connectionId: JsonField<String>,
    private val data: JsonField<Data>,
    private val eventType: JsonField<EventType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("company_id") @ExcludeMissing companyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connection_id")
        @ExcludeMissing
        connectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
    ) : this(accountId, companyId, connectionId, data, eventType, mutableMapOf())

    fun toBaseWebhookEvent(): BaseWebhookEvent =
        BaseWebhookEvent.builder()
            .accountId(accountId)
            .companyId(companyId)
            .connectionId(connectionId)
            .build()

    /**
     * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
     * `connection_id` instead to identify the connection associated with this event.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun accountId(): String = accountId.getRequired("account_id")

    /**
     * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
     * `connection_id` instead to identify the connection associated with this event.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun companyId(): String = companyId.getRequired("company_id")

    /**
     * Unique Finch ID of the connection associated with the webhook event.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventType(): Optional<EventType> = eventType.getOptional("event_type")

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("account_id")
    @ExcludeMissing
    fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [companyId].
     *
     * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("company_id")
    @ExcludeMissing
    fun _companyId(): JsonField<String> = companyId

    /**
     * Returns the raw JSON value of [connectionId].
     *
     * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection_id")
    @ExcludeMissing
    fun _connectionId(): JsonField<String> = connectionId

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PayStatementEvent].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .companyId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PayStatementEvent]. */
    class Builder internal constructor() {

        private var accountId: JsonField<String>? = null
        private var companyId: JsonField<String>? = null
        private var connectionId: JsonField<String> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var eventType: JsonField<EventType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payStatementEvent: PayStatementEvent) = apply {
            accountId = payStatementEvent.accountId
            companyId = payStatementEvent.companyId
            connectionId = payStatementEvent.connectionId
            data = payStatementEvent.data
            eventType = payStatementEvent.eventType
            additionalProperties = payStatementEvent.additionalProperties.toMutableMap()
        }

        /**
         * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        @Deprecated("deprecated")
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        @Deprecated("deprecated")
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /**
         * Sets [Builder.companyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /** Unique Finch ID of the connection associated with the webhook event. */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /**
         * Sets [Builder.connectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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

        /**
         * Returns an immutable instance of [PayStatementEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .companyId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PayStatementEvent =
            PayStatementEvent(
                checkRequired("accountId", accountId),
                checkRequired("companyId", companyId),
                connectionId,
                data,
                eventType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PayStatementEvent = apply {
        if (validated) {
            return@apply
        }

        accountId()
        companyId()
        connectionId()
        data().ifPresent { it.validate() }
        eventType().ifPresent { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: FinchInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (companyId.asKnown().isPresent) 1 else 0) +
            (if (connectionId.asKnown().isPresent) 1 else 0) +
            (data.asKnown().getOrNull()?.validity() ?: 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    private constructor(
        private val individualId: JsonField<String>,
        private val paymentId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("individual_id")
            @ExcludeMissing
            individualId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payment_id")
            @ExcludeMissing
            paymentId: JsonField<String> = JsonMissing.of(),
        ) : this(individualId, paymentId, mutableMapOf())

        /**
         * The ID of the individual associated with the pay statement.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun individualId(): Optional<String> = individualId.getOptional("individual_id")

        /**
         * The ID of the payment associated with the pay statement.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentId(): Optional<String> = paymentId.getOptional("payment_id")

        /**
         * Returns the raw JSON value of [individualId].
         *
         * Unlike [individualId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("individual_id")
        @ExcludeMissing
        fun _individualId(): JsonField<String> = individualId

        /**
         * Returns the raw JSON value of [paymentId].
         *
         * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var individualId: JsonField<String> = JsonMissing.of()
            private var paymentId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                individualId = data.individualId
                paymentId = data.paymentId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** The ID of the individual associated with the pay statement. */
            fun individualId(individualId: String) = individualId(JsonField.of(individualId))

            /**
             * Sets [Builder.individualId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.individualId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun individualId(individualId: JsonField<String>) = apply {
                this.individualId = individualId
            }

            /** The ID of the payment associated with the pay statement. */
            fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

            /**
             * Sets [Builder.paymentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

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

            /**
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data = Data(individualId, paymentId, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            individualId()
            paymentId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: FinchInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (individualId.asKnown().isPresent) 1 else 0) +
                (if (paymentId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && individualId == other.individualId && paymentId == other.paymentId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(individualId, paymentId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{individualId=$individualId, paymentId=$paymentId, additionalProperties=$additionalProperties}"
    }

    class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PAY_STATEMENT_CREATED = of("pay_statement.created")

            @JvmField val PAY_STATEMENT_UPDATED = of("pay_statement.updated")

            @JvmField val PAY_STATEMENT_DELETED = of("pay_statement.deleted")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            PAY_STATEMENT_CREATED,
            PAY_STATEMENT_UPDATED,
            PAY_STATEMENT_DELETED,
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PAY_STATEMENT_CREATED,
            PAY_STATEMENT_UPDATED,
            PAY_STATEMENT_DELETED,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PAY_STATEMENT_CREATED -> Value.PAY_STATEMENT_CREATED
                PAY_STATEMENT_UPDATED -> Value.PAY_STATEMENT_UPDATED
                PAY_STATEMENT_DELETED -> Value.PAY_STATEMENT_DELETED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws FinchInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                PAY_STATEMENT_CREATED -> Known.PAY_STATEMENT_CREATED
                PAY_STATEMENT_UPDATED -> Known.PAY_STATEMENT_UPDATED
                PAY_STATEMENT_DELETED -> Known.PAY_STATEMENT_DELETED
                else -> throw FinchInvalidDataException("Unknown EventType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws FinchInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { FinchInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): EventType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: FinchInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

        return /* spotless:off */ other is PayStatementEvent && accountId == other.accountId && companyId == other.companyId && connectionId == other.connectionId && data == other.data && eventType == other.eventType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountId, companyId, connectionId, data, eventType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PayStatementEvent{accountId=$accountId, companyId=$companyId, connectionId=$connectionId, data=$data, eventType=$eventType, additionalProperties=$additionalProperties}"
}

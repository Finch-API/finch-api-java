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
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EnrolledIndividual
private constructor(
    private val body: JsonField<Body>,
    private val code: JsonField<Code>,
    private val individualId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("body") @ExcludeMissing body: JsonField<Body> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<Code> = JsonMissing.of(),
        @JsonProperty("individual_id")
        @ExcludeMissing
        individualId: JsonField<String> = JsonMissing.of(),
    ) : this(body, code, individualId, mutableMapOf())

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun body(): Optional<Body> = body.getOptional("body")

    /**
     * HTTP status code. Either 201 or 200
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<Code> = code.getOptional("code")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun individualId(): Optional<String> = individualId.getOptional("individual_id")

    /**
     * Returns the raw JSON value of [body].
     *
     * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<Body> = body

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Code> = code

    /**
     * Returns the raw JSON value of [individualId].
     *
     * Unlike [individualId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("individual_id")
    @ExcludeMissing
    fun _individualId(): JsonField<String> = individualId

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

        /** Returns a mutable builder for constructing an instance of [EnrolledIndividual]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EnrolledIndividual]. */
    class Builder internal constructor() {

        private var body: JsonField<Body> = JsonMissing.of()
        private var code: JsonField<Code> = JsonMissing.of()
        private var individualId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(enrolledIndividual: EnrolledIndividual) = apply {
            body = enrolledIndividual.body
            code = enrolledIndividual.code
            individualId = enrolledIndividual.individualId
            additionalProperties = enrolledIndividual.additionalProperties.toMutableMap()
        }

        fun body(body: Body) = body(JsonField.of(body))

        /**
         * Sets [Builder.body] to an arbitrary JSON value.
         *
         * You should usually call [Builder.body] with a well-typed [Body] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun body(body: JsonField<Body>) = apply { this.body = body }

        /** HTTP status code. Either 201 or 200 */
        fun code(code: Code) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Code] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Code>) = apply { this.code = code }

        fun individualId(individualId: String) = individualId(JsonField.of(individualId))

        /**
         * Sets [Builder.individualId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.individualId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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

        /**
         * Returns an immutable instance of [EnrolledIndividual].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EnrolledIndividual =
            EnrolledIndividual(body, code, individualId, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): EnrolledIndividual = apply {
        if (validated) {
            return@apply
        }

        body().ifPresent { it.validate() }
        code().ifPresent { it.validate() }
        individualId()
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
        (body.asKnown().getOrNull()?.validity() ?: 0) +
            (code.asKnown().getOrNull()?.validity() ?: 0) +
            (if (individualId.asKnown().isPresent) 1 else 0)

    class Body
    private constructor(
        private val finchCode: JsonField<String>,
        private val message: JsonField<String>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("finch_code")
            @ExcludeMissing
            finchCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(finchCode, message, name, mutableMapOf())

        /**
         * A descriptive identifier for the response.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun finchCode(): Optional<String> = finchCode.getOptional("finch_code")

        /**
         * Short description in English that provides more information about the response.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun message(): Optional<String> = message.getOptional("message")

        /**
         * Identifier indicating whether the benefit was newly enrolled or updated.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [finchCode].
         *
         * Unlike [finchCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("finch_code") @ExcludeMissing fun _finchCode(): JsonField<String> = finchCode

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var finchCode: JsonField<String> = JsonMissing.of()
            private var message: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                finchCode = body.finchCode
                message = body.message
                name = body.name
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** A descriptive identifier for the response. */
            fun finchCode(finchCode: String?) = finchCode(JsonField.ofNullable(finchCode))

            /** Alias for calling [Builder.finchCode] with `finchCode.orElse(null)`. */
            fun finchCode(finchCode: Optional<String>) = finchCode(finchCode.getOrNull())

            /**
             * Sets [Builder.finchCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.finchCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun finchCode(finchCode: JsonField<String>) = apply { this.finchCode = finchCode }

            /** Short description in English that provides more information about the response. */
            fun message(message: String?) = message(JsonField.ofNullable(message))

            /** Alias for calling [Builder.message] with `message.orElse(null)`. */
            fun message(message: Optional<String>) = message(message.getOrNull())

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

            /** Identifier indicating whether the benefit was newly enrolled or updated. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body = Body(finchCode, message, name, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            finchCode()
            message()
            name()
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
            (if (finchCode.asKnown().isPresent) 1 else 0) +
                (if (message.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && finchCode == other.finchCode && message == other.message && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(finchCode, message, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{finchCode=$finchCode, message=$message, name=$name, additionalProperties=$additionalProperties}"
    }

    /** HTTP status code. Either 201 or 200 */
    class Code @JsonCreator private constructor(private val value: JsonField<Long>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Long> = value

        companion object {

            @JvmField val OK = of(200)

            @JvmField val CREATED = of(201)

            @JvmField val NOT_FOUND = of(404)

            @JvmField val FORBIDDEN = of(403)

            @JvmStatic fun of(value: Long) = Code(JsonField.of(value))
        }

        /** An enum containing [Code]'s known values. */
        enum class Known {
            OK,
            CREATED,
            NOT_FOUND,
            FORBIDDEN,
        }

        /**
         * An enum containing [Code]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Code] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OK,
            CREATED,
            NOT_FOUND,
            FORBIDDEN,
            /** An enum member indicating that [Code] was instantiated with an unknown value. */
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
                OK -> Value.OK
                CREATED -> Value.CREATED
                NOT_FOUND -> Value.NOT_FOUND
                FORBIDDEN -> Value.FORBIDDEN
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
                OK -> Known.OK
                CREATED -> Known.CREATED
                NOT_FOUND -> Known.NOT_FOUND
                FORBIDDEN -> Known.FORBIDDEN
                else -> throw FinchInvalidDataException("Unknown Code: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws FinchInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asLong(): Long =
            _value().asNumber().getOrNull()?.let {
                if (it.toDouble() % 1 == 0.0) it.toLong() else null
            } ?: throw FinchInvalidDataException("Value is not a Long")

        private var validated: Boolean = false

        fun validate(): Code = apply {
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

            return /* spotless:off */ other is Code && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EnrolledIndividual && body == other.body && code == other.code && individualId == other.individualId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(body, code, individualId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EnrolledIndividual{body=$body, code=$code, individualId=$individualId, additionalProperties=$additionalProperties}"
}

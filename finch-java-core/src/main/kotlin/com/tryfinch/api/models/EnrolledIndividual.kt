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
class EnrolledIndividual
@JsonCreator
private constructor(
    @JsonProperty("body") @ExcludeMissing private val body: JsonField<Body> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<Code> = JsonMissing.of(),
    @JsonProperty("individual_id")
    @ExcludeMissing
    private val individualId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun body(): Optional<Body> = Optional.ofNullable(body.getNullable("body"))

    /** HTTP status code. Either 201 or 200 */
    fun code(): Optional<Code> = Optional.ofNullable(code.getNullable("code"))

    fun individualId(): Optional<String> =
        Optional.ofNullable(individualId.getNullable("individual_id"))

    @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<Body> = body

    /** HTTP status code. Either 201 or 200 */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Code> = code

    @JsonProperty("individual_id")
    @ExcludeMissing
    fun _individualId(): JsonField<String> = individualId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EnrolledIndividual = apply {
        if (!validated) {
            body().map { it.validate() }
            code()
            individualId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

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

        fun body(body: JsonField<Body>) = apply { this.body = body }

        /** HTTP status code. Either 201 or 200 */
        fun code(code: Code) = code(JsonField.of(code))

        /** HTTP status code. Either 201 or 200 */
        fun code(code: JsonField<Code>) = apply { this.code = code }

        fun individualId(individualId: String) = individualId(JsonField.of(individualId))

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

        fun build(): EnrolledIndividual =
            EnrolledIndividual(
                body,
                code,
                individualId,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("finch_code")
        @ExcludeMissing
        private val finchCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message")
        @ExcludeMissing
        private val message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A descriptive identifier for the response */
        fun finchCode(): Optional<String> = Optional.ofNullable(finchCode.getNullable("finch_code"))

        /** Short description in English that provides more information about the response. */
        fun message(): Optional<String> = Optional.ofNullable(message.getNullable("message"))

        /** Identifier indicating whether the benefit was newly enrolled or updated. */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** A descriptive identifier for the response */
        @JsonProperty("finch_code") @ExcludeMissing fun _finchCode(): JsonField<String> = finchCode

        /** Short description in English that provides more information about the response. */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        /** Identifier indicating whether the benefit was newly enrolled or updated. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (!validated) {
                finchCode()
                message()
                name()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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

            /** A descriptive identifier for the response */
            fun finchCode(finchCode: String?) = finchCode(JsonField.ofNullable(finchCode))

            /** A descriptive identifier for the response */
            fun finchCode(finchCode: Optional<String>) = finchCode(finchCode.orElse(null))

            /** A descriptive identifier for the response */
            fun finchCode(finchCode: JsonField<String>) = apply { this.finchCode = finchCode }

            /** Short description in English that provides more information about the response. */
            fun message(message: String?) = message(JsonField.ofNullable(message))

            /** Short description in English that provides more information about the response. */
            fun message(message: Optional<String>) = message(message.orElse(null))

            /** Short description in English that provides more information about the response. */
            fun message(message: JsonField<String>) = apply { this.message = message }

            /** Identifier indicating whether the benefit was newly enrolled or updated. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Identifier indicating whether the benefit was newly enrolled or updated. */
            fun name(name: Optional<String>) = name(name.orElse(null))

            /** Identifier indicating whether the benefit was newly enrolled or updated. */
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

            fun build(): Body =
                Body(
                    finchCode,
                    message,
                    name,
                    additionalProperties.toImmutable(),
                )
        }

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

    class Code
    @JsonCreator
    private constructor(
        private val value: JsonField<Long>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Long> = value

        companion object {

            @JvmField val OK = of(200)

            @JvmField val CREATED = of(201)

            @JvmField val NOT_FOUND = of(404)

            @JvmField val FORBIDDEN = of(403)

            @JvmStatic fun of(value: Long) = Code(JsonField.of(value))
        }

        enum class Known {
            OK,
            CREATED,
            NOT_FOUND,
            FORBIDDEN,
        }

        enum class Value {
            OK,
            CREATED,
            NOT_FOUND,
            FORBIDDEN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                OK -> Value.OK
                CREATED -> Value.CREATED
                NOT_FOUND -> Value.NOT_FOUND
                FORBIDDEN -> Value.FORBIDDEN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                OK -> Known.OK
                CREATED -> Known.CREATED
                NOT_FOUND -> Known.NOT_FOUND
                FORBIDDEN -> Known.FORBIDDEN
                else -> throw FinchInvalidDataException("Unknown Code: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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

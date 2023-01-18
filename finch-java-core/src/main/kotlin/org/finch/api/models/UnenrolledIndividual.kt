package org.finch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional
import org.finch.api.core.ExcludeMissing
import org.finch.api.core.JsonField
import org.finch.api.core.JsonMissing
import org.finch.api.core.JsonValue
import org.finch.api.core.NoAutoDetect
import org.finch.api.core.toUnmodifiable

@JsonDeserialize(builder = UnenrolledIndividual.Builder::class)
@NoAutoDetect
class UnenrolledIndividual
private constructor(
    private val individualId: JsonField<String>,
    private val code: JsonField<Long>,
    private val body: JsonField<Body>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun individualId(): Optional<String> =
        Optional.ofNullable(individualId.getNullable("individual_id"))

    /** HTTP status code */
    fun code(): Optional<Long> = Optional.ofNullable(code.getNullable("code"))

    fun body(): Optional<Body> = Optional.ofNullable(body.getNullable("body"))

    @JsonProperty("individual_id") @ExcludeMissing fun _individualId() = individualId

    /** HTTP status code */
    @JsonProperty("code") @ExcludeMissing fun _code() = code

    @JsonProperty("body") @ExcludeMissing fun _body() = body

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            individualId()
            code()
            body().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UnenrolledIndividual &&
            this.individualId == other.individualId &&
            this.code == other.code &&
            this.body == other.body &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    individualId,
                    code,
                    body,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "UnenrolledIndividual{individualId=$individualId, code=$code, body=$body, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var individualId: JsonField<String> = JsonMissing.of()
        private var code: JsonField<Long> = JsonMissing.of()
        private var body: JsonField<Body> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(unenrolledIndividual: UnenrolledIndividual) = apply {
            this.individualId = unenrolledIndividual.individualId
            this.code = unenrolledIndividual.code
            this.body = unenrolledIndividual.body
            additionalProperties(unenrolledIndividual.additionalProperties)
        }

        fun individualId(individualId: String) = individualId(JsonField.of(individualId))

        @JsonProperty("individual_id")
        @ExcludeMissing
        fun individualId(individualId: JsonField<String>) = apply {
            this.individualId = individualId
        }

        /** HTTP status code */
        fun code(code: Long) = code(JsonField.of(code))

        /** HTTP status code */
        @JsonProperty("code")
        @ExcludeMissing
        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun body(body: Body) = body(JsonField.of(body))

        @JsonProperty("body")
        @ExcludeMissing
        fun body(body: JsonField<Body>) = apply { this.body = body }

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

        fun build(): UnenrolledIndividual =
            UnenrolledIndividual(
                individualId,
                code,
                body,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Body.Builder::class)
    @NoAutoDetect
    class Body
    private constructor(
        private val name: JsonField<String>,
        private val finchCode: JsonField<String>,
        private val message: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Identifier indicating whether the benefit was newly enrolled or updated. */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** A descriptive identifier for the response. */
        fun finchCode(): Optional<String> = Optional.ofNullable(finchCode.getNullable("finch_code"))

        /** Short description in English that provides more information about the response. */
        fun message(): Optional<String> = Optional.ofNullable(message.getNullable("message"))

        /** Identifier indicating whether the benefit was newly enrolled or updated. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** A descriptive identifier for the response. */
        @JsonProperty("finch_code") @ExcludeMissing fun _finchCode() = finchCode

        /** Short description in English that provides more information about the response. */
        @JsonProperty("message") @ExcludeMissing fun _message() = message

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
                name()
                finchCode()
                message()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                this.name == other.name &&
                this.finchCode == other.finchCode &&
                this.message == other.message &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        finchCode,
                        message,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Body{name=$name, finchCode=$finchCode, message=$message, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var finchCode: JsonField<String> = JsonMissing.of()
            private var message: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                this.name = body.name
                this.finchCode = body.finchCode
                this.message = body.message
                additionalProperties(body.additionalProperties)
            }

            /** Identifier indicating whether the benefit was newly enrolled or updated. */
            fun name(name: String) = name(JsonField.of(name))

            /** Identifier indicating whether the benefit was newly enrolled or updated. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** A descriptive identifier for the response. */
            fun finchCode(finchCode: String) = finchCode(JsonField.of(finchCode))

            /** A descriptive identifier for the response. */
            @JsonProperty("finch_code")
            @ExcludeMissing
            fun finchCode(finchCode: JsonField<String>) = apply { this.finchCode = finchCode }

            /** Short description in English that provides more information about the response. */
            fun message(message: String) = message(JsonField.of(message))

            /** Short description in English that provides more information about the response. */
            @JsonProperty("message")
            @ExcludeMissing
            fun message(message: JsonField<String>) = apply { this.message = message }

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

            fun build(): Body =
                Body(
                    name,
                    finchCode,
                    message,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}

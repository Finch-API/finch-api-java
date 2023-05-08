package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = PayStatementResponse.Builder::class)
@NoAutoDetect
class PayStatementResponse
private constructor(
    private val paymentId: JsonField<String>,
    private val code: JsonField<Long>,
    private val body: JsonField<PayStatementResponseBody>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun paymentId(): Optional<String> = Optional.ofNullable(paymentId.getNullable("payment_id"))

    fun code(): Optional<Long> = Optional.ofNullable(code.getNullable("code"))

    fun body(): Optional<PayStatementResponseBody> = Optional.ofNullable(body.getNullable("body"))

    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId() = paymentId

    @JsonProperty("code") @ExcludeMissing fun _code() = code

    @JsonProperty("body") @ExcludeMissing fun _body() = body

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            paymentId()
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

        return other is PayStatementResponse &&
            this.paymentId == other.paymentId &&
            this.code == other.code &&
            this.body == other.body &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    paymentId,
                    code,
                    body,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PayStatementResponse{paymentId=$paymentId, code=$code, body=$body, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var paymentId: JsonField<String> = JsonMissing.of()
        private var code: JsonField<Long> = JsonMissing.of()
        private var body: JsonField<PayStatementResponseBody> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payStatementResponse: PayStatementResponse) = apply {
            this.paymentId = payStatementResponse.paymentId
            this.code = payStatementResponse.code
            this.body = payStatementResponse.body
            additionalProperties(payStatementResponse.additionalProperties)
        }

        fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

        @JsonProperty("payment_id")
        @ExcludeMissing
        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

        fun code(code: Long) = code(JsonField.of(code))

        @JsonProperty("code")
        @ExcludeMissing
        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun body(body: PayStatementResponseBody) = body(JsonField.of(body))

        @JsonProperty("body")
        @ExcludeMissing
        fun body(body: JsonField<PayStatementResponseBody>) = apply { this.body = body }

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

        fun build(): PayStatementResponse =
            PayStatementResponse(
                paymentId,
                code,
                body,
                additionalProperties.toUnmodifiable(),
            )
    }
}

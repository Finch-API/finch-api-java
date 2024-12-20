// File generated from our OpenAPI spec by Stainless.

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
import com.tryfinch.api.core.toImmutable
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

    fun paymentId(): Optional<String> = Optional.ofNullable(paymentId.getNullable("payment_id"))

    fun code(): Optional<Long> = Optional.ofNullable(code.getNullable("code"))

    fun body(): Optional<PayStatementResponseBody> = Optional.ofNullable(body.getNullable("body"))

    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId() = paymentId

    @JsonProperty("code") @ExcludeMissing fun _code() = code

    @JsonProperty("body") @ExcludeMissing fun _body() = body

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PayStatementResponse = apply {
        if (!validated) {
            paymentId()
            code()
            body().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

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
            paymentId = payStatementResponse.paymentId
            code = payStatementResponse.code
            body = payStatementResponse.body
            additionalProperties = payStatementResponse.additionalProperties.toMutableMap()
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
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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

        fun build(): PayStatementResponse =
            PayStatementResponse(
                paymentId,
                code,
                body,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PayStatementResponse && paymentId == other.paymentId && code == other.code && body == other.body && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(paymentId, code, body, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PayStatementResponse{paymentId=$paymentId, code=$code, body=$body, additionalProperties=$additionalProperties}"
}

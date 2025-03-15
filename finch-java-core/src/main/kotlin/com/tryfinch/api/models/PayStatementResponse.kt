// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
class PayStatementResponse
@JsonCreator
private constructor(
    @JsonProperty("body")
    @ExcludeMissing
    private val body: JsonField<PayStatementResponseBody> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("payment_id")
    @ExcludeMissing
    private val paymentId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun body(): Optional<PayStatementResponseBody> = Optional.ofNullable(body.getNullable("body"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<Long> = Optional.ofNullable(code.getNullable("code"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paymentId(): Optional<String> = Optional.ofNullable(paymentId.getNullable("payment_id"))

    /**
     * Returns the raw JSON value of [body].
     *
     * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<PayStatementResponseBody> = body

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Long> = code

    /**
     * Returns the raw JSON value of [paymentId].
     *
     * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PayStatementResponse = apply {
        if (validated) {
            return@apply
        }

        body().ifPresent { it.validate() }
        code()
        paymentId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [PayStatementResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PayStatementResponse]. */
    class Builder internal constructor() {

        private var body: JsonField<PayStatementResponseBody> = JsonMissing.of()
        private var code: JsonField<Long> = JsonMissing.of()
        private var paymentId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payStatementResponse: PayStatementResponse) = apply {
            body = payStatementResponse.body
            code = payStatementResponse.code
            paymentId = payStatementResponse.paymentId
            additionalProperties = payStatementResponse.additionalProperties.toMutableMap()
        }

        fun body(body: PayStatementResponseBody) = body(JsonField.of(body))

        /**
         * Sets [Builder.body] to an arbitrary JSON value.
         *
         * You should usually call [Builder.body] with a well-typed [PayStatementResponseBody] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun body(body: JsonField<PayStatementResponseBody>) = apply { this.body = body }

        fun code(code: Long) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

        /**
         * Sets [Builder.paymentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        fun build(): PayStatementResponse =
            PayStatementResponse(body, code, paymentId, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PayStatementResponse && body == other.body && code == other.code && paymentId == other.paymentId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(body, code, paymentId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PayStatementResponse{body=$body, code=$code, paymentId=$paymentId, additionalProperties=$additionalProperties}"
}

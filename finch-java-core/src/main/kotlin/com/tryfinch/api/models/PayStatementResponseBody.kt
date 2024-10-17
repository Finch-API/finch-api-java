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
import com.tryfinch.api.core.toUnmodifiable
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = PayStatementResponseBody.Builder::class)
@NoAutoDetect
class PayStatementResponseBody
private constructor(
    private val paging: JsonField<Paging>,
    private val payStatements: JsonField<List<PayStatement>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun paging(): Optional<Paging> = Optional.ofNullable(paging.getNullable("paging"))

    /** The array of pay statements for the current payment. */
    fun payStatements(): Optional<List<PayStatement>> =
        Optional.ofNullable(payStatements.getNullable("pay_statements"))

    @JsonProperty("paging") @ExcludeMissing fun _paging() = paging

    /** The array of pay statements for the current payment. */
    @JsonProperty("pay_statements") @ExcludeMissing fun _payStatements() = payStatements

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PayStatementResponseBody = apply {
        if (!validated) {
            paging().map { it.validate() }
            payStatements().map { it.forEach { it.validate() } }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var paging: JsonField<Paging> = JsonMissing.of()
        private var payStatements: JsonField<List<PayStatement>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payStatementResponseBody: PayStatementResponseBody) = apply {
            this.paging = payStatementResponseBody.paging
            this.payStatements = payStatementResponseBody.payStatements
            additionalProperties(payStatementResponseBody.additionalProperties)
        }

        fun paging(paging: Paging) = paging(JsonField.of(paging))

        @JsonProperty("paging")
        @ExcludeMissing
        fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

        /** The array of pay statements for the current payment. */
        fun payStatements(payStatements: List<PayStatement>) =
            payStatements(JsonField.of(payStatements))

        /** The array of pay statements for the current payment. */
        @JsonProperty("pay_statements")
        @ExcludeMissing
        fun payStatements(payStatements: JsonField<List<PayStatement>>) = apply {
            this.payStatements = payStatements
        }

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

        fun build(): PayStatementResponseBody =
            PayStatementResponseBody(
                paging,
                payStatements.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PayStatementResponseBody && this.paging == other.paging && this.payStatements == other.payStatements && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(paging, payStatements, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "PayStatementResponseBody{paging=$paging, payStatements=$payStatements, additionalProperties=$additionalProperties}"
}

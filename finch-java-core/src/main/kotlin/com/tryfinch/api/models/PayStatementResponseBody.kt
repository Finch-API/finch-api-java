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
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class PayStatementResponseBody
@JsonCreator
private constructor(
    @JsonProperty("paging")
    @ExcludeMissing
    private val paging: JsonField<Paging> = JsonMissing.of(),
    @JsonProperty("pay_statements")
    @ExcludeMissing
    private val payStatements: JsonField<List<PayStatement>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun paging(): Optional<Paging> = Optional.ofNullable(paging.getNullable("paging"))

    /** The array of pay statements for the current payment. */
    fun payStatements(): Optional<List<PayStatement>> =
        Optional.ofNullable(payStatements.getNullable("pay_statements"))

    @JsonProperty("paging") @ExcludeMissing fun _paging(): JsonField<Paging> = paging

    /** The array of pay statements for the current payment. */
    @JsonProperty("pay_statements")
    @ExcludeMissing
    fun _payStatements(): JsonField<List<PayStatement>> = payStatements

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PayStatementResponseBody = apply {
        if (validated) {
            return@apply
        }

        paging().ifPresent { it.validate() }
        payStatements().ifPresent { it.forEach { it.validate() } }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PayStatementResponseBody]. */
    class Builder internal constructor() {

        private var paging: JsonField<Paging> = JsonMissing.of()
        private var payStatements: JsonField<MutableList<PayStatement>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payStatementResponseBody: PayStatementResponseBody) = apply {
            paging = payStatementResponseBody.paging
            payStatements = payStatementResponseBody.payStatements.map { it.toMutableList() }
            additionalProperties = payStatementResponseBody.additionalProperties.toMutableMap()
        }

        fun paging(paging: Paging) = paging(JsonField.of(paging))

        fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

        /** The array of pay statements for the current payment. */
        fun payStatements(payStatements: List<PayStatement>) =
            payStatements(JsonField.of(payStatements))

        /** The array of pay statements for the current payment. */
        fun payStatements(payStatements: JsonField<List<PayStatement>>) = apply {
            this.payStatements = payStatements.map { it.toMutableList() }
        }

        /** The array of pay statements for the current payment. */
        fun addPayStatement(payStatement: PayStatement) = apply {
            payStatements =
                (payStatements ?: JsonField.of(mutableListOf())).also {
                    checkKnown("payStatements", it).add(payStatement)
                }
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

        fun build(): PayStatementResponseBody =
            PayStatementResponseBody(
                paging,
                (payStatements ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PayStatementResponseBody && paging == other.paging && payStatements == other.payStatements && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(paging, payStatements, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PayStatementResponseBody{paging=$paging, payStatements=$payStatements, additionalProperties=$additionalProperties}"
}

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
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PayStatementResponseBody
private constructor(
    private val paging: JsonField<Paging>,
    private val payStatements: JsonField<List<PayStatement>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("paging") @ExcludeMissing paging: JsonField<Paging> = JsonMissing.of(),
        @JsonProperty("pay_statements")
        @ExcludeMissing
        payStatements: JsonField<List<PayStatement>> = JsonMissing.of(),
    ) : this(paging, payStatements, mutableMapOf())

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paging(): Optional<Paging> = paging.getOptional("paging")

    /**
     * The array of pay statements for the current payment.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payStatements(): Optional<List<PayStatement>> = payStatements.getOptional("pay_statements")

    /**
     * Returns the raw JSON value of [paging].
     *
     * Unlike [paging], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("paging") @ExcludeMissing fun _paging(): JsonField<Paging> = paging

    /**
     * Returns the raw JSON value of [payStatements].
     *
     * Unlike [payStatements], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pay_statements")
    @ExcludeMissing
    fun _payStatements(): JsonField<List<PayStatement>> = payStatements

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

        /** Returns a mutable builder for constructing an instance of [PayStatementResponseBody]. */
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

        /**
         * Sets [Builder.paging] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paging] with a well-typed [Paging] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

        /** The array of pay statements for the current payment. */
        fun payStatements(payStatements: List<PayStatement>) =
            payStatements(JsonField.of(payStatements))

        /**
         * Sets [Builder.payStatements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payStatements] with a well-typed `List<PayStatement>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun payStatements(payStatements: JsonField<List<PayStatement>>) = apply {
            this.payStatements = payStatements.map { it.toMutableList() }
        }

        /**
         * Adds a single [PayStatement] to [payStatements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
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

        /**
         * Returns an immutable instance of [PayStatementResponseBody].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PayStatementResponseBody =
            PayStatementResponseBody(
                paging,
                (payStatements ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PayStatementResponseBody = apply {
        if (validated) {
            return@apply
        }

        paging().ifPresent { it.validate() }
        payStatements().ifPresent { it.forEach { it.validate() } }
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
        (paging.asKnown().getOrNull()?.validity() ?: 0) +
            (payStatements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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

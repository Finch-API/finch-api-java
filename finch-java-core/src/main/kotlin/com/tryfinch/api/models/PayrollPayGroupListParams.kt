// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.models.*
import java.util.Objects
import java.util.Optional

class PayrollPayGroupListParams
constructor(
    private val individualId: String?,
    private val payFrequencies: List<String>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun individualId(): Optional<String> = Optional.ofNullable(individualId)

    fun payFrequencies(): Optional<List<String>> = Optional.ofNullable(payFrequencies)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.individualId?.let { params.put("individual_id", listOf(it.toString())) }
        this.payFrequencies?.let { params.put("pay_frequencies[]", it.map(Any::toString)) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PayrollPayGroupListParams && this.individualId == other.individualId && this.payFrequencies == other.payFrequencies && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(individualId, payFrequencies, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "PayrollPayGroupListParams{individualId=$individualId, payFrequencies=$payFrequencies, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var individualId: String? = null
        private var payFrequencies: MutableList<String> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payrollPayGroupListParams: PayrollPayGroupListParams) = apply {
            this.individualId = payrollPayGroupListParams.individualId
            this.payFrequencies(payrollPayGroupListParams.payFrequencies ?: listOf())
            additionalQueryParams(payrollPayGroupListParams.additionalQueryParams)
            additionalHeaders(payrollPayGroupListParams.additionalHeaders)
        }

        fun individualId(individualId: String) = apply { this.individualId = individualId }

        fun payFrequencies(payFrequencies: List<String>) = apply {
            this.payFrequencies.clear()
            this.payFrequencies.addAll(payFrequencies)
        }

        fun addPayFrequency(payFrequency: String) = apply { this.payFrequencies.add(payFrequency) }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): PayrollPayGroupListParams =
            PayrollPayGroupListParams(
                individualId,
                if (payFrequencies.size == 0) null else payFrequencies.toImmutable(),
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
            )
    }
}

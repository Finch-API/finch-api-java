// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.Params
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/** Read company pay groups and frequencies */
class PayrollPayGroupListParams
private constructor(
    private val individualId: String?,
    private val payFrequencies: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun individualId(): Optional<String> = Optional.ofNullable(individualId)

    fun payFrequencies(): Optional<List<String>> = Optional.ofNullable(payFrequencies)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.individualId?.let { queryParams.put("individual_id", listOf(it.toString())) }
        this.payFrequencies?.let { queryParams.put("pay_frequencies[]", it.map(Any::toString)) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): PayrollPayGroupListParams = builder().build()

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PayrollPayGroupListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var individualId: String? = null
        private var payFrequencies: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(payrollPayGroupListParams: PayrollPayGroupListParams) = apply {
            individualId = payrollPayGroupListParams.individualId
            payFrequencies = payrollPayGroupListParams.payFrequencies?.toMutableList()
            additionalHeaders = payrollPayGroupListParams.additionalHeaders.toBuilder()
            additionalQueryParams = payrollPayGroupListParams.additionalQueryParams.toBuilder()
        }

        fun individualId(individualId: String?) = apply { this.individualId = individualId }

        fun individualId(individualId: Optional<String>) = individualId(individualId.orElse(null))

        fun payFrequencies(payFrequencies: List<String>?) = apply {
            this.payFrequencies = payFrequencies?.toMutableList()
        }

        fun payFrequencies(payFrequencies: Optional<List<String>>) =
            payFrequencies(payFrequencies.orElse(null))

        fun addPayFrequency(payFrequency: String) = apply {
            payFrequencies = (payFrequencies ?: mutableListOf()).apply { add(payFrequency) }
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): PayrollPayGroupListParams =
            PayrollPayGroupListParams(
                individualId,
                payFrequencies?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PayrollPayGroupListParams && individualId == other.individualId && payFrequencies == other.payFrequencies && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(individualId, payFrequencies, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PayrollPayGroupListParams{individualId=$individualId, payFrequencies=$payFrequencies, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

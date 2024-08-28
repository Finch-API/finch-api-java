// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.models.*
import java.time.LocalDate
import java.util.Objects

class HrisPaymentListParams
constructor(
    private val endDate: LocalDate,
    private val startDate: LocalDate,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun endDate(): LocalDate = endDate

    fun startDate(): LocalDate = startDate

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.endDate.let { params.put("end_date", listOf(it.toString())) }
        this.startDate.let { params.put("start_date", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HrisPaymentListParams &&
            this.endDate == other.endDate &&
            this.startDate == other.startDate &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            endDate,
            startDate,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "HrisPaymentListParams{endDate=$endDate, startDate=$startDate, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var endDate: LocalDate? = null
        private var startDate: LocalDate? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(hrisPaymentListParams: HrisPaymentListParams) = apply {
            this.endDate = hrisPaymentListParams.endDate
            this.startDate = hrisPaymentListParams.startDate
            additionalQueryParams(hrisPaymentListParams.additionalQueryParams)
            additionalHeaders(hrisPaymentListParams.additionalHeaders)
        }

        /** The end date to retrieve payments by a company (inclusive) in `YYYY-MM-DD` format. */
        fun endDate(endDate: LocalDate) = apply { this.endDate = endDate }

        /** The start date to retrieve payments by a company (inclusive) in `YYYY-MM-DD` format. */
        fun startDate(startDate: LocalDate) = apply { this.startDate = startDate }

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

        fun build(): HrisPaymentListParams =
            HrisPaymentListParams(
                checkNotNull(endDate) { "`endDate` is required but was not set" },
                checkNotNull(startDate) { "`startDate` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}

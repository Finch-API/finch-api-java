// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.models.*
import java.util.Objects
import java.util.Optional

class HrisBenefitIndividualRetrieveManyBenefitsParams
constructor(
    private val benefitId: String,
    private val individualIds: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun benefitId(): String = benefitId

    fun individualIds(): Optional<String> = Optional.ofNullable(individualIds)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.individualIds?.let { params.put("individual_ids", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> benefitId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HrisBenefitIndividualRetrieveManyBenefitsParams &&
            this.benefitId == other.benefitId &&
            this.individualIds == other.individualIds &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            benefitId,
            individualIds,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "HrisBenefitIndividualRetrieveManyBenefitsParams{benefitId=$benefitId, individualIds=$individualIds, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var benefitId: String? = null
        private var individualIds: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            hrisBenefitIndividualRetrieveManyBenefitsParams:
                HrisBenefitIndividualRetrieveManyBenefitsParams
        ) = apply {
            this.benefitId = hrisBenefitIndividualRetrieveManyBenefitsParams.benefitId
            this.individualIds = hrisBenefitIndividualRetrieveManyBenefitsParams.individualIds
            additionalQueryParams(
                hrisBenefitIndividualRetrieveManyBenefitsParams.additionalQueryParams
            )
            additionalHeaders(hrisBenefitIndividualRetrieveManyBenefitsParams.additionalHeaders)
            additionalBodyProperties(
                hrisBenefitIndividualRetrieveManyBenefitsParams.additionalBodyProperties
            )
        }

        fun benefitId(benefitId: String) = apply { this.benefitId = benefitId }

        /**
         * comma-delimited list of stable Finch uuids for each individual. If empty, defaults to all
         * individuals
         */
        fun individualIds(individualIds: String) = apply { this.individualIds = individualIds }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): HrisBenefitIndividualRetrieveManyBenefitsParams =
            HrisBenefitIndividualRetrieveManyBenefitsParams(
                checkNotNull(benefitId) { "`benefitId` is required but was not set" },
                individualIds,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.Params
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get enrollment information for the given individuals. */
class HrisBenefitIndividualRetrieveManyBenefitsParams
private constructor(
    private val benefitId: String?,
    private val individualIds: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun benefitId(): Optional<String> = Optional.ofNullable(benefitId)

    /**
     * comma-delimited list of stable Finch uuids for each individual. If empty, defaults to all
     * individuals
     */
    fun individualIds(): Optional<String> = Optional.ofNullable(individualIds)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): HrisBenefitIndividualRetrieveManyBenefitsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisBenefitIndividualRetrieveManyBenefitsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HrisBenefitIndividualRetrieveManyBenefitsParams]. */
    class Builder internal constructor() {

        private var benefitId: String? = null
        private var individualIds: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            hrisBenefitIndividualRetrieveManyBenefitsParams:
                HrisBenefitIndividualRetrieveManyBenefitsParams
        ) = apply {
            benefitId = hrisBenefitIndividualRetrieveManyBenefitsParams.benefitId
            individualIds = hrisBenefitIndividualRetrieveManyBenefitsParams.individualIds
            additionalHeaders =
                hrisBenefitIndividualRetrieveManyBenefitsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                hrisBenefitIndividualRetrieveManyBenefitsParams.additionalQueryParams.toBuilder()
        }

        fun benefitId(benefitId: String?) = apply { this.benefitId = benefitId }

        /** Alias for calling [Builder.benefitId] with `benefitId.orElse(null)`. */
        fun benefitId(benefitId: Optional<String>) = benefitId(benefitId.getOrNull())

        /**
         * comma-delimited list of stable Finch uuids for each individual. If empty, defaults to all
         * individuals
         */
        fun individualIds(individualIds: String?) = apply { this.individualIds = individualIds }

        /** Alias for calling [Builder.individualIds] with `individualIds.orElse(null)`. */
        fun individualIds(individualIds: Optional<String>) =
            individualIds(individualIds.getOrNull())

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

        /**
         * Returns an immutable instance of [HrisBenefitIndividualRetrieveManyBenefitsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): HrisBenefitIndividualRetrieveManyBenefitsParams =
            HrisBenefitIndividualRetrieveManyBenefitsParams(
                benefitId,
                individualIds,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> benefitId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                individualIds?.let { put("individual_ids", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HrisBenefitIndividualRetrieveManyBenefitsParams &&
            benefitId == other.benefitId &&
            individualIds == other.individualIds &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(benefitId, individualIds, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "HrisBenefitIndividualRetrieveManyBenefitsParams{benefitId=$benefitId, individualIds=$individualIds, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

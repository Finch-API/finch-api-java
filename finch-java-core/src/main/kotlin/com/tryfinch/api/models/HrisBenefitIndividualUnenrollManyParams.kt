// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.models.*
import java.util.Objects
import java.util.Optional

class HrisBenefitIndividualUnenrollManyParams
constructor(
    private val benefitId: String,
    private val individualIds: List<String>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun benefitId(): String = benefitId

    fun individualIds(): Optional<List<String>> = Optional.ofNullable(individualIds)

    @JvmSynthetic
    internal fun getBody(): HrisBenefitIndividualUnenrollManyBody {
        return HrisBenefitIndividualUnenrollManyBody(individualIds, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> benefitId
            else -> ""
        }
    }

    @JsonDeserialize(builder = HrisBenefitIndividualUnenrollManyBody.Builder::class)
    @NoAutoDetect
    class HrisBenefitIndividualUnenrollManyBody
    internal constructor(
        private val individualIds: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Array of individual_ids to unenroll. */
        @JsonProperty("individual_ids") fun individualIds(): List<String>? = individualIds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var individualIds: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                hrisBenefitIndividualUnenrollManyBody: HrisBenefitIndividualUnenrollManyBody
            ) = apply {
                this.individualIds = hrisBenefitIndividualUnenrollManyBody.individualIds
                additionalProperties(hrisBenefitIndividualUnenrollManyBody.additionalProperties)
            }

            /** Array of individual_ids to unenroll. */
            @JsonProperty("individual_ids")
            fun individualIds(individualIds: List<String>) = apply {
                this.individualIds = individualIds
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

            fun build(): HrisBenefitIndividualUnenrollManyBody =
                HrisBenefitIndividualUnenrollManyBody(
                    individualIds?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is HrisBenefitIndividualUnenrollManyBody && this.individualIds == other.individualIds && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(individualIds, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "HrisBenefitIndividualUnenrollManyBody{individualIds=$individualIds, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitIndividualUnenrollManyParams && this.benefitId == other.benefitId && this.individualIds == other.individualIds && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(benefitId, individualIds, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "HrisBenefitIndividualUnenrollManyParams{benefitId=$benefitId, individualIds=$individualIds, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var benefitId: String? = null
        private var individualIds: MutableList<String> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            hrisBenefitIndividualUnenrollManyParams: HrisBenefitIndividualUnenrollManyParams
        ) = apply {
            this.benefitId = hrisBenefitIndividualUnenrollManyParams.benefitId
            this.individualIds(hrisBenefitIndividualUnenrollManyParams.individualIds ?: listOf())
            additionalQueryParams(hrisBenefitIndividualUnenrollManyParams.additionalQueryParams)
            additionalHeaders(hrisBenefitIndividualUnenrollManyParams.additionalHeaders)
            additionalBodyProperties(
                hrisBenefitIndividualUnenrollManyParams.additionalBodyProperties
            )
        }

        fun benefitId(benefitId: String) = apply { this.benefitId = benefitId }

        /** Array of individual_ids to unenroll. */
        fun individualIds(individualIds: List<String>) = apply {
            this.individualIds.clear()
            this.individualIds.addAll(individualIds)
        }

        /** Array of individual_ids to unenroll. */
        fun addIndividualId(individualId: String) = apply { this.individualIds.add(individualId) }

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

        fun build(): HrisBenefitIndividualUnenrollManyParams =
            HrisBenefitIndividualUnenrollManyParams(
                checkNotNull(benefitId) { "`benefitId` is required but was not set" },
                if (individualIds.size == 0) null else individualIds.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}

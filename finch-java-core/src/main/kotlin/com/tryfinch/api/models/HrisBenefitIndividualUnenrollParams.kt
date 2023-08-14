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

class HrisBenefitIndividualUnenrollParams
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
    internal fun getBody(): HrisBenefitIndividualUnenrollBody {
        return HrisBenefitIndividualUnenrollBody(individualIds, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> benefitId
            else -> ""
        }
    }

    @JsonDeserialize(builder = HrisBenefitIndividualUnenrollBody.Builder::class)
    @NoAutoDetect
    class HrisBenefitIndividualUnenrollBody
    internal constructor(
        private val individualIds: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Array of individual_ids to unenroll. */
        @JsonProperty("individual_ids") fun individualIds(): List<String>? = individualIds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is HrisBenefitIndividualUnenrollBody &&
                this.individualIds == other.individualIds &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(individualIds, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "HrisBenefitIndividualUnenrollBody{individualIds=$individualIds, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var individualIds: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                hrisBenefitIndividualUnenrollBody: HrisBenefitIndividualUnenrollBody
            ) = apply {
                this.individualIds = hrisBenefitIndividualUnenrollBody.individualIds
                additionalProperties(hrisBenefitIndividualUnenrollBody.additionalProperties)
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

            fun build(): HrisBenefitIndividualUnenrollBody =
                HrisBenefitIndividualUnenrollBody(
                    individualIds?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable()
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HrisBenefitIndividualUnenrollParams &&
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
        "HrisBenefitIndividualUnenrollParams{benefitId=$benefitId, individualIds=$individualIds, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
            hrisBenefitIndividualUnenrollParams: HrisBenefitIndividualUnenrollParams
        ) = apply {
            this.benefitId = hrisBenefitIndividualUnenrollParams.benefitId
            this.individualIds(hrisBenefitIndividualUnenrollParams.individualIds ?: listOf())
            additionalQueryParams(hrisBenefitIndividualUnenrollParams.additionalQueryParams)
            additionalHeaders(hrisBenefitIndividualUnenrollParams.additionalHeaders)
            additionalBodyProperties(hrisBenefitIndividualUnenrollParams.additionalBodyProperties)
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

        fun build(): HrisBenefitIndividualUnenrollParams =
            HrisBenefitIndividualUnenrollParams(
                checkNotNull(benefitId) { "`benefitId` is required but was not set" },
                if (individualIds.size == 0) null else individualIds.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}

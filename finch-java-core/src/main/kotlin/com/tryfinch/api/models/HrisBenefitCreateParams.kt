// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.models.*
import java.util.Objects
import java.util.Optional

class HrisBenefitCreateParams
constructor(
    private val description: String?,
    private val frequency: BenefitFrequency?,
    private val type: BenefitType?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun frequency(): Optional<BenefitFrequency> = Optional.ofNullable(frequency)

    fun type(): Optional<BenefitType> = Optional.ofNullable(type)

    @JvmSynthetic
    internal fun getBody(): HrisBenefitCreateBody {
        return HrisBenefitCreateBody(
            description,
            frequency,
            type,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = HrisBenefitCreateBody.Builder::class)
    @NoAutoDetect
    class HrisBenefitCreateBody
    internal constructor(
        private val description: String?,
        private val frequency: BenefitFrequency?,
        private val type: BenefitType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Name of the benefit as it appears in the provider and pay statements. Recommend limiting
         * this to <30 characters due to limitations in specific providers (e.g. Justworks).
         */
        @JsonProperty("description") fun description(): String? = description

        @JsonProperty("frequency") fun frequency(): BenefitFrequency? = frequency

        /** Type of benefit. */
        @JsonProperty("type") fun type(): BenefitType? = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var frequency: BenefitFrequency? = null
            private var type: BenefitType? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(hrisBenefitCreateBody: HrisBenefitCreateBody) = apply {
                this.description = hrisBenefitCreateBody.description
                this.frequency = hrisBenefitCreateBody.frequency
                this.type = hrisBenefitCreateBody.type
                additionalProperties(hrisBenefitCreateBody.additionalProperties)
            }

            /**
             * Name of the benefit as it appears in the provider and pay statements. Recommend
             * limiting this to <30 characters due to limitations in specific providers (e.g.
             * Justworks).
             */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            @JsonProperty("frequency")
            fun frequency(frequency: BenefitFrequency) = apply { this.frequency = frequency }

            /** Type of benefit. */
            @JsonProperty("type") fun type(type: BenefitType) = apply { this.type = type }

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

            fun build(): HrisBenefitCreateBody =
                HrisBenefitCreateBody(
                    description,
                    frequency,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is HrisBenefitCreateBody && this.description == other.description && this.frequency == other.frequency && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(description, frequency, type, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "HrisBenefitCreateBody{description=$description, frequency=$frequency, type=$type, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitCreateParams && this.description == other.description && this.frequency == other.frequency && this.type == other.type && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(description, frequency, type, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "HrisBenefitCreateParams{description=$description, frequency=$frequency, type=$type, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var description: String? = null
        private var frequency: BenefitFrequency? = null
        private var type: BenefitType? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(hrisBenefitCreateParams: HrisBenefitCreateParams) = apply {
            this.description = hrisBenefitCreateParams.description
            this.frequency = hrisBenefitCreateParams.frequency
            this.type = hrisBenefitCreateParams.type
            additionalQueryParams(hrisBenefitCreateParams.additionalQueryParams)
            additionalHeaders(hrisBenefitCreateParams.additionalHeaders)
            additionalBodyProperties(hrisBenefitCreateParams.additionalBodyProperties)
        }

        /**
         * Name of the benefit as it appears in the provider and pay statements. Recommend limiting
         * this to <30 characters due to limitations in specific providers (e.g. Justworks).
         */
        fun description(description: String) = apply { this.description = description }

        fun frequency(frequency: BenefitFrequency) = apply { this.frequency = frequency }

        /** Type of benefit. */
        fun type(type: BenefitType) = apply { this.type = type }

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

        fun build(): HrisBenefitCreateParams =
            HrisBenefitCreateParams(
                description,
                frequency,
                type,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}

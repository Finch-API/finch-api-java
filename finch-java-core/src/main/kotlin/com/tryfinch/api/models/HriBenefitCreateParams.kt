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

class HriBenefitCreateParams
constructor(
    private val type: BenefitType?,
    private val description: String?,
    private val frequency: BenefitFrequency?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun type(): Optional<BenefitType> = Optional.ofNullable(type)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun frequency(): Optional<BenefitFrequency> = Optional.ofNullable(frequency)

    @JvmSynthetic
    internal fun getBody(): HriBenefitCreateBody {
        return HriBenefitCreateBody(
            type,
            description,
            frequency,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = HriBenefitCreateBody.Builder::class)
    @NoAutoDetect
    class HriBenefitCreateBody
    internal constructor(
        private val type: BenefitType?,
        private val description: String?,
        private val frequency: BenefitFrequency?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Type of benefit. */
        @JsonProperty("type") fun type(): BenefitType? = type

        @JsonProperty("description") fun description(): String? = description

        @JsonProperty("frequency") fun frequency(): BenefitFrequency? = frequency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is HriBenefitCreateBody &&
                this.type == other.type &&
                this.description == other.description &&
                this.frequency == other.frequency &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        type,
                        description,
                        frequency,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "HriBenefitCreateBody{type=$type, description=$description, frequency=$frequency, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: BenefitType? = null
            private var description: String? = null
            private var frequency: BenefitFrequency? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(hriBenefitCreateBody: HriBenefitCreateBody) = apply {
                this.type = hriBenefitCreateBody.type
                this.description = hriBenefitCreateBody.description
                this.frequency = hriBenefitCreateBody.frequency
                additionalProperties(hriBenefitCreateBody.additionalProperties)
            }

            /** Type of benefit. */
            @JsonProperty("type") fun type(type: BenefitType) = apply { this.type = type }

            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            @JsonProperty("frequency")
            fun frequency(frequency: BenefitFrequency) = apply { this.frequency = frequency }

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

            fun build(): HriBenefitCreateBody =
                HriBenefitCreateBody(
                    type,
                    description,
                    frequency,
                    additionalProperties.toUnmodifiable(),
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

        return other is HriBenefitCreateParams &&
            this.type == other.type &&
            this.description == other.description &&
            this.frequency == other.frequency &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            type,
            description,
            frequency,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "HriBenefitCreateParams{type=$type, description=$description, frequency=$frequency, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var type: BenefitType? = null
        private var description: String? = null
        private var frequency: BenefitFrequency? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(hriBenefitCreateParams: HriBenefitCreateParams) = apply {
            this.type = hriBenefitCreateParams.type
            this.description = hriBenefitCreateParams.description
            this.frequency = hriBenefitCreateParams.frequency
            additionalQueryParams(hriBenefitCreateParams.additionalQueryParams)
            additionalHeaders(hriBenefitCreateParams.additionalHeaders)
            additionalBodyProperties(hriBenefitCreateParams.additionalBodyProperties)
        }

        /** Type of benefit. */
        fun type(type: BenefitType) = apply { this.type = type }

        fun description(description: String) = apply { this.description = description }

        fun frequency(frequency: BenefitFrequency) = apply { this.frequency = frequency }

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

        fun build(): HriBenefitCreateParams =
            HriBenefitCreateParams(
                type,
                description,
                frequency,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}

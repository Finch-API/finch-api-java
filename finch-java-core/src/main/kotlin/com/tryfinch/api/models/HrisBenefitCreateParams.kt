// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import java.util.Objects
import java.util.Optional

class HrisBenefitCreateParams
constructor(
    private val body: HrisBenefitCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /**
     * Name of the benefit as it appears in the provider and pay statements. Recommend limiting this
     * to <30 characters due to limitations in specific providers (e.g. Justworks).
     */
    fun description(): Optional<String> = body.description()

    fun frequency(): Optional<BenefitFrequency> = body.frequency()

    /** Type of benefit. */
    fun type(): Optional<BenefitType> = body.type()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): HrisBenefitCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class HrisBenefitCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("description") private val description: String?,
        @JsonProperty("frequency") private val frequency: BenefitFrequency?,
        @JsonProperty("type") private val type: BenefitType?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Name of the benefit as it appears in the provider and pay statements. Recommend limiting
         * this to <30 characters due to limitations in specific providers (e.g. Justworks).
         */
        @JsonProperty("description")
        fun description(): Optional<String> = Optional.ofNullable(description)

        @JsonProperty("frequency")
        fun frequency(): Optional<BenefitFrequency> = Optional.ofNullable(frequency)

        /** Type of benefit. */
        @JsonProperty("type") fun type(): Optional<BenefitType> = Optional.ofNullable(type)

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
                description = hrisBenefitCreateBody.description
                frequency = hrisBenefitCreateBody.frequency
                type = hrisBenefitCreateBody.type
                additionalProperties = hrisBenefitCreateBody.additionalProperties.toMutableMap()
            }

            /**
             * Name of the benefit as it appears in the provider and pay statements. Recommend
             * limiting this to <30 characters due to limitations in specific providers (e.g.
             * Justworks).
             */
            fun description(description: String?) = apply { this.description = description }

            /**
             * Name of the benefit as it appears in the provider and pay statements. Recommend
             * limiting this to <30 characters due to limitations in specific providers (e.g.
             * Justworks).
             */
            fun description(description: Optional<String>) = description(description.orElse(null))

            fun frequency(frequency: BenefitFrequency?) = apply { this.frequency = frequency }

            fun frequency(frequency: Optional<BenefitFrequency>) = frequency(frequency.orElse(null))

            /** Type of benefit. */
            fun type(type: BenefitType?) = apply { this.type = type }

            /** Type of benefit. */
            fun type(type: Optional<BenefitType>) = type(type.orElse(null))

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

            return /* spotless:off */ other is HrisBenefitCreateBody && description == other.description && frequency == other.frequency && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(description, frequency, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "HrisBenefitCreateBody{description=$description, frequency=$frequency, type=$type, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: HrisBenefitCreateBody.Builder = HrisBenefitCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(hrisBenefitCreateParams: HrisBenefitCreateParams) = apply {
            body = hrisBenefitCreateParams.body.toBuilder()
            additionalHeaders = hrisBenefitCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = hrisBenefitCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Name of the benefit as it appears in the provider and pay statements. Recommend limiting
         * this to <30 characters due to limitations in specific providers (e.g. Justworks).
         */
        fun description(description: String?) = apply { body.description(description) }

        /**
         * Name of the benefit as it appears in the provider and pay statements. Recommend limiting
         * this to <30 characters due to limitations in specific providers (e.g. Justworks).
         */
        fun description(description: Optional<String>) = description(description.orElse(null))

        fun frequency(frequency: BenefitFrequency?) = apply { body.frequency(frequency) }

        fun frequency(frequency: Optional<BenefitFrequency>) = frequency(frequency.orElse(null))

        /** Type of benefit. */
        fun type(type: BenefitType?) = apply { body.type(type) }

        /** Type of benefit. */
        fun type(type: Optional<BenefitType>) = type(type.orElse(null))

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun build(): HrisBenefitCreateParams =
            HrisBenefitCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "HrisBenefitCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.Params
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/**
 * Creates a new company-wide deduction or contribution. Please use the `/providers` endpoint to
 * view available types for each provider.
 */
class HrisBenefitCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Name of the benefit as it appears in the provider and pay statements. Recommend limiting this
     * to <30 characters due to limitations in specific providers (e.g. Justworks).
     */
    fun description(): Optional<String> = body.description()

    fun frequency(): Optional<BenefitFrequency> = body.frequency()

    /** Type of benefit. */
    fun type(): Optional<BenefitType> = body.type()

    /**
     * Name of the benefit as it appears in the provider and pay statements. Recommend limiting this
     * to <30 characters due to limitations in specific providers (e.g. Justworks).
     */
    fun _description(): JsonField<String> = body._description()

    fun _frequency(): JsonField<BenefitFrequency> = body._frequency()

    /** Type of benefit. */
    fun _type(): JsonField<BenefitType> = body._type()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("frequency")
        @ExcludeMissing
        private val frequency: JsonField<BenefitFrequency> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        private val type: JsonField<BenefitType> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Name of the benefit as it appears in the provider and pay statements. Recommend limiting
         * this to <30 characters due to limitations in specific providers (e.g. Justworks).
         */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        fun frequency(): Optional<BenefitFrequency> =
            Optional.ofNullable(frequency.getNullable("frequency"))

        /** Type of benefit. */
        fun type(): Optional<BenefitType> = Optional.ofNullable(type.getNullable("type"))

        /**
         * Name of the benefit as it appears in the provider and pay statements. Recommend limiting
         * this to <30 characters due to limitations in specific providers (e.g. Justworks).
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        @JsonProperty("frequency")
        @ExcludeMissing
        fun _frequency(): JsonField<BenefitFrequency> = frequency

        /** Type of benefit. */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<BenefitType> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            description()
            frequency()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var description: JsonField<String> = JsonMissing.of()
            private var frequency: JsonField<BenefitFrequency> = JsonMissing.of()
            private var type: JsonField<BenefitType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                description = body.description
                frequency = body.frequency
                type = body.type
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Name of the benefit as it appears in the provider and pay statements. Recommend
             * limiting this to <30 characters due to limitations in specific providers (e.g.
             * Justworks).
             */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Name of the benefit as it appears in the provider and pay statements. Recommend
             * limiting this to <30 characters due to limitations in specific providers (e.g.
             * Justworks).
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun frequency(frequency: BenefitFrequency?) = frequency(JsonField.ofNullable(frequency))

            fun frequency(frequency: Optional<BenefitFrequency>) = frequency(frequency.orElse(null))

            fun frequency(frequency: JsonField<BenefitFrequency>) = apply {
                this.frequency = frequency
            }

            /** Type of benefit. */
            fun type(type: BenefitType?) = type(JsonField.ofNullable(type))

            /** Type of benefit. */
            fun type(type: Optional<BenefitType>) = type(type.orElse(null))

            /** Type of benefit. */
            fun type(type: JsonField<BenefitType>) = apply { this.type = type }

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

            fun build(): Body =
                Body(description, frequency, type, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && description == other.description && frequency == other.frequency && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(description, frequency, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{description=$description, frequency=$frequency, type=$type, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): HrisBenefitCreateParams = builder().build()

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HrisBenefitCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
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
        fun description(description: String) = apply { body.description(description) }

        /**
         * Name of the benefit as it appears in the provider and pay statements. Recommend limiting
         * this to <30 characters due to limitations in specific providers (e.g. Justworks).
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun frequency(frequency: BenefitFrequency?) = apply { body.frequency(frequency) }

        fun frequency(frequency: Optional<BenefitFrequency>) = frequency(frequency.orElse(null))

        fun frequency(frequency: JsonField<BenefitFrequency>) = apply { body.frequency(frequency) }

        /** Type of benefit. */
        fun type(type: BenefitType?) = apply { body.type(type) }

        /** Type of benefit. */
        fun type(type: Optional<BenefitType>) = type(type.orElse(null))

        /** Type of benefit. */
        fun type(type: JsonField<BenefitType>) = apply { body.type(type) }

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

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
import com.tryfinch.api.core.Params
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

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
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * The frequency of the benefit deduction/contribution.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frequency(): Optional<BenefitFrequency> = body.frequency()

    /**
     * Type of benefit.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<BenefitType> = body.type()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [frequency].
     *
     * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _frequency(): JsonField<BenefitFrequency> = body._frequency()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<BenefitType> = body._type()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): HrisBenefitCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [HrisBenefitCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HrisBenefitCreateParams]. */
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
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [description]
         * - [frequency]
         * - [type]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Name of the benefit as it appears in the provider and pay statements. Recommend limiting
         * this to <30 characters due to limitations in specific providers (e.g. Justworks).
         */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** The frequency of the benefit deduction/contribution. */
        fun frequency(frequency: BenefitFrequency?) = apply { body.frequency(frequency) }

        /** Alias for calling [Builder.frequency] with `frequency.orElse(null)`. */
        fun frequency(frequency: Optional<BenefitFrequency>) = frequency(frequency.getOrNull())

        /**
         * Sets [Builder.frequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequency] with a well-typed [BenefitFrequency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frequency(frequency: JsonField<BenefitFrequency>) = apply { body.frequency(frequency) }

        /** Type of benefit. */
        fun type(type: BenefitType?) = apply { body.type(type) }

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<BenefitType>) = type(type.getOrNull())

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [BenefitType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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

        /**
         * Returns an immutable instance of [HrisBenefitCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): HrisBenefitCreateParams =
            HrisBenefitCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val description: JsonField<String>,
        private val frequency: JsonField<BenefitFrequency>,
        private val type: JsonField<BenefitType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("frequency")
            @ExcludeMissing
            frequency: JsonField<BenefitFrequency> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<BenefitType> = JsonMissing.of(),
        ) : this(description, frequency, type, mutableMapOf())

        /**
         * Name of the benefit as it appears in the provider and pay statements. Recommend limiting
         * this to <30 characters due to limitations in specific providers (e.g. Justworks).
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The frequency of the benefit deduction/contribution.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun frequency(): Optional<BenefitFrequency> = frequency.getOptional("frequency")

        /**
         * Type of benefit.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<BenefitType> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [frequency].
         *
         * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("frequency")
        @ExcludeMissing
        fun _frequency(): JsonField<BenefitFrequency> = frequency

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<BenefitType> = type

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
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
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The frequency of the benefit deduction/contribution. */
            fun frequency(frequency: BenefitFrequency?) = frequency(JsonField.ofNullable(frequency))

            /** Alias for calling [Builder.frequency] with `frequency.orElse(null)`. */
            fun frequency(frequency: Optional<BenefitFrequency>) = frequency(frequency.getOrNull())

            /**
             * Sets [Builder.frequency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frequency] with a well-typed [BenefitFrequency]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun frequency(frequency: JsonField<BenefitFrequency>) = apply {
                this.frequency = frequency
            }

            /** Type of benefit. */
            fun type(type: BenefitType?) = type(JsonField.ofNullable(type))

            /** Alias for calling [Builder.type] with `type.orElse(null)`. */
            fun type(type: Optional<BenefitType>) = type(type.getOrNull())

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [BenefitType] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(description, frequency, type, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            description()
            frequency().ifPresent { it.validate() }
            type().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: FinchInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (description.asKnown().isPresent) 1 else 0) +
                (frequency.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

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

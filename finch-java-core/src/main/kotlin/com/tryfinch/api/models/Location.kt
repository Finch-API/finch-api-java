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
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Location
private constructor(
    private val city: JsonField<String>,
    private val country: JsonField<String>,
    private val line1: JsonField<String>,
    private val line2: JsonField<String>,
    private val name: JsonField<String>,
    private val postalCode: JsonField<String>,
    private val sourceId: JsonField<String>,
    private val state: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_id") @ExcludeMissing sourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
    ) : this(city, country, line1, line2, name, postalCode, sourceId, state, mutableMapOf())

    /**
     * City, district, suburb, town, or village.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun city(): Optional<String> = city.getOptional("city")

    /**
     * The 2-letter ISO 3166 country code.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun country(): Optional<String> = country.getOptional("country")

    /**
     * Street address or PO box.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun line1(): Optional<String> = line1.getOptional("line1")

    /**
     * Apartment, suite, unit, or building.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun line2(): Optional<String> = line2.getOptional("line2")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The postal code or zip code.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun postalCode(): Optional<String> = postalCode.getOptional("postal_code")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceId(): Optional<String> = sourceId.getOptional("source_id")

    /**
     * The state code.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<String> = state.getOptional("state")

    /**
     * Returns the raw JSON value of [city].
     *
     * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [line1].
     *
     * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

    /**
     * Returns the raw JSON value of [line2].
     *
     * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [postalCode].
     *
     * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode(): JsonField<String> = postalCode

    /**
     * Returns the raw JSON value of [sourceId].
     *
     * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_id") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

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

        /** Returns a mutable builder for constructing an instance of [Location]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Location]. */
    class Builder internal constructor() {

        private var city: JsonField<String> = JsonMissing.of()
        private var country: JsonField<String> = JsonMissing.of()
        private var line1: JsonField<String> = JsonMissing.of()
        private var line2: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var postalCode: JsonField<String> = JsonMissing.of()
        private var sourceId: JsonField<String> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(location: Location) = apply {
            city = location.city
            country = location.country
            line1 = location.line1
            line2 = location.line2
            name = location.name
            postalCode = location.postalCode
            sourceId = location.sourceId
            state = location.state
            additionalProperties = location.additionalProperties.toMutableMap()
        }

        /** City, district, suburb, town, or village. */
        fun city(city: String?) = city(JsonField.ofNullable(city))

        /** Alias for calling [Builder.city] with `city.orElse(null)`. */
        fun city(city: Optional<String>) = city(city.getOrNull())

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /** The 2-letter ISO 3166 country code. */
        fun country(country: String?) = country(JsonField.ofNullable(country))

        /** Alias for calling [Builder.country] with `country.orElse(null)`. */
        fun country(country: Optional<String>) = country(country.getOrNull())

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** Street address or PO box. */
        fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

        /** Alias for calling [Builder.line1] with `line1.orElse(null)`. */
        fun line1(line1: Optional<String>) = line1(line1.getOrNull())

        /**
         * Sets [Builder.line1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.line1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

        /** Apartment, suite, unit, or building. */
        fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

        /** Alias for calling [Builder.line2] with `line2.orElse(null)`. */
        fun line2(line2: Optional<String>) = line2(line2.getOrNull())

        /**
         * Sets [Builder.line2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.line2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The postal code or zip code. */
        fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

        /** Alias for calling [Builder.postalCode] with `postalCode.orElse(null)`. */
        fun postalCode(postalCode: Optional<String>) = postalCode(postalCode.getOrNull())

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        fun sourceId(sourceId: String?) = sourceId(JsonField.ofNullable(sourceId))

        /** Alias for calling [Builder.sourceId] with `sourceId.orElse(null)`. */
        fun sourceId(sourceId: Optional<String>) = sourceId(sourceId.getOrNull())

        /**
         * Sets [Builder.sourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

        /** The state code. */
        fun state(state: String?) = state(JsonField.ofNullable(state))

        /** Alias for calling [Builder.state] with `state.orElse(null)`. */
        fun state(state: Optional<String>) = state(state.getOrNull())

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

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
         * Returns an immutable instance of [Location].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Location =
            Location(
                city,
                country,
                line1,
                line2,
                name,
                postalCode,
                sourceId,
                state,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Location = apply {
        if (validated) {
            return@apply
        }

        city()
        country()
        line1()
        line2()
        name()
        postalCode()
        sourceId()
        state()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (city.asKnown().isPresent) 1 else 0) +
            (if (country.asKnown().isPresent) 1 else 0) +
            (if (line1.asKnown().isPresent) 1 else 0) +
            (if (line2.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (postalCode.asKnown().isPresent) 1 else 0) +
            (if (sourceId.asKnown().isPresent) 1 else 0) +
            (if (state.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Location && city == other.city && country == other.country && line1 == other.line1 && line2 == other.line2 && name == other.name && postalCode == other.postalCode && sourceId == other.sourceId && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(city, country, line1, line2, name, postalCode, sourceId, state, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Location{city=$city, country=$country, line1=$line1, line2=$line2, name=$name, postalCode=$postalCode, sourceId=$sourceId, state=$state, additionalProperties=$additionalProperties}"
}

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
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Location
@JsonCreator
private constructor(
    @JsonProperty("city") @ExcludeMissing private val city: JsonField<String> = JsonMissing.of(),
    @JsonProperty("country")
    @ExcludeMissing
    private val country: JsonField<String> = JsonMissing.of(),
    @JsonProperty("line1") @ExcludeMissing private val line1: JsonField<String> = JsonMissing.of(),
    @JsonProperty("line2") @ExcludeMissing private val line2: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("postal_code")
    @ExcludeMissing
    private val postalCode: JsonField<String> = JsonMissing.of(),
    @JsonProperty("source_id")
    @ExcludeMissing
    private val sourceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("state") @ExcludeMissing private val state: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** City, district, suburb, town, or village. */
    fun city(): Optional<String> = Optional.ofNullable(city.getNullable("city"))

    /** The 2-letter ISO 3166 country code. */
    fun country(): Optional<String> = Optional.ofNullable(country.getNullable("country"))

    /** Street address or PO box. */
    fun line1(): Optional<String> = Optional.ofNullable(line1.getNullable("line1"))

    /** Apartment, suite, unit, or building. */
    fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** The postal code or zip code. */
    fun postalCode(): Optional<String> = Optional.ofNullable(postalCode.getNullable("postal_code"))

    fun sourceId(): Optional<String> = Optional.ofNullable(sourceId.getNullable("source_id"))

    /** The state code. */
    fun state(): Optional<String> = Optional.ofNullable(state.getNullable("state"))

    /** City, district, suburb, town, or village. */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /** The 2-letter ISO 3166 country code. */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /** Street address or PO box. */
    @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

    /** Apartment, suite, unit, or building. */
    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** The postal code or zip code. */
    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode(): JsonField<String> = postalCode

    @JsonProperty("source_id") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

    /** The state code. */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Location = apply {
        if (!validated) {
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
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

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

        /** City, district, suburb, town, or village. */
        fun city(city: Optional<String>) = city(city.orElse(null))

        /** City, district, suburb, town, or village. */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /** The 2-letter ISO 3166 country code. */
        fun country(country: String?) = country(JsonField.ofNullable(country))

        /** The 2-letter ISO 3166 country code. */
        fun country(country: Optional<String>) = country(country.orElse(null))

        /** The 2-letter ISO 3166 country code. */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** Street address or PO box. */
        fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

        /** Street address or PO box. */
        fun line1(line1: Optional<String>) = line1(line1.orElse(null))

        /** Street address or PO box. */
        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

        /** Apartment, suite, unit, or building. */
        fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

        /** Apartment, suite, unit, or building. */
        fun line2(line2: Optional<String>) = line2(line2.orElse(null))

        /** Apartment, suite, unit, or building. */
        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

        fun name(name: String?) = name(JsonField.ofNullable(name))

        fun name(name: Optional<String>) = name(name.orElse(null))

        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The postal code or zip code. */
        fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

        /** The postal code or zip code. */
        fun postalCode(postalCode: Optional<String>) = postalCode(postalCode.orElse(null))

        /** The postal code or zip code. */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        fun sourceId(sourceId: String?) = sourceId(JsonField.ofNullable(sourceId))

        fun sourceId(sourceId: Optional<String>) = sourceId(sourceId.orElse(null))

        fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

        /** The state code. */
        fun state(state: String?) = state(JsonField.ofNullable(state))

        /** The state code. */
        fun state(state: Optional<String>) = state(state.orElse(null))

        /** The state code. */
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
                additionalProperties.toImmutable(),
            )
    }

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

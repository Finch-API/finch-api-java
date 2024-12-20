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
    @JsonProperty("line1") @ExcludeMissing private val line1: JsonField<String> = JsonMissing.of(),
    @JsonProperty("line2") @ExcludeMissing private val line2: JsonField<String> = JsonMissing.of(),
    @JsonProperty("city") @ExcludeMissing private val city: JsonField<String> = JsonMissing.of(),
    @JsonProperty("state") @ExcludeMissing private val state: JsonField<String> = JsonMissing.of(),
    @JsonProperty("postal_code")
    @ExcludeMissing
    private val postalCode: JsonField<String> = JsonMissing.of(),
    @JsonProperty("country")
    @ExcludeMissing
    private val country: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("source_id")
    @ExcludeMissing
    private val sourceId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Street address or PO box. */
    fun line1(): Optional<String> = Optional.ofNullable(line1.getNullable("line1"))

    /** Apartment, suite, unit, or building. */
    fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

    /** City, district, suburb, town, or village. */
    fun city(): Optional<String> = Optional.ofNullable(city.getNullable("city"))

    /** The state code. */
    fun state(): Optional<String> = Optional.ofNullable(state.getNullable("state"))

    /** The postal code or zip code. */
    fun postalCode(): Optional<String> = Optional.ofNullable(postalCode.getNullable("postal_code"))

    /** The 2-letter ISO 3166 country code. */
    fun country(): Optional<String> = Optional.ofNullable(country.getNullable("country"))

    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    fun sourceId(): Optional<String> = Optional.ofNullable(sourceId.getNullable("source_id"))

    /** Street address or PO box. */
    @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

    /** Apartment, suite, unit, or building. */
    @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

    /** City, district, suburb, town, or village. */
    @JsonProperty("city") @ExcludeMissing fun _city() = city

    /** The state code. */
    @JsonProperty("state") @ExcludeMissing fun _state() = state

    /** The postal code or zip code. */
    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

    /** The 2-letter ISO 3166 country code. */
    @JsonProperty("country") @ExcludeMissing fun _country() = country

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonProperty("source_id") @ExcludeMissing fun _sourceId() = sourceId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Location = apply {
        if (!validated) {
            line1()
            line2()
            city()
            state()
            postalCode()
            country()
            name()
            sourceId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var line1: JsonField<String> = JsonMissing.of()
        private var line2: JsonField<String> = JsonMissing.of()
        private var city: JsonField<String> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var postalCode: JsonField<String> = JsonMissing.of()
        private var country: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var sourceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(location: Location) = apply {
            line1 = location.line1
            line2 = location.line2
            city = location.city
            state = location.state
            postalCode = location.postalCode
            country = location.country
            name = location.name
            sourceId = location.sourceId
            additionalProperties = location.additionalProperties.toMutableMap()
        }

        /** Street address or PO box. */
        fun line1(line1: String) = line1(JsonField.of(line1))

        /** Street address or PO box. */
        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

        /** Apartment, suite, unit, or building. */
        fun line2(line2: String) = line2(JsonField.of(line2))

        /** Apartment, suite, unit, or building. */
        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

        /** City, district, suburb, town, or village. */
        fun city(city: String) = city(JsonField.of(city))

        /** City, district, suburb, town, or village. */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /** The state code. */
        fun state(state: String) = state(JsonField.of(state))

        /** The state code. */
        fun state(state: JsonField<String>) = apply { this.state = state }

        /** The postal code or zip code. */
        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

        /** The postal code or zip code. */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        /** The 2-letter ISO 3166 country code. */
        fun country(country: String) = country(JsonField.of(country))

        /** The 2-letter ISO 3166 country code. */
        fun country(country: JsonField<String>) = apply { this.country = country }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        fun sourceId(sourceId: String) = sourceId(JsonField.of(sourceId))

        fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

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
                line1,
                line2,
                city,
                state,
                postalCode,
                country,
                name,
                sourceId,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Location && line1 == other.line1 && line2 == other.line2 && city == other.city && state == other.state && postalCode == other.postalCode && country == other.country && name == other.name && sourceId == other.sourceId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(line1, line2, city, state, postalCode, country, name, sourceId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Location{line1=$line1, line2=$line2, city=$city, state=$state, postalCode=$postalCode, country=$country, name=$name, sourceId=$sourceId, additionalProperties=$additionalProperties}"
}

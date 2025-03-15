// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class DocumentResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("individual_id")
    @ExcludeMissing
    private val individualId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
    @JsonProperty("year") @ExcludeMissing private val year: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * A stable Finch id for the document.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /**
     * The ID of the individual associated with the document. This will be null for employer-level
     * documents.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun individualId(): Optional<String> =
        Optional.ofNullable(individualId.getNullable("individual_id"))

    /**
     * The type of document.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

    /**
     * A URL to access the document. Format:
     * `https://api.tryfinch.com/employer/documents/:document_id`.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = Optional.ofNullable(url.getNullable("url"))

    /**
     * The year the document applies to, if available.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun year(): Optional<Double> = Optional.ofNullable(year.getNullable("year"))

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [individualId].
     *
     * Unlike [individualId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("individual_id")
    @ExcludeMissing
    fun _individualId(): JsonField<String> = individualId

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [year].
     *
     * Unlike [year], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("year") @ExcludeMissing fun _year(): JsonField<Double> = year

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): DocumentResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        individualId()
        type()
        url()
        year()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [DocumentResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var individualId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var year: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(documentResponse: DocumentResponse) = apply {
            id = documentResponse.id
            individualId = documentResponse.individualId
            type = documentResponse.type
            url = documentResponse.url
            year = documentResponse.year
            additionalProperties = documentResponse.additionalProperties.toMutableMap()
        }

        /** A stable Finch id for the document. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The ID of the individual associated with the document. This will be null for
         * employer-level documents.
         */
        fun individualId(individualId: String?) = individualId(JsonField.ofNullable(individualId))

        /** Alias for calling [Builder.individualId] with `individualId.orElse(null)`. */
        fun individualId(individualId: Optional<String>) = individualId(individualId.getOrNull())

        /**
         * Sets [Builder.individualId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.individualId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun individualId(individualId: JsonField<String>) = apply {
            this.individualId = individualId
        }

        /** The type of document. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * A URL to access the document. Format:
         * `https://api.tryfinch.com/employer/documents/:document_id`.
         */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /** The year the document applies to, if available. */
        fun year(year: Double?) = year(JsonField.ofNullable(year))

        /**
         * Alias for [Builder.year].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun year(year: Double) = year(year as Double?)

        /** Alias for calling [Builder.year] with `year.orElse(null)`. */
        fun year(year: Optional<Double>) = year(year.getOrNull())

        /**
         * Sets [Builder.year] to an arbitrary JSON value.
         *
         * You should usually call [Builder.year] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun year(year: JsonField<Double>) = apply { this.year = year }

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

        fun build(): DocumentResponse =
            DocumentResponse(id, individualId, type, url, year, additionalProperties.toImmutable())
    }

    /** The type of document. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val W4_2020 = of("w4_2020")

            @JvmField val W4_2005 = of("w4_2005")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            W4_2020,
            W4_2005,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            W4_2020,
            W4_2005,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                W4_2020 -> Value.W4_2020
                W4_2005 -> Value.W4_2005
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws FinchInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                W4_2020 -> Known.W4_2020
                W4_2005 -> Known.W4_2005
                else -> throw FinchInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws FinchInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { FinchInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DocumentResponse && id == other.id && individualId == other.individualId && type == other.type && url == other.url && year == other.year && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, individualId, type, url, year, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DocumentResponse{id=$id, individualId=$individualId, type=$type, url=$url, year=$year, additionalProperties=$additionalProperties}"
}

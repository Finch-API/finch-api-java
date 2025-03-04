// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.Params
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

/** **Beta:** This endpoint is in beta and may change. Retrieve a list of company-wide documents. */
class HrisDocumentListParams
private constructor(
    private val individualIds: List<String>?,
    private val limit: Long?,
    private val offset: Long?,
    private val types: List<Type>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Comma-delimited list of stable Finch uuids for each individual. If empty, defaults to all
     * individuals
     */
    fun individualIds(): Optional<List<String>> = Optional.ofNullable(individualIds)

    /** Number of documents to return (defaults to all) */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Index to start from (defaults to 0) */
    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    /** Comma-delimited list of document types to filter on. If empty, defaults to all types */
    fun types(): Optional<List<Type>> = Optional.ofNullable(types)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.individualIds?.let { queryParams.put("individual_ids[]", it.map(Any::toString)) }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.offset?.let { queryParams.put("offset", listOf(it.toString())) }
        this.types?.let { queryParams.put("types[]", it.map(Any::toString)) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): HrisDocumentListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [HrisDocumentListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HrisDocumentListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var individualIds: MutableList<String>? = null
        private var limit: Long? = null
        private var offset: Long? = null
        private var types: MutableList<Type>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(hrisDocumentListParams: HrisDocumentListParams) = apply {
            individualIds = hrisDocumentListParams.individualIds?.toMutableList()
            limit = hrisDocumentListParams.limit
            offset = hrisDocumentListParams.offset
            types = hrisDocumentListParams.types?.toMutableList()
            additionalHeaders = hrisDocumentListParams.additionalHeaders.toBuilder()
            additionalQueryParams = hrisDocumentListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Comma-delimited list of stable Finch uuids for each individual. If empty, defaults to all
         * individuals
         */
        fun individualIds(individualIds: List<String>?) = apply {
            this.individualIds = individualIds?.toMutableList()
        }

        /**
         * Comma-delimited list of stable Finch uuids for each individual. If empty, defaults to all
         * individuals
         */
        fun individualIds(individualIds: Optional<List<String>>) =
            individualIds(individualIds.orElse(null))

        /**
         * Comma-delimited list of stable Finch uuids for each individual. If empty, defaults to all
         * individuals
         */
        fun addIndividualId(individualId: String) = apply {
            individualIds = (individualIds ?: mutableListOf()).apply { add(individualId) }
        }

        /** Number of documents to return (defaults to all) */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /** Number of documents to return (defaults to all) */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Number of documents to return (defaults to all) */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun limit(limit: Optional<Long>) = limit(limit.orElse(null) as Long?)

        /** Index to start from (defaults to 0) */
        fun offset(offset: Long?) = apply { this.offset = offset }

        /** Index to start from (defaults to 0) */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Index to start from (defaults to 0) */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun offset(offset: Optional<Long>) = offset(offset.orElse(null) as Long?)

        /** Comma-delimited list of document types to filter on. If empty, defaults to all types */
        fun types(types: List<Type>?) = apply { this.types = types?.toMutableList() }

        /** Comma-delimited list of document types to filter on. If empty, defaults to all types */
        fun types(types: Optional<List<Type>>) = types(types.orElse(null))

        /** Comma-delimited list of document types to filter on. If empty, defaults to all types */
        fun addType(type: Type) = apply { types = (types ?: mutableListOf()).apply { add(type) } }

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

        fun build(): HrisDocumentListParams =
            HrisDocumentListParams(
                individualIds?.toImmutable(),
                limit,
                offset,
                types?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

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

        return /* spotless:off */ other is HrisDocumentListParams && individualIds == other.individualIds && limit == other.limit && offset == other.offset && types == other.types && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(individualIds, limit, offset, types, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "HrisDocumentListParams{individualIds=$individualIds, limit=$limit, offset=$offset, types=$types, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

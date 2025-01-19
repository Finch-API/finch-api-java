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
class Paging
@JsonCreator
private constructor(
    @JsonProperty("count") @ExcludeMissing private val count: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("offset") @ExcludeMissing private val offset: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The total number of elements for the entire query (not just the given page) */
    fun count(): Optional<Long> = Optional.ofNullable(count.getNullable("count"))

    /** The current start index of the returned list of elements */
    fun offset(): Optional<Long> = Optional.ofNullable(offset.getNullable("offset"))

    /** The total number of elements for the entire query (not just the given page) */
    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

    /** The current start index of the returned list of elements */
    @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Paging = apply {
        if (validated) {
            return@apply
        }

        count()
        offset()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var count: JsonField<Long> = JsonMissing.of()
        private var offset: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paging: Paging) = apply {
            count = paging.count
            offset = paging.offset
            additionalProperties = paging.additionalProperties.toMutableMap()
        }

        /** The total number of elements for the entire query (not just the given page) */
        fun count(count: Long) = count(JsonField.of(count))

        /** The total number of elements for the entire query (not just the given page) */
        fun count(count: JsonField<Long>) = apply { this.count = count }

        /** The current start index of the returned list of elements */
        fun offset(offset: Long) = offset(JsonField.of(offset))

        /** The current start index of the returned list of elements */
        fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

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

        fun build(): Paging =
            Paging(
                count,
                offset,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Paging && count == other.count && offset == other.offset && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(count, offset, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Paging{count=$count, offset=$offset, additionalProperties=$additionalProperties}"
}

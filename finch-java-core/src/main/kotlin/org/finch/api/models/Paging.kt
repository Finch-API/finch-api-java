package org.finch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional
import org.finch.api.core.ExcludeMissing
import org.finch.api.core.JsonField
import org.finch.api.core.JsonMissing
import org.finch.api.core.JsonValue
import org.finch.api.core.NoAutoDetect
import org.finch.api.core.toUnmodifiable

@JsonDeserialize(builder = Paging.Builder::class)
@NoAutoDetect
class Paging
private constructor(
    private val count: JsonField<Long>,
    private val offset: JsonField<Long>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The total number of elements for the entire query (not just the given page) */
    fun count(): Optional<Long> = Optional.ofNullable(count.getNullable("count"))

    /** The current start index of the returned list of elements */
    fun offset(): Optional<Long> = Optional.ofNullable(offset.getNullable("offset"))

    /** The total number of elements for the entire query (not just the given page) */
    @JsonProperty("count") @ExcludeMissing fun _count() = count

    /** The current start index of the returned list of elements */
    @JsonProperty("offset") @ExcludeMissing fun _offset() = offset

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            count()
            offset()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Paging &&
            this.count == other.count &&
            this.offset == other.offset &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    count,
                    offset,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Paging{count=$count, offset=$offset, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var count: JsonField<Long> = JsonMissing.of()
        private var offset: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paging: Paging) = apply {
            this.count = paging.count
            this.offset = paging.offset
            additionalProperties(paging.additionalProperties)
        }

        /** The total number of elements for the entire query (not just the given page) */
        fun count(count: Long) = count(JsonField.of(count))

        /** The total number of elements for the entire query (not just the given page) */
        @JsonProperty("count")
        @ExcludeMissing
        fun count(count: JsonField<Long>) = apply { this.count = count }

        /** The current start index of the returned list of elements */
        fun offset(offset: Long) = offset(JsonField.of(offset))

        /** The current start index of the returned list of elements */
        @JsonProperty("offset")
        @ExcludeMissing
        fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

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

        fun build(): Paging =
            Paging(
                count,
                offset,
                additionalProperties.toUnmodifiable(),
            )
    }
}

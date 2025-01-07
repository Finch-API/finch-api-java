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

@NoAutoDetect
class DocumentListResponse
@JsonCreator
private constructor(
    @JsonProperty("documents")
    @ExcludeMissing
    private val documents: JsonField<List<DocumentResponse>> = JsonMissing.of(),
    @JsonProperty("paging")
    @ExcludeMissing
    private val paging: JsonField<Paging> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun documents(): List<DocumentResponse> = documents.getRequired("documents")

    fun paging(): Paging = paging.getRequired("paging")

    @JsonProperty("documents") @ExcludeMissing fun _documents() = documents

    @JsonProperty("paging") @ExcludeMissing fun _paging() = paging

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): DocumentListResponse = apply {
        if (!validated) {
            documents().forEach { it.validate() }
            paging().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var documents: JsonField<List<DocumentResponse>> = JsonMissing.of()
        private var paging: JsonField<Paging> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(documentListResponse: DocumentListResponse) = apply {
            documents = documentListResponse.documents
            paging = documentListResponse.paging
            additionalProperties = documentListResponse.additionalProperties.toMutableMap()
        }

        fun documents(documents: List<DocumentResponse>) = documents(JsonField.of(documents))

        fun documents(documents: JsonField<List<DocumentResponse>>) = apply {
            this.documents = documents
        }

        fun paging(paging: Paging) = paging(JsonField.of(paging))

        fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

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

        fun build(): DocumentListResponse =
            DocumentListResponse(
                documents.map { it.toImmutable() },
                paging,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DocumentListResponse && documents == other.documents && paging == other.paging && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(documents, paging, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DocumentListResponse{documents=$documents, paging=$paging, additionalProperties=$additionalProperties}"
}
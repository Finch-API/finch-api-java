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
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
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

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documents(): List<DocumentResponse> = documents.getRequired("documents")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paging(): Paging = paging.getRequired("paging")

    /**
     * Returns the raw JSON value of [documents].
     *
     * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documents")
    @ExcludeMissing
    fun _documents(): JsonField<List<DocumentResponse>> = documents

    /**
     * Returns the raw JSON value of [paging].
     *
     * Unlike [paging], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("paging") @ExcludeMissing fun _paging(): JsonField<Paging> = paging

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): DocumentListResponse = apply {
        if (validated) {
            return@apply
        }

        documents().forEach { it.validate() }
        paging().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DocumentListResponse].
         *
         * The following fields are required:
         * ```java
         * .documents()
         * .paging()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentListResponse]. */
    class Builder internal constructor() {

        private var documents: JsonField<MutableList<DocumentResponse>>? = null
        private var paging: JsonField<Paging>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(documentListResponse: DocumentListResponse) = apply {
            documents = documentListResponse.documents.map { it.toMutableList() }
            paging = documentListResponse.paging
            additionalProperties = documentListResponse.additionalProperties.toMutableMap()
        }

        fun documents(documents: List<DocumentResponse>) = documents(JsonField.of(documents))

        /**
         * Sets [Builder.documents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documents] with a well-typed `List<DocumentResponse>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun documents(documents: JsonField<List<DocumentResponse>>) = apply {
            this.documents = documents.map { it.toMutableList() }
        }

        /**
         * Adds a single [DocumentResponse] to [documents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDocument(document: DocumentResponse) = apply {
            documents =
                (documents ?: JsonField.of(mutableListOf())).also {
                    checkKnown("documents", it).add(document)
                }
        }

        fun paging(paging: Paging) = paging(JsonField.of(paging))

        /**
         * Sets [Builder.paging] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paging] with a well-typed [Paging] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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
                checkRequired("documents", documents).map { it.toImmutable() },
                checkRequired("paging", paging),
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

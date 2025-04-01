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

class OperationSupportMatrix
private constructor(
    private val create: JsonField<OperationSupport>,
    private val delete: JsonField<OperationSupport>,
    private val read: JsonField<OperationSupport>,
    private val update: JsonField<OperationSupport>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("create")
        @ExcludeMissing
        create: JsonField<OperationSupport> = JsonMissing.of(),
        @JsonProperty("delete")
        @ExcludeMissing
        delete: JsonField<OperationSupport> = JsonMissing.of(),
        @JsonProperty("read") @ExcludeMissing read: JsonField<OperationSupport> = JsonMissing.of(),
        @JsonProperty("update")
        @ExcludeMissing
        update: JsonField<OperationSupport> = JsonMissing.of(),
    ) : this(create, delete, read, update, mutableMapOf())

    /**
     * - `supported`: This operation is supported by both the provider and Finch
     * - `not_supported_by_finch`: This operation is not supported by Finch but supported by the
     *   provider
     * - `not_supported_by_provider`: This operation is not supported by the provider, so Finch
     *   cannot support
     * - `client_access_only`: This behavior is supported by the provider, but only available to the
     *   client and not to Finch
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun create(): Optional<OperationSupport> = Optional.ofNullable(create.getNullable("create"))

    /**
     * - `supported`: This operation is supported by both the provider and Finch
     * - `not_supported_by_finch`: This operation is not supported by Finch but supported by the
     *   provider
     * - `not_supported_by_provider`: This operation is not supported by the provider, so Finch
     *   cannot support
     * - `client_access_only`: This behavior is supported by the provider, but only available to the
     *   client and not to Finch
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun delete(): Optional<OperationSupport> = Optional.ofNullable(delete.getNullable("delete"))

    /**
     * - `supported`: This operation is supported by both the provider and Finch
     * - `not_supported_by_finch`: This operation is not supported by Finch but supported by the
     *   provider
     * - `not_supported_by_provider`: This operation is not supported by the provider, so Finch
     *   cannot support
     * - `client_access_only`: This behavior is supported by the provider, but only available to the
     *   client and not to Finch
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun read(): Optional<OperationSupport> = Optional.ofNullable(read.getNullable("read"))

    /**
     * - `supported`: This operation is supported by both the provider and Finch
     * - `not_supported_by_finch`: This operation is not supported by Finch but supported by the
     *   provider
     * - `not_supported_by_provider`: This operation is not supported by the provider, so Finch
     *   cannot support
     * - `client_access_only`: This behavior is supported by the provider, but only available to the
     *   client and not to Finch
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun update(): Optional<OperationSupport> = Optional.ofNullable(update.getNullable("update"))

    /**
     * Returns the raw JSON value of [create].
     *
     * Unlike [create], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("create") @ExcludeMissing fun _create(): JsonField<OperationSupport> = create

    /**
     * Returns the raw JSON value of [delete].
     *
     * Unlike [delete], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("delete") @ExcludeMissing fun _delete(): JsonField<OperationSupport> = delete

    /**
     * Returns the raw JSON value of [read].
     *
     * Unlike [read], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("read") @ExcludeMissing fun _read(): JsonField<OperationSupport> = read

    /**
     * Returns the raw JSON value of [update].
     *
     * Unlike [update], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("update") @ExcludeMissing fun _update(): JsonField<OperationSupport> = update

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

        /** Returns a mutable builder for constructing an instance of [OperationSupportMatrix]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OperationSupportMatrix]. */
    class Builder internal constructor() {

        private var create: JsonField<OperationSupport> = JsonMissing.of()
        private var delete: JsonField<OperationSupport> = JsonMissing.of()
        private var read: JsonField<OperationSupport> = JsonMissing.of()
        private var update: JsonField<OperationSupport> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(operationSupportMatrix: OperationSupportMatrix) = apply {
            create = operationSupportMatrix.create
            delete = operationSupportMatrix.delete
            read = operationSupportMatrix.read
            update = operationSupportMatrix.update
            additionalProperties = operationSupportMatrix.additionalProperties.toMutableMap()
        }

        /**
         * - `supported`: This operation is supported by both the provider and Finch
         * - `not_supported_by_finch`: This operation is not supported by Finch but supported by the
         *   provider
         * - `not_supported_by_provider`: This operation is not supported by the provider, so Finch
         *   cannot support
         * - `client_access_only`: This behavior is supported by the provider, but only available to
         *   the client and not to Finch
         */
        fun create(create: OperationSupport) = create(JsonField.of(create))

        /**
         * Sets [Builder.create] to an arbitrary JSON value.
         *
         * You should usually call [Builder.create] with a well-typed [OperationSupport] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun create(create: JsonField<OperationSupport>) = apply { this.create = create }

        /**
         * - `supported`: This operation is supported by both the provider and Finch
         * - `not_supported_by_finch`: This operation is not supported by Finch but supported by the
         *   provider
         * - `not_supported_by_provider`: This operation is not supported by the provider, so Finch
         *   cannot support
         * - `client_access_only`: This behavior is supported by the provider, but only available to
         *   the client and not to Finch
         */
        fun delete(delete: OperationSupport) = delete(JsonField.of(delete))

        /**
         * Sets [Builder.delete] to an arbitrary JSON value.
         *
         * You should usually call [Builder.delete] with a well-typed [OperationSupport] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun delete(delete: JsonField<OperationSupport>) = apply { this.delete = delete }

        /**
         * - `supported`: This operation is supported by both the provider and Finch
         * - `not_supported_by_finch`: This operation is not supported by Finch but supported by the
         *   provider
         * - `not_supported_by_provider`: This operation is not supported by the provider, so Finch
         *   cannot support
         * - `client_access_only`: This behavior is supported by the provider, but only available to
         *   the client and not to Finch
         */
        fun read(read: OperationSupport) = read(JsonField.of(read))

        /**
         * Sets [Builder.read] to an arbitrary JSON value.
         *
         * You should usually call [Builder.read] with a well-typed [OperationSupport] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun read(read: JsonField<OperationSupport>) = apply { this.read = read }

        /**
         * - `supported`: This operation is supported by both the provider and Finch
         * - `not_supported_by_finch`: This operation is not supported by Finch but supported by the
         *   provider
         * - `not_supported_by_provider`: This operation is not supported by the provider, so Finch
         *   cannot support
         * - `client_access_only`: This behavior is supported by the provider, but only available to
         *   the client and not to Finch
         */
        fun update(update: OperationSupport) = update(JsonField.of(update))

        /**
         * Sets [Builder.update] to an arbitrary JSON value.
         *
         * You should usually call [Builder.update] with a well-typed [OperationSupport] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun update(update: JsonField<OperationSupport>) = apply { this.update = update }

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
         * Returns an immutable instance of [OperationSupportMatrix].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OperationSupportMatrix =
            OperationSupportMatrix(
                create,
                delete,
                read,
                update,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OperationSupportMatrix = apply {
        if (validated) {
            return@apply
        }

        create().ifPresent { it.validate() }
        delete().ifPresent { it.validate() }
        read().ifPresent { it.validate() }
        update().ifPresent { it.validate() }
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
        (create.asKnown().getOrNull()?.validity() ?: 0) +
            (delete.asKnown().getOrNull()?.validity() ?: 0) +
            (read.asKnown().getOrNull()?.validity() ?: 0) +
            (update.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OperationSupportMatrix && create == other.create && delete == other.delete && read == other.read && update == other.update && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(create, delete, read, update, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OperationSupportMatrix{create=$create, delete=$delete, read=$read, update=$update, additionalProperties=$additionalProperties}"
}

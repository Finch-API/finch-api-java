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
class OperationSupportMatrix
@JsonCreator
private constructor(
    @JsonProperty("create")
    @ExcludeMissing
    private val create: JsonField<OperationSupport> = JsonMissing.of(),
    @JsonProperty("delete")
    @ExcludeMissing
    private val delete: JsonField<OperationSupport> = JsonMissing.of(),
    @JsonProperty("read")
    @ExcludeMissing
    private val read: JsonField<OperationSupport> = JsonMissing.of(),
    @JsonProperty("update")
    @ExcludeMissing
    private val update: JsonField<OperationSupport> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * - `supported`: This operation is supported by both the provider and Finch
     * - `not_supported_by_finch`: This operation is not supported by Finch but supported by the
     *   provider
     * - `not_supported_by_provider`: This operation is not supported by the provider, so Finch
     *   cannot support
     * - `client_access_only`: This behavior is supported by the provider, but only available to the
     *   client and not to Finch
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
     */
    fun update(): Optional<OperationSupport> = Optional.ofNullable(update.getNullable("update"))

    /**
     * - `supported`: This operation is supported by both the provider and Finch
     * - `not_supported_by_finch`: This operation is not supported by Finch but supported by the
     *   provider
     * - `not_supported_by_provider`: This operation is not supported by the provider, so Finch
     *   cannot support
     * - `client_access_only`: This behavior is supported by the provider, but only available to the
     *   client and not to Finch
     */
    @JsonProperty("create") @ExcludeMissing fun _create() = create

    /**
     * - `supported`: This operation is supported by both the provider and Finch
     * - `not_supported_by_finch`: This operation is not supported by Finch but supported by the
     *   provider
     * - `not_supported_by_provider`: This operation is not supported by the provider, so Finch
     *   cannot support
     * - `client_access_only`: This behavior is supported by the provider, but only available to the
     *   client and not to Finch
     */
    @JsonProperty("delete") @ExcludeMissing fun _delete() = delete

    /**
     * - `supported`: This operation is supported by both the provider and Finch
     * - `not_supported_by_finch`: This operation is not supported by Finch but supported by the
     *   provider
     * - `not_supported_by_provider`: This operation is not supported by the provider, so Finch
     *   cannot support
     * - `client_access_only`: This behavior is supported by the provider, but only available to the
     *   client and not to Finch
     */
    @JsonProperty("read") @ExcludeMissing fun _read() = read

    /**
     * - `supported`: This operation is supported by both the provider and Finch
     * - `not_supported_by_finch`: This operation is not supported by Finch but supported by the
     *   provider
     * - `not_supported_by_provider`: This operation is not supported by the provider, so Finch
     *   cannot support
     * - `client_access_only`: This behavior is supported by the provider, but only available to the
     *   client and not to Finch
     */
    @JsonProperty("update") @ExcludeMissing fun _update() = update

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): OperationSupportMatrix = apply {
        if (!validated) {
            create()
            delete()
            read()
            update()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

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
         * - `supported`: This operation is supported by both the provider and Finch
         * - `not_supported_by_finch`: This operation is not supported by Finch but supported by the
         *   provider
         * - `not_supported_by_provider`: This operation is not supported by the provider, so Finch
         *   cannot support
         * - `client_access_only`: This behavior is supported by the provider, but only available to
         *   the client and not to Finch
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
         * - `supported`: This operation is supported by both the provider and Finch
         * - `not_supported_by_finch`: This operation is not supported by Finch but supported by the
         *   provider
         * - `not_supported_by_provider`: This operation is not supported by the provider, so Finch
         *   cannot support
         * - `client_access_only`: This behavior is supported by the provider, but only available to
         *   the client and not to Finch
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
         * - `supported`: This operation is supported by both the provider and Finch
         * - `not_supported_by_finch`: This operation is not supported by Finch but supported by the
         *   provider
         * - `not_supported_by_provider`: This operation is not supported by the provider, so Finch
         *   cannot support
         * - `client_access_only`: This behavior is supported by the provider, but only available to
         *   the client and not to Finch
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
         * - `supported`: This operation is supported by both the provider and Finch
         * - `not_supported_by_finch`: This operation is not supported by Finch but supported by the
         *   provider
         * - `not_supported_by_provider`: This operation is not supported by the provider, so Finch
         *   cannot support
         * - `client_access_only`: This behavior is supported by the provider, but only available to
         *   the client and not to Finch
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

        fun build(): OperationSupportMatrix =
            OperationSupportMatrix(
                create,
                delete,
                read,
                update,
                additionalProperties.toImmutable(),
            )
    }

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

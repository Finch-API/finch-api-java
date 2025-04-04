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
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RuleDeleteResponse
private constructor(
    private val id: JsonField<String>,
    private val attributes: JsonField<Attributes>,
    private val conditions: JsonField<List<Condition>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val deletedAt: JsonField<OffsetDateTime>,
    private val effectiveEndDate: JsonField<String>,
    private val effectiveStartDate: JsonField<String>,
    private val entityType: JsonField<EntityType>,
    private val priority: JsonField<Long>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attributes")
        @ExcludeMissing
        attributes: JsonField<Attributes> = JsonMissing.of(),
        @JsonProperty("conditions")
        @ExcludeMissing
        conditions: JsonField<List<Condition>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("deleted_at")
        @ExcludeMissing
        deletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("effective_end_date")
        @ExcludeMissing
        effectiveEndDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_start_date")
        @ExcludeMissing
        effectiveStartDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entity_type")
        @ExcludeMissing
        entityType: JsonField<EntityType> = JsonMissing.of(),
        @JsonProperty("priority") @ExcludeMissing priority: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        attributes,
        conditions,
        createdAt,
        deletedAt,
        effectiveEndDate,
        effectiveStartDate,
        entityType,
        priority,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Finch id (uuidv4) for the rule.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Specifies the fields to be applied when the condition is met.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attributes(): Optional<Attributes> = attributes.getOptional("attributes")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conditions(): Optional<List<Condition>> = conditions.getOptional("conditions")

    /**
     * The datetime when the rule was created.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * The datetime when the rule was deleted.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deletedAt(): Optional<OffsetDateTime> = deletedAt.getOptional("deleted_at")

    /**
     * Specifies when the rules should stop applying rules based on the date.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun effectiveEndDate(): Optional<String> = effectiveEndDate.getOptional("effective_end_date")

    /**
     * Specifies when the rule should begin applying based on the date.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun effectiveStartDate(): Optional<String> =
        effectiveStartDate.getOptional("effective_start_date")

    /**
     * The entity type to which the rule is applied.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entityType(): Optional<EntityType> = entityType.getOptional("entity_type")

    /**
     * The priority of the rule.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priority(): Optional<Long> = priority.getOptional("priority")

    /**
     * The datetime when the rule was last updated.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [attributes].
     *
     * Unlike [attributes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attributes")
    @ExcludeMissing
    fun _attributes(): JsonField<Attributes> = attributes

    /**
     * Returns the raw JSON value of [conditions].
     *
     * Unlike [conditions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conditions")
    @ExcludeMissing
    fun _conditions(): JsonField<List<Condition>> = conditions

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [deletedAt].
     *
     * Unlike [deletedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deleted_at")
    @ExcludeMissing
    fun _deletedAt(): JsonField<OffsetDateTime> = deletedAt

    /**
     * Returns the raw JSON value of [effectiveEndDate].
     *
     * Unlike [effectiveEndDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("effective_end_date")
    @ExcludeMissing
    fun _effectiveEndDate(): JsonField<String> = effectiveEndDate

    /**
     * Returns the raw JSON value of [effectiveStartDate].
     *
     * Unlike [effectiveStartDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("effective_start_date")
    @ExcludeMissing
    fun _effectiveStartDate(): JsonField<String> = effectiveStartDate

    /**
     * Returns the raw JSON value of [entityType].
     *
     * Unlike [entityType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entity_type")
    @ExcludeMissing
    fun _entityType(): JsonField<EntityType> = entityType

    /**
     * Returns the raw JSON value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Long> = priority

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [RuleDeleteResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RuleDeleteResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var attributes: JsonField<Attributes> = JsonMissing.of()
        private var conditions: JsonField<MutableList<Condition>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var effectiveEndDate: JsonField<String> = JsonMissing.of()
        private var effectiveStartDate: JsonField<String> = JsonMissing.of()
        private var entityType: JsonField<EntityType> = JsonMissing.of()
        private var priority: JsonField<Long> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ruleDeleteResponse: RuleDeleteResponse) = apply {
            id = ruleDeleteResponse.id
            attributes = ruleDeleteResponse.attributes
            conditions = ruleDeleteResponse.conditions.map { it.toMutableList() }
            createdAt = ruleDeleteResponse.createdAt
            deletedAt = ruleDeleteResponse.deletedAt
            effectiveEndDate = ruleDeleteResponse.effectiveEndDate
            effectiveStartDate = ruleDeleteResponse.effectiveStartDate
            entityType = ruleDeleteResponse.entityType
            priority = ruleDeleteResponse.priority
            updatedAt = ruleDeleteResponse.updatedAt
            additionalProperties = ruleDeleteResponse.additionalProperties.toMutableMap()
        }

        /** Finch id (uuidv4) for the rule. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Specifies the fields to be applied when the condition is met. */
        fun attributes(attributes: Attributes) = attributes(JsonField.of(attributes))

        /**
         * Sets [Builder.attributes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attributes] with a well-typed [Attributes] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attributes(attributes: JsonField<Attributes>) = apply { this.attributes = attributes }

        fun conditions(conditions: List<Condition>) = conditions(JsonField.of(conditions))

        /**
         * Sets [Builder.conditions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conditions] with a well-typed `List<Condition>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conditions(conditions: JsonField<List<Condition>>) = apply {
            this.conditions = conditions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Condition] to [conditions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCondition(condition: Condition) = apply {
            conditions =
                (conditions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("conditions", it).add(condition)
                }
        }

        /** The datetime when the rule was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The datetime when the rule was deleted. */
        fun deletedAt(deletedAt: OffsetDateTime) = deletedAt(JsonField.of(deletedAt))

        /**
         * Sets [Builder.deletedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deletedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply { this.deletedAt = deletedAt }

        /** Specifies when the rules should stop applying rules based on the date. */
        fun effectiveEndDate(effectiveEndDate: String?) =
            effectiveEndDate(JsonField.ofNullable(effectiveEndDate))

        /** Alias for calling [Builder.effectiveEndDate] with `effectiveEndDate.orElse(null)`. */
        fun effectiveEndDate(effectiveEndDate: Optional<String>) =
            effectiveEndDate(effectiveEndDate.getOrNull())

        /**
         * Sets [Builder.effectiveEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveEndDate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveEndDate(effectiveEndDate: JsonField<String>) = apply {
            this.effectiveEndDate = effectiveEndDate
        }

        /** Specifies when the rule should begin applying based on the date. */
        fun effectiveStartDate(effectiveStartDate: String?) =
            effectiveStartDate(JsonField.ofNullable(effectiveStartDate))

        /**
         * Alias for calling [Builder.effectiveStartDate] with `effectiveStartDate.orElse(null)`.
         */
        fun effectiveStartDate(effectiveStartDate: Optional<String>) =
            effectiveStartDate(effectiveStartDate.getOrNull())

        /**
         * Sets [Builder.effectiveStartDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveStartDate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveStartDate(effectiveStartDate: JsonField<String>) = apply {
            this.effectiveStartDate = effectiveStartDate
        }

        /** The entity type to which the rule is applied. */
        fun entityType(entityType: EntityType) = entityType(JsonField.of(entityType))

        /**
         * Sets [Builder.entityType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityType] with a well-typed [EntityType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entityType(entityType: JsonField<EntityType>) = apply { this.entityType = entityType }

        /** The priority of the rule. */
        fun priority(priority: Long) = priority(JsonField.of(priority))

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun priority(priority: JsonField<Long>) = apply { this.priority = priority }

        /** The datetime when the rule was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [RuleDeleteResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RuleDeleteResponse =
            RuleDeleteResponse(
                id,
                attributes,
                (conditions ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                deletedAt,
                effectiveEndDate,
                effectiveStartDate,
                entityType,
                priority,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RuleDeleteResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        attributes().ifPresent { it.validate() }
        conditions().ifPresent { it.forEach { it.validate() } }
        createdAt()
        deletedAt()
        effectiveEndDate()
        effectiveStartDate()
        entityType().ifPresent { it.validate() }
        priority()
        updatedAt()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (attributes.asKnown().getOrNull()?.validity() ?: 0) +
            (conditions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (deletedAt.asKnown().isPresent) 1 else 0) +
            (if (effectiveEndDate.asKnown().isPresent) 1 else 0) +
            (if (effectiveStartDate.asKnown().isPresent) 1 else 0) +
            (entityType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (priority.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** Specifies the fields to be applied when the condition is met. */
    class Attributes
    private constructor(
        private val metadata: JsonField<Metadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of()
        ) : this(metadata, mutableMapOf())

        /**
         * The metadata to be attached in the entity. It is a key-value pairs where the values can
         * be of any type (string, number, boolean, object, array, etc.).
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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

            /** Returns a mutable builder for constructing an instance of [Attributes]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Attributes]. */
        class Builder internal constructor() {

            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(attributes: Attributes) = apply {
                metadata = attributes.metadata
                additionalProperties = attributes.additionalProperties.toMutableMap()
            }

            /**
             * The metadata to be attached in the entity. It is a key-value pairs where the values
             * can be of any type (string, number, boolean, object, array, etc.).
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
             * Returns an immutable instance of [Attributes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Attributes = Attributes(metadata, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Attributes = apply {
            if (validated) {
                return@apply
            }

            metadata().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int = (metadata.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * The metadata to be attached in the entity. It is a key-value pairs where the values can
         * be of any type (string, number, boolean, object, array, etc.).
         */
        class Metadata
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Metadata]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Metadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Attributes && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attributes{metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    class Condition
    private constructor(
        private val field: JsonField<String>,
        private val operator: JsonField<Operator>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("field") @ExcludeMissing field: JsonField<String> = JsonMissing.of(),
            @JsonProperty("operator")
            @ExcludeMissing
            operator: JsonField<Operator> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(field, operator, value, mutableMapOf())

        /**
         * The field to be checked in the rule.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun field(): Optional<String> = field.getOptional("field")

        /**
         * The operator to be used in the rule.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun operator(): Optional<Operator> = operator.getOptional("operator")

        /**
         * The value of the field to be checked in the rule.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun value(): Optional<String> = value.getOptional("value")

        /**
         * Returns the raw JSON value of [field].
         *
         * Unlike [field], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<String> = field

        /**
         * Returns the raw JSON value of [operator].
         *
         * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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

            /** Returns a mutable builder for constructing an instance of [Condition]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Condition]. */
        class Builder internal constructor() {

            private var field: JsonField<String> = JsonMissing.of()
            private var operator: JsonField<Operator> = JsonMissing.of()
            private var value: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(condition: Condition) = apply {
                field = condition.field
                operator = condition.operator
                value = condition.value
                additionalProperties = condition.additionalProperties.toMutableMap()
            }

            /** The field to be checked in the rule. */
            fun field(field: String) = field(JsonField.of(field))

            /**
             * Sets [Builder.field] to an arbitrary JSON value.
             *
             * You should usually call [Builder.field] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun field(field: JsonField<String>) = apply { this.field = field }

            /** The operator to be used in the rule. */
            fun operator(operator: Operator) = operator(JsonField.of(operator))

            /**
             * Sets [Builder.operator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operator] with a well-typed [Operator] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

            /** The value of the field to be checked in the rule. */
            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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
             * Returns an immutable instance of [Condition].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Condition =
                Condition(field, operator, value, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Condition = apply {
            if (validated) {
                return@apply
            }

            field()
            operator().ifPresent { it.validate() }
            value()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (field.asKnown().isPresent) 1 else 0) +
                (operator.asKnown().getOrNull()?.validity() ?: 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        /** The operator to be used in the rule. */
        class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val EQUALS = of("equals")

                @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
            }

            /** An enum containing [Operator]'s known values. */
            enum class Known {
                EQUALS
            }

            /**
             * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Operator] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EQUALS,
                /**
                 * An enum member indicating that [Operator] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    EQUALS -> Value.EQUALS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws FinchInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    EQUALS -> Known.EQUALS
                    else -> throw FinchInvalidDataException("Unknown Operator: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws FinchInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    FinchInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Operator = apply {
                if (validated) {
                    return@apply
                }

                known()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Operator && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Condition && field == other.field && operator == other.operator && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(field, operator, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Condition{field=$field, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
    }

    /** The entity type to which the rule is applied. */
    class EntityType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PAY_STATEMENT_ITEM = of("pay_statement_item")

            @JvmStatic fun of(value: String) = EntityType(JsonField.of(value))
        }

        /** An enum containing [EntityType]'s known values. */
        enum class Known {
            PAY_STATEMENT_ITEM
        }

        /**
         * An enum containing [EntityType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EntityType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PAY_STATEMENT_ITEM,
            /**
             * An enum member indicating that [EntityType] was instantiated with an unknown value.
             */
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
                PAY_STATEMENT_ITEM -> Value.PAY_STATEMENT_ITEM
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
                PAY_STATEMENT_ITEM -> Known.PAY_STATEMENT_ITEM
                else -> throw FinchInvalidDataException("Unknown EntityType: $value")
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

        private var validated: Boolean = false

        fun validate(): EntityType = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EntityType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RuleDeleteResponse && id == other.id && attributes == other.attributes && conditions == other.conditions && createdAt == other.createdAt && deletedAt == other.deletedAt && effectiveEndDate == other.effectiveEndDate && effectiveStartDate == other.effectiveStartDate && entityType == other.entityType && priority == other.priority && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, attributes, conditions, createdAt, deletedAt, effectiveEndDate, effectiveStartDate, entityType, priority, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RuleDeleteResponse{id=$id, attributes=$attributes, conditions=$conditions, createdAt=$createdAt, deletedAt=$deletedAt, effectiveEndDate=$effectiveEndDate, effectiveStartDate=$effectiveStartDate, entityType=$entityType, priority=$priority, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}

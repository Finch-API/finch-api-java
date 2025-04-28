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
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class IndividualInDirectory
private constructor(
    private val id: JsonField<String>,
    private val department: JsonField<Department>,
    private val firstName: JsonField<String>,
    private val isActive: JsonField<Boolean>,
    private val lastName: JsonField<String>,
    private val manager: JsonField<Manager>,
    private val middleName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("department")
        @ExcludeMissing
        department: JsonField<Department> = JsonMissing.of(),
        @JsonProperty("first_name") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_active") @ExcludeMissing isActive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("last_name") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("manager") @ExcludeMissing manager: JsonField<Manager> = JsonMissing.of(),
        @JsonProperty("middle_name")
        @ExcludeMissing
        middleName: JsonField<String> = JsonMissing.of(),
    ) : this(id, department, firstName, isActive, lastName, manager, middleName, mutableMapOf())

    /**
     * A stable Finch `id` (UUID v4) for an individual in the company.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The department object.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun department(): Optional<Department> = department.getOptional("department")

    /**
     * The legal first name of the individual.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("first_name")

    /**
     * `true` if the individual is an active employee or contractor at the company.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isActive(): Optional<Boolean> = isActive.getOptional("is_active")

    /**
     * The legal last name of the individual.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("last_name")

    /**
     * The manager object.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun manager(): Optional<Manager> = manager.getOptional("manager")

    /**
     * The legal middle name of the individual.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun middleName(): Optional<String> = middleName.getOptional("middle_name")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [department].
     *
     * Unlike [department], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("department")
    @ExcludeMissing
    fun _department(): JsonField<Department> = department

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_active") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * Returns the raw JSON value of [manager].
     *
     * Unlike [manager], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("manager") @ExcludeMissing fun _manager(): JsonField<Manager> = manager

    /**
     * Returns the raw JSON value of [middleName].
     *
     * Unlike [middleName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("middle_name") @ExcludeMissing fun _middleName(): JsonField<String> = middleName

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

        /**
         * Returns a mutable builder for constructing an instance of [IndividualInDirectory].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .department()
         * .firstName()
         * .isActive()
         * .lastName()
         * .manager()
         * .middleName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IndividualInDirectory]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var department: JsonField<Department>? = null
        private var firstName: JsonField<String>? = null
        private var isActive: JsonField<Boolean>? = null
        private var lastName: JsonField<String>? = null
        private var manager: JsonField<Manager>? = null
        private var middleName: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(individualInDirectory: IndividualInDirectory) = apply {
            id = individualInDirectory.id
            department = individualInDirectory.department
            firstName = individualInDirectory.firstName
            isActive = individualInDirectory.isActive
            lastName = individualInDirectory.lastName
            manager = individualInDirectory.manager
            middleName = individualInDirectory.middleName
            additionalProperties = individualInDirectory.additionalProperties.toMutableMap()
        }

        /** A stable Finch `id` (UUID v4) for an individual in the company. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The department object. */
        fun department(department: Department?) = department(JsonField.ofNullable(department))

        /** Alias for calling [Builder.department] with `department.orElse(null)`. */
        fun department(department: Optional<Department>) = department(department.getOrNull())

        /**
         * Sets [Builder.department] to an arbitrary JSON value.
         *
         * You should usually call [Builder.department] with a well-typed [Department] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun department(department: JsonField<Department>) = apply { this.department = department }

        /** The legal first name of the individual. */
        fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

        /** Alias for calling [Builder.firstName] with `firstName.orElse(null)`. */
        fun firstName(firstName: Optional<String>) = firstName(firstName.getOrNull())

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** `true` if the individual is an active employee or contractor at the company. */
        fun isActive(isActive: Boolean?) = isActive(JsonField.ofNullable(isActive))

        /**
         * Alias for [Builder.isActive].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isActive(isActive: Boolean) = isActive(isActive as Boolean?)

        /** Alias for calling [Builder.isActive] with `isActive.orElse(null)`. */
        fun isActive(isActive: Optional<Boolean>) = isActive(isActive.getOrNull())

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

        /** The legal last name of the individual. */
        fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

        /** Alias for calling [Builder.lastName] with `lastName.orElse(null)`. */
        fun lastName(lastName: Optional<String>) = lastName(lastName.getOrNull())

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** The manager object. */
        fun manager(manager: Manager?) = manager(JsonField.ofNullable(manager))

        /** Alias for calling [Builder.manager] with `manager.orElse(null)`. */
        fun manager(manager: Optional<Manager>) = manager(manager.getOrNull())

        /**
         * Sets [Builder.manager] to an arbitrary JSON value.
         *
         * You should usually call [Builder.manager] with a well-typed [Manager] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun manager(manager: JsonField<Manager>) = apply { this.manager = manager }

        /** The legal middle name of the individual. */
        fun middleName(middleName: String?) = middleName(JsonField.ofNullable(middleName))

        /** Alias for calling [Builder.middleName] with `middleName.orElse(null)`. */
        fun middleName(middleName: Optional<String>) = middleName(middleName.getOrNull())

        /**
         * Sets [Builder.middleName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.middleName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

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
         * Returns an immutable instance of [IndividualInDirectory].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .department()
         * .firstName()
         * .isActive()
         * .lastName()
         * .manager()
         * .middleName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IndividualInDirectory =
            IndividualInDirectory(
                checkRequired("id", id),
                checkRequired("department", department),
                checkRequired("firstName", firstName),
                checkRequired("isActive", isActive),
                checkRequired("lastName", lastName),
                checkRequired("manager", manager),
                checkRequired("middleName", middleName),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IndividualInDirectory = apply {
        if (validated) {
            return@apply
        }

        id()
        department().ifPresent { it.validate() }
        firstName()
        isActive()
        lastName()
        manager().ifPresent { it.validate() }
        middleName()
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
            (department.asKnown().getOrNull()?.validity() ?: 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (isActive.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (manager.asKnown().getOrNull()?.validity() ?: 0) +
            (if (middleName.asKnown().isPresent) 1 else 0)

    /** The department object. */
    class Department
    private constructor(
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of()
        ) : this(name, mutableMapOf())

        /**
         * The name of the department.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

            /** Returns a mutable builder for constructing an instance of [Department]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Department]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(department: Department) = apply {
                name = department.name
                additionalProperties = department.additionalProperties.toMutableMap()
            }

            /** The name of the department. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Department].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Department = Department(name, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Department = apply {
            if (validated) {
                return@apply
            }

            name()
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
        @JvmSynthetic internal fun validity(): Int = (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Department && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Department{name=$name, additionalProperties=$additionalProperties}"
    }

    /** The manager object. */
    class Manager
    private constructor(
        private val id: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of()
        ) : this(id, mutableMapOf())

        /**
         * A stable Finch `id` (UUID v4) for an individual in the company.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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

            /**
             * Returns a mutable builder for constructing an instance of [Manager].
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Manager]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(manager: Manager) = apply {
                id = manager.id
                additionalProperties = manager.additionalProperties.toMutableMap()
            }

            /** A stable Finch `id` (UUID v4) for an individual in the company. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

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
             * Returns an immutable instance of [Manager].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Manager =
                Manager(checkRequired("id", id), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Manager = apply {
            if (validated) {
                return@apply
            }

            id()
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
        @JvmSynthetic internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Manager && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Manager{id=$id, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IndividualInDirectory && id == other.id && department == other.department && firstName == other.firstName && isActive == other.isActive && lastName == other.lastName && manager == other.manager && middleName == other.middleName && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, department, firstName, isActive, lastName, manager, middleName, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IndividualInDirectory{id=$id, department=$department, firstName=$firstName, isActive=$isActive, lastName=$lastName, manager=$manager, middleName=$middleName, additionalProperties=$additionalProperties}"
}

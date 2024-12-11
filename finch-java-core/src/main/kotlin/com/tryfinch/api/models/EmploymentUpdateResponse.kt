// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = EmploymentUpdateResponse.Builder::class)
@NoAutoDetect
class EmploymentUpdateResponse
private constructor(
    private val firstName: JsonField<String>,
    private val middleName: JsonField<String>,
    private val lastName: JsonField<String>,
    private val title: JsonField<String>,
    private val manager: JsonField<Manager>,
    private val department: JsonField<Department>,
    private val employment: JsonField<Employment>,
    private val startDate: JsonField<String>,
    private val endDate: JsonField<String>,
    private val latestRehireDate: JsonField<String>,
    private val isActive: JsonField<Boolean>,
    private val employmentStatus: JsonField<EmploymentStatus>,
    private val classCode: JsonField<String>,
    private val location: JsonField<Location>,
    private val income: JsonField<Income>,
    private val incomeHistory: JsonField<List<Income?>>,
    private val customFields: JsonField<List<CustomField>>,
    private val sourceId: JsonField<String>,
    private val id: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The legal first name of the individual. */
    fun firstName(): Optional<String> = Optional.ofNullable(firstName.getNullable("first_name"))

    /** The legal middle name of the individual. */
    fun middleName(): Optional<String> = Optional.ofNullable(middleName.getNullable("middle_name"))

    /** The legal last name of the individual. */
    fun lastName(): Optional<String> = Optional.ofNullable(lastName.getNullable("last_name"))

    /** The current title of the individual. */
    fun title(): Optional<String> = Optional.ofNullable(title.getNullable("title"))

    /** The manager object representing the manager of the individual within the org. */
    fun manager(): Optional<Manager> = Optional.ofNullable(manager.getNullable("manager"))

    /** The department object. */
    fun department(): Optional<Department> =
        Optional.ofNullable(department.getNullable("department"))

    /** The employment object. */
    fun employment(): Optional<Employment> =
        Optional.ofNullable(employment.getNullable("employment"))

    fun startDate(): Optional<String> = Optional.ofNullable(startDate.getNullable("start_date"))

    fun endDate(): Optional<String> = Optional.ofNullable(endDate.getNullable("end_date"))

    fun latestRehireDate(): Optional<String> =
        Optional.ofNullable(latestRehireDate.getNullable("latest_rehire_date"))

    /** `true` if the individual an an active employee or contractor at the company. */
    fun isActive(): Optional<Boolean> = Optional.ofNullable(isActive.getNullable("is_active"))

    /** The detailed employment status of the individual. */
    fun employmentStatus(): Optional<EmploymentStatus> =
        Optional.ofNullable(employmentStatus.getNullable("employment_status"))

    /** Worker's compensation classification code for this employee */
    fun classCode(): Optional<String> = Optional.ofNullable(classCode.getNullable("class_code"))

    fun location(): Optional<Location> = Optional.ofNullable(location.getNullable("location"))

    /**
     * The employee's income as reported by the provider. This may not always be annualized income,
     * but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what information the
     * provider returns.
     */
    fun income(): Optional<Income> = Optional.ofNullable(income.getNullable("income"))

    /** The array of income history. */
    fun incomeHistory(): Optional<List<Income?>> =
        Optional.ofNullable(incomeHistory.getNullable("income_history"))

    /**
     * Custom fields for the individual. These are fields which are defined by the employer in the
     * system. Custom fields are not currently supported for assisted connections.
     */
    fun customFields(): Optional<List<CustomField>> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    /** The source system's unique employment identifier for this individual */
    fun sourceId(): Optional<String> = Optional.ofNullable(sourceId.getNullable("source_id"))

    /** A stable Finch `id` (UUID v4) for an individual in the company. */
    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /** The legal first name of the individual. */
    @JsonProperty("first_name") @ExcludeMissing fun _firstName() = firstName

    /** The legal middle name of the individual. */
    @JsonProperty("middle_name") @ExcludeMissing fun _middleName() = middleName

    /** The legal last name of the individual. */
    @JsonProperty("last_name") @ExcludeMissing fun _lastName() = lastName

    /** The current title of the individual. */
    @JsonProperty("title") @ExcludeMissing fun _title() = title

    /** The manager object representing the manager of the individual within the org. */
    @JsonProperty("manager") @ExcludeMissing fun _manager() = manager

    /** The department object. */
    @JsonProperty("department") @ExcludeMissing fun _department() = department

    /** The employment object. */
    @JsonProperty("employment") @ExcludeMissing fun _employment() = employment

    @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

    @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

    @JsonProperty("latest_rehire_date") @ExcludeMissing fun _latestRehireDate() = latestRehireDate

    /** `true` if the individual an an active employee or contractor at the company. */
    @JsonProperty("is_active") @ExcludeMissing fun _isActive() = isActive

    /** The detailed employment status of the individual. */
    @JsonProperty("employment_status") @ExcludeMissing fun _employmentStatus() = employmentStatus

    /** Worker's compensation classification code for this employee */
    @JsonProperty("class_code") @ExcludeMissing fun _classCode() = classCode

    @JsonProperty("location") @ExcludeMissing fun _location() = location

    /**
     * The employee's income as reported by the provider. This may not always be annualized income,
     * but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what information the
     * provider returns.
     */
    @JsonProperty("income") @ExcludeMissing fun _income() = income

    /** The array of income history. */
    @JsonProperty("income_history") @ExcludeMissing fun _incomeHistory() = incomeHistory

    /**
     * Custom fields for the individual. These are fields which are defined by the employer in the
     * system. Custom fields are not currently supported for assisted connections.
     */
    @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

    /** The source system's unique employment identifier for this individual */
    @JsonProperty("source_id") @ExcludeMissing fun _sourceId() = sourceId

    /** A stable Finch `id` (UUID v4) for an individual in the company. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): EmploymentUpdateResponse = apply {
        if (!validated) {
            firstName()
            middleName()
            lastName()
            title()
            manager().map { it.validate() }
            department().map { it.validate() }
            employment().map { it.validate() }
            startDate()
            endDate()
            latestRehireDate()
            isActive()
            employmentStatus()
            classCode()
            location().map { it.validate() }
            income().map { it.validate() }
            incomeHistory().map { it.forEach { it?.validate() } }
            customFields().map { it.forEach { it.validate() } }
            sourceId()
            id()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var firstName: JsonField<String> = JsonMissing.of()
        private var middleName: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var manager: JsonField<Manager> = JsonMissing.of()
        private var department: JsonField<Department> = JsonMissing.of()
        private var employment: JsonField<Employment> = JsonMissing.of()
        private var startDate: JsonField<String> = JsonMissing.of()
        private var endDate: JsonField<String> = JsonMissing.of()
        private var latestRehireDate: JsonField<String> = JsonMissing.of()
        private var isActive: JsonField<Boolean> = JsonMissing.of()
        private var employmentStatus: JsonField<EmploymentStatus> = JsonMissing.of()
        private var classCode: JsonField<String> = JsonMissing.of()
        private var location: JsonField<Location> = JsonMissing.of()
        private var income: JsonField<Income> = JsonMissing.of()
        private var incomeHistory: JsonField<List<Income?>> = JsonMissing.of()
        private var customFields: JsonField<List<CustomField>> = JsonMissing.of()
        private var sourceId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(employmentUpdateResponse: EmploymentUpdateResponse) = apply {
            this.firstName = employmentUpdateResponse.firstName
            this.middleName = employmentUpdateResponse.middleName
            this.lastName = employmentUpdateResponse.lastName
            this.title = employmentUpdateResponse.title
            this.manager = employmentUpdateResponse.manager
            this.department = employmentUpdateResponse.department
            this.employment = employmentUpdateResponse.employment
            this.startDate = employmentUpdateResponse.startDate
            this.endDate = employmentUpdateResponse.endDate
            this.latestRehireDate = employmentUpdateResponse.latestRehireDate
            this.isActive = employmentUpdateResponse.isActive
            this.employmentStatus = employmentUpdateResponse.employmentStatus
            this.classCode = employmentUpdateResponse.classCode
            this.location = employmentUpdateResponse.location
            this.income = employmentUpdateResponse.income
            this.incomeHistory = employmentUpdateResponse.incomeHistory
            this.customFields = employmentUpdateResponse.customFields
            this.sourceId = employmentUpdateResponse.sourceId
            this.id = employmentUpdateResponse.id
            additionalProperties(employmentUpdateResponse.additionalProperties)
        }

        /** The legal first name of the individual. */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /** The legal first name of the individual. */
        @JsonProperty("first_name")
        @ExcludeMissing
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** The legal middle name of the individual. */
        fun middleName(middleName: String) = middleName(JsonField.of(middleName))

        /** The legal middle name of the individual. */
        @JsonProperty("middle_name")
        @ExcludeMissing
        fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

        /** The legal last name of the individual. */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /** The legal last name of the individual. */
        @JsonProperty("last_name")
        @ExcludeMissing
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** The current title of the individual. */
        fun title(title: String) = title(JsonField.of(title))

        /** The current title of the individual. */
        @JsonProperty("title")
        @ExcludeMissing
        fun title(title: JsonField<String>) = apply { this.title = title }

        /** The manager object representing the manager of the individual within the org. */
        fun manager(manager: Manager) = manager(JsonField.of(manager))

        /** The manager object representing the manager of the individual within the org. */
        @JsonProperty("manager")
        @ExcludeMissing
        fun manager(manager: JsonField<Manager>) = apply { this.manager = manager }

        /** The department object. */
        fun department(department: Department) = department(JsonField.of(department))

        /** The department object. */
        @JsonProperty("department")
        @ExcludeMissing
        fun department(department: JsonField<Department>) = apply { this.department = department }

        /** The employment object. */
        fun employment(employment: Employment) = employment(JsonField.of(employment))

        /** The employment object. */
        @JsonProperty("employment")
        @ExcludeMissing
        fun employment(employment: JsonField<Employment>) = apply { this.employment = employment }

        fun startDate(startDate: String) = startDate(JsonField.of(startDate))

        @JsonProperty("start_date")
        @ExcludeMissing
        fun startDate(startDate: JsonField<String>) = apply { this.startDate = startDate }

        fun endDate(endDate: String) = endDate(JsonField.of(endDate))

        @JsonProperty("end_date")
        @ExcludeMissing
        fun endDate(endDate: JsonField<String>) = apply { this.endDate = endDate }

        fun latestRehireDate(latestRehireDate: String) =
            latestRehireDate(JsonField.of(latestRehireDate))

        @JsonProperty("latest_rehire_date")
        @ExcludeMissing
        fun latestRehireDate(latestRehireDate: JsonField<String>) = apply {
            this.latestRehireDate = latestRehireDate
        }

        /** `true` if the individual an an active employee or contractor at the company. */
        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

        /** `true` if the individual an an active employee or contractor at the company. */
        @JsonProperty("is_active")
        @ExcludeMissing
        fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

        /** The detailed employment status of the individual. */
        fun employmentStatus(employmentStatus: EmploymentStatus) =
            employmentStatus(JsonField.of(employmentStatus))

        /** The detailed employment status of the individual. */
        @JsonProperty("employment_status")
        @ExcludeMissing
        fun employmentStatus(employmentStatus: JsonField<EmploymentStatus>) = apply {
            this.employmentStatus = employmentStatus
        }

        /** Worker's compensation classification code for this employee */
        fun classCode(classCode: String) = classCode(JsonField.of(classCode))

        /** Worker's compensation classification code for this employee */
        @JsonProperty("class_code")
        @ExcludeMissing
        fun classCode(classCode: JsonField<String>) = apply { this.classCode = classCode }

        fun location(location: Location) = location(JsonField.of(location))

        @JsonProperty("location")
        @ExcludeMissing
        fun location(location: JsonField<Location>) = apply { this.location = location }

        /**
         * The employee's income as reported by the provider. This may not always be annualized
         * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
         * information the provider returns.
         */
        fun income(income: Income) = income(JsonField.of(income))

        /**
         * The employee's income as reported by the provider. This may not always be annualized
         * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
         * information the provider returns.
         */
        @JsonProperty("income")
        @ExcludeMissing
        fun income(income: JsonField<Income>) = apply { this.income = income }

        /** The array of income history. */
        fun incomeHistory(incomeHistory: List<Income?>) = incomeHistory(JsonField.of(incomeHistory))

        /** The array of income history. */
        @JsonProperty("income_history")
        @ExcludeMissing
        fun incomeHistory(incomeHistory: JsonField<List<Income?>>) = apply {
            this.incomeHistory = incomeHistory
        }

        /**
         * Custom fields for the individual. These are fields which are defined by the employer in
         * the system. Custom fields are not currently supported for assisted connections.
         */
        fun customFields(customFields: List<CustomField>) = customFields(JsonField.of(customFields))

        /**
         * Custom fields for the individual. These are fields which are defined by the employer in
         * the system. Custom fields are not currently supported for assisted connections.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun customFields(customFields: JsonField<List<CustomField>>) = apply {
            this.customFields = customFields
        }

        /** The source system's unique employment identifier for this individual */
        fun sourceId(sourceId: String) = sourceId(JsonField.of(sourceId))

        /** The source system's unique employment identifier for this individual */
        @JsonProperty("source_id")
        @ExcludeMissing
        fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

        /** A stable Finch `id` (UUID v4) for an individual in the company. */
        fun id(id: String) = id(JsonField.of(id))

        /** A stable Finch `id` (UUID v4) for an individual in the company. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

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

        fun build(): EmploymentUpdateResponse =
            EmploymentUpdateResponse(
                firstName,
                middleName,
                lastName,
                title,
                manager,
                department,
                employment,
                startDate,
                endDate,
                latestRehireDate,
                isActive,
                employmentStatus,
                classCode,
                location,
                income,
                incomeHistory.map { it.toImmutable() },
                customFields.map { it.toImmutable() },
                sourceId,
                id,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = CustomField.Builder::class)
    @NoAutoDetect
    class CustomField
    private constructor(
        private val name: JsonField<String>,
        private val value: JsonValue,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("value") @ExcludeMissing fun _value() = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CustomField = apply {
            if (!validated) {
                name()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var value: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customField: CustomField) = apply {
                this.name = customField.name
                this.value = customField.value
                additionalProperties(customField.additionalProperties)
            }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            @JsonProperty("value")
            @ExcludeMissing
            fun value(value: JsonValue) = apply { this.value = value }

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

            fun build(): CustomField =
                CustomField(
                    name,
                    value,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomField && name == other.name && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomField{name=$name, value=$value, additionalProperties=$additionalProperties}"
    }

    /** The department object. */
    @JsonDeserialize(builder = Department.Builder::class)
    @NoAutoDetect
    class Department
    private constructor(
        private val name: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The name of the department associated with the individual. */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** The name of the department associated with the individual. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Department = apply {
            if (!validated) {
                name()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(department: Department) = apply {
                this.name = department.name
                additionalProperties(department.additionalProperties)
            }

            /** The name of the department associated with the individual. */
            fun name(name: String) = name(JsonField.of(name))

            /** The name of the department associated with the individual. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

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

            fun build(): Department = Department(name, additionalProperties.toImmutable())
        }

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

    /** The employment object. */
    @JsonDeserialize(builder = Employment.Builder::class)
    @NoAutoDetect
    class Employment
    private constructor(
        private val type: JsonField<Type>,
        private val subtype: JsonField<Subtype>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The main employment type of the individual. */
        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        /**
         * The secondary employment type of the individual. Options: `full_time`, `part_time`,
         * `intern`, `temp`, `seasonal` and `individual_contractor`.
         */
        fun subtype(): Optional<Subtype> = Optional.ofNullable(subtype.getNullable("subtype"))

        /** The main employment type of the individual. */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        /**
         * The secondary employment type of the individual. Options: `full_time`, `part_time`,
         * `intern`, `temp`, `seasonal` and `individual_contractor`.
         */
        @JsonProperty("subtype") @ExcludeMissing fun _subtype() = subtype

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Employment = apply {
            if (!validated) {
                type()
                subtype()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: JsonField<Type> = JsonMissing.of()
            private var subtype: JsonField<Subtype> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(employment: Employment) = apply {
                this.type = employment.type
                this.subtype = employment.subtype
                additionalProperties(employment.additionalProperties)
            }

            /** The main employment type of the individual. */
            fun type(type: Type) = type(JsonField.of(type))

            /** The main employment type of the individual. */
            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * The secondary employment type of the individual. Options: `full_time`, `part_time`,
             * `intern`, `temp`, `seasonal` and `individual_contractor`.
             */
            fun subtype(subtype: Subtype) = subtype(JsonField.of(subtype))

            /**
             * The secondary employment type of the individual. Options: `full_time`, `part_time`,
             * `intern`, `temp`, `seasonal` and `individual_contractor`.
             */
            @JsonProperty("subtype")
            @ExcludeMissing
            fun subtype(subtype: JsonField<Subtype>) = apply { this.subtype = subtype }

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

            fun build(): Employment =
                Employment(
                    type,
                    subtype,
                    additionalProperties.toImmutable(),
                )
        }

        class Subtype
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val FULL_TIME = of("full_time")

                @JvmField val INTERN = of("intern")

                @JvmField val PART_TIME = of("part_time")

                @JvmField val TEMP = of("temp")

                @JvmField val SEASONAL = of("seasonal")

                @JvmField val INDIVIDUAL_CONTRACTOR = of("individual_contractor")

                @JvmStatic fun of(value: String) = Subtype(JsonField.of(value))
            }

            enum class Known {
                FULL_TIME,
                INTERN,
                PART_TIME,
                TEMP,
                SEASONAL,
                INDIVIDUAL_CONTRACTOR,
            }

            enum class Value {
                FULL_TIME,
                INTERN,
                PART_TIME,
                TEMP,
                SEASONAL,
                INDIVIDUAL_CONTRACTOR,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    FULL_TIME -> Value.FULL_TIME
                    INTERN -> Value.INTERN
                    PART_TIME -> Value.PART_TIME
                    TEMP -> Value.TEMP
                    SEASONAL -> Value.SEASONAL
                    INDIVIDUAL_CONTRACTOR -> Value.INDIVIDUAL_CONTRACTOR
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    FULL_TIME -> Known.FULL_TIME
                    INTERN -> Known.INTERN
                    PART_TIME -> Known.PART_TIME
                    TEMP -> Known.TEMP
                    SEASONAL -> Known.SEASONAL
                    INDIVIDUAL_CONTRACTOR -> Known.INDIVIDUAL_CONTRACTOR
                    else -> throw FinchInvalidDataException("Unknown Subtype: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Subtype && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val EMPLOYEE = of("employee")

                @JvmField val CONTRACTOR = of("contractor")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                EMPLOYEE,
                CONTRACTOR,
            }

            enum class Value {
                EMPLOYEE,
                CONTRACTOR,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    EMPLOYEE -> Value.EMPLOYEE
                    CONTRACTOR -> Value.CONTRACTOR
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    EMPLOYEE -> Known.EMPLOYEE
                    CONTRACTOR -> Known.CONTRACTOR
                    else -> throw FinchInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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

            return /* spotless:off */ other is Employment && type == other.type && subtype == other.subtype && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, subtype, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Employment{type=$type, subtype=$subtype, additionalProperties=$additionalProperties}"
    }

    class EmploymentStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACTIVE = of("active")

            @JvmField val DECEASED = of("deceased")

            @JvmField val LEAVE = of("leave")

            @JvmField val ONBOARDING = of("onboarding")

            @JvmField val PREHIRE = of("prehire")

            @JvmField val RETIRED = of("retired")

            @JvmField val TERMINATED = of("terminated")

            @JvmStatic fun of(value: String) = EmploymentStatus(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            DECEASED,
            LEAVE,
            ONBOARDING,
            PREHIRE,
            RETIRED,
            TERMINATED,
        }

        enum class Value {
            ACTIVE,
            DECEASED,
            LEAVE,
            ONBOARDING,
            PREHIRE,
            RETIRED,
            TERMINATED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                DECEASED -> Value.DECEASED
                LEAVE -> Value.LEAVE
                ONBOARDING -> Value.ONBOARDING
                PREHIRE -> Value.PREHIRE
                RETIRED -> Value.RETIRED
                TERMINATED -> Value.TERMINATED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                DECEASED -> Known.DECEASED
                LEAVE -> Known.LEAVE
                ONBOARDING -> Known.ONBOARDING
                PREHIRE -> Known.PREHIRE
                RETIRED -> Known.RETIRED
                TERMINATED -> Known.TERMINATED
                else -> throw FinchInvalidDataException("Unknown EmploymentStatus: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EmploymentStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The manager object representing the manager of the individual within the org. */
    @JsonDeserialize(builder = Manager.Builder::class)
    @NoAutoDetect
    class Manager
    private constructor(
        private val id: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** A stable Finch `id` (UUID v4) for an individual in the company. */
        fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

        /** A stable Finch `id` (UUID v4) for an individual in the company. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Manager = apply {
            if (!validated) {
                id()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(manager: Manager) = apply {
                this.id = manager.id
                additionalProperties(manager.additionalProperties)
            }

            /** A stable Finch `id` (UUID v4) for an individual in the company. */
            fun id(id: String) = id(JsonField.of(id))

            /** A stable Finch `id` (UUID v4) for an individual in the company. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

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

            fun build(): Manager = Manager(id, additionalProperties.toImmutable())
        }

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

        return /* spotless:off */ other is EmploymentUpdateResponse && firstName == other.firstName && middleName == other.middleName && lastName == other.lastName && title == other.title && manager == other.manager && department == other.department && employment == other.employment && startDate == other.startDate && endDate == other.endDate && latestRehireDate == other.latestRehireDate && isActive == other.isActive && employmentStatus == other.employmentStatus && classCode == other.classCode && location == other.location && income == other.income && incomeHistory == other.incomeHistory && customFields == other.customFields && sourceId == other.sourceId && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(firstName, middleName, lastName, title, manager, department, employment, startDate, endDate, latestRehireDate, isActive, employmentStatus, classCode, location, income, incomeHistory, customFields, sourceId, id, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmploymentUpdateResponse{firstName=$firstName, middleName=$middleName, lastName=$lastName, title=$title, manager=$manager, department=$department, employment=$employment, startDate=$startDate, endDate=$endDate, latestRehireDate=$latestRehireDate, isActive=$isActive, employmentStatus=$employmentStatus, classCode=$classCode, location=$location, income=$income, incomeHistory=$incomeHistory, customFields=$customFields, sourceId=$sourceId, id=$id, additionalProperties=$additionalProperties}"
}

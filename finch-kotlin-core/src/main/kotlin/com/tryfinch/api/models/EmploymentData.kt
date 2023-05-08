package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = EmploymentData.Builder::class)
@NoAutoDetect
class EmploymentData
private constructor(
    private val id: JsonField<String>,
    private val firstName: JsonField<String>,
    private val middleName: JsonField<String>,
    private val lastName: JsonField<String>,
    private val title: JsonField<String>,
    private val manager: JsonField<Manager>,
    private val department: JsonField<Department>,
    private val employment: JsonField<Employment>,
    private val startDate: JsonField<String>,
    private val endDate: JsonField<String>,
    private val isActive: JsonField<Boolean>,
    private val classCode: JsonField<String>,
    private val location: JsonField<Location>,
    private val income: JsonField<Income>,
    private val incomeHistory: JsonField<List<Income>>,
    private val workId: JsonField<String>,
    private val workId2: JsonField<String>,
    private val payGroupIds: JsonField<List<String>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** string A stable Finch `id` (UUID v4) for an individual in the company. */
    fun id(): String? = id.getNullable("id")

    /** The legal first name of the individual. */
    fun firstName(): String? = firstName.getNullable("first_name")

    /** The legal middle name of the individual. */
    fun middleName(): String? = middleName.getNullable("middle_name")

    /** The legal last name of the individual. */
    fun lastName(): String? = lastName.getNullable("last_name")

    /** The current title of the individual. */
    fun title(): String? = title.getNullable("title")

    /** The manager object representing the manager of the individual within the org. */
    fun manager(): Manager? = manager.getNullable("manager")

    /** The department object. */
    fun department(): Department? = department.getNullable("department")

    /** The employment object. */
    fun employment(): Employment? = employment.getNullable("employment")

    fun startDate(): String? = startDate.getNullable("start_date")

    fun endDate(): String? = endDate.getNullable("end_date")

    /** `true` if the individual an an active employee or contractor at the company. */
    fun isActive(): Boolean? = isActive.getNullable("is_active")

    /** Worker's compensation classification code for this employee */
    fun classCode(): String? = classCode.getNullable("class_code")

    fun location(): Location? = location.getNullable("location")

    /**
     * The employee's income as reported by the provider. This may not always be annualized income,
     * but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what information the
     * provider returns.
     */
    fun income(): Income? = income.getNullable("income")

    /** The array of income history. */
    fun incomeHistory(): List<Income>? = incomeHistory.getNullable("income_history")

    /**
     * Note: This property is only available if enabled for your account. Please reach out to your
     * Finch representative if you would like access.
     */
    fun workId(): String? = workId.getNullable("work_id")

    /**
     * Note: This property is only available if enabled for your account. Please reach out to your
     * Finch representative if you would like access.
     */
    fun workId2(): String? = workId2.getNullable("work_id_2")

    /**
     * Note: This property is only available if enabled for your account. Please reach out to your
     * Finch representative if you would like access.
     */
    fun payGroupIds(): List<String>? = payGroupIds.getNullable("pay_group_ids")

    /** string A stable Finch `id` (UUID v4) for an individual in the company. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

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

    /** `true` if the individual an an active employee or contractor at the company. */
    @JsonProperty("is_active") @ExcludeMissing fun _isActive() = isActive

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
     * Note: This property is only available if enabled for your account. Please reach out to your
     * Finch representative if you would like access.
     */
    @JsonProperty("work_id") @ExcludeMissing fun _workId() = workId

    /**
     * Note: This property is only available if enabled for your account. Please reach out to your
     * Finch representative if you would like access.
     */
    @JsonProperty("work_id_2") @ExcludeMissing fun _workId2() = workId2

    /**
     * Note: This property is only available if enabled for your account. Please reach out to your
     * Finch representative if you would like access.
     */
    @JsonProperty("pay_group_ids") @ExcludeMissing fun _payGroupIds() = payGroupIds

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            id()
            firstName()
            middleName()
            lastName()
            title()
            manager()?.validate()
            department()?.validate()
            employment()?.validate()
            startDate()
            endDate()
            isActive()
            classCode()
            location()?.validate()
            income()?.validate()
            incomeHistory()?.forEach { it.validate() }
            workId()
            workId2()
            payGroupIds()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmploymentData &&
            this.id == other.id &&
            this.firstName == other.firstName &&
            this.middleName == other.middleName &&
            this.lastName == other.lastName &&
            this.title == other.title &&
            this.manager == other.manager &&
            this.department == other.department &&
            this.employment == other.employment &&
            this.startDate == other.startDate &&
            this.endDate == other.endDate &&
            this.isActive == other.isActive &&
            this.classCode == other.classCode &&
            this.location == other.location &&
            this.income == other.income &&
            this.incomeHistory == other.incomeHistory &&
            this.workId == other.workId &&
            this.workId2 == other.workId2 &&
            this.payGroupIds == other.payGroupIds &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    firstName,
                    middleName,
                    lastName,
                    title,
                    manager,
                    department,
                    employment,
                    startDate,
                    endDate,
                    isActive,
                    classCode,
                    location,
                    income,
                    incomeHistory,
                    workId,
                    workId2,
                    payGroupIds,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "EmploymentData{id=$id, firstName=$firstName, middleName=$middleName, lastName=$lastName, title=$title, manager=$manager, department=$department, employment=$employment, startDate=$startDate, endDate=$endDate, isActive=$isActive, classCode=$classCode, location=$location, income=$income, incomeHistory=$incomeHistory, workId=$workId, workId2=$workId2, payGroupIds=$payGroupIds, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var middleName: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var manager: JsonField<Manager> = JsonMissing.of()
        private var department: JsonField<Department> = JsonMissing.of()
        private var employment: JsonField<Employment> = JsonMissing.of()
        private var startDate: JsonField<String> = JsonMissing.of()
        private var endDate: JsonField<String> = JsonMissing.of()
        private var isActive: JsonField<Boolean> = JsonMissing.of()
        private var classCode: JsonField<String> = JsonMissing.of()
        private var location: JsonField<Location> = JsonMissing.of()
        private var income: JsonField<Income> = JsonMissing.of()
        private var incomeHistory: JsonField<List<Income>> = JsonMissing.of()
        private var workId: JsonField<String> = JsonMissing.of()
        private var workId2: JsonField<String> = JsonMissing.of()
        private var payGroupIds: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(employmentData: EmploymentData) = apply {
            this.id = employmentData.id
            this.firstName = employmentData.firstName
            this.middleName = employmentData.middleName
            this.lastName = employmentData.lastName
            this.title = employmentData.title
            this.manager = employmentData.manager
            this.department = employmentData.department
            this.employment = employmentData.employment
            this.startDate = employmentData.startDate
            this.endDate = employmentData.endDate
            this.isActive = employmentData.isActive
            this.classCode = employmentData.classCode
            this.location = employmentData.location
            this.income = employmentData.income
            this.incomeHistory = employmentData.incomeHistory
            this.workId = employmentData.workId
            this.workId2 = employmentData.workId2
            this.payGroupIds = employmentData.payGroupIds
            additionalProperties(employmentData.additionalProperties)
        }

        /** string A stable Finch `id` (UUID v4) for an individual in the company. */
        fun id(id: String) = id(JsonField.of(id))

        /** string A stable Finch `id` (UUID v4) for an individual in the company. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

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

        /** `true` if the individual an an active employee or contractor at the company. */
        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

        /** `true` if the individual an an active employee or contractor at the company. */
        @JsonProperty("is_active")
        @ExcludeMissing
        fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

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
        fun incomeHistory(incomeHistory: List<Income>) = incomeHistory(JsonField.of(incomeHistory))

        /** The array of income history. */
        @JsonProperty("income_history")
        @ExcludeMissing
        fun incomeHistory(incomeHistory: JsonField<List<Income>>) = apply {
            this.incomeHistory = incomeHistory
        }

        /**
         * Note: This property is only available if enabled for your account. Please reach out to
         * your Finch representative if you would like access.
         */
        fun workId(workId: String) = workId(JsonField.of(workId))

        /**
         * Note: This property is only available if enabled for your account. Please reach out to
         * your Finch representative if you would like access.
         */
        @JsonProperty("work_id")
        @ExcludeMissing
        fun workId(workId: JsonField<String>) = apply { this.workId = workId }

        /**
         * Note: This property is only available if enabled for your account. Please reach out to
         * your Finch representative if you would like access.
         */
        fun workId2(workId2: String) = workId2(JsonField.of(workId2))

        /**
         * Note: This property is only available if enabled for your account. Please reach out to
         * your Finch representative if you would like access.
         */
        @JsonProperty("work_id_2")
        @ExcludeMissing
        fun workId2(workId2: JsonField<String>) = apply { this.workId2 = workId2 }

        /**
         * Note: This property is only available if enabled for your account. Please reach out to
         * your Finch representative if you would like access.
         */
        fun payGroupIds(payGroupIds: List<String>) = payGroupIds(JsonField.of(payGroupIds))

        /**
         * Note: This property is only available if enabled for your account. Please reach out to
         * your Finch representative if you would like access.
         */
        @JsonProperty("pay_group_ids")
        @ExcludeMissing
        fun payGroupIds(payGroupIds: JsonField<List<String>>) = apply {
            this.payGroupIds = payGroupIds
        }

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

        fun build(): EmploymentData =
            EmploymentData(
                id,
                firstName,
                middleName,
                lastName,
                title,
                manager,
                department,
                employment,
                startDate,
                endDate,
                isActive,
                classCode,
                location,
                income,
                incomeHistory.map { it.toUnmodifiable() },
                workId,
                workId2,
                payGroupIds.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
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

        private var hashCode: Int = 0

        /** A stable Finch `id` (UUID v4) for an individual in the company. */
        fun id(): String? = id.getNullable("id")

        /** A stable Finch `id` (UUID v4) for an individual in the company. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
                id()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Manager &&
                this.id == other.id &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(id, additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Manager{id=$id, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

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

            fun build(): Manager = Manager(id, additionalProperties.toUnmodifiable())
        }
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

        private var hashCode: Int = 0

        /** The name of the department associated with the individual. */
        fun name(): String? = name.getNullable("name")

        /** The name of the department associated with the individual. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
                name()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Department &&
                this.name == other.name &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(name, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "Department{name=$name, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

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

            fun build(): Department = Department(name, additionalProperties.toUnmodifiable())
        }
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

        private var hashCode: Int = 0

        /** The main employment type of the individual. */
        fun type(): Type? = type.getNullable("type")

        /**
         * The secondary employment type of the individual. Options: `full_time`, `part_time`,
         * `intern`, `temp`, `seasonal` and `individual_contractor`.
         */
        fun subtype(): Subtype? = subtype.getNullable("subtype")

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

        fun validate() = apply {
            if (!validated) {
                type()
                subtype()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Employment &&
                this.type == other.type &&
                this.subtype == other.subtype &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        type,
                        subtype,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Employment{type=$type, subtype=$subtype, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var type: JsonField<Type> = JsonMissing.of()
            private var subtype: JsonField<Subtype> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val EMPLOYEE = Type(JsonField.of("employee"))

                val CONTRACTOR = Type(JsonField.of("contractor"))

                fun of(value: String) = Type(JsonField.of(value))
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
        }

        class Subtype
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Subtype && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val FULL_TIME = Subtype(JsonField.of("full_time"))

                val INTERN = Subtype(JsonField.of("intern"))

                val PART_TIME = Subtype(JsonField.of("part_time"))

                val TEMP = Subtype(JsonField.of("temp"))

                val SEASONAL = Subtype(JsonField.of("seasonal"))

                val INDIVIDUAL_CONTRACTOR = Subtype(JsonField.of("individual_contractor"))

                fun of(value: String) = Subtype(JsonField.of(value))
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
        }
    }
}

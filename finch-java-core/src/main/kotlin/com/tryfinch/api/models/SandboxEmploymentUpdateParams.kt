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
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.Params
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update sandbox employment */
class SandboxEmploymentUpdateParams private constructor(
    private val individualId: String,
    private val body: EmploymentWithoutId,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    fun individualId(): String = individualId

    /** Worker's compensation classification code for this employee */
    fun classCode(): Optional<String> = body.classCode()

    /**
     * Custom fields for the individual. These are fields which are defined by the
     * employer in the system. Custom fields are not currently supported for assisted
     * connections.
     */
    fun customFields(): Optional<List<CustomField>> = body.customFields()

    /** The department object. */
    fun department(): Optional<Department> = body.department()

    /** The employment object. */
    fun employment(): Optional<Employment> = body.employment()

    /** The detailed employment status of the individual. */
    fun employmentStatus(): Optional<EmploymentStatus> = body.employmentStatus()

    fun endDate(): Optional<String> = body.endDate()

    /** The legal first name of the individual. */
    fun firstName(): Optional<String> = body.firstName()

    /**
     * The employee's income as reported by the provider. This may not always be
     * annualized income, but may be in units of bi-weekly, semi-monthly, daily, etc,
     * depending on what information the provider returns.
     */
    fun income(): Optional<Income> = body.income()

    /** The array of income history. */
    fun incomeHistory(): Optional<List<Income?>> = body.incomeHistory()

    /** `true` if the individual an an active employee or contractor at the company. */
    fun isActive(): Optional<Boolean> = body.isActive()

    /** The legal last name of the individual. */
    fun lastName(): Optional<String> = body.lastName()

    fun latestRehireDate(): Optional<String> = body.latestRehireDate()

    fun location(): Optional<Location> = body.location()

    /** The manager object representing the manager of the individual within the org. */
    fun manager(): Optional<Manager> = body.manager()

    /** The legal middle name of the individual. */
    fun middleName(): Optional<String> = body.middleName()

    /** The source system's unique employment identifier for this individual */
    fun sourceId(): Optional<String> = body.sourceId()

    fun startDate(): Optional<String> = body.startDate()

    /** The current title of the individual. */
    fun title(): Optional<String> = body.title()

    /** Worker's compensation classification code for this employee */
    fun _classCode(): JsonField<String> = body._classCode()

    /**
     * Custom fields for the individual. These are fields which are defined by the
     * employer in the system. Custom fields are not currently supported for assisted
     * connections.
     */
    fun _customFields(): JsonField<List<CustomField>> = body._customFields()

    /** The department object. */
    fun _department(): JsonField<Department> = body._department()

    /** The employment object. */
    fun _employment(): JsonField<Employment> = body._employment()

    /** The detailed employment status of the individual. */
    fun _employmentStatus(): JsonField<EmploymentStatus> = body._employmentStatus()

    fun _endDate(): JsonField<String> = body._endDate()

    /** The legal first name of the individual. */
    fun _firstName(): JsonField<String> = body._firstName()

    /**
     * The employee's income as reported by the provider. This may not always be
     * annualized income, but may be in units of bi-weekly, semi-monthly, daily, etc,
     * depending on what information the provider returns.
     */
    fun _income(): JsonField<Income> = body._income()

    /** The array of income history. */
    fun _incomeHistory(): JsonField<List<Income?>> = body._incomeHistory()

    /** `true` if the individual an an active employee or contractor at the company. */
    fun _isActive(): JsonField<Boolean> = body._isActive()

    /** The legal last name of the individual. */
    fun _lastName(): JsonField<String> = body._lastName()

    fun _latestRehireDate(): JsonField<String> = body._latestRehireDate()

    fun _location(): JsonField<Location> = body._location()

    /** The manager object representing the manager of the individual within the org. */
    fun _manager(): JsonField<Manager> = body._manager()

    /** The legal middle name of the individual. */
    fun _middleName(): JsonField<String> = body._middleName()

    /** The source system's unique employment identifier for this individual */
    fun _sourceId(): JsonField<String> = body._sourceId()

    fun _startDate(): JsonField<String> = body._startDate()

    /** The current title of the individual. */
    fun _title(): JsonField<String> = body._title()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic
    internal fun _body(): EmploymentWithoutId = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> individualId
          else -> ""
      }
    }

    @NoAutoDetect
    class EmploymentWithoutId @JsonCreator private constructor(
        @JsonProperty("class_code") @ExcludeMissing private val classCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("custom_fields") @ExcludeMissing private val customFields: JsonField<List<CustomField>> = JsonMissing.of(),
        @JsonProperty("department") @ExcludeMissing private val department: JsonField<Department> = JsonMissing.of(),
        @JsonProperty("employment") @ExcludeMissing private val employment: JsonField<Employment> = JsonMissing.of(),
        @JsonProperty("employment_status") @ExcludeMissing private val employmentStatus: JsonField<EmploymentStatus> = JsonMissing.of(),
        @JsonProperty("end_date") @ExcludeMissing private val endDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("first_name") @ExcludeMissing private val firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("income") @ExcludeMissing private val income: JsonField<Income> = JsonMissing.of(),
        @JsonProperty("income_history") @ExcludeMissing private val incomeHistory: JsonField<List<Income?>> = JsonMissing.of(),
        @JsonProperty("is_active") @ExcludeMissing private val isActive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("last_name") @ExcludeMissing private val lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("latest_rehire_date") @ExcludeMissing private val latestRehireDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("location") @ExcludeMissing private val location: JsonField<Location> = JsonMissing.of(),
        @JsonProperty("manager") @ExcludeMissing private val manager: JsonField<Manager> = JsonMissing.of(),
        @JsonProperty("middle_name") @ExcludeMissing private val middleName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_id") @ExcludeMissing private val sourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_date") @ExcludeMissing private val startDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing private val title: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** Worker's compensation classification code for this employee */
        fun classCode(): Optional<String> = Optional.ofNullable(classCode.getNullable("class_code"))

        /**
         * Custom fields for the individual. These are fields which are defined by the
         * employer in the system. Custom fields are not currently supported for assisted
         * connections.
         */
        fun customFields(): Optional<List<CustomField>> = Optional.ofNullable(customFields.getNullable("custom_fields"))

        /** The department object. */
        fun department(): Optional<Department> = Optional.ofNullable(department.getNullable("department"))

        /** The employment object. */
        fun employment(): Optional<Employment> = Optional.ofNullable(employment.getNullable("employment"))

        /** The detailed employment status of the individual. */
        fun employmentStatus(): Optional<EmploymentStatus> = Optional.ofNullable(employmentStatus.getNullable("employment_status"))

        fun endDate(): Optional<String> = Optional.ofNullable(endDate.getNullable("end_date"))

        /** The legal first name of the individual. */
        fun firstName(): Optional<String> = Optional.ofNullable(firstName.getNullable("first_name"))

        /**
         * The employee's income as reported by the provider. This may not always be
         * annualized income, but may be in units of bi-weekly, semi-monthly, daily, etc,
         * depending on what information the provider returns.
         */
        fun income(): Optional<Income> = Optional.ofNullable(income.getNullable("income"))

        /** The array of income history. */
        fun incomeHistory(): Optional<List<Income?>> = Optional.ofNullable(incomeHistory.getNullable("income_history"))

        /** `true` if the individual an an active employee or contractor at the company. */
        fun isActive(): Optional<Boolean> = Optional.ofNullable(isActive.getNullable("is_active"))

        /** The legal last name of the individual. */
        fun lastName(): Optional<String> = Optional.ofNullable(lastName.getNullable("last_name"))

        fun latestRehireDate(): Optional<String> = Optional.ofNullable(latestRehireDate.getNullable("latest_rehire_date"))

        fun location(): Optional<Location> = Optional.ofNullable(location.getNullable("location"))

        /** The manager object representing the manager of the individual within the org. */
        fun manager(): Optional<Manager> = Optional.ofNullable(manager.getNullable("manager"))

        /** The legal middle name of the individual. */
        fun middleName(): Optional<String> = Optional.ofNullable(middleName.getNullable("middle_name"))

        /** The source system's unique employment identifier for this individual */
        fun sourceId(): Optional<String> = Optional.ofNullable(sourceId.getNullable("source_id"))

        fun startDate(): Optional<String> = Optional.ofNullable(startDate.getNullable("start_date"))

        /** The current title of the individual. */
        fun title(): Optional<String> = Optional.ofNullable(title.getNullable("title"))

        /** Worker's compensation classification code for this employee */
        @JsonProperty("class_code")
        @ExcludeMissing
        fun _classCode(): JsonField<String> = classCode

        /**
         * Custom fields for the individual. These are fields which are defined by the
         * employer in the system. Custom fields are not currently supported for assisted
         * connections.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<List<CustomField>> = customFields

        /** The department object. */
        @JsonProperty("department")
        @ExcludeMissing
        fun _department(): JsonField<Department> = department

        /** The employment object. */
        @JsonProperty("employment")
        @ExcludeMissing
        fun _employment(): JsonField<Employment> = employment

        /** The detailed employment status of the individual. */
        @JsonProperty("employment_status")
        @ExcludeMissing
        fun _employmentStatus(): JsonField<EmploymentStatus> = employmentStatus

        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<String> = endDate

        /** The legal first name of the individual. */
        @JsonProperty("first_name")
        @ExcludeMissing
        fun _firstName(): JsonField<String> = firstName

        /**
         * The employee's income as reported by the provider. This may not always be
         * annualized income, but may be in units of bi-weekly, semi-monthly, daily, etc,
         * depending on what information the provider returns.
         */
        @JsonProperty("income")
        @ExcludeMissing
        fun _income(): JsonField<Income> = income

        /** The array of income history. */
        @JsonProperty("income_history")
        @ExcludeMissing
        fun _incomeHistory(): JsonField<List<Income?>> = incomeHistory

        /** `true` if the individual an an active employee or contractor at the company. */
        @JsonProperty("is_active")
        @ExcludeMissing
        fun _isActive(): JsonField<Boolean> = isActive

        /** The legal last name of the individual. */
        @JsonProperty("last_name")
        @ExcludeMissing
        fun _lastName(): JsonField<String> = lastName

        @JsonProperty("latest_rehire_date")
        @ExcludeMissing
        fun _latestRehireDate(): JsonField<String> = latestRehireDate

        @JsonProperty("location")
        @ExcludeMissing
        fun _location(): JsonField<Location> = location

        /** The manager object representing the manager of the individual within the org. */
        @JsonProperty("manager")
        @ExcludeMissing
        fun _manager(): JsonField<Manager> = manager

        /** The legal middle name of the individual. */
        @JsonProperty("middle_name")
        @ExcludeMissing
        fun _middleName(): JsonField<String> = middleName

        /** The source system's unique employment identifier for this individual */
        @JsonProperty("source_id")
        @ExcludeMissing
        fun _sourceId(): JsonField<String> = sourceId

        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<String> = startDate

        /** The current title of the individual. */
        @JsonProperty("title")
        @ExcludeMissing
        fun _title(): JsonField<String> = title

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): EmploymentWithoutId =
            apply {
                if (validated) {
                  return@apply
                }

                classCode()
                customFields().ifPresent { it.forEach { it.validate() } }
                department().ifPresent { it.validate() }
                employment().ifPresent { it.validate() }
                employmentStatus()
                endDate()
                firstName()
                income().ifPresent { it.validate() }
                incomeHistory().ifPresent { it.forEach { it?.validate() } }
                isActive()
                lastName()
                latestRehireDate()
                location().ifPresent { it.validate() }
                manager().ifPresent { it.validate() }
                middleName()
                sourceId()
                startDate()
                title()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [EmploymentWithoutId]. */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [EmploymentWithoutId]. */
        class Builder internal constructor() {

            private var classCode: JsonField<String> = JsonMissing.of()
            private var customFields: JsonField<MutableList<CustomField>>? = null
            private var department: JsonField<Department> = JsonMissing.of()
            private var employment: JsonField<Employment> = JsonMissing.of()
            private var employmentStatus: JsonField<EmploymentStatus> = JsonMissing.of()
            private var endDate: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var income: JsonField<Income> = JsonMissing.of()
            private var incomeHistory: JsonField<MutableList<Income?>>? = null
            private var isActive: JsonField<Boolean> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var latestRehireDate: JsonField<String> = JsonMissing.of()
            private var location: JsonField<Location> = JsonMissing.of()
            private var manager: JsonField<Manager> = JsonMissing.of()
            private var middleName: JsonField<String> = JsonMissing.of()
            private var sourceId: JsonField<String> = JsonMissing.of()
            private var startDate: JsonField<String> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(employmentWithoutId: EmploymentWithoutId) =
                apply {
                    classCode = employmentWithoutId.classCode
                    customFields = employmentWithoutId.customFields.map { it.toMutableList() }
                    department = employmentWithoutId.department
                    employment = employmentWithoutId.employment
                    employmentStatus = employmentWithoutId.employmentStatus
                    endDate = employmentWithoutId.endDate
                    firstName = employmentWithoutId.firstName
                    income = employmentWithoutId.income
                    incomeHistory = employmentWithoutId.incomeHistory.map { it.toMutableList() }
                    isActive = employmentWithoutId.isActive
                    lastName = employmentWithoutId.lastName
                    latestRehireDate = employmentWithoutId.latestRehireDate
                    location = employmentWithoutId.location
                    manager = employmentWithoutId.manager
                    middleName = employmentWithoutId.middleName
                    sourceId = employmentWithoutId.sourceId
                    startDate = employmentWithoutId.startDate
                    title = employmentWithoutId.title
                    additionalProperties = employmentWithoutId.additionalProperties.toMutableMap()
                }

            /** Worker's compensation classification code for this employee */
            fun classCode(classCode: String?) = classCode(JsonField.ofNullable(classCode))

            /** Worker's compensation classification code for this employee */
            fun classCode(classCode: Optional<String>) = classCode(classCode.getOrNull())

            /** Worker's compensation classification code for this employee */
            fun classCode(classCode: JsonField<String>) =
                apply {
                    this.classCode = classCode
                }

            /**
             * Custom fields for the individual. These are fields which are defined by the
             * employer in the system. Custom fields are not currently supported for assisted
             * connections.
             */
            fun customFields(customFields: List<CustomField>) = customFields(JsonField.of(customFields))

            /**
             * Custom fields for the individual. These are fields which are defined by the
             * employer in the system. Custom fields are not currently supported for assisted
             * connections.
             */
            fun customFields(customFields: JsonField<List<CustomField>>) =
                apply {
                    this.customFields = customFields.map { it.toMutableList() }
                }

            /**
             * Custom fields for the individual. These are fields which are defined by the
             * employer in the system. Custom fields are not currently supported for assisted
             * connections.
             */
            fun addCustomField(customField: CustomField) =
                apply {
                    customFields = (customFields ?: JsonField.of(mutableListOf())).also {
                        checkKnown("customFields", it).add(customField)
                    }
                }

            /** The department object. */
            fun department(department: Department?) = department(JsonField.ofNullable(department))

            /** The department object. */
            fun department(department: Optional<Department>) = department(department.getOrNull())

            /** The department object. */
            fun department(department: JsonField<Department>) =
                apply {
                    this.department = department
                }

            /** The employment object. */
            fun employment(employment: Employment?) = employment(JsonField.ofNullable(employment))

            /** The employment object. */
            fun employment(employment: Optional<Employment>) = employment(employment.getOrNull())

            /** The employment object. */
            fun employment(employment: JsonField<Employment>) =
                apply {
                    this.employment = employment
                }

            /** The detailed employment status of the individual. */
            fun employmentStatus(employmentStatus: EmploymentStatus?) = employmentStatus(JsonField.ofNullable(employmentStatus))

            /** The detailed employment status of the individual. */
            fun employmentStatus(employmentStatus: Optional<EmploymentStatus>) = employmentStatus(employmentStatus.getOrNull())

            /** The detailed employment status of the individual. */
            fun employmentStatus(employmentStatus: JsonField<EmploymentStatus>) =
                apply {
                    this.employmentStatus = employmentStatus
                }

            fun endDate(endDate: String?) = endDate(JsonField.ofNullable(endDate))

            fun endDate(endDate: Optional<String>) = endDate(endDate.getOrNull())

            fun endDate(endDate: JsonField<String>) =
                apply {
                    this.endDate = endDate
                }

            /** The legal first name of the individual. */
            fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

            /** The legal first name of the individual. */
            fun firstName(firstName: Optional<String>) = firstName(firstName.getOrNull())

            /** The legal first name of the individual. */
            fun firstName(firstName: JsonField<String>) =
                apply {
                    this.firstName = firstName
                }

            /**
             * The employee's income as reported by the provider. This may not always be
             * annualized income, but may be in units of bi-weekly, semi-monthly, daily, etc,
             * depending on what information the provider returns.
             */
            fun income(income: Income?) = income(JsonField.ofNullable(income))

            /**
             * The employee's income as reported by the provider. This may not always be
             * annualized income, but may be in units of bi-weekly, semi-monthly, daily, etc,
             * depending on what information the provider returns.
             */
            fun income(income: Optional<Income>) = income(income.getOrNull())

            /**
             * The employee's income as reported by the provider. This may not always be
             * annualized income, but may be in units of bi-weekly, semi-monthly, daily, etc,
             * depending on what information the provider returns.
             */
            fun income(income: JsonField<Income>) =
                apply {
                    this.income = income
                }

            /** The array of income history. */
            fun incomeHistory(incomeHistory: List<Income?>?) = incomeHistory(JsonField.ofNullable(incomeHistory))

            /** The array of income history. */
            fun incomeHistory(incomeHistory: Optional<List<Income?>>) = incomeHistory(incomeHistory.getOrNull())

            /** The array of income history. */
            fun incomeHistory(incomeHistory: JsonField<List<Income?>>) =
                apply {
                    this.incomeHistory = incomeHistory.map { it.toMutableList() }
                }

            /** The array of income history. */
            fun addIncomeHistory(incomeHistory: Income) =
                apply {
                    this.incomeHistory = (this.incomeHistory ?: JsonField.of(mutableListOf())).also {
                        checkKnown("incomeHistory", it).add(incomeHistory)
                    }
                }

            /** `true` if the individual an an active employee or contractor at the company. */
            fun isActive(isActive: Boolean?) = isActive(JsonField.ofNullable(isActive))

            /** `true` if the individual an an active employee or contractor at the company. */
            fun isActive(isActive: Boolean) = isActive(isActive as Boolean?)

            /** `true` if the individual an an active employee or contractor at the company. */
            fun isActive(isActive: Optional<Boolean>) = isActive(isActive.getOrNull())

            /** `true` if the individual an an active employee or contractor at the company. */
            fun isActive(isActive: JsonField<Boolean>) =
                apply {
                    this.isActive = isActive
                }

            /** The legal last name of the individual. */
            fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

            /** The legal last name of the individual. */
            fun lastName(lastName: Optional<String>) = lastName(lastName.getOrNull())

            /** The legal last name of the individual. */
            fun lastName(lastName: JsonField<String>) =
                apply {
                    this.lastName = lastName
                }

            fun latestRehireDate(latestRehireDate: String?) = latestRehireDate(JsonField.ofNullable(latestRehireDate))

            fun latestRehireDate(latestRehireDate: Optional<String>) = latestRehireDate(latestRehireDate.getOrNull())

            fun latestRehireDate(latestRehireDate: JsonField<String>) =
                apply {
                    this.latestRehireDate = latestRehireDate
                }

            fun location(location: Location?) = location(JsonField.ofNullable(location))

            fun location(location: Optional<Location>) = location(location.getOrNull())

            fun location(location: JsonField<Location>) =
                apply {
                    this.location = location
                }

            /** The manager object representing the manager of the individual within the org. */
            fun manager(manager: Manager?) = manager(JsonField.ofNullable(manager))

            /** The manager object representing the manager of the individual within the org. */
            fun manager(manager: Optional<Manager>) = manager(manager.getOrNull())

            /** The manager object representing the manager of the individual within the org. */
            fun manager(manager: JsonField<Manager>) =
                apply {
                    this.manager = manager
                }

            /** The legal middle name of the individual. */
            fun middleName(middleName: String?) = middleName(JsonField.ofNullable(middleName))

            /** The legal middle name of the individual. */
            fun middleName(middleName: Optional<String>) = middleName(middleName.getOrNull())

            /** The legal middle name of the individual. */
            fun middleName(middleName: JsonField<String>) =
                apply {
                    this.middleName = middleName
                }

            /** The source system's unique employment identifier for this individual */
            fun sourceId(sourceId: String) = sourceId(JsonField.of(sourceId))

            /** The source system's unique employment identifier for this individual */
            fun sourceId(sourceId: JsonField<String>) =
                apply {
                    this.sourceId = sourceId
                }

            fun startDate(startDate: String?) = startDate(JsonField.ofNullable(startDate))

            fun startDate(startDate: Optional<String>) = startDate(startDate.getOrNull())

            fun startDate(startDate: JsonField<String>) =
                apply {
                    this.startDate = startDate
                }

            /** The current title of the individual. */
            fun title(title: String?) = title(JsonField.ofNullable(title))

            /** The current title of the individual. */
            fun title(title: Optional<String>) = title(title.getOrNull())

            /** The current title of the individual. */
            fun title(title: JsonField<String>) =
                apply {
                    this.title = title
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): EmploymentWithoutId =
                EmploymentWithoutId(
                  classCode,
                  (customFields ?: JsonMissing.of()).map { it.toImmutable() },
                  department,
                  employment,
                  employmentStatus,
                  endDate,
                  firstName,
                  income,
                  (incomeHistory ?: JsonMissing.of()).map { it.toImmutable() },
                  isActive,
                  lastName,
                  latestRehireDate,
                  location,
                  manager,
                  middleName,
                  sourceId,
                  startDate,
                  title,
                  additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is EmploymentWithoutId && classCode == other.classCode && customFields == other.customFields && department == other.department && employment == other.employment && employmentStatus == other.employmentStatus && endDate == other.endDate && firstName == other.firstName && income == other.income && incomeHistory == other.incomeHistory && isActive == other.isActive && lastName == other.lastName && latestRehireDate == other.latestRehireDate && location == other.location && manager == other.manager && middleName == other.middleName && sourceId == other.sourceId && startDate == other.startDate && title == other.title && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(classCode, customFields, department, employment, employmentStatus, endDate, firstName, income, incomeHistory, isActive, lastName, latestRehireDate, location, manager, middleName, sourceId, startDate, title, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "EmploymentWithoutId{classCode=$classCode, customFields=$customFields, department=$department, employment=$employment, employmentStatus=$employmentStatus, endDate=$endDate, firstName=$firstName, income=$income, incomeHistory=$incomeHistory, isActive=$isActive, lastName=$lastName, latestRehireDate=$latestRehireDate, location=$location, manager=$manager, middleName=$middleName, sourceId=$sourceId, startDate=$startDate, title=$title, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SandboxEmploymentUpdateParams].
         *
         * The following fields are required:
         *
         * ```java
         * .individualId()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [SandboxEmploymentUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var individualId: String? = null
        private var body: EmploymentWithoutId.Builder = EmploymentWithoutId.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sandboxEmploymentUpdateParams: SandboxEmploymentUpdateParams) =
            apply {
                individualId = sandboxEmploymentUpdateParams.individualId
                body = sandboxEmploymentUpdateParams.body.toBuilder()
                additionalHeaders = sandboxEmploymentUpdateParams.additionalHeaders.toBuilder()
                additionalQueryParams = sandboxEmploymentUpdateParams.additionalQueryParams.toBuilder()
            }

        fun individualId(individualId: String) =
            apply {
                this.individualId = individualId
            }

        /** Worker's compensation classification code for this employee */
        fun classCode(classCode: String?) =
            apply {
                body.classCode(classCode)
            }

        /** Worker's compensation classification code for this employee */
        fun classCode(classCode: Optional<String>) = classCode(classCode.getOrNull())

        /** Worker's compensation classification code for this employee */
        fun classCode(classCode: JsonField<String>) =
            apply {
                body.classCode(classCode)
            }

        /**
         * Custom fields for the individual. These are fields which are defined by the
         * employer in the system. Custom fields are not currently supported for assisted
         * connections.
         */
        fun customFields(customFields: List<CustomField>) =
            apply {
                body.customFields(customFields)
            }

        /**
         * Custom fields for the individual. These are fields which are defined by the
         * employer in the system. Custom fields are not currently supported for assisted
         * connections.
         */
        fun customFields(customFields: JsonField<List<CustomField>>) =
            apply {
                body.customFields(customFields)
            }

        /**
         * Custom fields for the individual. These are fields which are defined by the
         * employer in the system. Custom fields are not currently supported for assisted
         * connections.
         */
        fun addCustomField(customField: CustomField) =
            apply {
                body.addCustomField(customField)
            }

        /** The department object. */
        fun department(department: Department?) =
            apply {
                body.department(department)
            }

        /** The department object. */
        fun department(department: Optional<Department>) = department(department.getOrNull())

        /** The department object. */
        fun department(department: JsonField<Department>) =
            apply {
                body.department(department)
            }

        /** The employment object. */
        fun employment(employment: Employment?) =
            apply {
                body.employment(employment)
            }

        /** The employment object. */
        fun employment(employment: Optional<Employment>) = employment(employment.getOrNull())

        /** The employment object. */
        fun employment(employment: JsonField<Employment>) =
            apply {
                body.employment(employment)
            }

        /** The detailed employment status of the individual. */
        fun employmentStatus(employmentStatus: EmploymentStatus?) =
            apply {
                body.employmentStatus(employmentStatus)
            }

        /** The detailed employment status of the individual. */
        fun employmentStatus(employmentStatus: Optional<EmploymentStatus>) = employmentStatus(employmentStatus.getOrNull())

        /** The detailed employment status of the individual. */
        fun employmentStatus(employmentStatus: JsonField<EmploymentStatus>) =
            apply {
                body.employmentStatus(employmentStatus)
            }

        fun endDate(endDate: String?) =
            apply {
                body.endDate(endDate)
            }

        fun endDate(endDate: Optional<String>) = endDate(endDate.getOrNull())

        fun endDate(endDate: JsonField<String>) =
            apply {
                body.endDate(endDate)
            }

        /** The legal first name of the individual. */
        fun firstName(firstName: String?) =
            apply {
                body.firstName(firstName)
            }

        /** The legal first name of the individual. */
        fun firstName(firstName: Optional<String>) = firstName(firstName.getOrNull())

        /** The legal first name of the individual. */
        fun firstName(firstName: JsonField<String>) =
            apply {
                body.firstName(firstName)
            }

        /**
         * The employee's income as reported by the provider. This may not always be
         * annualized income, but may be in units of bi-weekly, semi-monthly, daily, etc,
         * depending on what information the provider returns.
         */
        fun income(income: Income?) =
            apply {
                body.income(income)
            }

        /**
         * The employee's income as reported by the provider. This may not always be
         * annualized income, but may be in units of bi-weekly, semi-monthly, daily, etc,
         * depending on what information the provider returns.
         */
        fun income(income: Optional<Income>) = income(income.getOrNull())

        /**
         * The employee's income as reported by the provider. This may not always be
         * annualized income, but may be in units of bi-weekly, semi-monthly, daily, etc,
         * depending on what information the provider returns.
         */
        fun income(income: JsonField<Income>) =
            apply {
                body.income(income)
            }

        /** The array of income history. */
        fun incomeHistory(incomeHistory: List<Income?>?) =
            apply {
                body.incomeHistory(incomeHistory)
            }

        /** The array of income history. */
        fun incomeHistory(incomeHistory: Optional<List<Income?>>) = incomeHistory(incomeHistory.getOrNull())

        /** The array of income history. */
        fun incomeHistory(incomeHistory: JsonField<List<Income?>>) =
            apply {
                body.incomeHistory(incomeHistory)
            }

        /** The array of income history. */
        fun addIncomeHistory(incomeHistory: Income) =
            apply {
                body.addIncomeHistory(incomeHistory)
            }

        /** `true` if the individual an an active employee or contractor at the company. */
        fun isActive(isActive: Boolean?) =
            apply {
                body.isActive(isActive)
            }

        /** `true` if the individual an an active employee or contractor at the company. */
        fun isActive(isActive: Boolean) = isActive(isActive as Boolean?)

        /** `true` if the individual an an active employee or contractor at the company. */
        fun isActive(isActive: Optional<Boolean>) = isActive(isActive.getOrNull())

        /** `true` if the individual an an active employee or contractor at the company. */
        fun isActive(isActive: JsonField<Boolean>) =
            apply {
                body.isActive(isActive)
            }

        /** The legal last name of the individual. */
        fun lastName(lastName: String?) =
            apply {
                body.lastName(lastName)
            }

        /** The legal last name of the individual. */
        fun lastName(lastName: Optional<String>) = lastName(lastName.getOrNull())

        /** The legal last name of the individual. */
        fun lastName(lastName: JsonField<String>) =
            apply {
                body.lastName(lastName)
            }

        fun latestRehireDate(latestRehireDate: String?) =
            apply {
                body.latestRehireDate(latestRehireDate)
            }

        fun latestRehireDate(latestRehireDate: Optional<String>) = latestRehireDate(latestRehireDate.getOrNull())

        fun latestRehireDate(latestRehireDate: JsonField<String>) =
            apply {
                body.latestRehireDate(latestRehireDate)
            }

        fun location(location: Location?) =
            apply {
                body.location(location)
            }

        fun location(location: Optional<Location>) = location(location.getOrNull())

        fun location(location: JsonField<Location>) =
            apply {
                body.location(location)
            }

        /** The manager object representing the manager of the individual within the org. */
        fun manager(manager: Manager?) =
            apply {
                body.manager(manager)
            }

        /** The manager object representing the manager of the individual within the org. */
        fun manager(manager: Optional<Manager>) = manager(manager.getOrNull())

        /** The manager object representing the manager of the individual within the org. */
        fun manager(manager: JsonField<Manager>) =
            apply {
                body.manager(manager)
            }

        /** The legal middle name of the individual. */
        fun middleName(middleName: String?) =
            apply {
                body.middleName(middleName)
            }

        /** The legal middle name of the individual. */
        fun middleName(middleName: Optional<String>) = middleName(middleName.getOrNull())

        /** The legal middle name of the individual. */
        fun middleName(middleName: JsonField<String>) =
            apply {
                body.middleName(middleName)
            }

        /** The source system's unique employment identifier for this individual */
        fun sourceId(sourceId: String) =
            apply {
                body.sourceId(sourceId)
            }

        /** The source system's unique employment identifier for this individual */
        fun sourceId(sourceId: JsonField<String>) =
            apply {
                body.sourceId(sourceId)
            }

        fun startDate(startDate: String?) =
            apply {
                body.startDate(startDate)
            }

        fun startDate(startDate: Optional<String>) = startDate(startDate.getOrNull())

        fun startDate(startDate: JsonField<String>) =
            apply {
                body.startDate(startDate)
            }

        /** The current title of the individual. */
        fun title(title: String?) =
            apply {
                body.title(title)
            }

        /** The current title of the individual. */
        fun title(title: Optional<String>) = title(title.getOrNull())

        /** The current title of the individual. */
        fun title(title: JsonField<String>) =
            apply {
                body.title(title)
            }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.additionalProperties(additionalBodyProperties)
            }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) =
            apply {
                body.putAdditionalProperty(
                  key, value
                )
            }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) =
            apply {
                body.removeAdditionalProperty(key)
            }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) =
            apply {
                body.removeAllAdditionalProperties(keys)
            }

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
                additionalQueryParams.removeAll(keys)
            }

        fun build(): SandboxEmploymentUpdateParams =
            SandboxEmploymentUpdateParams(
              checkRequired(
                "individualId", individualId
              ),
              body.build(),
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class CustomField @JsonCreator private constructor(
        @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing private val value: JsonValue = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        @JsonProperty("value")
        @ExcludeMissing
        fun _value(): JsonValue = value

        @JsonProperty("name")
        @ExcludeMissing
        fun _name(): JsonField<String> = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomField =
            apply {
                if (validated) {
                  return@apply
                }

                name()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CustomField]. */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [CustomField]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var value: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customField: CustomField) =
                apply {
                    name = customField.name
                    value = customField.value
                    additionalProperties = customField.additionalProperties.toMutableMap()
                }

            fun name(name: String?) = name(JsonField.ofNullable(name))

            fun name(name: Optional<String>) = name(name.getOrNull())

            fun name(name: JsonField<String>) =
                apply {
                    this.name = name
                }

            fun value(value: JsonValue) =
                apply {
                    this.value = value
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
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

        override fun toString() = "CustomField{name=$name, value=$value, additionalProperties=$additionalProperties}"
    }

    /** The department object. */
    @NoAutoDetect
    class Department @JsonCreator private constructor(
        @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** The name of the department associated with the individual. */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** The name of the department associated with the individual. */
        @JsonProperty("name")
        @ExcludeMissing
        fun _name(): JsonField<String> = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Department =
            apply {
                if (validated) {
                  return@apply
                }

                name()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Department]. */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Department]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(department: Department) =
                apply {
                    name = department.name
                    additionalProperties = department.additionalProperties.toMutableMap()
                }

            /** The name of the department associated with the individual. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** The name of the department associated with the individual. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /** The name of the department associated with the individual. */
            fun name(name: JsonField<String>) =
                apply {
                    this.name = name
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): Department =
                Department(
                  name, additionalProperties.toImmutable()
                )
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

        override fun toString() = "Department{name=$name, additionalProperties=$additionalProperties}"
    }

    /** The employment object. */
    @NoAutoDetect
    class Employment @JsonCreator private constructor(
        @JsonProperty("subtype") @ExcludeMissing private val subtype: JsonField<Subtype> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** The secondary employment type of the individual. Options: `full_time`, `part_time`, `intern`, `temp`, `seasonal` and `individual_contractor`. */
        fun subtype(): Optional<Subtype> = Optional.ofNullable(subtype.getNullable("subtype"))

        /** The main employment type of the individual. */
        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        /** The secondary employment type of the individual. Options: `full_time`, `part_time`, `intern`, `temp`, `seasonal` and `individual_contractor`. */
        @JsonProperty("subtype")
        @ExcludeMissing
        fun _subtype(): JsonField<Subtype> = subtype

        /** The main employment type of the individual. */
        @JsonProperty("type")
        @ExcludeMissing
        fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Employment =
            apply {
                if (validated) {
                  return@apply
                }

                subtype()
                type()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Employment]. */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Employment]. */
        class Builder internal constructor() {

            private var subtype: JsonField<Subtype> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(employment: Employment) =
                apply {
                    subtype = employment.subtype
                    type = employment.type
                    additionalProperties = employment.additionalProperties.toMutableMap()
                }

            /** The secondary employment type of the individual. Options: `full_time`, `part_time`, `intern`, `temp`, `seasonal` and `individual_contractor`. */
            fun subtype(subtype: Subtype?) = subtype(JsonField.ofNullable(subtype))

            /** The secondary employment type of the individual. Options: `full_time`, `part_time`, `intern`, `temp`, `seasonal` and `individual_contractor`. */
            fun subtype(subtype: Optional<Subtype>) = subtype(subtype.getOrNull())

            /** The secondary employment type of the individual. Options: `full_time`, `part_time`, `intern`, `temp`, `seasonal` and `individual_contractor`. */
            fun subtype(subtype: JsonField<Subtype>) =
                apply {
                    this.subtype = subtype
                }

            /** The main employment type of the individual. */
            fun type(type: Type?) = type(JsonField.ofNullable(type))

            /** The main employment type of the individual. */
            fun type(type: Optional<Type>) = type(type.getOrNull())

            /** The main employment type of the individual. */
            fun type(type: JsonField<Type>) =
                apply {
                    this.type = type
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): Employment =
                Employment(
                  subtype,
                  type,
                  additionalProperties.toImmutable(),
                )
        }

        /** The secondary employment type of the individual. Options: `full_time`, `part_time`, `intern`, `temp`, `seasonal` and `individual_contractor`. */
        class Subtype @JsonCreator private constructor(
            private val value: JsonField<String>,

        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that
             * doesn't match any known member, and you want to know that value. For example, if
             * the SDK is on an older version than the API, then the API may respond with new
             * members that the SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            companion object {

                @JvmField val FULL_TIME = of("full_time")

                @JvmField val INTERN = of("intern")

                @JvmField val PART_TIME = of("part_time")

                @JvmField val TEMP = of("temp")

                @JvmField val SEASONAL = of("seasonal")

                @JvmField val INDIVIDUAL_CONTRACTOR = of("individual_contractor")

                @JvmStatic fun of(value: String) = Subtype(JsonField.of(value))
            }

            /** An enum containing [Subtype]'s known values. */
            enum class Known {
                FULL_TIME,
                INTERN,
                PART_TIME,
                TEMP,
                SEASONAL,
                INDIVIDUAL_CONTRACTOR,
            }

            /**
             * An enum containing [Subtype]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Subtype] can contain an unknown value in a couple of cases:
             *
             * - It was deserialized from data that doesn't match any known member. For
             *   example, if the SDK is on an older version than the API, then the API may
             *   respond with new members that the SDK is unaware of.
             *
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FULL_TIME,
                INTERN,
                PART_TIME,
                TEMP,
                SEASONAL,
                INDIVIDUAL_CONTRACTOR,
                /** An enum member indicating that [Subtype] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if
             * you want to throw for the unknown case.
             */
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

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws FinchInvalidDataException if this class instance's value is a not a
             * known member.
             */
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

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws FinchInvalidDataException if this class instance's value does not have
             * the expected primitive type.
             */
            fun asString(): String = _value().asString().orElseThrow { FinchInvalidDataException("Value is not a String") }

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is Subtype && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The main employment type of the individual. */
        class Type @JsonCreator private constructor(
            private val value: JsonField<String>,

        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that
             * doesn't match any known member, and you want to know that value. For example, if
             * the SDK is on an older version than the API, then the API may respond with new
             * members that the SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            companion object {

                @JvmField val EMPLOYEE = of("employee")

                @JvmField val CONTRACTOR = of("contractor")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                EMPLOYEE,
                CONTRACTOR,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             *
             * - It was deserialized from data that doesn't match any known member. For
             *   example, if the SDK is on an older version than the API, then the API may
             *   respond with new members that the SDK is unaware of.
             *
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EMPLOYEE,
                CONTRACTOR,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if
             * you want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    EMPLOYEE -> Value.EMPLOYEE
                    CONTRACTOR -> Value.CONTRACTOR
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws FinchInvalidDataException if this class instance's value is a not a
             * known member.
             */
            fun known(): Known =
                when (this) {
                    EMPLOYEE -> Known.EMPLOYEE
                    CONTRACTOR -> Known.CONTRACTOR
                    else -> throw FinchInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws FinchInvalidDataException if this class instance's value does not have
             * the expected primitive type.
             */
            fun asString(): String = _value().asString().orElseThrow { FinchInvalidDataException("Value is not a String") }

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

          return /* spotless:off */ other is Employment && subtype == other.subtype && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(subtype, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Employment{subtype=$subtype, type=$type, additionalProperties=$additionalProperties}"
    }

    /** The detailed employment status of the individual. */
    class EmploymentStatus @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that
         * doesn't match any known member, and you want to know that value. For example, if
         * the SDK is on an older version than the API, then the API may respond with new
         * members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

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

        /** An enum containing [EmploymentStatus]'s known values. */
        enum class Known {
            ACTIVE,
            DECEASED,
            LEAVE,
            ONBOARDING,
            PREHIRE,
            RETIRED,
            TERMINATED,
        }

        /**
         * An enum containing [EmploymentStatus]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [EmploymentStatus] can contain an unknown value in a couple of
         * cases:
         *
         * - It was deserialized from data that doesn't match any known member. For
         *   example, if the SDK is on an older version than the API, then the API may
         *   respond with new members that the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            DECEASED,
            LEAVE,
            ONBOARDING,
            PREHIRE,
            RETIRED,
            TERMINATED,
            /**
             * An enum member indicating that [EmploymentStatus] was instantiated with an
             * unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or
         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if
         * you want to throw for the unknown case.
         */
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

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and
         * don't want to throw for the unknown case.
         *
         * @throws FinchInvalidDataException if this class instance's value is a not a
         * known member.
         */
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

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for
         * debugging and generally doesn't throw.
         *
         * @throws FinchInvalidDataException if this class instance's value does not have
         * the expected primitive type.
         */
        fun asString(): String = _value().asString().orElseThrow { FinchInvalidDataException("Value is not a String") }

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
    @NoAutoDetect
    class Manager @JsonCreator private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** A stable Finch `id` (UUID v4) for an individual in the company. */
        fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

        /** A stable Finch `id` (UUID v4) for an individual in the company. */
        @JsonProperty("id")
        @ExcludeMissing
        fun _id(): JsonField<String> = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Manager =
            apply {
                if (validated) {
                  return@apply
                }

                id()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Manager]. */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Manager]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(manager: Manager) =
                apply {
                    id = manager.id
                    additionalProperties = manager.additionalProperties.toMutableMap()
                }

            /** A stable Finch `id` (UUID v4) for an individual in the company. */
            fun id(id: String) = id(JsonField.of(id))

            /** A stable Finch `id` (UUID v4) for an individual in the company. */
            fun id(id: JsonField<String>) =
                apply {
                    this.id = id
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): Manager =
                Manager(
                  id, additionalProperties.toImmutable()
                )
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

      return /* spotless:off */ other is SandboxEmploymentUpdateParams && individualId == other.individualId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(individualId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "SandboxEmploymentUpdateParams{individualId=$individualId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

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
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class EmploymentData
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("class_code")
    @ExcludeMissing
    private val classCode: JsonField<String> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<List<CustomField>> = JsonMissing.of(),
    @JsonProperty("department")
    @ExcludeMissing
    private val department: JsonField<Department> = JsonMissing.of(),
    @JsonProperty("employment")
    @ExcludeMissing
    private val employment: JsonField<Employment> = JsonMissing.of(),
    @JsonProperty("employment_status")
    @ExcludeMissing
    private val employmentStatus: JsonField<EmploymentStatus> = JsonMissing.of(),
    @JsonProperty("end_date")
    @ExcludeMissing
    private val endDate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("first_name")
    @ExcludeMissing
    private val firstName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("income")
    @ExcludeMissing
    private val income: JsonField<Income> = JsonMissing.of(),
    @JsonProperty("income_history")
    @ExcludeMissing
    private val incomeHistory: JsonField<List<Income?>> = JsonMissing.of(),
    @JsonProperty("is_active")
    @ExcludeMissing
    private val isActive: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("last_name")
    @ExcludeMissing
    private val lastName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("latest_rehire_date")
    @ExcludeMissing
    private val latestRehireDate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("location")
    @ExcludeMissing
    private val location: JsonField<Location> = JsonMissing.of(),
    @JsonProperty("manager")
    @ExcludeMissing
    private val manager: JsonField<Manager> = JsonMissing.of(),
    @JsonProperty("middle_name")
    @ExcludeMissing
    private val middleName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("source_id")
    @ExcludeMissing
    private val sourceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("start_date")
    @ExcludeMissing
    private val startDate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("title") @ExcludeMissing private val title: JsonField<String> = JsonMissing.of(),
    @JsonProperty("work_id")
    @ExcludeMissing
    private val workId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * string A stable Finch `id` (UUID v4) for an individual in the company.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /**
     * Worker's compensation classification code for this employee
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun classCode(): Optional<String> = Optional.ofNullable(classCode.getNullable("class_code"))

    /**
     * Custom fields for the individual. These are fields which are defined by the employer in the
     * system.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFields(): Optional<List<CustomField>> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    /**
     * The department object.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun department(): Optional<Department> =
        Optional.ofNullable(department.getNullable("department"))

    /**
     * The employment object.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun employment(): Optional<Employment> =
        Optional.ofNullable(employment.getNullable("employment"))

    /**
     * The detailed employment status of the individual. Available options: `active`, `deceased`,
     * `leave`, `onboarding`, `prehire`, `retired`, `terminated`.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun employmentStatus(): Optional<EmploymentStatus> =
        Optional.ofNullable(employmentStatus.getNullable("employment_status"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDate(): Optional<String> = Optional.ofNullable(endDate.getNullable("end_date"))

    /**
     * The legal first name of the individual.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = Optional.ofNullable(firstName.getNullable("first_name"))

    /**
     * The employee's income as reported by the provider. This may not always be annualized income,
     * but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what information the
     * provider returns.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun income(): Optional<Income> = Optional.ofNullable(income.getNullable("income"))

    /**
     * The array of income history.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun incomeHistory(): Optional<List<Income?>> =
        Optional.ofNullable(incomeHistory.getNullable("income_history"))

    /**
     * `true` if the individual an an active employee or contractor at the company.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isActive(): Optional<Boolean> = Optional.ofNullable(isActive.getNullable("is_active"))

    /**
     * The legal last name of the individual.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = Optional.ofNullable(lastName.getNullable("last_name"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latestRehireDate(): Optional<String> =
        Optional.ofNullable(latestRehireDate.getNullable("latest_rehire_date"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun location(): Optional<Location> = Optional.ofNullable(location.getNullable("location"))

    /**
     * The manager object representing the manager of the individual within the org.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun manager(): Optional<Manager> = Optional.ofNullable(manager.getNullable("manager"))

    /**
     * The legal middle name of the individual.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun middleName(): Optional<String> = Optional.ofNullable(middleName.getNullable("middle_name"))

    /**
     * The source system's unique employment identifier for this individual
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceId(): Optional<String> = Optional.ofNullable(sourceId.getNullable("source_id"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDate(): Optional<String> = Optional.ofNullable(startDate.getNullable("start_date"))

    /**
     * The current title of the individual.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = Optional.ofNullable(title.getNullable("title"))

    /**
     * This field is deprecated in favour of `source_id`
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun workId(): Optional<String> = Optional.ofNullable(workId.getNullable("work_id"))

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [classCode].
     *
     * Unlike [classCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("class_code") @ExcludeMissing fun _classCode(): JsonField<String> = classCode

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<List<CustomField>> = customFields

    /**
     * Returns the raw JSON value of [department].
     *
     * Unlike [department], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("department")
    @ExcludeMissing
    fun _department(): JsonField<Department> = department

    /**
     * Returns the raw JSON value of [employment].
     *
     * Unlike [employment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("employment")
    @ExcludeMissing
    fun _employment(): JsonField<Employment> = employment

    /**
     * Returns the raw JSON value of [employmentStatus].
     *
     * Unlike [employmentStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("employment_status")
    @ExcludeMissing
    fun _employmentStatus(): JsonField<EmploymentStatus> = employmentStatus

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<String> = endDate

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [income].
     *
     * Unlike [income], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("income") @ExcludeMissing fun _income(): JsonField<Income> = income

    /**
     * Returns the raw JSON value of [incomeHistory].
     *
     * Unlike [incomeHistory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("income_history")
    @ExcludeMissing
    fun _incomeHistory(): JsonField<List<Income?>> = incomeHistory

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
     * Returns the raw JSON value of [latestRehireDate].
     *
     * Unlike [latestRehireDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("latest_rehire_date")
    @ExcludeMissing
    fun _latestRehireDate(): JsonField<String> = latestRehireDate

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<Location> = location

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

    /**
     * Returns the raw JSON value of [sourceId].
     *
     * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_id") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_date") @ExcludeMissing fun _startDate(): JsonField<String> = startDate

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

    /**
     * Returns the raw JSON value of [workId].
     *
     * Unlike [workId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("work_id")
    @ExcludeMissing
    fun _workId(): JsonField<String> = workId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EmploymentData = apply {
        if (validated) {
            return@apply
        }

        id()
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
        workId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [EmploymentData]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmploymentData]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
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
        private var workId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(employmentData: EmploymentData) = apply {
            id = employmentData.id
            classCode = employmentData.classCode
            customFields = employmentData.customFields.map { it.toMutableList() }
            department = employmentData.department
            employment = employmentData.employment
            employmentStatus = employmentData.employmentStatus
            endDate = employmentData.endDate
            firstName = employmentData.firstName
            income = employmentData.income
            incomeHistory = employmentData.incomeHistory.map { it.toMutableList() }
            isActive = employmentData.isActive
            lastName = employmentData.lastName
            latestRehireDate = employmentData.latestRehireDate
            location = employmentData.location
            manager = employmentData.manager
            middleName = employmentData.middleName
            sourceId = employmentData.sourceId
            startDate = employmentData.startDate
            title = employmentData.title
            workId = employmentData.workId
            additionalProperties = employmentData.additionalProperties.toMutableMap()
        }

        /** string A stable Finch `id` (UUID v4) for an individual in the company. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Worker's compensation classification code for this employee */
        fun classCode(classCode: String?) = classCode(JsonField.ofNullable(classCode))

        /** Alias for calling [Builder.classCode] with `classCode.orElse(null)`. */
        fun classCode(classCode: Optional<String>) = classCode(classCode.getOrNull())

        /**
         * Sets [Builder.classCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.classCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun classCode(classCode: JsonField<String>) = apply { this.classCode = classCode }

        /**
         * Custom fields for the individual. These are fields which are defined by the employer in
         * the system.
         */
        fun customFields(customFields: List<CustomField>?) =
            customFields(JsonField.ofNullable(customFields))

        /** Alias for calling [Builder.customFields] with `customFields.orElse(null)`. */
        fun customFields(customFields: Optional<List<CustomField>>) =
            customFields(customFields.getOrNull())

        /**
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed `List<CustomField>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customFields(customFields: JsonField<List<CustomField>>) = apply {
            this.customFields = customFields.map { it.toMutableList() }
        }

        /**
         * Adds a single [CustomField] to [customFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomField(customField: CustomField) = apply {
            customFields =
                (customFields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("customFields", it).add(customField)
                }
        }

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

        /** The employment object. */
        fun employment(employment: Employment?) = employment(JsonField.ofNullable(employment))

        /** Alias for calling [Builder.employment] with `employment.orElse(null)`. */
        fun employment(employment: Optional<Employment>) = employment(employment.getOrNull())

        /**
         * Sets [Builder.employment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.employment] with a well-typed [Employment] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun employment(employment: JsonField<Employment>) = apply { this.employment = employment }

        /**
         * The detailed employment status of the individual. Available options: `active`,
         * `deceased`, `leave`, `onboarding`, `prehire`, `retired`, `terminated`.
         */
        fun employmentStatus(employmentStatus: EmploymentStatus?) =
            employmentStatus(JsonField.ofNullable(employmentStatus))

        /** Alias for calling [Builder.employmentStatus] with `employmentStatus.orElse(null)`. */
        fun employmentStatus(employmentStatus: Optional<EmploymentStatus>) =
            employmentStatus(employmentStatus.getOrNull())

        /**
         * Sets [Builder.employmentStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.employmentStatus] with a well-typed [EmploymentStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun employmentStatus(employmentStatus: JsonField<EmploymentStatus>) = apply {
            this.employmentStatus = employmentStatus
        }

        fun endDate(endDate: String?) = endDate(JsonField.ofNullable(endDate))

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<String>) = endDate(endDate.getOrNull())

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endDate(endDate: JsonField<String>) = apply { this.endDate = endDate }

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

        /**
         * The employee's income as reported by the provider. This may not always be annualized
         * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
         * information the provider returns.
         */
        fun income(income: Income?) = income(JsonField.ofNullable(income))

        /** Alias for calling [Builder.income] with `income.orElse(null)`. */
        fun income(income: Optional<Income>) = income(income.getOrNull())

        /**
         * Sets [Builder.income] to an arbitrary JSON value.
         *
         * You should usually call [Builder.income] with a well-typed [Income] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun income(income: JsonField<Income>) = apply { this.income = income }

        /** The array of income history. */
        fun incomeHistory(incomeHistory: List<Income?>?) =
            incomeHistory(JsonField.ofNullable(incomeHistory))

        /** Alias for calling [Builder.incomeHistory] with `incomeHistory.orElse(null)`. */
        fun incomeHistory(incomeHistory: Optional<List<Income?>>) =
            incomeHistory(incomeHistory.getOrNull())

        /**
         * Sets [Builder.incomeHistory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.incomeHistory] with a well-typed `List<Income?>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun incomeHistory(incomeHistory: JsonField<List<Income?>>) = apply {
            this.incomeHistory = incomeHistory.map { it.toMutableList() }
        }

        /**
         * Adds a single [Income] to [Builder.incomeHistory].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIncomeHistory(incomeHistory: Income) = apply {
            this.incomeHistory =
                (this.incomeHistory ?: JsonField.of(mutableListOf())).also {
                    checkKnown("incomeHistory", it).add(incomeHistory)
                }
        }

        /** `true` if the individual an an active employee or contractor at the company. */
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

        fun latestRehireDate(latestRehireDate: String?) =
            latestRehireDate(JsonField.ofNullable(latestRehireDate))

        /** Alias for calling [Builder.latestRehireDate] with `latestRehireDate.orElse(null)`. */
        fun latestRehireDate(latestRehireDate: Optional<String>) =
            latestRehireDate(latestRehireDate.getOrNull())

        /**
         * Sets [Builder.latestRehireDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latestRehireDate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun latestRehireDate(latestRehireDate: JsonField<String>) = apply {
            this.latestRehireDate = latestRehireDate
        }

        fun location(location: Location?) = location(JsonField.ofNullable(location))

        /** Alias for calling [Builder.location] with `location.orElse(null)`. */
        fun location(location: Optional<Location>) = location(location.getOrNull())

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [Location] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun location(location: JsonField<Location>) = apply { this.location = location }

        /** The manager object representing the manager of the individual within the org. */
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

        /** The source system's unique employment identifier for this individual */
        fun sourceId(sourceId: String?) = sourceId(JsonField.ofNullable(sourceId))

        /** Alias for calling [Builder.sourceId] with `sourceId.orElse(null)`. */
        fun sourceId(sourceId: Optional<String>) = sourceId(sourceId.getOrNull())

        /**
         * Sets [Builder.sourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

        fun startDate(startDate: String?) = startDate(JsonField.ofNullable(startDate))

        /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
        fun startDate(startDate: Optional<String>) = startDate(startDate.getOrNull())

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startDate(startDate: JsonField<String>) = apply { this.startDate = startDate }

        /** The current title of the individual. */
        fun title(title: String?) = title(JsonField.ofNullable(title))

        /** Alias for calling [Builder.title] with `title.orElse(null)`. */
        fun title(title: Optional<String>) = title(title.getOrNull())

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

        /** This field is deprecated in favour of `source_id` */
        @Deprecated("deprecated") fun workId(workId: String?) = workId(JsonField.ofNullable(workId))

        /** Alias for calling [Builder.workId] with `workId.orElse(null)`. */
        @Deprecated("deprecated") fun workId(workId: Optional<String>) = workId(workId.getOrNull())

        /**
         * Sets [Builder.workId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun workId(workId: JsonField<String>) = apply { this.workId = workId }

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
         * Returns an immutable instance of [EmploymentData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EmploymentData =
            EmploymentData(
                id,
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
                workId,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class CustomField
    @JsonCreator
    private constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing private val value: JsonValue = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        @JsonProperty("value") @ExcludeMissing fun _value(): JsonValue = value

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomField = apply {
            if (validated) {
                return@apply
            }

            name()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CustomField]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomField]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var value: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customField: CustomField) = apply {
                name = customField.name
                value = customField.value
                additionalProperties = customField.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun value(value: JsonValue) = apply { this.value = value }

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
             * Returns an immutable instance of [CustomField].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomField = CustomField(name, value, additionalProperties.toImmutable())
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
    @NoAutoDetect
    class Department
    @JsonCreator
    private constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The name of the department associated with the individual.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Department = apply {
            if (validated) {
                return@apply
            }

            name()
            validated = true
        }

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

            /** The name of the department associated with the individual. */
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
    @NoAutoDetect
    class Employment
    @JsonCreator
    private constructor(
        @JsonProperty("subtype")
        @ExcludeMissing
        private val subtype: JsonField<Subtype> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The secondary employment type of the individual. Options: `full_time`, `part_time`,
         * `intern`, `temp`, `seasonal` and `individual_contractor`.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subtype(): Optional<Subtype> = Optional.ofNullable(subtype.getNullable("subtype"))

        /**
         * The main employment type of the individual.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        /**
         * Returns the raw JSON value of [subtype].
         *
         * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subtype") @ExcludeMissing fun _subtype(): JsonField<Subtype> = subtype

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Employment = apply {
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
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Employment]. */
        class Builder internal constructor() {

            private var subtype: JsonField<Subtype> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(employment: Employment) = apply {
                subtype = employment.subtype
                type = employment.type
                additionalProperties = employment.additionalProperties.toMutableMap()
            }

            /**
             * The secondary employment type of the individual. Options: `full_time`, `part_time`,
             * `intern`, `temp`, `seasonal` and `individual_contractor`.
             */
            fun subtype(subtype: Subtype?) = subtype(JsonField.ofNullable(subtype))

            /** Alias for calling [Builder.subtype] with `subtype.orElse(null)`. */
            fun subtype(subtype: Optional<Subtype>) = subtype(subtype.getOrNull())

            /**
             * Sets [Builder.subtype] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subtype] with a well-typed [Subtype] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subtype(subtype: JsonField<Subtype>) = apply { this.subtype = subtype }

            /** The main employment type of the individual. */
            fun type(type: Type?) = type(JsonField.ofNullable(type))

            /** Alias for calling [Builder.type] with `type.orElse(null)`. */
            fun type(type: Optional<Type>) = type(type.getOrNull())

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [Employment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Employment = Employment(subtype, type, additionalProperties.toImmutable())
        }

        /**
         * The secondary employment type of the individual. Options: `full_time`, `part_time`,
         * `intern`, `temp`, `seasonal` and `individual_contractor`.
         */
        class Subtype @JsonCreator private constructor(private val value: JsonField<String>) :
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FULL_TIME,
                INTERN,
                PART_TIME,
                TEMP,
                SEASONAL,
                INDIVIDUAL_CONTRACTOR,
                /**
                 * An enum member indicating that [Subtype] was instantiated with an unknown value.
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
             * @throws FinchInvalidDataException if this class instance's value is a not a known
             *   member.
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
             * @throws FinchInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    FinchInvalidDataException("Value is not a String")
                }

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
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * @throws FinchInvalidDataException if this class instance's value is a not a known
             *   member.
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
             * @throws FinchInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    FinchInvalidDataException("Value is not a String")
                }

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

        override fun toString() =
            "Employment{subtype=$subtype, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * The detailed employment status of the individual. Available options: `active`, `deceased`,
     * `leave`, `onboarding`, `prehire`, `retired`, `terminated`.
     */
    class EmploymentStatus @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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
         * An enum containing [EmploymentStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EmploymentStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
             * An enum member indicating that [EmploymentStatus] was instantiated with an unknown
             * value.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws FinchInvalidDataException if this class instance's value is a not a known member.
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws FinchInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { FinchInvalidDataException("Value is not a String") }

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
    class Manager
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * A stable Finch `id` (UUID v4) for an individual in the company.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Manager = apply {
            if (validated) {
                return@apply
            }

            id()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Manager]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Manager]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
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
             */
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

        return /* spotless:off */ other is EmploymentData && id == other.id && classCode == other.classCode && customFields == other.customFields && department == other.department && employment == other.employment && employmentStatus == other.employmentStatus && endDate == other.endDate && firstName == other.firstName && income == other.income && incomeHistory == other.incomeHistory && isActive == other.isActive && lastName == other.lastName && latestRehireDate == other.latestRehireDate && location == other.location && manager == other.manager && middleName == other.middleName && sourceId == other.sourceId && startDate == other.startDate && title == other.title && workId == other.workId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, classCode, customFields, department, employment, employmentStatus, endDate, firstName, income, incomeHistory, isActive, lastName, latestRehireDate, location, manager, middleName, sourceId, startDate, title, workId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmploymentData{id=$id, classCode=$classCode, customFields=$customFields, department=$department, employment=$employment, employmentStatus=$employmentStatus, endDate=$endDate, firstName=$firstName, income=$income, incomeHistory=$incomeHistory, isActive=$isActive, lastName=$lastName, latestRehireDate=$latestRehireDate, location=$location, manager=$manager, middleName=$middleName, sourceId=$sourceId, startDate=$startDate, title=$title, workId=$workId, additionalProperties=$additionalProperties}"
}

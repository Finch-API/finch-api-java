// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

/** Update sandbox employment */
class SandboxEmploymentUpdateParams
constructor(
    private val individualId: String,
    private val body: SandboxEmploymentUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun individualId(): String = individualId

    /** Worker's compensation classification code for this employee */
    fun classCode(): Optional<String> = body.classCode()

    /**
     * Custom fields for the individual. These are fields which are defined by the employer in the
     * system. Custom fields are not currently supported for assisted connections.
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
     * The employee's income as reported by the provider. This may not always be annualized income,
     * but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what information the
     * provider returns.
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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): SandboxEmploymentUpdateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> individualId
            else -> ""
        }
    }

    @NoAutoDetect
    class SandboxEmploymentUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("class_code") private val classCode: String?,
        @JsonProperty("custom_fields") private val customFields: List<CustomField>?,
        @JsonProperty("department") private val department: Department?,
        @JsonProperty("employment") private val employment: Employment?,
        @JsonProperty("employment_status") private val employmentStatus: EmploymentStatus?,
        @JsonProperty("end_date") private val endDate: String?,
        @JsonProperty("first_name") private val firstName: String?,
        @JsonProperty("income") private val income: Income?,
        @JsonProperty("income_history") private val incomeHistory: List<Income?>?,
        @JsonProperty("is_active") private val isActive: Boolean?,
        @JsonProperty("last_name") private val lastName: String?,
        @JsonProperty("latest_rehire_date") private val latestRehireDate: String?,
        @JsonProperty("location") private val location: Location?,
        @JsonProperty("manager") private val manager: Manager?,
        @JsonProperty("middle_name") private val middleName: String?,
        @JsonProperty("source_id") private val sourceId: String?,
        @JsonProperty("start_date") private val startDate: String?,
        @JsonProperty("title") private val title: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Worker's compensation classification code for this employee */
        @JsonProperty("class_code")
        fun classCode(): Optional<String> = Optional.ofNullable(classCode)

        /**
         * Custom fields for the individual. These are fields which are defined by the employer in
         * the system. Custom fields are not currently supported for assisted connections.
         */
        @JsonProperty("custom_fields")
        fun customFields(): Optional<List<CustomField>> = Optional.ofNullable(customFields)

        /** The department object. */
        @JsonProperty("department")
        fun department(): Optional<Department> = Optional.ofNullable(department)

        /** The employment object. */
        @JsonProperty("employment")
        fun employment(): Optional<Employment> = Optional.ofNullable(employment)

        /** The detailed employment status of the individual. */
        @JsonProperty("employment_status")
        fun employmentStatus(): Optional<EmploymentStatus> = Optional.ofNullable(employmentStatus)

        @JsonProperty("end_date") fun endDate(): Optional<String> = Optional.ofNullable(endDate)

        /** The legal first name of the individual. */
        @JsonProperty("first_name")
        fun firstName(): Optional<String> = Optional.ofNullable(firstName)

        /**
         * The employee's income as reported by the provider. This may not always be annualized
         * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
         * information the provider returns.
         */
        @JsonProperty("income") fun income(): Optional<Income> = Optional.ofNullable(income)

        /** The array of income history. */
        @JsonProperty("income_history")
        fun incomeHistory(): Optional<List<Income?>> = Optional.ofNullable(incomeHistory)

        /** `true` if the individual an an active employee or contractor at the company. */
        @JsonProperty("is_active") fun isActive(): Optional<Boolean> = Optional.ofNullable(isActive)

        /** The legal last name of the individual. */
        @JsonProperty("last_name") fun lastName(): Optional<String> = Optional.ofNullable(lastName)

        @JsonProperty("latest_rehire_date")
        fun latestRehireDate(): Optional<String> = Optional.ofNullable(latestRehireDate)

        @JsonProperty("location") fun location(): Optional<Location> = Optional.ofNullable(location)

        /** The manager object representing the manager of the individual within the org. */
        @JsonProperty("manager") fun manager(): Optional<Manager> = Optional.ofNullable(manager)

        /** The legal middle name of the individual. */
        @JsonProperty("middle_name")
        fun middleName(): Optional<String> = Optional.ofNullable(middleName)

        /** The source system's unique employment identifier for this individual */
        @JsonProperty("source_id") fun sourceId(): Optional<String> = Optional.ofNullable(sourceId)

        @JsonProperty("start_date")
        fun startDate(): Optional<String> = Optional.ofNullable(startDate)

        /** The current title of the individual. */
        @JsonProperty("title") fun title(): Optional<String> = Optional.ofNullable(title)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var classCode: String? = null
            private var customFields: MutableList<CustomField>? = null
            private var department: Department? = null
            private var employment: Employment? = null
            private var employmentStatus: EmploymentStatus? = null
            private var endDate: String? = null
            private var firstName: String? = null
            private var income: Income? = null
            private var incomeHistory: MutableList<Income?>? = null
            private var isActive: Boolean? = null
            private var lastName: String? = null
            private var latestRehireDate: String? = null
            private var location: Location? = null
            private var manager: Manager? = null
            private var middleName: String? = null
            private var sourceId: String? = null
            private var startDate: String? = null
            private var title: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sandboxEmploymentUpdateBody: SandboxEmploymentUpdateBody) = apply {
                classCode = sandboxEmploymentUpdateBody.classCode
                customFields = sandboxEmploymentUpdateBody.customFields?.toMutableList()
                department = sandboxEmploymentUpdateBody.department
                employment = sandboxEmploymentUpdateBody.employment
                employmentStatus = sandboxEmploymentUpdateBody.employmentStatus
                endDate = sandboxEmploymentUpdateBody.endDate
                firstName = sandboxEmploymentUpdateBody.firstName
                income = sandboxEmploymentUpdateBody.income
                incomeHistory = sandboxEmploymentUpdateBody.incomeHistory?.toMutableList()
                isActive = sandboxEmploymentUpdateBody.isActive
                lastName = sandboxEmploymentUpdateBody.lastName
                latestRehireDate = sandboxEmploymentUpdateBody.latestRehireDate
                location = sandboxEmploymentUpdateBody.location
                manager = sandboxEmploymentUpdateBody.manager
                middleName = sandboxEmploymentUpdateBody.middleName
                sourceId = sandboxEmploymentUpdateBody.sourceId
                startDate = sandboxEmploymentUpdateBody.startDate
                title = sandboxEmploymentUpdateBody.title
                additionalProperties =
                    sandboxEmploymentUpdateBody.additionalProperties.toMutableMap()
            }

            /** Worker's compensation classification code for this employee */
            fun classCode(classCode: String?) = apply { this.classCode = classCode }

            /** Worker's compensation classification code for this employee */
            fun classCode(classCode: Optional<String>) = classCode(classCode.orElse(null))

            /**
             * Custom fields for the individual. These are fields which are defined by the employer
             * in the system. Custom fields are not currently supported for assisted connections.
             */
            fun customFields(customFields: List<CustomField>?) = apply {
                this.customFields = customFields?.toMutableList()
            }

            /**
             * Custom fields for the individual. These are fields which are defined by the employer
             * in the system. Custom fields are not currently supported for assisted connections.
             */
            fun customFields(customFields: Optional<List<CustomField>>) =
                customFields(customFields.orElse(null))

            /**
             * Custom fields for the individual. These are fields which are defined by the employer
             * in the system. Custom fields are not currently supported for assisted connections.
             */
            fun addCustomField(customField: CustomField) = apply {
                customFields = (customFields ?: mutableListOf()).apply { add(customField) }
            }

            /** The department object. */
            fun department(department: Department?) = apply { this.department = department }

            /** The department object. */
            fun department(department: Optional<Department>) = department(department.orElse(null))

            /** The employment object. */
            fun employment(employment: Employment?) = apply { this.employment = employment }

            /** The employment object. */
            fun employment(employment: Optional<Employment>) = employment(employment.orElse(null))

            /** The detailed employment status of the individual. */
            fun employmentStatus(employmentStatus: EmploymentStatus?) = apply {
                this.employmentStatus = employmentStatus
            }

            /** The detailed employment status of the individual. */
            fun employmentStatus(employmentStatus: Optional<EmploymentStatus>) =
                employmentStatus(employmentStatus.orElse(null))

            fun endDate(endDate: String?) = apply { this.endDate = endDate }

            fun endDate(endDate: Optional<String>) = endDate(endDate.orElse(null))

            /** The legal first name of the individual. */
            fun firstName(firstName: String?) = apply { this.firstName = firstName }

            /** The legal first name of the individual. */
            fun firstName(firstName: Optional<String>) = firstName(firstName.orElse(null))

            /**
             * The employee's income as reported by the provider. This may not always be annualized
             * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
             * information the provider returns.
             */
            fun income(income: Income?) = apply { this.income = income }

            /**
             * The employee's income as reported by the provider. This may not always be annualized
             * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
             * information the provider returns.
             */
            fun income(income: Optional<Income>) = income(income.orElse(null))

            /** The array of income history. */
            fun incomeHistory(incomeHistory: List<Income?>?) = apply {
                this.incomeHistory = incomeHistory?.toMutableList()
            }

            /** The array of income history. */
            fun incomeHistory(incomeHistory: Optional<List<Income?>>) =
                incomeHistory(incomeHistory.orElse(null))

            /** The array of income history. */
            fun addIncomeHistory(incomeHistory: Income) = apply {
                this.incomeHistory =
                    (this.incomeHistory ?: mutableListOf()).apply { add(incomeHistory) }
            }

            /** `true` if the individual an an active employee or contractor at the company. */
            fun isActive(isActive: Boolean?) = apply { this.isActive = isActive }

            /** `true` if the individual an an active employee or contractor at the company. */
            fun isActive(isActive: Boolean) = isActive(isActive as Boolean?)

            /** `true` if the individual an an active employee or contractor at the company. */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun isActive(isActive: Optional<Boolean>) = isActive(isActive.orElse(null) as Boolean?)

            /** The legal last name of the individual. */
            fun lastName(lastName: String?) = apply { this.lastName = lastName }

            /** The legal last name of the individual. */
            fun lastName(lastName: Optional<String>) = lastName(lastName.orElse(null))

            fun latestRehireDate(latestRehireDate: String?) = apply {
                this.latestRehireDate = latestRehireDate
            }

            fun latestRehireDate(latestRehireDate: Optional<String>) =
                latestRehireDate(latestRehireDate.orElse(null))

            fun location(location: Location?) = apply { this.location = location }

            fun location(location: Optional<Location>) = location(location.orElse(null))

            /** The manager object representing the manager of the individual within the org. */
            fun manager(manager: Manager?) = apply { this.manager = manager }

            /** The manager object representing the manager of the individual within the org. */
            fun manager(manager: Optional<Manager>) = manager(manager.orElse(null))

            /** The legal middle name of the individual. */
            fun middleName(middleName: String?) = apply { this.middleName = middleName }

            /** The legal middle name of the individual. */
            fun middleName(middleName: Optional<String>) = middleName(middleName.orElse(null))

            /** The source system's unique employment identifier for this individual */
            fun sourceId(sourceId: String?) = apply { this.sourceId = sourceId }

            /** The source system's unique employment identifier for this individual */
            fun sourceId(sourceId: Optional<String>) = sourceId(sourceId.orElse(null))

            fun startDate(startDate: String?) = apply { this.startDate = startDate }

            fun startDate(startDate: Optional<String>) = startDate(startDate.orElse(null))

            /** The current title of the individual. */
            fun title(title: String?) = apply { this.title = title }

            /** The current title of the individual. */
            fun title(title: Optional<String>) = title(title.orElse(null))

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

            fun build(): SandboxEmploymentUpdateBody =
                SandboxEmploymentUpdateBody(
                    classCode,
                    customFields?.toImmutable(),
                    department,
                    employment,
                    employmentStatus,
                    endDate,
                    firstName,
                    income,
                    incomeHistory?.toImmutable(),
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

            return /* spotless:off */ other is SandboxEmploymentUpdateBody && classCode == other.classCode && customFields == other.customFields && department == other.department && employment == other.employment && employmentStatus == other.employmentStatus && endDate == other.endDate && firstName == other.firstName && income == other.income && incomeHistory == other.incomeHistory && isActive == other.isActive && lastName == other.lastName && latestRehireDate == other.latestRehireDate && location == other.location && manager == other.manager && middleName == other.middleName && sourceId == other.sourceId && startDate == other.startDate && title == other.title && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(classCode, customFields, department, employment, employmentStatus, endDate, firstName, income, incomeHistory, isActive, lastName, latestRehireDate, location, manager, middleName, sourceId, startDate, title, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SandboxEmploymentUpdateBody{classCode=$classCode, customFields=$customFields, department=$department, employment=$employment, employmentStatus=$employmentStatus, endDate=$endDate, firstName=$firstName, income=$income, incomeHistory=$incomeHistory, isActive=$isActive, lastName=$lastName, latestRehireDate=$latestRehireDate, location=$location, manager=$manager, middleName=$middleName, sourceId=$sourceId, startDate=$startDate, title=$title, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var individualId: String? = null
        private var body: SandboxEmploymentUpdateBody.Builder =
            SandboxEmploymentUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sandboxEmploymentUpdateParams: SandboxEmploymentUpdateParams) = apply {
            individualId = sandboxEmploymentUpdateParams.individualId
            body = sandboxEmploymentUpdateParams.body.toBuilder()
            additionalHeaders = sandboxEmploymentUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = sandboxEmploymentUpdateParams.additionalQueryParams.toBuilder()
        }

        fun individualId(individualId: String) = apply { this.individualId = individualId }

        /** Worker's compensation classification code for this employee */
        fun classCode(classCode: String?) = apply { body.classCode(classCode) }

        /** Worker's compensation classification code for this employee */
        fun classCode(classCode: Optional<String>) = classCode(classCode.orElse(null))

        /**
         * Custom fields for the individual. These are fields which are defined by the employer in
         * the system. Custom fields are not currently supported for assisted connections.
         */
        fun customFields(customFields: List<CustomField>?) = apply {
            body.customFields(customFields)
        }

        /**
         * Custom fields for the individual. These are fields which are defined by the employer in
         * the system. Custom fields are not currently supported for assisted connections.
         */
        fun customFields(customFields: Optional<List<CustomField>>) =
            customFields(customFields.orElse(null))

        /**
         * Custom fields for the individual. These are fields which are defined by the employer in
         * the system. Custom fields are not currently supported for assisted connections.
         */
        fun addCustomField(customField: CustomField) = apply { body.addCustomField(customField) }

        /** The department object. */
        fun department(department: Department?) = apply { body.department(department) }

        /** The department object. */
        fun department(department: Optional<Department>) = department(department.orElse(null))

        /** The employment object. */
        fun employment(employment: Employment?) = apply { body.employment(employment) }

        /** The employment object. */
        fun employment(employment: Optional<Employment>) = employment(employment.orElse(null))

        /** The detailed employment status of the individual. */
        fun employmentStatus(employmentStatus: EmploymentStatus?) = apply {
            body.employmentStatus(employmentStatus)
        }

        /** The detailed employment status of the individual. */
        fun employmentStatus(employmentStatus: Optional<EmploymentStatus>) =
            employmentStatus(employmentStatus.orElse(null))

        fun endDate(endDate: String?) = apply { body.endDate(endDate) }

        fun endDate(endDate: Optional<String>) = endDate(endDate.orElse(null))

        /** The legal first name of the individual. */
        fun firstName(firstName: String?) = apply { body.firstName(firstName) }

        /** The legal first name of the individual. */
        fun firstName(firstName: Optional<String>) = firstName(firstName.orElse(null))

        /**
         * The employee's income as reported by the provider. This may not always be annualized
         * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
         * information the provider returns.
         */
        fun income(income: Income?) = apply { body.income(income) }

        /**
         * The employee's income as reported by the provider. This may not always be annualized
         * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
         * information the provider returns.
         */
        fun income(income: Optional<Income>) = income(income.orElse(null))

        /** The array of income history. */
        fun incomeHistory(incomeHistory: List<Income?>?) = apply {
            body.incomeHistory(incomeHistory)
        }

        /** The array of income history. */
        fun incomeHistory(incomeHistory: Optional<List<Income?>>) =
            incomeHistory(incomeHistory.orElse(null))

        /** The array of income history. */
        fun addIncomeHistory(incomeHistory: Income) = apply { body.addIncomeHistory(incomeHistory) }

        /** `true` if the individual an an active employee or contractor at the company. */
        fun isActive(isActive: Boolean?) = apply { body.isActive(isActive) }

        /** `true` if the individual an an active employee or contractor at the company. */
        fun isActive(isActive: Boolean) = isActive(isActive as Boolean?)

        /** `true` if the individual an an active employee or contractor at the company. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun isActive(isActive: Optional<Boolean>) = isActive(isActive.orElse(null) as Boolean?)

        /** The legal last name of the individual. */
        fun lastName(lastName: String?) = apply { body.lastName(lastName) }

        /** The legal last name of the individual. */
        fun lastName(lastName: Optional<String>) = lastName(lastName.orElse(null))

        fun latestRehireDate(latestRehireDate: String?) = apply {
            body.latestRehireDate(latestRehireDate)
        }

        fun latestRehireDate(latestRehireDate: Optional<String>) =
            latestRehireDate(latestRehireDate.orElse(null))

        fun location(location: Location?) = apply { body.location(location) }

        fun location(location: Optional<Location>) = location(location.orElse(null))

        /** The manager object representing the manager of the individual within the org. */
        fun manager(manager: Manager?) = apply { body.manager(manager) }

        /** The manager object representing the manager of the individual within the org. */
        fun manager(manager: Optional<Manager>) = manager(manager.orElse(null))

        /** The legal middle name of the individual. */
        fun middleName(middleName: String?) = apply { body.middleName(middleName) }

        /** The legal middle name of the individual. */
        fun middleName(middleName: Optional<String>) = middleName(middleName.orElse(null))

        /** The source system's unique employment identifier for this individual */
        fun sourceId(sourceId: String?) = apply { body.sourceId(sourceId) }

        /** The source system's unique employment identifier for this individual */
        fun sourceId(sourceId: Optional<String>) = sourceId(sourceId.orElse(null))

        fun startDate(startDate: String?) = apply { body.startDate(startDate) }

        fun startDate(startDate: Optional<String>) = startDate(startDate.orElse(null))

        /** The current title of the individual. */
        fun title(title: String?) = apply { body.title(title) }

        /** The current title of the individual. */
        fun title(title: Optional<String>) = title(title.orElse(null))

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun build(): SandboxEmploymentUpdateParams =
            SandboxEmploymentUpdateParams(
                checkNotNull(individualId) { "`individualId` is required but was not set" },
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class CustomField
    @JsonCreator
    private constructor(
        @JsonProperty("name") private val name: String?,
        @JsonProperty("value") private val value: JsonValue?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

        @JsonProperty("value") fun value(): Optional<JsonValue> = Optional.ofNullable(value)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var value: JsonValue? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customField: CustomField) = apply {
                name = customField.name
                value = customField.value
                additionalProperties = customField.additionalProperties.toMutableMap()
            }

            fun name(name: String?) = apply { this.name = name }

            fun name(name: Optional<String>) = name(name.orElse(null))

            fun value(value: JsonValue?) = apply { this.value = value }

            fun value(value: Optional<JsonValue>) = value(value.orElse(null))

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
    @NoAutoDetect
    class Department
    @JsonCreator
    private constructor(
        @JsonProperty("name") private val name: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The name of the department associated with the individual. */
        @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(department: Department) = apply {
                name = department.name
                additionalProperties = department.additionalProperties.toMutableMap()
            }

            /** The name of the department associated with the individual. */
            fun name(name: String?) = apply { this.name = name }

            /** The name of the department associated with the individual. */
            fun name(name: Optional<String>) = name(name.orElse(null))

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
        @JsonProperty("subtype") private val subtype: Subtype?,
        @JsonProperty("type") private val type: Type?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The secondary employment type of the individual. Options: `full_time`, `part_time`,
         * `intern`, `temp`, `seasonal` and `individual_contractor`.
         */
        @JsonProperty("subtype") fun subtype(): Optional<Subtype> = Optional.ofNullable(subtype)

        /** The main employment type of the individual. */
        @JsonProperty("type") fun type(): Optional<Type> = Optional.ofNullable(type)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var subtype: Subtype? = null
            private var type: Type? = null
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
            fun subtype(subtype: Subtype?) = apply { this.subtype = subtype }

            /**
             * The secondary employment type of the individual. Options: `full_time`, `part_time`,
             * `intern`, `temp`, `seasonal` and `individual_contractor`.
             */
            fun subtype(subtype: Optional<Subtype>) = subtype(subtype.orElse(null))

            /** The main employment type of the individual. */
            fun type(type: Type?) = apply { this.type = type }

            /** The main employment type of the individual. */
            fun type(type: Optional<Type>) = type(type.orElse(null))

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

            fun build(): Employment =
                Employment(
                    subtype,
                    type,
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

            return /* spotless:off */ other is Employment && subtype == other.subtype && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(subtype, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Employment{subtype=$subtype, type=$type, additionalProperties=$additionalProperties}"
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
    @NoAutoDetect
    class Manager
    @JsonCreator
    private constructor(
        @JsonProperty("id") private val id: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A stable Finch `id` (UUID v4) for an individual in the company. */
        @JsonProperty("id") fun id(): Optional<String> = Optional.ofNullable(id)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(manager: Manager) = apply {
                id = manager.id
                additionalProperties = manager.additionalProperties.toMutableMap()
            }

            /** A stable Finch `id` (UUID v4) for an individual in the company. */
            fun id(id: String?) = apply { this.id = id }

            /** A stable Finch `id` (UUID v4) for an individual in the company. */
            fun id(id: Optional<String>) = id(id.orElse(null))

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

        return /* spotless:off */ other is SandboxEmploymentUpdateParams && individualId == other.individualId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(individualId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SandboxEmploymentUpdateParams{individualId=$individualId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

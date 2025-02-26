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
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

/** Add new individuals to a sandbox company */
class SandboxDirectoryCreateParams
private constructor(
    private val body: List<IndividualOrEmployment>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Array of individuals to create. Takes all combined fields from `/individual` and
     * `/employment` endpoints. All fields are optional.
     */
    fun body(): Optional<List<IndividualOrEmployment>> = Optional.ofNullable(body)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic
    internal fun _body(): Optional<List<IndividualOrEmployment>> = Optional.ofNullable(body)

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class IndividualOrEmployment
    @JsonCreator
    private constructor(
        @JsonProperty("class_code")
        @ExcludeMissing
        private val classCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        private val customFields: JsonField<List<CustomField>> = JsonMissing.of(),
        @JsonProperty("department")
        @ExcludeMissing
        private val department: JsonField<Department> = JsonMissing.of(),
        @JsonProperty("dob") @ExcludeMissing private val dob: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emails")
        @ExcludeMissing
        private val emails: JsonField<List<Email>> = JsonMissing.of(),
        @JsonProperty("employment")
        @ExcludeMissing
        private val employment: JsonField<Employment> = JsonMissing.of(),
        @JsonProperty("employment_status")
        @ExcludeMissing
        private val employmentStatus: JsonField<EmploymentStatus> = JsonMissing.of(),
        @JsonProperty("encrypted_ssn")
        @ExcludeMissing
        private val encryptedSsn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ethnicity")
        @ExcludeMissing
        private val ethnicity: JsonField<Ethnicity> = JsonMissing.of(),
        @JsonProperty("first_name")
        @ExcludeMissing
        private val firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("gender")
        @ExcludeMissing
        private val gender: JsonField<Gender> = JsonMissing.of(),
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
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        private val phoneNumbers: JsonField<List<PhoneNumber?>> = JsonMissing.of(),
        @JsonProperty("preferred_name")
        @ExcludeMissing
        private val preferredName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("residence")
        @ExcludeMissing
        private val residence: JsonField<Location> = JsonMissing.of(),
        @JsonProperty("source_id")
        @ExcludeMissing
        private val sourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ssn") @ExcludeMissing private val ssn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("title")
        @ExcludeMissing
        private val title: JsonField<String> = JsonMissing.of(),
    ) {

        /** Worker's compensation classification code for this employee */
        fun classCode(): Optional<String> = Optional.ofNullable(classCode.getNullable("class_code"))

        /**
         * Custom fields for the individual. These are fields which are defined by the employer in
         * the system. Custom fields are not currently supported for assisted connections.
         */
        fun customFields(): Optional<List<CustomField>> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        /** The department object. */
        fun department(): Optional<Department> =
            Optional.ofNullable(department.getNullable("department"))

        fun dob(): Optional<String> = Optional.ofNullable(dob.getNullable("dob"))

        fun emails(): Optional<List<Email>> = Optional.ofNullable(emails.getNullable("emails"))

        /** The employment object. */
        fun employment(): Optional<Employment> =
            Optional.ofNullable(employment.getNullable("employment"))

        /** The detailed employment status of the individual. */
        fun employmentStatus(): Optional<EmploymentStatus> =
            Optional.ofNullable(employmentStatus.getNullable("employment_status"))

        /**
         * Social Security Number of the individual in **encrypted** format. This field is only
         * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param set
         * in the body.
         */
        fun encryptedSsn(): Optional<String> =
            Optional.ofNullable(encryptedSsn.getNullable("encrypted_ssn"))

        fun endDate(): Optional<String> = Optional.ofNullable(endDate.getNullable("end_date"))

        /** The EEOC-defined ethnicity of the individual. */
        fun ethnicity(): Optional<Ethnicity> =
            Optional.ofNullable(ethnicity.getNullable("ethnicity"))

        /** The legal first name of the individual. */
        fun firstName(): Optional<String> = Optional.ofNullable(firstName.getNullable("first_name"))

        /** The gender of the individual. */
        fun gender(): Optional<Gender> = Optional.ofNullable(gender.getNullable("gender"))

        /**
         * The employee's income as reported by the provider. This may not always be annualized
         * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
         * information the provider returns.
         */
        fun income(): Optional<Income> = Optional.ofNullable(income.getNullable("income"))

        /** The array of income history. */
        fun incomeHistory(): Optional<List<Income?>> =
            Optional.ofNullable(incomeHistory.getNullable("income_history"))

        /** `true` if the individual an an active employee or contractor at the company. */
        fun isActive(): Optional<Boolean> = Optional.ofNullable(isActive.getNullable("is_active"))

        /** The legal last name of the individual. */
        fun lastName(): Optional<String> = Optional.ofNullable(lastName.getNullable("last_name"))

        fun latestRehireDate(): Optional<String> =
            Optional.ofNullable(latestRehireDate.getNullable("latest_rehire_date"))

        fun location(): Optional<Location> = Optional.ofNullable(location.getNullable("location"))

        /** The manager object representing the manager of the individual within the org. */
        fun manager(): Optional<Manager> = Optional.ofNullable(manager.getNullable("manager"))

        /** The legal middle name of the individual. */
        fun middleName(): Optional<String> =
            Optional.ofNullable(middleName.getNullable("middle_name"))

        fun phoneNumbers(): Optional<List<PhoneNumber?>> =
            Optional.ofNullable(phoneNumbers.getNullable("phone_numbers"))

        /** The preferred name of the individual. */
        fun preferredName(): Optional<String> =
            Optional.ofNullable(preferredName.getNullable("preferred_name"))

        fun residence(): Optional<Location> =
            Optional.ofNullable(residence.getNullable("residence"))

        /** The source system's unique employment identifier for this individual */
        fun sourceId(): Optional<String> = Optional.ofNullable(sourceId.getNullable("source_id"))

        /**
         * Social Security Number of the individual. This field is only available with the `ssn`
         * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
         * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
         */
        fun ssn(): Optional<String> = Optional.ofNullable(ssn.getNullable("ssn"))

        fun startDate(): Optional<String> = Optional.ofNullable(startDate.getNullable("start_date"))

        /** The current title of the individual. */
        fun title(): Optional<String> = Optional.ofNullable(title.getNullable("title"))

        /** Worker's compensation classification code for this employee */
        @JsonProperty("class_code") @ExcludeMissing fun _classCode(): JsonField<String> = classCode

        /**
         * Custom fields for the individual. These are fields which are defined by the employer in
         * the system. Custom fields are not currently supported for assisted connections.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<List<CustomField>> = customFields

        /** The department object. */
        @JsonProperty("department")
        @ExcludeMissing
        fun _department(): JsonField<Department> = department

        @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<String> = dob

        @JsonProperty("emails") @ExcludeMissing fun _emails(): JsonField<List<Email>> = emails

        /** The employment object. */
        @JsonProperty("employment")
        @ExcludeMissing
        fun _employment(): JsonField<Employment> = employment

        /** The detailed employment status of the individual. */
        @JsonProperty("employment_status")
        @ExcludeMissing
        fun _employmentStatus(): JsonField<EmploymentStatus> = employmentStatus

        /**
         * Social Security Number of the individual in **encrypted** format. This field is only
         * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param set
         * in the body.
         */
        @JsonProperty("encrypted_ssn")
        @ExcludeMissing
        fun _encryptedSsn(): JsonField<String> = encryptedSsn

        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<String> = endDate

        /** The EEOC-defined ethnicity of the individual. */
        @JsonProperty("ethnicity")
        @ExcludeMissing
        fun _ethnicity(): JsonField<Ethnicity> = ethnicity

        /** The legal first name of the individual. */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /** The gender of the individual. */
        @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<Gender> = gender

        /**
         * The employee's income as reported by the provider. This may not always be annualized
         * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
         * information the provider returns.
         */
        @JsonProperty("income") @ExcludeMissing fun _income(): JsonField<Income> = income

        /** The array of income history. */
        @JsonProperty("income_history")
        @ExcludeMissing
        fun _incomeHistory(): JsonField<List<Income?>> = incomeHistory

        /** `true` if the individual an an active employee or contractor at the company. */
        @JsonProperty("is_active") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

        /** The legal last name of the individual. */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        @JsonProperty("latest_rehire_date")
        @ExcludeMissing
        fun _latestRehireDate(): JsonField<String> = latestRehireDate

        @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<Location> = location

        /** The manager object representing the manager of the individual within the org. */
        @JsonProperty("manager") @ExcludeMissing fun _manager(): JsonField<Manager> = manager

        /** The legal middle name of the individual. */
        @JsonProperty("middle_name")
        @ExcludeMissing
        fun _middleName(): JsonField<String> = middleName

        @JsonProperty("phone_numbers")
        @ExcludeMissing
        fun _phoneNumbers(): JsonField<List<PhoneNumber?>> = phoneNumbers

        /** The preferred name of the individual. */
        @JsonProperty("preferred_name")
        @ExcludeMissing
        fun _preferredName(): JsonField<String> = preferredName

        @JsonProperty("residence") @ExcludeMissing fun _residence(): JsonField<Location> = residence

        /** The source system's unique employment identifier for this individual */
        @JsonProperty("source_id") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

        /**
         * Social Security Number of the individual. This field is only available with the `ssn`
         * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
         * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
         */
        @JsonProperty("ssn") @ExcludeMissing fun _ssn(): JsonField<String> = ssn

        @JsonProperty("start_date") @ExcludeMissing fun _startDate(): JsonField<String> = startDate

        /** The current title of the individual. */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

        private var validated: Boolean = false

        fun validate(): IndividualOrEmployment = apply {
            if (validated) {
                return@apply
            }

            classCode()
            customFields().ifPresent { it.forEach { it.validate() } }
            department().ifPresent { it.validate() }
            dob()
            emails().ifPresent { it.forEach { it.validate() } }
            employment().ifPresent { it.validate() }
            employmentStatus()
            encryptedSsn()
            endDate()
            ethnicity()
            firstName()
            gender()
            income().ifPresent { it.validate() }
            incomeHistory().ifPresent { it.forEach { it?.validate() } }
            isActive()
            lastName()
            latestRehireDate()
            location().ifPresent { it.validate() }
            manager().ifPresent { it.validate() }
            middleName()
            phoneNumbers().ifPresent { it.forEach { it?.validate() } }
            preferredName()
            residence().ifPresent { it.validate() }
            sourceId()
            ssn()
            startDate()
            title()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [IndividualOrEmployment]. */
        class Builder internal constructor() {

            private var classCode: JsonField<String> = JsonMissing.of()
            private var customFields: JsonField<MutableList<CustomField>>? = null
            private var department: JsonField<Department> = JsonMissing.of()
            private var dob: JsonField<String> = JsonMissing.of()
            private var emails: JsonField<MutableList<Email>>? = null
            private var employment: JsonField<Employment> = JsonMissing.of()
            private var employmentStatus: JsonField<EmploymentStatus> = JsonMissing.of()
            private var encryptedSsn: JsonField<String> = JsonMissing.of()
            private var endDate: JsonField<String> = JsonMissing.of()
            private var ethnicity: JsonField<Ethnicity> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var gender: JsonField<Gender> = JsonMissing.of()
            private var income: JsonField<Income> = JsonMissing.of()
            private var incomeHistory: JsonField<MutableList<Income?>>? = null
            private var isActive: JsonField<Boolean> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var latestRehireDate: JsonField<String> = JsonMissing.of()
            private var location: JsonField<Location> = JsonMissing.of()
            private var manager: JsonField<Manager> = JsonMissing.of()
            private var middleName: JsonField<String> = JsonMissing.of()
            private var phoneNumbers: JsonField<MutableList<PhoneNumber?>>? = null
            private var preferredName: JsonField<String> = JsonMissing.of()
            private var residence: JsonField<Location> = JsonMissing.of()
            private var sourceId: JsonField<String> = JsonMissing.of()
            private var ssn: JsonField<String> = JsonMissing.of()
            private var startDate: JsonField<String> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()

            @JvmSynthetic
            internal fun from(individualOrEmployment: IndividualOrEmployment) = apply {
                classCode = individualOrEmployment.classCode
                customFields = individualOrEmployment.customFields.map { it.toMutableList() }
                department = individualOrEmployment.department
                dob = individualOrEmployment.dob
                emails = individualOrEmployment.emails.map { it.toMutableList() }
                employment = individualOrEmployment.employment
                employmentStatus = individualOrEmployment.employmentStatus
                encryptedSsn = individualOrEmployment.encryptedSsn
                endDate = individualOrEmployment.endDate
                ethnicity = individualOrEmployment.ethnicity
                firstName = individualOrEmployment.firstName
                gender = individualOrEmployment.gender
                income = individualOrEmployment.income
                incomeHistory = individualOrEmployment.incomeHistory.map { it.toMutableList() }
                isActive = individualOrEmployment.isActive
                lastName = individualOrEmployment.lastName
                latestRehireDate = individualOrEmployment.latestRehireDate
                location = individualOrEmployment.location
                manager = individualOrEmployment.manager
                middleName = individualOrEmployment.middleName
                phoneNumbers = individualOrEmployment.phoneNumbers.map { it.toMutableList() }
                preferredName = individualOrEmployment.preferredName
                residence = individualOrEmployment.residence
                sourceId = individualOrEmployment.sourceId
                ssn = individualOrEmployment.ssn
                startDate = individualOrEmployment.startDate
                title = individualOrEmployment.title
            }

            /** Worker's compensation classification code for this employee */
            fun classCode(classCode: String?) = classCode(JsonField.ofNullable(classCode))

            /** Worker's compensation classification code for this employee */
            fun classCode(classCode: Optional<String>) = classCode(classCode.orElse(null))

            /** Worker's compensation classification code for this employee */
            fun classCode(classCode: JsonField<String>) = apply { this.classCode = classCode }

            /**
             * Custom fields for the individual. These are fields which are defined by the employer
             * in the system. Custom fields are not currently supported for assisted connections.
             */
            fun customFields(customFields: List<CustomField>) =
                customFields(JsonField.of(customFields))

            /**
             * Custom fields for the individual. These are fields which are defined by the employer
             * in the system. Custom fields are not currently supported for assisted connections.
             */
            fun customFields(customFields: JsonField<List<CustomField>>) = apply {
                this.customFields = customFields.map { it.toMutableList() }
            }

            /**
             * Custom fields for the individual. These are fields which are defined by the employer
             * in the system. Custom fields are not currently supported for assisted connections.
             */
            fun addCustomField(customField: CustomField) = apply {
                customFields =
                    (customFields ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(customField)
                    }
            }

            /** The department object. */
            fun department(department: Department?) = department(JsonField.ofNullable(department))

            /** The department object. */
            fun department(department: Optional<Department>) = department(department.orElse(null))

            /** The department object. */
            fun department(department: JsonField<Department>) = apply {
                this.department = department
            }

            fun dob(dob: String?) = dob(JsonField.ofNullable(dob))

            fun dob(dob: Optional<String>) = dob(dob.orElse(null))

            fun dob(dob: JsonField<String>) = apply { this.dob = dob }

            fun emails(emails: List<Email>?) = emails(JsonField.ofNullable(emails))

            fun emails(emails: Optional<List<Email>>) = emails(emails.orElse(null))

            fun emails(emails: JsonField<List<Email>>) = apply {
                this.emails = emails.map { it.toMutableList() }
            }

            fun addEmail(email: Email) = apply {
                emails =
                    (emails ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(email)
                    }
            }

            /** The employment object. */
            fun employment(employment: Employment?) = employment(JsonField.ofNullable(employment))

            /** The employment object. */
            fun employment(employment: Optional<Employment>) = employment(employment.orElse(null))

            /** The employment object. */
            fun employment(employment: JsonField<Employment>) = apply {
                this.employment = employment
            }

            /** The detailed employment status of the individual. */
            fun employmentStatus(employmentStatus: EmploymentStatus?) =
                employmentStatus(JsonField.ofNullable(employmentStatus))

            /** The detailed employment status of the individual. */
            fun employmentStatus(employmentStatus: Optional<EmploymentStatus>) =
                employmentStatus(employmentStatus.orElse(null))

            /** The detailed employment status of the individual. */
            fun employmentStatus(employmentStatus: JsonField<EmploymentStatus>) = apply {
                this.employmentStatus = employmentStatus
            }

            /**
             * Social Security Number of the individual in **encrypted** format. This field is only
             * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param
             * set in the body.
             */
            fun encryptedSsn(encryptedSsn: String?) =
                encryptedSsn(JsonField.ofNullable(encryptedSsn))

            /**
             * Social Security Number of the individual in **encrypted** format. This field is only
             * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param
             * set in the body.
             */
            fun encryptedSsn(encryptedSsn: Optional<String>) =
                encryptedSsn(encryptedSsn.orElse(null))

            /**
             * Social Security Number of the individual in **encrypted** format. This field is only
             * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param
             * set in the body.
             */
            fun encryptedSsn(encryptedSsn: JsonField<String>) = apply {
                this.encryptedSsn = encryptedSsn
            }

            fun endDate(endDate: String?) = endDate(JsonField.ofNullable(endDate))

            fun endDate(endDate: Optional<String>) = endDate(endDate.orElse(null))

            fun endDate(endDate: JsonField<String>) = apply { this.endDate = endDate }

            /** The EEOC-defined ethnicity of the individual. */
            fun ethnicity(ethnicity: Ethnicity?) = ethnicity(JsonField.ofNullable(ethnicity))

            /** The EEOC-defined ethnicity of the individual. */
            fun ethnicity(ethnicity: Optional<Ethnicity>) = ethnicity(ethnicity.orElse(null))

            /** The EEOC-defined ethnicity of the individual. */
            fun ethnicity(ethnicity: JsonField<Ethnicity>) = apply { this.ethnicity = ethnicity }

            /** The legal first name of the individual. */
            fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

            /** The legal first name of the individual. */
            fun firstName(firstName: Optional<String>) = firstName(firstName.orElse(null))

            /** The legal first name of the individual. */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** The gender of the individual. */
            fun gender(gender: Gender?) = gender(JsonField.ofNullable(gender))

            /** The gender of the individual. */
            fun gender(gender: Optional<Gender>) = gender(gender.orElse(null))

            /** The gender of the individual. */
            fun gender(gender: JsonField<Gender>) = apply { this.gender = gender }

            /**
             * The employee's income as reported by the provider. This may not always be annualized
             * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
             * information the provider returns.
             */
            fun income(income: Income?) = income(JsonField.ofNullable(income))

            /**
             * The employee's income as reported by the provider. This may not always be annualized
             * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
             * information the provider returns.
             */
            fun income(income: Optional<Income>) = income(income.orElse(null))

            /**
             * The employee's income as reported by the provider. This may not always be annualized
             * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
             * information the provider returns.
             */
            fun income(income: JsonField<Income>) = apply { this.income = income }

            /** The array of income history. */
            fun incomeHistory(incomeHistory: List<Income?>?) =
                incomeHistory(JsonField.ofNullable(incomeHistory))

            /** The array of income history. */
            fun incomeHistory(incomeHistory: Optional<List<Income?>>) =
                incomeHistory(incomeHistory.orElse(null))

            /** The array of income history. */
            fun incomeHistory(incomeHistory: JsonField<List<Income?>>) = apply {
                this.incomeHistory = incomeHistory.map { it.toMutableList() }
            }

            /** The array of income history. */
            fun addIncomeHistory(incomeHistory: Income) = apply {
                this.incomeHistory =
                    (this.incomeHistory ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(incomeHistory)
                    }
            }

            /** `true` if the individual an an active employee or contractor at the company. */
            fun isActive(isActive: Boolean?) = isActive(JsonField.ofNullable(isActive))

            /** `true` if the individual an an active employee or contractor at the company. */
            fun isActive(isActive: Boolean) = isActive(isActive as Boolean?)

            /** `true` if the individual an an active employee or contractor at the company. */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun isActive(isActive: Optional<Boolean>) = isActive(isActive.orElse(null) as Boolean?)

            /** `true` if the individual an an active employee or contractor at the company. */
            fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

            /** The legal last name of the individual. */
            fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

            /** The legal last name of the individual. */
            fun lastName(lastName: Optional<String>) = lastName(lastName.orElse(null))

            /** The legal last name of the individual. */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            fun latestRehireDate(latestRehireDate: String?) =
                latestRehireDate(JsonField.ofNullable(latestRehireDate))

            fun latestRehireDate(latestRehireDate: Optional<String>) =
                latestRehireDate(latestRehireDate.orElse(null))

            fun latestRehireDate(latestRehireDate: JsonField<String>) = apply {
                this.latestRehireDate = latestRehireDate
            }

            fun location(location: Location?) = location(JsonField.ofNullable(location))

            fun location(location: Optional<Location>) = location(location.orElse(null))

            fun location(location: JsonField<Location>) = apply { this.location = location }

            /** The manager object representing the manager of the individual within the org. */
            fun manager(manager: Manager?) = manager(JsonField.ofNullable(manager))

            /** The manager object representing the manager of the individual within the org. */
            fun manager(manager: Optional<Manager>) = manager(manager.orElse(null))

            /** The manager object representing the manager of the individual within the org. */
            fun manager(manager: JsonField<Manager>) = apply { this.manager = manager }

            /** The legal middle name of the individual. */
            fun middleName(middleName: String?) = middleName(JsonField.ofNullable(middleName))

            /** The legal middle name of the individual. */
            fun middleName(middleName: Optional<String>) = middleName(middleName.orElse(null))

            /** The legal middle name of the individual. */
            fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

            fun phoneNumbers(phoneNumbers: List<PhoneNumber?>?) =
                phoneNumbers(JsonField.ofNullable(phoneNumbers))

            fun phoneNumbers(phoneNumbers: Optional<List<PhoneNumber?>>) =
                phoneNumbers(phoneNumbers.orElse(null))

            fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumber?>>) = apply {
                this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
            }

            fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
                phoneNumbers =
                    (phoneNumbers ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(phoneNumber)
                    }
            }

            /** The preferred name of the individual. */
            fun preferredName(preferredName: String?) =
                preferredName(JsonField.ofNullable(preferredName))

            /** The preferred name of the individual. */
            fun preferredName(preferredName: Optional<String>) =
                preferredName(preferredName.orElse(null))

            /** The preferred name of the individual. */
            fun preferredName(preferredName: JsonField<String>) = apply {
                this.preferredName = preferredName
            }

            fun residence(residence: Location?) = residence(JsonField.ofNullable(residence))

            fun residence(residence: Optional<Location>) = residence(residence.orElse(null))

            fun residence(residence: JsonField<Location>) = apply { this.residence = residence }

            /** The source system's unique employment identifier for this individual */
            fun sourceId(sourceId: String) = sourceId(JsonField.of(sourceId))

            /** The source system's unique employment identifier for this individual */
            fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

            /**
             * Social Security Number of the individual. This field is only available with the `ssn`
             * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
             * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
             */
            fun ssn(ssn: String?) = ssn(JsonField.ofNullable(ssn))

            /**
             * Social Security Number of the individual. This field is only available with the `ssn`
             * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
             * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
             */
            fun ssn(ssn: Optional<String>) = ssn(ssn.orElse(null))

            /**
             * Social Security Number of the individual. This field is only available with the `ssn`
             * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
             * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
             */
            fun ssn(ssn: JsonField<String>) = apply { this.ssn = ssn }

            fun startDate(startDate: String?) = startDate(JsonField.ofNullable(startDate))

            fun startDate(startDate: Optional<String>) = startDate(startDate.orElse(null))

            fun startDate(startDate: JsonField<String>) = apply { this.startDate = startDate }

            /** The current title of the individual. */
            fun title(title: String?) = title(JsonField.ofNullable(title))

            /** The current title of the individual. */
            fun title(title: Optional<String>) = title(title.orElse(null))

            /** The current title of the individual. */
            fun title(title: JsonField<String>) = apply { this.title = title }

            fun build(): IndividualOrEmployment =
                IndividualOrEmployment(
                    classCode,
                    (customFields ?: JsonMissing.of()).map { it.toImmutable() },
                    department,
                    dob,
                    (emails ?: JsonMissing.of()).map { it.toImmutable() },
                    employment,
                    employmentStatus,
                    encryptedSsn,
                    endDate,
                    ethnicity,
                    firstName,
                    gender,
                    income,
                    (incomeHistory ?: JsonMissing.of()).map { it.toImmutable() },
                    isActive,
                    lastName,
                    latestRehireDate,
                    location,
                    manager,
                    middleName,
                    (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                    preferredName,
                    residence,
                    sourceId,
                    ssn,
                    startDate,
                    title,
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

            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            @JsonProperty("value") @ExcludeMissing fun _value(): JsonValue = value

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

                fun name(name: String?) = name(JsonField.ofNullable(name))

                fun name(name: Optional<String>) = name(name.orElse(null))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun value(value: JsonValue) = apply { this.value = value }

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

                fun build(): CustomField =
                    CustomField(name, value, additionalProperties.toImmutable())
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

            /** The name of the department associated with the individual. */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** The name of the department associated with the individual. */
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

                /** The name of the department associated with the individual. */
                fun name(name: Optional<String>) = name(name.orElse(null))

                /** The name of the department associated with the individual. */
                fun name(name: JsonField<String>) = apply { this.name = name }

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

        @NoAutoDetect
        class Email
        @JsonCreator
        private constructor(
            @JsonProperty("data")
            @ExcludeMissing
            private val data: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun data(): Optional<String> = Optional.ofNullable(data.getNullable("data"))

            fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

            @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Email = apply {
                if (validated) {
                    return@apply
                }

                data()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Email]. */
            class Builder internal constructor() {

                private var data: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(email: Email) = apply {
                    data = email.data
                    type = email.type
                    additionalProperties = email.additionalProperties.toMutableMap()
                }

                fun data(data: String) = data(JsonField.of(data))

                fun data(data: JsonField<String>) = apply { this.data = data }

                fun type(type: Type?) = type(JsonField.ofNullable(type))

                fun type(type: Optional<Type>) = type(type.orElse(null))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): Email = Email(data, type, additionalProperties.toImmutable())
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val WORK = of("work")

                    @JvmField val PERSONAL = of("personal")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    WORK,
                    PERSONAL,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    WORK,
                    PERSONAL,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        WORK -> Value.WORK
                        PERSONAL -> Value.PERSONAL
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
                        WORK -> Known.WORK
                        PERSONAL -> Known.PERSONAL
                        else -> throw FinchInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws FinchInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

                return /* spotless:off */ other is Email && data == other.data && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(data, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Email{data=$data, type=$type, additionalProperties=$additionalProperties}"
        }

        /** The employment object. */
        @NoAutoDetect
        class Employment
        @JsonCreator
        private constructor(
            @JsonProperty("subtype")
            @ExcludeMissing
            private val subtype: JsonField<Subtype> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * The secondary employment type of the individual. Options: `full_time`, `part_time`,
             * `intern`, `temp`, `seasonal` and `individual_contractor`.
             */
            fun subtype(): Optional<Subtype> = Optional.ofNullable(subtype.getNullable("subtype"))

            /** The main employment type of the individual. */
            fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

            /**
             * The secondary employment type of the individual. Options: `full_time`, `part_time`,
             * `intern`, `temp`, `seasonal` and `individual_contractor`.
             */
            @JsonProperty("subtype") @ExcludeMissing fun _subtype(): JsonField<Subtype> = subtype

            /** The main employment type of the individual. */
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
                 * The secondary employment type of the individual. Options: `full_time`,
                 * `part_time`, `intern`, `temp`, `seasonal` and `individual_contractor`.
                 */
                fun subtype(subtype: Subtype?) = subtype(JsonField.ofNullable(subtype))

                /**
                 * The secondary employment type of the individual. Options: `full_time`,
                 * `part_time`, `intern`, `temp`, `seasonal` and `individual_contractor`.
                 */
                fun subtype(subtype: Optional<Subtype>) = subtype(subtype.orElse(null))

                /**
                 * The secondary employment type of the individual. Options: `full_time`,
                 * `part_time`, `intern`, `temp`, `seasonal` and `individual_contractor`.
                 */
                fun subtype(subtype: JsonField<Subtype>) = apply { this.subtype = subtype }

                /** The main employment type of the individual. */
                fun type(type: Type?) = type(JsonField.ofNullable(type))

                /** The main employment type of the individual. */
                fun type(type: Optional<Type>) = type(type.orElse(null))

                /** The main employment type of the individual. */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): Employment =
                    Employment(subtype, type, additionalProperties.toImmutable())
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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                     * An enum member indicating that [Subtype] was instantiated with an unknown
                     * value.
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
                 * @throws FinchInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    EMPLOYEE,
                    CONTRACTOR,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                 * @throws FinchInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

        /** The detailed employment status of the individual. */
        class EmploymentStatus
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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
             * An instance of [EmploymentStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * @throws FinchInvalidDataException if this class instance's value is a not a known
             *   member.
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

                return /* spotless:off */ other is EmploymentStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The EEOC-defined ethnicity of the individual. */
        class Ethnicity @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val ASIAN = of("asian")

                @JvmField val WHITE = of("white")

                @JvmField val BLACK_OR_AFRICAN_AMERICAN = of("black_or_african_american")

                @JvmField
                val NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER = of("native_hawaiian_or_pacific_islander")

                @JvmField
                val AMERICAN_INDIAN_OR_ALASKA_NATIVE = of("american_indian_or_alaska_native")

                @JvmField val HISPANIC_OR_LATINO = of("hispanic_or_latino")

                @JvmField val TWO_OR_MORE_RACES = of("two_or_more_races")

                @JvmField val DECLINE_TO_SPECIFY = of("decline_to_specify")

                @JvmStatic fun of(value: String) = Ethnicity(JsonField.of(value))
            }

            /** An enum containing [Ethnicity]'s known values. */
            enum class Known {
                ASIAN,
                WHITE,
                BLACK_OR_AFRICAN_AMERICAN,
                NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER,
                AMERICAN_INDIAN_OR_ALASKA_NATIVE,
                HISPANIC_OR_LATINO,
                TWO_OR_MORE_RACES,
                DECLINE_TO_SPECIFY,
            }

            /**
             * An enum containing [Ethnicity]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Ethnicity] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ASIAN,
                WHITE,
                BLACK_OR_AFRICAN_AMERICAN,
                NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER,
                AMERICAN_INDIAN_OR_ALASKA_NATIVE,
                HISPANIC_OR_LATINO,
                TWO_OR_MORE_RACES,
                DECLINE_TO_SPECIFY,
                /**
                 * An enum member indicating that [Ethnicity] was instantiated with an unknown
                 * value.
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
                    ASIAN -> Value.ASIAN
                    WHITE -> Value.WHITE
                    BLACK_OR_AFRICAN_AMERICAN -> Value.BLACK_OR_AFRICAN_AMERICAN
                    NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER -> Value.NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER
                    AMERICAN_INDIAN_OR_ALASKA_NATIVE -> Value.AMERICAN_INDIAN_OR_ALASKA_NATIVE
                    HISPANIC_OR_LATINO -> Value.HISPANIC_OR_LATINO
                    TWO_OR_MORE_RACES -> Value.TWO_OR_MORE_RACES
                    DECLINE_TO_SPECIFY -> Value.DECLINE_TO_SPECIFY
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
                    ASIAN -> Known.ASIAN
                    WHITE -> Known.WHITE
                    BLACK_OR_AFRICAN_AMERICAN -> Known.BLACK_OR_AFRICAN_AMERICAN
                    NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER -> Known.NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER
                    AMERICAN_INDIAN_OR_ALASKA_NATIVE -> Known.AMERICAN_INDIAN_OR_ALASKA_NATIVE
                    HISPANIC_OR_LATINO -> Known.HISPANIC_OR_LATINO
                    TWO_OR_MORE_RACES -> Known.TWO_OR_MORE_RACES
                    DECLINE_TO_SPECIFY -> Known.DECLINE_TO_SPECIFY
                    else -> throw FinchInvalidDataException("Unknown Ethnicity: $value")
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

                return /* spotless:off */ other is Ethnicity && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The gender of the individual. */
        class Gender @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val FEMALE = of("female")

                @JvmField val MALE = of("male")

                @JvmField val OTHER = of("other")

                @JvmField val DECLINE_TO_SPECIFY = of("decline_to_specify")

                @JvmStatic fun of(value: String) = Gender(JsonField.of(value))
            }

            /** An enum containing [Gender]'s known values. */
            enum class Known {
                FEMALE,
                MALE,
                OTHER,
                DECLINE_TO_SPECIFY,
            }

            /**
             * An enum containing [Gender]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Gender] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FEMALE,
                MALE,
                OTHER,
                DECLINE_TO_SPECIFY,
                /**
                 * An enum member indicating that [Gender] was instantiated with an unknown value.
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
                    FEMALE -> Value.FEMALE
                    MALE -> Value.MALE
                    OTHER -> Value.OTHER
                    DECLINE_TO_SPECIFY -> Value.DECLINE_TO_SPECIFY
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
                    FEMALE -> Known.FEMALE
                    MALE -> Known.MALE
                    OTHER -> Known.OTHER
                    DECLINE_TO_SPECIFY -> Known.DECLINE_TO_SPECIFY
                    else -> throw FinchInvalidDataException("Unknown Gender: $value")
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

                return /* spotless:off */ other is Gender && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The manager object representing the manager of the individual within the org. */
        @NoAutoDetect
        class Manager
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** A stable Finch `id` (UUID v4) for an individual in the company. */
            fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

            /** A stable Finch `id` (UUID v4) for an individual in the company. */
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

                /** A stable Finch `id` (UUID v4) for an individual in the company. */
                fun id(id: JsonField<String>) = apply { this.id = id }

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

        @NoAutoDetect
        class PhoneNumber
        @JsonCreator
        private constructor(
            @JsonProperty("data")
            @ExcludeMissing
            private val data: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun data(): Optional<String> = Optional.ofNullable(data.getNullable("data"))

            fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

            @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PhoneNumber = apply {
                if (validated) {
                    return@apply
                }

                data()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PhoneNumber]. */
            class Builder internal constructor() {

                private var data: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(phoneNumber: PhoneNumber) = apply {
                    data = phoneNumber.data
                    type = phoneNumber.type
                    additionalProperties = phoneNumber.additionalProperties.toMutableMap()
                }

                fun data(data: String) = data(JsonField.of(data))

                fun data(data: JsonField<String>) = apply { this.data = data }

                fun type(type: Type?) = type(JsonField.ofNullable(type))

                fun type(type: Optional<Type>) = type(type.orElse(null))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): PhoneNumber =
                    PhoneNumber(data, type, additionalProperties.toImmutable())
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val WORK = of("work")

                    @JvmField val PERSONAL = of("personal")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    WORK,
                    PERSONAL,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    WORK,
                    PERSONAL,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        WORK -> Value.WORK
                        PERSONAL -> Value.PERSONAL
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
                        WORK -> Known.WORK
                        PERSONAL -> Known.PERSONAL
                        else -> throw FinchInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws FinchInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

                return /* spotless:off */ other is PhoneNumber && data == other.data && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(data, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PhoneNumber{data=$data, type=$type, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is IndividualOrEmployment && classCode == other.classCode && customFields == other.customFields && department == other.department && dob == other.dob && emails == other.emails && employment == other.employment && employmentStatus == other.employmentStatus && encryptedSsn == other.encryptedSsn && endDate == other.endDate && ethnicity == other.ethnicity && firstName == other.firstName && gender == other.gender && income == other.income && incomeHistory == other.incomeHistory && isActive == other.isActive && lastName == other.lastName && latestRehireDate == other.latestRehireDate && location == other.location && manager == other.manager && middleName == other.middleName && phoneNumbers == other.phoneNumbers && preferredName == other.preferredName && residence == other.residence && sourceId == other.sourceId && ssn == other.ssn && startDate == other.startDate && title == other.title /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(classCode, customFields, department, dob, emails, employment, employmentStatus, encryptedSsn, endDate, ethnicity, firstName, gender, income, incomeHistory, isActive, lastName, latestRehireDate, location, manager, middleName, phoneNumbers, preferredName, residence, sourceId, ssn, startDate, title) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "IndividualOrEmployment{classCode=$classCode, customFields=$customFields, department=$department, dob=$dob, emails=$emails, employment=$employment, employmentStatus=$employmentStatus, encryptedSsn=$encryptedSsn, endDate=$endDate, ethnicity=$ethnicity, firstName=$firstName, gender=$gender, income=$income, incomeHistory=$incomeHistory, isActive=$isActive, lastName=$lastName, latestRehireDate=$latestRehireDate, location=$location, manager=$manager, middleName=$middleName, phoneNumbers=$phoneNumbers, preferredName=$preferredName, residence=$residence, sourceId=$sourceId, ssn=$ssn, startDate=$startDate, title=$title}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SandboxDirectoryCreateParams = builder().build()

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SandboxDirectoryCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: MutableList<IndividualOrEmployment>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sandboxDirectoryCreateParams: SandboxDirectoryCreateParams) = apply {
            body = sandboxDirectoryCreateParams.body?.toMutableList()
            additionalHeaders = sandboxDirectoryCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = sandboxDirectoryCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Array of individuals to create. Takes all combined fields from `/individual` and
         * `/employment` endpoints. All fields are optional.
         */
        fun body(body: List<IndividualOrEmployment>?) = apply { this.body = body?.toMutableList() }

        /**
         * Array of individuals to create. Takes all combined fields from `/individual` and
         * `/employment` endpoints. All fields are optional.
         */
        fun body(body: Optional<List<IndividualOrEmployment>>) = body(body.orElse(null))

        /**
         * Array of individuals to create. Takes all combined fields from `/individual` and
         * `/employment` endpoints. All fields are optional.
         */
        fun addBody(body: IndividualOrEmployment) = apply {
            this.body = (this.body ?: mutableListOf()).apply { add(body) }
        }

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

        fun build(): SandboxDirectoryCreateParams =
            SandboxDirectoryCreateParams(
                body?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SandboxDirectoryCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SandboxDirectoryCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

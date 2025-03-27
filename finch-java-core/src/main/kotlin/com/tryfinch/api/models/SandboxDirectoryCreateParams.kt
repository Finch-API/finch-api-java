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
import com.tryfinch.api.core.Params
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

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

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SandboxDirectoryCreateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [SandboxDirectoryCreateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SandboxDirectoryCreateParams]. */
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

        /** Alias for calling [Builder.body] with `body.orElse(null)`. */
        fun body(body: Optional<List<IndividualOrEmployment>>) = body(body.getOrNull())

        /**
         * Adds a single [IndividualOrEmployment] to [Builder.body].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
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

        /**
         * Returns an immutable instance of [SandboxDirectoryCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SandboxDirectoryCreateParams =
            SandboxDirectoryCreateParams(
                body?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JvmSynthetic
    internal fun _body(): Optional<List<IndividualOrEmployment>> = Optional.ofNullable(body)

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class IndividualOrEmployment
    @JsonCreator
    private constructor(
        @JsonProperty("class_code") @ExcludeMissing private val classCode: JsonField<String>,
        @JsonProperty("custom_fields")
        @ExcludeMissing
        private val customFields: JsonField<List<CustomField>>,
        @JsonProperty("department") @ExcludeMissing private val department: JsonField<Department>,
        @JsonProperty("dob") @ExcludeMissing private val dob: JsonField<String>,
        @JsonProperty("emails") @ExcludeMissing private val emails: JsonField<List<Email>>,
        @JsonProperty("employment") @ExcludeMissing private val employment: JsonField<Employment>,
        @JsonProperty("employment_status")
        @ExcludeMissing
        private val employmentStatus: JsonField<EmploymentStatus>,
        @JsonProperty("encrypted_ssn") @ExcludeMissing private val encryptedSsn: JsonField<String>,
        @JsonProperty("end_date") @ExcludeMissing private val endDate: JsonField<String>,
        @JsonProperty("ethnicity") @ExcludeMissing private val ethnicity: JsonField<Ethnicity>,
        @JsonProperty("first_name") @ExcludeMissing private val firstName: JsonField<String>,
        @JsonProperty("gender") @ExcludeMissing private val gender: JsonField<Gender>,
        @JsonProperty("income") @ExcludeMissing private val income: JsonField<Income>,
        @JsonProperty("income_history")
        @ExcludeMissing
        private val incomeHistory: JsonField<List<Income?>>,
        @JsonProperty("is_active") @ExcludeMissing private val isActive: JsonField<Boolean>,
        @JsonProperty("last_name") @ExcludeMissing private val lastName: JsonField<String>,
        @JsonProperty("latest_rehire_date")
        @ExcludeMissing
        private val latestRehireDate: JsonField<String>,
        @JsonProperty("location") @ExcludeMissing private val location: JsonField<Location>,
        @JsonProperty("manager") @ExcludeMissing private val manager: JsonField<Manager>,
        @JsonProperty("middle_name") @ExcludeMissing private val middleName: JsonField<String>,
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        private val phoneNumbers: JsonField<List<PhoneNumber?>>,
        @JsonProperty("preferred_name")
        @ExcludeMissing
        private val preferredName: JsonField<String>,
        @JsonProperty("residence") @ExcludeMissing private val residence: JsonField<Location>,
        @JsonProperty("source_id") @ExcludeMissing private val sourceId: JsonField<String>,
        @JsonProperty("ssn") @ExcludeMissing private val ssn: JsonField<String>,
        @JsonProperty("start_date") @ExcludeMissing private val startDate: JsonField<String>,
        @JsonProperty("title") @ExcludeMissing private val title: JsonField<String>,
    ) {

        /**
         * Worker's compensation classification code for this employee
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun classCode(): Optional<String> = Optional.ofNullable(classCode.getNullable("class_code"))

        /**
         * Custom fields for the individual. These are fields which are defined by the employer in
         * the system. Custom fields are not currently supported for assisted connections.
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
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dob(): Optional<String> = Optional.ofNullable(dob.getNullable("dob"))

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun emails(): Optional<List<Email>> = Optional.ofNullable(emails.getNullable("emails"))

        /**
         * The employment object.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun employment(): Optional<Employment> =
            Optional.ofNullable(employment.getNullable("employment"))

        /**
         * The detailed employment status of the individual.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun employmentStatus(): Optional<EmploymentStatus> =
            Optional.ofNullable(employmentStatus.getNullable("employment_status"))

        /**
         * Social Security Number of the individual in **encrypted** format. This field is only
         * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param set
         * in the body.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun encryptedSsn(): Optional<String> =
            Optional.ofNullable(encryptedSsn.getNullable("encrypted_ssn"))

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): Optional<String> = Optional.ofNullable(endDate.getNullable("end_date"))

        /**
         * The EEOC-defined ethnicity of the individual.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ethnicity(): Optional<Ethnicity> =
            Optional.ofNullable(ethnicity.getNullable("ethnicity"))

        /**
         * The legal first name of the individual.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun firstName(): Optional<String> = Optional.ofNullable(firstName.getNullable("first_name"))

        /**
         * The gender of the individual.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun gender(): Optional<Gender> = Optional.ofNullable(gender.getNullable("gender"))

        /**
         * The employee's income as reported by the provider. This may not always be annualized
         * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
         * information the provider returns.
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
        fun middleName(): Optional<String> =
            Optional.ofNullable(middleName.getNullable("middle_name"))

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumbers(): Optional<List<PhoneNumber?>> =
            Optional.ofNullable(phoneNumbers.getNullable("phone_numbers"))

        /**
         * The preferred name of the individual.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun preferredName(): Optional<String> =
            Optional.ofNullable(preferredName.getNullable("preferred_name"))

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun residence(): Optional<Location> =
            Optional.ofNullable(residence.getNullable("residence"))

        /**
         * The source system's unique employment identifier for this individual
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sourceId(): Optional<String> = Optional.ofNullable(sourceId.getNullable("source_id"))

        /**
         * Social Security Number of the individual. This field is only available with the `ssn`
         * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
         * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ssn(): Optional<String> = Optional.ofNullable(ssn.getNullable("ssn"))

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
         * Returns the raw JSON value of [classCode].
         *
         * Unlike [classCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("class_code") @ExcludeMissing fun _classCode(): JsonField<String> = classCode

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [dob].
         *
         * Unlike [dob], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<String> = dob

        /**
         * Returns the raw JSON value of [emails].
         *
         * Unlike [emails], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("emails") @ExcludeMissing fun _emails(): JsonField<List<Email>> = emails

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
         * Returns the raw JSON value of [encryptedSsn].
         *
         * Unlike [encryptedSsn], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("encrypted_ssn")
        @ExcludeMissing
        fun _encryptedSsn(): JsonField<String> = encryptedSsn

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<String> = endDate

        /**
         * Returns the raw JSON value of [ethnicity].
         *
         * Unlike [ethnicity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ethnicity")
        @ExcludeMissing
        fun _ethnicity(): JsonField<Ethnicity> = ethnicity

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [gender].
         *
         * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<Gender> = gender

        /**
         * Returns the raw JSON value of [income].
         *
         * Unlike [income], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("income") @ExcludeMissing fun _income(): JsonField<Income> = income

        /**
         * Returns the raw JSON value of [incomeHistory].
         *
         * Unlike [incomeHistory], this method doesn't throw if the JSON field has an unexpected
         * type.
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
        @JsonProperty("middle_name")
        @ExcludeMissing
        fun _middleName(): JsonField<String> = middleName

        /**
         * Returns the raw JSON value of [phoneNumbers].
         *
         * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        fun _phoneNumbers(): JsonField<List<PhoneNumber?>> = phoneNumbers

        /**
         * Returns the raw JSON value of [preferredName].
         *
         * Unlike [preferredName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("preferred_name")
        @ExcludeMissing
        fun _preferredName(): JsonField<String> = preferredName

        /**
         * Returns the raw JSON value of [residence].
         *
         * Unlike [residence], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("residence") @ExcludeMissing fun _residence(): JsonField<Location> = residence

        /**
         * Returns the raw JSON value of [sourceId].
         *
         * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source_id") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

        /**
         * Returns the raw JSON value of [ssn].
         *
         * Unlike [ssn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ssn") @ExcludeMissing fun _ssn(): JsonField<String> = ssn

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

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [IndividualOrEmployment].
             */
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

            /** Alias for calling [Builder.classCode] with `classCode.orElse(null)`. */
            fun classCode(classCode: Optional<String>) = classCode(classCode.getOrNull())

            /**
             * Sets [Builder.classCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun classCode(classCode: JsonField<String>) = apply { this.classCode = classCode }

            /**
             * Custom fields for the individual. These are fields which are defined by the employer
             * in the system. Custom fields are not currently supported for assisted connections.
             */
            fun customFields(customFields: List<CustomField>) =
                customFields(JsonField.of(customFields))

            /**
             * Sets [Builder.customFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFields] with a well-typed `List<CustomField>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
            fun department(department: JsonField<Department>) = apply {
                this.department = department
            }

            fun dob(dob: String?) = dob(JsonField.ofNullable(dob))

            /** Alias for calling [Builder.dob] with `dob.orElse(null)`. */
            fun dob(dob: Optional<String>) = dob(dob.getOrNull())

            /**
             * Sets [Builder.dob] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dob] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun dob(dob: JsonField<String>) = apply { this.dob = dob }

            fun emails(emails: List<Email>?) = emails(JsonField.ofNullable(emails))

            /** Alias for calling [Builder.emails] with `emails.orElse(null)`. */
            fun emails(emails: Optional<List<Email>>) = emails(emails.getOrNull())

            /**
             * Sets [Builder.emails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emails] with a well-typed `List<Email>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emails(emails: JsonField<List<Email>>) = apply {
                this.emails = emails.map { it.toMutableList() }
            }

            /**
             * Adds a single [Email] to [emails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEmail(email: Email) = apply {
                emails =
                    (emails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("emails", it).add(email)
                    }
            }

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
            fun employment(employment: JsonField<Employment>) = apply {
                this.employment = employment
            }

            /** The detailed employment status of the individual. */
            fun employmentStatus(employmentStatus: EmploymentStatus?) =
                employmentStatus(JsonField.ofNullable(employmentStatus))

            /**
             * Alias for calling [Builder.employmentStatus] with `employmentStatus.orElse(null)`.
             */
            fun employmentStatus(employmentStatus: Optional<EmploymentStatus>) =
                employmentStatus(employmentStatus.getOrNull())

            /**
             * Sets [Builder.employmentStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.employmentStatus] with a well-typed
             * [EmploymentStatus] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
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

            /** Alias for calling [Builder.encryptedSsn] with `encryptedSsn.orElse(null)`. */
            fun encryptedSsn(encryptedSsn: Optional<String>) =
                encryptedSsn(encryptedSsn.getOrNull())

            /**
             * Sets [Builder.encryptedSsn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.encryptedSsn] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun encryptedSsn(encryptedSsn: JsonField<String>) = apply {
                this.encryptedSsn = encryptedSsn
            }

            fun endDate(endDate: String?) = endDate(JsonField.ofNullable(endDate))

            /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
            fun endDate(endDate: Optional<String>) = endDate(endDate.getOrNull())

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<String>) = apply { this.endDate = endDate }

            /** The EEOC-defined ethnicity of the individual. */
            fun ethnicity(ethnicity: Ethnicity?) = ethnicity(JsonField.ofNullable(ethnicity))

            /** Alias for calling [Builder.ethnicity] with `ethnicity.orElse(null)`. */
            fun ethnicity(ethnicity: Optional<Ethnicity>) = ethnicity(ethnicity.getOrNull())

            /**
             * Sets [Builder.ethnicity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ethnicity] with a well-typed [Ethnicity] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ethnicity(ethnicity: JsonField<Ethnicity>) = apply { this.ethnicity = ethnicity }

            /** The legal first name of the individual. */
            fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

            /** Alias for calling [Builder.firstName] with `firstName.orElse(null)`. */
            fun firstName(firstName: Optional<String>) = firstName(firstName.getOrNull())

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** The gender of the individual. */
            fun gender(gender: Gender?) = gender(JsonField.ofNullable(gender))

            /** Alias for calling [Builder.gender] with `gender.orElse(null)`. */
            fun gender(gender: Optional<Gender>) = gender(gender.getOrNull())

            /**
             * Sets [Builder.gender] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gender] with a well-typed [Gender] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gender(gender: JsonField<Gender>) = apply { this.gender = gender }

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
             * You should usually call [Builder.income] with a well-typed [Income] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.incomeHistory] with a well-typed `List<Income?>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

            /** The legal last name of the individual. */
            fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

            /** Alias for calling [Builder.lastName] with `lastName.orElse(null)`. */
            fun lastName(lastName: Optional<String>) = lastName(lastName.getOrNull())

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            fun latestRehireDate(latestRehireDate: String?) =
                latestRehireDate(JsonField.ofNullable(latestRehireDate))

            /**
             * Alias for calling [Builder.latestRehireDate] with `latestRehireDate.orElse(null)`.
             */
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
             * You should usually call [Builder.location] with a well-typed [Location] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun location(location: JsonField<Location>) = apply { this.location = location }

            /** The manager object representing the manager of the individual within the org. */
            fun manager(manager: Manager?) = manager(JsonField.ofNullable(manager))

            /** Alias for calling [Builder.manager] with `manager.orElse(null)`. */
            fun manager(manager: Optional<Manager>) = manager(manager.getOrNull())

            /**
             * Sets [Builder.manager] to an arbitrary JSON value.
             *
             * You should usually call [Builder.manager] with a well-typed [Manager] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun manager(manager: JsonField<Manager>) = apply { this.manager = manager }

            /** The legal middle name of the individual. */
            fun middleName(middleName: String?) = middleName(JsonField.ofNullable(middleName))

            /** Alias for calling [Builder.middleName] with `middleName.orElse(null)`. */
            fun middleName(middleName: Optional<String>) = middleName(middleName.getOrNull())

            /**
             * Sets [Builder.middleName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.middleName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

            fun phoneNumbers(phoneNumbers: List<PhoneNumber?>?) =
                phoneNumbers(JsonField.ofNullable(phoneNumbers))

            /** Alias for calling [Builder.phoneNumbers] with `phoneNumbers.orElse(null)`. */
            fun phoneNumbers(phoneNumbers: Optional<List<PhoneNumber?>>) =
                phoneNumbers(phoneNumbers.getOrNull())

            /**
             * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumbers] with a well-typed `List<PhoneNumber?>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumber?>>) = apply {
                this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
            }

            /**
             * Adds a single [PhoneNumber] to [phoneNumbers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
                phoneNumbers =
                    (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("phoneNumbers", it).add(phoneNumber)
                    }
            }

            /** The preferred name of the individual. */
            fun preferredName(preferredName: String?) =
                preferredName(JsonField.ofNullable(preferredName))

            /** Alias for calling [Builder.preferredName] with `preferredName.orElse(null)`. */
            fun preferredName(preferredName: Optional<String>) =
                preferredName(preferredName.getOrNull())

            /**
             * Sets [Builder.preferredName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preferredName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preferredName(preferredName: JsonField<String>) = apply {
                this.preferredName = preferredName
            }

            fun residence(residence: Location?) = residence(JsonField.ofNullable(residence))

            /** Alias for calling [Builder.residence] with `residence.orElse(null)`. */
            fun residence(residence: Optional<Location>) = residence(residence.getOrNull())

            /**
             * Sets [Builder.residence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.residence] with a well-typed [Location] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun residence(residence: JsonField<Location>) = apply { this.residence = residence }

            /** The source system's unique employment identifier for this individual */
            fun sourceId(sourceId: String) = sourceId(JsonField.of(sourceId))

            /**
             * Sets [Builder.sourceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

            /**
             * Social Security Number of the individual. This field is only available with the `ssn`
             * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
             * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
             */
            fun ssn(ssn: String?) = ssn(JsonField.ofNullable(ssn))

            /** Alias for calling [Builder.ssn] with `ssn.orElse(null)`. */
            fun ssn(ssn: Optional<String>) = ssn(ssn.getOrNull())

            /**
             * Sets [Builder.ssn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ssn] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ssn(ssn: JsonField<String>) = apply { this.ssn = ssn }

            fun startDate(startDate: String?) = startDate(JsonField.ofNullable(startDate))

            /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
            fun startDate(startDate: Optional<String>) = startDate(startDate.getOrNull())

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<String>) = apply { this.startDate = startDate }

            /** The current title of the individual. */
            fun title(title: String?) = title(JsonField.ofNullable(title))

            /** Alias for calling [Builder.title] with `title.orElse(null)`. */
            fun title(title: Optional<String>) = title(title.getOrNull())

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            /**
             * Returns an immutable instance of [IndividualOrEmployment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
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

        class CustomField
        private constructor(
            private val name: JsonField<String>,
            private val value: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonValue = JsonMissing.of(),
            ) : this(name, value, mutableMapOf())

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            @JsonProperty("value") @ExcludeMissing fun _value(): JsonValue = value

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

                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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
                 * Returns an immutable instance of [CustomField].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CustomField =
                    CustomField(name, value, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): CustomField = apply {
                if (validated) {
                    return@apply
                }

                name()
                validated = true
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
             * The name of the department associated with the individual.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

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

                /** The name of the department associated with the individual. */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

        class Email
        private constructor(
            private val data: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("data") @ExcludeMissing data: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(data, type, mutableMapOf())

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun data(): Optional<String> = Optional.ofNullable(data.getNullable("data"))

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

            /**
             * Returns the raw JSON value of [data].
             *
             * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

                /** Returns a mutable builder for constructing an instance of [Email]. */
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

                /**
                 * Sets [Builder.data] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.data] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun data(data: JsonField<String>) = apply { this.data = data }

                fun type(type: Type?) = type(JsonField.ofNullable(type))

                /** Alias for calling [Builder.type] with `type.orElse(null)`. */
                fun type(type: Optional<Type>) = type(type.getOrNull())

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Email].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Email = Email(data, type, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Email = apply {
                if (validated) {
                    return@apply
                }

                data()
                type()
                validated = true
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
        class Employment
        private constructor(
            private val subtype: JsonField<Subtype>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("subtype")
                @ExcludeMissing
                subtype: JsonField<Subtype> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(subtype, type, mutableMapOf())

            /**
             * The secondary employment type of the individual. Options: `full_time`, `part_time`,
             * `intern`, `temp`, `seasonal` and `individual_contractor`.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun subtype(): Optional<Subtype> = Optional.ofNullable(subtype.getNullable("subtype"))

            /**
             * The main employment type of the individual.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
                 * The secondary employment type of the individual. Options: `full_time`,
                 * `part_time`, `intern`, `temp`, `seasonal` and `individual_contractor`.
                 */
                fun subtype(subtype: Subtype?) = subtype(JsonField.ofNullable(subtype))

                /** Alias for calling [Builder.subtype] with `subtype.orElse(null)`. */
                fun subtype(subtype: Optional<Subtype>) = subtype(subtype.getOrNull())

                /**
                 * Sets [Builder.subtype] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subtype] with a well-typed [Subtype] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subtype(subtype: JsonField<Subtype>) = apply { this.subtype = subtype }

                /** The main employment type of the individual. */
                fun type(type: Type?) = type(JsonField.ofNullable(type))

                /** Alias for calling [Builder.type] with `type.orElse(null)`. */
                fun type(type: Optional<Type>) = type(type.getOrNull())

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Employment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Employment =
                    Employment(subtype, type, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Employment = apply {
                if (validated) {
                    return@apply
                }

                subtype()
                type()
                validated = true
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
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

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
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Manager].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Manager = Manager(id, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Manager = apply {
                if (validated) {
                    return@apply
                }

                id()
                validated = true
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

        class PhoneNumber
        private constructor(
            private val data: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("data") @ExcludeMissing data: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(data, type, mutableMapOf())

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun data(): Optional<String> = Optional.ofNullable(data.getNullable("data"))

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

            /**
             * Returns the raw JSON value of [data].
             *
             * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

                /** Returns a mutable builder for constructing an instance of [PhoneNumber]. */
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

                fun data(data: String?) = data(JsonField.ofNullable(data))

                /** Alias for calling [Builder.data] with `data.orElse(null)`. */
                fun data(data: Optional<String>) = data(data.getOrNull())

                /**
                 * Sets [Builder.data] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.data] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun data(data: JsonField<String>) = apply { this.data = data }

                fun type(type: Type?) = type(JsonField.ofNullable(type))

                /** Alias for calling [Builder.type] with `type.orElse(null)`. */
                fun type(type: Optional<Type>) = type(type.getOrNull())

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [PhoneNumber].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PhoneNumber =
                    PhoneNumber(data, type, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): PhoneNumber = apply {
                if (validated) {
                    return@apply
                }

                data()
                type()
                validated = true
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

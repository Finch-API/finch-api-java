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

class SandboxDirectoryCreateParams
constructor(
    private val body: List<IndividualOrEmployment>,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun body(): List<IndividualOrEmployment> = body

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic
    internal fun getBody(): List<IndividualOrEmployment> {
        return body
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    /**
     * Array of individuals to create. Takes all combined fields from `/individual` and
     * `/employment` endpoints. All fields are optional.
     */
    @NoAutoDetect
    class SandboxDirectoryCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("body") private val body: List<IndividualOrEmployment>,
    ) {

        /**
         * Array of individuals to create. Takes all combined fields from `/individual` and
         * `/employment` endpoints. All fields are optional.
         */
        @JsonProperty("body") fun body(): List<IndividualOrEmployment> = body

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var body: List<IndividualOrEmployment>? = null

            @JvmSynthetic
            internal fun from(sandboxDirectoryCreateBody: SandboxDirectoryCreateBody) = apply {
                body = sandboxDirectoryCreateBody.body.toMutableList()
            }

            /**
             * Array of individuals to create. Takes all combined fields from `/individual` and
             * `/employment` endpoints. All fields are optional.
             */
            fun body(body: List<IndividualOrEmployment>) = apply { this.body = body }

            fun build(): SandboxDirectoryCreateBody =
                SandboxDirectoryCreateBody(
                    checkNotNull(body) { "`body` is required but was not set" }.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SandboxDirectoryCreateBody && body == other.body /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(body) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "SandboxDirectoryCreateBody{body=$body}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: MutableList<IndividualOrEmployment> = mutableListOf()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sandboxDirectoryCreateParams: SandboxDirectoryCreateParams) = apply {
            body = sandboxDirectoryCreateParams.body.toMutableList()
            additionalHeaders = sandboxDirectoryCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = sandboxDirectoryCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Array of individuals to create. Takes all combined fields from `/individual` and
         * `/employment` endpoints. All fields are optional.
         */
        fun body(body: List<IndividualOrEmployment>) = apply {
            this.body.clear()
            this.body.addAll(body)
        }

        /**
         * Array of individuals to create. Takes all combined fields from `/individual` and
         * `/employment` endpoints. All fields are optional.
         */
        fun addBody(body: IndividualOrEmployment) = apply { this.body.add(body) }

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
                body.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class IndividualOrEmployment
    @JsonCreator
    private constructor(
        @JsonProperty("first_name") private val firstName: String?,
        @JsonProperty("middle_name") private val middleName: String?,
        @JsonProperty("last_name") private val lastName: String?,
        @JsonProperty("preferred_name") private val preferredName: String?,
        @JsonProperty("emails") private val emails: List<Email>?,
        @JsonProperty("phone_numbers") private val phoneNumbers: List<PhoneNumber?>?,
        @JsonProperty("gender") private val gender: Gender?,
        @JsonProperty("ethnicity") private val ethnicity: Ethnicity?,
        @JsonProperty("dob") private val dob: String?,
        @JsonProperty("ssn") private val ssn: String?,
        @JsonProperty("encrypted_ssn") private val encryptedSsn: String?,
        @JsonProperty("residence") private val residence: Location?,
        @JsonProperty("title") private val title: String?,
        @JsonProperty("manager") private val manager: Manager?,
        @JsonProperty("department") private val department: Department?,
        @JsonProperty("employment") private val employment: Employment?,
        @JsonProperty("start_date") private val startDate: String?,
        @JsonProperty("end_date") private val endDate: String?,
        @JsonProperty("latest_rehire_date") private val latestRehireDate: String?,
        @JsonProperty("is_active") private val isActive: Boolean?,
        @JsonProperty("employment_status") private val employmentStatus: EmploymentStatus?,
        @JsonProperty("class_code") private val classCode: String?,
        @JsonProperty("location") private val location: Location?,
        @JsonProperty("income") private val income: Income?,
        @JsonProperty("income_history") private val incomeHistory: List<Income?>?,
        @JsonProperty("custom_fields") private val customFields: List<CustomField>?,
        @JsonProperty("source_id") private val sourceId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The legal first name of the individual. */
        @JsonProperty("first_name")
        fun firstName(): Optional<String> = Optional.ofNullable(firstName)

        /** The legal middle name of the individual. */
        @JsonProperty("middle_name")
        fun middleName(): Optional<String> = Optional.ofNullable(middleName)

        /** The legal last name of the individual. */
        @JsonProperty("last_name") fun lastName(): Optional<String> = Optional.ofNullable(lastName)

        /** The preferred name of the individual. */
        @JsonProperty("preferred_name")
        fun preferredName(): Optional<String> = Optional.ofNullable(preferredName)

        @JsonProperty("emails") fun emails(): Optional<List<Email>> = Optional.ofNullable(emails)

        @JsonProperty("phone_numbers")
        fun phoneNumbers(): Optional<List<PhoneNumber?>> = Optional.ofNullable(phoneNumbers)

        /** The gender of the individual. */
        @JsonProperty("gender") fun gender(): Optional<Gender> = Optional.ofNullable(gender)

        /** The EEOC-defined ethnicity of the individual. */
        @JsonProperty("ethnicity")
        fun ethnicity(): Optional<Ethnicity> = Optional.ofNullable(ethnicity)

        @JsonProperty("dob") fun dob(): Optional<String> = Optional.ofNullable(dob)

        /**
         * Social Security Number of the individual. This field is only available with the `ssn`
         * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
         * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
         */
        @JsonProperty("ssn") fun ssn(): Optional<String> = Optional.ofNullable(ssn)

        /**
         * Social Security Number of the individual in **encrypted** format. This field is only
         * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param set
         * in the body.
         */
        @JsonProperty("encrypted_ssn")
        fun encryptedSsn(): Optional<String> = Optional.ofNullable(encryptedSsn)

        @JsonProperty("residence")
        fun residence(): Optional<Location> = Optional.ofNullable(residence)

        /** The current title of the individual. */
        @JsonProperty("title") fun title(): Optional<String> = Optional.ofNullable(title)

        /** The manager object representing the manager of the individual within the org. */
        @JsonProperty("manager") fun manager(): Optional<Manager> = Optional.ofNullable(manager)

        /** The department object. */
        @JsonProperty("department")
        fun department(): Optional<Department> = Optional.ofNullable(department)

        /** The employment object. */
        @JsonProperty("employment")
        fun employment(): Optional<Employment> = Optional.ofNullable(employment)

        @JsonProperty("start_date")
        fun startDate(): Optional<String> = Optional.ofNullable(startDate)

        @JsonProperty("end_date") fun endDate(): Optional<String> = Optional.ofNullable(endDate)

        @JsonProperty("latest_rehire_date")
        fun latestRehireDate(): Optional<String> = Optional.ofNullable(latestRehireDate)

        /** `true` if the individual an an active employee or contractor at the company. */
        @JsonProperty("is_active") fun isActive(): Optional<Boolean> = Optional.ofNullable(isActive)

        /** The detailed employment status of the individual. */
        @JsonProperty("employment_status")
        fun employmentStatus(): Optional<EmploymentStatus> = Optional.ofNullable(employmentStatus)

        /** Worker's compensation classification code for this employee */
        @JsonProperty("class_code")
        fun classCode(): Optional<String> = Optional.ofNullable(classCode)

        @JsonProperty("location") fun location(): Optional<Location> = Optional.ofNullable(location)

        /**
         * The employee's income as reported by the provider. This may not always be annualized
         * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
         * information the provider returns.
         */
        @JsonProperty("income") fun income(): Optional<Income> = Optional.ofNullable(income)

        /** The array of income history. */
        @JsonProperty("income_history")
        fun incomeHistory(): Optional<List<Income?>> = Optional.ofNullable(incomeHistory)

        /**
         * Custom fields for the individual. These are fields which are defined by the employer in
         * the system. Custom fields are not currently supported for assisted connections.
         */
        @JsonProperty("custom_fields")
        fun customFields(): Optional<List<CustomField>> = Optional.ofNullable(customFields)

        /** The source system's unique employment identifier for this individual */
        @JsonProperty("source_id") fun sourceId(): Optional<String> = Optional.ofNullable(sourceId)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var firstName: String? = null
            private var middleName: String? = null
            private var lastName: String? = null
            private var preferredName: String? = null
            private var emails: List<Email>? = null
            private var phoneNumbers: List<PhoneNumber?>? = null
            private var gender: Gender? = null
            private var ethnicity: Ethnicity? = null
            private var dob: String? = null
            private var ssn: String? = null
            private var encryptedSsn: String? = null
            private var residence: Location? = null
            private var title: String? = null
            private var manager: Manager? = null
            private var department: Department? = null
            private var employment: Employment? = null
            private var startDate: String? = null
            private var endDate: String? = null
            private var latestRehireDate: String? = null
            private var isActive: Boolean? = null
            private var employmentStatus: EmploymentStatus? = null
            private var classCode: String? = null
            private var location: Location? = null
            private var income: Income? = null
            private var incomeHistory: List<Income?>? = null
            private var customFields: List<CustomField>? = null
            private var sourceId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(individualOrEmployment: IndividualOrEmployment) = apply {
                firstName = individualOrEmployment.firstName
                middleName = individualOrEmployment.middleName
                lastName = individualOrEmployment.lastName
                preferredName = individualOrEmployment.preferredName
                emails = individualOrEmployment.emails?.toMutableList()
                phoneNumbers = individualOrEmployment.phoneNumbers?.toMutableList()
                gender = individualOrEmployment.gender
                ethnicity = individualOrEmployment.ethnicity
                dob = individualOrEmployment.dob
                ssn = individualOrEmployment.ssn
                encryptedSsn = individualOrEmployment.encryptedSsn
                residence = individualOrEmployment.residence
                title = individualOrEmployment.title
                manager = individualOrEmployment.manager
                department = individualOrEmployment.department
                employment = individualOrEmployment.employment
                startDate = individualOrEmployment.startDate
                endDate = individualOrEmployment.endDate
                latestRehireDate = individualOrEmployment.latestRehireDate
                isActive = individualOrEmployment.isActive
                employmentStatus = individualOrEmployment.employmentStatus
                classCode = individualOrEmployment.classCode
                location = individualOrEmployment.location
                income = individualOrEmployment.income
                incomeHistory = individualOrEmployment.incomeHistory?.toMutableList()
                customFields = individualOrEmployment.customFields?.toMutableList()
                sourceId = individualOrEmployment.sourceId
                additionalProperties = individualOrEmployment.additionalProperties.toMutableMap()
            }

            /** The legal first name of the individual. */
            fun firstName(firstName: String) = apply { this.firstName = firstName }

            /** The legal middle name of the individual. */
            fun middleName(middleName: String) = apply { this.middleName = middleName }

            /** The legal last name of the individual. */
            fun lastName(lastName: String) = apply { this.lastName = lastName }

            /** The preferred name of the individual. */
            fun preferredName(preferredName: String) = apply { this.preferredName = preferredName }

            fun emails(emails: List<Email>) = apply { this.emails = emails }

            fun phoneNumbers(phoneNumbers: List<PhoneNumber?>) = apply {
                this.phoneNumbers = phoneNumbers
            }

            /** The gender of the individual. */
            fun gender(gender: Gender) = apply { this.gender = gender }

            /** The EEOC-defined ethnicity of the individual. */
            fun ethnicity(ethnicity: Ethnicity) = apply { this.ethnicity = ethnicity }

            fun dob(dob: String) = apply { this.dob = dob }

            /**
             * Social Security Number of the individual. This field is only available with the `ssn`
             * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
             * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
             */
            fun ssn(ssn: String) = apply { this.ssn = ssn }

            /**
             * Social Security Number of the individual in **encrypted** format. This field is only
             * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param
             * set in the body.
             */
            fun encryptedSsn(encryptedSsn: String) = apply { this.encryptedSsn = encryptedSsn }

            fun residence(residence: Location) = apply { this.residence = residence }

            /** The current title of the individual. */
            fun title(title: String) = apply { this.title = title }

            /** The manager object representing the manager of the individual within the org. */
            fun manager(manager: Manager) = apply { this.manager = manager }

            /** The department object. */
            fun department(department: Department) = apply { this.department = department }

            /** The employment object. */
            fun employment(employment: Employment) = apply { this.employment = employment }

            fun startDate(startDate: String) = apply { this.startDate = startDate }

            fun endDate(endDate: String) = apply { this.endDate = endDate }

            fun latestRehireDate(latestRehireDate: String) = apply {
                this.latestRehireDate = latestRehireDate
            }

            /** `true` if the individual an an active employee or contractor at the company. */
            fun isActive(isActive: Boolean) = apply { this.isActive = isActive }

            /** The detailed employment status of the individual. */
            fun employmentStatus(employmentStatus: EmploymentStatus) = apply {
                this.employmentStatus = employmentStatus
            }

            /** Worker's compensation classification code for this employee */
            fun classCode(classCode: String) = apply { this.classCode = classCode }

            fun location(location: Location) = apply { this.location = location }

            /**
             * The employee's income as reported by the provider. This may not always be annualized
             * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
             * information the provider returns.
             */
            fun income(income: Income) = apply { this.income = income }

            /** The array of income history. */
            fun incomeHistory(incomeHistory: List<Income?>) = apply {
                this.incomeHistory = incomeHistory
            }

            /**
             * Custom fields for the individual. These are fields which are defined by the employer
             * in the system. Custom fields are not currently supported for assisted connections.
             */
            fun customFields(customFields: List<CustomField>) = apply {
                this.customFields = customFields
            }

            /** The source system's unique employment identifier for this individual */
            fun sourceId(sourceId: String) = apply { this.sourceId = sourceId }

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

            fun build(): IndividualOrEmployment =
                IndividualOrEmployment(
                    firstName,
                    middleName,
                    lastName,
                    preferredName,
                    emails?.toImmutable(),
                    phoneNumbers?.toImmutable(),
                    gender,
                    ethnicity,
                    dob,
                    ssn,
                    encryptedSsn,
                    residence,
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
                    incomeHistory?.toImmutable(),
                    customFields?.toImmutable(),
                    sourceId,
                    additionalProperties.toImmutable(),
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

                fun name(name: String) = apply { this.name = name }

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
                fun name(name: String) = apply { this.name = name }

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
            @JsonProperty("data") private val data: String?,
            @JsonProperty("type") private val type: Type?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("data") fun data(): Optional<String> = Optional.ofNullable(data)

            @JsonProperty("type") fun type(): Optional<Type> = Optional.ofNullable(type)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var data: String? = null
                private var type: Type? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(email: Email) = apply {
                    data = email.data
                    type = email.type
                    additionalProperties = email.additionalProperties.toMutableMap()
                }

                fun data(data: String) = apply { this.data = data }

                fun type(type: Type) = apply { this.type = type }

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

                fun build(): Email =
                    Email(
                        data,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val WORK = of("work")

                    @JvmField val PERSONAL = of("personal")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    WORK,
                    PERSONAL,
                }

                enum class Value {
                    WORK,
                    PERSONAL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        WORK -> Value.WORK
                        PERSONAL -> Value.PERSONAL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        WORK -> Known.WORK
                        PERSONAL -> Known.PERSONAL
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
            @JsonProperty("type") private val type: Type?,
            @JsonProperty("subtype") private val subtype: Subtype?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The main employment type of the individual. */
            @JsonProperty("type") fun type(): Optional<Type> = Optional.ofNullable(type)

            /**
             * The secondary employment type of the individual. Options: `full_time`, `part_time`,
             * `intern`, `temp`, `seasonal` and `individual_contractor`.
             */
            @JsonProperty("subtype") fun subtype(): Optional<Subtype> = Optional.ofNullable(subtype)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: Type? = null
                private var subtype: Subtype? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(employment: Employment) = apply {
                    type = employment.type
                    subtype = employment.subtype
                    additionalProperties = employment.additionalProperties.toMutableMap()
                }

                /** The main employment type of the individual. */
                fun type(type: Type) = apply { this.type = type }

                /**
                 * The secondary employment type of the individual. Options: `full_time`,
                 * `part_time`, `intern`, `temp`, `seasonal` and `individual_contractor`.
                 */
                fun subtype(subtype: Subtype) = apply { this.subtype = subtype }

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

        class Ethnicity
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

            enum class Value {
                ASIAN,
                WHITE,
                BLACK_OR_AFRICAN_AMERICAN,
                NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER,
                AMERICAN_INDIAN_OR_ALASKA_NATIVE,
                HISPANIC_OR_LATINO,
                TWO_OR_MORE_RACES,
                DECLINE_TO_SPECIFY,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Ethnicity && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Gender
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val FEMALE = of("female")

                @JvmField val MALE = of("male")

                @JvmField val OTHER = of("other")

                @JvmField val DECLINE_TO_SPECIFY = of("decline_to_specify")

                @JvmStatic fun of(value: String) = Gender(JsonField.of(value))
            }

            enum class Known {
                FEMALE,
                MALE,
                OTHER,
                DECLINE_TO_SPECIFY,
            }

            enum class Value {
                FEMALE,
                MALE,
                OTHER,
                DECLINE_TO_SPECIFY,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    FEMALE -> Value.FEMALE
                    MALE -> Value.MALE
                    OTHER -> Value.OTHER
                    DECLINE_TO_SPECIFY -> Value.DECLINE_TO_SPECIFY
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    FEMALE -> Known.FEMALE
                    MALE -> Known.MALE
                    OTHER -> Known.OTHER
                    DECLINE_TO_SPECIFY -> Known.DECLINE_TO_SPECIFY
                    else -> throw FinchInvalidDataException("Unknown Gender: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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
                fun id(id: String) = apply { this.id = id }

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
            @JsonProperty("data") private val data: String?,
            @JsonProperty("type") private val type: Type?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("data") fun data(): Optional<String> = Optional.ofNullable(data)

            @JsonProperty("type") fun type(): Optional<Type> = Optional.ofNullable(type)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var data: String? = null
                private var type: Type? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(phoneNumber: PhoneNumber) = apply {
                    data = phoneNumber.data
                    type = phoneNumber.type
                    additionalProperties = phoneNumber.additionalProperties.toMutableMap()
                }

                fun data(data: String) = apply { this.data = data }

                fun type(type: Type) = apply { this.type = type }

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
                    PhoneNumber(
                        data,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val WORK = of("work")

                    @JvmField val PERSONAL = of("personal")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    WORK,
                    PERSONAL,
                }

                enum class Value {
                    WORK,
                    PERSONAL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        WORK -> Value.WORK
                        PERSONAL -> Value.PERSONAL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        WORK -> Known.WORK
                        PERSONAL -> Known.PERSONAL
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

            return /* spotless:off */ other is IndividualOrEmployment && firstName == other.firstName && middleName == other.middleName && lastName == other.lastName && preferredName == other.preferredName && emails == other.emails && phoneNumbers == other.phoneNumbers && gender == other.gender && ethnicity == other.ethnicity && dob == other.dob && ssn == other.ssn && encryptedSsn == other.encryptedSsn && residence == other.residence && title == other.title && manager == other.manager && department == other.department && employment == other.employment && startDate == other.startDate && endDate == other.endDate && latestRehireDate == other.latestRehireDate && isActive == other.isActive && employmentStatus == other.employmentStatus && classCode == other.classCode && location == other.location && income == other.income && incomeHistory == other.incomeHistory && customFields == other.customFields && sourceId == other.sourceId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(firstName, middleName, lastName, preferredName, emails, phoneNumbers, gender, ethnicity, dob, ssn, encryptedSsn, residence, title, manager, department, employment, startDate, endDate, latestRehireDate, isActive, employmentStatus, classCode, location, income, incomeHistory, customFields, sourceId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "IndividualOrEmployment{firstName=$firstName, middleName=$middleName, lastName=$lastName, preferredName=$preferredName, emails=$emails, phoneNumbers=$phoneNumbers, gender=$gender, ethnicity=$ethnicity, dob=$dob, ssn=$ssn, encryptedSsn=$encryptedSsn, residence=$residence, title=$title, manager=$manager, department=$department, employment=$employment, startDate=$startDate, endDate=$endDate, latestRehireDate=$latestRehireDate, isActive=$isActive, employmentStatus=$employmentStatus, classCode=$classCode, location=$location, income=$income, incomeHistory=$incomeHistory, customFields=$customFields, sourceId=$sourceId, additionalProperties=$additionalProperties}"
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

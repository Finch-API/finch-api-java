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
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import com.tryfinch.api.models.*
import java.util.Objects

class SandboxDirectoryCreateParams
constructor(
    private val body: List<IndividualOrEmployment>,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun body(): List<IndividualOrEmployment> = body

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
    @JsonDeserialize(builder = SandboxDirectoryCreateBody.Builder::class)
    @NoAutoDetect
    class SandboxDirectoryCreateBody
    internal constructor(
        private val body: List<IndividualOrEmployment>?,
    ) {

        /**
         * Array of individuals to create. Takes all combined fields from `/individual` and
         * `/employment` endpoints. All fields are optional.
         */
        @JsonProperty("body") fun body(): List<IndividualOrEmployment>? = body

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var body: List<IndividualOrEmployment>? = null

            @JvmSynthetic
            internal fun from(sandboxDirectoryCreateBody: SandboxDirectoryCreateBody) = apply {
                this.body = sandboxDirectoryCreateBody.body
            }

            /**
             * Array of individuals to create. Takes all combined fields from `/individual` and
             * `/employment` endpoints. All fields are optional.
             */
            @JsonProperty("body")
            fun body(body: List<IndividualOrEmployment>) = apply { this.body = body }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SandboxDirectoryCreateBody && this.body == other.body /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(body) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "SandboxDirectoryCreateBody{body=$body}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SandboxDirectoryCreateParams && this.body == other.body && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "SandboxDirectoryCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

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
            this.body(sandboxDirectoryCreateParams.body)
            additionalHeaders(sandboxDirectoryCreateParams.additionalHeaders)
            additionalQueryParams(sandboxDirectoryCreateParams.additionalQueryParams)
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
                checkNotNull(body) { "`body` is required but was not set" }.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JsonDeserialize(builder = IndividualOrEmployment.Builder::class)
    @NoAutoDetect
    class IndividualOrEmployment
    private constructor(
        private val firstName: String?,
        private val middleName: String?,
        private val lastName: String?,
        private val preferredName: String?,
        private val emails: List<Email>?,
        private val phoneNumbers: List<PhoneNumber?>?,
        private val gender: Gender?,
        private val ethnicity: Ethnicity?,
        private val dob: String?,
        private val ssn: String?,
        private val encryptedSsn: String?,
        private val residence: Location?,
        private val title: String?,
        private val manager: Manager?,
        private val department: Department?,
        private val employment: Employment?,
        private val startDate: String?,
        private val endDate: String?,
        private val latestRehireDate: String?,
        private val isActive: Boolean?,
        private val classCode: String?,
        private val location: Location?,
        private val income: Income?,
        private val incomeHistory: List<Income?>?,
        private val customFields: List<CustomField>?,
        private val sourceId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The legal first name of the individual. */
        @JsonProperty("first_name") fun firstName(): String? = firstName

        /** The legal middle name of the individual. */
        @JsonProperty("middle_name") fun middleName(): String? = middleName

        /** The legal last name of the individual. */
        @JsonProperty("last_name") fun lastName(): String? = lastName

        /** The preferred name of the individual. */
        @JsonProperty("preferred_name") fun preferredName(): String? = preferredName

        @JsonProperty("emails") fun emails(): List<Email>? = emails

        @JsonProperty("phone_numbers") fun phoneNumbers(): List<PhoneNumber?>? = phoneNumbers

        /** The gender of the individual. */
        @JsonProperty("gender") fun gender(): Gender? = gender

        /** The EEOC-defined ethnicity of the individual. */
        @JsonProperty("ethnicity") fun ethnicity(): Ethnicity? = ethnicity

        @JsonProperty("dob") fun dob(): String? = dob

        /**
         * Social Security Number of the individual. This field is only available with the `ssn`
         * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
         * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
         */
        @JsonProperty("ssn") fun ssn(): String? = ssn

        /**
         * Social Security Number of the individual in **encrypted** format. This field is only
         * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param set
         * in the body.
         */
        @JsonProperty("encrypted_ssn") fun encryptedSsn(): String? = encryptedSsn

        @JsonProperty("residence") fun residence(): Location? = residence

        /** The current title of the individual. */
        @JsonProperty("title") fun title(): String? = title

        /** The manager object representing the manager of the individual within the org. */
        @JsonProperty("manager") fun manager(): Manager? = manager

        /** The department object. */
        @JsonProperty("department") fun department(): Department? = department

        /** The employment object. */
        @JsonProperty("employment") fun employment(): Employment? = employment

        @JsonProperty("start_date") fun startDate(): String? = startDate

        @JsonProperty("end_date") fun endDate(): String? = endDate

        @JsonProperty("latest_rehire_date") fun latestRehireDate(): String? = latestRehireDate

        /** `true` if the individual an an active employee or contractor at the company. */
        @JsonProperty("is_active") fun isActive(): Boolean? = isActive

        /** Worker's compensation classification code for this employee */
        @JsonProperty("class_code") fun classCode(): String? = classCode

        @JsonProperty("location") fun location(): Location? = location

        /**
         * The employee's income as reported by the provider. This may not always be annualized
         * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
         * information the provider returns.
         */
        @JsonProperty("income") fun income(): Income? = income

        /** The array of income history. */
        @JsonProperty("income_history") fun incomeHistory(): List<Income?>? = incomeHistory

        /**
         * Custom fields for the individual. These are fields which are defined by the employer in
         * the system. Custom fields are not currently supported for assisted connections.
         */
        @JsonProperty("custom_fields") fun customFields(): List<CustomField>? = customFields

        /** The source system's unique employment identifier for this individual */
        @JsonProperty("source_id") fun sourceId(): String? = sourceId

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
            private var classCode: String? = null
            private var location: Location? = null
            private var income: Income? = null
            private var incomeHistory: List<Income?>? = null
            private var customFields: List<CustomField>? = null
            private var sourceId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(individualOrEmployment: IndividualOrEmployment) = apply {
                this.firstName = individualOrEmployment.firstName
                this.middleName = individualOrEmployment.middleName
                this.lastName = individualOrEmployment.lastName
                this.preferredName = individualOrEmployment.preferredName
                this.emails = individualOrEmployment.emails
                this.phoneNumbers = individualOrEmployment.phoneNumbers
                this.gender = individualOrEmployment.gender
                this.ethnicity = individualOrEmployment.ethnicity
                this.dob = individualOrEmployment.dob
                this.ssn = individualOrEmployment.ssn
                this.encryptedSsn = individualOrEmployment.encryptedSsn
                this.residence = individualOrEmployment.residence
                this.title = individualOrEmployment.title
                this.manager = individualOrEmployment.manager
                this.department = individualOrEmployment.department
                this.employment = individualOrEmployment.employment
                this.startDate = individualOrEmployment.startDate
                this.endDate = individualOrEmployment.endDate
                this.latestRehireDate = individualOrEmployment.latestRehireDate
                this.isActive = individualOrEmployment.isActive
                this.classCode = individualOrEmployment.classCode
                this.location = individualOrEmployment.location
                this.income = individualOrEmployment.income
                this.incomeHistory = individualOrEmployment.incomeHistory
                this.customFields = individualOrEmployment.customFields
                this.sourceId = individualOrEmployment.sourceId
                additionalProperties(individualOrEmployment.additionalProperties)
            }

            /** The legal first name of the individual. */
            @JsonProperty("first_name")
            fun firstName(firstName: String) = apply { this.firstName = firstName }

            /** The legal middle name of the individual. */
            @JsonProperty("middle_name")
            fun middleName(middleName: String) = apply { this.middleName = middleName }

            /** The legal last name of the individual. */
            @JsonProperty("last_name")
            fun lastName(lastName: String) = apply { this.lastName = lastName }

            /** The preferred name of the individual. */
            @JsonProperty("preferred_name")
            fun preferredName(preferredName: String) = apply { this.preferredName = preferredName }

            @JsonProperty("emails") fun emails(emails: List<Email>) = apply { this.emails = emails }

            @JsonProperty("phone_numbers")
            fun phoneNumbers(phoneNumbers: List<PhoneNumber?>) = apply {
                this.phoneNumbers = phoneNumbers
            }

            /** The gender of the individual. */
            @JsonProperty("gender") fun gender(gender: Gender) = apply { this.gender = gender }

            /** The EEOC-defined ethnicity of the individual. */
            @JsonProperty("ethnicity")
            fun ethnicity(ethnicity: Ethnicity) = apply { this.ethnicity = ethnicity }

            @JsonProperty("dob") fun dob(dob: String) = apply { this.dob = dob }

            /**
             * Social Security Number of the individual. This field is only available with the `ssn`
             * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
             * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
             */
            @JsonProperty("ssn") fun ssn(ssn: String) = apply { this.ssn = ssn }

            /**
             * Social Security Number of the individual in **encrypted** format. This field is only
             * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param
             * set in the body.
             */
            @JsonProperty("encrypted_ssn")
            fun encryptedSsn(encryptedSsn: String) = apply { this.encryptedSsn = encryptedSsn }

            @JsonProperty("residence")
            fun residence(residence: Location) = apply { this.residence = residence }

            /** The current title of the individual. */
            @JsonProperty("title") fun title(title: String) = apply { this.title = title }

            /** The manager object representing the manager of the individual within the org. */
            @JsonProperty("manager")
            fun manager(manager: Manager) = apply { this.manager = manager }

            /** The department object. */
            @JsonProperty("department")
            fun department(department: Department) = apply { this.department = department }

            /** The employment object. */
            @JsonProperty("employment")
            fun employment(employment: Employment) = apply { this.employment = employment }

            @JsonProperty("start_date")
            fun startDate(startDate: String) = apply { this.startDate = startDate }

            @JsonProperty("end_date")
            fun endDate(endDate: String) = apply { this.endDate = endDate }

            @JsonProperty("latest_rehire_date")
            fun latestRehireDate(latestRehireDate: String) = apply {
                this.latestRehireDate = latestRehireDate
            }

            /** `true` if the individual an an active employee or contractor at the company. */
            @JsonProperty("is_active")
            fun isActive(isActive: Boolean) = apply { this.isActive = isActive }

            /** Worker's compensation classification code for this employee */
            @JsonProperty("class_code")
            fun classCode(classCode: String) = apply { this.classCode = classCode }

            @JsonProperty("location")
            fun location(location: Location) = apply { this.location = location }

            /**
             * The employee's income as reported by the provider. This may not always be annualized
             * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
             * information the provider returns.
             */
            @JsonProperty("income") fun income(income: Income) = apply { this.income = income }

            /** The array of income history. */
            @JsonProperty("income_history")
            fun incomeHistory(incomeHistory: List<Income?>) = apply {
                this.incomeHistory = incomeHistory
            }

            /**
             * Custom fields for the individual. These are fields which are defined by the employer
             * in the system. Custom fields are not currently supported for assisted connections.
             */
            @JsonProperty("custom_fields")
            fun customFields(customFields: List<CustomField>) = apply {
                this.customFields = customFields
            }

            /** The source system's unique employment identifier for this individual */
            @JsonProperty("source_id")
            fun sourceId(sourceId: String) = apply { this.sourceId = sourceId }

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
                    classCode,
                    location,
                    income,
                    incomeHistory?.toImmutable(),
                    customFields?.toImmutable(),
                    sourceId,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = CustomField.Builder::class)
        @NoAutoDetect
        class CustomField
        private constructor(
            private val name: String?,
            private val value: JsonValue?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonProperty("name") fun name(): String? = name

            @JsonProperty("value") fun value(): JsonValue? = value

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
                    this.name = customField.name
                    this.value = customField.value
                    additionalProperties(customField.additionalProperties)
                }

                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                @JsonProperty("value") fun value(value: JsonValue) = apply { this.value = value }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
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

                return /* spotless:off */ other is CustomField && this.name == other.name && this.value == other.value && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(name, value, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "CustomField{name=$name, value=$value, additionalProperties=$additionalProperties}"
        }

        /** The department object. */
        @JsonDeserialize(builder = Department.Builder::class)
        @NoAutoDetect
        class Department
        private constructor(
            private val name: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The name of the department associated with the individual. */
            @JsonProperty("name") fun name(): String? = name

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
                    this.name = department.name
                    additionalProperties(department.additionalProperties)
                }

                /** The name of the department associated with the individual. */
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Department = Department(name, additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Department && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(name, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Department{name=$name, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = Email.Builder::class)
        @NoAutoDetect
        class Email
        private constructor(
            private val data: String?,
            private val type: Type?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonProperty("data") fun data(): String? = data

            @JsonProperty("type") fun type(): Type? = type

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
                    this.data = email.data
                    this.type = email.type
                    additionalProperties(email.additionalProperties)
                }

                @JsonProperty("data") fun data(data: String) = apply { this.data = data }

                @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val WORK = Type(JsonField.of("work"))

                    @JvmField val PERSONAL = Type(JsonField.of("personal"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Email && this.data == other.data && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(data, type, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Email{data=$data, type=$type, additionalProperties=$additionalProperties}"
        }

        /** The employment object. */
        @JsonDeserialize(builder = Employment.Builder::class)
        @NoAutoDetect
        class Employment
        private constructor(
            private val type: Type?,
            private val subtype: Subtype?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The main employment type of the individual. */
            @JsonProperty("type") fun type(): Type? = type

            /**
             * The secondary employment type of the individual. Options: `full_time`, `part_time`,
             * `intern`, `temp`, `seasonal` and `individual_contractor`.
             */
            @JsonProperty("subtype") fun subtype(): Subtype? = subtype

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
                    this.type = employment.type
                    this.subtype = employment.subtype
                    additionalProperties(employment.additionalProperties)
                }

                /** The main employment type of the individual. */
                @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

                /**
                 * The secondary employment type of the individual. Options: `full_time`,
                 * `part_time`, `intern`, `temp`, `seasonal` and `individual_contractor`.
                 */
                @JsonProperty("subtype")
                fun subtype(subtype: Subtype) = apply { this.subtype = subtype }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Subtype && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val FULL_TIME = Subtype(JsonField.of("full_time"))

                    @JvmField val INTERN = Subtype(JsonField.of("intern"))

                    @JvmField val PART_TIME = Subtype(JsonField.of("part_time"))

                    @JvmField val TEMP = Subtype(JsonField.of("temp"))

                    @JvmField val SEASONAL = Subtype(JsonField.of("seasonal"))

                    @JvmField
                    val INDIVIDUAL_CONTRACTOR = Subtype(JsonField.of("individual_contractor"))

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
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val EMPLOYEE = Type(JsonField.of("employee"))

                    @JvmField val CONTRACTOR = Type(JsonField.of("contractor"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Employment && this.type == other.type && this.subtype == other.subtype && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(type, subtype, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Employment{type=$type, subtype=$subtype, additionalProperties=$additionalProperties}"
        }

        class Ethnicity
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Ethnicity && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ASIAN = Ethnicity(JsonField.of("asian"))

                @JvmField val WHITE = Ethnicity(JsonField.of("white"))

                @JvmField
                val BLACK_OR_AFRICAN_AMERICAN = Ethnicity(JsonField.of("black_or_african_american"))

                @JvmField
                val NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER =
                    Ethnicity(JsonField.of("native_hawaiian_or_pacific_islander"))

                @JvmField
                val AMERICAN_INDIAN_OR_ALASKA_NATIVE =
                    Ethnicity(JsonField.of("american_indian_or_alaska_native"))

                @JvmField val HISPANIC_OR_LATINO = Ethnicity(JsonField.of("hispanic_or_latino"))

                @JvmField val TWO_OR_MORE_RACES = Ethnicity(JsonField.of("two_or_more_races"))

                @JvmField val DECLINE_TO_SPECIFY = Ethnicity(JsonField.of("decline_to_specify"))

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
        }

        class Gender
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Gender && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val FEMALE = Gender(JsonField.of("female"))

                @JvmField val MALE = Gender(JsonField.of("male"))

                @JvmField val OTHER = Gender(JsonField.of("other"))

                @JvmField val DECLINE_TO_SPECIFY = Gender(JsonField.of("decline_to_specify"))

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
        }

        /** The manager object representing the manager of the individual within the org. */
        @JsonDeserialize(builder = Manager.Builder::class)
        @NoAutoDetect
        class Manager
        private constructor(
            private val id: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** A stable Finch `id` (UUID v4) for an individual in the company. */
            @JsonProperty("id") fun id(): String? = id

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
                    this.id = manager.id
                    additionalProperties(manager.additionalProperties)
                }

                /** A stable Finch `id` (UUID v4) for an individual in the company. */
                @JsonProperty("id") fun id(id: String) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Manager = Manager(id, additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Manager && this.id == other.id && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Manager{id=$id, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = PhoneNumber.Builder::class)
        @NoAutoDetect
        class PhoneNumber
        private constructor(
            private val data: String?,
            private val type: Type?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonProperty("data") fun data(): String? = data

            @JsonProperty("type") fun type(): Type? = type

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
                    this.data = phoneNumber.data
                    this.type = phoneNumber.type
                    additionalProperties(phoneNumber.additionalProperties)
                }

                @JsonProperty("data") fun data(data: String) = apply { this.data = data }

                @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val WORK = Type(JsonField.of("work"))

                    @JvmField val PERSONAL = Type(JsonField.of("personal"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PhoneNumber && this.data == other.data && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(data, type, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "PhoneNumber{data=$data, type=$type, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is IndividualOrEmployment && this.firstName == other.firstName && this.middleName == other.middleName && this.lastName == other.lastName && this.preferredName == other.preferredName && this.emails == other.emails && this.phoneNumbers == other.phoneNumbers && this.gender == other.gender && this.ethnicity == other.ethnicity && this.dob == other.dob && this.ssn == other.ssn && this.encryptedSsn == other.encryptedSsn && this.residence == other.residence && this.title == other.title && this.manager == other.manager && this.department == other.department && this.employment == other.employment && this.startDate == other.startDate && this.endDate == other.endDate && this.latestRehireDate == other.latestRehireDate && this.isActive == other.isActive && this.classCode == other.classCode && this.location == other.location && this.income == other.income && this.incomeHistory == other.incomeHistory && this.customFields == other.customFields && this.sourceId == other.sourceId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(firstName, middleName, lastName, preferredName, emails, phoneNumbers, gender, ethnicity, dob, ssn, encryptedSsn, residence, title, manager, department, employment, startDate, endDate, latestRehireDate, isActive, classCode, location, income, incomeHistory, customFields, sourceId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "IndividualOrEmployment{firstName=$firstName, middleName=$middleName, lastName=$lastName, preferredName=$preferredName, emails=$emails, phoneNumbers=$phoneNumbers, gender=$gender, ethnicity=$ethnicity, dob=$dob, ssn=$ssn, encryptedSsn=$encryptedSsn, residence=$residence, title=$title, manager=$manager, department=$department, employment=$employment, startDate=$startDate, endDate=$endDate, latestRehireDate=$latestRehireDate, isActive=$isActive, classCode=$classCode, location=$location, income=$income, incomeHistory=$incomeHistory, customFields=$customFields, sourceId=$sourceId, additionalProperties=$additionalProperties}"
    }
}

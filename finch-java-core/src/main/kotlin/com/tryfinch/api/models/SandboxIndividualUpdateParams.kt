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

class SandboxIndividualUpdateParams
constructor(
    private val individualId: String,
    private val body: SandboxIndividualUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun individualId(): String = individualId

    fun dob(): Optional<String> = body.dob()

    fun emails(): Optional<List<Email>> = body.emails()

    /**
     * Social Security Number of the individual in **encrypted** format. This field is only
     * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param set in
     * the body.
     */
    fun encryptedSsn(): Optional<String> = body.encryptedSsn()

    /** The EEOC-defined ethnicity of the individual. */
    fun ethnicity(): Optional<Ethnicity> = body.ethnicity()

    /** The legal first name of the individual. */
    fun firstName(): Optional<String> = body.firstName()

    /** The gender of the individual. */
    fun gender(): Optional<Gender> = body.gender()

    /** The legal last name of the individual. */
    fun lastName(): Optional<String> = body.lastName()

    /** The legal middle name of the individual. */
    fun middleName(): Optional<String> = body.middleName()

    fun phoneNumbers(): Optional<List<PhoneNumber?>> = body.phoneNumbers()

    /** The preferred name of the individual. */
    fun preferredName(): Optional<String> = body.preferredName()

    fun residence(): Optional<Location> = body.residence()

    /**
     * Social Security Number of the individual. This field is only available with the `ssn` scope
     * enabled and the `options: { include: ['ssn'] }` param set in the body.
     * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
     */
    fun ssn(): Optional<String> = body.ssn()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): SandboxIndividualUpdateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> individualId
            else -> ""
        }
    }

    @NoAutoDetect
    class SandboxIndividualUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("dob") private val dob: String?,
        @JsonProperty("emails") private val emails: List<Email>?,
        @JsonProperty("encrypted_ssn") private val encryptedSsn: String?,
        @JsonProperty("ethnicity") private val ethnicity: Ethnicity?,
        @JsonProperty("first_name") private val firstName: String?,
        @JsonProperty("gender") private val gender: Gender?,
        @JsonProperty("last_name") private val lastName: String?,
        @JsonProperty("middle_name") private val middleName: String?,
        @JsonProperty("phone_numbers") private val phoneNumbers: List<PhoneNumber?>?,
        @JsonProperty("preferred_name") private val preferredName: String?,
        @JsonProperty("residence") private val residence: Location?,
        @JsonProperty("ssn") private val ssn: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("dob") fun dob(): Optional<String> = Optional.ofNullable(dob)

        @JsonProperty("emails") fun emails(): Optional<List<Email>> = Optional.ofNullable(emails)

        /**
         * Social Security Number of the individual in **encrypted** format. This field is only
         * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param set
         * in the body.
         */
        @JsonProperty("encrypted_ssn")
        fun encryptedSsn(): Optional<String> = Optional.ofNullable(encryptedSsn)

        /** The EEOC-defined ethnicity of the individual. */
        @JsonProperty("ethnicity")
        fun ethnicity(): Optional<Ethnicity> = Optional.ofNullable(ethnicity)

        /** The legal first name of the individual. */
        @JsonProperty("first_name")
        fun firstName(): Optional<String> = Optional.ofNullable(firstName)

        /** The gender of the individual. */
        @JsonProperty("gender") fun gender(): Optional<Gender> = Optional.ofNullable(gender)

        /** The legal last name of the individual. */
        @JsonProperty("last_name") fun lastName(): Optional<String> = Optional.ofNullable(lastName)

        /** The legal middle name of the individual. */
        @JsonProperty("middle_name")
        fun middleName(): Optional<String> = Optional.ofNullable(middleName)

        @JsonProperty("phone_numbers")
        fun phoneNumbers(): Optional<List<PhoneNumber?>> = Optional.ofNullable(phoneNumbers)

        /** The preferred name of the individual. */
        @JsonProperty("preferred_name")
        fun preferredName(): Optional<String> = Optional.ofNullable(preferredName)

        @JsonProperty("residence")
        fun residence(): Optional<Location> = Optional.ofNullable(residence)

        /**
         * Social Security Number of the individual. This field is only available with the `ssn`
         * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
         * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
         */
        @JsonProperty("ssn") fun ssn(): Optional<String> = Optional.ofNullable(ssn)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var dob: String? = null
            private var emails: MutableList<Email>? = null
            private var encryptedSsn: String? = null
            private var ethnicity: Ethnicity? = null
            private var firstName: String? = null
            private var gender: Gender? = null
            private var lastName: String? = null
            private var middleName: String? = null
            private var phoneNumbers: MutableList<PhoneNumber?>? = null
            private var preferredName: String? = null
            private var residence: Location? = null
            private var ssn: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sandboxIndividualUpdateBody: SandboxIndividualUpdateBody) = apply {
                dob = sandboxIndividualUpdateBody.dob
                emails = sandboxIndividualUpdateBody.emails?.toMutableList()
                encryptedSsn = sandboxIndividualUpdateBody.encryptedSsn
                ethnicity = sandboxIndividualUpdateBody.ethnicity
                firstName = sandboxIndividualUpdateBody.firstName
                gender = sandboxIndividualUpdateBody.gender
                lastName = sandboxIndividualUpdateBody.lastName
                middleName = sandboxIndividualUpdateBody.middleName
                phoneNumbers = sandboxIndividualUpdateBody.phoneNumbers?.toMutableList()
                preferredName = sandboxIndividualUpdateBody.preferredName
                residence = sandboxIndividualUpdateBody.residence
                ssn = sandboxIndividualUpdateBody.ssn
                additionalProperties =
                    sandboxIndividualUpdateBody.additionalProperties.toMutableMap()
            }

            fun dob(dob: String) = apply { this.dob = dob }

            fun emails(emails: List<Email>) = apply { this.emails = emails.toMutableList() }

            fun addEmail(email: Email) = apply {
                emails = (emails ?: mutableListOf()).apply { add(email) }
            }

            /**
             * Social Security Number of the individual in **encrypted** format. This field is only
             * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param
             * set in the body.
             */
            fun encryptedSsn(encryptedSsn: String) = apply { this.encryptedSsn = encryptedSsn }

            /** The EEOC-defined ethnicity of the individual. */
            fun ethnicity(ethnicity: Ethnicity) = apply { this.ethnicity = ethnicity }

            /** The legal first name of the individual. */
            fun firstName(firstName: String) = apply { this.firstName = firstName }

            /** The gender of the individual. */
            fun gender(gender: Gender) = apply { this.gender = gender }

            /** The legal last name of the individual. */
            fun lastName(lastName: String) = apply { this.lastName = lastName }

            /** The legal middle name of the individual. */
            fun middleName(middleName: String) = apply { this.middleName = middleName }

            fun phoneNumbers(phoneNumbers: List<PhoneNumber?>) = apply {
                this.phoneNumbers = phoneNumbers.toMutableList()
            }

            fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
                phoneNumbers = (phoneNumbers ?: mutableListOf()).apply { add(phoneNumber) }
            }

            /** The preferred name of the individual. */
            fun preferredName(preferredName: String) = apply { this.preferredName = preferredName }

            fun residence(residence: Location) = apply { this.residence = residence }

            /**
             * Social Security Number of the individual. This field is only available with the `ssn`
             * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
             * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
             */
            fun ssn(ssn: String) = apply { this.ssn = ssn }

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

            fun build(): SandboxIndividualUpdateBody =
                SandboxIndividualUpdateBody(
                    dob,
                    emails?.toImmutable(),
                    encryptedSsn,
                    ethnicity,
                    firstName,
                    gender,
                    lastName,
                    middleName,
                    phoneNumbers?.toImmutable(),
                    preferredName,
                    residence,
                    ssn,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SandboxIndividualUpdateBody && dob == other.dob && emails == other.emails && encryptedSsn == other.encryptedSsn && ethnicity == other.ethnicity && firstName == other.firstName && gender == other.gender && lastName == other.lastName && middleName == other.middleName && phoneNumbers == other.phoneNumbers && preferredName == other.preferredName && residence == other.residence && ssn == other.ssn && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(dob, emails, encryptedSsn, ethnicity, firstName, gender, lastName, middleName, phoneNumbers, preferredName, residence, ssn, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SandboxIndividualUpdateBody{dob=$dob, emails=$emails, encryptedSsn=$encryptedSsn, ethnicity=$ethnicity, firstName=$firstName, gender=$gender, lastName=$lastName, middleName=$middleName, phoneNumbers=$phoneNumbers, preferredName=$preferredName, residence=$residence, ssn=$ssn, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var individualId: String? = null
        private var body: SandboxIndividualUpdateBody.Builder =
            SandboxIndividualUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sandboxIndividualUpdateParams: SandboxIndividualUpdateParams) = apply {
            individualId = sandboxIndividualUpdateParams.individualId
            body = sandboxIndividualUpdateParams.body.toBuilder()
            additionalHeaders = sandboxIndividualUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = sandboxIndividualUpdateParams.additionalQueryParams.toBuilder()
        }

        fun individualId(individualId: String) = apply { this.individualId = individualId }

        fun dob(dob: String) = apply { body.dob(dob) }

        fun emails(emails: List<Email>) = apply { body.emails(emails) }

        fun addEmail(email: Email) = apply { body.addEmail(email) }

        /**
         * Social Security Number of the individual in **encrypted** format. This field is only
         * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param set
         * in the body.
         */
        fun encryptedSsn(encryptedSsn: String) = apply { body.encryptedSsn(encryptedSsn) }

        /** The EEOC-defined ethnicity of the individual. */
        fun ethnicity(ethnicity: Ethnicity) = apply { body.ethnicity(ethnicity) }

        /** The legal first name of the individual. */
        fun firstName(firstName: String) = apply { body.firstName(firstName) }

        /** The gender of the individual. */
        fun gender(gender: Gender) = apply { body.gender(gender) }

        /** The legal last name of the individual. */
        fun lastName(lastName: String) = apply { body.lastName(lastName) }

        /** The legal middle name of the individual. */
        fun middleName(middleName: String) = apply { body.middleName(middleName) }

        fun phoneNumbers(phoneNumbers: List<PhoneNumber?>) = apply {
            body.phoneNumbers(phoneNumbers)
        }

        fun addPhoneNumber(phoneNumber: PhoneNumber) = apply { body.addPhoneNumber(phoneNumber) }

        /** The preferred name of the individual. */
        fun preferredName(preferredName: String) = apply { body.preferredName(preferredName) }

        fun residence(residence: Location) = apply { body.residence(residence) }

        /**
         * Social Security Number of the individual. This field is only available with the `ssn`
         * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
         * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
         */
        fun ssn(ssn: String) = apply { body.ssn(ssn) }

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

        fun build(): SandboxIndividualUpdateParams =
            SandboxIndividualUpdateParams(
                checkNotNull(individualId) { "`individualId` is required but was not set" },
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

            @JvmField val AMERICAN_INDIAN_OR_ALASKA_NATIVE = of("american_indian_or_alaska_native")

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

        return /* spotless:off */ other is SandboxIndividualUpdateParams && individualId == other.individualId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(individualId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SandboxIndividualUpdateParams{individualId=$individualId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

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
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.errors.FinchInvalidDataException
import com.tryfinch.api.models.*
import java.util.Objects
import java.util.Optional

class SandboxIndividualUpdateParams
constructor(
    private val individualId: String,
    private val dob: String?,
    private val emails: List<Email>?,
    private val encryptedSsn: String?,
    private val ethnicity: Ethnicity?,
    private val firstName: String?,
    private val gender: Gender?,
    private val lastName: String?,
    private val middleName: String?,
    private val phoneNumbers: List<PhoneNumber?>?,
    private val preferredName: String?,
    private val residence: Location?,
    private val ssn: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun individualId(): String = individualId

    fun dob(): Optional<String> = Optional.ofNullable(dob)

    fun emails(): Optional<List<Email>> = Optional.ofNullable(emails)

    fun encryptedSsn(): Optional<String> = Optional.ofNullable(encryptedSsn)

    fun ethnicity(): Optional<Ethnicity> = Optional.ofNullable(ethnicity)

    fun firstName(): Optional<String> = Optional.ofNullable(firstName)

    fun gender(): Optional<Gender> = Optional.ofNullable(gender)

    fun lastName(): Optional<String> = Optional.ofNullable(lastName)

    fun middleName(): Optional<String> = Optional.ofNullable(middleName)

    fun phoneNumbers(): Optional<List<PhoneNumber?>> = Optional.ofNullable(phoneNumbers)

    fun preferredName(): Optional<String> = Optional.ofNullable(preferredName)

    fun residence(): Optional<Location> = Optional.ofNullable(residence)

    fun ssn(): Optional<String> = Optional.ofNullable(ssn)

    @JvmSynthetic
    internal fun getBody(): SandboxIndividualUpdateBody {
        return SandboxIndividualUpdateBody(
            dob,
            emails,
            encryptedSsn,
            ethnicity,
            firstName,
            gender,
            lastName,
            middleName,
            phoneNumbers,
            preferredName,
            residence,
            ssn,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> individualId
            else -> ""
        }
    }

    @JsonDeserialize(builder = SandboxIndividualUpdateBody.Builder::class)
    @NoAutoDetect
    class SandboxIndividualUpdateBody
    internal constructor(
        private val dob: String?,
        private val emails: List<Email>?,
        private val encryptedSsn: String?,
        private val ethnicity: Ethnicity?,
        private val firstName: String?,
        private val gender: Gender?,
        private val lastName: String?,
        private val middleName: String?,
        private val phoneNumbers: List<PhoneNumber?>?,
        private val preferredName: String?,
        private val residence: Location?,
        private val ssn: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("dob") fun dob(): String? = dob

        @JsonProperty("emails") fun emails(): List<Email>? = emails

        /**
         * Social Security Number of the individual in **encrypted** format. This field is only
         * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param set
         * in the body.
         */
        @JsonProperty("encrypted_ssn") fun encryptedSsn(): String? = encryptedSsn

        /** The EEOC-defined ethnicity of the individual. */
        @JsonProperty("ethnicity") fun ethnicity(): Ethnicity? = ethnicity

        /** The legal first name of the individual. */
        @JsonProperty("first_name") fun firstName(): String? = firstName

        /** The gender of the individual. */
        @JsonProperty("gender") fun gender(): Gender? = gender

        /** The legal last name of the individual. */
        @JsonProperty("last_name") fun lastName(): String? = lastName

        /** The legal middle name of the individual. */
        @JsonProperty("middle_name") fun middleName(): String? = middleName

        @JsonProperty("phone_numbers") fun phoneNumbers(): List<PhoneNumber?>? = phoneNumbers

        /** The preferred name of the individual. */
        @JsonProperty("preferred_name") fun preferredName(): String? = preferredName

        @JsonProperty("residence") fun residence(): Location? = residence

        /**
         * Social Security Number of the individual. This field is only available with the `ssn`
         * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
         */
        @JsonProperty("ssn") fun ssn(): String? = ssn

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SandboxIndividualUpdateBody &&
                this.dob == other.dob &&
                this.emails == other.emails &&
                this.encryptedSsn == other.encryptedSsn &&
                this.ethnicity == other.ethnicity &&
                this.firstName == other.firstName &&
                this.gender == other.gender &&
                this.lastName == other.lastName &&
                this.middleName == other.middleName &&
                this.phoneNumbers == other.phoneNumbers &&
                this.preferredName == other.preferredName &&
                this.residence == other.residence &&
                this.ssn == other.ssn &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        dob,
                        emails,
                        encryptedSsn,
                        ethnicity,
                        firstName,
                        gender,
                        lastName,
                        middleName,
                        phoneNumbers,
                        preferredName,
                        residence,
                        ssn,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SandboxIndividualUpdateBody{dob=$dob, emails=$emails, encryptedSsn=$encryptedSsn, ethnicity=$ethnicity, firstName=$firstName, gender=$gender, lastName=$lastName, middleName=$middleName, phoneNumbers=$phoneNumbers, preferredName=$preferredName, residence=$residence, ssn=$ssn, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var dob: String? = null
            private var emails: List<Email>? = null
            private var encryptedSsn: String? = null
            private var ethnicity: Ethnicity? = null
            private var firstName: String? = null
            private var gender: Gender? = null
            private var lastName: String? = null
            private var middleName: String? = null
            private var phoneNumbers: List<PhoneNumber?>? = null
            private var preferredName: String? = null
            private var residence: Location? = null
            private var ssn: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sandboxIndividualUpdateBody: SandboxIndividualUpdateBody) = apply {
                this.dob = sandboxIndividualUpdateBody.dob
                this.emails = sandboxIndividualUpdateBody.emails
                this.encryptedSsn = sandboxIndividualUpdateBody.encryptedSsn
                this.ethnicity = sandboxIndividualUpdateBody.ethnicity
                this.firstName = sandboxIndividualUpdateBody.firstName
                this.gender = sandboxIndividualUpdateBody.gender
                this.lastName = sandboxIndividualUpdateBody.lastName
                this.middleName = sandboxIndividualUpdateBody.middleName
                this.phoneNumbers = sandboxIndividualUpdateBody.phoneNumbers
                this.preferredName = sandboxIndividualUpdateBody.preferredName
                this.residence = sandboxIndividualUpdateBody.residence
                this.ssn = sandboxIndividualUpdateBody.ssn
                additionalProperties(sandboxIndividualUpdateBody.additionalProperties)
            }

            @JsonProperty("dob") fun dob(dob: String) = apply { this.dob = dob }

            @JsonProperty("emails") fun emails(emails: List<Email>) = apply { this.emails = emails }

            /**
             * Social Security Number of the individual in **encrypted** format. This field is only
             * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param
             * set in the body.
             */
            @JsonProperty("encrypted_ssn")
            fun encryptedSsn(encryptedSsn: String) = apply { this.encryptedSsn = encryptedSsn }

            /** The EEOC-defined ethnicity of the individual. */
            @JsonProperty("ethnicity")
            fun ethnicity(ethnicity: Ethnicity) = apply { this.ethnicity = ethnicity }

            /** The legal first name of the individual. */
            @JsonProperty("first_name")
            fun firstName(firstName: String) = apply { this.firstName = firstName }

            /** The gender of the individual. */
            @JsonProperty("gender") fun gender(gender: Gender) = apply { this.gender = gender }

            /** The legal last name of the individual. */
            @JsonProperty("last_name")
            fun lastName(lastName: String) = apply { this.lastName = lastName }

            /** The legal middle name of the individual. */
            @JsonProperty("middle_name")
            fun middleName(middleName: String) = apply { this.middleName = middleName }

            @JsonProperty("phone_numbers")
            fun phoneNumbers(phoneNumbers: List<PhoneNumber?>) = apply {
                this.phoneNumbers = phoneNumbers
            }

            /** The preferred name of the individual. */
            @JsonProperty("preferred_name")
            fun preferredName(preferredName: String) = apply { this.preferredName = preferredName }

            @JsonProperty("residence")
            fun residence(residence: Location) = apply { this.residence = residence }

            /**
             * Social Security Number of the individual. This field is only available with the `ssn`
             * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
             */
            @JsonProperty("ssn") fun ssn(ssn: String) = apply { this.ssn = ssn }

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

            fun build(): SandboxIndividualUpdateBody =
                SandboxIndividualUpdateBody(
                    dob,
                    emails?.toUnmodifiable(),
                    encryptedSsn,
                    ethnicity,
                    firstName,
                    gender,
                    lastName,
                    middleName,
                    phoneNumbers?.toUnmodifiable(),
                    preferredName,
                    residence,
                    ssn,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SandboxIndividualUpdateParams &&
            this.individualId == other.individualId &&
            this.dob == other.dob &&
            this.emails == other.emails &&
            this.encryptedSsn == other.encryptedSsn &&
            this.ethnicity == other.ethnicity &&
            this.firstName == other.firstName &&
            this.gender == other.gender &&
            this.lastName == other.lastName &&
            this.middleName == other.middleName &&
            this.phoneNumbers == other.phoneNumbers &&
            this.preferredName == other.preferredName &&
            this.residence == other.residence &&
            this.ssn == other.ssn &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            individualId,
            dob,
            emails,
            encryptedSsn,
            ethnicity,
            firstName,
            gender,
            lastName,
            middleName,
            phoneNumbers,
            preferredName,
            residence,
            ssn,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SandboxIndividualUpdateParams{individualId=$individualId, dob=$dob, emails=$emails, encryptedSsn=$encryptedSsn, ethnicity=$ethnicity, firstName=$firstName, gender=$gender, lastName=$lastName, middleName=$middleName, phoneNumbers=$phoneNumbers, preferredName=$preferredName, residence=$residence, ssn=$ssn, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var individualId: String? = null
        private var dob: String? = null
        private var emails: MutableList<Email> = mutableListOf()
        private var encryptedSsn: String? = null
        private var ethnicity: Ethnicity? = null
        private var firstName: String? = null
        private var gender: Gender? = null
        private var lastName: String? = null
        private var middleName: String? = null
        private var phoneNumbers: MutableList<PhoneNumber?> = mutableListOf()
        private var preferredName: String? = null
        private var residence: Location? = null
        private var ssn: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sandboxIndividualUpdateParams: SandboxIndividualUpdateParams) = apply {
            this.individualId = sandboxIndividualUpdateParams.individualId
            this.dob = sandboxIndividualUpdateParams.dob
            this.emails(sandboxIndividualUpdateParams.emails ?: listOf())
            this.encryptedSsn = sandboxIndividualUpdateParams.encryptedSsn
            this.ethnicity = sandboxIndividualUpdateParams.ethnicity
            this.firstName = sandboxIndividualUpdateParams.firstName
            this.gender = sandboxIndividualUpdateParams.gender
            this.lastName = sandboxIndividualUpdateParams.lastName
            this.middleName = sandboxIndividualUpdateParams.middleName
            this.phoneNumbers(sandboxIndividualUpdateParams.phoneNumbers ?: listOf())
            this.preferredName = sandboxIndividualUpdateParams.preferredName
            this.residence = sandboxIndividualUpdateParams.residence
            this.ssn = sandboxIndividualUpdateParams.ssn
            additionalQueryParams(sandboxIndividualUpdateParams.additionalQueryParams)
            additionalHeaders(sandboxIndividualUpdateParams.additionalHeaders)
            additionalBodyProperties(sandboxIndividualUpdateParams.additionalBodyProperties)
        }

        fun individualId(individualId: String) = apply { this.individualId = individualId }

        fun dob(dob: String) = apply { this.dob = dob }

        fun emails(emails: List<Email>) = apply {
            this.emails.clear()
            this.emails.addAll(emails)
        }

        fun addEmail(email: Email) = apply { this.emails.add(email) }

        /**
         * Social Security Number of the individual in **encrypted** format. This field is only
         * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param set
         * in the body.
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
            this.phoneNumbers.clear()
            this.phoneNumbers.addAll(phoneNumbers)
        }

        fun addPhoneNumber(phoneNumber: PhoneNumber) = apply { this.phoneNumbers.add(phoneNumber) }

        /** The preferred name of the individual. */
        fun preferredName(preferredName: String) = apply { this.preferredName = preferredName }

        fun residence(residence: Location) = apply { this.residence = residence }

        /**
         * Social Security Number of the individual. This field is only available with the `ssn`
         * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
         */
        fun ssn(ssn: String) = apply { this.ssn = ssn }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): SandboxIndividualUpdateParams =
            SandboxIndividualUpdateParams(
                checkNotNull(individualId) { "`individualId` is required but was not set" },
                dob,
                if (emails.size == 0) null else emails.toUnmodifiable(),
                encryptedSsn,
                ethnicity,
                firstName,
                gender,
                lastName,
                middleName,
                if (phoneNumbers.size == 0) null else phoneNumbers.toUnmodifiable(),
                preferredName,
                residence,
                ssn,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Email.Builder::class)
    @NoAutoDetect
    class Email
    private constructor(
        private val data: String?,
        private val type: Type?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("data") fun data(): String? = data

        @JsonProperty("type") fun type(): Type? = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Email &&
                this.data == other.data &&
                this.type == other.type &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        data,
                        type,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Email{data=$data, type=$type, additionalProperties=$additionalProperties}"

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Email =
                Email(
                    data,
                    type,
                    additionalProperties.toUnmodifiable(),
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

                return other is Type && this.value == other.value
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

            return other is Ethnicity && this.value == other.value
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

            return other is Gender && this.value == other.value
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

    @JsonDeserialize(builder = PhoneNumber.Builder::class)
    @NoAutoDetect
    class PhoneNumber
    private constructor(
        private val data: String?,
        private val type: Type?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("data") fun data(): String? = data

        @JsonProperty("type") fun type(): Type? = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PhoneNumber &&
                this.data == other.data &&
                this.type == other.type &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        data,
                        type,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PhoneNumber{data=$data, type=$type, additionalProperties=$additionalProperties}"

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): PhoneNumber =
                PhoneNumber(
                    data,
                    type,
                    additionalProperties.toUnmodifiable(),
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

                return other is Type && this.value == other.value
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
    }
}

// File generated from our OpenAPI spec by Stainless.

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
import java.util.Optional

@JsonDeserialize(builder = Individual.Builder::class)
@NoAutoDetect
class Individual
private constructor(
    private val id: JsonField<String>,
    private val firstName: JsonField<String>,
    private val middleName: JsonField<String>,
    private val lastName: JsonField<String>,
    private val preferredName: JsonField<String>,
    private val emails: JsonField<List<Email>>,
    private val phoneNumbers: JsonField<List<PhoneNumber>>,
    private val gender: JsonField<Gender>,
    private val dob: JsonField<String>,
    private val residence: JsonField<Location>,
    private val ssn: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** A stable Finch `id` (UUID v4) for an individual in the company. */
    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /** The legal first name of the individual. */
    fun firstName(): Optional<String> = Optional.ofNullable(firstName.getNullable("first_name"))

    /** The legal middle name of the individual. */
    fun middleName(): Optional<String> = Optional.ofNullable(middleName.getNullable("middle_name"))

    /** The legal last name of the individual. */
    fun lastName(): Optional<String> = Optional.ofNullable(lastName.getNullable("last_name"))

    /** The preferred name of the individual. */
    fun preferredName(): Optional<String> =
        Optional.ofNullable(preferredName.getNullable("preferred_name"))

    fun emails(): Optional<List<Email>> = Optional.ofNullable(emails.getNullable("emails"))

    fun phoneNumbers(): Optional<List<PhoneNumber>> =
        Optional.ofNullable(phoneNumbers.getNullable("phone_numbers"))

    /** The gender of the individual. */
    fun gender(): Optional<Gender> = Optional.ofNullable(gender.getNullable("gender"))

    fun dob(): Optional<String> = Optional.ofNullable(dob.getNullable("dob"))

    fun residence(): Optional<Location> = Optional.ofNullable(residence.getNullable("residence"))

    /**
     * Note: This property is only available if enabled for your account. Please reach out to your
     * Finch representative if you would like access.
     */
    fun ssn(): Optional<String> = Optional.ofNullable(ssn.getNullable("ssn"))

    /** A stable Finch `id` (UUID v4) for an individual in the company. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The legal first name of the individual. */
    @JsonProperty("first_name") @ExcludeMissing fun _firstName() = firstName

    /** The legal middle name of the individual. */
    @JsonProperty("middle_name") @ExcludeMissing fun _middleName() = middleName

    /** The legal last name of the individual. */
    @JsonProperty("last_name") @ExcludeMissing fun _lastName() = lastName

    /** The preferred name of the individual. */
    @JsonProperty("preferred_name") @ExcludeMissing fun _preferredName() = preferredName

    @JsonProperty("emails") @ExcludeMissing fun _emails() = emails

    @JsonProperty("phone_numbers") @ExcludeMissing fun _phoneNumbers() = phoneNumbers

    /** The gender of the individual. */
    @JsonProperty("gender") @ExcludeMissing fun _gender() = gender

    @JsonProperty("dob") @ExcludeMissing fun _dob() = dob

    @JsonProperty("residence") @ExcludeMissing fun _residence() = residence

    /**
     * Note: This property is only available if enabled for your account. Please reach out to your
     * Finch representative if you would like access.
     */
    @JsonProperty("ssn") @ExcludeMissing fun _ssn() = ssn

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Individual = apply {
        if (!validated) {
            id()
            firstName()
            middleName()
            lastName()
            preferredName()
            emails().map { it.forEach { it.validate() } }
            phoneNumbers().map { it.forEach { it.validate() } }
            gender()
            dob()
            residence().map { it.validate() }
            ssn()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Individual &&
            this.id == other.id &&
            this.firstName == other.firstName &&
            this.middleName == other.middleName &&
            this.lastName == other.lastName &&
            this.preferredName == other.preferredName &&
            this.emails == other.emails &&
            this.phoneNumbers == other.phoneNumbers &&
            this.gender == other.gender &&
            this.dob == other.dob &&
            this.residence == other.residence &&
            this.ssn == other.ssn &&
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
                    preferredName,
                    emails,
                    phoneNumbers,
                    gender,
                    dob,
                    residence,
                    ssn,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Individual{id=$id, firstName=$firstName, middleName=$middleName, lastName=$lastName, preferredName=$preferredName, emails=$emails, phoneNumbers=$phoneNumbers, gender=$gender, dob=$dob, residence=$residence, ssn=$ssn, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var middleName: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var preferredName: JsonField<String> = JsonMissing.of()
        private var emails: JsonField<List<Email>> = JsonMissing.of()
        private var phoneNumbers: JsonField<List<PhoneNumber>> = JsonMissing.of()
        private var gender: JsonField<Gender> = JsonMissing.of()
        private var dob: JsonField<String> = JsonMissing.of()
        private var residence: JsonField<Location> = JsonMissing.of()
        private var ssn: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(individual: Individual) = apply {
            this.id = individual.id
            this.firstName = individual.firstName
            this.middleName = individual.middleName
            this.lastName = individual.lastName
            this.preferredName = individual.preferredName
            this.emails = individual.emails
            this.phoneNumbers = individual.phoneNumbers
            this.gender = individual.gender
            this.dob = individual.dob
            this.residence = individual.residence
            this.ssn = individual.ssn
            additionalProperties(individual.additionalProperties)
        }

        /** A stable Finch `id` (UUID v4) for an individual in the company. */
        fun id(id: String) = id(JsonField.of(id))

        /** A stable Finch `id` (UUID v4) for an individual in the company. */
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

        /** The preferred name of the individual. */
        fun preferredName(preferredName: String) = preferredName(JsonField.of(preferredName))

        /** The preferred name of the individual. */
        @JsonProperty("preferred_name")
        @ExcludeMissing
        fun preferredName(preferredName: JsonField<String>) = apply {
            this.preferredName = preferredName
        }

        fun emails(emails: List<Email>) = emails(JsonField.of(emails))

        @JsonProperty("emails")
        @ExcludeMissing
        fun emails(emails: JsonField<List<Email>>) = apply { this.emails = emails }

        fun phoneNumbers(phoneNumbers: List<PhoneNumber>) = phoneNumbers(JsonField.of(phoneNumbers))

        @JsonProperty("phone_numbers")
        @ExcludeMissing
        fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumber>>) = apply {
            this.phoneNumbers = phoneNumbers
        }

        /** The gender of the individual. */
        fun gender(gender: Gender) = gender(JsonField.of(gender))

        /** The gender of the individual. */
        @JsonProperty("gender")
        @ExcludeMissing
        fun gender(gender: JsonField<Gender>) = apply { this.gender = gender }

        fun dob(dob: String) = dob(JsonField.of(dob))

        @JsonProperty("dob")
        @ExcludeMissing
        fun dob(dob: JsonField<String>) = apply { this.dob = dob }

        fun residence(residence: Location) = residence(JsonField.of(residence))

        @JsonProperty("residence")
        @ExcludeMissing
        fun residence(residence: JsonField<Location>) = apply { this.residence = residence }

        /**
         * Note: This property is only available if enabled for your account. Please reach out to
         * your Finch representative if you would like access.
         */
        fun ssn(ssn: String) = ssn(JsonField.of(ssn))

        /**
         * Note: This property is only available if enabled for your account. Please reach out to
         * your Finch representative if you would like access.
         */
        @JsonProperty("ssn")
        @ExcludeMissing
        fun ssn(ssn: JsonField<String>) = apply { this.ssn = ssn }

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

        fun build(): Individual =
            Individual(
                id,
                firstName,
                middleName,
                lastName,
                preferredName,
                emails.map { it.toUnmodifiable() },
                phoneNumbers.map { it.toUnmodifiable() },
                gender,
                dob,
                residence,
                ssn,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Email.Builder::class)
    @NoAutoDetect
    class Email
    private constructor(
        private val data: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun data(): Optional<String> = Optional.ofNullable(data.getNullable("data"))

        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        @JsonProperty("data") @ExcludeMissing fun _data() = data

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Email = apply {
            if (!validated) {
                data()
                type()
                validated = true
            }
        }

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

            private var data: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(email: Email) = apply {
                this.data = email.data
                this.type = email.type
                additionalProperties(email.additionalProperties)
            }

            fun data(data: String) = data(JsonField.of(data))

            @JsonProperty("data")
            @ExcludeMissing
            fun data(data: JsonField<String>) = apply { this.data = data }

            fun type(type: Type) = type(JsonField.of(type))

            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

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

    class Gender
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

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
        private val data: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun data(): Optional<String> = Optional.ofNullable(data.getNullable("data"))

        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        @JsonProperty("data") @ExcludeMissing fun _data() = data

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): PhoneNumber = apply {
            if (!validated) {
                data()
                type()
                validated = true
            }
        }

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

            private var data: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(phoneNumber: PhoneNumber) = apply {
                this.data = phoneNumber.data
                this.type = phoneNumber.type
                additionalProperties(phoneNumber.additionalProperties)
            }

            fun data(data: String) = data(JsonField.of(data))

            @JsonProperty("data")
            @ExcludeMissing
            fun data(data: JsonField<String>) = apply { this.data = data }

            fun type(type: Type) = type(JsonField.of(type))

            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

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

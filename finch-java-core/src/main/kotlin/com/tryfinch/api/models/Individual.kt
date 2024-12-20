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
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Individual
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("first_name")
    @ExcludeMissing
    private val firstName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("middle_name")
    @ExcludeMissing
    private val middleName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("last_name")
    @ExcludeMissing
    private val lastName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("preferred_name")
    @ExcludeMissing
    private val preferredName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("emails")
    @ExcludeMissing
    private val emails: JsonField<List<Email>> = JsonMissing.of(),
    @JsonProperty("phone_numbers")
    @ExcludeMissing
    private val phoneNumbers: JsonField<List<PhoneNumber?>> = JsonMissing.of(),
    @JsonProperty("gender")
    @ExcludeMissing
    private val gender: JsonField<Gender> = JsonMissing.of(),
    @JsonProperty("ethnicity")
    @ExcludeMissing
    private val ethnicity: JsonField<Ethnicity> = JsonMissing.of(),
    @JsonProperty("dob") @ExcludeMissing private val dob: JsonField<String> = JsonMissing.of(),
    @JsonProperty("residence")
    @ExcludeMissing
    private val residence: JsonField<Location> = JsonMissing.of(),
    @JsonProperty("ssn") @ExcludeMissing private val ssn: JsonField<String> = JsonMissing.of(),
    @JsonProperty("encrypted_ssn")
    @ExcludeMissing
    private val encryptedSsn: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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

    fun phoneNumbers(): Optional<List<PhoneNumber?>> =
        Optional.ofNullable(phoneNumbers.getNullable("phone_numbers"))

    /** The gender of the individual. */
    fun gender(): Optional<Gender> = Optional.ofNullable(gender.getNullable("gender"))

    /** The EEOC-defined ethnicity of the individual. */
    fun ethnicity(): Optional<Ethnicity> = Optional.ofNullable(ethnicity.getNullable("ethnicity"))

    fun dob(): Optional<String> = Optional.ofNullable(dob.getNullable("dob"))

    fun residence(): Optional<Location> = Optional.ofNullable(residence.getNullable("residence"))

    /**
     * Social Security Number of the individual. This field is only available with the `ssn` scope
     * enabled and the `options: { include: ['ssn'] }` param set in the body.
     * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
     */
    fun ssn(): Optional<String> = Optional.ofNullable(ssn.getNullable("ssn"))

    /**
     * Social Security Number of the individual in **encrypted** format. This field is only
     * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param set in
     * the body.
     */
    fun encryptedSsn(): Optional<String> =
        Optional.ofNullable(encryptedSsn.getNullable("encrypted_ssn"))

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

    /** The EEOC-defined ethnicity of the individual. */
    @JsonProperty("ethnicity") @ExcludeMissing fun _ethnicity() = ethnicity

    @JsonProperty("dob") @ExcludeMissing fun _dob() = dob

    @JsonProperty("residence") @ExcludeMissing fun _residence() = residence

    /**
     * Social Security Number of the individual. This field is only available with the `ssn` scope
     * enabled and the `options: { include: ['ssn'] }` param set in the body.
     * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
     */
    @JsonProperty("ssn") @ExcludeMissing fun _ssn() = ssn

    /**
     * Social Security Number of the individual in **encrypted** format. This field is only
     * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param set in
     * the body.
     */
    @JsonProperty("encrypted_ssn") @ExcludeMissing fun _encryptedSsn() = encryptedSsn

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Individual = apply {
        if (!validated) {
            id()
            firstName()
            middleName()
            lastName()
            preferredName()
            emails().map { it.forEach { it.validate() } }
            phoneNumbers().map { it.forEach { it?.validate() } }
            gender()
            ethnicity()
            dob()
            residence().map { it.validate() }
            ssn()
            encryptedSsn()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

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
        private var phoneNumbers: JsonField<List<PhoneNumber?>> = JsonMissing.of()
        private var gender: JsonField<Gender> = JsonMissing.of()
        private var ethnicity: JsonField<Ethnicity> = JsonMissing.of()
        private var dob: JsonField<String> = JsonMissing.of()
        private var residence: JsonField<Location> = JsonMissing.of()
        private var ssn: JsonField<String> = JsonMissing.of()
        private var encryptedSsn: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(individual: Individual) = apply {
            id = individual.id
            firstName = individual.firstName
            middleName = individual.middleName
            lastName = individual.lastName
            preferredName = individual.preferredName
            emails = individual.emails
            phoneNumbers = individual.phoneNumbers
            gender = individual.gender
            ethnicity = individual.ethnicity
            dob = individual.dob
            residence = individual.residence
            ssn = individual.ssn
            encryptedSsn = individual.encryptedSsn
            additionalProperties = individual.additionalProperties.toMutableMap()
        }

        /** A stable Finch `id` (UUID v4) for an individual in the company. */
        fun id(id: String) = id(JsonField.of(id))

        /** A stable Finch `id` (UUID v4) for an individual in the company. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The legal first name of the individual. */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /** The legal first name of the individual. */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** The legal middle name of the individual. */
        fun middleName(middleName: String) = middleName(JsonField.of(middleName))

        /** The legal middle name of the individual. */
        fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

        /** The legal last name of the individual. */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /** The legal last name of the individual. */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** The preferred name of the individual. */
        fun preferredName(preferredName: String) = preferredName(JsonField.of(preferredName))

        /** The preferred name of the individual. */
        fun preferredName(preferredName: JsonField<String>) = apply {
            this.preferredName = preferredName
        }

        fun emails(emails: List<Email>) = emails(JsonField.of(emails))

        fun emails(emails: JsonField<List<Email>>) = apply { this.emails = emails }

        fun phoneNumbers(phoneNumbers: List<PhoneNumber?>) =
            phoneNumbers(JsonField.of(phoneNumbers))

        fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumber?>>) = apply {
            this.phoneNumbers = phoneNumbers
        }

        /** The gender of the individual. */
        fun gender(gender: Gender) = gender(JsonField.of(gender))

        /** The gender of the individual. */
        fun gender(gender: JsonField<Gender>) = apply { this.gender = gender }

        /** The EEOC-defined ethnicity of the individual. */
        fun ethnicity(ethnicity: Ethnicity) = ethnicity(JsonField.of(ethnicity))

        /** The EEOC-defined ethnicity of the individual. */
        fun ethnicity(ethnicity: JsonField<Ethnicity>) = apply { this.ethnicity = ethnicity }

        fun dob(dob: String) = dob(JsonField.of(dob))

        fun dob(dob: JsonField<String>) = apply { this.dob = dob }

        fun residence(residence: Location) = residence(JsonField.of(residence))

        fun residence(residence: JsonField<Location>) = apply { this.residence = residence }

        /**
         * Social Security Number of the individual. This field is only available with the `ssn`
         * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
         * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
         */
        fun ssn(ssn: String) = ssn(JsonField.of(ssn))

        /**
         * Social Security Number of the individual. This field is only available with the `ssn`
         * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
         * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
         */
        fun ssn(ssn: JsonField<String>) = apply { this.ssn = ssn }

        /**
         * Social Security Number of the individual in **encrypted** format. This field is only
         * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param set
         * in the body.
         */
        fun encryptedSsn(encryptedSsn: String) = encryptedSsn(JsonField.of(encryptedSsn))

        /**
         * Social Security Number of the individual in **encrypted** format. This field is only
         * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param set
         * in the body.
         */
        fun encryptedSsn(encryptedSsn: JsonField<String>) = apply {
            this.encryptedSsn = encryptedSsn
        }

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

        fun build(): Individual =
            Individual(
                id,
                firstName,
                middleName,
                lastName,
                preferredName,
                emails.map { it.toImmutable() },
                phoneNumbers.map { it.toImmutable() },
                gender,
                ethnicity,
                dob,
                residence,
                ssn,
                encryptedSsn,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Email
    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        private val data: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun data(): Optional<String> = Optional.ofNullable(data.getNullable("data"))

        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        @JsonProperty("data") @ExcludeMissing fun _data() = data

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Email = apply {
            if (!validated) {
                data()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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

            fun type(type: Type) = type(JsonField.of(type))

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
        @JsonProperty("data")
        @ExcludeMissing
        private val data: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun data(): Optional<String> = Optional.ofNullable(data.getNullable("data"))

        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        @JsonProperty("data") @ExcludeMissing fun _data() = data

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PhoneNumber = apply {
            if (!validated) {
                data()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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

            fun type(type: Type) = type(JsonField.of(type))

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

        return /* spotless:off */ other is Individual && id == other.id && firstName == other.firstName && middleName == other.middleName && lastName == other.lastName && preferredName == other.preferredName && emails == other.emails && phoneNumbers == other.phoneNumbers && gender == other.gender && ethnicity == other.ethnicity && dob == other.dob && residence == other.residence && ssn == other.ssn && encryptedSsn == other.encryptedSsn && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, firstName, middleName, lastName, preferredName, emails, phoneNumbers, gender, ethnicity, dob, residence, ssn, encryptedSsn, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Individual{id=$id, firstName=$firstName, middleName=$middleName, lastName=$lastName, preferredName=$preferredName, emails=$emails, phoneNumbers=$phoneNumbers, gender=$gender, ethnicity=$ethnicity, dob=$dob, residence=$residence, ssn=$ssn, encryptedSsn=$encryptedSsn, additionalProperties=$additionalProperties}"
}

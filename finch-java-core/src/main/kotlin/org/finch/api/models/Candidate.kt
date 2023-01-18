package org.finch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import org.finch.api.core.ExcludeMissing
import org.finch.api.core.JsonField
import org.finch.api.core.JsonMissing
import org.finch.api.core.JsonValue
import org.finch.api.core.NoAutoDetect
import org.finch.api.core.toUnmodifiable

/** A candidate represents an individual associated with one or more applications. */
@JsonDeserialize(builder = Candidate.Builder::class)
@NoAutoDetect
class Candidate
private constructor(
    private val id: JsonField<String>,
    private val firstName: JsonField<String>,
    private val lastName: JsonField<String>,
    private val fullName: JsonField<String>,
    private val emails: JsonField<List<Email>>,
    private val phoneNumbers: JsonField<List<PhoneNumber>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val lastActivityAt: JsonField<OffsetDateTime>,
    private val applicationIds: JsonField<List<String>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): String = id.getRequired("id")

    fun firstName(): Optional<String> = Optional.ofNullable(firstName.getNullable("first_name"))

    fun lastName(): Optional<String> = Optional.ofNullable(lastName.getNullable("last_name"))

    fun fullName(): Optional<String> = Optional.ofNullable(fullName.getNullable("full_name"))

    fun emails(): List<Email> = emails.getRequired("emails")

    fun phoneNumbers(): List<PhoneNumber> = phoneNumbers.getRequired("phone_numbers")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun lastActivityAt(): OffsetDateTime = lastActivityAt.getRequired("last_activity_at")

    /** Array of Finch uuids corresponding to `application`s for this individual */
    fun applicationIds(): List<String> = applicationIds.getRequired("application_ids")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("first_name") @ExcludeMissing fun _firstName() = firstName

    @JsonProperty("last_name") @ExcludeMissing fun _lastName() = lastName

    @JsonProperty("full_name") @ExcludeMissing fun _fullName() = fullName

    @JsonProperty("emails") @ExcludeMissing fun _emails() = emails

    @JsonProperty("phone_numbers") @ExcludeMissing fun _phoneNumbers() = phoneNumbers

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("last_activity_at") @ExcludeMissing fun _lastActivityAt() = lastActivityAt

    /** Array of Finch uuids corresponding to `application`s for this individual */
    @JsonProperty("application_ids") @ExcludeMissing fun _applicationIds() = applicationIds

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            id()
            firstName()
            lastName()
            fullName()
            emails().forEach { it.validate() }
            phoneNumbers().forEach { it.validate() }
            createdAt()
            lastActivityAt()
            applicationIds()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Candidate &&
            this.id == other.id &&
            this.firstName == other.firstName &&
            this.lastName == other.lastName &&
            this.fullName == other.fullName &&
            this.emails == other.emails &&
            this.phoneNumbers == other.phoneNumbers &&
            this.createdAt == other.createdAt &&
            this.lastActivityAt == other.lastActivityAt &&
            this.applicationIds == other.applicationIds &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    firstName,
                    lastName,
                    fullName,
                    emails,
                    phoneNumbers,
                    createdAt,
                    lastActivityAt,
                    applicationIds,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Candidate{id=$id, firstName=$firstName, lastName=$lastName, fullName=$fullName, emails=$emails, phoneNumbers=$phoneNumbers, createdAt=$createdAt, lastActivityAt=$lastActivityAt, applicationIds=$applicationIds, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var fullName: JsonField<String> = JsonMissing.of()
        private var emails: JsonField<List<Email>> = JsonMissing.of()
        private var phoneNumbers: JsonField<List<PhoneNumber>> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastActivityAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var applicationIds: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(candidate: Candidate) = apply {
            this.id = candidate.id
            this.firstName = candidate.firstName
            this.lastName = candidate.lastName
            this.fullName = candidate.fullName
            this.emails = candidate.emails
            this.phoneNumbers = candidate.phoneNumbers
            this.createdAt = candidate.createdAt
            this.lastActivityAt = candidate.lastActivityAt
            this.applicationIds = candidate.applicationIds
            additionalProperties(candidate.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        @JsonProperty("first_name")
        @ExcludeMissing
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        @JsonProperty("last_name")
        @ExcludeMissing
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        fun fullName(fullName: String) = fullName(JsonField.of(fullName))

        @JsonProperty("full_name")
        @ExcludeMissing
        fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

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

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun lastActivityAt(lastActivityAt: OffsetDateTime) =
            lastActivityAt(JsonField.of(lastActivityAt))

        @JsonProperty("last_activity_at")
        @ExcludeMissing
        fun lastActivityAt(lastActivityAt: JsonField<OffsetDateTime>) = apply {
            this.lastActivityAt = lastActivityAt
        }

        /** Array of Finch uuids corresponding to `application`s for this individual */
        fun applicationIds(applicationIds: List<String>) =
            applicationIds(JsonField.of(applicationIds))

        /** Array of Finch uuids corresponding to `application`s for this individual */
        @JsonProperty("application_ids")
        @ExcludeMissing
        fun applicationIds(applicationIds: JsonField<List<String>>) = apply {
            this.applicationIds = applicationIds
        }

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

        fun build(): Candidate =
            Candidate(
                id,
                firstName,
                lastName,
                fullName,
                emails.map { it.toUnmodifiable() },
                phoneNumbers.map { it.toUnmodifiable() },
                createdAt,
                lastActivityAt,
                applicationIds.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Email.Builder::class)
    @NoAutoDetect
    class Email
    private constructor(
        private val data: JsonField<String>,
        private val type: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun data(): Optional<String> = Optional.ofNullable(data.getNullable("data"))

        fun type(): Optional<String> = Optional.ofNullable(type.getNullable("type"))

        @JsonProperty("data") @ExcludeMissing fun _data() = data

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
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
            private var type: JsonField<String> = JsonMissing.of()
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

            fun type(type: String) = type(JsonField.of(type))

            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<String>) = apply { this.type = type }

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
    }

    @JsonDeserialize(builder = PhoneNumber.Builder::class)
    @NoAutoDetect
    class PhoneNumber
    private constructor(
        private val data: JsonField<String>,
        private val type: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun data(): Optional<String> = Optional.ofNullable(data.getNullable("data"))

        fun type(): Optional<String> = Optional.ofNullable(type.getNullable("type"))

        @JsonProperty("data") @ExcludeMissing fun _data() = data

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
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
            private var type: JsonField<String> = JsonMissing.of()
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

            fun type(type: String) = type(JsonField.of(type))

            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<String>) = apply { this.type = type }

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
    }
}

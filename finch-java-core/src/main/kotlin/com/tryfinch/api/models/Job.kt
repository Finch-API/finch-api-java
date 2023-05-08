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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = Job.Builder::class)
@NoAutoDetect
class Job
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val status: JsonField<Status>,
    private val department: JsonField<Department>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val closedAt: JsonField<OffsetDateTime>,
    private val hiringTeam: JsonField<HiringTeam>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): String = id.getRequired("id")

    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

    fun department(): Department = department.getRequired("department")

    fun createdAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(createdAt.getNullable("created_at"))

    fun closedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(closedAt.getNullable("closed_at"))

    fun hiringTeam(): HiringTeam = hiringTeam.getRequired("hiring_team")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonProperty("department") @ExcludeMissing fun _department() = department

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("closed_at") @ExcludeMissing fun _closedAt() = closedAt

    @JsonProperty("hiring_team") @ExcludeMissing fun _hiringTeam() = hiringTeam

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            id()
            name()
            status()
            department().validate()
            createdAt()
            closedAt()
            hiringTeam().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Job &&
            this.id == other.id &&
            this.name == other.name &&
            this.status == other.status &&
            this.department == other.department &&
            this.createdAt == other.createdAt &&
            this.closedAt == other.closedAt &&
            this.hiringTeam == other.hiringTeam &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    name,
                    status,
                    department,
                    createdAt,
                    closedAt,
                    hiringTeam,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Job{id=$id, name=$name, status=$status, department=$department, createdAt=$createdAt, closedAt=$closedAt, hiringTeam=$hiringTeam, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var department: JsonField<Department> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var closedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var hiringTeam: JsonField<HiringTeam> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(job: Job) = apply {
            this.id = job.id
            this.name = job.name
            this.status = job.status
            this.department = job.department
            this.createdAt = job.createdAt
            this.closedAt = job.closedAt
            this.hiringTeam = job.hiringTeam
            additionalProperties(job.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun name(name: String) = name(JsonField.of(name))

        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun status(status: Status) = status(JsonField.of(status))

        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun department(department: Department) = department(JsonField.of(department))

        @JsonProperty("department")
        @ExcludeMissing
        fun department(department: JsonField<Department>) = apply { this.department = department }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun closedAt(closedAt: OffsetDateTime) = closedAt(JsonField.of(closedAt))

        @JsonProperty("closed_at")
        @ExcludeMissing
        fun closedAt(closedAt: JsonField<OffsetDateTime>) = apply { this.closedAt = closedAt }

        fun hiringTeam(hiringTeam: HiringTeam) = hiringTeam(JsonField.of(hiringTeam))

        @JsonProperty("hiring_team")
        @ExcludeMissing
        fun hiringTeam(hiringTeam: JsonField<HiringTeam>) = apply { this.hiringTeam = hiringTeam }

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

        fun build(): Job =
            Job(
                id,
                name,
                status,
                department,
                createdAt,
                closedAt,
                hiringTeam,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val OPEN = Status(JsonField.of("open"))

            @JvmField val CLOSED = Status(JsonField.of("closed"))

            @JvmField val ON_HOLD = Status(JsonField.of("on_hold"))

            @JvmField val DRAFT = Status(JsonField.of("draft"))

            @JvmField val ARCHIVED = Status(JsonField.of("archived"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            OPEN,
            CLOSED,
            ON_HOLD,
            DRAFT,
            ARCHIVED,
        }

        enum class Value {
            OPEN,
            CLOSED,
            ON_HOLD,
            DRAFT,
            ARCHIVED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                OPEN -> Value.OPEN
                CLOSED -> Value.CLOSED
                ON_HOLD -> Value.ON_HOLD
                DRAFT -> Value.DRAFT
                ARCHIVED -> Value.ARCHIVED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                OPEN -> Known.OPEN
                CLOSED -> Known.CLOSED
                ON_HOLD -> Known.ON_HOLD
                DRAFT -> Known.DRAFT
                ARCHIVED -> Known.ARCHIVED
                else -> throw FinchInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = Department.Builder::class)
    @NoAutoDetect
    class Department
    private constructor(
        private val name: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
                name()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Department &&
                this.name == other.name &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(name, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "Department{name=$name, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(department: Department) = apply {
                this.name = department.name
                additionalProperties(department.additionalProperties)
            }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

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

            fun build(): Department = Department(name, additionalProperties.toUnmodifiable())
        }
    }

    @JsonDeserialize(builder = HiringTeam.Builder::class)
    @NoAutoDetect
    class HiringTeam
    private constructor(
        private val hiringManagers: JsonField<List<HiringManager>>,
        private val recruiters: JsonField<List<Recruiter>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun hiringManagers(): Optional<List<HiringManager>> =
            Optional.ofNullable(hiringManagers.getNullable("hiring_managers"))

        fun recruiters(): Optional<List<Recruiter>> =
            Optional.ofNullable(recruiters.getNullable("recruiters"))

        @JsonProperty("hiring_managers") @ExcludeMissing fun _hiringManagers() = hiringManagers

        @JsonProperty("recruiters") @ExcludeMissing fun _recruiters() = recruiters

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
                hiringManagers().map { it.forEach { it.validate() } }
                recruiters().map { it.forEach { it.validate() } }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is HiringTeam &&
                this.hiringManagers == other.hiringManagers &&
                this.recruiters == other.recruiters &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        hiringManagers,
                        recruiters,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "HiringTeam{hiringManagers=$hiringManagers, recruiters=$recruiters, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var hiringManagers: JsonField<List<HiringManager>> = JsonMissing.of()
            private var recruiters: JsonField<List<Recruiter>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(hiringTeam: HiringTeam) = apply {
                this.hiringManagers = hiringTeam.hiringManagers
                this.recruiters = hiringTeam.recruiters
                additionalProperties(hiringTeam.additionalProperties)
            }

            fun hiringManagers(hiringManagers: List<HiringManager>) =
                hiringManagers(JsonField.of(hiringManagers))

            @JsonProperty("hiring_managers")
            @ExcludeMissing
            fun hiringManagers(hiringManagers: JsonField<List<HiringManager>>) = apply {
                this.hiringManagers = hiringManagers
            }

            fun recruiters(recruiters: List<Recruiter>) = recruiters(JsonField.of(recruiters))

            @JsonProperty("recruiters")
            @ExcludeMissing
            fun recruiters(recruiters: JsonField<List<Recruiter>>) = apply {
                this.recruiters = recruiters
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

            fun build(): HiringTeam =
                HiringTeam(
                    hiringManagers.map { it.toUnmodifiable() },
                    recruiters.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = HiringManager.Builder::class)
        @NoAutoDetect
        class HiringManager
        private constructor(
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate() = apply {
                if (!validated) {
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is HiringManager &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(name, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "HiringManager{name=$name, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(hiringManager: HiringManager) = apply {
                    this.name = hiringManager.name
                    additionalProperties(hiringManager.additionalProperties)
                }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

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

                fun build(): HiringManager =
                    HiringManager(name, additionalProperties.toUnmodifiable())
            }
        }

        @JsonDeserialize(builder = Recruiter.Builder::class)
        @NoAutoDetect
        class Recruiter
        private constructor(
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate() = apply {
                if (!validated) {
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Recruiter &&
                    this.name == other.name &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(name, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "Recruiter{name=$name, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(recruiter: Recruiter) = apply {
                    this.name = recruiter.name
                    additionalProperties(recruiter.additionalProperties)
                }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

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

                fun build(): Recruiter = Recruiter(name, additionalProperties.toUnmodifiable())
            }
        }
    }
}

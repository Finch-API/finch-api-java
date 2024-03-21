// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.errors.FinchInvalidDataException
import com.tryfinch.api.models.*
import java.util.Objects
import java.util.Optional

class SandboxCompanyUpdateParams
constructor(
    private val accounts: List<Account>?,
    private val departments: List<Department?>?,
    private val ein: String?,
    private val entity: Entity?,
    private val legalName: String?,
    private val locations: List<Location?>?,
    private val primaryEmail: String?,
    private val primaryPhoneNumber: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accounts(): Optional<List<Account>> = Optional.ofNullable(accounts)

    fun departments(): Optional<List<Department?>> = Optional.ofNullable(departments)

    fun ein(): Optional<String> = Optional.ofNullable(ein)

    fun entity(): Optional<Entity> = Optional.ofNullable(entity)

    fun legalName(): Optional<String> = Optional.ofNullable(legalName)

    fun locations(): Optional<List<Location?>> = Optional.ofNullable(locations)

    fun primaryEmail(): Optional<String> = Optional.ofNullable(primaryEmail)

    fun primaryPhoneNumber(): Optional<String> = Optional.ofNullable(primaryPhoneNumber)

    @JvmSynthetic
    internal fun getBody(): SandboxCompanyUpdateBody {
        return SandboxCompanyUpdateBody(
            accounts,
            departments,
            ein,
            entity,
            legalName,
            locations,
            primaryEmail,
            primaryPhoneNumber,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = SandboxCompanyUpdateBody.Builder::class)
    @NoAutoDetect
    class SandboxCompanyUpdateBody
    internal constructor(
        private val accounts: List<Account>?,
        private val departments: List<Department?>?,
        private val ein: String?,
        private val entity: Entity?,
        private val legalName: String?,
        private val locations: List<Location?>?,
        private val primaryEmail: String?,
        private val primaryPhoneNumber: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** An array of bank account objects associated with the payroll/HRIS system. */
        @JsonProperty("accounts") fun accounts(): List<Account>? = accounts

        /** The array of company departments. */
        @JsonProperty("departments") fun departments(): List<Department?>? = departments

        /** The employer identification number. */
        @JsonProperty("ein") fun ein(): String? = ein

        /** The entity type object. */
        @JsonProperty("entity") fun entity(): Entity? = entity

        /** The legal name of the company. */
        @JsonProperty("legal_name") fun legalName(): String? = legalName

        @JsonProperty("locations") fun locations(): List<Location?>? = locations

        /** The email of the main administrator on the account. */
        @JsonProperty("primary_email") fun primaryEmail(): String? = primaryEmail

        /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
        @JsonProperty("primary_phone_number") fun primaryPhoneNumber(): String? = primaryPhoneNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SandboxCompanyUpdateBody &&
                this.accounts == other.accounts &&
                this.departments == other.departments &&
                this.ein == other.ein &&
                this.entity == other.entity &&
                this.legalName == other.legalName &&
                this.locations == other.locations &&
                this.primaryEmail == other.primaryEmail &&
                this.primaryPhoneNumber == other.primaryPhoneNumber &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accounts,
                        departments,
                        ein,
                        entity,
                        legalName,
                        locations,
                        primaryEmail,
                        primaryPhoneNumber,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SandboxCompanyUpdateBody{accounts=$accounts, departments=$departments, ein=$ein, entity=$entity, legalName=$legalName, locations=$locations, primaryEmail=$primaryEmail, primaryPhoneNumber=$primaryPhoneNumber, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accounts: List<Account>? = null
            private var departments: List<Department?>? = null
            private var ein: String? = null
            private var entity: Entity? = null
            private var legalName: String? = null
            private var locations: List<Location?>? = null
            private var primaryEmail: String? = null
            private var primaryPhoneNumber: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sandboxCompanyUpdateBody: SandboxCompanyUpdateBody) = apply {
                this.accounts = sandboxCompanyUpdateBody.accounts
                this.departments = sandboxCompanyUpdateBody.departments
                this.ein = sandboxCompanyUpdateBody.ein
                this.entity = sandboxCompanyUpdateBody.entity
                this.legalName = sandboxCompanyUpdateBody.legalName
                this.locations = sandboxCompanyUpdateBody.locations
                this.primaryEmail = sandboxCompanyUpdateBody.primaryEmail
                this.primaryPhoneNumber = sandboxCompanyUpdateBody.primaryPhoneNumber
                additionalProperties(sandboxCompanyUpdateBody.additionalProperties)
            }

            /** An array of bank account objects associated with the payroll/HRIS system. */
            @JsonProperty("accounts")
            fun accounts(accounts: List<Account>) = apply { this.accounts = accounts }

            /** The array of company departments. */
            @JsonProperty("departments")
            fun departments(departments: List<Department?>) = apply {
                this.departments = departments
            }

            /** The employer identification number. */
            @JsonProperty("ein") fun ein(ein: String) = apply { this.ein = ein }

            /** The entity type object. */
            @JsonProperty("entity") fun entity(entity: Entity) = apply { this.entity = entity }

            /** The legal name of the company. */
            @JsonProperty("legal_name")
            fun legalName(legalName: String) = apply { this.legalName = legalName }

            @JsonProperty("locations")
            fun locations(locations: List<Location?>) = apply { this.locations = locations }

            /** The email of the main administrator on the account. */
            @JsonProperty("primary_email")
            fun primaryEmail(primaryEmail: String) = apply { this.primaryEmail = primaryEmail }

            /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
            @JsonProperty("primary_phone_number")
            fun primaryPhoneNumber(primaryPhoneNumber: String) = apply {
                this.primaryPhoneNumber = primaryPhoneNumber
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

            fun build(): SandboxCompanyUpdateBody =
                SandboxCompanyUpdateBody(
                    accounts?.toUnmodifiable(),
                    departments?.toUnmodifiable(),
                    ein,
                    entity,
                    legalName,
                    locations?.toUnmodifiable(),
                    primaryEmail,
                    primaryPhoneNumber,
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

        return other is SandboxCompanyUpdateParams &&
            this.accounts == other.accounts &&
            this.departments == other.departments &&
            this.ein == other.ein &&
            this.entity == other.entity &&
            this.legalName == other.legalName &&
            this.locations == other.locations &&
            this.primaryEmail == other.primaryEmail &&
            this.primaryPhoneNumber == other.primaryPhoneNumber &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accounts,
            departments,
            ein,
            entity,
            legalName,
            locations,
            primaryEmail,
            primaryPhoneNumber,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SandboxCompanyUpdateParams{accounts=$accounts, departments=$departments, ein=$ein, entity=$entity, legalName=$legalName, locations=$locations, primaryEmail=$primaryEmail, primaryPhoneNumber=$primaryPhoneNumber, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accounts: MutableList<Account> = mutableListOf()
        private var departments: MutableList<Department?> = mutableListOf()
        private var ein: String? = null
        private var entity: Entity? = null
        private var legalName: String? = null
        private var locations: MutableList<Location?> = mutableListOf()
        private var primaryEmail: String? = null
        private var primaryPhoneNumber: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sandboxCompanyUpdateParams: SandboxCompanyUpdateParams) = apply {
            this.accounts(sandboxCompanyUpdateParams.accounts ?: listOf())
            this.departments(sandboxCompanyUpdateParams.departments ?: listOf())
            this.ein = sandboxCompanyUpdateParams.ein
            this.entity = sandboxCompanyUpdateParams.entity
            this.legalName = sandboxCompanyUpdateParams.legalName
            this.locations(sandboxCompanyUpdateParams.locations ?: listOf())
            this.primaryEmail = sandboxCompanyUpdateParams.primaryEmail
            this.primaryPhoneNumber = sandboxCompanyUpdateParams.primaryPhoneNumber
            additionalQueryParams(sandboxCompanyUpdateParams.additionalQueryParams)
            additionalHeaders(sandboxCompanyUpdateParams.additionalHeaders)
            additionalBodyProperties(sandboxCompanyUpdateParams.additionalBodyProperties)
        }

        /** An array of bank account objects associated with the payroll/HRIS system. */
        fun accounts(accounts: List<Account>) = apply {
            this.accounts.clear()
            this.accounts.addAll(accounts)
        }

        /** An array of bank account objects associated with the payroll/HRIS system. */
        fun addAccount(account: Account) = apply { this.accounts.add(account) }

        /** The array of company departments. */
        fun departments(departments: List<Department?>) = apply {
            this.departments.clear()
            this.departments.addAll(departments)
        }

        /** The array of company departments. */
        fun addDepartment(department: Department) = apply { this.departments.add(department) }

        /** The employer identification number. */
        fun ein(ein: String) = apply { this.ein = ein }

        /** The entity type object. */
        fun entity(entity: Entity) = apply { this.entity = entity }

        /** The legal name of the company. */
        fun legalName(legalName: String) = apply { this.legalName = legalName }

        fun locations(locations: List<Location?>) = apply {
            this.locations.clear()
            this.locations.addAll(locations)
        }

        fun addLocation(location: Location) = apply { this.locations.add(location) }

        /** The email of the main administrator on the account. */
        fun primaryEmail(primaryEmail: String) = apply { this.primaryEmail = primaryEmail }

        /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
        fun primaryPhoneNumber(primaryPhoneNumber: String) = apply {
            this.primaryPhoneNumber = primaryPhoneNumber
        }

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

        fun build(): SandboxCompanyUpdateParams =
            SandboxCompanyUpdateParams(
                if (accounts.size == 0) null else accounts.toUnmodifiable(),
                if (departments.size == 0) null else departments.toUnmodifiable(),
                ein,
                entity,
                legalName,
                if (locations.size == 0) null else locations.toUnmodifiable(),
                primaryEmail,
                primaryPhoneNumber,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Account.Builder::class)
    @NoAutoDetect
    class Account
    private constructor(
        private val routingNumber: String?,
        private val accountName: String?,
        private val institutionName: String?,
        private val accountType: AccountType?,
        private val accountNumber: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * A nine-digit code that's based on the U.S. Bank location where your account was opened.
         */
        @JsonProperty("routing_number") fun routingNumber(): String? = routingNumber

        /** The name of the bank associated in the payroll/HRIS system. */
        @JsonProperty("account_name") fun accountName(): String? = accountName

        /** Name of the banking institution. */
        @JsonProperty("institution_name") fun institutionName(): String? = institutionName

        /** The type of bank account. */
        @JsonProperty("account_type") fun accountType(): AccountType? = accountType

        /** 10-12 digit number to specify the bank account */
        @JsonProperty("account_number") fun accountNumber(): String? = accountNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Account &&
                this.routingNumber == other.routingNumber &&
                this.accountName == other.accountName &&
                this.institutionName == other.institutionName &&
                this.accountType == other.accountType &&
                this.accountNumber == other.accountNumber &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        routingNumber,
                        accountName,
                        institutionName,
                        accountType,
                        accountNumber,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Account{routingNumber=$routingNumber, accountName=$accountName, institutionName=$institutionName, accountType=$accountType, accountNumber=$accountNumber, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var routingNumber: String? = null
            private var accountName: String? = null
            private var institutionName: String? = null
            private var accountType: AccountType? = null
            private var accountNumber: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(account: Account) = apply {
                this.routingNumber = account.routingNumber
                this.accountName = account.accountName
                this.institutionName = account.institutionName
                this.accountType = account.accountType
                this.accountNumber = account.accountNumber
                additionalProperties(account.additionalProperties)
            }

            /**
             * A nine-digit code that's based on the U.S. Bank location where your account was
             * opened.
             */
            @JsonProperty("routing_number")
            fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

            /** The name of the bank associated in the payroll/HRIS system. */
            @JsonProperty("account_name")
            fun accountName(accountName: String) = apply { this.accountName = accountName }

            /** Name of the banking institution. */
            @JsonProperty("institution_name")
            fun institutionName(institutionName: String) = apply {
                this.institutionName = institutionName
            }

            /** The type of bank account. */
            @JsonProperty("account_type")
            fun accountType(accountType: AccountType) = apply { this.accountType = accountType }

            /** 10-12 digit number to specify the bank account */
            @JsonProperty("account_number")
            fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

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

            fun build(): Account =
                Account(
                    routingNumber,
                    accountName,
                    institutionName,
                    accountType,
                    accountNumber,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class AccountType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccountType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val CHECKING = AccountType(JsonField.of("checking"))

                @JvmField val SAVINGS = AccountType(JsonField.of("savings"))

                @JvmStatic fun of(value: String) = AccountType(JsonField.of(value))
            }

            enum class Known {
                CHECKING,
                SAVINGS,
            }

            enum class Value {
                CHECKING,
                SAVINGS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CHECKING -> Value.CHECKING
                    SAVINGS -> Value.SAVINGS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CHECKING -> Known.CHECKING
                    SAVINGS -> Known.SAVINGS
                    else -> throw FinchInvalidDataException("Unknown AccountType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(builder = Department.Builder::class)
    @NoAutoDetect
    class Department
    private constructor(
        private val name: String?,
        private val parent: Parent?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The department name. */
        @JsonProperty("name") fun name(): String? = name

        /** The parent department, if present. */
        @JsonProperty("parent") fun parent(): Parent? = parent

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Department &&
                this.name == other.name &&
                this.parent == other.parent &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        parent,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Department{name=$name, parent=$parent, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var parent: Parent? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(department: Department) = apply {
                this.name = department.name
                this.parent = department.parent
                additionalProperties(department.additionalProperties)
            }

            /** The department name. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** The parent department, if present. */
            @JsonProperty("parent") fun parent(parent: Parent) = apply { this.parent = parent }

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

            fun build(): Department =
                Department(
                    name,
                    parent,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** The parent department, if present. */
        @JsonDeserialize(builder = Parent.Builder::class)
        @NoAutoDetect
        class Parent
        private constructor(
            private val name: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** The parent department's name. */
            @JsonProperty("name") fun name(): String? = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Parent &&
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
                "Parent{name=$name, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(parent: Parent) = apply {
                    this.name = parent.name
                    additionalProperties(parent.additionalProperties)
                }

                /** The parent department's name. */
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

                fun build(): Parent = Parent(name, additionalProperties.toUnmodifiable())
            }
        }
    }

    /** The entity type object. */
    @JsonDeserialize(builder = Entity.Builder::class)
    @NoAutoDetect
    class Entity
    private constructor(
        private val type: Type?,
        private val subtype: Subtype?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The tax payer type of the company. */
        @JsonProperty("type") fun type(): Type? = type

        /** The tax payer subtype of the company. */
        @JsonProperty("subtype") fun subtype(): Subtype? = subtype

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Entity &&
                this.type == other.type &&
                this.subtype == other.subtype &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        type,
                        subtype,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Entity{type=$type, subtype=$subtype, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: Type? = null
            private var subtype: Subtype? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entity: Entity) = apply {
                this.type = entity.type
                this.subtype = entity.subtype
                additionalProperties(entity.additionalProperties)
            }

            /** The tax payer type of the company. */
            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            /** The tax payer subtype of the company. */
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Entity =
                Entity(
                    type,
                    subtype,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Subtype
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Subtype && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val S_CORPORATION = Subtype(JsonField.of("s_corporation"))

                @JvmField val C_CORPORATION = Subtype(JsonField.of("c_corporation"))

                @JvmField val B_CORPORATION = Subtype(JsonField.of("b_corporation"))

                @JvmStatic fun of(value: String) = Subtype(JsonField.of(value))
            }

            enum class Known {
                S_CORPORATION,
                C_CORPORATION,
                B_CORPORATION,
            }

            enum class Value {
                S_CORPORATION,
                C_CORPORATION,
                B_CORPORATION,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    S_CORPORATION -> Value.S_CORPORATION
                    C_CORPORATION -> Value.C_CORPORATION
                    B_CORPORATION -> Value.B_CORPORATION
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    S_CORPORATION -> Known.S_CORPORATION
                    C_CORPORATION -> Known.C_CORPORATION
                    B_CORPORATION -> Known.B_CORPORATION
                    else -> throw FinchInvalidDataException("Unknown Subtype: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
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

                @JvmField val LLC = Type(JsonField.of("llc"))

                @JvmField val LP = Type(JsonField.of("lp"))

                @JvmField val CORPORATION = Type(JsonField.of("corporation"))

                @JvmField val SOLE_PROPRIETOR = Type(JsonField.of("sole_proprietor"))

                @JvmField val NON_PROFIT = Type(JsonField.of("non_profit"))

                @JvmField val PARTNERSHIP = Type(JsonField.of("partnership"))

                @JvmField val COOPERATIVE = Type(JsonField.of("cooperative"))

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                LLC,
                LP,
                CORPORATION,
                SOLE_PROPRIETOR,
                NON_PROFIT,
                PARTNERSHIP,
                COOPERATIVE,
            }

            enum class Value {
                LLC,
                LP,
                CORPORATION,
                SOLE_PROPRIETOR,
                NON_PROFIT,
                PARTNERSHIP,
                COOPERATIVE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    LLC -> Value.LLC
                    LP -> Value.LP
                    CORPORATION -> Value.CORPORATION
                    SOLE_PROPRIETOR -> Value.SOLE_PROPRIETOR
                    NON_PROFIT -> Value.NON_PROFIT
                    PARTNERSHIP -> Value.PARTNERSHIP
                    COOPERATIVE -> Value.COOPERATIVE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    LLC -> Known.LLC
                    LP -> Known.LP
                    CORPORATION -> Known.CORPORATION
                    SOLE_PROPRIETOR -> Known.SOLE_PROPRIETOR
                    NON_PROFIT -> Known.NON_PROFIT
                    PARTNERSHIP -> Known.PARTNERSHIP
                    COOPERATIVE -> Known.COOPERATIVE
                    else -> throw FinchInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}

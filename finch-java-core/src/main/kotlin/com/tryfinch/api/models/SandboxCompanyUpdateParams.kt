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

class SandboxCompanyUpdateParams
constructor(
    private val body: SandboxCompanyUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** An array of bank account objects associated with the payroll/HRIS system. */
    fun accounts(): Optional<List<Account>> = body.accounts()

    /** The array of company departments. */
    fun departments(): Optional<List<Department?>> = body.departments()

    /** The employer identification number. */
    fun ein(): Optional<String> = body.ein()

    /** The entity type object. */
    fun entity(): Optional<Entity> = body.entity()

    /** The legal name of the company. */
    fun legalName(): Optional<String> = body.legalName()

    fun locations(): Optional<List<Location?>> = body.locations()

    /** The email of the main administrator on the account. */
    fun primaryEmail(): Optional<String> = body.primaryEmail()

    /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
    fun primaryPhoneNumber(): Optional<String> = body.primaryPhoneNumber()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): SandboxCompanyUpdateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class SandboxCompanyUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("accounts") private val accounts: List<Account>?,
        @JsonProperty("departments") private val departments: List<Department?>?,
        @JsonProperty("ein") private val ein: String?,
        @JsonProperty("entity") private val entity: Entity?,
        @JsonProperty("legal_name") private val legalName: String?,
        @JsonProperty("locations") private val locations: List<Location?>?,
        @JsonProperty("primary_email") private val primaryEmail: String?,
        @JsonProperty("primary_phone_number") private val primaryPhoneNumber: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** An array of bank account objects associated with the payroll/HRIS system. */
        @JsonProperty("accounts")
        fun accounts(): Optional<List<Account>> = Optional.ofNullable(accounts)

        /** The array of company departments. */
        @JsonProperty("departments")
        fun departments(): Optional<List<Department?>> = Optional.ofNullable(departments)

        /** The employer identification number. */
        @JsonProperty("ein") fun ein(): Optional<String> = Optional.ofNullable(ein)

        /** The entity type object. */
        @JsonProperty("entity") fun entity(): Optional<Entity> = Optional.ofNullable(entity)

        /** The legal name of the company. */
        @JsonProperty("legal_name")
        fun legalName(): Optional<String> = Optional.ofNullable(legalName)

        @JsonProperty("locations")
        fun locations(): Optional<List<Location?>> = Optional.ofNullable(locations)

        /** The email of the main administrator on the account. */
        @JsonProperty("primary_email")
        fun primaryEmail(): Optional<String> = Optional.ofNullable(primaryEmail)

        /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
        @JsonProperty("primary_phone_number")
        fun primaryPhoneNumber(): Optional<String> = Optional.ofNullable(primaryPhoneNumber)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accounts: MutableList<Account>? = null
            private var departments: MutableList<Department?>? = null
            private var ein: String? = null
            private var entity: Entity? = null
            private var legalName: String? = null
            private var locations: MutableList<Location?>? = null
            private var primaryEmail: String? = null
            private var primaryPhoneNumber: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sandboxCompanyUpdateBody: SandboxCompanyUpdateBody) = apply {
                accounts = sandboxCompanyUpdateBody.accounts?.toMutableList()
                departments = sandboxCompanyUpdateBody.departments?.toMutableList()
                ein = sandboxCompanyUpdateBody.ein
                entity = sandboxCompanyUpdateBody.entity
                legalName = sandboxCompanyUpdateBody.legalName
                locations = sandboxCompanyUpdateBody.locations?.toMutableList()
                primaryEmail = sandboxCompanyUpdateBody.primaryEmail
                primaryPhoneNumber = sandboxCompanyUpdateBody.primaryPhoneNumber
                additionalProperties = sandboxCompanyUpdateBody.additionalProperties.toMutableMap()
            }

            /** An array of bank account objects associated with the payroll/HRIS system. */
            fun accounts(accounts: List<Account>) = apply {
                this.accounts = accounts.toMutableList()
            }

            /** An array of bank account objects associated with the payroll/HRIS system. */
            fun addAccount(account: Account) = apply {
                accounts = (accounts ?: mutableListOf()).apply { add(account) }
            }

            /** The array of company departments. */
            fun departments(departments: List<Department?>) = apply {
                this.departments = departments.toMutableList()
            }

            /** The array of company departments. */
            fun addDepartment(department: Department) = apply {
                departments = (departments ?: mutableListOf()).apply { add(department) }
            }

            /** The employer identification number. */
            fun ein(ein: String) = apply { this.ein = ein }

            /** The entity type object. */
            fun entity(entity: Entity) = apply { this.entity = entity }

            /** The legal name of the company. */
            fun legalName(legalName: String) = apply { this.legalName = legalName }

            fun locations(locations: List<Location?>) = apply {
                this.locations = locations.toMutableList()
            }

            fun addLocation(location: Location) = apply {
                locations = (locations ?: mutableListOf()).apply { add(location) }
            }

            /** The email of the main administrator on the account. */
            fun primaryEmail(primaryEmail: String) = apply { this.primaryEmail = primaryEmail }

            /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
            fun primaryPhoneNumber(primaryPhoneNumber: String) = apply {
                this.primaryPhoneNumber = primaryPhoneNumber
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

            fun build(): SandboxCompanyUpdateBody =
                SandboxCompanyUpdateBody(
                    accounts?.toImmutable(),
                    departments?.toImmutable(),
                    ein,
                    entity,
                    legalName,
                    locations?.toImmutable(),
                    primaryEmail,
                    primaryPhoneNumber,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SandboxCompanyUpdateBody && accounts == other.accounts && departments == other.departments && ein == other.ein && entity == other.entity && legalName == other.legalName && locations == other.locations && primaryEmail == other.primaryEmail && primaryPhoneNumber == other.primaryPhoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accounts, departments, ein, entity, legalName, locations, primaryEmail, primaryPhoneNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SandboxCompanyUpdateBody{accounts=$accounts, departments=$departments, ein=$ein, entity=$entity, legalName=$legalName, locations=$locations, primaryEmail=$primaryEmail, primaryPhoneNumber=$primaryPhoneNumber, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: SandboxCompanyUpdateBody.Builder = SandboxCompanyUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sandboxCompanyUpdateParams: SandboxCompanyUpdateParams) = apply {
            body = sandboxCompanyUpdateParams.body.toBuilder()
            additionalHeaders = sandboxCompanyUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = sandboxCompanyUpdateParams.additionalQueryParams.toBuilder()
        }

        /** An array of bank account objects associated with the payroll/HRIS system. */
        fun accounts(accounts: List<Account>) = apply { body.accounts(accounts) }

        /** An array of bank account objects associated with the payroll/HRIS system. */
        fun addAccount(account: Account) = apply { body.addAccount(account) }

        /** The array of company departments. */
        fun departments(departments: List<Department?>) = apply { body.departments(departments) }

        /** The array of company departments. */
        fun addDepartment(department: Department) = apply { body.addDepartment(department) }

        /** The employer identification number. */
        fun ein(ein: String) = apply { body.ein(ein) }

        /** The entity type object. */
        fun entity(entity: Entity) = apply { body.entity(entity) }

        /** The legal name of the company. */
        fun legalName(legalName: String) = apply { body.legalName(legalName) }

        fun locations(locations: List<Location?>) = apply { body.locations(locations) }

        fun addLocation(location: Location) = apply { body.addLocation(location) }

        /** The email of the main administrator on the account. */
        fun primaryEmail(primaryEmail: String) = apply { body.primaryEmail(primaryEmail) }

        /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
        fun primaryPhoneNumber(primaryPhoneNumber: String) = apply {
            body.primaryPhoneNumber(primaryPhoneNumber)
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

        fun build(): SandboxCompanyUpdateParams =
            SandboxCompanyUpdateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Account
    @JsonCreator
    private constructor(
        @JsonProperty("account_name") private val accountName: String?,
        @JsonProperty("account_number") private val accountNumber: String?,
        @JsonProperty("account_type") private val accountType: AccountType?,
        @JsonProperty("institution_name") private val institutionName: String?,
        @JsonProperty("routing_number") private val routingNumber: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The name of the bank associated in the payroll/HRIS system. */
        @JsonProperty("account_name")
        fun accountName(): Optional<String> = Optional.ofNullable(accountName)

        /** 10-12 digit number to specify the bank account */
        @JsonProperty("account_number")
        fun accountNumber(): Optional<String> = Optional.ofNullable(accountNumber)

        /** The type of bank account. */
        @JsonProperty("account_type")
        fun accountType(): Optional<AccountType> = Optional.ofNullable(accountType)

        /** Name of the banking institution. */
        @JsonProperty("institution_name")
        fun institutionName(): Optional<String> = Optional.ofNullable(institutionName)

        /**
         * A nine-digit code that's based on the U.S. Bank location where your account was opened.
         */
        @JsonProperty("routing_number")
        fun routingNumber(): Optional<String> = Optional.ofNullable(routingNumber)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountName: String? = null
            private var accountNumber: String? = null
            private var accountType: AccountType? = null
            private var institutionName: String? = null
            private var routingNumber: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(account: Account) = apply {
                accountName = account.accountName
                accountNumber = account.accountNumber
                accountType = account.accountType
                institutionName = account.institutionName
                routingNumber = account.routingNumber
                additionalProperties = account.additionalProperties.toMutableMap()
            }

            /** The name of the bank associated in the payroll/HRIS system. */
            fun accountName(accountName: String) = apply { this.accountName = accountName }

            /** 10-12 digit number to specify the bank account */
            fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

            /** The type of bank account. */
            fun accountType(accountType: AccountType) = apply { this.accountType = accountType }

            /** Name of the banking institution. */
            fun institutionName(institutionName: String) = apply {
                this.institutionName = institutionName
            }

            /**
             * A nine-digit code that's based on the U.S. Bank location where your account was
             * opened.
             */
            fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

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

            fun build(): Account =
                Account(
                    accountName,
                    accountNumber,
                    accountType,
                    institutionName,
                    routingNumber,
                    additionalProperties.toImmutable(),
                )
        }

        class AccountType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CHECKING = of("checking")

                @JvmField val SAVINGS = of("savings")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccountType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Account && accountName == other.accountName && accountNumber == other.accountNumber && accountType == other.accountType && institutionName == other.institutionName && routingNumber == other.routingNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountName, accountNumber, accountType, institutionName, routingNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Account{accountName=$accountName, accountNumber=$accountNumber, accountType=$accountType, institutionName=$institutionName, routingNumber=$routingNumber, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Department
    @JsonCreator
    private constructor(
        @JsonProperty("name") private val name: String?,
        @JsonProperty("parent") private val parent: Parent?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The department name. */
        @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

        /** The parent department, if present. */
        @JsonProperty("parent") fun parent(): Optional<Parent> = Optional.ofNullable(parent)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var parent: Parent? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(department: Department) = apply {
                name = department.name
                parent = department.parent
                additionalProperties = department.additionalProperties.toMutableMap()
            }

            /** The department name. */
            fun name(name: String) = apply { this.name = name }

            /** The parent department, if present. */
            fun parent(parent: Parent) = apply { this.parent = parent }

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

            fun build(): Department =
                Department(
                    name,
                    parent,
                    additionalProperties.toImmutable(),
                )
        }

        /** The parent department, if present. */
        @NoAutoDetect
        class Parent
        @JsonCreator
        private constructor(
            @JsonProperty("name") private val name: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The parent department's name. */
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
                internal fun from(parent: Parent) = apply {
                    name = parent.name
                    additionalProperties = parent.additionalProperties.toMutableMap()
                }

                /** The parent department's name. */
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

                fun build(): Parent = Parent(name, additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Parent && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Parent{name=$name, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Department && name == other.name && parent == other.parent && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, parent, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Department{name=$name, parent=$parent, additionalProperties=$additionalProperties}"
    }

    /** The entity type object. */
    @NoAutoDetect
    class Entity
    @JsonCreator
    private constructor(
        @JsonProperty("subtype") private val subtype: Subtype?,
        @JsonProperty("type") private val type: Type?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The tax payer subtype of the company. */
        @JsonProperty("subtype") fun subtype(): Optional<Subtype> = Optional.ofNullable(subtype)

        /** The tax payer type of the company. */
        @JsonProperty("type") fun type(): Optional<Type> = Optional.ofNullable(type)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var subtype: Subtype? = null
            private var type: Type? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entity: Entity) = apply {
                subtype = entity.subtype
                type = entity.type
                additionalProperties = entity.additionalProperties.toMutableMap()
            }

            /** The tax payer subtype of the company. */
            fun subtype(subtype: Subtype) = apply { this.subtype = subtype }

            /** The tax payer type of the company. */
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

            fun build(): Entity =
                Entity(
                    subtype,
                    type,
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

                @JvmField val S_CORPORATION = of("s_corporation")

                @JvmField val C_CORPORATION = of("c_corporation")

                @JvmField val B_CORPORATION = of("b_corporation")

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

                @JvmField val LLC = of("llc")

                @JvmField val LP = of("lp")

                @JvmField val CORPORATION = of("corporation")

                @JvmField val SOLE_PROPRIETOR = of("sole_proprietor")

                @JvmField val NON_PROFIT = of("non_profit")

                @JvmField val PARTNERSHIP = of("partnership")

                @JvmField val COOPERATIVE = of("cooperative")

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

            return /* spotless:off */ other is Entity && subtype == other.subtype && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(subtype, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Entity{subtype=$subtype, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SandboxCompanyUpdateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SandboxCompanyUpdateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

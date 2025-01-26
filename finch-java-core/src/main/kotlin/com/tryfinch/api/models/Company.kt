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
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Company
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("accounts")
    @ExcludeMissing
    private val accounts: JsonField<List<Account>> = JsonMissing.of(),
    @JsonProperty("departments")
    @ExcludeMissing
    private val departments: JsonField<List<Department?>> = JsonMissing.of(),
    @JsonProperty("ein") @ExcludeMissing private val ein: JsonField<String> = JsonMissing.of(),
    @JsonProperty("entity")
    @ExcludeMissing
    private val entity: JsonField<Entity> = JsonMissing.of(),
    @JsonProperty("legal_name")
    @ExcludeMissing
    private val legalName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("locations")
    @ExcludeMissing
    private val locations: JsonField<List<Location?>> = JsonMissing.of(),
    @JsonProperty("primary_email")
    @ExcludeMissing
    private val primaryEmail: JsonField<String> = JsonMissing.of(),
    @JsonProperty("primary_phone_number")
    @ExcludeMissing
    private val primaryPhoneNumber: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** A stable Finch `id` (UUID v4) for the company. */
    fun id(): String = id.getRequired("id")

    /** An array of bank account objects associated with the payroll/HRIS system. */
    fun accounts(): Optional<List<Account>> = Optional.ofNullable(accounts.getNullable("accounts"))

    /** The array of company departments. */
    fun departments(): Optional<List<Department?>> =
        Optional.ofNullable(departments.getNullable("departments"))

    /** The employer identification number. */
    fun ein(): Optional<String> = Optional.ofNullable(ein.getNullable("ein"))

    /** The entity type object. */
    fun entity(): Optional<Entity> = Optional.ofNullable(entity.getNullable("entity"))

    /** The legal name of the company. */
    fun legalName(): Optional<String> = Optional.ofNullable(legalName.getNullable("legal_name"))

    fun locations(): Optional<List<Location?>> =
        Optional.ofNullable(locations.getNullable("locations"))

    /** The email of the main administrator on the account. */
    fun primaryEmail(): Optional<String> =
        Optional.ofNullable(primaryEmail.getNullable("primary_email"))

    /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
    fun primaryPhoneNumber(): Optional<String> =
        Optional.ofNullable(primaryPhoneNumber.getNullable("primary_phone_number"))

    /** A stable Finch `id` (UUID v4) for the company. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** An array of bank account objects associated with the payroll/HRIS system. */
    @JsonProperty("accounts") @ExcludeMissing fun _accounts(): JsonField<List<Account>> = accounts

    /** The array of company departments. */
    @JsonProperty("departments")
    @ExcludeMissing
    fun _departments(): JsonField<List<Department?>> = departments

    /** The employer identification number. */
    @JsonProperty("ein") @ExcludeMissing fun _ein(): JsonField<String> = ein

    /** The entity type object. */
    @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<Entity> = entity

    /** The legal name of the company. */
    @JsonProperty("legal_name") @ExcludeMissing fun _legalName(): JsonField<String> = legalName

    @JsonProperty("locations")
    @ExcludeMissing
    fun _locations(): JsonField<List<Location?>> = locations

    /** The email of the main administrator on the account. */
    @JsonProperty("primary_email")
    @ExcludeMissing
    fun _primaryEmail(): JsonField<String> = primaryEmail

    /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
    @JsonProperty("primary_phone_number")
    @ExcludeMissing
    fun _primaryPhoneNumber(): JsonField<String> = primaryPhoneNumber

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Company = apply {
        if (validated) {
            return@apply
        }

        id()
        accounts().ifPresent { it.forEach { it.validate() } }
        departments().ifPresent { it.forEach { it.ifPresent { it.validate() } } }
        ein()
        entity().ifPresent { it.validate() }
        legalName()
        locations().ifPresent { it.forEach { it.ifPresent { it.validate() } } }
        primaryEmail()
        primaryPhoneNumber()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accounts: JsonField<MutableList<Account>>? = null
        private var departments: JsonField<MutableList<Department?>>? = null
        private var ein: JsonField<String>? = null
        private var entity: JsonField<Entity>? = null
        private var legalName: JsonField<String>? = null
        private var locations: JsonField<MutableList<Location?>>? = null
        private var primaryEmail: JsonField<String>? = null
        private var primaryPhoneNumber: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(company: Company) = apply {
            id = company.id
            accounts = company.accounts.map { it.toMutableList() }
            departments = company.departments.map { it.toMutableList() }
            ein = company.ein
            entity = company.entity
            legalName = company.legalName
            locations = company.locations.map { it.toMutableList() }
            primaryEmail = company.primaryEmail
            primaryPhoneNumber = company.primaryPhoneNumber
            additionalProperties = company.additionalProperties.toMutableMap()
        }

        /** A stable Finch `id` (UUID v4) for the company. */
        fun id(id: String) = id(JsonField.of(id))

        /** A stable Finch `id` (UUID v4) for the company. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** An array of bank account objects associated with the payroll/HRIS system. */
        fun accounts(accounts: List<Account>?) = accounts(JsonField.ofNullable(accounts))

        /** An array of bank account objects associated with the payroll/HRIS system. */
        fun accounts(accounts: Optional<List<Account>>) = accounts(accounts.orElse(null))

        /** An array of bank account objects associated with the payroll/HRIS system. */
        fun accounts(accounts: JsonField<List<Account>>) = apply {
            this.accounts = accounts.map { it.toMutableList() }
        }

        /** An array of bank account objects associated with the payroll/HRIS system. */
        fun addAccount(account: Account) = apply {
            accounts =
                (accounts ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(account)
                }
        }

        /** The array of company departments. */
        fun departments(departments: List<Department?>?) =
            departments(JsonField.ofNullable(departments))

        /** The array of company departments. */
        fun departments(departments: Optional<List<Department?>>) =
            departments(departments.orElse(null))

        /** The array of company departments. */
        fun departments(departments: JsonField<List<Department?>>) = apply {
            this.departments = departments.map { it.toMutableList() }
        }

        /** The array of company departments. */
        fun addDepartment(department: Department) = apply {
            departments =
                (departments ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(department)
                }
        }

        /** The employer identification number. */
        fun ein(ein: String?) = ein(JsonField.ofNullable(ein))

        /** The employer identification number. */
        fun ein(ein: Optional<String>) = ein(ein.orElse(null))

        /** The employer identification number. */
        fun ein(ein: JsonField<String>) = apply { this.ein = ein }

        /** The entity type object. */
        fun entity(entity: Entity?) = entity(JsonField.ofNullable(entity))

        /** The entity type object. */
        fun entity(entity: Optional<Entity>) = entity(entity.orElse(null))

        /** The entity type object. */
        fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

        /** The legal name of the company. */
        fun legalName(legalName: String?) = legalName(JsonField.ofNullable(legalName))

        /** The legal name of the company. */
        fun legalName(legalName: Optional<String>) = legalName(legalName.orElse(null))

        /** The legal name of the company. */
        fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

        fun locations(locations: List<Location?>?) = locations(JsonField.ofNullable(locations))

        fun locations(locations: Optional<List<Location?>>) = locations(locations.orElse(null))

        fun locations(locations: JsonField<List<Location?>>) = apply {
            this.locations = locations.map { it.toMutableList() }
        }

        fun addLocation(location: Location) = apply {
            locations =
                (locations ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(location)
                }
        }

        /** The email of the main administrator on the account. */
        fun primaryEmail(primaryEmail: String?) = primaryEmail(JsonField.ofNullable(primaryEmail))

        /** The email of the main administrator on the account. */
        fun primaryEmail(primaryEmail: Optional<String>) = primaryEmail(primaryEmail.orElse(null))

        /** The email of the main administrator on the account. */
        fun primaryEmail(primaryEmail: JsonField<String>) = apply {
            this.primaryEmail = primaryEmail
        }

        /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
        fun primaryPhoneNumber(primaryPhoneNumber: String?) =
            primaryPhoneNumber(JsonField.ofNullable(primaryPhoneNumber))

        /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
        fun primaryPhoneNumber(primaryPhoneNumber: Optional<String>) =
            primaryPhoneNumber(primaryPhoneNumber.orElse(null))

        /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
        fun primaryPhoneNumber(primaryPhoneNumber: JsonField<String>) = apply {
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

        fun build(): Company =
            Company(
                checkRequired("id", id),
                checkRequired("accounts", accounts).map { it.toImmutable() },
                checkRequired("departments", departments).map { it.toImmutable() },
                checkRequired("ein", ein),
                checkRequired("entity", entity),
                checkRequired("legalName", legalName),
                checkRequired("locations", locations).map { it.toImmutable() },
                checkRequired("primaryEmail", primaryEmail),
                checkRequired("primaryPhoneNumber", primaryPhoneNumber),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Account
    @JsonCreator
    private constructor(
        @JsonProperty("account_name")
        @ExcludeMissing
        private val accountName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_number")
        @ExcludeMissing
        private val accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_type")
        @ExcludeMissing
        private val accountType: JsonField<AccountType> = JsonMissing.of(),
        @JsonProperty("institution_name")
        @ExcludeMissing
        private val institutionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("routing_number")
        @ExcludeMissing
        private val routingNumber: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The name of the bank associated in the payroll/HRIS system. */
        fun accountName(): Optional<String> =
            Optional.ofNullable(accountName.getNullable("account_name"))

        /** 10-12 digit number to specify the bank account */
        fun accountNumber(): Optional<String> =
            Optional.ofNullable(accountNumber.getNullable("account_number"))

        /** The type of bank account. */
        fun accountType(): Optional<AccountType> =
            Optional.ofNullable(accountType.getNullable("account_type"))

        /** Name of the banking institution. */
        fun institutionName(): Optional<String> =
            Optional.ofNullable(institutionName.getNullable("institution_name"))

        /**
         * A nine-digit code that's based on the U.S. Bank location where your account was opened.
         */
        fun routingNumber(): Optional<String> =
            Optional.ofNullable(routingNumber.getNullable("routing_number"))

        /** The name of the bank associated in the payroll/HRIS system. */
        @JsonProperty("account_name")
        @ExcludeMissing
        fun _accountName(): JsonField<String> = accountName

        /** 10-12 digit number to specify the bank account */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun _accountNumber(): JsonField<String> = accountNumber

        /** The type of bank account. */
        @JsonProperty("account_type")
        @ExcludeMissing
        fun _accountType(): JsonField<AccountType> = accountType

        /** Name of the banking institution. */
        @JsonProperty("institution_name")
        @ExcludeMissing
        fun _institutionName(): JsonField<String> = institutionName

        /**
         * A nine-digit code that's based on the U.S. Bank location where your account was opened.
         */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun _routingNumber(): JsonField<String> = routingNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Account = apply {
            if (validated) {
                return@apply
            }

            accountName()
            accountNumber()
            accountType()
            institutionName()
            routingNumber()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var accountName: JsonField<String> = JsonMissing.of()
            private var accountNumber: JsonField<String> = JsonMissing.of()
            private var accountType: JsonField<AccountType> = JsonMissing.of()
            private var institutionName: JsonField<String> = JsonMissing.of()
            private var routingNumber: JsonField<String> = JsonMissing.of()
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
            fun accountName(accountName: String?) = accountName(JsonField.ofNullable(accountName))

            /** The name of the bank associated in the payroll/HRIS system. */
            fun accountName(accountName: Optional<String>) = accountName(accountName.orElse(null))

            /** The name of the bank associated in the payroll/HRIS system. */
            fun accountName(accountName: JsonField<String>) = apply {
                this.accountName = accountName
            }

            /** 10-12 digit number to specify the bank account */
            fun accountNumber(accountNumber: String?) =
                accountNumber(JsonField.ofNullable(accountNumber))

            /** 10-12 digit number to specify the bank account */
            fun accountNumber(accountNumber: Optional<String>) =
                accountNumber(accountNumber.orElse(null))

            /** 10-12 digit number to specify the bank account */
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            /** The type of bank account. */
            fun accountType(accountType: AccountType?) =
                accountType(JsonField.ofNullable(accountType))

            /** The type of bank account. */
            fun accountType(accountType: Optional<AccountType>) =
                accountType(accountType.orElse(null))

            /** The type of bank account. */
            fun accountType(accountType: JsonField<AccountType>) = apply {
                this.accountType = accountType
            }

            /** Name of the banking institution. */
            fun institutionName(institutionName: String?) =
                institutionName(JsonField.ofNullable(institutionName))

            /** Name of the banking institution. */
            fun institutionName(institutionName: Optional<String>) =
                institutionName(institutionName.orElse(null))

            /** Name of the banking institution. */
            fun institutionName(institutionName: JsonField<String>) = apply {
                this.institutionName = institutionName
            }

            /**
             * A nine-digit code that's based on the U.S. Bank location where your account was
             * opened.
             */
            fun routingNumber(routingNumber: String?) =
                routingNumber(JsonField.ofNullable(routingNumber))

            /**
             * A nine-digit code that's based on the U.S. Bank location where your account was
             * opened.
             */
            fun routingNumber(routingNumber: Optional<String>) =
                routingNumber(routingNumber.orElse(null))

            /**
             * A nine-digit code that's based on the U.S. Bank location where your account was
             * opened.
             */
            fun routingNumber(routingNumber: JsonField<String>) = apply {
                this.routingNumber = routingNumber
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

        /** The type of bank account. */
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
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parent")
        @ExcludeMissing
        private val parent: JsonField<Parent> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The department name. */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** The parent department, if present. */
        fun parent(): Optional<Parent> = Optional.ofNullable(parent.getNullable("parent"))

        /** The department name. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** The parent department, if present. */
        @JsonProperty("parent") @ExcludeMissing fun _parent(): JsonField<Parent> = parent

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Department = apply {
            if (validated) {
                return@apply
            }

            name()
            parent().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var parent: JsonField<Parent> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(department: Department) = apply {
                name = department.name
                parent = department.parent
                additionalProperties = department.additionalProperties.toMutableMap()
            }

            /** The department name. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** The department name. */
            fun name(name: Optional<String>) = name(name.orElse(null))

            /** The department name. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The parent department, if present. */
            fun parent(parent: Parent?) = parent(JsonField.ofNullable(parent))

            /** The parent department, if present. */
            fun parent(parent: Optional<Parent>) = parent(parent.orElse(null))

            /** The parent department, if present. */
            fun parent(parent: JsonField<Parent>) = apply { this.parent = parent }

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
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The parent department's name. */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** The parent department's name. */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Parent = apply {
                if (validated) {
                    return@apply
                }

                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(parent: Parent) = apply {
                    name = parent.name
                    additionalProperties = parent.additionalProperties.toMutableMap()
                }

                /** The parent department's name. */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** The parent department's name. */
                fun name(name: Optional<String>) = name(name.orElse(null))

                /** The parent department's name. */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
        @JsonProperty("subtype")
        @ExcludeMissing
        private val subtype: JsonField<Subtype> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The tax payer subtype of the company. */
        fun subtype(): Optional<Subtype> = Optional.ofNullable(subtype.getNullable("subtype"))

        /** The tax payer type of the company. */
        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        /** The tax payer subtype of the company. */
        @JsonProperty("subtype") @ExcludeMissing fun _subtype(): JsonField<Subtype> = subtype

        /** The tax payer type of the company. */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Entity = apply {
            if (validated) {
                return@apply
            }

            subtype()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var subtype: JsonField<Subtype> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entity: Entity) = apply {
                subtype = entity.subtype
                type = entity.type
                additionalProperties = entity.additionalProperties.toMutableMap()
            }

            /** The tax payer subtype of the company. */
            fun subtype(subtype: Subtype?) = subtype(JsonField.ofNullable(subtype))

            /** The tax payer subtype of the company. */
            fun subtype(subtype: Optional<Subtype>) = subtype(subtype.orElse(null))

            /** The tax payer subtype of the company. */
            fun subtype(subtype: JsonField<Subtype>) = apply { this.subtype = subtype }

            /** The tax payer type of the company. */
            fun type(type: Type?) = type(JsonField.ofNullable(type))

            /** The tax payer type of the company. */
            fun type(type: Optional<Type>) = type(type.orElse(null))

            /** The tax payer type of the company. */
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

            fun build(): Entity =
                Entity(
                    subtype,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        /** The tax payer subtype of the company. */
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

        /** The tax payer type of the company. */
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

        return /* spotless:off */ other is Company && id == other.id && accounts == other.accounts && departments == other.departments && ein == other.ein && entity == other.entity && legalName == other.legalName && locations == other.locations && primaryEmail == other.primaryEmail && primaryPhoneNumber == other.primaryPhoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accounts, departments, ein, entity, legalName, locations, primaryEmail, primaryPhoneNumber, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Company{id=$id, accounts=$accounts, departments=$departments, ein=$ein, entity=$entity, legalName=$legalName, locations=$locations, primaryEmail=$primaryEmail, primaryPhoneNumber=$primaryPhoneNumber, additionalProperties=$additionalProperties}"
}

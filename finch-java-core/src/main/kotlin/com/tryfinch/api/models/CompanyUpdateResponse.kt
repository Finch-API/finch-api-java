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
class CompanyUpdateResponse
@JsonCreator
private constructor(
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

    /** An array of bank account objects associated with the payroll/HRIS system. */
    @JsonProperty("accounts") @ExcludeMissing fun _accounts() = accounts

    /** The array of company departments. */
    @JsonProperty("departments") @ExcludeMissing fun _departments() = departments

    /** The employer identification number. */
    @JsonProperty("ein") @ExcludeMissing fun _ein() = ein

    /** The entity type object. */
    @JsonProperty("entity") @ExcludeMissing fun _entity() = entity

    /** The legal name of the company. */
    @JsonProperty("legal_name") @ExcludeMissing fun _legalName() = legalName

    @JsonProperty("locations") @ExcludeMissing fun _locations() = locations

    /** The email of the main administrator on the account. */
    @JsonProperty("primary_email") @ExcludeMissing fun _primaryEmail() = primaryEmail

    /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
    @JsonProperty("primary_phone_number")
    @ExcludeMissing
    fun _primaryPhoneNumber() = primaryPhoneNumber

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CompanyUpdateResponse = apply {
        if (!validated) {
            accounts().map { it.forEach { it.validate() } }
            departments().map { it.forEach { it?.validate() } }
            ein()
            entity().map { it.validate() }
            legalName()
            locations().map { it.forEach { it?.validate() } }
            primaryEmail()
            primaryPhoneNumber()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accounts: JsonField<List<Account>> = JsonMissing.of()
        private var departments: JsonField<List<Department?>> = JsonMissing.of()
        private var ein: JsonField<String> = JsonMissing.of()
        private var entity: JsonField<Entity> = JsonMissing.of()
        private var legalName: JsonField<String> = JsonMissing.of()
        private var locations: JsonField<List<Location?>> = JsonMissing.of()
        private var primaryEmail: JsonField<String> = JsonMissing.of()
        private var primaryPhoneNumber: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(companyUpdateResponse: CompanyUpdateResponse) = apply {
            accounts = companyUpdateResponse.accounts
            departments = companyUpdateResponse.departments
            ein = companyUpdateResponse.ein
            entity = companyUpdateResponse.entity
            legalName = companyUpdateResponse.legalName
            locations = companyUpdateResponse.locations
            primaryEmail = companyUpdateResponse.primaryEmail
            primaryPhoneNumber = companyUpdateResponse.primaryPhoneNumber
            additionalProperties = companyUpdateResponse.additionalProperties.toMutableMap()
        }

        /** An array of bank account objects associated with the payroll/HRIS system. */
        fun accounts(accounts: List<Account>) = accounts(JsonField.of(accounts))

        /** An array of bank account objects associated with the payroll/HRIS system. */
        fun accounts(accounts: JsonField<List<Account>>) = apply { this.accounts = accounts }

        /** The array of company departments. */
        fun departments(departments: List<Department?>) = departments(JsonField.of(departments))

        /** The array of company departments. */
        fun departments(departments: JsonField<List<Department?>>) = apply {
            this.departments = departments
        }

        /** The employer identification number. */
        fun ein(ein: String) = ein(JsonField.of(ein))

        /** The employer identification number. */
        fun ein(ein: JsonField<String>) = apply { this.ein = ein }

        /** The entity type object. */
        fun entity(entity: Entity) = entity(JsonField.of(entity))

        /** The entity type object. */
        fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

        /** The legal name of the company. */
        fun legalName(legalName: String) = legalName(JsonField.of(legalName))

        /** The legal name of the company. */
        fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

        fun locations(locations: List<Location?>) = locations(JsonField.of(locations))

        fun locations(locations: JsonField<List<Location?>>) = apply { this.locations = locations }

        /** The email of the main administrator on the account. */
        fun primaryEmail(primaryEmail: String) = primaryEmail(JsonField.of(primaryEmail))

        /** The email of the main administrator on the account. */
        fun primaryEmail(primaryEmail: JsonField<String>) = apply {
            this.primaryEmail = primaryEmail
        }

        /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
        fun primaryPhoneNumber(primaryPhoneNumber: String) =
            primaryPhoneNumber(JsonField.of(primaryPhoneNumber))

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

        fun build(): CompanyUpdateResponse =
            CompanyUpdateResponse(
                accounts.map { it.toImmutable() },
                departments.map { it.toImmutable() },
                ein,
                entity,
                legalName,
                locations.map { it.toImmutable() },
                primaryEmail,
                primaryPhoneNumber,
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
        @JsonProperty("account_name") @ExcludeMissing fun _accountName() = accountName

        /** 10-12 digit number to specify the bank account */
        @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

        /** The type of bank account. */
        @JsonProperty("account_type") @ExcludeMissing fun _accountType() = accountType

        /** Name of the banking institution. */
        @JsonProperty("institution_name") @ExcludeMissing fun _institutionName() = institutionName

        /**
         * A nine-digit code that's based on the U.S. Bank location where your account was opened.
         */
        @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Account = apply {
            if (!validated) {
                accountName()
                accountNumber()
                accountType()
                institutionName()
                routingNumber()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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
            fun accountName(accountName: String) = accountName(JsonField.of(accountName))

            /** The name of the bank associated in the payroll/HRIS system. */
            fun accountName(accountName: JsonField<String>) = apply {
                this.accountName = accountName
            }

            /** 10-12 digit number to specify the bank account */
            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /** 10-12 digit number to specify the bank account */
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            /** The type of bank account. */
            fun accountType(accountType: AccountType) = accountType(JsonField.of(accountType))

            /** The type of bank account. */
            fun accountType(accountType: JsonField<AccountType>) = apply {
                this.accountType = accountType
            }

            /** Name of the banking institution. */
            fun institutionName(institutionName: String) =
                institutionName(JsonField.of(institutionName))

            /** Name of the banking institution. */
            fun institutionName(institutionName: JsonField<String>) = apply {
                this.institutionName = institutionName
            }

            /**
             * A nine-digit code that's based on the U.S. Bank location where your account was
             * opened.
             */
            fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

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
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** The parent department, if present. */
        @JsonProperty("parent") @ExcludeMissing fun _parent() = parent

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Department = apply {
            if (!validated) {
                name()
                parent().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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
            fun name(name: String) = name(JsonField.of(name))

            /** The department name. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The parent department, if present. */
            fun parent(parent: Parent) = parent(JsonField.of(parent))

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
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Parent = apply {
                if (!validated) {
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(parent: Parent) = apply {
                    name = parent.name
                    additionalProperties = parent.additionalProperties.toMutableMap()
                }

                /** The parent department's name. */
                fun name(name: String) = name(JsonField.of(name))

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
        @JsonProperty("subtype") @ExcludeMissing fun _subtype() = subtype

        /** The tax payer type of the company. */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Entity = apply {
            if (!validated) {
                subtype()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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
            fun subtype(subtype: Subtype) = subtype(JsonField.of(subtype))

            /** The tax payer subtype of the company. */
            fun subtype(subtype: JsonField<Subtype>) = apply { this.subtype = subtype }

            /** The tax payer type of the company. */
            fun type(type: Type) = type(JsonField.of(type))

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

        return /* spotless:off */ other is CompanyUpdateResponse && accounts == other.accounts && departments == other.departments && ein == other.ein && entity == other.entity && legalName == other.legalName && locations == other.locations && primaryEmail == other.primaryEmail && primaryPhoneNumber == other.primaryPhoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accounts, departments, ein, entity, legalName, locations, primaryEmail, primaryPhoneNumber, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompanyUpdateResponse{accounts=$accounts, departments=$departments, ein=$ein, entity=$entity, legalName=$legalName, locations=$locations, primaryEmail=$primaryEmail, primaryPhoneNumber=$primaryPhoneNumber, additionalProperties=$additionalProperties}"
}

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
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CompanyUpdateResponse
private constructor(
    private val accounts: JsonField<List<Account>>,
    private val departments: JsonField<List<Department?>>,
    private val ein: JsonField<String>,
    private val entity: JsonField<Entity>,
    private val legalName: JsonField<String>,
    private val locations: JsonField<List<Location?>>,
    private val primaryEmail: JsonField<String>,
    private val primaryPhoneNumber: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accounts")
        @ExcludeMissing
        accounts: JsonField<List<Account>> = JsonMissing.of(),
        @JsonProperty("departments")
        @ExcludeMissing
        departments: JsonField<List<Department?>> = JsonMissing.of(),
        @JsonProperty("ein") @ExcludeMissing ein: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entity") @ExcludeMissing entity: JsonField<Entity> = JsonMissing.of(),
        @JsonProperty("legal_name") @ExcludeMissing legalName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locations")
        @ExcludeMissing
        locations: JsonField<List<Location?>> = JsonMissing.of(),
        @JsonProperty("primary_email")
        @ExcludeMissing
        primaryEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primary_phone_number")
        @ExcludeMissing
        primaryPhoneNumber: JsonField<String> = JsonMissing.of(),
    ) : this(
        accounts,
        departments,
        ein,
        entity,
        legalName,
        locations,
        primaryEmail,
        primaryPhoneNumber,
        mutableMapOf(),
    )

    /**
     * An array of bank account objects associated with the payroll/HRIS system.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accounts(): Optional<List<Account>> = Optional.ofNullable(accounts.getNullable("accounts"))

    /**
     * The array of company departments.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun departments(): Optional<List<Department?>> =
        Optional.ofNullable(departments.getNullable("departments"))

    /**
     * The employer identification number.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ein(): Optional<String> = Optional.ofNullable(ein.getNullable("ein"))

    /**
     * The entity type object.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entity(): Optional<Entity> = Optional.ofNullable(entity.getNullable("entity"))

    /**
     * The legal name of the company.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun legalName(): Optional<String> = Optional.ofNullable(legalName.getNullable("legal_name"))

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locations(): Optional<List<Location?>> =
        Optional.ofNullable(locations.getNullable("locations"))

    /**
     * The email of the main administrator on the account.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryEmail(): Optional<String> =
        Optional.ofNullable(primaryEmail.getNullable("primary_email"))

    /**
     * The phone number of the main administrator on the account. Format: `XXXXXXXXXX`
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryPhoneNumber(): Optional<String> =
        Optional.ofNullable(primaryPhoneNumber.getNullable("primary_phone_number"))

    /**
     * Returns the raw JSON value of [accounts].
     *
     * Unlike [accounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accounts") @ExcludeMissing fun _accounts(): JsonField<List<Account>> = accounts

    /**
     * Returns the raw JSON value of [departments].
     *
     * Unlike [departments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("departments")
    @ExcludeMissing
    fun _departments(): JsonField<List<Department?>> = departments

    /**
     * Returns the raw JSON value of [ein].
     *
     * Unlike [ein], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ein") @ExcludeMissing fun _ein(): JsonField<String> = ein

    /**
     * Returns the raw JSON value of [entity].
     *
     * Unlike [entity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<Entity> = entity

    /**
     * Returns the raw JSON value of [legalName].
     *
     * Unlike [legalName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("legal_name") @ExcludeMissing fun _legalName(): JsonField<String> = legalName

    /**
     * Returns the raw JSON value of [locations].
     *
     * Unlike [locations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locations")
    @ExcludeMissing
    fun _locations(): JsonField<List<Location?>> = locations

    /**
     * Returns the raw JSON value of [primaryEmail].
     *
     * Unlike [primaryEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primary_email")
    @ExcludeMissing
    fun _primaryEmail(): JsonField<String> = primaryEmail

    /**
     * Returns the raw JSON value of [primaryPhoneNumber].
     *
     * Unlike [primaryPhoneNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("primary_phone_number")
    @ExcludeMissing
    fun _primaryPhoneNumber(): JsonField<String> = primaryPhoneNumber

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CompanyUpdateResponse].
         *
         * The following fields are required:
         * ```java
         * .accounts()
         * .departments()
         * .ein()
         * .entity()
         * .legalName()
         * .locations()
         * .primaryEmail()
         * .primaryPhoneNumber()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CompanyUpdateResponse]. */
    class Builder internal constructor() {

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
        internal fun from(companyUpdateResponse: CompanyUpdateResponse) = apply {
            accounts = companyUpdateResponse.accounts.map { it.toMutableList() }
            departments = companyUpdateResponse.departments.map { it.toMutableList() }
            ein = companyUpdateResponse.ein
            entity = companyUpdateResponse.entity
            legalName = companyUpdateResponse.legalName
            locations = companyUpdateResponse.locations.map { it.toMutableList() }
            primaryEmail = companyUpdateResponse.primaryEmail
            primaryPhoneNumber = companyUpdateResponse.primaryPhoneNumber
            additionalProperties = companyUpdateResponse.additionalProperties.toMutableMap()
        }

        /** An array of bank account objects associated with the payroll/HRIS system. */
        fun accounts(accounts: List<Account>?) = accounts(JsonField.ofNullable(accounts))

        /** Alias for calling [Builder.accounts] with `accounts.orElse(null)`. */
        fun accounts(accounts: Optional<List<Account>>) = accounts(accounts.getOrNull())

        /**
         * Sets [Builder.accounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accounts] with a well-typed `List<Account>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accounts(accounts: JsonField<List<Account>>) = apply {
            this.accounts = accounts.map { it.toMutableList() }
        }

        /**
         * Adds a single [Account] to [accounts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccount(account: Account) = apply {
            accounts =
                (accounts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("accounts", it).add(account)
                }
        }

        /** The array of company departments. */
        fun departments(departments: List<Department?>?) =
            departments(JsonField.ofNullable(departments))

        /** Alias for calling [Builder.departments] with `departments.orElse(null)`. */
        fun departments(departments: Optional<List<Department?>>) =
            departments(departments.getOrNull())

        /**
         * Sets [Builder.departments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.departments] with a well-typed `List<Department?>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun departments(departments: JsonField<List<Department?>>) = apply {
            this.departments = departments.map { it.toMutableList() }
        }

        /**
         * Adds a single [Department] to [departments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDepartment(department: Department) = apply {
            departments =
                (departments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("departments", it).add(department)
                }
        }

        /** The employer identification number. */
        fun ein(ein: String?) = ein(JsonField.ofNullable(ein))

        /** Alias for calling [Builder.ein] with `ein.orElse(null)`. */
        fun ein(ein: Optional<String>) = ein(ein.getOrNull())

        /**
         * Sets [Builder.ein] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ein] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ein(ein: JsonField<String>) = apply { this.ein = ein }

        /** The entity type object. */
        fun entity(entity: Entity?) = entity(JsonField.ofNullable(entity))

        /** Alias for calling [Builder.entity] with `entity.orElse(null)`. */
        fun entity(entity: Optional<Entity>) = entity(entity.getOrNull())

        /**
         * Sets [Builder.entity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entity] with a well-typed [Entity] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

        /** The legal name of the company. */
        fun legalName(legalName: String?) = legalName(JsonField.ofNullable(legalName))

        /** Alias for calling [Builder.legalName] with `legalName.orElse(null)`. */
        fun legalName(legalName: Optional<String>) = legalName(legalName.getOrNull())

        /**
         * Sets [Builder.legalName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

        fun locations(locations: List<Location?>?) = locations(JsonField.ofNullable(locations))

        /** Alias for calling [Builder.locations] with `locations.orElse(null)`. */
        fun locations(locations: Optional<List<Location?>>) = locations(locations.getOrNull())

        /**
         * Sets [Builder.locations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locations] with a well-typed `List<Location?>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun locations(locations: JsonField<List<Location?>>) = apply {
            this.locations = locations.map { it.toMutableList() }
        }

        /**
         * Adds a single [Location] to [locations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLocation(location: Location) = apply {
            locations =
                (locations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("locations", it).add(location)
                }
        }

        /** The email of the main administrator on the account. */
        fun primaryEmail(primaryEmail: String?) = primaryEmail(JsonField.ofNullable(primaryEmail))

        /** Alias for calling [Builder.primaryEmail] with `primaryEmail.orElse(null)`. */
        fun primaryEmail(primaryEmail: Optional<String>) = primaryEmail(primaryEmail.getOrNull())

        /**
         * Sets [Builder.primaryEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun primaryEmail(primaryEmail: JsonField<String>) = apply {
            this.primaryEmail = primaryEmail
        }

        /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
        fun primaryPhoneNumber(primaryPhoneNumber: String?) =
            primaryPhoneNumber(JsonField.ofNullable(primaryPhoneNumber))

        /**
         * Alias for calling [Builder.primaryPhoneNumber] with `primaryPhoneNumber.orElse(null)`.
         */
        fun primaryPhoneNumber(primaryPhoneNumber: Optional<String>) =
            primaryPhoneNumber(primaryPhoneNumber.getOrNull())

        /**
         * Sets [Builder.primaryPhoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryPhoneNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /**
         * Returns an immutable instance of [CompanyUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accounts()
         * .departments()
         * .ein()
         * .entity()
         * .legalName()
         * .locations()
         * .primaryEmail()
         * .primaryPhoneNumber()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CompanyUpdateResponse =
            CompanyUpdateResponse(
                checkRequired("accounts", accounts).map { it.toImmutable() },
                checkRequired("departments", departments).map { it.toImmutable() },
                checkRequired("ein", ein),
                checkRequired("entity", entity),
                checkRequired("legalName", legalName),
                checkRequired("locations", locations).map { it.toImmutable() },
                checkRequired("primaryEmail", primaryEmail),
                checkRequired("primaryPhoneNumber", primaryPhoneNumber),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CompanyUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        accounts().ifPresent { it.forEach { it.validate() } }
        departments().ifPresent { it.forEach { it?.validate() } }
        ein()
        entity().ifPresent { it.validate() }
        legalName()
        locations().ifPresent { it.forEach { it?.validate() } }
        primaryEmail()
        primaryPhoneNumber()
        validated = true
    }

    class Account
    private constructor(
        private val accountName: JsonField<String>,
        private val accountNumber: JsonField<String>,
        private val accountType: JsonField<AccountType>,
        private val institutionName: JsonField<String>,
        private val routingNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_name")
            @ExcludeMissing
            accountName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_number")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_type")
            @ExcludeMissing
            accountType: JsonField<AccountType> = JsonMissing.of(),
            @JsonProperty("institution_name")
            @ExcludeMissing
            institutionName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routing_number")
            @ExcludeMissing
            routingNumber: JsonField<String> = JsonMissing.of(),
        ) : this(
            accountName,
            accountNumber,
            accountType,
            institutionName,
            routingNumber,
            mutableMapOf(),
        )

        /**
         * The name of the bank associated in the payroll/HRIS system.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountName(): Optional<String> =
            Optional.ofNullable(accountName.getNullable("account_name"))

        /**
         * 10-12 digit number to specify the bank account
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountNumber(): Optional<String> =
            Optional.ofNullable(accountNumber.getNullable("account_number"))

        /**
         * The type of bank account.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountType(): Optional<AccountType> =
            Optional.ofNullable(accountType.getNullable("account_type"))

        /**
         * Name of the banking institution.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun institutionName(): Optional<String> =
            Optional.ofNullable(institutionName.getNullable("institution_name"))

        /**
         * A nine-digit code that's based on the U.S. Bank location where your account was opened.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun routingNumber(): Optional<String> =
            Optional.ofNullable(routingNumber.getNullable("routing_number"))

        /**
         * Returns the raw JSON value of [accountName].
         *
         * Unlike [accountName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_name")
        @ExcludeMissing
        fun _accountName(): JsonField<String> = accountName

        /**
         * Returns the raw JSON value of [accountNumber].
         *
         * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun _accountNumber(): JsonField<String> = accountNumber

        /**
         * Returns the raw JSON value of [accountType].
         *
         * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_type")
        @ExcludeMissing
        fun _accountType(): JsonField<AccountType> = accountType

        /**
         * Returns the raw JSON value of [institutionName].
         *
         * Unlike [institutionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("institution_name")
        @ExcludeMissing
        fun _institutionName(): JsonField<String> = institutionName

        /**
         * Returns the raw JSON value of [routingNumber].
         *
         * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun _routingNumber(): JsonField<String> = routingNumber

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Account]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Account]. */
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

            /** Alias for calling [Builder.accountName] with `accountName.orElse(null)`. */
            fun accountName(accountName: Optional<String>) = accountName(accountName.getOrNull())

            /**
             * Sets [Builder.accountName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountName(accountName: JsonField<String>) = apply {
                this.accountName = accountName
            }

            /** 10-12 digit number to specify the bank account */
            fun accountNumber(accountNumber: String?) =
                accountNumber(JsonField.ofNullable(accountNumber))

            /** Alias for calling [Builder.accountNumber] with `accountNumber.orElse(null)`. */
            fun accountNumber(accountNumber: Optional<String>) =
                accountNumber(accountNumber.getOrNull())

            /**
             * Sets [Builder.accountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            /** The type of bank account. */
            fun accountType(accountType: AccountType?) =
                accountType(JsonField.ofNullable(accountType))

            /** Alias for calling [Builder.accountType] with `accountType.orElse(null)`. */
            fun accountType(accountType: Optional<AccountType>) =
                accountType(accountType.getOrNull())

            /**
             * Sets [Builder.accountType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountType] with a well-typed [AccountType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountType(accountType: JsonField<AccountType>) = apply {
                this.accountType = accountType
            }

            /** Name of the banking institution. */
            fun institutionName(institutionName: String?) =
                institutionName(JsonField.ofNullable(institutionName))

            /** Alias for calling [Builder.institutionName] with `institutionName.orElse(null)`. */
            fun institutionName(institutionName: Optional<String>) =
                institutionName(institutionName.getOrNull())

            /**
             * Sets [Builder.institutionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.institutionName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun institutionName(institutionName: JsonField<String>) = apply {
                this.institutionName = institutionName
            }

            /**
             * A nine-digit code that's based on the U.S. Bank location where your account was
             * opened.
             */
            fun routingNumber(routingNumber: String?) =
                routingNumber(JsonField.ofNullable(routingNumber))

            /** Alias for calling [Builder.routingNumber] with `routingNumber.orElse(null)`. */
            fun routingNumber(routingNumber: Optional<String>) =
                routingNumber(routingNumber.getOrNull())

            /**
             * Sets [Builder.routingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [Account].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Account =
                Account(
                    accountName,
                    accountNumber,
                    accountType,
                    institutionName,
                    routingNumber,
                    additionalProperties.toMutableMap(),
                )
        }

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

        /** The type of bank account. */
        class AccountType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CHECKING = of("checking")

                @JvmField val SAVINGS = of("savings")

                @JvmStatic fun of(value: String) = AccountType(JsonField.of(value))
            }

            /** An enum containing [AccountType]'s known values. */
            enum class Known {
                CHECKING,
                SAVINGS,
            }

            /**
             * An enum containing [AccountType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AccountType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CHECKING,
                SAVINGS,
                /**
                 * An enum member indicating that [AccountType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CHECKING -> Value.CHECKING
                    SAVINGS -> Value.SAVINGS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws FinchInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    CHECKING -> Known.CHECKING
                    SAVINGS -> Known.SAVINGS
                    else -> throw FinchInvalidDataException("Unknown AccountType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws FinchInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    FinchInvalidDataException("Value is not a String")
                }

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

    class Department
    private constructor(
        private val name: JsonField<String>,
        private val parent: JsonField<Parent>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parent") @ExcludeMissing parent: JsonField<Parent> = JsonMissing.of(),
        ) : this(name, parent, mutableMapOf())

        /**
         * The department name.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /**
         * The parent department, if present.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parent(): Optional<Parent> = Optional.ofNullable(parent.getNullable("parent"))

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [parent].
         *
         * Unlike [parent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parent") @ExcludeMissing fun _parent(): JsonField<Parent> = parent

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Department]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Department]. */
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

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The parent department, if present. */
            fun parent(parent: Parent?) = parent(JsonField.ofNullable(parent))

            /** Alias for calling [Builder.parent] with `parent.orElse(null)`. */
            fun parent(parent: Optional<Parent>) = parent(parent.getOrNull())

            /**
             * Sets [Builder.parent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parent] with a well-typed [Parent] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [Department].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Department = Department(name, parent, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Department = apply {
            if (validated) {
                return@apply
            }

            name()
            parent().ifPresent { it.validate() }
            validated = true
        }

        /** The parent department, if present. */
        class Parent
        private constructor(
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of()
            ) : this(name, mutableMapOf())

            /**
             * The parent department's name.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Parent]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Parent]. */
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

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Parent].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Parent = Parent(name, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Parent = apply {
                if (validated) {
                    return@apply
                }

                name()
                validated = true
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
    class Entity
    private constructor(
        private val subtype: JsonField<Subtype>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("subtype") @ExcludeMissing subtype: JsonField<Subtype> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(subtype, type, mutableMapOf())

        /**
         * The tax payer subtype of the company.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subtype(): Optional<Subtype> = Optional.ofNullable(subtype.getNullable("subtype"))

        /**
         * The tax payer type of the company.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        /**
         * Returns the raw JSON value of [subtype].
         *
         * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subtype") @ExcludeMissing fun _subtype(): JsonField<Subtype> = subtype

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Entity]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Entity]. */
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

            /** Alias for calling [Builder.subtype] with `subtype.orElse(null)`. */
            fun subtype(subtype: Optional<Subtype>) = subtype(subtype.getOrNull())

            /**
             * Sets [Builder.subtype] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subtype] with a well-typed [Subtype] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subtype(subtype: JsonField<Subtype>) = apply { this.subtype = subtype }

            /** The tax payer type of the company. */
            fun type(type: Type?) = type(JsonField.ofNullable(type))

            /** Alias for calling [Builder.type] with `type.orElse(null)`. */
            fun type(type: Optional<Type>) = type(type.getOrNull())

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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

            /**
             * Returns an immutable instance of [Entity].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Entity = Entity(subtype, type, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Entity = apply {
            if (validated) {
                return@apply
            }

            subtype()
            type()
            validated = true
        }

        /** The tax payer subtype of the company. */
        class Subtype @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val S_CORPORATION = of("s_corporation")

                @JvmField val C_CORPORATION = of("c_corporation")

                @JvmField val B_CORPORATION = of("b_corporation")

                @JvmStatic fun of(value: String) = Subtype(JsonField.of(value))
            }

            /** An enum containing [Subtype]'s known values. */
            enum class Known {
                S_CORPORATION,
                C_CORPORATION,
                B_CORPORATION,
            }

            /**
             * An enum containing [Subtype]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Subtype] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                S_CORPORATION,
                C_CORPORATION,
                B_CORPORATION,
                /**
                 * An enum member indicating that [Subtype] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    S_CORPORATION -> Value.S_CORPORATION
                    C_CORPORATION -> Value.C_CORPORATION
                    B_CORPORATION -> Value.B_CORPORATION
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws FinchInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    S_CORPORATION -> Known.S_CORPORATION
                    C_CORPORATION -> Known.C_CORPORATION
                    B_CORPORATION -> Known.B_CORPORATION
                    else -> throw FinchInvalidDataException("Unknown Subtype: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws FinchInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    FinchInvalidDataException("Value is not a String")
                }

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
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
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

            /** An enum containing [Type]'s known values. */
            enum class Known {
                LLC,
                LP,
                CORPORATION,
                SOLE_PROPRIETOR,
                NON_PROFIT,
                PARTNERSHIP,
                COOPERATIVE,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LLC,
                LP,
                CORPORATION,
                SOLE_PROPRIETOR,
                NON_PROFIT,
                PARTNERSHIP,
                COOPERATIVE,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
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

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws FinchInvalidDataException if this class instance's value is a not a known
             *   member.
             */
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

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws FinchInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    FinchInvalidDataException("Value is not a String")
                }

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

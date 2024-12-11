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
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = Provider.Builder::class)
@NoAutoDetect
class Provider
private constructor(
    private val id: JsonField<String>,
    private val displayName: JsonField<String>,
    private val products: JsonField<List<String>>,
    private val icon: JsonField<String>,
    private val logo: JsonField<String>,
    private val mfaRequired: JsonField<Boolean>,
    private val primaryColor: JsonField<String>,
    private val manual: JsonField<Boolean>,
    private val beta: JsonField<Boolean>,
    private val authenticationMethods: JsonField<List<AuthenticationMethod>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The id of the payroll provider used in Connect. */
    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /** The display name of the payroll provider. */
    fun displayName(): Optional<String> =
        Optional.ofNullable(displayName.getNullable("display_name"))

    /** The list of Finch products supported on this payroll provider. */
    fun products(): Optional<List<String>> = Optional.ofNullable(products.getNullable("products"))

    /** The url to the official icon of the payroll provider. */
    fun icon(): Optional<String> = Optional.ofNullable(icon.getNullable("icon"))

    /** The url to the official logo of the payroll provider. */
    fun logo(): Optional<String> = Optional.ofNullable(logo.getNullable("logo"))

    /** whether MFA is required for the provider. */
    fun mfaRequired(): Optional<Boolean> =
        Optional.ofNullable(mfaRequired.getNullable("mfa_required"))

    /** The hex code for the primary color of the payroll provider. */
    fun primaryColor(): Optional<String> =
        Optional.ofNullable(primaryColor.getNullable("primary_color"))

    /**
     * [DEPRECATED] Whether the Finch integration with this provider uses the Assisted Connect Flow
     * by default. This field is now deprecated. Please check for a `type` of `assisted` in the
     * `authentication_methods` field instead.
     */
    fun manual(): Optional<Boolean> = Optional.ofNullable(manual.getNullable("manual"))

    /** `true` if the integration is in a beta state, `false` otherwise */
    fun beta(): Optional<Boolean> = Optional.ofNullable(beta.getNullable("beta"))

    /** The list of authentication methods supported by the provider. */
    fun authenticationMethods(): Optional<List<AuthenticationMethod>> =
        Optional.ofNullable(authenticationMethods.getNullable("authentication_methods"))

    /** The id of the payroll provider used in Connect. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The display name of the payroll provider. */
    @JsonProperty("display_name") @ExcludeMissing fun _displayName() = displayName

    /** The list of Finch products supported on this payroll provider. */
    @JsonProperty("products") @ExcludeMissing fun _products() = products

    /** The url to the official icon of the payroll provider. */
    @JsonProperty("icon") @ExcludeMissing fun _icon() = icon

    /** The url to the official logo of the payroll provider. */
    @JsonProperty("logo") @ExcludeMissing fun _logo() = logo

    /** whether MFA is required for the provider. */
    @JsonProperty("mfa_required") @ExcludeMissing fun _mfaRequired() = mfaRequired

    /** The hex code for the primary color of the payroll provider. */
    @JsonProperty("primary_color") @ExcludeMissing fun _primaryColor() = primaryColor

    /**
     * [DEPRECATED] Whether the Finch integration with this provider uses the Assisted Connect Flow
     * by default. This field is now deprecated. Please check for a `type` of `assisted` in the
     * `authentication_methods` field instead.
     */
    @JsonProperty("manual") @ExcludeMissing fun _manual() = manual

    /** `true` if the integration is in a beta state, `false` otherwise */
    @JsonProperty("beta") @ExcludeMissing fun _beta() = beta

    /** The list of authentication methods supported by the provider. */
    @JsonProperty("authentication_methods")
    @ExcludeMissing
    fun _authenticationMethods() = authenticationMethods

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Provider = apply {
        if (!validated) {
            id()
            displayName()
            products()
            icon()
            logo()
            mfaRequired()
            primaryColor()
            manual()
            beta()
            authenticationMethods().map { it.forEach { it.validate() } }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var displayName: JsonField<String> = JsonMissing.of()
        private var products: JsonField<List<String>> = JsonMissing.of()
        private var icon: JsonField<String> = JsonMissing.of()
        private var logo: JsonField<String> = JsonMissing.of()
        private var mfaRequired: JsonField<Boolean> = JsonMissing.of()
        private var primaryColor: JsonField<String> = JsonMissing.of()
        private var manual: JsonField<Boolean> = JsonMissing.of()
        private var beta: JsonField<Boolean> = JsonMissing.of()
        private var authenticationMethods: JsonField<List<AuthenticationMethod>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(provider: Provider) = apply {
            this.id = provider.id
            this.displayName = provider.displayName
            this.products = provider.products
            this.icon = provider.icon
            this.logo = provider.logo
            this.mfaRequired = provider.mfaRequired
            this.primaryColor = provider.primaryColor
            this.manual = provider.manual
            this.beta = provider.beta
            this.authenticationMethods = provider.authenticationMethods
            additionalProperties(provider.additionalProperties)
        }

        /** The id of the payroll provider used in Connect. */
        fun id(id: String) = id(JsonField.of(id))

        /** The id of the payroll provider used in Connect. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The display name of the payroll provider. */
        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        /** The display name of the payroll provider. */
        @JsonProperty("display_name")
        @ExcludeMissing
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        /** The list of Finch products supported on this payroll provider. */
        fun products(products: List<String>) = products(JsonField.of(products))

        /** The list of Finch products supported on this payroll provider. */
        @JsonProperty("products")
        @ExcludeMissing
        fun products(products: JsonField<List<String>>) = apply { this.products = products }

        /** The url to the official icon of the payroll provider. */
        fun icon(icon: String) = icon(JsonField.of(icon))

        /** The url to the official icon of the payroll provider. */
        @JsonProperty("icon")
        @ExcludeMissing
        fun icon(icon: JsonField<String>) = apply { this.icon = icon }

        /** The url to the official logo of the payroll provider. */
        fun logo(logo: String) = logo(JsonField.of(logo))

        /** The url to the official logo of the payroll provider. */
        @JsonProperty("logo")
        @ExcludeMissing
        fun logo(logo: JsonField<String>) = apply { this.logo = logo }

        /** whether MFA is required for the provider. */
        fun mfaRequired(mfaRequired: Boolean) = mfaRequired(JsonField.of(mfaRequired))

        /** whether MFA is required for the provider. */
        @JsonProperty("mfa_required")
        @ExcludeMissing
        fun mfaRequired(mfaRequired: JsonField<Boolean>) = apply { this.mfaRequired = mfaRequired }

        /** The hex code for the primary color of the payroll provider. */
        fun primaryColor(primaryColor: String) = primaryColor(JsonField.of(primaryColor))

        /** The hex code for the primary color of the payroll provider. */
        @JsonProperty("primary_color")
        @ExcludeMissing
        fun primaryColor(primaryColor: JsonField<String>) = apply {
            this.primaryColor = primaryColor
        }

        /**
         * [DEPRECATED] Whether the Finch integration with this provider uses the Assisted Connect
         * Flow by default. This field is now deprecated. Please check for a `type` of `assisted` in
         * the `authentication_methods` field instead.
         */
        fun manual(manual: Boolean) = manual(JsonField.of(manual))

        /**
         * [DEPRECATED] Whether the Finch integration with this provider uses the Assisted Connect
         * Flow by default. This field is now deprecated. Please check for a `type` of `assisted` in
         * the `authentication_methods` field instead.
         */
        @JsonProperty("manual")
        @ExcludeMissing
        fun manual(manual: JsonField<Boolean>) = apply { this.manual = manual }

        /** `true` if the integration is in a beta state, `false` otherwise */
        fun beta(beta: Boolean) = beta(JsonField.of(beta))

        /** `true` if the integration is in a beta state, `false` otherwise */
        @JsonProperty("beta")
        @ExcludeMissing
        fun beta(beta: JsonField<Boolean>) = apply { this.beta = beta }

        /** The list of authentication methods supported by the provider. */
        fun authenticationMethods(authenticationMethods: List<AuthenticationMethod>) =
            authenticationMethods(JsonField.of(authenticationMethods))

        /** The list of authentication methods supported by the provider. */
        @JsonProperty("authentication_methods")
        @ExcludeMissing
        fun authenticationMethods(authenticationMethods: JsonField<List<AuthenticationMethod>>) =
            apply {
                this.authenticationMethods = authenticationMethods
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

        fun build(): Provider =
            Provider(
                id,
                displayName,
                products.map { it.toImmutable() },
                icon,
                logo,
                mfaRequired,
                primaryColor,
                manual,
                beta,
                authenticationMethods.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = AuthenticationMethod.Builder::class)
    @NoAutoDetect
    class AuthenticationMethod
    private constructor(
        private val type: JsonField<Type>,
        private val benefitsSupport: JsonField<BenefitsSupport>,
        private val supportedFields: JsonField<SupportedFields>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The type of authentication method. */
        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        /**
         * Each benefit type and their supported features. If the benefit type is not supported, the
         * property will be null
         */
        fun benefitsSupport(): Optional<BenefitsSupport> =
            Optional.ofNullable(benefitsSupport.getNullable("benefits_support"))

        /** The supported data fields returned by our HR and payroll endpoints */
        fun supportedFields(): Optional<SupportedFields> =
            Optional.ofNullable(supportedFields.getNullable("supported_fields"))

        /** The type of authentication method. */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        /**
         * Each benefit type and their supported features. If the benefit type is not supported, the
         * property will be null
         */
        @JsonProperty("benefits_support") @ExcludeMissing fun _benefitsSupport() = benefitsSupport

        /** The supported data fields returned by our HR and payroll endpoints */
        @JsonProperty("supported_fields") @ExcludeMissing fun _supportedFields() = supportedFields

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AuthenticationMethod = apply {
            if (!validated) {
                type()
                benefitsSupport().map { it.validate() }
                supportedFields().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: JsonField<Type> = JsonMissing.of()
            private var benefitsSupport: JsonField<BenefitsSupport> = JsonMissing.of()
            private var supportedFields: JsonField<SupportedFields> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authenticationMethod: AuthenticationMethod) = apply {
                this.type = authenticationMethod.type
                this.benefitsSupport = authenticationMethod.benefitsSupport
                this.supportedFields = authenticationMethod.supportedFields
                additionalProperties(authenticationMethod.additionalProperties)
            }

            /** The type of authentication method. */
            fun type(type: Type) = type(JsonField.of(type))

            /** The type of authentication method. */
            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * Each benefit type and their supported features. If the benefit type is not supported,
             * the property will be null
             */
            fun benefitsSupport(benefitsSupport: BenefitsSupport) =
                benefitsSupport(JsonField.of(benefitsSupport))

            /**
             * Each benefit type and their supported features. If the benefit type is not supported,
             * the property will be null
             */
            @JsonProperty("benefits_support")
            @ExcludeMissing
            fun benefitsSupport(benefitsSupport: JsonField<BenefitsSupport>) = apply {
                this.benefitsSupport = benefitsSupport
            }

            /** The supported data fields returned by our HR and payroll endpoints */
            fun supportedFields(supportedFields: SupportedFields) =
                supportedFields(JsonField.of(supportedFields))

            /** The supported data fields returned by our HR and payroll endpoints */
            @JsonProperty("supported_fields")
            @ExcludeMissing
            fun supportedFields(supportedFields: JsonField<SupportedFields>) = apply {
                this.supportedFields = supportedFields
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

            fun build(): AuthenticationMethod =
                AuthenticationMethod(
                    type,
                    benefitsSupport,
                    supportedFields,
                    additionalProperties.toImmutable(),
                )
        }

        /** The supported data fields returned by our HR and payroll endpoints */
        @JsonDeserialize(builder = SupportedFields.Builder::class)
        @NoAutoDetect
        class SupportedFields
        private constructor(
            private val company: JsonField<SupportedCompanyFields>,
            private val directory: JsonField<SupportedDirectoryFields>,
            private val individual: JsonField<SupportedIndividualFields>,
            private val employment: JsonField<SupportedEmploymentFields>,
            private val payment: JsonField<SupportedPaymentFields>,
            private val payStatement: JsonField<SupportedPayStatementFields>,
            private val payGroup: JsonField<SupportedPayGroupFields>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun company(): Optional<SupportedCompanyFields> =
                Optional.ofNullable(company.getNullable("company"))

            fun directory(): Optional<SupportedDirectoryFields> =
                Optional.ofNullable(directory.getNullable("directory"))

            fun individual(): Optional<SupportedIndividualFields> =
                Optional.ofNullable(individual.getNullable("individual"))

            fun employment(): Optional<SupportedEmploymentFields> =
                Optional.ofNullable(employment.getNullable("employment"))

            fun payment(): Optional<SupportedPaymentFields> =
                Optional.ofNullable(payment.getNullable("payment"))

            fun payStatement(): Optional<SupportedPayStatementFields> =
                Optional.ofNullable(payStatement.getNullable("pay_statement"))

            fun payGroup(): Optional<SupportedPayGroupFields> =
                Optional.ofNullable(payGroup.getNullable("pay_group"))

            @JsonProperty("company") @ExcludeMissing fun _company() = company

            @JsonProperty("directory") @ExcludeMissing fun _directory() = directory

            @JsonProperty("individual") @ExcludeMissing fun _individual() = individual

            @JsonProperty("employment") @ExcludeMissing fun _employment() = employment

            @JsonProperty("payment") @ExcludeMissing fun _payment() = payment

            @JsonProperty("pay_statement") @ExcludeMissing fun _payStatement() = payStatement

            @JsonProperty("pay_group") @ExcludeMissing fun _payGroup() = payGroup

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): SupportedFields = apply {
                if (!validated) {
                    company().map { it.validate() }
                    directory().map { it.validate() }
                    individual().map { it.validate() }
                    employment().map { it.validate() }
                    payment().map { it.validate() }
                    payStatement().map { it.validate() }
                    payGroup().map { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var company: JsonField<SupportedCompanyFields> = JsonMissing.of()
                private var directory: JsonField<SupportedDirectoryFields> = JsonMissing.of()
                private var individual: JsonField<SupportedIndividualFields> = JsonMissing.of()
                private var employment: JsonField<SupportedEmploymentFields> = JsonMissing.of()
                private var payment: JsonField<SupportedPaymentFields> = JsonMissing.of()
                private var payStatement: JsonField<SupportedPayStatementFields> = JsonMissing.of()
                private var payGroup: JsonField<SupportedPayGroupFields> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(supportedFields: SupportedFields) = apply {
                    this.company = supportedFields.company
                    this.directory = supportedFields.directory
                    this.individual = supportedFields.individual
                    this.employment = supportedFields.employment
                    this.payment = supportedFields.payment
                    this.payStatement = supportedFields.payStatement
                    this.payGroup = supportedFields.payGroup
                    additionalProperties(supportedFields.additionalProperties)
                }

                fun company(company: SupportedCompanyFields) = company(JsonField.of(company))

                @JsonProperty("company")
                @ExcludeMissing
                fun company(company: JsonField<SupportedCompanyFields>) = apply {
                    this.company = company
                }

                fun directory(directory: SupportedDirectoryFields) =
                    directory(JsonField.of(directory))

                @JsonProperty("directory")
                @ExcludeMissing
                fun directory(directory: JsonField<SupportedDirectoryFields>) = apply {
                    this.directory = directory
                }

                fun individual(individual: SupportedIndividualFields) =
                    individual(JsonField.of(individual))

                @JsonProperty("individual")
                @ExcludeMissing
                fun individual(individual: JsonField<SupportedIndividualFields>) = apply {
                    this.individual = individual
                }

                fun employment(employment: SupportedEmploymentFields) =
                    employment(JsonField.of(employment))

                @JsonProperty("employment")
                @ExcludeMissing
                fun employment(employment: JsonField<SupportedEmploymentFields>) = apply {
                    this.employment = employment
                }

                fun payment(payment: SupportedPaymentFields) = payment(JsonField.of(payment))

                @JsonProperty("payment")
                @ExcludeMissing
                fun payment(payment: JsonField<SupportedPaymentFields>) = apply {
                    this.payment = payment
                }

                fun payStatement(payStatement: SupportedPayStatementFields) =
                    payStatement(JsonField.of(payStatement))

                @JsonProperty("pay_statement")
                @ExcludeMissing
                fun payStatement(payStatement: JsonField<SupportedPayStatementFields>) = apply {
                    this.payStatement = payStatement
                }

                fun payGroup(payGroup: SupportedPayGroupFields) = payGroup(JsonField.of(payGroup))

                @JsonProperty("pay_group")
                @ExcludeMissing
                fun payGroup(payGroup: JsonField<SupportedPayGroupFields>) = apply {
                    this.payGroup = payGroup
                }

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

                fun build(): SupportedFields =
                    SupportedFields(
                        company,
                        directory,
                        individual,
                        employment,
                        payment,
                        payStatement,
                        payGroup,
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(builder = SupportedCompanyFields.Builder::class)
            @NoAutoDetect
            class SupportedCompanyFields
            private constructor(
                private val id: JsonField<Boolean>,
                private val legalName: JsonField<Boolean>,
                private val entity: JsonField<Entity>,
                private val primaryEmail: JsonField<Boolean>,
                private val primaryPhoneNumber: JsonField<Boolean>,
                private val ein: JsonField<Boolean>,
                private val accounts: JsonField<Accounts>,
                private val departments: JsonField<Departments>,
                private val locations: JsonField<Locations>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun id(): Optional<Boolean> = Optional.ofNullable(id.getNullable("id"))

                fun legalName(): Optional<Boolean> =
                    Optional.ofNullable(legalName.getNullable("legal_name"))

                fun entity(): Optional<Entity> = Optional.ofNullable(entity.getNullable("entity"))

                fun primaryEmail(): Optional<Boolean> =
                    Optional.ofNullable(primaryEmail.getNullable("primary_email"))

                fun primaryPhoneNumber(): Optional<Boolean> =
                    Optional.ofNullable(primaryPhoneNumber.getNullable("primary_phone_number"))

                fun ein(): Optional<Boolean> = Optional.ofNullable(ein.getNullable("ein"))

                fun accounts(): Optional<Accounts> =
                    Optional.ofNullable(accounts.getNullable("accounts"))

                fun departments(): Optional<Departments> =
                    Optional.ofNullable(departments.getNullable("departments"))

                fun locations(): Optional<Locations> =
                    Optional.ofNullable(locations.getNullable("locations"))

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                @JsonProperty("legal_name") @ExcludeMissing fun _legalName() = legalName

                @JsonProperty("entity") @ExcludeMissing fun _entity() = entity

                @JsonProperty("primary_email") @ExcludeMissing fun _primaryEmail() = primaryEmail

                @JsonProperty("primary_phone_number")
                @ExcludeMissing
                fun _primaryPhoneNumber() = primaryPhoneNumber

                @JsonProperty("ein") @ExcludeMissing fun _ein() = ein

                @JsonProperty("accounts") @ExcludeMissing fun _accounts() = accounts

                @JsonProperty("departments") @ExcludeMissing fun _departments() = departments

                @JsonProperty("locations") @ExcludeMissing fun _locations() = locations

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): SupportedCompanyFields = apply {
                    if (!validated) {
                        id()
                        legalName()
                        entity().map { it.validate() }
                        primaryEmail()
                        primaryPhoneNumber()
                        ein()
                        accounts().map { it.validate() }
                        departments().map { it.validate() }
                        locations().map { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<Boolean> = JsonMissing.of()
                    private var legalName: JsonField<Boolean> = JsonMissing.of()
                    private var entity: JsonField<Entity> = JsonMissing.of()
                    private var primaryEmail: JsonField<Boolean> = JsonMissing.of()
                    private var primaryPhoneNumber: JsonField<Boolean> = JsonMissing.of()
                    private var ein: JsonField<Boolean> = JsonMissing.of()
                    private var accounts: JsonField<Accounts> = JsonMissing.of()
                    private var departments: JsonField<Departments> = JsonMissing.of()
                    private var locations: JsonField<Locations> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(supportedCompanyFields: SupportedCompanyFields) = apply {
                        this.id = supportedCompanyFields.id
                        this.legalName = supportedCompanyFields.legalName
                        this.entity = supportedCompanyFields.entity
                        this.primaryEmail = supportedCompanyFields.primaryEmail
                        this.primaryPhoneNumber = supportedCompanyFields.primaryPhoneNumber
                        this.ein = supportedCompanyFields.ein
                        this.accounts = supportedCompanyFields.accounts
                        this.departments = supportedCompanyFields.departments
                        this.locations = supportedCompanyFields.locations
                        additionalProperties(supportedCompanyFields.additionalProperties)
                    }

                    fun id(id: Boolean) = id(JsonField.of(id))

                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<Boolean>) = apply { this.id = id }

                    fun legalName(legalName: Boolean) = legalName(JsonField.of(legalName))

                    @JsonProperty("legal_name")
                    @ExcludeMissing
                    fun legalName(legalName: JsonField<Boolean>) = apply {
                        this.legalName = legalName
                    }

                    fun entity(entity: Entity) = entity(JsonField.of(entity))

                    @JsonProperty("entity")
                    @ExcludeMissing
                    fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

                    fun primaryEmail(primaryEmail: Boolean) =
                        primaryEmail(JsonField.of(primaryEmail))

                    @JsonProperty("primary_email")
                    @ExcludeMissing
                    fun primaryEmail(primaryEmail: JsonField<Boolean>) = apply {
                        this.primaryEmail = primaryEmail
                    }

                    fun primaryPhoneNumber(primaryPhoneNumber: Boolean) =
                        primaryPhoneNumber(JsonField.of(primaryPhoneNumber))

                    @JsonProperty("primary_phone_number")
                    @ExcludeMissing
                    fun primaryPhoneNumber(primaryPhoneNumber: JsonField<Boolean>) = apply {
                        this.primaryPhoneNumber = primaryPhoneNumber
                    }

                    fun ein(ein: Boolean) = ein(JsonField.of(ein))

                    @JsonProperty("ein")
                    @ExcludeMissing
                    fun ein(ein: JsonField<Boolean>) = apply { this.ein = ein }

                    fun accounts(accounts: Accounts) = accounts(JsonField.of(accounts))

                    @JsonProperty("accounts")
                    @ExcludeMissing
                    fun accounts(accounts: JsonField<Accounts>) = apply { this.accounts = accounts }

                    fun departments(departments: Departments) =
                        departments(JsonField.of(departments))

                    @JsonProperty("departments")
                    @ExcludeMissing
                    fun departments(departments: JsonField<Departments>) = apply {
                        this.departments = departments
                    }

                    fun locations(locations: Locations) = locations(JsonField.of(locations))

                    @JsonProperty("locations")
                    @ExcludeMissing
                    fun locations(locations: JsonField<Locations>) = apply {
                        this.locations = locations
                    }

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

                    fun build(): SupportedCompanyFields =
                        SupportedCompanyFields(
                            id,
                            legalName,
                            entity,
                            primaryEmail,
                            primaryPhoneNumber,
                            ein,
                            accounts,
                            departments,
                            locations,
                            additionalProperties.toImmutable(),
                        )
                }

                @JsonDeserialize(builder = Accounts.Builder::class)
                @NoAutoDetect
                class Accounts
                private constructor(
                    private val routingNumber: JsonField<Boolean>,
                    private val accountName: JsonField<Boolean>,
                    private val institutionName: JsonField<Boolean>,
                    private val accountType: JsonField<Boolean>,
                    private val accountNumber: JsonField<Boolean>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun routingNumber(): Optional<Boolean> =
                        Optional.ofNullable(routingNumber.getNullable("routing_number"))

                    fun accountName(): Optional<Boolean> =
                        Optional.ofNullable(accountName.getNullable("account_name"))

                    fun institutionName(): Optional<Boolean> =
                        Optional.ofNullable(institutionName.getNullable("institution_name"))

                    fun accountType(): Optional<Boolean> =
                        Optional.ofNullable(accountType.getNullable("account_type"))

                    fun accountNumber(): Optional<Boolean> =
                        Optional.ofNullable(accountNumber.getNullable("account_number"))

                    @JsonProperty("routing_number")
                    @ExcludeMissing
                    fun _routingNumber() = routingNumber

                    @JsonProperty("account_name") @ExcludeMissing fun _accountName() = accountName

                    @JsonProperty("institution_name")
                    @ExcludeMissing
                    fun _institutionName() = institutionName

                    @JsonProperty("account_type") @ExcludeMissing fun _accountType() = accountType

                    @JsonProperty("account_number")
                    @ExcludeMissing
                    fun _accountNumber() = accountNumber

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Accounts = apply {
                        if (!validated) {
                            routingNumber()
                            accountName()
                            institutionName()
                            accountType()
                            accountNumber()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var routingNumber: JsonField<Boolean> = JsonMissing.of()
                        private var accountName: JsonField<Boolean> = JsonMissing.of()
                        private var institutionName: JsonField<Boolean> = JsonMissing.of()
                        private var accountType: JsonField<Boolean> = JsonMissing.of()
                        private var accountNumber: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(accounts: Accounts) = apply {
                            this.routingNumber = accounts.routingNumber
                            this.accountName = accounts.accountName
                            this.institutionName = accounts.institutionName
                            this.accountType = accounts.accountType
                            this.accountNumber = accounts.accountNumber
                            additionalProperties(accounts.additionalProperties)
                        }

                        fun routingNumber(routingNumber: Boolean) =
                            routingNumber(JsonField.of(routingNumber))

                        @JsonProperty("routing_number")
                        @ExcludeMissing
                        fun routingNumber(routingNumber: JsonField<Boolean>) = apply {
                            this.routingNumber = routingNumber
                        }

                        fun accountName(accountName: Boolean) =
                            accountName(JsonField.of(accountName))

                        @JsonProperty("account_name")
                        @ExcludeMissing
                        fun accountName(accountName: JsonField<Boolean>) = apply {
                            this.accountName = accountName
                        }

                        fun institutionName(institutionName: Boolean) =
                            institutionName(JsonField.of(institutionName))

                        @JsonProperty("institution_name")
                        @ExcludeMissing
                        fun institutionName(institutionName: JsonField<Boolean>) = apply {
                            this.institutionName = institutionName
                        }

                        fun accountType(accountType: Boolean) =
                            accountType(JsonField.of(accountType))

                        @JsonProperty("account_type")
                        @ExcludeMissing
                        fun accountType(accountType: JsonField<Boolean>) = apply {
                            this.accountType = accountType
                        }

                        fun accountNumber(accountNumber: Boolean) =
                            accountNumber(JsonField.of(accountNumber))

                        @JsonProperty("account_number")
                        @ExcludeMissing
                        fun accountNumber(accountNumber: JsonField<Boolean>) = apply {
                            this.accountNumber = accountNumber
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Accounts =
                            Accounts(
                                routingNumber,
                                accountName,
                                institutionName,
                                accountType,
                                accountNumber,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Accounts && routingNumber == other.routingNumber && accountName == other.accountName && institutionName == other.institutionName && accountType == other.accountType && accountNumber == other.accountNumber && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(routingNumber, accountName, institutionName, accountType, accountNumber, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Accounts{routingNumber=$routingNumber, accountName=$accountName, institutionName=$institutionName, accountType=$accountType, accountNumber=$accountNumber, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = Departments.Builder::class)
                @NoAutoDetect
                class Departments
                private constructor(
                    private val name: JsonField<Boolean>,
                    private val parent: JsonField<Parent>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun name(): Optional<Boolean> = Optional.ofNullable(name.getNullable("name"))

                    fun parent(): Optional<Parent> =
                        Optional.ofNullable(parent.getNullable("parent"))

                    @JsonProperty("name") @ExcludeMissing fun _name() = name

                    @JsonProperty("parent") @ExcludeMissing fun _parent() = parent

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Departments = apply {
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

                        private var name: JsonField<Boolean> = JsonMissing.of()
                        private var parent: JsonField<Parent> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(departments: Departments) = apply {
                            this.name = departments.name
                            this.parent = departments.parent
                            additionalProperties(departments.additionalProperties)
                        }

                        fun name(name: Boolean) = name(JsonField.of(name))

                        @JsonProperty("name")
                        @ExcludeMissing
                        fun name(name: JsonField<Boolean>) = apply { this.name = name }

                        fun parent(parent: Parent) = parent(JsonField.of(parent))

                        @JsonProperty("parent")
                        @ExcludeMissing
                        fun parent(parent: JsonField<Parent>) = apply { this.parent = parent }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Departments =
                            Departments(
                                name,
                                parent,
                                additionalProperties.toImmutable(),
                            )
                    }

                    @JsonDeserialize(builder = Parent.Builder::class)
                    @NoAutoDetect
                    class Parent
                    private constructor(
                        private val name: JsonField<Boolean>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        fun name(): Optional<Boolean> =
                            Optional.ofNullable(name.getNullable("name"))

                        @JsonProperty("name") @ExcludeMissing fun _name() = name

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                            private var name: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(parent: Parent) = apply {
                                this.name = parent.name
                                additionalProperties(parent.additionalProperties)
                            }

                            fun name(name: Boolean) = name(JsonField.of(name))

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun name(name: JsonField<Boolean>) = apply { this.name = name }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                        return /* spotless:off */ other is Departments && name == other.name && parent == other.parent && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(name, parent, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Departments{name=$name, parent=$parent, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = Entity.Builder::class)
                @NoAutoDetect
                class Entity
                private constructor(
                    private val type: JsonField<Boolean>,
                    private val subtype: JsonField<Boolean>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun type(): Optional<Boolean> = Optional.ofNullable(type.getNullable("type"))

                    fun subtype(): Optional<Boolean> =
                        Optional.ofNullable(subtype.getNullable("subtype"))

                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    @JsonProperty("subtype") @ExcludeMissing fun _subtype() = subtype

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Entity = apply {
                        if (!validated) {
                            type()
                            subtype()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var type: JsonField<Boolean> = JsonMissing.of()
                        private var subtype: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(entity: Entity) = apply {
                            this.type = entity.type
                            this.subtype = entity.subtype
                            additionalProperties(entity.additionalProperties)
                        }

                        fun type(type: Boolean) = type(JsonField.of(type))

                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<Boolean>) = apply { this.type = type }

                        fun subtype(subtype: Boolean) = subtype(JsonField.of(subtype))

                        @JsonProperty("subtype")
                        @ExcludeMissing
                        fun subtype(subtype: JsonField<Boolean>) = apply { this.subtype = subtype }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Entity =
                            Entity(
                                type,
                                subtype,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Entity && type == other.type && subtype == other.subtype && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(type, subtype, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Entity{type=$type, subtype=$subtype, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = Locations.Builder::class)
                @NoAutoDetect
                class Locations
                private constructor(
                    private val line1: JsonField<Boolean>,
                    private val line2: JsonField<Boolean>,
                    private val city: JsonField<Boolean>,
                    private val state: JsonField<Boolean>,
                    private val postalCode: JsonField<Boolean>,
                    private val country: JsonField<Boolean>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun line1(): Optional<Boolean> = Optional.ofNullable(line1.getNullable("line1"))

                    fun line2(): Optional<Boolean> = Optional.ofNullable(line2.getNullable("line2"))

                    fun city(): Optional<Boolean> = Optional.ofNullable(city.getNullable("city"))

                    fun state(): Optional<Boolean> = Optional.ofNullable(state.getNullable("state"))

                    fun postalCode(): Optional<Boolean> =
                        Optional.ofNullable(postalCode.getNullable("postal_code"))

                    fun country(): Optional<Boolean> =
                        Optional.ofNullable(country.getNullable("country"))

                    @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

                    @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

                    @JsonProperty("city") @ExcludeMissing fun _city() = city

                    @JsonProperty("state") @ExcludeMissing fun _state() = state

                    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

                    @JsonProperty("country") @ExcludeMissing fun _country() = country

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Locations = apply {
                        if (!validated) {
                            line1()
                            line2()
                            city()
                            state()
                            postalCode()
                            country()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var line1: JsonField<Boolean> = JsonMissing.of()
                        private var line2: JsonField<Boolean> = JsonMissing.of()
                        private var city: JsonField<Boolean> = JsonMissing.of()
                        private var state: JsonField<Boolean> = JsonMissing.of()
                        private var postalCode: JsonField<Boolean> = JsonMissing.of()
                        private var country: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(locations: Locations) = apply {
                            this.line1 = locations.line1
                            this.line2 = locations.line2
                            this.city = locations.city
                            this.state = locations.state
                            this.postalCode = locations.postalCode
                            this.country = locations.country
                            additionalProperties(locations.additionalProperties)
                        }

                        fun line1(line1: Boolean) = line1(JsonField.of(line1))

                        @JsonProperty("line1")
                        @ExcludeMissing
                        fun line1(line1: JsonField<Boolean>) = apply { this.line1 = line1 }

                        fun line2(line2: Boolean) = line2(JsonField.of(line2))

                        @JsonProperty("line2")
                        @ExcludeMissing
                        fun line2(line2: JsonField<Boolean>) = apply { this.line2 = line2 }

                        fun city(city: Boolean) = city(JsonField.of(city))

                        @JsonProperty("city")
                        @ExcludeMissing
                        fun city(city: JsonField<Boolean>) = apply { this.city = city }

                        fun state(state: Boolean) = state(JsonField.of(state))

                        @JsonProperty("state")
                        @ExcludeMissing
                        fun state(state: JsonField<Boolean>) = apply { this.state = state }

                        fun postalCode(postalCode: Boolean) = postalCode(JsonField.of(postalCode))

                        @JsonProperty("postal_code")
                        @ExcludeMissing
                        fun postalCode(postalCode: JsonField<Boolean>) = apply {
                            this.postalCode = postalCode
                        }

                        fun country(country: Boolean) = country(JsonField.of(country))

                        @JsonProperty("country")
                        @ExcludeMissing
                        fun country(country: JsonField<Boolean>) = apply { this.country = country }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Locations =
                            Locations(
                                line1,
                                line2,
                                city,
                                state,
                                postalCode,
                                country,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Locations && line1 == other.line1 && line2 == other.line2 && city == other.city && state == other.state && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(line1, line2, city, state, postalCode, country, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Locations{line1=$line1, line2=$line2, city=$city, state=$state, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is SupportedCompanyFields && id == other.id && legalName == other.legalName && entity == other.entity && primaryEmail == other.primaryEmail && primaryPhoneNumber == other.primaryPhoneNumber && ein == other.ein && accounts == other.accounts && departments == other.departments && locations == other.locations && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, legalName, entity, primaryEmail, primaryPhoneNumber, ein, accounts, departments, locations, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SupportedCompanyFields{id=$id, legalName=$legalName, entity=$entity, primaryEmail=$primaryEmail, primaryPhoneNumber=$primaryPhoneNumber, ein=$ein, accounts=$accounts, departments=$departments, locations=$locations, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = SupportedDirectoryFields.Builder::class)
            @NoAutoDetect
            class SupportedDirectoryFields
            private constructor(
                private val paging: JsonField<Paging>,
                private val individuals: JsonField<Individuals>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun paging(): Optional<Paging> = Optional.ofNullable(paging.getNullable("paging"))

                fun individuals(): Optional<Individuals> =
                    Optional.ofNullable(individuals.getNullable("individuals"))

                @JsonProperty("paging") @ExcludeMissing fun _paging() = paging

                @JsonProperty("individuals") @ExcludeMissing fun _individuals() = individuals

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): SupportedDirectoryFields = apply {
                    if (!validated) {
                        paging().map { it.validate() }
                        individuals().map { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var paging: JsonField<Paging> = JsonMissing.of()
                    private var individuals: JsonField<Individuals> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(supportedDirectoryFields: SupportedDirectoryFields) = apply {
                        this.paging = supportedDirectoryFields.paging
                        this.individuals = supportedDirectoryFields.individuals
                        additionalProperties(supportedDirectoryFields.additionalProperties)
                    }

                    fun paging(paging: Paging) = paging(JsonField.of(paging))

                    @JsonProperty("paging")
                    @ExcludeMissing
                    fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

                    fun individuals(individuals: Individuals) =
                        individuals(JsonField.of(individuals))

                    @JsonProperty("individuals")
                    @ExcludeMissing
                    fun individuals(individuals: JsonField<Individuals>) = apply {
                        this.individuals = individuals
                    }

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

                    fun build(): SupportedDirectoryFields =
                        SupportedDirectoryFields(
                            paging,
                            individuals,
                            additionalProperties.toImmutable(),
                        )
                }

                @JsonDeserialize(builder = Individuals.Builder::class)
                @NoAutoDetect
                class Individuals
                private constructor(
                    private val id: JsonField<Boolean>,
                    private val firstName: JsonField<Boolean>,
                    private val middleName: JsonField<Boolean>,
                    private val lastName: JsonField<Boolean>,
                    private val isActive: JsonField<Boolean>,
                    private val department: JsonField<Boolean>,
                    private val manager: JsonField<Manager>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun id(): Optional<Boolean> = Optional.ofNullable(id.getNullable("id"))

                    fun firstName(): Optional<Boolean> =
                        Optional.ofNullable(firstName.getNullable("first_name"))

                    fun middleName(): Optional<Boolean> =
                        Optional.ofNullable(middleName.getNullable("middle_name"))

                    fun lastName(): Optional<Boolean> =
                        Optional.ofNullable(lastName.getNullable("last_name"))

                    fun isActive(): Optional<Boolean> =
                        Optional.ofNullable(isActive.getNullable("is_active"))

                    fun department(): Optional<Boolean> =
                        Optional.ofNullable(department.getNullable("department"))

                    fun manager(): Optional<Manager> =
                        Optional.ofNullable(manager.getNullable("manager"))

                    @JsonProperty("id") @ExcludeMissing fun _id() = id

                    @JsonProperty("first_name") @ExcludeMissing fun _firstName() = firstName

                    @JsonProperty("middle_name") @ExcludeMissing fun _middleName() = middleName

                    @JsonProperty("last_name") @ExcludeMissing fun _lastName() = lastName

                    @JsonProperty("is_active") @ExcludeMissing fun _isActive() = isActive

                    @JsonProperty("department") @ExcludeMissing fun _department() = department

                    @JsonProperty("manager") @ExcludeMissing fun _manager() = manager

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Individuals = apply {
                        if (!validated) {
                            id()
                            firstName()
                            middleName()
                            lastName()
                            isActive()
                            department()
                            manager().map { it.validate() }
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var id: JsonField<Boolean> = JsonMissing.of()
                        private var firstName: JsonField<Boolean> = JsonMissing.of()
                        private var middleName: JsonField<Boolean> = JsonMissing.of()
                        private var lastName: JsonField<Boolean> = JsonMissing.of()
                        private var isActive: JsonField<Boolean> = JsonMissing.of()
                        private var department: JsonField<Boolean> = JsonMissing.of()
                        private var manager: JsonField<Manager> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(individuals: Individuals) = apply {
                            this.id = individuals.id
                            this.firstName = individuals.firstName
                            this.middleName = individuals.middleName
                            this.lastName = individuals.lastName
                            this.isActive = individuals.isActive
                            this.department = individuals.department
                            this.manager = individuals.manager
                            additionalProperties(individuals.additionalProperties)
                        }

                        fun id(id: Boolean) = id(JsonField.of(id))

                        @JsonProperty("id")
                        @ExcludeMissing
                        fun id(id: JsonField<Boolean>) = apply { this.id = id }

                        fun firstName(firstName: Boolean) = firstName(JsonField.of(firstName))

                        @JsonProperty("first_name")
                        @ExcludeMissing
                        fun firstName(firstName: JsonField<Boolean>) = apply {
                            this.firstName = firstName
                        }

                        fun middleName(middleName: Boolean) = middleName(JsonField.of(middleName))

                        @JsonProperty("middle_name")
                        @ExcludeMissing
                        fun middleName(middleName: JsonField<Boolean>) = apply {
                            this.middleName = middleName
                        }

                        fun lastName(lastName: Boolean) = lastName(JsonField.of(lastName))

                        @JsonProperty("last_name")
                        @ExcludeMissing
                        fun lastName(lastName: JsonField<Boolean>) = apply {
                            this.lastName = lastName
                        }

                        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

                        @JsonProperty("is_active")
                        @ExcludeMissing
                        fun isActive(isActive: JsonField<Boolean>) = apply {
                            this.isActive = isActive
                        }

                        fun department(department: Boolean) = department(JsonField.of(department))

                        @JsonProperty("department")
                        @ExcludeMissing
                        fun department(department: JsonField<Boolean>) = apply {
                            this.department = department
                        }

                        fun manager(manager: Manager) = manager(JsonField.of(manager))

                        @JsonProperty("manager")
                        @ExcludeMissing
                        fun manager(manager: JsonField<Manager>) = apply { this.manager = manager }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Individuals =
                            Individuals(
                                id,
                                firstName,
                                middleName,
                                lastName,
                                isActive,
                                department,
                                manager,
                                additionalProperties.toImmutable(),
                            )
                    }

                    @JsonDeserialize(builder = Manager.Builder::class)
                    @NoAutoDetect
                    class Manager
                    private constructor(
                        private val id: JsonField<Boolean>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        fun id(): Optional<Boolean> = Optional.ofNullable(id.getNullable("id"))

                        @JsonProperty("id") @ExcludeMissing fun _id() = id

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Manager = apply {
                            if (!validated) {
                                id()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var id: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(manager: Manager) = apply {
                                this.id = manager.id
                                additionalProperties(manager.additionalProperties)
                            }

                            fun id(id: Boolean) = id(JsonField.of(id))

                            @JsonProperty("id")
                            @ExcludeMissing
                            fun id(id: JsonField<Boolean>) = apply { this.id = id }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Manager = Manager(id, additionalProperties.toImmutable())
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Manager && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Manager{id=$id, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Individuals && id == other.id && firstName == other.firstName && middleName == other.middleName && lastName == other.lastName && isActive == other.isActive && department == other.department && manager == other.manager && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, firstName, middleName, lastName, isActive, department, manager, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Individuals{id=$id, firstName=$firstName, middleName=$middleName, lastName=$lastName, isActive=$isActive, department=$department, manager=$manager, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = Paging.Builder::class)
                @NoAutoDetect
                class Paging
                private constructor(
                    private val count: JsonField<Boolean>,
                    private val offset: JsonField<Boolean>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun count(): Optional<Boolean> = Optional.ofNullable(count.getNullable("count"))

                    fun offset(): Optional<Boolean> =
                        Optional.ofNullable(offset.getNullable("offset"))

                    @JsonProperty("count") @ExcludeMissing fun _count() = count

                    @JsonProperty("offset") @ExcludeMissing fun _offset() = offset

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Paging = apply {
                        if (!validated) {
                            count()
                            offset()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var count: JsonField<Boolean> = JsonMissing.of()
                        private var offset: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(paging: Paging) = apply {
                            this.count = paging.count
                            this.offset = paging.offset
                            additionalProperties(paging.additionalProperties)
                        }

                        fun count(count: Boolean) = count(JsonField.of(count))

                        @JsonProperty("count")
                        @ExcludeMissing
                        fun count(count: JsonField<Boolean>) = apply { this.count = count }

                        fun offset(offset: Boolean) = offset(JsonField.of(offset))

                        @JsonProperty("offset")
                        @ExcludeMissing
                        fun offset(offset: JsonField<Boolean>) = apply { this.offset = offset }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Paging =
                            Paging(
                                count,
                                offset,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Paging && count == other.count && offset == other.offset && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(count, offset, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Paging{count=$count, offset=$offset, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is SupportedDirectoryFields && paging == other.paging && individuals == other.individuals && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(paging, individuals, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SupportedDirectoryFields{paging=$paging, individuals=$individuals, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = SupportedEmploymentFields.Builder::class)
            @NoAutoDetect
            class SupportedEmploymentFields
            private constructor(
                private val id: JsonField<Boolean>,
                private val firstName: JsonField<Boolean>,
                private val middleName: JsonField<Boolean>,
                private val lastName: JsonField<Boolean>,
                private val title: JsonField<Boolean>,
                private val startDate: JsonField<Boolean>,
                private val endDate: JsonField<Boolean>,
                private val isActive: JsonField<Boolean>,
                private val employmentStatus: JsonField<Boolean>,
                private val incomeHistory: JsonField<Boolean>,
                private val classCode: JsonField<Boolean>,
                private val customFields: JsonField<Boolean>,
                private val department: JsonField<Department>,
                private val employment: JsonField<Employment>,
                private val income: JsonField<Income>,
                private val location: JsonField<Location>,
                private val manager: JsonField<Manager>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun id(): Optional<Boolean> = Optional.ofNullable(id.getNullable("id"))

                fun firstName(): Optional<Boolean> =
                    Optional.ofNullable(firstName.getNullable("first_name"))

                fun middleName(): Optional<Boolean> =
                    Optional.ofNullable(middleName.getNullable("middle_name"))

                fun lastName(): Optional<Boolean> =
                    Optional.ofNullable(lastName.getNullable("last_name"))

                fun title(): Optional<Boolean> = Optional.ofNullable(title.getNullable("title"))

                fun startDate(): Optional<Boolean> =
                    Optional.ofNullable(startDate.getNullable("start_date"))

                fun endDate(): Optional<Boolean> =
                    Optional.ofNullable(endDate.getNullable("end_date"))

                fun isActive(): Optional<Boolean> =
                    Optional.ofNullable(isActive.getNullable("is_active"))

                fun employmentStatus(): Optional<Boolean> =
                    Optional.ofNullable(employmentStatus.getNullable("employment_status"))

                fun incomeHistory(): Optional<Boolean> =
                    Optional.ofNullable(incomeHistory.getNullable("income_history"))

                fun classCode(): Optional<Boolean> =
                    Optional.ofNullable(classCode.getNullable("class_code"))

                fun customFields(): Optional<Boolean> =
                    Optional.ofNullable(customFields.getNullable("custom_fields"))

                fun department(): Optional<Department> =
                    Optional.ofNullable(department.getNullable("department"))

                fun employment(): Optional<Employment> =
                    Optional.ofNullable(employment.getNullable("employment"))

                fun income(): Optional<Income> = Optional.ofNullable(income.getNullable("income"))

                fun location(): Optional<Location> =
                    Optional.ofNullable(location.getNullable("location"))

                fun manager(): Optional<Manager> =
                    Optional.ofNullable(manager.getNullable("manager"))

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                @JsonProperty("first_name") @ExcludeMissing fun _firstName() = firstName

                @JsonProperty("middle_name") @ExcludeMissing fun _middleName() = middleName

                @JsonProperty("last_name") @ExcludeMissing fun _lastName() = lastName

                @JsonProperty("title") @ExcludeMissing fun _title() = title

                @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

                @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

                @JsonProperty("is_active") @ExcludeMissing fun _isActive() = isActive

                @JsonProperty("employment_status")
                @ExcludeMissing
                fun _employmentStatus() = employmentStatus

                @JsonProperty("income_history") @ExcludeMissing fun _incomeHistory() = incomeHistory

                @JsonProperty("class_code") @ExcludeMissing fun _classCode() = classCode

                @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

                @JsonProperty("department") @ExcludeMissing fun _department() = department

                @JsonProperty("employment") @ExcludeMissing fun _employment() = employment

                @JsonProperty("income") @ExcludeMissing fun _income() = income

                @JsonProperty("location") @ExcludeMissing fun _location() = location

                @JsonProperty("manager") @ExcludeMissing fun _manager() = manager

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): SupportedEmploymentFields = apply {
                    if (!validated) {
                        id()
                        firstName()
                        middleName()
                        lastName()
                        title()
                        startDate()
                        endDate()
                        isActive()
                        employmentStatus()
                        incomeHistory()
                        classCode()
                        customFields()
                        department().map { it.validate() }
                        employment().map { it.validate() }
                        income().map { it.validate() }
                        location().map { it.validate() }
                        manager().map { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<Boolean> = JsonMissing.of()
                    private var firstName: JsonField<Boolean> = JsonMissing.of()
                    private var middleName: JsonField<Boolean> = JsonMissing.of()
                    private var lastName: JsonField<Boolean> = JsonMissing.of()
                    private var title: JsonField<Boolean> = JsonMissing.of()
                    private var startDate: JsonField<Boolean> = JsonMissing.of()
                    private var endDate: JsonField<Boolean> = JsonMissing.of()
                    private var isActive: JsonField<Boolean> = JsonMissing.of()
                    private var employmentStatus: JsonField<Boolean> = JsonMissing.of()
                    private var incomeHistory: JsonField<Boolean> = JsonMissing.of()
                    private var classCode: JsonField<Boolean> = JsonMissing.of()
                    private var customFields: JsonField<Boolean> = JsonMissing.of()
                    private var department: JsonField<Department> = JsonMissing.of()
                    private var employment: JsonField<Employment> = JsonMissing.of()
                    private var income: JsonField<Income> = JsonMissing.of()
                    private var location: JsonField<Location> = JsonMissing.of()
                    private var manager: JsonField<Manager> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(supportedEmploymentFields: SupportedEmploymentFields) =
                        apply {
                            this.id = supportedEmploymentFields.id
                            this.firstName = supportedEmploymentFields.firstName
                            this.middleName = supportedEmploymentFields.middleName
                            this.lastName = supportedEmploymentFields.lastName
                            this.title = supportedEmploymentFields.title
                            this.startDate = supportedEmploymentFields.startDate
                            this.endDate = supportedEmploymentFields.endDate
                            this.isActive = supportedEmploymentFields.isActive
                            this.employmentStatus = supportedEmploymentFields.employmentStatus
                            this.incomeHistory = supportedEmploymentFields.incomeHistory
                            this.classCode = supportedEmploymentFields.classCode
                            this.customFields = supportedEmploymentFields.customFields
                            this.department = supportedEmploymentFields.department
                            this.employment = supportedEmploymentFields.employment
                            this.income = supportedEmploymentFields.income
                            this.location = supportedEmploymentFields.location
                            this.manager = supportedEmploymentFields.manager
                            additionalProperties(supportedEmploymentFields.additionalProperties)
                        }

                    fun id(id: Boolean) = id(JsonField.of(id))

                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<Boolean>) = apply { this.id = id }

                    fun firstName(firstName: Boolean) = firstName(JsonField.of(firstName))

                    @JsonProperty("first_name")
                    @ExcludeMissing
                    fun firstName(firstName: JsonField<Boolean>) = apply {
                        this.firstName = firstName
                    }

                    fun middleName(middleName: Boolean) = middleName(JsonField.of(middleName))

                    @JsonProperty("middle_name")
                    @ExcludeMissing
                    fun middleName(middleName: JsonField<Boolean>) = apply {
                        this.middleName = middleName
                    }

                    fun lastName(lastName: Boolean) = lastName(JsonField.of(lastName))

                    @JsonProperty("last_name")
                    @ExcludeMissing
                    fun lastName(lastName: JsonField<Boolean>) = apply { this.lastName = lastName }

                    fun title(title: Boolean) = title(JsonField.of(title))

                    @JsonProperty("title")
                    @ExcludeMissing
                    fun title(title: JsonField<Boolean>) = apply { this.title = title }

                    fun startDate(startDate: Boolean) = startDate(JsonField.of(startDate))

                    @JsonProperty("start_date")
                    @ExcludeMissing
                    fun startDate(startDate: JsonField<Boolean>) = apply {
                        this.startDate = startDate
                    }

                    fun endDate(endDate: Boolean) = endDate(JsonField.of(endDate))

                    @JsonProperty("end_date")
                    @ExcludeMissing
                    fun endDate(endDate: JsonField<Boolean>) = apply { this.endDate = endDate }

                    fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

                    @JsonProperty("is_active")
                    @ExcludeMissing
                    fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

                    fun employmentStatus(employmentStatus: Boolean) =
                        employmentStatus(JsonField.of(employmentStatus))

                    @JsonProperty("employment_status")
                    @ExcludeMissing
                    fun employmentStatus(employmentStatus: JsonField<Boolean>) = apply {
                        this.employmentStatus = employmentStatus
                    }

                    fun incomeHistory(incomeHistory: Boolean) =
                        incomeHistory(JsonField.of(incomeHistory))

                    @JsonProperty("income_history")
                    @ExcludeMissing
                    fun incomeHistory(incomeHistory: JsonField<Boolean>) = apply {
                        this.incomeHistory = incomeHistory
                    }

                    fun classCode(classCode: Boolean) = classCode(JsonField.of(classCode))

                    @JsonProperty("class_code")
                    @ExcludeMissing
                    fun classCode(classCode: JsonField<Boolean>) = apply {
                        this.classCode = classCode
                    }

                    fun customFields(customFields: Boolean) =
                        customFields(JsonField.of(customFields))

                    @JsonProperty("custom_fields")
                    @ExcludeMissing
                    fun customFields(customFields: JsonField<Boolean>) = apply {
                        this.customFields = customFields
                    }

                    fun department(department: Department) = department(JsonField.of(department))

                    @JsonProperty("department")
                    @ExcludeMissing
                    fun department(department: JsonField<Department>) = apply {
                        this.department = department
                    }

                    fun employment(employment: Employment) = employment(JsonField.of(employment))

                    @JsonProperty("employment")
                    @ExcludeMissing
                    fun employment(employment: JsonField<Employment>) = apply {
                        this.employment = employment
                    }

                    fun income(income: Income) = income(JsonField.of(income))

                    @JsonProperty("income")
                    @ExcludeMissing
                    fun income(income: JsonField<Income>) = apply { this.income = income }

                    fun location(location: Location) = location(JsonField.of(location))

                    @JsonProperty("location")
                    @ExcludeMissing
                    fun location(location: JsonField<Location>) = apply { this.location = location }

                    fun manager(manager: Manager) = manager(JsonField.of(manager))

                    @JsonProperty("manager")
                    @ExcludeMissing
                    fun manager(manager: JsonField<Manager>) = apply { this.manager = manager }

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

                    fun build(): SupportedEmploymentFields =
                        SupportedEmploymentFields(
                            id,
                            firstName,
                            middleName,
                            lastName,
                            title,
                            startDate,
                            endDate,
                            isActive,
                            employmentStatus,
                            incomeHistory,
                            classCode,
                            customFields,
                            department,
                            employment,
                            income,
                            location,
                            manager,
                            additionalProperties.toImmutable(),
                        )
                }

                @JsonDeserialize(builder = Department.Builder::class)
                @NoAutoDetect
                class Department
                private constructor(
                    private val name: JsonField<Boolean>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun name(): Optional<Boolean> = Optional.ofNullable(name.getNullable("name"))

                    @JsonProperty("name") @ExcludeMissing fun _name() = name

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Department = apply {
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

                        private var name: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(department: Department) = apply {
                            this.name = department.name
                            additionalProperties(department.additionalProperties)
                        }

                        fun name(name: Boolean) = name(JsonField.of(name))

                        @JsonProperty("name")
                        @ExcludeMissing
                        fun name(name: JsonField<Boolean>) = apply { this.name = name }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Department =
                            Department(name, additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Department && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Department{name=$name, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = Employment.Builder::class)
                @NoAutoDetect
                class Employment
                private constructor(
                    private val type: JsonField<Boolean>,
                    private val subtype: JsonField<Boolean>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun type(): Optional<Boolean> = Optional.ofNullable(type.getNullable("type"))

                    fun subtype(): Optional<Boolean> =
                        Optional.ofNullable(subtype.getNullable("subtype"))

                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    @JsonProperty("subtype") @ExcludeMissing fun _subtype() = subtype

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Employment = apply {
                        if (!validated) {
                            type()
                            subtype()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var type: JsonField<Boolean> = JsonMissing.of()
                        private var subtype: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(employment: Employment) = apply {
                            this.type = employment.type
                            this.subtype = employment.subtype
                            additionalProperties(employment.additionalProperties)
                        }

                        fun type(type: Boolean) = type(JsonField.of(type))

                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<Boolean>) = apply { this.type = type }

                        fun subtype(subtype: Boolean) = subtype(JsonField.of(subtype))

                        @JsonProperty("subtype")
                        @ExcludeMissing
                        fun subtype(subtype: JsonField<Boolean>) = apply { this.subtype = subtype }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Employment =
                            Employment(
                                type,
                                subtype,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Employment && type == other.type && subtype == other.subtype && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(type, subtype, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Employment{type=$type, subtype=$subtype, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = Income.Builder::class)
                @NoAutoDetect
                class Income
                private constructor(
                    private val amount: JsonField<Boolean>,
                    private val currency: JsonField<Boolean>,
                    private val unit: JsonField<Boolean>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun amount(): Optional<Boolean> =
                        Optional.ofNullable(amount.getNullable("amount"))

                    fun currency(): Optional<Boolean> =
                        Optional.ofNullable(currency.getNullable("currency"))

                    fun unit(): Optional<Boolean> = Optional.ofNullable(unit.getNullable("unit"))

                    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                    @JsonProperty("unit") @ExcludeMissing fun _unit() = unit

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Income = apply {
                        if (!validated) {
                            amount()
                            currency()
                            unit()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var amount: JsonField<Boolean> = JsonMissing.of()
                        private var currency: JsonField<Boolean> = JsonMissing.of()
                        private var unit: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(income: Income) = apply {
                            this.amount = income.amount
                            this.currency = income.currency
                            this.unit = income.unit
                            additionalProperties(income.additionalProperties)
                        }

                        fun amount(amount: Boolean) = amount(JsonField.of(amount))

                        @JsonProperty("amount")
                        @ExcludeMissing
                        fun amount(amount: JsonField<Boolean>) = apply { this.amount = amount }

                        fun currency(currency: Boolean) = currency(JsonField.of(currency))

                        @JsonProperty("currency")
                        @ExcludeMissing
                        fun currency(currency: JsonField<Boolean>) = apply {
                            this.currency = currency
                        }

                        fun unit(unit: Boolean) = unit(JsonField.of(unit))

                        @JsonProperty("unit")
                        @ExcludeMissing
                        fun unit(unit: JsonField<Boolean>) = apply { this.unit = unit }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Income =
                            Income(
                                amount,
                                currency,
                                unit,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Income && amount == other.amount && currency == other.currency && unit == other.unit && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(amount, currency, unit, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Income{amount=$amount, currency=$currency, unit=$unit, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = Location.Builder::class)
                @NoAutoDetect
                class Location
                private constructor(
                    private val line1: JsonField<Boolean>,
                    private val line2: JsonField<Boolean>,
                    private val city: JsonField<Boolean>,
                    private val state: JsonField<Boolean>,
                    private val postalCode: JsonField<Boolean>,
                    private val country: JsonField<Boolean>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun line1(): Optional<Boolean> = Optional.ofNullable(line1.getNullable("line1"))

                    fun line2(): Optional<Boolean> = Optional.ofNullable(line2.getNullable("line2"))

                    fun city(): Optional<Boolean> = Optional.ofNullable(city.getNullable("city"))

                    fun state(): Optional<Boolean> = Optional.ofNullable(state.getNullable("state"))

                    fun postalCode(): Optional<Boolean> =
                        Optional.ofNullable(postalCode.getNullable("postal_code"))

                    fun country(): Optional<Boolean> =
                        Optional.ofNullable(country.getNullable("country"))

                    @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

                    @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

                    @JsonProperty("city") @ExcludeMissing fun _city() = city

                    @JsonProperty("state") @ExcludeMissing fun _state() = state

                    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

                    @JsonProperty("country") @ExcludeMissing fun _country() = country

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Location = apply {
                        if (!validated) {
                            line1()
                            line2()
                            city()
                            state()
                            postalCode()
                            country()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var line1: JsonField<Boolean> = JsonMissing.of()
                        private var line2: JsonField<Boolean> = JsonMissing.of()
                        private var city: JsonField<Boolean> = JsonMissing.of()
                        private var state: JsonField<Boolean> = JsonMissing.of()
                        private var postalCode: JsonField<Boolean> = JsonMissing.of()
                        private var country: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(location: Location) = apply {
                            this.line1 = location.line1
                            this.line2 = location.line2
                            this.city = location.city
                            this.state = location.state
                            this.postalCode = location.postalCode
                            this.country = location.country
                            additionalProperties(location.additionalProperties)
                        }

                        fun line1(line1: Boolean) = line1(JsonField.of(line1))

                        @JsonProperty("line1")
                        @ExcludeMissing
                        fun line1(line1: JsonField<Boolean>) = apply { this.line1 = line1 }

                        fun line2(line2: Boolean) = line2(JsonField.of(line2))

                        @JsonProperty("line2")
                        @ExcludeMissing
                        fun line2(line2: JsonField<Boolean>) = apply { this.line2 = line2 }

                        fun city(city: Boolean) = city(JsonField.of(city))

                        @JsonProperty("city")
                        @ExcludeMissing
                        fun city(city: JsonField<Boolean>) = apply { this.city = city }

                        fun state(state: Boolean) = state(JsonField.of(state))

                        @JsonProperty("state")
                        @ExcludeMissing
                        fun state(state: JsonField<Boolean>) = apply { this.state = state }

                        fun postalCode(postalCode: Boolean) = postalCode(JsonField.of(postalCode))

                        @JsonProperty("postal_code")
                        @ExcludeMissing
                        fun postalCode(postalCode: JsonField<Boolean>) = apply {
                            this.postalCode = postalCode
                        }

                        fun country(country: Boolean) = country(JsonField.of(country))

                        @JsonProperty("country")
                        @ExcludeMissing
                        fun country(country: JsonField<Boolean>) = apply { this.country = country }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Location =
                            Location(
                                line1,
                                line2,
                                city,
                                state,
                                postalCode,
                                country,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Location && line1 == other.line1 && line2 == other.line2 && city == other.city && state == other.state && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(line1, line2, city, state, postalCode, country, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Location{line1=$line1, line2=$line2, city=$city, state=$state, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = Manager.Builder::class)
                @NoAutoDetect
                class Manager
                private constructor(
                    private val id: JsonField<Boolean>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun id(): Optional<Boolean> = Optional.ofNullable(id.getNullable("id"))

                    @JsonProperty("id") @ExcludeMissing fun _id() = id

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Manager = apply {
                        if (!validated) {
                            id()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var id: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(manager: Manager) = apply {
                            this.id = manager.id
                            additionalProperties(manager.additionalProperties)
                        }

                        fun id(id: Boolean) = id(JsonField.of(id))

                        @JsonProperty("id")
                        @ExcludeMissing
                        fun id(id: JsonField<Boolean>) = apply { this.id = id }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Manager = Manager(id, additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Manager && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Manager{id=$id, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is SupportedEmploymentFields && id == other.id && firstName == other.firstName && middleName == other.middleName && lastName == other.lastName && title == other.title && startDate == other.startDate && endDate == other.endDate && isActive == other.isActive && employmentStatus == other.employmentStatus && incomeHistory == other.incomeHistory && classCode == other.classCode && customFields == other.customFields && department == other.department && employment == other.employment && income == other.income && location == other.location && manager == other.manager && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, firstName, middleName, lastName, title, startDate, endDate, isActive, employmentStatus, incomeHistory, classCode, customFields, department, employment, income, location, manager, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SupportedEmploymentFields{id=$id, firstName=$firstName, middleName=$middleName, lastName=$lastName, title=$title, startDate=$startDate, endDate=$endDate, isActive=$isActive, employmentStatus=$employmentStatus, incomeHistory=$incomeHistory, classCode=$classCode, customFields=$customFields, department=$department, employment=$employment, income=$income, location=$location, manager=$manager, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = SupportedIndividualFields.Builder::class)
            @NoAutoDetect
            class SupportedIndividualFields
            private constructor(
                private val id: JsonField<Boolean>,
                private val firstName: JsonField<Boolean>,
                private val middleName: JsonField<Boolean>,
                private val lastName: JsonField<Boolean>,
                private val preferredName: JsonField<Boolean>,
                private val dob: JsonField<Boolean>,
                private val gender: JsonField<Boolean>,
                private val ethnicity: JsonField<Boolean>,
                private val ssn: JsonField<Boolean>,
                private val encryptedSsn: JsonField<Boolean>,
                private val emails: JsonField<Emails>,
                private val phoneNumbers: JsonField<PhoneNumbers>,
                private val residence: JsonField<Residence>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun id(): Optional<Boolean> = Optional.ofNullable(id.getNullable("id"))

                fun firstName(): Optional<Boolean> =
                    Optional.ofNullable(firstName.getNullable("first_name"))

                fun middleName(): Optional<Boolean> =
                    Optional.ofNullable(middleName.getNullable("middle_name"))

                fun lastName(): Optional<Boolean> =
                    Optional.ofNullable(lastName.getNullable("last_name"))

                fun preferredName(): Optional<Boolean> =
                    Optional.ofNullable(preferredName.getNullable("preferred_name"))

                fun dob(): Optional<Boolean> = Optional.ofNullable(dob.getNullable("dob"))

                fun gender(): Optional<Boolean> = Optional.ofNullable(gender.getNullable("gender"))

                fun ethnicity(): Optional<Boolean> =
                    Optional.ofNullable(ethnicity.getNullable("ethnicity"))

                fun ssn(): Optional<Boolean> = Optional.ofNullable(ssn.getNullable("ssn"))

                fun encryptedSsn(): Optional<Boolean> =
                    Optional.ofNullable(encryptedSsn.getNullable("encrypted_ssn"))

                fun emails(): Optional<Emails> = Optional.ofNullable(emails.getNullable("emails"))

                fun phoneNumbers(): Optional<PhoneNumbers> =
                    Optional.ofNullable(phoneNumbers.getNullable("phone_numbers"))

                fun residence(): Optional<Residence> =
                    Optional.ofNullable(residence.getNullable("residence"))

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                @JsonProperty("first_name") @ExcludeMissing fun _firstName() = firstName

                @JsonProperty("middle_name") @ExcludeMissing fun _middleName() = middleName

                @JsonProperty("last_name") @ExcludeMissing fun _lastName() = lastName

                @JsonProperty("preferred_name") @ExcludeMissing fun _preferredName() = preferredName

                @JsonProperty("dob") @ExcludeMissing fun _dob() = dob

                @JsonProperty("gender") @ExcludeMissing fun _gender() = gender

                @JsonProperty("ethnicity") @ExcludeMissing fun _ethnicity() = ethnicity

                @JsonProperty("ssn") @ExcludeMissing fun _ssn() = ssn

                @JsonProperty("encrypted_ssn") @ExcludeMissing fun _encryptedSsn() = encryptedSsn

                @JsonProperty("emails") @ExcludeMissing fun _emails() = emails

                @JsonProperty("phone_numbers") @ExcludeMissing fun _phoneNumbers() = phoneNumbers

                @JsonProperty("residence") @ExcludeMissing fun _residence() = residence

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): SupportedIndividualFields = apply {
                    if (!validated) {
                        id()
                        firstName()
                        middleName()
                        lastName()
                        preferredName()
                        dob()
                        gender()
                        ethnicity()
                        ssn()
                        encryptedSsn()
                        emails().map { it.validate() }
                        phoneNumbers().map { it.validate() }
                        residence().map { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<Boolean> = JsonMissing.of()
                    private var firstName: JsonField<Boolean> = JsonMissing.of()
                    private var middleName: JsonField<Boolean> = JsonMissing.of()
                    private var lastName: JsonField<Boolean> = JsonMissing.of()
                    private var preferredName: JsonField<Boolean> = JsonMissing.of()
                    private var dob: JsonField<Boolean> = JsonMissing.of()
                    private var gender: JsonField<Boolean> = JsonMissing.of()
                    private var ethnicity: JsonField<Boolean> = JsonMissing.of()
                    private var ssn: JsonField<Boolean> = JsonMissing.of()
                    private var encryptedSsn: JsonField<Boolean> = JsonMissing.of()
                    private var emails: JsonField<Emails> = JsonMissing.of()
                    private var phoneNumbers: JsonField<PhoneNumbers> = JsonMissing.of()
                    private var residence: JsonField<Residence> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(supportedIndividualFields: SupportedIndividualFields) =
                        apply {
                            this.id = supportedIndividualFields.id
                            this.firstName = supportedIndividualFields.firstName
                            this.middleName = supportedIndividualFields.middleName
                            this.lastName = supportedIndividualFields.lastName
                            this.preferredName = supportedIndividualFields.preferredName
                            this.dob = supportedIndividualFields.dob
                            this.gender = supportedIndividualFields.gender
                            this.ethnicity = supportedIndividualFields.ethnicity
                            this.ssn = supportedIndividualFields.ssn
                            this.encryptedSsn = supportedIndividualFields.encryptedSsn
                            this.emails = supportedIndividualFields.emails
                            this.phoneNumbers = supportedIndividualFields.phoneNumbers
                            this.residence = supportedIndividualFields.residence
                            additionalProperties(supportedIndividualFields.additionalProperties)
                        }

                    fun id(id: Boolean) = id(JsonField.of(id))

                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<Boolean>) = apply { this.id = id }

                    fun firstName(firstName: Boolean) = firstName(JsonField.of(firstName))

                    @JsonProperty("first_name")
                    @ExcludeMissing
                    fun firstName(firstName: JsonField<Boolean>) = apply {
                        this.firstName = firstName
                    }

                    fun middleName(middleName: Boolean) = middleName(JsonField.of(middleName))

                    @JsonProperty("middle_name")
                    @ExcludeMissing
                    fun middleName(middleName: JsonField<Boolean>) = apply {
                        this.middleName = middleName
                    }

                    fun lastName(lastName: Boolean) = lastName(JsonField.of(lastName))

                    @JsonProperty("last_name")
                    @ExcludeMissing
                    fun lastName(lastName: JsonField<Boolean>) = apply { this.lastName = lastName }

                    fun preferredName(preferredName: Boolean) =
                        preferredName(JsonField.of(preferredName))

                    @JsonProperty("preferred_name")
                    @ExcludeMissing
                    fun preferredName(preferredName: JsonField<Boolean>) = apply {
                        this.preferredName = preferredName
                    }

                    fun dob(dob: Boolean) = dob(JsonField.of(dob))

                    @JsonProperty("dob")
                    @ExcludeMissing
                    fun dob(dob: JsonField<Boolean>) = apply { this.dob = dob }

                    fun gender(gender: Boolean) = gender(JsonField.of(gender))

                    @JsonProperty("gender")
                    @ExcludeMissing
                    fun gender(gender: JsonField<Boolean>) = apply { this.gender = gender }

                    fun ethnicity(ethnicity: Boolean) = ethnicity(JsonField.of(ethnicity))

                    @JsonProperty("ethnicity")
                    @ExcludeMissing
                    fun ethnicity(ethnicity: JsonField<Boolean>) = apply {
                        this.ethnicity = ethnicity
                    }

                    fun ssn(ssn: Boolean) = ssn(JsonField.of(ssn))

                    @JsonProperty("ssn")
                    @ExcludeMissing
                    fun ssn(ssn: JsonField<Boolean>) = apply { this.ssn = ssn }

                    fun encryptedSsn(encryptedSsn: Boolean) =
                        encryptedSsn(JsonField.of(encryptedSsn))

                    @JsonProperty("encrypted_ssn")
                    @ExcludeMissing
                    fun encryptedSsn(encryptedSsn: JsonField<Boolean>) = apply {
                        this.encryptedSsn = encryptedSsn
                    }

                    fun emails(emails: Emails) = emails(JsonField.of(emails))

                    @JsonProperty("emails")
                    @ExcludeMissing
                    fun emails(emails: JsonField<Emails>) = apply { this.emails = emails }

                    fun phoneNumbers(phoneNumbers: PhoneNumbers) =
                        phoneNumbers(JsonField.of(phoneNumbers))

                    @JsonProperty("phone_numbers")
                    @ExcludeMissing
                    fun phoneNumbers(phoneNumbers: JsonField<PhoneNumbers>) = apply {
                        this.phoneNumbers = phoneNumbers
                    }

                    fun residence(residence: Residence) = residence(JsonField.of(residence))

                    @JsonProperty("residence")
                    @ExcludeMissing
                    fun residence(residence: JsonField<Residence>) = apply {
                        this.residence = residence
                    }

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

                    fun build(): SupportedIndividualFields =
                        SupportedIndividualFields(
                            id,
                            firstName,
                            middleName,
                            lastName,
                            preferredName,
                            dob,
                            gender,
                            ethnicity,
                            ssn,
                            encryptedSsn,
                            emails,
                            phoneNumbers,
                            residence,
                            additionalProperties.toImmutable(),
                        )
                }

                @JsonDeserialize(builder = Emails.Builder::class)
                @NoAutoDetect
                class Emails
                private constructor(
                    private val data: JsonField<Boolean>,
                    private val type: JsonField<Boolean>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun data(): Optional<Boolean> = Optional.ofNullable(data.getNullable("data"))

                    fun type(): Optional<Boolean> = Optional.ofNullable(type.getNullable("type"))

                    @JsonProperty("data") @ExcludeMissing fun _data() = data

                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Emails = apply {
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

                        private var data: JsonField<Boolean> = JsonMissing.of()
                        private var type: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(emails: Emails) = apply {
                            this.data = emails.data
                            this.type = emails.type
                            additionalProperties(emails.additionalProperties)
                        }

                        fun data(data: Boolean) = data(JsonField.of(data))

                        @JsonProperty("data")
                        @ExcludeMissing
                        fun data(data: JsonField<Boolean>) = apply { this.data = data }

                        fun type(type: Boolean) = type(JsonField.of(type))

                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<Boolean>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Emails =
                            Emails(
                                data,
                                type,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Emails && data == other.data && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(data, type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Emails{data=$data, type=$type, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = PhoneNumbers.Builder::class)
                @NoAutoDetect
                class PhoneNumbers
                private constructor(
                    private val data: JsonField<Boolean>,
                    private val type: JsonField<Boolean>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun data(): Optional<Boolean> = Optional.ofNullable(data.getNullable("data"))

                    fun type(): Optional<Boolean> = Optional.ofNullable(type.getNullable("type"))

                    @JsonProperty("data") @ExcludeMissing fun _data() = data

                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): PhoneNumbers = apply {
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

                        private var data: JsonField<Boolean> = JsonMissing.of()
                        private var type: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(phoneNumbers: PhoneNumbers) = apply {
                            this.data = phoneNumbers.data
                            this.type = phoneNumbers.type
                            additionalProperties(phoneNumbers.additionalProperties)
                        }

                        fun data(data: Boolean) = data(JsonField.of(data))

                        @JsonProperty("data")
                        @ExcludeMissing
                        fun data(data: JsonField<Boolean>) = apply { this.data = data }

                        fun type(type: Boolean) = type(JsonField.of(type))

                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<Boolean>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): PhoneNumbers =
                            PhoneNumbers(
                                data,
                                type,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is PhoneNumbers && data == other.data && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(data, type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "PhoneNumbers{data=$data, type=$type, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = Residence.Builder::class)
                @NoAutoDetect
                class Residence
                private constructor(
                    private val city: JsonField<Boolean>,
                    private val country: JsonField<Boolean>,
                    private val line1: JsonField<Boolean>,
                    private val line2: JsonField<Boolean>,
                    private val postalCode: JsonField<Boolean>,
                    private val state: JsonField<Boolean>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun city(): Optional<Boolean> = Optional.ofNullable(city.getNullable("city"))

                    fun country(): Optional<Boolean> =
                        Optional.ofNullable(country.getNullable("country"))

                    fun line1(): Optional<Boolean> = Optional.ofNullable(line1.getNullable("line1"))

                    fun line2(): Optional<Boolean> = Optional.ofNullable(line2.getNullable("line2"))

                    fun postalCode(): Optional<Boolean> =
                        Optional.ofNullable(postalCode.getNullable("postal_code"))

                    fun state(): Optional<Boolean> = Optional.ofNullable(state.getNullable("state"))

                    @JsonProperty("city") @ExcludeMissing fun _city() = city

                    @JsonProperty("country") @ExcludeMissing fun _country() = country

                    @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

                    @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

                    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

                    @JsonProperty("state") @ExcludeMissing fun _state() = state

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Residence = apply {
                        if (!validated) {
                            city()
                            country()
                            line1()
                            line2()
                            postalCode()
                            state()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var city: JsonField<Boolean> = JsonMissing.of()
                        private var country: JsonField<Boolean> = JsonMissing.of()
                        private var line1: JsonField<Boolean> = JsonMissing.of()
                        private var line2: JsonField<Boolean> = JsonMissing.of()
                        private var postalCode: JsonField<Boolean> = JsonMissing.of()
                        private var state: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(residence: Residence) = apply {
                            this.city = residence.city
                            this.country = residence.country
                            this.line1 = residence.line1
                            this.line2 = residence.line2
                            this.postalCode = residence.postalCode
                            this.state = residence.state
                            additionalProperties(residence.additionalProperties)
                        }

                        fun city(city: Boolean) = city(JsonField.of(city))

                        @JsonProperty("city")
                        @ExcludeMissing
                        fun city(city: JsonField<Boolean>) = apply { this.city = city }

                        fun country(country: Boolean) = country(JsonField.of(country))

                        @JsonProperty("country")
                        @ExcludeMissing
                        fun country(country: JsonField<Boolean>) = apply { this.country = country }

                        fun line1(line1: Boolean) = line1(JsonField.of(line1))

                        @JsonProperty("line1")
                        @ExcludeMissing
                        fun line1(line1: JsonField<Boolean>) = apply { this.line1 = line1 }

                        fun line2(line2: Boolean) = line2(JsonField.of(line2))

                        @JsonProperty("line2")
                        @ExcludeMissing
                        fun line2(line2: JsonField<Boolean>) = apply { this.line2 = line2 }

                        fun postalCode(postalCode: Boolean) = postalCode(JsonField.of(postalCode))

                        @JsonProperty("postal_code")
                        @ExcludeMissing
                        fun postalCode(postalCode: JsonField<Boolean>) = apply {
                            this.postalCode = postalCode
                        }

                        fun state(state: Boolean) = state(JsonField.of(state))

                        @JsonProperty("state")
                        @ExcludeMissing
                        fun state(state: JsonField<Boolean>) = apply { this.state = state }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Residence =
                            Residence(
                                city,
                                country,
                                line1,
                                line2,
                                postalCode,
                                state,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Residence && city == other.city && country == other.country && line1 == other.line1 && line2 == other.line2 && postalCode == other.postalCode && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(city, country, line1, line2, postalCode, state, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Residence{city=$city, country=$country, line1=$line1, line2=$line2, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is SupportedIndividualFields && id == other.id && firstName == other.firstName && middleName == other.middleName && lastName == other.lastName && preferredName == other.preferredName && dob == other.dob && gender == other.gender && ethnicity == other.ethnicity && ssn == other.ssn && encryptedSsn == other.encryptedSsn && emails == other.emails && phoneNumbers == other.phoneNumbers && residence == other.residence && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, firstName, middleName, lastName, preferredName, dob, gender, ethnicity, ssn, encryptedSsn, emails, phoneNumbers, residence, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SupportedIndividualFields{id=$id, firstName=$firstName, middleName=$middleName, lastName=$lastName, preferredName=$preferredName, dob=$dob, gender=$gender, ethnicity=$ethnicity, ssn=$ssn, encryptedSsn=$encryptedSsn, emails=$emails, phoneNumbers=$phoneNumbers, residence=$residence, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = SupportedPayGroupFields.Builder::class)
            @NoAutoDetect
            class SupportedPayGroupFields
            private constructor(
                private val id: JsonField<Boolean>,
                private val name: JsonField<Boolean>,
                private val payFrequencies: JsonField<Boolean>,
                private val individualIds: JsonField<Boolean>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun id(): Optional<Boolean> = Optional.ofNullable(id.getNullable("id"))

                fun name(): Optional<Boolean> = Optional.ofNullable(name.getNullable("name"))

                fun payFrequencies(): Optional<Boolean> =
                    Optional.ofNullable(payFrequencies.getNullable("pay_frequencies"))

                fun individualIds(): Optional<Boolean> =
                    Optional.ofNullable(individualIds.getNullable("individual_ids"))

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonProperty("pay_frequencies")
                @ExcludeMissing
                fun _payFrequencies() = payFrequencies

                @JsonProperty("individual_ids") @ExcludeMissing fun _individualIds() = individualIds

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): SupportedPayGroupFields = apply {
                    if (!validated) {
                        id()
                        name()
                        payFrequencies()
                        individualIds()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<Boolean> = JsonMissing.of()
                    private var name: JsonField<Boolean> = JsonMissing.of()
                    private var payFrequencies: JsonField<Boolean> = JsonMissing.of()
                    private var individualIds: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(supportedPayGroupFields: SupportedPayGroupFields) = apply {
                        this.id = supportedPayGroupFields.id
                        this.name = supportedPayGroupFields.name
                        this.payFrequencies = supportedPayGroupFields.payFrequencies
                        this.individualIds = supportedPayGroupFields.individualIds
                        additionalProperties(supportedPayGroupFields.additionalProperties)
                    }

                    fun id(id: Boolean) = id(JsonField.of(id))

                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<Boolean>) = apply { this.id = id }

                    fun name(name: Boolean) = name(JsonField.of(name))

                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<Boolean>) = apply { this.name = name }

                    fun payFrequencies(payFrequencies: Boolean) =
                        payFrequencies(JsonField.of(payFrequencies))

                    @JsonProperty("pay_frequencies")
                    @ExcludeMissing
                    fun payFrequencies(payFrequencies: JsonField<Boolean>) = apply {
                        this.payFrequencies = payFrequencies
                    }

                    fun individualIds(individualIds: Boolean) =
                        individualIds(JsonField.of(individualIds))

                    @JsonProperty("individual_ids")
                    @ExcludeMissing
                    fun individualIds(individualIds: JsonField<Boolean>) = apply {
                        this.individualIds = individualIds
                    }

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

                    fun build(): SupportedPayGroupFields =
                        SupportedPayGroupFields(
                            id,
                            name,
                            payFrequencies,
                            individualIds,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is SupportedPayGroupFields && id == other.id && name == other.name && payFrequencies == other.payFrequencies && individualIds == other.individualIds && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, name, payFrequencies, individualIds, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SupportedPayGroupFields{id=$id, name=$name, payFrequencies=$payFrequencies, individualIds=$individualIds, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = SupportedPayStatementFields.Builder::class)
            @NoAutoDetect
            class SupportedPayStatementFields
            private constructor(
                private val paging: JsonField<Paging>,
                private val payStatements: JsonField<PayStatements>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun paging(): Optional<Paging> = Optional.ofNullable(paging.getNullable("paging"))

                fun payStatements(): Optional<PayStatements> =
                    Optional.ofNullable(payStatements.getNullable("pay_statements"))

                @JsonProperty("paging") @ExcludeMissing fun _paging() = paging

                @JsonProperty("pay_statements") @ExcludeMissing fun _payStatements() = payStatements

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): SupportedPayStatementFields = apply {
                    if (!validated) {
                        paging().map { it.validate() }
                        payStatements().map { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var paging: JsonField<Paging> = JsonMissing.of()
                    private var payStatements: JsonField<PayStatements> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(supportedPayStatementFields: SupportedPayStatementFields) =
                        apply {
                            this.paging = supportedPayStatementFields.paging
                            this.payStatements = supportedPayStatementFields.payStatements
                            additionalProperties(supportedPayStatementFields.additionalProperties)
                        }

                    fun paging(paging: Paging) = paging(JsonField.of(paging))

                    @JsonProperty("paging")
                    @ExcludeMissing
                    fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

                    fun payStatements(payStatements: PayStatements) =
                        payStatements(JsonField.of(payStatements))

                    @JsonProperty("pay_statements")
                    @ExcludeMissing
                    fun payStatements(payStatements: JsonField<PayStatements>) = apply {
                        this.payStatements = payStatements
                    }

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

                    fun build(): SupportedPayStatementFields =
                        SupportedPayStatementFields(
                            paging,
                            payStatements,
                            additionalProperties.toImmutable(),
                        )
                }

                @JsonDeserialize(builder = Paging.Builder::class)
                @NoAutoDetect
                class Paging
                private constructor(
                    private val count: JsonField<Boolean>,
                    private val offset: JsonField<Boolean>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun count(): Boolean = count.getRequired("count")

                    fun offset(): Boolean = offset.getRequired("offset")

                    @JsonProperty("count") @ExcludeMissing fun _count() = count

                    @JsonProperty("offset") @ExcludeMissing fun _offset() = offset

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Paging = apply {
                        if (!validated) {
                            count()
                            offset()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var count: JsonField<Boolean> = JsonMissing.of()
                        private var offset: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(paging: Paging) = apply {
                            this.count = paging.count
                            this.offset = paging.offset
                            additionalProperties(paging.additionalProperties)
                        }

                        fun count(count: Boolean) = count(JsonField.of(count))

                        @JsonProperty("count")
                        @ExcludeMissing
                        fun count(count: JsonField<Boolean>) = apply { this.count = count }

                        fun offset(offset: Boolean) = offset(JsonField.of(offset))

                        @JsonProperty("offset")
                        @ExcludeMissing
                        fun offset(offset: JsonField<Boolean>) = apply { this.offset = offset }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Paging =
                            Paging(
                                count,
                                offset,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Paging && count == other.count && offset == other.offset && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(count, offset, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Paging{count=$count, offset=$offset, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = PayStatements.Builder::class)
                @NoAutoDetect
                class PayStatements
                private constructor(
                    private val individualId: JsonField<Boolean>,
                    private val type: JsonField<Boolean>,
                    private val paymentMethod: JsonField<Boolean>,
                    private val totalHours: JsonField<Boolean>,
                    private val grossPay: JsonField<Boolean>,
                    private val netPay: JsonField<Boolean>,
                    private val earnings: JsonField<Earnings>,
                    private val employeeDeductions: JsonField<EmployeeDeductions>,
                    private val employerContributions: JsonField<EmployerContributions>,
                    private val taxes: JsonField<Taxes>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun individualId(): Optional<Boolean> =
                        Optional.ofNullable(individualId.getNullable("individual_id"))

                    fun type(): Optional<Boolean> = Optional.ofNullable(type.getNullable("type"))

                    fun paymentMethod(): Optional<Boolean> =
                        Optional.ofNullable(paymentMethod.getNullable("payment_method"))

                    fun totalHours(): Optional<Boolean> =
                        Optional.ofNullable(totalHours.getNullable("total_hours"))

                    fun grossPay(): Optional<Boolean> =
                        Optional.ofNullable(grossPay.getNullable("gross_pay"))

                    fun netPay(): Optional<Boolean> =
                        Optional.ofNullable(netPay.getNullable("net_pay"))

                    fun earnings(): Optional<Earnings> =
                        Optional.ofNullable(earnings.getNullable("earnings"))

                    fun employeeDeductions(): Optional<EmployeeDeductions> =
                        Optional.ofNullable(employeeDeductions.getNullable("employee_deductions"))

                    fun employerContributions(): Optional<EmployerContributions> =
                        Optional.ofNullable(
                            employerContributions.getNullable("employer_contributions")
                        )

                    fun taxes(): Optional<Taxes> = Optional.ofNullable(taxes.getNullable("taxes"))

                    @JsonProperty("individual_id")
                    @ExcludeMissing
                    fun _individualId() = individualId

                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    @JsonProperty("payment_method")
                    @ExcludeMissing
                    fun _paymentMethod() = paymentMethod

                    @JsonProperty("total_hours") @ExcludeMissing fun _totalHours() = totalHours

                    @JsonProperty("gross_pay") @ExcludeMissing fun _grossPay() = grossPay

                    @JsonProperty("net_pay") @ExcludeMissing fun _netPay() = netPay

                    @JsonProperty("earnings") @ExcludeMissing fun _earnings() = earnings

                    @JsonProperty("employee_deductions")
                    @ExcludeMissing
                    fun _employeeDeductions() = employeeDeductions

                    @JsonProperty("employer_contributions")
                    @ExcludeMissing
                    fun _employerContributions() = employerContributions

                    @JsonProperty("taxes") @ExcludeMissing fun _taxes() = taxes

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): PayStatements = apply {
                        if (!validated) {
                            individualId()
                            type()
                            paymentMethod()
                            totalHours()
                            grossPay()
                            netPay()
                            earnings().map { it.validate() }
                            employeeDeductions().map { it.validate() }
                            employerContributions().map { it.validate() }
                            taxes().map { it.validate() }
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var individualId: JsonField<Boolean> = JsonMissing.of()
                        private var type: JsonField<Boolean> = JsonMissing.of()
                        private var paymentMethod: JsonField<Boolean> = JsonMissing.of()
                        private var totalHours: JsonField<Boolean> = JsonMissing.of()
                        private var grossPay: JsonField<Boolean> = JsonMissing.of()
                        private var netPay: JsonField<Boolean> = JsonMissing.of()
                        private var earnings: JsonField<Earnings> = JsonMissing.of()
                        private var employeeDeductions: JsonField<EmployeeDeductions> =
                            JsonMissing.of()
                        private var employerContributions: JsonField<EmployerContributions> =
                            JsonMissing.of()
                        private var taxes: JsonField<Taxes> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(payStatements: PayStatements) = apply {
                            this.individualId = payStatements.individualId
                            this.type = payStatements.type
                            this.paymentMethod = payStatements.paymentMethod
                            this.totalHours = payStatements.totalHours
                            this.grossPay = payStatements.grossPay
                            this.netPay = payStatements.netPay
                            this.earnings = payStatements.earnings
                            this.employeeDeductions = payStatements.employeeDeductions
                            this.employerContributions = payStatements.employerContributions
                            this.taxes = payStatements.taxes
                            additionalProperties(payStatements.additionalProperties)
                        }

                        fun individualId(individualId: Boolean) =
                            individualId(JsonField.of(individualId))

                        @JsonProperty("individual_id")
                        @ExcludeMissing
                        fun individualId(individualId: JsonField<Boolean>) = apply {
                            this.individualId = individualId
                        }

                        fun type(type: Boolean) = type(JsonField.of(type))

                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<Boolean>) = apply { this.type = type }

                        fun paymentMethod(paymentMethod: Boolean) =
                            paymentMethod(JsonField.of(paymentMethod))

                        @JsonProperty("payment_method")
                        @ExcludeMissing
                        fun paymentMethod(paymentMethod: JsonField<Boolean>) = apply {
                            this.paymentMethod = paymentMethod
                        }

                        fun totalHours(totalHours: Boolean) = totalHours(JsonField.of(totalHours))

                        @JsonProperty("total_hours")
                        @ExcludeMissing
                        fun totalHours(totalHours: JsonField<Boolean>) = apply {
                            this.totalHours = totalHours
                        }

                        fun grossPay(grossPay: Boolean) = grossPay(JsonField.of(grossPay))

                        @JsonProperty("gross_pay")
                        @ExcludeMissing
                        fun grossPay(grossPay: JsonField<Boolean>) = apply {
                            this.grossPay = grossPay
                        }

                        fun netPay(netPay: Boolean) = netPay(JsonField.of(netPay))

                        @JsonProperty("net_pay")
                        @ExcludeMissing
                        fun netPay(netPay: JsonField<Boolean>) = apply { this.netPay = netPay }

                        fun earnings(earnings: Earnings) = earnings(JsonField.of(earnings))

                        @JsonProperty("earnings")
                        @ExcludeMissing
                        fun earnings(earnings: JsonField<Earnings>) = apply {
                            this.earnings = earnings
                        }

                        fun employeeDeductions(employeeDeductions: EmployeeDeductions) =
                            employeeDeductions(JsonField.of(employeeDeductions))

                        @JsonProperty("employee_deductions")
                        @ExcludeMissing
                        fun employeeDeductions(employeeDeductions: JsonField<EmployeeDeductions>) =
                            apply {
                                this.employeeDeductions = employeeDeductions
                            }

                        fun employerContributions(employerContributions: EmployerContributions) =
                            employerContributions(JsonField.of(employerContributions))

                        @JsonProperty("employer_contributions")
                        @ExcludeMissing
                        fun employerContributions(
                            employerContributions: JsonField<EmployerContributions>
                        ) = apply { this.employerContributions = employerContributions }

                        fun taxes(taxes: Taxes) = taxes(JsonField.of(taxes))

                        @JsonProperty("taxes")
                        @ExcludeMissing
                        fun taxes(taxes: JsonField<Taxes>) = apply { this.taxes = taxes }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): PayStatements =
                            PayStatements(
                                individualId,
                                type,
                                paymentMethod,
                                totalHours,
                                grossPay,
                                netPay,
                                earnings,
                                employeeDeductions,
                                employerContributions,
                                taxes,
                                additionalProperties.toImmutable(),
                            )
                    }

                    @JsonDeserialize(builder = Earnings.Builder::class)
                    @NoAutoDetect
                    class Earnings
                    private constructor(
                        private val type: JsonField<Boolean>,
                        private val name: JsonField<Boolean>,
                        private val amount: JsonField<Boolean>,
                        private val currency: JsonField<Boolean>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        fun type(): Optional<Boolean> =
                            Optional.ofNullable(type.getNullable("type"))

                        fun name(): Optional<Boolean> =
                            Optional.ofNullable(name.getNullable("name"))

                        fun amount(): Optional<Boolean> =
                            Optional.ofNullable(amount.getNullable("amount"))

                        fun currency(): Optional<Boolean> =
                            Optional.ofNullable(currency.getNullable("currency"))

                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        @JsonProperty("name") @ExcludeMissing fun _name() = name

                        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Earnings = apply {
                            if (!validated) {
                                type()
                                name()
                                amount()
                                currency()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var type: JsonField<Boolean> = JsonMissing.of()
                            private var name: JsonField<Boolean> = JsonMissing.of()
                            private var amount: JsonField<Boolean> = JsonMissing.of()
                            private var currency: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(earnings: Earnings) = apply {
                                this.type = earnings.type
                                this.name = earnings.name
                                this.amount = earnings.amount
                                this.currency = earnings.currency
                                additionalProperties(earnings.additionalProperties)
                            }

                            fun type(type: Boolean) = type(JsonField.of(type))

                            @JsonProperty("type")
                            @ExcludeMissing
                            fun type(type: JsonField<Boolean>) = apply { this.type = type }

                            fun name(name: Boolean) = name(JsonField.of(name))

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun name(name: JsonField<Boolean>) = apply { this.name = name }

                            fun amount(amount: Boolean) = amount(JsonField.of(amount))

                            @JsonProperty("amount")
                            @ExcludeMissing
                            fun amount(amount: JsonField<Boolean>) = apply { this.amount = amount }

                            fun currency(currency: Boolean) = currency(JsonField.of(currency))

                            @JsonProperty("currency")
                            @ExcludeMissing
                            fun currency(currency: JsonField<Boolean>) = apply {
                                this.currency = currency
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Earnings =
                                Earnings(
                                    type,
                                    name,
                                    amount,
                                    currency,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Earnings && type == other.type && name == other.name && amount == other.amount && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(type, name, amount, currency, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Earnings{type=$type, name=$name, amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
                    }

                    @JsonDeserialize(builder = EmployeeDeductions.Builder::class)
                    @NoAutoDetect
                    class EmployeeDeductions
                    private constructor(
                        private val name: JsonField<Boolean>,
                        private val amount: JsonField<Boolean>,
                        private val type: JsonField<Boolean>,
                        private val preTax: JsonField<Boolean>,
                        private val currency: JsonField<Boolean>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        fun name(): Optional<Boolean> =
                            Optional.ofNullable(name.getNullable("name"))

                        fun amount(): Optional<Boolean> =
                            Optional.ofNullable(amount.getNullable("amount"))

                        fun type(): Optional<Boolean> =
                            Optional.ofNullable(type.getNullable("type"))

                        fun preTax(): Optional<Boolean> =
                            Optional.ofNullable(preTax.getNullable("pre_tax"))

                        fun currency(): Optional<Boolean> =
                            Optional.ofNullable(currency.getNullable("currency"))

                        @JsonProperty("name") @ExcludeMissing fun _name() = name

                        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        @JsonProperty("pre_tax") @ExcludeMissing fun _preTax() = preTax

                        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): EmployeeDeductions = apply {
                            if (!validated) {
                                name()
                                amount()
                                type()
                                preTax()
                                currency()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var name: JsonField<Boolean> = JsonMissing.of()
                            private var amount: JsonField<Boolean> = JsonMissing.of()
                            private var type: JsonField<Boolean> = JsonMissing.of()
                            private var preTax: JsonField<Boolean> = JsonMissing.of()
                            private var currency: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(employeeDeductions: EmployeeDeductions) = apply {
                                this.name = employeeDeductions.name
                                this.amount = employeeDeductions.amount
                                this.type = employeeDeductions.type
                                this.preTax = employeeDeductions.preTax
                                this.currency = employeeDeductions.currency
                                additionalProperties(employeeDeductions.additionalProperties)
                            }

                            fun name(name: Boolean) = name(JsonField.of(name))

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun name(name: JsonField<Boolean>) = apply { this.name = name }

                            fun amount(amount: Boolean) = amount(JsonField.of(amount))

                            @JsonProperty("amount")
                            @ExcludeMissing
                            fun amount(amount: JsonField<Boolean>) = apply { this.amount = amount }

                            fun type(type: Boolean) = type(JsonField.of(type))

                            @JsonProperty("type")
                            @ExcludeMissing
                            fun type(type: JsonField<Boolean>) = apply { this.type = type }

                            fun preTax(preTax: Boolean) = preTax(JsonField.of(preTax))

                            @JsonProperty("pre_tax")
                            @ExcludeMissing
                            fun preTax(preTax: JsonField<Boolean>) = apply { this.preTax = preTax }

                            fun currency(currency: Boolean) = currency(JsonField.of(currency))

                            @JsonProperty("currency")
                            @ExcludeMissing
                            fun currency(currency: JsonField<Boolean>) = apply {
                                this.currency = currency
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): EmployeeDeductions =
                                EmployeeDeductions(
                                    name,
                                    amount,
                                    type,
                                    preTax,
                                    currency,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is EmployeeDeductions && name == other.name && amount == other.amount && type == other.type && preTax == other.preTax && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(name, amount, type, preTax, currency, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "EmployeeDeductions{name=$name, amount=$amount, type=$type, preTax=$preTax, currency=$currency, additionalProperties=$additionalProperties}"
                    }

                    @JsonDeserialize(builder = EmployerContributions.Builder::class)
                    @NoAutoDetect
                    class EmployerContributions
                    private constructor(
                        private val name: JsonField<Boolean>,
                        private val amount: JsonField<Boolean>,
                        private val currency: JsonField<Boolean>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        fun name(): Optional<Boolean> =
                            Optional.ofNullable(name.getNullable("name"))

                        fun amount(): Optional<Boolean> =
                            Optional.ofNullable(amount.getNullable("amount"))

                        fun currency(): Optional<Boolean> =
                            Optional.ofNullable(currency.getNullable("currency"))

                        @JsonProperty("name") @ExcludeMissing fun _name() = name

                        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): EmployerContributions = apply {
                            if (!validated) {
                                name()
                                amount()
                                currency()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var name: JsonField<Boolean> = JsonMissing.of()
                            private var amount: JsonField<Boolean> = JsonMissing.of()
                            private var currency: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(employerContributions: EmployerContributions) =
                                apply {
                                    this.name = employerContributions.name
                                    this.amount = employerContributions.amount
                                    this.currency = employerContributions.currency
                                    additionalProperties(employerContributions.additionalProperties)
                                }

                            fun name(name: Boolean) = name(JsonField.of(name))

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun name(name: JsonField<Boolean>) = apply { this.name = name }

                            fun amount(amount: Boolean) = amount(JsonField.of(amount))

                            @JsonProperty("amount")
                            @ExcludeMissing
                            fun amount(amount: JsonField<Boolean>) = apply { this.amount = amount }

                            fun currency(currency: Boolean) = currency(JsonField.of(currency))

                            @JsonProperty("currency")
                            @ExcludeMissing
                            fun currency(currency: JsonField<Boolean>) = apply {
                                this.currency = currency
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): EmployerContributions =
                                EmployerContributions(
                                    name,
                                    amount,
                                    currency,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is EmployerContributions && name == other.name && amount == other.amount && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(name, amount, currency, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "EmployerContributions{name=$name, amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
                    }

                    @JsonDeserialize(builder = Taxes.Builder::class)
                    @NoAutoDetect
                    class Taxes
                    private constructor(
                        private val type: JsonField<Boolean>,
                        private val name: JsonField<Boolean>,
                        private val employer: JsonField<Boolean>,
                        private val amount: JsonField<Boolean>,
                        private val currency: JsonField<Boolean>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        fun type(): Optional<Boolean> =
                            Optional.ofNullable(type.getNullable("type"))

                        fun name(): Optional<Boolean> =
                            Optional.ofNullable(name.getNullable("name"))

                        fun employer(): Optional<Boolean> =
                            Optional.ofNullable(employer.getNullable("employer"))

                        fun amount(): Optional<Boolean> =
                            Optional.ofNullable(amount.getNullable("amount"))

                        fun currency(): Optional<Boolean> =
                            Optional.ofNullable(currency.getNullable("currency"))

                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        @JsonProperty("name") @ExcludeMissing fun _name() = name

                        @JsonProperty("employer") @ExcludeMissing fun _employer() = employer

                        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Taxes = apply {
                            if (!validated) {
                                type()
                                name()
                                employer()
                                amount()
                                currency()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var type: JsonField<Boolean> = JsonMissing.of()
                            private var name: JsonField<Boolean> = JsonMissing.of()
                            private var employer: JsonField<Boolean> = JsonMissing.of()
                            private var amount: JsonField<Boolean> = JsonMissing.of()
                            private var currency: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(taxes: Taxes) = apply {
                                this.type = taxes.type
                                this.name = taxes.name
                                this.employer = taxes.employer
                                this.amount = taxes.amount
                                this.currency = taxes.currency
                                additionalProperties(taxes.additionalProperties)
                            }

                            fun type(type: Boolean) = type(JsonField.of(type))

                            @JsonProperty("type")
                            @ExcludeMissing
                            fun type(type: JsonField<Boolean>) = apply { this.type = type }

                            fun name(name: Boolean) = name(JsonField.of(name))

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun name(name: JsonField<Boolean>) = apply { this.name = name }

                            fun employer(employer: Boolean) = employer(JsonField.of(employer))

                            @JsonProperty("employer")
                            @ExcludeMissing
                            fun employer(employer: JsonField<Boolean>) = apply {
                                this.employer = employer
                            }

                            fun amount(amount: Boolean) = amount(JsonField.of(amount))

                            @JsonProperty("amount")
                            @ExcludeMissing
                            fun amount(amount: JsonField<Boolean>) = apply { this.amount = amount }

                            fun currency(currency: Boolean) = currency(JsonField.of(currency))

                            @JsonProperty("currency")
                            @ExcludeMissing
                            fun currency(currency: JsonField<Boolean>) = apply {
                                this.currency = currency
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Taxes =
                                Taxes(
                                    type,
                                    name,
                                    employer,
                                    amount,
                                    currency,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Taxes && type == other.type && name == other.name && employer == other.employer && amount == other.amount && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(type, name, employer, amount, currency, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Taxes{type=$type, name=$name, employer=$employer, amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is PayStatements && individualId == other.individualId && type == other.type && paymentMethod == other.paymentMethod && totalHours == other.totalHours && grossPay == other.grossPay && netPay == other.netPay && earnings == other.earnings && employeeDeductions == other.employeeDeductions && employerContributions == other.employerContributions && taxes == other.taxes && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(individualId, type, paymentMethod, totalHours, grossPay, netPay, earnings, employeeDeductions, employerContributions, taxes, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "PayStatements{individualId=$individualId, type=$type, paymentMethod=$paymentMethod, totalHours=$totalHours, grossPay=$grossPay, netPay=$netPay, earnings=$earnings, employeeDeductions=$employeeDeductions, employerContributions=$employerContributions, taxes=$taxes, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is SupportedPayStatementFields && paging == other.paging && payStatements == other.payStatements && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(paging, payStatements, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SupportedPayStatementFields{paging=$paging, payStatements=$payStatements, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = SupportedPaymentFields.Builder::class)
            @NoAutoDetect
            class SupportedPaymentFields
            private constructor(
                private val id: JsonField<Boolean>,
                private val payDate: JsonField<Boolean>,
                private val debitDate: JsonField<Boolean>,
                private val companyDebit: JsonField<Boolean>,
                private val grossPay: JsonField<Boolean>,
                private val netPay: JsonField<Boolean>,
                private val employerTaxes: JsonField<Boolean>,
                private val employeeTaxes: JsonField<Boolean>,
                private val individualIds: JsonField<Boolean>,
                private val payPeriod: JsonField<PayPeriod>,
                private val payGroupIds: JsonField<Boolean>,
                private val payFrequencies: JsonField<Boolean>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun id(): Optional<Boolean> = Optional.ofNullable(id.getNullable("id"))

                fun payDate(): Optional<Boolean> =
                    Optional.ofNullable(payDate.getNullable("pay_date"))

                fun debitDate(): Optional<Boolean> =
                    Optional.ofNullable(debitDate.getNullable("debit_date"))

                fun companyDebit(): Optional<Boolean> =
                    Optional.ofNullable(companyDebit.getNullable("company_debit"))

                fun grossPay(): Optional<Boolean> =
                    Optional.ofNullable(grossPay.getNullable("gross_pay"))

                fun netPay(): Optional<Boolean> = Optional.ofNullable(netPay.getNullable("net_pay"))

                fun employerTaxes(): Optional<Boolean> =
                    Optional.ofNullable(employerTaxes.getNullable("employer_taxes"))

                fun employeeTaxes(): Optional<Boolean> =
                    Optional.ofNullable(employeeTaxes.getNullable("employee_taxes"))

                fun individualIds(): Optional<Boolean> =
                    Optional.ofNullable(individualIds.getNullable("individual_ids"))

                fun payPeriod(): Optional<PayPeriod> =
                    Optional.ofNullable(payPeriod.getNullable("pay_period"))

                fun payGroupIds(): Optional<Boolean> =
                    Optional.ofNullable(payGroupIds.getNullable("pay_group_ids"))

                fun payFrequencies(): Optional<Boolean> =
                    Optional.ofNullable(payFrequencies.getNullable("pay_frequencies"))

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                @JsonProperty("pay_date") @ExcludeMissing fun _payDate() = payDate

                @JsonProperty("debit_date") @ExcludeMissing fun _debitDate() = debitDate

                @JsonProperty("company_debit") @ExcludeMissing fun _companyDebit() = companyDebit

                @JsonProperty("gross_pay") @ExcludeMissing fun _grossPay() = grossPay

                @JsonProperty("net_pay") @ExcludeMissing fun _netPay() = netPay

                @JsonProperty("employer_taxes") @ExcludeMissing fun _employerTaxes() = employerTaxes

                @JsonProperty("employee_taxes") @ExcludeMissing fun _employeeTaxes() = employeeTaxes

                @JsonProperty("individual_ids") @ExcludeMissing fun _individualIds() = individualIds

                @JsonProperty("pay_period") @ExcludeMissing fun _payPeriod() = payPeriod

                @JsonProperty("pay_group_ids") @ExcludeMissing fun _payGroupIds() = payGroupIds

                @JsonProperty("pay_frequencies")
                @ExcludeMissing
                fun _payFrequencies() = payFrequencies

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): SupportedPaymentFields = apply {
                    if (!validated) {
                        id()
                        payDate()
                        debitDate()
                        companyDebit()
                        grossPay()
                        netPay()
                        employerTaxes()
                        employeeTaxes()
                        individualIds()
                        payPeriod().map { it.validate() }
                        payGroupIds()
                        payFrequencies()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<Boolean> = JsonMissing.of()
                    private var payDate: JsonField<Boolean> = JsonMissing.of()
                    private var debitDate: JsonField<Boolean> = JsonMissing.of()
                    private var companyDebit: JsonField<Boolean> = JsonMissing.of()
                    private var grossPay: JsonField<Boolean> = JsonMissing.of()
                    private var netPay: JsonField<Boolean> = JsonMissing.of()
                    private var employerTaxes: JsonField<Boolean> = JsonMissing.of()
                    private var employeeTaxes: JsonField<Boolean> = JsonMissing.of()
                    private var individualIds: JsonField<Boolean> = JsonMissing.of()
                    private var payPeriod: JsonField<PayPeriod> = JsonMissing.of()
                    private var payGroupIds: JsonField<Boolean> = JsonMissing.of()
                    private var payFrequencies: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(supportedPaymentFields: SupportedPaymentFields) = apply {
                        this.id = supportedPaymentFields.id
                        this.payDate = supportedPaymentFields.payDate
                        this.debitDate = supportedPaymentFields.debitDate
                        this.companyDebit = supportedPaymentFields.companyDebit
                        this.grossPay = supportedPaymentFields.grossPay
                        this.netPay = supportedPaymentFields.netPay
                        this.employerTaxes = supportedPaymentFields.employerTaxes
                        this.employeeTaxes = supportedPaymentFields.employeeTaxes
                        this.individualIds = supportedPaymentFields.individualIds
                        this.payPeriod = supportedPaymentFields.payPeriod
                        this.payGroupIds = supportedPaymentFields.payGroupIds
                        this.payFrequencies = supportedPaymentFields.payFrequencies
                        additionalProperties(supportedPaymentFields.additionalProperties)
                    }

                    fun id(id: Boolean) = id(JsonField.of(id))

                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<Boolean>) = apply { this.id = id }

                    fun payDate(payDate: Boolean) = payDate(JsonField.of(payDate))

                    @JsonProperty("pay_date")
                    @ExcludeMissing
                    fun payDate(payDate: JsonField<Boolean>) = apply { this.payDate = payDate }

                    fun debitDate(debitDate: Boolean) = debitDate(JsonField.of(debitDate))

                    @JsonProperty("debit_date")
                    @ExcludeMissing
                    fun debitDate(debitDate: JsonField<Boolean>) = apply {
                        this.debitDate = debitDate
                    }

                    fun companyDebit(companyDebit: Boolean) =
                        companyDebit(JsonField.of(companyDebit))

                    @JsonProperty("company_debit")
                    @ExcludeMissing
                    fun companyDebit(companyDebit: JsonField<Boolean>) = apply {
                        this.companyDebit = companyDebit
                    }

                    fun grossPay(grossPay: Boolean) = grossPay(JsonField.of(grossPay))

                    @JsonProperty("gross_pay")
                    @ExcludeMissing
                    fun grossPay(grossPay: JsonField<Boolean>) = apply { this.grossPay = grossPay }

                    fun netPay(netPay: Boolean) = netPay(JsonField.of(netPay))

                    @JsonProperty("net_pay")
                    @ExcludeMissing
                    fun netPay(netPay: JsonField<Boolean>) = apply { this.netPay = netPay }

                    fun employerTaxes(employerTaxes: Boolean) =
                        employerTaxes(JsonField.of(employerTaxes))

                    @JsonProperty("employer_taxes")
                    @ExcludeMissing
                    fun employerTaxes(employerTaxes: JsonField<Boolean>) = apply {
                        this.employerTaxes = employerTaxes
                    }

                    fun employeeTaxes(employeeTaxes: Boolean) =
                        employeeTaxes(JsonField.of(employeeTaxes))

                    @JsonProperty("employee_taxes")
                    @ExcludeMissing
                    fun employeeTaxes(employeeTaxes: JsonField<Boolean>) = apply {
                        this.employeeTaxes = employeeTaxes
                    }

                    fun individualIds(individualIds: Boolean) =
                        individualIds(JsonField.of(individualIds))

                    @JsonProperty("individual_ids")
                    @ExcludeMissing
                    fun individualIds(individualIds: JsonField<Boolean>) = apply {
                        this.individualIds = individualIds
                    }

                    fun payPeriod(payPeriod: PayPeriod) = payPeriod(JsonField.of(payPeriod))

                    @JsonProperty("pay_period")
                    @ExcludeMissing
                    fun payPeriod(payPeriod: JsonField<PayPeriod>) = apply {
                        this.payPeriod = payPeriod
                    }

                    fun payGroupIds(payGroupIds: Boolean) = payGroupIds(JsonField.of(payGroupIds))

                    @JsonProperty("pay_group_ids")
                    @ExcludeMissing
                    fun payGroupIds(payGroupIds: JsonField<Boolean>) = apply {
                        this.payGroupIds = payGroupIds
                    }

                    fun payFrequencies(payFrequencies: Boolean) =
                        payFrequencies(JsonField.of(payFrequencies))

                    @JsonProperty("pay_frequencies")
                    @ExcludeMissing
                    fun payFrequencies(payFrequencies: JsonField<Boolean>) = apply {
                        this.payFrequencies = payFrequencies
                    }

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

                    fun build(): SupportedPaymentFields =
                        SupportedPaymentFields(
                            id,
                            payDate,
                            debitDate,
                            companyDebit,
                            grossPay,
                            netPay,
                            employerTaxes,
                            employeeTaxes,
                            individualIds,
                            payPeriod,
                            payGroupIds,
                            payFrequencies,
                            additionalProperties.toImmutable(),
                        )
                }

                @JsonDeserialize(builder = PayPeriod.Builder::class)
                @NoAutoDetect
                class PayPeriod
                private constructor(
                    private val startDate: JsonField<Boolean>,
                    private val endDate: JsonField<Boolean>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun startDate(): Optional<Boolean> =
                        Optional.ofNullable(startDate.getNullable("start_date"))

                    fun endDate(): Optional<Boolean> =
                        Optional.ofNullable(endDate.getNullable("end_date"))

                    @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

                    @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): PayPeriod = apply {
                        if (!validated) {
                            startDate()
                            endDate()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var startDate: JsonField<Boolean> = JsonMissing.of()
                        private var endDate: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(payPeriod: PayPeriod) = apply {
                            this.startDate = payPeriod.startDate
                            this.endDate = payPeriod.endDate
                            additionalProperties(payPeriod.additionalProperties)
                        }

                        fun startDate(startDate: Boolean) = startDate(JsonField.of(startDate))

                        @JsonProperty("start_date")
                        @ExcludeMissing
                        fun startDate(startDate: JsonField<Boolean>) = apply {
                            this.startDate = startDate
                        }

                        fun endDate(endDate: Boolean) = endDate(JsonField.of(endDate))

                        @JsonProperty("end_date")
                        @ExcludeMissing
                        fun endDate(endDate: JsonField<Boolean>) = apply { this.endDate = endDate }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): PayPeriod =
                            PayPeriod(
                                startDate,
                                endDate,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is PayPeriod && startDate == other.startDate && endDate == other.endDate && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(startDate, endDate, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "PayPeriod{startDate=$startDate, endDate=$endDate, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is SupportedPaymentFields && id == other.id && payDate == other.payDate && debitDate == other.debitDate && companyDebit == other.companyDebit && grossPay == other.grossPay && netPay == other.netPay && employerTaxes == other.employerTaxes && employeeTaxes == other.employeeTaxes && individualIds == other.individualIds && payPeriod == other.payPeriod && payGroupIds == other.payGroupIds && payFrequencies == other.payFrequencies && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, payDate, debitDate, companyDebit, grossPay, netPay, employerTaxes, employeeTaxes, individualIds, payPeriod, payGroupIds, payFrequencies, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SupportedPaymentFields{id=$id, payDate=$payDate, debitDate=$debitDate, companyDebit=$companyDebit, grossPay=$grossPay, netPay=$netPay, employerTaxes=$employerTaxes, employeeTaxes=$employeeTaxes, individualIds=$individualIds, payPeriod=$payPeriod, payGroupIds=$payGroupIds, payFrequencies=$payFrequencies, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SupportedFields && company == other.company && directory == other.directory && individual == other.individual && employment == other.employment && payment == other.payment && payStatement == other.payStatement && payGroup == other.payGroup && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(company, directory, individual, employment, payment, payStatement, payGroup, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SupportedFields{company=$company, directory=$directory, individual=$individual, employment=$employment, payment=$payment, payStatement=$payStatement, payGroup=$payGroup, additionalProperties=$additionalProperties}"
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ASSISTED = of("assisted")

                @JvmField val CREDENTIAL = of("credential")

                @JvmField val API_TOKEN = of("api_token")

                @JvmField val API_CREDENTIAL = of("api_credential")

                @JvmField val OAUTH = of("oauth")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                ASSISTED,
                CREDENTIAL,
                API_TOKEN,
                API_CREDENTIAL,
                OAUTH,
            }

            enum class Value {
                ASSISTED,
                CREDENTIAL,
                API_TOKEN,
                API_CREDENTIAL,
                OAUTH,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ASSISTED -> Value.ASSISTED
                    CREDENTIAL -> Value.CREDENTIAL
                    API_TOKEN -> Value.API_TOKEN
                    API_CREDENTIAL -> Value.API_CREDENTIAL
                    OAUTH -> Value.OAUTH
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ASSISTED -> Known.ASSISTED
                    CREDENTIAL -> Known.CREDENTIAL
                    API_TOKEN -> Known.API_TOKEN
                    API_CREDENTIAL -> Known.API_CREDENTIAL
                    OAUTH -> Known.OAUTH
                    else -> throw FinchInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthenticationMethod && type == other.type && benefitsSupport == other.benefitsSupport && supportedFields == other.supportedFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, benefitsSupport, supportedFields, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AuthenticationMethod{type=$type, benefitsSupport=$benefitsSupport, supportedFields=$supportedFields, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Provider && id == other.id && displayName == other.displayName && products == other.products && icon == other.icon && logo == other.logo && mfaRequired == other.mfaRequired && primaryColor == other.primaryColor && manual == other.manual && beta == other.beta && authenticationMethods == other.authenticationMethods && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, displayName, products, icon, logo, mfaRequired, primaryColor, manual, beta, authenticationMethods, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Provider{id=$id, displayName=$displayName, products=$products, icon=$icon, logo=$logo, mfaRequired=$mfaRequired, primaryColor=$primaryColor, manual=$manual, beta=$beta, authenticationMethods=$authenticationMethods, additionalProperties=$additionalProperties}"
}

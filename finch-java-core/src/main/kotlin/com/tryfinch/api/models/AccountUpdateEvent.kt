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
class AccountUpdateEvent
@JsonCreator
private constructor(
    @JsonProperty("connection_id")
    @ExcludeMissing
    private val connectionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("company_id")
    @ExcludeMissing
    private val companyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("event_type")
    @ExcludeMissing
    private val eventType: JsonField<EventType> = JsonMissing.of(),
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Data> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique Finch ID of the connection associated with the webhook event. */
    fun connectionId(): Optional<String> =
        Optional.ofNullable(connectionId.getNullable("connection_id"))

    /**
     * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    fun companyId(): String = companyId.getRequired("company_id")

    /**
     * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    fun accountId(): String = accountId.getRequired("account_id")

    fun eventType(): Optional<EventType> = Optional.ofNullable(eventType.getNullable("event_type"))

    fun data(): Optional<Data> = Optional.ofNullable(data.getNullable("data"))

    /** Unique Finch ID of the connection associated with the webhook event. */
    @JsonProperty("connection_id") @ExcludeMissing fun _connectionId() = connectionId

    /**
     * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId() = companyId

    /**
     * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    @JsonProperty("event_type") @ExcludeMissing fun _eventType() = eventType

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun toBaseWebhookEvent(): BaseWebhookEvent =
        BaseWebhookEvent.builder()
            .connectionId(connectionId)
            .companyId(companyId)
            .accountId(accountId)
            .build()

    private var validated: Boolean = false

    fun validate(): AccountUpdateEvent = apply {
        if (!validated) {
            connectionId()
            companyId()
            accountId()
            eventType()
            data().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var connectionId: JsonField<String> = JsonMissing.of()
        private var companyId: JsonField<String> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var eventType: JsonField<EventType> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountUpdateEvent: AccountUpdateEvent) = apply {
            connectionId = accountUpdateEvent.connectionId
            companyId = accountUpdateEvent.companyId
            accountId = accountUpdateEvent.accountId
            eventType = accountUpdateEvent.eventType
            data = accountUpdateEvent.data
            additionalProperties = accountUpdateEvent.additionalProperties.toMutableMap()
        }

        /** Unique Finch ID of the connection associated with the webhook event. */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /** Unique Finch ID of the connection associated with the webhook event. */
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        /**
         * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /**
         * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /**
         * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

        fun data(data: Data) = data(JsonField.of(data))

        fun data(data: JsonField<Data>) = apply { this.data = data }

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

        fun build(): AccountUpdateEvent =
            AccountUpdateEvent(
                connectionId,
                companyId,
                accountId,
                eventType,
                data,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<ConnectionStatusType> = JsonMissing.of(),
        @JsonProperty("authentication_method")
        @ExcludeMissing
        private val authenticationMethod: JsonField<AuthenticationMethod> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun status(): ConnectionStatusType = status.getRequired("status")

        fun authenticationMethod(): AuthenticationMethod =
            authenticationMethod.getRequired("authentication_method")

        @JsonProperty("status") @ExcludeMissing fun _status() = status

        @JsonProperty("authentication_method")
        @ExcludeMissing
        fun _authenticationMethod() = authenticationMethod

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (!validated) {
                status()
                authenticationMethod().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var status: JsonField<ConnectionStatusType> = JsonMissing.of()
            private var authenticationMethod: JsonField<AuthenticationMethod> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                status = data.status
                authenticationMethod = data.authenticationMethod
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun status(status: ConnectionStatusType) = status(JsonField.of(status))

            fun status(status: JsonField<ConnectionStatusType>) = apply { this.status = status }

            fun authenticationMethod(authenticationMethod: AuthenticationMethod) =
                authenticationMethod(JsonField.of(authenticationMethod))

            fun authenticationMethod(authenticationMethod: JsonField<AuthenticationMethod>) =
                apply {
                    this.authenticationMethod = authenticationMethod
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

            fun build(): Data =
                Data(
                    status,
                    authenticationMethod,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class AuthenticationMethod
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("benefits_support")
            @ExcludeMissing
            private val benefitsSupport: JsonField<BenefitsSupport> = JsonMissing.of(),
            @JsonProperty("supported_fields")
            @ExcludeMissing
            private val supportedFields: JsonField<SupportedFields> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The type of authentication method. */
            fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

            /**
             * Each benefit type and their supported features. If the benefit type is not supported,
             * the property will be null
             */
            fun benefitsSupport(): Optional<BenefitsSupport> =
                Optional.ofNullable(benefitsSupport.getNullable("benefits_support"))

            /** The supported data fields returned by our HR and payroll endpoints */
            fun supportedFields(): Optional<SupportedFields> =
                Optional.ofNullable(supportedFields.getNullable("supported_fields"))

            /** The type of authentication method. */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            /**
             * Each benefit type and their supported features. If the benefit type is not supported,
             * the property will be null
             */
            @JsonProperty("benefits_support")
            @ExcludeMissing
            fun _benefitsSupport() = benefitsSupport

            /** The supported data fields returned by our HR and payroll endpoints */
            @JsonProperty("supported_fields")
            @ExcludeMissing
            fun _supportedFields() = supportedFields

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

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
                    type = authenticationMethod.type
                    benefitsSupport = authenticationMethod.benefitsSupport
                    supportedFields = authenticationMethod.supportedFields
                    additionalProperties = authenticationMethod.additionalProperties.toMutableMap()
                }

                /** The type of authentication method. */
                fun type(type: Type) = type(JsonField.of(type))

                /** The type of authentication method. */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /**
                 * Each benefit type and their supported features. If the benefit type is not
                 * supported, the property will be null
                 */
                fun benefitsSupport(benefitsSupport: BenefitsSupport) =
                    benefitsSupport(JsonField.of(benefitsSupport))

                /**
                 * Each benefit type and their supported features. If the benefit type is not
                 * supported, the property will be null
                 */
                fun benefitsSupport(benefitsSupport: JsonField<BenefitsSupport>) = apply {
                    this.benefitsSupport = benefitsSupport
                }

                /** The supported data fields returned by our HR and payroll endpoints */
                fun supportedFields(supportedFields: SupportedFields) =
                    supportedFields(JsonField.of(supportedFields))

                /** The supported data fields returned by our HR and payroll endpoints */
                fun supportedFields(supportedFields: JsonField<SupportedFields>) = apply {
                    this.supportedFields = supportedFields
                }

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

                fun build(): AuthenticationMethod =
                    AuthenticationMethod(
                        type,
                        benefitsSupport,
                        supportedFields,
                        additionalProperties.toImmutable(),
                    )
            }

            /** The supported data fields returned by our HR and payroll endpoints */
            @NoAutoDetect
            class SupportedFields
            @JsonCreator
            private constructor(
                @JsonProperty("company")
                @ExcludeMissing
                private val company: JsonField<SupportedCompanyFields> = JsonMissing.of(),
                @JsonProperty("directory")
                @ExcludeMissing
                private val directory: JsonField<SupportedDirectoryFields> = JsonMissing.of(),
                @JsonProperty("individual")
                @ExcludeMissing
                private val individual: JsonField<SupportedIndividualFields> = JsonMissing.of(),
                @JsonProperty("employment")
                @ExcludeMissing
                private val employment: JsonField<SupportedEmploymentFields> = JsonMissing.of(),
                @JsonProperty("payment")
                @ExcludeMissing
                private val payment: JsonField<SupportedPaymentFields> = JsonMissing.of(),
                @JsonProperty("pay_statement")
                @ExcludeMissing
                private val payStatement: JsonField<SupportedPayStatementFields> = JsonMissing.of(),
                @JsonProperty("pay_group")
                @ExcludeMissing
                private val payGroup: JsonField<SupportedPayGroupFields> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

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

                private var validated: Boolean = false

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
                    private var payStatement: JsonField<SupportedPayStatementFields> =
                        JsonMissing.of()
                    private var payGroup: JsonField<SupportedPayGroupFields> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(supportedFields: SupportedFields) = apply {
                        company = supportedFields.company
                        directory = supportedFields.directory
                        individual = supportedFields.individual
                        employment = supportedFields.employment
                        payment = supportedFields.payment
                        payStatement = supportedFields.payStatement
                        payGroup = supportedFields.payGroup
                        additionalProperties = supportedFields.additionalProperties.toMutableMap()
                    }

                    fun company(company: SupportedCompanyFields) = company(JsonField.of(company))

                    fun company(company: JsonField<SupportedCompanyFields>) = apply {
                        this.company = company
                    }

                    fun directory(directory: SupportedDirectoryFields) =
                        directory(JsonField.of(directory))

                    fun directory(directory: JsonField<SupportedDirectoryFields>) = apply {
                        this.directory = directory
                    }

                    fun individual(individual: SupportedIndividualFields) =
                        individual(JsonField.of(individual))

                    fun individual(individual: JsonField<SupportedIndividualFields>) = apply {
                        this.individual = individual
                    }

                    fun employment(employment: SupportedEmploymentFields) =
                        employment(JsonField.of(employment))

                    fun employment(employment: JsonField<SupportedEmploymentFields>) = apply {
                        this.employment = employment
                    }

                    fun payment(payment: SupportedPaymentFields) = payment(JsonField.of(payment))

                    fun payment(payment: JsonField<SupportedPaymentFields>) = apply {
                        this.payment = payment
                    }

                    fun payStatement(payStatement: SupportedPayStatementFields) =
                        payStatement(JsonField.of(payStatement))

                    fun payStatement(payStatement: JsonField<SupportedPayStatementFields>) = apply {
                        this.payStatement = payStatement
                    }

                    fun payGroup(payGroup: SupportedPayGroupFields) =
                        payGroup(JsonField.of(payGroup))

                    fun payGroup(payGroup: JsonField<SupportedPayGroupFields>) = apply {
                        this.payGroup = payGroup
                    }

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

                @NoAutoDetect
                class SupportedCompanyFields
                @JsonCreator
                private constructor(
                    @JsonProperty("id")
                    @ExcludeMissing
                    private val id: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("legal_name")
                    @ExcludeMissing
                    private val legalName: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("entity")
                    @ExcludeMissing
                    private val entity: JsonField<Entity> = JsonMissing.of(),
                    @JsonProperty("primary_email")
                    @ExcludeMissing
                    private val primaryEmail: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("primary_phone_number")
                    @ExcludeMissing
                    private val primaryPhoneNumber: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("ein")
                    @ExcludeMissing
                    private val ein: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("accounts")
                    @ExcludeMissing
                    private val accounts: JsonField<Accounts> = JsonMissing.of(),
                    @JsonProperty("departments")
                    @ExcludeMissing
                    private val departments: JsonField<Departments> = JsonMissing.of(),
                    @JsonProperty("locations")
                    @ExcludeMissing
                    private val locations: JsonField<Locations> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun id(): Optional<Boolean> = Optional.ofNullable(id.getNullable("id"))

                    fun legalName(): Optional<Boolean> =
                        Optional.ofNullable(legalName.getNullable("legal_name"))

                    fun entity(): Optional<Entity> =
                        Optional.ofNullable(entity.getNullable("entity"))

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

                    @JsonProperty("primary_email")
                    @ExcludeMissing
                    fun _primaryEmail() = primaryEmail

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

                    private var validated: Boolean = false

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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(supportedCompanyFields: SupportedCompanyFields) = apply {
                            id = supportedCompanyFields.id
                            legalName = supportedCompanyFields.legalName
                            entity = supportedCompanyFields.entity
                            primaryEmail = supportedCompanyFields.primaryEmail
                            primaryPhoneNumber = supportedCompanyFields.primaryPhoneNumber
                            ein = supportedCompanyFields.ein
                            accounts = supportedCompanyFields.accounts
                            departments = supportedCompanyFields.departments
                            locations = supportedCompanyFields.locations
                            additionalProperties =
                                supportedCompanyFields.additionalProperties.toMutableMap()
                        }

                        fun id(id: Boolean) = id(JsonField.of(id))

                        fun id(id: JsonField<Boolean>) = apply { this.id = id }

                        fun legalName(legalName: Boolean) = legalName(JsonField.of(legalName))

                        fun legalName(legalName: JsonField<Boolean>) = apply {
                            this.legalName = legalName
                        }

                        fun entity(entity: Entity) = entity(JsonField.of(entity))

                        fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

                        fun primaryEmail(primaryEmail: Boolean) =
                            primaryEmail(JsonField.of(primaryEmail))

                        fun primaryEmail(primaryEmail: JsonField<Boolean>) = apply {
                            this.primaryEmail = primaryEmail
                        }

                        fun primaryPhoneNumber(primaryPhoneNumber: Boolean) =
                            primaryPhoneNumber(JsonField.of(primaryPhoneNumber))

                        fun primaryPhoneNumber(primaryPhoneNumber: JsonField<Boolean>) = apply {
                            this.primaryPhoneNumber = primaryPhoneNumber
                        }

                        fun ein(ein: Boolean) = ein(JsonField.of(ein))

                        fun ein(ein: JsonField<Boolean>) = apply { this.ein = ein }

                        fun accounts(accounts: Accounts) = accounts(JsonField.of(accounts))

                        fun accounts(accounts: JsonField<Accounts>) = apply {
                            this.accounts = accounts
                        }

                        fun departments(departments: Departments) =
                            departments(JsonField.of(departments))

                        fun departments(departments: JsonField<Departments>) = apply {
                            this.departments = departments
                        }

                        fun locations(locations: Locations) = locations(JsonField.of(locations))

                        fun locations(locations: JsonField<Locations>) = apply {
                            this.locations = locations
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
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

                    @NoAutoDetect
                    class Accounts
                    @JsonCreator
                    private constructor(
                        @JsonProperty("routing_number")
                        @ExcludeMissing
                        private val routingNumber: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("account_name")
                        @ExcludeMissing
                        private val accountName: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("institution_name")
                        @ExcludeMissing
                        private val institutionName: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("account_type")
                        @ExcludeMissing
                        private val accountType: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("account_number")
                        @ExcludeMissing
                        private val accountNumber: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

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

                        @JsonProperty("account_name")
                        @ExcludeMissing
                        fun _accountName() = accountName

                        @JsonProperty("institution_name")
                        @ExcludeMissing
                        fun _institutionName() = institutionName

                        @JsonProperty("account_type")
                        @ExcludeMissing
                        fun _accountType() = accountType

                        @JsonProperty("account_number")
                        @ExcludeMissing
                        fun _accountNumber() = accountNumber

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

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
                                routingNumber = accounts.routingNumber
                                accountName = accounts.accountName
                                institutionName = accounts.institutionName
                                accountType = accounts.accountType
                                accountNumber = accounts.accountNumber
                                additionalProperties = accounts.additionalProperties.toMutableMap()
                            }

                            fun routingNumber(routingNumber: Boolean) =
                                routingNumber(JsonField.of(routingNumber))

                            fun routingNumber(routingNumber: JsonField<Boolean>) = apply {
                                this.routingNumber = routingNumber
                            }

                            fun accountName(accountName: Boolean) =
                                accountName(JsonField.of(accountName))

                            fun accountName(accountName: JsonField<Boolean>) = apply {
                                this.accountName = accountName
                            }

                            fun institutionName(institutionName: Boolean) =
                                institutionName(JsonField.of(institutionName))

                            fun institutionName(institutionName: JsonField<Boolean>) = apply {
                                this.institutionName = institutionName
                            }

                            fun accountType(accountType: Boolean) =
                                accountType(JsonField.of(accountType))

                            fun accountType(accountType: JsonField<Boolean>) = apply {
                                this.accountType = accountType
                            }

                            fun accountNumber(accountNumber: Boolean) =
                                accountNumber(JsonField.of(accountNumber))

                            fun accountNumber(accountNumber: JsonField<Boolean>) = apply {
                                this.accountNumber = accountNumber
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

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

                    @NoAutoDetect
                    class Departments
                    @JsonCreator
                    private constructor(
                        @JsonProperty("name")
                        @ExcludeMissing
                        private val name: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("parent")
                        @ExcludeMissing
                        private val parent: JsonField<Parent> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun name(): Optional<Boolean> =
                            Optional.ofNullable(name.getNullable("name"))

                        fun parent(): Optional<Parent> =
                            Optional.ofNullable(parent.getNullable("parent"))

                        @JsonProperty("name") @ExcludeMissing fun _name() = name

                        @JsonProperty("parent") @ExcludeMissing fun _parent() = parent

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

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
                                name = departments.name
                                parent = departments.parent
                                additionalProperties =
                                    departments.additionalProperties.toMutableMap()
                            }

                            fun name(name: Boolean) = name(JsonField.of(name))

                            fun name(name: JsonField<Boolean>) = apply { this.name = name }

                            fun parent(parent: Parent) = parent(JsonField.of(parent))

                            fun parent(parent: JsonField<Parent>) = apply { this.parent = parent }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            fun build(): Departments =
                                Departments(
                                    name,
                                    parent,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        @NoAutoDetect
                        class Parent
                        @JsonCreator
                        private constructor(
                            @JsonProperty("name")
                            @ExcludeMissing
                            private val name: JsonField<Boolean> = JsonMissing.of(),
                            @JsonAnySetter
                            private val additionalProperties: Map<String, JsonValue> =
                                immutableEmptyMap(),
                        ) {

                            fun name(): Optional<Boolean> =
                                Optional.ofNullable(name.getNullable("name"))

                            @JsonProperty("name") @ExcludeMissing fun _name() = name

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

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

                                private var name: JsonField<Boolean> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(parent: Parent) = apply {
                                    name = parent.name
                                    additionalProperties =
                                        parent.additionalProperties.toMutableMap()
                                }

                                fun name(name: Boolean) = name(JsonField.of(name))

                                fun name(name: JsonField<Boolean>) = apply { this.name = name }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                fun build(): Parent =
                                    Parent(name, additionalProperties.toImmutable())
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

                    @NoAutoDetect
                    class Entity
                    @JsonCreator
                    private constructor(
                        @JsonProperty("type")
                        @ExcludeMissing
                        private val type: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("subtype")
                        @ExcludeMissing
                        private val subtype: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun type(): Optional<Boolean> =
                            Optional.ofNullable(type.getNullable("type"))

                        fun subtype(): Optional<Boolean> =
                            Optional.ofNullable(subtype.getNullable("subtype"))

                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        @JsonProperty("subtype") @ExcludeMissing fun _subtype() = subtype

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

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
                                type = entity.type
                                subtype = entity.subtype
                                additionalProperties = entity.additionalProperties.toMutableMap()
                            }

                            fun type(type: Boolean) = type(JsonField.of(type))

                            fun type(type: JsonField<Boolean>) = apply { this.type = type }

                            fun subtype(subtype: Boolean) = subtype(JsonField.of(subtype))

                            fun subtype(subtype: JsonField<Boolean>) = apply {
                                this.subtype = subtype
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

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

                    @NoAutoDetect
                    class Locations
                    @JsonCreator
                    private constructor(
                        @JsonProperty("line1")
                        @ExcludeMissing
                        private val line1: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("line2")
                        @ExcludeMissing
                        private val line2: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("city")
                        @ExcludeMissing
                        private val city: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("state")
                        @ExcludeMissing
                        private val state: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("postal_code")
                        @ExcludeMissing
                        private val postalCode: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("country")
                        @ExcludeMissing
                        private val country: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun line1(): Optional<Boolean> =
                            Optional.ofNullable(line1.getNullable("line1"))

                        fun line2(): Optional<Boolean> =
                            Optional.ofNullable(line2.getNullable("line2"))

                        fun city(): Optional<Boolean> =
                            Optional.ofNullable(city.getNullable("city"))

                        fun state(): Optional<Boolean> =
                            Optional.ofNullable(state.getNullable("state"))

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

                        private var validated: Boolean = false

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
                                line1 = locations.line1
                                line2 = locations.line2
                                city = locations.city
                                state = locations.state
                                postalCode = locations.postalCode
                                country = locations.country
                                additionalProperties = locations.additionalProperties.toMutableMap()
                            }

                            fun line1(line1: Boolean) = line1(JsonField.of(line1))

                            fun line1(line1: JsonField<Boolean>) = apply { this.line1 = line1 }

                            fun line2(line2: Boolean) = line2(JsonField.of(line2))

                            fun line2(line2: JsonField<Boolean>) = apply { this.line2 = line2 }

                            fun city(city: Boolean) = city(JsonField.of(city))

                            fun city(city: JsonField<Boolean>) = apply { this.city = city }

                            fun state(state: Boolean) = state(JsonField.of(state))

                            fun state(state: JsonField<Boolean>) = apply { this.state = state }

                            fun postalCode(postalCode: Boolean) =
                                postalCode(JsonField.of(postalCode))

                            fun postalCode(postalCode: JsonField<Boolean>) = apply {
                                this.postalCode = postalCode
                            }

                            fun country(country: Boolean) = country(JsonField.of(country))

                            fun country(country: JsonField<Boolean>) = apply {
                                this.country = country
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

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

                @NoAutoDetect
                class SupportedDirectoryFields
                @JsonCreator
                private constructor(
                    @JsonProperty("paging")
                    @ExcludeMissing
                    private val paging: JsonField<Paging> = JsonMissing.of(),
                    @JsonProperty("individuals")
                    @ExcludeMissing
                    private val individuals: JsonField<Individuals> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun paging(): Optional<Paging> =
                        Optional.ofNullable(paging.getNullable("paging"))

                    fun individuals(): Optional<Individuals> =
                        Optional.ofNullable(individuals.getNullable("individuals"))

                    @JsonProperty("paging") @ExcludeMissing fun _paging() = paging

                    @JsonProperty("individuals") @ExcludeMissing fun _individuals() = individuals

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(supportedDirectoryFields: SupportedDirectoryFields) =
                            apply {
                                paging = supportedDirectoryFields.paging
                                individuals = supportedDirectoryFields.individuals
                                additionalProperties =
                                    supportedDirectoryFields.additionalProperties.toMutableMap()
                            }

                        fun paging(paging: Paging) = paging(JsonField.of(paging))

                        fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

                        fun individuals(individuals: Individuals) =
                            individuals(JsonField.of(individuals))

                        fun individuals(individuals: JsonField<Individuals>) = apply {
                            this.individuals = individuals
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): SupportedDirectoryFields =
                            SupportedDirectoryFields(
                                paging,
                                individuals,
                                additionalProperties.toImmutable(),
                            )
                    }

                    @NoAutoDetect
                    class Individuals
                    @JsonCreator
                    private constructor(
                        @JsonProperty("id")
                        @ExcludeMissing
                        private val id: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("first_name")
                        @ExcludeMissing
                        private val firstName: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("middle_name")
                        @ExcludeMissing
                        private val middleName: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("last_name")
                        @ExcludeMissing
                        private val lastName: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("is_active")
                        @ExcludeMissing
                        private val isActive: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("department")
                        @ExcludeMissing
                        private val department: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("manager")
                        @ExcludeMissing
                        private val manager: JsonField<Manager> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

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

                        private var validated: Boolean = false

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
                                id = individuals.id
                                firstName = individuals.firstName
                                middleName = individuals.middleName
                                lastName = individuals.lastName
                                isActive = individuals.isActive
                                department = individuals.department
                                manager = individuals.manager
                                additionalProperties =
                                    individuals.additionalProperties.toMutableMap()
                            }

                            fun id(id: Boolean) = id(JsonField.of(id))

                            fun id(id: JsonField<Boolean>) = apply { this.id = id }

                            fun firstName(firstName: Boolean) = firstName(JsonField.of(firstName))

                            fun firstName(firstName: JsonField<Boolean>) = apply {
                                this.firstName = firstName
                            }

                            fun middleName(middleName: Boolean) =
                                middleName(JsonField.of(middleName))

                            fun middleName(middleName: JsonField<Boolean>) = apply {
                                this.middleName = middleName
                            }

                            fun lastName(lastName: Boolean) = lastName(JsonField.of(lastName))

                            fun lastName(lastName: JsonField<Boolean>) = apply {
                                this.lastName = lastName
                            }

                            fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

                            fun isActive(isActive: JsonField<Boolean>) = apply {
                                this.isActive = isActive
                            }

                            fun department(department: Boolean) =
                                department(JsonField.of(department))

                            fun department(department: JsonField<Boolean>) = apply {
                                this.department = department
                            }

                            fun manager(manager: Manager) = manager(JsonField.of(manager))

                            fun manager(manager: JsonField<Manager>) = apply {
                                this.manager = manager
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

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

                        @NoAutoDetect
                        class Manager
                        @JsonCreator
                        private constructor(
                            @JsonProperty("id")
                            @ExcludeMissing
                            private val id: JsonField<Boolean> = JsonMissing.of(),
                            @JsonAnySetter
                            private val additionalProperties: Map<String, JsonValue> =
                                immutableEmptyMap(),
                        ) {

                            fun id(): Optional<Boolean> = Optional.ofNullable(id.getNullable("id"))

                            @JsonProperty("id") @ExcludeMissing fun _id() = id

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            private var validated: Boolean = false

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
                                    id = manager.id
                                    additionalProperties =
                                        manager.additionalProperties.toMutableMap()
                                }

                                fun id(id: Boolean) = id(JsonField.of(id))

                                fun id(id: JsonField<Boolean>) = apply { this.id = id }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                fun build(): Manager =
                                    Manager(id, additionalProperties.toImmutable())
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

                    @NoAutoDetect
                    class Paging
                    @JsonCreator
                    private constructor(
                        @JsonProperty("count")
                        @ExcludeMissing
                        private val count: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("offset")
                        @ExcludeMissing
                        private val offset: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun count(): Optional<Boolean> =
                            Optional.ofNullable(count.getNullable("count"))

                        fun offset(): Optional<Boolean> =
                            Optional.ofNullable(offset.getNullable("offset"))

                        @JsonProperty("count") @ExcludeMissing fun _count() = count

                        @JsonProperty("offset") @ExcludeMissing fun _offset() = offset

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

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
                                count = paging.count
                                offset = paging.offset
                                additionalProperties = paging.additionalProperties.toMutableMap()
                            }

                            fun count(count: Boolean) = count(JsonField.of(count))

                            fun count(count: JsonField<Boolean>) = apply { this.count = count }

                            fun offset(offset: Boolean) = offset(JsonField.of(offset))

                            fun offset(offset: JsonField<Boolean>) = apply { this.offset = offset }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

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

                @NoAutoDetect
                class SupportedEmploymentFields
                @JsonCreator
                private constructor(
                    @JsonProperty("id")
                    @ExcludeMissing
                    private val id: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("first_name")
                    @ExcludeMissing
                    private val firstName: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("middle_name")
                    @ExcludeMissing
                    private val middleName: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("last_name")
                    @ExcludeMissing
                    private val lastName: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("title")
                    @ExcludeMissing
                    private val title: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("start_date")
                    @ExcludeMissing
                    private val startDate: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("end_date")
                    @ExcludeMissing
                    private val endDate: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("is_active")
                    @ExcludeMissing
                    private val isActive: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("employment_status")
                    @ExcludeMissing
                    private val employmentStatus: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("income_history")
                    @ExcludeMissing
                    private val incomeHistory: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("class_code")
                    @ExcludeMissing
                    private val classCode: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("custom_fields")
                    @ExcludeMissing
                    private val customFields: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("department")
                    @ExcludeMissing
                    private val department: JsonField<Department> = JsonMissing.of(),
                    @JsonProperty("employment")
                    @ExcludeMissing
                    private val employment: JsonField<Employment> = JsonMissing.of(),
                    @JsonProperty("income")
                    @ExcludeMissing
                    private val income: JsonField<Income> = JsonMissing.of(),
                    @JsonProperty("location")
                    @ExcludeMissing
                    private val location: JsonField<Location> = JsonMissing.of(),
                    @JsonProperty("manager")
                    @ExcludeMissing
                    private val manager: JsonField<Manager> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

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

                    fun income(): Optional<Income> =
                        Optional.ofNullable(income.getNullable("income"))

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

                    @JsonProperty("income_history")
                    @ExcludeMissing
                    fun _incomeHistory() = incomeHistory

                    @JsonProperty("class_code") @ExcludeMissing fun _classCode() = classCode

                    @JsonProperty("custom_fields")
                    @ExcludeMissing
                    fun _customFields() = customFields

                    @JsonProperty("department") @ExcludeMissing fun _department() = department

                    @JsonProperty("employment") @ExcludeMissing fun _employment() = employment

                    @JsonProperty("income") @ExcludeMissing fun _income() = income

                    @JsonProperty("location") @ExcludeMissing fun _location() = location

                    @JsonProperty("manager") @ExcludeMissing fun _manager() = manager

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(supportedEmploymentFields: SupportedEmploymentFields) =
                            apply {
                                id = supportedEmploymentFields.id
                                firstName = supportedEmploymentFields.firstName
                                middleName = supportedEmploymentFields.middleName
                                lastName = supportedEmploymentFields.lastName
                                title = supportedEmploymentFields.title
                                startDate = supportedEmploymentFields.startDate
                                endDate = supportedEmploymentFields.endDate
                                isActive = supportedEmploymentFields.isActive
                                employmentStatus = supportedEmploymentFields.employmentStatus
                                incomeHistory = supportedEmploymentFields.incomeHistory
                                classCode = supportedEmploymentFields.classCode
                                customFields = supportedEmploymentFields.customFields
                                department = supportedEmploymentFields.department
                                employment = supportedEmploymentFields.employment
                                income = supportedEmploymentFields.income
                                location = supportedEmploymentFields.location
                                manager = supportedEmploymentFields.manager
                                additionalProperties =
                                    supportedEmploymentFields.additionalProperties.toMutableMap()
                            }

                        fun id(id: Boolean) = id(JsonField.of(id))

                        fun id(id: JsonField<Boolean>) = apply { this.id = id }

                        fun firstName(firstName: Boolean) = firstName(JsonField.of(firstName))

                        fun firstName(firstName: JsonField<Boolean>) = apply {
                            this.firstName = firstName
                        }

                        fun middleName(middleName: Boolean) = middleName(JsonField.of(middleName))

                        fun middleName(middleName: JsonField<Boolean>) = apply {
                            this.middleName = middleName
                        }

                        fun lastName(lastName: Boolean) = lastName(JsonField.of(lastName))

                        fun lastName(lastName: JsonField<Boolean>) = apply {
                            this.lastName = lastName
                        }

                        fun title(title: Boolean) = title(JsonField.of(title))

                        fun title(title: JsonField<Boolean>) = apply { this.title = title }

                        fun startDate(startDate: Boolean) = startDate(JsonField.of(startDate))

                        fun startDate(startDate: JsonField<Boolean>) = apply {
                            this.startDate = startDate
                        }

                        fun endDate(endDate: Boolean) = endDate(JsonField.of(endDate))

                        fun endDate(endDate: JsonField<Boolean>) = apply { this.endDate = endDate }

                        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

                        fun isActive(isActive: JsonField<Boolean>) = apply {
                            this.isActive = isActive
                        }

                        fun employmentStatus(employmentStatus: Boolean) =
                            employmentStatus(JsonField.of(employmentStatus))

                        fun employmentStatus(employmentStatus: JsonField<Boolean>) = apply {
                            this.employmentStatus = employmentStatus
                        }

                        fun incomeHistory(incomeHistory: Boolean) =
                            incomeHistory(JsonField.of(incomeHistory))

                        fun incomeHistory(incomeHistory: JsonField<Boolean>) = apply {
                            this.incomeHistory = incomeHistory
                        }

                        fun classCode(classCode: Boolean) = classCode(JsonField.of(classCode))

                        fun classCode(classCode: JsonField<Boolean>) = apply {
                            this.classCode = classCode
                        }

                        fun customFields(customFields: Boolean) =
                            customFields(JsonField.of(customFields))

                        fun customFields(customFields: JsonField<Boolean>) = apply {
                            this.customFields = customFields
                        }

                        fun department(department: Department) =
                            department(JsonField.of(department))

                        fun department(department: JsonField<Department>) = apply {
                            this.department = department
                        }

                        fun employment(employment: Employment) =
                            employment(JsonField.of(employment))

                        fun employment(employment: JsonField<Employment>) = apply {
                            this.employment = employment
                        }

                        fun income(income: Income) = income(JsonField.of(income))

                        fun income(income: JsonField<Income>) = apply { this.income = income }

                        fun location(location: Location) = location(JsonField.of(location))

                        fun location(location: JsonField<Location>) = apply {
                            this.location = location
                        }

                        fun manager(manager: Manager) = manager(JsonField.of(manager))

                        fun manager(manager: JsonField<Manager>) = apply { this.manager = manager }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
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

                    @NoAutoDetect
                    class Department
                    @JsonCreator
                    private constructor(
                        @JsonProperty("name")
                        @ExcludeMissing
                        private val name: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun name(): Optional<Boolean> =
                            Optional.ofNullable(name.getNullable("name"))

                        @JsonProperty("name") @ExcludeMissing fun _name() = name

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

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
                                name = department.name
                                additionalProperties =
                                    department.additionalProperties.toMutableMap()
                            }

                            fun name(name: Boolean) = name(JsonField.of(name))

                            fun name(name: JsonField<Boolean>) = apply { this.name = name }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

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

                    @NoAutoDetect
                    class Employment
                    @JsonCreator
                    private constructor(
                        @JsonProperty("type")
                        @ExcludeMissing
                        private val type: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("subtype")
                        @ExcludeMissing
                        private val subtype: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun type(): Optional<Boolean> =
                            Optional.ofNullable(type.getNullable("type"))

                        fun subtype(): Optional<Boolean> =
                            Optional.ofNullable(subtype.getNullable("subtype"))

                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        @JsonProperty("subtype") @ExcludeMissing fun _subtype() = subtype

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

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
                                type = employment.type
                                subtype = employment.subtype
                                additionalProperties =
                                    employment.additionalProperties.toMutableMap()
                            }

                            fun type(type: Boolean) = type(JsonField.of(type))

                            fun type(type: JsonField<Boolean>) = apply { this.type = type }

                            fun subtype(subtype: Boolean) = subtype(JsonField.of(subtype))

                            fun subtype(subtype: JsonField<Boolean>) = apply {
                                this.subtype = subtype
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

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

                    @NoAutoDetect
                    class Income
                    @JsonCreator
                    private constructor(
                        @JsonProperty("amount")
                        @ExcludeMissing
                        private val amount: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("currency")
                        @ExcludeMissing
                        private val currency: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("unit")
                        @ExcludeMissing
                        private val unit: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun amount(): Optional<Boolean> =
                            Optional.ofNullable(amount.getNullable("amount"))

                        fun currency(): Optional<Boolean> =
                            Optional.ofNullable(currency.getNullable("currency"))

                        fun unit(): Optional<Boolean> =
                            Optional.ofNullable(unit.getNullable("unit"))

                        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                        @JsonProperty("unit") @ExcludeMissing fun _unit() = unit

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

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
                                amount = income.amount
                                currency = income.currency
                                unit = income.unit
                                additionalProperties = income.additionalProperties.toMutableMap()
                            }

                            fun amount(amount: Boolean) = amount(JsonField.of(amount))

                            fun amount(amount: JsonField<Boolean>) = apply { this.amount = amount }

                            fun currency(currency: Boolean) = currency(JsonField.of(currency))

                            fun currency(currency: JsonField<Boolean>) = apply {
                                this.currency = currency
                            }

                            fun unit(unit: Boolean) = unit(JsonField.of(unit))

                            fun unit(unit: JsonField<Boolean>) = apply { this.unit = unit }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

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

                    @NoAutoDetect
                    class Location
                    @JsonCreator
                    private constructor(
                        @JsonProperty("line1")
                        @ExcludeMissing
                        private val line1: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("line2")
                        @ExcludeMissing
                        private val line2: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("city")
                        @ExcludeMissing
                        private val city: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("state")
                        @ExcludeMissing
                        private val state: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("postal_code")
                        @ExcludeMissing
                        private val postalCode: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("country")
                        @ExcludeMissing
                        private val country: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun line1(): Optional<Boolean> =
                            Optional.ofNullable(line1.getNullable("line1"))

                        fun line2(): Optional<Boolean> =
                            Optional.ofNullable(line2.getNullable("line2"))

                        fun city(): Optional<Boolean> =
                            Optional.ofNullable(city.getNullable("city"))

                        fun state(): Optional<Boolean> =
                            Optional.ofNullable(state.getNullable("state"))

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

                        private var validated: Boolean = false

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
                                line1 = location.line1
                                line2 = location.line2
                                city = location.city
                                state = location.state
                                postalCode = location.postalCode
                                country = location.country
                                additionalProperties = location.additionalProperties.toMutableMap()
                            }

                            fun line1(line1: Boolean) = line1(JsonField.of(line1))

                            fun line1(line1: JsonField<Boolean>) = apply { this.line1 = line1 }

                            fun line2(line2: Boolean) = line2(JsonField.of(line2))

                            fun line2(line2: JsonField<Boolean>) = apply { this.line2 = line2 }

                            fun city(city: Boolean) = city(JsonField.of(city))

                            fun city(city: JsonField<Boolean>) = apply { this.city = city }

                            fun state(state: Boolean) = state(JsonField.of(state))

                            fun state(state: JsonField<Boolean>) = apply { this.state = state }

                            fun postalCode(postalCode: Boolean) =
                                postalCode(JsonField.of(postalCode))

                            fun postalCode(postalCode: JsonField<Boolean>) = apply {
                                this.postalCode = postalCode
                            }

                            fun country(country: Boolean) = country(JsonField.of(country))

                            fun country(country: JsonField<Boolean>) = apply {
                                this.country = country
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

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

                    @NoAutoDetect
                    class Manager
                    @JsonCreator
                    private constructor(
                        @JsonProperty("id")
                        @ExcludeMissing
                        private val id: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun id(): Optional<Boolean> = Optional.ofNullable(id.getNullable("id"))

                        @JsonProperty("id") @ExcludeMissing fun _id() = id

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

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
                                id = manager.id
                                additionalProperties = manager.additionalProperties.toMutableMap()
                            }

                            fun id(id: Boolean) = id(JsonField.of(id))

                            fun id(id: JsonField<Boolean>) = apply { this.id = id }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

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

                @NoAutoDetect
                class SupportedIndividualFields
                @JsonCreator
                private constructor(
                    @JsonProperty("id")
                    @ExcludeMissing
                    private val id: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("first_name")
                    @ExcludeMissing
                    private val firstName: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("middle_name")
                    @ExcludeMissing
                    private val middleName: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("last_name")
                    @ExcludeMissing
                    private val lastName: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("preferred_name")
                    @ExcludeMissing
                    private val preferredName: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("dob")
                    @ExcludeMissing
                    private val dob: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("gender")
                    @ExcludeMissing
                    private val gender: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("ethnicity")
                    @ExcludeMissing
                    private val ethnicity: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("ssn")
                    @ExcludeMissing
                    private val ssn: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("encrypted_ssn")
                    @ExcludeMissing
                    private val encryptedSsn: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("emails")
                    @ExcludeMissing
                    private val emails: JsonField<Emails> = JsonMissing.of(),
                    @JsonProperty("phone_numbers")
                    @ExcludeMissing
                    private val phoneNumbers: JsonField<PhoneNumbers> = JsonMissing.of(),
                    @JsonProperty("residence")
                    @ExcludeMissing
                    private val residence: JsonField<Residence> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

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

                    fun gender(): Optional<Boolean> =
                        Optional.ofNullable(gender.getNullable("gender"))

                    fun ethnicity(): Optional<Boolean> =
                        Optional.ofNullable(ethnicity.getNullable("ethnicity"))

                    fun ssn(): Optional<Boolean> = Optional.ofNullable(ssn.getNullable("ssn"))

                    fun encryptedSsn(): Optional<Boolean> =
                        Optional.ofNullable(encryptedSsn.getNullable("encrypted_ssn"))

                    fun emails(): Optional<Emails> =
                        Optional.ofNullable(emails.getNullable("emails"))

                    fun phoneNumbers(): Optional<PhoneNumbers> =
                        Optional.ofNullable(phoneNumbers.getNullable("phone_numbers"))

                    fun residence(): Optional<Residence> =
                        Optional.ofNullable(residence.getNullable("residence"))

                    @JsonProperty("id") @ExcludeMissing fun _id() = id

                    @JsonProperty("first_name") @ExcludeMissing fun _firstName() = firstName

                    @JsonProperty("middle_name") @ExcludeMissing fun _middleName() = middleName

                    @JsonProperty("last_name") @ExcludeMissing fun _lastName() = lastName

                    @JsonProperty("preferred_name")
                    @ExcludeMissing
                    fun _preferredName() = preferredName

                    @JsonProperty("dob") @ExcludeMissing fun _dob() = dob

                    @JsonProperty("gender") @ExcludeMissing fun _gender() = gender

                    @JsonProperty("ethnicity") @ExcludeMissing fun _ethnicity() = ethnicity

                    @JsonProperty("ssn") @ExcludeMissing fun _ssn() = ssn

                    @JsonProperty("encrypted_ssn")
                    @ExcludeMissing
                    fun _encryptedSsn() = encryptedSsn

                    @JsonProperty("emails") @ExcludeMissing fun _emails() = emails

                    @JsonProperty("phone_numbers")
                    @ExcludeMissing
                    fun _phoneNumbers() = phoneNumbers

                    @JsonProperty("residence") @ExcludeMissing fun _residence() = residence

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(supportedIndividualFields: SupportedIndividualFields) =
                            apply {
                                id = supportedIndividualFields.id
                                firstName = supportedIndividualFields.firstName
                                middleName = supportedIndividualFields.middleName
                                lastName = supportedIndividualFields.lastName
                                preferredName = supportedIndividualFields.preferredName
                                dob = supportedIndividualFields.dob
                                gender = supportedIndividualFields.gender
                                ethnicity = supportedIndividualFields.ethnicity
                                ssn = supportedIndividualFields.ssn
                                encryptedSsn = supportedIndividualFields.encryptedSsn
                                emails = supportedIndividualFields.emails
                                phoneNumbers = supportedIndividualFields.phoneNumbers
                                residence = supportedIndividualFields.residence
                                additionalProperties =
                                    supportedIndividualFields.additionalProperties.toMutableMap()
                            }

                        fun id(id: Boolean) = id(JsonField.of(id))

                        fun id(id: JsonField<Boolean>) = apply { this.id = id }

                        fun firstName(firstName: Boolean) = firstName(JsonField.of(firstName))

                        fun firstName(firstName: JsonField<Boolean>) = apply {
                            this.firstName = firstName
                        }

                        fun middleName(middleName: Boolean) = middleName(JsonField.of(middleName))

                        fun middleName(middleName: JsonField<Boolean>) = apply {
                            this.middleName = middleName
                        }

                        fun lastName(lastName: Boolean) = lastName(JsonField.of(lastName))

                        fun lastName(lastName: JsonField<Boolean>) = apply {
                            this.lastName = lastName
                        }

                        fun preferredName(preferredName: Boolean) =
                            preferredName(JsonField.of(preferredName))

                        fun preferredName(preferredName: JsonField<Boolean>) = apply {
                            this.preferredName = preferredName
                        }

                        fun dob(dob: Boolean) = dob(JsonField.of(dob))

                        fun dob(dob: JsonField<Boolean>) = apply { this.dob = dob }

                        fun gender(gender: Boolean) = gender(JsonField.of(gender))

                        fun gender(gender: JsonField<Boolean>) = apply { this.gender = gender }

                        fun ethnicity(ethnicity: Boolean) = ethnicity(JsonField.of(ethnicity))

                        fun ethnicity(ethnicity: JsonField<Boolean>) = apply {
                            this.ethnicity = ethnicity
                        }

                        fun ssn(ssn: Boolean) = ssn(JsonField.of(ssn))

                        fun ssn(ssn: JsonField<Boolean>) = apply { this.ssn = ssn }

                        fun encryptedSsn(encryptedSsn: Boolean) =
                            encryptedSsn(JsonField.of(encryptedSsn))

                        fun encryptedSsn(encryptedSsn: JsonField<Boolean>) = apply {
                            this.encryptedSsn = encryptedSsn
                        }

                        fun emails(emails: Emails) = emails(JsonField.of(emails))

                        fun emails(emails: JsonField<Emails>) = apply { this.emails = emails }

                        fun phoneNumbers(phoneNumbers: PhoneNumbers) =
                            phoneNumbers(JsonField.of(phoneNumbers))

                        fun phoneNumbers(phoneNumbers: JsonField<PhoneNumbers>) = apply {
                            this.phoneNumbers = phoneNumbers
                        }

                        fun residence(residence: Residence) = residence(JsonField.of(residence))

                        fun residence(residence: JsonField<Residence>) = apply {
                            this.residence = residence
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
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

                    @NoAutoDetect
                    class Emails
                    @JsonCreator
                    private constructor(
                        @JsonProperty("data")
                        @ExcludeMissing
                        private val data: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        private val type: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun data(): Optional<Boolean> =
                            Optional.ofNullable(data.getNullable("data"))

                        fun type(): Optional<Boolean> =
                            Optional.ofNullable(type.getNullable("type"))

                        @JsonProperty("data") @ExcludeMissing fun _data() = data

                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

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
                                data = emails.data
                                type = emails.type
                                additionalProperties = emails.additionalProperties.toMutableMap()
                            }

                            fun data(data: Boolean) = data(JsonField.of(data))

                            fun data(data: JsonField<Boolean>) = apply { this.data = data }

                            fun type(type: Boolean) = type(JsonField.of(type))

                            fun type(type: JsonField<Boolean>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

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

                    @NoAutoDetect
                    class PhoneNumbers
                    @JsonCreator
                    private constructor(
                        @JsonProperty("data")
                        @ExcludeMissing
                        private val data: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        private val type: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun data(): Optional<Boolean> =
                            Optional.ofNullable(data.getNullable("data"))

                        fun type(): Optional<Boolean> =
                            Optional.ofNullable(type.getNullable("type"))

                        @JsonProperty("data") @ExcludeMissing fun _data() = data

                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

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
                                data = phoneNumbers.data
                                type = phoneNumbers.type
                                additionalProperties =
                                    phoneNumbers.additionalProperties.toMutableMap()
                            }

                            fun data(data: Boolean) = data(JsonField.of(data))

                            fun data(data: JsonField<Boolean>) = apply { this.data = data }

                            fun type(type: Boolean) = type(JsonField.of(type))

                            fun type(type: JsonField<Boolean>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

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

                    @NoAutoDetect
                    class Residence
                    @JsonCreator
                    private constructor(
                        @JsonProperty("city")
                        @ExcludeMissing
                        private val city: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("country")
                        @ExcludeMissing
                        private val country: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("line1")
                        @ExcludeMissing
                        private val line1: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("line2")
                        @ExcludeMissing
                        private val line2: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("postal_code")
                        @ExcludeMissing
                        private val postalCode: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("state")
                        @ExcludeMissing
                        private val state: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun city(): Optional<Boolean> =
                            Optional.ofNullable(city.getNullable("city"))

                        fun country(): Optional<Boolean> =
                            Optional.ofNullable(country.getNullable("country"))

                        fun line1(): Optional<Boolean> =
                            Optional.ofNullable(line1.getNullable("line1"))

                        fun line2(): Optional<Boolean> =
                            Optional.ofNullable(line2.getNullable("line2"))

                        fun postalCode(): Optional<Boolean> =
                            Optional.ofNullable(postalCode.getNullable("postal_code"))

                        fun state(): Optional<Boolean> =
                            Optional.ofNullable(state.getNullable("state"))

                        @JsonProperty("city") @ExcludeMissing fun _city() = city

                        @JsonProperty("country") @ExcludeMissing fun _country() = country

                        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

                        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

                        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

                        @JsonProperty("state") @ExcludeMissing fun _state() = state

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

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
                                city = residence.city
                                country = residence.country
                                line1 = residence.line1
                                line2 = residence.line2
                                postalCode = residence.postalCode
                                state = residence.state
                                additionalProperties = residence.additionalProperties.toMutableMap()
                            }

                            fun city(city: Boolean) = city(JsonField.of(city))

                            fun city(city: JsonField<Boolean>) = apply { this.city = city }

                            fun country(country: Boolean) = country(JsonField.of(country))

                            fun country(country: JsonField<Boolean>) = apply {
                                this.country = country
                            }

                            fun line1(line1: Boolean) = line1(JsonField.of(line1))

                            fun line1(line1: JsonField<Boolean>) = apply { this.line1 = line1 }

                            fun line2(line2: Boolean) = line2(JsonField.of(line2))

                            fun line2(line2: JsonField<Boolean>) = apply { this.line2 = line2 }

                            fun postalCode(postalCode: Boolean) =
                                postalCode(JsonField.of(postalCode))

                            fun postalCode(postalCode: JsonField<Boolean>) = apply {
                                this.postalCode = postalCode
                            }

                            fun state(state: Boolean) = state(JsonField.of(state))

                            fun state(state: JsonField<Boolean>) = apply { this.state = state }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

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

                @NoAutoDetect
                class SupportedPayGroupFields
                @JsonCreator
                private constructor(
                    @JsonProperty("id")
                    @ExcludeMissing
                    private val id: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    private val name: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("pay_frequencies")
                    @ExcludeMissing
                    private val payFrequencies: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("individual_ids")
                    @ExcludeMissing
                    private val individualIds: JsonField<Boolean> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

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

                    @JsonProperty("individual_ids")
                    @ExcludeMissing
                    fun _individualIds() = individualIds

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(supportedPayGroupFields: SupportedPayGroupFields) =
                            apply {
                                id = supportedPayGroupFields.id
                                name = supportedPayGroupFields.name
                                payFrequencies = supportedPayGroupFields.payFrequencies
                                individualIds = supportedPayGroupFields.individualIds
                                additionalProperties =
                                    supportedPayGroupFields.additionalProperties.toMutableMap()
                            }

                        fun id(id: Boolean) = id(JsonField.of(id))

                        fun id(id: JsonField<Boolean>) = apply { this.id = id }

                        fun name(name: Boolean) = name(JsonField.of(name))

                        fun name(name: JsonField<Boolean>) = apply { this.name = name }

                        fun payFrequencies(payFrequencies: Boolean) =
                            payFrequencies(JsonField.of(payFrequencies))

                        fun payFrequencies(payFrequencies: JsonField<Boolean>) = apply {
                            this.payFrequencies = payFrequencies
                        }

                        fun individualIds(individualIds: Boolean) =
                            individualIds(JsonField.of(individualIds))

                        fun individualIds(individualIds: JsonField<Boolean>) = apply {
                            this.individualIds = individualIds
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
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

                @NoAutoDetect
                class SupportedPayStatementFields
                @JsonCreator
                private constructor(
                    @JsonProperty("paging")
                    @ExcludeMissing
                    private val paging: JsonField<Paging> = JsonMissing.of(),
                    @JsonProperty("pay_statements")
                    @ExcludeMissing
                    private val payStatements: JsonField<PayStatements> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun paging(): Optional<Paging> =
                        Optional.ofNullable(paging.getNullable("paging"))

                    fun payStatements(): Optional<PayStatements> =
                        Optional.ofNullable(payStatements.getNullable("pay_statements"))

                    @JsonProperty("paging") @ExcludeMissing fun _paging() = paging

                    @JsonProperty("pay_statements")
                    @ExcludeMissing
                    fun _payStatements() = payStatements

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(
                            supportedPayStatementFields: SupportedPayStatementFields
                        ) = apply {
                            paging = supportedPayStatementFields.paging
                            payStatements = supportedPayStatementFields.payStatements
                            additionalProperties =
                                supportedPayStatementFields.additionalProperties.toMutableMap()
                        }

                        fun paging(paging: Paging) = paging(JsonField.of(paging))

                        fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

                        fun payStatements(payStatements: PayStatements) =
                            payStatements(JsonField.of(payStatements))

                        fun payStatements(payStatements: JsonField<PayStatements>) = apply {
                            this.payStatements = payStatements
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): SupportedPayStatementFields =
                            SupportedPayStatementFields(
                                paging,
                                payStatements,
                                additionalProperties.toImmutable(),
                            )
                    }

                    @NoAutoDetect
                    class Paging
                    @JsonCreator
                    private constructor(
                        @JsonProperty("count")
                        @ExcludeMissing
                        private val count: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("offset")
                        @ExcludeMissing
                        private val offset: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun count(): Boolean = count.getRequired("count")

                        fun offset(): Boolean = offset.getRequired("offset")

                        @JsonProperty("count") @ExcludeMissing fun _count() = count

                        @JsonProperty("offset") @ExcludeMissing fun _offset() = offset

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

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
                                count = paging.count
                                offset = paging.offset
                                additionalProperties = paging.additionalProperties.toMutableMap()
                            }

                            fun count(count: Boolean) = count(JsonField.of(count))

                            fun count(count: JsonField<Boolean>) = apply { this.count = count }

                            fun offset(offset: Boolean) = offset(JsonField.of(offset))

                            fun offset(offset: JsonField<Boolean>) = apply { this.offset = offset }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

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

                    @NoAutoDetect
                    class PayStatements
                    @JsonCreator
                    private constructor(
                        @JsonProperty("individual_id")
                        @ExcludeMissing
                        private val individualId: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        private val type: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("payment_method")
                        @ExcludeMissing
                        private val paymentMethod: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("total_hours")
                        @ExcludeMissing
                        private val totalHours: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("gross_pay")
                        @ExcludeMissing
                        private val grossPay: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("net_pay")
                        @ExcludeMissing
                        private val netPay: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("earnings")
                        @ExcludeMissing
                        private val earnings: JsonField<Earnings> = JsonMissing.of(),
                        @JsonProperty("employee_deductions")
                        @ExcludeMissing
                        private val employeeDeductions: JsonField<EmployeeDeductions> =
                            JsonMissing.of(),
                        @JsonProperty("employer_contributions")
                        @ExcludeMissing
                        private val employerContributions: JsonField<EmployerContributions> =
                            JsonMissing.of(),
                        @JsonProperty("taxes")
                        @ExcludeMissing
                        private val taxes: JsonField<Taxes> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun individualId(): Optional<Boolean> =
                            Optional.ofNullable(individualId.getNullable("individual_id"))

                        fun type(): Optional<Boolean> =
                            Optional.ofNullable(type.getNullable("type"))

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
                            Optional.ofNullable(
                                employeeDeductions.getNullable("employee_deductions")
                            )

                        fun employerContributions(): Optional<EmployerContributions> =
                            Optional.ofNullable(
                                employerContributions.getNullable("employer_contributions")
                            )

                        fun taxes(): Optional<Taxes> =
                            Optional.ofNullable(taxes.getNullable("taxes"))

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

                        private var validated: Boolean = false

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
                                individualId = payStatements.individualId
                                type = payStatements.type
                                paymentMethod = payStatements.paymentMethod
                                totalHours = payStatements.totalHours
                                grossPay = payStatements.grossPay
                                netPay = payStatements.netPay
                                earnings = payStatements.earnings
                                employeeDeductions = payStatements.employeeDeductions
                                employerContributions = payStatements.employerContributions
                                taxes = payStatements.taxes
                                additionalProperties =
                                    payStatements.additionalProperties.toMutableMap()
                            }

                            fun individualId(individualId: Boolean) =
                                individualId(JsonField.of(individualId))

                            fun individualId(individualId: JsonField<Boolean>) = apply {
                                this.individualId = individualId
                            }

                            fun type(type: Boolean) = type(JsonField.of(type))

                            fun type(type: JsonField<Boolean>) = apply { this.type = type }

                            fun paymentMethod(paymentMethod: Boolean) =
                                paymentMethod(JsonField.of(paymentMethod))

                            fun paymentMethod(paymentMethod: JsonField<Boolean>) = apply {
                                this.paymentMethod = paymentMethod
                            }

                            fun totalHours(totalHours: Boolean) =
                                totalHours(JsonField.of(totalHours))

                            fun totalHours(totalHours: JsonField<Boolean>) = apply {
                                this.totalHours = totalHours
                            }

                            fun grossPay(grossPay: Boolean) = grossPay(JsonField.of(grossPay))

                            fun grossPay(grossPay: JsonField<Boolean>) = apply {
                                this.grossPay = grossPay
                            }

                            fun netPay(netPay: Boolean) = netPay(JsonField.of(netPay))

                            fun netPay(netPay: JsonField<Boolean>) = apply { this.netPay = netPay }

                            fun earnings(earnings: Earnings) = earnings(JsonField.of(earnings))

                            fun earnings(earnings: JsonField<Earnings>) = apply {
                                this.earnings = earnings
                            }

                            fun employeeDeductions(employeeDeductions: EmployeeDeductions) =
                                employeeDeductions(JsonField.of(employeeDeductions))

                            fun employeeDeductions(
                                employeeDeductions: JsonField<EmployeeDeductions>
                            ) = apply { this.employeeDeductions = employeeDeductions }

                            fun employerContributions(
                                employerContributions: EmployerContributions
                            ) = employerContributions(JsonField.of(employerContributions))

                            fun employerContributions(
                                employerContributions: JsonField<EmployerContributions>
                            ) = apply { this.employerContributions = employerContributions }

                            fun taxes(taxes: Taxes) = taxes(JsonField.of(taxes))

                            fun taxes(taxes: JsonField<Taxes>) = apply { this.taxes = taxes }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

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

                        @NoAutoDetect
                        class Earnings
                        @JsonCreator
                        private constructor(
                            @JsonProperty("type")
                            @ExcludeMissing
                            private val type: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("name")
                            @ExcludeMissing
                            private val name: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("amount")
                            @ExcludeMissing
                            private val amount: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("currency")
                            @ExcludeMissing
                            private val currency: JsonField<Boolean> = JsonMissing.of(),
                            @JsonAnySetter
                            private val additionalProperties: Map<String, JsonValue> =
                                immutableEmptyMap(),
                        ) {

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
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            private var validated: Boolean = false

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
                                    type = earnings.type
                                    name = earnings.name
                                    amount = earnings.amount
                                    currency = earnings.currency
                                    additionalProperties =
                                        earnings.additionalProperties.toMutableMap()
                                }

                                fun type(type: Boolean) = type(JsonField.of(type))

                                fun type(type: JsonField<Boolean>) = apply { this.type = type }

                                fun name(name: Boolean) = name(JsonField.of(name))

                                fun name(name: JsonField<Boolean>) = apply { this.name = name }

                                fun amount(amount: Boolean) = amount(JsonField.of(amount))

                                fun amount(amount: JsonField<Boolean>) = apply {
                                    this.amount = amount
                                }

                                fun currency(currency: Boolean) = currency(JsonField.of(currency))

                                fun currency(currency: JsonField<Boolean>) = apply {
                                    this.currency = currency
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

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

                        @NoAutoDetect
                        class EmployeeDeductions
                        @JsonCreator
                        private constructor(
                            @JsonProperty("name")
                            @ExcludeMissing
                            private val name: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("amount")
                            @ExcludeMissing
                            private val amount: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            private val type: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("pre_tax")
                            @ExcludeMissing
                            private val preTax: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("currency")
                            @ExcludeMissing
                            private val currency: JsonField<Boolean> = JsonMissing.of(),
                            @JsonAnySetter
                            private val additionalProperties: Map<String, JsonValue> =
                                immutableEmptyMap(),
                        ) {

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
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            private var validated: Boolean = false

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
                                    name = employeeDeductions.name
                                    amount = employeeDeductions.amount
                                    type = employeeDeductions.type
                                    preTax = employeeDeductions.preTax
                                    currency = employeeDeductions.currency
                                    additionalProperties =
                                        employeeDeductions.additionalProperties.toMutableMap()
                                }

                                fun name(name: Boolean) = name(JsonField.of(name))

                                fun name(name: JsonField<Boolean>) = apply { this.name = name }

                                fun amount(amount: Boolean) = amount(JsonField.of(amount))

                                fun amount(amount: JsonField<Boolean>) = apply {
                                    this.amount = amount
                                }

                                fun type(type: Boolean) = type(JsonField.of(type))

                                fun type(type: JsonField<Boolean>) = apply { this.type = type }

                                fun preTax(preTax: Boolean) = preTax(JsonField.of(preTax))

                                fun preTax(preTax: JsonField<Boolean>) = apply {
                                    this.preTax = preTax
                                }

                                fun currency(currency: Boolean) = currency(JsonField.of(currency))

                                fun currency(currency: JsonField<Boolean>) = apply {
                                    this.currency = currency
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

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

                        @NoAutoDetect
                        class EmployerContributions
                        @JsonCreator
                        private constructor(
                            @JsonProperty("name")
                            @ExcludeMissing
                            private val name: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("amount")
                            @ExcludeMissing
                            private val amount: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("currency")
                            @ExcludeMissing
                            private val currency: JsonField<Boolean> = JsonMissing.of(),
                            @JsonAnySetter
                            private val additionalProperties: Map<String, JsonValue> =
                                immutableEmptyMap(),
                        ) {

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
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            private var validated: Boolean = false

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
                                        name = employerContributions.name
                                        amount = employerContributions.amount
                                        currency = employerContributions.currency
                                        additionalProperties =
                                            employerContributions.additionalProperties
                                                .toMutableMap()
                                    }

                                fun name(name: Boolean) = name(JsonField.of(name))

                                fun name(name: JsonField<Boolean>) = apply { this.name = name }

                                fun amount(amount: Boolean) = amount(JsonField.of(amount))

                                fun amount(amount: JsonField<Boolean>) = apply {
                                    this.amount = amount
                                }

                                fun currency(currency: Boolean) = currency(JsonField.of(currency))

                                fun currency(currency: JsonField<Boolean>) = apply {
                                    this.currency = currency
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

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

                        @NoAutoDetect
                        class Taxes
                        @JsonCreator
                        private constructor(
                            @JsonProperty("type")
                            @ExcludeMissing
                            private val type: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("name")
                            @ExcludeMissing
                            private val name: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("employer")
                            @ExcludeMissing
                            private val employer: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("amount")
                            @ExcludeMissing
                            private val amount: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("currency")
                            @ExcludeMissing
                            private val currency: JsonField<Boolean> = JsonMissing.of(),
                            @JsonAnySetter
                            private val additionalProperties: Map<String, JsonValue> =
                                immutableEmptyMap(),
                        ) {

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
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            private var validated: Boolean = false

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
                                    type = taxes.type
                                    name = taxes.name
                                    employer = taxes.employer
                                    amount = taxes.amount
                                    currency = taxes.currency
                                    additionalProperties = taxes.additionalProperties.toMutableMap()
                                }

                                fun type(type: Boolean) = type(JsonField.of(type))

                                fun type(type: JsonField<Boolean>) = apply { this.type = type }

                                fun name(name: Boolean) = name(JsonField.of(name))

                                fun name(name: JsonField<Boolean>) = apply { this.name = name }

                                fun employer(employer: Boolean) = employer(JsonField.of(employer))

                                fun employer(employer: JsonField<Boolean>) = apply {
                                    this.employer = employer
                                }

                                fun amount(amount: Boolean) = amount(JsonField.of(amount))

                                fun amount(amount: JsonField<Boolean>) = apply {
                                    this.amount = amount
                                }

                                fun currency(currency: Boolean) = currency(JsonField.of(currency))

                                fun currency(currency: JsonField<Boolean>) = apply {
                                    this.currency = currency
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

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

                @NoAutoDetect
                class SupportedPaymentFields
                @JsonCreator
                private constructor(
                    @JsonProperty("id")
                    @ExcludeMissing
                    private val id: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("pay_date")
                    @ExcludeMissing
                    private val payDate: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("debit_date")
                    @ExcludeMissing
                    private val debitDate: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("company_debit")
                    @ExcludeMissing
                    private val companyDebit: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("gross_pay")
                    @ExcludeMissing
                    private val grossPay: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("net_pay")
                    @ExcludeMissing
                    private val netPay: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("employer_taxes")
                    @ExcludeMissing
                    private val employerTaxes: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("employee_taxes")
                    @ExcludeMissing
                    private val employeeTaxes: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("individual_ids")
                    @ExcludeMissing
                    private val individualIds: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("pay_period")
                    @ExcludeMissing
                    private val payPeriod: JsonField<PayPeriod> = JsonMissing.of(),
                    @JsonProperty("pay_group_ids")
                    @ExcludeMissing
                    private val payGroupIds: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("pay_frequencies")
                    @ExcludeMissing
                    private val payFrequencies: JsonField<Boolean> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun id(): Optional<Boolean> = Optional.ofNullable(id.getNullable("id"))

                    fun payDate(): Optional<Boolean> =
                        Optional.ofNullable(payDate.getNullable("pay_date"))

                    fun debitDate(): Optional<Boolean> =
                        Optional.ofNullable(debitDate.getNullable("debit_date"))

                    fun companyDebit(): Optional<Boolean> =
                        Optional.ofNullable(companyDebit.getNullable("company_debit"))

                    fun grossPay(): Optional<Boolean> =
                        Optional.ofNullable(grossPay.getNullable("gross_pay"))

                    fun netPay(): Optional<Boolean> =
                        Optional.ofNullable(netPay.getNullable("net_pay"))

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

                    @JsonProperty("company_debit")
                    @ExcludeMissing
                    fun _companyDebit() = companyDebit

                    @JsonProperty("gross_pay") @ExcludeMissing fun _grossPay() = grossPay

                    @JsonProperty("net_pay") @ExcludeMissing fun _netPay() = netPay

                    @JsonProperty("employer_taxes")
                    @ExcludeMissing
                    fun _employerTaxes() = employerTaxes

                    @JsonProperty("employee_taxes")
                    @ExcludeMissing
                    fun _employeeTaxes() = employeeTaxes

                    @JsonProperty("individual_ids")
                    @ExcludeMissing
                    fun _individualIds() = individualIds

                    @JsonProperty("pay_period") @ExcludeMissing fun _payPeriod() = payPeriod

                    @JsonProperty("pay_group_ids") @ExcludeMissing fun _payGroupIds() = payGroupIds

                    @JsonProperty("pay_frequencies")
                    @ExcludeMissing
                    fun _payFrequencies() = payFrequencies

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(supportedPaymentFields: SupportedPaymentFields) = apply {
                            id = supportedPaymentFields.id
                            payDate = supportedPaymentFields.payDate
                            debitDate = supportedPaymentFields.debitDate
                            companyDebit = supportedPaymentFields.companyDebit
                            grossPay = supportedPaymentFields.grossPay
                            netPay = supportedPaymentFields.netPay
                            employerTaxes = supportedPaymentFields.employerTaxes
                            employeeTaxes = supportedPaymentFields.employeeTaxes
                            individualIds = supportedPaymentFields.individualIds
                            payPeriod = supportedPaymentFields.payPeriod
                            payGroupIds = supportedPaymentFields.payGroupIds
                            payFrequencies = supportedPaymentFields.payFrequencies
                            additionalProperties =
                                supportedPaymentFields.additionalProperties.toMutableMap()
                        }

                        fun id(id: Boolean) = id(JsonField.of(id))

                        fun id(id: JsonField<Boolean>) = apply { this.id = id }

                        fun payDate(payDate: Boolean) = payDate(JsonField.of(payDate))

                        fun payDate(payDate: JsonField<Boolean>) = apply { this.payDate = payDate }

                        fun debitDate(debitDate: Boolean) = debitDate(JsonField.of(debitDate))

                        fun debitDate(debitDate: JsonField<Boolean>) = apply {
                            this.debitDate = debitDate
                        }

                        fun companyDebit(companyDebit: Boolean) =
                            companyDebit(JsonField.of(companyDebit))

                        fun companyDebit(companyDebit: JsonField<Boolean>) = apply {
                            this.companyDebit = companyDebit
                        }

                        fun grossPay(grossPay: Boolean) = grossPay(JsonField.of(grossPay))

                        fun grossPay(grossPay: JsonField<Boolean>) = apply {
                            this.grossPay = grossPay
                        }

                        fun netPay(netPay: Boolean) = netPay(JsonField.of(netPay))

                        fun netPay(netPay: JsonField<Boolean>) = apply { this.netPay = netPay }

                        fun employerTaxes(employerTaxes: Boolean) =
                            employerTaxes(JsonField.of(employerTaxes))

                        fun employerTaxes(employerTaxes: JsonField<Boolean>) = apply {
                            this.employerTaxes = employerTaxes
                        }

                        fun employeeTaxes(employeeTaxes: Boolean) =
                            employeeTaxes(JsonField.of(employeeTaxes))

                        fun employeeTaxes(employeeTaxes: JsonField<Boolean>) = apply {
                            this.employeeTaxes = employeeTaxes
                        }

                        fun individualIds(individualIds: Boolean) =
                            individualIds(JsonField.of(individualIds))

                        fun individualIds(individualIds: JsonField<Boolean>) = apply {
                            this.individualIds = individualIds
                        }

                        fun payPeriod(payPeriod: PayPeriod) = payPeriod(JsonField.of(payPeriod))

                        fun payPeriod(payPeriod: JsonField<PayPeriod>) = apply {
                            this.payPeriod = payPeriod
                        }

                        fun payGroupIds(payGroupIds: Boolean) =
                            payGroupIds(JsonField.of(payGroupIds))

                        fun payGroupIds(payGroupIds: JsonField<Boolean>) = apply {
                            this.payGroupIds = payGroupIds
                        }

                        fun payFrequencies(payFrequencies: Boolean) =
                            payFrequencies(JsonField.of(payFrequencies))

                        fun payFrequencies(payFrequencies: JsonField<Boolean>) = apply {
                            this.payFrequencies = payFrequencies
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
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

                    @NoAutoDetect
                    class PayPeriod
                    @JsonCreator
                    private constructor(
                        @JsonProperty("start_date")
                        @ExcludeMissing
                        private val startDate: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("end_date")
                        @ExcludeMissing
                        private val endDate: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun startDate(): Optional<Boolean> =
                            Optional.ofNullable(startDate.getNullable("start_date"))

                        fun endDate(): Optional<Boolean> =
                            Optional.ofNullable(endDate.getNullable("end_date"))

                        @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

                        @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

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
                                startDate = payPeriod.startDate
                                endDate = payPeriod.endDate
                                additionalProperties = payPeriod.additionalProperties.toMutableMap()
                            }

                            fun startDate(startDate: Boolean) = startDate(JsonField.of(startDate))

                            fun startDate(startDate: JsonField<Boolean>) = apply {
                                this.startDate = startDate
                            }

                            fun endDate(endDate: Boolean) = endDate(JsonField.of(endDate))

                            fun endDate(endDate: JsonField<Boolean>) = apply {
                                this.endDate = endDate
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

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

            return /* spotless:off */ other is Data && status == other.status && authenticationMethod == other.authenticationMethod && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(status, authenticationMethod, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{status=$status, authenticationMethod=$authenticationMethod, additionalProperties=$additionalProperties}"
    }

    class EventType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACCOUNT_UPDATED = of("account.updated")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT_UPDATED,
        }

        enum class Value {
            ACCOUNT_UPDATED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCOUNT_UPDATED -> Value.ACCOUNT_UPDATED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCOUNT_UPDATED -> Known.ACCOUNT_UPDATED
                else -> throw FinchInvalidDataException("Unknown EventType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EventType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountUpdateEvent && connectionId == other.connectionId && companyId == other.companyId && accountId == other.accountId && eventType == other.eventType && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(connectionId, companyId, accountId, eventType, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountUpdateEvent{connectionId=$connectionId, companyId=$companyId, accountId=$accountId, eventType=$eventType, data=$data, additionalProperties=$additionalProperties}"
}

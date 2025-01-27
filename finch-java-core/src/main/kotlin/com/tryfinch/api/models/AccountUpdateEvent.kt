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
class AccountUpdateEvent
@JsonCreator
private constructor(
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("company_id")
    @ExcludeMissing
    private val companyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("connection_id")
    @ExcludeMissing
    private val connectionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Data> = JsonMissing.of(),
    @JsonProperty("event_type")
    @ExcludeMissing
    private val eventType: JsonField<EventType> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    @Deprecated("deprecated") fun accountId(): String = accountId.getRequired("account_id")

    /**
     * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    @Deprecated("deprecated") fun companyId(): String = companyId.getRequired("company_id")

    /** Unique Finch ID of the connection associated with the webhook event. */
    fun connectionId(): Optional<String> =
        Optional.ofNullable(connectionId.getNullable("connection_id"))

    fun data(): Optional<Data> = Optional.ofNullable(data.getNullable("data"))

    fun eventType(): Optional<EventType> = Optional.ofNullable(eventType.getNullable("event_type"))

    /**
     * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    @Deprecated("deprecated")
    @JsonProperty("account_id")
    @ExcludeMissing
    fun _accountId(): JsonField<String> = accountId

    /**
     * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    @Deprecated("deprecated")
    @JsonProperty("company_id")
    @ExcludeMissing
    fun _companyId(): JsonField<String> = companyId

    /** Unique Finch ID of the connection associated with the webhook event. */
    @JsonProperty("connection_id")
    @ExcludeMissing
    fun _connectionId(): JsonField<String> = connectionId

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun toBaseWebhookEvent(): BaseWebhookEvent =
        BaseWebhookEvent.builder()
            .accountId(accountId)
            .companyId(companyId)
            .connectionId(connectionId)
            .build()

    private var validated: Boolean = false

    fun validate(): AccountUpdateEvent = apply {
        if (validated) {
            return@apply
        }

        accountId()
        companyId()
        connectionId()
        data().ifPresent { it.validate() }
        eventType()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountUpdateEvent]. */
    class Builder internal constructor() {

        private var accountId: JsonField<String>? = null
        private var companyId: JsonField<String>? = null
        private var connectionId: JsonField<String> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var eventType: JsonField<EventType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountUpdateEvent: AccountUpdateEvent) = apply {
            accountId = accountUpdateEvent.accountId
            companyId = accountUpdateEvent.companyId
            connectionId = accountUpdateEvent.connectionId
            data = accountUpdateEvent.data
            eventType = accountUpdateEvent.eventType
            additionalProperties = accountUpdateEvent.additionalProperties.toMutableMap()
        }

        /**
         * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        @Deprecated("deprecated")
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        @Deprecated("deprecated")
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        @Deprecated("deprecated")
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /**
         * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        @Deprecated("deprecated")
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /** Unique Finch ID of the connection associated with the webhook event. */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /** Unique Finch ID of the connection associated with the webhook event. */
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        fun data(data: Data) = data(JsonField.of(data))

        fun data(data: JsonField<Data>) = apply { this.data = data }

        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

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
                checkRequired("accountId", accountId),
                checkRequired("companyId", companyId),
                connectionId,
                data,
                eventType,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("authentication_method")
        @ExcludeMissing
        private val authenticationMethod: JsonField<AuthenticationMethod> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<ConnectionStatusType> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun authenticationMethod(): AuthenticationMethod =
            authenticationMethod.getRequired("authentication_method")

        fun status(): ConnectionStatusType = status.getRequired("status")

        @JsonProperty("authentication_method")
        @ExcludeMissing
        fun _authenticationMethod(): JsonField<AuthenticationMethod> = authenticationMethod

        @JsonProperty("status")
        @ExcludeMissing
        fun _status(): JsonField<ConnectionStatusType> = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            authenticationMethod().validate()
            status()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var authenticationMethod: JsonField<AuthenticationMethod>? = null
            private var status: JsonField<ConnectionStatusType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                authenticationMethod = data.authenticationMethod
                status = data.status
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun authenticationMethod(authenticationMethod: AuthenticationMethod) =
                authenticationMethod(JsonField.of(authenticationMethod))

            fun authenticationMethod(authenticationMethod: JsonField<AuthenticationMethod>) =
                apply {
                    this.authenticationMethod = authenticationMethod
                }

            fun status(status: ConnectionStatusType) = status(JsonField.of(status))

            fun status(status: JsonField<ConnectionStatusType>) = apply { this.status = status }

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
                    checkRequired("authenticationMethod", authenticationMethod),
                    checkRequired("status", status),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class AuthenticationMethod
        @JsonCreator
        private constructor(
            @JsonProperty("benefits_support")
            @ExcludeMissing
            private val benefitsSupport: JsonField<BenefitsSupport> = JsonMissing.of(),
            @JsonProperty("supported_fields")
            @ExcludeMissing
            private val supportedFields: JsonField<SupportedFields> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

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
            fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

            /**
             * Each benefit type and their supported features. If the benefit type is not supported,
             * the property will be null
             */
            @JsonProperty("benefits_support")
            @ExcludeMissing
            fun _benefitsSupport(): JsonField<BenefitsSupport> = benefitsSupport

            /** The supported data fields returned by our HR and payroll endpoints */
            @JsonProperty("supported_fields")
            @ExcludeMissing
            fun _supportedFields(): JsonField<SupportedFields> = supportedFields

            /** The type of authentication method. */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AuthenticationMethod = apply {
                if (validated) {
                    return@apply
                }

                benefitsSupport().ifPresent { it.validate() }
                supportedFields().ifPresent { it.validate() }
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AuthenticationMethod]. */
            class Builder internal constructor() {

                private var benefitsSupport: JsonField<BenefitsSupport> = JsonMissing.of()
                private var supportedFields: JsonField<SupportedFields> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(authenticationMethod: AuthenticationMethod) = apply {
                    benefitsSupport = authenticationMethod.benefitsSupport
                    supportedFields = authenticationMethod.supportedFields
                    type = authenticationMethod.type
                    additionalProperties = authenticationMethod.additionalProperties.toMutableMap()
                }

                /**
                 * Each benefit type and their supported features. If the benefit type is not
                 * supported, the property will be null
                 */
                fun benefitsSupport(benefitsSupport: BenefitsSupport?) =
                    benefitsSupport(JsonField.ofNullable(benefitsSupport))

                /**
                 * Each benefit type and their supported features. If the benefit type is not
                 * supported, the property will be null
                 */
                fun benefitsSupport(benefitsSupport: Optional<BenefitsSupport>) =
                    benefitsSupport(benefitsSupport.orElse(null))

                /**
                 * Each benefit type and their supported features. If the benefit type is not
                 * supported, the property will be null
                 */
                fun benefitsSupport(benefitsSupport: JsonField<BenefitsSupport>) = apply {
                    this.benefitsSupport = benefitsSupport
                }

                /** The supported data fields returned by our HR and payroll endpoints */
                fun supportedFields(supportedFields: SupportedFields?) =
                    supportedFields(JsonField.ofNullable(supportedFields))

                /** The supported data fields returned by our HR and payroll endpoints */
                fun supportedFields(supportedFields: Optional<SupportedFields>) =
                    supportedFields(supportedFields.orElse(null))

                /** The supported data fields returned by our HR and payroll endpoints */
                fun supportedFields(supportedFields: JsonField<SupportedFields>) = apply {
                    this.supportedFields = supportedFields
                }

                /** The type of authentication method. */
                fun type(type: Type) = type(JsonField.of(type))

                /** The type of authentication method. */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                        benefitsSupport,
                        supportedFields,
                        type,
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
                @JsonProperty("employment")
                @ExcludeMissing
                private val employment: JsonField<SupportedEmploymentFields> = JsonMissing.of(),
                @JsonProperty("individual")
                @ExcludeMissing
                private val individual: JsonField<SupportedIndividualFields> = JsonMissing.of(),
                @JsonProperty("pay_group")
                @ExcludeMissing
                private val payGroup: JsonField<SupportedPayGroupFields> = JsonMissing.of(),
                @JsonProperty("pay_statement")
                @ExcludeMissing
                private val payStatement: JsonField<SupportedPayStatementFields> = JsonMissing.of(),
                @JsonProperty("payment")
                @ExcludeMissing
                private val payment: JsonField<SupportedPaymentFields> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun company(): Optional<SupportedCompanyFields> =
                    Optional.ofNullable(company.getNullable("company"))

                fun directory(): Optional<SupportedDirectoryFields> =
                    Optional.ofNullable(directory.getNullable("directory"))

                fun employment(): Optional<SupportedEmploymentFields> =
                    Optional.ofNullable(employment.getNullable("employment"))

                fun individual(): Optional<SupportedIndividualFields> =
                    Optional.ofNullable(individual.getNullable("individual"))

                fun payGroup(): Optional<SupportedPayGroupFields> =
                    Optional.ofNullable(payGroup.getNullable("pay_group"))

                fun payStatement(): Optional<SupportedPayStatementFields> =
                    Optional.ofNullable(payStatement.getNullable("pay_statement"))

                fun payment(): Optional<SupportedPaymentFields> =
                    Optional.ofNullable(payment.getNullable("payment"))

                @JsonProperty("company")
                @ExcludeMissing
                fun _company(): JsonField<SupportedCompanyFields> = company

                @JsonProperty("directory")
                @ExcludeMissing
                fun _directory(): JsonField<SupportedDirectoryFields> = directory

                @JsonProperty("employment")
                @ExcludeMissing
                fun _employment(): JsonField<SupportedEmploymentFields> = employment

                @JsonProperty("individual")
                @ExcludeMissing
                fun _individual(): JsonField<SupportedIndividualFields> = individual

                @JsonProperty("pay_group")
                @ExcludeMissing
                fun _payGroup(): JsonField<SupportedPayGroupFields> = payGroup

                @JsonProperty("pay_statement")
                @ExcludeMissing
                fun _payStatement(): JsonField<SupportedPayStatementFields> = payStatement

                @JsonProperty("payment")
                @ExcludeMissing
                fun _payment(): JsonField<SupportedPaymentFields> = payment

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): SupportedFields = apply {
                    if (validated) {
                        return@apply
                    }

                    company().ifPresent { it.validate() }
                    directory().ifPresent { it.validate() }
                    employment().ifPresent { it.validate() }
                    individual().ifPresent { it.validate() }
                    payGroup().ifPresent { it.validate() }
                    payStatement().ifPresent { it.validate() }
                    payment().ifPresent { it.validate() }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SupportedFields]. */
                class Builder internal constructor() {

                    private var company: JsonField<SupportedCompanyFields> = JsonMissing.of()
                    private var directory: JsonField<SupportedDirectoryFields> = JsonMissing.of()
                    private var employment: JsonField<SupportedEmploymentFields> = JsonMissing.of()
                    private var individual: JsonField<SupportedIndividualFields> = JsonMissing.of()
                    private var payGroup: JsonField<SupportedPayGroupFields> = JsonMissing.of()
                    private var payStatement: JsonField<SupportedPayStatementFields> =
                        JsonMissing.of()
                    private var payment: JsonField<SupportedPaymentFields> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(supportedFields: SupportedFields) = apply {
                        company = supportedFields.company
                        directory = supportedFields.directory
                        employment = supportedFields.employment
                        individual = supportedFields.individual
                        payGroup = supportedFields.payGroup
                        payStatement = supportedFields.payStatement
                        payment = supportedFields.payment
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

                    fun employment(employment: SupportedEmploymentFields) =
                        employment(JsonField.of(employment))

                    fun employment(employment: JsonField<SupportedEmploymentFields>) = apply {
                        this.employment = employment
                    }

                    fun individual(individual: SupportedIndividualFields) =
                        individual(JsonField.of(individual))

                    fun individual(individual: JsonField<SupportedIndividualFields>) = apply {
                        this.individual = individual
                    }

                    fun payGroup(payGroup: SupportedPayGroupFields) =
                        payGroup(JsonField.of(payGroup))

                    fun payGroup(payGroup: JsonField<SupportedPayGroupFields>) = apply {
                        this.payGroup = payGroup
                    }

                    fun payStatement(payStatement: SupportedPayStatementFields) =
                        payStatement(JsonField.of(payStatement))

                    fun payStatement(payStatement: JsonField<SupportedPayStatementFields>) = apply {
                        this.payStatement = payStatement
                    }

                    fun payment(payment: SupportedPaymentFields) = payment(JsonField.of(payment))

                    fun payment(payment: JsonField<SupportedPaymentFields>) = apply {
                        this.payment = payment
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
                            employment,
                            individual,
                            payGroup,
                            payStatement,
                            payment,
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
                    @JsonProperty("accounts")
                    @ExcludeMissing
                    private val accounts: JsonField<Accounts> = JsonMissing.of(),
                    @JsonProperty("departments")
                    @ExcludeMissing
                    private val departments: JsonField<Departments> = JsonMissing.of(),
                    @JsonProperty("ein")
                    @ExcludeMissing
                    private val ein: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("entity")
                    @ExcludeMissing
                    private val entity: JsonField<Entity> = JsonMissing.of(),
                    @JsonProperty("legal_name")
                    @ExcludeMissing
                    private val legalName: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("locations")
                    @ExcludeMissing
                    private val locations: JsonField<Locations> = JsonMissing.of(),
                    @JsonProperty("primary_email")
                    @ExcludeMissing
                    private val primaryEmail: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("primary_phone_number")
                    @ExcludeMissing
                    private val primaryPhoneNumber: JsonField<Boolean> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun id(): Optional<Boolean> = Optional.ofNullable(id.getNullable("id"))

                    fun accounts(): Optional<Accounts> =
                        Optional.ofNullable(accounts.getNullable("accounts"))

                    fun departments(): Optional<Departments> =
                        Optional.ofNullable(departments.getNullable("departments"))

                    fun ein(): Optional<Boolean> = Optional.ofNullable(ein.getNullable("ein"))

                    fun entity(): Optional<Entity> =
                        Optional.ofNullable(entity.getNullable("entity"))

                    fun legalName(): Optional<Boolean> =
                        Optional.ofNullable(legalName.getNullable("legal_name"))

                    fun locations(): Optional<Locations> =
                        Optional.ofNullable(locations.getNullable("locations"))

                    fun primaryEmail(): Optional<Boolean> =
                        Optional.ofNullable(primaryEmail.getNullable("primary_email"))

                    fun primaryPhoneNumber(): Optional<Boolean> =
                        Optional.ofNullable(primaryPhoneNumber.getNullable("primary_phone_number"))

                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Boolean> = id

                    @JsonProperty("accounts")
                    @ExcludeMissing
                    fun _accounts(): JsonField<Accounts> = accounts

                    @JsonProperty("departments")
                    @ExcludeMissing
                    fun _departments(): JsonField<Departments> = departments

                    @JsonProperty("ein") @ExcludeMissing fun _ein(): JsonField<Boolean> = ein

                    @JsonProperty("entity")
                    @ExcludeMissing
                    fun _entity(): JsonField<Entity> = entity

                    @JsonProperty("legal_name")
                    @ExcludeMissing
                    fun _legalName(): JsonField<Boolean> = legalName

                    @JsonProperty("locations")
                    @ExcludeMissing
                    fun _locations(): JsonField<Locations> = locations

                    @JsonProperty("primary_email")
                    @ExcludeMissing
                    fun _primaryEmail(): JsonField<Boolean> = primaryEmail

                    @JsonProperty("primary_phone_number")
                    @ExcludeMissing
                    fun _primaryPhoneNumber(): JsonField<Boolean> = primaryPhoneNumber

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): SupportedCompanyFields = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        accounts().ifPresent { it.validate() }
                        departments().ifPresent { it.validate() }
                        ein()
                        entity().ifPresent { it.validate() }
                        legalName()
                        locations().ifPresent { it.validate() }
                        primaryEmail()
                        primaryPhoneNumber()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [SupportedCompanyFields]. */
                    class Builder internal constructor() {

                        private var id: JsonField<Boolean> = JsonMissing.of()
                        private var accounts: JsonField<Accounts> = JsonMissing.of()
                        private var departments: JsonField<Departments> = JsonMissing.of()
                        private var ein: JsonField<Boolean> = JsonMissing.of()
                        private var entity: JsonField<Entity> = JsonMissing.of()
                        private var legalName: JsonField<Boolean> = JsonMissing.of()
                        private var locations: JsonField<Locations> = JsonMissing.of()
                        private var primaryEmail: JsonField<Boolean> = JsonMissing.of()
                        private var primaryPhoneNumber: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(supportedCompanyFields: SupportedCompanyFields) = apply {
                            id = supportedCompanyFields.id
                            accounts = supportedCompanyFields.accounts
                            departments = supportedCompanyFields.departments
                            ein = supportedCompanyFields.ein
                            entity = supportedCompanyFields.entity
                            legalName = supportedCompanyFields.legalName
                            locations = supportedCompanyFields.locations
                            primaryEmail = supportedCompanyFields.primaryEmail
                            primaryPhoneNumber = supportedCompanyFields.primaryPhoneNumber
                            additionalProperties =
                                supportedCompanyFields.additionalProperties.toMutableMap()
                        }

                        fun id(id: Boolean) = id(JsonField.of(id))

                        fun id(id: JsonField<Boolean>) = apply { this.id = id }

                        fun accounts(accounts: Accounts) = accounts(JsonField.of(accounts))

                        fun accounts(accounts: JsonField<Accounts>) = apply {
                            this.accounts = accounts
                        }

                        fun departments(departments: Departments) =
                            departments(JsonField.of(departments))

                        fun departments(departments: JsonField<Departments>) = apply {
                            this.departments = departments
                        }

                        fun ein(ein: Boolean) = ein(JsonField.of(ein))

                        fun ein(ein: JsonField<Boolean>) = apply { this.ein = ein }

                        fun entity(entity: Entity) = entity(JsonField.of(entity))

                        fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

                        fun legalName(legalName: Boolean) = legalName(JsonField.of(legalName))

                        fun legalName(legalName: JsonField<Boolean>) = apply {
                            this.legalName = legalName
                        }

                        fun locations(locations: Locations) = locations(JsonField.of(locations))

                        fun locations(locations: JsonField<Locations>) = apply {
                            this.locations = locations
                        }

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
                                accounts,
                                departments,
                                ein,
                                entity,
                                legalName,
                                locations,
                                primaryEmail,
                                primaryPhoneNumber,
                                additionalProperties.toImmutable(),
                            )
                    }

                    @NoAutoDetect
                    class Accounts
                    @JsonCreator
                    private constructor(
                        @JsonProperty("account_name")
                        @ExcludeMissing
                        private val accountName: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("account_number")
                        @ExcludeMissing
                        private val accountNumber: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("account_type")
                        @ExcludeMissing
                        private val accountType: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("institution_name")
                        @ExcludeMissing
                        private val institutionName: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("routing_number")
                        @ExcludeMissing
                        private val routingNumber: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun accountName(): Optional<Boolean> =
                            Optional.ofNullable(accountName.getNullable("account_name"))

                        fun accountNumber(): Optional<Boolean> =
                            Optional.ofNullable(accountNumber.getNullable("account_number"))

                        fun accountType(): Optional<Boolean> =
                            Optional.ofNullable(accountType.getNullable("account_type"))

                        fun institutionName(): Optional<Boolean> =
                            Optional.ofNullable(institutionName.getNullable("institution_name"))

                        fun routingNumber(): Optional<Boolean> =
                            Optional.ofNullable(routingNumber.getNullable("routing_number"))

                        @JsonProperty("account_name")
                        @ExcludeMissing
                        fun _accountName(): JsonField<Boolean> = accountName

                        @JsonProperty("account_number")
                        @ExcludeMissing
                        fun _accountNumber(): JsonField<Boolean> = accountNumber

                        @JsonProperty("account_type")
                        @ExcludeMissing
                        fun _accountType(): JsonField<Boolean> = accountType

                        @JsonProperty("institution_name")
                        @ExcludeMissing
                        fun _institutionName(): JsonField<Boolean> = institutionName

                        @JsonProperty("routing_number")
                        @ExcludeMissing
                        fun _routingNumber(): JsonField<Boolean> = routingNumber

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Accounts = apply {
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

                        /** A builder for [Accounts]. */
                        class Builder internal constructor() {

                            private var accountName: JsonField<Boolean> = JsonMissing.of()
                            private var accountNumber: JsonField<Boolean> = JsonMissing.of()
                            private var accountType: JsonField<Boolean> = JsonMissing.of()
                            private var institutionName: JsonField<Boolean> = JsonMissing.of()
                            private var routingNumber: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(accounts: Accounts) = apply {
                                accountName = accounts.accountName
                                accountNumber = accounts.accountNumber
                                accountType = accounts.accountType
                                institutionName = accounts.institutionName
                                routingNumber = accounts.routingNumber
                                additionalProperties = accounts.additionalProperties.toMutableMap()
                            }

                            fun accountName(accountName: Boolean) =
                                accountName(JsonField.of(accountName))

                            fun accountName(accountName: JsonField<Boolean>) = apply {
                                this.accountName = accountName
                            }

                            fun accountNumber(accountNumber: Boolean) =
                                accountNumber(JsonField.of(accountNumber))

                            fun accountNumber(accountNumber: JsonField<Boolean>) = apply {
                                this.accountNumber = accountNumber
                            }

                            fun accountType(accountType: Boolean) =
                                accountType(JsonField.of(accountType))

                            fun accountType(accountType: JsonField<Boolean>) = apply {
                                this.accountType = accountType
                            }

                            fun institutionName(institutionName: Boolean) =
                                institutionName(JsonField.of(institutionName))

                            fun institutionName(institutionName: JsonField<Boolean>) = apply {
                                this.institutionName = institutionName
                            }

                            fun routingNumber(routingNumber: Boolean) =
                                routingNumber(JsonField.of(routingNumber))

                            fun routingNumber(routingNumber: JsonField<Boolean>) = apply {
                                this.routingNumber = routingNumber
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
                                    accountName,
                                    accountNumber,
                                    accountType,
                                    institutionName,
                                    routingNumber,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Accounts && accountName == other.accountName && accountNumber == other.accountNumber && accountType == other.accountType && institutionName == other.institutionName && routingNumber == other.routingNumber && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(accountName, accountNumber, accountType, institutionName, routingNumber, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Accounts{accountName=$accountName, accountNumber=$accountNumber, accountType=$accountType, institutionName=$institutionName, routingNumber=$routingNumber, additionalProperties=$additionalProperties}"
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

                        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<Boolean> = name

                        @JsonProperty("parent")
                        @ExcludeMissing
                        fun _parent(): JsonField<Parent> = parent

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Departments = apply {
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

                        /** A builder for [Departments]. */
                        class Builder internal constructor() {

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

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun _name(): JsonField<Boolean> = name

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

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

                            /** A builder for [Parent]. */
                            class Builder internal constructor() {

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
                        @JsonProperty("subtype")
                        @ExcludeMissing
                        private val subtype: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        private val type: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun subtype(): Optional<Boolean> =
                            Optional.ofNullable(subtype.getNullable("subtype"))

                        fun type(): Optional<Boolean> =
                            Optional.ofNullable(type.getNullable("type"))

                        @JsonProperty("subtype")
                        @ExcludeMissing
                        fun _subtype(): JsonField<Boolean> = subtype

                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Boolean> = type

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

                        /** A builder for [Entity]. */
                        class Builder internal constructor() {

                            private var subtype: JsonField<Boolean> = JsonMissing.of()
                            private var type: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(entity: Entity) = apply {
                                subtype = entity.subtype
                                type = entity.type
                                additionalProperties = entity.additionalProperties.toMutableMap()
                            }

                            fun subtype(subtype: Boolean) = subtype(JsonField.of(subtype))

                            fun subtype(subtype: JsonField<Boolean>) = apply {
                                this.subtype = subtype
                            }

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

                            fun build(): Entity =
                                Entity(
                                    subtype,
                                    type,
                                    additionalProperties.toImmutable(),
                                )
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

                    @NoAutoDetect
                    class Locations
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

                        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<Boolean> = city

                        @JsonProperty("country")
                        @ExcludeMissing
                        fun _country(): JsonField<Boolean> = country

                        @JsonProperty("line1")
                        @ExcludeMissing
                        fun _line1(): JsonField<Boolean> = line1

                        @JsonProperty("line2")
                        @ExcludeMissing
                        fun _line2(): JsonField<Boolean> = line2

                        @JsonProperty("postal_code")
                        @ExcludeMissing
                        fun _postalCode(): JsonField<Boolean> = postalCode

                        @JsonProperty("state")
                        @ExcludeMissing
                        fun _state(): JsonField<Boolean> = state

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Locations = apply {
                            if (validated) {
                                return@apply
                            }

                            city()
                            country()
                            line1()
                            line2()
                            postalCode()
                            state()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Locations]. */
                        class Builder internal constructor() {

                            private var city: JsonField<Boolean> = JsonMissing.of()
                            private var country: JsonField<Boolean> = JsonMissing.of()
                            private var line1: JsonField<Boolean> = JsonMissing.of()
                            private var line2: JsonField<Boolean> = JsonMissing.of()
                            private var postalCode: JsonField<Boolean> = JsonMissing.of()
                            private var state: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(locations: Locations) = apply {
                                city = locations.city
                                country = locations.country
                                line1 = locations.line1
                                line2 = locations.line2
                                postalCode = locations.postalCode
                                state = locations.state
                                additionalProperties = locations.additionalProperties.toMutableMap()
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

                            fun build(): Locations =
                                Locations(
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

                            return /* spotless:off */ other is Locations && city == other.city && country == other.country && line1 == other.line1 && line2 == other.line2 && postalCode == other.postalCode && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(city, country, line1, line2, postalCode, state, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Locations{city=$city, country=$country, line1=$line1, line2=$line2, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is SupportedCompanyFields && id == other.id && accounts == other.accounts && departments == other.departments && ein == other.ein && entity == other.entity && legalName == other.legalName && locations == other.locations && primaryEmail == other.primaryEmail && primaryPhoneNumber == other.primaryPhoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, accounts, departments, ein, entity, legalName, locations, primaryEmail, primaryPhoneNumber, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SupportedCompanyFields{id=$id, accounts=$accounts, departments=$departments, ein=$ein, entity=$entity, legalName=$legalName, locations=$locations, primaryEmail=$primaryEmail, primaryPhoneNumber=$primaryPhoneNumber, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class SupportedDirectoryFields
                @JsonCreator
                private constructor(
                    @JsonProperty("individuals")
                    @ExcludeMissing
                    private val individuals: JsonField<Individuals> = JsonMissing.of(),
                    @JsonProperty("paging")
                    @ExcludeMissing
                    private val paging: JsonField<Paging> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun individuals(): Optional<Individuals> =
                        Optional.ofNullable(individuals.getNullable("individuals"))

                    fun paging(): Optional<Paging> =
                        Optional.ofNullable(paging.getNullable("paging"))

                    @JsonProperty("individuals")
                    @ExcludeMissing
                    fun _individuals(): JsonField<Individuals> = individuals

                    @JsonProperty("paging")
                    @ExcludeMissing
                    fun _paging(): JsonField<Paging> = paging

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): SupportedDirectoryFields = apply {
                        if (validated) {
                            return@apply
                        }

                        individuals().ifPresent { it.validate() }
                        paging().ifPresent { it.validate() }
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [SupportedDirectoryFields]. */
                    class Builder internal constructor() {

                        private var individuals: JsonField<Individuals> = JsonMissing.of()
                        private var paging: JsonField<Paging> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(supportedDirectoryFields: SupportedDirectoryFields) =
                            apply {
                                individuals = supportedDirectoryFields.individuals
                                paging = supportedDirectoryFields.paging
                                additionalProperties =
                                    supportedDirectoryFields.additionalProperties.toMutableMap()
                            }

                        fun individuals(individuals: Individuals) =
                            individuals(JsonField.of(individuals))

                        fun individuals(individuals: JsonField<Individuals>) = apply {
                            this.individuals = individuals
                        }

                        fun paging(paging: Paging) = paging(JsonField.of(paging))

                        fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

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
                                individuals,
                                paging,
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
                        @JsonProperty("department")
                        @ExcludeMissing
                        private val department: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("first_name")
                        @ExcludeMissing
                        private val firstName: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("is_active")
                        @ExcludeMissing
                        private val isActive: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("last_name")
                        @ExcludeMissing
                        private val lastName: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("manager")
                        @ExcludeMissing
                        private val manager: JsonField<Manager> = JsonMissing.of(),
                        @JsonProperty("middle_name")
                        @ExcludeMissing
                        private val middleName: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun id(): Optional<Boolean> = Optional.ofNullable(id.getNullable("id"))

                        fun department(): Optional<Boolean> =
                            Optional.ofNullable(department.getNullable("department"))

                        fun firstName(): Optional<Boolean> =
                            Optional.ofNullable(firstName.getNullable("first_name"))

                        fun isActive(): Optional<Boolean> =
                            Optional.ofNullable(isActive.getNullable("is_active"))

                        fun lastName(): Optional<Boolean> =
                            Optional.ofNullable(lastName.getNullable("last_name"))

                        fun manager(): Optional<Manager> =
                            Optional.ofNullable(manager.getNullable("manager"))

                        fun middleName(): Optional<Boolean> =
                            Optional.ofNullable(middleName.getNullable("middle_name"))

                        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Boolean> = id

                        @JsonProperty("department")
                        @ExcludeMissing
                        fun _department(): JsonField<Boolean> = department

                        @JsonProperty("first_name")
                        @ExcludeMissing
                        fun _firstName(): JsonField<Boolean> = firstName

                        @JsonProperty("is_active")
                        @ExcludeMissing
                        fun _isActive(): JsonField<Boolean> = isActive

                        @JsonProperty("last_name")
                        @ExcludeMissing
                        fun _lastName(): JsonField<Boolean> = lastName

                        @JsonProperty("manager")
                        @ExcludeMissing
                        fun _manager(): JsonField<Manager> = manager

                        @JsonProperty("middle_name")
                        @ExcludeMissing
                        fun _middleName(): JsonField<Boolean> = middleName

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Individuals = apply {
                            if (validated) {
                                return@apply
                            }

                            id()
                            department()
                            firstName()
                            isActive()
                            lastName()
                            manager().ifPresent { it.validate() }
                            middleName()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Individuals]. */
                        class Builder internal constructor() {

                            private var id: JsonField<Boolean> = JsonMissing.of()
                            private var department: JsonField<Boolean> = JsonMissing.of()
                            private var firstName: JsonField<Boolean> = JsonMissing.of()
                            private var isActive: JsonField<Boolean> = JsonMissing.of()
                            private var lastName: JsonField<Boolean> = JsonMissing.of()
                            private var manager: JsonField<Manager> = JsonMissing.of()
                            private var middleName: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(individuals: Individuals) = apply {
                                id = individuals.id
                                department = individuals.department
                                firstName = individuals.firstName
                                isActive = individuals.isActive
                                lastName = individuals.lastName
                                manager = individuals.manager
                                middleName = individuals.middleName
                                additionalProperties =
                                    individuals.additionalProperties.toMutableMap()
                            }

                            fun id(id: Boolean) = id(JsonField.of(id))

                            fun id(id: JsonField<Boolean>) = apply { this.id = id }

                            fun department(department: Boolean) =
                                department(JsonField.of(department))

                            fun department(department: JsonField<Boolean>) = apply {
                                this.department = department
                            }

                            fun firstName(firstName: Boolean) = firstName(JsonField.of(firstName))

                            fun firstName(firstName: JsonField<Boolean>) = apply {
                                this.firstName = firstName
                            }

                            fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

                            fun isActive(isActive: JsonField<Boolean>) = apply {
                                this.isActive = isActive
                            }

                            fun lastName(lastName: Boolean) = lastName(JsonField.of(lastName))

                            fun lastName(lastName: JsonField<Boolean>) = apply {
                                this.lastName = lastName
                            }

                            fun manager(manager: Manager) = manager(JsonField.of(manager))

                            fun manager(manager: JsonField<Manager>) = apply {
                                this.manager = manager
                            }

                            fun middleName(middleName: Boolean) =
                                middleName(JsonField.of(middleName))

                            fun middleName(middleName: JsonField<Boolean>) = apply {
                                this.middleName = middleName
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
                                    department,
                                    firstName,
                                    isActive,
                                    lastName,
                                    manager,
                                    middleName,
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

                            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Boolean> = id

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            private var validated: Boolean = false

                            fun validate(): Manager = apply {
                                if (validated) {
                                    return@apply
                                }

                                id()
                                validated = true
                            }

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [Manager]. */
                            class Builder internal constructor() {

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

                            return /* spotless:off */ other is Individuals && id == other.id && department == other.department && firstName == other.firstName && isActive == other.isActive && lastName == other.lastName && manager == other.manager && middleName == other.middleName && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(id, department, firstName, isActive, lastName, manager, middleName, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Individuals{id=$id, department=$department, firstName=$firstName, isActive=$isActive, lastName=$lastName, manager=$manager, middleName=$middleName, additionalProperties=$additionalProperties}"
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

                        @JsonProperty("count")
                        @ExcludeMissing
                        fun _count(): JsonField<Boolean> = count

                        @JsonProperty("offset")
                        @ExcludeMissing
                        fun _offset(): JsonField<Boolean> = offset

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Paging = apply {
                            if (validated) {
                                return@apply
                            }

                            count()
                            offset()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Paging]. */
                        class Builder internal constructor() {

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

                        return /* spotless:off */ other is SupportedDirectoryFields && individuals == other.individuals && paging == other.paging && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(individuals, paging, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SupportedDirectoryFields{individuals=$individuals, paging=$paging, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class SupportedEmploymentFields
                @JsonCreator
                private constructor(
                    @JsonProperty("id")
                    @ExcludeMissing
                    private val id: JsonField<Boolean> = JsonMissing.of(),
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
                    @JsonProperty("employment_status")
                    @ExcludeMissing
                    private val employmentStatus: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("end_date")
                    @ExcludeMissing
                    private val endDate: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("first_name")
                    @ExcludeMissing
                    private val firstName: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("income")
                    @ExcludeMissing
                    private val income: JsonField<Income> = JsonMissing.of(),
                    @JsonProperty("income_history")
                    @ExcludeMissing
                    private val incomeHistory: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("is_active")
                    @ExcludeMissing
                    private val isActive: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("last_name")
                    @ExcludeMissing
                    private val lastName: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("location")
                    @ExcludeMissing
                    private val location: JsonField<Location> = JsonMissing.of(),
                    @JsonProperty("manager")
                    @ExcludeMissing
                    private val manager: JsonField<Manager> = JsonMissing.of(),
                    @JsonProperty("middle_name")
                    @ExcludeMissing
                    private val middleName: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("start_date")
                    @ExcludeMissing
                    private val startDate: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("title")
                    @ExcludeMissing
                    private val title: JsonField<Boolean> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun id(): Optional<Boolean> = Optional.ofNullable(id.getNullable("id"))

                    fun classCode(): Optional<Boolean> =
                        Optional.ofNullable(classCode.getNullable("class_code"))

                    fun customFields(): Optional<Boolean> =
                        Optional.ofNullable(customFields.getNullable("custom_fields"))

                    fun department(): Optional<Department> =
                        Optional.ofNullable(department.getNullable("department"))

                    fun employment(): Optional<Employment> =
                        Optional.ofNullable(employment.getNullable("employment"))

                    fun employmentStatus(): Optional<Boolean> =
                        Optional.ofNullable(employmentStatus.getNullable("employment_status"))

                    fun endDate(): Optional<Boolean> =
                        Optional.ofNullable(endDate.getNullable("end_date"))

                    fun firstName(): Optional<Boolean> =
                        Optional.ofNullable(firstName.getNullable("first_name"))

                    fun income(): Optional<Income> =
                        Optional.ofNullable(income.getNullable("income"))

                    fun incomeHistory(): Optional<Boolean> =
                        Optional.ofNullable(incomeHistory.getNullable("income_history"))

                    fun isActive(): Optional<Boolean> =
                        Optional.ofNullable(isActive.getNullable("is_active"))

                    fun lastName(): Optional<Boolean> =
                        Optional.ofNullable(lastName.getNullable("last_name"))

                    fun location(): Optional<Location> =
                        Optional.ofNullable(location.getNullable("location"))

                    fun manager(): Optional<Manager> =
                        Optional.ofNullable(manager.getNullable("manager"))

                    fun middleName(): Optional<Boolean> =
                        Optional.ofNullable(middleName.getNullable("middle_name"))

                    fun startDate(): Optional<Boolean> =
                        Optional.ofNullable(startDate.getNullable("start_date"))

                    fun title(): Optional<Boolean> = Optional.ofNullable(title.getNullable("title"))

                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Boolean> = id

                    @JsonProperty("class_code")
                    @ExcludeMissing
                    fun _classCode(): JsonField<Boolean> = classCode

                    @JsonProperty("custom_fields")
                    @ExcludeMissing
                    fun _customFields(): JsonField<Boolean> = customFields

                    @JsonProperty("department")
                    @ExcludeMissing
                    fun _department(): JsonField<Department> = department

                    @JsonProperty("employment")
                    @ExcludeMissing
                    fun _employment(): JsonField<Employment> = employment

                    @JsonProperty("employment_status")
                    @ExcludeMissing
                    fun _employmentStatus(): JsonField<Boolean> = employmentStatus

                    @JsonProperty("end_date")
                    @ExcludeMissing
                    fun _endDate(): JsonField<Boolean> = endDate

                    @JsonProperty("first_name")
                    @ExcludeMissing
                    fun _firstName(): JsonField<Boolean> = firstName

                    @JsonProperty("income")
                    @ExcludeMissing
                    fun _income(): JsonField<Income> = income

                    @JsonProperty("income_history")
                    @ExcludeMissing
                    fun _incomeHistory(): JsonField<Boolean> = incomeHistory

                    @JsonProperty("is_active")
                    @ExcludeMissing
                    fun _isActive(): JsonField<Boolean> = isActive

                    @JsonProperty("last_name")
                    @ExcludeMissing
                    fun _lastName(): JsonField<Boolean> = lastName

                    @JsonProperty("location")
                    @ExcludeMissing
                    fun _location(): JsonField<Location> = location

                    @JsonProperty("manager")
                    @ExcludeMissing
                    fun _manager(): JsonField<Manager> = manager

                    @JsonProperty("middle_name")
                    @ExcludeMissing
                    fun _middleName(): JsonField<Boolean> = middleName

                    @JsonProperty("start_date")
                    @ExcludeMissing
                    fun _startDate(): JsonField<Boolean> = startDate

                    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<Boolean> = title

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): SupportedEmploymentFields = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        classCode()
                        customFields()
                        department().ifPresent { it.validate() }
                        employment().ifPresent { it.validate() }
                        employmentStatus()
                        endDate()
                        firstName()
                        income().ifPresent { it.validate() }
                        incomeHistory()
                        isActive()
                        lastName()
                        location().ifPresent { it.validate() }
                        manager().ifPresent { it.validate() }
                        middleName()
                        startDate()
                        title()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [SupportedEmploymentFields]. */
                    class Builder internal constructor() {

                        private var id: JsonField<Boolean> = JsonMissing.of()
                        private var classCode: JsonField<Boolean> = JsonMissing.of()
                        private var customFields: JsonField<Boolean> = JsonMissing.of()
                        private var department: JsonField<Department> = JsonMissing.of()
                        private var employment: JsonField<Employment> = JsonMissing.of()
                        private var employmentStatus: JsonField<Boolean> = JsonMissing.of()
                        private var endDate: JsonField<Boolean> = JsonMissing.of()
                        private var firstName: JsonField<Boolean> = JsonMissing.of()
                        private var income: JsonField<Income> = JsonMissing.of()
                        private var incomeHistory: JsonField<Boolean> = JsonMissing.of()
                        private var isActive: JsonField<Boolean> = JsonMissing.of()
                        private var lastName: JsonField<Boolean> = JsonMissing.of()
                        private var location: JsonField<Location> = JsonMissing.of()
                        private var manager: JsonField<Manager> = JsonMissing.of()
                        private var middleName: JsonField<Boolean> = JsonMissing.of()
                        private var startDate: JsonField<Boolean> = JsonMissing.of()
                        private var title: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(supportedEmploymentFields: SupportedEmploymentFields) =
                            apply {
                                id = supportedEmploymentFields.id
                                classCode = supportedEmploymentFields.classCode
                                customFields = supportedEmploymentFields.customFields
                                department = supportedEmploymentFields.department
                                employment = supportedEmploymentFields.employment
                                employmentStatus = supportedEmploymentFields.employmentStatus
                                endDate = supportedEmploymentFields.endDate
                                firstName = supportedEmploymentFields.firstName
                                income = supportedEmploymentFields.income
                                incomeHistory = supportedEmploymentFields.incomeHistory
                                isActive = supportedEmploymentFields.isActive
                                lastName = supportedEmploymentFields.lastName
                                location = supportedEmploymentFields.location
                                manager = supportedEmploymentFields.manager
                                middleName = supportedEmploymentFields.middleName
                                startDate = supportedEmploymentFields.startDate
                                title = supportedEmploymentFields.title
                                additionalProperties =
                                    supportedEmploymentFields.additionalProperties.toMutableMap()
                            }

                        fun id(id: Boolean) = id(JsonField.of(id))

                        fun id(id: JsonField<Boolean>) = apply { this.id = id }

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

                        fun employmentStatus(employmentStatus: Boolean) =
                            employmentStatus(JsonField.of(employmentStatus))

                        fun employmentStatus(employmentStatus: JsonField<Boolean>) = apply {
                            this.employmentStatus = employmentStatus
                        }

                        fun endDate(endDate: Boolean) = endDate(JsonField.of(endDate))

                        fun endDate(endDate: JsonField<Boolean>) = apply { this.endDate = endDate }

                        fun firstName(firstName: Boolean) = firstName(JsonField.of(firstName))

                        fun firstName(firstName: JsonField<Boolean>) = apply {
                            this.firstName = firstName
                        }

                        fun income(income: Income) = income(JsonField.of(income))

                        fun income(income: JsonField<Income>) = apply { this.income = income }

                        fun incomeHistory(incomeHistory: Boolean) =
                            incomeHistory(JsonField.of(incomeHistory))

                        fun incomeHistory(incomeHistory: JsonField<Boolean>) = apply {
                            this.incomeHistory = incomeHistory
                        }

                        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

                        fun isActive(isActive: JsonField<Boolean>) = apply {
                            this.isActive = isActive
                        }

                        fun lastName(lastName: Boolean) = lastName(JsonField.of(lastName))

                        fun lastName(lastName: JsonField<Boolean>) = apply {
                            this.lastName = lastName
                        }

                        fun location(location: Location) = location(JsonField.of(location))

                        fun location(location: JsonField<Location>) = apply {
                            this.location = location
                        }

                        fun manager(manager: Manager) = manager(JsonField.of(manager))

                        fun manager(manager: JsonField<Manager>) = apply { this.manager = manager }

                        fun middleName(middleName: Boolean) = middleName(JsonField.of(middleName))

                        fun middleName(middleName: JsonField<Boolean>) = apply {
                            this.middleName = middleName
                        }

                        fun startDate(startDate: Boolean) = startDate(JsonField.of(startDate))

                        fun startDate(startDate: JsonField<Boolean>) = apply {
                            this.startDate = startDate
                        }

                        fun title(title: Boolean) = title(JsonField.of(title))

                        fun title(title: JsonField<Boolean>) = apply { this.title = title }

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
                                classCode,
                                customFields,
                                department,
                                employment,
                                employmentStatus,
                                endDate,
                                firstName,
                                income,
                                incomeHistory,
                                isActive,
                                lastName,
                                location,
                                manager,
                                middleName,
                                startDate,
                                title,
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

                        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<Boolean> = name

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Department = apply {
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

                        /** A builder for [Department]. */
                        class Builder internal constructor() {

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
                        @JsonProperty("subtype")
                        @ExcludeMissing
                        private val subtype: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        private val type: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun subtype(): Optional<Boolean> =
                            Optional.ofNullable(subtype.getNullable("subtype"))

                        fun type(): Optional<Boolean> =
                            Optional.ofNullable(type.getNullable("type"))

                        @JsonProperty("subtype")
                        @ExcludeMissing
                        fun _subtype(): JsonField<Boolean> = subtype

                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Boolean> = type

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Employment = apply {
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

                        /** A builder for [Employment]. */
                        class Builder internal constructor() {

                            private var subtype: JsonField<Boolean> = JsonMissing.of()
                            private var type: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(employment: Employment) = apply {
                                subtype = employment.subtype
                                type = employment.type
                                additionalProperties =
                                    employment.additionalProperties.toMutableMap()
                            }

                            fun subtype(subtype: Boolean) = subtype(JsonField.of(subtype))

                            fun subtype(subtype: JsonField<Boolean>) = apply {
                                this.subtype = subtype
                            }

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

                            fun build(): Employment =
                                Employment(
                                    subtype,
                                    type,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Employment && subtype == other.subtype && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(subtype, type, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Employment{subtype=$subtype, type=$type, additionalProperties=$additionalProperties}"
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

                        @JsonProperty("amount")
                        @ExcludeMissing
                        fun _amount(): JsonField<Boolean> = amount

                        @JsonProperty("currency")
                        @ExcludeMissing
                        fun _currency(): JsonField<Boolean> = currency

                        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Boolean> = unit

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Income = apply {
                            if (validated) {
                                return@apply
                            }

                            amount()
                            currency()
                            unit()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Income]. */
                        class Builder internal constructor() {

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

                        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<Boolean> = city

                        @JsonProperty("country")
                        @ExcludeMissing
                        fun _country(): JsonField<Boolean> = country

                        @JsonProperty("line1")
                        @ExcludeMissing
                        fun _line1(): JsonField<Boolean> = line1

                        @JsonProperty("line2")
                        @ExcludeMissing
                        fun _line2(): JsonField<Boolean> = line2

                        @JsonProperty("postal_code")
                        @ExcludeMissing
                        fun _postalCode(): JsonField<Boolean> = postalCode

                        @JsonProperty("state")
                        @ExcludeMissing
                        fun _state(): JsonField<Boolean> = state

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Location = apply {
                            if (validated) {
                                return@apply
                            }

                            city()
                            country()
                            line1()
                            line2()
                            postalCode()
                            state()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Location]. */
                        class Builder internal constructor() {

                            private var city: JsonField<Boolean> = JsonMissing.of()
                            private var country: JsonField<Boolean> = JsonMissing.of()
                            private var line1: JsonField<Boolean> = JsonMissing.of()
                            private var line2: JsonField<Boolean> = JsonMissing.of()
                            private var postalCode: JsonField<Boolean> = JsonMissing.of()
                            private var state: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(location: Location) = apply {
                                city = location.city
                                country = location.country
                                line1 = location.line1
                                line2 = location.line2
                                postalCode = location.postalCode
                                state = location.state
                                additionalProperties = location.additionalProperties.toMutableMap()
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

                            fun build(): Location =
                                Location(
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

                            return /* spotless:off */ other is Location && city == other.city && country == other.country && line1 == other.line1 && line2 == other.line2 && postalCode == other.postalCode && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(city, country, line1, line2, postalCode, state, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Location{city=$city, country=$country, line1=$line1, line2=$line2, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
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

                        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Boolean> = id

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Manager = apply {
                            if (validated) {
                                return@apply
                            }

                            id()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Manager]. */
                        class Builder internal constructor() {

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

                        return /* spotless:off */ other is SupportedEmploymentFields && id == other.id && classCode == other.classCode && customFields == other.customFields && department == other.department && employment == other.employment && employmentStatus == other.employmentStatus && endDate == other.endDate && firstName == other.firstName && income == other.income && incomeHistory == other.incomeHistory && isActive == other.isActive && lastName == other.lastName && location == other.location && manager == other.manager && middleName == other.middleName && startDate == other.startDate && title == other.title && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, classCode, customFields, department, employment, employmentStatus, endDate, firstName, income, incomeHistory, isActive, lastName, location, manager, middleName, startDate, title, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SupportedEmploymentFields{id=$id, classCode=$classCode, customFields=$customFields, department=$department, employment=$employment, employmentStatus=$employmentStatus, endDate=$endDate, firstName=$firstName, income=$income, incomeHistory=$incomeHistory, isActive=$isActive, lastName=$lastName, location=$location, manager=$manager, middleName=$middleName, startDate=$startDate, title=$title, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class SupportedIndividualFields
                @JsonCreator
                private constructor(
                    @JsonProperty("id")
                    @ExcludeMissing
                    private val id: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("dob")
                    @ExcludeMissing
                    private val dob: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("emails")
                    @ExcludeMissing
                    private val emails: JsonField<Emails> = JsonMissing.of(),
                    @JsonProperty("encrypted_ssn")
                    @ExcludeMissing
                    private val encryptedSsn: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("ethnicity")
                    @ExcludeMissing
                    private val ethnicity: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("first_name")
                    @ExcludeMissing
                    private val firstName: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("gender")
                    @ExcludeMissing
                    private val gender: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("last_name")
                    @ExcludeMissing
                    private val lastName: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("middle_name")
                    @ExcludeMissing
                    private val middleName: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("phone_numbers")
                    @ExcludeMissing
                    private val phoneNumbers: JsonField<PhoneNumbers> = JsonMissing.of(),
                    @JsonProperty("preferred_name")
                    @ExcludeMissing
                    private val preferredName: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("residence")
                    @ExcludeMissing
                    private val residence: JsonField<Residence> = JsonMissing.of(),
                    @JsonProperty("ssn")
                    @ExcludeMissing
                    private val ssn: JsonField<Boolean> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun id(): Optional<Boolean> = Optional.ofNullable(id.getNullable("id"))

                    fun dob(): Optional<Boolean> = Optional.ofNullable(dob.getNullable("dob"))

                    fun emails(): Optional<Emails> =
                        Optional.ofNullable(emails.getNullable("emails"))

                    fun encryptedSsn(): Optional<Boolean> =
                        Optional.ofNullable(encryptedSsn.getNullable("encrypted_ssn"))

                    fun ethnicity(): Optional<Boolean> =
                        Optional.ofNullable(ethnicity.getNullable("ethnicity"))

                    fun firstName(): Optional<Boolean> =
                        Optional.ofNullable(firstName.getNullable("first_name"))

                    fun gender(): Optional<Boolean> =
                        Optional.ofNullable(gender.getNullable("gender"))

                    fun lastName(): Optional<Boolean> =
                        Optional.ofNullable(lastName.getNullable("last_name"))

                    fun middleName(): Optional<Boolean> =
                        Optional.ofNullable(middleName.getNullable("middle_name"))

                    fun phoneNumbers(): Optional<PhoneNumbers> =
                        Optional.ofNullable(phoneNumbers.getNullable("phone_numbers"))

                    fun preferredName(): Optional<Boolean> =
                        Optional.ofNullable(preferredName.getNullable("preferred_name"))

                    fun residence(): Optional<Residence> =
                        Optional.ofNullable(residence.getNullable("residence"))

                    fun ssn(): Optional<Boolean> = Optional.ofNullable(ssn.getNullable("ssn"))

                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Boolean> = id

                    @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<Boolean> = dob

                    @JsonProperty("emails")
                    @ExcludeMissing
                    fun _emails(): JsonField<Emails> = emails

                    @JsonProperty("encrypted_ssn")
                    @ExcludeMissing
                    fun _encryptedSsn(): JsonField<Boolean> = encryptedSsn

                    @JsonProperty("ethnicity")
                    @ExcludeMissing
                    fun _ethnicity(): JsonField<Boolean> = ethnicity

                    @JsonProperty("first_name")
                    @ExcludeMissing
                    fun _firstName(): JsonField<Boolean> = firstName

                    @JsonProperty("gender")
                    @ExcludeMissing
                    fun _gender(): JsonField<Boolean> = gender

                    @JsonProperty("last_name")
                    @ExcludeMissing
                    fun _lastName(): JsonField<Boolean> = lastName

                    @JsonProperty("middle_name")
                    @ExcludeMissing
                    fun _middleName(): JsonField<Boolean> = middleName

                    @JsonProperty("phone_numbers")
                    @ExcludeMissing
                    fun _phoneNumbers(): JsonField<PhoneNumbers> = phoneNumbers

                    @JsonProperty("preferred_name")
                    @ExcludeMissing
                    fun _preferredName(): JsonField<Boolean> = preferredName

                    @JsonProperty("residence")
                    @ExcludeMissing
                    fun _residence(): JsonField<Residence> = residence

                    @JsonProperty("ssn") @ExcludeMissing fun _ssn(): JsonField<Boolean> = ssn

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): SupportedIndividualFields = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        dob()
                        emails().ifPresent { it.validate() }
                        encryptedSsn()
                        ethnicity()
                        firstName()
                        gender()
                        lastName()
                        middleName()
                        phoneNumbers().ifPresent { it.validate() }
                        preferredName()
                        residence().ifPresent { it.validate() }
                        ssn()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [SupportedIndividualFields]. */
                    class Builder internal constructor() {

                        private var id: JsonField<Boolean> = JsonMissing.of()
                        private var dob: JsonField<Boolean> = JsonMissing.of()
                        private var emails: JsonField<Emails> = JsonMissing.of()
                        private var encryptedSsn: JsonField<Boolean> = JsonMissing.of()
                        private var ethnicity: JsonField<Boolean> = JsonMissing.of()
                        private var firstName: JsonField<Boolean> = JsonMissing.of()
                        private var gender: JsonField<Boolean> = JsonMissing.of()
                        private var lastName: JsonField<Boolean> = JsonMissing.of()
                        private var middleName: JsonField<Boolean> = JsonMissing.of()
                        private var phoneNumbers: JsonField<PhoneNumbers> = JsonMissing.of()
                        private var preferredName: JsonField<Boolean> = JsonMissing.of()
                        private var residence: JsonField<Residence> = JsonMissing.of()
                        private var ssn: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(supportedIndividualFields: SupportedIndividualFields) =
                            apply {
                                id = supportedIndividualFields.id
                                dob = supportedIndividualFields.dob
                                emails = supportedIndividualFields.emails
                                encryptedSsn = supportedIndividualFields.encryptedSsn
                                ethnicity = supportedIndividualFields.ethnicity
                                firstName = supportedIndividualFields.firstName
                                gender = supportedIndividualFields.gender
                                lastName = supportedIndividualFields.lastName
                                middleName = supportedIndividualFields.middleName
                                phoneNumbers = supportedIndividualFields.phoneNumbers
                                preferredName = supportedIndividualFields.preferredName
                                residence = supportedIndividualFields.residence
                                ssn = supportedIndividualFields.ssn
                                additionalProperties =
                                    supportedIndividualFields.additionalProperties.toMutableMap()
                            }

                        fun id(id: Boolean) = id(JsonField.of(id))

                        fun id(id: JsonField<Boolean>) = apply { this.id = id }

                        fun dob(dob: Boolean) = dob(JsonField.of(dob))

                        fun dob(dob: JsonField<Boolean>) = apply { this.dob = dob }

                        fun emails(emails: Emails) = emails(JsonField.of(emails))

                        fun emails(emails: JsonField<Emails>) = apply { this.emails = emails }

                        fun encryptedSsn(encryptedSsn: Boolean) =
                            encryptedSsn(JsonField.of(encryptedSsn))

                        fun encryptedSsn(encryptedSsn: JsonField<Boolean>) = apply {
                            this.encryptedSsn = encryptedSsn
                        }

                        fun ethnicity(ethnicity: Boolean) = ethnicity(JsonField.of(ethnicity))

                        fun ethnicity(ethnicity: JsonField<Boolean>) = apply {
                            this.ethnicity = ethnicity
                        }

                        fun firstName(firstName: Boolean) = firstName(JsonField.of(firstName))

                        fun firstName(firstName: JsonField<Boolean>) = apply {
                            this.firstName = firstName
                        }

                        fun gender(gender: Boolean) = gender(JsonField.of(gender))

                        fun gender(gender: JsonField<Boolean>) = apply { this.gender = gender }

                        fun lastName(lastName: Boolean) = lastName(JsonField.of(lastName))

                        fun lastName(lastName: JsonField<Boolean>) = apply {
                            this.lastName = lastName
                        }

                        fun middleName(middleName: Boolean) = middleName(JsonField.of(middleName))

                        fun middleName(middleName: JsonField<Boolean>) = apply {
                            this.middleName = middleName
                        }

                        fun phoneNumbers(phoneNumbers: PhoneNumbers) =
                            phoneNumbers(JsonField.of(phoneNumbers))

                        fun phoneNumbers(phoneNumbers: JsonField<PhoneNumbers>) = apply {
                            this.phoneNumbers = phoneNumbers
                        }

                        fun preferredName(preferredName: Boolean) =
                            preferredName(JsonField.of(preferredName))

                        fun preferredName(preferredName: JsonField<Boolean>) = apply {
                            this.preferredName = preferredName
                        }

                        fun residence(residence: Residence) = residence(JsonField.of(residence))

                        fun residence(residence: JsonField<Residence>) = apply {
                            this.residence = residence
                        }

                        fun ssn(ssn: Boolean) = ssn(JsonField.of(ssn))

                        fun ssn(ssn: JsonField<Boolean>) = apply { this.ssn = ssn }

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
                                dob,
                                emails,
                                encryptedSsn,
                                ethnicity,
                                firstName,
                                gender,
                                lastName,
                                middleName,
                                phoneNumbers,
                                preferredName,
                                residence,
                                ssn,
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

                        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Boolean> = data

                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Boolean> = type

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Emails = apply {
                            if (validated) {
                                return@apply
                            }

                            data()
                            type()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Emails]. */
                        class Builder internal constructor() {

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

                        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Boolean> = data

                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Boolean> = type

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): PhoneNumbers = apply {
                            if (validated) {
                                return@apply
                            }

                            data()
                            type()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [PhoneNumbers]. */
                        class Builder internal constructor() {

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

                        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<Boolean> = city

                        @JsonProperty("country")
                        @ExcludeMissing
                        fun _country(): JsonField<Boolean> = country

                        @JsonProperty("line1")
                        @ExcludeMissing
                        fun _line1(): JsonField<Boolean> = line1

                        @JsonProperty("line2")
                        @ExcludeMissing
                        fun _line2(): JsonField<Boolean> = line2

                        @JsonProperty("postal_code")
                        @ExcludeMissing
                        fun _postalCode(): JsonField<Boolean> = postalCode

                        @JsonProperty("state")
                        @ExcludeMissing
                        fun _state(): JsonField<Boolean> = state

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Residence = apply {
                            if (validated) {
                                return@apply
                            }

                            city()
                            country()
                            line1()
                            line2()
                            postalCode()
                            state()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Residence]. */
                        class Builder internal constructor() {

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

                        return /* spotless:off */ other is SupportedIndividualFields && id == other.id && dob == other.dob && emails == other.emails && encryptedSsn == other.encryptedSsn && ethnicity == other.ethnicity && firstName == other.firstName && gender == other.gender && lastName == other.lastName && middleName == other.middleName && phoneNumbers == other.phoneNumbers && preferredName == other.preferredName && residence == other.residence && ssn == other.ssn && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, dob, emails, encryptedSsn, ethnicity, firstName, gender, lastName, middleName, phoneNumbers, preferredName, residence, ssn, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SupportedIndividualFields{id=$id, dob=$dob, emails=$emails, encryptedSsn=$encryptedSsn, ethnicity=$ethnicity, firstName=$firstName, gender=$gender, lastName=$lastName, middleName=$middleName, phoneNumbers=$phoneNumbers, preferredName=$preferredName, residence=$residence, ssn=$ssn, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class SupportedPayGroupFields
                @JsonCreator
                private constructor(
                    @JsonProperty("id")
                    @ExcludeMissing
                    private val id: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("individual_ids")
                    @ExcludeMissing
                    private val individualIds: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    private val name: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("pay_frequencies")
                    @ExcludeMissing
                    private val payFrequencies: JsonField<Boolean> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun id(): Optional<Boolean> = Optional.ofNullable(id.getNullable("id"))

                    fun individualIds(): Optional<Boolean> =
                        Optional.ofNullable(individualIds.getNullable("individual_ids"))

                    fun name(): Optional<Boolean> = Optional.ofNullable(name.getNullable("name"))

                    fun payFrequencies(): Optional<Boolean> =
                        Optional.ofNullable(payFrequencies.getNullable("pay_frequencies"))

                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Boolean> = id

                    @JsonProperty("individual_ids")
                    @ExcludeMissing
                    fun _individualIds(): JsonField<Boolean> = individualIds

                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<Boolean> = name

                    @JsonProperty("pay_frequencies")
                    @ExcludeMissing
                    fun _payFrequencies(): JsonField<Boolean> = payFrequencies

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): SupportedPayGroupFields = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        individualIds()
                        name()
                        payFrequencies()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [SupportedPayGroupFields]. */
                    class Builder internal constructor() {

                        private var id: JsonField<Boolean> = JsonMissing.of()
                        private var individualIds: JsonField<Boolean> = JsonMissing.of()
                        private var name: JsonField<Boolean> = JsonMissing.of()
                        private var payFrequencies: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(supportedPayGroupFields: SupportedPayGroupFields) =
                            apply {
                                id = supportedPayGroupFields.id
                                individualIds = supportedPayGroupFields.individualIds
                                name = supportedPayGroupFields.name
                                payFrequencies = supportedPayGroupFields.payFrequencies
                                additionalProperties =
                                    supportedPayGroupFields.additionalProperties.toMutableMap()
                            }

                        fun id(id: Boolean) = id(JsonField.of(id))

                        fun id(id: JsonField<Boolean>) = apply { this.id = id }

                        fun individualIds(individualIds: Boolean) =
                            individualIds(JsonField.of(individualIds))

                        fun individualIds(individualIds: JsonField<Boolean>) = apply {
                            this.individualIds = individualIds
                        }

                        fun name(name: Boolean) = name(JsonField.of(name))

                        fun name(name: JsonField<Boolean>) = apply { this.name = name }

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

                        fun build(): SupportedPayGroupFields =
                            SupportedPayGroupFields(
                                id,
                                individualIds,
                                name,
                                payFrequencies,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is SupportedPayGroupFields && id == other.id && individualIds == other.individualIds && name == other.name && payFrequencies == other.payFrequencies && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, individualIds, name, payFrequencies, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SupportedPayGroupFields{id=$id, individualIds=$individualIds, name=$name, payFrequencies=$payFrequencies, additionalProperties=$additionalProperties}"
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

                    @JsonProperty("paging")
                    @ExcludeMissing
                    fun _paging(): JsonField<Paging> = paging

                    @JsonProperty("pay_statements")
                    @ExcludeMissing
                    fun _payStatements(): JsonField<PayStatements> = payStatements

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): SupportedPayStatementFields = apply {
                        if (validated) {
                            return@apply
                        }

                        paging().ifPresent { it.validate() }
                        payStatements().ifPresent { it.validate() }
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [SupportedPayStatementFields]. */
                    class Builder internal constructor() {

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

                        @JsonProperty("count")
                        @ExcludeMissing
                        fun _count(): JsonField<Boolean> = count

                        @JsonProperty("offset")
                        @ExcludeMissing
                        fun _offset(): JsonField<Boolean> = offset

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Paging = apply {
                            if (validated) {
                                return@apply
                            }

                            count()
                            offset()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Paging]. */
                        class Builder internal constructor() {

                            private var count: JsonField<Boolean>? = null
                            private var offset: JsonField<Boolean>? = null
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
                                    checkRequired("count", count),
                                    checkRequired("offset", offset),
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
                        @JsonProperty("gross_pay")
                        @ExcludeMissing
                        private val grossPay: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("individual_id")
                        @ExcludeMissing
                        private val individualId: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("net_pay")
                        @ExcludeMissing
                        private val netPay: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("payment_method")
                        @ExcludeMissing
                        private val paymentMethod: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("taxes")
                        @ExcludeMissing
                        private val taxes: JsonField<Taxes> = JsonMissing.of(),
                        @JsonProperty("total_hours")
                        @ExcludeMissing
                        private val totalHours: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        private val type: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

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

                        fun grossPay(): Optional<Boolean> =
                            Optional.ofNullable(grossPay.getNullable("gross_pay"))

                        fun individualId(): Optional<Boolean> =
                            Optional.ofNullable(individualId.getNullable("individual_id"))

                        fun netPay(): Optional<Boolean> =
                            Optional.ofNullable(netPay.getNullable("net_pay"))

                        fun paymentMethod(): Optional<Boolean> =
                            Optional.ofNullable(paymentMethod.getNullable("payment_method"))

                        fun taxes(): Optional<Taxes> =
                            Optional.ofNullable(taxes.getNullable("taxes"))

                        fun totalHours(): Optional<Boolean> =
                            Optional.ofNullable(totalHours.getNullable("total_hours"))

                        fun type(): Optional<Boolean> =
                            Optional.ofNullable(type.getNullable("type"))

                        @JsonProperty("earnings")
                        @ExcludeMissing
                        fun _earnings(): JsonField<Earnings> = earnings

                        @JsonProperty("employee_deductions")
                        @ExcludeMissing
                        fun _employeeDeductions(): JsonField<EmployeeDeductions> =
                            employeeDeductions

                        @JsonProperty("employer_contributions")
                        @ExcludeMissing
                        fun _employerContributions(): JsonField<EmployerContributions> =
                            employerContributions

                        @JsonProperty("gross_pay")
                        @ExcludeMissing
                        fun _grossPay(): JsonField<Boolean> = grossPay

                        @JsonProperty("individual_id")
                        @ExcludeMissing
                        fun _individualId(): JsonField<Boolean> = individualId

                        @JsonProperty("net_pay")
                        @ExcludeMissing
                        fun _netPay(): JsonField<Boolean> = netPay

                        @JsonProperty("payment_method")
                        @ExcludeMissing
                        fun _paymentMethod(): JsonField<Boolean> = paymentMethod

                        @JsonProperty("taxes")
                        @ExcludeMissing
                        fun _taxes(): JsonField<Taxes> = taxes

                        @JsonProperty("total_hours")
                        @ExcludeMissing
                        fun _totalHours(): JsonField<Boolean> = totalHours

                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Boolean> = type

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): PayStatements = apply {
                            if (validated) {
                                return@apply
                            }

                            earnings().ifPresent { it.validate() }
                            employeeDeductions().ifPresent { it.validate() }
                            employerContributions().ifPresent { it.validate() }
                            grossPay()
                            individualId()
                            netPay()
                            paymentMethod()
                            taxes().ifPresent { it.validate() }
                            totalHours()
                            type()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [PayStatements]. */
                        class Builder internal constructor() {

                            private var earnings: JsonField<Earnings> = JsonMissing.of()
                            private var employeeDeductions: JsonField<EmployeeDeductions> =
                                JsonMissing.of()
                            private var employerContributions: JsonField<EmployerContributions> =
                                JsonMissing.of()
                            private var grossPay: JsonField<Boolean> = JsonMissing.of()
                            private var individualId: JsonField<Boolean> = JsonMissing.of()
                            private var netPay: JsonField<Boolean> = JsonMissing.of()
                            private var paymentMethod: JsonField<Boolean> = JsonMissing.of()
                            private var taxes: JsonField<Taxes> = JsonMissing.of()
                            private var totalHours: JsonField<Boolean> = JsonMissing.of()
                            private var type: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(payStatements: PayStatements) = apply {
                                earnings = payStatements.earnings
                                employeeDeductions = payStatements.employeeDeductions
                                employerContributions = payStatements.employerContributions
                                grossPay = payStatements.grossPay
                                individualId = payStatements.individualId
                                netPay = payStatements.netPay
                                paymentMethod = payStatements.paymentMethod
                                taxes = payStatements.taxes
                                totalHours = payStatements.totalHours
                                type = payStatements.type
                                additionalProperties =
                                    payStatements.additionalProperties.toMutableMap()
                            }

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

                            fun grossPay(grossPay: Boolean) = grossPay(JsonField.of(grossPay))

                            fun grossPay(grossPay: JsonField<Boolean>) = apply {
                                this.grossPay = grossPay
                            }

                            fun individualId(individualId: Boolean) =
                                individualId(JsonField.of(individualId))

                            fun individualId(individualId: JsonField<Boolean>) = apply {
                                this.individualId = individualId
                            }

                            fun netPay(netPay: Boolean) = netPay(JsonField.of(netPay))

                            fun netPay(netPay: JsonField<Boolean>) = apply { this.netPay = netPay }

                            fun paymentMethod(paymentMethod: Boolean) =
                                paymentMethod(JsonField.of(paymentMethod))

                            fun paymentMethod(paymentMethod: JsonField<Boolean>) = apply {
                                this.paymentMethod = paymentMethod
                            }

                            fun taxes(taxes: Taxes) = taxes(JsonField.of(taxes))

                            fun taxes(taxes: JsonField<Taxes>) = apply { this.taxes = taxes }

                            fun totalHours(totalHours: Boolean) =
                                totalHours(JsonField.of(totalHours))

                            fun totalHours(totalHours: JsonField<Boolean>) = apply {
                                this.totalHours = totalHours
                            }

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

                            fun build(): PayStatements =
                                PayStatements(
                                    earnings,
                                    employeeDeductions,
                                    employerContributions,
                                    grossPay,
                                    individualId,
                                    netPay,
                                    paymentMethod,
                                    taxes,
                                    totalHours,
                                    type,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        @NoAutoDetect
                        class Earnings
                        @JsonCreator
                        private constructor(
                            @JsonProperty("amount")
                            @ExcludeMissing
                            private val amount: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("currency")
                            @ExcludeMissing
                            private val currency: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("name")
                            @ExcludeMissing
                            private val name: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            private val type: JsonField<Boolean> = JsonMissing.of(),
                            @JsonAnySetter
                            private val additionalProperties: Map<String, JsonValue> =
                                immutableEmptyMap(),
                        ) {

                            fun amount(): Optional<Boolean> =
                                Optional.ofNullable(amount.getNullable("amount"))

                            fun currency(): Optional<Boolean> =
                                Optional.ofNullable(currency.getNullable("currency"))

                            fun name(): Optional<Boolean> =
                                Optional.ofNullable(name.getNullable("name"))

                            fun type(): Optional<Boolean> =
                                Optional.ofNullable(type.getNullable("type"))

                            @JsonProperty("amount")
                            @ExcludeMissing
                            fun _amount(): JsonField<Boolean> = amount

                            @JsonProperty("currency")
                            @ExcludeMissing
                            fun _currency(): JsonField<Boolean> = currency

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun _name(): JsonField<Boolean> = name

                            @JsonProperty("type")
                            @ExcludeMissing
                            fun _type(): JsonField<Boolean> = type

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            private var validated: Boolean = false

                            fun validate(): Earnings = apply {
                                if (validated) {
                                    return@apply
                                }

                                amount()
                                currency()
                                name()
                                type()
                                validated = true
                            }

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [Earnings]. */
                            class Builder internal constructor() {

                                private var amount: JsonField<Boolean> = JsonMissing.of()
                                private var currency: JsonField<Boolean> = JsonMissing.of()
                                private var name: JsonField<Boolean> = JsonMissing.of()
                                private var type: JsonField<Boolean> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(earnings: Earnings) = apply {
                                    amount = earnings.amount
                                    currency = earnings.currency
                                    name = earnings.name
                                    type = earnings.type
                                    additionalProperties =
                                        earnings.additionalProperties.toMutableMap()
                                }

                                fun amount(amount: Boolean) = amount(JsonField.of(amount))

                                fun amount(amount: JsonField<Boolean>) = apply {
                                    this.amount = amount
                                }

                                fun currency(currency: Boolean) = currency(JsonField.of(currency))

                                fun currency(currency: JsonField<Boolean>) = apply {
                                    this.currency = currency
                                }

                                fun name(name: Boolean) = name(JsonField.of(name))

                                fun name(name: JsonField<Boolean>) = apply { this.name = name }

                                fun type(type: Boolean) = type(JsonField.of(type))

                                fun type(type: JsonField<Boolean>) = apply { this.type = type }

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
                                        amount,
                                        currency,
                                        name,
                                        type,
                                        additionalProperties.toImmutable(),
                                    )
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is Earnings && amount == other.amount && currency == other.currency && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(amount, currency, name, type, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "Earnings{amount=$amount, currency=$currency, name=$name, type=$type, additionalProperties=$additionalProperties}"
                        }

                        @NoAutoDetect
                        class EmployeeDeductions
                        @JsonCreator
                        private constructor(
                            @JsonProperty("amount")
                            @ExcludeMissing
                            private val amount: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("currency")
                            @ExcludeMissing
                            private val currency: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("name")
                            @ExcludeMissing
                            private val name: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("pre_tax")
                            @ExcludeMissing
                            private val preTax: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            private val type: JsonField<Boolean> = JsonMissing.of(),
                            @JsonAnySetter
                            private val additionalProperties: Map<String, JsonValue> =
                                immutableEmptyMap(),
                        ) {

                            fun amount(): Optional<Boolean> =
                                Optional.ofNullable(amount.getNullable("amount"))

                            fun currency(): Optional<Boolean> =
                                Optional.ofNullable(currency.getNullable("currency"))

                            fun name(): Optional<Boolean> =
                                Optional.ofNullable(name.getNullable("name"))

                            fun preTax(): Optional<Boolean> =
                                Optional.ofNullable(preTax.getNullable("pre_tax"))

                            fun type(): Optional<Boolean> =
                                Optional.ofNullable(type.getNullable("type"))

                            @JsonProperty("amount")
                            @ExcludeMissing
                            fun _amount(): JsonField<Boolean> = amount

                            @JsonProperty("currency")
                            @ExcludeMissing
                            fun _currency(): JsonField<Boolean> = currency

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun _name(): JsonField<Boolean> = name

                            @JsonProperty("pre_tax")
                            @ExcludeMissing
                            fun _preTax(): JsonField<Boolean> = preTax

                            @JsonProperty("type")
                            @ExcludeMissing
                            fun _type(): JsonField<Boolean> = type

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            private var validated: Boolean = false

                            fun validate(): EmployeeDeductions = apply {
                                if (validated) {
                                    return@apply
                                }

                                amount()
                                currency()
                                name()
                                preTax()
                                type()
                                validated = true
                            }

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [EmployeeDeductions]. */
                            class Builder internal constructor() {

                                private var amount: JsonField<Boolean> = JsonMissing.of()
                                private var currency: JsonField<Boolean> = JsonMissing.of()
                                private var name: JsonField<Boolean> = JsonMissing.of()
                                private var preTax: JsonField<Boolean> = JsonMissing.of()
                                private var type: JsonField<Boolean> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(employeeDeductions: EmployeeDeductions) = apply {
                                    amount = employeeDeductions.amount
                                    currency = employeeDeductions.currency
                                    name = employeeDeductions.name
                                    preTax = employeeDeductions.preTax
                                    type = employeeDeductions.type
                                    additionalProperties =
                                        employeeDeductions.additionalProperties.toMutableMap()
                                }

                                fun amount(amount: Boolean) = amount(JsonField.of(amount))

                                fun amount(amount: JsonField<Boolean>) = apply {
                                    this.amount = amount
                                }

                                fun currency(currency: Boolean) = currency(JsonField.of(currency))

                                fun currency(currency: JsonField<Boolean>) = apply {
                                    this.currency = currency
                                }

                                fun name(name: Boolean) = name(JsonField.of(name))

                                fun name(name: JsonField<Boolean>) = apply { this.name = name }

                                fun preTax(preTax: Boolean) = preTax(JsonField.of(preTax))

                                fun preTax(preTax: JsonField<Boolean>) = apply {
                                    this.preTax = preTax
                                }

                                fun type(type: Boolean) = type(JsonField.of(type))

                                fun type(type: JsonField<Boolean>) = apply { this.type = type }

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
                                        amount,
                                        currency,
                                        name,
                                        preTax,
                                        type,
                                        additionalProperties.toImmutable(),
                                    )
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is EmployeeDeductions && amount == other.amount && currency == other.currency && name == other.name && preTax == other.preTax && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(amount, currency, name, preTax, type, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "EmployeeDeductions{amount=$amount, currency=$currency, name=$name, preTax=$preTax, type=$type, additionalProperties=$additionalProperties}"
                        }

                        @NoAutoDetect
                        class EmployerContributions
                        @JsonCreator
                        private constructor(
                            @JsonProperty("amount")
                            @ExcludeMissing
                            private val amount: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("currency")
                            @ExcludeMissing
                            private val currency: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("name")
                            @ExcludeMissing
                            private val name: JsonField<Boolean> = JsonMissing.of(),
                            @JsonAnySetter
                            private val additionalProperties: Map<String, JsonValue> =
                                immutableEmptyMap(),
                        ) {

                            fun amount(): Optional<Boolean> =
                                Optional.ofNullable(amount.getNullable("amount"))

                            fun currency(): Optional<Boolean> =
                                Optional.ofNullable(currency.getNullable("currency"))

                            fun name(): Optional<Boolean> =
                                Optional.ofNullable(name.getNullable("name"))

                            @JsonProperty("amount")
                            @ExcludeMissing
                            fun _amount(): JsonField<Boolean> = amount

                            @JsonProperty("currency")
                            @ExcludeMissing
                            fun _currency(): JsonField<Boolean> = currency

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun _name(): JsonField<Boolean> = name

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            private var validated: Boolean = false

                            fun validate(): EmployerContributions = apply {
                                if (validated) {
                                    return@apply
                                }

                                amount()
                                currency()
                                name()
                                validated = true
                            }

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [EmployerContributions]. */
                            class Builder internal constructor() {

                                private var amount: JsonField<Boolean> = JsonMissing.of()
                                private var currency: JsonField<Boolean> = JsonMissing.of()
                                private var name: JsonField<Boolean> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(employerContributions: EmployerContributions) =
                                    apply {
                                        amount = employerContributions.amount
                                        currency = employerContributions.currency
                                        name = employerContributions.name
                                        additionalProperties =
                                            employerContributions.additionalProperties
                                                .toMutableMap()
                                    }

                                fun amount(amount: Boolean) = amount(JsonField.of(amount))

                                fun amount(amount: JsonField<Boolean>) = apply {
                                    this.amount = amount
                                }

                                fun currency(currency: Boolean) = currency(JsonField.of(currency))

                                fun currency(currency: JsonField<Boolean>) = apply {
                                    this.currency = currency
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

                                fun build(): EmployerContributions =
                                    EmployerContributions(
                                        amount,
                                        currency,
                                        name,
                                        additionalProperties.toImmutable(),
                                    )
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is EmployerContributions && amount == other.amount && currency == other.currency && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(amount, currency, name, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "EmployerContributions{amount=$amount, currency=$currency, name=$name, additionalProperties=$additionalProperties}"
                        }

                        @NoAutoDetect
                        class Taxes
                        @JsonCreator
                        private constructor(
                            @JsonProperty("amount")
                            @ExcludeMissing
                            private val amount: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("currency")
                            @ExcludeMissing
                            private val currency: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("employer")
                            @ExcludeMissing
                            private val employer: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("name")
                            @ExcludeMissing
                            private val name: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            private val type: JsonField<Boolean> = JsonMissing.of(),
                            @JsonAnySetter
                            private val additionalProperties: Map<String, JsonValue> =
                                immutableEmptyMap(),
                        ) {

                            fun amount(): Optional<Boolean> =
                                Optional.ofNullable(amount.getNullable("amount"))

                            fun currency(): Optional<Boolean> =
                                Optional.ofNullable(currency.getNullable("currency"))

                            fun employer(): Optional<Boolean> =
                                Optional.ofNullable(employer.getNullable("employer"))

                            fun name(): Optional<Boolean> =
                                Optional.ofNullable(name.getNullable("name"))

                            fun type(): Optional<Boolean> =
                                Optional.ofNullable(type.getNullable("type"))

                            @JsonProperty("amount")
                            @ExcludeMissing
                            fun _amount(): JsonField<Boolean> = amount

                            @JsonProperty("currency")
                            @ExcludeMissing
                            fun _currency(): JsonField<Boolean> = currency

                            @JsonProperty("employer")
                            @ExcludeMissing
                            fun _employer(): JsonField<Boolean> = employer

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun _name(): JsonField<Boolean> = name

                            @JsonProperty("type")
                            @ExcludeMissing
                            fun _type(): JsonField<Boolean> = type

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            private var validated: Boolean = false

                            fun validate(): Taxes = apply {
                                if (validated) {
                                    return@apply
                                }

                                amount()
                                currency()
                                employer()
                                name()
                                type()
                                validated = true
                            }

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [Taxes]. */
                            class Builder internal constructor() {

                                private var amount: JsonField<Boolean> = JsonMissing.of()
                                private var currency: JsonField<Boolean> = JsonMissing.of()
                                private var employer: JsonField<Boolean> = JsonMissing.of()
                                private var name: JsonField<Boolean> = JsonMissing.of()
                                private var type: JsonField<Boolean> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(taxes: Taxes) = apply {
                                    amount = taxes.amount
                                    currency = taxes.currency
                                    employer = taxes.employer
                                    name = taxes.name
                                    type = taxes.type
                                    additionalProperties = taxes.additionalProperties.toMutableMap()
                                }

                                fun amount(amount: Boolean) = amount(JsonField.of(amount))

                                fun amount(amount: JsonField<Boolean>) = apply {
                                    this.amount = amount
                                }

                                fun currency(currency: Boolean) = currency(JsonField.of(currency))

                                fun currency(currency: JsonField<Boolean>) = apply {
                                    this.currency = currency
                                }

                                fun employer(employer: Boolean) = employer(JsonField.of(employer))

                                fun employer(employer: JsonField<Boolean>) = apply {
                                    this.employer = employer
                                }

                                fun name(name: Boolean) = name(JsonField.of(name))

                                fun name(name: JsonField<Boolean>) = apply { this.name = name }

                                fun type(type: Boolean) = type(JsonField.of(type))

                                fun type(type: JsonField<Boolean>) = apply { this.type = type }

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
                                        amount,
                                        currency,
                                        employer,
                                        name,
                                        type,
                                        additionalProperties.toImmutable(),
                                    )
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is Taxes && amount == other.amount && currency == other.currency && employer == other.employer && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(amount, currency, employer, name, type, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "Taxes{amount=$amount, currency=$currency, employer=$employer, name=$name, type=$type, additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is PayStatements && earnings == other.earnings && employeeDeductions == other.employeeDeductions && employerContributions == other.employerContributions && grossPay == other.grossPay && individualId == other.individualId && netPay == other.netPay && paymentMethod == other.paymentMethod && taxes == other.taxes && totalHours == other.totalHours && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(earnings, employeeDeductions, employerContributions, grossPay, individualId, netPay, paymentMethod, taxes, totalHours, type, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "PayStatements{earnings=$earnings, employeeDeductions=$employeeDeductions, employerContributions=$employerContributions, grossPay=$grossPay, individualId=$individualId, netPay=$netPay, paymentMethod=$paymentMethod, taxes=$taxes, totalHours=$totalHours, type=$type, additionalProperties=$additionalProperties}"
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
                    @JsonProperty("company_debit")
                    @ExcludeMissing
                    private val companyDebit: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("debit_date")
                    @ExcludeMissing
                    private val debitDate: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("employee_taxes")
                    @ExcludeMissing
                    private val employeeTaxes: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("employer_taxes")
                    @ExcludeMissing
                    private val employerTaxes: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("gross_pay")
                    @ExcludeMissing
                    private val grossPay: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("individual_ids")
                    @ExcludeMissing
                    private val individualIds: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("net_pay")
                    @ExcludeMissing
                    private val netPay: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("pay_date")
                    @ExcludeMissing
                    private val payDate: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("pay_frequencies")
                    @ExcludeMissing
                    private val payFrequencies: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("pay_group_ids")
                    @ExcludeMissing
                    private val payGroupIds: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("pay_period")
                    @ExcludeMissing
                    private val payPeriod: JsonField<PayPeriod> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun id(): Optional<Boolean> = Optional.ofNullable(id.getNullable("id"))

                    fun companyDebit(): Optional<Boolean> =
                        Optional.ofNullable(companyDebit.getNullable("company_debit"))

                    fun debitDate(): Optional<Boolean> =
                        Optional.ofNullable(debitDate.getNullable("debit_date"))

                    fun employeeTaxes(): Optional<Boolean> =
                        Optional.ofNullable(employeeTaxes.getNullable("employee_taxes"))

                    fun employerTaxes(): Optional<Boolean> =
                        Optional.ofNullable(employerTaxes.getNullable("employer_taxes"))

                    fun grossPay(): Optional<Boolean> =
                        Optional.ofNullable(grossPay.getNullable("gross_pay"))

                    fun individualIds(): Optional<Boolean> =
                        Optional.ofNullable(individualIds.getNullable("individual_ids"))

                    fun netPay(): Optional<Boolean> =
                        Optional.ofNullable(netPay.getNullable("net_pay"))

                    fun payDate(): Optional<Boolean> =
                        Optional.ofNullable(payDate.getNullable("pay_date"))

                    fun payFrequencies(): Optional<Boolean> =
                        Optional.ofNullable(payFrequencies.getNullable("pay_frequencies"))

                    fun payGroupIds(): Optional<Boolean> =
                        Optional.ofNullable(payGroupIds.getNullable("pay_group_ids"))

                    fun payPeriod(): Optional<PayPeriod> =
                        Optional.ofNullable(payPeriod.getNullable("pay_period"))

                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Boolean> = id

                    @JsonProperty("company_debit")
                    @ExcludeMissing
                    fun _companyDebit(): JsonField<Boolean> = companyDebit

                    @JsonProperty("debit_date")
                    @ExcludeMissing
                    fun _debitDate(): JsonField<Boolean> = debitDate

                    @JsonProperty("employee_taxes")
                    @ExcludeMissing
                    fun _employeeTaxes(): JsonField<Boolean> = employeeTaxes

                    @JsonProperty("employer_taxes")
                    @ExcludeMissing
                    fun _employerTaxes(): JsonField<Boolean> = employerTaxes

                    @JsonProperty("gross_pay")
                    @ExcludeMissing
                    fun _grossPay(): JsonField<Boolean> = grossPay

                    @JsonProperty("individual_ids")
                    @ExcludeMissing
                    fun _individualIds(): JsonField<Boolean> = individualIds

                    @JsonProperty("net_pay")
                    @ExcludeMissing
                    fun _netPay(): JsonField<Boolean> = netPay

                    @JsonProperty("pay_date")
                    @ExcludeMissing
                    fun _payDate(): JsonField<Boolean> = payDate

                    @JsonProperty("pay_frequencies")
                    @ExcludeMissing
                    fun _payFrequencies(): JsonField<Boolean> = payFrequencies

                    @JsonProperty("pay_group_ids")
                    @ExcludeMissing
                    fun _payGroupIds(): JsonField<Boolean> = payGroupIds

                    @JsonProperty("pay_period")
                    @ExcludeMissing
                    fun _payPeriod(): JsonField<PayPeriod> = payPeriod

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): SupportedPaymentFields = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        companyDebit()
                        debitDate()
                        employeeTaxes()
                        employerTaxes()
                        grossPay()
                        individualIds()
                        netPay()
                        payDate()
                        payFrequencies()
                        payGroupIds()
                        payPeriod().ifPresent { it.validate() }
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [SupportedPaymentFields]. */
                    class Builder internal constructor() {

                        private var id: JsonField<Boolean> = JsonMissing.of()
                        private var companyDebit: JsonField<Boolean> = JsonMissing.of()
                        private var debitDate: JsonField<Boolean> = JsonMissing.of()
                        private var employeeTaxes: JsonField<Boolean> = JsonMissing.of()
                        private var employerTaxes: JsonField<Boolean> = JsonMissing.of()
                        private var grossPay: JsonField<Boolean> = JsonMissing.of()
                        private var individualIds: JsonField<Boolean> = JsonMissing.of()
                        private var netPay: JsonField<Boolean> = JsonMissing.of()
                        private var payDate: JsonField<Boolean> = JsonMissing.of()
                        private var payFrequencies: JsonField<Boolean> = JsonMissing.of()
                        private var payGroupIds: JsonField<Boolean> = JsonMissing.of()
                        private var payPeriod: JsonField<PayPeriod> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(supportedPaymentFields: SupportedPaymentFields) = apply {
                            id = supportedPaymentFields.id
                            companyDebit = supportedPaymentFields.companyDebit
                            debitDate = supportedPaymentFields.debitDate
                            employeeTaxes = supportedPaymentFields.employeeTaxes
                            employerTaxes = supportedPaymentFields.employerTaxes
                            grossPay = supportedPaymentFields.grossPay
                            individualIds = supportedPaymentFields.individualIds
                            netPay = supportedPaymentFields.netPay
                            payDate = supportedPaymentFields.payDate
                            payFrequencies = supportedPaymentFields.payFrequencies
                            payGroupIds = supportedPaymentFields.payGroupIds
                            payPeriod = supportedPaymentFields.payPeriod
                            additionalProperties =
                                supportedPaymentFields.additionalProperties.toMutableMap()
                        }

                        fun id(id: Boolean) = id(JsonField.of(id))

                        fun id(id: JsonField<Boolean>) = apply { this.id = id }

                        fun companyDebit(companyDebit: Boolean) =
                            companyDebit(JsonField.of(companyDebit))

                        fun companyDebit(companyDebit: JsonField<Boolean>) = apply {
                            this.companyDebit = companyDebit
                        }

                        fun debitDate(debitDate: Boolean) = debitDate(JsonField.of(debitDate))

                        fun debitDate(debitDate: JsonField<Boolean>) = apply {
                            this.debitDate = debitDate
                        }

                        fun employeeTaxes(employeeTaxes: Boolean) =
                            employeeTaxes(JsonField.of(employeeTaxes))

                        fun employeeTaxes(employeeTaxes: JsonField<Boolean>) = apply {
                            this.employeeTaxes = employeeTaxes
                        }

                        fun employerTaxes(employerTaxes: Boolean) =
                            employerTaxes(JsonField.of(employerTaxes))

                        fun employerTaxes(employerTaxes: JsonField<Boolean>) = apply {
                            this.employerTaxes = employerTaxes
                        }

                        fun grossPay(grossPay: Boolean) = grossPay(JsonField.of(grossPay))

                        fun grossPay(grossPay: JsonField<Boolean>) = apply {
                            this.grossPay = grossPay
                        }

                        fun individualIds(individualIds: Boolean) =
                            individualIds(JsonField.of(individualIds))

                        fun individualIds(individualIds: JsonField<Boolean>) = apply {
                            this.individualIds = individualIds
                        }

                        fun netPay(netPay: Boolean) = netPay(JsonField.of(netPay))

                        fun netPay(netPay: JsonField<Boolean>) = apply { this.netPay = netPay }

                        fun payDate(payDate: Boolean) = payDate(JsonField.of(payDate))

                        fun payDate(payDate: JsonField<Boolean>) = apply { this.payDate = payDate }

                        fun payFrequencies(payFrequencies: Boolean) =
                            payFrequencies(JsonField.of(payFrequencies))

                        fun payFrequencies(payFrequencies: JsonField<Boolean>) = apply {
                            this.payFrequencies = payFrequencies
                        }

                        fun payGroupIds(payGroupIds: Boolean) =
                            payGroupIds(JsonField.of(payGroupIds))

                        fun payGroupIds(payGroupIds: JsonField<Boolean>) = apply {
                            this.payGroupIds = payGroupIds
                        }

                        fun payPeriod(payPeriod: PayPeriod) = payPeriod(JsonField.of(payPeriod))

                        fun payPeriod(payPeriod: JsonField<PayPeriod>) = apply {
                            this.payPeriod = payPeriod
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
                                companyDebit,
                                debitDate,
                                employeeTaxes,
                                employerTaxes,
                                grossPay,
                                individualIds,
                                netPay,
                                payDate,
                                payFrequencies,
                                payGroupIds,
                                payPeriod,
                                additionalProperties.toImmutable(),
                            )
                    }

                    @NoAutoDetect
                    class PayPeriod
                    @JsonCreator
                    private constructor(
                        @JsonProperty("end_date")
                        @ExcludeMissing
                        private val endDate: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("start_date")
                        @ExcludeMissing
                        private val startDate: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        fun endDate(): Optional<Boolean> =
                            Optional.ofNullable(endDate.getNullable("end_date"))

                        fun startDate(): Optional<Boolean> =
                            Optional.ofNullable(startDate.getNullable("start_date"))

                        @JsonProperty("end_date")
                        @ExcludeMissing
                        fun _endDate(): JsonField<Boolean> = endDate

                        @JsonProperty("start_date")
                        @ExcludeMissing
                        fun _startDate(): JsonField<Boolean> = startDate

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): PayPeriod = apply {
                            if (validated) {
                                return@apply
                            }

                            endDate()
                            startDate()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [PayPeriod]. */
                        class Builder internal constructor() {

                            private var endDate: JsonField<Boolean> = JsonMissing.of()
                            private var startDate: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(payPeriod: PayPeriod) = apply {
                                endDate = payPeriod.endDate
                                startDate = payPeriod.startDate
                                additionalProperties = payPeriod.additionalProperties.toMutableMap()
                            }

                            fun endDate(endDate: Boolean) = endDate(JsonField.of(endDate))

                            fun endDate(endDate: JsonField<Boolean>) = apply {
                                this.endDate = endDate
                            }

                            fun startDate(startDate: Boolean) = startDate(JsonField.of(startDate))

                            fun startDate(startDate: JsonField<Boolean>) = apply {
                                this.startDate = startDate
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
                                    endDate,
                                    startDate,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is PayPeriod && endDate == other.endDate && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(endDate, startDate, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "PayPeriod{endDate=$endDate, startDate=$startDate, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is SupportedPaymentFields && id == other.id && companyDebit == other.companyDebit && debitDate == other.debitDate && employeeTaxes == other.employeeTaxes && employerTaxes == other.employerTaxes && grossPay == other.grossPay && individualIds == other.individualIds && netPay == other.netPay && payDate == other.payDate && payFrequencies == other.payFrequencies && payGroupIds == other.payGroupIds && payPeriod == other.payPeriod && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, companyDebit, debitDate, employeeTaxes, employerTaxes, grossPay, individualIds, netPay, payDate, payFrequencies, payGroupIds, payPeriod, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SupportedPaymentFields{id=$id, companyDebit=$companyDebit, debitDate=$debitDate, employeeTaxes=$employeeTaxes, employerTaxes=$employerTaxes, grossPay=$grossPay, individualIds=$individualIds, netPay=$netPay, payDate=$payDate, payFrequencies=$payFrequencies, payGroupIds=$payGroupIds, payPeriod=$payPeriod, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is SupportedFields && company == other.company && directory == other.directory && employment == other.employment && individual == other.individual && payGroup == other.payGroup && payStatement == other.payStatement && payment == other.payment && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(company, directory, employment, individual, payGroup, payStatement, payment, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SupportedFields{company=$company, directory=$directory, employment=$employment, individual=$individual, payGroup=$payGroup, payStatement=$payStatement, payment=$payment, additionalProperties=$additionalProperties}"
            }

            /** The type of authentication method. */
            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ASSISTED = of("assisted")

                    @JvmField val CREDENTIAL = of("credential")

                    @JvmField val API_TOKEN = of("api_token")

                    @JvmField val API_CREDENTIAL = of("api_credential")

                    @JvmField val OAUTH = of("oauth")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    ASSISTED,
                    CREDENTIAL,
                    API_TOKEN,
                    API_CREDENTIAL,
                    OAUTH,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ASSISTED,
                    CREDENTIAL,
                    API_TOKEN,
                    API_CREDENTIAL,
                    OAUTH,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ASSISTED -> Value.ASSISTED
                        CREDENTIAL -> Value.CREDENTIAL
                        API_TOKEN -> Value.API_TOKEN
                        API_CREDENTIAL -> Value.API_CREDENTIAL
                        OAUTH -> Value.OAUTH
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

                return /* spotless:off */ other is AuthenticationMethod && benefitsSupport == other.benefitsSupport && supportedFields == other.supportedFields && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(benefitsSupport, supportedFields, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AuthenticationMethod{benefitsSupport=$benefitsSupport, supportedFields=$supportedFields, type=$type, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && authenticationMethod == other.authenticationMethod && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(authenticationMethod, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{authenticationMethod=$authenticationMethod, status=$status, additionalProperties=$additionalProperties}"
    }

    class EventType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACCOUNT_UPDATED = of("account.updated")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            ACCOUNT_UPDATED,
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACCOUNT_UPDATED,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ACCOUNT_UPDATED -> Value.ACCOUNT_UPDATED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws FinchInvalidDataException if this class instance's value is a not a known member.
         */
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

        return /* spotless:off */ other is AccountUpdateEvent && accountId == other.accountId && companyId == other.companyId && connectionId == other.connectionId && data == other.data && eventType == other.eventType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountId, companyId, connectionId, data, eventType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountUpdateEvent{accountId=$accountId, companyId=$companyId, connectionId=$connectionId, data=$data, eventType=$eventType, additionalProperties=$additionalProperties}"
}

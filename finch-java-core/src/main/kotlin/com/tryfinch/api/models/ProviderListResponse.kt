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

class ProviderListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val displayName: JsonField<String>,
    private val products: JsonField<List<String>>,
    private val authenticationMethods: JsonField<List<AuthenticationMethod>>,
    private val beta: JsonField<Boolean>,
    private val icon: JsonField<String>,
    private val logo: JsonField<String>,
    private val manual: JsonField<Boolean>,
    private val mfaRequired: JsonField<Boolean>,
    private val primaryColor: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("display_name")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("products")
        @ExcludeMissing
        products: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("authentication_methods")
        @ExcludeMissing
        authenticationMethods: JsonField<List<AuthenticationMethod>> = JsonMissing.of(),
        @JsonProperty("beta") @ExcludeMissing beta: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("icon") @ExcludeMissing icon: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logo") @ExcludeMissing logo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("manual") @ExcludeMissing manual: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("mfa_required")
        @ExcludeMissing
        mfaRequired: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("primary_color")
        @ExcludeMissing
        primaryColor: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        displayName,
        products,
        authenticationMethods,
        beta,
        icon,
        logo,
        manual,
        mfaRequired,
        primaryColor,
        mutableMapOf(),
    )

    /**
     * The id of the payroll provider used in Connect.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The display name of the payroll provider.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = displayName.getRequired("display_name")

    /**
     * The list of Finch products supported on this payroll provider.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun products(): List<String> = products.getRequired("products")

    /**
     * The authentication methods supported by the provider.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authenticationMethods(): Optional<List<AuthenticationMethod>> =
        authenticationMethods.getOptional("authentication_methods")

    /**
     * `true` if the integration is in a beta state, `false` otherwise
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beta(): Optional<Boolean> = beta.getOptional("beta")

    /**
     * The url to the official icon of the payroll provider.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun icon(): Optional<String> = icon.getOptional("icon")

    /**
     * The url to the official logo of the payroll provider.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logo(): Optional<String> = logo.getOptional("logo")

    /**
     * [DEPRECATED] Whether the Finch integration with this provider uses the Assisted Connect Flow
     * by default. This field is now deprecated. Please check for a `type` of `assisted` in the
     * `authentication_methods` field instead.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun manual(): Optional<Boolean> = manual.getOptional("manual")

    /**
     * whether MFA is required for the provider.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mfaRequired(): Optional<Boolean> = mfaRequired.getOptional("mfa_required")

    /**
     * The hex code for the primary color of the payroll provider.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryColor(): Optional<String> = primaryColor.getOptional("primary_color")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("display_name")
    @ExcludeMissing
    fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [products].
     *
     * Unlike [products], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("products") @ExcludeMissing fun _products(): JsonField<List<String>> = products

    /**
     * Returns the raw JSON value of [authenticationMethods].
     *
     * Unlike [authenticationMethods], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("authentication_methods")
    @ExcludeMissing
    fun _authenticationMethods(): JsonField<List<AuthenticationMethod>> = authenticationMethods

    /**
     * Returns the raw JSON value of [beta].
     *
     * Unlike [beta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beta") @ExcludeMissing fun _beta(): JsonField<Boolean> = beta

    /**
     * Returns the raw JSON value of [icon].
     *
     * Unlike [icon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("icon") @ExcludeMissing fun _icon(): JsonField<String> = icon

    /**
     * Returns the raw JSON value of [logo].
     *
     * Unlike [logo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logo") @ExcludeMissing fun _logo(): JsonField<String> = logo

    /**
     * Returns the raw JSON value of [manual].
     *
     * Unlike [manual], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("manual")
    @ExcludeMissing
    fun _manual(): JsonField<Boolean> = manual

    /**
     * Returns the raw JSON value of [mfaRequired].
     *
     * Unlike [mfaRequired], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mfa_required")
    @ExcludeMissing
    fun _mfaRequired(): JsonField<Boolean> = mfaRequired

    /**
     * Returns the raw JSON value of [primaryColor].
     *
     * Unlike [primaryColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primary_color")
    @ExcludeMissing
    fun _primaryColor(): JsonField<String> = primaryColor

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
         * Returns a mutable builder for constructing an instance of [ProviderListResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .displayName()
         * .products()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProviderListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var displayName: JsonField<String>? = null
        private var products: JsonField<MutableList<String>>? = null
        private var authenticationMethods: JsonField<MutableList<AuthenticationMethod>>? = null
        private var beta: JsonField<Boolean> = JsonMissing.of()
        private var icon: JsonField<String> = JsonMissing.of()
        private var logo: JsonField<String> = JsonMissing.of()
        private var manual: JsonField<Boolean> = JsonMissing.of()
        private var mfaRequired: JsonField<Boolean> = JsonMissing.of()
        private var primaryColor: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(providerListResponse: ProviderListResponse) = apply {
            id = providerListResponse.id
            displayName = providerListResponse.displayName
            products = providerListResponse.products.map { it.toMutableList() }
            authenticationMethods =
                providerListResponse.authenticationMethods.map { it.toMutableList() }
            beta = providerListResponse.beta
            icon = providerListResponse.icon
            logo = providerListResponse.logo
            manual = providerListResponse.manual
            mfaRequired = providerListResponse.mfaRequired
            primaryColor = providerListResponse.primaryColor
            additionalProperties = providerListResponse.additionalProperties.toMutableMap()
        }

        /** The id of the payroll provider used in Connect. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The display name of the payroll provider. */
        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        /** The list of Finch products supported on this payroll provider. */
        fun products(products: List<String>) = products(JsonField.of(products))

        /**
         * Sets [Builder.products] to an arbitrary JSON value.
         *
         * You should usually call [Builder.products] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun products(products: JsonField<List<String>>) = apply {
            this.products = products.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [products].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProduct(product: String) = apply {
            products =
                (products ?: JsonField.of(mutableListOf())).also {
                    checkKnown("products", it).add(product)
                }
        }

        /** The authentication methods supported by the provider. */
        fun authenticationMethods(authenticationMethods: List<AuthenticationMethod>) =
            authenticationMethods(JsonField.of(authenticationMethods))

        /**
         * Sets [Builder.authenticationMethods] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authenticationMethods] with a well-typed
         * `List<AuthenticationMethod>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun authenticationMethods(authenticationMethods: JsonField<List<AuthenticationMethod>>) =
            apply {
                this.authenticationMethods = authenticationMethods.map { it.toMutableList() }
            }

        /**
         * Adds a single [AuthenticationMethod] to [authenticationMethods].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAuthenticationMethod(authenticationMethod: AuthenticationMethod) = apply {
            authenticationMethods =
                (authenticationMethods ?: JsonField.of(mutableListOf())).also {
                    checkKnown("authenticationMethods", it).add(authenticationMethod)
                }
        }

        /** `true` if the integration is in a beta state, `false` otherwise */
        fun beta(beta: Boolean) = beta(JsonField.of(beta))

        /**
         * Sets [Builder.beta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beta] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun beta(beta: JsonField<Boolean>) = apply { this.beta = beta }

        /** The url to the official icon of the payroll provider. */
        fun icon(icon: String) = icon(JsonField.of(icon))

        /**
         * Sets [Builder.icon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.icon] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun icon(icon: JsonField<String>) = apply { this.icon = icon }

        /** The url to the official logo of the payroll provider. */
        fun logo(logo: String) = logo(JsonField.of(logo))

        /**
         * Sets [Builder.logo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logo(logo: JsonField<String>) = apply { this.logo = logo }

        /**
         * [DEPRECATED] Whether the Finch integration with this provider uses the Assisted Connect
         * Flow by default. This field is now deprecated. Please check for a `type` of `assisted` in
         * the `authentication_methods` field instead.
         */
        @Deprecated("deprecated") fun manual(manual: Boolean) = manual(JsonField.of(manual))

        /**
         * Sets [Builder.manual] to an arbitrary JSON value.
         *
         * You should usually call [Builder.manual] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun manual(manual: JsonField<Boolean>) = apply { this.manual = manual }

        /** whether MFA is required for the provider. */
        fun mfaRequired(mfaRequired: Boolean) = mfaRequired(JsonField.of(mfaRequired))

        /**
         * Sets [Builder.mfaRequired] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mfaRequired] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mfaRequired(mfaRequired: JsonField<Boolean>) = apply { this.mfaRequired = mfaRequired }

        /** The hex code for the primary color of the payroll provider. */
        fun primaryColor(primaryColor: String) = primaryColor(JsonField.of(primaryColor))

        /**
         * Sets [Builder.primaryColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryColor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun primaryColor(primaryColor: JsonField<String>) = apply {
            this.primaryColor = primaryColor
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
         * Returns an immutable instance of [ProviderListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .displayName()
         * .products()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProviderListResponse =
            ProviderListResponse(
                checkRequired("id", id),
                checkRequired("displayName", displayName),
                checkRequired("products", products).map { it.toImmutable() },
                (authenticationMethods ?: JsonMissing.of()).map { it.toImmutable() },
                beta,
                icon,
                logo,
                manual,
                mfaRequired,
                primaryColor,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ProviderListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        displayName()
        products()
        authenticationMethods().ifPresent { it.forEach { it.validate() } }
        beta()
        icon()
        logo()
        manual()
        mfaRequired()
        primaryColor()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: FinchInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (products.asKnown().getOrNull()?.size ?: 0) +
            (authenticationMethods.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (beta.asKnown().isPresent) 1 else 0) +
            (if (icon.asKnown().isPresent) 1 else 0) +
            (if (logo.asKnown().isPresent) 1 else 0) +
            (if (manual.asKnown().isPresent) 1 else 0) +
            (if (mfaRequired.asKnown().isPresent) 1 else 0) +
            (if (primaryColor.asKnown().isPresent) 1 else 0)

    class AuthenticationMethod
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val benefitsSupport: JsonField<BenefitsSupport>,
        private val supportedFields: JsonField<SupportedFields>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("benefits_support")
            @ExcludeMissing
            benefitsSupport: JsonField<BenefitsSupport> = JsonMissing.of(),
            @JsonProperty("supported_fields")
            @ExcludeMissing
            supportedFields: JsonField<SupportedFields> = JsonMissing.of(),
        ) : this(type, benefitsSupport, supportedFields, mutableMapOf())

        /**
         * The type of authentication method
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The supported benefit types and their configurations
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun benefitsSupport(): Optional<BenefitsSupport> =
            benefitsSupport.getOptional("benefits_support")

        /**
         * The supported fields for each Finch product
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun supportedFields(): Optional<SupportedFields> =
            supportedFields.getOptional("supported_fields")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [benefitsSupport].
         *
         * Unlike [benefitsSupport], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("benefits_support")
        @ExcludeMissing
        fun _benefitsSupport(): JsonField<BenefitsSupport> = benefitsSupport

        /**
         * Returns the raw JSON value of [supportedFields].
         *
         * Unlike [supportedFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("supported_fields")
        @ExcludeMissing
        fun _supportedFields(): JsonField<SupportedFields> = supportedFields

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
             * Returns a mutable builder for constructing an instance of [AuthenticationMethod].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AuthenticationMethod]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
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

            /** The type of authentication method */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The supported benefit types and their configurations */
            fun benefitsSupport(benefitsSupport: BenefitsSupport) =
                benefitsSupport(JsonField.of(benefitsSupport))

            /**
             * Sets [Builder.benefitsSupport] to an arbitrary JSON value.
             *
             * You should usually call [Builder.benefitsSupport] with a well-typed [BenefitsSupport]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun benefitsSupport(benefitsSupport: JsonField<BenefitsSupport>) = apply {
                this.benefitsSupport = benefitsSupport
            }

            /** The supported fields for each Finch product */
            fun supportedFields(supportedFields: SupportedFields) =
                supportedFields(JsonField.of(supportedFields))

            /**
             * Sets [Builder.supportedFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.supportedFields] with a well-typed [SupportedFields]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [AuthenticationMethod].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AuthenticationMethod =
                AuthenticationMethod(
                    checkRequired("type", type),
                    benefitsSupport,
                    supportedFields,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AuthenticationMethod = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            benefitsSupport().ifPresent { it.validate() }
            supportedFields().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: FinchInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (type.asKnown().getOrNull()?.validity() ?: 0) +
                (benefitsSupport.asKnown().getOrNull()?.validity() ?: 0) +
                (supportedFields.asKnown().getOrNull()?.validity() ?: 0)

        /** The type of authentication method */
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

                @JvmField val ASSISTED = of("assisted")

                @JvmField val CREDENTIAL = of("credential")

                @JvmField val API_TOKEN = of("api_token")

                @JvmField val API_CREDENTIAL = of("api_credential")

                @JvmField val OAUTH = of("oauth")

                @JvmField val API = of("api")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                ASSISTED,
                CREDENTIAL,
                API_TOKEN,
                API_CREDENTIAL,
                OAUTH,
                API,
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
                ASSISTED,
                CREDENTIAL,
                API_TOKEN,
                API_CREDENTIAL,
                OAUTH,
                API,
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
                    ASSISTED -> Value.ASSISTED
                    CREDENTIAL -> Value.CREDENTIAL
                    API_TOKEN -> Value.API_TOKEN
                    API_CREDENTIAL -> Value.API_CREDENTIAL
                    OAUTH -> Value.OAUTH
                    API -> Value.API
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
                    API -> Known.API
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

            private var validated: Boolean = false

            fun validate(): Type = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: FinchInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The supported benefit types and their configurations */
        class BenefitsSupport
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [BenefitsSupport]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [BenefitsSupport]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(benefitsSupport: BenefitsSupport) = apply {
                    additionalProperties = benefitsSupport.additionalProperties.toMutableMap()
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

                /**
                 * Returns an immutable instance of [BenefitsSupport].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): BenefitsSupport = BenefitsSupport(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): BenefitsSupport = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: FinchInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BenefitsSupport &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "BenefitsSupport{additionalProperties=$additionalProperties}"
        }

        /** The supported fields for each Finch product */
        class SupportedFields
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [SupportedFields]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SupportedFields]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(supportedFields: SupportedFields) = apply {
                    additionalProperties = supportedFields.additionalProperties.toMutableMap()
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

                /**
                 * Returns an immutable instance of [SupportedFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): SupportedFields = SupportedFields(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): SupportedFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: FinchInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SupportedFields &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "SupportedFields{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AuthenticationMethod &&
                type == other.type &&
                benefitsSupport == other.benefitsSupport &&
                supportedFields == other.supportedFields &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(type, benefitsSupport, supportedFields, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AuthenticationMethod{type=$type, benefitsSupport=$benefitsSupport, supportedFields=$supportedFields, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProviderListResponse &&
            id == other.id &&
            displayName == other.displayName &&
            products == other.products &&
            authenticationMethods == other.authenticationMethods &&
            beta == other.beta &&
            icon == other.icon &&
            logo == other.logo &&
            manual == other.manual &&
            mfaRequired == other.mfaRequired &&
            primaryColor == other.primaryColor &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            displayName,
            products,
            authenticationMethods,
            beta,
            icon,
            logo,
            manual,
            mfaRequired,
            primaryColor,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProviderListResponse{id=$id, displayName=$displayName, products=$products, authenticationMethods=$authenticationMethods, beta=$beta, icon=$icon, logo=$logo, manual=$manual, mfaRequired=$mfaRequired, primaryColor=$primaryColor, additionalProperties=$additionalProperties}"
}

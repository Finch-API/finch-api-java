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
import com.tryfinch.api.core.Params
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new connect session for an employer */
class ConnectSessionConnectParams
private constructor(
    private val body: CreateConnectSessionRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Unique identifier for the customer
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * Name of the customer
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerName(): String = body.customerName()

    /**
     * The Finch products to request access to
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun products(): List<ConnectProducts> = body.products()

    /**
     * Email address of the customer
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerEmail(): Optional<String> = body.customerEmail()

    /**
     * Integration configuration for the connect session
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun integration(): Optional<Integration> = body.integration()

    /**
     * Enable manual authentication mode
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun manual(): Optional<Boolean> = body.manual()

    /**
     * The number of minutes until the session expires (defaults to 129,600, which is 90 days)
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minutesToExpire(): Optional<Double> = body.minutesToExpire()

    /**
     * The URI to redirect to after the Connect flow is completed
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun redirectUri(): Optional<String> = body.redirectUri()

    /**
     * Sandbox mode for testing
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sandbox(): Optional<Sandbox> = body.sandbox()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [customerName].
     *
     * Unlike [customerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerName(): JsonField<String> = body._customerName()

    /**
     * Returns the raw JSON value of [products].
     *
     * Unlike [products], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _products(): JsonField<List<ConnectProducts>> = body._products()

    /**
     * Returns the raw JSON value of [customerEmail].
     *
     * Unlike [customerEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerEmail(): JsonField<String> = body._customerEmail()

    /**
     * Returns the raw JSON value of [integration].
     *
     * Unlike [integration], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _integration(): JsonField<Integration> = body._integration()

    /**
     * Returns the raw JSON value of [manual].
     *
     * Unlike [manual], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _manual(): JsonField<Boolean> = body._manual()

    /**
     * Returns the raw JSON value of [minutesToExpire].
     *
     * Unlike [minutesToExpire], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _minutesToExpire(): JsonField<Double> = body._minutesToExpire()

    /**
     * Returns the raw JSON value of [redirectUri].
     *
     * Unlike [redirectUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _redirectUri(): JsonField<String> = body._redirectUri()

    /**
     * Returns the raw JSON value of [sandbox].
     *
     * Unlike [sandbox], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sandbox(): JsonField<Sandbox> = body._sandbox()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ConnectSessionConnectParams].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .customerName()
         * .products()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConnectSessionConnectParams]. */
    class Builder internal constructor() {

        private var body: CreateConnectSessionRequest.Builder =
            CreateConnectSessionRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(connectSessionConnectParams: ConnectSessionConnectParams) = apply {
            body = connectSessionConnectParams.body.toBuilder()
            additionalHeaders = connectSessionConnectParams.additionalHeaders.toBuilder()
            additionalQueryParams = connectSessionConnectParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [customerId]
         * - [customerName]
         * - [products]
         * - [customerEmail]
         * - [integration]
         * - etc.
         */
        fun body(body: CreateConnectSessionRequest) = apply { this.body = body.toBuilder() }

        /** Unique identifier for the customer */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** Name of the customer */
        fun customerName(customerName: String) = apply { body.customerName(customerName) }

        /**
         * Sets [Builder.customerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerName(customerName: JsonField<String>) = apply {
            body.customerName(customerName)
        }

        /** The Finch products to request access to */
        fun products(products: List<ConnectProducts>) = apply { body.products(products) }

        /**
         * Sets [Builder.products] to an arbitrary JSON value.
         *
         * You should usually call [Builder.products] with a well-typed `List<ConnectProducts>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun products(products: JsonField<List<ConnectProducts>>) = apply { body.products(products) }

        /**
         * Adds a single [ConnectProducts] to [products].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProduct(product: ConnectProducts) = apply { body.addProduct(product) }

        /** Email address of the customer */
        fun customerEmail(customerEmail: String?) = apply { body.customerEmail(customerEmail) }

        /** Alias for calling [Builder.customerEmail] with `customerEmail.orElse(null)`. */
        fun customerEmail(customerEmail: Optional<String>) =
            customerEmail(customerEmail.getOrNull())

        /**
         * Sets [Builder.customerEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerEmail(customerEmail: JsonField<String>) = apply {
            body.customerEmail(customerEmail)
        }

        /** Integration configuration for the connect session */
        fun integration(integration: Integration?) = apply { body.integration(integration) }

        /** Alias for calling [Builder.integration] with `integration.orElse(null)`. */
        fun integration(integration: Optional<Integration>) = integration(integration.getOrNull())

        /**
         * Sets [Builder.integration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integration] with a well-typed [Integration] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun integration(integration: JsonField<Integration>) = apply {
            body.integration(integration)
        }

        /** Enable manual authentication mode */
        fun manual(manual: Boolean?) = apply { body.manual(manual) }

        /**
         * Alias for [Builder.manual].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun manual(manual: Boolean) = manual(manual as Boolean?)

        /** Alias for calling [Builder.manual] with `manual.orElse(null)`. */
        fun manual(manual: Optional<Boolean>) = manual(manual.getOrNull())

        /**
         * Sets [Builder.manual] to an arbitrary JSON value.
         *
         * You should usually call [Builder.manual] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun manual(manual: JsonField<Boolean>) = apply { body.manual(manual) }

        /**
         * The number of minutes until the session expires (defaults to 129,600, which is 90 days)
         */
        fun minutesToExpire(minutesToExpire: Double?) = apply {
            body.minutesToExpire(minutesToExpire)
        }

        /**
         * Alias for [Builder.minutesToExpire].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minutesToExpire(minutesToExpire: Double) = minutesToExpire(minutesToExpire as Double?)

        /** Alias for calling [Builder.minutesToExpire] with `minutesToExpire.orElse(null)`. */
        fun minutesToExpire(minutesToExpire: Optional<Double>) =
            minutesToExpire(minutesToExpire.getOrNull())

        /**
         * Sets [Builder.minutesToExpire] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minutesToExpire] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun minutesToExpire(minutesToExpire: JsonField<Double>) = apply {
            body.minutesToExpire(minutesToExpire)
        }

        /** The URI to redirect to after the Connect flow is completed */
        fun redirectUri(redirectUri: String?) = apply { body.redirectUri(redirectUri) }

        /** Alias for calling [Builder.redirectUri] with `redirectUri.orElse(null)`. */
        fun redirectUri(redirectUri: Optional<String>) = redirectUri(redirectUri.getOrNull())

        /**
         * Sets [Builder.redirectUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redirectUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun redirectUri(redirectUri: JsonField<String>) = apply { body.redirectUri(redirectUri) }

        /** Sandbox mode for testing */
        fun sandbox(sandbox: Sandbox?) = apply { body.sandbox(sandbox) }

        /** Alias for calling [Builder.sandbox] with `sandbox.orElse(null)`. */
        fun sandbox(sandbox: Optional<Sandbox>) = sandbox(sandbox.getOrNull())

        /**
         * Sets [Builder.sandbox] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sandbox] with a well-typed [Sandbox] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sandbox(sandbox: JsonField<Sandbox>) = apply { body.sandbox(sandbox) }

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

        /**
         * Returns an immutable instance of [ConnectSessionConnectParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .customerName()
         * .products()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConnectSessionConnectParams =
            ConnectSessionConnectParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): CreateConnectSessionRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class CreateConnectSessionRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val customerId: JsonField<String>,
        private val customerName: JsonField<String>,
        private val products: JsonField<List<ConnectProducts>>,
        private val customerEmail: JsonField<String>,
        private val integration: JsonField<Integration>,
        private val manual: JsonField<Boolean>,
        private val minutesToExpire: JsonField<Double>,
        private val redirectUri: JsonField<String>,
        private val sandbox: JsonField<Sandbox>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_name")
            @ExcludeMissing
            customerName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("products")
            @ExcludeMissing
            products: JsonField<List<ConnectProducts>> = JsonMissing.of(),
            @JsonProperty("customer_email")
            @ExcludeMissing
            customerEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("integration")
            @ExcludeMissing
            integration: JsonField<Integration> = JsonMissing.of(),
            @JsonProperty("manual") @ExcludeMissing manual: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("minutes_to_expire")
            @ExcludeMissing
            minutesToExpire: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("redirect_uri")
            @ExcludeMissing
            redirectUri: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sandbox") @ExcludeMissing sandbox: JsonField<Sandbox> = JsonMissing.of(),
        ) : this(
            customerId,
            customerName,
            products,
            customerEmail,
            integration,
            manual,
            minutesToExpire,
            redirectUri,
            sandbox,
            mutableMapOf(),
        )

        /**
         * Unique identifier for the customer
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * Name of the customer
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerName(): String = customerName.getRequired("customer_name")

        /**
         * The Finch products to request access to
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun products(): List<ConnectProducts> = products.getRequired("products")

        /**
         * Email address of the customer
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerEmail(): Optional<String> = customerEmail.getOptional("customer_email")

        /**
         * Integration configuration for the connect session
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun integration(): Optional<Integration> = integration.getOptional("integration")

        /**
         * Enable manual authentication mode
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun manual(): Optional<Boolean> = manual.getOptional("manual")

        /**
         * The number of minutes until the session expires (defaults to 129,600, which is 90 days)
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minutesToExpire(): Optional<Double> = minutesToExpire.getOptional("minutes_to_expire")

        /**
         * The URI to redirect to after the Connect flow is completed
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun redirectUri(): Optional<String> = redirectUri.getOptional("redirect_uri")

        /**
         * Sandbox mode for testing
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sandbox(): Optional<Sandbox> = sandbox.getOptional("sandbox")

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [customerName].
         *
         * Unlike [customerName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customer_name")
        @ExcludeMissing
        fun _customerName(): JsonField<String> = customerName

        /**
         * Returns the raw JSON value of [products].
         *
         * Unlike [products], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("products")
        @ExcludeMissing
        fun _products(): JsonField<List<ConnectProducts>> = products

        /**
         * Returns the raw JSON value of [customerEmail].
         *
         * Unlike [customerEmail], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customer_email")
        @ExcludeMissing
        fun _customerEmail(): JsonField<String> = customerEmail

        /**
         * Returns the raw JSON value of [integration].
         *
         * Unlike [integration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("integration")
        @ExcludeMissing
        fun _integration(): JsonField<Integration> = integration

        /**
         * Returns the raw JSON value of [manual].
         *
         * Unlike [manual], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("manual") @ExcludeMissing fun _manual(): JsonField<Boolean> = manual

        /**
         * Returns the raw JSON value of [minutesToExpire].
         *
         * Unlike [minutesToExpire], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minutes_to_expire")
        @ExcludeMissing
        fun _minutesToExpire(): JsonField<Double> = minutesToExpire

        /**
         * Returns the raw JSON value of [redirectUri].
         *
         * Unlike [redirectUri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("redirect_uri")
        @ExcludeMissing
        fun _redirectUri(): JsonField<String> = redirectUri

        /**
         * Returns the raw JSON value of [sandbox].
         *
         * Unlike [sandbox], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sandbox") @ExcludeMissing fun _sandbox(): JsonField<Sandbox> = sandbox

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
             * Returns a mutable builder for constructing an instance of
             * [CreateConnectSessionRequest].
             *
             * The following fields are required:
             * ```java
             * .customerId()
             * .customerName()
             * .products()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreateConnectSessionRequest]. */
        class Builder internal constructor() {

            private var customerId: JsonField<String>? = null
            private var customerName: JsonField<String>? = null
            private var products: JsonField<MutableList<ConnectProducts>>? = null
            private var customerEmail: JsonField<String> = JsonMissing.of()
            private var integration: JsonField<Integration> = JsonMissing.of()
            private var manual: JsonField<Boolean> = JsonMissing.of()
            private var minutesToExpire: JsonField<Double> = JsonMissing.of()
            private var redirectUri: JsonField<String> = JsonMissing.of()
            private var sandbox: JsonField<Sandbox> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createConnectSessionRequest: CreateConnectSessionRequest) = apply {
                customerId = createConnectSessionRequest.customerId
                customerName = createConnectSessionRequest.customerName
                products = createConnectSessionRequest.products.map { it.toMutableList() }
                customerEmail = createConnectSessionRequest.customerEmail
                integration = createConnectSessionRequest.integration
                manual = createConnectSessionRequest.manual
                minutesToExpire = createConnectSessionRequest.minutesToExpire
                redirectUri = createConnectSessionRequest.redirectUri
                sandbox = createConnectSessionRequest.sandbox
                additionalProperties =
                    createConnectSessionRequest.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the customer */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** Name of the customer */
            fun customerName(customerName: String) = customerName(JsonField.of(customerName))

            /**
             * Sets [Builder.customerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerName(customerName: JsonField<String>) = apply {
                this.customerName = customerName
            }

            /** The Finch products to request access to */
            fun products(products: List<ConnectProducts>) = products(JsonField.of(products))

            /**
             * Sets [Builder.products] to an arbitrary JSON value.
             *
             * You should usually call [Builder.products] with a well-typed `List<ConnectProducts>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun products(products: JsonField<List<ConnectProducts>>) = apply {
                this.products = products.map { it.toMutableList() }
            }

            /**
             * Adds a single [ConnectProducts] to [products].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProduct(product: ConnectProducts) = apply {
                products =
                    (products ?: JsonField.of(mutableListOf())).also {
                        checkKnown("products", it).add(product)
                    }
            }

            /** Email address of the customer */
            fun customerEmail(customerEmail: String?) =
                customerEmail(JsonField.ofNullable(customerEmail))

            /** Alias for calling [Builder.customerEmail] with `customerEmail.orElse(null)`. */
            fun customerEmail(customerEmail: Optional<String>) =
                customerEmail(customerEmail.getOrNull())

            /**
             * Sets [Builder.customerEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerEmail] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerEmail(customerEmail: JsonField<String>) = apply {
                this.customerEmail = customerEmail
            }

            /** Integration configuration for the connect session */
            fun integration(integration: Integration?) =
                integration(JsonField.ofNullable(integration))

            /** Alias for calling [Builder.integration] with `integration.orElse(null)`. */
            fun integration(integration: Optional<Integration>) =
                integration(integration.getOrNull())

            /**
             * Sets [Builder.integration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.integration] with a well-typed [Integration] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun integration(integration: JsonField<Integration>) = apply {
                this.integration = integration
            }

            /** Enable manual authentication mode */
            fun manual(manual: Boolean?) = manual(JsonField.ofNullable(manual))

            /**
             * Alias for [Builder.manual].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun manual(manual: Boolean) = manual(manual as Boolean?)

            /** Alias for calling [Builder.manual] with `manual.orElse(null)`. */
            fun manual(manual: Optional<Boolean>) = manual(manual.getOrNull())

            /**
             * Sets [Builder.manual] to an arbitrary JSON value.
             *
             * You should usually call [Builder.manual] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun manual(manual: JsonField<Boolean>) = apply { this.manual = manual }

            /**
             * The number of minutes until the session expires (defaults to 129,600, which is 90
             * days)
             */
            fun minutesToExpire(minutesToExpire: Double?) =
                minutesToExpire(JsonField.ofNullable(minutesToExpire))

            /**
             * Alias for [Builder.minutesToExpire].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun minutesToExpire(minutesToExpire: Double) =
                minutesToExpire(minutesToExpire as Double?)

            /** Alias for calling [Builder.minutesToExpire] with `minutesToExpire.orElse(null)`. */
            fun minutesToExpire(minutesToExpire: Optional<Double>) =
                minutesToExpire(minutesToExpire.getOrNull())

            /**
             * Sets [Builder.minutesToExpire] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minutesToExpire] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minutesToExpire(minutesToExpire: JsonField<Double>) = apply {
                this.minutesToExpire = minutesToExpire
            }

            /** The URI to redirect to after the Connect flow is completed */
            fun redirectUri(redirectUri: String?) = redirectUri(JsonField.ofNullable(redirectUri))

            /** Alias for calling [Builder.redirectUri] with `redirectUri.orElse(null)`. */
            fun redirectUri(redirectUri: Optional<String>) = redirectUri(redirectUri.getOrNull())

            /**
             * Sets [Builder.redirectUri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.redirectUri] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun redirectUri(redirectUri: JsonField<String>) = apply {
                this.redirectUri = redirectUri
            }

            /** Sandbox mode for testing */
            fun sandbox(sandbox: Sandbox?) = sandbox(JsonField.ofNullable(sandbox))

            /** Alias for calling [Builder.sandbox] with `sandbox.orElse(null)`. */
            fun sandbox(sandbox: Optional<Sandbox>) = sandbox(sandbox.getOrNull())

            /**
             * Sets [Builder.sandbox] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sandbox] with a well-typed [Sandbox] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sandbox(sandbox: JsonField<Sandbox>) = apply { this.sandbox = sandbox }

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
             * Returns an immutable instance of [CreateConnectSessionRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .customerId()
             * .customerName()
             * .products()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreateConnectSessionRequest =
                CreateConnectSessionRequest(
                    checkRequired("customerId", customerId),
                    checkRequired("customerName", customerName),
                    checkRequired("products", products).map { it.toImmutable() },
                    customerEmail,
                    integration,
                    manual,
                    minutesToExpire,
                    redirectUri,
                    sandbox,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CreateConnectSessionRequest = apply {
            if (validated) {
                return@apply
            }

            customerId()
            customerName()
            products().forEach { it.validate() }
            customerEmail()
            integration().ifPresent { it.validate() }
            manual()
            minutesToExpire()
            redirectUri()
            sandbox().ifPresent { it.validate() }
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
            (if (customerId.asKnown().isPresent) 1 else 0) +
                (if (customerName.asKnown().isPresent) 1 else 0) +
                (products.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (customerEmail.asKnown().isPresent) 1 else 0) +
                (integration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (manual.asKnown().isPresent) 1 else 0) +
                (if (minutesToExpire.asKnown().isPresent) 1 else 0) +
                (if (redirectUri.asKnown().isPresent) 1 else 0) +
                (sandbox.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreateConnectSessionRequest &&
                customerId == other.customerId &&
                customerName == other.customerName &&
                products == other.products &&
                customerEmail == other.customerEmail &&
                integration == other.integration &&
                manual == other.manual &&
                minutesToExpire == other.minutesToExpire &&
                redirectUri == other.redirectUri &&
                sandbox == other.sandbox &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                customerId,
                customerName,
                products,
                customerEmail,
                integration,
                manual,
                minutesToExpire,
                redirectUri,
                sandbox,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreateConnectSessionRequest{customerId=$customerId, customerName=$customerName, products=$products, customerEmail=$customerEmail, integration=$integration, manual=$manual, minutesToExpire=$minutesToExpire, redirectUri=$redirectUri, sandbox=$sandbox, additionalProperties=$additionalProperties}"
    }

    /** The Finch products that can be requested during the Connect flow. */
    class ConnectProducts @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val BENEFITS = of("benefits")

            @JvmField val COMPANY = of("company")

            @JvmField val DEDUCTION = of("deduction")

            @JvmField val DIRECTORY = of("directory")

            @JvmField val DOCUMENTS = of("documents")

            @JvmField val EMPLOYMENT = of("employment")

            @JvmField val INDIVIDUAL = of("individual")

            @JvmField val PAYMENT = of("payment")

            @JvmField val PAY_STATEMENT = of("pay_statement")

            @JvmField val SSN = of("ssn")

            @JvmStatic fun of(value: String) = ConnectProducts(JsonField.of(value))
        }

        /** An enum containing [ConnectProducts]'s known values. */
        enum class Known {
            BENEFITS,
            COMPANY,
            DEDUCTION,
            DIRECTORY,
            DOCUMENTS,
            EMPLOYMENT,
            INDIVIDUAL,
            PAYMENT,
            PAY_STATEMENT,
            SSN,
        }

        /**
         * An enum containing [ConnectProducts]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ConnectProducts] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BENEFITS,
            COMPANY,
            DEDUCTION,
            DIRECTORY,
            DOCUMENTS,
            EMPLOYMENT,
            INDIVIDUAL,
            PAYMENT,
            PAY_STATEMENT,
            SSN,
            /**
             * An enum member indicating that [ConnectProducts] was instantiated with an unknown
             * value.
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
                BENEFITS -> Value.BENEFITS
                COMPANY -> Value.COMPANY
                DEDUCTION -> Value.DEDUCTION
                DIRECTORY -> Value.DIRECTORY
                DOCUMENTS -> Value.DOCUMENTS
                EMPLOYMENT -> Value.EMPLOYMENT
                INDIVIDUAL -> Value.INDIVIDUAL
                PAYMENT -> Value.PAYMENT
                PAY_STATEMENT -> Value.PAY_STATEMENT
                SSN -> Value.SSN
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
                BENEFITS -> Known.BENEFITS
                COMPANY -> Known.COMPANY
                DEDUCTION -> Known.DEDUCTION
                DIRECTORY -> Known.DIRECTORY
                DOCUMENTS -> Known.DOCUMENTS
                EMPLOYMENT -> Known.EMPLOYMENT
                INDIVIDUAL -> Known.INDIVIDUAL
                PAYMENT -> Known.PAYMENT
                PAY_STATEMENT -> Known.PAY_STATEMENT
                SSN -> Known.SSN
                else -> throw FinchInvalidDataException("Unknown ConnectProducts: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws FinchInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { FinchInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): ConnectProducts = apply {
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

            return other is ConnectProducts && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Integration configuration for the connect session */
    class Integration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val provider: JsonField<String>,
        private val authMethod: JsonField<AuthMethod>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auth_method")
            @ExcludeMissing
            authMethod: JsonField<AuthMethod> = JsonMissing.of(),
        ) : this(provider, authMethod, mutableMapOf())

        /**
         * The provider to integrate with
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun provider(): String = provider.getRequired("provider")

        /**
         * The authentication method to use
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun authMethod(): Optional<AuthMethod> = authMethod.getOptional("auth_method")

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

        /**
         * Returns the raw JSON value of [authMethod].
         *
         * Unlike [authMethod], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("auth_method")
        @ExcludeMissing
        fun _authMethod(): JsonField<AuthMethod> = authMethod

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
             * Returns a mutable builder for constructing an instance of [Integration].
             *
             * The following fields are required:
             * ```java
             * .provider()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Integration]. */
        class Builder internal constructor() {

            private var provider: JsonField<String>? = null
            private var authMethod: JsonField<AuthMethod> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(integration: Integration) = apply {
                provider = integration.provider
                authMethod = integration.authMethod
                additionalProperties = integration.additionalProperties.toMutableMap()
            }

            /** The provider to integrate with */
            fun provider(provider: String) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

            /** The authentication method to use */
            fun authMethod(authMethod: AuthMethod?) = authMethod(JsonField.ofNullable(authMethod))

            /** Alias for calling [Builder.authMethod] with `authMethod.orElse(null)`. */
            fun authMethod(authMethod: Optional<AuthMethod>) = authMethod(authMethod.getOrNull())

            /**
             * Sets [Builder.authMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authMethod] with a well-typed [AuthMethod] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun authMethod(authMethod: JsonField<AuthMethod>) = apply {
                this.authMethod = authMethod
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
             * Returns an immutable instance of [Integration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .provider()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Integration =
                Integration(
                    checkRequired("provider", provider),
                    authMethod,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Integration = apply {
            if (validated) {
                return@apply
            }

            provider()
            authMethod().ifPresent { it.validate() }
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
            (if (provider.asKnown().isPresent) 1 else 0) +
                (authMethod.asKnown().getOrNull()?.validity() ?: 0)

        /** The authentication method to use */
        class AuthMethod @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val ASSISTED = of("assisted")

                @JvmField val CREDENTIAL = of("credential")

                @JvmField val OAUTH = of("oauth")

                @JvmField val API_TOKEN = of("api_token")

                @JvmStatic fun of(value: String) = AuthMethod(JsonField.of(value))
            }

            /** An enum containing [AuthMethod]'s known values. */
            enum class Known {
                ASSISTED,
                CREDENTIAL,
                OAUTH,
                API_TOKEN,
            }

            /**
             * An enum containing [AuthMethod]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AuthMethod] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ASSISTED,
                CREDENTIAL,
                OAUTH,
                API_TOKEN,
                /**
                 * An enum member indicating that [AuthMethod] was instantiated with an unknown
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
                    ASSISTED -> Value.ASSISTED
                    CREDENTIAL -> Value.CREDENTIAL
                    OAUTH -> Value.OAUTH
                    API_TOKEN -> Value.API_TOKEN
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
                    OAUTH -> Known.OAUTH
                    API_TOKEN -> Known.API_TOKEN
                    else -> throw FinchInvalidDataException("Unknown AuthMethod: $value")
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

            fun validate(): AuthMethod = apply {
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

                return other is AuthMethod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Integration &&
                provider == other.provider &&
                authMethod == other.authMethod &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(provider, authMethod, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Integration{provider=$provider, authMethod=$authMethod, additionalProperties=$additionalProperties}"
    }

    /** Sandbox mode for testing */
    class Sandbox @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FINCH = of("finch")

            @JvmField val PROVIDER = of("provider")

            @JvmStatic fun of(value: String) = Sandbox(JsonField.of(value))
        }

        /** An enum containing [Sandbox]'s known values. */
        enum class Known {
            FINCH,
            PROVIDER,
        }

        /**
         * An enum containing [Sandbox]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Sandbox] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FINCH,
            PROVIDER,
            /** An enum member indicating that [Sandbox] was instantiated with an unknown value. */
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
                FINCH -> Value.FINCH
                PROVIDER -> Value.PROVIDER
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
                FINCH -> Known.FINCH
                PROVIDER -> Known.PROVIDER
                else -> throw FinchInvalidDataException("Unknown Sandbox: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws FinchInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { FinchInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Sandbox = apply {
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

            return other is Sandbox && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConnectSessionConnectParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ConnectSessionConnectParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

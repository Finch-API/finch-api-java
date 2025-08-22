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
class ConnectSessionNewParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerName(): String = body.customerName()

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun products(): List<ConnectProducts> = body.products()

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerEmail(): Optional<String> = body.customerEmail()

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun integration(): Optional<Integration> = body.integration()

    /**
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
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun redirectUri(): Optional<String> = body.redirectUri()

    /**
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
         * Returns a mutable builder for constructing an instance of [ConnectSessionNewParams].
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

    /** A builder for [ConnectSessionNewParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(connectSessionNewParams: ConnectSessionNewParams) = apply {
            body = connectSessionNewParams.body.toBuilder()
            additionalHeaders = connectSessionNewParams.additionalHeaders.toBuilder()
            additionalQueryParams = connectSessionNewParams.additionalQueryParams.toBuilder()
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
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

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

        fun putAlladditional_body_properties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAlladditional_body_properties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAlladditional_body_properties(keys: Set<String>) = apply {
            body.removeAlladditional_body_properties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ConnectSessionNewParams].
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
        fun build(): ConnectSessionNewParams =
            ConnectSessionNewParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
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
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerName(): String = customerName.getRequired("customer_name")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun products(): List<ConnectProducts> = products.getRequired("products")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerEmail(): Optional<String> = customerEmail.getOptional("customer_email")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun integration(): Optional<Integration> = integration.getOptional("integration")

        /**
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
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun redirectUri(): Optional<String> = redirectUri.getOptional("redirect_uri")

        /**
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
             * Returns a mutable builder for constructing an instance of [Body].
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

        /** A builder for [Body]. */
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
            internal fun from(body: Body) = apply {
                customerId = body.customerId
                customerName = body.customerName
                products = body.products.map { it.toMutableList() }
                customerEmail = body.customerEmail
                integration = body.integration
                manual = body.manual
                minutesToExpire = body.minutesToExpire
                redirectUri = body.redirectUri
                sandbox = body.sandbox
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

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
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
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
            fun build(): Body =
                Body(
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

        fun validate(): Body = apply {
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

            return other is Body &&
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
            "Body{customerId=$customerId, customerName=$customerName, products=$products, customerEmail=$customerEmail, integration=$integration, manual=$manual, minutesToExpire=$minutesToExpire, redirectUri=$redirectUri, sandbox=$sandbox, additionalProperties=$additionalProperties}"
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

            @JvmField val COMPANY = of("company")

            @JvmField val DIRECTORY = of("directory")

            @JvmField val INDIVIDUAL = of("individual")

            @JvmField val EMPLOYMENT = of("employment")

            @JvmField val PAYMENT = of("payment")

            @JvmField val PAY_STATEMENT = of("pay_statement")

            @JvmField val BENEFITS = of("benefits")

            @JvmField val SSN = of("ssn")

            @JvmField val DEDUCTION = of("deduction")

            @JvmField val DOCUMENTS = of("documents")

            @JvmStatic fun of(value: String) = ConnectProducts(JsonField.of(value))
        }

        /** An enum containing [ConnectProducts]'s known values. */
        enum class Known {
            COMPANY,
            DIRECTORY,
            INDIVIDUAL,
            EMPLOYMENT,
            PAYMENT,
            PAY_STATEMENT,
            BENEFITS,
            SSN,
            DEDUCTION,
            DOCUMENTS,
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
            COMPANY,
            DIRECTORY,
            INDIVIDUAL,
            EMPLOYMENT,
            PAYMENT,
            PAY_STATEMENT,
            BENEFITS,
            SSN,
            DEDUCTION,
            DOCUMENTS,
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
                COMPANY -> Value.COMPANY
                DIRECTORY -> Value.DIRECTORY
                INDIVIDUAL -> Value.INDIVIDUAL
                EMPLOYMENT -> Value.EMPLOYMENT
                PAYMENT -> Value.PAYMENT
                PAY_STATEMENT -> Value.PAY_STATEMENT
                BENEFITS -> Value.BENEFITS
                SSN -> Value.SSN
                DEDUCTION -> Value.DEDUCTION
                DOCUMENTS -> Value.DOCUMENTS
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
                COMPANY -> Known.COMPANY
                DIRECTORY -> Known.DIRECTORY
                INDIVIDUAL -> Known.INDIVIDUAL
                EMPLOYMENT -> Known.EMPLOYMENT
                PAYMENT -> Known.PAYMENT
                PAY_STATEMENT -> Known.PAY_STATEMENT
                BENEFITS -> Known.BENEFITS
                SSN -> Known.SSN
                DEDUCTION -> Known.DEDUCTION
                DOCUMENTS -> Known.DOCUMENTS
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

    class Integration
    private constructor(
        private val authMethod: JsonField<AuthMethod>,
        private val provider: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("auth_method")
            @ExcludeMissing
            authMethod: JsonField<AuthMethod> = JsonMissing.of(),
            @JsonProperty("provider") @ExcludeMissing provider: JsonField<String> = JsonMissing.of(),
        ) : this(authMethod, provider, mutableMapOf())

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun authMethod(): Optional<AuthMethod> = authMethod.getOptional("auth_method")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun provider(): Optional<String> = provider.getOptional("provider")

        /**
         * Returns the raw JSON value of [authMethod].
         *
         * Unlike [authMethod], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("auth_method")
        @ExcludeMissing
        fun _authMethod(): JsonField<AuthMethod> = authMethod

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

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

            /** Returns a mutable builder for constructing an instance of [Integration]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Integration]. */
        class Builder internal constructor() {

            private var authMethod: JsonField<AuthMethod> = JsonMissing.of()
            private var provider: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(integration: Integration) = apply {
                authMethod = integration.authMethod
                provider = integration.provider
                additionalProperties = integration.additionalProperties.toMutableMap()
            }

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

            fun provider(provider: String?) = provider(JsonField.ofNullable(provider))

            /** Alias for calling [Builder.provider] with `provider.orElse(null)`. */
            fun provider(provider: Optional<String>) = provider(provider.getOrNull())

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Integration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Integration =
                Integration(authMethod, provider, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Integration = apply {
            if (validated) {
                return@apply
            }

            authMethod().ifPresent { it.validate() }
            provider()
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
            (authMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (provider.asKnown().isPresent) 1 else 0)

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
                authMethod == other.authMethod &&
                provider == other.provider &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(authMethod, provider, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Integration{authMethod=$authMethod, provider=$provider, additionalProperties=$additionalProperties}"
    }

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

        return other is ConnectSessionNewParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ConnectSessionNewParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

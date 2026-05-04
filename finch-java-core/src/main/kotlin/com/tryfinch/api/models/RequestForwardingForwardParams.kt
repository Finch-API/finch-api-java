// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.Params
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * The Forward API allows you to make direct requests to an employment system. If Finch's unified
 * API doesn't have a data model that cleanly fits your needs, then Forward allows you to push or
 * pull data models directly against an integration's API.
 */
class RequestForwardingForwardParams
private constructor(
    private val body: ForwardRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The HTTP method for the forwarded request. Valid values include: `GET` , `POST` , `PUT` ,
     * `DELETE` , and `PATCH`.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun method(): String = body.method()

    /**
     * The URL route path for the forwarded request. This value must begin with a forward-slash ( /
     * ) and may only contain alphanumeric characters, hyphens, and underscores.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun route(): String = body.route()

    /**
     * The body for the forwarded request. This value must be specified as either a string or a
     * valid JSON object.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<String> = body.data()

    /**
     * The query parameters for the forwarded request. This value must be specified as a valid JSON
     * object rather than a query string.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun params(): Optional<Params> = body.params()

    /**
     * The HTTP headers to include on the forwarded request. This value must be specified as an
     * object of key-value pairs. Example: `{"Content-Type": "application/xml", "X-API-Version":
     * "v1" }`
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requestHeaders(): Optional<RequestHeaders> = body.requestHeaders()

    /**
     * Returns the raw JSON value of [method].
     *
     * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _method(): JsonField<String> = body._method()

    /**
     * Returns the raw JSON value of [route].
     *
     * Unlike [route], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _route(): JsonField<String> = body._route()

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _data(): JsonField<String> = body._data()

    /**
     * Returns the raw JSON value of [params].
     *
     * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _params(): JsonField<Params> = body._params()

    /**
     * Returns the raw JSON value of [requestHeaders].
     *
     * Unlike [requestHeaders], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _requestHeaders(): JsonField<RequestHeaders> = body._requestHeaders()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RequestForwardingForwardParams].
         *
         * The following fields are required:
         * ```java
         * .method()
         * .route()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RequestForwardingForwardParams]. */
    class Builder internal constructor() {

        private var body: ForwardRequest.Builder = ForwardRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(requestForwardingForwardParams: RequestForwardingForwardParams) = apply {
            body = requestForwardingForwardParams.body.toBuilder()
            additionalHeaders = requestForwardingForwardParams.additionalHeaders.toBuilder()
            additionalQueryParams = requestForwardingForwardParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [method]
         * - [route]
         * - [data]
         * - [params]
         * - [requestHeaders]
         * - etc.
         */
        fun body(body: ForwardRequest) = apply { this.body = body.toBuilder() }

        /**
         * The HTTP method for the forwarded request. Valid values include: `GET` , `POST` , `PUT` ,
         * `DELETE` , and `PATCH`.
         */
        fun method(method: String) = apply { body.method(method) }

        /**
         * Sets [Builder.method] to an arbitrary JSON value.
         *
         * You should usually call [Builder.method] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun method(method: JsonField<String>) = apply { body.method(method) }

        /**
         * The URL route path for the forwarded request. This value must begin with a forward-slash
         * ( / ) and may only contain alphanumeric characters, hyphens, and underscores.
         */
        fun route(route: String) = apply { body.route(route) }

        /**
         * Sets [Builder.route] to an arbitrary JSON value.
         *
         * You should usually call [Builder.route] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun route(route: JsonField<String>) = apply { body.route(route) }

        /**
         * The body for the forwarded request. This value must be specified as either a string or a
         * valid JSON object.
         */
        fun data(data: String?) = apply { body.data(data) }

        /** Alias for calling [Builder.data] with `data.orElse(null)`. */
        fun data(data: Optional<String>) = data(data.getOrNull())

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<String>) = apply { body.data(data) }

        /**
         * The query parameters for the forwarded request. This value must be specified as a valid
         * JSON object rather than a query string.
         */
        fun params(params: Params?) = apply { body.params(params) }

        /** Alias for calling [Builder.params] with `params.orElse(null)`. */
        fun params(params: Optional<Params>) = params(params.getOrNull())

        /**
         * Sets [Builder.params] to an arbitrary JSON value.
         *
         * You should usually call [Builder.params] with a well-typed [Params] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun params(params: JsonField<Params>) = apply { body.params(params) }

        /**
         * The HTTP headers to include on the forwarded request. This value must be specified as an
         * object of key-value pairs. Example: `{"Content-Type": "application/xml", "X-API-Version":
         * "v1" }`
         */
        fun requestHeaders(requestHeaders: RequestHeaders?) = apply {
            body.requestHeaders(requestHeaders)
        }

        /** Alias for calling [Builder.requestHeaders] with `requestHeaders.orElse(null)`. */
        fun requestHeaders(requestHeaders: Optional<RequestHeaders>) =
            requestHeaders(requestHeaders.getOrNull())

        /**
         * Sets [Builder.requestHeaders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestHeaders] with a well-typed [RequestHeaders] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requestHeaders(requestHeaders: JsonField<RequestHeaders>) = apply {
            body.requestHeaders(requestHeaders)
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
         * Returns an immutable instance of [RequestForwardingForwardParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .method()
         * .route()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RequestForwardingForwardParams =
            RequestForwardingForwardParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ForwardRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class ForwardRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val method: JsonField<String>,
        private val route: JsonField<String>,
        private val data: JsonField<String>,
        private val params: JsonField<Params>,
        private val requestHeaders: JsonField<RequestHeaders>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("method") @ExcludeMissing method: JsonField<String> = JsonMissing.of(),
            @JsonProperty("route") @ExcludeMissing route: JsonField<String> = JsonMissing.of(),
            @JsonProperty("data") @ExcludeMissing data: JsonField<String> = JsonMissing.of(),
            @JsonProperty("params") @ExcludeMissing params: JsonField<Params> = JsonMissing.of(),
            @JsonProperty("request_headers")
            @ExcludeMissing
            requestHeaders: JsonField<RequestHeaders> = JsonMissing.of(),
        ) : this(method, route, data, params, requestHeaders, mutableMapOf())

        /**
         * The HTTP method for the forwarded request. Valid values include: `GET` , `POST` , `PUT` ,
         * `DELETE` , and `PATCH`.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun method(): String = method.getRequired("method")

        /**
         * The URL route path for the forwarded request. This value must begin with a forward-slash
         * ( / ) and may only contain alphanumeric characters, hyphens, and underscores.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun route(): String = route.getRequired("route")

        /**
         * The body for the forwarded request. This value must be specified as either a string or a
         * valid JSON object.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun data(): Optional<String> = data.getOptional("data")

        /**
         * The query parameters for the forwarded request. This value must be specified as a valid
         * JSON object rather than a query string.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun params(): Optional<Params> = params.getOptional("params")

        /**
         * The HTTP headers to include on the forwarded request. This value must be specified as an
         * object of key-value pairs. Example: `{"Content-Type": "application/xml", "X-API-Version":
         * "v1" }`
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requestHeaders(): Optional<RequestHeaders> =
            requestHeaders.getOptional("request_headers")

        /**
         * Returns the raw JSON value of [method].
         *
         * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

        /**
         * Returns the raw JSON value of [route].
         *
         * Unlike [route], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("route") @ExcludeMissing fun _route(): JsonField<String> = route

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

        /**
         * Returns the raw JSON value of [params].
         *
         * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

        /**
         * Returns the raw JSON value of [requestHeaders].
         *
         * Unlike [requestHeaders], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("request_headers")
        @ExcludeMissing
        fun _requestHeaders(): JsonField<RequestHeaders> = requestHeaders

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
             * Returns a mutable builder for constructing an instance of [ForwardRequest].
             *
             * The following fields are required:
             * ```java
             * .method()
             * .route()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ForwardRequest]. */
        class Builder internal constructor() {

            private var method: JsonField<String>? = null
            private var route: JsonField<String>? = null
            private var data: JsonField<String> = JsonMissing.of()
            private var params: JsonField<Params> = JsonMissing.of()
            private var requestHeaders: JsonField<RequestHeaders> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(forwardRequest: ForwardRequest) = apply {
                method = forwardRequest.method
                route = forwardRequest.route
                data = forwardRequest.data
                params = forwardRequest.params
                requestHeaders = forwardRequest.requestHeaders
                additionalProperties = forwardRequest.additionalProperties.toMutableMap()
            }

            /**
             * The HTTP method for the forwarded request. Valid values include: `GET` , `POST` ,
             * `PUT` , `DELETE` , and `PATCH`.
             */
            fun method(method: String) = method(JsonField.of(method))

            /**
             * Sets [Builder.method] to an arbitrary JSON value.
             *
             * You should usually call [Builder.method] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun method(method: JsonField<String>) = apply { this.method = method }

            /**
             * The URL route path for the forwarded request. This value must begin with a
             * forward-slash ( / ) and may only contain alphanumeric characters, hyphens, and
             * underscores.
             */
            fun route(route: String) = route(JsonField.of(route))

            /**
             * Sets [Builder.route] to an arbitrary JSON value.
             *
             * You should usually call [Builder.route] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun route(route: JsonField<String>) = apply { this.route = route }

            /**
             * The body for the forwarded request. This value must be specified as either a string
             * or a valid JSON object.
             */
            fun data(data: String?) = data(JsonField.ofNullable(data))

            /** Alias for calling [Builder.data] with `data.orElse(null)`. */
            fun data(data: Optional<String>) = data(data.getOrNull())

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun data(data: JsonField<String>) = apply { this.data = data }

            /**
             * The query parameters for the forwarded request. This value must be specified as a
             * valid JSON object rather than a query string.
             */
            fun params(params: Params?) = params(JsonField.ofNullable(params))

            /** Alias for calling [Builder.params] with `params.orElse(null)`. */
            fun params(params: Optional<Params>) = params(params.getOrNull())

            /**
             * Sets [Builder.params] to an arbitrary JSON value.
             *
             * You should usually call [Builder.params] with a well-typed [Params] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun params(params: JsonField<Params>) = apply { this.params = params }

            /**
             * The HTTP headers to include on the forwarded request. This value must be specified as
             * an object of key-value pairs. Example: `{"Content-Type": "application/xml",
             * "X-API-Version": "v1" }`
             */
            fun requestHeaders(requestHeaders: RequestHeaders?) =
                requestHeaders(JsonField.ofNullable(requestHeaders))

            /** Alias for calling [Builder.requestHeaders] with `requestHeaders.orElse(null)`. */
            fun requestHeaders(requestHeaders: Optional<RequestHeaders>) =
                requestHeaders(requestHeaders.getOrNull())

            /**
             * Sets [Builder.requestHeaders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestHeaders] with a well-typed [RequestHeaders]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun requestHeaders(requestHeaders: JsonField<RequestHeaders>) = apply {
                this.requestHeaders = requestHeaders
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
             * Returns an immutable instance of [ForwardRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .method()
             * .route()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ForwardRequest =
                ForwardRequest(
                    checkRequired("method", method),
                    checkRequired("route", route),
                    data,
                    params,
                    requestHeaders,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws FinchInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ForwardRequest = apply {
            if (validated) {
                return@apply
            }

            method()
            route()
            data()
            params().ifPresent { it.validate() }
            requestHeaders().ifPresent { it.validate() }
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
            (if (method.asKnown().isPresent) 1 else 0) +
                (if (route.asKnown().isPresent) 1 else 0) +
                (if (data.asKnown().isPresent) 1 else 0) +
                (params.asKnown().getOrNull()?.validity() ?: 0) +
                (requestHeaders.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ForwardRequest &&
                method == other.method &&
                route == other.route &&
                data == other.data &&
                params == other.params &&
                requestHeaders == other.requestHeaders &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(method, route, data, params, requestHeaders, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ForwardRequest{method=$method, route=$route, data=$data, params=$params, requestHeaders=$requestHeaders, additionalProperties=$additionalProperties}"
    }

    /**
     * The query parameters for the forwarded request. This value must be specified as a valid JSON
     * object rather than a query string.
     */
    class Params
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

            /** Returns a mutable builder for constructing an instance of [Params]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Params]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(params: Params) = apply {
                additionalProperties = params.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Params].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Params = Params(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws FinchInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Params = apply {
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

            return other is Params && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Params{additionalProperties=$additionalProperties}"
    }

    /**
     * The HTTP headers to include on the forwarded request. This value must be specified as an
     * object of key-value pairs. Example: `{"Content-Type": "application/xml", "X-API-Version":
     * "v1" }`
     */
    class RequestHeaders
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

            /** Returns a mutable builder for constructing an instance of [RequestHeaders]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RequestHeaders]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(requestHeaders: RequestHeaders) = apply {
                additionalProperties = requestHeaders.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [RequestHeaders].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RequestHeaders = RequestHeaders(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws FinchInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): RequestHeaders = apply {
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

            return other is RequestHeaders && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "RequestHeaders{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RequestForwardingForwardParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RequestForwardingForwardParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

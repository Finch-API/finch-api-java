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
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.Params
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * The Forward API allows you to make direct requests to an employment system. If Finch’s unified
 * API doesn’t have a data model that cleanly fits your needs, then Forward allows you to push or
 * pull data models directly against an integration’s API.
 */
class RequestForwardingForwardParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The HTTP method for the forwarded request. Valid values include: `GET` , `POST` , `PUT` ,
     * `DELETE` , and `PATCH`.
     */
    fun method(): String = body.method()

    /**
     * The URL route path for the forwarded request. This value must begin with a forward-slash ( /
     * ) and may only contain alphanumeric characters, hyphens, and underscores.
     */
    fun route(): String = body.route()

    /**
     * The body for the forwarded request. This value must be specified as either a string or a
     * valid JSON object.
     */
    fun data(): Optional<String> = body.data()

    /**
     * The HTTP headers to include on the forwarded request. This value must be specified as an
     * object of key-value pairs. Example: `{"Content-Type": "application/xml", "X-API-Version":
     * "v1" }`
     */
    fun _headers_(): JsonValue = body._headers_()

    /**
     * The query parameters for the forwarded request. This value must be specified as a valid JSON
     * object rather than a query string.
     */
    fun _params(): JsonValue = body._params()

    /**
     * The HTTP method for the forwarded request. Valid values include: `GET` , `POST` , `PUT` ,
     * `DELETE` , and `PATCH`.
     */
    fun _method(): JsonField<String> = body._method()

    /**
     * The URL route path for the forwarded request. This value must begin with a forward-slash ( /
     * ) and may only contain alphanumeric characters, hyphens, and underscores.
     */
    fun _route(): JsonField<String> = body._route()

    /**
     * The body for the forwarded request. This value must be specified as either a string or a
     * valid JSON object.
     */
    fun _data(): JsonField<String> = body._data()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Forward Request Body */
    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("method")
        @ExcludeMissing
        private val method: JsonField<String> = JsonMissing.of(),
        @JsonProperty("route")
        @ExcludeMissing
        private val route: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data")
        @ExcludeMissing
        private val data: JsonField<String> = JsonMissing.of(),
        @JsonProperty("headers") @ExcludeMissing private val headers: JsonValue = JsonMissing.of(),
        @JsonProperty("params") @ExcludeMissing private val params: JsonValue = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The HTTP method for the forwarded request. Valid values include: `GET` , `POST` , `PUT` ,
         * `DELETE` , and `PATCH`.
         */
        fun method(): String = method.getRequired("method")

        /**
         * The URL route path for the forwarded request. This value must begin with a forward-slash
         * ( / ) and may only contain alphanumeric characters, hyphens, and underscores.
         */
        fun route(): String = route.getRequired("route")

        /**
         * The body for the forwarded request. This value must be specified as either a string or a
         * valid JSON object.
         */
        fun data(): Optional<String> = Optional.ofNullable(data.getNullable("data"))

        /**
         * The HTTP headers to include on the forwarded request. This value must be specified as an
         * object of key-value pairs. Example: `{"Content-Type": "application/xml", "X-API-Version":
         * "v1" }`
         */
        @JsonProperty("headers") @ExcludeMissing fun _headers_(): JsonValue = headers

        /**
         * The query parameters for the forwarded request. This value must be specified as a valid
         * JSON object rather than a query string.
         */
        @JsonProperty("params") @ExcludeMissing fun _params(): JsonValue = params

        /**
         * The HTTP method for the forwarded request. Valid values include: `GET` , `POST` , `PUT` ,
         * `DELETE` , and `PATCH`.
         */
        @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

        /**
         * The URL route path for the forwarded request. This value must begin with a forward-slash
         * ( / ) and may only contain alphanumeric characters, hyphens, and underscores.
         */
        @JsonProperty("route") @ExcludeMissing fun _route(): JsonField<String> = route

        /**
         * The body for the forwarded request. This value must be specified as either a string or a
         * valid JSON object.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            method()
            route()
            data()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .method()
             * .route()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var method: JsonField<String>? = null
            private var route: JsonField<String>? = null
            private var data: JsonField<String> = JsonMissing.of()
            private var headers: JsonValue = JsonMissing.of()
            private var params: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                method = body.method
                route = body.route
                data = body.data
                headers = body.headers
                params = body.params
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The HTTP method for the forwarded request. Valid values include: `GET` , `POST` ,
             * `PUT` , `DELETE` , and `PATCH`.
             */
            fun method(method: String) = method(JsonField.of(method))

            /**
             * The HTTP method for the forwarded request. Valid values include: `GET` , `POST` ,
             * `PUT` , `DELETE` , and `PATCH`.
             */
            fun method(method: JsonField<String>) = apply { this.method = method }

            /**
             * The URL route path for the forwarded request. This value must begin with a
             * forward-slash ( / ) and may only contain alphanumeric characters, hyphens, and
             * underscores.
             */
            fun route(route: String) = route(JsonField.of(route))

            /**
             * The URL route path for the forwarded request. This value must begin with a
             * forward-slash ( / ) and may only contain alphanumeric characters, hyphens, and
             * underscores.
             */
            fun route(route: JsonField<String>) = apply { this.route = route }

            /**
             * The body for the forwarded request. This value must be specified as either a string
             * or a valid JSON object.
             */
            fun data(data: String?) = data(JsonField.ofNullable(data))

            /**
             * The body for the forwarded request. This value must be specified as either a string
             * or a valid JSON object.
             */
            fun data(data: Optional<String>) = data(data.getOrNull())

            /**
             * The body for the forwarded request. This value must be specified as either a string
             * or a valid JSON object.
             */
            fun data(data: JsonField<String>) = apply { this.data = data }

            /**
             * The HTTP headers to include on the forwarded request. This value must be specified as
             * an object of key-value pairs. Example: `{"Content-Type": "application/xml",
             * "X-API-Version": "v1" }`
             */
            fun headers(headers: JsonValue) = apply { this.headers = headers }

            /**
             * The query parameters for the forwarded request. This value must be specified as a
             * valid JSON object rather than a query string.
             */
            fun params(params: JsonValue) = apply { this.params = params }

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

            fun build(): Body =
                Body(
                    checkRequired("method", method),
                    checkRequired("route", route),
                    data,
                    headers,
                    params,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && method == other.method && route == other.route && data == other.data && headers == other.headers && params == other.params && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(method, route, data, headers, params, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{method=$method, route=$route, data=$data, headers=$headers, params=$params, additionalProperties=$additionalProperties}"
    }

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
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(requestForwardingForwardParams: RequestForwardingForwardParams) = apply {
            body = requestForwardingForwardParams.body.toBuilder()
            additionalHeaders = requestForwardingForwardParams.additionalHeaders.toBuilder()
            additionalQueryParams = requestForwardingForwardParams.additionalQueryParams.toBuilder()
        }

        /**
         * The HTTP method for the forwarded request. Valid values include: `GET` , `POST` , `PUT` ,
         * `DELETE` , and `PATCH`.
         */
        fun method(method: String) = apply { body.method(method) }

        /**
         * The HTTP method for the forwarded request. Valid values include: `GET` , `POST` , `PUT` ,
         * `DELETE` , and `PATCH`.
         */
        fun method(method: JsonField<String>) = apply { body.method(method) }

        /**
         * The URL route path for the forwarded request. This value must begin with a forward-slash
         * ( / ) and may only contain alphanumeric characters, hyphens, and underscores.
         */
        fun route(route: String) = apply { body.route(route) }

        /**
         * The URL route path for the forwarded request. This value must begin with a forward-slash
         * ( / ) and may only contain alphanumeric characters, hyphens, and underscores.
         */
        fun route(route: JsonField<String>) = apply { body.route(route) }

        /**
         * The body for the forwarded request. This value must be specified as either a string or a
         * valid JSON object.
         */
        fun data(data: String?) = apply { body.data(data) }

        /**
         * The body for the forwarded request. This value must be specified as either a string or a
         * valid JSON object.
         */
        fun data(data: Optional<String>) = data(data.getOrNull())

        /**
         * The body for the forwarded request. This value must be specified as either a string or a
         * valid JSON object.
         */
        fun data(data: JsonField<String>) = apply { body.data(data) }

        /**
         * The HTTP headers to include on the forwarded request. This value must be specified as an
         * object of key-value pairs. Example: `{"Content-Type": "application/xml", "X-API-Version":
         * "v1" }`
         */
        fun headers(headers: JsonValue) = apply { body.headers(headers) }

        /**
         * The query parameters for the forwarded request. This value must be specified as a valid
         * JSON object rather than a query string.
         */
        fun params(params: JsonValue) = apply { body.params(params) }

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

        fun build(): RequestForwardingForwardParams =
            RequestForwardingForwardParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RequestForwardingForwardParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "RequestForwardingForwardParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

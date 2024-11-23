// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.models.*
import java.util.Objects
import java.util.Optional

class RequestForwardingForwardParams
constructor(
    private val method: String,
    private val route: String,
    private val data: String?,
    private val headers: JsonValue?,
    private val params: JsonValue?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun method(): String = method

    fun route(): String = route

    fun data(): Optional<String> = Optional.ofNullable(data)

    fun headers(): Optional<JsonValue> = Optional.ofNullable(headers)

    fun params(): Optional<JsonValue> = Optional.ofNullable(params)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): RequestForwardingForwardBody {
        return RequestForwardingForwardBody(
            method,
            route,
            data,
            headers,
            params,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    /** Forward Request Body */
    @JsonDeserialize(builder = RequestForwardingForwardBody.Builder::class)
    @NoAutoDetect
    class RequestForwardingForwardBody
    internal constructor(
        private val method: String?,
        private val route: String?,
        private val data: String?,
        private val headers: JsonValue?,
        private val params: JsonValue?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The HTTP method for the forwarded request. Valid values include: `GET` , `POST` , `PUT` ,
         * `DELETE` , and `PATCH`.
         */
        @JsonProperty("method") fun method(): String? = method

        /**
         * The URL route path for the forwarded request. This value must begin with a forward-slash
         * ( / ) and may only contain alphanumeric characters, hyphens, and underscores.
         */
        @JsonProperty("route") fun route(): String? = route

        /**
         * The body for the forwarded request. This value must be specified as either a string or a
         * valid JSON object.
         */
        @JsonProperty("data") fun data(): String? = data

        /**
         * The HTTP headers to include on the forwarded request. This value must be specified as an
         * object of key-value pairs. Example: `{"Content-Type": "application/xml", "X-API-Version":
         * "v1" }`
         */
        @JsonProperty("headers") fun headers(): JsonValue? = headers

        /**
         * The query parameters for the forwarded request. This value must be specified as a valid
         * JSON object rather than a query string.
         */
        @JsonProperty("params") fun params(): JsonValue? = params

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var method: String? = null
            private var route: String? = null
            private var data: String? = null
            private var headers: JsonValue? = null
            private var params: JsonValue? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(requestForwardingForwardBody: RequestForwardingForwardBody) = apply {
                this.method = requestForwardingForwardBody.method
                this.route = requestForwardingForwardBody.route
                this.data = requestForwardingForwardBody.data
                this.headers = requestForwardingForwardBody.headers
                this.params = requestForwardingForwardBody.params
                additionalProperties(requestForwardingForwardBody.additionalProperties)
            }

            /**
             * The HTTP method for the forwarded request. Valid values include: `GET` , `POST` ,
             * `PUT` , `DELETE` , and `PATCH`.
             */
            @JsonProperty("method") fun method(method: String) = apply { this.method = method }

            /**
             * The URL route path for the forwarded request. This value must begin with a
             * forward-slash ( / ) and may only contain alphanumeric characters, hyphens, and
             * underscores.
             */
            @JsonProperty("route") fun route(route: String) = apply { this.route = route }

            /**
             * The body for the forwarded request. This value must be specified as either a string
             * or a valid JSON object.
             */
            @JsonProperty("data") fun data(data: String) = apply { this.data = data }

            /**
             * The HTTP headers to include on the forwarded request. This value must be specified as
             * an object of key-value pairs. Example: `{"Content-Type": "application/xml",
             * "X-API-Version": "v1" }`
             */
            @JsonProperty("headers")
            fun headers(headers: JsonValue) = apply { this.headers = headers }

            /**
             * The query parameters for the forwarded request. This value must be specified as a
             * valid JSON object rather than a query string.
             */
            @JsonProperty("params") fun params(params: JsonValue) = apply { this.params = params }

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

            fun build(): RequestForwardingForwardBody =
                RequestForwardingForwardBody(
                    checkNotNull(method) { "`method` is required but was not set" },
                    checkNotNull(route) { "`route` is required but was not set" },
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

            return /* spotless:off */ other is RequestForwardingForwardBody && method == other.method && route == other.route && data == other.data && headers == other.headers && params == other.params && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(method, route, data, headers, params, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RequestForwardingForwardBody{method=$method, route=$route, data=$data, headers=$headers, params=$params, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var method: String? = null
        private var route: String? = null
        private var data: String? = null
        private var headers: JsonValue? = null
        private var params: JsonValue? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(requestForwardingForwardParams: RequestForwardingForwardParams) = apply {
            method = requestForwardingForwardParams.method
            route = requestForwardingForwardParams.route
            data = requestForwardingForwardParams.data
            headers = requestForwardingForwardParams.headers
            params = requestForwardingForwardParams.params
            additionalHeaders = requestForwardingForwardParams.additionalHeaders.toBuilder()
            additionalQueryParams = requestForwardingForwardParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                requestForwardingForwardParams.additionalBodyProperties.toMutableMap()
        }

        /**
         * The HTTP method for the forwarded request. Valid values include: `GET` , `POST` , `PUT` ,
         * `DELETE` , and `PATCH`.
         */
        fun method(method: String) = apply { this.method = method }

        /**
         * The URL route path for the forwarded request. This value must begin with a forward-slash
         * ( / ) and may only contain alphanumeric characters, hyphens, and underscores.
         */
        fun route(route: String) = apply { this.route = route }

        /**
         * The body for the forwarded request. This value must be specified as either a string or a
         * valid JSON object.
         */
        fun data(data: String) = apply { this.data = data }

        /**
         * The HTTP headers to include on the forwarded request. This value must be specified as an
         * object of key-value pairs. Example: `{"Content-Type": "application/xml", "X-API-Version":
         * "v1" }`
         */
        fun headers(headers: JsonValue) = apply { this.headers = headers }

        /**
         * The query parameters for the forwarded request. This value must be specified as a valid
         * JSON object rather than a query string.
         */
        fun params(params: JsonValue) = apply { this.params = params }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): RequestForwardingForwardParams =
            RequestForwardingForwardParams(
                checkNotNull(method) { "`method` is required but was not set" },
                checkNotNull(route) { "`route` is required but was not set" },
                data,
                headers,
                params,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RequestForwardingForwardParams && method == other.method && route == other.route && data == other.data && headers == other.headers && params == other.params && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(method, route, data, headers, params, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "RequestForwardingForwardParams{method=$method, route=$route, data=$data, headers=$headers, params=$params, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}

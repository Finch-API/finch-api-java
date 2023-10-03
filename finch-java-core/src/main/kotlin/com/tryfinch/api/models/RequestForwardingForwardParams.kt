package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
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
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun method(): String = method

    fun route(): String = route

    fun data(): Optional<String> = Optional.ofNullable(data)

    fun headers(): Optional<JsonValue> = Optional.ofNullable(headers)

    fun params(): Optional<JsonValue> = Optional.ofNullable(params)

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

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

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

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RequestForwardingForwardBody &&
                this.method == other.method &&
                this.route == other.route &&
                this.data == other.data &&
                this.headers == other.headers &&
                this.params == other.params &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        method,
                        route,
                        data,
                        headers,
                        params,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "RequestForwardingForwardBody{method=$method, route=$route, data=$data, headers=$headers, params=$params, additionalProperties=$additionalProperties}"

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
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RequestForwardingForwardParams &&
            this.method == other.method &&
            this.route == other.route &&
            this.data == other.data &&
            this.headers == other.headers &&
            this.params == other.params &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            method,
            route,
            data,
            headers,
            params,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "RequestForwardingForwardParams{method=$method, route=$route, data=$data, headers=$headers, params=$params, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(requestForwardingForwardParams: RequestForwardingForwardParams) = apply {
            this.method = requestForwardingForwardParams.method
            this.route = requestForwardingForwardParams.route
            this.data = requestForwardingForwardParams.data
            this.headers = requestForwardingForwardParams.headers
            this.params = requestForwardingForwardParams.params
            additionalQueryParams(requestForwardingForwardParams.additionalQueryParams)
            additionalHeaders(requestForwardingForwardParams.additionalHeaders)
            additionalBodyProperties(requestForwardingForwardParams.additionalBodyProperties)
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

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): RequestForwardingForwardParams =
            RequestForwardingForwardParams(
                checkNotNull(method) { "`method` is required but was not set" },
                checkNotNull(route) { "`route` is required but was not set" },
                data,
                headers,
                params,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}

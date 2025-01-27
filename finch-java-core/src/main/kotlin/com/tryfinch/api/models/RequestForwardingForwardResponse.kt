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
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class RequestForwardingForwardResponse
@JsonCreator
private constructor(
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<String> = JsonMissing.of(),
    @JsonProperty("headers") @ExcludeMissing private val headers: JsonValue = JsonMissing.of(),
    @JsonProperty("request")
    @ExcludeMissing
    private val request: JsonField<Request> = JsonMissing.of(),
    @JsonProperty("statusCode")
    @ExcludeMissing
    private val statusCode: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * A string representation of the HTTP response body of the forwarded request’s response
     * received from the underlying integration’s API. This field may be null in the case where the
     * upstream system’s response is empty.
     */
    fun data(): Optional<String> = Optional.ofNullable(data.getNullable("data"))

    /**
     * The HTTP headers of the forwarded request’s response, exactly as received from the underlying
     * integration’s API.
     */
    @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonValue = headers

    /**
     * An object containing details of your original forwarded request, for your ease of reference.
     */
    fun request(): Request = request.getRequired("request")

    /**
     * The HTTP status code of the forwarded request’s response, exactly received from the
     * underlying integration’s API. This value will be returned as an integer.
     */
    fun statusCode(): Long = statusCode.getRequired("statusCode")

    /**
     * A string representation of the HTTP response body of the forwarded request’s response
     * received from the underlying integration’s API. This field may be null in the case where the
     * upstream system’s response is empty.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

    /**
     * An object containing details of your original forwarded request, for your ease of reference.
     */
    @JsonProperty("request") @ExcludeMissing fun _request(): JsonField<Request> = request

    /**
     * The HTTP status code of the forwarded request’s response, exactly received from the
     * underlying integration’s API. This value will be returned as an integer.
     */
    @JsonProperty("statusCode") @ExcludeMissing fun _statusCode(): JsonField<Long> = statusCode

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): RequestForwardingForwardResponse = apply {
        if (validated) {
            return@apply
        }

        data()
        request().validate()
        statusCode()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RequestForwardingForwardResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<String>? = null
        private var headers: JsonValue? = null
        private var request: JsonField<Request>? = null
        private var statusCode: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(requestForwardingForwardResponse: RequestForwardingForwardResponse) =
            apply {
                data = requestForwardingForwardResponse.data
                headers = requestForwardingForwardResponse.headers
                request = requestForwardingForwardResponse.request
                statusCode = requestForwardingForwardResponse.statusCode
                additionalProperties =
                    requestForwardingForwardResponse.additionalProperties.toMutableMap()
            }

        /**
         * A string representation of the HTTP response body of the forwarded request’s response
         * received from the underlying integration’s API. This field may be null in the case where
         * the upstream system’s response is empty.
         */
        fun data(data: String?) = data(JsonField.ofNullable(data))

        /**
         * A string representation of the HTTP response body of the forwarded request’s response
         * received from the underlying integration’s API. This field may be null in the case where
         * the upstream system’s response is empty.
         */
        fun data(data: Optional<String>) = data(data.orElse(null))

        /**
         * A string representation of the HTTP response body of the forwarded request’s response
         * received from the underlying integration’s API. This field may be null in the case where
         * the upstream system’s response is empty.
         */
        fun data(data: JsonField<String>) = apply { this.data = data }

        /**
         * The HTTP headers of the forwarded request’s response, exactly as received from the
         * underlying integration’s API.
         */
        fun headers(headers: JsonValue) = apply { this.headers = headers }

        /**
         * An object containing details of your original forwarded request, for your ease of
         * reference.
         */
        fun request(request: Request) = request(JsonField.of(request))

        /**
         * An object containing details of your original forwarded request, for your ease of
         * reference.
         */
        fun request(request: JsonField<Request>) = apply { this.request = request }

        /**
         * The HTTP status code of the forwarded request’s response, exactly received from the
         * underlying integration’s API. This value will be returned as an integer.
         */
        fun statusCode(statusCode: Long) = statusCode(JsonField.of(statusCode))

        /**
         * The HTTP status code of the forwarded request’s response, exactly received from the
         * underlying integration’s API. This value will be returned as an integer.
         */
        fun statusCode(statusCode: JsonField<Long>) = apply { this.statusCode = statusCode }

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

        fun build(): RequestForwardingForwardResponse =
            RequestForwardingForwardResponse(
                checkRequired("data", data),
                checkRequired("headers", headers),
                checkRequired("request", request),
                checkRequired("statusCode", statusCode),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * An object containing details of your original forwarded request, for your ease of reference.
     */
    @NoAutoDetect
    class Request
    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        private val data: JsonField<String> = JsonMissing.of(),
        @JsonProperty("headers") @ExcludeMissing private val headers: JsonValue = JsonMissing.of(),
        @JsonProperty("method")
        @ExcludeMissing
        private val method: JsonField<String> = JsonMissing.of(),
        @JsonProperty("params") @ExcludeMissing private val params: JsonValue = JsonMissing.of(),
        @JsonProperty("route")
        @ExcludeMissing
        private val route: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The body that was specified for the forwarded request. If a value was not specified in
         * the original request, this value will be returned as null ; otherwise, this value will
         * always be returned as a string.
         */
        fun data(): Optional<String> = Optional.ofNullable(data.getNullable("data"))

        /**
         * The specified HTTP headers that were included in the forwarded request. If no headers
         * were specified, this will be returned as `null`.
         */
        @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonValue = headers

        /**
         * The HTTP method that was specified for the forwarded request. Valid values include: `GET`
         * , `POST` , `PUT` , `DELETE` , and `PATCH`.
         */
        fun method(): String = method.getRequired("method")

        /**
         * The query parameters that were included in the forwarded request. If no query parameters
         * were specified, this will be returned as `null`.
         */
        @JsonProperty("params") @ExcludeMissing fun _params(): JsonValue = params

        /** The URL route path that was specified for the forwarded request. */
        fun route(): String = route.getRequired("route")

        /**
         * The body that was specified for the forwarded request. If a value was not specified in
         * the original request, this value will be returned as null ; otherwise, this value will
         * always be returned as a string.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

        /**
         * The HTTP method that was specified for the forwarded request. Valid values include: `GET`
         * , `POST` , `PUT` , `DELETE` , and `PATCH`.
         */
        @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

        /** The URL route path that was specified for the forwarded request. */
        @JsonProperty("route") @ExcludeMissing fun _route(): JsonField<String> = route

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Request = apply {
            if (validated) {
                return@apply
            }

            data()
            method()
            route()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Request]. */
        class Builder internal constructor() {

            private var data: JsonField<String>? = null
            private var headers: JsonValue? = null
            private var method: JsonField<String>? = null
            private var params: JsonValue? = null
            private var route: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(request: Request) = apply {
                data = request.data
                headers = request.headers
                method = request.method
                params = request.params
                route = request.route
                additionalProperties = request.additionalProperties.toMutableMap()
            }

            /**
             * The body that was specified for the forwarded request. If a value was not specified
             * in the original request, this value will be returned as null ; otherwise, this value
             * will always be returned as a string.
             */
            fun data(data: String?) = data(JsonField.ofNullable(data))

            /**
             * The body that was specified for the forwarded request. If a value was not specified
             * in the original request, this value will be returned as null ; otherwise, this value
             * will always be returned as a string.
             */
            fun data(data: Optional<String>) = data(data.orElse(null))

            /**
             * The body that was specified for the forwarded request. If a value was not specified
             * in the original request, this value will be returned as null ; otherwise, this value
             * will always be returned as a string.
             */
            fun data(data: JsonField<String>) = apply { this.data = data }

            /**
             * The specified HTTP headers that were included in the forwarded request. If no headers
             * were specified, this will be returned as `null`.
             */
            fun headers(headers: JsonValue) = apply { this.headers = headers }

            /**
             * The HTTP method that was specified for the forwarded request. Valid values include:
             * `GET` , `POST` , `PUT` , `DELETE` , and `PATCH`.
             */
            fun method(method: String) = method(JsonField.of(method))

            /**
             * The HTTP method that was specified for the forwarded request. Valid values include:
             * `GET` , `POST` , `PUT` , `DELETE` , and `PATCH`.
             */
            fun method(method: JsonField<String>) = apply { this.method = method }

            /**
             * The query parameters that were included in the forwarded request. If no query
             * parameters were specified, this will be returned as `null`.
             */
            fun params(params: JsonValue) = apply { this.params = params }

            /** The URL route path that was specified for the forwarded request. */
            fun route(route: String) = route(JsonField.of(route))

            /** The URL route path that was specified for the forwarded request. */
            fun route(route: JsonField<String>) = apply { this.route = route }

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

            fun build(): Request =
                Request(
                    checkRequired("data", data),
                    checkRequired("headers", headers),
                    checkRequired("method", method),
                    checkRequired("params", params),
                    checkRequired("route", route),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Request && data == other.data && headers == other.headers && method == other.method && params == other.params && route == other.route && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(data, headers, method, params, route, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Request{data=$data, headers=$headers, method=$method, params=$params, route=$route, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RequestForwardingForwardResponse && data == other.data && headers == other.headers && request == other.request && statusCode == other.statusCode && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, headers, request, statusCode, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RequestForwardingForwardResponse{data=$data, headers=$headers, request=$request, statusCode=$statusCode, additionalProperties=$additionalProperties}"
}

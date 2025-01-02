// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = RequestForwardingForwardResponse.Builder::class)
@NoAutoDetect
class RequestForwardingForwardResponse
private constructor(
    private val headers: JsonValue,
    private val statusCode: JsonField<Long>,
    private val data: JsonField<String>,
    private val request: JsonField<Request>,
    private val additionalProperties: Map<String, JsonValue>,
) {

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
    fun data(): Optional<String> = Optional.ofNullable(data.getNullable("data"))

    /**
     * An object containing details of your original forwarded request, for your ease of reference.
     */
    fun request(): Request = request.getRequired("request")

    /**
     * The HTTP headers of the forwarded request’s response, exactly as received from the underlying
     * integration’s API.
     */
    @JsonProperty("headers") @ExcludeMissing fun _headers() = headers

    /**
     * The HTTP status code of the forwarded request’s response, exactly received from the
     * underlying integration’s API. This value will be returned as an integer.
     */
    @JsonProperty("statusCode") @ExcludeMissing fun _statusCode() = statusCode

    /**
     * A string representation of the HTTP response body of the forwarded request’s response
     * received from the underlying integration’s API. This field may be null in the case where the
     * upstream system’s response is empty.
     */
    @JsonProperty("data") @ExcludeMissing fun _data() = data

    /**
     * An object containing details of your original forwarded request, for your ease of reference.
     */
    @JsonProperty("request") @ExcludeMissing fun _request() = request

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): RequestForwardingForwardResponse = apply {
        if (!validated) {
            statusCode()
            data()
            request().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var headers: JsonValue = JsonMissing.of()
        private var statusCode: JsonField<Long> = JsonMissing.of()
        private var data: JsonField<String> = JsonMissing.of()
        private var request: JsonField<Request> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(requestForwardingForwardResponse: RequestForwardingForwardResponse) =
            apply {
                headers = requestForwardingForwardResponse.headers
                statusCode = requestForwardingForwardResponse.statusCode
                data = requestForwardingForwardResponse.data
                request = requestForwardingForwardResponse.request
                additionalProperties =
                    requestForwardingForwardResponse.additionalProperties.toMutableMap()
            }

        /**
         * The HTTP headers of the forwarded request’s response, exactly as received from the
         * underlying integration’s API.
         */
        @JsonProperty("headers")
        @ExcludeMissing
        fun headers(headers: JsonValue) = apply { this.headers = headers }

        /**
         * The HTTP status code of the forwarded request’s response, exactly received from the
         * underlying integration’s API. This value will be returned as an integer.
         */
        fun statusCode(statusCode: Long) = statusCode(JsonField.of(statusCode))

        /**
         * The HTTP status code of the forwarded request’s response, exactly received from the
         * underlying integration’s API. This value will be returned as an integer.
         */
        @JsonProperty("statusCode")
        @ExcludeMissing
        fun statusCode(statusCode: JsonField<Long>) = apply { this.statusCode = statusCode }

        /**
         * A string representation of the HTTP response body of the forwarded request’s response
         * received from the underlying integration’s API. This field may be null in the case where
         * the upstream system’s response is empty.
         */
        fun data(data: String) = data(JsonField.of(data))

        /**
         * A string representation of the HTTP response body of the forwarded request’s response
         * received from the underlying integration’s API. This field may be null in the case where
         * the upstream system’s response is empty.
         */
        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<String>) = apply { this.data = data }

        /**
         * An object containing details of your original forwarded request, for your ease of
         * reference.
         */
        fun request(request: Request) = request(JsonField.of(request))

        /**
         * An object containing details of your original forwarded request, for your ease of
         * reference.
         */
        @JsonProperty("request")
        @ExcludeMissing
        fun request(request: JsonField<Request>) = apply { this.request = request }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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
                headers,
                statusCode,
                data,
                request,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * An object containing details of your original forwarded request, for your ease of reference.
     */
    @JsonDeserialize(builder = Request.Builder::class)
    @NoAutoDetect
    class Request
    private constructor(
        private val method: JsonField<String>,
        private val route: JsonField<String>,
        private val headers: JsonValue,
        private val params: JsonValue,
        private val data: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The HTTP method that was specified for the forwarded request. Valid values include: `GET`
         * , `POST` , `PUT` , `DELETE` , and `PATCH`.
         */
        fun method(): String = method.getRequired("method")

        /** The URL route path that was specified for the forwarded request. */
        fun route(): String = route.getRequired("route")

        /**
         * The body that was specified for the forwarded request. If a value was not specified in
         * the original request, this value will be returned as null ; otherwise, this value will
         * always be returned as a string.
         */
        fun data(): Optional<String> = Optional.ofNullable(data.getNullable("data"))

        /**
         * The HTTP method that was specified for the forwarded request. Valid values include: `GET`
         * , `POST` , `PUT` , `DELETE` , and `PATCH`.
         */
        @JsonProperty("method") @ExcludeMissing fun _method() = method

        /** The URL route path that was specified for the forwarded request. */
        @JsonProperty("route") @ExcludeMissing fun _route() = route

        /**
         * The specified HTTP headers that were included in the forwarded request. If no headers
         * were specified, this will be returned as `null`.
         */
        @JsonProperty("headers") @ExcludeMissing fun _headers() = headers

        /**
         * The query parameters that were included in the forwarded request. If no query parameters
         * were specified, this will be returned as `null`.
         */
        @JsonProperty("params") @ExcludeMissing fun _params() = params

        /**
         * The body that was specified for the forwarded request. If a value was not specified in
         * the original request, this value will be returned as null ; otherwise, this value will
         * always be returned as a string.
         */
        @JsonProperty("data") @ExcludeMissing fun _data() = data

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Request = apply {
            if (!validated) {
                method()
                route()
                data()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var method: JsonField<String> = JsonMissing.of()
            private var route: JsonField<String> = JsonMissing.of()
            private var headers: JsonValue = JsonMissing.of()
            private var params: JsonValue = JsonMissing.of()
            private var data: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(request: Request) = apply {
                method = request.method
                route = request.route
                headers = request.headers
                params = request.params
                data = request.data
                additionalProperties = request.additionalProperties.toMutableMap()
            }

            /**
             * The HTTP method that was specified for the forwarded request. Valid values include:
             * `GET` , `POST` , `PUT` , `DELETE` , and `PATCH`.
             */
            fun method(method: String) = method(JsonField.of(method))

            /**
             * The HTTP method that was specified for the forwarded request. Valid values include:
             * `GET` , `POST` , `PUT` , `DELETE` , and `PATCH`.
             */
            @JsonProperty("method")
            @ExcludeMissing
            fun method(method: JsonField<String>) = apply { this.method = method }

            /** The URL route path that was specified for the forwarded request. */
            fun route(route: String) = route(JsonField.of(route))

            /** The URL route path that was specified for the forwarded request. */
            @JsonProperty("route")
            @ExcludeMissing
            fun route(route: JsonField<String>) = apply { this.route = route }

            /**
             * The specified HTTP headers that were included in the forwarded request. If no headers
             * were specified, this will be returned as `null`.
             */
            @JsonProperty("headers")
            @ExcludeMissing
            fun headers(headers: JsonValue) = apply { this.headers = headers }

            /**
             * The query parameters that were included in the forwarded request. If no query
             * parameters were specified, this will be returned as `null`.
             */
            @JsonProperty("params")
            @ExcludeMissing
            fun params(params: JsonValue) = apply { this.params = params }

            /**
             * The body that was specified for the forwarded request. If a value was not specified
             * in the original request, this value will be returned as null ; otherwise, this value
             * will always be returned as a string.
             */
            fun data(data: String) = data(JsonField.of(data))

            /**
             * The body that was specified for the forwarded request. If a value was not specified
             * in the original request, this value will be returned as null ; otherwise, this value
             * will always be returned as a string.
             */
            @JsonProperty("data")
            @ExcludeMissing
            fun data(data: JsonField<String>) = apply { this.data = data }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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
                    method,
                    route,
                    headers,
                    params,
                    data,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Request && method == other.method && route == other.route && headers == other.headers && params == other.params && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(method, route, headers, params, data, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Request{method=$method, route=$route, headers=$headers, params=$params, data=$data, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RequestForwardingForwardResponse && headers == other.headers && statusCode == other.statusCode && data == other.data && request == other.request && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(headers, statusCode, data, request, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RequestForwardingForwardResponse{headers=$headers, statusCode=$statusCode, data=$data, request=$request, additionalProperties=$additionalProperties}"
}

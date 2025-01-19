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
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/**
 * Read detailed pay statements for each individual.
 *
 * Deduction and contribution types are supported by the payroll systems that supports Benefits.
 */
class HrisPayStatementRetrieveManyParams
constructor(
    private val body: HrisPayStatementRetrieveManyBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The array of batch requests. */
    fun requests(): List<Request> = body.requests()

    /** The array of batch requests. */
    fun _requests(): JsonField<List<Request>> = body._requests()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): HrisPayStatementRetrieveManyBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class HrisPayStatementRetrieveManyBody
    @JsonCreator
    internal constructor(
        @JsonProperty("requests")
        @ExcludeMissing
        private val requests: JsonField<List<Request>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The array of batch requests. */
        fun requests(): List<Request> = requests.getRequired("requests")

        /** The array of batch requests. */
        @JsonProperty("requests")
        @ExcludeMissing
        fun _requests(): JsonField<List<Request>> = requests

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): HrisPayStatementRetrieveManyBody = apply {
            if (validated) {
                return@apply
            }

            requests().forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var requests: JsonField<MutableList<Request>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(hrisPayStatementRetrieveManyBody: HrisPayStatementRetrieveManyBody) =
                apply {
                    requests = hrisPayStatementRetrieveManyBody.requests.map { it.toMutableList() }
                    additionalProperties =
                        hrisPayStatementRetrieveManyBody.additionalProperties.toMutableMap()
                }

            /** The array of batch requests. */
            fun requests(requests: List<Request>) = requests(JsonField.of(requests))

            /** The array of batch requests. */
            fun requests(requests: JsonField<List<Request>>) = apply {
                this.requests = requests.map { it.toMutableList() }
            }

            /** The array of batch requests. */
            fun addRequest(request: Request) = apply {
                requests =
                    (requests ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(request)
                    }
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

            fun build(): HrisPayStatementRetrieveManyBody =
                HrisPayStatementRetrieveManyBody(
                    checkRequired("requests", requests).map { it.toImmutable() },
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is HrisPayStatementRetrieveManyBody && requests == other.requests && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(requests, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "HrisPayStatementRetrieveManyBody{requests=$requests, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: HrisPayStatementRetrieveManyBody.Builder =
            HrisPayStatementRetrieveManyBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(hrisPayStatementRetrieveManyParams: HrisPayStatementRetrieveManyParams) =
            apply {
                body = hrisPayStatementRetrieveManyParams.body.toBuilder()
                additionalHeaders = hrisPayStatementRetrieveManyParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    hrisPayStatementRetrieveManyParams.additionalQueryParams.toBuilder()
            }

        /** The array of batch requests. */
        fun requests(requests: List<Request>) = apply { body.requests(requests) }

        /** The array of batch requests. */
        fun requests(requests: JsonField<List<Request>>) = apply { body.requests(requests) }

        /** The array of batch requests. */
        fun addRequest(request: Request) = apply { body.addRequest(request) }

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

        fun build(): HrisPayStatementRetrieveManyParams =
            HrisPayStatementRetrieveManyParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Request
    @JsonCreator
    private constructor(
        @JsonProperty("payment_id")
        @ExcludeMissing
        private val paymentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("limit")
        @ExcludeMissing
        private val limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("offset")
        @ExcludeMissing
        private val offset: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A stable Finch `id` (UUID v4) for a payment. */
        fun paymentId(): String = paymentId.getRequired("payment_id")

        /** Number of pay statements to return (defaults to all). */
        fun limit(): Optional<Long> = Optional.ofNullable(limit.getNullable("limit"))

        /** Index to start from. */
        fun offset(): Optional<Long> = Optional.ofNullable(offset.getNullable("offset"))

        /** A stable Finch `id` (UUID v4) for a payment. */
        @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

        /** Number of pay statements to return (defaults to all). */
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

        /** Index to start from. */
        @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Request = apply {
            if (validated) {
                return@apply
            }

            paymentId()
            limit()
            offset()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var paymentId: JsonField<String>? = null
            private var limit: JsonField<Long> = JsonMissing.of()
            private var offset: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(request: Request) = apply {
                paymentId = request.paymentId
                limit = request.limit
                offset = request.offset
                additionalProperties = request.additionalProperties.toMutableMap()
            }

            /** A stable Finch `id` (UUID v4) for a payment. */
            fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

            /** A stable Finch `id` (UUID v4) for a payment. */
            fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

            /** Number of pay statements to return (defaults to all). */
            fun limit(limit: Long) = limit(JsonField.of(limit))

            /** Number of pay statements to return (defaults to all). */
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

            /** Index to start from. */
            fun offset(offset: Long) = offset(JsonField.of(offset))

            /** Index to start from. */
            fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

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
                    checkRequired("paymentId", paymentId),
                    limit,
                    offset,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Request && paymentId == other.paymentId && limit == other.limit && offset == other.offset && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(paymentId, limit, offset, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Request{paymentId=$paymentId, limit=$limit, offset=$offset, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisPayStatementRetrieveManyParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "HrisPayStatementRetrieveManyParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

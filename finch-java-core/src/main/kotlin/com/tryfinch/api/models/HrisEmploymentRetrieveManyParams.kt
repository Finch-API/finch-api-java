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
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects

/** Read individual employment and income data */
class HrisEmploymentRetrieveManyParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The array of batch requests.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requests(): List<Request> = body.requests()

    /**
     * Returns the raw JSON value of [requests].
     *
     * Unlike [requests], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _requests(): JsonField<List<Request>> = body._requests()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Individual Ids Request Body */
    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("requests")
        @ExcludeMissing
        private val requests: JsonField<List<Request>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The array of batch requests.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requests(): List<Request> = requests.getRequired("requests")

        /**
         * Returns the raw JSON value of [requests].
         *
         * Unlike [requests], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("requests")
        @ExcludeMissing
        fun _requests(): JsonField<List<Request>> = requests

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            requests().forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .requests()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var requests: JsonField<MutableList<Request>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                requests = body.requests.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The array of batch requests. */
            fun requests(requests: List<Request>) = requests(JsonField.of(requests))

            /**
             * Sets [Builder.requests] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requests] with a well-typed `List<Request>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requests(requests: JsonField<List<Request>>) = apply {
                this.requests = requests.map { it.toMutableList() }
            }

            /**
             * Adds a single [Request] to [requests].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRequest(request: Request) = apply {
                requests =
                    (requests ?: JsonField.of(mutableListOf())).also {
                        checkKnown("requests", it).add(request)
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

            fun build(): Body =
                Body(
                    checkRequired("requests", requests).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && requests == other.requests && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(requests, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{requests=$requests, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisEmploymentRetrieveManyParams].
         *
         * The following fields are required:
         * ```java
         * .requests()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HrisEmploymentRetrieveManyParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(hrisEmploymentRetrieveManyParams: HrisEmploymentRetrieveManyParams) =
            apply {
                body = hrisEmploymentRetrieveManyParams.body.toBuilder()
                additionalHeaders = hrisEmploymentRetrieveManyParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    hrisEmploymentRetrieveManyParams.additionalQueryParams.toBuilder()
            }

        /** The array of batch requests. */
        fun requests(requests: List<Request>) = apply { body.requests(requests) }

        /**
         * Sets [Builder.requests] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requests] with a well-typed `List<Request>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requests(requests: JsonField<List<Request>>) = apply { body.requests(requests) }

        /**
         * Adds a single [Request] to [requests].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
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

        fun build(): HrisEmploymentRetrieveManyParams =
            HrisEmploymentRetrieveManyParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Request
    @JsonCreator
    private constructor(
        @JsonProperty("individual_id")
        @ExcludeMissing
        private val individualId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * A stable Finch `id` (UUID v4) for an individual in the company. There is no limit to the
         * number of `individual_id` to send per request. It is preferantial to send all ids in a
         * single request for Finch to optimize provider rate-limits.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun individualId(): String = individualId.getRequired("individual_id")

        /**
         * Returns the raw JSON value of [individualId].
         *
         * Unlike [individualId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("individual_id")
        @ExcludeMissing
        fun _individualId(): JsonField<String> = individualId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Request = apply {
            if (validated) {
                return@apply
            }

            individualId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Request].
             *
             * The following fields are required:
             * ```java
             * .individualId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Request]. */
        class Builder internal constructor() {

            private var individualId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(request: Request) = apply {
                individualId = request.individualId
                additionalProperties = request.additionalProperties.toMutableMap()
            }

            /**
             * A stable Finch `id` (UUID v4) for an individual in the company. There is no limit to
             * the number of `individual_id` to send per request. It is preferantial to send all ids
             * in a single request for Finch to optimize provider rate-limits.
             */
            fun individualId(individualId: String) = individualId(JsonField.of(individualId))

            /**
             * Sets [Builder.individualId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.individualId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun individualId(individualId: JsonField<String>) = apply {
                this.individualId = individualId
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

            fun build(): Request =
                Request(
                    checkRequired("individualId", individualId),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Request && individualId == other.individualId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(individualId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Request{individualId=$individualId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisEmploymentRetrieveManyParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "HrisEmploymentRetrieveManyParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

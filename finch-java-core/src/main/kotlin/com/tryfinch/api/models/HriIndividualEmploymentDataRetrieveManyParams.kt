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

class HriIndividualEmploymentDataRetrieveManyParams
constructor(
    private val requests: List<Request>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun requests(): List<Request> = requests

    @JvmSynthetic
    internal fun getBody(): HriIndividualEmploymentDataRetrieveManyBody {
        return HriIndividualEmploymentDataRetrieveManyBody(requests, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    /** Individual Ids Request Body */
    @JsonDeserialize(builder = HriIndividualEmploymentDataRetrieveManyBody.Builder::class)
    @NoAutoDetect
    class HriIndividualEmploymentDataRetrieveManyBody
    internal constructor(
        private val requests: List<Request>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The array of batch requests. */
        @JsonProperty("requests") fun requests(): List<Request>? = requests

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is HriIndividualEmploymentDataRetrieveManyBody &&
                this.requests == other.requests &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(requests, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "HriIndividualEmploymentDataRetrieveManyBody{requests=$requests, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var requests: List<Request>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                hriIndividualEmploymentDataRetrieveManyBody:
                    HriIndividualEmploymentDataRetrieveManyBody
            ) = apply {
                this.requests = hriIndividualEmploymentDataRetrieveManyBody.requests
                additionalProperties(
                    hriIndividualEmploymentDataRetrieveManyBody.additionalProperties
                )
            }

            /** The array of batch requests. */
            @JsonProperty("requests")
            fun requests(requests: List<Request>) = apply { this.requests = requests }

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

            fun build(): HriIndividualEmploymentDataRetrieveManyBody =
                HriIndividualEmploymentDataRetrieveManyBody(
                    checkNotNull(requests) { "`requests` is required but was not set" }
                        .toUnmodifiable(),
                    additionalProperties.toUnmodifiable()
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

        return other is HriIndividualEmploymentDataRetrieveManyParams &&
            this.requests == other.requests &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            requests,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "HriIndividualEmploymentDataRetrieveManyParams{requests=$requests, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var requests: List<Request>? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            hriIndividualEmploymentDataRetrieveManyParams:
                HriIndividualEmploymentDataRetrieveManyParams
        ) = apply {
            this.requests = hriIndividualEmploymentDataRetrieveManyParams.requests
            additionalQueryParams(
                hriIndividualEmploymentDataRetrieveManyParams.additionalQueryParams
            )
            additionalHeaders(hriIndividualEmploymentDataRetrieveManyParams.additionalHeaders)
            additionalBodyProperties(
                hriIndividualEmploymentDataRetrieveManyParams.additionalBodyProperties
            )
        }

        /** The array of batch requests. */
        fun requests(requests: List<Request>) = apply { this.requests = requests }

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

        fun build(): HriIndividualEmploymentDataRetrieveManyParams =
            HriIndividualEmploymentDataRetrieveManyParams(
                checkNotNull(requests) { "`requests` is required but was not set" }
                    .toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Request.Builder::class)
    @NoAutoDetect
    class Request
    private constructor(
        private val individualId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * A stable Finch `id` (UUID v4) for an individual in the company. There is no limit to the
         * number of `individual_id` to send per request. It is preferantial to send all ids in a
         * single request for Finch to optimize provider rate-limits.
         */
        @JsonProperty("individual_id") fun individualId(): String? = individualId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Request &&
                this.individualId == other.individualId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(individualId, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "Request{individualId=$individualId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var individualId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(request: Request) = apply {
                this.individualId = request.individualId
                additionalProperties(request.additionalProperties)
            }

            /**
             * A stable Finch `id` (UUID v4) for an individual in the company. There is no limit to
             * the number of `individual_id` to send per request. It is preferantial to send all ids
             * in a single request for Finch to optimize provider rate-limits.
             */
            @JsonProperty("individual_id")
            fun individualId(individualId: String) = apply { this.individualId = individualId }

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

            fun build(): Request =
                Request(
                    checkNotNull(individualId) { "`individualId` is required but was not set" },
                    additionalProperties.toUnmodifiable()
                )
        }
    }
}

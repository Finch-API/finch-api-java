package org.finch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional
import org.finch.api.core.ExcludeMissing
import org.finch.api.core.JsonValue
import org.finch.api.core.NoAutoDetect
import org.finch.api.core.toUnmodifiable
import org.finch.api.models.*

class HrisIndividualRetrieveManyParams
constructor(
    private val requests: List<Request>?,
    private val options: Options?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun requests(): Optional<List<Request>> = Optional.ofNullable(requests)

    fun options(): Optional<Options> = Optional.ofNullable(options)

    @JvmSynthetic
    internal fun getBody(): HrisIndividualRetrieveManyBody {
        return HrisIndividualRetrieveManyBody(
            requests,
            options,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = HrisIndividualRetrieveManyBody.Builder::class)
    @NoAutoDetect
    class HrisIndividualRetrieveManyBody
    internal constructor(
        private val requests: List<Request>?,
        private val options: Options?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("requests") fun requests(): List<Request>? = requests

        @JsonProperty("options") fun options(): Options? = options

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is HrisIndividualRetrieveManyBody &&
                this.requests == other.requests &&
                this.options == other.options &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        requests,
                        options,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "HrisIndividualRetrieveManyBody{requests=$requests, options=$options, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var requests: List<Request>? = null
            private var options: Options? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(hrisIndividualRetrieveManyBody: HrisIndividualRetrieveManyBody) =
                apply {
                    this.requests = hrisIndividualRetrieveManyBody.requests
                    this.options = hrisIndividualRetrieveManyBody.options
                    additionalProperties(hrisIndividualRetrieveManyBody.additionalProperties)
                }

            @JsonProperty("requests")
            fun requests(requests: List<Request>) = apply { this.requests = requests }

            @JsonProperty("options")
            fun options(options: Options) = apply { this.options = options }

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

            fun build(): HrisIndividualRetrieveManyBody =
                HrisIndividualRetrieveManyBody(
                    requests?.toUnmodifiable(),
                    options,
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

        return other is HrisIndividualRetrieveManyParams &&
            this.requests == other.requests &&
            this.options == other.options &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            requests,
            options,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "HrisIndividualRetrieveManyParams{requests=$requests, options=$options, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var requests: List<Request>? = null
        private var options: Options? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(hrisIndividualRetrieveManyParams: HrisIndividualRetrieveManyParams) =
            apply {
                this.requests = hrisIndividualRetrieveManyParams.requests
                this.options = hrisIndividualRetrieveManyParams.options
                additionalQueryParams(hrisIndividualRetrieveManyParams.additionalQueryParams)
                additionalHeaders(hrisIndividualRetrieveManyParams.additionalHeaders)
                additionalBodyProperties(hrisIndividualRetrieveManyParams.additionalBodyProperties)
            }

        fun requests(requests: List<Request>) = apply { this.requests = requests }

        fun options(options: Options) = apply { this.options = options }

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

        fun build(): HrisIndividualRetrieveManyParams =
            HrisIndividualRetrieveManyParams(
                requests?.toUnmodifiable(),
                options,
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

            fun build(): Request = Request(individualId, additionalProperties.toUnmodifiable())
        }
    }

    @JsonDeserialize(builder = Options.Builder::class)
    @NoAutoDetect
    class Options
    private constructor(
        private val include: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("include") fun include(): List<String>? = include

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Options &&
                this.include == other.include &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(include, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "Options{include=$include, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var include: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(options: Options) = apply {
                this.include = options.include
                additionalProperties(options.additionalProperties)
            }

            @JsonProperty("include")
            fun include(include: List<String>) = apply { this.include = include }

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

            fun build(): Options =
                Options(include?.toUnmodifiable(), additionalProperties.toUnmodifiable())
        }
    }
}

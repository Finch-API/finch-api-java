// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.BaseDeserializer
import com.tryfinch.api.core.BaseSerializer
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.getOrThrow
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import com.tryfinch.api.models.*
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class JobAutomatedCreateParams
constructor(
    private val dataSyncAll: DataSyncAll?,
    private val w4DataSync: W4DataSync?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun dataSyncAll(): Optional<DataSyncAll> = Optional.ofNullable(dataSyncAll)

    fun w4DataSync(): Optional<W4DataSync> = Optional.ofNullable(w4DataSync)

    @JvmSynthetic
    internal fun getBody(): JobAutomatedCreateBody {
        return JobAutomatedCreateBody(dataSyncAll, w4DataSync)
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = JobAutomatedCreateBody.Deserializer::class)
    @JsonSerialize(using = JobAutomatedCreateBody.Serializer::class)
    class JobAutomatedCreateBody
    internal constructor(
        private val dataSyncAll: DataSyncAll? = null,
        private val w4DataSync: W4DataSync? = null,
        private val _json: JsonValue? = null,
    ) {

        fun dataSyncAll(): Optional<DataSyncAll> = Optional.ofNullable(dataSyncAll)

        fun w4DataSync(): Optional<W4DataSync> = Optional.ofNullable(w4DataSync)

        fun isDataSyncAll(): Boolean = dataSyncAll != null

        fun isW4DataSync(): Boolean = w4DataSync != null

        fun asDataSyncAll(): DataSyncAll = dataSyncAll.getOrThrow("dataSyncAll")

        fun asW4DataSync(): W4DataSync = w4DataSync.getOrThrow("w4DataSync")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                dataSyncAll != null -> visitor.visitDataSyncAll(dataSyncAll)
                w4DataSync != null -> visitor.visitW4DataSync(w4DataSync)
                else -> visitor.unknown(_json)
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is JobAutomatedCreateBody && this.dataSyncAll == other.dataSyncAll && this.w4DataSync == other.w4DataSync /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(dataSyncAll, w4DataSync) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                dataSyncAll != null -> "JobAutomatedCreateBody{dataSyncAll=$dataSyncAll}"
                w4DataSync != null -> "JobAutomatedCreateBody{w4DataSync=$w4DataSync}"
                _json != null -> "JobAutomatedCreateBody{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid JobAutomatedCreateBody")
            }
        }

        companion object {

            @JvmStatic
            fun ofDataSyncAll(dataSyncAll: DataSyncAll) =
                JobAutomatedCreateBody(dataSyncAll = dataSyncAll)

            @JvmStatic
            fun ofW4DataSync(w4DataSync: W4DataSync) =
                JobAutomatedCreateBody(w4DataSync = w4DataSync)
        }

        interface Visitor<out T> {

            fun visitDataSyncAll(dataSyncAll: DataSyncAll): T

            fun visitW4DataSync(w4DataSync: W4DataSync): T

            fun unknown(json: JsonValue?): T {
                throw FinchInvalidDataException("Unknown JobAutomatedCreateBody: $json")
            }
        }

        class Deserializer :
            BaseDeserializer<JobAutomatedCreateBody>(JobAutomatedCreateBody::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): JobAutomatedCreateBody {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "data_sync_all" -> {
                        tryDeserialize(node, jacksonTypeRef<DataSyncAll>())?.let {
                            return JobAutomatedCreateBody(dataSyncAll = it, _json = json)
                        }
                    }
                    "w4_data_sync" -> {
                        tryDeserialize(node, jacksonTypeRef<W4DataSync>())?.let {
                            return JobAutomatedCreateBody(w4DataSync = it, _json = json)
                        }
                    }
                }

                return JobAutomatedCreateBody(_json = json)
            }
        }

        class Serializer : BaseSerializer<JobAutomatedCreateBody>(JobAutomatedCreateBody::class) {

            override fun serialize(
                value: JobAutomatedCreateBody,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.dataSyncAll != null -> generator.writeObject(value.dataSyncAll)
                    value.w4DataSync != null -> generator.writeObject(value.w4DataSync)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid JobAutomatedCreateBody")
                }
            }
        }
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is JobAutomatedCreateParams && this.dataSyncAll == other.dataSyncAll && this.w4DataSync == other.w4DataSync && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(dataSyncAll, w4DataSync, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "JobAutomatedCreateParams{dataSyncAll=$dataSyncAll, w4DataSync=$w4DataSync, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var dataSyncAll: DataSyncAll? = null
        private var w4DataSync: W4DataSync? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(jobAutomatedCreateParams: JobAutomatedCreateParams) = apply {
            this.dataSyncAll = jobAutomatedCreateParams.dataSyncAll
            this.w4DataSync = jobAutomatedCreateParams.w4DataSync
            additionalHeaders(jobAutomatedCreateParams.additionalHeaders)
            additionalQueryParams(jobAutomatedCreateParams.additionalQueryParams)
        }

        fun forDataSyncAll(dataSyncAll: DataSyncAll) = apply {
            this.dataSyncAll = dataSyncAll
            this.w4DataSync = null
        }

        fun forW4DataSync(w4DataSync: W4DataSync) = apply {
            this.dataSyncAll = null
            this.w4DataSync = w4DataSync
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

        fun build(): JobAutomatedCreateParams =
            JobAutomatedCreateParams(
                dataSyncAll,
                w4DataSync,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JsonDeserialize(builder = DataSyncAll.Builder::class)
    @NoAutoDetect
    class DataSyncAll
    private constructor(
        private val type: Type?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The type of job to start. */
        @JsonProperty("type") fun type(): Type? = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: Type? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dataSyncAll: DataSyncAll) = apply {
                this.type = dataSyncAll.type
                additionalProperties(dataSyncAll.additionalProperties)
            }

            /** The type of job to start. */
            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

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

            fun build(): DataSyncAll =
                DataSyncAll(
                    checkNotNull(type) { "`type` is required but was not set" },
                    additionalProperties.toImmutable()
                )
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val DATA_SYNC_ALL = Type(JsonField.of("data_sync_all"))

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                DATA_SYNC_ALL,
            }

            enum class Value {
                DATA_SYNC_ALL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    DATA_SYNC_ALL -> Value.DATA_SYNC_ALL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    DATA_SYNC_ALL -> Known.DATA_SYNC_ALL
                    else -> throw FinchInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DataSyncAll && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(type, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "DataSyncAll{type=$type, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = W4DataSync.Builder::class)
    @NoAutoDetect
    class W4DataSync
    private constructor(
        private val type: Type?,
        private val individualId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The type of job to start. */
        @JsonProperty("type") fun type(): Type? = type

        /** The unique ID of the individual for W-4 data sync. */
        @JsonProperty("individual_id") fun individualId(): String? = individualId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: Type? = null
            private var individualId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(w4DataSync: W4DataSync) = apply {
                this.type = w4DataSync.type
                this.individualId = w4DataSync.individualId
                additionalProperties(w4DataSync.additionalProperties)
            }

            /** The type of job to start. */
            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            /** The unique ID of the individual for W-4 data sync. */
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

            fun build(): W4DataSync =
                W4DataSync(
                    checkNotNull(type) { "`type` is required but was not set" },
                    checkNotNull(individualId) { "`individualId` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val W4_DATA_SYNC = Type(JsonField.of("w4_data_sync"))

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                W4_DATA_SYNC,
            }

            enum class Value {
                W4_DATA_SYNC,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    W4_DATA_SYNC -> Value.W4_DATA_SYNC
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    W4_DATA_SYNC -> Known.W4_DATA_SYNC
                    else -> throw FinchInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is W4DataSync && this.type == other.type && this.individualId == other.individualId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(type, individualId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "W4DataSync{type=$type, individualId=$individualId, additionalProperties=$additionalProperties}"
    }
}

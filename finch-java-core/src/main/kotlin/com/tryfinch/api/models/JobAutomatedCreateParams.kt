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
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class JobAutomatedCreateParams
constructor(
    private val dataSyncAll: DataSyncAll?,
    private val w4FormEmployeeSync: W4FormEmployeeSync?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun dataSyncAll(): Optional<DataSyncAll> = Optional.ofNullable(dataSyncAll)

    fun w4FormEmployeeSync(): Optional<W4FormEmployeeSync> = Optional.ofNullable(w4FormEmployeeSync)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic
    internal fun getBody(): JobAutomatedCreateBody {
        return JobAutomatedCreateBody(dataSyncAll, w4FormEmployeeSync)
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = JobAutomatedCreateBody.Deserializer::class)
    @JsonSerialize(using = JobAutomatedCreateBody.Serializer::class)
    class JobAutomatedCreateBody
    internal constructor(
        private val dataSyncAll: DataSyncAll? = null,
        private val w4FormEmployeeSync: W4FormEmployeeSync? = null,
        private val _json: JsonValue? = null,
    ) {

        fun dataSyncAll(): Optional<DataSyncAll> = Optional.ofNullable(dataSyncAll)

        fun w4FormEmployeeSync(): Optional<W4FormEmployeeSync> =
            Optional.ofNullable(w4FormEmployeeSync)

        fun isDataSyncAll(): Boolean = dataSyncAll != null

        fun isW4FormEmployeeSync(): Boolean = w4FormEmployeeSync != null

        fun asDataSyncAll(): DataSyncAll = dataSyncAll.getOrThrow("dataSyncAll")

        fun asW4FormEmployeeSync(): W4FormEmployeeSync =
            w4FormEmployeeSync.getOrThrow("w4FormEmployeeSync")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                dataSyncAll != null -> visitor.visitDataSyncAll(dataSyncAll)
                w4FormEmployeeSync != null -> visitor.visitW4FormEmployeeSync(w4FormEmployeeSync)
                else -> visitor.unknown(_json)
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is JobAutomatedCreateBody && dataSyncAll == other.dataSyncAll && w4FormEmployeeSync == other.w4FormEmployeeSync /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(dataSyncAll, w4FormEmployeeSync) /* spotless:on */

        override fun toString(): String =
            when {
                dataSyncAll != null -> "JobAutomatedCreateBody{dataSyncAll=$dataSyncAll}"
                w4FormEmployeeSync != null ->
                    "JobAutomatedCreateBody{w4FormEmployeeSync=$w4FormEmployeeSync}"
                _json != null -> "JobAutomatedCreateBody{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid JobAutomatedCreateBody")
            }

        companion object {

            @JvmStatic
            fun ofDataSyncAll(dataSyncAll: DataSyncAll) =
                JobAutomatedCreateBody(dataSyncAll = dataSyncAll)

            @JvmStatic
            fun ofW4FormEmployeeSync(w4FormEmployeeSync: W4FormEmployeeSync) =
                JobAutomatedCreateBody(w4FormEmployeeSync = w4FormEmployeeSync)
        }

        interface Visitor<out T> {

            fun visitDataSyncAll(dataSyncAll: DataSyncAll): T

            fun visitW4FormEmployeeSync(w4FormEmployeeSync: W4FormEmployeeSync): T

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
                    "w4_form_employee_sync" -> {
                        tryDeserialize(node, jacksonTypeRef<W4FormEmployeeSync>())?.let {
                            return JobAutomatedCreateBody(w4FormEmployeeSync = it, _json = json)
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
                    value.w4FormEmployeeSync != null ->
                        generator.writeObject(value.w4FormEmployeeSync)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid JobAutomatedCreateBody")
                }
            }
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var dataSyncAll: DataSyncAll? = null
        private var w4FormEmployeeSync: W4FormEmployeeSync? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(jobAutomatedCreateParams: JobAutomatedCreateParams) = apply {
            dataSyncAll = jobAutomatedCreateParams.dataSyncAll
            w4FormEmployeeSync = jobAutomatedCreateParams.w4FormEmployeeSync
            additionalHeaders = jobAutomatedCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = jobAutomatedCreateParams.additionalQueryParams.toBuilder()
        }

        fun forDataSyncAll(dataSyncAll: DataSyncAll) = apply {
            this.dataSyncAll = dataSyncAll
            this.w4FormEmployeeSync = null
        }

        fun forW4FormEmployeeSync(w4FormEmployeeSync: W4FormEmployeeSync) = apply {
            this.dataSyncAll = null
            this.w4FormEmployeeSync = w4FormEmployeeSync
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
                w4FormEmployeeSync,
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

            companion object {

                @JvmField val DATA_SYNC_ALL = of("data_sync_all")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DataSyncAll && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DataSyncAll{type=$type, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = W4FormEmployeeSync.Builder::class)
    @NoAutoDetect
    class W4FormEmployeeSync
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
            internal fun from(w4FormEmployeeSync: W4FormEmployeeSync) = apply {
                this.type = w4FormEmployeeSync.type
                this.individualId = w4FormEmployeeSync.individualId
                additionalProperties(w4FormEmployeeSync.additionalProperties)
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

            fun build(): W4FormEmployeeSync =
                W4FormEmployeeSync(
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

            companion object {

                @JvmField val W4_FORM_EMPLOYEE_SYNC = of("w4_form_employee_sync")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                W4_FORM_EMPLOYEE_SYNC,
            }

            enum class Value {
                W4_FORM_EMPLOYEE_SYNC,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    W4_FORM_EMPLOYEE_SYNC -> Value.W4_FORM_EMPLOYEE_SYNC
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    W4_FORM_EMPLOYEE_SYNC -> Known.W4_FORM_EMPLOYEE_SYNC
                    else -> throw FinchInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is W4FormEmployeeSync && type == other.type && individualId == other.individualId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, individualId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "W4FormEmployeeSync{type=$type, individualId=$individualId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is JobAutomatedCreateParams && dataSyncAll == other.dataSyncAll && w4FormEmployeeSync == other.w4FormEmployeeSync && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(dataSyncAll, w4FormEmployeeSync, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "JobAutomatedCreateParams{dataSyncAll=$dataSyncAll, w4FormEmployeeSync=$w4FormEmployeeSync, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

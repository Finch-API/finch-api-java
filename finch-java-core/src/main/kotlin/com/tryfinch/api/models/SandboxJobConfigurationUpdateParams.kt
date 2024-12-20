// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects

class SandboxJobConfigurationUpdateParams
constructor(
    private val completionStatus: CompletionStatus,
    private val type: Type,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun completionStatus(): CompletionStatus = completionStatus

    fun type(): Type = type

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): SandboxJobConfigurationUpdateBody {
        return SandboxJobConfigurationUpdateBody(
            completionStatus,
            type,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class SandboxJobConfigurationUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("completion_status") private val completionStatus: CompletionStatus,
        @JsonProperty("type") private val type: Type,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("completion_status")
        fun completionStatus(): CompletionStatus = completionStatus

        @JsonProperty("type") fun type(): Type = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var completionStatus: CompletionStatus? = null
            private var type: Type? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                sandboxJobConfigurationUpdateBody: SandboxJobConfigurationUpdateBody
            ) = apply {
                completionStatus = sandboxJobConfigurationUpdateBody.completionStatus
                type = sandboxJobConfigurationUpdateBody.type
                additionalProperties =
                    sandboxJobConfigurationUpdateBody.additionalProperties.toMutableMap()
            }

            fun completionStatus(completionStatus: CompletionStatus) = apply {
                this.completionStatus = completionStatus
            }

            fun type(type: Type) = apply { this.type = type }

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

            fun build(): SandboxJobConfigurationUpdateBody =
                SandboxJobConfigurationUpdateBody(
                    checkNotNull(completionStatus) {
                        "`completionStatus` is required but was not set"
                    },
                    checkNotNull(type) { "`type` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SandboxJobConfigurationUpdateBody && completionStatus == other.completionStatus && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(completionStatus, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SandboxJobConfigurationUpdateBody{completionStatus=$completionStatus, type=$type, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var completionStatus: CompletionStatus? = null
        private var type: Type? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            sandboxJobConfigurationUpdateParams: SandboxJobConfigurationUpdateParams
        ) = apply {
            completionStatus = sandboxJobConfigurationUpdateParams.completionStatus
            type = sandboxJobConfigurationUpdateParams.type
            additionalHeaders = sandboxJobConfigurationUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                sandboxJobConfigurationUpdateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                sandboxJobConfigurationUpdateParams.additionalBodyProperties.toMutableMap()
        }

        fun completionStatus(completionStatus: CompletionStatus) = apply {
            this.completionStatus = completionStatus
        }

        fun type(type: Type) = apply { this.type = type }

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

        fun build(): SandboxJobConfigurationUpdateParams =
            SandboxJobConfigurationUpdateParams(
                checkNotNull(completionStatus) { "`completionStatus` is required but was not set" },
                checkNotNull(type) { "`type` is required but was not set" },
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class CompletionStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val COMPLETE = of("complete")

            @JvmField val REAUTH_ERROR = of("reauth_error")

            @JvmField val PERMISSIONS_ERROR = of("permissions_error")

            @JvmField val ERROR = of("error")

            @JvmStatic fun of(value: String) = CompletionStatus(JsonField.of(value))
        }

        enum class Known {
            COMPLETE,
            REAUTH_ERROR,
            PERMISSIONS_ERROR,
            ERROR,
        }

        enum class Value {
            COMPLETE,
            REAUTH_ERROR,
            PERMISSIONS_ERROR,
            ERROR,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COMPLETE -> Value.COMPLETE
                REAUTH_ERROR -> Value.REAUTH_ERROR
                PERMISSIONS_ERROR -> Value.PERMISSIONS_ERROR
                ERROR -> Value.ERROR
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                COMPLETE -> Known.COMPLETE
                REAUTH_ERROR -> Known.REAUTH_ERROR
                PERMISSIONS_ERROR -> Known.PERMISSIONS_ERROR
                ERROR -> Known.ERROR
                else -> throw FinchInvalidDataException("Unknown CompletionStatus: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CompletionStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

        return /* spotless:off */ other is SandboxJobConfigurationUpdateParams && completionStatus == other.completionStatus && type == other.type && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(completionStatus, type, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "SandboxJobConfigurationUpdateParams{completionStatus=$completionStatus, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}

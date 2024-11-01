// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import com.tryfinch.api.models.*
import java.util.Objects

class SandboxJobConfigurationUpdateParams
constructor(
    private val completionStatus: CompletionStatus,
    private val type: Type,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun completionStatus(): CompletionStatus = completionStatus

    fun type(): Type = type

    @JvmSynthetic
    internal fun getBody(): SandboxJobConfigurationUpdateBody {
        return SandboxJobConfigurationUpdateBody(
            completionStatus,
            type,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = SandboxJobConfigurationUpdateBody.Builder::class)
    @NoAutoDetect
    class SandboxJobConfigurationUpdateBody
    internal constructor(
        private val completionStatus: CompletionStatus?,
        private val type: Type?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("completion_status")
        fun completionStatus(): CompletionStatus? = completionStatus

        @JsonProperty("type") fun type(): Type? = type

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
                this.completionStatus = sandboxJobConfigurationUpdateBody.completionStatus
                this.type = sandboxJobConfigurationUpdateBody.type
                additionalProperties(sandboxJobConfigurationUpdateBody.additionalProperties)
            }

            @JsonProperty("completion_status")
            fun completionStatus(completionStatus: CompletionStatus) = apply {
                this.completionStatus = completionStatus
            }

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

            return /* spotless:off */ other is SandboxJobConfigurationUpdateBody && this.completionStatus == other.completionStatus && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(completionStatus, type, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "SandboxJobConfigurationUpdateBody{completionStatus=$completionStatus, type=$type, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SandboxJobConfigurationUpdateParams && this.completionStatus == other.completionStatus && this.type == other.type && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(completionStatus, type, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "SandboxJobConfigurationUpdateParams{completionStatus=$completionStatus, type=$type, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var completionStatus: CompletionStatus? = null
        private var type: Type? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            sandboxJobConfigurationUpdateParams: SandboxJobConfigurationUpdateParams
        ) = apply {
            this.completionStatus = sandboxJobConfigurationUpdateParams.completionStatus
            this.type = sandboxJobConfigurationUpdateParams.type
            additionalQueryParams(sandboxJobConfigurationUpdateParams.additionalQueryParams)
            additionalHeaders(sandboxJobConfigurationUpdateParams.additionalHeaders)
            additionalBodyProperties(sandboxJobConfigurationUpdateParams.additionalBodyProperties)
        }

        fun completionStatus(completionStatus: CompletionStatus) = apply {
            this.completionStatus = completionStatus
        }

        fun type(type: Type) = apply { this.type = type }

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

        fun build(): SandboxJobConfigurationUpdateParams =
            SandboxJobConfigurationUpdateParams(
                checkNotNull(completionStatus) { "`completionStatus` is required but was not set" },
                checkNotNull(type) { "`type` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class CompletionStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CompletionStatus && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val COMPLETE = CompletionStatus(JsonField.of("complete"))

            @JvmField val REAUTH_ERROR = CompletionStatus(JsonField.of("reauth_error"))

            @JvmField val PERMISSIONS_ERROR = CompletionStatus(JsonField.of("permissions_error"))

            @JvmField val ERROR = CompletionStatus(JsonField.of("error"))

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
}

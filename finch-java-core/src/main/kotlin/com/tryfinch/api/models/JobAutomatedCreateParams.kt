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
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.Params
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.getOrThrow
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Enqueue an automated job.
 *
 * `data_sync_all`: Enqueue a job to re-sync all data for a connection. `data_sync_all` has a
 * concurrency limit of 1 job at a time per connection. This means that if this endpoint is called
 * while a job is already in progress for this connection, Finch will return the `job_id` of the job
 * that is currently in progress. Finch allows a fixed window rate limit of 1 forced refresh per
 * hour per connection.
 *
 * `w4_form_employee_sync`: Enqueues a job for sync W-4 data for a particular individual, identified
 * by `individual_id`. This feature is currently in beta.
 *
 * This endpoint is available for _Scale_ tier customers as an add-on. To request access to this
 * endpoint, please contact your Finch account manager.
 */
class JobAutomatedCreateParams
private constructor(
    private val body: Body?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun body(): Optional<Body> = Optional.ofNullable(body)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Optional<Body> = Optional.ofNullable(body)

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
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

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitDataSyncAll(dataSyncAll: DataSyncAll) {
                        dataSyncAll.validate()
                    }

                    override fun visitW4FormEmployeeSync(w4FormEmployeeSync: W4FormEmployeeSync) {
                        w4FormEmployeeSync.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && dataSyncAll == other.dataSyncAll && w4FormEmployeeSync == other.w4FormEmployeeSync /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(dataSyncAll, w4FormEmployeeSync) /* spotless:on */

        override fun toString(): String =
            when {
                dataSyncAll != null -> "Body{dataSyncAll=$dataSyncAll}"
                w4FormEmployeeSync != null -> "Body{w4FormEmployeeSync=$w4FormEmployeeSync}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            @JvmStatic fun ofDataSyncAll(dataSyncAll: DataSyncAll) = Body(dataSyncAll = dataSyncAll)

            @JvmStatic
            fun ofW4FormEmployeeSync(w4FormEmployeeSync: W4FormEmployeeSync) =
                Body(w4FormEmployeeSync = w4FormEmployeeSync)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitDataSyncAll(dataSyncAll: DataSyncAll): T

            fun visitW4FormEmployeeSync(w4FormEmployeeSync: W4FormEmployeeSync): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws FinchInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw FinchInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "data_sync_all" -> {
                        tryDeserialize(node, jacksonTypeRef<DataSyncAll>()) { it.validate() }
                            ?.let {
                                return Body(dataSyncAll = it, _json = json)
                            }
                    }
                    "w4_form_employee_sync" -> {
                        tryDeserialize(node, jacksonTypeRef<W4FormEmployeeSync>()) { it.validate() }
                            ?.let {
                                return Body(w4FormEmployeeSync = it, _json = json)
                            }
                    }
                }

                return Body(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.dataSyncAll != null -> generator.writeObject(value.dataSyncAll)
                    value.w4FormEmployeeSync != null ->
                        generator.writeObject(value.w4FormEmployeeSync)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        @NoAutoDetect
        class DataSyncAll
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The type of job to start. */
            fun type(): Type = type.getRequired("type")

            /** The type of job to start. */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): DataSyncAll = apply {
                if (validated) {
                    return@apply
                }

                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DataSyncAll]. */
            class Builder internal constructor() {

                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(dataSyncAll: DataSyncAll) = apply {
                    type = dataSyncAll.type
                    additionalProperties = dataSyncAll.additionalProperties.toMutableMap()
                }

                /** The type of job to start. */
                fun type(type: Type) = type(JsonField.of(type))

                /** The type of job to start. */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): DataSyncAll =
                    DataSyncAll(checkRequired("type", type), additionalProperties.toImmutable())
            }

            /** The type of job to start. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val DATA_SYNC_ALL = of("data_sync_all")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    DATA_SYNC_ALL
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DATA_SYNC_ALL,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DATA_SYNC_ALL -> Value.DATA_SYNC_ALL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws FinchInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        DATA_SYNC_ALL -> Known.DATA_SYNC_ALL
                        else -> throw FinchInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws FinchInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        FinchInvalidDataException("Value is not a String")
                    }

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

        @NoAutoDetect
        class W4FormEmployeeSync
        @JsonCreator
        private constructor(
            @JsonProperty("params")
            @ExcludeMissing
            private val params: JsonField<Params> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun params(): Params = params.getRequired("params")

            /** The type of job to start. */
            fun type(): Type = type.getRequired("type")

            @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

            /** The type of job to start. */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): W4FormEmployeeSync = apply {
                if (validated) {
                    return@apply
                }

                params().validate()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [W4FormEmployeeSync]. */
            class Builder internal constructor() {

                private var params: JsonField<Params>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(w4FormEmployeeSync: W4FormEmployeeSync) = apply {
                    params = w4FormEmployeeSync.params
                    type = w4FormEmployeeSync.type
                    additionalProperties = w4FormEmployeeSync.additionalProperties.toMutableMap()
                }

                fun params(params: Params) = params(JsonField.of(params))

                fun params(params: JsonField<Params>) = apply { this.params = params }

                /** The type of job to start. */
                fun type(type: Type) = type(JsonField.of(type))

                /** The type of job to start. */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): W4FormEmployeeSync =
                    W4FormEmployeeSync(
                        checkRequired("params", params),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Params
            @JsonCreator
            private constructor(
                @JsonProperty("individual_id")
                @ExcludeMissing
                private val individualId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The unique ID of the individual for W-4 data sync. */
                fun individualId(): String = individualId.getRequired("individual_id")

                /** The unique ID of the individual for W-4 data sync. */
                @JsonProperty("individual_id")
                @ExcludeMissing
                fun _individualId(): JsonField<String> = individualId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Params = apply {
                    if (validated) {
                        return@apply
                    }

                    individualId()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Params]. */
                class Builder internal constructor() {

                    private var individualId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(params: Params) = apply {
                        individualId = params.individualId
                        additionalProperties = params.additionalProperties.toMutableMap()
                    }

                    /** The unique ID of the individual for W-4 data sync. */
                    fun individualId(individualId: String) =
                        individualId(JsonField.of(individualId))

                    /** The unique ID of the individual for W-4 data sync. */
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

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): Params =
                        Params(
                            checkRequired("individualId", individualId),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Params && individualId == other.individualId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(individualId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Params{individualId=$individualId, additionalProperties=$additionalProperties}"
            }

            /** The type of job to start. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val W4_FORM_EMPLOYEE_SYNC = of("w4_form_employee_sync")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    W4_FORM_EMPLOYEE_SYNC
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    W4_FORM_EMPLOYEE_SYNC,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        W4_FORM_EMPLOYEE_SYNC -> Value.W4_FORM_EMPLOYEE_SYNC
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws FinchInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        W4_FORM_EMPLOYEE_SYNC -> Known.W4_FORM_EMPLOYEE_SYNC
                        else -> throw FinchInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws FinchInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        FinchInvalidDataException("Value is not a String")
                    }

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

                return /* spotless:off */ other is W4FormEmployeeSync && params == other.params && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(params, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "W4FormEmployeeSync{params=$params, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): JobAutomatedCreateParams = builder().build()

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JobAutomatedCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(jobAutomatedCreateParams: JobAutomatedCreateParams) = apply {
            body = jobAutomatedCreateParams.body
            additionalHeaders = jobAutomatedCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = jobAutomatedCreateParams.additionalQueryParams.toBuilder()
        }

        fun body(body: Body?) = apply { this.body = body }

        fun body(body: Optional<Body>) = body(body.orElse(null))

        fun body(dataSyncAll: Body.DataSyncAll) = body(Body.ofDataSyncAll(dataSyncAll))

        fun body(w4FormEmployeeSync: Body.W4FormEmployeeSync) =
            body(Body.ofW4FormEmployeeSync(w4FormEmployeeSync))

        fun w4FormEmployeeSyncBody(params: Body.W4FormEmployeeSync.Params) =
            body(
                Body.W4FormEmployeeSync.builder()
                    .type(
                        JobAutomatedCreateParams.Body.W4FormEmployeeSync.Type.W4_FORM_EMPLOYEE_SYNC
                    )
                    .params(params)
                    .build()
            )

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
            JobAutomatedCreateParams(body, additionalHeaders.build(), additionalQueryParams.build())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is JobAutomatedCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "JobAutomatedCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

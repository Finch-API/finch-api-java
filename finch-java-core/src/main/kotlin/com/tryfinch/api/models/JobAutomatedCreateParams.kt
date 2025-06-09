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
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.Params
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.getOrThrow
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
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

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): JobAutomatedCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [JobAutomatedCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JobAutomatedCreateParams]. */
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

        /** Alias for calling [Builder.body] with `body.orElse(null)`. */
        fun body(body: Optional<Body>) = body(body.getOrNull())

        /** Alias for calling [body] with `Body.ofDataSyncAll()`. */
        fun bodyDataSyncAll() = body(Body.ofDataSyncAll())

        /** Alias for calling [body] with `Body.ofW4FormEmployeeSync(w4FormEmployeeSync)`. */
        fun body(w4FormEmployeeSync: Body.W4FormEmployeeSync) =
            body(Body.ofW4FormEmployeeSync(w4FormEmployeeSync))

        /**
         * Alias for calling [body] with the following:
         * ```java
         * Body.W4FormEmployeeSync.builder()
         *     .params(params)
         *     .build()
         * ```
         */
        fun w4FormEmployeeSyncBody(params: Body.W4FormEmployeeSync.Params) =
            body(Body.W4FormEmployeeSync.builder().params(params).build())

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

        /**
         * Returns an immutable instance of [JobAutomatedCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): JobAutomatedCreateParams =
            JobAutomatedCreateParams(body, additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Optional<Body> = Optional.ofNullable(body)

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val dataSyncAll: JsonValue? = null,
        private val w4FormEmployeeSync: W4FormEmployeeSync? = null,
        private val _json: JsonValue? = null,
    ) {

        fun dataSyncAll(): Optional<JsonValue> = Optional.ofNullable(dataSyncAll)

        fun w4FormEmployeeSync(): Optional<W4FormEmployeeSync> =
            Optional.ofNullable(w4FormEmployeeSync)

        fun isDataSyncAll(): Boolean = dataSyncAll != null

        fun isW4FormEmployeeSync(): Boolean = w4FormEmployeeSync != null

        fun asDataSyncAll(): JsonValue = dataSyncAll.getOrThrow("dataSyncAll")

        fun asW4FormEmployeeSync(): W4FormEmployeeSync =
            w4FormEmployeeSync.getOrThrow("w4FormEmployeeSync")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                dataSyncAll != null -> visitor.visitDataSyncAll(dataSyncAll)
                w4FormEmployeeSync != null -> visitor.visitW4FormEmployeeSync(w4FormEmployeeSync)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitDataSyncAll(dataSyncAll: JsonValue) {
                        dataSyncAll.let {
                            if (it != JsonValue.from(mapOf("type" to "data_sync_all"))) {
                                throw FinchInvalidDataException(
                                    "'dataSyncAll' is invalid, received $it"
                                )
                            }
                        }
                    }

                    override fun visitW4FormEmployeeSync(w4FormEmployeeSync: W4FormEmployeeSync) {
                        w4FormEmployeeSync.validate()
                    }
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: FinchInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitDataSyncAll(dataSyncAll: JsonValue) =
                        dataSyncAll.let {
                            if (it == JsonValue.from(mapOf("type" to "data_sync_all"))) 1 else 0
                        }

                    override fun visitW4FormEmployeeSync(w4FormEmployeeSync: W4FormEmployeeSync) =
                        w4FormEmployeeSync.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

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

            @JvmStatic
            fun ofDataSyncAll() =
                Body(dataSyncAll = JsonValue.from(mapOf("type" to "data_sync_all")))

            @JvmStatic
            fun ofW4FormEmployeeSync(w4FormEmployeeSync: W4FormEmployeeSync) =
                Body(w4FormEmployeeSync = w4FormEmployeeSync)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitDataSyncAll(dataSyncAll: JsonValue): T

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
                        return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                            ?.let { Body(dataSyncAll = it, _json = json) }
                            ?.takeIf { it.isValid() } ?: Body(_json = json)
                    }
                    "w4_form_employee_sync" -> {
                        return tryDeserialize(node, jacksonTypeRef<W4FormEmployeeSync>())?.let {
                            Body(w4FormEmployeeSync = it, _json = json)
                        } ?: Body(_json = json)
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

        class W4FormEmployeeSync
        private constructor(
            private val params: JsonField<Params>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("params")
                @ExcludeMissing
                params: JsonField<Params> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(params, type, mutableMapOf())

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun params(): Params = params.getRequired("params")

            /**
             * The type of job to start.
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("w4_form_employee_sync")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [params].
             *
             * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [W4FormEmployeeSync].
                 *
                 * The following fields are required:
                 * ```java
                 * .params()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [W4FormEmployeeSync]. */
            class Builder internal constructor() {

                private var params: JsonField<Params>? = null
                private var type: JsonValue = JsonValue.from("w4_form_employee_sync")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(w4FormEmployeeSync: W4FormEmployeeSync) = apply {
                    params = w4FormEmployeeSync.params
                    type = w4FormEmployeeSync.type
                    additionalProperties = w4FormEmployeeSync.additionalProperties.toMutableMap()
                }

                fun params(params: Params) = params(JsonField.of(params))

                /**
                 * Sets [Builder.params] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.params] with a well-typed [Params] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun params(params: JsonField<Params>) = apply { this.params = params }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("w4_form_employee_sync")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

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

                /**
                 * Returns an immutable instance of [W4FormEmployeeSync].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .params()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): W4FormEmployeeSync =
                    W4FormEmployeeSync(
                        checkRequired("params", params),
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): W4FormEmployeeSync = apply {
                if (validated) {
                    return@apply
                }

                params().validate()
                _type().let {
                    if (it != JsonValue.from("w4_form_employee_sync")) {
                        throw FinchInvalidDataException("'type' is invalid, received $it")
                    }
                }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: FinchInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (params.asKnown().getOrNull()?.validity() ?: 0) +
                    type.let { if (it == JsonValue.from("w4_form_employee_sync")) 1 else 0 }

            class Params
            private constructor(
                private val individualId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("individual_id")
                    @ExcludeMissing
                    individualId: JsonField<String> = JsonMissing.of()
                ) : this(individualId, mutableMapOf())

                /**
                 * The unique ID of the individual for W-4 data sync.
                 *
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun individualId(): String = individualId.getRequired("individual_id")

                /**
                 * Returns the raw JSON value of [individualId].
                 *
                 * Unlike [individualId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("individual_id")
                @ExcludeMissing
                fun _individualId(): JsonField<String> = individualId

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Params].
                     *
                     * The following fields are required:
                     * ```java
                     * .individualId()
                     * ```
                     */
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

                    /**
                     * Sets [Builder.individualId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.individualId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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

                    /**
                     * Returns an immutable instance of [Params].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .individualId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Params =
                        Params(
                            checkRequired("individualId", individualId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Params = apply {
                    if (validated) {
                        return@apply
                    }

                    individualId()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: FinchInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int = (if (individualId.asKnown().isPresent) 1 else 0)

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

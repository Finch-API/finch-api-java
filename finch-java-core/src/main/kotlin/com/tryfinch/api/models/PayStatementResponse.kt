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
import com.tryfinch.api.core.allMaxBy
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.getOrThrow
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PayStatementResponse
private constructor(
    private val body: JsonField<Body>,
    private val code: JsonField<Long>,
    private val paymentId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("body") @ExcludeMissing body: JsonField<Body> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("payment_id") @ExcludeMissing paymentId: JsonField<String> = JsonMissing.of(),
    ) : this(body, code, paymentId, mutableMapOf())

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun body(): Body = body.getRequired("body")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): Long = code.getRequired("code")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentId(): String = paymentId.getRequired("payment_id")

    /**
     * Returns the raw JSON value of [body].
     *
     * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<Body> = body

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Long> = code

    /**
     * Returns the raw JSON value of [paymentId].
     *
     * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

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
         * Returns a mutable builder for constructing an instance of [PayStatementResponse].
         *
         * The following fields are required:
         * ```java
         * .body()
         * .code()
         * .paymentId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PayStatementResponse]. */
    class Builder internal constructor() {

        private var body: JsonField<Body>? = null
        private var code: JsonField<Long>? = null
        private var paymentId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payStatementResponse: PayStatementResponse) = apply {
            body = payStatementResponse.body
            code = payStatementResponse.code
            paymentId = payStatementResponse.paymentId
            additionalProperties = payStatementResponse.additionalProperties.toMutableMap()
        }

        fun body(body: Body) = body(JsonField.of(body))

        /**
         * Sets [Builder.body] to an arbitrary JSON value.
         *
         * You should usually call [Builder.body] with a well-typed [Body] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun body(body: JsonField<Body>) = apply { this.body = body }

        /** Alias for calling [body] with `Body.ofPayStatementResponse(payStatementResponse)`. */
        fun body(payStatementResponse: PayStatementResponseBody) =
            body(Body.ofPayStatementResponse(payStatementResponse))

        /** Alias for calling [body] with `Body.ofBatchError(batchError)`. */
        fun body(batchError: Body.BatchError) = body(Body.ofBatchError(batchError))

        /**
         * Alias for calling [body] with
         * `Body.ofPayStatementDataSyncInProgress(payStatementDataSyncInProgress)`.
         */
        fun body(payStatementDataSyncInProgress: PayStatementDataSyncInProgress) =
            body(Body.ofPayStatementDataSyncInProgress(payStatementDataSyncInProgress))

        fun code(code: Long) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

        /**
         * Sets [Builder.paymentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [PayStatementResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .body()
         * .code()
         * .paymentId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PayStatementResponse =
            PayStatementResponse(
                checkRequired("body", body),
                checkRequired("code", code),
                checkRequired("paymentId", paymentId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PayStatementResponse = apply {
        if (validated) {
            return@apply
        }

        body().validate()
        code()
        paymentId()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (body.asKnown().getOrNull()?.validity() ?: 0) +
            (if (code.asKnown().isPresent) 1 else 0) +
            (if (paymentId.asKnown().isPresent) 1 else 0)

    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val payStatementResponse: PayStatementResponseBody? = null,
        private val batchError: BatchError? = null,
        private val payStatementDataSyncInProgress: PayStatementDataSyncInProgress? = null,
        private val _json: JsonValue? = null,
    ) {

        fun payStatementResponse(): Optional<PayStatementResponseBody> =
            Optional.ofNullable(payStatementResponse)

        fun batchError(): Optional<BatchError> = Optional.ofNullable(batchError)

        fun payStatementDataSyncInProgress(): Optional<PayStatementDataSyncInProgress> =
            Optional.ofNullable(payStatementDataSyncInProgress)

        fun isPayStatementResponse(): Boolean = payStatementResponse != null

        fun isBatchError(): Boolean = batchError != null

        fun isPayStatementDataSyncInProgress(): Boolean = payStatementDataSyncInProgress != null

        fun asPayStatementResponse(): PayStatementResponseBody =
            payStatementResponse.getOrThrow("payStatementResponse")

        fun asBatchError(): BatchError = batchError.getOrThrow("batchError")

        fun asPayStatementDataSyncInProgress(): PayStatementDataSyncInProgress =
            payStatementDataSyncInProgress.getOrThrow("payStatementDataSyncInProgress")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                payStatementResponse != null ->
                    visitor.visitPayStatementResponse(payStatementResponse)
                batchError != null -> visitor.visitBatchError(batchError)
                payStatementDataSyncInProgress != null ->
                    visitor.visitPayStatementDataSyncInProgress(payStatementDataSyncInProgress)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPayStatementResponse(
                        payStatementResponse: PayStatementResponseBody
                    ) {
                        payStatementResponse.validate()
                    }

                    override fun visitBatchError(batchError: BatchError) {
                        batchError.validate()
                    }

                    override fun visitPayStatementDataSyncInProgress(
                        payStatementDataSyncInProgress: PayStatementDataSyncInProgress
                    ) {
                        payStatementDataSyncInProgress.validate()
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
                    override fun visitPayStatementResponse(
                        payStatementResponse: PayStatementResponseBody
                    ) = payStatementResponse.validity()

                    override fun visitBatchError(batchError: BatchError) = batchError.validity()

                    override fun visitPayStatementDataSyncInProgress(
                        payStatementDataSyncInProgress: PayStatementDataSyncInProgress
                    ) = payStatementDataSyncInProgress.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                payStatementResponse == other.payStatementResponse &&
                batchError == other.batchError &&
                payStatementDataSyncInProgress == other.payStatementDataSyncInProgress
        }

        override fun hashCode(): Int =
            Objects.hash(payStatementResponse, batchError, payStatementDataSyncInProgress)

        override fun toString(): String =
            when {
                payStatementResponse != null -> "Body{payStatementResponse=$payStatementResponse}"
                batchError != null -> "Body{batchError=$batchError}"
                payStatementDataSyncInProgress != null ->
                    "Body{payStatementDataSyncInProgress=$payStatementDataSyncInProgress}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            @JvmStatic
            fun ofPayStatementResponse(payStatementResponse: PayStatementResponseBody) =
                Body(payStatementResponse = payStatementResponse)

            @JvmStatic fun ofBatchError(batchError: BatchError) = Body(batchError = batchError)

            @JvmStatic
            fun ofPayStatementDataSyncInProgress(
                payStatementDataSyncInProgress: PayStatementDataSyncInProgress
            ) = Body(payStatementDataSyncInProgress = payStatementDataSyncInProgress)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitPayStatementResponse(payStatementResponse: PayStatementResponseBody): T

            fun visitBatchError(batchError: BatchError): T

            fun visitPayStatementDataSyncInProgress(
                payStatementDataSyncInProgress: PayStatementDataSyncInProgress
            ): T

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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PayStatementResponseBody>())?.let {
                                Body(payStatementResponse = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<BatchError>())?.let {
                                Body(batchError = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PayStatementDataSyncInProgress>())
                                ?.let { Body(payStatementDataSyncInProgress = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Body(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.payStatementResponse != null ->
                        generator.writeObject(value.payStatementResponse)
                    value.batchError != null -> generator.writeObject(value.batchError)
                    value.payStatementDataSyncInProgress != null ->
                        generator.writeObject(value.payStatementDataSyncInProgress)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        class BatchError
        private constructor(
            private val code: JsonField<Double>,
            private val message: JsonField<String>,
            private val name: JsonField<String>,
            private val finchCode: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("code") @ExcludeMissing code: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("finch_code")
                @ExcludeMissing
                finchCode: JsonField<String> = JsonMissing.of(),
            ) : this(code, message, name, finchCode, mutableMapOf())

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun code(): Double = code.getRequired("code")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun message(): String = message.getRequired("message")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun finchCode(): Optional<String> = finchCode.getOptional("finch_code")

            /**
             * Returns the raw JSON value of [code].
             *
             * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Double> = code

            /**
             * Returns the raw JSON value of [message].
             *
             * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [finchCode].
             *
             * Unlike [finchCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("finch_code")
            @ExcludeMissing
            fun _finchCode(): JsonField<String> = finchCode

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
                 * Returns a mutable builder for constructing an instance of [BatchError].
                 *
                 * The following fields are required:
                 * ```java
                 * .code()
                 * .message()
                 * .name()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [BatchError]. */
            class Builder internal constructor() {

                private var code: JsonField<Double>? = null
                private var message: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var finchCode: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(batchError: BatchError) = apply {
                    code = batchError.code
                    message = batchError.message
                    name = batchError.name
                    finchCode = batchError.finchCode
                    additionalProperties = batchError.additionalProperties.toMutableMap()
                }

                fun code(code: Double) = code(JsonField.of(code))

                /**
                 * Sets [Builder.code] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.code] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun code(code: JsonField<Double>) = apply { this.code = code }

                fun message(message: String) = message(JsonField.of(message))

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<String>) = apply { this.message = message }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun finchCode(finchCode: String) = finchCode(JsonField.of(finchCode))

                /**
                 * Sets [Builder.finchCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.finchCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun finchCode(finchCode: JsonField<String>) = apply { this.finchCode = finchCode }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAlladditional_properties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAlladditional_properties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [BatchError].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .code()
                 * .message()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BatchError =
                    BatchError(
                        checkRequired("code", code),
                        checkRequired("message", message),
                        checkRequired("name", name),
                        finchCode,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): BatchError = apply {
                if (validated) {
                    return@apply
                }

                code()
                message()
                name()
                finchCode()
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
                (if (code.asKnown().isPresent) 1 else 0) +
                    (if (message.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (finchCode.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BatchError &&
                    code == other.code &&
                    message == other.message &&
                    name == other.name &&
                    finchCode == other.finchCode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(code, message, name, finchCode, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BatchError{code=$code, message=$message, name=$name, finchCode=$finchCode, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PayStatementResponse &&
            body == other.body &&
            code == other.code &&
            paymentId == other.paymentId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(body, code, paymentId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PayStatementResponse{body=$body, code=$code, paymentId=$paymentId, additionalProperties=$additionalProperties}"
}

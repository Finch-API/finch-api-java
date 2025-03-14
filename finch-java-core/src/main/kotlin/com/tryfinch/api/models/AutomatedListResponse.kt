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
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class AutomatedListResponse
@JsonCreator
private constructor(
    @JsonProperty("data")
    @ExcludeMissing
    private val data: JsonField<List<AutomatedAsyncJob>> = JsonMissing.of(),
    @JsonProperty("meta") @ExcludeMissing private val meta: JsonField<Meta> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun data(): List<AutomatedAsyncJob> = data.getRequired("data")

    fun meta(): Meta = meta.getRequired("meta")

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<AutomatedAsyncJob>> = data

    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AutomatedListResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        meta().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AutomatedListResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .meta()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AutomatedListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<AutomatedAsyncJob>>? = null
        private var meta: JsonField<Meta>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(automatedListResponse: AutomatedListResponse) = apply {
            data = automatedListResponse.data.map { it.toMutableList() }
            meta = automatedListResponse.meta
            additionalProperties = automatedListResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<AutomatedAsyncJob>) = data(JsonField.of(data))

        fun data(data: JsonField<List<AutomatedAsyncJob>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        fun addData(data: AutomatedAsyncJob) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun meta(meta: Meta) = meta(JsonField.of(meta))

        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

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

        fun build(): AutomatedListResponse =
            AutomatedListResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("meta", meta),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Meta
    @JsonCreator
    private constructor(
        @JsonProperty("quotas")
        @ExcludeMissing
        private val quotas: JsonField<Quotas> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Information about remaining quotas for this connection. Only applicable for customers
         * opted in to use Finch's Data Sync Refresh endpoint (`POST /jobs/automated`). Please
         * contact a Finch representative for more details.
         */
        fun quotas(): Optional<Quotas> = Optional.ofNullable(quotas.getNullable("quotas"))

        /**
         * Information about remaining quotas for this connection. Only applicable for customers
         * opted in to use Finch's Data Sync Refresh endpoint (`POST /jobs/automated`). Please
         * contact a Finch representative for more details.
         */
        @JsonProperty("quotas") @ExcludeMissing fun _quotas(): JsonField<Quotas> = quotas

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            quotas().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Meta]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var quotas: JsonField<Quotas> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                quotas = meta.quotas
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            /**
             * Information about remaining quotas for this connection. Only applicable for customers
             * opted in to use Finch's Data Sync Refresh endpoint (`POST /jobs/automated`). Please
             * contact a Finch representative for more details.
             */
            fun quotas(quotas: Quotas) = quotas(JsonField.of(quotas))

            /**
             * Information about remaining quotas for this connection. Only applicable for customers
             * opted in to use Finch's Data Sync Refresh endpoint (`POST /jobs/automated`). Please
             * contact a Finch representative for more details.
             */
            fun quotas(quotas: JsonField<Quotas>) = apply { this.quotas = quotas }

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

            fun build(): Meta = Meta(quotas, additionalProperties.toImmutable())
        }

        /**
         * Information about remaining quotas for this connection. Only applicable for customers
         * opted in to use Finch's Data Sync Refresh endpoint (`POST /jobs/automated`). Please
         * contact a Finch representative for more details.
         */
        @NoAutoDetect
        class Quotas
        @JsonCreator
        private constructor(
            @JsonProperty("data_sync_all")
            @ExcludeMissing
            private val dataSyncAll: JsonField<DataSyncAll> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun dataSyncAll(): Optional<DataSyncAll> =
                Optional.ofNullable(dataSyncAll.getNullable("data_sync_all"))

            @JsonProperty("data_sync_all")
            @ExcludeMissing
            fun _dataSyncAll(): JsonField<DataSyncAll> = dataSyncAll

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Quotas = apply {
                if (validated) {
                    return@apply
                }

                dataSyncAll().ifPresent { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Quotas]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Quotas]. */
            class Builder internal constructor() {

                private var dataSyncAll: JsonField<DataSyncAll> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(quotas: Quotas) = apply {
                    dataSyncAll = quotas.dataSyncAll
                    additionalProperties = quotas.additionalProperties.toMutableMap()
                }

                fun dataSyncAll(dataSyncAll: DataSyncAll) = dataSyncAll(JsonField.of(dataSyncAll))

                fun dataSyncAll(dataSyncAll: JsonField<DataSyncAll>) = apply {
                    this.dataSyncAll = dataSyncAll
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

                fun build(): Quotas = Quotas(dataSyncAll, additionalProperties.toImmutable())
            }

            @NoAutoDetect
            class DataSyncAll
            @JsonCreator
            private constructor(
                @JsonProperty("allowed_refreshes")
                @ExcludeMissing
                private val allowedRefreshes: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("remaining_refreshes")
                @ExcludeMissing
                private val remainingRefreshes: JsonField<Long> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun allowedRefreshes(): Optional<Long> =
                    Optional.ofNullable(allowedRefreshes.getNullable("allowed_refreshes"))

                fun remainingRefreshes(): Optional<Long> =
                    Optional.ofNullable(remainingRefreshes.getNullable("remaining_refreshes"))

                @JsonProperty("allowed_refreshes")
                @ExcludeMissing
                fun _allowedRefreshes(): JsonField<Long> = allowedRefreshes

                @JsonProperty("remaining_refreshes")
                @ExcludeMissing
                fun _remainingRefreshes(): JsonField<Long> = remainingRefreshes

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): DataSyncAll = apply {
                    if (validated) {
                        return@apply
                    }

                    allowedRefreshes()
                    remainingRefreshes()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [DataSyncAll]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [DataSyncAll]. */
                class Builder internal constructor() {

                    private var allowedRefreshes: JsonField<Long> = JsonMissing.of()
                    private var remainingRefreshes: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(dataSyncAll: DataSyncAll) = apply {
                        allowedRefreshes = dataSyncAll.allowedRefreshes
                        remainingRefreshes = dataSyncAll.remainingRefreshes
                        additionalProperties = dataSyncAll.additionalProperties.toMutableMap()
                    }

                    fun allowedRefreshes(allowedRefreshes: Long) =
                        allowedRefreshes(JsonField.of(allowedRefreshes))

                    fun allowedRefreshes(allowedRefreshes: JsonField<Long>) = apply {
                        this.allowedRefreshes = allowedRefreshes
                    }

                    fun remainingRefreshes(remainingRefreshes: Long) =
                        remainingRefreshes(JsonField.of(remainingRefreshes))

                    fun remainingRefreshes(remainingRefreshes: JsonField<Long>) = apply {
                        this.remainingRefreshes = remainingRefreshes
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

                    fun build(): DataSyncAll =
                        DataSyncAll(
                            allowedRefreshes,
                            remainingRefreshes,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DataSyncAll && allowedRefreshes == other.allowedRefreshes && remainingRefreshes == other.remainingRefreshes && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(allowedRefreshes, remainingRefreshes, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "DataSyncAll{allowedRefreshes=$allowedRefreshes, remainingRefreshes=$remainingRefreshes, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Quotas && dataSyncAll == other.dataSyncAll && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(dataSyncAll, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Quotas{dataSyncAll=$dataSyncAll, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Meta && quotas == other.quotas && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(quotas, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Meta{quotas=$quotas, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AutomatedListResponse && data == other.data && meta == other.meta && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AutomatedListResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}

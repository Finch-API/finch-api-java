// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.Params
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
 * support will be added soon List all rules of a connection account.
 */
class HrisCompanyPayStatementItemRuleListParams
private constructor(
    private val entityIds: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The entity IDs to retrieve rules for. */
    fun entityIds(): Optional<List<String>> = Optional.ofNullable(entityIds)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): HrisCompanyPayStatementItemRuleListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisCompanyPayStatementItemRuleListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HrisCompanyPayStatementItemRuleListParams]. */
    class Builder internal constructor() {

        private var entityIds: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            hrisCompanyPayStatementItemRuleListParams: HrisCompanyPayStatementItemRuleListParams
        ) = apply {
            entityIds = hrisCompanyPayStatementItemRuleListParams.entityIds?.toMutableList()
            additionalHeaders =
                hrisCompanyPayStatementItemRuleListParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                hrisCompanyPayStatementItemRuleListParams.additionalQueryParams.toBuilder()
        }

        /** The entity IDs to retrieve rules for. */
        fun entityIds(entityIds: List<String>?) = apply {
            this.entityIds = entityIds?.toMutableList()
        }

        /** Alias for calling [Builder.entityIds] with `entityIds.orElse(null)`. */
        fun entityIds(entityIds: Optional<List<String>>) = entityIds(entityIds.getOrNull())

        /**
         * Adds a single [String] to [entityIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEntityId(entityId: String) = apply {
            entityIds = (entityIds ?: mutableListOf()).apply { add(entityId) }
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

        /**
         * Returns an immutable instance of [HrisCompanyPayStatementItemRuleListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): HrisCompanyPayStatementItemRuleListParams =
            HrisCompanyPayStatementItemRuleListParams(
                entityIds?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                entityIds?.forEach { put("entity_ids[]", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HrisCompanyPayStatementItemRuleListParams &&
            entityIds == other.entityIds &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(entityIds, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "HrisCompanyPayStatementItemRuleListParams{entityIds=$entityIds, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

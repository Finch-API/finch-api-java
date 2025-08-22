// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.Params
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import java.util.Objects

/** Update configurations for sandbox jobs */
class SandboxJobConfigurationUpdateParams
private constructor(
    private val sandboxJobConfiguration: SandboxJobConfiguration,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun sandboxJobConfiguration(): SandboxJobConfiguration = sandboxJobConfiguration

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        sandboxJobConfiguration._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SandboxJobConfigurationUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .sandboxJobConfiguration()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SandboxJobConfigurationUpdateParams]. */
    class Builder internal constructor() {

        private var sandboxJobConfiguration: SandboxJobConfiguration? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            sandboxJobConfigurationUpdateParams: SandboxJobConfigurationUpdateParams
        ) = apply {
            sandboxJobConfiguration = sandboxJobConfigurationUpdateParams.sandboxJobConfiguration
            additionalHeaders = sandboxJobConfigurationUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                sandboxJobConfigurationUpdateParams.additionalQueryParams.toBuilder()
        }

        fun sandboxJobConfiguration(sandboxJobConfiguration: SandboxJobConfiguration) = apply {
            this.sandboxJobConfiguration = sandboxJobConfiguration
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [SandboxJobConfigurationUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .sandboxJobConfiguration()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SandboxJobConfigurationUpdateParams =
            SandboxJobConfigurationUpdateParams(
                checkRequired("sandboxJobConfiguration", sandboxJobConfiguration),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): SandboxJobConfiguration = sandboxJobConfiguration

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SandboxJobConfigurationUpdateParams &&
            sandboxJobConfiguration == other.sandboxJobConfiguration &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(sandboxJobConfiguration, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SandboxJobConfigurationUpdateParams{sandboxJobConfiguration=$sandboxJobConfiguration, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

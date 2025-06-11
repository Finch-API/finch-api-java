// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.client.okhttp

import com.fasterxml.jackson.databind.json.JsonMapper
import com.tryfinch.api.client.FinchClient
import com.tryfinch.api.client.FinchClientImpl
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.Timeout
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import java.net.Proxy
import java.time.Clock
import java.time.Duration
import java.util.Optional
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

class FinchOkHttpClient private constructor() {

    companion object {

        /** Returns a mutable builder for constructing an instance of [FinchOkHttpClient]. */
        @JvmStatic fun builder() = Builder()

        @JvmStatic fun fromEnv(): FinchClient = builder().fromEnv().build()
    }

    /** A builder for [FinchOkHttpClient]. */
    class Builder internal constructor() {

        private var clientOptions: ClientOptions.Builder = ClientOptions.builder()
        private var timeout: Timeout = Timeout.default()
        private var proxy: Proxy? = null

        fun baseUrl(baseUrl: String) = apply { clientOptions.baseUrl(baseUrl) }

        /**
         * Whether to throw an exception if any of the Jackson versions detected at runtime are
         * incompatible with the SDK's minimum supported Jackson version (2.13.4).
         *
         * Defaults to true. Use extreme caution when disabling this option. There is no guarantee
         * that the SDK will work correctly when using an incompatible Jackson version.
         */
        fun checkJacksonVersionCompatibility(checkJacksonVersionCompatibility: Boolean) = apply {
            clientOptions.checkJacksonVersionCompatibility(checkJacksonVersionCompatibility)
        }

        fun jsonMapper(jsonMapper: JsonMapper) = apply { clientOptions.jsonMapper(jsonMapper) }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            clientOptions.streamHandlerExecutor(streamHandlerExecutor)
        }

        fun clock(clock: Clock) = apply { clientOptions.clock(clock) }

        fun headers(headers: Headers) = apply { clientOptions.headers(headers) }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            clientOptions.headers(headers)
        }

        fun putHeader(name: String, value: String) = apply { clientOptions.putHeader(name, value) }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            clientOptions.putHeaders(name, values)
        }

        fun putAllHeaders(headers: Headers) = apply { clientOptions.putAllHeaders(headers) }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            clientOptions.putAllHeaders(headers)
        }

        fun replaceHeaders(name: String, value: String) = apply {
            clientOptions.replaceHeaders(name, value)
        }

        fun replaceHeaders(name: String, values: Iterable<String>) = apply {
            clientOptions.replaceHeaders(name, values)
        }

        fun replaceAllHeaders(headers: Headers) = apply { clientOptions.replaceAllHeaders(headers) }

        fun replaceAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            clientOptions.replaceAllHeaders(headers)
        }

        fun removeHeaders(name: String) = apply { clientOptions.removeHeaders(name) }

        fun removeAllHeaders(names: Set<String>) = apply { clientOptions.removeAllHeaders(names) }

        fun queryParams(queryParams: QueryParams) = apply { clientOptions.queryParams(queryParams) }

        fun queryParams(queryParams: Map<String, Iterable<String>>) = apply {
            clientOptions.queryParams(queryParams)
        }

        fun putQueryParam(key: String, value: String) = apply {
            clientOptions.putQueryParam(key, value)
        }

        fun putQueryParams(key: String, values: Iterable<String>) = apply {
            clientOptions.putQueryParams(key, values)
        }

        fun putAllQueryParams(queryParams: QueryParams) = apply {
            clientOptions.putAllQueryParams(queryParams)
        }

        fun putAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            clientOptions.putAllQueryParams(queryParams)
        }

        fun replaceQueryParams(key: String, value: String) = apply {
            clientOptions.replaceQueryParams(key, value)
        }

        fun replaceQueryParams(key: String, values: Iterable<String>) = apply {
            clientOptions.replaceQueryParams(key, values)
        }

        fun replaceAllQueryParams(queryParams: QueryParams) = apply {
            clientOptions.replaceAllQueryParams(queryParams)
        }

        fun replaceAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            clientOptions.replaceAllQueryParams(queryParams)
        }

        fun removeQueryParams(key: String) = apply { clientOptions.removeQueryParams(key) }

        fun removeAllQueryParams(keys: Set<String>) = apply {
            clientOptions.removeAllQueryParams(keys)
        }

        fun timeout(timeout: Timeout) = apply {
            clientOptions.timeout(timeout)
            this.timeout = timeout
        }

        /**
         * Sets the maximum time allowed for a complete HTTP call, not including retries.
         *
         * See [Timeout.request] for more details.
         *
         * For fine-grained control, pass a [Timeout] object.
         */
        fun timeout(timeout: Duration) = timeout(Timeout.builder().request(timeout).build())

        fun maxRetries(maxRetries: Int) = apply { clientOptions.maxRetries(maxRetries) }

        fun proxy(proxy: Proxy) = apply { this.proxy = proxy }

        fun responseValidation(responseValidation: Boolean) = apply {
            clientOptions.responseValidation(responseValidation)
        }

        fun accessToken(accessToken: String?) = apply { clientOptions.accessToken(accessToken) }

        /** Alias for calling [Builder.accessToken] with `accessToken.orElse(null)`. */
        fun accessToken(accessToken: Optional<String>) = accessToken(accessToken.getOrNull())

        fun clientId(clientId: String?) = apply { clientOptions.clientId(clientId) }

        /** Alias for calling [Builder.clientId] with `clientId.orElse(null)`. */
        fun clientId(clientId: Optional<String>) = clientId(clientId.getOrNull())

        fun clientSecret(clientSecret: String?) = apply { clientOptions.clientSecret(clientSecret) }

        /** Alias for calling [Builder.clientSecret] with `clientSecret.orElse(null)`. */
        fun clientSecret(clientSecret: Optional<String>) = clientSecret(clientSecret.getOrNull())

        fun webhookSecret(webhookSecret: String?) = apply {
            clientOptions.webhookSecret(webhookSecret)
        }

        /** Alias for calling [Builder.webhookSecret] with `webhookSecret.orElse(null)`. */
        fun webhookSecret(webhookSecret: Optional<String>) =
            webhookSecret(webhookSecret.getOrNull())

        fun fromEnv() = apply { clientOptions.fromEnv() }

        /**
         * Returns an immutable instance of [FinchClient].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FinchClient =
            FinchClientImpl(
                clientOptions
                    .httpClient(OkHttpClient.builder().timeout(timeout).proxy(proxy).build())
                    .build()
            )
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.core

import com.fasterxml.jackson.databind.json.JsonMapper
import com.tryfinch.api.core.http.AsyncStreamResponse
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.HttpClient
import com.tryfinch.api.core.http.PhantomReachableClosingHttpClient
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.http.RetryingHttpClient
import java.time.Clock
import java.time.Duration
import java.util.Base64
import java.util.Optional
import java.util.concurrent.Executor
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.ThreadFactory
import java.util.concurrent.atomic.AtomicLong
import kotlin.jvm.optionals.getOrNull

/** A class representing the SDK client configuration. */
class ClientOptions
private constructor(
    private val originalHttpClient: HttpClient,
    /**
     * The HTTP client to use in the SDK.
     *
     * Use the one published in `finch-java-client-okhttp` or implement your own.
     *
     * This class takes ownership of the client and closes it when closed.
     */
    @get:JvmName("httpClient") val httpClient: HttpClient,
    /**
     * Whether to throw an exception if any of the Jackson versions detected at runtime are
     * incompatible with the SDK's minimum supported Jackson version (2.13.4).
     *
     * Defaults to true. Use extreme caution when disabling this option. There is no guarantee that
     * the SDK will work correctly when using an incompatible Jackson version.
     */
    @get:JvmName("checkJacksonVersionCompatibility") val checkJacksonVersionCompatibility: Boolean,
    /**
     * The Jackson JSON mapper to use for serializing and deserializing JSON.
     *
     * Defaults to [com.tryfinch.api.core.jsonMapper]. The default is usually sufficient and rarely
     * needs to be overridden.
     */
    @get:JvmName("jsonMapper") val jsonMapper: JsonMapper,
    /**
     * The executor to use for running [AsyncStreamResponse.Handler] callbacks.
     *
     * Defaults to a dedicated cached thread pool.
     *
     * This class takes ownership of the executor and shuts it down, if possible, when closed.
     */
    @get:JvmName("streamHandlerExecutor") val streamHandlerExecutor: Executor,
    /**
     * The clock to use for operations that require timing, like retries.
     *
     * This is primarily useful for using a fake clock in tests.
     *
     * Defaults to [Clock.systemUTC].
     */
    @get:JvmName("clock") val clock: Clock,
    private val baseUrl: String?,
    /** Headers to send with the request. */
    @get:JvmName("headers") val headers: Headers,
    /** Query params to send with the request. */
    @get:JvmName("queryParams") val queryParams: QueryParams,
    /**
     * Whether to call `validate` on every response before returning it.
     *
     * Defaults to false, which means the shape of the response will not be validated upfront.
     * Instead, validation will only occur for the parts of the response that are accessed.
     */
    @get:JvmName("responseValidation") val responseValidation: Boolean,
    /**
     * Sets the maximum time allowed for various parts of an HTTP call's lifecycle, excluding
     * retries.
     *
     * Defaults to [Timeout.default].
     */
    @get:JvmName("timeout") val timeout: Timeout,
    /**
     * The maximum number of times to retry failed requests, with a short exponential backoff
     * between requests.
     *
     * Only the following error types are retried:
     * - Connection errors (for example, due to a network connectivity problem)
     * - 408 Request Timeout
     * - 409 Conflict
     * - 429 Rate Limit
     * - 5xx Internal
     *
     * The API may also explicitly instruct the SDK to retry or not retry a request.
     *
     * Defaults to 2.
     */
    @get:JvmName("maxRetries") val maxRetries: Int,
    private val accessToken: String?,
    private val clientId: String?,
    private val clientSecret: String?,
    private val webhookSecret: String?,
) {

    init {
        if (checkJacksonVersionCompatibility) {
            checkJacksonVersionCompatibility()
        }
    }

    /**
     * The base URL to use for every request.
     *
     * Defaults to the production environment: `https://api.tryfinch.com`.
     */
    fun baseUrl(): String = baseUrl ?: PRODUCTION_URL

    fun accessToken(): Optional<String> = Optional.ofNullable(accessToken)

    fun clientId(): Optional<String> = Optional.ofNullable(clientId)

    fun clientSecret(): Optional<String> = Optional.ofNullable(clientSecret)

    fun webhookSecret(): Optional<String> = Optional.ofNullable(webhookSecret)

    fun toBuilder() = Builder().from(this)

    companion object {

        const val PRODUCTION_URL = "https://api.tryfinch.com"

        /**
         * Returns a mutable builder for constructing an instance of [ClientOptions].
         *
         * The following fields are required:
         * ```java
         * .httpClient()
         * ```
         */
        @JvmStatic fun builder() = Builder()

        /**
         * Returns options configured using system properties and environment variables.
         *
         * @see Builder.fromEnv
         */
        @JvmStatic fun fromEnv(): ClientOptions = builder().fromEnv().build()
    }

    /** A builder for [ClientOptions]. */
    class Builder internal constructor() {

        private var httpClient: HttpClient? = null
        private var checkJacksonVersionCompatibility: Boolean = true
        private var jsonMapper: JsonMapper = jsonMapper()
        private var streamHandlerExecutor: Executor? = null
        private var clock: Clock = Clock.systemUTC()
        private var baseUrl: String? = null
        private var headers: Headers.Builder = Headers.builder()
        private var queryParams: QueryParams.Builder = QueryParams.builder()
        private var responseValidation: Boolean = false
        private var timeout: Timeout = Timeout.default()
        private var maxRetries: Int = 2
        private var accessToken: String? = null
        private var clientId: String? = null
        private var clientSecret: String? = null
        private var webhookSecret: String? = null

        @JvmSynthetic
        internal fun from(clientOptions: ClientOptions) = apply {
            httpClient = clientOptions.originalHttpClient
            checkJacksonVersionCompatibility = clientOptions.checkJacksonVersionCompatibility
            jsonMapper = clientOptions.jsonMapper
            streamHandlerExecutor = clientOptions.streamHandlerExecutor
            clock = clientOptions.clock
            baseUrl = clientOptions.baseUrl
            headers = clientOptions.headers.toBuilder()
            queryParams = clientOptions.queryParams.toBuilder()
            responseValidation = clientOptions.responseValidation
            timeout = clientOptions.timeout
            maxRetries = clientOptions.maxRetries
            accessToken = clientOptions.accessToken
            clientId = clientOptions.clientId
            clientSecret = clientOptions.clientSecret
            webhookSecret = clientOptions.webhookSecret
        }

        /**
         * The HTTP client to use in the SDK.
         *
         * Use the one published in `finch-java-client-okhttp` or implement your own.
         *
         * This class takes ownership of the client and closes it when closed.
         */
        fun httpClient(httpClient: HttpClient) = apply {
            this.httpClient = PhantomReachableClosingHttpClient(httpClient)
        }

        /**
         * Whether to throw an exception if any of the Jackson versions detected at runtime are
         * incompatible with the SDK's minimum supported Jackson version (2.13.4).
         *
         * Defaults to true. Use extreme caution when disabling this option. There is no guarantee
         * that the SDK will work correctly when using an incompatible Jackson version.
         */
        fun checkJacksonVersionCompatibility(checkJacksonVersionCompatibility: Boolean) = apply {
            this.checkJacksonVersionCompatibility = checkJacksonVersionCompatibility
        }

        /**
         * The Jackson JSON mapper to use for serializing and deserializing JSON.
         *
         * Defaults to [com.tryfinch.api.core.jsonMapper]. The default is usually sufficient and
         * rarely needs to be overridden.
         */
        fun jsonMapper(jsonMapper: JsonMapper) = apply { this.jsonMapper = jsonMapper }

        /**
         * The executor to use for running [AsyncStreamResponse.Handler] callbacks.
         *
         * Defaults to a dedicated cached thread pool.
         *
         * This class takes ownership of the executor and shuts it down, if possible, when closed.
         */
        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor =
                if (streamHandlerExecutor is ExecutorService)
                    PhantomReachableExecutorService(streamHandlerExecutor)
                else streamHandlerExecutor
        }

        /**
         * The clock to use for operations that require timing, like retries.
         *
         * This is primarily useful for using a fake clock in tests.
         *
         * Defaults to [Clock.systemUTC].
         */
        fun clock(clock: Clock) = apply { this.clock = clock }

        /**
         * The base URL to use for every request.
         *
         * Defaults to the production environment: `https://api.tryfinch.com`.
         */
        fun baseUrl(baseUrl: String?) = apply { this.baseUrl = baseUrl }

        /** Alias for calling [Builder.baseUrl] with `baseUrl.orElse(null)`. */
        fun baseUrl(baseUrl: Optional<String>) = baseUrl(baseUrl.getOrNull())

        /**
         * Whether to call `validate` on every response before returning it.
         *
         * Defaults to false, which means the shape of the response will not be validated upfront.
         * Instead, validation will only occur for the parts of the response that are accessed.
         */
        fun responseValidation(responseValidation: Boolean) = apply {
            this.responseValidation = responseValidation
        }

        /**
         * Sets the maximum time allowed for various parts of an HTTP call's lifecycle, excluding
         * retries.
         *
         * Defaults to [Timeout.default].
         */
        fun timeout(timeout: Timeout) = apply { this.timeout = timeout }

        /**
         * Sets the maximum time allowed for a complete HTTP call, not including retries.
         *
         * See [Timeout.request] for more details.
         *
         * For fine-grained control, pass a [Timeout] object.
         */
        fun timeout(timeout: Duration) = timeout(Timeout.builder().request(timeout).build())

        /**
         * The maximum number of times to retry failed requests, with a short exponential backoff
         * between requests.
         *
         * Only the following error types are retried:
         * - Connection errors (for example, due to a network connectivity problem)
         * - 408 Request Timeout
         * - 409 Conflict
         * - 429 Rate Limit
         * - 5xx Internal
         *
         * The API may also explicitly instruct the SDK to retry or not retry a request.
         *
         * Defaults to 2.
         */
        fun maxRetries(maxRetries: Int) = apply { this.maxRetries = maxRetries }

        fun accessToken(accessToken: String?) = apply { this.accessToken = accessToken }

        /** Alias for calling [Builder.accessToken] with `accessToken.orElse(null)`. */
        fun accessToken(accessToken: Optional<String>) = accessToken(accessToken.getOrNull())

        fun clientId(clientId: String?) = apply { this.clientId = clientId }

        /** Alias for calling [Builder.clientId] with `clientId.orElse(null)`. */
        fun clientId(clientId: Optional<String>) = clientId(clientId.getOrNull())

        fun clientSecret(clientSecret: String?) = apply { this.clientSecret = clientSecret }

        /** Alias for calling [Builder.clientSecret] with `clientSecret.orElse(null)`. */
        fun clientSecret(clientSecret: Optional<String>) = clientSecret(clientSecret.getOrNull())

        fun webhookSecret(webhookSecret: String?) = apply { this.webhookSecret = webhookSecret }

        /** Alias for calling [Builder.webhookSecret] with `webhookSecret.orElse(null)`. */
        fun webhookSecret(webhookSecret: Optional<String>) =
            webhookSecret(webhookSecret.getOrNull())

        fun headers(headers: Headers) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun putHeader(name: String, value: String) = apply { headers.put(name, value) }

        fun putHeaders(name: String, values: Iterable<String>) = apply { headers.put(name, values) }

        fun putAllHeaders(headers: Headers) = apply { this.headers.putAll(headers) }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            this.headers.putAll(headers)
        }

        fun replaceHeaders(name: String, value: String) = apply { headers.replace(name, value) }

        fun replaceHeaders(name: String, values: Iterable<String>) = apply {
            headers.replace(name, values)
        }

        fun replaceAllHeaders(headers: Headers) = apply { this.headers.replaceAll(headers) }

        fun replaceAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            this.headers.replaceAll(headers)
        }

        fun removeHeaders(name: String) = apply { headers.remove(name) }

        fun removeAllHeaders(names: Set<String>) = apply { headers.removeAll(names) }

        fun queryParams(queryParams: QueryParams) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun queryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun putQueryParam(key: String, value: String) = apply { queryParams.put(key, value) }

        fun putQueryParams(key: String, values: Iterable<String>) = apply {
            queryParams.put(key, values)
        }

        fun putAllQueryParams(queryParams: QueryParams) = apply {
            this.queryParams.putAll(queryParams)
        }

        fun putAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.putAll(queryParams)
        }

        fun replaceQueryParams(key: String, value: String) = apply {
            queryParams.replace(key, value)
        }

        fun replaceQueryParams(key: String, values: Iterable<String>) = apply {
            queryParams.replace(key, values)
        }

        fun replaceAllQueryParams(queryParams: QueryParams) = apply {
            this.queryParams.replaceAll(queryParams)
        }

        fun replaceAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.replaceAll(queryParams)
        }

        fun removeQueryParams(key: String) = apply { queryParams.remove(key) }

        fun removeAllQueryParams(keys: Set<String>) = apply { queryParams.removeAll(keys) }

        fun timeout(): Timeout = timeout

        /**
         * Updates configuration using system properties and environment variables.
         *
         * See this table for the available options:
         *
         * |Setter         |System property      |Environment variable  |Required|Default value               |
         * |---------------|---------------------|----------------------|--------|----------------------------|
         * |`clientId`     |`finch.clientId`     |`FINCH_CLIENT_ID`     |false   |-                           |
         * |`clientSecret` |`finch.clientSecret` |`FINCH_CLIENT_SECRET` |false   |-                           |
         * |`webhookSecret`|`finch.webhookSecret`|`FINCH_WEBHOOK_SECRET`|false   |-                           |
         * |`baseUrl`      |`finch.baseUrl`      |`FINCH_BASE_URL`      |true    |`"https://api.tryfinch.com"`|
         *
         * System properties take precedence over environment variables.
         */
        fun fromEnv() = apply {
            (System.getProperty("finch.baseUrl") ?: System.getenv("FINCH_BASE_URL"))?.let {
                baseUrl(it)
            }
            (System.getProperty("finch.clientId") ?: System.getenv("FINCH_CLIENT_ID"))?.let {
                clientId(it)
            }
            (System.getProperty("finch.clientSecret") ?: System.getenv("FINCH_CLIENT_SECRET"))
                ?.let { clientSecret(it) }
            (System.getProperty("finch.webhookSecret") ?: System.getenv("FINCH_WEBHOOK_SECRET"))
                ?.let { webhookSecret(it) }
        }

        /**
         * Returns an immutable instance of [ClientOptions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .httpClient()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClientOptions {
            val httpClient = checkRequired("httpClient", httpClient)

            val headers = Headers.builder()
            val queryParams = QueryParams.builder()
            headers.put("X-Stainless-Lang", "java")
            headers.put("X-Stainless-Arch", getOsArch())
            headers.put("X-Stainless-OS", getOsName())
            headers.put("X-Stainless-OS-Version", getOsVersion())
            headers.put("X-Stainless-Package-Version", getPackageVersion())
            headers.put("X-Stainless-Runtime", "JRE")
            headers.put("X-Stainless-Runtime-Version", getJavaVersion())
            headers.put("Finch-API-Version", "2020-09-17")
            clientId?.let { username ->
                clientSecret?.let { password ->
                    if (!username.isEmpty() && !password.isEmpty()) {
                        headers.put(
                            "Authorization",
                            "Basic ${Base64.getEncoder().encodeToString("$username:$password".toByteArray())}",
                        )
                    }
                }
            }
            accessToken?.let {
                if (!it.isEmpty()) {
                    headers.put("Authorization", "Bearer $it")
                }
            }
            headers.replaceAll(this.headers.build())
            queryParams.replaceAll(this.queryParams.build())

            return ClientOptions(
                httpClient,
                RetryingHttpClient.builder()
                    .httpClient(httpClient)
                    .clock(clock)
                    .maxRetries(maxRetries)
                    .build(),
                checkJacksonVersionCompatibility,
                jsonMapper,
                streamHandlerExecutor
                    ?: Executors.newCachedThreadPool(
                        object : ThreadFactory {

                            private val threadFactory: ThreadFactory =
                                Executors.defaultThreadFactory()
                            private val count = AtomicLong(0)

                            override fun newThread(runnable: Runnable): Thread =
                                threadFactory.newThread(runnable).also {
                                    it.name =
                                        "finch-stream-handler-thread-${count.getAndIncrement()}"
                                }
                        }
                    ),
                clock,
                baseUrl,
                headers.build(),
                queryParams.build(),
                responseValidation,
                timeout,
                maxRetries,
                accessToken,
                clientId,
                clientSecret,
                webhookSecret,
            )
        }
    }

    /**
     * Closes these client options, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client options are
     * long-lived and usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default client automatically
     * releases threads and connections if they remain idle, but if you are writing an application
     * that needs to aggressively release unused resources, then you may call this method.
     */
    fun close() {
        httpClient.close()
        (streamHandlerExecutor as? ExecutorService)?.shutdown()
    }
}

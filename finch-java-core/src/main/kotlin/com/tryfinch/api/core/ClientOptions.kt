// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.core

import com.fasterxml.jackson.databind.json.JsonMapper
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.tryfinch.api.core.http.HttpClient
import com.tryfinch.api.core.http.PhantomReachableClosingHttpClient
import com.tryfinch.api.core.http.RetryingHttpClient
import java.time.Clock
import java.util.Base64

class ClientOptions
private constructor(
    private val originalHttpClient: HttpClient,
    @get:JvmName("httpClient") val httpClient: HttpClient,
    @get:JvmName("jsonMapper") val jsonMapper: JsonMapper,
    @get:JvmName("clock") val clock: Clock,
    @get:JvmName("baseUrl") val baseUrl: String,
    @get:JvmName("headers") val headers: ListMultimap<String, String>,
    @get:JvmName("queryParams") val queryParams: ListMultimap<String, String>,
    @get:JvmName("responseValidation") val responseValidation: Boolean,
    @get:JvmName("maxRetries") val maxRetries: Int,
    @get:JvmName("accessToken") val accessToken: String?,
    @get:JvmName("clientId") val clientId: String?,
    @get:JvmName("clientSecret") val clientSecret: String?,
    @get:JvmName("webhookSecret") val webhookSecret: String?,
) {

    fun toBuilder() = Builder().from(this)

    companion object {

        const val PRODUCTION_URL = "https://api.tryfinch.com"

        @JvmStatic fun builder() = Builder()

        @JvmStatic fun fromEnv(): ClientOptions = builder().fromEnv().build()
    }

    class Builder {

        private var httpClient: HttpClient? = null
        private var jsonMapper: JsonMapper = jsonMapper()
        private var clock: Clock = Clock.systemUTC()
        private var baseUrl: String = PRODUCTION_URL
        private var headers: ListMultimap<String, String> = ArrayListMultimap.create()
        private var queryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var responseValidation: Boolean = false
        private var maxRetries: Int = 2
        private var accessToken: String? = null
        private var clientId: String? = null
        private var clientSecret: String? = null
        private var webhookSecret: String? = null

        @JvmSynthetic
        internal fun from(clientOptions: ClientOptions) = apply {
            httpClient = clientOptions.originalHttpClient
            jsonMapper = clientOptions.jsonMapper
            clock = clientOptions.clock
            baseUrl = clientOptions.baseUrl
            headers = ArrayListMultimap.create(clientOptions.headers)
            queryParams = ArrayListMultimap.create(clientOptions.queryParams)
            responseValidation = clientOptions.responseValidation
            maxRetries = clientOptions.maxRetries
            accessToken = clientOptions.accessToken
            clientId = clientOptions.clientId
            clientSecret = clientOptions.clientSecret
            webhookSecret = clientOptions.webhookSecret
        }

        fun httpClient(httpClient: HttpClient) = apply { this.httpClient = httpClient }

        fun jsonMapper(jsonMapper: JsonMapper) = apply { this.jsonMapper = jsonMapper }

        fun clock(clock: Clock) = apply { this.clock = clock }

        fun baseUrl(baseUrl: String) = apply { this.baseUrl = baseUrl }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun putHeader(name: String, value: String) = apply { headers.put(name, value) }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            headers.putAll(name, values)
        }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            headers.forEach(::putHeaders)
        }

        fun removeHeader(name: String) = apply { headers.removeAll(name) }

        fun queryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun putQueryParam(name: String, value: String) = apply { queryParams.put(name, value) }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            queryParams.putAll(name, values)
        }

        fun putAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            queryParams.forEach(::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply { queryParams.removeAll(name) }

        fun responseValidation(responseValidation: Boolean) = apply {
            this.responseValidation = responseValidation
        }

        fun maxRetries(maxRetries: Int) = apply { this.maxRetries = maxRetries }

        fun accessToken(accessToken: String?) = apply { this.accessToken = accessToken }

        fun clientId(clientId: String?) = apply { this.clientId = clientId }

        fun clientSecret(clientSecret: String?) = apply { this.clientSecret = clientSecret }

        fun webhookSecret(webhookSecret: String?) = apply { this.webhookSecret = webhookSecret }

        fun fromEnv() = apply {
            System.getenv("FINCH_CLIENT_ID")?.let { clientId(it) }
            System.getenv("FINCH_CLIENT_SECRET")?.let { clientSecret(it) }
            System.getenv("FINCH_WEBHOOK_SECRET")?.let { webhookSecret(it) }
        }

        fun build(): ClientOptions {
            checkNotNull(httpClient) { "`httpClient` is required but was not set" }

            val headers = ArrayListMultimap.create<String, String>()
            val queryParams = ArrayListMultimap.create<String, String>()
            headers.put("X-Stainless-Lang", "java")
            headers.put("X-Stainless-Arch", getOsArch())
            headers.put("X-Stainless-OS", getOsName())
            headers.put("X-Stainless-OS-Version", getOsVersion())
            headers.put("X-Stainless-Package-Version", getPackageVersion())
            headers.put("X-Stainless-Runtime-Version", getJavaVersion())
            headers.put("Finch-API-Version", "2020-09-17")
            if (!accessToken.isNullOrEmpty()) {
                headers.put("Authorization", "Bearer ${accessToken}")
            }
            if (!clientId.isNullOrEmpty() && !clientSecret.isNullOrEmpty()) {
                headers.put(
                    "Authorization",
                    "Basic ${Base64.getEncoder().encodeToString("${clientId}:${clientSecret}".toByteArray())}"
                )
            }
            this.headers.asMap().forEach(headers::replaceValues)
            this.queryParams.asMap().forEach(queryParams::replaceValues)

            return ClientOptions(
                httpClient!!,
                PhantomReachableClosingHttpClient(
                    RetryingHttpClient.builder()
                        .httpClient(httpClient!!)
                        .clock(clock)
                        .maxRetries(maxRetries)
                        .build()
                ),
                jsonMapper,
                clock,
                baseUrl,
                headers.toImmutable(),
                queryParams.toImmutable(),
                responseValidation,
                maxRetries,
                accessToken,
                clientId,
                clientSecret,
                webhookSecret,
            )
        }
    }
}

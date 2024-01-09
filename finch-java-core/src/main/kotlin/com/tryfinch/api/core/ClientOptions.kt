// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.core

import com.fasterxml.jackson.databind.json.JsonMapper
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.tryfinch.api.core.http.HttpClient
import com.tryfinch.api.core.http.RetryingHttpClient
import java.time.Clock
import java.util.Base64

class ClientOptions
private constructor(
    @get:JvmName("httpClient") val httpClient: HttpClient,
    @get:JvmName("jsonMapper") val jsonMapper: JsonMapper,
    @get:JvmName("clock") val clock: Clock,
    @get:JvmName("baseUrl") val baseUrl: String,
    @get:JvmName("accessToken") val accessToken: String?,
    @get:JvmName("clientId") val clientId: String?,
    @get:JvmName("clientSecret") val clientSecret: String?,
    @get:JvmName("sandboxClientId") val sandboxClientId: String?,
    @get:JvmName("sandboxClientSecret") val sandboxClientSecret: String?,
    @get:JvmName("webhookSecret") val webhookSecret: String?,
    @get:JvmName("headers") val headers: ListMultimap<String, String>,
    @get:JvmName("responseValidation") val responseValidation: Boolean,
) {

    companion object {

        const val PRODUCTION_URL = "https://api.tryfinch.com"

        @JvmStatic fun builder() = Builder()

        @JvmStatic fun fromEnv(): ClientOptions = builder().fromEnv().build()
    }

    class Builder {

        private var httpClient: HttpClient? = null
        private var jsonMapper: JsonMapper? = null
        private var clock: Clock = Clock.systemUTC()
        private var baseUrl: String = PRODUCTION_URL
        private var headers: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var responseValidation: Boolean = false
        private var maxRetries: Int = 2
        private var accessToken: String? = null
        private var clientId: String? = null
        private var clientSecret: String? = null
        private var sandboxClientId: String? = null
        private var sandboxClientSecret: String? = null
        private var webhookSecret: String? = null

        fun httpClient(httpClient: HttpClient) = apply { this.httpClient = httpClient }

        fun jsonMapper(jsonMapper: JsonMapper) = apply { this.jsonMapper = jsonMapper }

        fun baseUrl(baseUrl: String) = apply { this.baseUrl = baseUrl }

        fun clock(clock: Clock) = apply { this.clock = clock }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun putHeader(name: String, value: String) = apply {
            this.headers.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.headers.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            headers.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.headers.put(name, mutableListOf()) }

        fun responseValidation(responseValidation: Boolean) = apply {
            this.responseValidation = responseValidation
        }

        fun maxRetries(maxRetries: Int) = apply { this.maxRetries = maxRetries }

        fun accessToken(accessToken: String?) = apply { this.accessToken = accessToken }

        fun clientId(clientId: String?) = apply { this.clientId = clientId }

        fun clientSecret(clientSecret: String?) = apply { this.clientSecret = clientSecret }

        fun sandboxClientId(sandboxClientId: String?) = apply {
            this.sandboxClientId = sandboxClientId
        }

        fun sandboxClientSecret(sandboxClientSecret: String?) = apply {
            this.sandboxClientSecret = sandboxClientSecret
        }

        fun webhookSecret(webhookSecret: String?) = apply { this.webhookSecret = webhookSecret }

        fun fromEnv() = apply {
            System.getenv("FINCH_CLIENT_ID")?.let { clientId(it) }
            System.getenv("FINCH_CLIENT_SECRET")?.let { clientSecret(it) }
            System.getenv("FINCH_SANDBOX_CLIENT_ID")?.let { sandboxClientId(it) }
            System.getenv("FINCH_SANDBOX_CLIENT_SECRET")?.let { sandboxClientSecret(it) }
            System.getenv("FINCH_WEBHOOK_SECRET")?.let { webhookSecret(it) }
        }

        fun build(): ClientOptions {
            checkNotNull(httpClient) { "`httpClient` is required but was not set" }

            val headers = ArrayListMultimap.create<String, String>()
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
            if (!sandboxClientId.isNullOrEmpty() && !sandboxClientSecret.isNullOrEmpty()) {
                headers.put(
                    "Authorization",
                    "Basic ${Base64.getEncoder().encodeToString("${sandboxClientId}:${sandboxClientSecret}".toByteArray())}"
                )
            }
            this.headers.forEach(headers::replaceValues)

            return ClientOptions(
                RetryingHttpClient.builder()
                    .httpClient(httpClient!!)
                    .clock(clock)
                    .maxRetries(maxRetries)
                    .build(),
                jsonMapper ?: jsonMapper(),
                clock,
                baseUrl,
                accessToken,
                clientId,
                clientSecret,
                sandboxClientId,
                sandboxClientSecret,
                webhookSecret,
                headers.toUnmodifiable(),
                responseValidation,
            )
        }
    }
}

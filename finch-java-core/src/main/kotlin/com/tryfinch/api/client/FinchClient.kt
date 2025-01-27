// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.client

import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.services.blocking.AccessTokenService
import com.tryfinch.api.services.blocking.AccountService
import com.tryfinch.api.services.blocking.ConnectService
import com.tryfinch.api.services.blocking.HrisService
import com.tryfinch.api.services.blocking.JobService
import com.tryfinch.api.services.blocking.PayrollService
import com.tryfinch.api.services.blocking.ProviderService
import com.tryfinch.api.services.blocking.RequestForwardingService
import com.tryfinch.api.services.blocking.SandboxService
import com.tryfinch.api.services.blocking.WebhookService

interface FinchClient {

    fun async(): FinchClientAsync

    fun accessTokens(): AccessTokenService

    fun hris(): HrisService

    fun providers(): ProviderService

    fun account(): AccountService

    fun webhooks(): WebhookService

    fun requestForwarding(): RequestForwardingService

    fun jobs(): JobService

    fun sandbox(): SandboxService

    fun payroll(): PayrollService

    fun connect(): ConnectService

    /** @deprecated use client.accessTokens().create instead */
    @Deprecated("use client.accessTokens().create instead", ReplaceWith("accessTokens().create()"))
    fun getAccessToken(
        clientId: String,
        clientSecret: String,
        code: String,
        redirectUri: String?
    ): String

    fun getAuthUrl(products: String, redirectUri: String, sandbox: Boolean): String

    fun withAccessToken(accessToken: String): FinchClient

    private data class GetAccessTokenParams(
        @JsonProperty("client_id") val clientId: String,
        @JsonProperty("client_secret") val clientSecret: String,
        @JsonProperty("code") val code: String,
        @JsonProperty("redirect_uri") val redirectUri: String?,
    )

    private data class GetAccessTokenResponse(
        @JsonProperty("access_token") val accessToken: String,
        @JsonProperty("account_id") val accountId: String,
        @JsonProperty("client_type") val clientType: String,
        @JsonProperty("company_id") val companyId: String,
        @JsonProperty("connection_type") val connectionType: String,
        @JsonProperty("products") val products: List<String>,
        @JsonProperty("provider_id") val providerId: String,
    )

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()
}

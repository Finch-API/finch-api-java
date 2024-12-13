// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.client

import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.services.async.AccessTokenServiceAsync
import com.tryfinch.api.services.async.AccountServiceAsync
import com.tryfinch.api.services.async.ConnectServiceAsync
import com.tryfinch.api.services.async.HrisServiceAsync
import com.tryfinch.api.services.async.JobServiceAsync
import com.tryfinch.api.services.async.PayrollServiceAsync
import com.tryfinch.api.services.async.ProviderServiceAsync
import com.tryfinch.api.services.async.RequestForwardingServiceAsync
import com.tryfinch.api.services.async.SandboxServiceAsync
import com.tryfinch.api.services.async.WebhookServiceAsync
import java.util.concurrent.CompletableFuture

interface FinchClientAsync {

    fun sync(): FinchClient

    fun accessTokens(): AccessTokenServiceAsync

    fun hris(): HrisServiceAsync

    fun providers(): ProviderServiceAsync

    fun account(): AccountServiceAsync

    fun webhooks(): WebhookServiceAsync

    fun requestForwarding(): RequestForwardingServiceAsync

    fun jobs(): JobServiceAsync

    fun sandbox(): SandboxServiceAsync

    fun payroll(): PayrollServiceAsync

    fun connect(): ConnectServiceAsync

    /** @deprecated use client.accessTokens().create instead */
    @Deprecated("use client.accessTokens().create instead", ReplaceWith("accessTokens().create()"))
    fun getAccessToken(
        clientId: String,
        clientSecret: String,
        code: String,
        redirectUri: String?
    ): CompletableFuture<String>

    fun getAuthUrl(products: String, redirectUri: String, sandbox: Boolean): String

    fun withAccessToken(accessToken: String): FinchClientAsync

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
}

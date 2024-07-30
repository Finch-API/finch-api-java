// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.client

import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.models.*
import com.tryfinch.api.services.blocking.*

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
}

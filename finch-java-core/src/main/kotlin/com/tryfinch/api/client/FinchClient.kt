@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.client

import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.*
import com.tryfinch.api.services.blocking.*

interface FinchClient {

    fun async(): FinchClientAsync

    fun hris(): HrisService

    fun providers(): ProviderService

    fun account(): AccountService

    fun webhooks(): WebhookService

    fun employer(): EmployerService

    /**
     * The Forward API allows you to make direct requests to an employment system. If Finch’s
     * unified API doesn’t have a data model that cleanly fits your needs, then Forward allows you
     * to push or pull data models directly against an integration’s API.
     */
    @JvmOverloads
    fun forward(
        params: ClientForwardParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ForwardResponse

    fun getAccessToken(
        clientId: String,
        clientSecret: String,
        code: String,
        redirectUri: String
    ): String

    fun getAuthUrl(products: String, redirectUri: String, sandbox: Boolean): String

    private data class GetAccessTokenParams(
        @JsonProperty("client_id") val clientId: String,
        @JsonProperty("client_secret") val clientSecret: String,
        @JsonProperty("code") val code: String,
        @JsonProperty("redirect_uri") val redirectUri: String,
    )

    private data class GetAccessTokenResponse(
        @JsonProperty("accessToken") val accessToken: String,
    )
}

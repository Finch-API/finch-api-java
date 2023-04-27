@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.finch.api.client

import com.fasterxml.jackson.annotation.JsonProperty
import org.finch.api.models.*
import org.finch.api.services.blocking.*

interface FinchClient {

    fun ats(): AtService

    fun hris(): HriService

    fun providers(): ProviderService

    fun account(): AccountService

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

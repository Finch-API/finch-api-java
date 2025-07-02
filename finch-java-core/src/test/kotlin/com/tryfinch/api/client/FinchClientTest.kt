// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.client

import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
class FinchClientTest {
    private lateinit var client: FinchClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            FinchOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .accessToken("My Access Token")
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .webhookSecret("My Webhook Secret")
                .build()
    }

    @Test
    fun getAccessTokenWithRedirectUri() {
        val expectedToken = "My Token"
        val expectedJsonResponse =
            "{\"access_token\":\"My Token\",\"account_id\":\"my-account-id\",\"company_id\":\"my-company-id\",\"provider_id\":\"gusto\",\"products\":[\"company\",\"directory\"],\"connection_type\":\"finch\",\"client_type\":\"sandbox\"}"
        val expectedJsonRequest =
            "{\"client_id\":\"our-client-id\",\"client_secret\":\"our-client-secret\",\"code\":\"finch-auth-code\",\"redirect_uri\":\"our-redirect-uri\"}"

        stubFor(
            post(urlPathEqualTo("/auth/token"))
                .withRequestBody(equalToJson(expectedJsonRequest))
                .willReturn(ok().withBody(expectedJsonResponse))
        )

        @Suppress("DEPRECATION")
        assertThat(
                client.getAccessToken(
                    "our-client-id",
                    "our-client-secret",
                    "finch-auth-code",
                    "our-redirect-uri",
                )
            )
            .isEqualTo(expectedToken)
    }

    @Test
    fun getAccessTokenWithoutRedirectUri() {
        val expectedToken = "My Token"
        val expectedJsonResponse =
            "{\"access_token\":\"My Token\",\"account_id\":\"my-account-id\",\"company_id\":\"my-company-id\",\"provider_id\":\"gusto\",\"products\":[\"company\",\"directory\"],\"connection_type\":\"finch\",\"client_type\":\"sandbox\"}"
        val expectedJsonRequest =
            "{\"client_id\":\"our-client-id\",\"client_secret\":\"our-client-secret\",\"code\":\"finch-auth-code\"}"

        stubFor(
            post(urlPathEqualTo("/auth/token"))
                .withRequestBody(equalToJson(expectedJsonRequest))
                .willReturn(ok().withBody(expectedJsonResponse))
        )

        @Suppress("DEPRECATION")
        assertThat(
                client.getAccessToken("our-client-id", "our-client-secret", "finch-auth-code", null)
            )
            .isEqualTo(expectedToken)
    }
}

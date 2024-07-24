// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.client

import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.assertj.guava.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class FinchClientAsyncTest {
    private lateinit var client: FinchClientAsync

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .accessToken("My Access Token")
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .sandboxClientId("My Sandbox Client ID")
                .sandboxClientSecret("My Sandbox Client Secret")
                .webhookSecret("My Webhook Secret")
                .build()
    }

    @Test
    fun getAccessTokenWithRedirectUri() {
        val expectedToken = "My Token"
        val expectedJsonResponse = "{\"accessToken\":\"My Token\"}"
        val expectedJsonRequest =
            "{\"client_id\":\"our-client-id\",\"client_secret\":\"our-client-secret\",\"code\":\"finch-auth-code\",\"redirect_uri\":\"our-redirect-uri\"}"

        stubFor(
            post(urlPathEqualTo("/auth/token"))
                .withRequestBody(equalToJson(expectedJsonRequest))
                .willReturn(ok().withBody(expectedJsonResponse))
        )

        assertThat(
                client
                    .getAccessToken(
                        "our-client-id",
                        "our-client-secret",
                        "finch-auth-code",
                        "our-redirect-uri"
                    )
                    .get()
            )
            .isEqualTo(expectedToken)
    }

    @Test
    fun getAccessTokenWithoutRedirectUri() {
        val expectedToken = "My Token"
        val expectedJsonResponse = "{\"accessToken\":\"My Token\"}"
        val expectedJsonRequest =
            "{\"client_id\":\"our-client-id\",\"client_secret\":\"our-client-secret\",\"code\":\"finch-auth-code\"}"

        stubFor(
            post(urlPathEqualTo("/auth/token"))
                .withRequestBody(equalToJson(expectedJsonRequest))
                .willReturn(ok().withBody(expectedJsonResponse))
        )

        assertThat(
                client
                    .getAccessToken("our-client-id", "our-client-secret", "finch-auth-code", null)
                    .get()
            )
            .isEqualTo(expectedToken)
    }
}

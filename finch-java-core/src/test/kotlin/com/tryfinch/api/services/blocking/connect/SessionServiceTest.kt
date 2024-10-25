// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.connect

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SessionServiceTest {

    @Test
    fun callNew() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val sessionService = client.connect().sessions()
        val sessionNewResponse =
            sessionService.new_(
                ConnectSessionNewParams.builder()
                    .customerId("x")
                    .customerName("x")
                    .products(listOf(ConnectSessionNewParams.ConnectProducts.COMPANY))
                    .customerEmail("dev@stainlessapi.com")
                    .integration(
                        ConnectSessionNewParams.Integration.builder()
                            .authMethod(ConnectSessionNewParams.Integration.AuthMethod.ASSISTED)
                            .provider("provider")
                            .build()
                    )
                    .manual(true)
                    .minutesToExpire(42.23)
                    .redirectUri("redirect_uri")
                    .sandbox(ConnectSessionNewParams.Sandbox.FINCH)
                    .build()
            )
        println(sessionNewResponse)
        sessionNewResponse.validate()
    }

    @Test
    fun callReauthenticate() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val sessionService = client.connect().sessions()
        val sessionReauthenticateResponse =
            sessionService.reauthenticate(
                ConnectSessionReauthenticateParams.builder()
                    .connectionId("connection_id")
                    .minutesToExpire(123L)
                    .products(listOf(ConnectSessionReauthenticateParams.ConnectProducts.COMPANY))
                    .redirectUri("https://example.com")
                    .build()
            )
        println(sessionReauthenticateResponse)
        sessionReauthenticateResponse.validate()
    }
}

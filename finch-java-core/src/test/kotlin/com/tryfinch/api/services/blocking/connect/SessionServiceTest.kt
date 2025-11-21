// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.connect

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.ConnectSessionConnectParams
import com.tryfinch.api.models.ConnectSessionReauthenticateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SessionServiceTest {

    @Disabled("prism tests are broken")
    @Test
    fun connect() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val sessionService = client.connect().sessions()

        val response =
            sessionService.connect(
                ConnectSessionConnectParams.builder()
                    .customerId("x")
                    .customerName("x")
                    .addProduct(ConnectSessionConnectParams.ConnectProducts.BENEFITS)
                    .customerEmail("dev@stainless.com")
                    .integration(
                        ConnectSessionConnectParams.Integration.builder()
                            .provider("provider")
                            .authMethod(ConnectSessionConnectParams.Integration.AuthMethod.ASSISTED)
                            .build()
                    )
                    .manual(true)
                    .minutesToExpire(1.0)
                    .redirectUri("redirect_uri")
                    .sandbox(ConnectSessionConnectParams.Sandbox.FINCH)
                    .build()
            )

        response.validate()
    }

    @Disabled("prism tests are broken")
    @Test
    fun reauthenticate() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val sessionService = client.connect().sessions()

        val response =
            sessionService.reauthenticate(
                ConnectSessionReauthenticateParams.builder()
                    .connectionId("connection_id")
                    .minutesToExpire(0L)
                    .addProduct(ConnectSessionReauthenticateParams.ConnectProducts.BENEFITS)
                    .redirectUri("https://example.com")
                    .build()
            )

        response.validate()
    }
}

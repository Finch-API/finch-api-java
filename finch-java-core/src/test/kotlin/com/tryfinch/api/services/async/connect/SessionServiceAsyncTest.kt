// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.connect

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.ConnectSessionConnectParams
import com.tryfinch.api.models.ConnectSessionReauthenticateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SessionServiceAsyncTest {

    @Disabled("prism tests are broken")
    @Test
    fun connect() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val sessionServiceAsync = client.connect().sessions()

        val responseFuture =
            sessionServiceAsync.connect(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("prism tests are broken")
    @Test
    fun reauthenticate() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val sessionServiceAsync = client.connect().sessions()

        val responseFuture =
            sessionServiceAsync.reauthenticate(
                ConnectSessionReauthenticateParams.builder()
                    .connectionId("connection_id")
                    .minutesToExpire(0L)
                    .addProduct(ConnectSessionReauthenticateParams.ConnectProducts.BENEFITS)
                    .redirectUri("https://example.com")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}

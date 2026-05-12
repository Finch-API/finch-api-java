// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.AccountDisconnectEntityParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountServiceTest {

    @Test
    fun disconnect() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val accountService = client.account()

        val disconnectResponse = accountService.disconnect()

        disconnectResponse.validate()
    }

    @Test
    fun disconnectEntity() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val accountService = client.account()

        val disconnectEntityResponse =
            accountService.disconnectEntity(
                AccountDisconnectEntityParams.builder()
                    .addEntityId("3c90c3cc-0d44-4b50-8888-8dd25736052a")
                    .addEntityId("5e6f7a8b-9c10-4d11-a12b-c13d14e15f16")
                    .build()
            )

        disconnectEntityResponse.validate()
    }

    @Test
    fun introspect() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val accountService = client.account()

        val introspection = accountService.introspect()

        introspection.validate()
    }
}

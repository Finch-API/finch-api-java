// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ConnectionServiceTest {

    @Disabled("Auth isn't setup correctly in this test")
    @Test
    fun callCreate() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .clientId("4ab15e51-11ad-49f4-acae-f343b7794375")
                .clientSecret("My Client Secret")
                .build()
        val connectionService = client.sandbox().connections()
        val connectionCreateResponse =
            connectionService.create(
                SandboxConnectionCreateParams.builder()
                    .providerId("provider_id")
                    .authenticationType(SandboxConnectionCreateParams.AuthenticationType.CREDENTIAL)
                    .employeeSize(123L)
                    .products(listOf("string"))
                    .build()
            )
        println(connectionCreateResponse)
        connectionCreateResponse.validate()
    }
}

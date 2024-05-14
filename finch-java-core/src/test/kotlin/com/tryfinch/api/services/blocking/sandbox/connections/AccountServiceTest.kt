// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox.connections

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountServiceTest {

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
        val accountService = client.sandbox().connections().accounts()
        val accountCreateResponse =
            accountService.create(
                SandboxConnectionAccountCreateParams.builder()
                    .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .providerId("string")
                    .authenticationType(
                        SandboxConnectionAccountCreateParams.AuthenticationType.CREDENTIAL
                    )
                    .products(listOf("string"))
                    .build()
            )
        println(accountCreateResponse)
        accountCreateResponse.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .clientId("4ab15e51-11ad-49f4-acae-f343b7794375")
                .clientSecret("My Client Secret")
                .build()
        val accountService = client.sandbox().connections().accounts()
        val accountUpdateResponse =
            accountService.update(
                SandboxConnectionAccountUpdateParams.builder()
                    .connectionStatus(ConnectionStatusType.PENDING)
                    .build()
            )
        println(accountUpdateResponse)
        accountUpdateResponse.validate()
    }
}

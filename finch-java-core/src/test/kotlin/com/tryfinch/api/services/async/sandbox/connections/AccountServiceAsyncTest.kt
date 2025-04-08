// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox.connections

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.ConnectionStatusType
import com.tryfinch.api.models.SandboxConnectionAccountCreateParams
import com.tryfinch.api.models.SandboxConnectionAccountUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountServiceAsyncTest {

    @Test
    fun create() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val accountServiceAsync = client.sandbox().connections().accounts()

        val accountFuture =
            accountServiceAsync.create(
                SandboxConnectionAccountCreateParams.builder()
                    .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .providerId("provider_id")
                    .authenticationType(
                        SandboxConnectionAccountCreateParams.AuthenticationType.CREDENTIAL
                    )
                    .addProduct("string")
                    .build()
            )

        val account = accountFuture.get()
        account.validate()
    }

    @Test
    fun update() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val accountServiceAsync = client.sandbox().connections().accounts()

        val accountFuture =
            accountServiceAsync.update(
                SandboxConnectionAccountUpdateParams.builder()
                    .connectionStatus(ConnectionStatusType.REAUTH)
                    .build()
            )

        val account = accountFuture.get()
        account.validate()
    }
}

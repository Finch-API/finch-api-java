// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox.jobs

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ConfigurationServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val configurationService = client.sandbox().jobs().configuration()
        val configurationRetrieveResponse =
            configurationService.retrieve(SandboxJobConfigurationRetrieveParams.builder().build())
        println(configurationRetrieveResponse)
        for (sandboxJobConfiguration: SandboxJobConfiguration in configurationRetrieveResponse) {
            sandboxJobConfiguration.validate()
        }
    }

    @Test
    fun callUpdate() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val configurationService = client.sandbox().jobs().configuration()
        val sandboxJobConfiguration =
            configurationService.update(
                SandboxJobConfigurationUpdateParams.builder()
                    .completionStatus(SandboxJobConfigurationUpdateParams.CompletionStatus.COMPLETE)
                    .type(SandboxJobConfigurationUpdateParams.Type.DATA_SYNC_ALL)
                    .build()
            )
        println(sandboxJobConfiguration)
        sandboxJobConfiguration.validate()
    }
}

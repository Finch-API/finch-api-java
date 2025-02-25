// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox.jobs

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.SandboxJobConfiguration
import com.tryfinch.api.models.SandboxJobConfigurationUpdateParams
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
                .build()
        val configurationService = client.sandbox().jobs().configuration()
        val configurationRetrieveResponse = configurationService.retrieve()
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
                .build()
        val configurationService = client.sandbox().jobs().configuration()
        val sandboxJobConfiguration =
            configurationService.update(
                SandboxJobConfigurationUpdateParams.builder()
                    .sandboxJobConfiguration(
                        SandboxJobConfiguration.builder()
                            .completionStatus(SandboxJobConfiguration.CompletionStatus.COMPLETE)
                            .type(SandboxJobConfiguration.Type.DATA_SYNC_ALL)
                            .build()
                    )
                    .build()
            )
        println(sandboxJobConfiguration)
        sandboxJobConfiguration.validate()
    }
}

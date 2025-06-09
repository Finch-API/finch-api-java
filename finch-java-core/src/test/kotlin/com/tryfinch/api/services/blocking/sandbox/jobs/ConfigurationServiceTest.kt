// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox.jobs

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.SandboxJobConfiguration
import com.tryfinch.api.models.SandboxJobConfigurationUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ConfigurationServiceTest {

    @Test
    fun retrieve() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val configurationService = client.sandbox().jobs().configuration()

        val sandboxJobConfigurations = configurationService.retrieve()

        sandboxJobConfigurations.forEach { it.validate() }
    }

    @Test
    fun update() {
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

        sandboxJobConfiguration.validate()
    }
}

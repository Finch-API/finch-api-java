// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SandboxJobConfigurationUpdateParamsTest {

    @Test
    fun create() {
        SandboxJobConfigurationUpdateParams.builder()
            .sandboxJobConfiguration(
                SandboxJobConfiguration.builder()
                    .completionStatus(SandboxJobConfiguration.CompletionStatus.COMPLETE)
                    .type(SandboxJobConfiguration.Type.DATA_SYNC_ALL)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SandboxJobConfigurationUpdateParams.builder()
                .sandboxJobConfiguration(
                    SandboxJobConfiguration.builder()
                        .completionStatus(SandboxJobConfiguration.CompletionStatus.COMPLETE)
                        .type(SandboxJobConfiguration.Type.DATA_SYNC_ALL)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body)
            .isEqualTo(
                SandboxJobConfiguration.builder()
                    .completionStatus(SandboxJobConfiguration.CompletionStatus.COMPLETE)
                    .type(SandboxJobConfiguration.Type.DATA_SYNC_ALL)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SandboxJobConfigurationUpdateParams.builder()
                .sandboxJobConfiguration(
                    SandboxJobConfiguration.builder()
                        .completionStatus(SandboxJobConfiguration.CompletionStatus.COMPLETE)
                        .type(SandboxJobConfiguration.Type.DATA_SYNC_ALL)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body)
            .isEqualTo(
                SandboxJobConfiguration.builder()
                    .completionStatus(SandboxJobConfiguration.CompletionStatus.COMPLETE)
                    .type(SandboxJobConfiguration.Type.DATA_SYNC_ALL)
                    .build()
            )
    }
}

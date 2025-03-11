// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SandboxJobConfigurationTest {

    @Test
    fun createSandboxJobConfiguration() {
        val sandboxJobConfiguration =
            SandboxJobConfiguration.builder()
                .completionStatus(SandboxJobConfiguration.CompletionStatus.COMPLETE)
                .type(SandboxJobConfiguration.Type.DATA_SYNC_ALL)
                .build()
        assertThat(sandboxJobConfiguration).isNotNull
        assertThat(sandboxJobConfiguration.completionStatus())
            .isEqualTo(SandboxJobConfiguration.CompletionStatus.COMPLETE)
        assertThat(sandboxJobConfiguration.type())
            .isEqualTo(SandboxJobConfiguration.Type.DATA_SYNC_ALL)
    }
}

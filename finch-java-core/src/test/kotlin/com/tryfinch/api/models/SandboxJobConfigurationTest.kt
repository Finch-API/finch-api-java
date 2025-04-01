// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SandboxJobConfigurationTest {

    @Test
    fun create() {
        val sandboxJobConfiguration =
            SandboxJobConfiguration.builder()
                .completionStatus(SandboxJobConfiguration.CompletionStatus.COMPLETE)
                .type(SandboxJobConfiguration.Type.DATA_SYNC_ALL)
                .build()

        assertThat(sandboxJobConfiguration.completionStatus())
            .isEqualTo(SandboxJobConfiguration.CompletionStatus.COMPLETE)
        assertThat(sandboxJobConfiguration.type())
            .isEqualTo(SandboxJobConfiguration.Type.DATA_SYNC_ALL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sandboxJobConfiguration =
            SandboxJobConfiguration.builder()
                .completionStatus(SandboxJobConfiguration.CompletionStatus.COMPLETE)
                .type(SandboxJobConfiguration.Type.DATA_SYNC_ALL)
                .build()

        val roundtrippedSandboxJobConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sandboxJobConfiguration),
                jacksonTypeRef<SandboxJobConfiguration>(),
            )

        assertThat(roundtrippedSandboxJobConfiguration).isEqualTo(sandboxJobConfiguration)
    }
}

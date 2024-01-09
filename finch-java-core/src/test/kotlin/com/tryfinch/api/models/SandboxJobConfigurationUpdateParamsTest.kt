// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SandboxJobConfigurationUpdateParamsTest {

    @Test
    fun createSandboxJobConfigurationUpdateParams() {
        SandboxJobConfigurationUpdateParams.builder()
            .completionStatus(SandboxJobConfigurationUpdateParams.CompletionStatus.COMPLETE)
            .type(SandboxJobConfigurationUpdateParams.Type.DATA_SYNC_ALL)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SandboxJobConfigurationUpdateParams.builder()
                .completionStatus(SandboxJobConfigurationUpdateParams.CompletionStatus.COMPLETE)
                .type(SandboxJobConfigurationUpdateParams.Type.DATA_SYNC_ALL)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.completionStatus())
            .isEqualTo(SandboxJobConfigurationUpdateParams.CompletionStatus.COMPLETE)
        assertThat(body.type()).isEqualTo(SandboxJobConfigurationUpdateParams.Type.DATA_SYNC_ALL)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SandboxJobConfigurationUpdateParams.builder()
                .completionStatus(SandboxJobConfigurationUpdateParams.CompletionStatus.COMPLETE)
                .type(SandboxJobConfigurationUpdateParams.Type.DATA_SYNC_ALL)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.completionStatus())
            .isEqualTo(SandboxJobConfigurationUpdateParams.CompletionStatus.COMPLETE)
        assertThat(body.type()).isEqualTo(SandboxJobConfigurationUpdateParams.Type.DATA_SYNC_ALL)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SandboxJobCreateParamsTest {

    @Test
    fun createSandboxJobCreateParams() {
        SandboxJobCreateParams.builder().type(SandboxJobCreateParams.Type.DATA_SYNC_ALL).build()
    }

    @Test
    fun getBody() {
        val params =
            SandboxJobCreateParams.builder().type(SandboxJobCreateParams.Type.DATA_SYNC_ALL).build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.type()).isEqualTo(SandboxJobCreateParams.Type.DATA_SYNC_ALL)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SandboxJobCreateParams.builder().type(SandboxJobCreateParams.Type.DATA_SYNC_ALL).build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.type()).isEqualTo(SandboxJobCreateParams.Type.DATA_SYNC_ALL)
    }
}

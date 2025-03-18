// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SandboxJobCreateParamsTest {

    @Test
    fun create() {
        SandboxJobCreateParams.builder().type(SandboxJobCreateParams.Type.DATA_SYNC_ALL).build()
    }

    @Test
    fun body() {
        val params =
            SandboxJobCreateParams.builder().type(SandboxJobCreateParams.Type.DATA_SYNC_ALL).build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.type()).isEqualTo(SandboxJobCreateParams.Type.DATA_SYNC_ALL)
    }
}

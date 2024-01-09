// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SandboxConnectionAccountUpdateParamsTest {

    @Test
    fun createSandboxConnectionAccountUpdateParams() {
        SandboxConnectionAccountUpdateParams.builder()
            .connectionStatus(IntrospectResponseConnectionStatus.PENDING)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SandboxConnectionAccountUpdateParams.builder()
                .connectionStatus(IntrospectResponseConnectionStatus.PENDING)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.connectionStatus()).isEqualTo(IntrospectResponseConnectionStatus.PENDING)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = SandboxConnectionAccountUpdateParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}

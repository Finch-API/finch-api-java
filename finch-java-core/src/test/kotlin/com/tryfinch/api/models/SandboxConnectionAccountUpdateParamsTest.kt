// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SandboxConnectionAccountUpdateParamsTest {

    @Test
    fun create() {
        SandboxConnectionAccountUpdateParams.builder()
            .connectionStatus(ConnectionStatusType.REAUTH)
            .build()
    }

    @Test
    fun body() {
        val params =
            SandboxConnectionAccountUpdateParams.builder()
                .connectionStatus(ConnectionStatusType.REAUTH)
                .build()

        val body = params._body()

        assertThat(body.connectionStatus()).contains(ConnectionStatusType.REAUTH)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SandboxConnectionAccountUpdateParams.builder().build()

        val body = params._body()
    }
}

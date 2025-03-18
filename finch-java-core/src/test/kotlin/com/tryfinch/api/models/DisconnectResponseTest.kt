// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisconnectResponseTest {

    @Test
    fun create() {
        val disconnectResponse = DisconnectResponse.builder().status("status").build()

        assertThat(disconnectResponse.status()).isEqualTo("status")
    }
}

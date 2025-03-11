// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DisconnectResponseTest {

    @Test
    fun createDisconnectResponse() {
        val disconnectResponse = DisconnectResponse.builder().status("status").build()
        assertThat(disconnectResponse).isNotNull
        assertThat(disconnectResponse.status()).isEqualTo("status")
    }
}

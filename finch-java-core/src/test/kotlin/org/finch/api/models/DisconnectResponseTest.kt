package org.finch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DisconnectResponseTest {

    @Test
    fun createDisconnectResponse() {
        val disconnectResponse = DisconnectResponse.builder().status("string").build()
        assertThat(disconnectResponse).isNotNull
        assertThat(disconnectResponse.status()).isEqualTo("string")
    }
}

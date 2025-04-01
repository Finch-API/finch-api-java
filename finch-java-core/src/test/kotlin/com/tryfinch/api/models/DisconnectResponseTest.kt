// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisconnectResponseTest {

    @Test
    fun create() {
        val disconnectResponse = DisconnectResponse.builder().status("status").build()

        assertThat(disconnectResponse.status()).isEqualTo("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val disconnectResponse = DisconnectResponse.builder().status("status").build()

        val roundtrippedDisconnectResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(disconnectResponse),
                jacksonTypeRef<DisconnectResponse>(),
            )

        assertThat(roundtrippedDisconnectResponse).isEqualTo(disconnectResponse)
    }
}

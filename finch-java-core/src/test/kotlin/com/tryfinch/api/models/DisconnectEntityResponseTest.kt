// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DisconnectEntityResponseTest {

    @Test
    fun create() {
        val disconnectEntityResponse = DisconnectEntityResponse.builder().status("status").build()

        assertThat(disconnectEntityResponse.status()).isEqualTo("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val disconnectEntityResponse = DisconnectEntityResponse.builder().status("status").build()

        val roundtrippedDisconnectEntityResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(disconnectEntityResponse),
                jacksonTypeRef<DisconnectEntityResponse>(),
            )

        assertThat(roundtrippedDisconnectEntityResponse).isEqualTo(disconnectEntityResponse)
    }
}

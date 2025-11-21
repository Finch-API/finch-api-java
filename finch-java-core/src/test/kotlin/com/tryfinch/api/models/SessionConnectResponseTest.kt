// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionConnectResponseTest {

    @Test
    fun create() {
        val sessionConnectResponse =
            SessionConnectResponse.builder()
                .connectUrl("https://example.com")
                .sessionId("session_id")
                .build()

        assertThat(sessionConnectResponse.connectUrl()).isEqualTo("https://example.com")
        assertThat(sessionConnectResponse.sessionId()).isEqualTo("session_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionConnectResponse =
            SessionConnectResponse.builder()
                .connectUrl("https://example.com")
                .sessionId("session_id")
                .build()

        val roundtrippedSessionConnectResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionConnectResponse),
                jacksonTypeRef<SessionConnectResponse>(),
            )

        assertThat(roundtrippedSessionConnectResponse).isEqualTo(sessionConnectResponse)
    }
}

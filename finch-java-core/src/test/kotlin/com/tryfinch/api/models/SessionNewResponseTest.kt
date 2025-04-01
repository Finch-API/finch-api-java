// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionNewResponseTest {

    @Test
    fun create() {
        val sessionNewResponse =
            SessionNewResponse.builder()
                .connectUrl("https://example.com")
                .sessionId("session_id")
                .build()

        assertThat(sessionNewResponse.connectUrl()).isEqualTo("https://example.com")
        assertThat(sessionNewResponse.sessionId()).isEqualTo("session_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionNewResponse =
            SessionNewResponse.builder()
                .connectUrl("https://example.com")
                .sessionId("session_id")
                .build()

        val roundtrippedSessionNewResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionNewResponse),
                jacksonTypeRef<SessionNewResponse>(),
            )

        assertThat(roundtrippedSessionNewResponse).isEqualTo(sessionNewResponse)
    }
}

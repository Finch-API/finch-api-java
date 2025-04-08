// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionReauthenticateResponseTest {

    @Test
    fun create() {
        val sessionReauthenticateResponse =
            SessionReauthenticateResponse.builder()
                .connectUrl("https://example.com")
                .sessionId("session_id")
                .build()

        assertThat(sessionReauthenticateResponse.connectUrl()).isEqualTo("https://example.com")
        assertThat(sessionReauthenticateResponse.sessionId()).isEqualTo("session_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionReauthenticateResponse =
            SessionReauthenticateResponse.builder()
                .connectUrl("https://example.com")
                .sessionId("session_id")
                .build()

        val roundtrippedSessionReauthenticateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionReauthenticateResponse),
                jacksonTypeRef<SessionReauthenticateResponse>(),
            )

        assertThat(roundtrippedSessionReauthenticateResponse)
            .isEqualTo(sessionReauthenticateResponse)
    }
}

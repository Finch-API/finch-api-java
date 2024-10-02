// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SessionReauthenticateResponseTest {

    @Test
    fun createSessionReauthenticateResponse() {
        val sessionReauthenticateResponse =
            SessionReauthenticateResponse.builder()
                .connectUrl("https://example.com")
                .sessionId("session_id")
                .build()
        assertThat(sessionReauthenticateResponse).isNotNull
        assertThat(sessionReauthenticateResponse.connectUrl()).isEqualTo("https://example.com")
        assertThat(sessionReauthenticateResponse.sessionId()).isEqualTo("session_id")
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SessionNewResponseTest {

    @Test
    fun createSessionNewResponse() {
      val sessionNewResponse = SessionNewResponse.builder()
          .connectUrl("https://example.com")
          .sessionId("session_id")
          .build()
      assertThat(sessionNewResponse).isNotNull
      assertThat(sessionNewResponse.connectUrl()).isEqualTo("https://example.com")
      assertThat(sessionNewResponse.sessionId()).isEqualTo("session_id")
    }
}

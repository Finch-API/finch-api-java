// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AutomatedCreateResponseTest {

    @Test
    fun createAutomatedCreateResponse() {
      val automatedCreateResponse = AutomatedCreateResponse.builder()
          .allowedRefreshes(0L)
          .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .jobUrl("job_url")
          .remainingRefreshes(0L)
          .build()
      assertThat(automatedCreateResponse).isNotNull
      assertThat(automatedCreateResponse.allowedRefreshes()).isEqualTo(0L)
      assertThat(automatedCreateResponse.jobId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(automatedCreateResponse.jobUrl()).isEqualTo("job_url")
      assertThat(automatedCreateResponse.remainingRefreshes()).isEqualTo(0L)
    }
}

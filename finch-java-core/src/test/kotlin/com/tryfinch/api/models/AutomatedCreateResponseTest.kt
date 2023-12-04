// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AutomatedCreateResponseTest {

    @Test
    fun createAutomatedCreateResponse() {
        val automatedCreateResponse =
            AutomatedCreateResponse.builder()
                .allowedRefreshes(123L)
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .jobUrl("string")
                .remainingRefreshes(123L)
                .build()
        assertThat(automatedCreateResponse).isNotNull
        assertThat(automatedCreateResponse.allowedRefreshes()).isEqualTo(123L)
        assertThat(automatedCreateResponse.jobId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(automatedCreateResponse.jobUrl()).isEqualTo("string")
        assertThat(automatedCreateResponse.remainingRefreshes()).isEqualTo(123L)
    }
}

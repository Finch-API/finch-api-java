// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutomatedCreateResponseTest {

    @Test
    fun create() {
        val automatedCreateResponse =
            AutomatedCreateResponse.builder()
                .allowedRefreshes(0L)
                .remainingRefreshes(0L)
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .jobUrl("job_url")
                .retryAt("retry_at")
                .build()

        assertThat(automatedCreateResponse.allowedRefreshes()).isEqualTo(0L)
        assertThat(automatedCreateResponse.remainingRefreshes()).isEqualTo(0L)
        assertThat(automatedCreateResponse.jobId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(automatedCreateResponse.jobUrl()).contains("job_url")
        assertThat(automatedCreateResponse.retryAt()).contains("retry_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val automatedCreateResponse =
            AutomatedCreateResponse.builder()
                .allowedRefreshes(0L)
                .remainingRefreshes(0L)
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .jobUrl("job_url")
                .retryAt("retry_at")
                .build()

        val roundtrippedAutomatedCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(automatedCreateResponse),
                jacksonTypeRef<AutomatedCreateResponse>(),
            )

        assertThat(roundtrippedAutomatedCreateResponse).isEqualTo(automatedCreateResponse)
    }
}

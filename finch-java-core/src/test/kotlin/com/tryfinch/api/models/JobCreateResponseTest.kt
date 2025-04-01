// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobCreateResponseTest {

    @Test
    fun create() {
        val jobCreateResponse =
            JobCreateResponse.builder()
                .allowedRefreshes(0L)
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .jobUrl("job_url")
                .remainingRefreshes(0L)
                .build()

        assertThat(jobCreateResponse.allowedRefreshes()).isEqualTo(0L)
        assertThat(jobCreateResponse.jobId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(jobCreateResponse.jobUrl()).isEqualTo("job_url")
        assertThat(jobCreateResponse.remainingRefreshes()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jobCreateResponse =
            JobCreateResponse.builder()
                .allowedRefreshes(0L)
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .jobUrl("job_url")
                .remainingRefreshes(0L)
                .build()

        val roundtrippedJobCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jobCreateResponse),
                jacksonTypeRef<JobCreateResponse>(),
            )

        assertThat(roundtrippedJobCreateResponse).isEqualTo(jobCreateResponse)
    }
}

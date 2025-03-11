// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class JobCreateResponseTest {

    @Test
    fun createJobCreateResponse() {
        val jobCreateResponse =
            JobCreateResponse.builder()
                .allowedRefreshes(0L)
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .jobUrl("job_url")
                .remainingRefreshes(0L)
                .build()
        assertThat(jobCreateResponse).isNotNull
        assertThat(jobCreateResponse.allowedRefreshes()).isEqualTo(0L)
        assertThat(jobCreateResponse.jobId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(jobCreateResponse.jobUrl()).isEqualTo("job_url")
        assertThat(jobCreateResponse.remainingRefreshes()).isEqualTo(0L)
    }
}

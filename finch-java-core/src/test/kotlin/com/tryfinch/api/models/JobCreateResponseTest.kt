// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class JobCreateResponseTest {

    @Test
    fun createJobCreateResponse() {
        val jobCreateResponse =
            JobCreateResponse.builder()
                .allowedRefreshes(123L)
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .jobUrl("string")
                .remainingRefreshes(123L)
                .build()
        assertThat(jobCreateResponse).isNotNull
        assertThat(jobCreateResponse.allowedRefreshes()).isEqualTo(123L)
        assertThat(jobCreateResponse.jobId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(jobCreateResponse.jobUrl()).isEqualTo("string")
        assertThat(jobCreateResponse.remainingRefreshes()).isEqualTo(123L)
    }
}

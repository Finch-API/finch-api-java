// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ManualAsyncJobTest {

    @Test
    fun createManualAsyncJob() {
        val manualAsyncJob =
            ManualAsyncJob.builder()
                .addBody(JsonValue.from(mapOf<String, Any>()))
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(ManualAsyncJob.Status.PENDING)
                .build()
        assertThat(manualAsyncJob).isNotNull
        assertThat(manualAsyncJob.body().get())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(manualAsyncJob.jobId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(manualAsyncJob.status()).isEqualTo(ManualAsyncJob.Status.PENDING)
    }
}

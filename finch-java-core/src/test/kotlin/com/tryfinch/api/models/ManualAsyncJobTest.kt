// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManualAsyncJobTest {

    @Test
    fun create() {
        val manualAsyncJob =
            ManualAsyncJob.builder()
                .addBody(JsonValue.from(mapOf<String, Any>()))
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(ManualAsyncJob.Status.PENDING)
                .build()

        assertThat(manualAsyncJob.body().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(manualAsyncJob.jobId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(manualAsyncJob.status()).isEqualTo(ManualAsyncJob.Status.PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val manualAsyncJob =
            ManualAsyncJob.builder()
                .addBody(JsonValue.from(mapOf<String, Any>()))
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(ManualAsyncJob.Status.PENDING)
                .build()

        val roundtrippedManualAsyncJob =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(manualAsyncJob),
                jacksonTypeRef<ManualAsyncJob>(),
            )

        assertThat(roundtrippedManualAsyncJob).isEqualTo(manualAsyncJob)
    }
}

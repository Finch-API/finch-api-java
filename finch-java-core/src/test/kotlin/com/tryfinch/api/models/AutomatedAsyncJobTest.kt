// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutomatedAsyncJobTest {

    @Test
    fun create() {
        val automatedAsyncJob =
            AutomatedAsyncJob.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .jobUrl("job_url")
                .params(AutomatedAsyncJob.Params.builder().individualId("individual_id").build())
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(AutomatedAsyncJob.Status.PENDING)
                .type(AutomatedAsyncJob.Type.DATA_SYNC_ALL)
                .build()

        assertThat(automatedAsyncJob.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(automatedAsyncJob.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(automatedAsyncJob.jobId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(automatedAsyncJob.jobUrl()).isEqualTo("job_url")
        assertThat(automatedAsyncJob.params())
            .contains(AutomatedAsyncJob.Params.builder().individualId("individual_id").build())
        assertThat(automatedAsyncJob.scheduledAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(automatedAsyncJob.startedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(automatedAsyncJob.status()).isEqualTo(AutomatedAsyncJob.Status.PENDING)
        assertThat(automatedAsyncJob.type()).isEqualTo(AutomatedAsyncJob.Type.DATA_SYNC_ALL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val automatedAsyncJob =
            AutomatedAsyncJob.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .jobUrl("job_url")
                .params(AutomatedAsyncJob.Params.builder().individualId("individual_id").build())
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(AutomatedAsyncJob.Status.PENDING)
                .type(AutomatedAsyncJob.Type.DATA_SYNC_ALL)
                .build()

        val roundtrippedAutomatedAsyncJob =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(automatedAsyncJob),
                jacksonTypeRef<AutomatedAsyncJob>(),
            )

        assertThat(roundtrippedAutomatedAsyncJob).isEqualTo(automatedAsyncJob)
    }
}

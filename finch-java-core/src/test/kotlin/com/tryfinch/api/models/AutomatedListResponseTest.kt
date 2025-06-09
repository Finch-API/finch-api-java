// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutomatedListResponseTest {

    @Test
    fun create() {
        val automatedListResponse =
            AutomatedListResponse.builder()
                .addData(
                    AutomatedAsyncJob.builder()
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .jobUrl("job_url")
                        .params(
                            AutomatedAsyncJob.Params.builder().individualId("individual_id").build()
                        )
                        .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(AutomatedAsyncJob.Status.PENDING)
                        .type(AutomatedAsyncJob.Type.DATA_SYNC_ALL)
                        .build()
                )
                .meta(
                    AutomatedListResponse.Meta.builder()
                        .quotas(
                            AutomatedListResponse.Meta.Quotas.builder()
                                .dataSyncAll(
                                    AutomatedListResponse.Meta.Quotas.DataSyncAll.builder()
                                        .allowedRefreshes(0L)
                                        .remainingRefreshes(0L)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(automatedListResponse.data())
            .containsExactly(
                AutomatedAsyncJob.builder()
                    .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .jobUrl("job_url")
                    .params(
                        AutomatedAsyncJob.Params.builder().individualId("individual_id").build()
                    )
                    .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(AutomatedAsyncJob.Status.PENDING)
                    .type(AutomatedAsyncJob.Type.DATA_SYNC_ALL)
                    .build()
            )
        assertThat(automatedListResponse.meta())
            .isEqualTo(
                AutomatedListResponse.Meta.builder()
                    .quotas(
                        AutomatedListResponse.Meta.Quotas.builder()
                            .dataSyncAll(
                                AutomatedListResponse.Meta.Quotas.DataSyncAll.builder()
                                    .allowedRefreshes(0L)
                                    .remainingRefreshes(0L)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val automatedListResponse =
            AutomatedListResponse.builder()
                .addData(
                    AutomatedAsyncJob.builder()
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .jobUrl("job_url")
                        .params(
                            AutomatedAsyncJob.Params.builder().individualId("individual_id").build()
                        )
                        .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(AutomatedAsyncJob.Status.PENDING)
                        .type(AutomatedAsyncJob.Type.DATA_SYNC_ALL)
                        .build()
                )
                .meta(
                    AutomatedListResponse.Meta.builder()
                        .quotas(
                            AutomatedListResponse.Meta.Quotas.builder()
                                .dataSyncAll(
                                    AutomatedListResponse.Meta.Quotas.DataSyncAll.builder()
                                        .allowedRefreshes(0L)
                                        .remainingRefreshes(0L)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedAutomatedListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(automatedListResponse),
                jacksonTypeRef<AutomatedListResponse>(),
            )

        assertThat(roundtrippedAutomatedListResponse).isEqualTo(automatedListResponse)
    }
}

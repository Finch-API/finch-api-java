// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobCompletionEventTest {

    @Test
    fun create() {
        val jobCompletionEvent =
            JobCompletionEvent.builder()
                .accountId("account_id")
                .companyId("company_id")
                .connectionId("connection_id")
                .data(JobCompletionEvent.Data.builder().jobId("job_id").jobUrl("job_url").build())
                .eventType(JobCompletionEvent.EventType.JOB_BENEFIT_CREATE_COMPLETED)
                .build()

        assertThat(jobCompletionEvent.accountId()).isEqualTo("account_id")
        assertThat(jobCompletionEvent.companyId()).isEqualTo("company_id")
        assertThat(jobCompletionEvent.connectionId()).contains("connection_id")
        assertThat(jobCompletionEvent.data())
            .contains(JobCompletionEvent.Data.builder().jobId("job_id").jobUrl("job_url").build())
        assertThat(jobCompletionEvent.eventType())
            .contains(JobCompletionEvent.EventType.JOB_BENEFIT_CREATE_COMPLETED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jobCompletionEvent =
            JobCompletionEvent.builder()
                .accountId("account_id")
                .companyId("company_id")
                .connectionId("connection_id")
                .data(JobCompletionEvent.Data.builder().jobId("job_id").jobUrl("job_url").build())
                .eventType(JobCompletionEvent.EventType.JOB_BENEFIT_CREATE_COMPLETED)
                .build()

        val roundtrippedJobCompletionEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jobCompletionEvent),
                jacksonTypeRef<JobCompletionEvent>(),
            )

        assertThat(roundtrippedJobCompletionEvent).isEqualTo(jobCompletionEvent)
    }
}

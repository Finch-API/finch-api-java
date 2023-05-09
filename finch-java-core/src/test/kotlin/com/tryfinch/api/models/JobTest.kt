package com.tryfinch.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class JobTest {

    @Test
    fun createJob() {
        val job =
            Job.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("string")
                .status(Job.Status.OPEN)
                .department(Job.Department.builder().name("string").build())
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .closedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .hiringTeam(
                    Job.HiringTeam.builder()
                        .hiringManagers(
                            listOf(Job.HiringTeam.HiringManager.builder().name("string").build())
                        )
                        .recruiters(
                            listOf(Job.HiringTeam.Recruiter.builder().name("string").build())
                        )
                        .build()
                )
                .build()
        assertThat(job).isNotNull
        assertThat(job.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(job.name()).contains("string")
        assertThat(job.status()).contains(Job.Status.OPEN)
        assertThat(job.department()).isEqualTo(Job.Department.builder().name("string").build())
        assertThat(job.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(job.closedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(job.hiringTeam())
            .isEqualTo(
                Job.HiringTeam.builder()
                    .hiringManagers(
                        listOf(Job.HiringTeam.HiringManager.builder().name("string").build())
                    )
                    .recruiters(listOf(Job.HiringTeam.Recruiter.builder().name("string").build()))
                    .build()
            )
    }
}

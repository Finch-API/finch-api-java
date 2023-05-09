package com.tryfinch.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ApplicationTest {

    @Test
    fun createApplication() {
        val application =
            Application.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .candidateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .offerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .stage(
                    Stage.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("string")
                        .build()
                )
                .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .rejectedReason(Application.RejectedReason.builder().text("string").build())
                .build()
        assertThat(application).isNotNull
        assertThat(application.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(application.candidateId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(application.jobId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(application.offerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(application.stage())
            .isEqualTo(
                Stage.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("string")
                    .build()
            )
        assertThat(application.rejectedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(application.rejectedReason())
            .isEqualTo(Application.RejectedReason.builder().text("string").build())
    }
}

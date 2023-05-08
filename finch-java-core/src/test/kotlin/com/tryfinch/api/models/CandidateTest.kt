package com.tryfinch.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CandidateTest {

    @Test
    fun createCandidate() {
        val candidate =
            Candidate.builder()
                .id("string")
                .firstName("string")
                .lastName("string")
                .fullName("string")
                .emails(listOf(Candidate.Email.builder().data("string").type("string").build()))
                .phoneNumbers(
                    listOf(Candidate.PhoneNumber.builder().data("string").type("string").build())
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastActivityAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .applicationIds(listOf("string"))
                .build()
        assertThat(candidate).isNotNull
        assertThat(candidate.id()).isEqualTo("string")
        assertThat(candidate.firstName()).contains("string")
        assertThat(candidate.lastName()).contains("string")
        assertThat(candidate.fullName()).contains("string")
        assertThat(candidate.emails())
            .containsExactly(Candidate.Email.builder().data("string").type("string").build())
        assertThat(candidate.phoneNumbers())
            .containsExactly(Candidate.PhoneNumber.builder().data("string").type("string").build())
        assertThat(candidate.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(candidate.lastActivityAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(candidate.applicationIds()).containsExactly("string")
    }
}

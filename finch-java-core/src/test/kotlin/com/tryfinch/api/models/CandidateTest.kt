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
                .applicationIds(listOf("string"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .emails(listOf(Candidate.Email.builder().data("string").type("string").build()))
                .firstName("string")
                .fullName("string")
                .lastActivityAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastName("string")
                .phoneNumbers(
                    listOf(Candidate.PhoneNumber.builder().data("string").type("string").build())
                )
                .build()
        assertThat(candidate).isNotNull
        assertThat(candidate.id()).isEqualTo("string")
        assertThat(candidate.applicationIds()).containsExactly("string")
        assertThat(candidate.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(candidate.emails())
            .containsExactly(Candidate.Email.builder().data("string").type("string").build())
        assertThat(candidate.firstName()).contains("string")
        assertThat(candidate.fullName()).contains("string")
        assertThat(candidate.lastActivityAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(candidate.lastName()).contains("string")
        assertThat(candidate.phoneNumbers())
            .containsExactly(Candidate.PhoneNumber.builder().data("string").type("string").build())
    }
}

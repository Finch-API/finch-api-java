package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EnrolledIndividualTest {

    @Test
    fun createEnrolledIndividual() {
        val enrolledIndividual =
            EnrolledIndividual.builder()
                .individualId("string")
                .code(EnrolledIndividual.Code.OK)
                .body(
                    EnrolledIndividual.Body.builder()
                        .name("string")
                        .finchCode("string")
                        .message("string")
                        .build()
                )
                .build()
        assertThat(enrolledIndividual).isNotNull
        assertThat(enrolledIndividual.individualId()).isEqualTo("string")
        assertThat(enrolledIndividual.code()).isEqualTo(EnrolledIndividual.Code.OK)
        assertThat(enrolledIndividual.body())
            .isEqualTo(
                EnrolledIndividual.Body.builder()
                    .name("string")
                    .finchCode("string")
                    .message("string")
                    .build()
            )
    }
}

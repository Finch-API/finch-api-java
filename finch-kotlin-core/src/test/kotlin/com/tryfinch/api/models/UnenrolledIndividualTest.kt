package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UnenrolledIndividualTest {

    @Test
    fun createUnenrolledIndividual() {
        val unenrolledIndividual =
            UnenrolledIndividual.builder()
                .individualId("string")
                .code(123L)
                .body(
                    UnenrolledIndividual.Body.builder()
                        .name("string")
                        .finchCode("string")
                        .message("string")
                        .build()
                )
                .build()
        assertThat(unenrolledIndividual).isNotNull
        assertThat(unenrolledIndividual.individualId()).isEqualTo("string")
        assertThat(unenrolledIndividual.code()).isEqualTo(123L)
        assertThat(unenrolledIndividual.body())
            .isEqualTo(
                UnenrolledIndividual.Body.builder()
                    .name("string")
                    .finchCode("string")
                    .message("string")
                    .build()
            )
    }
}

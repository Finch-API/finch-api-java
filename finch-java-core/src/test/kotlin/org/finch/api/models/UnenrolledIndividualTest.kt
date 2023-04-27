package org.finch.api.models

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
        assertThat(unenrolledIndividual.individualId()).contains("string")
        assertThat(unenrolledIndividual.code()).contains(123L)
        assertThat(unenrolledIndividual.body())
            .contains(
                UnenrolledIndividual.Body.builder()
                    .name("string")
                    .finchCode("string")
                    .message("string")
                    .build()
            )
    }
}

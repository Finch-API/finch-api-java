// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnrolledIndividualTest {

    @Test
    fun createEnrolledIndividual() {
        val enrolledIndividual =
            EnrolledIndividual.builder()
                .body(
                    EnrolledIndividual.Body.builder()
                        .finchCode("finch_code")
                        .message("message")
                        .name("name")
                        .build()
                )
                .code(EnrolledIndividual.Code.OK)
                .individualId("individual_id")
                .build()
        assertThat(enrolledIndividual).isNotNull
        assertThat(enrolledIndividual.body())
            .contains(
                EnrolledIndividual.Body.builder()
                    .finchCode("finch_code")
                    .message("message")
                    .name("name")
                    .build()
            )
        assertThat(enrolledIndividual.code()).contains(EnrolledIndividual.Code.OK)
        assertThat(enrolledIndividual.individualId()).contains("individual_id")
    }
}

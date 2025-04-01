// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnrolledIndividualTest {

    @Test
    fun create() {
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedEnrolledIndividual =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enrolledIndividual),
                jacksonTypeRef<EnrolledIndividual>(),
            )

        assertThat(roundtrippedEnrolledIndividual).isEqualTo(enrolledIndividual)
    }
}

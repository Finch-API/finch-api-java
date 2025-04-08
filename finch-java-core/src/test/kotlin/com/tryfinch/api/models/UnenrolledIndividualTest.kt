// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UnenrolledIndividualTest {

    @Test
    fun create() {
        val unenrolledIndividual =
            UnenrolledIndividual.builder()
                .body(
                    UnenrolledIndividual.Body.builder()
                        .finchCode("finch_code")
                        .message("message")
                        .name("name")
                        .build()
                )
                .code(0L)
                .individualId("individual_id")
                .build()

        assertThat(unenrolledIndividual.body())
            .contains(
                UnenrolledIndividual.Body.builder()
                    .finchCode("finch_code")
                    .message("message")
                    .name("name")
                    .build()
            )
        assertThat(unenrolledIndividual.code()).contains(0L)
        assertThat(unenrolledIndividual.individualId()).contains("individual_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val unenrolledIndividual =
            UnenrolledIndividual.builder()
                .body(
                    UnenrolledIndividual.Body.builder()
                        .finchCode("finch_code")
                        .message("message")
                        .name("name")
                        .build()
                )
                .code(0L)
                .individualId("individual_id")
                .build()

        val roundtrippedUnenrolledIndividual =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unenrolledIndividual),
                jacksonTypeRef<UnenrolledIndividual>(),
            )

        assertThat(roundtrippedUnenrolledIndividual).isEqualTo(unenrolledIndividual)
    }
}

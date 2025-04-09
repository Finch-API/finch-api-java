// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisDirectoryListIndividualsPageResponseTest {

    @Test
    fun create() {
        val hrisDirectoryListIndividualsPageResponse =
            HrisDirectoryListIndividualsPageResponse.builder()
                .addIndividual(
                    IndividualInDirectory.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .department(IndividualInDirectory.Department.builder().name("name").build())
                        .firstName("first_name")
                        .isActive(true)
                        .lastName("last_name")
                        .manager(
                            IndividualInDirectory.Manager.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .middleName("middle_name")
                        .build()
                )
                .paging(Paging.builder().count(0L).offset(0L).build())
                .build()

        assertThat(hrisDirectoryListIndividualsPageResponse.individuals())
            .containsExactly(
                IndividualInDirectory.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .department(IndividualInDirectory.Department.builder().name("name").build())
                    .firstName("first_name")
                    .isActive(true)
                    .lastName("last_name")
                    .manager(
                        IndividualInDirectory.Manager.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .middleName("middle_name")
                    .build()
            )
        assertThat(hrisDirectoryListIndividualsPageResponse.paging())
            .isEqualTo(Paging.builder().count(0L).offset(0L).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hrisDirectoryListIndividualsPageResponse =
            HrisDirectoryListIndividualsPageResponse.builder()
                .addIndividual(
                    IndividualInDirectory.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .department(IndividualInDirectory.Department.builder().name("name").build())
                        .firstName("first_name")
                        .isActive(true)
                        .lastName("last_name")
                        .manager(
                            IndividualInDirectory.Manager.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .middleName("middle_name")
                        .build()
                )
                .paging(Paging.builder().count(0L).offset(0L).build())
                .build()

        val roundtrippedHrisDirectoryListIndividualsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hrisDirectoryListIndividualsPageResponse),
                jacksonTypeRef<HrisDirectoryListIndividualsPageResponse>(),
            )

        assertThat(roundtrippedHrisDirectoryListIndividualsPageResponse)
            .isEqualTo(hrisDirectoryListIndividualsPageResponse)
    }
}

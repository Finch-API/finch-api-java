// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IndividualResponseTest {

    @Test
    fun createIndividualResponse() {
        val individualResponse =
            IndividualResponse.builder()
                .body(
                    Individual.builder()
                        .id("string")
                        .dob("string")
                        .emails(
                            listOf(
                                Individual.Email.builder()
                                    .data("string")
                                    .type(Individual.Email.Type.WORK)
                                    .build()
                            )
                        )
                        .encryptedSsn("string")
                        .ethnicity(Individual.Ethnicity.ASIAN)
                        .firstName("string")
                        .gender(Individual.Gender.FEMALE)
                        .lastName("string")
                        .middleName("string")
                        .phoneNumbers(
                            listOf(
                                Individual.PhoneNumber.builder()
                                    .data("string")
                                    .type(Individual.PhoneNumber.Type.WORK)
                                    .build()
                            )
                        )
                        .preferredName("string")
                        .residence(
                            Location.builder()
                                .city("string")
                                .country("string")
                                .line1("string")
                                .line2("string")
                                .name("string")
                                .postalCode("string")
                                .sourceId("string")
                                .state("string")
                                .build()
                        )
                        .ssn("string")
                        .build()
                )
                .code(123L)
                .individualId("string")
                .build()
        assertThat(individualResponse).isNotNull
        assertThat(individualResponse.body())
            .contains(
                Individual.builder()
                    .id("string")
                    .dob("string")
                    .emails(
                        listOf(
                            Individual.Email.builder()
                                .data("string")
                                .type(Individual.Email.Type.WORK)
                                .build()
                        )
                    )
                    .encryptedSsn("string")
                    .ethnicity(Individual.Ethnicity.ASIAN)
                    .firstName("string")
                    .gender(Individual.Gender.FEMALE)
                    .lastName("string")
                    .middleName("string")
                    .phoneNumbers(
                        listOf(
                            Individual.PhoneNumber.builder()
                                .data("string")
                                .type(Individual.PhoneNumber.Type.WORK)
                                .build()
                        )
                    )
                    .preferredName("string")
                    .residence(
                        Location.builder()
                            .city("string")
                            .country("string")
                            .line1("string")
                            .line2("string")
                            .name("string")
                            .postalCode("string")
                            .sourceId("string")
                            .state("string")
                            .build()
                    )
                    .ssn("string")
                    .build()
            )
        assertThat(individualResponse.code()).contains(123L)
        assertThat(individualResponse.individualId()).contains("string")
    }
}

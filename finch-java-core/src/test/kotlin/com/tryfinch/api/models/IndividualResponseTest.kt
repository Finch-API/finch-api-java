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
                        .id("id")
                        .dob("dob")
                        .addEmail(
                            Individual.Email.builder()
                                .data("data")
                                .type(Individual.Email.Type.WORK)
                                .build()
                        )
                        .encryptedSsn("encrypted_ssn")
                        .ethnicity(Individual.Ethnicity.ASIAN)
                        .firstName("first_name")
                        .gender(Individual.Gender.FEMALE)
                        .lastName("last_name")
                        .middleName("middle_name")
                        .addPhoneNumber(
                            Individual.PhoneNumber.builder()
                                .data("data")
                                .type(Individual.PhoneNumber.Type.WORK)
                                .build()
                        )
                        .preferredName("preferred_name")
                        .residence(
                            Location.builder()
                                .city("city")
                                .country("country")
                                .line1("line1")
                                .line2("line2")
                                .name("name")
                                .postalCode("postal_code")
                                .sourceId("source_id")
                                .state("state")
                                .build()
                        )
                        .ssn("ssn")
                        .build()
                )
                .code(0L)
                .individualId("individual_id")
                .build()
        assertThat(individualResponse).isNotNull
        assertThat(individualResponse.body())
            .contains(
                Individual.builder()
                    .id("id")
                    .dob("dob")
                    .addEmail(
                        Individual.Email.builder()
                            .data("data")
                            .type(Individual.Email.Type.WORK)
                            .build()
                    )
                    .encryptedSsn("encrypted_ssn")
                    .ethnicity(Individual.Ethnicity.ASIAN)
                    .firstName("first_name")
                    .gender(Individual.Gender.FEMALE)
                    .lastName("last_name")
                    .middleName("middle_name")
                    .addPhoneNumber(
                        Individual.PhoneNumber.builder()
                            .data("data")
                            .type(Individual.PhoneNumber.Type.WORK)
                            .build()
                    )
                    .preferredName("preferred_name")
                    .residence(
                        Location.builder()
                            .city("city")
                            .country("country")
                            .line1("line1")
                            .line2("line2")
                            .name("name")
                            .postalCode("postal_code")
                            .sourceId("source_id")
                            .state("state")
                            .build()
                    )
                    .ssn("ssn")
                    .build()
            )
        assertThat(individualResponse.code()).contains(0L)
        assertThat(individualResponse.individualId()).contains("individual_id")
    }
}

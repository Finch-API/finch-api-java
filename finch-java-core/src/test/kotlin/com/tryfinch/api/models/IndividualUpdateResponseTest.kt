// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IndividualUpdateResponseTest {

    @Test
    fun createIndividualUpdateResponse() {
        val individualUpdateResponse =
            IndividualUpdateResponse.builder()
                .id("string")
                .dob("string")
                .emails(
                    listOf(
                        IndividualUpdateResponse.Email.builder()
                            .data("string")
                            .type(IndividualUpdateResponse.Email.Type.WORK)
                            .build()
                    )
                )
                .encryptedSsn("string")
                .ethnicity(IndividualUpdateResponse.Ethnicity.ASIAN)
                .firstName("string")
                .gender(IndividualUpdateResponse.Gender.FEMALE)
                .lastName("string")
                .middleName("string")
                .phoneNumbers(
                    listOf(
                        IndividualUpdateResponse.PhoneNumber.builder()
                            .data("string")
                            .type(IndividualUpdateResponse.PhoneNumber.Type.WORK)
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
        assertThat(individualUpdateResponse).isNotNull
        assertThat(individualUpdateResponse.id()).contains("string")
        assertThat(individualUpdateResponse.dob()).contains("string")
        assertThat(individualUpdateResponse.emails().get())
            .containsExactly(
                IndividualUpdateResponse.Email.builder()
                    .data("string")
                    .type(IndividualUpdateResponse.Email.Type.WORK)
                    .build()
            )
        assertThat(individualUpdateResponse.encryptedSsn()).contains("string")
        assertThat(individualUpdateResponse.ethnicity())
            .contains(IndividualUpdateResponse.Ethnicity.ASIAN)
        assertThat(individualUpdateResponse.firstName()).contains("string")
        assertThat(individualUpdateResponse.gender())
            .contains(IndividualUpdateResponse.Gender.FEMALE)
        assertThat(individualUpdateResponse.lastName()).contains("string")
        assertThat(individualUpdateResponse.middleName()).contains("string")
        assertThat(individualUpdateResponse.phoneNumbers().get())
            .containsExactly(
                IndividualUpdateResponse.PhoneNumber.builder()
                    .data("string")
                    .type(IndividualUpdateResponse.PhoneNumber.Type.WORK)
                    .build()
            )
        assertThat(individualUpdateResponse.preferredName()).contains("string")
        assertThat(individualUpdateResponse.residence())
            .contains(
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
        assertThat(individualUpdateResponse.ssn()).contains("string")
    }
}

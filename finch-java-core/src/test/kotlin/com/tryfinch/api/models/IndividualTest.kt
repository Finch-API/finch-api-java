package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IndividualTest {

    @Test
    fun createIndividual() {
        val individual =
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
        assertThat(individual).isNotNull
        assertThat(individual.id()).contains("string")
        assertThat(individual.dob()).contains("string")
        assertThat(individual.emails().get())
            .containsExactly(
                Individual.Email.builder().data("string").type(Individual.Email.Type.WORK).build()
            )
        assertThat(individual.firstName()).contains("string")
        assertThat(individual.gender()).contains(Individual.Gender.FEMALE)
        assertThat(individual.lastName()).contains("string")
        assertThat(individual.middleName()).contains("string")
        assertThat(individual.phoneNumbers().get())
            .containsExactly(
                Individual.PhoneNumber.builder()
                    .data("string")
                    .type(Individual.PhoneNumber.Type.WORK)
                    .build()
            )
        assertThat(individual.preferredName()).contains("string")
        assertThat(individual.residence())
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
        assertThat(individual.ssn()).contains("string")
    }
}

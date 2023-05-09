package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IndividualTest {

    @Test
    fun createIndividual() {
        val individual =
            Individual.builder()
                .id("string")
                .firstName("string")
                .middleName("string")
                .lastName("string")
                .preferredName("string")
                .emails(
                    listOf(
                        Individual.Email.builder()
                            .data("string")
                            .type(Individual.Email.Type.WORK)
                            .build()
                    )
                )
                .phoneNumbers(
                    listOf(
                        Individual.PhoneNumber.builder()
                            .data("string")
                            .type(Individual.PhoneNumber.Type.WORK)
                            .build()
                    )
                )
                .gender(Individual.Gender.FEMALE)
                .dob("string")
                .residence(
                    Location.builder()
                        .line1("string")
                        .line2("string")
                        .city("string")
                        .state("string")
                        .postalCode("string")
                        .country("string")
                        .name("string")
                        .sourceId("string")
                        .build()
                )
                .ssn("string")
                .build()
        assertThat(individual).isNotNull
        assertThat(individual.id()).isEqualTo("string")
        assertThat(individual.firstName()).isEqualTo("string")
        assertThat(individual.middleName()).isEqualTo("string")
        assertThat(individual.lastName()).isEqualTo("string")
        assertThat(individual.preferredName()).isEqualTo("string")
        assertThat(individual.emails())
            .containsExactly(
                Individual.Email.builder().data("string").type(Individual.Email.Type.WORK).build()
            )
        assertThat(individual.phoneNumbers())
            .containsExactly(
                Individual.PhoneNumber.builder()
                    .data("string")
                    .type(Individual.PhoneNumber.Type.WORK)
                    .build()
            )
        assertThat(individual.gender()).isEqualTo(Individual.Gender.FEMALE)
        assertThat(individual.dob()).isEqualTo("string")
        assertThat(individual.residence())
            .isEqualTo(
                Location.builder()
                    .line1("string")
                    .line2("string")
                    .city("string")
                    .state("string")
                    .postalCode("string")
                    .country("string")
                    .name("string")
                    .sourceId("string")
                    .build()
            )
        assertThat(individual.ssn()).isEqualTo("string")
    }
}

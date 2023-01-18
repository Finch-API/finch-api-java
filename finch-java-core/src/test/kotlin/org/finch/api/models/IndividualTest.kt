package org.finch.api.models

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
        assertThat(individual.id()).contains("string")
        assertThat(individual.firstName()).contains("string")
        assertThat(individual.middleName()).contains("string")
        assertThat(individual.lastName()).contains("string")
        assertThat(individual.preferredName()).contains("string")
        assertThat(individual.emails().get())
            .containsExactly(
                Individual.Email.builder().data("string").type(Individual.Email.Type.WORK).build()
            )
        assertThat(individual.phoneNumbers().get())
            .containsExactly(
                Individual.PhoneNumber.builder()
                    .data("string")
                    .type(Individual.PhoneNumber.Type.WORK)
                    .build()
            )
        assertThat(individual.gender()).contains(Individual.Gender.FEMALE)
        assertThat(individual.dob()).contains("string")
        assertThat(individual.residence())
            .contains(
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
        assertThat(individual.ssn()).contains("string")
    }
}

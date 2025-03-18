// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualTest {

    @Test
    fun create() {
        val individual =
            Individual.builder()
                .id("id")
                .dob("dob")
                .addEmail(
                    Individual.Email.builder().data("data").type(Individual.Email.Type.WORK).build()
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

        assertThat(individual.id()).contains("id")
        assertThat(individual.dob()).contains("dob")
        assertThat(individual.emails().getOrNull())
            .containsExactly(
                Individual.Email.builder().data("data").type(Individual.Email.Type.WORK).build()
            )
        assertThat(individual.encryptedSsn()).contains("encrypted_ssn")
        assertThat(individual.ethnicity()).contains(Individual.Ethnicity.ASIAN)
        assertThat(individual.firstName()).contains("first_name")
        assertThat(individual.gender()).contains(Individual.Gender.FEMALE)
        assertThat(individual.lastName()).contains("last_name")
        assertThat(individual.middleName()).contains("middle_name")
        assertThat(individual.phoneNumbers().getOrNull())
            .containsExactly(
                Individual.PhoneNumber.builder()
                    .data("data")
                    .type(Individual.PhoneNumber.Type.WORK)
                    .build()
            )
        assertThat(individual.preferredName()).contains("preferred_name")
        assertThat(individual.residence())
            .contains(
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
        assertThat(individual.ssn()).contains("ssn")
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualResponseTest {

    @Test
    fun create() {
        val individualResponse =
            IndividualResponse.builder()
                .body(
                    Individual.UnionMember0.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .dob("dob")
                        .ethnicity(Individual.UnionMember0.Ethnicity.ASIAN)
                        .firstName("first_name")
                        .gender(Individual.UnionMember0.Gender.FEMALE)
                        .lastName("last_name")
                        .middleName("middle_name")
                        .addPhoneNumber(
                            Individual.UnionMember0.PhoneNumber.builder()
                                .data("data")
                                .type(Individual.UnionMember0.PhoneNumber.Type.WORK)
                                .build()
                        )
                        .preferredName("preferred_name")
                        .residence(
                            Location.builder()
                                .city("city")
                                .country("country")
                                .line1("line1")
                                .line2("line2")
                                .postalCode("postal_code")
                                .state("state")
                                .name("name")
                                .sourceId("source_id")
                                .build()
                        )
                        .addEmail(
                            Individual.UnionMember0.Email.builder()
                                .data("data")
                                .type(Individual.UnionMember0.Email.Type.WORK)
                                .build()
                        )
                        .encryptedSsn("encrypted_ssn")
                        .ssn("ssn")
                        .build()
                )
                .code(0L)
                .individualId("individual_id")
                .build()

        assertThat(individualResponse.body())
            .isEqualTo(
                Individual.ofUnionMember0(
                    Individual.UnionMember0.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .dob("dob")
                        .ethnicity(Individual.UnionMember0.Ethnicity.ASIAN)
                        .firstName("first_name")
                        .gender(Individual.UnionMember0.Gender.FEMALE)
                        .lastName("last_name")
                        .middleName("middle_name")
                        .addPhoneNumber(
                            Individual.UnionMember0.PhoneNumber.builder()
                                .data("data")
                                .type(Individual.UnionMember0.PhoneNumber.Type.WORK)
                                .build()
                        )
                        .preferredName("preferred_name")
                        .residence(
                            Location.builder()
                                .city("city")
                                .country("country")
                                .line1("line1")
                                .line2("line2")
                                .postalCode("postal_code")
                                .state("state")
                                .name("name")
                                .sourceId("source_id")
                                .build()
                        )
                        .addEmail(
                            Individual.UnionMember0.Email.builder()
                                .data("data")
                                .type(Individual.UnionMember0.Email.Type.WORK)
                                .build()
                        )
                        .encryptedSsn("encrypted_ssn")
                        .ssn("ssn")
                        .build()
                )
            )
        assertThat(individualResponse.code()).isEqualTo(0L)
        assertThat(individualResponse.individualId()).isEqualTo("individual_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val individualResponse =
            IndividualResponse.builder()
                .body(
                    Individual.UnionMember0.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .dob("dob")
                        .ethnicity(Individual.UnionMember0.Ethnicity.ASIAN)
                        .firstName("first_name")
                        .gender(Individual.UnionMember0.Gender.FEMALE)
                        .lastName("last_name")
                        .middleName("middle_name")
                        .addPhoneNumber(
                            Individual.UnionMember0.PhoneNumber.builder()
                                .data("data")
                                .type(Individual.UnionMember0.PhoneNumber.Type.WORK)
                                .build()
                        )
                        .preferredName("preferred_name")
                        .residence(
                            Location.builder()
                                .city("city")
                                .country("country")
                                .line1("line1")
                                .line2("line2")
                                .postalCode("postal_code")
                                .state("state")
                                .name("name")
                                .sourceId("source_id")
                                .build()
                        )
                        .addEmail(
                            Individual.UnionMember0.Email.builder()
                                .data("data")
                                .type(Individual.UnionMember0.Email.Type.WORK)
                                .build()
                        )
                        .encryptedSsn("encrypted_ssn")
                        .ssn("ssn")
                        .build()
                )
                .code(0L)
                .individualId("individual_id")
                .build()

        val roundtrippedIndividualResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(individualResponse),
                jacksonTypeRef<IndividualResponse>(),
            )

        assertThat(roundtrippedIndividualResponse).isEqualTo(individualResponse)
    }
}

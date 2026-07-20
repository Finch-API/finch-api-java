// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisIndividualRetrieveManyPageResponseTest {

    @Test
    fun create() {
        val hrisIndividualRetrieveManyPageResponse =
            HrisIndividualRetrieveManyPageResponse.builder()
                .addResponse(
                    IndividualResponse.builder()
                        .body(
                            Individual.IndividualResponseBody.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .dob("dob")
                                .ethnicity(Individual.IndividualResponseBody.Ethnicity.ASIAN)
                                .firstName("first_name")
                                .gender(Individual.IndividualResponseBody.Gender.FEMALE)
                                .lastName("last_name")
                                .maritalStatus(
                                    Individual.IndividualResponseBody.MaritalStatus.SINGLE
                                )
                                .middleName("middle_name")
                                .addPhoneNumber(
                                    Individual.IndividualResponseBody.PhoneNumber.builder()
                                        .data("data")
                                        .type(
                                            Individual.IndividualResponseBody.PhoneNumber.Type.WORK
                                        )
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
                                    Individual.IndividualResponseBody.Email.builder()
                                        .data("data")
                                        .type(Individual.IndividualResponseBody.Email.Type.WORK)
                                        .build()
                                )
                                .encryptedSsn("encrypted_ssn")
                                .ssn("ssn")
                                .build()
                        )
                        .code(0L)
                        .individualId("individual_id")
                        .build()
                )
                .build()

        assertThat(hrisIndividualRetrieveManyPageResponse.responses())
            .containsExactly(
                IndividualResponse.builder()
                    .body(
                        Individual.IndividualResponseBody.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .dob("dob")
                            .ethnicity(Individual.IndividualResponseBody.Ethnicity.ASIAN)
                            .firstName("first_name")
                            .gender(Individual.IndividualResponseBody.Gender.FEMALE)
                            .lastName("last_name")
                            .maritalStatus(Individual.IndividualResponseBody.MaritalStatus.SINGLE)
                            .middleName("middle_name")
                            .addPhoneNumber(
                                Individual.IndividualResponseBody.PhoneNumber.builder()
                                    .data("data")
                                    .type(Individual.IndividualResponseBody.PhoneNumber.Type.WORK)
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
                                Individual.IndividualResponseBody.Email.builder()
                                    .data("data")
                                    .type(Individual.IndividualResponseBody.Email.Type.WORK)
                                    .build()
                            )
                            .encryptedSsn("encrypted_ssn")
                            .ssn("ssn")
                            .build()
                    )
                    .code(0L)
                    .individualId("individual_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hrisIndividualRetrieveManyPageResponse =
            HrisIndividualRetrieveManyPageResponse.builder()
                .addResponse(
                    IndividualResponse.builder()
                        .body(
                            Individual.IndividualResponseBody.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .dob("dob")
                                .ethnicity(Individual.IndividualResponseBody.Ethnicity.ASIAN)
                                .firstName("first_name")
                                .gender(Individual.IndividualResponseBody.Gender.FEMALE)
                                .lastName("last_name")
                                .maritalStatus(
                                    Individual.IndividualResponseBody.MaritalStatus.SINGLE
                                )
                                .middleName("middle_name")
                                .addPhoneNumber(
                                    Individual.IndividualResponseBody.PhoneNumber.builder()
                                        .data("data")
                                        .type(
                                            Individual.IndividualResponseBody.PhoneNumber.Type.WORK
                                        )
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
                                    Individual.IndividualResponseBody.Email.builder()
                                        .data("data")
                                        .type(Individual.IndividualResponseBody.Email.Type.WORK)
                                        .build()
                                )
                                .encryptedSsn("encrypted_ssn")
                                .ssn("ssn")
                                .build()
                        )
                        .code(0L)
                        .individualId("individual_id")
                        .build()
                )
                .build()

        val roundtrippedHrisIndividualRetrieveManyPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hrisIndividualRetrieveManyPageResponse),
                jacksonTypeRef<HrisIndividualRetrieveManyPageResponse>(),
            )

        assertThat(roundtrippedHrisIndividualRetrieveManyPageResponse)
            .isEqualTo(hrisIndividualRetrieveManyPageResponse)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualUpdateResponseTest {

    @Test
    fun create() {
        val individualUpdateResponse =
            IndividualUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dob("dob")
                .addEmail(
                    IndividualUpdateResponse.Email.builder()
                        .data("data")
                        .type(IndividualUpdateResponse.Email.Type.WORK)
                        .build()
                )
                .encryptedSsn("encrypted_ssn")
                .ethnicity(IndividualUpdateResponse.Ethnicity.ASIAN)
                .firstName("first_name")
                .gender(IndividualUpdateResponse.Gender.FEMALE)
                .lastName("last_name")
                .middleName("middle_name")
                .addPhoneNumber(
                    IndividualUpdateResponse.PhoneNumber.builder()
                        .data("data")
                        .type(IndividualUpdateResponse.PhoneNumber.Type.WORK)
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

        assertThat(individualUpdateResponse.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(individualUpdateResponse.dob()).contains("dob")
        assertThat(individualUpdateResponse.emails().getOrNull())
            .containsExactly(
                IndividualUpdateResponse.Email.builder()
                    .data("data")
                    .type(IndividualUpdateResponse.Email.Type.WORK)
                    .build()
            )
        assertThat(individualUpdateResponse.encryptedSsn()).contains("encrypted_ssn")
        assertThat(individualUpdateResponse.ethnicity())
            .contains(IndividualUpdateResponse.Ethnicity.ASIAN)
        assertThat(individualUpdateResponse.firstName()).contains("first_name")
        assertThat(individualUpdateResponse.gender())
            .contains(IndividualUpdateResponse.Gender.FEMALE)
        assertThat(individualUpdateResponse.lastName()).contains("last_name")
        assertThat(individualUpdateResponse.middleName()).contains("middle_name")
        assertThat(individualUpdateResponse.phoneNumbers().getOrNull())
            .containsExactly(
                IndividualUpdateResponse.PhoneNumber.builder()
                    .data("data")
                    .type(IndividualUpdateResponse.PhoneNumber.Type.WORK)
                    .build()
            )
        assertThat(individualUpdateResponse.preferredName()).contains("preferred_name")
        assertThat(individualUpdateResponse.residence())
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
        assertThat(individualUpdateResponse.ssn()).contains("ssn")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val individualUpdateResponse =
            IndividualUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dob("dob")
                .addEmail(
                    IndividualUpdateResponse.Email.builder()
                        .data("data")
                        .type(IndividualUpdateResponse.Email.Type.WORK)
                        .build()
                )
                .encryptedSsn("encrypted_ssn")
                .ethnicity(IndividualUpdateResponse.Ethnicity.ASIAN)
                .firstName("first_name")
                .gender(IndividualUpdateResponse.Gender.FEMALE)
                .lastName("last_name")
                .middleName("middle_name")
                .addPhoneNumber(
                    IndividualUpdateResponse.PhoneNumber.builder()
                        .data("data")
                        .type(IndividualUpdateResponse.PhoneNumber.Type.WORK)
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

        val roundtrippedIndividualUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(individualUpdateResponse),
                jacksonTypeRef<IndividualUpdateResponse>(),
            )

        assertThat(roundtrippedIndividualUpdateResponse).isEqualTo(individualUpdateResponse)
    }
}

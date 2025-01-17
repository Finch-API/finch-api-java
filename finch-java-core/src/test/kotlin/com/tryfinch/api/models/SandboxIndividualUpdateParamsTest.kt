// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SandboxIndividualUpdateParamsTest {

    @Test
    fun createSandboxIndividualUpdateParams() {
        SandboxIndividualUpdateParams.builder()
            .individualId("individual_id")
            .dob("12/20/1989")
            .emails(
                listOf(
                    SandboxIndividualUpdateParams.Email.builder()
                        .data("data")
                        .type(SandboxIndividualUpdateParams.Email.Type.WORK)
                        .build()
                )
            )
            .encryptedSsn("encrypted_ssn")
            .ethnicity(SandboxIndividualUpdateParams.Ethnicity.ASIAN)
            .firstName("first_name")
            .gender(SandboxIndividualUpdateParams.Gender.FEMALE)
            .lastName("last_name")
            .middleName("middle_name")
            .phoneNumbers(
                listOf(
                    SandboxIndividualUpdateParams.PhoneNumber.builder()
                        .data("data")
                        .type(SandboxIndividualUpdateParams.PhoneNumber.Type.WORK)
                        .build()
                )
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
    }

    @Test
    fun getBody() {
        val params =
            SandboxIndividualUpdateParams.builder()
                .individualId("individual_id")
                .dob("12/20/1989")
                .emails(
                    listOf(
                        SandboxIndividualUpdateParams.Email.builder()
                            .data("data")
                            .type(SandboxIndividualUpdateParams.Email.Type.WORK)
                            .build()
                    )
                )
                .encryptedSsn("encrypted_ssn")
                .ethnicity(SandboxIndividualUpdateParams.Ethnicity.ASIAN)
                .firstName("first_name")
                .gender(SandboxIndividualUpdateParams.Gender.FEMALE)
                .lastName("last_name")
                .middleName("middle_name")
                .phoneNumbers(
                    listOf(
                        SandboxIndividualUpdateParams.PhoneNumber.builder()
                            .data("data")
                            .type(SandboxIndividualUpdateParams.PhoneNumber.Type.WORK)
                            .build()
                    )
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.dob()).contains("12/20/1989")
        assertThat(body.emails())
            .contains(
                listOf(
                    SandboxIndividualUpdateParams.Email.builder()
                        .data("data")
                        .type(SandboxIndividualUpdateParams.Email.Type.WORK)
                        .build()
                )
            )
        assertThat(body.encryptedSsn()).contains("encrypted_ssn")
        assertThat(body.ethnicity()).contains(SandboxIndividualUpdateParams.Ethnicity.ASIAN)
        assertThat(body.firstName()).contains("first_name")
        assertThat(body.gender()).contains(SandboxIndividualUpdateParams.Gender.FEMALE)
        assertThat(body.lastName()).contains("last_name")
        assertThat(body.middleName()).contains("middle_name")
        assertThat(body.phoneNumbers())
            .contains(
                listOf(
                    SandboxIndividualUpdateParams.PhoneNumber.builder()
                        .data("data")
                        .type(SandboxIndividualUpdateParams.PhoneNumber.Type.WORK)
                        .build()
                )
            )
        assertThat(body.preferredName()).contains("preferred_name")
        assertThat(body.residence())
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
        assertThat(body.ssn()).contains("ssn")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = SandboxIndividualUpdateParams.builder().individualId("individual_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = SandboxIndividualUpdateParams.builder().individualId("individual_id").build()
        assertThat(params).isNotNull
        // path param "individualId"
        assertThat(params.getPathParam(0)).isEqualTo("individual_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}

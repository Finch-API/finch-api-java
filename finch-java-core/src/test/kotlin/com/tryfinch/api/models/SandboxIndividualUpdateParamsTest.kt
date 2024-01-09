// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SandboxIndividualUpdateParamsTest {

    @Test
    fun createSandboxIndividualUpdateParams() {
        SandboxIndividualUpdateParams.builder()
            .individualId("string")
            .dob("string")
            .emails(
                listOf(
                    SandboxIndividualUpdateParams.Email.builder()
                        .data("string")
                        .type(SandboxIndividualUpdateParams.Email.Type.WORK)
                        .build()
                )
            )
            .encryptedSsn("string")
            .ethnicity(SandboxIndividualUpdateParams.Ethnicity.ASIAN)
            .firstName("string")
            .gender(SandboxIndividualUpdateParams.Gender.FEMALE)
            .lastName("string")
            .middleName("string")
            .phoneNumbers(
                listOf(
                    SandboxIndividualUpdateParams.PhoneNumber.builder()
                        .data("string")
                        .type(SandboxIndividualUpdateParams.PhoneNumber.Type.WORK)
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
    }

    @Test
    fun getBody() {
        val params =
            SandboxIndividualUpdateParams.builder()
                .individualId("string")
                .dob("string")
                .emails(
                    listOf(
                        SandboxIndividualUpdateParams.Email.builder()
                            .data("string")
                            .type(SandboxIndividualUpdateParams.Email.Type.WORK)
                            .build()
                    )
                )
                .encryptedSsn("string")
                .ethnicity(SandboxIndividualUpdateParams.Ethnicity.ASIAN)
                .firstName("string")
                .gender(SandboxIndividualUpdateParams.Gender.FEMALE)
                .lastName("string")
                .middleName("string")
                .phoneNumbers(
                    listOf(
                        SandboxIndividualUpdateParams.PhoneNumber.builder()
                            .data("string")
                            .type(SandboxIndividualUpdateParams.PhoneNumber.Type.WORK)
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.dob()).isEqualTo("string")
        assertThat(body.emails())
            .isEqualTo(
                listOf(
                    SandboxIndividualUpdateParams.Email.builder()
                        .data("string")
                        .type(SandboxIndividualUpdateParams.Email.Type.WORK)
                        .build()
                )
            )
        assertThat(body.encryptedSsn()).isEqualTo("string")
        assertThat(body.ethnicity()).isEqualTo(SandboxIndividualUpdateParams.Ethnicity.ASIAN)
        assertThat(body.firstName()).isEqualTo("string")
        assertThat(body.gender()).isEqualTo(SandboxIndividualUpdateParams.Gender.FEMALE)
        assertThat(body.lastName()).isEqualTo("string")
        assertThat(body.middleName()).isEqualTo("string")
        assertThat(body.phoneNumbers())
            .isEqualTo(
                listOf(
                    SandboxIndividualUpdateParams.PhoneNumber.builder()
                        .data("string")
                        .type(SandboxIndividualUpdateParams.PhoneNumber.Type.WORK)
                        .build()
                )
            )
        assertThat(body.preferredName()).isEqualTo("string")
        assertThat(body.residence())
            .isEqualTo(
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
        assertThat(body.ssn()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = SandboxIndividualUpdateParams.builder().individualId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = SandboxIndividualUpdateParams.builder().individualId("string").build()
        assertThat(params).isNotNull
        // path param "individualId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SandboxIndividualUpdateParamsTest {

    @Test
    fun create() {
        SandboxIndividualUpdateParams.builder()
            .individualId("individual_id")
            .dob("dob")
            .addEmail(
                SandboxIndividualUpdateParams.Email.builder()
                    .data("data")
                    .type(SandboxIndividualUpdateParams.Email.Type.WORK)
                    .build()
            )
            .encryptedSsn("encrypted_ssn")
            .ethnicity(SandboxIndividualUpdateParams.Ethnicity.ASIAN)
            .firstName("first_name")
            .gender(SandboxIndividualUpdateParams.Gender.FEMALE)
            .lastName("last_name")
            .middleName("middle_name")
            .addPhoneNumber(
                SandboxIndividualUpdateParams.PhoneNumber.builder()
                    .data("data")
                    .type(SandboxIndividualUpdateParams.PhoneNumber.Type.WORK)
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
            .ssn("ssn")
            .build()
    }

    @Test
    fun pathParams() {
        val params = SandboxIndividualUpdateParams.builder().individualId("individual_id").build()

        assertThat(params._pathParam(0)).isEqualTo("individual_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SandboxIndividualUpdateParams.builder()
                .individualId("individual_id")
                .dob("dob")
                .addEmail(
                    SandboxIndividualUpdateParams.Email.builder()
                        .data("data")
                        .type(SandboxIndividualUpdateParams.Email.Type.WORK)
                        .build()
                )
                .encryptedSsn("encrypted_ssn")
                .ethnicity(SandboxIndividualUpdateParams.Ethnicity.ASIAN)
                .firstName("first_name")
                .gender(SandboxIndividualUpdateParams.Gender.FEMALE)
                .lastName("last_name")
                .middleName("middle_name")
                .addPhoneNumber(
                    SandboxIndividualUpdateParams.PhoneNumber.builder()
                        .data("data")
                        .type(SandboxIndividualUpdateParams.PhoneNumber.Type.WORK)
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
                .ssn("ssn")
                .build()

        val body = params._body()

        assertThat(body.dob()).contains("dob")
        assertThat(body.emails().getOrNull())
            .containsExactly(
                SandboxIndividualUpdateParams.Email.builder()
                    .data("data")
                    .type(SandboxIndividualUpdateParams.Email.Type.WORK)
                    .build()
            )
        assertThat(body.encryptedSsn()).contains("encrypted_ssn")
        assertThat(body.ethnicity()).contains(SandboxIndividualUpdateParams.Ethnicity.ASIAN)
        assertThat(body.firstName()).contains("first_name")
        assertThat(body.gender()).contains(SandboxIndividualUpdateParams.Gender.FEMALE)
        assertThat(body.lastName()).contains("last_name")
        assertThat(body.middleName()).contains("middle_name")
        assertThat(body.phoneNumbers().getOrNull())
            .containsExactly(
                SandboxIndividualUpdateParams.PhoneNumber.builder()
                    .data("data")
                    .type(SandboxIndividualUpdateParams.PhoneNumber.Type.WORK)
                    .build()
            )
        assertThat(body.preferredName()).contains("preferred_name")
        assertThat(body.residence())
            .contains(
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
        assertThat(body.ssn()).contains("ssn")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SandboxIndividualUpdateParams.builder().individualId("individual_id").build()

        val body = params._body()
    }
}

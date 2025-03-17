// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.Location
import com.tryfinch.api.models.SandboxIndividualUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IndividualServiceAsyncTest {

    @Test
    fun update() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val individualServiceAsync = client.sandbox().individual()

        val individualFuture =
            individualServiceAsync.update(
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
                            .name("name")
                            .postalCode("postal_code")
                            .sourceId("source_id")
                            .state("state")
                            .build()
                    )
                    .ssn("ssn")
                    .build()
            )

        val individual = individualFuture.get()
        individual.validate()
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.Location
import com.tryfinch.api.models.SandboxIndividualUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class IndividualServiceTest {

    @Test
    fun callUpdate() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val individualService = client.sandbox().individual()
        val individualUpdateResponse =
            individualService.update(
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
            )
        println(individualUpdateResponse)
        individualUpdateResponse.validate()
    }
}

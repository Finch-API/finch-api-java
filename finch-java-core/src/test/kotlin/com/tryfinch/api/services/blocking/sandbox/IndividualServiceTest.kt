// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
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
            )
        println(individualUpdateResponse)
        individualUpdateResponse.validate()
    }
}

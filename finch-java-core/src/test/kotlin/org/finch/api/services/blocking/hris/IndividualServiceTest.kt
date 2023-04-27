package org.finch.api.services.blocking.hris

import org.finch.api.TestServerExtension
import org.finch.api.client.okhttp.FinchOkHttpClient
import org.finch.api.models.*
import org.finch.api.models.HrisIndividualRetrieveManyParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class IndividualServiceTest {

    @Test
    fun callRetrieveMany() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .clientId("string")
                .clientSecret("string")
                .build()
        val individualService = client.hris().individuals()
        val getIndividualsResponse =
            individualService.retrieveMany(HrisIndividualRetrieveManyParams.builder().build())
        println(getIndividualsResponse)
        getIndividualsResponse.responses().forEach { it.validate() }
    }
}

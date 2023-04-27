package org.finch.api.services.blocking.ats

import org.finch.api.TestServerExtension
import org.finch.api.client.okhttp.FinchOkHttpClient
import org.finch.api.models.*
import org.finch.api.models.AtsCandidateListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CandidateServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .clientId("string")
                .clientSecret("string")
                .build()
        val candidateService = client.ats().candidates()
        val candidate =
            candidateService.retrieve(
                AtsCandidateRetrieveParams.builder().candidateId("string").build()
            )
        println(candidate)
        candidate.validate()
    }

    @Test
    fun callList() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .clientId("string")
                .clientSecret("string")
                .build()
        val candidateService = client.ats().candidates()
        val response = candidateService.list(AtsCandidateListParams.builder().build())
        println(response)
        response.candidates().forEach { it.validate() }
    }
}

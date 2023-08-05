package com.tryfinch.api.services.blocking.ats

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import com.tryfinch.api.models.AtsCandidateListParams
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
                .build()
        val candidateService = client.ats().candidates()
        val response = candidateService.list(AtsCandidateListParams.builder().build())
        println(response)
        response.candidates().forEach { it.validate() }
    }
}

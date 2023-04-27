package org.finch.api.services.blocking.ats

import org.finch.api.TestServerExtension
import org.finch.api.client.okhttp.FinchOkHttpClient
import org.finch.api.models.*
import org.finch.api.models.AtsJobListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class JobServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .clientId("string")
                .clientSecret("string")
                .build()
        val jobService = client.ats().jobs()
        val job = jobService.retrieve(AtsJobRetrieveParams.builder().jobId("string").build())
        println(job)
        job.validate()
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
        val jobService = client.ats().jobs()
        val response = jobService.list(AtsJobListParams.builder().build())
        println(response)
        response.jobs().forEach { it.validate() }
    }
}

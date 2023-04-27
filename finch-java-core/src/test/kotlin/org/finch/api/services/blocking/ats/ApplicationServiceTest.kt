package org.finch.api.services.blocking.ats

import org.finch.api.TestServerExtension
import org.finch.api.client.okhttp.FinchOkHttpClient
import org.finch.api.models.*
import org.finch.api.models.AtsApplicationListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ApplicationServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .clientId("string")
                .clientSecret("string")
                .build()
        val applicationService = client.ats().applications()
        val application =
            applicationService.retrieve(
                AtsApplicationRetrieveParams.builder().applicationId("string").build()
            )
        println(application)
        application.validate()
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
        val applicationService = client.ats().applications()
        val response = applicationService.list(AtsApplicationListParams.builder().build())
        println(response)
        response.applications().forEach { it.validate() }
    }
}

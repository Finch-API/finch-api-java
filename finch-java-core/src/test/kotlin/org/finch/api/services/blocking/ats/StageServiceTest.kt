package org.finch.api.services.blocking.ats

import org.finch.api.TestServerExtension
import org.finch.api.client.okhttp.FinchOkHttpClient
import org.finch.api.models.*
import org.finch.api.models.AtsStageListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class StageServiceTest {

    @Test
    fun callList() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .clientId("string")
                .clientSecret("string")
                .build()
        val stageService = client.ats().stages()
        val response = stageService.list(AtsStageListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }
}

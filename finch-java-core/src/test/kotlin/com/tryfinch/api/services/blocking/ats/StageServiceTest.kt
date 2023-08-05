package com.tryfinch.api.services.blocking.ats

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import com.tryfinch.api.models.AtsStageListParams
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
                .build()
        val stageService = client.ats().stages()
        val response = stageService.list(AtsStageListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }
}

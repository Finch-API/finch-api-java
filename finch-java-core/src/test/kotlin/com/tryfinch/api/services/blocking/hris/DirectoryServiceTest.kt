package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import com.tryfinch.api.models.HriDirectoryListIndividualsParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DirectoryServiceTest {

    @Test
    fun callListIndividuals() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .clientId("string")
                .clientSecret("string")
                .build()
        val directoryService = client.hris().directory()
        val getDirectoryResponse =
            directoryService.listIndividuals(HriDirectoryListIndividualsParams.builder().build())
        println(getDirectoryResponse)
        getDirectoryResponse.individuals().forEach { it.validate() }
    }
}

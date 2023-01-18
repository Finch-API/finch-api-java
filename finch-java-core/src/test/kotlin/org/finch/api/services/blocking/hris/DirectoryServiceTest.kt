package org.finch.api.services.blocking.hris

import org.finch.api.TestServerExtension
import org.finch.api.client.okhttp.FinchOkHttpClient
import org.finch.api.models.*
import org.finch.api.models.HrisDirectoryListIndividualsParams
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
            directoryService.listIndividuals(HrisDirectoryListIndividualsParams.builder().build())
        println(getDirectoryResponse)
        getDirectoryResponse.individuals().forEach { it.validate() }
    }
}

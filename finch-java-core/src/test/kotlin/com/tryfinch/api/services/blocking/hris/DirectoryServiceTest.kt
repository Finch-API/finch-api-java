// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import com.tryfinch.api.models.HrisDirectoryListIndividualsParams
import com.tryfinch.api.models.HrisDirectoryListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DirectoryServiceTest {

    @Test
    fun callList() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val directoryService = client.hris().directory()
        val getDirectoryResponse = directoryService.list(HrisDirectoryListParams.builder().build())
        println(getDirectoryResponse)
        getDirectoryResponse.individuals().forEach { it.validate() }
    }

    @Test
    fun callListIndividuals() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val directoryService = client.hris().directory()
        @Suppress("DEPRECATION")
        val getDirectoryResponse =
            directoryService.listIndividuals(HrisDirectoryListIndividualsParams.builder().build())
        println(getDirectoryResponse)
        getDirectoryResponse.individuals().forEach { it.validate() }
    }
}

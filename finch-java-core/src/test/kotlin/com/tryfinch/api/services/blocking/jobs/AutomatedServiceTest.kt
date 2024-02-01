// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.jobs

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import com.tryfinch.api.models.JobAutomatedListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AutomatedServiceTest {

    @Test
    fun callCreate() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val automatedService = client.jobs().automated()
        val automatedCreateResponse =
            automatedService.create(
                JobAutomatedCreateParams.builder()
                    .type(JobAutomatedCreateParams.Type.DATA_SYNC_ALL)
                    .build()
            )
        println(automatedCreateResponse)
        automatedCreateResponse.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val automatedService = client.jobs().automated()
        val automatedAsyncJob =
            automatedService.retrieve(JobAutomatedRetrieveParams.builder().jobId("string").build())
        println(automatedAsyncJob)
        automatedAsyncJob.validate()
    }

    @Test
    fun callList() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val automatedService = client.jobs().automated()
        val response = automatedService.list(JobAutomatedListParams.builder().build())
        println(response)
        response.data().forEach { it.validate() }
    }
}

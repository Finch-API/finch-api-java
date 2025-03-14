// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.jobs

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.JobAutomatedCreateParams
import com.tryfinch.api.models.JobAutomatedListParams
import com.tryfinch.api.models.JobAutomatedRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AutomatedServiceTest {

    @Test
    fun create() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val automatedService = client.jobs().automated()

        val automated =
            automatedService.create(
                JobAutomatedCreateParams.builder()
                    .body(
                        JobAutomatedCreateParams.Body.DataSyncAll.builder()
                            .type(JobAutomatedCreateParams.Body.DataSyncAll.Type.DATA_SYNC_ALL)
                            .build()
                    )
                    .build()
            )

        automated.validate()
    }

    @Test
    fun retrieve() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val automatedService = client.jobs().automated()

        val automatedAsyncJob =
            automatedService.retrieve(JobAutomatedRetrieveParams.builder().jobId("job_id").build())

        automatedAsyncJob.validate()
    }

    @Test
    fun list() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val automatedService = client.jobs().automated()

        val automated =
            automatedService.list(JobAutomatedListParams.builder().limit(0L).offset(0L).build())

        automated.validate()
    }
}

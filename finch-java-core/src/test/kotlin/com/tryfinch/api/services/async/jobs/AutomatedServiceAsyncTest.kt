// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.jobs

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.JobAutomatedCreateParams
import com.tryfinch.api.models.JobAutomatedListParams
import com.tryfinch.api.models.JobAutomatedRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AutomatedServiceAsyncTest {

    @Test
    fun create() {
      val client = FinchOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .accessToken("My Access Token")
          .build()
      val automatedServiceAsync = client.jobs().automated()

      val automatedFuture = automatedServiceAsync.create(JobAutomatedCreateParams.builder()
          .body(JobAutomatedCreateParams.Body.DataSyncAll.builder()
              .type(JobAutomatedCreateParams.Body.DataSyncAll.Type.DATA_SYNC_ALL)
              .build())
          .build())

      val automated = automatedFuture.get()
      automated.validate()
    }

    @Test
    fun retrieve() {
      val client = FinchOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .accessToken("My Access Token")
          .build()
      val automatedServiceAsync = client.jobs().automated()

      val automatedAsyncJobFuture = automatedServiceAsync.retrieve(JobAutomatedRetrieveParams.builder()
          .jobId("job_id")
          .build())

      val automatedAsyncJob = automatedAsyncJobFuture.get()
      automatedAsyncJob.validate()
    }

    @Test
    fun list() {
      val client = FinchOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .accessToken("My Access Token")
          .build()
      val automatedServiceAsync = client.jobs().automated()

      val pageFuture = automatedServiceAsync.list()

      val page = pageFuture.get()
      page.response().validate()
    }
}

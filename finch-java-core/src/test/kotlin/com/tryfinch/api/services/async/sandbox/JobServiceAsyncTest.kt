// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.SandboxJobCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class JobServiceAsyncTest {

    @Test
    fun create() {
      val client = FinchOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .accessToken("My Access Token")
          .build()
      val jobServiceAsync = client.sandbox().jobs()

      val jobFuture = jobServiceAsync.create(SandboxJobCreateParams.builder()
          .type(SandboxJobCreateParams.Type.DATA_SYNC_ALL)
          .build())

      val job = jobFuture.get()
      job.validate()
    }
}

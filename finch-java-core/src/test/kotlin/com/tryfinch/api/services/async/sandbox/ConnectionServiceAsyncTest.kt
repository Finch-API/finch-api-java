// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.SandboxConnectionCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ConnectionServiceAsyncTest {

    @Test
    fun create() {
      val client = FinchOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .accessToken("My Access Token")
          .build()
      val connectionServiceAsync = client.sandbox().connections()

      val connectionFuture = connectionServiceAsync.create(SandboxConnectionCreateParams.builder()
          .providerId("provider_id")
          .authenticationType(SandboxConnectionCreateParams.AuthenticationType.CREDENTIAL)
          .employeeSize(0L)
          .addProduct("string")
          .build())

      val connection = connectionFuture.get()
      connection.validate()
    }
}

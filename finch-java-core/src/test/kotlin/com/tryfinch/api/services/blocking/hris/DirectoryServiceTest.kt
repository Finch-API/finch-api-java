// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.HrisDirectoryListIndividualsParams
import com.tryfinch.api.models.HrisDirectoryListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DirectoryServiceTest {

    @Test
    fun list() {
      val client = FinchOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .accessToken("My Access Token")
          .build()
      val directoryService = client.hris().directory()

      val page = directoryService.list()

      page.response().validate()
    }

    @Test
    fun listIndividuals() {
      val client = FinchOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .accessToken("My Access Token")
          .build()
      val directoryService = client.hris().directory()

      val page = directoryService.listIndividuals()

      page.response().validate()
    }
}

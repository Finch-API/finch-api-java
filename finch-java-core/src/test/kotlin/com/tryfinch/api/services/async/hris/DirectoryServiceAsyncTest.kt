// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DirectoryServiceAsyncTest {

    @Test
    fun list() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val directoryServiceAsync = client.hris().directory()

        val pageFuture = directoryServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun listIndividuals() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val directoryServiceAsync = client.hris().directory()

        val pageFuture = directoryServiceAsync.listIndividuals()

        val page = pageFuture.get()
        page.response().validate()
    }
}

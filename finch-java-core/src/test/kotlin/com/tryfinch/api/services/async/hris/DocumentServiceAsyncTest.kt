// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.HrisDocumentListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DocumentServiceAsyncTest {

    @Test
    fun list() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val documentServiceAsync = client.hris().documents()

        val documentsFuture =
            documentServiceAsync.list(
                HrisDocumentListParams.builder()
                    .addIndividualId("string")
                    .limit(0L)
                    .offset(0L)
                    .addType(HrisDocumentListParams.Type.W4_2020)
                    .build()
            )

        val documents = documentsFuture.get()
        documents.validate()
    }

    @Test
    fun retreive() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val documentServiceAsync = client.hris().documents()

        val responseFuture = documentServiceAsync.retreive("document_id")

        val response = responseFuture.get()
        response.validate()
    }
}

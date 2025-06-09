// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.HrisDocumentListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DocumentServiceTest {

    @Test
    fun list() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val documentService = client.hris().documents()

        val documents =
            documentService.list(
                HrisDocumentListParams.builder()
                    .addIndividualId("string")
                    .limit(0L)
                    .offset(0L)
                    .addType(HrisDocumentListParams.Type.W4_2020)
                    .build()
            )

        documents.validate()
    }

    @Test
    fun retreive() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val documentService = client.hris().documents()

        val response = documentService.retreive("document_id")

        response.validate()
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.HrisDocumentListParams
import com.tryfinch.api.models.HrisDocumentRetreiveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DocumentServiceTest {

    @Test
    fun callList() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val documentService = client.hris().documents()
        val documentListResponse =
            documentService.list(
                HrisDocumentListParams.builder()
                    .addIndividualId("string")
                    .limit(0L)
                    .offset(0L)
                    .addType(HrisDocumentListParams.Type.W4_2020)
                    .build()
            )
        println(documentListResponse)
        documentListResponse.validate()
    }

    @Test
    fun callRetreive() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val documentService = client.hris().documents()
        val documentRetreiveResponse =
            documentService.retreive(
                HrisDocumentRetreiveParams.builder().documentId("document_id").build()
            )
        println(documentRetreiveResponse)
    }
}

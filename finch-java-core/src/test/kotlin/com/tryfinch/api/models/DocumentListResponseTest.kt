// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DocumentListResponseTest {

    @Test
    fun createDocumentListResponse() {
        val documentListResponse =
            DocumentListResponse.builder()
                .addDocument(
                    DocumentResponse.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .individualId("individual_id")
                        .type(DocumentResponse.Type.W4_2020)
                        .url("https://example.com")
                        .year(0.0)
                        .build()
                )
                .paging(Paging.builder().count(0L).offset(0L).build())
                .build()
        assertThat(documentListResponse).isNotNull
        assertThat(documentListResponse.documents())
            .containsExactly(
                DocumentResponse.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .individualId("individual_id")
                    .type(DocumentResponse.Type.W4_2020)
                    .url("https://example.com")
                    .year(0.0)
                    .build()
            )
        assertThat(documentListResponse.paging())
            .isEqualTo(Paging.builder().count(0L).offset(0L).build())
    }
}

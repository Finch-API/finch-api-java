// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentListResponseTest {

    @Test
    fun create() {
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
                .paging(Paging.builder().offset(0L).count(0L).build())
                .build()

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
            .isEqualTo(Paging.builder().offset(0L).count(0L).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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
                .paging(Paging.builder().offset(0L).count(0L).build())
                .build()

        val roundtrippedDocumentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentListResponse),
                jacksonTypeRef<DocumentListResponse>(),
            )

        assertThat(roundtrippedDocumentListResponse).isEqualTo(documentListResponse)
    }
}

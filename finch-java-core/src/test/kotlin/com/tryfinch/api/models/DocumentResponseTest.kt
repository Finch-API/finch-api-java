// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentResponseTest {

    @Test
    fun createDocumentResponse() {
        val documentResponse =
            DocumentResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .individualId("individual_id")
                .type(DocumentResponse.Type.W4_2020)
                .url("https://example.com")
                .year(0.0)
                .build()
        assertThat(documentResponse).isNotNull
        assertThat(documentResponse.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(documentResponse.individualId()).contains("individual_id")
        assertThat(documentResponse.type()).contains(DocumentResponse.Type.W4_2020)
        assertThat(documentResponse.url()).contains("https://example.com")
        assertThat(documentResponse.year()).contains(0.0)
    }
}

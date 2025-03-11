// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HrisDocumentRetreiveParamsTest {

    @Test
    fun create() {
        HrisDocumentRetreiveParams.builder().documentId("document_id").build()
    }

    @Test
    fun getPathParam() {
        val params = HrisDocumentRetreiveParams.builder().documentId("document_id").build()
        assertThat(params).isNotNull
        // path param "documentId"
        assertThat(params.getPathParam(0)).isEqualTo("document_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HrisDocumentListParamsTest {

    @Test
    fun createHrisDocumentListParams() {
        HrisDocumentListParams.builder()
            .addIndividualId("string")
            .limit(0L)
            .offset(0L)
            .addType(HrisDocumentListParams.Type.W4_2020)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            HrisDocumentListParams.builder()
                .addIndividualId("string")
                .limit(0L)
                .offset(0L)
                .addType(HrisDocumentListParams.Type.W4_2020)
                .build()
        val expected = QueryParams.builder()
        expected.put("individual_ids[]", "string")
        expected.put("limit", "0")
        expected.put("offset", "0")
        expected.put("types[]", HrisDocumentListParams.Type.W4_2020.toString())
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = HrisDocumentListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}

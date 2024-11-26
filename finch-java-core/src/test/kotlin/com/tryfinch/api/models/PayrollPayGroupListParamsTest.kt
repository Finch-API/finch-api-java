// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PayrollPayGroupListParamsTest {

    @Test
    fun createPayrollPayGroupListParams() {
        PayrollPayGroupListParams.builder()
            .individualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .payFrequencies(listOf("string"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            PayrollPayGroupListParams.builder()
                .individualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .payFrequencies(listOf("string"))
                .build()
        val expected = QueryParams.builder()
        expected.put("individual_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("pay_frequencies[]", "string")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = PayrollPayGroupListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
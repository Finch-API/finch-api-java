// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HrisPaymentListParamsTest {

    @Test
    fun createHrisPaymentListParams() {
        HrisPaymentListParams.builder()
            .endDate(LocalDate.parse("2021-01-01"))
            .startDate(LocalDate.parse("2021-01-01"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            HrisPaymentListParams.builder()
                .endDate(LocalDate.parse("2021-01-01"))
                .startDate(LocalDate.parse("2021-01-01"))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("end_date", listOf("2021-01-01"))
        expected.put("start_date", listOf("2021-01-01"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            HrisPaymentListParams.builder()
                .endDate(LocalDate.parse("2021-01-01"))
                .startDate(LocalDate.parse("2021-01-01"))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("end_date", listOf("2021-01-01"))
        expected.put("start_date", listOf("2021-01-01"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}

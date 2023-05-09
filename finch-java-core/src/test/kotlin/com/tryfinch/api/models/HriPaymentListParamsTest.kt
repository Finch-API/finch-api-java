package com.tryfinch.api.models

import com.tryfinch.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HriPaymentListParamsTest {

    @Test
    fun createHriPaymentListParams() {
        HriPaymentListParams.builder()
            .startDate(LocalDate.parse("2021-01-01"))
            .endDate(LocalDate.parse("2021-01-01"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            HriPaymentListParams.builder()
                .startDate(LocalDate.parse("2021-01-01"))
                .endDate(LocalDate.parse("2021-01-01"))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("start_date", listOf("2021-01-01"))
        expected.put("end_date", listOf("2021-01-01"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            HriPaymentListParams.builder()
                .startDate(LocalDate.parse("2021-01-01"))
                .endDate(LocalDate.parse("2021-01-01"))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("start_date", listOf("2021-01-01"))
        expected.put("end_date", listOf("2021-01-01"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}

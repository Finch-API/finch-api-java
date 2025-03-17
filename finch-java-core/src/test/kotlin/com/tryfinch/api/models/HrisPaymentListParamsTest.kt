// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisPaymentListParamsTest {

    @Test
    fun create() {
        HrisPaymentListParams.builder()
            .endDate(LocalDate.parse("2021-01-01"))
            .startDate(LocalDate.parse("2021-01-01"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            HrisPaymentListParams.builder()
                .endDate(LocalDate.parse("2021-01-01"))
                .startDate(LocalDate.parse("2021-01-01"))
                .build()
        val expected = QueryParams.builder()
        expected.put("end_date", "2021-01-01")
        expected.put("start_date", "2021-01-01")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            HrisPaymentListParams.builder()
                .endDate(LocalDate.parse("2021-01-01"))
                .startDate(LocalDate.parse("2021-01-01"))
                .build()
        val expected = QueryParams.builder()
        expected.put("end_date", "2021-01-01")
        expected.put("start_date", "2021-01-01")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}

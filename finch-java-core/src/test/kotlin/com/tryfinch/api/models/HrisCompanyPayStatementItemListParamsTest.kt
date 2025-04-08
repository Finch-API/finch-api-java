// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisCompanyPayStatementItemListParamsTest {

    @Test
    fun create() {
        HrisCompanyPayStatementItemListParams.builder()
            .addCategory(HrisCompanyPayStatementItemListParams.Category.EARNINGS)
            .endDate(LocalDate.parse("2024-07-01"))
            .name("name")
            .startDate(LocalDate.parse("2024-01-01"))
            .type("base_compensation")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            HrisCompanyPayStatementItemListParams.builder()
                .addCategory(HrisCompanyPayStatementItemListParams.Category.EARNINGS)
                .endDate(LocalDate.parse("2024-07-01"))
                .name("name")
                .startDate(LocalDate.parse("2024-01-01"))
                .type("base_compensation")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("categories[]", "earnings")
                    .put("end_date", "2024-07-01")
                    .put("name", "name")
                    .put("start_date", "2024-01-01")
                    .put("type", "base_compensation")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = HrisCompanyPayStatementItemListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}

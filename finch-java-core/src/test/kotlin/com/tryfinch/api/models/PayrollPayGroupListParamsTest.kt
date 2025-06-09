// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayrollPayGroupListParamsTest {

    @Test
    fun create() {
        PayrollPayGroupListParams.builder()
            .individualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addPayFrequency("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PayrollPayGroupListParams.builder()
                .individualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPayFrequency("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("individual_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("pay_frequencies[]", "string")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PayrollPayGroupListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayrollPayGroupListParamsTest {

    @Test
    fun create() {
        PayrollPayGroupListParams.builder()
            .addEntityId("550e8400-e29b-41d4-a716-446655440000")
            .individualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addPayFrequency("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PayrollPayGroupListParams.builder()
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .individualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPayFrequency("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("entity_ids[]", "550e8400-e29b-41d4-a716-446655440000")
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

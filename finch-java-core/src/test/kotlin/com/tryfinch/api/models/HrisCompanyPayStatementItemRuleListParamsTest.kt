// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisCompanyPayStatementItemRuleListParamsTest {

    @Test
    fun create() {
        HrisCompanyPayStatementItemRuleListParams.builder()
            .addEntityId("550e8400-e29b-41d4-a716-446655440000")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            HrisCompanyPayStatementItemRuleListParams.builder()
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("entity_ids[]", "550e8400-e29b-41d4-a716-446655440000")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = HrisCompanyPayStatementItemRuleListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisBenefitUpdateParamsTest {

    @Test
    fun create() {
        HrisBenefitUpdateParams.builder()
            .benefitId("benefit_id")
            .addEntityId("550e8400-e29b-41d4-a716-446655440000")
            .description("description")
            .build()
    }

    @Test
    fun pathParams() {
        val params = HrisBenefitUpdateParams.builder().benefitId("benefit_id").build()

        assertThat(params._pathParam(0)).isEqualTo("benefit_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            HrisBenefitUpdateParams.builder()
                .benefitId("benefit_id")
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .description("description")
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
        val params = HrisBenefitUpdateParams.builder().benefitId("benefit_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            HrisBenefitUpdateParams.builder()
                .benefitId("benefit_id")
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .description("description")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = HrisBenefitUpdateParams.builder().benefitId("benefit_id").build()

        val body = params._body()
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisBenefitRegisterParamsTest {

    @Test
    fun create() {
        HrisBenefitRegisterParams.builder()
            .addEntityId("550e8400-e29b-41d4-a716-446655440000")
            .description("description")
            .frequency(BenefitFrequency.EVERY_PAYCHECK)
            .type(BenefitType._457)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            HrisBenefitRegisterParams.builder()
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .description("description")
                .frequency(BenefitFrequency.EVERY_PAYCHECK)
                .type(BenefitType._457)
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
        val params = HrisBenefitRegisterParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            HrisBenefitRegisterParams.builder()
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .description("description")
                .frequency(BenefitFrequency.EVERY_PAYCHECK)
                .type(BenefitType._457)
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.frequency()).contains(BenefitFrequency.EVERY_PAYCHECK)
        assertThat(body.type()).contains(BenefitType._457)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = HrisBenefitRegisterParams.builder().build()

        val body = params._body()
    }
}

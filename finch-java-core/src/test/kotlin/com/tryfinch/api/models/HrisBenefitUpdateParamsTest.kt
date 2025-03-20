// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisBenefitUpdateParamsTest {

    @Test
    fun create() {
        HrisBenefitUpdateParams.builder().benefitId("benefit_id").description("description").build()
    }

    @Test
    fun pathParams() {
        val params = HrisBenefitUpdateParams.builder().benefitId("benefit_id").build()

        assertThat(params._pathParam(0)).isEqualTo("benefit_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            HrisBenefitUpdateParams.builder()
                .benefitId("benefit_id")
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

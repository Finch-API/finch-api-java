// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HrisBenefitUpdateParamsTest {

    @Test
    fun create() {
        HrisBenefitUpdateParams.builder().benefitId("benefit_id").description("description").build()
    }

    @Test
    fun body() {
        val params =
            HrisBenefitUpdateParams.builder()
                .benefitId("benefit_id")
                .description("description")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.description()).contains("description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = HrisBenefitUpdateParams.builder().benefitId("benefit_id").build()
        val body = params._body()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = HrisBenefitUpdateParams.builder().benefitId("benefit_id").build()
        assertThat(params).isNotNull
        // path param "benefitId"
        assertThat(params.getPathParam(0)).isEqualTo("benefit_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HrisBenefitUpdateParamsTest {

    @Test
    fun createHrisBenefitUpdateParams() {
        HrisBenefitUpdateParams.builder().benefitId("benefit_id").description("description").build()
    }

    @Test
    fun getBody() {
        val params =
            HrisBenefitUpdateParams.builder()
                .benefitId("benefit_id")
                .description("description")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("description")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = HrisBenefitUpdateParams.builder().benefitId("benefit_id").build()
        val body = params.getBody()
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

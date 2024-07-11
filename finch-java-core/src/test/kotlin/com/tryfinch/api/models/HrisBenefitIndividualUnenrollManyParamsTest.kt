// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HrisBenefitIndividualUnenrollManyParamsTest {

    @Test
    fun createHrisBenefitIndividualUnenrollManyParams() {
        HrisBenefitIndividualUnenrollManyParams.builder()
            .benefitId("benefit_id")
            .individualIds(listOf("string"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            HrisBenefitIndividualUnenrollManyParams.builder()
                .benefitId("benefit_id")
                .individualIds(listOf("string"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.individualIds()).isEqualTo(listOf("string"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            HrisBenefitIndividualUnenrollManyParams.builder().benefitId("benefit_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            HrisBenefitIndividualUnenrollManyParams.builder().benefitId("benefit_id").build()
        assertThat(params).isNotNull
        // path param "benefitId"
        assertThat(params.getPathParam(0)).isEqualTo("benefit_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}

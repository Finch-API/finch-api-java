// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisBenefitIndividualUnenrollManyParamsTest {

    @Test
    fun create() {
        HrisBenefitIndividualUnenrollManyParams.builder()
            .benefitId("benefit_id")
            .addIndividualId("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            HrisBenefitIndividualUnenrollManyParams.builder()
                .benefitId("benefit_id")
                .addIndividualId("string")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.individualIds()).contains(listOf("string"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            HrisBenefitIndividualUnenrollManyParams.builder().benefitId("benefit_id").build()

        val body = params._body()

        assertNotNull(body)
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

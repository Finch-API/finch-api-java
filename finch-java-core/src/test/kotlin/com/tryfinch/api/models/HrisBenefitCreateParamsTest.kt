// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HrisBenefitCreateParamsTest {

    @Test
    fun create() {
        HrisBenefitCreateParams.builder()
            .description("description")
            .frequency(BenefitFrequency.ONE_TIME)
            .type(BenefitType._401K)
            .build()
    }

    @Test
    fun body() {
        val params =
            HrisBenefitCreateParams.builder()
                .description("description")
                .frequency(BenefitFrequency.ONE_TIME)
                .type(BenefitType._401K)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.description()).contains("description")
        assertThat(body.frequency()).contains(BenefitFrequency.ONE_TIME)
        assertThat(body.type()).contains(BenefitType._401K)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = HrisBenefitCreateParams.builder().build()
        val body = params._body()
        assertThat(body).isNotNull
    }
}

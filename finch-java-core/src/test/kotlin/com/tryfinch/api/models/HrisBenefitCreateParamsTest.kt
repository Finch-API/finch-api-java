package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HrisBenefitCreateParamsTest {

    @Test
    fun createHrisBenefitCreateParams() {
        HrisBenefitCreateParams.builder()
            .description("string")
            .frequency(BenefitFrequency.ONE_TIME)
            .type(BenefitType._401K)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            HrisBenefitCreateParams.builder()
                .description("string")
                .frequency(BenefitFrequency.ONE_TIME)
                .type(BenefitType._401K)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.frequency()).isEqualTo(BenefitFrequency.ONE_TIME)
        assertThat(body.type()).isEqualTo(BenefitType._401K)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = HrisBenefitCreateParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}

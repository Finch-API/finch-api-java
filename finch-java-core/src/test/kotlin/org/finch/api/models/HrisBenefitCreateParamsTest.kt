package org.finch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.finch.api.models.*
import org.junit.jupiter.api.Test

class HrisBenefitCreateParamsTest {

    @Test
    fun createHrisBenefitCreateParams() {
        HrisBenefitCreateParams.builder()
            .type(BenefitType._401K)
            .description("string")
            .frequency(BenefitFrequency.ONE_TIME)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            HrisBenefitCreateParams.builder()
                .type(BenefitType._401K)
                .description("string")
                .frequency(BenefitFrequency.ONE_TIME)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.type()).isEqualTo(BenefitType._401K)
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.frequency()).isEqualTo(BenefitFrequency.ONE_TIME)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = HrisBenefitCreateParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreateCompanyBenefitsResponseTest {

    @Test
    fun createCreateCompanyBenefitsResponse() {
        val createCompanyBenefitsResponse =
            CreateCompanyBenefitsResponse.builder().benefitId("string").build()
        assertThat(createCompanyBenefitsResponse).isNotNull
        assertThat(createCompanyBenefitsResponse.benefitId()).isEqualTo("string")
    }
}

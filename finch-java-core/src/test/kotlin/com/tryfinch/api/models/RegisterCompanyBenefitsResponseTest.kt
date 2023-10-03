package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RegisterCompanyBenefitsResponseTest {

    @Test
    fun createRegisterCompanyBenefitsResponse() {
        val registerCompanyBenefitsResponse =
            RegisterCompanyBenefitsResponse.builder().benefitId("string").jobId("string").build()
        assertThat(registerCompanyBenefitsResponse).isNotNull
        assertThat(registerCompanyBenefitsResponse.benefitId()).isEqualTo("string")
        assertThat(registerCompanyBenefitsResponse.jobId()).isEqualTo("string")
    }
}

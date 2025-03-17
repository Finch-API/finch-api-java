// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateCompanyBenefitsResponseTest {

    @Test
    fun createCreateCompanyBenefitsResponse() {
        val createCompanyBenefitsResponse =
            CreateCompanyBenefitsResponse.builder().benefitId("benefit_id").build()
        assertThat(createCompanyBenefitsResponse).isNotNull
        assertThat(createCompanyBenefitsResponse.benefitId()).isEqualTo("benefit_id")
    }
}

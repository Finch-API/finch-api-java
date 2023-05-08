package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SupportedBenefitTest {

    @Test
    fun createSupportedBenefit() {
        val supportedBenefit =
            SupportedBenefit.builder()
                .type(BenefitType._401K)
                .description("string")
                .frequencies(listOf(BenefitFrequency.ONE_TIME))
                .employeeDeduction(listOf(SupportedBenefit.EmployeeDeduction.FIXED))
                .companyContribution(listOf(SupportedBenefit.CompanyContribution.FIXED))
                .annualMaximum(true)
                .catchUp(true)
                .hsaContributionLimit(listOf(SupportedBenefit.HsaContributionLimit.INDIVIDUAL))
                .build()
        assertThat(supportedBenefit).isNotNull
        assertThat(supportedBenefit.type()).isEqualTo(BenefitType._401K)
        assertThat(supportedBenefit.description()).isEqualTo("string")
        assertThat(supportedBenefit.frequencies()).containsExactly(BenefitFrequency.ONE_TIME)
        assertThat(supportedBenefit.employeeDeduction())
            .containsExactly(SupportedBenefit.EmployeeDeduction.FIXED)
        assertThat(supportedBenefit.companyContribution())
            .containsExactly(SupportedBenefit.CompanyContribution.FIXED)
        assertThat(supportedBenefit.annualMaximum()).isEqualTo(true)
        assertThat(supportedBenefit.catchUp()).isEqualTo(true)
        assertThat(supportedBenefit.hsaContributionLimit())
            .containsExactly(SupportedBenefit.HsaContributionLimit.INDIVIDUAL)
    }
}

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SupportedBenefitTest {

    @Test
    fun createSupportedBenefit() {
        val supportedBenefit =
            SupportedBenefit.builder()
                .annualMaximum(true)
                .catchUp(true)
                .companyContribution(listOf(SupportedBenefit.CompanyContribution.FIXED))
                .description("string")
                .employeeDeduction(listOf(SupportedBenefit.EmployeeDeduction.FIXED))
                .frequencies(listOf(BenefitFrequency.ONE_TIME))
                .hsaContributionLimit(listOf(SupportedBenefit.HsaContributionLimit.INDIVIDUAL))
                .type(BenefitType._401K)
                .build()
        assertThat(supportedBenefit).isNotNull
        assertThat(supportedBenefit.type()).contains(BenefitType._401K)
        assertThat(supportedBenefit.description()).contains("string")
        assertThat(supportedBenefit.frequencies().get()).containsExactly(BenefitFrequency.ONE_TIME)
        assertThat(supportedBenefit.employeeDeduction().get())
            .containsExactly(SupportedBenefit.EmployeeDeduction.FIXED)
        assertThat(supportedBenefit.companyContribution().get())
            .containsExactly(SupportedBenefit.CompanyContribution.FIXED)
        assertThat(supportedBenefit.annualMaximum()).contains(true)
        assertThat(supportedBenefit.catchUp()).contains(true)
        assertThat(supportedBenefit.hsaContributionLimit().get())
            .containsExactly(SupportedBenefit.HsaContributionLimit.INDIVIDUAL)
    }
}

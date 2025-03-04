// File generated from our OpenAPI spec by Stainless.

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
                .addCompanyContribution(SupportedBenefit.CompanyContribution.FIXED)
                .description("description")
                .addEmployeeDeduction(SupportedBenefit.EmployeeDeduction.FIXED)
                .addFrequency(BenefitFrequency.ONE_TIME)
                .addHsaContributionLimit(SupportedBenefit.HsaContributionLimit.INDIVIDUAL)
                .type(BenefitType._401K)
                .build()
        assertThat(supportedBenefit).isNotNull
        assertThat(supportedBenefit.annualMaximum()).contains(true)
        assertThat(supportedBenefit.catchUp()).contains(true)
        assertThat(supportedBenefit.companyContribution().get())
            .containsExactly(SupportedBenefit.CompanyContribution.FIXED)
        assertThat(supportedBenefit.description()).contains("description")
        assertThat(supportedBenefit.employeeDeduction().get())
            .containsExactly(SupportedBenefit.EmployeeDeduction.FIXED)
        assertThat(supportedBenefit.frequencies().get()).containsExactly(BenefitFrequency.ONE_TIME)
        assertThat(supportedBenefit.hsaContributionLimit().get())
            .containsExactly(SupportedBenefit.HsaContributionLimit.INDIVIDUAL)
        assertThat(supportedBenefit.type()).contains(BenefitType._401K)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SupportedBenefitTest {

    @Test
    fun create() {
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

        assertThat(supportedBenefit.annualMaximum()).contains(true)
        assertThat(supportedBenefit.catchUp()).contains(true)
        assertThat(supportedBenefit.companyContribution().getOrNull())
            .containsExactly(SupportedBenefit.CompanyContribution.FIXED)
        assertThat(supportedBenefit.description()).contains("description")
        assertThat(supportedBenefit.employeeDeduction().getOrNull())
            .containsExactly(SupportedBenefit.EmployeeDeduction.FIXED)
        assertThat(supportedBenefit.frequencies().getOrNull())
            .containsExactly(BenefitFrequency.ONE_TIME)
        assertThat(supportedBenefit.hsaContributionLimit().getOrNull())
            .containsExactly(SupportedBenefit.HsaContributionLimit.INDIVIDUAL)
        assertThat(supportedBenefit.type()).contains(BenefitType._401K)
    }
}

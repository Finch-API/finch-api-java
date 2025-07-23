// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SupportedBenefitTest {

    @Test
    fun create() {
        val supportedBenefit =
            SupportedBenefit.builder()
                .annualMaximum(true)
                .addCompanyContribution(SupportedBenefit.CompanyContribution.FIXED)
                .description("description")
                .addEmployeeDeduction(SupportedBenefit.EmployeeDeduction.FIXED)
                .addFrequency(BenefitFrequency.EVERY_PAYCHECK)
                .catchUp(true)
                .addHsaContributionLimit(SupportedBenefit.HsaContributionLimit.FAMILY)
                .build()

        assertThat(supportedBenefit.annualMaximum()).contains(true)
        assertThat(supportedBenefit.companyContribution().getOrNull())
            .containsExactly(SupportedBenefit.CompanyContribution.FIXED)
        assertThat(supportedBenefit.description()).contains("description")
        assertThat(supportedBenefit.employeeDeduction().getOrNull())
            .containsExactly(SupportedBenefit.EmployeeDeduction.FIXED)
        assertThat(supportedBenefit.frequencies()).containsExactly(BenefitFrequency.EVERY_PAYCHECK)
        assertThat(supportedBenefit.catchUp()).contains(true)
        assertThat(supportedBenefit.hsaContributionLimit().getOrNull())
            .containsExactly(SupportedBenefit.HsaContributionLimit.FAMILY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val supportedBenefit =
            SupportedBenefit.builder()
                .annualMaximum(true)
                .addCompanyContribution(SupportedBenefit.CompanyContribution.FIXED)
                .description("description")
                .addEmployeeDeduction(SupportedBenefit.EmployeeDeduction.FIXED)
                .addFrequency(BenefitFrequency.EVERY_PAYCHECK)
                .catchUp(true)
                .addHsaContributionLimit(SupportedBenefit.HsaContributionLimit.FAMILY)
                .build()

        val roundtrippedSupportedBenefit =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(supportedBenefit),
                jacksonTypeRef<SupportedBenefit>(),
            )

        assertThat(roundtrippedSupportedBenefit).isEqualTo(supportedBenefit)
    }
}

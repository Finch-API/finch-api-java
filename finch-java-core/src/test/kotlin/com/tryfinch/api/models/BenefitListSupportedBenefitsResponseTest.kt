// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BenefitListSupportedBenefitsResponseTest {

    @Test
    fun create() {
        val benefitListSupportedBenefitsResponse =
            BenefitListSupportedBenefitsResponse.builder()
                .annualMaximum(true)
                .catchUp(true)
                .addCompanyContribution(
                    BenefitListSupportedBenefitsResponse.CompanyContribution.FIXED
                )
                .description("description")
                .addEmployeeDeduction(BenefitListSupportedBenefitsResponse.EmployeeDeduction.FIXED)
                .addFrequency(BenefitFrequency.ONE_TIME)
                .addHsaContributionLimit(
                    BenefitListSupportedBenefitsResponse.HsaContributionLimit.INDIVIDUAL
                )
                .build()

        assertThat(benefitListSupportedBenefitsResponse.annualMaximum()).contains(true)
        assertThat(benefitListSupportedBenefitsResponse.catchUp()).contains(true)
        assertThat(benefitListSupportedBenefitsResponse.companyContribution().getOrNull())
            .containsExactly(BenefitListSupportedBenefitsResponse.CompanyContribution.FIXED)
        assertThat(benefitListSupportedBenefitsResponse.description()).contains("description")
        assertThat(benefitListSupportedBenefitsResponse.employeeDeduction().getOrNull())
            .containsExactly(BenefitListSupportedBenefitsResponse.EmployeeDeduction.FIXED)
        assertThat(benefitListSupportedBenefitsResponse.frequencies().getOrNull())
            .containsExactly(BenefitFrequency.ONE_TIME)
        assertThat(benefitListSupportedBenefitsResponse.hsaContributionLimit().getOrNull())
            .containsExactly(BenefitListSupportedBenefitsResponse.HsaContributionLimit.INDIVIDUAL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val benefitListSupportedBenefitsResponse =
            BenefitListSupportedBenefitsResponse.builder()
                .annualMaximum(true)
                .catchUp(true)
                .addCompanyContribution(
                    BenefitListSupportedBenefitsResponse.CompanyContribution.FIXED
                )
                .description("description")
                .addEmployeeDeduction(BenefitListSupportedBenefitsResponse.EmployeeDeduction.FIXED)
                .addFrequency(BenefitFrequency.ONE_TIME)
                .addHsaContributionLimit(
                    BenefitListSupportedBenefitsResponse.HsaContributionLimit.INDIVIDUAL
                )
                .build()

        val roundtrippedBenefitListSupportedBenefitsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(benefitListSupportedBenefitsResponse),
                jacksonTypeRef<BenefitListSupportedBenefitsResponse>(),
            )

        assertThat(roundtrippedBenefitListSupportedBenefitsResponse)
            .isEqualTo(benefitListSupportedBenefitsResponse)
    }
}

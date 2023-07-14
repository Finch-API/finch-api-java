package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CompanyBenefitTest {

    @Test
    fun createCompanyBenefit() {
        val companyBenefit =
            CompanyBenefit.builder()
                .benefitId("string")
                .companyContribution(
                    BenfitContribution.builder()
                        .amount(123L)
                        .type(BenfitContribution.Type.FIXED)
                        .build()
                )
                .description("string")
                .employeeDeduction(
                    BenfitContribution.builder()
                        .amount(123L)
                        .type(BenfitContribution.Type.FIXED)
                        .build()
                )
                .frequency(BenefitFrequency.ONE_TIME)
                .type(BenefitType._401K)
                .build()
        assertThat(companyBenefit).isNotNull
        assertThat(companyBenefit.benefitId()).isEqualTo("string")
        assertThat(companyBenefit.companyContribution())
            .contains(
                BenfitContribution.builder()
                    .amount(123L)
                    .type(BenfitContribution.Type.FIXED)
                    .build()
            )
        assertThat(companyBenefit.description()).contains("string")
        assertThat(companyBenefit.employeeDeduction())
            .contains(
                BenfitContribution.builder()
                    .amount(123L)
                    .type(BenfitContribution.Type.FIXED)
                    .build()
            )
        assertThat(companyBenefit.frequency()).contains(BenefitFrequency.ONE_TIME)
        assertThat(companyBenefit.type()).contains(BenefitType._401K)
    }
}

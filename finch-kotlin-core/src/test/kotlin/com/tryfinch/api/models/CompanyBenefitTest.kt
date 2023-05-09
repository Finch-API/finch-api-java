package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CompanyBenefitTest {

    @Test
    fun createCompanyBenefit() {
        val companyBenefit =
            CompanyBenefit.builder()
                .benefitId("string")
                .type(BenefitType._401K)
                .description("string")
                .frequency(BenefitFrequency.ONE_TIME)
                .companyContribution(
                    BenfitContribution.builder()
                        .type(BenfitContribution.Type.FIXED)
                        .amount(123L)
                        .build()
                )
                .employeeDeduction(
                    BenfitContribution.builder()
                        .type(BenfitContribution.Type.FIXED)
                        .amount(123L)
                        .build()
                )
                .build()
        assertThat(companyBenefit).isNotNull
        assertThat(companyBenefit.benefitId()).isEqualTo("string")
        assertThat(companyBenefit.type()).isEqualTo(BenefitType._401K)
        assertThat(companyBenefit.description()).isEqualTo("string")
        assertThat(companyBenefit.frequency()).isEqualTo(BenefitFrequency.ONE_TIME)
        assertThat(companyBenefit.companyContribution())
            .isEqualTo(
                BenfitContribution.builder()
                    .type(BenfitContribution.Type.FIXED)
                    .amount(123L)
                    .build()
            )
        assertThat(companyBenefit.employeeDeduction())
            .isEqualTo(
                BenfitContribution.builder()
                    .type(BenfitContribution.Type.FIXED)
                    .amount(123L)
                    .build()
            )
    }
}

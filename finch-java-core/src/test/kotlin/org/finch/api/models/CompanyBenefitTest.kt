package org.finch.api.models

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
        assertThat(companyBenefit.type()).contains(BenefitType._401K)
        assertThat(companyBenefit.description()).contains("string")
        assertThat(companyBenefit.frequency()).contains(BenefitFrequency.ONE_TIME)
        assertThat(companyBenefit.companyContribution())
            .contains(
                BenfitContribution.builder()
                    .type(BenfitContribution.Type.FIXED)
                    .amount(123L)
                    .build()
            )
        assertThat(companyBenefit.employeeDeduction())
            .contains(
                BenfitContribution.builder()
                    .type(BenfitContribution.Type.FIXED)
                    .amount(123L)
                    .build()
            )
    }
}

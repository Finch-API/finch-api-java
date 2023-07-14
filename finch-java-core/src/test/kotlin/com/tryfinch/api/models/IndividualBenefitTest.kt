package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IndividualBenefitTest {

    @Test
    fun createIndividualBenefit() {
        val individualBenefit =
            IndividualBenefit.builder()
                .body(
                    IndividualBenefit.Body.builder()
                        .annualMaximum(123L)
                        .catchUp(true)
                        .companyContribution(
                            BenfitContribution.builder()
                                .amount(123L)
                                .type(BenfitContribution.Type.FIXED)
                                .build()
                        )
                        .employeeDeduction(
                            BenfitContribution.builder()
                                .amount(123L)
                                .type(BenfitContribution.Type.FIXED)
                                .build()
                        )
                        .hsaContributionLimit(
                            IndividualBenefit.Body.HsaContributionLimit.INDIVIDUAL
                        )
                        .build()
                )
                .code(123L)
                .individualId("string")
                .build()
        assertThat(individualBenefit).isNotNull
        assertThat(individualBenefit.individualId()).contains("string")
        assertThat(individualBenefit.code()).contains(123L)
        assertThat(individualBenefit.body())
            .contains(
                IndividualBenefit.Body.builder()
                    .annualMaximum(123L)
                    .catchUp(true)
                    .companyContribution(
                        BenfitContribution.builder()
                            .amount(123L)
                            .type(BenfitContribution.Type.FIXED)
                            .build()
                    )
                    .employeeDeduction(
                        BenfitContribution.builder()
                            .amount(123L)
                            .type(BenfitContribution.Type.FIXED)
                            .build()
                    )
                    .hsaContributionLimit(IndividualBenefit.Body.HsaContributionLimit.INDIVIDUAL)
                    .build()
            )
    }
}

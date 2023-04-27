package org.finch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IndividualBenefitTest {

    @Test
    fun createIndividualBenefit() {
        val individualBenefit =
            IndividualBenefit.builder()
                .individualId("string")
                .code(123L)
                .body(
                    IndividualBenefit.Body.builder()
                        .employeeDeduction(
                            BenfitContribution.builder()
                                .type(BenfitContribution.Type.FIXED)
                                .amount(123L)
                                .build()
                        )
                        .companyContribution(
                            BenfitContribution.builder()
                                .type(BenfitContribution.Type.FIXED)
                                .amount(123L)
                                .build()
                        )
                        .annualMaximum(123L)
                        .catchUp(true)
                        .hsaContributionLimit(
                            IndividualBenefit.Body.HsaContributionLimit.INDIVIDUAL
                        )
                        .build()
                )
                .build()
        assertThat(individualBenefit).isNotNull
        assertThat(individualBenefit.individualId()).contains("string")
        assertThat(individualBenefit.code()).contains(123L)
        assertThat(individualBenefit.body())
            .contains(
                IndividualBenefit.Body.builder()
                    .employeeDeduction(
                        BenfitContribution.builder()
                            .type(BenfitContribution.Type.FIXED)
                            .amount(123L)
                            .build()
                    )
                    .companyContribution(
                        BenfitContribution.builder()
                            .type(BenfitContribution.Type.FIXED)
                            .amount(123L)
                            .build()
                    )
                    .annualMaximum(123L)
                    .catchUp(true)
                    .hsaContributionLimit(IndividualBenefit.Body.HsaContributionLimit.INDIVIDUAL)
                    .build()
            )
    }
}

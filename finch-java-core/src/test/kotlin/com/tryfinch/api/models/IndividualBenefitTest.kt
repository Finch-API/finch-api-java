// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualBenefitTest {

    @Test
    fun create() {
        val individualBenefit =
            IndividualBenefit.builder()
                .body(
                    IndividualBenefit.Body.builder()
                        .annualMaximum(0L)
                        .catchUp(true)
                        .companyContribution(
                            BenefitContribution.builder()
                                .amount(0L)
                                .type(BenefitContribution.Type.FIXED)
                                .build()
                        )
                        .employeeDeduction(
                            BenefitContribution.builder()
                                .amount(0L)
                                .type(BenefitContribution.Type.FIXED)
                                .build()
                        )
                        .hsaContributionLimit(
                            IndividualBenefit.Body.HsaContributionLimit.INDIVIDUAL
                        )
                        .build()
                )
                .code(0L)
                .individualId("individual_id")
                .build()

        assertThat(individualBenefit.body())
            .contains(
                IndividualBenefit.Body.builder()
                    .annualMaximum(0L)
                    .catchUp(true)
                    .companyContribution(
                        BenefitContribution.builder()
                            .amount(0L)
                            .type(BenefitContribution.Type.FIXED)
                            .build()
                    )
                    .employeeDeduction(
                        BenefitContribution.builder()
                            .amount(0L)
                            .type(BenefitContribution.Type.FIXED)
                            .build()
                    )
                    .hsaContributionLimit(IndividualBenefit.Body.HsaContributionLimit.INDIVIDUAL)
                    .build()
            )
        assertThat(individualBenefit.code()).contains(0L)
        assertThat(individualBenefit.individualId()).contains("individual_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val individualBenefit =
            IndividualBenefit.builder()
                .body(
                    IndividualBenefit.Body.builder()
                        .annualMaximum(0L)
                        .catchUp(true)
                        .companyContribution(
                            BenefitContribution.builder()
                                .amount(0L)
                                .type(BenefitContribution.Type.FIXED)
                                .build()
                        )
                        .employeeDeduction(
                            BenefitContribution.builder()
                                .amount(0L)
                                .type(BenefitContribution.Type.FIXED)
                                .build()
                        )
                        .hsaContributionLimit(
                            IndividualBenefit.Body.HsaContributionLimit.INDIVIDUAL
                        )
                        .build()
                )
                .code(0L)
                .individualId("individual_id")
                .build()

        val roundtrippedIndividualBenefit =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(individualBenefit),
                jacksonTypeRef<IndividualBenefit>(),
            )

        assertThat(roundtrippedIndividualBenefit).isEqualTo(individualBenefit)
    }
}

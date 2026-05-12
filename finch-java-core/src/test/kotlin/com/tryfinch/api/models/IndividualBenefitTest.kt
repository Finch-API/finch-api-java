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
                    IndividualBenefit.Body.InnerIndividualBenefit.builder()
                        .annualMaximum(0L)
                        .catchUp(true)
                        .companyContribution(
                            IndividualBenefit.Body.InnerIndividualBenefit.CompanyContribution
                                .CompanyContributionFixed
                                .builder()
                                .amount(0L)
                                .type(
                                    IndividualBenefit.Body.InnerIndividualBenefit
                                        .CompanyContribution
                                        .CompanyContributionFixed
                                        .Type
                                        .FIXED
                                )
                                .build()
                        )
                        .employeeDeduction(
                            IndividualBenefit.Body.InnerIndividualBenefit.EmployeeDeduction
                                .EmployeeDeductionContributionFixed
                                .builder()
                                .amount(0L)
                                .type(
                                    IndividualBenefit.Body.InnerIndividualBenefit.EmployeeDeduction
                                        .EmployeeDeductionContributionFixed
                                        .Type
                                        .FIXED
                                )
                                .build()
                        )
                        .hsaContributionLimit(
                            IndividualBenefit.Body.InnerIndividualBenefit.HsaContributionLimit
                                .INDIVIDUAL
                        )
                        .build()
                )
                .code(0L)
                .individualId("individual_id")
                .build()

        assertThat(individualBenefit.body())
            .isEqualTo(
                IndividualBenefit.Body.ofIndividualBenefit(
                    IndividualBenefit.Body.InnerIndividualBenefit.builder()
                        .annualMaximum(0L)
                        .catchUp(true)
                        .companyContribution(
                            IndividualBenefit.Body.InnerIndividualBenefit.CompanyContribution
                                .CompanyContributionFixed
                                .builder()
                                .amount(0L)
                                .type(
                                    IndividualBenefit.Body.InnerIndividualBenefit
                                        .CompanyContribution
                                        .CompanyContributionFixed
                                        .Type
                                        .FIXED
                                )
                                .build()
                        )
                        .employeeDeduction(
                            IndividualBenefit.Body.InnerIndividualBenefit.EmployeeDeduction
                                .EmployeeDeductionContributionFixed
                                .builder()
                                .amount(0L)
                                .type(
                                    IndividualBenefit.Body.InnerIndividualBenefit.EmployeeDeduction
                                        .EmployeeDeductionContributionFixed
                                        .Type
                                        .FIXED
                                )
                                .build()
                        )
                        .hsaContributionLimit(
                            IndividualBenefit.Body.InnerIndividualBenefit.HsaContributionLimit
                                .INDIVIDUAL
                        )
                        .build()
                )
            )
        assertThat(individualBenefit.code()).isEqualTo(0L)
        assertThat(individualBenefit.individualId()).isEqualTo("individual_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val individualBenefit =
            IndividualBenefit.builder()
                .body(
                    IndividualBenefit.Body.InnerIndividualBenefit.builder()
                        .annualMaximum(0L)
                        .catchUp(true)
                        .companyContribution(
                            IndividualBenefit.Body.InnerIndividualBenefit.CompanyContribution
                                .CompanyContributionFixed
                                .builder()
                                .amount(0L)
                                .type(
                                    IndividualBenefit.Body.InnerIndividualBenefit
                                        .CompanyContribution
                                        .CompanyContributionFixed
                                        .Type
                                        .FIXED
                                )
                                .build()
                        )
                        .employeeDeduction(
                            IndividualBenefit.Body.InnerIndividualBenefit.EmployeeDeduction
                                .EmployeeDeductionContributionFixed
                                .builder()
                                .amount(0L)
                                .type(
                                    IndividualBenefit.Body.InnerIndividualBenefit.EmployeeDeduction
                                        .EmployeeDeductionContributionFixed
                                        .Type
                                        .FIXED
                                )
                                .build()
                        )
                        .hsaContributionLimit(
                            IndividualBenefit.Body.InnerIndividualBenefit.HsaContributionLimit
                                .INDIVIDUAL
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

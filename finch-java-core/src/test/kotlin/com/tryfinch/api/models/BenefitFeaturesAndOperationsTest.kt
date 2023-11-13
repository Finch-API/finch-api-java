// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BenefitFeaturesAndOperationsTest {

    @Test
    fun createBenefitFeaturesAndOperations() {
        val benefitFeaturesAndOperations =
            BenefitFeaturesAndOperations.builder()
                .supportedFeatures(
                    BenefitFeaturesAndOperations.BenefitFeature.builder()
                        .annualMaximum(true)
                        .catchUp(true)
                        .companyContribution(
                            listOf(
                                BenefitFeaturesAndOperations.BenefitFeature.CompanyContribution
                                    .FIXED
                            )
                        )
                        .description("string")
                        .employeeDeduction(
                            listOf(
                                BenefitFeaturesAndOperations.BenefitFeature.EmployeeDeduction.FIXED
                            )
                        )
                        .frequencies(listOf(BenefitFrequency.ONE_TIME))
                        .hsaContributionLimit(
                            listOf(
                                BenefitFeaturesAndOperations.BenefitFeature.HsaContributionLimit
                                    .INDIVIDUAL
                            )
                        )
                        .build()
                )
                .supportedOperations(
                    SupportPerBenefitType.builder()
                        .companyBenefits(
                            OperationSupportMatrix.builder()
                                .create(OperationSupport.SUPPORTED)
                                .delete(OperationSupport.SUPPORTED)
                                .read(OperationSupport.SUPPORTED)
                                .update(OperationSupport.SUPPORTED)
                                .build()
                        )
                        .individualBenefits(
                            OperationSupportMatrix.builder()
                                .create(OperationSupport.SUPPORTED)
                                .delete(OperationSupport.SUPPORTED)
                                .read(OperationSupport.SUPPORTED)
                                .update(OperationSupport.SUPPORTED)
                                .build()
                        )
                        .build()
                )
                .build()
        assertThat(benefitFeaturesAndOperations).isNotNull
        assertThat(benefitFeaturesAndOperations.supportedFeatures())
            .contains(
                BenefitFeaturesAndOperations.BenefitFeature.builder()
                    .annualMaximum(true)
                    .catchUp(true)
                    .companyContribution(
                        listOf(
                            BenefitFeaturesAndOperations.BenefitFeature.CompanyContribution.FIXED
                        )
                    )
                    .description("string")
                    .employeeDeduction(
                        listOf(BenefitFeaturesAndOperations.BenefitFeature.EmployeeDeduction.FIXED)
                    )
                    .frequencies(listOf(BenefitFrequency.ONE_TIME))
                    .hsaContributionLimit(
                        listOf(
                            BenefitFeaturesAndOperations.BenefitFeature.HsaContributionLimit
                                .INDIVIDUAL
                        )
                    )
                    .build()
            )
        assertThat(benefitFeaturesAndOperations.supportedOperations())
            .contains(
                SupportPerBenefitType.builder()
                    .companyBenefits(
                        OperationSupportMatrix.builder()
                            .create(OperationSupport.SUPPORTED)
                            .delete(OperationSupport.SUPPORTED)
                            .read(OperationSupport.SUPPORTED)
                            .update(OperationSupport.SUPPORTED)
                            .build()
                    )
                    .individualBenefits(
                        OperationSupportMatrix.builder()
                            .create(OperationSupport.SUPPORTED)
                            .delete(OperationSupport.SUPPORTED)
                            .read(OperationSupport.SUPPORTED)
                            .update(OperationSupport.SUPPORTED)
                            .build()
                    )
                    .build()
            )
    }
}

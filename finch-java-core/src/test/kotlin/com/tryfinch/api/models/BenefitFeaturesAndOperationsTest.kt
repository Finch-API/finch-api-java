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
                        .addCompanyContribution(
                            BenefitFeaturesAndOperations.BenefitFeature.CompanyContribution.FIXED
                        )
                        .description("description")
                        .addEmployeeDeduction(
                            BenefitFeaturesAndOperations.BenefitFeature.EmployeeDeduction.FIXED
                        )
                        .addFrequency(BenefitFrequency.ONE_TIME)
                        .addHsaContributionLimit(
                            BenefitFeaturesAndOperations.BenefitFeature.HsaContributionLimit
                                .INDIVIDUAL
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
                    .addCompanyContribution(
                        BenefitFeaturesAndOperations.BenefitFeature.CompanyContribution.FIXED
                    )
                    .description("description")
                    .addEmployeeDeduction(
                        BenefitFeaturesAndOperations.BenefitFeature.EmployeeDeduction.FIXED
                    )
                    .addFrequency(BenefitFrequency.ONE_TIME)
                    .addHsaContributionLimit(
                        BenefitFeaturesAndOperations.BenefitFeature.HsaContributionLimit.INDIVIDUAL
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

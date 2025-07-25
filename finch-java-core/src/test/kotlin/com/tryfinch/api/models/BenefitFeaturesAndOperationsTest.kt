// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BenefitFeaturesAndOperationsTest {

    @Test
    fun create() {
        val benefitFeaturesAndOperations =
            BenefitFeaturesAndOperations.builder()
                .supportedFeatures(
                    SupportedBenefit.builder()
                        .annualMaximum(true)
                        .addCompanyContribution(SupportedBenefit.CompanyContribution.FIXED)
                        .description("description")
                        .addEmployeeDeduction(SupportedBenefit.EmployeeDeduction.FIXED)
                        .addFrequency(BenefitFrequency.EVERY_PAYCHECK)
                        .catchUp(true)
                        .addHsaContributionLimit(SupportedBenefit.HsaContributionLimit.FAMILY)
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

        assertThat(benefitFeaturesAndOperations.supportedFeatures())
            .contains(
                SupportedBenefit.builder()
                    .annualMaximum(true)
                    .addCompanyContribution(SupportedBenefit.CompanyContribution.FIXED)
                    .description("description")
                    .addEmployeeDeduction(SupportedBenefit.EmployeeDeduction.FIXED)
                    .addFrequency(BenefitFrequency.EVERY_PAYCHECK)
                    .catchUp(true)
                    .addHsaContributionLimit(SupportedBenefit.HsaContributionLimit.FAMILY)
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val benefitFeaturesAndOperations =
            BenefitFeaturesAndOperations.builder()
                .supportedFeatures(
                    SupportedBenefit.builder()
                        .annualMaximum(true)
                        .addCompanyContribution(SupportedBenefit.CompanyContribution.FIXED)
                        .description("description")
                        .addEmployeeDeduction(SupportedBenefit.EmployeeDeduction.FIXED)
                        .addFrequency(BenefitFrequency.EVERY_PAYCHECK)
                        .catchUp(true)
                        .addHsaContributionLimit(SupportedBenefit.HsaContributionLimit.FAMILY)
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

        val roundtrippedBenefitFeaturesAndOperations =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(benefitFeaturesAndOperations),
                jacksonTypeRef<BenefitFeaturesAndOperations>(),
            )

        assertThat(roundtrippedBenefitFeaturesAndOperations).isEqualTo(benefitFeaturesAndOperations)
    }
}

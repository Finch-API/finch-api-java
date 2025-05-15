// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyBenefitTest {

    @Test
    fun create() {
        val companyBenefit =
            CompanyBenefit.builder()
                .benefitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .companyContribution(
                    CompanyBenefit.BenefitCompanyMatchContribution.builder()
                        .addTier(
                            CompanyBenefit.BenefitCompanyMatchContribution.Tier.builder()
                                .match(1L)
                                .threshold(1L)
                                .build()
                        )
                        .type(CompanyBenefit.BenefitCompanyMatchContribution.Type.MATCH)
                        .build()
                )
                .description("description")
                .frequency(BenefitFrequency.ONE_TIME)
                .type(BenefitType._457)
                .build()

        assertThat(companyBenefit.benefitId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(companyBenefit.companyContribution())
            .contains(
                CompanyBenefit.BenefitCompanyMatchContribution.builder()
                    .addTier(
                        CompanyBenefit.BenefitCompanyMatchContribution.Tier.builder()
                            .match(1L)
                            .threshold(1L)
                            .build()
                    )
                    .type(CompanyBenefit.BenefitCompanyMatchContribution.Type.MATCH)
                    .build()
            )
        assertThat(companyBenefit.description()).contains("description")
        assertThat(companyBenefit.frequency()).contains(BenefitFrequency.ONE_TIME)
        assertThat(companyBenefit.type()).contains(BenefitType._457)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val companyBenefit =
            CompanyBenefit.builder()
                .benefitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .companyContribution(
                    CompanyBenefit.BenefitCompanyMatchContribution.builder()
                        .addTier(
                            CompanyBenefit.BenefitCompanyMatchContribution.Tier.builder()
                                .match(1L)
                                .threshold(1L)
                                .build()
                        )
                        .type(CompanyBenefit.BenefitCompanyMatchContribution.Type.MATCH)
                        .build()
                )
                .description("description")
                .frequency(BenefitFrequency.ONE_TIME)
                .type(BenefitType._457)
                .build()

        val roundtrippedCompanyBenefit =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(companyBenefit),
                jacksonTypeRef<CompanyBenefit>(),
            )

        assertThat(roundtrippedCompanyBenefit).isEqualTo(companyBenefit)
    }
}

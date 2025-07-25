// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisBenefitCreateParamsTest {

    @Test
    fun create() {
        HrisBenefitCreateParams.builder()
            .companyContribution(
                HrisBenefitCreateParams.BenefitCompanyMatchContribution.builder()
                    .addTier(
                        HrisBenefitCreateParams.BenefitCompanyMatchContribution.Tier.builder()
                            .match(1L)
                            .threshold(1L)
                            .build()
                    )
                    .type(HrisBenefitCreateParams.BenefitCompanyMatchContribution.Type.MATCH)
                    .build()
            )
            .description("description")
            .frequency(BenefitFrequency.EVERY_PAYCHECK)
            .type(BenefitType._457)
            .build()
    }

    @Test
    fun body() {
        val params =
            HrisBenefitCreateParams.builder()
                .companyContribution(
                    HrisBenefitCreateParams.BenefitCompanyMatchContribution.builder()
                        .addTier(
                            HrisBenefitCreateParams.BenefitCompanyMatchContribution.Tier.builder()
                                .match(1L)
                                .threshold(1L)
                                .build()
                        )
                        .type(HrisBenefitCreateParams.BenefitCompanyMatchContribution.Type.MATCH)
                        .build()
                )
                .description("description")
                .frequency(BenefitFrequency.EVERY_PAYCHECK)
                .type(BenefitType._457)
                .build()

        val body = params._body()

        assertThat(body.companyContribution())
            .contains(
                HrisBenefitCreateParams.BenefitCompanyMatchContribution.builder()
                    .addTier(
                        HrisBenefitCreateParams.BenefitCompanyMatchContribution.Tier.builder()
                            .match(1L)
                            .threshold(1L)
                            .build()
                    )
                    .type(HrisBenefitCreateParams.BenefitCompanyMatchContribution.Type.MATCH)
                    .build()
            )
        assertThat(body.description()).contains("description")
        assertThat(body.frequency()).contains(BenefitFrequency.EVERY_PAYCHECK)
        assertThat(body.type()).contains(BenefitType._457)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = HrisBenefitCreateParams.builder().build()

        val body = params._body()
    }
}

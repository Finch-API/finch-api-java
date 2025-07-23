// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.BenefitFrequency
import com.tryfinch.api.models.BenefitType
import com.tryfinch.api.models.HrisBenefitCreateParams
import com.tryfinch.api.models.HrisBenefitUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BenefitServiceTest {

    @Test
    fun create() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val benefitService = client.hris().benefits()

        val createCompanyBenefitsResponse =
            benefitService.create(
                HrisBenefitCreateParams.builder()
                    .companyContribution(
                        HrisBenefitCreateParams.BenefitCompanyMatchContribution.builder()
                            .addTier(
                                HrisBenefitCreateParams.BenefitCompanyMatchContribution.Tier
                                    .builder()
                                    .match(1L)
                                    .threshold(1L)
                                    .build()
                            )
                            .type(
                                HrisBenefitCreateParams.BenefitCompanyMatchContribution.Type.MATCH
                            )
                            .build()
                    )
                    .description("description")
                    .frequency(BenefitFrequency.EVERY_PAYCHECK)
                    .type(BenefitType._457)
                    .build()
            )

        createCompanyBenefitsResponse.validate()
    }

    @Test
    fun retrieve() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val benefitService = client.hris().benefits()

        val companyBenefit = benefitService.retrieve("benefit_id")

        companyBenefit.validate()
    }

    @Test
    fun update() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val benefitService = client.hris().benefits()

        val updateCompanyBenefitResponse =
            benefitService.update(
                HrisBenefitUpdateParams.builder()
                    .benefitId("benefit_id")
                    .description("description")
                    .build()
            )

        updateCompanyBenefitResponse.validate()
    }

    @Test
    fun list() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val benefitService = client.hris().benefits()

        val page = benefitService.list()

        page.items().forEach { it.validate() }
    }

    @Test
    fun listSupportedBenefits() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val benefitService = client.hris().benefits()

        val page = benefitService.listSupportedBenefits()

        page.items().forEach { it.validate() }
    }
}

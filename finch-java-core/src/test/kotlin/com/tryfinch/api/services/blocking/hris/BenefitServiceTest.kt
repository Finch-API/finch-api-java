// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.BenefitFrequency
import com.tryfinch.api.models.BenefitType
import com.tryfinch.api.models.HrisBenefitCreateParams
import com.tryfinch.api.models.HrisBenefitListParams
import com.tryfinch.api.models.HrisBenefitListSupportedBenefitsParams
import com.tryfinch.api.models.HrisBenefitRetrieveParams
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
                    .addEntityId("550e8400-e29b-41d4-a716-446655440000")
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

        val companyBenefit =
            benefitService.retrieve(
                HrisBenefitRetrieveParams.builder()
                    .benefitId("benefit_id")
                    .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                    .build()
            )

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
                    .addEntityId("550e8400-e29b-41d4-a716-446655440000")
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

        val page =
            benefitService.list(
                HrisBenefitListParams.builder()
                    .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                    .build()
            )

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

        val page =
            benefitService.listSupportedBenefits(
                HrisBenefitListSupportedBenefitsParams.builder()
                    .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                    .build()
            )

        page.items().forEach { it.validate() }
    }
}

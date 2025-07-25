// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.BenefitFrequency
import com.tryfinch.api.models.BenefitType
import com.tryfinch.api.models.HrisBenefitCreateParams
import com.tryfinch.api.models.HrisBenefitUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BenefitServiceAsyncTest {

    @Test
    fun create() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val benefitServiceAsync = client.hris().benefits()

        val createCompanyBenefitsResponseFuture =
            benefitServiceAsync.create(
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

        val createCompanyBenefitsResponse = createCompanyBenefitsResponseFuture.get()
        createCompanyBenefitsResponse.validate()
    }

    @Test
    fun retrieve() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val benefitServiceAsync = client.hris().benefits()

        val companyBenefitFuture = benefitServiceAsync.retrieve("benefit_id")

        val companyBenefit = companyBenefitFuture.get()
        companyBenefit.validate()
    }

    @Test
    fun update() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val benefitServiceAsync = client.hris().benefits()

        val updateCompanyBenefitResponseFuture =
            benefitServiceAsync.update(
                HrisBenefitUpdateParams.builder()
                    .benefitId("benefit_id")
                    .description("description")
                    .build()
            )

        val updateCompanyBenefitResponse = updateCompanyBenefitResponseFuture.get()
        updateCompanyBenefitResponse.validate()
    }

    @Test
    fun list() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val benefitServiceAsync = client.hris().benefits()

        val pageFuture = benefitServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun listSupportedBenefits() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val benefitServiceAsync = client.hris().benefits()

        val pageFuture = benefitServiceAsync.listSupportedBenefits()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }
}

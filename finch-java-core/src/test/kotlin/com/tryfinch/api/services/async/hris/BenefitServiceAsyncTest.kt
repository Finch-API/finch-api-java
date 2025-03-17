// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.BenefitFrequency
import com.tryfinch.api.models.BenefitType
import com.tryfinch.api.models.HrisBenefitCreateParams
import com.tryfinch.api.models.HrisBenefitRetrieveParams
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
                    .description("description")
                    .frequency(BenefitFrequency.ONE_TIME)
                    .type(BenefitType._401K)
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

        val companyBenefitFuture =
            benefitServiceAsync.retrieve(
                HrisBenefitRetrieveParams.builder().benefitId("benefit_id").build()
            )

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
        page.response().validate()
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
        page.response().validate()
    }
}

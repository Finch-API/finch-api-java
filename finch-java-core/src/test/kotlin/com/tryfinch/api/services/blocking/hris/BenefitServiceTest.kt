// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import com.tryfinch.api.models.HrisBenefitListParams
import com.tryfinch.api.models.HrisBenefitListSupportedBenefitsParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BenefitServiceTest {

    @Test
    fun callCreate() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .build()
        val benefitService = client.hris().benefits()
        val createCompanyBenefitsResponse =
            benefitService.create(
                HrisBenefitCreateParams.builder()
                    .description("string")
                    .frequency(BenefitFrequency.ONE_TIME)
                    .type(BenefitType._401K)
                    .build()
            )
        println(createCompanyBenefitsResponse)
        createCompanyBenefitsResponse.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .build()
        val benefitService = client.hris().benefits()
        val companyBenefit =
            benefitService.retrieve(HrisBenefitRetrieveParams.builder().benefitId("string").build())
        println(companyBenefit)
        companyBenefit.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .build()
        val benefitService = client.hris().benefits()
        val updateCompanyBenefitResponse =
            benefitService.update(
                HrisBenefitUpdateParams.builder().benefitId("string").description("string").build()
            )
        println(updateCompanyBenefitResponse)
        updateCompanyBenefitResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .build()
        val benefitService = client.hris().benefits()
        val getCompanyBenefitsResponse =
            benefitService.list(HrisBenefitListParams.builder().build())
        println(getCompanyBenefitsResponse)
        getCompanyBenefitsResponse.items().forEach { it.validate() }
    }

    @Test
    fun callListSupportedBenefits() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .build()
        val benefitService = client.hris().benefits()
        val getCompanyBenefitsMetadataResponse =
            benefitService.listSupportedBenefits(
                HrisBenefitListSupportedBenefitsParams.builder().build()
            )
        println(getCompanyBenefitsMetadataResponse)
        getCompanyBenefitsMetadataResponse.items().forEach { it.validate() }
    }
}

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import com.tryfinch.api.models.HriBenefitListParams
import com.tryfinch.api.models.HriBenefitListSupportedBenefitsParams
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
                .clientId("string")
                .clientSecret("string")
                .build()
        val benefitService = client.hris().benefits()
        val createCompanyBenefitsResponse =
            benefitService.create(
                HriBenefitCreateParams.builder()
                    .type(BenefitType._401K)
                    .description("string")
                    .frequency(BenefitFrequency.ONE_TIME)
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
                .clientId("string")
                .clientSecret("string")
                .build()
        val benefitService = client.hris().benefits()
        val companyBenefit =
            benefitService.retrieve(HriBenefitRetrieveParams.builder().benefitId("string").build())
        println(companyBenefit)
        companyBenefit.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .clientId("string")
                .clientSecret("string")
                .build()
        val benefitService = client.hris().benefits()
        val updateCompanyBenefitResponse =
            benefitService.update(
                HriBenefitUpdateParams.builder().benefitId("string").description("string").build()
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
                .clientId("string")
                .clientSecret("string")
                .build()
        val benefitService = client.hris().benefits()
        val getCompanyBenefitsResponse = benefitService.list(HriBenefitListParams.builder().build())
        println(getCompanyBenefitsResponse)
        getCompanyBenefitsResponse.items().forEach { it.validate() }
    }

    @Test
    fun callListSupportedBenefits() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .clientId("string")
                .clientSecret("string")
                .build()
        val benefitService = client.hris().benefits()
        val getCompanyBenefitsMetadataResponse =
            benefitService.listSupportedBenefits(
                HriBenefitListSupportedBenefitsParams.builder().build()
            )
        println(getCompanyBenefitsMetadataResponse)
        getCompanyBenefitsMetadataResponse.items().forEach { it.validate() }
    }
}

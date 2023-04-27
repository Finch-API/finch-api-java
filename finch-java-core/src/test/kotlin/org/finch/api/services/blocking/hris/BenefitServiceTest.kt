package org.finch.api.services.blocking.hris

import org.finch.api.TestServerExtension
import org.finch.api.client.okhttp.FinchOkHttpClient
import org.finch.api.models.*
import org.finch.api.models.HrisBenefitListParams
import org.finch.api.models.HrisBenefitListSupportedBenefitsParams
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
                HrisBenefitCreateParams.builder()
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
                .clientId("string")
                .clientSecret("string")
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
                .clientId("string")
                .clientSecret("string")
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
                .clientId("string")
                .clientSecret("string")
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

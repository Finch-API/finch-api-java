package com.tryfinch.api.services.blocking.hris.benefits

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import com.tryfinch.api.models.HriBenefitIndividualRetrieveManyBenefitsParams
import com.tryfinch.api.models.HriBenefitIndividualUnenrollParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class IndividualServiceTest {

    @Test
    fun callEnrolledIds() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .clientId("string")
                .clientSecret("string")
                .build()
        val individualService = client.hris().benefits().individuals()
        val individualEnrolledIdsResponse =
            individualService.enrolledIds(
                HriBenefitIndividualEnrolledIdsParams.builder().benefitId("string").build()
            )
        println(individualEnrolledIdsResponse)
        individualEnrolledIdsResponse.validate()
    }

    @Test
    fun callRetrieveManyBenefits() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .clientId("string")
                .clientSecret("string")
                .build()
        val individualService = client.hris().benefits().individuals()
        val individualBenefits =
            individualService.retrieveManyBenefits(
                HriBenefitIndividualRetrieveManyBenefitsParams.builder().benefitId("string").build()
            )
        println(individualBenefits)
        individualBenefits.items().forEach { it.validate() }
    }

    @Test
    fun callUnenroll() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .clientId("string")
                .clientSecret("string")
                .build()
        val individualService = client.hris().benefits().individuals()
        val unenrollIndividualBenefitResponse =
            individualService.unenroll(
                HriBenefitIndividualUnenrollParams.builder().benefitId("string").build()
            )
        println(unenrollIndividualBenefitResponse)
        unenrollIndividualBenefitResponse.items().forEach { it.validate() }
    }
}

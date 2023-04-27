package org.finch.api.services.blocking.hris.benefits

import org.finch.api.TestServerExtension
import org.finch.api.client.okhttp.FinchOkHttpClient
import org.finch.api.models.*
import org.finch.api.models.HrisBenefitsIndividualRetrieveManyBenefitsParams
import org.finch.api.models.HrisBenefitsIndividualUnenrollParams
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
                HrisBenefitsIndividualEnrolledIdsParams.builder().benefitId("string").build()
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
                HrisBenefitsIndividualRetrieveManyBenefitsParams.builder()
                    .benefitId("string")
                    .build()
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
                HrisBenefitsIndividualUnenrollParams.builder().benefitId("string").build()
            )
        println(unenrollIndividualBenefitResponse)
        unenrollIndividualBenefitResponse.items().forEach { it.validate() }
    }
}

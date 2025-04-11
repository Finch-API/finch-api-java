// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris.benefits

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.HrisBenefitIndividualEnrolledIdsParams
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsParams
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IndividualServiceTest {

    @Test
    fun enrolledIds() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val individualService = client.hris().benefits().individuals()

        val response =
            individualService.enrolledIds(
                HrisBenefitIndividualEnrolledIdsParams.builder().benefitId("benefit_id").build()
            )

        response.validate()
    }

    @Test
    fun retrieveManyBenefits() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val individualService = client.hris().benefits().individuals()

        val page =
            individualService.retrieveManyBenefits(
                HrisBenefitIndividualRetrieveManyBenefitsParams.builder()
                    .benefitId("benefit_id")
                    .build()
            )

        page.items().forEach { it.validate() }
    }

    @Test
    fun unenrollMany() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val individualService = client.hris().benefits().individuals()

        val unenrolledIndividualBenefitResponse =
            individualService.unenrollMany(
                HrisBenefitIndividualUnenrollManyParams.builder()
                    .benefitId("benefit_id")
                    .addIndividualId("string")
                    .build()
            )

        unenrolledIndividualBenefitResponse.validate()
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris.benefits

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.HrisBenefitIndividualEnrolledIdsParams
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsParams
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IndividualServiceAsyncTest {

    @Test
    fun enrolledIds() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val individualServiceAsync = client.hris().benefits().individuals()

        val responseFuture =
            individualServiceAsync.enrolledIds(
                HrisBenefitIndividualEnrolledIdsParams.builder().benefitId("benefit_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun retrieveManyBenefits() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val individualServiceAsync = client.hris().benefits().individuals()

        val pageFuture =
            individualServiceAsync.retrieveManyBenefits(
                HrisBenefitIndividualRetrieveManyBenefitsParams.builder()
                    .benefitId("benefit_id")
                    .build()
            )

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun unenrollMany() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val individualServiceAsync = client.hris().benefits().individuals()

        val unenrolledIndividualBenefitResponseFuture =
            individualServiceAsync.unenrollMany(
                HrisBenefitIndividualUnenrollManyParams.builder()
                    .benefitId("benefit_id")
                    .addIndividualId("string")
                    .build()
            )

        val unenrolledIndividualBenefitResponse = unenrolledIndividualBenefitResponseFuture.get()
        unenrolledIndividualBenefitResponse.validate()
    }
}

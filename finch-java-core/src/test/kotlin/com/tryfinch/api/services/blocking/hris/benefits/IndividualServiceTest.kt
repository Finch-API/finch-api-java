// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris.benefits

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.HrisBenefitIndividualEnrollManyParams
import com.tryfinch.api.models.HrisBenefitIndividualEnrolledIdsParams
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IndividualServiceTest {

    @Test
    fun enrollMany() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val individualService = client.hris().benefits().individuals()

        val enrolledIndividualBenefitResponse =
            individualService.enrollMany(
                HrisBenefitIndividualEnrollManyParams.builder()
                    .benefitId("benefit_id")
                    .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                    .addIndividual(
                        HrisBenefitIndividualEnrollManyParams.Individual.builder()
                            .configuration(
                                HrisBenefitIndividualEnrollManyParams.Individual.Configuration
                                    .builder()
                                    .annualContributionLimit(
                                        HrisBenefitIndividualEnrollManyParams.Individual
                                            .Configuration
                                            .AnnualContributionLimit
                                            .INDIVIDUAL
                                    )
                                    .annualMaximum(null)
                                    .catchUp(true)
                                    .companyContribution(
                                        HrisBenefitIndividualEnrollManyParams.Individual
                                            .Configuration
                                            .CompanyContribution
                                            .builder()
                                            .amount(0L)
                                            .addTier(
                                                HrisBenefitIndividualEnrollManyParams.Individual
                                                    .Configuration
                                                    .CompanyContribution
                                                    .Tier
                                                    .builder()
                                                    .match(0L)
                                                    .threshold(0L)
                                                    .build()
                                            )
                                            .type(
                                                HrisBenefitIndividualEnrollManyParams.Individual
                                                    .Configuration
                                                    .CompanyContribution
                                                    .Type
                                                    .FIXED
                                            )
                                            .build()
                                    )
                                    .effectiveDate(LocalDate.parse("2019-12-27"))
                                    .employeeDeduction(
                                        HrisBenefitIndividualEnrollManyParams.Individual
                                            .Configuration
                                            .EmployeeDeduction
                                            .builder()
                                            .amount(10000L)
                                            .type(
                                                HrisBenefitIndividualEnrollManyParams.Individual
                                                    .Configuration
                                                    .EmployeeDeduction
                                                    .Type
                                                    .FIXED
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .individualId("d02a6346-1f08-4312-a064-49ff3cafaa7a")
                            .build()
                    )
                    .build()
            )

        enrolledIndividualBenefitResponse.validate()
    }

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
                HrisBenefitIndividualEnrolledIdsParams.builder()
                    .benefitId("benefit_id")
                    .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                    .build()
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

        val page = individualService.retrieveManyBenefits("benefit_id")

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
                    .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                    .addIndividualId("string")
                    .build()
            )

        unenrolledIndividualBenefitResponse.validate()
    }
}

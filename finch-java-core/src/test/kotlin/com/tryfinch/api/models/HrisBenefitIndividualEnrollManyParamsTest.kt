// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.http.QueryParams
import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisBenefitIndividualEnrollManyParamsTest {

    @Test
    fun create() {
        HrisBenefitIndividualEnrollManyParams.builder()
            .benefitId("benefit_id")
            .addEntityId("550e8400-e29b-41d4-a716-446655440000")
            .addIndividual(
                HrisBenefitIndividualEnrollManyParams.Individual.builder()
                    .configuration(
                        HrisBenefitIndividualEnrollManyParams.Individual.Configuration.builder()
                            .annualContributionLimit(
                                HrisBenefitIndividualEnrollManyParams.Individual.Configuration
                                    .AnnualContributionLimit
                                    .INDIVIDUAL
                            )
                            .annualMaximum(null)
                            .catchUp(true)
                            .companyContribution(
                                HrisBenefitIndividualEnrollManyParams.Individual.Configuration
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
                                HrisBenefitIndividualEnrollManyParams.Individual.Configuration
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
    }

    @Test
    fun pathParams() {
        val params = HrisBenefitIndividualEnrollManyParams.builder().benefitId("benefit_id").build()

        assertThat(params._pathParam(0)).isEqualTo("benefit_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            HrisBenefitIndividualEnrollManyParams.builder()
                .benefitId("benefit_id")
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .addIndividual(
                    HrisBenefitIndividualEnrollManyParams.Individual.builder()
                        .configuration(
                            HrisBenefitIndividualEnrollManyParams.Individual.Configuration.builder()
                                .annualContributionLimit(
                                    HrisBenefitIndividualEnrollManyParams.Individual.Configuration
                                        .AnnualContributionLimit
                                        .INDIVIDUAL
                                )
                                .annualMaximum(null)
                                .catchUp(true)
                                .companyContribution(
                                    HrisBenefitIndividualEnrollManyParams.Individual.Configuration
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
                                    HrisBenefitIndividualEnrollManyParams.Individual.Configuration
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("entity_ids[]", "550e8400-e29b-41d4-a716-446655440000")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = HrisBenefitIndividualEnrollManyParams.builder().benefitId("benefit_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            HrisBenefitIndividualEnrollManyParams.builder()
                .benefitId("benefit_id")
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .addIndividual(
                    HrisBenefitIndividualEnrollManyParams.Individual.builder()
                        .configuration(
                            HrisBenefitIndividualEnrollManyParams.Individual.Configuration.builder()
                                .annualContributionLimit(
                                    HrisBenefitIndividualEnrollManyParams.Individual.Configuration
                                        .AnnualContributionLimit
                                        .INDIVIDUAL
                                )
                                .annualMaximum(null)
                                .catchUp(true)
                                .companyContribution(
                                    HrisBenefitIndividualEnrollManyParams.Individual.Configuration
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
                                    HrisBenefitIndividualEnrollManyParams.Individual.Configuration
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

        val body = params._body().getOrNull()

        assertThat(body)
            .containsExactly(
                HrisBenefitIndividualEnrollManyParams.Individual.builder()
                    .configuration(
                        HrisBenefitIndividualEnrollManyParams.Individual.Configuration.builder()
                            .annualContributionLimit(
                                HrisBenefitIndividualEnrollManyParams.Individual.Configuration
                                    .AnnualContributionLimit
                                    .INDIVIDUAL
                            )
                            .annualMaximum(null)
                            .catchUp(true)
                            .companyContribution(
                                HrisBenefitIndividualEnrollManyParams.Individual.Configuration
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
                                HrisBenefitIndividualEnrollManyParams.Individual.Configuration
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = HrisBenefitIndividualEnrollManyParams.builder().benefitId("benefit_id").build()

        val body = params._body().getOrNull()
    }
}

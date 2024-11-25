// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EmploymentDataResponseTest {

    @Test
    fun createEmploymentDataResponse() {
        val employmentDataResponse =
            EmploymentDataResponse.builder()
                .body(
                    EmploymentData.builder()
                        .id("id")
                        .classCode("class_code")
                        .customFields(
                            listOf(
                                EmploymentData.CustomField.builder()
                                    .name("name")
                                    .value(JsonValue.from(mapOf<String, Any>()))
                                    .build()
                            )
                        )
                        .department(EmploymentData.Department.builder().name("name").build())
                        .employment(
                            EmploymentData.Employment.builder()
                                .subtype(EmploymentData.Employment.Subtype.FULL_TIME)
                                .type(EmploymentData.Employment.Type.EMPLOYEE)
                                .build()
                        )
                        .endDate("end_date")
                        .firstName("first_name")
                        .income(
                            Income.builder()
                                .amount(0L)
                                .currency("currency")
                                .effectiveDate("effective_date")
                                .unit(Income.Unit.YEARLY)
                                .build()
                        )
                        .incomeHistory(
                            listOf(
                                Income.builder()
                                    .amount(0L)
                                    .currency("currency")
                                    .effectiveDate("effective_date")
                                    .unit(Income.Unit.YEARLY)
                                    .build()
                            )
                        )
                        .isActive(true)
                        .lastName("last_name")
                        .latestRehireDate("latest_rehire_date")
                        .location(
                            Location.builder()
                                .city("city")
                                .country("country")
                                .line1("line1")
                                .line2("line2")
                                .name("name")
                                .postalCode("postal_code")
                                .sourceId("source_id")
                                .state("state")
                                .build()
                        )
                        .manager(EmploymentData.Manager.builder().id("id").build())
                        .middleName("middle_name")
                        .sourceId("source_id")
                        .startDate("start_date")
                        .title("title")
                        .workId("work_id")
                        .build()
                )
                .code(0L)
                .individualId("individual_id")
                .build()
        assertThat(employmentDataResponse).isNotNull
        assertThat(employmentDataResponse.body())
            .contains(
                EmploymentData.builder()
                    .id("id")
                    .classCode("class_code")
                    .customFields(
                        listOf(
                            EmploymentData.CustomField.builder()
                                .name("name")
                                .value(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                    )
                    .department(EmploymentData.Department.builder().name("name").build())
                    .employment(
                        EmploymentData.Employment.builder()
                            .subtype(EmploymentData.Employment.Subtype.FULL_TIME)
                            .type(EmploymentData.Employment.Type.EMPLOYEE)
                            .build()
                    )
                    .endDate("end_date")
                    .firstName("first_name")
                    .income(
                        Income.builder()
                            .amount(0L)
                            .currency("currency")
                            .effectiveDate("effective_date")
                            .unit(Income.Unit.YEARLY)
                            .build()
                    )
                    .incomeHistory(
                        listOf(
                            Income.builder()
                                .amount(0L)
                                .currency("currency")
                                .effectiveDate("effective_date")
                                .unit(Income.Unit.YEARLY)
                                .build()
                        )
                    )
                    .isActive(true)
                    .lastName("last_name")
                    .latestRehireDate("latest_rehire_date")
                    .location(
                        Location.builder()
                            .city("city")
                            .country("country")
                            .line1("line1")
                            .line2("line2")
                            .name("name")
                            .postalCode("postal_code")
                            .sourceId("source_id")
                            .state("state")
                            .build()
                    )
                    .manager(EmploymentData.Manager.builder().id("id").build())
                    .middleName("middle_name")
                    .sourceId("source_id")
                    .startDate("start_date")
                    .title("title")
                    .workId("work_id")
                    .build()
            )
        assertThat(employmentDataResponse.code()).contains(0L)
        assertThat(employmentDataResponse.individualId()).contains("individual_id")
    }
}

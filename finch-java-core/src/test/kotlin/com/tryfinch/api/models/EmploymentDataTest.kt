// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EmploymentDataTest {

    @Test
    fun createEmploymentData() {
        val employmentData =
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
                        .amount(123L)
                        .currency("currency")
                        .effectiveDate("effective_date")
                        .unit(Income.Unit.YEARLY)
                        .build()
                )
                .incomeHistory(
                    listOf(
                        Income.builder()
                            .amount(123L)
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
        assertThat(employmentData).isNotNull
        assertThat(employmentData.id()).contains("id")
        assertThat(employmentData.classCode()).contains("class_code")
        assertThat(employmentData.customFields().get())
            .containsExactly(
                EmploymentData.CustomField.builder()
                    .name("name")
                    .value(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(employmentData.department())
            .contains(EmploymentData.Department.builder().name("name").build())
        assertThat(employmentData.employment())
            .contains(
                EmploymentData.Employment.builder()
                    .subtype(EmploymentData.Employment.Subtype.FULL_TIME)
                    .type(EmploymentData.Employment.Type.EMPLOYEE)
                    .build()
            )
        assertThat(employmentData.endDate()).contains("end_date")
        assertThat(employmentData.firstName()).contains("first_name")
        assertThat(employmentData.income())
            .contains(
                Income.builder()
                    .amount(123L)
                    .currency("currency")
                    .effectiveDate("effective_date")
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(employmentData.incomeHistory().get())
            .containsExactly(
                Income.builder()
                    .amount(123L)
                    .currency("currency")
                    .effectiveDate("effective_date")
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(employmentData.isActive()).contains(true)
        assertThat(employmentData.lastName()).contains("last_name")
        assertThat(employmentData.latestRehireDate()).contains("latest_rehire_date")
        assertThat(employmentData.location())
            .contains(
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
        assertThat(employmentData.manager())
            .contains(EmploymentData.Manager.builder().id("id").build())
        assertThat(employmentData.middleName()).contains("middle_name")
        assertThat(employmentData.sourceId()).contains("source_id")
        assertThat(employmentData.startDate()).contains("start_date")
        assertThat(employmentData.title()).contains("title")
        assertThat(employmentData.workId()).contains("work_id")
    }
}

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
                .id("string")
                .classCode("string")
                .customFields(
                    listOf(
                        EmploymentData.CustomField.builder()
                            .name("string")
                            .value(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                )
                .department(EmploymentData.Department.builder().name("string").build())
                .employment(
                    EmploymentData.Employment.builder()
                        .subtype(EmploymentData.Employment.Subtype.FULL_TIME)
                        .type(EmploymentData.Employment.Type.EMPLOYEE)
                        .build()
                )
                .endDate("string")
                .firstName("string")
                .income(
                    Income.builder()
                        .amount(123L)
                        .currency("string")
                        .effectiveDate("string")
                        .unit(Income.Unit.YEARLY)
                        .build()
                )
                .incomeHistory(
                    listOf(
                        Income.builder()
                            .amount(123L)
                            .currency("string")
                            .effectiveDate("string")
                            .unit(Income.Unit.YEARLY)
                            .build()
                    )
                )
                .isActive(true)
                .lastName("string")
                .latestRehireDate("string")
                .location(
                    Location.builder()
                        .city("string")
                        .country("string")
                        .line1("string")
                        .line2("string")
                        .name("string")
                        .postalCode("string")
                        .sourceId("string")
                        .state("string")
                        .build()
                )
                .manager(EmploymentData.Manager.builder().id("string").build())
                .middleName("string")
                .sourceId("string")
                .startDate("string")
                .title("string")
                .workId("string")
                .build()
        assertThat(employmentData).isNotNull
        assertThat(employmentData.id()).contains("string")
        assertThat(employmentData.classCode()).contains("string")
        assertThat(employmentData.customFields().get())
            .containsExactly(
                EmploymentData.CustomField.builder()
                    .name("string")
                    .value(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(employmentData.department())
            .contains(EmploymentData.Department.builder().name("string").build())
        assertThat(employmentData.employment())
            .contains(
                EmploymentData.Employment.builder()
                    .subtype(EmploymentData.Employment.Subtype.FULL_TIME)
                    .type(EmploymentData.Employment.Type.EMPLOYEE)
                    .build()
            )
        assertThat(employmentData.endDate()).contains("string")
        assertThat(employmentData.firstName()).contains("string")
        assertThat(employmentData.income())
            .contains(
                Income.builder()
                    .amount(123L)
                    .currency("string")
                    .effectiveDate("string")
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(employmentData.incomeHistory().get())
            .containsExactly(
                Income.builder()
                    .amount(123L)
                    .currency("string")
                    .effectiveDate("string")
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(employmentData.isActive()).contains(true)
        assertThat(employmentData.lastName()).contains("string")
        assertThat(employmentData.latestRehireDate()).contains("string")
        assertThat(employmentData.location())
            .contains(
                Location.builder()
                    .city("string")
                    .country("string")
                    .line1("string")
                    .line2("string")
                    .name("string")
                    .postalCode("string")
                    .sourceId("string")
                    .state("string")
                    .build()
            )
        assertThat(employmentData.manager())
            .contains(EmploymentData.Manager.builder().id("string").build())
        assertThat(employmentData.middleName()).contains("string")
        assertThat(employmentData.sourceId()).contains("string")
        assertThat(employmentData.startDate()).contains("string")
        assertThat(employmentData.title()).contains("string")
        assertThat(employmentData.workId()).contains("string")
    }
}

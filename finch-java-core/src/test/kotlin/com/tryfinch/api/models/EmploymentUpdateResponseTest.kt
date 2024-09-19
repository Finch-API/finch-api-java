// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EmploymentUpdateResponseTest {

    @Test
    fun createEmploymentUpdateResponse() {
        val employmentUpdateResponse =
            EmploymentUpdateResponse.builder()
                .id("id")
                .classCode("class_code")
                .customFields(
                    listOf(
                        EmploymentUpdateResponse.CustomField.builder()
                            .name("name")
                            .value(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                )
                .department(EmploymentUpdateResponse.Department.builder().name("name").build())
                .employment(
                    EmploymentUpdateResponse.Employment.builder()
                        .subtype(EmploymentUpdateResponse.Employment.Subtype.FULL_TIME)
                        .type(EmploymentUpdateResponse.Employment.Type.EMPLOYEE)
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
                .manager(EmploymentUpdateResponse.Manager.builder().id("id").build())
                .middleName("middle_name")
                .sourceId("source_id")
                .startDate("start_date")
                .title("title")
                .build()
        assertThat(employmentUpdateResponse).isNotNull
        assertThat(employmentUpdateResponse.id()).contains("id")
        assertThat(employmentUpdateResponse.classCode()).contains("class_code")
        assertThat(employmentUpdateResponse.customFields().get())
            .containsExactly(
                EmploymentUpdateResponse.CustomField.builder()
                    .name("name")
                    .value(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(employmentUpdateResponse.department())
            .contains(EmploymentUpdateResponse.Department.builder().name("name").build())
        assertThat(employmentUpdateResponse.employment())
            .contains(
                EmploymentUpdateResponse.Employment.builder()
                    .subtype(EmploymentUpdateResponse.Employment.Subtype.FULL_TIME)
                    .type(EmploymentUpdateResponse.Employment.Type.EMPLOYEE)
                    .build()
            )
        assertThat(employmentUpdateResponse.endDate()).contains("end_date")
        assertThat(employmentUpdateResponse.firstName()).contains("first_name")
        assertThat(employmentUpdateResponse.income())
            .contains(
                Income.builder()
                    .amount(123L)
                    .currency("currency")
                    .effectiveDate("effective_date")
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(employmentUpdateResponse.incomeHistory().get())
            .containsExactly(
                Income.builder()
                    .amount(123L)
                    .currency("currency")
                    .effectiveDate("effective_date")
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(employmentUpdateResponse.isActive()).contains(true)
        assertThat(employmentUpdateResponse.lastName()).contains("last_name")
        assertThat(employmentUpdateResponse.latestRehireDate()).contains("latest_rehire_date")
        assertThat(employmentUpdateResponse.location())
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
        assertThat(employmentUpdateResponse.manager())
            .contains(EmploymentUpdateResponse.Manager.builder().id("id").build())
        assertThat(employmentUpdateResponse.middleName()).contains("middle_name")
        assertThat(employmentUpdateResponse.sourceId()).contains("source_id")
        assertThat(employmentUpdateResponse.startDate()).contains("start_date")
        assertThat(employmentUpdateResponse.title()).contains("title")
    }
}

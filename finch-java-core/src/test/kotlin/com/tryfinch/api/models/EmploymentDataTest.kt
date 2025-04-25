// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmploymentDataTest {

    @Test
    fun create() {
        val employmentData =
            EmploymentData.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .classCode("class_code")
                .addCustomField(
                    EmploymentData.CustomField.builder()
                        .name("name")
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .department(EmploymentData.Department.builder().name("name").build())
                .employment(
                    EmploymentData.Employment.builder()
                        .subtype(EmploymentData.Employment.Subtype.FULL_TIME)
                        .type(EmploymentData.Employment.Type.EMPLOYEE)
                        .build()
                )
                .employmentStatus(EmploymentData.EmploymentStatus.ACTIVE)
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
                .addIncomeHistory(
                    Income.builder()
                        .amount(0L)
                        .currency("currency")
                        .effectiveDate("effective_date")
                        .unit(Income.Unit.YEARLY)
                        .build()
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
                        .postalCode("postal_code")
                        .state("state")
                        .name("name")
                        .sourceId("source_id")
                        .build()
                )
                .manager(
                    EmploymentData.Manager.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .middleName("middle_name")
                .sourceId("source_id")
                .startDate("start_date")
                .title("title")
                .workId("work_id")
                .build()

        assertThat(employmentData.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(employmentData.classCode()).contains("class_code")
        assertThat(employmentData.customFields().getOrNull())
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
        assertThat(employmentData.employmentStatus())
            .contains(EmploymentData.EmploymentStatus.ACTIVE)
        assertThat(employmentData.endDate()).contains("end_date")
        assertThat(employmentData.firstName()).contains("first_name")
        assertThat(employmentData.income())
            .contains(
                Income.builder()
                    .amount(0L)
                    .currency("currency")
                    .effectiveDate("effective_date")
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(employmentData.incomeHistory().getOrNull())
            .containsExactly(
                Income.builder()
                    .amount(0L)
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
                    .postalCode("postal_code")
                    .state("state")
                    .name("name")
                    .sourceId("source_id")
                    .build()
            )
        assertThat(employmentData.manager())
            .contains(
                EmploymentData.Manager.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )
        assertThat(employmentData.middleName()).contains("middle_name")
        assertThat(employmentData.sourceId()).contains("source_id")
        assertThat(employmentData.startDate()).contains("start_date")
        assertThat(employmentData.title()).contains("title")
        assertThat(employmentData.workId()).contains("work_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val employmentData =
            EmploymentData.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .classCode("class_code")
                .addCustomField(
                    EmploymentData.CustomField.builder()
                        .name("name")
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .department(EmploymentData.Department.builder().name("name").build())
                .employment(
                    EmploymentData.Employment.builder()
                        .subtype(EmploymentData.Employment.Subtype.FULL_TIME)
                        .type(EmploymentData.Employment.Type.EMPLOYEE)
                        .build()
                )
                .employmentStatus(EmploymentData.EmploymentStatus.ACTIVE)
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
                .addIncomeHistory(
                    Income.builder()
                        .amount(0L)
                        .currency("currency")
                        .effectiveDate("effective_date")
                        .unit(Income.Unit.YEARLY)
                        .build()
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
                        .postalCode("postal_code")
                        .state("state")
                        .name("name")
                        .sourceId("source_id")
                        .build()
                )
                .manager(
                    EmploymentData.Manager.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .middleName("middle_name")
                .sourceId("source_id")
                .startDate("start_date")
                .title("title")
                .workId("work_id")
                .build()

        val roundtrippedEmploymentData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(employmentData),
                jacksonTypeRef<EmploymentData>(),
            )

        assertThat(roundtrippedEmploymentData).isEqualTo(employmentData)
    }
}

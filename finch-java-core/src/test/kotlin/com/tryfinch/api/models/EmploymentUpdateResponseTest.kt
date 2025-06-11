// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.jsonMapper
import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmploymentUpdateResponseTest {

    @Test
    fun create() {
        val employmentUpdateResponse =
            EmploymentUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .classCode("class_code")
                .addCustomField(
                    EmploymentUpdateResponse.CustomField.builder()
                        .name("name")
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .department(EmploymentUpdateResponse.Department.builder().name("name").build())
                .employment(
                    EmploymentUpdateResponse.Employment.builder()
                        .subtype(EmploymentUpdateResponse.Employment.Subtype.FULL_TIME)
                        .type(EmploymentUpdateResponse.Employment.Type.EMPLOYEE)
                        .build()
                )
                .employmentStatus(EmploymentUpdateResponse.EmploymentStatus.ACTIVE)
                .endDate("end_date")
                .firstName("first_name")
                .income(
                    Income.builder()
                        .amount(0L)
                        .currency("currency")
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .unit(Income.Unit.YEARLY)
                        .build()
                )
                .addIncomeHistory(
                    Income.builder()
                        .amount(0L)
                        .currency("currency")
                        .effectiveDate(LocalDate.parse("2019-12-27"))
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
                    EmploymentUpdateResponse.Manager.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .middleName("middle_name")
                .sourceId("source_id")
                .startDate("start_date")
                .title("title")
                .build()

        assertThat(employmentUpdateResponse.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(employmentUpdateResponse.classCode()).contains("class_code")
        assertThat(employmentUpdateResponse.customFields().getOrNull())
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
        assertThat(employmentUpdateResponse.employmentStatus())
            .contains(EmploymentUpdateResponse.EmploymentStatus.ACTIVE)
        assertThat(employmentUpdateResponse.endDate()).contains("end_date")
        assertThat(employmentUpdateResponse.firstName()).contains("first_name")
        assertThat(employmentUpdateResponse.income())
            .contains(
                Income.builder()
                    .amount(0L)
                    .currency("currency")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(employmentUpdateResponse.incomeHistory().getOrNull())
            .containsExactly(
                Income.builder()
                    .amount(0L)
                    .currency("currency")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
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
                    .postalCode("postal_code")
                    .state("state")
                    .name("name")
                    .sourceId("source_id")
                    .build()
            )
        assertThat(employmentUpdateResponse.manager())
            .contains(
                EmploymentUpdateResponse.Manager.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(employmentUpdateResponse.middleName()).contains("middle_name")
        assertThat(employmentUpdateResponse.sourceId()).contains("source_id")
        assertThat(employmentUpdateResponse.startDate()).contains("start_date")
        assertThat(employmentUpdateResponse.title()).contains("title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val employmentUpdateResponse =
            EmploymentUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .classCode("class_code")
                .addCustomField(
                    EmploymentUpdateResponse.CustomField.builder()
                        .name("name")
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .department(EmploymentUpdateResponse.Department.builder().name("name").build())
                .employment(
                    EmploymentUpdateResponse.Employment.builder()
                        .subtype(EmploymentUpdateResponse.Employment.Subtype.FULL_TIME)
                        .type(EmploymentUpdateResponse.Employment.Type.EMPLOYEE)
                        .build()
                )
                .employmentStatus(EmploymentUpdateResponse.EmploymentStatus.ACTIVE)
                .endDate("end_date")
                .firstName("first_name")
                .income(
                    Income.builder()
                        .amount(0L)
                        .currency("currency")
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .unit(Income.Unit.YEARLY)
                        .build()
                )
                .addIncomeHistory(
                    Income.builder()
                        .amount(0L)
                        .currency("currency")
                        .effectiveDate(LocalDate.parse("2019-12-27"))
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
                    EmploymentUpdateResponse.Manager.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .middleName("middle_name")
                .sourceId("source_id")
                .startDate("start_date")
                .title("title")
                .build()

        val roundtrippedEmploymentUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(employmentUpdateResponse),
                jacksonTypeRef<EmploymentUpdateResponse>(),
            )

        assertThat(roundtrippedEmploymentUpdateResponse).isEqualTo(employmentUpdateResponse)
    }
}

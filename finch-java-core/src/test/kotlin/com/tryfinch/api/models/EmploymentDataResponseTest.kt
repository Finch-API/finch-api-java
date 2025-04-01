// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmploymentDataResponseTest {

    @Test
    fun create() {
        val employmentDataResponse =
            EmploymentDataResponse.builder()
                .body(
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
                                .name("name")
                                .postalCode("postal_code")
                                .sourceId("source_id")
                                .state("state")
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
                )
                .code(0L)
                .individualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(employmentDataResponse.body())
            .contains(
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
                            .name("name")
                            .postalCode("postal_code")
                            .sourceId("source_id")
                            .state("state")
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
            )
        assertThat(employmentDataResponse.code()).contains(0L)
        assertThat(employmentDataResponse.individualId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val employmentDataResponse =
            EmploymentDataResponse.builder()
                .body(
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
                                .name("name")
                                .postalCode("postal_code")
                                .sourceId("source_id")
                                .state("state")
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
                )
                .code(0L)
                .individualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedEmploymentDataResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(employmentDataResponse),
                jacksonTypeRef<EmploymentDataResponse>(),
            )

        assertThat(roundtrippedEmploymentDataResponse).isEqualTo(employmentDataResponse)
    }
}

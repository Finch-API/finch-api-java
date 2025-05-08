// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SandboxEmploymentUpdateParamsTest {

    @Test
    fun create() {
        SandboxEmploymentUpdateParams.builder()
            .individualId("individual_id")
            .classCode("class_code")
            .addCustomField(
                SandboxEmploymentUpdateParams.CustomField.builder()
                    .name("name")
                    .value(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
            .department(SandboxEmploymentUpdateParams.Department.builder().name("name").build())
            .employment(
                SandboxEmploymentUpdateParams.Employment.builder()
                    .subtype(SandboxEmploymentUpdateParams.Employment.Subtype.FULL_TIME)
                    .type(SandboxEmploymentUpdateParams.Employment.Type.EMPLOYEE)
                    .build()
            )
            .employmentStatus(SandboxEmploymentUpdateParams.EmploymentStatus.ACTIVE)
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
                SandboxEmploymentUpdateParams.Manager.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .middleName("middle_name")
            .sourceId("source_id")
            .startDate("start_date")
            .title("title")
            .build()
    }

    @Test
    fun pathParams() {
        val params = SandboxEmploymentUpdateParams.builder().individualId("individual_id").build()

        assertThat(params._pathParam(0)).isEqualTo("individual_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SandboxEmploymentUpdateParams.builder()
                .individualId("individual_id")
                .classCode("class_code")
                .addCustomField(
                    SandboxEmploymentUpdateParams.CustomField.builder()
                        .name("name")
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .department(SandboxEmploymentUpdateParams.Department.builder().name("name").build())
                .employment(
                    SandboxEmploymentUpdateParams.Employment.builder()
                        .subtype(SandboxEmploymentUpdateParams.Employment.Subtype.FULL_TIME)
                        .type(SandboxEmploymentUpdateParams.Employment.Type.EMPLOYEE)
                        .build()
                )
                .employmentStatus(SandboxEmploymentUpdateParams.EmploymentStatus.ACTIVE)
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
                    SandboxEmploymentUpdateParams.Manager.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .middleName("middle_name")
                .sourceId("source_id")
                .startDate("start_date")
                .title("title")
                .build()

        val body = params._body()

        assertThat(body.classCode()).contains("class_code")
        assertThat(body.customFields().getOrNull())
            .containsExactly(
                SandboxEmploymentUpdateParams.CustomField.builder()
                    .name("name")
                    .value(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(body.department())
            .contains(SandboxEmploymentUpdateParams.Department.builder().name("name").build())
        assertThat(body.employment())
            .contains(
                SandboxEmploymentUpdateParams.Employment.builder()
                    .subtype(SandboxEmploymentUpdateParams.Employment.Subtype.FULL_TIME)
                    .type(SandboxEmploymentUpdateParams.Employment.Type.EMPLOYEE)
                    .build()
            )
        assertThat(body.employmentStatus())
            .contains(SandboxEmploymentUpdateParams.EmploymentStatus.ACTIVE)
        assertThat(body.endDate()).contains("end_date")
        assertThat(body.firstName()).contains("first_name")
        assertThat(body.income())
            .contains(
                Income.builder()
                    .amount(0L)
                    .currency("currency")
                    .effectiveDate("effective_date")
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(body.incomeHistory().getOrNull())
            .containsExactly(
                Income.builder()
                    .amount(0L)
                    .currency("currency")
                    .effectiveDate("effective_date")
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(body.isActive()).contains(true)
        assertThat(body.lastName()).contains("last_name")
        assertThat(body.latestRehireDate()).contains("latest_rehire_date")
        assertThat(body.location())
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
        assertThat(body.manager())
            .contains(
                SandboxEmploymentUpdateParams.Manager.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(body.middleName()).contains("middle_name")
        assertThat(body.sourceId()).contains("source_id")
        assertThat(body.startDate()).contains("start_date")
        assertThat(body.title()).contains("title")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SandboxEmploymentUpdateParams.builder().individualId("individual_id").build()

        val body = params._body()
    }
}

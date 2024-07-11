// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SandboxEmploymentUpdateParamsTest {

    @Test
    fun createSandboxEmploymentUpdateParams() {
        SandboxEmploymentUpdateParams.builder()
            .individualId("individual_id")
            .classCode("class_code")
            .customFields(
                listOf(
                    SandboxEmploymentUpdateParams.CustomField.builder()
                        .name("name")
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
            )
            .department(SandboxEmploymentUpdateParams.Department.builder().name("name").build())
            .employment(
                SandboxEmploymentUpdateParams.Employment.builder()
                    .subtype(SandboxEmploymentUpdateParams.Employment.Subtype.FULL_TIME)
                    .type(SandboxEmploymentUpdateParams.Employment.Type.EMPLOYEE)
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
            .manager(SandboxEmploymentUpdateParams.Manager.builder().id("id").build())
            .middleName("middle_name")
            .sourceId("source_id")
            .startDate("start_date")
            .title("title")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SandboxEmploymentUpdateParams.builder()
                .individualId("individual_id")
                .classCode("class_code")
                .customFields(
                    listOf(
                        SandboxEmploymentUpdateParams.CustomField.builder()
                            .name("name")
                            .value(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                )
                .department(SandboxEmploymentUpdateParams.Department.builder().name("name").build())
                .employment(
                    SandboxEmploymentUpdateParams.Employment.builder()
                        .subtype(SandboxEmploymentUpdateParams.Employment.Subtype.FULL_TIME)
                        .type(SandboxEmploymentUpdateParams.Employment.Type.EMPLOYEE)
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
                .manager(SandboxEmploymentUpdateParams.Manager.builder().id("id").build())
                .middleName("middle_name")
                .sourceId("source_id")
                .startDate("start_date")
                .title("title")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.classCode()).isEqualTo("class_code")
        assertThat(body.customFields())
            .isEqualTo(
                listOf(
                    SandboxEmploymentUpdateParams.CustomField.builder()
                        .name("name")
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
            )
        assertThat(body.department())
            .isEqualTo(SandboxEmploymentUpdateParams.Department.builder().name("name").build())
        assertThat(body.employment())
            .isEqualTo(
                SandboxEmploymentUpdateParams.Employment.builder()
                    .subtype(SandboxEmploymentUpdateParams.Employment.Subtype.FULL_TIME)
                    .type(SandboxEmploymentUpdateParams.Employment.Type.EMPLOYEE)
                    .build()
            )
        assertThat(body.endDate()).isEqualTo("end_date")
        assertThat(body.firstName()).isEqualTo("first_name")
        assertThat(body.income())
            .isEqualTo(
                Income.builder()
                    .amount(123L)
                    .currency("currency")
                    .effectiveDate("effective_date")
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(body.incomeHistory())
            .isEqualTo(
                listOf(
                    Income.builder()
                        .amount(123L)
                        .currency("currency")
                        .effectiveDate("effective_date")
                        .unit(Income.Unit.YEARLY)
                        .build()
                )
            )
        assertThat(body.isActive()).isEqualTo(true)
        assertThat(body.lastName()).isEqualTo("last_name")
        assertThat(body.location())
            .isEqualTo(
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
        assertThat(body.manager())
            .isEqualTo(SandboxEmploymentUpdateParams.Manager.builder().id("id").build())
        assertThat(body.middleName()).isEqualTo("middle_name")
        assertThat(body.sourceId()).isEqualTo("source_id")
        assertThat(body.startDate()).isEqualTo("start_date")
        assertThat(body.title()).isEqualTo("title")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = SandboxEmploymentUpdateParams.builder().individualId("individual_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = SandboxEmploymentUpdateParams.builder().individualId("individual_id").build()
        assertThat(params).isNotNull
        // path param "individualId"
        assertThat(params.getPathParam(0)).isEqualTo("individual_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}

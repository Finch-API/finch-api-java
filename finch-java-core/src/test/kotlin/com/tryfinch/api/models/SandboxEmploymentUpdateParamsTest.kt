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
            .individualId("string")
            .classCode("string")
            .customFields(
                listOf(
                    SandboxEmploymentUpdateParams.CustomField.builder()
                        .name("string")
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
            )
            .department(SandboxEmploymentUpdateParams.Department.builder().name("string").build())
            .employment(
                SandboxEmploymentUpdateParams.Employment.builder()
                    .subtype(SandboxEmploymentUpdateParams.Employment.Subtype.FULL_TIME)
                    .type(SandboxEmploymentUpdateParams.Employment.Type.EMPLOYEE)
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
            .manager(SandboxEmploymentUpdateParams.Manager.builder().id("string").build())
            .middleName("string")
            .sourceId("string")
            .startDate("string")
            .title("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SandboxEmploymentUpdateParams.builder()
                .individualId("string")
                .classCode("string")
                .customFields(
                    listOf(
                        SandboxEmploymentUpdateParams.CustomField.builder()
                            .name("string")
                            .value(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                )
                .department(
                    SandboxEmploymentUpdateParams.Department.builder().name("string").build()
                )
                .employment(
                    SandboxEmploymentUpdateParams.Employment.builder()
                        .subtype(SandboxEmploymentUpdateParams.Employment.Subtype.FULL_TIME)
                        .type(SandboxEmploymentUpdateParams.Employment.Type.EMPLOYEE)
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
                .manager(SandboxEmploymentUpdateParams.Manager.builder().id("string").build())
                .middleName("string")
                .sourceId("string")
                .startDate("string")
                .title("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.classCode()).isEqualTo("string")
        assertThat(body.customFields())
            .isEqualTo(
                listOf(
                    SandboxEmploymentUpdateParams.CustomField.builder()
                        .name("string")
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
            )
        assertThat(body.department())
            .isEqualTo(SandboxEmploymentUpdateParams.Department.builder().name("string").build())
        assertThat(body.employment())
            .isEqualTo(
                SandboxEmploymentUpdateParams.Employment.builder()
                    .subtype(SandboxEmploymentUpdateParams.Employment.Subtype.FULL_TIME)
                    .type(SandboxEmploymentUpdateParams.Employment.Type.EMPLOYEE)
                    .build()
            )
        assertThat(body.endDate()).isEqualTo("string")
        assertThat(body.firstName()).isEqualTo("string")
        assertThat(body.income())
            .isEqualTo(
                Income.builder()
                    .amount(123L)
                    .currency("string")
                    .effectiveDate("string")
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(body.incomeHistory())
            .isEqualTo(
                listOf(
                    Income.builder()
                        .amount(123L)
                        .currency("string")
                        .effectiveDate("string")
                        .unit(Income.Unit.YEARLY)
                        .build()
                )
            )
        assertThat(body.isActive()).isEqualTo(true)
        assertThat(body.lastName()).isEqualTo("string")
        assertThat(body.location())
            .isEqualTo(
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
        assertThat(body.manager())
            .isEqualTo(SandboxEmploymentUpdateParams.Manager.builder().id("string").build())
        assertThat(body.middleName()).isEqualTo("string")
        assertThat(body.sourceId()).isEqualTo("string")
        assertThat(body.startDate()).isEqualTo("string")
        assertThat(body.title()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = SandboxEmploymentUpdateParams.builder().individualId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = SandboxEmploymentUpdateParams.builder().individualId("string").build()
        assertThat(params).isNotNull
        // path param "individualId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}

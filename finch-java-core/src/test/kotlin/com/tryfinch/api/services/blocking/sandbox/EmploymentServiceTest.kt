// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EmploymentServiceTest {

    @Test
    fun callUpdate() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val employmentService = client.sandbox().employment()
        val employmentUpdateResponse =
            employmentService.update(
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
            )
        println(employmentUpdateResponse)
        employmentUpdateResponse.validate()
    }
}

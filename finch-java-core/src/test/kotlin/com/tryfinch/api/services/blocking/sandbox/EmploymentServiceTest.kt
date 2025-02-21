// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.models.Income
import com.tryfinch.api.models.Location
import com.tryfinch.api.models.SandboxEmploymentUpdateParams
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
                    .individualId("individual_id")
                    .classCode("class_code")
                    .addCustomField(
                        SandboxEmploymentUpdateParams.CustomField.builder()
                            .name("name")
                            .value(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .department(
                        SandboxEmploymentUpdateParams.Department.builder().name("name").build()
                    )
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
            )
        println(employmentUpdateResponse)
        employmentUpdateResponse.validate()
    }
}

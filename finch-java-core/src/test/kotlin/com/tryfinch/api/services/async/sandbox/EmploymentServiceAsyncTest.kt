// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.models.Income
import com.tryfinch.api.models.Location
import com.tryfinch.api.models.SandboxEmploymentUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EmploymentServiceAsyncTest {

    @Test
    fun update() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val employmentServiceAsync = client.sandbox().employment()

        val employmentFuture =
            employmentServiceAsync.update(
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
                        SandboxEmploymentUpdateParams.Manager.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .middleName("middle_name")
                    .sourceId("source_id")
                    .startDate("start_date")
                    .title("title")
                    .build()
            )

        val employment = employmentFuture.get()
        employment.validate()
    }
}

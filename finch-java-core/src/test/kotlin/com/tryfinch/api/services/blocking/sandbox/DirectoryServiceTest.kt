// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.Income
import com.tryfinch.api.models.Location
import com.tryfinch.api.models.SandboxDirectoryCreateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DirectoryServiceTest {

    @Test
    fun create() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val directoryService = client.sandbox().directory()

        val directories =
            directoryService.create(
                listOf(
                    SandboxDirectoryCreateParams.IndividualOrEmployment.builder()
                        .classCode("class_code")
                        .addCustomField(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.CustomField
                                .builder()
                                .name("name")
                                .value("string")
                                .build()
                        )
                        .department(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.Department.builder()
                                .name("name")
                                .build()
                        )
                        .dob("dob")
                        .addEmail(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.Email.builder()
                                .data("data")
                                .type(
                                    SandboxDirectoryCreateParams.IndividualOrEmployment.Email.Type
                                        .WORK
                                )
                                .build()
                        )
                        .employment(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.Employment.builder()
                                .subtype(
                                    SandboxDirectoryCreateParams.IndividualOrEmployment.Employment
                                        .Subtype
                                        .FULL_TIME
                                )
                                .type(
                                    SandboxDirectoryCreateParams.IndividualOrEmployment.Employment
                                        .Type
                                        .EMPLOYEE
                                )
                                .build()
                        )
                        .employmentStatus(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.EmploymentStatus
                                .ACTIVE
                        )
                        .encryptedSsn("encrypted_ssn")
                        .endDate("end_date")
                        .ethnicity(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.Ethnicity.ASIAN
                        )
                        .firstName("first_name")
                        .flsaStatus(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.FlsaStatus.EXEMPT
                        )
                        .gender(SandboxDirectoryCreateParams.IndividualOrEmployment.Gender.FEMALE)
                        .highlyCompensatedEmployee(true)
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
                        .keyEmployee(true)
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
                            SandboxDirectoryCreateParams.IndividualOrEmployment.Manager.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .maritalStatus(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.MaritalStatus.SINGLE
                        )
                        .middleName("middle_name")
                        .addPhoneNumber(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.PhoneNumber
                                .builder()
                                .data("data")
                                .type(
                                    SandboxDirectoryCreateParams.IndividualOrEmployment.PhoneNumber
                                        .Type
                                        .WORK
                                )
                                .build()
                        )
                        .preferredName("preferred_name")
                        .residence(
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
                        .sourceId("source_id")
                        .ssn("ssn")
                        .startDate("start_date")
                        .title("title")
                        .unionCode("union_code")
                        .unionLocal("union_local")
                        .build()
                )
            )

        directories.forEach { it.validate() }
    }
}

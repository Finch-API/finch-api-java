// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CompanyServiceTest {

    @Test
    fun callUpdate() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val companyService = client.sandbox().company()
        val companyUpdateResponse =
            companyService.update(
                SandboxCompanyUpdateParams.builder()
                    .accounts(
                        listOf(
                            SandboxCompanyUpdateParams.Account.builder()
                                .accountName("string")
                                .accountNumber("string")
                                .accountType(
                                    SandboxCompanyUpdateParams.Account.AccountType.CHECKING
                                )
                                .institutionName("string")
                                .routingNumber("string")
                                .build()
                        )
                    )
                    .departments(
                        listOf(
                            SandboxCompanyUpdateParams.Department.builder()
                                .name("string")
                                .parent(
                                    SandboxCompanyUpdateParams.Department.Parent.builder()
                                        .name("string")
                                        .build()
                                )
                                .build()
                        )
                    )
                    .ein("string")
                    .entity(
                        SandboxCompanyUpdateParams.Entity.builder()
                            .subtype(SandboxCompanyUpdateParams.Entity.Subtype.S_CORPORATION)
                            .type(SandboxCompanyUpdateParams.Entity.Type.LLC)
                            .build()
                    )
                    .legalName("string")
                    .locations(
                        listOf(
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
                    )
                    .primaryEmail("string")
                    .primaryPhoneNumber("string")
                    .build()
            )
        println(companyUpdateResponse)
        companyUpdateResponse.validate()
    }
}

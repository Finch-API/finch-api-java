// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CompanyUpdateResponseTest {

    @Test
    fun createCompanyUpdateResponse() {
        val companyUpdateResponse =
            CompanyUpdateResponse.builder()
                .accounts(
                    listOf(
                        CompanyUpdateResponse.Account.builder()
                            .accountName("string")
                            .accountNumber("string")
                            .accountType(CompanyUpdateResponse.Account.AccountType.CHECKING)
                            .institutionName("string")
                            .routingNumber("string")
                            .build()
                    )
                )
                .departments(
                    listOf(
                        CompanyUpdateResponse.Department.builder()
                            .name("string")
                            .parent(
                                CompanyUpdateResponse.Department.Parent.builder()
                                    .name("string")
                                    .build()
                            )
                            .build()
                    )
                )
                .ein("string")
                .entity(
                    CompanyUpdateResponse.Entity.builder()
                        .subtype(CompanyUpdateResponse.Entity.Subtype.S_CORPORATION)
                        .type(CompanyUpdateResponse.Entity.Type.LLC)
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
        assertThat(companyUpdateResponse).isNotNull
        assertThat(companyUpdateResponse.accounts().get())
            .containsExactly(
                CompanyUpdateResponse.Account.builder()
                    .accountName("string")
                    .accountNumber("string")
                    .accountType(CompanyUpdateResponse.Account.AccountType.CHECKING)
                    .institutionName("string")
                    .routingNumber("string")
                    .build()
            )
        assertThat(companyUpdateResponse.departments().get())
            .containsExactly(
                CompanyUpdateResponse.Department.builder()
                    .name("string")
                    .parent(
                        CompanyUpdateResponse.Department.Parent.builder().name("string").build()
                    )
                    .build()
            )
        assertThat(companyUpdateResponse.ein()).contains("string")
        assertThat(companyUpdateResponse.entity())
            .contains(
                CompanyUpdateResponse.Entity.builder()
                    .subtype(CompanyUpdateResponse.Entity.Subtype.S_CORPORATION)
                    .type(CompanyUpdateResponse.Entity.Type.LLC)
                    .build()
            )
        assertThat(companyUpdateResponse.legalName()).contains("string")
        assertThat(companyUpdateResponse.locations().get())
            .containsExactly(
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
        assertThat(companyUpdateResponse.primaryEmail()).contains("string")
        assertThat(companyUpdateResponse.primaryPhoneNumber()).contains("string")
    }
}

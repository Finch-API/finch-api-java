// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CompanyTest {

    @Test
    fun createCompany() {
        val company =
            Company.builder()
                .id("string")
                .accounts(
                    listOf(
                        Company.Account.builder()
                            .accountName("string")
                            .accountNumber("string")
                            .accountType(Company.Account.AccountType.CHECKING)
                            .institutionName("string")
                            .routingNumber("string")
                            .build()
                    )
                )
                .departments(
                    listOf(
                        Company.Department.builder()
                            .name("string")
                            .parent(Company.Department.Parent.builder().name("string").build())
                            .build()
                    )
                )
                .ein("string")
                .entity(
                    Company.Entity.builder()
                        .subtype(Company.Entity.Subtype.S_CORPORATION)
                        .type(Company.Entity.Type.LLC)
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
        assertThat(company).isNotNull
        assertThat(company.id()).isEqualTo("string")
        assertThat(company.accounts().get())
            .containsExactly(
                Company.Account.builder()
                    .accountName("string")
                    .accountNumber("string")
                    .accountType(Company.Account.AccountType.CHECKING)
                    .institutionName("string")
                    .routingNumber("string")
                    .build()
            )
        assertThat(company.departments().get())
            .containsExactly(
                Company.Department.builder()
                    .name("string")
                    .parent(Company.Department.Parent.builder().name("string").build())
                    .build()
            )
        assertThat(company.ein()).contains("string")
        assertThat(company.entity())
            .contains(
                Company.Entity.builder()
                    .subtype(Company.Entity.Subtype.S_CORPORATION)
                    .type(Company.Entity.Type.LLC)
                    .build()
            )
        assertThat(company.legalName()).contains("string")
        assertThat(company.locations().get())
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
        assertThat(company.primaryEmail()).contains("string")
        assertThat(company.primaryPhoneNumber()).contains("string")
    }
}

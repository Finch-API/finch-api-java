// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyUpdateResponseTest {

    @Test
    fun create() {
        val companyUpdateResponse =
            CompanyUpdateResponse.builder()
                .addAccount(
                    CompanyUpdateResponse.Account.builder()
                        .accountName("account_name")
                        .accountNumber("account_number")
                        .accountType(CompanyUpdateResponse.Account.AccountType.CHECKING)
                        .institutionName("institution_name")
                        .routingNumber("routing_number")
                        .build()
                )
                .addDepartment(
                    CompanyUpdateResponse.Department.builder()
                        .name("name")
                        .parent(
                            CompanyUpdateResponse.Department.Parent.builder().name("name").build()
                        )
                        .build()
                )
                .ein("ein")
                .entity(
                    CompanyUpdateResponse.Entity.builder()
                        .subtype(CompanyUpdateResponse.Entity.Subtype.S_CORPORATION)
                        .type(CompanyUpdateResponse.Entity.Type.LLC)
                        .build()
                )
                .legalName("legal_name")
                .addLocation(
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
                .primaryEmail("dev@stainless.com")
                .primaryPhoneNumber("primary_phone_number")
                .build()

        assertThat(companyUpdateResponse.accounts().getOrNull())
            .containsExactly(
                CompanyUpdateResponse.Account.builder()
                    .accountName("account_name")
                    .accountNumber("account_number")
                    .accountType(CompanyUpdateResponse.Account.AccountType.CHECKING)
                    .institutionName("institution_name")
                    .routingNumber("routing_number")
                    .build()
            )
        assertThat(companyUpdateResponse.departments().getOrNull())
            .containsExactly(
                CompanyUpdateResponse.Department.builder()
                    .name("name")
                    .parent(CompanyUpdateResponse.Department.Parent.builder().name("name").build())
                    .build()
            )
        assertThat(companyUpdateResponse.ein()).contains("ein")
        assertThat(companyUpdateResponse.entity())
            .contains(
                CompanyUpdateResponse.Entity.builder()
                    .subtype(CompanyUpdateResponse.Entity.Subtype.S_CORPORATION)
                    .type(CompanyUpdateResponse.Entity.Type.LLC)
                    .build()
            )
        assertThat(companyUpdateResponse.legalName()).contains("legal_name")
        assertThat(companyUpdateResponse.locations().getOrNull())
            .containsExactly(
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
        assertThat(companyUpdateResponse.primaryEmail()).contains("dev@stainless.com")
        assertThat(companyUpdateResponse.primaryPhoneNumber()).contains("primary_phone_number")
    }
}

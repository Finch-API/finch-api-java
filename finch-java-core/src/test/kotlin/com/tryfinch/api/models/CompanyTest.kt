// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyTest {

    @Test
    fun create() {
        val company =
            Company.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAccount(
                    Company.Account.builder()
                        .accountName("account_name")
                        .accountNumber("account_number")
                        .accountType(Company.Account.AccountType.CHECKING)
                        .institutionName("institution_name")
                        .routingNumber("routing_number")
                        .build()
                )
                .addDepartment(
                    Company.Department.builder()
                        .name("name")
                        .parent(Company.Department.Parent.builder().name("name").build())
                        .build()
                )
                .ein("ein")
                .entity(
                    Company.Entity.builder()
                        .subtype(Company.Entity.Subtype.S_CORPORATION)
                        .type(Company.Entity.Type.LLC)
                        .build()
                )
                .legalName("legal_name")
                .addLocation(
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
                .primaryEmail("dev@stainless.com")
                .primaryPhoneNumber("primary_phone_number")
                .build()

        assertThat(company.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(company.accounts().getOrNull())
            .containsExactly(
                Company.Account.builder()
                    .accountName("account_name")
                    .accountNumber("account_number")
                    .accountType(Company.Account.AccountType.CHECKING)
                    .institutionName("institution_name")
                    .routingNumber("routing_number")
                    .build()
            )
        assertThat(company.departments().getOrNull())
            .containsExactly(
                Company.Department.builder()
                    .name("name")
                    .parent(Company.Department.Parent.builder().name("name").build())
                    .build()
            )
        assertThat(company.ein()).contains("ein")
        assertThat(company.entity())
            .contains(
                Company.Entity.builder()
                    .subtype(Company.Entity.Subtype.S_CORPORATION)
                    .type(Company.Entity.Type.LLC)
                    .build()
            )
        assertThat(company.legalName()).contains("legal_name")
        assertThat(company.locations().getOrNull())
            .containsExactly(
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
        assertThat(company.primaryEmail()).contains("dev@stainless.com")
        assertThat(company.primaryPhoneNumber()).contains("primary_phone_number")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val company =
            Company.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAccount(
                    Company.Account.builder()
                        .accountName("account_name")
                        .accountNumber("account_number")
                        .accountType(Company.Account.AccountType.CHECKING)
                        .institutionName("institution_name")
                        .routingNumber("routing_number")
                        .build()
                )
                .addDepartment(
                    Company.Department.builder()
                        .name("name")
                        .parent(Company.Department.Parent.builder().name("name").build())
                        .build()
                )
                .ein("ein")
                .entity(
                    Company.Entity.builder()
                        .subtype(Company.Entity.Subtype.S_CORPORATION)
                        .type(Company.Entity.Type.LLC)
                        .build()
                )
                .legalName("legal_name")
                .addLocation(
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
                .primaryEmail("dev@stainless.com")
                .primaryPhoneNumber("primary_phone_number")
                .build()

        val roundtrippedCompany =
            jsonMapper.readValue(jsonMapper.writeValueAsString(company), jacksonTypeRef<Company>())

        assertThat(roundtrippedCompany).isEqualTo(company)
    }
}

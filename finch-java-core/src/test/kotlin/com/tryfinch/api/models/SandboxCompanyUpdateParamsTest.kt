// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SandboxCompanyUpdateParamsTest {

    @Test
    fun createSandboxCompanyUpdateParams() {
        SandboxCompanyUpdateParams.builder()
            .accounts(
                listOf(
                    SandboxCompanyUpdateParams.Account.builder()
                        .accountName("string")
                        .accountNumber("string")
                        .accountType(SandboxCompanyUpdateParams.Account.AccountType.CHECKING)
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
    }

    @Test
    fun getBody() {
        val params =
            SandboxCompanyUpdateParams.builder()
                .accounts(
                    listOf(
                        SandboxCompanyUpdateParams.Account.builder()
                            .accountName("string")
                            .accountNumber("string")
                            .accountType(SandboxCompanyUpdateParams.Account.AccountType.CHECKING)
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accounts())
            .isEqualTo(
                listOf(
                    SandboxCompanyUpdateParams.Account.builder()
                        .accountName("string")
                        .accountNumber("string")
                        .accountType(SandboxCompanyUpdateParams.Account.AccountType.CHECKING)
                        .institutionName("string")
                        .routingNumber("string")
                        .build()
                )
            )
        assertThat(body.departments())
            .isEqualTo(
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
        assertThat(body.ein()).isEqualTo("string")
        assertThat(body.entity())
            .isEqualTo(
                SandboxCompanyUpdateParams.Entity.builder()
                    .subtype(SandboxCompanyUpdateParams.Entity.Subtype.S_CORPORATION)
                    .type(SandboxCompanyUpdateParams.Entity.Type.LLC)
                    .build()
            )
        assertThat(body.legalName()).isEqualTo("string")
        assertThat(body.locations())
            .isEqualTo(
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
        assertThat(body.primaryEmail()).isEqualTo("string")
        assertThat(body.primaryPhoneNumber()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = SandboxCompanyUpdateParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}

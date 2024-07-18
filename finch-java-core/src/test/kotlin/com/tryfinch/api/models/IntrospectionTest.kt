// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntrospectionTest {

    @Test
    fun createIntrospection() {
        val introspection =
            Introspection.builder()
                .accountId("account_id")
                .authenticationMethods(
                    listOf(
                        Introspection.AuthenticationMethod.builder()
                            .connectionStatus(
                                Introspection.AuthenticationMethod.ConnectionStatus.builder()
                                    .message("message")
                                    .status(ConnectionStatusType.PENDING)
                                    .build()
                            )
                            .type(Introspection.AuthenticationMethod.Type.ASSISTED)
                            .build()
                    )
                )
                .clientId("client_id")
                .clientType(Introspection.ClientType.PRODUCTION)
                .companyId("company_id")
                .connectionType(Introspection.ConnectionType.PROVIDER)
                .manual(true)
                .payrollProviderId("payroll_provider_id")
                .products(listOf("string"))
                .username("username")
                .build()
        assertThat(introspection).isNotNull
        assertThat(introspection.accountId()).isEqualTo("account_id")
        assertThat(introspection.authenticationMethods())
            .containsExactly(
                Introspection.AuthenticationMethod.builder()
                    .connectionStatus(
                        Introspection.AuthenticationMethod.ConnectionStatus.builder()
                            .message("message")
                            .status(ConnectionStatusType.PENDING)
                            .build()
                    )
                    .type(Introspection.AuthenticationMethod.Type.ASSISTED)
                    .build()
            )
        assertThat(introspection.clientId()).isEqualTo("client_id")
        assertThat(introspection.clientType()).isEqualTo(Introspection.ClientType.PRODUCTION)
        assertThat(introspection.companyId()).isEqualTo("company_id")
        assertThat(introspection.connectionType()).isEqualTo(Introspection.ConnectionType.PROVIDER)
        assertThat(introspection.manual()).isEqualTo(true)
        assertThat(introspection.payrollProviderId()).isEqualTo("payroll_provider_id")
        assertThat(introspection.products()).containsExactly("string")
        assertThat(introspection.username()).isEqualTo("username")
    }
}

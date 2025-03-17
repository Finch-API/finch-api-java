// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntrospectionTest {

    @Test
    fun createIntrospection() {
        val introspection =
            Introspection.builder()
                .accountId("account_id")
                .addAuthenticationMethod(
                    Introspection.AuthenticationMethod.builder()
                        .connectionStatus(
                            Introspection.AuthenticationMethod.ConnectionStatus.builder()
                                .message("message")
                                .status(ConnectionStatusType.PENDING)
                                .build()
                        )
                        .addProduct("string")
                        .type(Introspection.AuthenticationMethod.Type.ASSISTED)
                        .build()
                )
                .clientId("client_id")
                .clientType(Introspection.ClientType.PRODUCTION)
                .companyId("company_id")
                .connectionId("connection_id")
                .connectionStatus(
                    Introspection.ConnectionStatus.builder()
                        .message("message")
                        .status(ConnectionStatusType.PENDING)
                        .build()
                )
                .connectionType(Introspection.ConnectionType.PROVIDER)
                .customerEmail("customer_email")
                .customerId("customer_id")
                .customerName("customer_name")
                .manual(true)
                .payrollProviderId("payroll_provider_id")
                .addProduct("string")
                .providerId("provider_id")
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
                    .addProduct("string")
                    .type(Introspection.AuthenticationMethod.Type.ASSISTED)
                    .build()
            )
        assertThat(introspection.clientId()).isEqualTo("client_id")
        assertThat(introspection.clientType()).isEqualTo(Introspection.ClientType.PRODUCTION)
        assertThat(introspection.companyId()).isEqualTo("company_id")
        assertThat(introspection.connectionId()).isEqualTo("connection_id")
        assertThat(introspection.connectionStatus())
            .isEqualTo(
                Introspection.ConnectionStatus.builder()
                    .message("message")
                    .status(ConnectionStatusType.PENDING)
                    .build()
            )
        assertThat(introspection.connectionType()).isEqualTo(Introspection.ConnectionType.PROVIDER)
        assertThat(introspection.customerEmail()).contains("customer_email")
        assertThat(introspection.customerId()).contains("customer_id")
        assertThat(introspection.customerName()).contains("customer_name")
        assertThat(introspection.manual()).isEqualTo(true)
        assertThat(introspection.payrollProviderId()).isEqualTo("payroll_provider_id")
        assertThat(introspection.products()).containsExactly("string")
        assertThat(introspection.providerId()).isEqualTo("provider_id")
        assertThat(introspection.username()).isEqualTo("username")
    }
}

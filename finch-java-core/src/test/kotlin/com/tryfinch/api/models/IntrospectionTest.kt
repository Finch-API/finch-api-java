// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntrospectionTest {

    @Test
    fun create() {
        val introspection =
            Introspection.builder()
                .id("id")
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
                        .lastSuccessfulSync(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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

        assertThat(introspection.id()).isEqualTo("id")
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
                    .lastSuccessfulSync(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val introspection =
            Introspection.builder()
                .id("id")
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
                        .lastSuccessfulSync(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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

        val roundtrippedIntrospection =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(introspection),
                jacksonTypeRef<Introspection>(),
            )

        assertThat(roundtrippedIntrospection).isEqualTo(introspection)
    }
}

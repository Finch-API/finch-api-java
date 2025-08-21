// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntrospectionTest {

    @Test
    fun create() {
        val introspection =
            Introspection.builder()
                .id("id")
                .clientId("client_id")
                .clientType(Introspection.ClientType.DEVELOPMENT)
                .connectionId("connection_id")
                .connectionStatus(
                    Introspection.ConnectionStatusDetail.builder()
                        .status(ConnectionStatusType.PENDING)
                        .lastSuccessfulSync(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .message("message")
                        .build()
                )
                .connectionType(Introspection.ConnectionType.FINCH)
                .addProduct("string")
                .providerId("provider_id")
                .accountId("account_id")
                .addAuthenticationMethod(
                    Introspection.AuthenticationMethodDetail.builder()
                        .type(Introspection.AuthenticationMethodDetail.Type.ASSISTED)
                        .connectionStatus(
                            Introspection.AuthenticationMethodDetail.ConnectionStatusDetail
                                .builder()
                                .status(ConnectionStatusType.PENDING)
                                .lastSuccessfulSync(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .message("message")
                                .build()
                        )
                        .addProduct("string")
                        .build()
                )
                .companyId("company_id")
                .customerEmail("customer_email")
                .customerId("customer_id")
                .customerName("customer_name")
                .addEntityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .entityMode(Introspection.EntityMode.SINGLE)
                .manual(true)
                .payrollProviderId("payroll_provider_id")
                .username("username")
                .build()

        assertThat(introspection.id()).isEqualTo("id")
        assertThat(introspection.clientId()).isEqualTo("client_id")
        assertThat(introspection.clientType()).isEqualTo(Introspection.ClientType.DEVELOPMENT)
        assertThat(introspection.connectionId()).isEqualTo("connection_id")
        assertThat(introspection.connectionStatus())
            .isEqualTo(
                Introspection.ConnectionStatusDetail.builder()
                    .status(ConnectionStatusType.PENDING)
                    .lastSuccessfulSync(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .message("message")
                    .build()
            )
        assertThat(introspection.connectionType()).isEqualTo(Introspection.ConnectionType.FINCH)
        assertThat(introspection.products()).containsExactly("string")
        assertThat(introspection.providerId()).isEqualTo("provider_id")
        assertThat(introspection.accountId()).contains("account_id")
        assertThat(introspection.authenticationMethods().getOrNull())
            .containsExactly(
                Introspection.AuthenticationMethodDetail.builder()
                    .type(Introspection.AuthenticationMethodDetail.Type.ASSISTED)
                    .connectionStatus(
                        Introspection.AuthenticationMethodDetail.ConnectionStatusDetail.builder()
                            .status(ConnectionStatusType.PENDING)
                            .lastSuccessfulSync(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .message("message")
                            .build()
                    )
                    .addProduct("string")
                    .build()
            )
        assertThat(introspection.companyId()).contains("company_id")
        assertThat(introspection.customerEmail()).contains("customer_email")
        assertThat(introspection.customerId()).contains("customer_id")
        assertThat(introspection.customerName()).contains("customer_name")
        assertThat(introspection.entityIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(introspection.entityMode()).contains(Introspection.EntityMode.SINGLE)
        assertThat(introspection.manual()).contains(true)
        assertThat(introspection.payrollProviderId()).contains("payroll_provider_id")
        assertThat(introspection.username()).contains("username")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val introspection =
            Introspection.builder()
                .id("id")
                .clientId("client_id")
                .clientType(Introspection.ClientType.DEVELOPMENT)
                .connectionId("connection_id")
                .connectionStatus(
                    Introspection.ConnectionStatusDetail.builder()
                        .status(ConnectionStatusType.PENDING)
                        .lastSuccessfulSync(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .message("message")
                        .build()
                )
                .connectionType(Introspection.ConnectionType.FINCH)
                .addProduct("string")
                .providerId("provider_id")
                .accountId("account_id")
                .addAuthenticationMethod(
                    Introspection.AuthenticationMethodDetail.builder()
                        .type(Introspection.AuthenticationMethodDetail.Type.ASSISTED)
                        .connectionStatus(
                            Introspection.AuthenticationMethodDetail.ConnectionStatusDetail
                                .builder()
                                .status(ConnectionStatusType.PENDING)
                                .lastSuccessfulSync(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .message("message")
                                .build()
                        )
                        .addProduct("string")
                        .build()
                )
                .companyId("company_id")
                .customerEmail("customer_email")
                .customerId("customer_id")
                .customerName("customer_name")
                .addEntityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .entityMode(Introspection.EntityMode.SINGLE)
                .manual(true)
                .payrollProviderId("payroll_provider_id")
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

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectSessionConnectParamsTest {

    @Test
    fun create() {
        ConnectSessionConnectParams.builder()
            .customerId("x")
            .customerName("x")
            .addProduct(ConnectSessionConnectParams.ConnectProducts.BENEFITS)
            .customerEmail("dev@stainless.com")
            .integration(
                ConnectSessionConnectParams.Integration.builder()
                    .provider("provider")
                    .authMethod(ConnectSessionConnectParams.Integration.AuthMethod.ASSISTED)
                    .build()
            )
            .manual(true)
            .minutesToExpire(1.0)
            .redirectUri("redirect_uri")
            .sandbox(ConnectSessionConnectParams.Sandbox.FINCH)
            .build()
    }

    @Test
    fun body() {
        val params =
            ConnectSessionConnectParams.builder()
                .customerId("x")
                .customerName("x")
                .addProduct(ConnectSessionConnectParams.ConnectProducts.BENEFITS)
                .customerEmail("dev@stainless.com")
                .integration(
                    ConnectSessionConnectParams.Integration.builder()
                        .provider("provider")
                        .authMethod(ConnectSessionConnectParams.Integration.AuthMethod.ASSISTED)
                        .build()
                )
                .manual(true)
                .minutesToExpire(1.0)
                .redirectUri("redirect_uri")
                .sandbox(ConnectSessionConnectParams.Sandbox.FINCH)
                .build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("x")
        assertThat(body.customerName()).isEqualTo("x")
        assertThat(body.products())
            .containsExactly(ConnectSessionConnectParams.ConnectProducts.BENEFITS)
        assertThat(body.customerEmail()).contains("dev@stainless.com")
        assertThat(body.integration())
            .contains(
                ConnectSessionConnectParams.Integration.builder()
                    .provider("provider")
                    .authMethod(ConnectSessionConnectParams.Integration.AuthMethod.ASSISTED)
                    .build()
            )
        assertThat(body.manual()).contains(true)
        assertThat(body.minutesToExpire()).contains(1.0)
        assertThat(body.redirectUri()).contains("redirect_uri")
        assertThat(body.sandbox()).contains(ConnectSessionConnectParams.Sandbox.FINCH)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ConnectSessionConnectParams.builder()
                .customerId("x")
                .customerName("x")
                .addProduct(ConnectSessionConnectParams.ConnectProducts.BENEFITS)
                .build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("x")
        assertThat(body.customerName()).isEqualTo("x")
        assertThat(body.products())
            .containsExactly(ConnectSessionConnectParams.ConnectProducts.BENEFITS)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectSessionNewParamsTest {

    @Test
    fun create() {
        ConnectSessionNewParams.builder()
            .customerEmail("dev@stainless.com")
            .customerId("x")
            .customerName("x")
            .integration(
                ConnectSessionNewParams.Integration.builder()
                    .authMethod(ConnectSessionNewParams.Integration.AuthMethod.ASSISTED)
                    .provider("provider")
                    .build()
            )
            .manual(true)
            .minutesToExpire(1.0)
            .addProduct(ConnectSessionNewParams.ConnectProducts.BENEFITS)
            .redirectUri("redirect_uri")
            .sandbox(ConnectSessionNewParams.Sandbox.FINCH)
            .build()
    }

    @Test
    fun body() {
        val params =
            ConnectSessionNewParams.builder()
                .customerEmail("dev@stainless.com")
                .customerId("x")
                .customerName("x")
                .integration(
                    ConnectSessionNewParams.Integration.builder()
                        .authMethod(ConnectSessionNewParams.Integration.AuthMethod.ASSISTED)
                        .provider("provider")
                        .build()
                )
                .manual(true)
                .minutesToExpire(1.0)
                .addProduct(ConnectSessionNewParams.ConnectProducts.BENEFITS)
                .redirectUri("redirect_uri")
                .sandbox(ConnectSessionNewParams.Sandbox.FINCH)
                .build()

        val body = params._body()

        assertThat(body.customerEmail()).contains("dev@stainless.com")
        assertThat(body.customerId()).isEqualTo("x")
        assertThat(body.customerName()).isEqualTo("x")
        assertThat(body.integration())
            .contains(
                ConnectSessionNewParams.Integration.builder()
                    .authMethod(ConnectSessionNewParams.Integration.AuthMethod.ASSISTED)
                    .provider("provider")
                    .build()
            )
        assertThat(body.manual()).contains(true)
        assertThat(body.minutesToExpire()).contains(1.0)
        assertThat(body.products())
            .containsExactly(ConnectSessionNewParams.ConnectProducts.BENEFITS)
        assertThat(body.redirectUri()).contains("redirect_uri")
        assertThat(body.sandbox()).contains(ConnectSessionNewParams.Sandbox.FINCH)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConnectSessionNewParamsTest {

    @Test
    fun createConnectSessionNewParams() {
        ConnectSessionNewParams.builder()
            .customerId("x")
            .customerName("x")
            .products(listOf(ConnectSessionNewParams.ConnectProducts.COMPANY))
            .customerEmail("dev@stainlessapi.com")
            .integration(
                ConnectSessionNewParams.Integration.builder()
                    .authMethod(ConnectSessionNewParams.Integration.AuthMethod.ASSISTED)
                    .provider("provider")
                    .build()
            )
            .manual(true)
            .minutesToExpire(1.0)
            .redirectUri("redirect_uri")
            .sandbox(ConnectSessionNewParams.Sandbox.FINCH)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ConnectSessionNewParams.builder()
                .customerId("x")
                .customerName("x")
                .products(listOf(ConnectSessionNewParams.ConnectProducts.COMPANY))
                .customerEmail("dev@stainlessapi.com")
                .integration(
                    ConnectSessionNewParams.Integration.builder()
                        .authMethod(ConnectSessionNewParams.Integration.AuthMethod.ASSISTED)
                        .provider("provider")
                        .build()
                )
                .manual(true)
                .minutesToExpire(1.0)
                .redirectUri("redirect_uri")
                .sandbox(ConnectSessionNewParams.Sandbox.FINCH)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.customerId()).isEqualTo("x")
        assertThat(body.customerName()).isEqualTo("x")
        assertThat(body.products())
            .isEqualTo(listOf(ConnectSessionNewParams.ConnectProducts.COMPANY))
        assertThat(body.customerEmail()).contains("dev@stainlessapi.com")
        assertThat(body.integration())
            .contains(
                ConnectSessionNewParams.Integration.builder()
                    .authMethod(ConnectSessionNewParams.Integration.AuthMethod.ASSISTED)
                    .provider("provider")
                    .build()
            )
        assertThat(body.manual()).contains(true)
        assertThat(body.minutesToExpire()).contains(1.0)
        assertThat(body.redirectUri()).contains("redirect_uri")
        assertThat(body.sandbox()).contains(ConnectSessionNewParams.Sandbox.FINCH)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ConnectSessionNewParams.builder()
                .customerId("x")
                .customerName("x")
                .products(listOf(ConnectSessionNewParams.ConnectProducts.COMPANY))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.customerId()).isEqualTo("x")
        assertThat(body.customerName()).isEqualTo("x")
        assertThat(body.products())
            .isEqualTo(listOf(ConnectSessionNewParams.ConnectProducts.COMPANY))
    }
}

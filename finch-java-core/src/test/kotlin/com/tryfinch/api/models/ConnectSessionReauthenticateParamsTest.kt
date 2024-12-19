// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConnectSessionReauthenticateParamsTest {

    @Test
    fun createConnectSessionReauthenticateParams() {
        ConnectSessionReauthenticateParams.builder()
            .connectionId("connection_id")
            .minutesToExpire(0L)
            .products(listOf(ConnectSessionReauthenticateParams.ConnectProducts.COMPANY))
            .redirectUri("https://example.com")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ConnectSessionReauthenticateParams.builder()
                .connectionId("connection_id")
                .minutesToExpire(0L)
                .products(listOf(ConnectSessionReauthenticateParams.ConnectProducts.COMPANY))
                .redirectUri("https://example.com")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.connectionId()).isEqualTo("connection_id")
        assertThat(body.minutesToExpire()).isEqualTo(0L)
        assertThat(body.products())
            .isEqualTo(listOf(ConnectSessionReauthenticateParams.ConnectProducts.COMPANY))
        assertThat(body.redirectUri()).isEqualTo("https://example.com")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ConnectSessionReauthenticateParams.builder().connectionId("connection_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.connectionId()).isEqualTo("connection_id")
    }
}

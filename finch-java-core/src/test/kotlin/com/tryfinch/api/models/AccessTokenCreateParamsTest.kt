// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccessTokenCreateParamsTest {

    @Test
    fun create() {
        AccessTokenCreateParams.builder()
            .code("<your_authorization_code>")
            .clientId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .clientSecret("<your_client_secret>")
            .redirectUri("https://example.com")
            .build()
    }

    @Test
    fun body() {
        val params =
            AccessTokenCreateParams.builder()
                .code("<your_authorization_code>")
                .clientId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .clientSecret("<your_client_secret>")
                .redirectUri("https://example.com")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.code()).isEqualTo("<your_authorization_code>")
        assertThat(body.clientId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.clientSecret()).contains("<your_client_secret>")
        assertThat(body.redirectUri()).contains("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AccessTokenCreateParams.builder().code("<your_authorization_code>").build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.code()).isEqualTo("<your_authorization_code>")
    }
}

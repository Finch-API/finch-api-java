// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccessTokenCreateParamsTest {

    @Test
    fun create() {
        AccessTokenCreateParams.builder()
            .clientId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .clientSecret("client_secret")
            .code("code")
            .redirectUri("redirect_uri")
            .build()
    }

    @Test
    fun body() {
        val params =
            AccessTokenCreateParams.builder()
                .clientId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .clientSecret("client_secret")
                .code("code")
                .redirectUri("redirect_uri")
                .build()

        val body = params._body()

        assertThat(body.clientId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.clientSecret()).isEqualTo("client_secret")
        assertThat(body.code()).isEqualTo("code")
        assertThat(body.redirectUri()).contains("redirect_uri")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccessTokenCreateParams.builder()
                .clientId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .clientSecret("client_secret")
                .code("code")
                .build()

        val body = params._body()

        assertThat(body.clientId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.clientSecret()).isEqualTo("client_secret")
        assertThat(body.code()).isEqualTo("code")
    }
}

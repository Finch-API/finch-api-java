// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccessTokenCreateParamsTest {

    @Test
    fun create() {
        AccessTokenCreateParams.builder()
            .code("code")
            .clientId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .clientSecret("client_secret")
            .redirectUri("redirect_uri")
            .build()
    }

    @Test
    fun body() {
        val params =
            AccessTokenCreateParams.builder()
                .code("code")
                .clientId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .clientSecret("client_secret")
                .redirectUri("redirect_uri")
                .build()

        val body = params._body()

        assertThat(body.code()).isEqualTo("code")
        assertThat(body.clientId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.clientSecret()).contains("client_secret")
        assertThat(body.redirectUri()).contains("redirect_uri")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AccessTokenCreateParams.builder().code("code").build()

        val body = params._body()

        assertThat(body.code()).isEqualTo("code")
    }
}

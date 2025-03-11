// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccessTokenCreateParamsTest {

    @Test
    fun create() {
      AccessTokenCreateParams.builder()
          .code("<your_authorization_code>")
          .clientId("6d28c315-5eaa-4071-8ea5-f030eb45edbc")
          .clientSecret("<your_client_secret>")
          .redirectUri("https://example.com")
          .build()
    }

    @Test
    fun body() {
      val params = AccessTokenCreateParams.builder()
          .code("<your_authorization_code>")
          .clientId("6d28c315-5eaa-4071-8ea5-f030eb45edbc")
          .clientSecret("<your_client_secret>")
          .redirectUri("https://example.com")
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.code()).isEqualTo("<your_authorization_code>")
      assertThat(body.clientId()).contains("6d28c315-5eaa-4071-8ea5-f030eb45edbc")
      assertThat(body.clientSecret()).contains("<your_client_secret>")
      assertThat(body.redirectUri()).contains("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = AccessTokenCreateParams.builder()
          .code("<your_authorization_code>")
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.code()).isEqualTo("<your_authorization_code>")
    }
}

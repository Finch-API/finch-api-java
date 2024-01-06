// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreateAccessTokenResponseTest {

    @Test
    fun createCreateAccessTokenResponse() {
        val createAccessTokenResponse =
            CreateAccessTokenResponse.builder().accessToken("string").build()
        assertThat(createAccessTokenResponse).isNotNull
        assertThat(createAccessTokenResponse.accessToken()).isEqualTo("string")
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreateAccessTokenResponseTest {

    @Test
    fun createCreateAccessTokenResponse() {
        val createAccessTokenResponse =
            CreateAccessTokenResponse.builder()
                .accessToken("string")
                .accountId("string")
                .clientType(CreateAccessTokenResponse.ClientType.PRODUCTION)
                .companyId("string")
                .connectionType(CreateAccessTokenResponse.ConnectionType.PROVIDER)
                .products(listOf("string"))
                .providerId("string")
                .build()
        assertThat(createAccessTokenResponse).isNotNull
        assertThat(createAccessTokenResponse.accessToken()).isEqualTo("string")
        assertThat(createAccessTokenResponse.accountId()).isEqualTo("string")
        assertThat(createAccessTokenResponse.clientType())
            .isEqualTo(CreateAccessTokenResponse.ClientType.PRODUCTION)
        assertThat(createAccessTokenResponse.companyId()).isEqualTo("string")
        assertThat(createAccessTokenResponse.connectionType())
            .isEqualTo(CreateAccessTokenResponse.ConnectionType.PROVIDER)
        assertThat(createAccessTokenResponse.products()).containsExactly("string")
        assertThat(createAccessTokenResponse.providerId()).isEqualTo("string")
    }
}

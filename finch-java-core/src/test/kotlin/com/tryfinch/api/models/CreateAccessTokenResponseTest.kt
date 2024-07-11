// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreateAccessTokenResponseTest {

    @Test
    fun createCreateAccessTokenResponse() {
        val createAccessTokenResponse =
            CreateAccessTokenResponse.builder()
                .accessToken("access_token")
                .accountId("account_id")
                .clientType(CreateAccessTokenResponse.ClientType.PRODUCTION)
                .companyId("company_id")
                .connectionType(CreateAccessTokenResponse.ConnectionType.PROVIDER)
                .products(listOf("string"))
                .providerId("provider_id")
                .build()
        assertThat(createAccessTokenResponse).isNotNull
        assertThat(createAccessTokenResponse.accessToken()).isEqualTo("access_token")
        assertThat(createAccessTokenResponse.accountId()).isEqualTo("account_id")
        assertThat(createAccessTokenResponse.clientType())
            .isEqualTo(CreateAccessTokenResponse.ClientType.PRODUCTION)
        assertThat(createAccessTokenResponse.companyId()).isEqualTo("company_id")
        assertThat(createAccessTokenResponse.connectionType())
            .isEqualTo(CreateAccessTokenResponse.ConnectionType.PROVIDER)
        assertThat(createAccessTokenResponse.products()).containsExactly("string")
        assertThat(createAccessTokenResponse.providerId()).isEqualTo("provider_id")
    }
}

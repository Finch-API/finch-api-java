// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateAccessTokenResponseTest {

    @Test
    fun create() {
        val createAccessTokenResponse =
            CreateAccessTokenResponse.builder()
                .accessToken("access_token")
                .accountId("account_id")
                .clientType(CreateAccessTokenResponse.ClientType.PRODUCTION)
                .companyId("company_id")
                .connectionId("connection_id")
                .connectionType(CreateAccessTokenResponse.ConnectionType.PROVIDER)
                .addProduct("string")
                .providerId("provider_id")
                .customerId("customer_id")
                .tokenType("token_type")
                .build()

        assertThat(createAccessTokenResponse.accessToken()).isEqualTo("access_token")
        assertThat(createAccessTokenResponse.accountId()).isEqualTo("account_id")
        assertThat(createAccessTokenResponse.clientType())
            .isEqualTo(CreateAccessTokenResponse.ClientType.PRODUCTION)
        assertThat(createAccessTokenResponse.companyId()).isEqualTo("company_id")
        assertThat(createAccessTokenResponse.connectionId()).isEqualTo("connection_id")
        assertThat(createAccessTokenResponse.connectionType())
            .isEqualTo(CreateAccessTokenResponse.ConnectionType.PROVIDER)
        assertThat(createAccessTokenResponse.products()).containsExactly("string")
        assertThat(createAccessTokenResponse.providerId()).isEqualTo("provider_id")
        assertThat(createAccessTokenResponse.customerId()).contains("customer_id")
        assertThat(createAccessTokenResponse.tokenType()).contains("token_type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createAccessTokenResponse =
            CreateAccessTokenResponse.builder()
                .accessToken("access_token")
                .accountId("account_id")
                .clientType(CreateAccessTokenResponse.ClientType.PRODUCTION)
                .companyId("company_id")
                .connectionId("connection_id")
                .connectionType(CreateAccessTokenResponse.ConnectionType.PROVIDER)
                .addProduct("string")
                .providerId("provider_id")
                .customerId("customer_id")
                .tokenType("token_type")
                .build()

        val roundtrippedCreateAccessTokenResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createAccessTokenResponse),
                jacksonTypeRef<CreateAccessTokenResponse>(),
            )

        assertThat(roundtrippedCreateAccessTokenResponse).isEqualTo(createAccessTokenResponse)
    }
}

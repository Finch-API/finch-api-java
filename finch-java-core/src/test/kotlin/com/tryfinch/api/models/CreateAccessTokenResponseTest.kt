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
                .clientType(CreateAccessTokenResponse.ClientType.DEVELOPMENT)
                .connectionId("connection_id")
                .connectionType(CreateAccessTokenResponse.ConnectionType.FINCH)
                .addProduct("string")
                .providerId("provider_id")
                .tokenType("token_type")
                .accountId("account_id")
                .companyId("company_id")
                .customerId("customer_id")
                .build()

        assertThat(createAccessTokenResponse.accessToken()).isEqualTo("access_token")
        assertThat(createAccessTokenResponse.clientType())
            .isEqualTo(CreateAccessTokenResponse.ClientType.DEVELOPMENT)
        assertThat(createAccessTokenResponse.connectionId()).isEqualTo("connection_id")
        assertThat(createAccessTokenResponse.connectionType())
            .isEqualTo(CreateAccessTokenResponse.ConnectionType.FINCH)
        assertThat(createAccessTokenResponse.products()).containsExactly("string")
        assertThat(createAccessTokenResponse.providerId()).isEqualTo("provider_id")
        assertThat(createAccessTokenResponse.tokenType()).isEqualTo("token_type")
        assertThat(createAccessTokenResponse.accountId()).contains("account_id")
        assertThat(createAccessTokenResponse.companyId()).contains("company_id")
        assertThat(createAccessTokenResponse.customerId()).contains("customer_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createAccessTokenResponse =
            CreateAccessTokenResponse.builder()
                .accessToken("access_token")
                .clientType(CreateAccessTokenResponse.ClientType.DEVELOPMENT)
                .connectionId("connection_id")
                .connectionType(CreateAccessTokenResponse.ConnectionType.FINCH)
                .addProduct("string")
                .providerId("provider_id")
                .tokenType("token_type")
                .accountId("account_id")
                .companyId("company_id")
                .customerId("customer_id")
                .build()

        val roundtrippedCreateAccessTokenResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createAccessTokenResponse),
                jacksonTypeRef<CreateAccessTokenResponse>(),
            )

        assertThat(roundtrippedCreateAccessTokenResponse).isEqualTo(createAccessTokenResponse)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionCreateResponseTest {

    @Test
    fun create() {
        val connectionCreateResponse =
            ConnectionCreateResponse.builder()
                .accessToken("access_token")
                .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .authenticationType(ConnectionCreateResponse.AuthenticationType.API_TOKEN)
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .connectionId("connection_id")
                .entityId("entity_id")
                .addProduct("string")
                .providerId("provider_id")
                .tokenType("token_type")
                .build()

        assertThat(connectionCreateResponse.accessToken()).isEqualTo("access_token")
        assertThat(connectionCreateResponse.accountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(connectionCreateResponse.authenticationType())
            .isEqualTo(ConnectionCreateResponse.AuthenticationType.API_TOKEN)
        assertThat(connectionCreateResponse.companyId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(connectionCreateResponse.connectionId()).isEqualTo("connection_id")
        assertThat(connectionCreateResponse.entityId()).isEqualTo("entity_id")
        assertThat(connectionCreateResponse.products()).containsExactly("string")
        assertThat(connectionCreateResponse.providerId()).isEqualTo("provider_id")
        assertThat(connectionCreateResponse.tokenType()).isEqualTo("token_type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectionCreateResponse =
            ConnectionCreateResponse.builder()
                .accessToken("access_token")
                .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .authenticationType(ConnectionCreateResponse.AuthenticationType.API_TOKEN)
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .connectionId("connection_id")
                .entityId("entity_id")
                .addProduct("string")
                .providerId("provider_id")
                .tokenType("token_type")
                .build()

        val roundtrippedConnectionCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectionCreateResponse),
                jacksonTypeRef<ConnectionCreateResponse>(),
            )

        assertThat(roundtrippedConnectionCreateResponse).isEqualTo(connectionCreateResponse)
    }
}

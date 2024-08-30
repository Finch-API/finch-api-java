// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConnectionCreateResponseTest {

    @Test
    fun createConnectionCreateResponse() {
        val connectionCreateResponse =
            ConnectionCreateResponse.builder()
                .accessToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .authenticationType(ConnectionCreateResponse.AuthenticationType.CREDENTIAL)
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .connectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .products(listOf("string"))
                .providerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(connectionCreateResponse).isNotNull
        assertThat(connectionCreateResponse.accessToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(connectionCreateResponse.accountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(connectionCreateResponse.authenticationType())
            .isEqualTo(ConnectionCreateResponse.AuthenticationType.CREDENTIAL)
        assertThat(connectionCreateResponse.companyId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(connectionCreateResponse.connectionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(connectionCreateResponse.products()).containsExactly("string")
        assertThat(connectionCreateResponse.providerId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntrospectionTest {

    @Test
    fun createIntrospection() {
        val introspection =
            Introspection.builder()
                .accountId("string")
                .clientId("string")
                .clientType(Introspection.ClientType.PRODUCTION)
                .companyId("string")
                .connectionType(Introspection.ConnectionType.PROVIDER)
                .manual(true)
                .payrollProviderId("string")
                .products(listOf("string"))
                .username("string")
                .build()
        assertThat(introspection).isNotNull
        assertThat(introspection.accountId()).isEqualTo("string")
        assertThat(introspection.clientId()).isEqualTo("string")
        assertThat(introspection.clientType()).isEqualTo(Introspection.ClientType.PRODUCTION)
        assertThat(introspection.companyId()).isEqualTo("string")
        assertThat(introspection.connectionType()).isEqualTo(Introspection.ConnectionType.PROVIDER)
        assertThat(introspection.manual()).isEqualTo(true)
        assertThat(introspection.payrollProviderId()).isEqualTo("string")
        assertThat(introspection.products()).containsExactly("string")
        assertThat(introspection.username()).isEqualTo("string")
    }
}

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntrospectionTest {

    @Test
    fun createIntrospection() {
        val introspection =
            Introspection.builder()
                .clientId("string")
                .companyId("string")
                .manual(true)
                .payrollProviderId("string")
                .products(listOf("string"))
                .username("string")
                .build()
        assertThat(introspection).isNotNull
        assertThat(introspection.clientId()).isEqualTo("string")
        assertThat(introspection.companyId()).isEqualTo("string")
        assertThat(introspection.products()).containsExactly("string")
        assertThat(introspection.username()).isEqualTo("string")
        assertThat(introspection.payrollProviderId()).isEqualTo("string")
        assertThat(introspection.manual()).isEqualTo(true)
    }
}

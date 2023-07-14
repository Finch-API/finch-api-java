package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProviderTest {

    @Test
    fun createProvider() {
        val provider =
            Provider.builder()
                .id("string")
                .displayName("string")
                .icon("string")
                .logo("string")
                .manual(true)
                .mfaRequired(true)
                .primaryColor("string")
                .products(listOf("string"))
                .build()
        assertThat(provider).isNotNull
        assertThat(provider.id()).contains("string")
        assertThat(provider.displayName()).contains("string")
        assertThat(provider.products().get()).containsExactly("string")
        assertThat(provider.icon()).contains("string")
        assertThat(provider.logo()).contains("string")
        assertThat(provider.mfaRequired()).contains(true)
        assertThat(provider.primaryColor()).contains("string")
        assertThat(provider.manual()).contains(true)
    }
}

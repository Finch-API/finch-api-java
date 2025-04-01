// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayGroupListResponseTest {

    @Test
    fun create() {
        val payGroupListResponse =
            PayGroupListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .addPayFrequency(PayGroupListResponse.PayFrequency.ANNUALLY)
                .build()

        assertThat(payGroupListResponse.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(payGroupListResponse.name()).contains("name")
        assertThat(payGroupListResponse.payFrequencies().getOrNull())
            .containsExactly(PayGroupListResponse.PayFrequency.ANNUALLY)
    }
}

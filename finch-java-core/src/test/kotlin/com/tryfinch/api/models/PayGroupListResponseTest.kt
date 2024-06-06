// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PayGroupListResponseTest {

    @Test
    fun createPayGroupListResponse() {
        val payGroupListResponse =
            PayGroupListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("string")
                .payFrequencies(listOf(PayGroupListResponse.PayFrequency.ANNUALLY))
                .build()
        assertThat(payGroupListResponse).isNotNull
        assertThat(payGroupListResponse.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(payGroupListResponse.name()).contains("string")
        assertThat(payGroupListResponse.payFrequencies().get())
            .containsExactly(PayGroupListResponse.PayFrequency.ANNUALLY)
    }
}

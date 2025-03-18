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
                .id("id")
                .name("name")
                .addPayFrequency(PayGroupListResponse.PayFrequency.ANNUALLY)
                .build()

        assertThat(payGroupListResponse.id()).contains("id")
        assertThat(payGroupListResponse.name()).contains("name")
        assertThat(payGroupListResponse.payFrequencies().getOrNull())
            .containsExactly(PayGroupListResponse.PayFrequency.ANNUALLY)
    }
}

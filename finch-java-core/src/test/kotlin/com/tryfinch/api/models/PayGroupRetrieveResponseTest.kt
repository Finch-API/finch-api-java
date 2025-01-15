// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PayGroupRetrieveResponseTest {

    @Test
    fun createPayGroupRetrieveResponse() {
        val payGroupRetrieveResponse =
            PayGroupRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addIndividualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .addPayFrequency(PayGroupRetrieveResponse.PayFrequency.ANNUALLY)
                .build()
        assertThat(payGroupRetrieveResponse).isNotNull
        assertThat(payGroupRetrieveResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(payGroupRetrieveResponse.individualIds())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(payGroupRetrieveResponse.name()).isEqualTo("name")
        assertThat(payGroupRetrieveResponse.payFrequencies())
            .containsExactly(PayGroupRetrieveResponse.PayFrequency.ANNUALLY)
    }
}

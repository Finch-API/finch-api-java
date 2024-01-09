// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentCreateResponseTest {

    @Test
    fun createPaymentCreateResponse() {
        val paymentCreateResponse =
            PaymentCreateResponse.builder().payDate("string").paymentId("string").build()
        assertThat(paymentCreateResponse).isNotNull
        assertThat(paymentCreateResponse.payDate()).isEqualTo("string")
        assertThat(paymentCreateResponse.paymentId()).isEqualTo("string")
    }
}

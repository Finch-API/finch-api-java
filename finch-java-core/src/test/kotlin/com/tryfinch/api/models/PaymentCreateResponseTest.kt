// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentCreateResponseTest {

    @Test
    fun create() {
        val paymentCreateResponse =
            PaymentCreateResponse.builder().payDate("pay_date").paymentId("payment_id").build()

        assertThat(paymentCreateResponse.payDate()).isEqualTo("pay_date")
        assertThat(paymentCreateResponse.paymentId()).isEqualTo("payment_id")
    }
}

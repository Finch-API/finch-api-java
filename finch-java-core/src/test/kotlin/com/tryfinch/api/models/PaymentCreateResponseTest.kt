// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentCreateResponse =
            PaymentCreateResponse.builder().payDate("pay_date").paymentId("payment_id").build()

        val roundtrippedPaymentCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentCreateResponse),
                jacksonTypeRef<PaymentCreateResponse>(),
            )

        assertThat(roundtrippedPaymentCreateResponse).isEqualTo(paymentCreateResponse)
    }
}

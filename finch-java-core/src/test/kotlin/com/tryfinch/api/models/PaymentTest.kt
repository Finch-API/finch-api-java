// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentTest {

    @Test
    fun createPayment() {
        val payment =
            Payment.builder()
                .id("string")
                .companyDebit(Money.builder().amount(123L).currency("string").build())
                .debitDate("string")
                .employeeTaxes(Money.builder().amount(123L).currency("string").build())
                .employerTaxes(Money.builder().amount(123L).currency("string").build())
                .grossPay(Money.builder().amount(123L).currency("string").build())
                .individualIds(listOf("string"))
                .netPay(Money.builder().amount(123L).currency("string").build())
                .payDate("string")
                .payPeriod(
                    Payment.PayPeriod.builder().endDate("string").startDate("string").build()
                )
                .build()
        assertThat(payment).isNotNull
        assertThat(payment.id()).contains("string")
        assertThat(payment.companyDebit())
            .contains(Money.builder().amount(123L).currency("string").build())
        assertThat(payment.debitDate()).contains("string")
        assertThat(payment.employeeTaxes())
            .contains(Money.builder().amount(123L).currency("string").build())
        assertThat(payment.employerTaxes())
            .contains(Money.builder().amount(123L).currency("string").build())
        assertThat(payment.grossPay())
            .contains(Money.builder().amount(123L).currency("string").build())
        assertThat(payment.individualIds().get()).containsExactly("string")
        assertThat(payment.netPay())
            .contains(Money.builder().amount(123L).currency("string").build())
        assertThat(payment.payDate()).contains("string")
        assertThat(payment.payPeriod())
            .contains(Payment.PayPeriod.builder().endDate("string").startDate("string").build())
    }
}

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentTest {

    @Test
    fun createPayment() {
        val payment =
            Payment.builder()
                .id("e8b90071-0c11-471c-86e8-e303ef2f6782")
                .payPeriod(
                    Payment.PayPeriod.builder().startDate("string").endDate("string").build()
                )
                .payDate("string")
                .debitDate("string")
                .companyDebit(Money.builder().amount(123L).currency("string").build())
                .grossPay(Money.builder().amount(123L).currency("string").build())
                .netPay(Money.builder().amount(123L).currency("string").build())
                .employerTaxes(Money.builder().amount(123L).currency("string").build())
                .employeeTaxes(Money.builder().amount(123L).currency("string").build())
                .individualIds(listOf("e8b90071-0c11-471c-86e8-e303ef2f6782"))
                .build()
        assertThat(payment).isNotNull
        assertThat(payment.id()).isEqualTo("e8b90071-0c11-471c-86e8-e303ef2f6782")
        assertThat(payment.payPeriod())
            .isEqualTo(Payment.PayPeriod.builder().startDate("string").endDate("string").build())
        assertThat(payment.payDate()).isEqualTo("string")
        assertThat(payment.debitDate()).isEqualTo("string")
        assertThat(payment.companyDebit())
            .isEqualTo(Money.builder().amount(123L).currency("string").build())
        assertThat(payment.grossPay())
            .isEqualTo(Money.builder().amount(123L).currency("string").build())
        assertThat(payment.netPay())
            .isEqualTo(Money.builder().amount(123L).currency("string").build())
        assertThat(payment.employerTaxes())
            .isEqualTo(Money.builder().amount(123L).currency("string").build())
        assertThat(payment.employeeTaxes())
            .isEqualTo(Money.builder().amount(123L).currency("string").build())
        assertThat(payment.individualIds()).containsExactly("e8b90071-0c11-471c-86e8-e303ef2f6782")
    }
}

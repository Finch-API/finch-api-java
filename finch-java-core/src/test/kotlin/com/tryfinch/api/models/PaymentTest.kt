// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentTest {

    @Test
    fun create() {
        val payment =
            Payment.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .companyDebit(Money.builder().amount(0L).currency("currency").build())
                .debitDate("debit_date")
                .employeeTaxes(Money.builder().amount(0L).currency("currency").build())
                .employerTaxes(Money.builder().amount(0L).currency("currency").build())
                .grossPay(Money.builder().amount(0L).currency("currency").build())
                .addIndividualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .netPay(Money.builder().amount(0L).currency("currency").build())
                .payDate("pay_date")
                .addPayFrequency(Payment.PayFrequency.ANNUALLY)
                .addPayGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .payPeriod(
                    Payment.PayPeriod.builder().endDate("end_date").startDate("start_date").build()
                )
                .build()

        assertThat(payment.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(payment.companyDebit())
            .contains(Money.builder().amount(0L).currency("currency").build())
        assertThat(payment.debitDate()).contains("debit_date")
        assertThat(payment.employeeTaxes())
            .contains(Money.builder().amount(0L).currency("currency").build())
        assertThat(payment.employerTaxes())
            .contains(Money.builder().amount(0L).currency("currency").build())
        assertThat(payment.grossPay())
            .contains(Money.builder().amount(0L).currency("currency").build())
        assertThat(payment.individualIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(payment.netPay())
            .contains(Money.builder().amount(0L).currency("currency").build())
        assertThat(payment.payDate()).contains("pay_date")
        assertThat(payment.payFrequencies().getOrNull())
            .containsExactly(Payment.PayFrequency.ANNUALLY)
        assertThat(payment.payGroupIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(payment.payPeriod())
            .contains(
                Payment.PayPeriod.builder().endDate("end_date").startDate("start_date").build()
            )
    }
}

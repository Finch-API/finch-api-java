// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PayStatementResponseBodyTest {

    @Test
    fun createPayStatementResponseBody() {
        val payStatementResponseBody =
            PayStatementResponseBody.builder()
                .paging(Paging.builder().count(0L).offset(0L).build())
                .addPayStatement(
                    PayStatement.builder()
                        .addEarning(
                            PayStatement.Earning.builder()
                                .amount(0L)
                                .currency("currency")
                                .hours(0.0)
                                .name("name")
                                .type(PayStatement.Earning.Type.SALARY)
                                .build()
                        )
                        .addEmployeeDeduction(
                            PayStatement.EmployeeDeduction.builder()
                                .amount(0L)
                                .currency("currency")
                                .name("name")
                                .preTax(true)
                                .type(BenefitType._401K)
                                .build()
                        )
                        .addEmployerContribution(
                            PayStatement.EmployerContribution.builder()
                                .amount(0L)
                                .currency("currency")
                                .name("name")
                                .type(BenefitType._401K)
                                .build()
                        )
                        .grossPay(Money.builder().amount(0L).currency("currency").build())
                        .individualId("individual_id")
                        .netPay(Money.builder().amount(0L).currency("currency").build())
                        .paymentMethod(PayStatement.PaymentMethod.CHECK)
                        .addTax(
                            PayStatement.Tax.builder()
                                .amount(0L)
                                .currency("currency")
                                .employer(true)
                                .name("name")
                                .type(PayStatement.Tax.Type.STATE)
                                .build()
                        )
                        .totalHours(0.0)
                        .type(PayStatement.Type.REGULAR_PAYROLL)
                        .build()
                )
                .build()
        assertThat(payStatementResponseBody).isNotNull
        assertThat(payStatementResponseBody.paging())
            .contains(Paging.builder().count(0L).offset(0L).build())
        assertThat(payStatementResponseBody.payStatements().get())
            .containsExactly(
                PayStatement.builder()
                    .addEarning(
                        PayStatement.Earning.builder()
                            .amount(0L)
                            .currency("currency")
                            .hours(0.0)
                            .name("name")
                            .type(PayStatement.Earning.Type.SALARY)
                            .build()
                    )
                    .addEmployeeDeduction(
                        PayStatement.EmployeeDeduction.builder()
                            .amount(0L)
                            .currency("currency")
                            .name("name")
                            .preTax(true)
                            .type(BenefitType._401K)
                            .build()
                    )
                    .addEmployerContribution(
                        PayStatement.EmployerContribution.builder()
                            .amount(0L)
                            .currency("currency")
                            .name("name")
                            .type(BenefitType._401K)
                            .build()
                    )
                    .grossPay(Money.builder().amount(0L).currency("currency").build())
                    .individualId("individual_id")
                    .netPay(Money.builder().amount(0L).currency("currency").build())
                    .paymentMethod(PayStatement.PaymentMethod.CHECK)
                    .addTax(
                        PayStatement.Tax.builder()
                            .amount(0L)
                            .currency("currency")
                            .employer(true)
                            .name("name")
                            .type(PayStatement.Tax.Type.STATE)
                            .build()
                    )
                    .totalHours(0.0)
                    .type(PayStatement.Type.REGULAR_PAYROLL)
                    .build()
            )
    }
}

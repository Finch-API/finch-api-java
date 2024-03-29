// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PayStatementResponseBodyTest {

    @Test
    fun createPayStatementResponseBody() {
        val payStatementResponseBody =
            PayStatementResponseBody.builder()
                .paging(Paging.builder().count(123L).offset(123L).build())
                .payStatements(
                    listOf(
                        PayStatement.builder()
                            .earnings(
                                listOf(
                                    PayStatement.Earning.builder()
                                        .amount(123L)
                                        .currency("string")
                                        .hours(42.23)
                                        .name("string")
                                        .type(PayStatement.Earning.Type.SALARY)
                                        .build()
                                )
                            )
                            .employeeDeductions(
                                listOf(
                                    PayStatement.EmployeeDeduction.builder()
                                        .amount(123L)
                                        .currency("string")
                                        .name("string")
                                        .preTax(true)
                                        .type(BenefitType._401K)
                                        .build()
                                )
                            )
                            .employerContributions(
                                listOf(
                                    PayStatement.EmployerContribution.builder()
                                        .amount(123L)
                                        .currency("string")
                                        .name("string")
                                        .type(BenefitType._401K)
                                        .build()
                                )
                            )
                            .grossPay(Money.builder().amount(123L).currency("string").build())
                            .individualId("string")
                            .netPay(Money.builder().amount(123L).currency("string").build())
                            .paymentMethod(PayStatement.PaymentMethod.CHECK)
                            .taxes(
                                listOf(
                                    PayStatement.Tax.builder()
                                        .amount(123L)
                                        .currency("string")
                                        .employer(true)
                                        .name("string")
                                        .type(PayStatement.Tax.Type.STATE)
                                        .build()
                                )
                            )
                            .totalHours(42.23)
                            .type(PayStatement.Type.REGULAR_PAYROLL)
                            .build()
                    )
                )
                .build()
        assertThat(payStatementResponseBody).isNotNull
        assertThat(payStatementResponseBody.paging())
            .contains(Paging.builder().count(123L).offset(123L).build())
        assertThat(payStatementResponseBody.payStatements().get())
            .containsExactly(
                PayStatement.builder()
                    .earnings(
                        listOf(
                            PayStatement.Earning.builder()
                                .amount(123L)
                                .currency("string")
                                .hours(42.23)
                                .name("string")
                                .type(PayStatement.Earning.Type.SALARY)
                                .build()
                        )
                    )
                    .employeeDeductions(
                        listOf(
                            PayStatement.EmployeeDeduction.builder()
                                .amount(123L)
                                .currency("string")
                                .name("string")
                                .preTax(true)
                                .type(BenefitType._401K)
                                .build()
                        )
                    )
                    .employerContributions(
                        listOf(
                            PayStatement.EmployerContribution.builder()
                                .amount(123L)
                                .currency("string")
                                .name("string")
                                .type(BenefitType._401K)
                                .build()
                        )
                    )
                    .grossPay(Money.builder().amount(123L).currency("string").build())
                    .individualId("string")
                    .netPay(Money.builder().amount(123L).currency("string").build())
                    .paymentMethod(PayStatement.PaymentMethod.CHECK)
                    .taxes(
                        listOf(
                            PayStatement.Tax.builder()
                                .amount(123L)
                                .currency("string")
                                .employer(true)
                                .name("string")
                                .type(PayStatement.Tax.Type.STATE)
                                .build()
                        )
                    )
                    .totalHours(42.23)
                    .type(PayStatement.Type.REGULAR_PAYROLL)
                    .build()
            )
    }
}

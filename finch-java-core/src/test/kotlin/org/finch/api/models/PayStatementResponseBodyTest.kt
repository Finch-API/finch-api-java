package org.finch.api.models

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
                            .individualId("string")
                            .type(PayStatement.Type.REGULAR_PAYROLL)
                            .paymentMethod(PayStatement.PaymentMethod.CHECK)
                            .totalHours(123L)
                            .grossPay(Money.builder().amount(123L).currency("string").build())
                            .netPay(Money.builder().amount(123L).currency("string").build())
                            .earnings(
                                listOf(
                                    PayStatement.Earning.builder()
                                        .type(PayStatement.Earning.Type.SALARY)
                                        .name("string")
                                        .amount(123L)
                                        .currency("string")
                                        .hours(42.23)
                                        .build()
                                )
                            )
                            .taxes(
                                listOf(
                                    PayStatement.Tax.builder()
                                        .type(PayStatement.Tax.Type.STATE)
                                        .name("string")
                                        .employer(true)
                                        .amount(123L)
                                        .currency("string")
                                        .build()
                                )
                            )
                            .employeeDeductions(
                                listOf(
                                    PayStatement.EmployeeDeduction.builder()
                                        .name("string")
                                        .amount(123L)
                                        .currency("string")
                                        .preTax(true)
                                        .type(BenefitType._401K)
                                        .build()
                                )
                            )
                            .employerContributions(
                                listOf(
                                    PayStatement.EmployerContribution.builder()
                                        .name("string")
                                        .amount(123L)
                                        .currency("string")
                                        .type(BenefitType._401K)
                                        .build()
                                )
                            )
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
                    .individualId("string")
                    .type(PayStatement.Type.REGULAR_PAYROLL)
                    .paymentMethod(PayStatement.PaymentMethod.CHECK)
                    .totalHours(123L)
                    .grossPay(Money.builder().amount(123L).currency("string").build())
                    .netPay(Money.builder().amount(123L).currency("string").build())
                    .earnings(
                        listOf(
                            PayStatement.Earning.builder()
                                .type(PayStatement.Earning.Type.SALARY)
                                .name("string")
                                .amount(123L)
                                .currency("string")
                                .hours(42.23)
                                .build()
                        )
                    )
                    .taxes(
                        listOf(
                            PayStatement.Tax.builder()
                                .type(PayStatement.Tax.Type.STATE)
                                .name("string")
                                .employer(true)
                                .amount(123L)
                                .currency("string")
                                .build()
                        )
                    )
                    .employeeDeductions(
                        listOf(
                            PayStatement.EmployeeDeduction.builder()
                                .name("string")
                                .amount(123L)
                                .currency("string")
                                .preTax(true)
                                .type(BenefitType._401K)
                                .build()
                        )
                    )
                    .employerContributions(
                        listOf(
                            PayStatement.EmployerContribution.builder()
                                .name("string")
                                .amount(123L)
                                .currency("string")
                                .type(BenefitType._401K)
                                .build()
                        )
                    )
                    .build()
            )
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PayStatementTest {

    @Test
    fun createPayStatement() {
        val payStatement =
            PayStatement.builder()
                .earnings(
                    listOf(
                        PayStatement.Earning.builder()
                            .amount(0L)
                            .currency("currency")
                            .hours(0.0)
                            .name("name")
                            .type(PayStatement.Earning.Type.SALARY)
                            .build()
                    )
                )
                .employeeDeductions(
                    listOf(
                        PayStatement.EmployeeDeduction.builder()
                            .amount(0L)
                            .currency("currency")
                            .name("name")
                            .preTax(true)
                            .type(BenefitType._401K)
                            .build()
                    )
                )
                .employerContributions(
                    listOf(
                        PayStatement.EmployerContribution.builder()
                            .amount(0L)
                            .currency("currency")
                            .name("name")
                            .type(BenefitType._401K)
                            .build()
                    )
                )
                .grossPay(0.0)
                .individualId("individual_id")
                .netPay(0.0)
                .paymentMethod(PayStatement.PaymentMethod.CHECK)
                .taxes(
                    listOf(
                        PayStatement.Tax.builder()
                            .amount(0L)
                            .currency("currency")
                            .employer(true)
                            .name("name")
                            .type(PayStatement.Tax.Type.STATE)
                            .build()
                    )
                )
                .totalHours(0.0)
                .type(PayStatement.Type.REGULAR_PAYROLL)
                .build()
        assertThat(payStatement).isNotNull
        assertThat(payStatement.earnings().get())
            .containsExactly(
                PayStatement.Earning.builder()
                    .amount(0L)
                    .currency("currency")
                    .hours(0.0)
                    .name("name")
                    .type(PayStatement.Earning.Type.SALARY)
                    .build()
            )
        assertThat(payStatement.employeeDeductions().get())
            .containsExactly(
                PayStatement.EmployeeDeduction.builder()
                    .amount(0L)
                    .currency("currency")
                    .name("name")
                    .preTax(true)
                    .type(BenefitType._401K)
                    .build()
            )
        assertThat(payStatement.employerContributions().get())
            .containsExactly(
                PayStatement.EmployerContribution.builder()
                    .amount(0L)
                    .currency("currency")
                    .name("name")
                    .type(BenefitType._401K)
                    .build()
            )
        assertThat(payStatement.grossPay()).contains(0.0)
        assertThat(payStatement.individualId()).contains("individual_id")
        assertThat(payStatement.netPay()).contains(0.0)
        assertThat(payStatement.paymentMethod()).contains(PayStatement.PaymentMethod.CHECK)
        assertThat(payStatement.taxes().get())
            .containsExactly(
                PayStatement.Tax.builder()
                    .amount(0L)
                    .currency("currency")
                    .employer(true)
                    .name("name")
                    .type(PayStatement.Tax.Type.STATE)
                    .build()
            )
        assertThat(payStatement.totalHours()).contains(0.0)
        assertThat(payStatement.type()).contains(PayStatement.Type.REGULAR_PAYROLL)
    }
}

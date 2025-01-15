// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SandboxPaymentCreateParamsTest {

    @Test
    fun createSandboxPaymentCreateParams() {
        SandboxPaymentCreateParams.builder()
            .endDate("end_date")
            .addPayStatement(
                SandboxPaymentCreateParams.PayStatement.builder()
                    .addEarning(
                        SandboxPaymentCreateParams.PayStatement.Earning.builder()
                            .amount(0L)
                            .currency("currency")
                            .hours(0.0)
                            .name("name")
                            .type(SandboxPaymentCreateParams.PayStatement.Earning.Type.SALARY)
                            .build()
                    )
                    .addEmployeeDeduction(
                        SandboxPaymentCreateParams.PayStatement.EmployeeDeduction.builder()
                            .amount(2000L)
                            .currency("usd")
                            .name("401k test")
                            .preTax(true)
                            .type(BenefitType._401K)
                            .build()
                    )
                    .addEmployerContribution(
                        SandboxPaymentCreateParams.PayStatement.EmployerContribution.builder()
                            .amount(0L)
                            .currency("currency")
                            .name("name")
                            .type(BenefitType._401K)
                            .build()
                    )
                    .grossPay(Money.builder().amount(0L).currency("currency").build())
                    .individualId("b2338cfb-472f-4f72-9faa-e028c083144a")
                    .netPay(Money.builder().amount(0L).currency("currency").build())
                    .paymentMethod(SandboxPaymentCreateParams.PayStatement.PaymentMethod.CHECK)
                    .addTax(
                        SandboxPaymentCreateParams.PayStatement.Tax.builder()
                            .amount(0L)
                            .currency("currency")
                            .employer(true)
                            .name("name")
                            .type(SandboxPaymentCreateParams.PayStatement.Tax.Type.STATE)
                            .build()
                    )
                    .totalHours(0.0)
                    .type(SandboxPaymentCreateParams.PayStatement.Type.REGULAR_PAYROLL)
                    .build()
            )
            .startDate("start_date")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SandboxPaymentCreateParams.builder()
                .endDate("end_date")
                .addPayStatement(
                    SandboxPaymentCreateParams.PayStatement.builder()
                        .addEarning(
                            SandboxPaymentCreateParams.PayStatement.Earning.builder()
                                .amount(0L)
                                .currency("currency")
                                .hours(0.0)
                                .name("name")
                                .type(SandboxPaymentCreateParams.PayStatement.Earning.Type.SALARY)
                                .build()
                        )
                        .addEmployeeDeduction(
                            SandboxPaymentCreateParams.PayStatement.EmployeeDeduction.builder()
                                .amount(2000L)
                                .currency("usd")
                                .name("401k test")
                                .preTax(true)
                                .type(BenefitType._401K)
                                .build()
                        )
                        .addEmployerContribution(
                            SandboxPaymentCreateParams.PayStatement.EmployerContribution.builder()
                                .amount(0L)
                                .currency("currency")
                                .name("name")
                                .type(BenefitType._401K)
                                .build()
                        )
                        .grossPay(Money.builder().amount(0L).currency("currency").build())
                        .individualId("b2338cfb-472f-4f72-9faa-e028c083144a")
                        .netPay(Money.builder().amount(0L).currency("currency").build())
                        .paymentMethod(SandboxPaymentCreateParams.PayStatement.PaymentMethod.CHECK)
                        .addTax(
                            SandboxPaymentCreateParams.PayStatement.Tax.builder()
                                .amount(0L)
                                .currency("currency")
                                .employer(true)
                                .name("name")
                                .type(SandboxPaymentCreateParams.PayStatement.Tax.Type.STATE)
                                .build()
                        )
                        .totalHours(0.0)
                        .type(SandboxPaymentCreateParams.PayStatement.Type.REGULAR_PAYROLL)
                        .build()
                )
                .startDate("start_date")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.endDate()).contains("end_date")
        assertThat(body.payStatements())
            .contains(
                listOf(
                    SandboxPaymentCreateParams.PayStatement.builder()
                        .addEarning(
                            SandboxPaymentCreateParams.PayStatement.Earning.builder()
                                .amount(0L)
                                .currency("currency")
                                .hours(0.0)
                                .name("name")
                                .type(SandboxPaymentCreateParams.PayStatement.Earning.Type.SALARY)
                                .build()
                        )
                        .addEmployeeDeduction(
                            SandboxPaymentCreateParams.PayStatement.EmployeeDeduction.builder()
                                .amount(2000L)
                                .currency("usd")
                                .name("401k test")
                                .preTax(true)
                                .type(BenefitType._401K)
                                .build()
                        )
                        .addEmployerContribution(
                            SandboxPaymentCreateParams.PayStatement.EmployerContribution.builder()
                                .amount(0L)
                                .currency("currency")
                                .name("name")
                                .type(BenefitType._401K)
                                .build()
                        )
                        .grossPay(Money.builder().amount(0L).currency("currency").build())
                        .individualId("b2338cfb-472f-4f72-9faa-e028c083144a")
                        .netPay(Money.builder().amount(0L).currency("currency").build())
                        .paymentMethod(SandboxPaymentCreateParams.PayStatement.PaymentMethod.CHECK)
                        .addTax(
                            SandboxPaymentCreateParams.PayStatement.Tax.builder()
                                .amount(0L)
                                .currency("currency")
                                .employer(true)
                                .name("name")
                                .type(SandboxPaymentCreateParams.PayStatement.Tax.Type.STATE)
                                .build()
                        )
                        .totalHours(0.0)
                        .type(SandboxPaymentCreateParams.PayStatement.Type.REGULAR_PAYROLL)
                        .build()
                )
            )
        assertThat(body.startDate()).contains("start_date")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = SandboxPaymentCreateParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
